package org.osrse.game.logic.masks;

import org.osrse.game.logic.Entity;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.player.Player;

import java.util.ArrayDeque;
import java.util.Deque;
 

public class Masks {


    public Graphic[] graphicQueue = new Graphic[4];
    private Entity entity;
  
	private Deque<Graphic> queuedGraphics = new ArrayDeque<Graphic>();
    private int graphicsHeight2 = 0;
    private boolean appearance = false;
    private ChatMessage chat = null;
    private ForceText forcedChat = null;
    private NamingEdit nameEdit = null;
    private FaceEntity faceEntity = null;
    private ForcedMovement forceMovement = null;
    private Hit[] hits = new Hit[2];
    private boolean initialDirectionSent = true, initialNameEditSend = true, sentSwitchId = true;
    private boolean movementMode = false;
    private Tile faceDirection = null;
    private int resetMovementMode = 0;
    private int animationId = -1;
    private int modelId = -1;
    private int customCombatLevel = -1;
    //<editor-fold desc="Animation">
    private int animationDelay = 0;
    private Graphic graphics, graphics2;
    private int movementType = 1;


	public Masks(Entity mob) {
		this.entity = mob;
	}

	public void process() {
		for (int i = 0; i < graphicQueue.length; i++)
			if (graphicQueue[i] == null)
                graphicQueue[i] = queuedGraphics.poll();
		queuedGraphics.clear();
	}

	public Entity getPlayer() {
		return entity;
    }

    public int getFaceEntity() {
        return faceEntity.getId();
    }

    public void setFaceEntity(FaceEntity faceEntity) {
        this.faceEntity = faceEntity;
        faceDirection = null;
        initialDirectionSent = false;
    }

	public void face(Entity e) {
		this.faceEntity = new FaceEntity(e);
        faceDirection = null;
        initialDirectionSent = false;
	}

    public int getAnimationDelay() {
        return animationDelay;
    }

    public int getAnimationId() {
        return animationId;
    }

    public void setAnimation(int id, int delay) {
        this.animationId = id;
        this.animationDelay = delay;
    }

    public void setAnimation(int id) {
        setAnimation(id, 0);
    }
    //</editor-fold>

    public void setAnimation(Animation animation) {
        animationId = animation.getId();
        animationDelay = animation.getDelay();
    }

    //<editor-fold desc="Graphics">
    public void setGraphics(int id, int delay) {
        setGraphics(id, delay, 0);
    }

    public void setGraphics(int id, int delay, int height) {
        setGraphics(Graphic.create(id, delay, height));
    }

    public Graphic getGraphics() {
        return graphics;
    }


    public void setGraphics(Graphic graphics) {
        //if(graphics == null) {
            this.graphics = graphics;
       // } else
       //     setGraphics2(graphics);
    }

    public void setGraphics2(Graphic graphics2) {
        //if(graphics2 == null)
            this.graphics2 = graphics2;
    }

    public void queueGraphic(Graphic graphic) {
        if (queuedGraphics.size() < 4 && graphic != null) {
            queuedGraphics.add(graphic);
        }
    }
    //</editor-fold>

    public ChatMessage getChat() {
        return chat;
    }

    public void setChat(ChatMessage chat) {
        this.chat = chat;
    }

    public ForceText getForcedChat() {
        return forcedChat;
    }

    public void setForcedChat(ForceText forcedChat) {
        this.forcedChat = forcedChat;
    }

    public void setAppearanceUpdate(boolean appearance) {
        this.appearance = appearance;
    }

    public Tile getFaceDirection() {
        return faceDirection;
    }

    public void setFaceDirection(Tile faceDirection) {
        initialDirectionSent = false;
        this.faceDirection = faceDirection;
    }

    public Hit getHit(int id) {
        return hits[(id >= 0 && id < 2) ? id : 0];
    }

    public void setHit(int id, Hit hit) {
        hits[(id >= 0 && id < 2) ? id : 0] = hit;
    }

    public int getMovementType() {
        return movementType;
    }

    public void setMovementType(int movementType) {
        this.movementType = movementType;
    }

    public void setMovementMode(boolean movement) {
        this.movementMode = movement;
    }

    public int getResetMovementMode() {
        return resetMovementMode;
    }

    public void setResetMovementMode(int fixedMovementMode) {
        this.resetMovementMode = fixedMovementMode;
    }

    public ForcedMovement getForcedMovement() {
        return forceMovement;
    }

    public void setForceMovement(ForcedMovement forceMovement) {
        this.forceMovement = forceMovement;
    }

    public NamingEdit getNameEdit() {
        return nameEdit;
    }

    public void setNameEdit(NamingEdit edit) {
        initialNameEditSend = false;
        this.nameEdit = edit;
    }

    public boolean requiresUpdate() {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if(player.basicSettings().isTeleporting()) {
                return true;
            }
        }
        return (animationId != -1 || appearance || chat != null ||
                forcedChat != null || graphics != null || graphics2 != null ||
                hits[0] != null || hits[1] != null || movementMode || resetMovementMode != 0 ||
                 customCombatLevel != -1 || (!initialDirectionSent && (faceEntity != null || faceDirection != null)) );
    }

    public boolean requiresCycle(MaskType mask, boolean enteredView) {
        switch (mask) {
            case ANIMATION:
                return animationId != -1;
            case APPEARANCE:
                return appearance || enteredView;
            case CHAT:
                return chat != null;
            case FORCED_CHAT:
                return forcedChat != null;
            case FACE_ENTITY:
                return faceEntity != null && (enteredView || !initialDirectionSent);
            case FACE_DIRECTION:
                return faceDirection != null && (enteredView || !initialDirectionSent);
            case GRAPHICS:
                return graphics != null;
            case SECONDARY_GRAPHICS:
                return graphics2 != null;
            case HIT:
                return hits[0] != null;
            case SECOND_HIT:
                return hits[1] != null;
            case MOVEMENT_MODE:
                return movementMode || enteredView;
            case RESET_MOVEMENT_MODE:
                return resetMovementMode != 0 || enteredView && !movementMode;
            case FORCE_MOVEMENT:
                return forceMovement != null; //check if this has a enterview necessity
            case NAME_EDIT:
                return nameEdit != null && !initialNameEditSend || (enteredView && nameEdit != null);
        }
        return false;
    }

    public void reset() {
        animationId = -1;
        animationDelay = 0;
        appearance = false;
        chat = null;
        forcedChat = null;
        graphics = null;
                graphics2 = null;
        graphicsHeight2 = 0;
        hits[0] = null;
                hits[1] = null;
        movementMode = false;
        resetMovementMode = 0;
        initialDirectionSent = true;
                initialNameEditSend = true;
        forceMovement = null;
    }

    public void resetFace(boolean entity) {
        if (entity) {
            faceEntity = null;
        }
        faceDirection = null;
    }


    public enum MaskType {
        ANIMATION, APPEARANCE, CHAT, FACE_DIRECTION, FACE_ENTITY, FORCED_CHAT, NAME_EDIT, RESET_MOVEMENT_MODE,
        GRAPHICS, SECONDARY_GRAPHICS, HIT, SECOND_HIT, MOVEMENT_MODE, FORCE_MOVEMENT,
        BYTE_OVERFLOW, SHORT_OVERFLOW
    }
}
