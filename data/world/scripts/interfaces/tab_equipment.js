importPackage(org.osrse.game.logic.item);

function equipHandle(player, interfaceId, button, idx, idx2) {

    if (button >= 6 && button < 17) {
        id = 0;
        if (button == 16) {
            id = 13
        } else if (button == 15) {
            id = 12
        } else if (button == 14) {
            id = 10
        } else if (button == 13) {
            id = 9
        } else if (button == 12) {
            id = 7
        } else if (button == 11) {
            id = 5
        }
        var item = player.getEquipment().get(id == 0 ? button - 6 : id);
        //if (item == null) return
        if (player.getInventory().add(item)) {
            var i = player.getEquipment().remove(id == 0 ? button - 6 : id);
            //if (i != null) {
            player.getEquipment().refresh();
            player.getInventory().refresh();
            //}
        }
    } else
        player.sendMessage("" + interfaceId + ", " + button)
}