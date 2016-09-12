/**
 * Created by Jonathan on 9/12/2016.
 */
importPackage(org.osrse.game.logic.map);
importPackage(org.osrse.game.logic.masks);

function find_object(player, objectId, x, y) {
    if (objectId == 23271) {
        player.faceDirection(Region.getAbsoluteTile(x, y, player.getZ()));
        var y = player.getLocation().getY() > 3520 ? -3 : 3;
        var dir = player.getLocation().getY() > 3520 ? 0 : 1024;
        var ditch = [0, 0, 0, y, 60, 33, dir];
        ForcedMovement.force(player, Animation.create(6132), ditch, "ditch", true);
        return "s"
    }
    return "f"
}