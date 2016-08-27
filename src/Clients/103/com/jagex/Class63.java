package com.jagex;
import java.applet.Applet;
import java.util.Date;

public abstract class Class63 {

   static boolean aBool808 = false;


   public static Sprite method918(RSIndex var0, String var1, String var2, int var3) {
      int var4 = var0.getFileIdForName(var1, 1136795906);
      int var6 = var0.method1367(var4, var2, 1978448786);
      Sprite var10;
      if(Class41.method687(var0, var4, var6, -1862093285)) {
         Sprite var5 = new Sprite();
         var5.anInt2725 = -749860951 * Class8.anInt122;
         var5.anInt2726 = -1945497809 * Class8.anInt132;
         var5.xOffSet = Class8.anIntArray124[0];
         var5.yOffset = Class116_Sub23_Sub15.anIntArray2444[0];
         var5.myWidth = Class8.anIntArray125[0];
         var5.myHeight = Class8.anIntArray126[0];
         int var8 = var5.myWidth * var5.myHeight;
         byte[] var11 = Mob.aByteArrayArray2877[0];
         var5.myPixels = new int[var8];

         for(int var7 = 0; var7 < var8; ++var7) {
            var5.myPixels[var7] = Class97.anIntArray1372[var11[var7] & 255];
         }

         Class76.method1080((byte)-15);
         var10 = var5;
      } else {
         var10 = null;
      }

      return var10;
   }

   abstract byte[] copyOf(int var1);

   abstract void readBytes(byte[] var1, int var2);

   public static void method933(Applet var0, String var1, byte var2) {
      Class81.anApplet924 = var0;
      Class81.aString922 = var1;
   }

   static void parseScripts(Class116_Sub6 var0, int var1, int var2) {
      Object[] var3 = var0.anObjectArray1737;
      int var4 = ((Integer)var3[0]).intValue();
      Class116_Sub23_Sub18 var5 = Class47.method769(var4, -984954025);
      if(null != var5) {
         int intStackCount = 0;
         int var7 = 0;
         int index = -1;
         int[] var9 = var5.anIntArray2474;
         int[] values = var5.anIntArray2482;
         byte var11 = -1;
         Class3.anInt35 = 0;

         int var14;
         try {
            Class3.anIntArray28 = new int[-325262437 * var5.anInt2475];
            int var12 = 0;
            Class3.aStringArray29 = new String[var5.anInt2479 * 1146347541];
            int var33 = 0;

            int var15;
            String var44;
            for(var14 = 1; var14 < var3.length; ++var14) {
               if(var3[var14] instanceof Integer) {
                  var15 = ((Integer)var3[var14]).intValue();
                  if(-2147483647 == var15) {
                     var15 = 1518911111 * var0.anInt1747;
                  }

                  if(var15 == -2147483646) {
                     var15 = var0.anInt1738 * 2096422993;
                  }

                  if(-2147483645 == var15) {
                     var15 = null != var0.aClass116_Sub15_1736?-1536575275 * var0.aClass116_Sub15_1736.hash :-1;
                  }

                  if(-2147483644 == var15) {
                     var15 = -332002479 * var0.anInt1734;
                  }

                  if(var15 == -2147483643) {
                     var15 = null != var0.aClass116_Sub15_1736?2021294259 * var0.aClass116_Sub15_1736.anInt1926:-1;
                  }

                  if(-2147483642 == var15) {
                     var15 = null != var0.aClass116_Sub15_1740?var0.aClass116_Sub15_1740.hash * -1536575275:-1;
                  }

                  if(var15 == -2147483641) {
                     var15 = var0.aClass116_Sub15_1740 != null?2021294259 * var0.aClass116_Sub15_1740.anInt1926:-1;
                  }

                  if(var15 == -2147483640) {
                     var15 = -59421549 * var0.anInt1741;
                  }

                  if(-2147483639 == var15) {
                     var15 = var0.anInt1742 * 427883437;
                  }

                  Class3.anIntArray28[var12++] = var15;
               } else if(var3[var14] instanceof String) {
                  var44 = (String)var3[var14];
                  if(var44.equals("event_opbase")) {
                     var44 = var0.aString1743;
                  }

                  Class3.aStringArray29[var33++] = var44;
               }
            }

            var14 = 0;
            Class3.anInt39 = 1375974071 * var0.anInt1744;

            label3080:
            while(true) {
               ++var14;
               if(var14 > var1) {
                  throw new RuntimeException();
               }

               ++index;
               int opcode = var9[index];
               int var17;
               int var34;
               int var46;
               String[] var74;
               String var84;
               int[] var90;
               if(opcode < 100) {
                  if(0 == opcode) {
                     Class3.intStack[intStackCount++] = values[index];
                     continue;
                  }

                  if(1 == opcode) {
                     var15 = values[index];
                     Class3.intStack[intStackCount++] = Class107.varpData[var15];
                     continue;
                  }

                  if(2 == opcode) {
                     var15 = values[index];
                     --intStackCount;
                     Class107.varpData[var15] = Class3.intStack[intStackCount];
                     World.method567(var15, 2122167961);
                     continue;
                  }

                  if(opcode == 3) {
                     Class3.aStringArray32[var7++] = var5.aStringArray2477[index];
                     continue;
                  }

                  if(opcode == 6) {
                     index += values[index];
                     continue;
                  }

                  if(opcode == 7) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount + 1] != Class3.intStack[intStackCount]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(8 == opcode) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount + 1] == Class3.intStack[intStackCount]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(opcode == 9) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount] < Class3.intStack[intStackCount + 1]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(opcode == 10) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount] > Class3.intStack[1 + intStackCount]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(opcode == 21) {
                     if(0 == 1112721435 * Class3.anInt35) {
                        return;
                     }

                     Class39 var73 = Class3.aClass39Array33[(Class3.anInt35 -= -1200631277) * 1112721435];
                     var5 = var73.aClass116_Sub23_Sub18_515;
                     var9 = var5.anIntArray2474;
                     values = var5.anIntArray2482;
                     index = var73.anInt517 * -594127079;
                     Class3.anIntArray28 = var73.anIntArray516;
                     Class3.aStringArray29 = var73.aStringArray514;
                     continue;
                  }

                  if(25 == opcode) {
                     var15 = values[index];
                     Class3.intStack[intStackCount++] = Class103.method1451(var15, -584760962);
                     continue;
                  }

                  if(opcode == 27) {
                     var15 = values[index];
                     --intStackCount;
                     Class86.method1172(var15, Class3.intStack[intStackCount], (byte)109);
                     continue;
                  }

                  if(31 == opcode) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount] <= Class3.intStack[intStackCount + 1]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(opcode == 32) {
                     intStackCount -= 2;
                     if(Class3.intStack[intStackCount] >= Class3.intStack[1 + intStackCount]) {
                        index += values[index];
                     }
                     continue;
                  }

                  if(opcode == 33) {
                     Class3.intStack[intStackCount++] = Class3.anIntArray28[values[index]];
                     continue;
                  }

                  int var10001;
                  if(opcode == 34) {
                     var10001 = values[index];
                     --intStackCount;
                     Class3.anIntArray28[var10001] = Class3.intStack[intStackCount];
                     continue;
                  }

                  if(opcode == 35) {
                     Class3.aStringArray32[var7++] = Class3.aStringArray29[values[index]];
                     continue;
                  }

                  if(opcode == 36) {
                     var10001 = values[index];
                     --var7;
                     Class3.aStringArray29[var10001] = Class3.aStringArray32[var7];
                     continue;
                  }

                  if(37 == opcode) {
                     var15 = values[index];
                     var7 -= var15;
                     var84 = Tile.method1985(Class3.aStringArray32, var7, var15, -791024858);
                     Class3.aStringArray32[var7++] = var84;
                     continue;
                  }

                  if(opcode == 38) {
                     --intStackCount;
                     continue;
                  }

                  if(39 == opcode) {
                     --var7;
                     continue;
                  }

                  if(opcode == 40) {
                     var15 = values[index];
                     Class116_Sub23_Sub18 var102 = Class47.method769(var15, -1459313133);
                     var90 = new int[-325262437 * var102.anInt2475];
                     var74 = new String[1146347541 * var102.anInt2479];

                     for(var46 = 0; var46 < var102.anInt2480 * 767633967; ++var46) {
                        var90[var46] = Class3.intStack[var46 + (intStackCount - 767633967 * var102.anInt2480)];
                     }

                     for(var46 = 0; var46 < 873573015 * var102.anInt2491; ++var46) {
                        var74[var46] = Class3.aStringArray32[var46 + (var7 - 873573015 * var102.anInt2491)];
                     }

                     intStackCount -= 767633967 * var102.anInt2480;
                     var7 -= 873573015 * var102.anInt2491;
                     Class39 var97 = new Class39();
                     var97.aClass116_Sub23_Sub18_515 = var5;
                     var97.anInt517 = index * 954144041;
                     var97.anIntArray516 = Class3.anIntArray28;
                     var97.aStringArray514 = Class3.aStringArray29;
                     Class3.aClass39Array33[(Class3.anInt35 += -1200631277) * 1112721435 - 1] = var97;
                     var5 = var102;
                     var9 = var102.anIntArray2474;
                     values = var102.anIntArray2482;
                     index = -1;
                     Class3.anIntArray28 = var90;
                     Class3.aStringArray29 = var74;
                     continue;
                  }

                  if(opcode == 42) {
                     Class3.intStack[intStackCount++] = Class39.aClass33_518.method634(values[index], (byte)107);
                     continue;
                  }

                  if(opcode == 43) {
                     var10001 = values[index];
                     --intStackCount;
                     Class39.aClass33_518.method601(var10001, Class3.intStack[intStackCount], -1976877330);
                     continue;
                  }

                  if(44 == opcode) {
                     var15 = values[index] >> 16;
                     var34 = values[index] & '\uffff';
                     --intStackCount;
                     var17 = Class3.intStack[intStackCount];
                     if(var17 >= 0 && var17 <= 5000) {
                        Class3.anIntArray27[var15] = var17;
                        byte var86 = -1;
                        if(var34 == 105) {
                           var86 = 0;
                        }

                        var46 = 0;

                        while(true) {
                           if(var46 >= var17) {
                              continue label3080;
                           }

                           Class3.anIntArrayArray31[var15][var46] = var86;
                           ++var46;
                        }
                     }

                     throw new RuntimeException();
                  }

                  if(45 == opcode) {
                     var15 = values[index];
                     --intStackCount;
                     var34 = Class3.intStack[intStackCount];
                     if(var34 >= 0 && var34 < Class3.anIntArray27[var15]) {
                        Class3.intStack[intStackCount++] = Class3.anIntArrayArray31[var15][var34];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(opcode == 46) {
                     var15 = values[index];
                     intStackCount -= 2;
                     var34 = Class3.intStack[intStackCount];
                     if(var34 >= 0 && var34 < Class3.anIntArray27[var15]) {
                        Class3.anIntArrayArray31[var15][var34] = Class3.intStack[1 + intStackCount];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(opcode == 47) {
                     var44 = Class39.aClass33_518.method604(values[index], 653224099);
                     if(null == var44) {
                        var44 = "null";
                     }

                     Class3.aStringArray32[var7++] = var44;
                     continue;
                  }

                  if(48 == opcode) {
                     var10001 = values[index];
                     --var7;
                     Class39.aClass33_518.method636(var10001, Class3.aStringArray32[var7], (byte)0);
                     continue;
                  }
               }

               boolean var47;
               if(values[index] == 1) {
                  var47 = true;
               } else {
                  var47 = false;
               }

               RSInterface inter;
               RSInterface var18;
               RSInterface var19;
               int var21;
               RSInterface var35;
               int var36;
               boolean var42;
               boolean var56;
               if(opcode < 1000) {
                  if(opcode == 100) {
                     intStackCount -= 3;
                     var34 = Class3.intStack[intStackCount];
                     var17 = Class3.intStack[1 + intStackCount];
                     var36 = Class3.intStack[intStackCount + 2];
                     if(0 == var17) {
                        throw new RuntimeException();
                     }

                     var19 = Class107.getInterface(var34, 314639891);
                     if(var19.aClass116_Sub15Array1995 == null) {
                        var19.aClass116_Sub15Array1995 = new RSInterface[var36 + 1];
                     }

                     if(var19.aClass116_Sub15Array1995.length <= var36) {
                        RSInterface[] var20 = new RSInterface[var36 + 1];

                        for(var21 = 0; var21 < var19.aClass116_Sub15Array1995.length; ++var21) {
                           var20[var21] = var19.aClass116_Sub15Array1995[var21];
                        }

                        var19.aClass116_Sub15Array1995 = var20;
                     }

                     if(var36 > 0 && null == var19.aClass116_Sub15Array1995[var36 - 1]) {
                        throw new RuntimeException("" + (var36 - 1));
                     }

                     RSInterface var41 = new RSInterface();
                     var41.type = var17 * 1702392323;
                     var41.parent = (var41.hash = 1 * var19.hash) * 1485437425;
                     var41.anInt1926 = var36 * 938225275;
                     var41.newFormat = true;
                     var19.aClass116_Sub15Array1995[var36] = var41;
                     if(var47) {
                        Class29.aClass116_Sub15_410 = var41;
                     } else {
                        Class3.aClass116_Sub15_36 = var41;
                     }

                     Class79.refreshInterface(var19, 1775934735);
                     continue;
                  }

                  if(101 == opcode) {
                     inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                     var35 = Class107.getInterface(-1536575275 * inter.hash, 314639891);
                     var35.aClass116_Sub15Array1995[inter.anInt1926 * 2021294259] = null;
                     Class79.refreshInterface(var35, 1086002168);
                     continue;
                  }

                  if(102 == opcode) {
                     --intStackCount;
                     inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                     inter.aClass116_Sub15Array1995 = null;
                     Class79.refreshInterface(inter, 550540026);
                     continue;
                  }

                  if(200 == opcode) {
                     intStackCount -= 2;
                     var34 = Class3.intStack[intStackCount];
                     var17 = Class3.intStack[intStackCount + 1];
                     var18 = AbstractRSDrawing.method339(var34, var17, 1008129993);
                     if(var18 != null && var17 != -1) {
                        Class3.intStack[intStackCount++] = 1;
                        if(var47) {
                           Class29.aClass116_Sub15_410 = var18;
                        } else {
                           Class3.aClass116_Sub15_36 = var18;
                        }
                        continue;
                     }

                     Class3.intStack[intStackCount++] = 0;
                     continue;
                  }

                  if(201 == opcode) {
                     --intStackCount;
                     inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                     if(null != inter) {
                        Class3.intStack[intStackCount++] = 1;
                        if(var47) {
                           Class29.aClass116_Sub15_410 = inter;
                        } else {
                           Class3.aClass116_Sub15_36 = inter;
                        }
                     } else {
                        Class3.intStack[intStackCount++] = 0;
                     }
                     continue;
                  }
               } else {
                  boolean var37;
                  if((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
                     String var38;
                     if((opcode < 1100 || opcode >= 1200) && (opcode < 2100 || opcode >= 2200)) {
                        if((opcode < 1200 || opcode >= 1300) && (opcode < 2200 || opcode >= 2300)) {
                           if((opcode < 1300 || opcode >= 1400) && (opcode < 2300 || opcode >= 2400)) {
                              int[] var45;
                              int var50;
                              String var55;
                              if(opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
                                 if(opcode >= 2000) {
                                    opcode -= 1000;
                                    --intStackCount;
                                    inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                 } else {
                                    inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 }

                                 --var7;
                                 var55 = Class3.aStringArray32[var7];
                                 var45 = null;
                                 if(var55.length() > 0 && var55.charAt(var55.length() - 1) == 89) {
                                    --intStackCount;
                                    var46 = Class3.intStack[intStackCount];
                                    if(var46 > 0) {
                                       for(var45 = new int[var46]; var46-- > 0; var45[var46] = Class3.intStack[intStackCount]) {
                                          --intStackCount;
                                       }
                                    }

                                    var55 = var55.substring(0, var55.length() - 1);
                                 }

                                 Object[] var91 = new Object[var55.length() + 1];

                                 for(var50 = var91.length - 1; var50 >= 1; --var50) {
                                    if(var55.charAt(var50 - 1) == 115) {
                                       --var7;
                                       var91[var50] = Class3.aStringArray32[var7];
                                    } else {
                                       --intStackCount;
                                       Integer var10002 = new Integer(Class3.intStack[intStackCount]);
                                       var91[var50] = var10002;
                                    }
                                 }

                                 --intStackCount;
                                 var50 = Class3.intStack[intStackCount];
                                 if(var50 != -1) {
                                    var91[0] = new Integer(var50);
                                 } else {
                                    var91 = null;
                                 }

                                 if(1400 == opcode) {
                                    inter.mouseClickFocusListener = var91;
                                 }

                                 if(opcode == 1401) {
                                    inter.mouseDraggedListener = var91;
                                 }

                                 if(1402 == opcode) {
                                    inter.mouseClickUnfocusListener = var91;
                                 }

                                 if(1403 == opcode) {
                                    inter.mouseFocusListener = var91;
                                 }

                                 if(opcode == 1404) {
                                    inter.mouseUnfocusListener = var91;
                                 }

                                 if(opcode == 1405) {
                                    inter.anObjectArray2012 = var91;
                                 }

                                 if(opcode == 1406) {
                                    inter.spellUsedListener = var91;
                                 }

                                 if(1407 == opcode) {
                                    inter.varpUpdateListener = var91;
                                    inter.varpListenerValues = var45;
                                 }

                                 if(1408 == opcode) {
                                    inter.mainLoopListener = var91;
                                 }

                                 if(1409 == opcode) {
                                    inter.anObjectArray2023 = var91;
                                 }

                                 if(1410 == opcode) {
                                    inter.anObjectArray2013 = var91;
                                 }

                                 if(opcode == 1411) {
                                    inter.mouseClickListener = var91;
                                 }

                                 if(1412 == opcode) {
                                    inter.mouseFocusedListener = var91;
                                 }

                                 if(1414 == opcode) {
                                    inter.inventoryUpdateListener = var91;
                                    inter.inventoryListenerValues = var45;
                                 }

                                 if(opcode == 1415) {
                                    inter.skillUpdateListener = var91;
                                    inter.skillListenerValues = var45;
                                 }

                                 if(opcode == 1416) {
                                    inter.spellUsedOnItemListener = var91;
                                 }

                                 if(opcode == 1417) {
                                    inter.mouseWheelListener = var91;
                                 }

                                 if(1418 == opcode) {
                                    inter.anObjectArray2025 = var91;
                                 }

                                 if(1419 == opcode) {
                                    inter.anObjectArray2026 = var91;
                                 }

                                 if(opcode == 1420) {
                                    inter.anObjectArray2027 = var91;
                                 }

                                 if(1421 == opcode) {
                                    inter.anObjectArray2028 = var91;
                                 }

                                 if(opcode == 1422) {
                                    inter.anObjectArray1982 = var91;
                                 }

                                 if(opcode == 1423) {
                                    inter.anObjectArray2030 = var91;
                                 }

                                 if(opcode == 1424) {
                                    inter.anObjectArray2031 = var91;
                                 }

                                 if(opcode == 1425) {
                                    inter.anObjectArray2033 = var91;
                                 }

                                 if(opcode == 1426) {
                                    inter.anObjectArray2034 = var91;
                                 }

                                 if(opcode == 1427) {
                                    inter.anObjectArray2032 = var91;
                                 }

                                 inter.aBool2003 = true;
                                 continue;
                              }

                              if(opcode < 1600) {
                                 inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(1500 == opcode) {
                                    Class3.intStack[intStackCount++] = 332168295 * inter.x;
                                    continue;
                                 }

                                 if(opcode == 1501) {
                                    Class3.intStack[intStackCount++] = inter.y * 1492425953;
                                    continue;
                                 }

                                 if(1502 == opcode) {
                                    Class3.intStack[intStackCount++] = inter.wdth * 1645211541;
                                    continue;
                                 }

                                 if(1503 == opcode) {
                                    Class3.intStack[intStackCount++] = 1227800423 * inter.heght;
                                    continue;
                                 }

                                 if(opcode == 1504) {
                                    Class3.intStack[intStackCount++] = inter.hidden ?1:0;
                                    continue;
                                 }

                                 if(1505 == opcode) {
                                    Class3.intStack[intStackCount++] = -1652479707 * inter.parent;
                                    continue;
                                 }
                              } else if(opcode < 1700) {
                                 inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(1600 == opcode) {
                                    Class3.intStack[intStackCount++] = -352661099 * inter.anInt1946;
                                    continue;
                                 }

                                 if(1601 == opcode) {
                                    Class3.intStack[intStackCount++] = -1602694527 * inter.anInt1947;
                                    continue;
                                 }

                                 if(1602 == opcode) {
                                    Class3.aStringArray32[var7++] = inter.disabledText;
                                    continue;
                                 }

                                 if(1603 == opcode) {
                                    Class3.intStack[intStackCount++] = -302755437 * inter.anInt2037;
                                    continue;
                                 }

                                 if(opcode == 1604) {
                                    Class3.intStack[intStackCount++] = 177405235 * inter.maxScrollVertical;
                                    continue;
                                 }

                                 if(1605 == opcode) {
                                    Class3.intStack[intStackCount++] = inter.zoom * -1472457387;
                                    continue;
                                 }

                                 if(1606 == opcode) {
                                    Class3.intStack[intStackCount++] = inter.rotateX * 175924351;
                                    continue;
                                 }

                                 if(opcode == 1607) {
                                    Class3.intStack[intStackCount++] = inter.anInt1990 * 681145387;
                                    continue;
                                 }

                                 if(opcode == 1608) {
                                    Class3.intStack[intStackCount++] = inter.rotateY * 745334365;
                                    continue;
                                 }

                                 if(opcode == 1609) {
                                    Class3.intStack[intStackCount++] = -1508397471 * inter.alpha;
                                    continue;
                                 }
                              } else if(opcode < 1800) {
                                 inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(opcode == 1700) {
                                    Class3.intStack[intStackCount++] = inter.anInt2043 * 813479615;
                                    continue;
                                 }

                                 if(opcode == 1701) {
                                    if(-1 != 813479615 * inter.anInt2043) {
                                       Class3.intStack[intStackCount++] = inter.anInt2044 * 1393082105;
                                    } else {
                                       Class3.intStack[intStackCount++] = 0;
                                    }
                                    continue;
                                 }

                                 if(opcode == 1702) {
                                    Class3.intStack[intStackCount++] = inter.anInt1926 * 2021294259;
                                    continue;
                                 }
                              } else if(opcode < 1900) {
                                 inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(opcode == 1800) {
                                    Class3.intStack[intStackCount++] = SignLink.method1075(Class35.method645(inter, (byte) 0), -694886802);
                                    continue;
                                 }

                                 if(1801 == opcode) {
                                    --intStackCount;
                                    var17 = Class3.intStack[intStackCount];
                                    --var17;
                                    if(null != inter.niActions && var17 < inter.niActions.length && inter.niActions[var17] != null) {
                                       Class3.aStringArray32[var7++] = inter.niActions[var17];
                                       continue;
                                    }

                                    Class3.aStringArray32[var7++] = "";
                                    continue;
                                 }

                                 if(1802 == opcode) {
                                    if(inter.action_name == null) {
                                       Class3.aStringArray32[var7++] = "";
                                    } else {
                                       Class3.aStringArray32[var7++] = inter.action_name;
                                    }
                                    continue;
                                 }
                              } else if((opcode < 1900 || opcode >= 2000) && (opcode < 2900 || opcode >= 3000)) {
                                 if(opcode < 2600) {
                                    --intStackCount;
                                    inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                    if(opcode == 2500) {
                                       Class3.intStack[intStackCount++] = inter.x * 332168295;
                                       continue;
                                    }

                                    if(opcode == 2501) {
                                       Class3.intStack[intStackCount++] = inter.y * 1492425953;
                                       continue;
                                    }

                                    if(opcode == 2502) {
                                       Class3.intStack[intStackCount++] = inter.wdth * 1645211541;
                                       continue;
                                    }

                                    if(opcode == 2503) {
                                       Class3.intStack[intStackCount++] = inter.heght * 1227800423;
                                       continue;
                                    }

                                    if(2504 == opcode) {
                                       Class3.intStack[intStackCount++] = inter.hidden ?1:0;
                                       continue;
                                    }

                                    if(2505 == opcode) {
                                       Class3.intStack[intStackCount++] = inter.parent * -1652479707;
                                       continue;
                                    }
                                 } else if(opcode < 2700) {
                                    --intStackCount;
                                    inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                    if(2600 == opcode) {
                                       Class3.intStack[intStackCount++] = -352661099 * inter.anInt1946;
                                       continue;
                                    }

                                    if(2601 == opcode) {
                                       Class3.intStack[intStackCount++] = -1602694527 * inter.anInt1947;
                                       continue;
                                    }

                                    if(opcode == 2602) {
                                       Class3.aStringArray32[var7++] = inter.disabledText;
                                       continue;
                                    }

                                    if(2603 == opcode) {
                                       Class3.intStack[intStackCount++] = -302755437 * inter.anInt2037;
                                       continue;
                                    }

                                    if(opcode == 2604) {
                                       Class3.intStack[intStackCount++] = inter.maxScrollVertical * 177405235;
                                       continue;
                                    }

                                    if(2605 == opcode) {
                                       Class3.intStack[intStackCount++] = -1472457387 * inter.zoom;
                                       continue;
                                    }

                                    if(opcode == 2606) {
                                       Class3.intStack[intStackCount++] = inter.rotateX * 175924351;
                                       continue;
                                    }

                                    if(2607 == opcode) {
                                       Class3.intStack[intStackCount++] = inter.anInt1990 * 681145387;
                                       continue;
                                    }

                                    if(opcode == 2608) {
                                       Class3.intStack[intStackCount++] = 745334365 * inter.rotateY;
                                       continue;
                                    }

                                    if(2609 == opcode) {
                                       Class3.intStack[intStackCount++] = -1508397471 * inter.alpha;
                                       continue;
                                    }
                                 } else if(opcode < 2800) {
                                    if(opcode == 2700) {
                                       --intStackCount;
                                       inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                       Class3.intStack[intStackCount++] = inter.anInt2043 * 813479615;
                                       continue;
                                    }

                                    if(opcode == 2701) {
                                       --intStackCount;
                                       inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                       if(inter.anInt2043 * 813479615 != -1) {
                                          Class3.intStack[intStackCount++] = inter.anInt2044 * 1393082105;
                                       } else {
                                          Class3.intStack[intStackCount++] = 0;
                                       }
                                       continue;
                                    }

                                    if(opcode == 2702) {
                                       --intStackCount;
                                       var34 = Class3.intStack[intStackCount];
                                       GameInterface var53 = (GameInterface)client.overridedInterfaces.get((long) var34);
                                       if(var53 != null) {
                                          Class3.intStack[intStackCount++] = 1;
                                       } else {
                                          Class3.intStack[intStackCount++] = 0;
                                       }
                                       continue;
                                    }

                                    if(2706 == opcode) {
                                       Class3.intStack[intStackCount++] = client.anInt3200 * -1074177723;
                                       continue;
                                    }
                                 } else if(opcode < 2900) {
                                    --intStackCount;
                                    inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                    if(opcode == 2800) {
                                       Class3.intStack[intStackCount++] = SignLink.method1075(Class35.method645(inter, (byte) 0), 497101623);
                                       continue;
                                    }

                                    if(opcode == 2801) {
                                       --intStackCount;
                                       var17 = Class3.intStack[intStackCount];
                                       --var17;
                                       if(null != inter.niActions && var17 < inter.niActions.length && null != inter.niActions[var17]) {
                                          Class3.aStringArray32[var7++] = inter.niActions[var17];
                                          continue;
                                       }

                                       Class3.aStringArray32[var7++] = "";
                                       continue;
                                    }

                                    if(opcode == 2802) {
                                       if(null == inter.action_name) {
                                          Class3.aStringArray32[var7++] = "";
                                       } else {
                                          Class3.aStringArray32[var7++] = inter.action_name;
                                       }
                                       continue;
                                    }
                                 } else {
                                    int var23;
                                    int var49;
                                    int var63;
                                    if(opcode < 3200) {
                                       if(3100 == opcode) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          Class86.appendMessage(0, "", var84, -75762742);
                                          continue;
                                       }

                                       if(3101 == opcode) {
                                          intStackCount -= 2;
                                          Class53.method792(Class79.ourPlayer, Class3.intStack[intStackCount], Class3.intStack[1 + intStackCount], (byte)99);
                                          continue;
                                       }

                                       if(opcode == 3103) {
                                          ISAAC.method794((short) -1316);
                                          continue;
                                       }

                                       boolean var43;
                                       if(3104 == opcode) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          var17 = 0;
                                          var43 = false;
                                          boolean var48 = false;
                                          var49 = 0;
                                          var23 = var84.length();
                                          int var24 = 0;

                                          while(true) {
                                             if(var24 >= var23) {
                                                var42 = var48;
                                                break;
                                             }

                                             label3352: {
                                                char var25 = var84.charAt(var24);
                                                if(0 == var24) {
                                                   if(45 == var25) {
                                                      var43 = true;
                                                      break label3352;
                                                   }

                                                   if(43 == var25) {
                                                      break label3352;
                                                   }
                                                }

                                                if(var25 >= 48 && var25 <= 57) {
                                                   var63 = var25 - 48;
                                                } else if(var25 >= 65 && var25 <= 90) {
                                                   var63 = var25 - 55;
                                                } else {
                                                   if(var25 < 97 || var25 > 122) {
                                                      var42 = false;
                                                      break;
                                                   }

                                                   var63 = var25 - 87;
                                                }

                                                if(var63 >= 10) {
                                                   var42 = false;
                                                   break;
                                                }

                                                if(var43) {
                                                   var63 = -var63;
                                                }

                                                int var26 = var63 + var49 * 10;
                                                if(var26 / 10 != var49) {
                                                   var42 = false;
                                                   break;
                                                }

                                                var49 = var26;
                                                var48 = true;
                                             }

                                             ++var24;
                                          }

                                          if(var42) {
                                             var46 = Class116_Sub5.method1932(var84, 10, true, (short)1000);
                                             var17 = var46;
                                          }

                                          client.rsaBuffer.startPacket(79, (byte) 100);
                                          client.rsaBuffer.writeInt(var17, (byte)116);
                                          continue;
                                       }

                                       if(3105 == opcode) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          client.rsaBuffer.startPacket(84, (byte) 97);
                                          client.rsaBuffer.writeByte(var84.length() + 1, -207295491);
                                          client.rsaBuffer.writeJGString(var84, 675541373);
                                          continue;
                                       }

                                       if(3106 == opcode) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          client.rsaBuffer.startPacket(58, (byte) 76);
                                          client.rsaBuffer.writeByte(var84.length() + 1, -2061267376);
                                          client.rsaBuffer.writeJGString(var84, 648526036);
                                          continue;
                                       }

                                       if(opcode == 3107) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          --var7;
                                          var55 = Class3.aStringArray32[var7];
                                          var36 = Class7.anInt107 * -334270159;
                                          int[] var40 = Class7.anIntArray108;
                                          var43 = false;

                                          for(var21 = 0; var21 < var36; ++var21) {
                                             Player var22 = client.globalPlayers[var40[var21]];
                                             if(null != var22 && var22 != Class79.ourPlayer && var22.username != null && var22.username.equalsIgnoreCase(var55)) {
                                                if(1 == var34) {
                                                   client.rsaBuffer.startPacket(234, (byte) 92);
                                                   client.rsaBuffer.method2135(0, -788814040);
                                                   client.rsaBuffer.method2102(var40[var21], -1648648956);
                                                } else if(4 == var34) {
                                                   client.rsaBuffer.startPacket(83, (byte) 45);
                                                   client.rsaBuffer.writeByte(0, -1739045830);
                                                   client.rsaBuffer.writeShort(var40[var21], -2024821059);
                                                } else if(6 == var34) {
                                                   client.rsaBuffer.startPacket(4, (byte) 81);
                                                   client.rsaBuffer.writeByteC(0, 2006247516);
                                                   client.rsaBuffer.method2102(var40[var21], 480613106);
                                                } else if(var34 == 7) {
                                                   client.rsaBuffer.startPacket(224, (byte) 21);
                                                   client.rsaBuffer.method2135(0, -1828445303);
                                                   client.rsaBuffer.writeShort(var40[var21], -2091029025);
                                                }

                                                var43 = true;
                                                break;
                                             }
                                          }

                                          if(!var43) {
                                             Class86.appendMessage(4, "", Class91.aString1196 + var55, -712663804);
                                          }
                                          continue;
                                       }

                                       if(opcode == 3108) {
                                          intStackCount -= 3;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[intStackCount + 1];
                                          var36 = Class3.intStack[2 + intStackCount];
                                          var19 = Class107.getInterface(var36, 314639891);
                                          Class79.method1098(var19, var34, var17, (short)-6817);
                                          continue;
                                       }

                                       if(opcode == 3109) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[intStackCount + 1];
                                          var18 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                          Class79.method1098(var18, var34, var17, (short)-36);
                                          continue;
                                       }

                                       if(3110 == opcode) {
                                          --intStackCount;
                                          PlayerAlias.aBool1756 = Class3.intStack[intStackCount] == 1;
                                          continue;
                                       }

                                       if(3111 == opcode) {
                                          Class3.intStack[intStackCount++] = Class116_Sub5.aClass29_1727.aBool403?1:0;
                                          continue;
                                       }

                                       if(3112 == opcode) {
                                          --intStackCount;
                                          Class116_Sub5.aClass29_1727.aBool403 = Class3.intStack[intStackCount] == 1;
                                          Class86.method1167((byte)-62);
                                          continue;
                                       }

                                       if(3113 == opcode) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          --intStackCount;
                                          var56 = Class3.intStack[intStackCount] == 1;
                                          Friend.method1839(var84, var56, "openjs", false, (byte) -98);
                                          continue;
                                       }

                                       if(3115 == opcode) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          client.rsaBuffer.startPacket(160, (byte) 39);
                                          client.rsaBuffer.writeShort(var34, -1979866556);
                                          continue;
                                       }

                                       if(opcode == 3116) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          var7 -= 2;
                                          var55 = Class3.aStringArray32[var7];
                                          var38 = Class3.aStringArray32[1 + var7];
                                          if(var55.length() <= 500 && var38.length() <= 500) {
                                             client.rsaBuffer.startPacket(196, (byte) 46);
                                             client.rsaBuffer.writeShort(1 + Class22.calculateJGString(var55, -1927922975) + Class22.calculateJGString(var38, -1958436004), -1672837008);
                                             client.rsaBuffer.writeJGString(var38, 919607439);
                                             client.rsaBuffer.writeByteC(var34, 1092207316);
                                             client.rsaBuffer.writeJGString(var55, -104772690);
                                          }
                                          continue;
                                       }
                                    } else if(opcode < 3300) {
                                       if(opcode == 3200) {
                                          intStackCount -= 3;
                                          TileObj5.method698(Class3.intStack[intStackCount], Class3.intStack[intStackCount + 1], Class3.intStack[2 + intStackCount], 1880586392);
                                          continue;
                                       }

                                       if(3201 == opcode) {
                                          --intStackCount;
                                          Class26.method535(Class3.intStack[intStackCount], (byte)-86);
                                          continue;
                                       }

                                       if(opcode == 3202) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          int var10000 = Class3.intStack[1 + intStackCount];
                                          if(-1994948003 * client.anInt3171 != 0 && var34 != -1) {
                                             Class80.method1099(Class108.aCacheIndex_1471, var34, 0, client.anInt3171 * -1994948003, false, (short)21645);
                                             client.aBool3159 = true;
                                          }
                                          continue;
                                       }
                                    } else if(opcode < 3400) {
                                       if(3300 == opcode) {
                                          Class3.intStack[intStackCount++] = -1040073859 * client.anInt2943;
                                          continue;
                                       }

                                       Class116_Sub10 var52;
                                       if(3301 == opcode) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[1 + intStackCount];
                                          var45 = Class3.intStack;
                                          var46 = intStackCount++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var34);
                                          if(var52 == null) {
                                             var50 = -1;
                                          } else if(var17 >= 0 && var17 < var52.anIntArray1812.length) {
                                             var50 = var52.anIntArray1812[var17];
                                          } else {
                                             var50 = -1;
                                          }

                                          var45[var46] = var50;
                                          continue;
                                       }

                                       if(3302 == opcode) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[1 + intStackCount];
                                          Class3.intStack[intStackCount++] = Class45.method714(var34, var17, -1870921613);
                                          continue;
                                       }

                                       if(opcode == 3303) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[1 + intStackCount];
                                          var45 = Class3.intStack;
                                          var46 = intStackCount++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var34);
                                          if(null == var52) {
                                             var50 = 0;
                                          } else if(-1 == var17) {
                                             var50 = 0;
                                          } else {
                                             var49 = 0;

                                             for(var23 = 0; var23 < var52.anIntArray1804.length; ++var23) {
                                                if(var17 == var52.anIntArray1812[var23]) {
                                                   var49 += var52.anIntArray1804[var23];
                                                }
                                             }

                                             var50 = var49;
                                          }

                                          var45[var46] = var50;
                                          continue;
                                       }

                                       if(opcode == 3304) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = Class103.method1448(var34, -1095058151).anInt2278 * -612948537;
                                          continue;
                                       }

                                       if(opcode == 3305) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = client.anIntArray2953[var34];
                                          continue;
                                       }

                                       if(opcode == 3306) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = client.anIntArray2951[var34];
                                          continue;
                                       }

                                       if(opcode == 3307) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = client.anIntArray3108[var34];
                                          continue;
                                       }

                                       if(3308 == opcode) {
                                          var34 = GameInterface.anInt1819 * -747958745;
                                          var17 = 1426698711 * Class116_Sub17.anInt2105 + (1272643751 * Class79.ourPlayer.anInt2609 >> 7);
                                          var36 = (Class79.ourPlayer.anInt2579 * -1801433343 >> 7) + Class33.anInt456 * 714823515;
                                          Class3.intStack[intStackCount++] = (var17 << 14) + (var34 << 28) + var36;
                                          continue;
                                       }

                                       if(3309 == opcode) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = var34 >> 14 & 16383;
                                          continue;
                                       }

                                       if(3310 == opcode) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = var34 >> 28;
                                          continue;
                                       }

                                       if(opcode == 3311) {
                                          --intStackCount;
                                          var34 = Class3.intStack[intStackCount];
                                          Class3.intStack[intStackCount++] = var34 & 16383;
                                          continue;
                                       }

                                       if(opcode == 3312) {
                                          Class3.intStack[intStackCount++] = client.aBool2936?1:0;
                                          continue;
                                       }

                                       if(3313 == opcode) {
                                          intStackCount -= 2;
                                          var34 = '\u8000' + Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[1 + intStackCount];
                                          var45 = Class3.intStack;
                                          var46 = intStackCount++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var34);
                                          if(var52 == null) {
                                             var50 = -1;
                                          } else if(var17 >= 0 && var17 < var52.anIntArray1812.length) {
                                             var50 = var52.anIntArray1812[var17];
                                          } else {
                                             var50 = -1;
                                          }

                                          var45[var46] = var50;
                                          continue;
                                       }

                                       if(3314 == opcode) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount] + '\u8000';
                                          var17 = Class3.intStack[intStackCount + 1];
                                          Class3.intStack[intStackCount++] = Class45.method714(var34, var17, 1092133066);
                                          continue;
                                       }

                                       if(3315 == opcode) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount] + '\u8000';
                                          var17 = Class3.intStack[intStackCount + 1];
                                          var45 = Class3.intStack;
                                          var46 = intStackCount++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var34);
                                          if(var52 == null) {
                                             var50 = 0;
                                          } else if(var17 == -1) {
                                             var50 = 0;
                                          } else {
                                             var49 = 0;

                                             for(var23 = 0; var23 < var52.anIntArray1804.length; ++var23) {
                                                if(var17 == var52.anIntArray1812[var23]) {
                                                   var49 += var52.anIntArray1804[var23];
                                                }
                                             }

                                             var50 = var49;
                                          }

                                          var45[var46] = var50;
                                          continue;
                                       }

                                       if(opcode == 3316) {
                                          if(client.playerRights * 1520983779 >= 2) {
                                             Class3.intStack[intStackCount++] = client.playerRights * 1520983779;
                                          } else {
                                             Class3.intStack[intStackCount++] = 0;
                                          }
                                          continue;
                                       }

                                       if(opcode == 3317) {
                                          Class3.intStack[intStackCount++] = client.anInt3157 * 210138957;
                                          continue;
                                       }

                                       if(opcode == 3318) {
                                          Class3.intStack[intStackCount++] = -1631311031 * client.anInt3115;
                                          continue;
                                       }

                                       if(3321 == opcode) {
                                          Class3.intStack[intStackCount++] = client.anInt3098 * -1005815685;
                                          continue;
                                       }

                                       if(opcode == 3322) {
                                          Class3.intStack[intStackCount++] = -1944031695 * client.anInt3099;
                                          continue;
                                       }

                                       if(3323 == opcode) {
                                          if(client.aBool3147) {
                                             Class3.intStack[intStackCount++] = 1;
                                          } else {
                                             Class3.intStack[intStackCount++] = 0;
                                          }
                                          continue;
                                       }

                                       if(opcode == 3324) {
                                          Class3.intStack[intStackCount++] = client.anInt2933 * 1115656689;
                                          continue;
                                       }
                                    } else if(opcode < 3500) {
                                       if(opcode == 3400) {
                                          intStackCount -= 2;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[1 + intStackCount];
                                          Class116_Sub23_Sub5 var54 = ObjectDefinition.method2437(var34, (byte) 92);
                                          if(var54.aChar2268 != 115) {
                                             ;
                                          }

                                          for(var46 = 0; var46 < var54.anInt2265 * 557176427; ++var46) {
                                             if(var54.anIntArray2272[var46] == var17) {
                                                Class3.aStringArray32[var7++] = var54.aStringArray2274[var46];
                                                var54 = null;
                                                break;
                                             }
                                          }

                                          if(var54 != null) {
                                             Class3.aStringArray32[var7++] = var54.aString2275;
                                          }
                                          continue;
                                       }

                                       if(opcode == 3408) {
                                          intStackCount -= 4;
                                          var34 = Class3.intStack[intStackCount];
                                          var17 = Class3.intStack[intStackCount + 1];
                                          var36 = Class3.intStack[intStackCount + 2];
                                          var46 = Class3.intStack[intStackCount + 3];
                                          Class116_Sub23_Sub5 var67 = ObjectDefinition.method2437(var36, (byte) 52);
                                          if(var34 == var67.aChar2269 && var67.aChar2268 == var17) {
                                             for(var21 = 0; var21 < var67.anInt2265 * 557176427; ++var21) {
                                                if(var46 == var67.anIntArray2272[var21]) {
                                                   if(115 == var17) {
                                                      Class3.aStringArray32[var7++] = var67.aStringArray2274[var21];
                                                   } else {
                                                      Class3.intStack[intStackCount++] = var67.anIntArray2273[var21];
                                                   }

                                                   var67 = null;
                                                   break;
                                                }
                                             }

                                             if(null != var67) {
                                                if(var17 == 115) {
                                                   Class3.aStringArray32[var7++] = var67.aString2275;
                                                } else {
                                                   Class3.intStack[intStackCount++] = -901678785 * var67.anInt2271;
                                                }
                                             }
                                             continue;
                                          }

                                          if(var17 == 115) {
                                             Class3.aStringArray32[var7++] = "null";
                                          } else {
                                             Class3.intStack[intStackCount++] = 0;
                                          }
                                          continue;
                                       }
                                    } else {
                                       String var61;
                                       if(opcode < 3700) {
                                          if(3600 == opcode) {
                                             if(0 == client.anInt3203 * -923448785) {
                                                Class3.intStack[intStackCount++] = -2;
                                             } else if(1 == client.anInt3203 * -923448785) {
                                                Class3.intStack[intStackCount++] = -1;
                                             } else {
                                                Class3.intStack[intStackCount++] = client.anInt3152 * -1616775607;
                                             }
                                             continue;
                                          }

                                          if(opcode == 3601) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(client.anInt3203 * -923448785 == 2 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.aStringArray32[var7++] = client.aClass50Array3204[var34].username;
                                                Class3.aStringArray32[var7++] = client.aClass50Array3204[var34].lastUsername;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3602 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(2 == client.anInt3203 * -923448785 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.intStack[intStackCount++] = client.aClass50Array3204[var34].anInt666 * -698428043;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = 0;
                                             continue;
                                          }

                                          if(3603 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(-923448785 * client.anInt3203 == 2 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.intStack[intStackCount++] = 1241458911 * client.aClass50Array3204[var34].anInt668;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = 0;
                                             continue;
                                          }

                                          if(3604 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             client.rsaBuffer.startPacket(62, (byte) 67);
                                             client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1120455379) + 1, -474962219);
                                             client.rsaBuffer.writeJGString(var84, 2075750967);
                                             client.rsaBuffer.method2135(var17, -996040580);
                                             continue;
                                          }

                                          Ignore var64;
                                          RelationList var66;
                                          String var68;
                                          if(opcode == 3605) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(null == var84) {
                                                continue;
                                             }

                                             if((-1616775607 * client.anInt3152 < 200 || 1 == -905152705 * client.membership) && -1616775607 * client.anInt3152 < 400) {
                                                var55 = Class116_Sub23_Sub15.method2702(var84, Class59_Sub1.aClass143_1831, 1914945274);
                                                if(null == var55) {
                                                   continue;
                                                }

                                                for(var36 = 0; var36 < client.anInt3152 * -1616775607; ++var36) {
                                                   var66 = client.aClass50Array3204[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var66.username, Class59_Sub1.aClass143_1831, 792628251);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(30, "", var84 + Class91.aString1214, 1520403270);
                                                      continue label3080;
                                                   }

                                                   if(var66.lastUsername != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var66.lastUsername, Class59_Sub1.aClass143_1831, 12178944);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(30, "", var84 + Class91.aString1214, -1150459998);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                for(var36 = 0; var36 < client.anInt3206 * 1820302153; ++var36) {
                                                   var64 = client.aClass24Array3207[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var64.currentName, Class59_Sub1.aClass143_1831, -698620231);
                                                   if(null != var68 && var68.equals(var55)) {
                                                      Class86.appendMessage(30, "", Class91.aString1219 + var84 + Class91.aString1220, -1835959094);
                                                      continue label3080;
                                                   }

                                                   if(null != var64.lastName) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var64.lastName, Class59_Sub1.aClass143_1831, 697105805);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(30, "", Class91.aString1219 + var84 + Class91.aString1220, -1049804126);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                if(Class116_Sub23_Sub15.method2702(Class79.ourPlayer.username, Class59_Sub1.aClass143_1831, -147512245).equals(var55)) {
                                                   Class86.appendMessage(30, "", Class91.aString1227, -970150862);
                                                } else {
                                                   client.rsaBuffer.startPacket(164, (byte) 18);
                                                    int l = Class22.calculateJGString(var84, -2112516558);
                                                   client.rsaBuffer.writeByte(l, 318625282);
                                                   client.rsaBuffer.writeJGString(var84, 143640670);
                                                }
                                                continue;
                                             }

                                             Class86.appendMessage(30, "", Class91.aString1213, 2040365807);
                                             continue;
                                          }

                                          if(3606 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class116_Sub23_Sub4.method2471(var84, -31738299);
                                             continue;
                                          }

                                          if(opcode == 3607) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84 == null) {
                                                continue;
                                             }

                                             if((1820302153 * client.anInt3206 < 100 || client.membership * -905152705 == 1) && client.anInt3206 * 1820302153 < 400) {
                                                var55 = Class116_Sub23_Sub15.method2702(var84, Class59_Sub1.aClass143_1831, -1316595303);
                                                if(var55 == null) {
                                                   continue;
                                                }

                                                for(var36 = 0; var36 < client.anInt3206 * 1820302153; ++var36) {
                                                   var64 = client.aClass24Array3207[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var64.currentName, Class59_Sub1.aClass143_1831, 1523642921);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(31, "", var84 + Class91.aString1216, -1460685229);
                                                      continue label3080;
                                                   }

                                                   if(var64.lastName != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var64.lastName, Class59_Sub1.aClass143_1831, -788113340);
                                                      if(null != var61 && var61.equals(var55)) {
                                                         Class86.appendMessage(31, "", var84 + Class91.aString1216, -1647256374);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                for(var36 = 0; var36 < -1616775607 * client.anInt3152; ++var36) {
                                                   var66 = client.aClass50Array3204[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var66.username, Class59_Sub1.aClass143_1831, -1312602252);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(31, "", Class91.aString1087 + var84 + Class91.aString1222, 246529057);
                                                      continue label3080;
                                                   }

                                                   if(var66.lastUsername != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var66.lastUsername, Class59_Sub1.aClass143_1831, 201847740);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(31, "", Class91.aString1087 + var84 + Class91.aString1222, 223218656);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                if(Class116_Sub23_Sub15.method2702(Class79.ourPlayer.username, Class59_Sub1.aClass143_1831, 665856882).equals(var55)) {
                                                   Class86.appendMessage(31, "", Class91.aString1218, 1293593513);
                                                } else {
                                                   client.rsaBuffer.startPacket(178, (byte) 55);
                                                   client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1727435161), -2009538308);
                                                   client.rsaBuffer.writeJGString(var84, 498965616);
                                                }
                                                continue;
                                             }

                                             Class86.appendMessage(31, "", Class91.aString1215, -378548456);
                                             continue;
                                          }

                                          if(3608 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84 == null) {
                                                continue;
                                             }

                                             var55 = Class116_Sub23_Sub15.method2702(var84, Class59_Sub1.aClass143_1831, 725144066);
                                             if(var55 == null) {
                                                continue;
                                             }

                                             var36 = 0;

                                             while(true) {
                                                if(var36 >= client.anInt3206 * 1820302153) {
                                                   continue label3080;
                                                }

                                                var64 = client.aClass24Array3207[var36];
                                                var68 = var64.currentName;
                                                var61 = Class116_Sub23_Sub15.method2702(var68, Class59_Sub1.aClass143_1831, -515427858);
                                                if(Class116_Sub10.method1960(var84, var55, var68, var61, -2035628589)) {
                                                   client.anInt3206 -= -334739719;

                                                   for(var49 = var36; var49 < 1820302153 * client.anInt3206; ++var49) {
                                                      client.aClass24Array3207[var49] = client.aClass24Array3207[var49 + 1];
                                                   }

                                                   client.anInt3068 = client.anInt3118 * -712636309;
                                                   client.rsaBuffer.startPacket(159, (byte) 52);
                                                   client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1938849605), 754187704);
                                                   client.rsaBuffer.writeJGString(var84, 1922790380);
                                                   continue label3080;
                                                }

                                                ++var36;
                                             }
                                          }

                                          if(3609 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Speach[] var70 = new Speach[]{Speach.OFFLINE, Speach.PLAYER, Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
                                             Speach[] var57 = var70;

                                             for(var46 = 0; var46 < var57.length; ++var46) {
                                                Speach var71 = var57[var46];
                                                if(-1 != var71.iconId * -2127218069 && var84.startsWith(Class51.method780(var71.iconId * -2127218069, (short)-2324))) {
                                                   var84 = var84.substring(6 + Integer.toString(-2127218069 * var71.iconId).length());
                                                   break;
                                                }
                                             }

                                             Class3.intStack[intStackCount++] = Class116_Sub5.method1930(var84, false, -684129395)?1:0;
                                             continue;
                                          }

                                          String var60;
                                          String[] var92;
                                          if(3611 == opcode) {
                                             if(client.currentCCName != null) {
                                                var92 = Class3.aStringArray32;
                                                var17 = var7++;
                                                var60 = client.currentCCName;
                                                var68 = Class116_Sub23_Sub12.method2655(Class60.method902(var60, 1198551174));
                                                if(null == var68) {
                                                   var68 = "";
                                                }

                                                var92[var17] = var68;
                                             } else {
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }

                                          if(opcode == 3612) {
                                             if(null != client.currentCCName) {
                                                Class3.intStack[intStackCount++] = -1304125287 * Class98.ccPlayerCount;
                                             } else {
                                                Class3.intStack[intStackCount++] = 0;
                                             }
                                             continue;
                                          }

                                          if(3613 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(null != client.currentCCName && var34 < -1304125287 * Class98.ccPlayerCount) {
                                                Class3.aStringArray32[var7++] = GameInterface.ourCurrentCC[var34].username;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3614 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(null != client.currentCCName && var34 < -1304125287 * Class98.ccPlayerCount) {
                                                Class3.intStack[intStackCount++] = GameInterface.ourCurrentCC[var34].worldId * 1300426367;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = 0;
                                             continue;
                                          }

                                          if(opcode == 3615) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(client.currentCCName != null && var34 < -1304125287 * Class98.ccPlayerCount) {
                                                Class3.intStack[intStackCount++] = GameInterface.ourCurrentCC[var34].clanRank;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = 0;
                                             continue;
                                          }

                                          if(3616 == opcode) {
                                             Class3.intStack[intStackCount++] = Class53.currentClanKickRank;
                                             continue;
                                          }

                                          if(opcode == 3617) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(GameInterface.ourCurrentCC != null) {
                                                client.rsaBuffer.startPacket(166, (byte) 34);
                                                client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1598119173), -876197300);
                                                client.rsaBuffer.writeJGString(var84, -610309883);
                                             }
                                             continue;
                                          }

                                          if(opcode == 3618) {
                                             Class3.intStack[intStackCount++] = client.ourccrank;
                                             continue;
                                          }

                                          if(opcode == 3619) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(!var84.equals("")) {
                                                client.rsaBuffer.startPacket(233, (byte) 80);
                                                client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -846704257), 437629603);
                                                client.rsaBuffer.writeJGString(var84, -905448115);
                                             }
                                             continue;
                                          }

                                          if(opcode == 3620) {
                                             client.rsaBuffer.startPacket(233, (byte) 47);
                                             client.rsaBuffer.writeByte(0, -1926679873);
                                             continue;
                                          }

                                          if(opcode == 3621) {
                                             if(client.anInt3203 * -923448785 == 0) {
                                                Class3.intStack[intStackCount++] = -1;
                                             } else {
                                                Class3.intStack[intStackCount++] = client.anInt3206 * 1820302153;
                                             }
                                             continue;
                                          }

                                          if(3622 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(client.anInt3203 * -923448785 != 0 && var34 < client.anInt3206 * 1820302153) {
                                                Class3.aStringArray32[var7++] = client.aClass24Array3207[var34].currentName;
                                                Class3.aStringArray32[var7++] = client.aClass24Array3207[var34].lastName;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3623 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84.startsWith(Class51.method780(0, (short)-6393)) || var84.startsWith(Class51.method780(1, (short)-27072))) {
                                                var84 = var84.substring(7);
                                             }

                                             Class3.intStack[intStackCount++] = World.method568(var84, -2083371857)?1:0;
                                             continue;
                                          }

                                          if(opcode == 3624) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             if(null != GameInterface.ourCurrentCC && var34 < -1304125287 * Class98.ccPlayerCount && GameInterface.ourCurrentCC[var34].username.equalsIgnoreCase(Class79.ourPlayer.username)) {
                                                Class3.intStack[intStackCount++] = 1;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = 0;
                                             continue;
                                          }

                                          if(3625 == opcode) {
                                             if(client.currentClanOwner != null) {
                                                var92 = Class3.aStringArray32;
                                                var17 = var7++;
                                                var60 = client.currentClanOwner;
                                                var68 = Class116_Sub23_Sub12.method2655(Class60.method902(var60, 626333139));
                                                if(null == var68) {
                                                   var68 = "";
                                                }

                                                var92[var17] = var68;
                                             } else {
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }
                                       } else if(opcode < 4000) {
                                          if(3903 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = client.aClass135Array3211[var34].method1722(1836099859);
                                             continue;
                                          }

                                          if(opcode == 3904) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = client.aClass135Array3211[var34].anInt1607 * 718739463;
                                             continue;
                                          }

                                          if(3905 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = client.aClass135Array3211[var34].anInt1608 * 861377417;
                                             continue;
                                          }

                                          if(opcode == 3906) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = -794800437 * client.aClass135Array3211[var34].anInt1606;
                                             continue;
                                          }

                                          if(3907 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = -338006479 * client.aClass135Array3211[var34].anInt1611;
                                             continue;
                                          }

                                          if(3908 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = 1791988527 * client.aClass135Array3211[var34].anInt1610;
                                             continue;
                                          }

                                          if(3910 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = client.aClass135Array3211[var34].method1734(873699554);
                                             Class3.intStack[intStackCount++] = var17 == 0?1:0;
                                             continue;
                                          }

                                          if(opcode == 3911) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = client.aClass135Array3211[var34].method1734(-676855004);
                                             Class3.intStack[intStackCount++] = var17 == 2?1:0;
                                             continue;
                                          }

                                          if(3912 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = client.aClass135Array3211[var34].method1734(1848281085);
                                             Class3.intStack[intStackCount++] = 5 == var17?1:0;
                                             continue;
                                          }

                                          if(3913 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = client.aClass135Array3211[var34].method1734(-548651068);
                                             Class3.intStack[intStackCount++] = var17 == 1?1:0;
                                             continue;
                                          }

                                          boolean var98;
                                          if(opcode == 3914) {
                                             --intStackCount;
                                             var98 = Class3.intStack[intStackCount] == 1;
                                             if(null != Class81.aClass132_928) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1593, var98, 623654685);
                                             }
                                             continue;
                                          }

                                          if(opcode == 3915) {
                                             --intStackCount;
                                             var98 = Class3.intStack[intStackCount] == 1;
                                             if(null != Class81.aClass132_928) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1592, var98, -16447163);
                                             }
                                             continue;
                                          }

                                          if(opcode == 3916) {
                                             intStackCount -= 2;
                                             var98 = Class3.intStack[intStackCount] == 1;
                                             var56 = Class3.intStack[1 + intStackCount] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(new Class45(var56), var98, 1936102160);
                                             }
                                             continue;
                                          }

                                          if(opcode == 3917) {
                                             --intStackCount;
                                             var98 = Class3.intStack[intStackCount] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1591, var98, 607130422);
                                             }
                                             continue;
                                          }

                                          if(3918 == opcode) {
                                             --intStackCount;
                                             var98 = Class3.intStack[intStackCount] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1595, var98, 1813291901);
                                             }
                                             continue;
                                          }

                                          if(3919 == opcode) {
                                             Class3.intStack[intStackCount++] = Class81.aClass132_928 == null?0:Class81.aClass132_928.aList1594.size();
                                             continue;
                                          }

                                          Class133 var76;
                                          if(opcode == 3920) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.intStack[intStackCount++] = var76.anInt1601 * 752101567;
                                             continue;
                                          }

                                          if(3921 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.aStringArray32[var7++] = var76.method1711(-1146535837);
                                             continue;
                                          }

                                          if(opcode == 3922) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.aStringArray32[var7++] = var76.method1710(736981672);
                                             continue;
                                          }

                                          if(opcode == 3923) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             long var27 = Class116_Sub5.generateHash(-1458935439) - 8991659602621826001L * HuffManEncryption.aLong687 - -3596478625201456337L * var76.aLong1599;
                                             var50 = (int)(var27 / 3600000L);
                                             var21 = (int)((var27 - (long)(var50 * 3600000)) / 60000L);
                                             var49 = (int)((var27 - (long)(3600000 * var50) - (long)(var21 * '\uea60')) / 1000L);
                                             String var59 = var50 + ":" + var21 / 10 + var21 % 10 + ":" + var49 / 10 + var49 % 10;
                                             Class3.aStringArray32[var7++] = var59;
                                             continue;
                                          }

                                          if(3924 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.intStack[intStackCount++] = var76.aClass135_1598.anInt1606 * -794800437;
                                             continue;
                                          }

                                          if(3925 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.intStack[intStackCount++] = var76.aClass135_1598.anInt1608 * 861377417;
                                             continue;
                                          }

                                          if(opcode == 3926) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.intStack[intStackCount++] = 718739463 * var76.aClass135_1598.anInt1607;
                                             continue;
                                          }
                                       } else if(opcode < 4100) {
                                          if(opcode == 4000) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 + var17;
                                             continue;
                                          }

                                          if(opcode == 4001) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 - var17;
                                             continue;
                                          }

                                          if(opcode == 4002) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 * var17;
                                             continue;
                                          }

                                          if(opcode == 4003) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[1 + intStackCount];
                                             Class3.intStack[intStackCount++] = var34 / var17;
                                             continue;
                                          }

                                          if(4004 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = (int)(Math.random() * (double)var34);
                                             continue;
                                          }

                                          if(4005 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = (int)(Math.random() * (double)(var34 + 1));
                                             continue;
                                          }

                                          if(4006 == opcode) {
                                             intStackCount -= 5;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             var36 = Class3.intStack[2 + intStackCount];
                                             var46 = Class3.intStack[3 + intStackCount];
                                             var50 = Class3.intStack[4 + intStackCount];
                                             Class3.intStack[intStackCount++] = (var50 - var36) * (var17 - var34) / (var46 - var36) + var34;
                                             continue;
                                          }

                                          if(4007 == opcode) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 * var17 / 100 + var34;
                                             continue;
                                          }

                                          if(4008 == opcode) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 | 1 << var17;
                                             continue;
                                          }

                                          if(opcode == 4009) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 & -1 - (1 << var17);
                                             continue;
                                          }

                                          if(opcode == 4010) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = 0 != (var34 & 1 << var17)?1:0;
                                             continue;
                                          }

                                          if(opcode == 4011) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 % var17;
                                             continue;
                                          }

                                          if(opcode == 4012) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             if(var34 == 0) {
                                                Class3.intStack[intStackCount++] = 0;
                                             } else {
                                                Class3.intStack[intStackCount++] = (int)Math.pow((double)var34, (double)var17);
                                             }
                                             continue;
                                          }

                                          if(4013 == opcode) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[1 + intStackCount];
                                             if(0 == var34) {
                                                Class3.intStack[intStackCount++] = 0;
                                             } else if(var17 == 0) {
                                                Class3.intStack[intStackCount++] = Integer.MAX_VALUE;
                                             } else {
                                                Class3.intStack[intStackCount++] = (int)Math.pow((double)var34, 1.0D / (double)var17);
                                             }
                                             continue;
                                          }

                                          if(opcode == 4014) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 & var17;
                                             continue;
                                          }

                                          if(opcode == 4015) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class3.intStack[intStackCount++] = var34 | var17;
                                             continue;
                                          }
                                       } else if(opcode < 4200) {
                                          if(4100 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             Class3.aStringArray32[var7++] = var84 + var17;
                                             continue;
                                          }

                                          if(4101 == opcode) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             Class3.aStringArray32[var7++] = var84 + var55;
                                             continue;
                                          }

                                          if(opcode == 4102) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             var74 = Class3.aStringArray32;
                                             var46 = var7++;
                                             if(var17 < 0) {
                                                var61 = Integer.toString(var17);
                                             } else {
                                                var61 = Class67.method974(var17, 10, true, (byte)-90);
                                             }

                                             var74[var46] = var84 + var61;
                                             continue;
                                          }

                                          if(opcode == 4103) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class3.aStringArray32[var7++] = var84.toLowerCase();
                                             continue;
                                          }

                                          if(4104 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             long var29 = ((long)var34 + 11745L) * 86400000L;
                                             Class3.aCalendar37.setTime(new Date(var29));
                                             var46 = Class3.aCalendar37.get(5);
                                             var50 = Class3.aCalendar37.get(2);
                                             var21 = Class3.aCalendar37.get(1);
                                             Class3.aStringArray32[var7++] = var46 + "-" + Class3.aStringArray38[var50] + "-" + var21;
                                             continue;
                                          }

                                          if(opcode == 4105) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             if(Class79.ourPlayer.aClass108_2881 != null && Class79.ourPlayer.aClass108_2881.aBool1464) {
                                                Class3.aStringArray32[var7++] = var55;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = var84;
                                             continue;
                                          }

                                          if(4106 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.aStringArray32[var7++] = Integer.toString(var34);
                                             continue;
                                          }

                                          if(4107 == opcode) {
                                             var7 -= 2;
                                             Class3.intStack[intStackCount++] = Packet.method2018(Friend.method1838(Class3.aStringArray32[var7], Class3.aStringArray32[var7 + 1], -1025678859 * client.anInt2938, (byte) 1), (byte) 45);
                                             continue;
                                          }

                                          byte[] var72;
                                          Class116_Sub23_Sub19_Sub4_Sub1 var80;
                                          if(opcode == 4108) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             intStackCount -= 2;
                                             var17 = Class3.intStack[intStackCount];
                                             var36 = Class3.intStack[intStackCount + 1];
                                             var72 = Class2.aCacheIndex_12.getFiles(var36, 0, -900759660);
                                             var80 = new Class116_Sub23_Sub19_Sub4_Sub1(var72);
                                             Class3.intStack[intStackCount++] = var80.method3458(var84, var17);
                                             continue;
                                          }

                                          if(opcode == 4109) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             intStackCount -= 2;
                                             var17 = Class3.intStack[intStackCount];
                                             var36 = Class3.intStack[intStackCount + 1];
                                             var72 = Class2.aCacheIndex_12.getFiles(var36, 0, -885565136);
                                             var80 = new Class116_Sub23_Sub19_Sub4_Sub1(var72);
                                             Class3.intStack[intStackCount++] = var80.method3457(var84, var17);
                                             continue;
                                          }

                                          if(opcode == 4110) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             --intStackCount;
                                             if(Class3.intStack[intStackCount] == 1) {
                                                Class3.aStringArray32[var7++] = var84;
                                             } else {
                                                Class3.aStringArray32[var7++] = var55;
                                             }
                                             continue;
                                          }

                                          if(opcode == 4111) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class3.aStringArray32[var7++] = TextDrawingArea.method3459(var84);
                                             continue;
                                          }

                                          if(4112 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             Class3.aStringArray32[var7++] = var84 + (char)var17;
                                             continue;
                                          }

                                          char var79;
                                          if(opcode == 4113) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var90 = Class3.intStack;
                                             var36 = intStackCount++;
                                             var79 = (char)var34;
                                             if(var79 >= 32 && var79 <= 126) {
                                                var42 = true;
                                             } else if(var79 >= 160 && var79 <= 255) {
                                                var42 = true;
                                             } else if(var79 != 8364 && var79 != 338 && var79 != 8212 && 339 != var79 && var79 != 376) {
                                                var42 = false;
                                             } else {
                                                var42 = true;
                                             }

                                             var90[var36] = var42?1:0;
                                             continue;
                                          }

                                          if(opcode == 4114) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var90 = Class3.intStack;
                                             var36 = intStackCount++;
                                             var79 = (char)var34;
                                             var42 = var79 >= 48 && var79 <= 57 || var79 >= 65 && var79 <= 90 || var79 >= 97 && var79 <= 122;
                                             var90[var36] = var42?1:0;
                                             continue;
                                          }

                                          if(4115 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = Tile.method1986((char) var34, -51164715)?1:0;
                                             continue;
                                          }

                                          if(4116 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = BasicTimer.method2217((char) var34, 1968901295)?1:0;
                                             continue;
                                          }

                                          if(opcode == 4117) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84 != null) {
                                                Class3.intStack[intStackCount++] = var84.length();
                                             } else {
                                                Class3.intStack[intStackCount++] = 0;
                                             }
                                             continue;
                                          }

                                          if(opcode == 4118) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             intStackCount -= 2;
                                             var17 = Class3.intStack[intStackCount];
                                             var36 = Class3.intStack[1 + intStackCount];
                                             Class3.aStringArray32[var7++] = var84.substring(var17, var36);
                                             continue;
                                          }

                                          if(4119 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             StringBuilder var89 = new StringBuilder(var84.length());
                                             var37 = false;

                                             for(var46 = 0; var46 < var84.length(); ++var46) {
                                                var79 = var84.charAt(var46);
                                                if(var79 == 60) {
                                                   var37 = true;
                                                } else if(62 == var79) {
                                                   var37 = false;
                                                } else if(!var37) {
                                                   var89.append(var79);
                                                }
                                             }

                                             Class3.aStringArray32[var7++] = var89.toString();
                                             continue;
                                          }

                                          if(opcode == 4120) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = var84.indexOf(var17);
                                             continue;
                                          }

                                          if(4121 == opcode) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             --intStackCount;
                                             var36 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = var84.indexOf(var55, var36);
                                             continue;
                                          }
                                       } else if(opcode < 4300) {
                                          if(opcode == 4200) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.aStringArray32[var7++] = RelationList.method778(var34, (byte) 70).aString2361;
                                             continue;
                                          }

                                          Class116_Sub23_Sub11 var75;
                                          if(opcode == 4201) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[1 + intStackCount];
                                             var75 = RelationList.method778(var34, (byte) 70);
                                             if(var17 >= 1 && var17 <= 5 && var75.aStringArray2391[var17 - 1] != null) {
                                                Class3.aStringArray32[var7++] = var75.aStringArray2391[var17 - 1];
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(4202 == opcode) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             var75 = RelationList.method778(var34, (byte) 70);
                                             if(var17 >= 1 && var17 <= 5 && null != var75.aStringArray2387[var17 - 1]) {
                                                Class3.aStringArray32[var7++] = var75.aStringArray2387[var17 - 1];
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(4203 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = RelationList.method778(var34, (byte) 70).anInt2365 * 60742695;
                                             continue;
                                          }

                                          if(4204 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = RelationList.method778(var34, (byte) 70).anInt2372 * 1303294175 == 1?1:0;
                                             continue;
                                          }

                                          Class116_Sub23_Sub11 var93;
                                          if(opcode == 4205) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var93 = RelationList.method778(var34, (byte) 70);
                                             if(-1 == -507524473 * var93.anInt2392 && var93.anInt2399 * -322771797 >= 0) {
                                                Class3.intStack[intStackCount++] = -322771797 * var93.anInt2399;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = var34;
                                             continue;
                                          }

                                          if(opcode == 4206) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             var93 = RelationList.method778(var34, (byte) 70);
                                             if(-507524473 * var93.anInt2392 >= 0 && -322771797 * var93.anInt2399 >= 0) {
                                                Class3.intStack[intStackCount++] = var93.anInt2399 * -322771797;
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = var34;
                                             continue;
                                          }

                                          if(4207 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = RelationList.method778(var34, (byte) 70).aBool2374?1:0;
                                             continue;
                                          }

                                          if(4210 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             var42 = var17 == 1;
                                             var38 = var84.toLowerCase();
                                             short[] var81 = new short[16];
                                             var21 = 0;
                                             var49 = 0;

                                             while(true) {
                                                if(var49 >= Class14.anInt216 * -1396045331) {
                                                   RSInputStream.aShortArray859 = var81;
                                                   Class29.anInt411 = 0;
                                                   Class116_Sub23_Sub16_Sub3.anInt2642 = var21 * -980225491;
                                                   String[] var65 = new String[-845664859 * Class116_Sub23_Sub16_Sub3.anInt2642];

                                                   for(var23 = 0; var23 < Class116_Sub23_Sub16_Sub3.anInt2642 * -845664859; ++var23) {
                                                      var65[var23] = RelationList.method778(var81[var23], (byte) 70).aString2361;
                                                   }

                                                   Class76.method1079(var65, RSInputStream.aShortArray859, 796115173);
                                                   break;
                                                }

                                                Class116_Sub23_Sub11 var62 = RelationList.method778(var49, (byte) 70);
                                                if((!var42 || var62.aBool2380) && -1 == -507524473 * var62.anInt2392 && var62.aString2361.toLowerCase().indexOf(var38) != -1) {
                                                   if(var21 >= 250) {
                                                      Class116_Sub23_Sub16_Sub3.anInt2642 = 980225491;
                                                      RSInputStream.aShortArray859 = null;
                                                      break;
                                                   }

                                                   if(var21 >= var81.length) {
                                                      short[] var58 = new short[2 * var81.length];

                                                      for(var63 = 0; var63 < var21; ++var63) {
                                                         var58[var63] = var81[var63];
                                                      }

                                                      var81 = var58;
                                                   }

                                                   var81[var21++] = (short)var49;
                                                }

                                                ++var49;
                                             }

                                             Class3.intStack[intStackCount++] = -845664859 * Class116_Sub23_Sub16_Sub3.anInt2642;
                                             continue;
                                          }

                                          if(4211 == opcode) {
                                             if(RSInputStream.aShortArray859 != null && Class29.anInt411 * -2003486467 < Class116_Sub23_Sub16_Sub3.anInt2642 * -845664859) {
                                                Class3.intStack[intStackCount++] = RSInputStream.aShortArray859[(Class29.anInt411 += -1453677483) * -2003486467 - 1] & '\uffff';
                                                continue;
                                             }

                                             Class3.intStack[intStackCount++] = -1;
                                             continue;
                                          }

                                          if(4212 == opcode) {
                                             Class29.anInt411 = 0;
                                             continue;
                                          }
                                       } else if(opcode < 5100) {
                                          if(5000 == opcode) {
                                             Class3.intStack[intStackCount++] = client.anInt3064 * -400704361;
                                             continue;
                                          }

                                          if(5001 == opcode) {
                                             intStackCount -= 3;
                                             client.anInt3064 = -677280985 * Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class62[] var83 = Class51.method783(94483834);
                                             var46 = 0;

                                             Class62 var101;
                                             while(true) {
                                                if(var46 >= var83.length) {
                                                   var101 = null;
                                                   break;
                                                }

                                                Class62 var87 = var83[var46];
                                                if(var17 == -1916029001 * var87.anInt799) {
                                                   var101 = var87;
                                                   break;
                                                }

                                                ++var46;
                                             }

                                             Class33.aClass62_449 = var101;
                                             if(null == Class33.aClass62_449) {
                                                Class33.aClass62_449 = Class62.aClass62_797;
                                             }

                                             client.anInt3150 = -1946178403 * Class3.intStack[2 + intStackCount];
                                             client.rsaBuffer.startPacket(44, (byte) 37);
                                             client.rsaBuffer.writeByte(-400704361 * client.anInt3064, -1727845501);
                                             client.rsaBuffer.writeByte(Class33.aClass62_449.anInt799 * -1916029001, -884411018);
                                             client.rsaBuffer.writeByte(-1975764555 * client.anInt3150, -314440789);
                                             continue;
                                          }

                                          if(5002 == opcode) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             intStackCount -= 2;
                                             var17 = Class3.intStack[intStackCount];
                                             var36 = Class3.intStack[intStackCount + 1];
                                             client.rsaBuffer.startPacket(71, (byte) 79);
                                             client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1810258257) + 2, -1981958345);
                                             client.rsaBuffer.writeJGString(var84, 1816099369);
                                             client.rsaBuffer.writeByte(var17 - 1, -1201088172);
                                             client.rsaBuffer.writeByte(var36, -215749679);
                                             continue;
                                          }

                                          if(5003 == opcode) {
                                             intStackCount -= 2;
                                             var34 = Class3.intStack[intStackCount];
                                             var17 = Class3.intStack[intStackCount + 1];
                                             Class5 var88 = (Class5)Class37.aMap498.get(Integer.valueOf(var34));
                                             ChatMessage var82 = var88.method57(var17, 1427361631);
                                             if(var82 != null) {
                                                Class3.intStack[intStackCount++] = -1699577047 * var82.anInt2342;
                                                Class3.intStack[intStackCount++] = var82.anInt2343 * -1486341595;
                                                Class3.aStringArray32[var7++] = null != var82.aString2350?var82.aString2350:"";
                                                Class3.aStringArray32[var7++] = null != var82.aString2346?var82.aString2346:"";
                                                Class3.aStringArray32[var7++] = var82.aString2347 != null?var82.aString2347:"";
                                             } else {
                                                Class3.intStack[intStackCount++] = -1;
                                                Class3.intStack[intStackCount++] = 0;
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }

                                          if(5004 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             ChatMessage var96 = Class85.method1137(var34, 1929517952);
                                             if(null != var96) {
                                                Class3.intStack[intStackCount++] = var96.anInt2344 * 555619737;
                                                Class3.intStack[intStackCount++] = var96.anInt2343 * -1486341595;
                                                Class3.aStringArray32[var7++] = null != var96.aString2350?var96.aString2350:"";
                                                Class3.aStringArray32[var7++] = var96.aString2346 != null?var96.aString2346:"";
                                                Class3.aStringArray32[var7++] = var96.aString2347 != null?var96.aString2347:"";
                                             } else {
                                                Class3.intStack[intStackCount++] = -1;
                                                Class3.intStack[intStackCount++] = 0;
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }

                                          if(5005 == opcode) {
                                             if(null == Class33.aClass62_449) {
                                                Class3.intStack[intStackCount++] = -1;
                                             } else {
                                                Class3.intStack[intStackCount++] = Class33.aClass62_449.anInt799 * -1916029001;
                                             }
                                             continue;
                                          }

                                          if(opcode == 5008) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --intStackCount;
                                             var17 = Class3.intStack[intStackCount];
                                             var38 = var84.toLowerCase();
                                             byte var78 = 0;
                                             if(var38.startsWith(Class91.aString1223)) {
                                                var78 = 0;
                                                var84 = var84.substring(Class91.aString1223.length());
                                             } else if(var38.startsWith(Class91.aString1302)) {
                                                var78 = 1;
                                                var84 = var84.substring(Class91.aString1302.length());
                                             } else if(var38.startsWith(Class91.aString1206)) {
                                                var78 = 2;
                                                var84 = var84.substring(Class91.aString1206.length());
                                             } else if(var38.startsWith(Class91.aString1229)) {
                                                var78 = 3;
                                                var84 = var84.substring(Class91.aString1229.length());
                                             } else if(var38.startsWith(Class91.aString1055)) {
                                                var78 = 4;
                                                var84 = var84.substring(Class91.aString1055.length());
                                             } else if(var38.startsWith(Class91.aString1235)) {
                                                var78 = 5;
                                                var84 = var84.substring(Class91.aString1235.length());
                                             } else if(var38.startsWith(Class91.aString1246)) {
                                                var78 = 6;
                                                var84 = var84.substring(Class91.aString1246.length());
                                             } else if(var38.startsWith(Class91.aString1237)) {
                                                var78 = 7;
                                                var84 = var84.substring(Class91.aString1237.length());
                                             } else if(var38.startsWith(Class91.aString1106)) {
                                                var78 = 8;
                                                var84 = var84.substring(Class91.aString1106.length());
                                             } else if(var38.startsWith(Class91.aString1241)) {
                                                var78 = 9;
                                                var84 = var84.substring(Class91.aString1241.length());
                                             } else if(var38.startsWith(Class91.aString1243)) {
                                                var78 = 10;
                                                var84 = var84.substring(Class91.aString1243.length());
                                             } else if(var38.startsWith(Class91.aString1245)) {
                                                var78 = 11;
                                                var84 = var84.substring(Class91.aString1245.length());
                                             } else if(-1025678859 * client.anInt2938 != 0) {
                                                if(var38.startsWith(Class91.aString1224)) {
                                                   var78 = 0;
                                                   var84 = var84.substring(Class91.aString1224.length());
                                                } else if(var38.startsWith(Class91.aString1074)) {
                                                   var78 = 1;
                                                   var84 = var84.substring(Class91.aString1074.length());
                                                } else if(var38.startsWith(Class91.aString1228)) {
                                                   var78 = 2;
                                                   var84 = var84.substring(Class91.aString1228.length());
                                                } else if(var38.startsWith(Class91.aString1230)) {
                                                   var78 = 3;
                                                   var84 = var84.substring(Class91.aString1230.length());
                                                } else if(var38.startsWith(Class91.aString1232)) {
                                                   var78 = 4;
                                                   var84 = var84.substring(Class91.aString1232.length());
                                                } else if(var38.startsWith(Class91.aString1165)) {
                                                   var78 = 5;
                                                   var84 = var84.substring(Class91.aString1165.length());
                                                } else if(var38.startsWith(Class91.aString1236)) {
                                                   var78 = 6;
                                                   var84 = var84.substring(Class91.aString1236.length());
                                                } else if(var38.startsWith(Class91.aString1238)) {
                                                   var78 = 7;
                                                   var84 = var84.substring(Class91.aString1238.length());
                                                } else if(var38.startsWith(Class91.aString1240)) {
                                                   var78 = 8;
                                                   var84 = var84.substring(Class91.aString1240.length());
                                                } else if(var38.startsWith(Class91.aString1242)) {
                                                   var78 = 9;
                                                   var84 = var84.substring(Class91.aString1242.length());
                                                } else if(var38.startsWith(Class91.aString1054)) {
                                                   var78 = 10;
                                                   var84 = var84.substring(Class91.aString1054.length());
                                                } else if(var38.startsWith(Class91.aString1247)) {
                                                   var78 = 11;
                                                   var84 = var84.substring(Class91.aString1247.length());
                                                }
                                             }

                                             var38 = var84.toLowerCase();
                                             byte var85 = 0;
                                             if(var38.startsWith(Class91.aString1300)) {
                                                var85 = 1;
                                                var84 = var84.substring(Class91.aString1300.length());
                                             } else if(var38.startsWith(Class91.aString1298)) {
                                                var85 = 2;
                                                var84 = var84.substring(Class91.aString1298.length());
                                             } else if(var38.startsWith(Class91.aString1251)) {
                                                var85 = 3;
                                                var84 = var84.substring(Class91.aString1251.length());
                                             } else if(var38.startsWith(Class91.aString1253)) {
                                                var85 = 4;
                                                var84 = var84.substring(Class91.aString1253.length());
                                             } else if(var38.startsWith(Class91.aString1304)) {
                                                var85 = 5;
                                                var84 = var84.substring(Class91.aString1304.length());
                                             } else if(-1025678859 * client.anInt2938 != 0) {
                                                if(var38.startsWith(Class91.aString1248)) {
                                                   var85 = 1;
                                                   var84 = var84.substring(Class91.aString1248.length());
                                                } else if(var38.startsWith(Class91.aString1250)) {
                                                   var85 = 2;
                                                   var84 = var84.substring(Class91.aString1250.length());
                                                } else if(var38.startsWith(Class91.aString1252)) {
                                                   var85 = 3;
                                                   var84 = var84.substring(Class91.aString1252.length());
                                                } else if(var38.startsWith(Class91.aString1254)) {
                                                   var85 = 4;
                                                   var84 = var84.substring(Class91.aString1254.length());
                                                } else if(var38.startsWith(Class91.aString1146)) {
                                                   var85 = 5;
                                                   var84 = var84.substring(Class91.aString1146.length());
                                                }
                                             }

                                             client.rsaBuffer.startPacket(87, (byte) 99);
                                             client.rsaBuffer.writeByte(0, -866073522);
                                             var21 = client.rsaBuffer.position * 314639891;
                                             client.rsaBuffer.writeByte(var17, -2129028594);
                                             client.rsaBuffer.writeByte(var78, -362460096);
                                             client.rsaBuffer.writeByte(var85, -1382968729);
                                             client.method3953(client.rsaBuffer, var84, -468604434);
                                             client.rsaBuffer.method2152(client.rsaBuffer.position * 314639891 - var21, 495913037);
                                             continue;
                                          }

                                          if(opcode == 5009) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[var7 + 1];
                                             client.rsaBuffer.startPacket(248, (byte) 89);
                                             client.rsaBuffer.writeShort(0, -1637305146);
                                             var36 = 314639891 * client.rsaBuffer.position;
                                             client.rsaBuffer.writeJGString(var84, 516581426);
                                             PacketBuilder var77 = client.rsaBuffer;
                                             var50 = 314639891 * var77.position;
                                             byte[] var69 = Class64.method938(var55, (byte)-100);
                                             var77.writeSmart(var69.length, 720272980);
                                             var77.position += client.aClass52_1621.method789(var69, 0, var69.length, var77.payload, var77.position * 314639891, -2144817348) * -184175589;
                                             client.rsaBuffer.method2000(314639891 * client.rsaBuffer.position - var36, (byte)63);
                                             continue;
                                          }

                                          if(5015 == opcode) {
                                             if(null != Class79.ourPlayer && Class79.ourPlayer.username != null) {
                                                var84 = Class79.ourPlayer.username;
                                             } else {
                                                var84 = "";
                                             }

                                             Class3.aStringArray32[var7++] = var84;
                                             continue;
                                          }

                                          if(5016 == opcode) {
                                             Class3.intStack[intStackCount++] = -1975764555 * client.anInt3150;
                                             continue;
                                          }

                                          if(opcode == 5017) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = Class116_Sub23_Sub20.method2979(var34, 44112760);
                                             continue;
                                          }

                                          if(5018 == opcode) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = Class103.method1454(var34, (byte)44);
                                             continue;
                                          }

                                          if(opcode == 5019) {
                                             --intStackCount;
                                             var34 = Class3.intStack[intStackCount];
                                             Class3.intStack[intStackCount++] = Class25.method533(var34, -1706974434);
                                             continue;
                                          }

                                          if(opcode == 5020) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84.equalsIgnoreCase("toggleroof")) {
                                                Class116_Sub5.aClass29_1727.aBool403 = !Class116_Sub5.aClass29_1727.aBool403;
                                                Class86.method1167((byte)95);
                                                if(Class116_Sub5.aClass29_1727.aBool403) {
                                                   Class86.appendMessage(99, "", "Roofs are now all hidden", -363223263);
                                                } else {
                                                   Class86.appendMessage(99, "", "Roofs will only be removed selectively", -1499975796);
                                                }
                                             }

                                             if(var84.equalsIgnoreCase("displayfps")) {
                                                client.aBool2949 = !client.aBool2949;
                                             }

                                             if(client.playerRights * 1520983779 >= 2) {
                                                if(var84.equalsIgnoreCase("fpson")) {
                                                   client.aBool2949 = true;
                                                }

                                                if(var84.equalsIgnoreCase("fpsoff")) {
                                                   client.aBool2949 = false;
                                                }

                                                if(var84.equalsIgnoreCase("gc")) {
                                                   System.gc();
                                                }

                                                if(var84.equalsIgnoreCase("clientdrop")) {
                                                   Class93.method1265(723284788);
                                                }

                                                if(var84.equalsIgnoreCase("errortest") && 1082541889 * client.anInt3020 == 2) {
                                                   throw new RuntimeException();
                                                }
                                             }

                                             client.rsaBuffer.startPacket(78, (byte) 24);
                                             client.rsaBuffer.writeByte(var84.length() + 1, 78772575);
                                             client.rsaBuffer.writeJGString(var84, 1297462954);
                                             continue;
                                          }

                                          if(5021 == opcode) {
                                             --var7;
                                             client.aString2985 = Class3.aStringArray32[var7].toLowerCase().trim();
                                             continue;
                                          }

                                          if(5022 == opcode) {
                                             Class3.aStringArray32[var7++] = client.aString2985;
                                             continue;
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 if(opcode >= 2000) {
                                    opcode -= 1000;
                                    --intStackCount;
                                    inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                                 } else {
                                    inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 }

                                 if(opcode == 1927) {
                                    if(Class3.anInt39 * -1024934675 >= 10) {
                                       throw new RuntimeException();
                                    }

                                    if(null == inter.anObjectArray2032) {
                                       return;
                                    }

                                    Class116_Sub6 var51 = new Class116_Sub6();
                                    var51.aClass116_Sub15_1736 = inter;
                                    var51.anObjectArray1737 = inter.anObjectArray2032;
                                    var51.anInt1744 = Class3.anInt39 * 189385479 + 1898945859;
                                    client.aClass117_3132.addLast(var0);
                                    continue;
                                 }
                              }
                           } else {
                              if(opcode >= 2000) {
                                 opcode -= 1000;
                                 --intStackCount;
                                 inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                              } else {
                                 inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                              }

                              if(opcode == 1300) {
                                 --intStackCount;
                                 var17 = Class3.intStack[intStackCount] - 1;
                                 if(var17 >= 0 && var17 <= 9) {
                                    --var7;
                                    inter.method2257(var17, Class3.aStringArray32[var7], -20681167);
                                    continue;
                                 }

                                 --var7;
                                 continue;
                              }

                              if(opcode == 1301) {
                                 intStackCount -= 2;
                                 var17 = Class3.intStack[intStackCount];
                                 var36 = Class3.intStack[1 + intStackCount];
                                 inter.aClass116_Sub15_1998 = AbstractRSDrawing.method339(var17, var36, 446603275);
                                 continue;
                              }

                              if(opcode == 1302) {
                                 --intStackCount;
                                 inter.modifyDraggingAlpha = Class3.intStack[intStackCount] == 1;
                                 continue;
                              }

                              if(opcode == 1303) {
                                 --intStackCount;
                                 inter.anInt1999 = Class3.intStack[intStackCount] * -172520565;
                                 continue;
                              }

                              if(opcode == 1304) {
                                 --intStackCount;
                                 inter.anInt1965 = Class3.intStack[intStackCount] * -77181551;
                                 continue;
                              }

                              if(opcode == 1305) {
                                 --var7;
                                 inter.action_name = Class3.aStringArray32[var7];
                                 continue;
                              }

                              if(opcode == 1306) {
                                 --var7;
                                 inter.selectedActionName = Class3.aStringArray32[var7];
                                 continue;
                              }

                              if(opcode == 1307) {
                                 inter.niActions = null;
                                 continue;
                              }
                           }
                        } else {
                           if(opcode >= 2000) {
                              opcode -= 1000;
                              --intStackCount;
                              inter = Class107.getInterface(Class3.intStack[intStackCount], 314639891);
                           } else {
                              inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                           }

                           Class79.refreshInterface(inter, 1020972985);
                           if(1200 == opcode || opcode == 1205 || opcode == 1212) {
                              intStackCount -= 2;
                              var17 = Class3.intStack[intStackCount];
                              var36 = Class3.intStack[intStackCount + 1];
                              inter.anInt2043 = -444483265 * var17;
                              inter.anInt2044 = var36 * 1567728457;
                              Class116_Sub23_Sub11 var39 = RelationList.method778(var17, (byte) 70);
                              inter.rotateX = var39.anInt2367 * 1778672027;
                              inter.rotateY = var39.anInt2368 * -438177483;
                              inter.anInt1990 = 292702103 * var39.anInt2393;
                              inter.translateX = var39.anInt2402 * 889655743;
                              inter.translateY = -738298705 * var39.anInt2371;
                              inter.zoom = -1079397735 * var39.anInt2396;
                              if(opcode == 1205) {
                                 inter.anInt1981 = 0;
                              } else if(1212 == opcode | 1 == 1303294175 * var39.anInt2372) {
                                 inter.anInt1981 = -1548696853;
                              } else {
                                 inter.anInt1981 = 1197573590;
                              }

                              if(inter.anInt1987 * 1501804265 > 0) {
                                 inter.zoom = -438091779 * (126003872 * inter.zoom / (1501804265 * inter.anInt1987));
                              } else if(inter.width * 124195285 > 0) {
                                 inter.zoom = 126003872 * inter.zoom / (124195285 * inter.width) * -438091779;
                              }
                              continue;
                           }

                           if(1201 == opcode) {
                              inter.modelTypeDisabled = -752921414;
                              --intStackCount;
                              inter.mediaIdDisabled = Class3.intStack[intStackCount] * -541123263;
                              continue;
                           }

                           if(opcode == 1202) {
                              inter.modelTypeDisabled = -1129382121;
                              inter.mediaIdDisabled = Class79.ourPlayer.aClass108_2881.method1475(-1808574700) * -541123263;
                              continue;
                           }
                        }
                     } else {
                        var17 = -1;
                        if(opcode >= 2000) {
                           opcode -= 1000;
                           --intStackCount;
                           var17 = Class3.intStack[intStackCount];
                           inter = Class107.getInterface(var17, 314639891);
                        } else {
                           inter = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                        }

                        if(opcode == 1100) {
                           intStackCount -= 2;
                           inter.anInt1946 = 435089853 * Class3.intStack[intStackCount];
                           if(-352661099 * inter.anInt1946 > -302755437 * inter.anInt2037 - inter.wdth * 1645211541) {
                              inter.anInt1946 = inter.anInt2037 * -539648889 - inter.wdth * -1344985599;
                           }

                           if(inter.anInt1946 * -352661099 < 0) {
                              inter.anInt1946 = 0;
                           }

                           inter.anInt1947 = -1459786367 * Class3.intStack[1 + intStackCount];
                           if(inter.anInt1947 * -1602694527 > inter.maxScrollVertical * 177405235 - inter.heght * 1227800423) {
                              inter.anInt1947 = -1656271437 * inter.maxScrollVertical - -1999090201 * inter.heght;
                           }

                           if(-1602694527 * inter.anInt1947 < 0) {
                              inter.anInt1947 = 0;
                           }

                           Class79.refreshInterface(inter, -1238912106);
                           continue;
                        }

                        if(1101 == opcode) {
                           --intStackCount;
                           inter.disabledColor = Class3.intStack[intStackCount] * 1053943595;
                           Class79.refreshInterface(inter, -359414066);
                           continue;
                        }

                        if(opcode == 1102) {
                           --intStackCount;
                           inter.filled = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, -186349538);
                           continue;
                        }

                        if(opcode == 1103) {
                           --intStackCount;
                           inter.alpha = Class3.intStack[intStackCount] * -150375007;
                           Class79.refreshInterface(inter, 673255645);
                           continue;
                        }

                        if(1104 == opcode) {
                           --intStackCount;
                           inter.thickness = Class3.intStack[intStackCount] * -532092193;
                           Class79.refreshInterface(inter, -708248723);
                           continue;
                        }

                        if(1105 == opcode) {
                           --intStackCount;
                           inter.disabledSprite = Class3.intStack[intStackCount] * 8452631;
                           Class79.refreshInterface(inter, -111073555);
                           continue;
                        }

                        if(1106 == opcode) {
                           --intStackCount;
                           inter.rotation = Class3.intStack[intStackCount] * -2073708251;
                           Class79.refreshInterface(inter, 1652885825);
                           continue;
                        }

                        if(1107 == opcode) {
                           --intStackCount;
                           inter.gridOriginal = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, 1617275281);
                           continue;
                        }

                        if(opcode == 1108) {
                           inter.modelTypeDisabled = -376460707;
                           --intStackCount;
                           inter.mediaIdDisabled = Class3.intStack[intStackCount] * -541123263;
                           Class79.refreshInterface(inter, -2024326573);
                           continue;
                        }

                        if(opcode == 1109) {
                           intStackCount -= 6;
                           inter.translateX = 1821510845 * Class3.intStack[intStackCount];
                           inter.translateY = 1509391427 * Class3.intStack[intStackCount + 1];
                           inter.rotateX = Class3.intStack[intStackCount + 2] * 1055873919;
                           inter.rotateY = -478470667 * Class3.intStack[3 + intStackCount];
                           inter.anInt1990 = Class3.intStack[intStackCount + 4] * -1820349821;
                           inter.zoom = -438091779 * Class3.intStack[5 + intStackCount];
                           Class79.refreshInterface(inter, -1608913123);
                           continue;
                        }

                        if(opcode == 1110) {
                           --intStackCount;
                           var36 = Class3.intStack[intStackCount];
                           if(var36 != 467073769 * inter.disabledAnim) {
                              inter.disabledAnim = var36 * 1986493785;
                              inter.anInt2045 = 0;
                              inter.anInt1919 = 0;
                              Class79.refreshInterface(inter, -121415893);
                           }
                           continue;
                        }

                        if(opcode == 1111) {
                           --intStackCount;
                           inter.aBool1980 = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, -449938691);
                           continue;
                        }

                        if(1112 == opcode) {
                           --var7;
                           var38 = Class3.aStringArray32[var7];
                           if(!var38.equals(inter.disabledText)) {
                              inter.disabledText = var38;
                              Class79.refreshInterface(inter, -1395689492);
                           }
                           continue;
                        }

                        if(opcode == 1113) {
                           --intStackCount;
                           inter.font = Class3.intStack[intStackCount] * 189801909;
                           Class79.refreshInterface(inter, -1866294782);
                           continue;
                        }

                        if(1114 == opcode) {
                           intStackCount -= 3;
                           inter.horizontalAlignment = Class3.intStack[intStackCount] * 1328854359;
                           inter.verticalAlignment = 252282377 * Class3.intStack[intStackCount + 1];
                           inter.verticalSpacing = -51845037 * Class3.intStack[intStackCount + 2];
                           Class79.refreshInterface(inter, -122666715);
                           continue;
                        }

                        if(opcode == 1115) {
                           --intStackCount;
                           inter.shaded = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, 745108401);
                           continue;
                        }

                        if(1116 == opcode) {
                           --intStackCount;
                           inter.outline = Class3.intStack[intStackCount] * -1058827231;
                           Class79.refreshInterface(inter, -1752556121);
                           continue;
                        }

                        if(1117 == opcode) {
                           --intStackCount;
                           inter.shadow = Class3.intStack[intStackCount] * 1485125361;
                           Class79.refreshInterface(inter, -1448288108);
                           continue;
                        }

                        if(opcode == 1118) {
                           --intStackCount;
                           inter.flipVertical = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, 1903838538);
                           continue;
                        }

                        if(opcode == 1119) {
                           --intStackCount;
                           inter.flipHorizontal = Class3.intStack[intStackCount] == 1;
                           Class79.refreshInterface(inter, 755324299);
                           continue;
                        }

                        if(1120 == opcode) {
                           intStackCount -= 2;
                           inter.anInt2037 = -1460374373 * Class3.intStack[intStackCount];
                           inter.maxScrollVertical = Class3.intStack[intStackCount + 1] * 2144421371;
                           Class79.refreshInterface(inter, 142041289);
                           if(var17 != -1 && 0 == -1305917269 * inter.type) {
                              ObjectDefinition.method2435(RSInterface.mainInterfaceArray[var17 >> 16], inter, false, -1150322053);
                           }
                           continue;
                        }

                        if(opcode == 1121) {
                           RelationList.method779(inter.hash * -1536575275, inter.anInt1926 * 2021294259, (byte) 8);
                           client.aClass116_Sub15_3097 = inter;
                           Class79.refreshInterface(inter, 711144474);
                           continue;
                        }

                        if(1122 == opcode) {
                           --intStackCount;
                           inter.enabledSprite = Class3.intStack[intStackCount] * -134170007;
                           Class79.refreshInterface(inter, -406414715);
                           continue;
                        }
                     }
                  } else {
                     var34 = -1;
                     if(opcode >= 2000) {
                        opcode -= 1000;
                        --intStackCount;
                        var34 = Class3.intStack[intStackCount];
                        var35 = Class107.getInterface(var34, 314639891);
                     } else {
                        var35 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                     }

                     if(opcode == 1000) {
                        intStackCount -= 4;
                        var35.xOffset = Class3.intStack[intStackCount] * 10986657;
                        var35.yOffset = -720369495 * Class3.intStack[1 + intStackCount];
                        var35.anInt1930 = Class3.intStack[2 + intStackCount] * 821393763;
                        var35.anInt1915 = -1510479807 * Class3.intStack[3 + intStackCount];
                        Class79.refreshInterface(var35, 81549416);
                        Player.method3563(var35, 1201941158);
                        if(var34 != -1 && -1305917269 * var35.type == 0) {
                           ObjectDefinition.method2435(RSInterface.mainInterfaceArray[var34 >> 16], var35, false, 1755995007);
                        }
                        continue;
                     }

                     if(opcode == 1001) {
                        intStackCount -= 4;
                        var35.width = Class3.intStack[intStackCount] * 934649725;
                        var35.height = Class3.intStack[intStackCount + 1] * -280898437;
                        var35.anInt1932 = -1174864481 * Class3.intStack[intStackCount + 2];
                        var35.anInt1933 = Class3.intStack[3 + intStackCount] * -1361079889;
                        Class79.refreshInterface(var35, -1320883898);
                        Player.method3563(var35, 1590938449);
                        if(-1 != var34 && -1305917269 * var35.type == 0) {
                           ObjectDefinition.method2435(RSInterface.mainInterfaceArray[var34 >> 16], var35, false, 598605660);
                        }
                        continue;
                     }

                     if(1003 == opcode) {
                        --intStackCount;
                        var37 = Class3.intStack[intStackCount] == 1;
                        if(var37 != var35.hidden) {
                           var35.hidden = var37;
                           Class79.refreshInterface(var35, -1662272604);
                        }
                        continue;
                     }

                     if(1005 == opcode) {
                        --intStackCount;
                        var35.aBool2056 = Class3.intStack[intStackCount] == 1;
                        continue;
                     }

                     if(1006 == opcode) {
                        --intStackCount;
                        var35.aBool2009 = Class3.intStack[intStackCount] == 1;
                        continue;
                     }
                  }
               }

               if(opcode < 5400) {
                  if(5306 == opcode) {
                     int[] var100 = Class3.intStack;
                     var17 = intStackCount++;
                     var36 = client.aBool3140?2:1;
                     var100[var17] = var36;
                     continue;
                  }

                  if(5307 == opcode) {
                     --intStackCount;
                     var34 = Class3.intStack[intStackCount];
                     if(1 != var34 && 2 != var34) {
                        continue;
                     }

                     client.aLong2975 = 0L;
                     if(var34 >= 2) {
                        client.aBool3140 = true;
                     } else {
                        client.aBool3140 = false;
                     }

                     Class116_Sub5.method1931(384444262);
                     if(client.loginStage * 846055547 >= 25) {
                        client.rsaBuffer.startPacket(23, (byte) 118);
                        PacketBuilder var95 = client.rsaBuffer;
                        var36 = client.aBool3140?2:1;
                        var95.writeByte(var36, 833994503);
                        client.rsaBuffer.writeShort(-452716157 * Class42.clientWidth, -1970132148);
                        client.rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -1734157170);
                     }

                     Applet_Sub1.aBool2921 = true;
                     continue;
                  }

                  if(5308 == opcode) {
                     Class3.intStack[intStackCount++] = Class116_Sub5.aClass29_1727.anInt405 * -1207115777;
                     continue;
                  }

                  if(opcode == 5309) {
                     --intStackCount;
                     var34 = Class3.intStack[intStackCount];
                     if(var34 == 1 || 2 == var34) {
                        Class116_Sub5.aClass29_1727.anInt405 = -2081218561 * var34;
                        Class86.method1167((byte)-11);
                     }
                     continue;
                  }
               }

               if(opcode < 5600) {
                  if(5504 == opcode) {
                     intStackCount -= 2;
                     var34 = Class3.intStack[intStackCount];
                     var17 = Class3.intStack[1 + intStackCount];
                     if(!client.aBool2988) {
                        client.anInt2994 = var34 * 1871674069;
                        client.anInt2929 = -571365833 * var17;
                     }
                     continue;
                  }

                  if(5505 == opcode) {
                     Class3.intStack[intStackCount++] = client.anInt2994 * -1992036739;
                     continue;
                  }

                  if(opcode == 5506) {
                     Class3.intStack[intStackCount++] = -1916997753 * client.anInt2929;
                     continue;
                  }

                  if(5530 == opcode) {
                     --intStackCount;
                     var34 = Class3.intStack[intStackCount];
                     if(var34 < 0) {
                        var34 = 0;
                     }

                     client.anInt3153 = var34 * 1125013561;
                     continue;
                  }

                  if(5531 == opcode) {
                     Class3.intStack[intStackCount++] = client.anInt3153 * -868608503;
                     continue;
                  }
               }

               if(opcode < 5700 && opcode == 5630) {
                  client.anInt2987 = -453788862;
               } else {
                  if(opcode < 6300) {
                     if(opcode == 6200) {
                        intStackCount -= 2;
                        client.aShort3146 = (short)Class3.intStack[intStackCount];
                        if(client.aShort3146 <= 0) {
                           client.aShort3146 = 256;
                        }

                        client.aShort3190 = (short)Class3.intStack[intStackCount + 1];
                        if(client.aShort3190 <= 0) {
                           client.aShort3190 = 205;
                        }
                        continue;
                     }

                     if(6201 == opcode) {
                        intStackCount -= 2;
                        client.aShort3191 = (short)Class3.intStack[intStackCount];
                        if(client.aShort3191 <= 0) {
                           client.aShort3191 = 256;
                        }

                        client.aShort2941 = (short)Class3.intStack[1 + intStackCount];
                        if(client.aShort2941 <= 0) {
                           client.aShort2941 = 320;
                        }
                        continue;
                     }

                     if(opcode == 6202) {
                        intStackCount -= 4;
                        client.aShort3193 = (short)Class3.intStack[intStackCount];
                        if(client.aShort3193 <= 0) {
                           client.aShort3193 = 1;
                        }

                        client.aShort3085 = (short)Class3.intStack[1 + intStackCount];
                        if(client.aShort3085 <= 0) {
                           client.aShort3085 = 32767;
                        } else if(client.aShort3085 < client.aShort3193) {
                           client.aShort3085 = client.aShort3193;
                        }

                        client.aShort3195 = (short)Class3.intStack[2 + intStackCount];
                        if(client.aShort3195 <= 0) {
                           client.aShort3195 = 1;
                        }

                        client.aShort3196 = (short)Class3.intStack[3 + intStackCount];
                        if(client.aShort3196 <= 0) {
                           client.aShort3196 = 32767;
                        } else if(client.aShort3196 < client.aShort3195) {
                           client.aShort3196 = client.aShort3195;
                        }
                        continue;
                     }

                     if(6203 == opcode) {
                        if(null != client.aClass116_Sub15_3210) {
                           Class14.method255(0, 0, 1645211541 * client.aClass116_Sub15_3210.wdth, client.aClass116_Sub15_3210.heght * 1227800423, false, -946317863);
                           Class3.intStack[intStackCount++] = client.anInt3126 * 2112468213;
                           Class3.intStack[intStackCount++] = client.anInt2986 * -336695531;
                        } else {
                           Class3.intStack[intStackCount++] = -1;
                           Class3.intStack[intStackCount++] = -1;
                        }
                        continue;
                     }

                     if(6204 == opcode) {
                        Class3.intStack[intStackCount++] = client.aShort3191;
                        Class3.intStack[intStackCount++] = client.aShort2941;
                        continue;
                     }

                     if(opcode == 6205) {
                        Class3.intStack[intStackCount++] = client.aShort3146;
                        Class3.intStack[intStackCount++] = client.aShort3190;
                        continue;
                     }
                  }

                  if(opcode < 6600) {
                     if(6500 == opcode) {
                         System.out.println("opcode 6500 cs script?");
                        Class3.intStack[intStackCount++] = Class35.readWorldList(1002424370)?1:0;
                        continue;
                     }

                     World var99;
                     if(6501 == opcode) {
                        var99 = Mob.method3547((byte) 2);
                        if(null != var99) {
                           Class3.intStack[intStackCount++] = -145619359 * var99.worldId;
                           Class3.intStack[intStackCount++] = var99.activityFlag * -1784645245;
                           Class3.aStringArray32[var7++] = var99.activity;
                           Class3.intStack[intStackCount++] = var99.flag * -1854937097;
                           Class3.intStack[intStackCount++] = var99.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var99.address;
                        } else {
                           Class3.intStack[intStackCount++] = -1;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.intStack[intStackCount++] = 0;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     if(6502 == opcode) {
                        if(World.anInt387 * -1614070229 < World.totalWorldCount * -1946617791) {
                           var99 = World.worldArray[(World.anInt387 += -1416261501) * -1614070229 - 1];
                        } else {
                           var99 = null;
                        }

                        if(var99 != null) {
                           Class3.intStack[intStackCount++] = var99.worldId * -145619359;
                           Class3.intStack[intStackCount++] = var99.activityFlag * -1784645245;
                           Class3.aStringArray32[var7++] = var99.activity;
                           Class3.intStack[intStackCount++] = -1854937097 * var99.flag;
                           Class3.intStack[intStackCount++] = 215269871 * var99.anInt381;
                           Class3.aStringArray32[var7++] = var99.address;
                        } else {
                           Class3.intStack[intStackCount++] = -1;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.intStack[intStackCount++] = 0;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     World var94;
                     if(opcode == 6506) {
                        --intStackCount;
                        var34 = Class3.intStack[intStackCount];
                        var94 = null;

                        for(var36 = 0; var36 < -1946617791 * World.totalWorldCount; ++var36) {
                           if(var34 == World.worldArray[var36].worldId * -145619359) {
                              var94 = World.worldArray[var36];
                              break;
                           }
                        }

                        if(var94 != null) {
                           Class3.intStack[intStackCount++] = var94.worldId * -145619359;
                           Class3.intStack[intStackCount++] = -1784645245 * var94.activityFlag;
                           Class3.aStringArray32[var7++] = var94.activity;
                           Class3.intStack[intStackCount++] = var94.flag * -1854937097;
                           Class3.intStack[intStackCount++] = var94.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var94.address;
                        } else {
                           Class3.intStack[intStackCount++] = -1;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.intStack[intStackCount++] = 0;
                           Class3.intStack[intStackCount++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     if(6507 == opcode) {
                        intStackCount -= 4;
                        var34 = Class3.intStack[intStackCount];
                        var56 = Class3.intStack[1 + intStackCount] == 1;
                        var36 = Class3.intStack[2 + intStackCount];
                        var42 = 1 == Class3.intStack[3 + intStackCount];
                        if(null != World.worldArray) {
                           Class45.method710(0, World.worldArray.length - 1, var34, var56, var36, var42, -871319848);
                        }
                        continue;
                     }

                     if(opcode == 6511) {
                        --intStackCount;
                        var34 = Class3.intStack[intStackCount];
                        if(var34 >= 0 && var34 < -1946617791 * World.totalWorldCount) {
                           var94 = World.worldArray[var34];
                           Class3.intStack[intStackCount++] = -145619359 * var94.worldId;
                           Class3.intStack[intStackCount++] = -1784645245 * var94.activityFlag;
                           Class3.aStringArray32[var7++] = var94.activity;
                           Class3.intStack[intStackCount++] = var94.flag * -1854937097;
                           Class3.intStack[intStackCount++] = var94.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var94.address;
                           continue;
                        }

                        Class3.intStack[intStackCount++] = -1;
                        Class3.intStack[intStackCount++] = 0;
                        Class3.aStringArray32[var7++] = "";
                        Class3.intStack[intStackCount++] = 0;
                        Class3.intStack[intStackCount++] = 0;
                        Class3.aStringArray32[var7++] = "";
                        continue;
                     }
                  }

                  throw new IllegalStateException();
               }
            }
         } catch (Exception var31) {
            StringBuilder var13 = new StringBuilder(30);
            var13.append("").append(var5.hashId).append(" ");

            for(var14 = 1112721435 * Class3.anInt35 - 1; var14 >= 0; --var14) {
               var13.append("").append(Class3.aClass39Array33[var14].aClass116_Sub23_Sub18_515.hashId).append(" ");
            }

            var13.append("").append(var11);
            Class90.method1192(var13.toString(), var31, 343294798);
         }
      }
   }

}
