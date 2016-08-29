package org.osrse.game.content.combat;

import org.osrse.WorldModule;
import org.osrse.game.logic.Entity;
import org.osrse.game.content.combat.magic.Ancient;
import org.osrse.game.content.combat.magic.Lunar;
import org.osrse.game.content.combat.magic.MagicBook;
import org.osrse.game.content.combat.magic.Standard;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.masks.Animation;
import org.osrse.game.logic.masks.Graphic;
import org.osrse.game.logic.player.Player;

/**
 * Created by Jonathan on 1/7/16.
 */
public class Magic {

    public enum Runes {
        Air, Water, Earth, Fire, Body, Mind, Cosmic, Nature, Chaos, Law, Death, Blood, Soul, Astral, Banana;

        public int getId() {
            return 0;
        }
    }

    public enum Staff {
        IBAN, SLAYER, ANCIENT, REGULAR, SARADOMIN, ZAMORAK, GUTHIX;
        private int id;

        public int getId() {
            return id;
        }
    }

    /**
     * Used for Interfaces, and Teleport types.
     */
    public enum Type { Standard(192), Ancient(193), Lunar(430), Tab, Enchantment, Home;
            private final int interfaceId;

            private Type() {
                this.interfaceId = -1;
            }

            private Type(int interfaceId) {
                this.interfaceId = interfaceId;
            }

        /**
         * This is pre osrs
         * @return
         */
        public int getInterfaceId() {
            return interfaceId;
        }


        public int getOldSchoolId() {
            return 218;
        }
    };

    public enum Teleports {
                            NULL,
                            //25, 31, 37, 40, 45, 51, 58, 61, 64
                            Varrock(3212, 3425), Lumbridge(3222, 3219), Falador(2965, 3381), House,
                            Camelot(2757, 3478), Ardougne(2661, 3307), Watchtower(2606, 3093), Trollheim(2892, 3680),
                            ApeAtol(2754, 2784),
                            //0, 54, 60, 66, 72, 78, 84, 90, 96
                            Edgeville(3086, 3498), Paddewwa(3097, 9882), Senntisten(3339, 3445), Kharyrll(3493, 3472),
                            Lassar(3012, 3500), Dareeyak(2991, 3697), Carrallanger(3161, 3670), Annakarl(3288, 3886), Ghorrock(2963, 3929),
                            //69 72(73), 75(76), 78(79), 85(86), 87(88), 89(90)
                            Moonclan, Waterbirth, Barbarian, Khazard, FishingGuild, Catherby, IcePlateau,
                            //85
                            Target;
            private final int x, y, z;
            private final boolean works;

            Teleports() {
                x = y = z = 0;
                works = false;
            }

            Teleports(int x, int y) {
                this(x, y, 0);
            }

            Teleports(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
                works = true;
            }

            public Tile getTile() {
                return Tile.locate(x, y, z).random(3);
            }
    };

    public static final int[] ANCIENT_STAVES = {4675};
    public static final int[] CLAWS_STAVES = {8841};
    public static final int[] MODERN_STAVES = {6914, 1381, 1383, 1385, 1387, 1389, 6603, 1401, 1403, 1405, 1407, 3054, 1379, 6563, 11738, 2415, 2416, 2417, 4862, 4863, 4864, 4865, 4710};
    public static final int[] SLAYER_STAVES = {4170};

    private Type secondaryType;
    private MagicBook ownerBook;
    protected final Entity owner;
    private static final MagicBook standard = new Standard(), ancient = new Ancient(), lunar = new Lunar();

    public Magic(Entity owner, Type ownerBook) {
        this.owner = owner;
        this.ownerBook = ownerBook == Type.Lunar ? lunar : ownerBook == Type.Ancient ? ancient : standard;
    }

    public Type type() {
        return ownerBook.type();
    }

    public Type getSecondary() {
        return secondaryType;
    }

    public final void startTeleport() {
        Type type = secondaryType == null ? ownerBook.type() : secondaryType;
        if(type == Type.Standard) {
            owner.getMasks().setGraphics(Graphic.create(111, 0, 110));
            owner.getMasks().setAnimation(714);
        } else if(type == Type.Ancient) {
            owner.getMasks().setGraphics(Graphic.create(392));
            owner.getMasks().setAnimation(1979);
        } else if(type == Type.Lunar) {
        } else if(type == Type.Tab) {
            owner.getMasks().setAnimation(4071, 10);
            owner.getMasks().setGraphics(Graphic.create(678));
        } else if(type == Type.Enchantment) {
            if(WorldModule.getLogic().getRevision() < 489) {
                owner.getMasks().setGraphics(Graphic.create(308, 50, 110));
                owner.getMasks().setAnimation(714);
            }
        } else if(type == Type.Home) {
            owner.getMasks().setAnimation(4847);
            owner.getMasks().setGraphics(Graphic.create(800));
        }
    }

    public final void windAnimation() {
        if(secondaryType != null){
            if(secondaryType == Type.Tab) {
                owner.getMasks().setAnimation(4069);
            } else if(secondaryType == Type.Home) {
                owner.getMasks().setAnimation(4847);
                owner.getMasks().setGraphics(800, 0);
            }
        }
    }


    public final void finishTeleport() {
        Type type = secondaryType == null ? ownerBook.type() : secondaryType;
         if(type == Type.Ancient) {
            owner.getMasks().setGraphics(Graphic.create(455));
        } else {
            owner.getMasks().setAnimation(Animation.RESET);
        }
        secondaryType = null;
    }


    public void changeBook(MagicBook book) {
        this.ownerBook = book;
    }

    public boolean hasTwoStepTeleport() {
        return secondaryType != null && secondaryType == Type.Tab;
    }

    public void teleFrom(Entity teleportedFrom) {
        this.secondaryType = teleportedFrom.getMagic().type();
    }

    /**
     * When someone gets a teleother spell, and cancels or walks out of the interface
     * We do this to make sure the player doesnt teleport with the wrong animation and gfx
     */
    public void resetTeleFrom() {
        this.secondaryType = null;
        owner.basicSettings().reset(true);
        owner.getMasks().setAnimation(Animation.RESET);
        owner.getMasks().setGraphics(Graphic.RESET);
    }

    public void teleportCity(Teleports port, boolean tab, boolean ench) {
        if(teleport(port, true)) {
            secondaryType =  tab ? Type.Tab : ench ? Type.Enchantment : null;
        }
    }

    public void homeTele() {
        if(teleport(ownerBook.type() == Type.Ancient ? Teleports.Edgeville : Teleports.Lumbridge, false)) {
            secondaryType = Type.Home;
            startTeleport();
            owner.basicSettings().setHomeTeleport(true);
        }
    }

    private final boolean teleport(Teleports port, boolean force) {
        if(port.works) {
            owner.basicSettings().setForcedTeleporting(force);
            owner.basicSettings().setTeleportDestination(port.getTile());
        }
        return port.works;
    }


    public void buttonCast(int button, int itemIndex) {
        if(!ownerBook.cast(button, owner)) {
            ((Player)owner).sendMessage("You do not have the required runes to cast that spell.");
        }
    }

}
