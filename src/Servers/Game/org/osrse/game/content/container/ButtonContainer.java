/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.osrse.game.content.container;
  
import org.osrse.game.content.Bank;
import org.osrse.game.logic.player.Player;
import org.osrse.game.logic.utility.LogicConstants;
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
            default:
               // System.out.println("unhandled button: widget="+widgetid+", interface="+interfaceId+", button="+button+", itemIndex="+itemIndex);
                break;
        }
 
    }
}
