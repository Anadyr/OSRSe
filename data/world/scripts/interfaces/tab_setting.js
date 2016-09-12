/**
 * Created by Jonathan on 8/28/2016.
 */

importPackage(org.osrse.game.logic.player);

function clientSetting(player, interfaceId, button, idx, idx2) {
    if (interfaceId == 60) {
        if (button == 4) {
            player.getProtocol().sendConfig(1055, 900)
        } else if (button == 12) {
            if (player.hasAttribute("chatbox")) {
                player.removeAttribute("chatbox")
            } else {
                player.setAttribute("chatbox", true)
            }
            player.getProtocol().sendConfig(1055, player.hasAttribute("chatbox") ? 800 : 0)//todo fix
        };; else if (button == 15) {
            if (player.getScreenDisplay().resizable()) {
                if (player.hasAttribute("fixTab")) {
                    player.removeAttribute("fixTab");
                } else {
                    player.setAttribute("fixTab", true);
                }
                var display = Player.Display.forId(player.hasAttribute("fixTab") ? 2 : 1);
                player.setScreenDisplay(display);
                player.getProtocol().sendWindow(player.getScreenDisplay().getWindowId());
                player.getProtocol().sendTabs();
                //todo send setting interface to new window,
            } else {

            }
        }
    } else {
        if (button == 21) {
            player.getProtocol().sendInterface(false, 60)
        }
    }
    player.sendMessage("" + interfaceId + ", " + button)
}
