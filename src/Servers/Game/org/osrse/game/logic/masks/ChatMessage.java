package org.osrse.game.logic.masks;
 

public class ChatMessage {
    private final int color, effect;
    private final String text;
    
    public ChatMessage(String text){
    	this(text, 0, 0);
    }

    public ChatMessage(String text, int color, int effect) {
        this.text = text;
        this.color = color;
        this.effect = effect;
    }

    public int getColor() {
        return color;
    }

    public int getEffect() {
        return effect;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
 
 
    private boolean quickChat; 


	/**
	 * @return the quickChat
	 */
	public boolean isQuickChat() {
		return quickChat;
	}


	/**
	 * @param quickChat the quickChat to set
	 */
	public void setQuickChat(boolean quickChat) {
		this.quickChat = quickChat;
	}

}
