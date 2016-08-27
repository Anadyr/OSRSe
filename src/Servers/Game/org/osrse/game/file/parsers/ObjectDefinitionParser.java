package org.osrse.game.file.parsers;

import org.osrse.game.file.Library;
import org.osrse.game.file.RS2File;
import org.osrse.game.logic.object.ObjectDefinition;
import org.osrse.utility.StreamUtilities;

import java.nio.ByteBuffer;

/**
 * Created by Jonathan on 1/5/14.
 */
public class ObjectDefinitionParser {
    private static byte[][] defSubFiles;

    public static ObjectDefinition forId(int objectId) {
        ObjectDefinition def = new ObjectDefinition();
        def.id = objectId;
        if(defSubFiles == null) {
            RS2File objectDef = Library.rs2Store.getFile(2, 6);
            objectDef.extract();
            defSubFiles = objectDef.getArchivedFiles();
        }
        byte[] data = defSubFiles[objectId];
        if (data != null) {
            load(def, ByteBuffer.wrap(data));
        }
        if (def.clippingFlag && def.name != null && def.name.contains("booth")) {
            def.clippingFlag = false;
        }
        if (def.clippingFlag) {
            def.actionCount = 0;
            def.walkable = false;
        }
        return def;
    }

    private static void load(ObjectDefinition def, ByteBuffer buffer) {
        int opcode;
        while ((opcode = (buffer.get() & 0xff)) != 0) {
            parseOpcode(def, opcode, buffer);
        }
    }

    private static void parseOpcode(ObjectDefinition def, int opcode, ByteBuffer buffer) {
        try {
            if (opcode == 1) {
                final int i_51_ = buffer.get() & 0xff;
                if (i_51_ > 0) {
                    for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
                        buffer.getShort();
                        buffer.get();
                    }
                }
            } else if (opcode == 2) {
                def.name = StreamUtilities.getString(buffer);
            } else if (opcode == 5) {
                final int i_53_ = buffer.get() & 0xff;
                if (i_53_ > 0) {
                    for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
                         buffer.getShort();
                    }
                }
            } else if (opcode == 14) {
                def.sizeX = buffer.get() & 0xff;
            } else if (opcode == 15) {
                def.sizeY = buffer.get() & 0xff;
            } else if (opcode == 17) {
                def.actionCount = 0;
                def.walkable = false;
            } else if (18 == opcode) {
                def.walkable = false;
            } else if (19 == opcode) {
                buffer.get();
            } else if (opcode == 21) {
                //this.anInt2317 = 0;
            } else if (22 == opcode) {
                //this.aBoolean2346 = true;
            } else if (23 == opcode) {
                //aBoolean2342 = true;
            } else if (24 == opcode) {
                buffer.getShort();
            } else if (opcode == 27) {
                def.actionCount = 1;
            } else if (28 == opcode) {
                    buffer.get();
            } else if (opcode == 29) {
               buffer.get();
            } else if (opcode == 39) {
                buffer.get();
            } else {
                if (opcode >= 30) {
                    if (opcode < 35) {
                        def.actions[opcode - 30] = StreamUtilities.getString(buffer);
                        if (def.actions[opcode - 30].equalsIgnoreCase("hidden")) {
                                def.actions[opcode - 30] = null;
                        }
                        return;
                    }
                }
                if (40 == opcode) {
                    final int i_55_ = buffer.get() & 0xff;
                    for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
                        buffer.getShort();
                        buffer.getShort();
                    }
                } else if (opcode == 41) {
                    final int i_57_ = buffer.get() & 0xff;
                    for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
                         buffer.getShort();
                        buffer.getShort();
                    }
                } else if (60 == opcode) {
                    buffer.getShort();
                } else if (opcode == 62) {
                        //this.aBoolean2327 = true;
                } else if (64 == opcode) {
                        //aBoolean2302 = false;
                } else if (65 == opcode) {
                    buffer.getShort();
                } else if (66 == opcode) {
                    buffer.getShort();
                } else if (67 == opcode) {
                    buffer.getShort();
                } else if (68 == opcode) {
                    buffer.getShort();
                } else if (opcode == 69) {
                    def.walkToData = buffer.get() & 0xff;
                } else if (70 == opcode) {
                    buffer.getShort();
                } else if (71 == opcode) {
                    buffer.getShort();
                } else if (72 == opcode) {
                    buffer.getShort();
                } else if (73 == opcode) {
                    def.clippingFlag = true;
                } else if (opcode == 74) {
                    //this.aBoolean2337 = true;
                } else if (75 == opcode) {
                        buffer.get();
                } else if (77 == opcode) {
                    int i4 = -1;
                    def.varbitId = buffer.getShort() & 0xFFFF;
                    def.configId = buffer.getShort() & 0xFFFF;
                    if (def.varbitId == '\uFFFF') {
                        def.varbitId = -1;
                    }
                    if (def.configId == '\uFFFF') {
                        def.configId = -1;
                    }
                    final int i5 = buffer.get() & 0xff;
                    def.childIds = new int[i5 * 2];
                    for (int var6 = 0; var6 <= i5; var6++) {
                        //def.childIds[var6] =
                                buffer.getShort();// & 0xFFFF;
                       // if (def.childIds[var6] == '\uFFFF') {
                        //    def.childIds[var6] = -1;
                      //  }
                    }
//                    def.childIds[1 + i5] = i4; in later revisions
                } else if (opcode == 78) {
                    buffer.getShort();
                    buffer.get();
                } else if (opcode == 79) {
                    buffer.getShort();
                    buffer.getShort();
                    buffer.get();
                    final int i_61_ = buffer.get() & 0xff;
                    for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
                        buffer.getShort();
                    }
                } else if (opcode == 81) {
                    buffer.get();
                }
            }
        } catch (final RuntimeException var6) {
            var6.printStackTrace();
        }
    }
}
