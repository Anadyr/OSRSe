/**
 * Created by Jonathan on 8/29/2016.
 */

function castSpell(player, interfaceId, button, idx, idx2) {
    if (interfaceId == 218) {
        if (button == 4) {
            //open bolt shit
        } else if (button == 24) {
            //house tele
        } else if (button == 59) {
            //charge
        } else if (button == 63 || button == 90 || button == 121) {
            //target tp
        } else
            player.getMagic().buttonCast(button, idx)
    }
}