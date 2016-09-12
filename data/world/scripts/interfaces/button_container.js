function findButtonScript(interfaceId, button, idx1, idx2) {
    if (interfaceId == 182) {
        return "tab_logout.handlelog"
    } else if (interfaceId == 387) {
        return "tab_equipment.equipHandle"
    } else if (interfaceId == 589) {
        return "tab_clanchat.handlecc"
    } else if (interfaceId == 271) {
        return "tab_prayer.praySelect"
    } else if (interfaceId == 218) {
        return "tab_magic.castSpell"
    } else if (interfaceId == 261 || interfaceId == 60) {
        return "tab_setting.clientSetting"
    }
    return "unhandled"
}