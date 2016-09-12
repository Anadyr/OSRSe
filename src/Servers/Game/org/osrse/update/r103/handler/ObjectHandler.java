package org.osrse.update.r103.handler;

import org.osrse.Module;
import org.osrse.WorldModule;
import org.osrse.game.logic.map.CoordinateFuture;
import org.osrse.game.logic.map.PathProcessor;
import org.osrse.game.logic.map.Region;
import org.osrse.game.logic.map.Tile;
import org.osrse.game.logic.map.path.AStarPathFinder;
import org.osrse.game.logic.object.GameObject;
import org.osrse.game.logic.player.Player;
import org.osrse.network.Packet;
import org.osrse.network.PacketHandler;
import org.osrse.task.Engine;

/**
 * Created by Jonathan on 8/28/2016.
 */
public class ObjectHandler extends PacketHandler<Player> {

	@Override
	public void handle(final Player player, Packet packet) {
		final boolean running = packet.get() == 1;
		final int objectId = packet.getLEShortA();
		final int x = packet.getShortA();
		final int y = packet.getShort();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				final Tile loc = Tile.locate(x, y, player.getZ());
				final GameObject obj = Region.getObject(loc);
				if (obj == null || obj.getId() != objectId) {
					// Possible cheat
					System.err.println("Possible object option cheat [objId=" + objectId + ", loc=[" + loc + "]]");
					return;
				}

				Runnable r2 = new Runnable() {
					@Override
					public void run() {
						player.faceDirection(Region.getAbsoluteTile(x, y, 0));
						String scriptt = (String) Module.js.call("objects/object_container.find_object", player, objectId, x, y);
						if (!scriptt.equalsIgnoreCase("s")) { //some are so small might as well dump in there
							if (scriptt.equalsIgnoreCase("f")) {
								if (player.getPrivilege() == Player.Privilege.ADMINISTRATOR) {
									player.sendMessage("unhandled object=" + objectId + ", x=" + x + ", y=" + y);
								}
							} else {
								Module.js.call("objects/" + scriptt, player, objectId, x, y);
							}
						}
					}
				};
				CoordinateFuture cF = new CoordinateFuture(player, obj, r2);
				player.getPathProcessor().setCoordinateFuture(cF);
				player.getPathProcessor().updateCoordinateFuture();
				if (player.getPathProcessor().getCoordinateFuture() != null) {
					if (!player.getCombat().isFrozen()) {
						WorldModule.getLogic().submitPath(new AStarPathFinder(), player, x, y, obj, running ? PathProcessor.MOVE_SPEED_RUN : PathProcessor.MOVE_SPEED_ANY, false, null);
					} else {
						player.sendMessage("A magical force stops you from moving.");
						player.faceDirection(Tile.locate(x, y, player.getZ()));
					}
				} else {
					player.faceDirection(Tile.locate(x, y, player.getZ()));
				}
			}
		};
		Engine.dispatchToMapWorker(r);
	}

}
