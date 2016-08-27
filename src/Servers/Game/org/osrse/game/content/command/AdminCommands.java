package org.osrse.game.content.command;

import org.osrse.WorldModule;
import org.osrse.game.content.Bank;
import org.osrse.game.content.Commands;
import org.osrse.game.content.combat.Magic;
import org.osrse.game.content.combat.magic.Ancient;
import org.osrse.game.content.combat.magic.Lunar;
import org.osrse.game.content.combat.magic.Standard;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.masks.Animation;
import org.osrse.game.logic.masks.FaceEntity;
import org.osrse.game.logic.masks.Graphic;
import org.osrse.game.logic.mob.Mob;
import org.osrse.game.logic.mob.SpawnPoint;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.player.Skills;
import org.osrse.network.PacketBuilder;
import org.osrse.utility.NameUtilities;

/**
 * Created by Jonathan on 1/8/16.
 */
public class AdminCommands extends Commands {

    public AdminCommands() {
        Command cmd = spawnMob();
        commandMap.put("mob", cmd);
        commandMap.put("npc", cmd);
        cmd = resetMob();
        commandMap.put("resmob", cmd);
        commandMap.put("mobres", cmd);
        cmd = faceDirection();
        commandMap.put("face", cmd);
        commandMap.put("f", cmd);
        cmd = equipEdit();
        commandMap.put("eq", cmd);
        commandMap.put("quip", cmd);
        cmd = cityTeleport();
        commandMap.put("c", cmd);
        commandMap.put("ct", cmd);
        commandMap.put("city", cmd);
        cmd = wipeInventory();
        commandMap.put("newinv", cmd);
        commandMap.put("invres", cmd);
        commandMap.put("resinv", cmd);
        cmd = master();
        commandMap.put("master", cmd);
        commandMap.put("max", cmd);
        cmd = bank();
        commandMap.put("b", cmd);
        commandMap.put("bnk", cmd);
        commandMap.put("song", sendMusic());
        cmd = spawnItem();
        commandMap.put("item", cmd);
        commandMap.put("i", cmd);
        commandMap.put("it", cmd);
        cmd = animate();
        commandMap.put("anim", cmd);
        commandMap.put("a", cmd);
        commandMap.put("an", cmd);
        cmd = queueGraphic();
        commandMap.put("gfx", cmd);
        commandMap.put("g", cmd);
        commandMap.put("gr", cmd);
        cmd = sync();
        commandMap.put("sync", cmd);
        commandMap.put("sc", cmd);
        cmd = playerToMob();
        commandMap.put("pnpc", cmd);
        commandMap.put("tmob", cmd);
        cmd = teleCoords();
        commandMap.put("tele", cmd);
        commandMap.put("tc", cmd);
        cmd = teleTo();
        commandMap.put("teleto", cmd);
        commandMap.put("to", cmd);
        cmd = adminZone();
        commandMap.put("azone", cmd);
        commandMap.put("admin", cmd);
        cmd = editClipping();
        commandMap.put("noclip", cmd);
        commandMap.put("clip", cmd);
        cmd = ancients();
        commandMap.put("anc", cmd);
        commandMap.put("ancients", cmd);
        commandMap.put("zaros", cmd);
        cmd = standard();
        commandMap.put("standard", cmd);
        commandMap.put("standards", cmd);
        commandMap.put("reg", cmd);
        commandMap.put("stand", cmd);
        cmd = lunar();
        commandMap.put("lunar", cmd);
        commandMap.put("moon", cmd);
        commandMap.put("lunars", cmd);
        cmd = run();
        commandMap.put("run", cmd);
        commandMap.put("en", cmd);
        cmd = face();
        commandMap.put("fe", cmd);
        cmd = faceDir();
        commandMap.put("dir", cmd);
        cmd = skull();
        commandMap.put("skull", cmd);
        cmd = hide();
        commandMap.put("hide", cmd);
        cmd = testPacket();
        commandMap.put("tp", cmd);
        cmd = editCC();
        commandMap.put("kek", cmd);

    }


    private Command editCC() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getProtocol().editCCMember(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Boolean.parseBoolean(args[3]));
            }
        };
    }

    private Command testPacket() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                PacketBuilder pb = new PacketBuilder(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                String[] pos = new String[args.length-2];
                System.arraycopy(args, 2, pos, 0, pos.length);
                for(String arg : pos) {
                    String str = arg;
                    str = str.replaceAll("[^\\d.]", "");
                    int val = Integer.parseInt(str);
                    player.sendMessage(""+val);
                    if(arg.contains("b")) {
                        if(arg.contains("a")) {
                            pb.putByteA(val);
                        } else if(arg.contains("c")) {
                            pb.putByteC(val);
                        } else if(arg.contains("s")) {
                            pb.putByteS(val);
                        } else {
                            pb.putByte(val);
                        }
                    } else if(arg.contains("i")) {
                        if(arg.contains("1")) {
                            pb.putInt1(val);
                        } else if(arg.contains("2")) {
                            pb.putInt2(val);
                        } else if(arg.contains("le")) {
                            pb.putLEInt(val);
                        } else {
                            pb.putInt(val);
                        }
                    } else if(arg.contains("st")) {
                        pb.putString(arg);
                    } else if(arg.contains("s")) {
                        if(arg.contains("lea")) {
                            pb.putLEShortA(val);
                        } else if(arg.contains("a")) {
                            pb.putShortA(val);
                        } else if(arg.contains("le")) {
                            pb.putLEShort(val);
                        } else {
                            pb.putShort(val);
                        }
                    }
                }
                player.write(pb.toPacket());
            }
        };
    }

    private Command hide() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getSetting().setInvisible(!player.getSetting().isInvisible());
                player.getAppearance().refresh();
            }
        };
    }

    private Command skull() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getSetting().setSkull(Integer.parseInt(args[0]));
                player.getAppearance().refresh();
            }
        };
    }

    protected final Player.Privilege required() {
        return Player.Privilege.ADMINISTRATOR;
    }

    private Command faceDir() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getMasks().setFaceDirection(Tile.locate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), 0));
            }
        };
    }

    private Command face() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getMasks().setFaceEntity(new FaceEntity(Integer.parseInt(args[0])));//setFaceEntity();
            }
        };
    }

    private Command run() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.setRunningEnergy(1000);
            }
        };
    }

    private Command standard() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                if(player.magic.type() != Magic.Type.Standard) {
                    player.setMagicBook(new Standard());
                }
            }
        };
    }

    private Command ancients() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                if(player.magic.type() != Magic.Type.Ancient) {
                    player.setMagicBook(new Ancient());
                }
            }
        };
    }

    private Command lunar() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                if(player.magic.type() != Magic.Type.Lunar) {
                    player.setMagicBook(new Lunar());
                }
            }
        };
    }

    private Command spawnMob() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                WorldModule.getLogic().register(new Mob(Integer.parseInt(args[0]), (args.length > 1 ? Integer.parseInt(args[1]) : 1), new SpawnPoint(player.getLocation())));
            }
        };
    }

    private Command resetMob() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                WorldModule.getLogic().resetMobs(args.length > 0 && Boolean.parseBoolean(args[0]));
            }
        };
    }

    private Command equipEdit() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getEquipment().remove(Integer.parseInt(args[0]));
                player.getEquipment().add(new Item(Integer.parseInt(args[1])), Integer.parseInt(args[0]));
                player.getEquipment().refresh();
            }
        };
    }

    private Command cityTeleport() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                for (Magic.Teleports t : Magic.Teleports.values()) {
                    if (t.toString().toLowerCase().contains(args[0])) {
                        player.getMagic().teleportCity(t, true, false);
                        break;
                    }
                }
            }
        };
    }

    private Command faceDirection() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.faceDirection(Tile.locate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), 0));
            }
        };
    }

    private Command wipeInventory() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getInventory().clear();
                player.getInventory().refresh();
            }
        };
    }

    private Command master() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                for (int i = 0; i < Skills.SKILL_COUNT; i++) {
                    player.getSkills().setLevel(i, 99);
                    player.getSkills().setExperience(i, 13500000);
                    if (i == Skills.PRAYER) player.getSkills().setPrayerPoints(99, true);
                    player.getProtocol().sendSkill(i);
                }
            }
        };
    }

    private Command bank() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                Bank.openBank(player);
            }
        };
    }

    private Command sendMusic() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getProtocol().sendSong(Integer.parseInt(args[0]));
            }
        };
    }

    private Command spawnItem() {
        return new Command() {
            @Override
            public void handle(Player player, String[] args) {
                player.getInventory().add(new Item(Integer.parseInt(args[0]), args.length > 1 ? Integer.parseInt(args[1]) : 1));
                player.getInventory().refresh();
            }
        };
    }

    private Command animate() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                player.getMasks().setAnimation(Animation.create(Integer.parseInt(command[0]), command.length > 1 ? Integer.parseInt(command[1]) : 0));
            }
        };
    }

    private Command queueGraphic() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                player.getMasks().setGraphics(Graphic.create(Integer.parseInt(command[0]), (command.length > 1 ? Integer.parseInt(command[1]) : 0), (command.length > 2 ? Integer.parseInt(command[2]) : 0)));
            }
        };
    }

    private Command sync() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                if (command.length > 1) {
                    player.getMasks().setAnimation(Animation.create(Integer.parseInt(command[0])));
                    player.getMasks().queueGraphic(Graphic.create(Integer.parseInt(command[1])));
                } else
                    player.getProtocol().sendMessage("Bad Syntax! ::sync animId graphicId");}
        };
    }

    private Command playerToMob() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                int mob = Integer.parseInt(command[0]);
                player.getAppearance().setMobLook(mob);
                player.getAppearance().refresh();
            }
        };
    }

    private Command teleCoords() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                player.basicSettings().setTeleportDestination(Tile.locate(Integer.parseInt(command[0]), Integer.parseInt(command[1]), (command.length > 2 ? Integer.parseInt(command[2]) : 0)));
            }
        };
    }

    private Command teleTo() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                Player player1 = WorldModule.getLogic().getPlayerMap().get(NameUtilities.capitalizeFormat(command[0]));
                if(player1 != null)
                    player.basicSettings().setTeleportDestination(player1.getLocation());
            }
        };
    }

    private Command adminZone() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                player.basicSettings().setTeleportDestination(Tile.locate(1891, 4527, 2));
            }
        };
    }

    private Command editClipping() {
        return new Command() {
            @Override
            public void handle(Player player, String[] command) {
                boolean clip = player.getAttribute("noclip") != null;
                if(!clip) {
                    player.setAttribute("noclip", true);
                    player.sendMessage("Warning! to set the clipping attribute server side, please parse again.");
                } else {
                    player.sendMessage("Path finding behaviour: " + !player.basicSettings().isClipping());
                    player.basicSettings().setClipping(!player.basicSettings().isClipping());
                }
            }
        };
    }

}
