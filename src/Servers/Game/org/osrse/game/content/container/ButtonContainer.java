/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content.container;
  
import org.osrse.game.content.Bank;
import org.osrse.game.logic.item.Item;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.utility.LogicConstants;
import org.osrse.model.commercial.Communications;
import org.osrse.model.commercial.GroupChat;
import org.osrse.utility.NameUtilities;

/**
 *
 * @author Jonathan
 */
public class ButtonContainer {

    public static void handleButton(Player player, int widgetid, int interfaceId, int button, int itemIndex) { 
        switch(interfaceId) {
            case 182:
                player.getProtocol().sendLogout();
                break;
            case 387:

	            if (button >= 6 && button < 17) {
		            int index = 0;
		            if (button == 16) {
			            index = 13;
		            } else if (button == 15) {
			            index = 12;
		            } else if (button == 14) {
			            index = 10;
		            } else if (button == 13) {
			            index = 9;
		            } else if (button == 12) {
			            index = 7;
		            } else if (button == 11) {
			            index = 5;
		            }
		            //System.out.println(widgetid + "/" + oldItemId + "/" + oldEquipSlot + "/" + button + "/" + interfaceId);

		            if (player.getAttribute("cutScene") != null) {
			            return;
		            }
		            Item item = player.getEquipment().get(index == 0 ? button - 6 : index);
		            if (item == null) return;
		            if (player.getInventory().add(item)) {
			            Item i = player.getEquipment().remove(index == 0 ? button - 6 : index);
			            if (i != null) {
				            player.getEquipment().refresh();
				            player.getInventory().refresh();
			            }
		            }
	            }
                //50 deathitems
                if(button == 51) {
                    player.getProtocol().sendInterface(0, 548, 465, 75);
                    player.getProtocol().sendRunScript(150, LogicConstants.EQUIPMENT_PARAMETERS, LogicConstants.EQUIPMENT_TYPE_STRING);
                    //player.getProtocol().sendBonuses();
                    player.getProtocol().sendInterfaceInventory(336);
                    //.sendAccessMask(1278, 0, 336, 0, 28);
                    player.getProtocol().sendAccessMask(336, 0, 1278, 0, 28);
                }
                break;
            case 320:
                //showskillguide
                break;
            case 271:
                //prayer
                break; 
            case 192:
                //handle spellid

                break;
            case 261://settings
                if(button == 34) {
                    player.setRunning(!player.isRunning());
                }
                break;
            case 12:
                if(button == 6) {
                    //todo find how to add mouse accessmask
                    Bank.removeItem(player, itemIndex , 1);
                } else if(button == 17) {
                    player.basicSettings().setNotedBank(true);
                } else if(button == 15) {
                    player.basicSettings().setNotedBank(false);
                } else if(button == 21) {
                    Bank.depositInventory(player);
                } else if(button == 23) {
                    Bank.depositEquipment(player);
                }
                break;
            case 15:
                if(button == 0) {
                    Bank.storeItem(player, itemIndex, 1);
                }
                break;
            case 218:
                player.getMagic().buttonCast(button, itemIndex);
                break;
	        case 589:
		         if(button == 9) {
			         GroupChat gc = player.getCommunication().basic().getClanChat();
					if(gc.isValid()) {
						player.getProtocol().sendString(590, 29, NameUtilities.capitalizeFormat(gc.getChatName()));
					}
			         player.getProtocol().sendString(590, 31, gc.getJoinReq().toString());
			         player.getProtocol().sendString(590, 33, gc.getJoinReq().toString());
			         player.getProtocol().sendString(590, 35, gc.getKickReq().toString());
	        	     player.getProtocol().sendInterface(0, 548, 590, 12);
		         }
	        	break;
            default:
                System.out.println("unhandled button: widget="+widgetid+", interface="+interfaceId+", button="+button+", itemIndex="+itemIndex);
                break;
        }
 
    }
}
