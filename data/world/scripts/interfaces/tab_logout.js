function handlelog(player, interfaceId, button, idx, idx2) {
    if (button == 6) {
        player.getProtocol().sendLogout();
    } else if (button == 1) {
        player.sendMessage("Sorry we do not support this currently")
    }
}