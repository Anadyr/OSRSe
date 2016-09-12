package com.jagex;
import java.applet.Applet;
import java.util.Date;

public abstract class Class63 {

   static boolean aBool808 = false;


   public static Sprite method918(Class99 var0, String var1, String var2, int var3) {
      int var4 = var0.method1366(var1, 1136795906);
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

   public static void method933(Applet var0, String var1, byte var2) {
      Class81.anApplet924 = var0;
      Class81.aString922 = var1;
   }

   static void method934(Class116_Sub6 var0, int var1, int var2) {
      Object[] var3 = var0.anObjectArray1737;
      int var4 = ((Integer)var3[0]).intValue();
      Class116_Sub23_Sub18 var5 = Class47.method769(var4, -984954025);
      if(null != var5) {
         int var6 = 0;
         int var7 = 0;
         int var8 = -1;
         int[] var9 = var5.anIntArray2474;
         int[] var10 = var5.anIntArray2482;
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
                     var15 = null != var0.aClass116_Sub15_1736?-1536575275 * var0.aClass116_Sub15_1736.anInt1925:-1;
                  }

                  if(-2147483644 == var15) {
                     var15 = -332002479 * var0.anInt1734;
                  }

                  if(var15 == -2147483643) {
                     var15 = null != var0.aClass116_Sub15_1736?2021294259 * var0.aClass116_Sub15_1736.anInt1926:-1;
                  }

                  if(-2147483642 == var15) {
                     var15 = null != var0.aClass116_Sub15_1740?var0.aClass116_Sub15_1740.anInt1925 * -1536575275:-1;
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

               ++var8;
               int var32 = var9[var8];
               int var17;
               int var34;
               int var46;
               String[] var74;
               String var84;
               int[] var90;
               if(var32 < 100) {
                  if(0 == var32) {
                     Class3.anIntArray44[var6++] = var10[var8];
                     continue;
                  }

                  if(1 == var32) {
                     var15 = var10[var8];
                     Class3.anIntArray44[var6++] = Class107.varpData[var15];
                     continue;
                  }

                  if(2 == var32) {
                     var15 = var10[var8];
                     --var6;
                     Class107.varpData[var15] = Class3.anIntArray44[var6];
                     Class27.method567(var15, 2122167961);
                     continue;
                  }

                  if(var32 == 3) {
                     Class3.aStringArray32[var7++] = var5.aStringArray2477[var8];
                     continue;
                  }

                  if(var32 == 6) {
                     var8 += var10[var8];
                     continue;
                  }

                  if(var32 == 7) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6 + 1] != Class3.anIntArray44[var6]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(8 == var32) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6 + 1] == Class3.anIntArray44[var6]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(var32 == 9) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6] < Class3.anIntArray44[var6 + 1]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(var32 == 10) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6] > Class3.anIntArray44[1 + var6]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(var32 == 21) {
                     if(0 == 1112721435 * Class3.anInt35) {
                        return;
                     }

                     Class39 var73 = Class3.aClass39Array33[(Class3.anInt35 -= -1200631277) * 1112721435];
                     var5 = var73.aClass116_Sub23_Sub18_515;
                     var9 = var5.anIntArray2474;
                     var10 = var5.anIntArray2482;
                     var8 = var73.anInt517 * -594127079;
                     Class3.anIntArray28 = var73.anIntArray516;
                     Class3.aStringArray29 = var73.aStringArray514;
                     continue;
                  }

                  if(25 == var32) {
                     var15 = var10[var8];
                     Class3.anIntArray44[var6++] = Class103.method1451(var15, -584760962);
                     continue;
                  }

                  if(var32 == 27) {
                     var15 = var10[var8];
                     --var6;
                     Class86.method1172(var15, Class3.anIntArray44[var6], (byte)109);
                     continue;
                  }

                  if(31 == var32) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6] <= Class3.anIntArray44[var6 + 1]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(var32 == 32) {
                     var6 -= 2;
                     if(Class3.anIntArray44[var6] >= Class3.anIntArray44[1 + var6]) {
                        var8 += var10[var8];
                     }
                     continue;
                  }

                  if(var32 == 33) {
                     Class3.anIntArray44[var6++] = Class3.anIntArray28[var10[var8]];
                     continue;
                  }

                  int var10001;
                  if(var32 == 34) {
                     var10001 = var10[var8];
                     --var6;
                     Class3.anIntArray28[var10001] = Class3.anIntArray44[var6];
                     continue;
                  }

                  if(var32 == 35) {
                     Class3.aStringArray32[var7++] = Class3.aStringArray29[var10[var8]];
                     continue;
                  }

                  if(var32 == 36) {
                     var10001 = var10[var8];
                     --var7;
                     Class3.aStringArray29[var10001] = Class3.aStringArray32[var7];
                     continue;
                  }

                  if(37 == var32) {
                     var15 = var10[var8];
                     var7 -= var15;
                     var84 = Tile.method1985(Class3.aStringArray32, var7, var15, -791024858);
                     Class3.aStringArray32[var7++] = var84;
                     continue;
                  }

                  if(var32 == 38) {
                     --var6;
                     continue;
                  }

                  if(39 == var32) {
                     --var7;
                     continue;
                  }

                  if(var32 == 40) {
                     var15 = var10[var8];
                     Class116_Sub23_Sub18 var102 = Class47.method769(var15, -1459313133);
                     var90 = new int[-325262437 * var102.anInt2475];
                     var74 = new String[1146347541 * var102.anInt2479];

                     for(var46 = 0; var46 < var102.anInt2480 * 767633967; ++var46) {
                        var90[var46] = Class3.anIntArray44[var46 + (var6 - 767633967 * var102.anInt2480)];
                     }

                     for(var46 = 0; var46 < 873573015 * var102.anInt2491; ++var46) {
                        var74[var46] = Class3.aStringArray32[var46 + (var7 - 873573015 * var102.anInt2491)];
                     }

                     var6 -= 767633967 * var102.anInt2480;
                     var7 -= 873573015 * var102.anInt2491;
                     Class39 var97 = new Class39();
                     var97.aClass116_Sub23_Sub18_515 = var5;
                     var97.anInt517 = var8 * 954144041;
                     var97.anIntArray516 = Class3.anIntArray28;
                     var97.aStringArray514 = Class3.aStringArray29;
                     Class3.aClass39Array33[(Class3.anInt35 += -1200631277) * 1112721435 - 1] = var97;
                     var5 = var102;
                     var9 = var102.anIntArray2474;
                     var10 = var102.anIntArray2482;
                     var8 = -1;
                     Class3.anIntArray28 = var90;
                     Class3.aStringArray29 = var74;
                     continue;
                  }

                  if(var32 == 42) {
                     Class3.anIntArray44[var6++] = Class39.aClass33_518.method634(var10[var8], (byte)107);
                     continue;
                  }

                  if(var32 == 43) {
                     var10001 = var10[var8];
                     --var6;
                     Class39.aClass33_518.method601(var10001, Class3.anIntArray44[var6], -1976877330);
                     continue;
                  }

                  if(44 == var32) {
                     var15 = var10[var8] >> 16;
                     var34 = var10[var8] & '\uffff';
                     --var6;
                     var17 = Class3.anIntArray44[var6];
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

                  if(45 == var32) {
                     var15 = var10[var8];
                     --var6;
                     var34 = Class3.anIntArray44[var6];
                     if(var34 >= 0 && var34 < Class3.anIntArray27[var15]) {
                        Class3.anIntArray44[var6++] = Class3.anIntArrayArray31[var15][var34];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(var32 == 46) {
                     var15 = var10[var8];
                     var6 -= 2;
                     var34 = Class3.anIntArray44[var6];
                     if(var34 >= 0 && var34 < Class3.anIntArray27[var15]) {
                        Class3.anIntArrayArray31[var15][var34] = Class3.anIntArray44[1 + var6];
                        continue;
                     }

                     throw new RuntimeException();
                  }

                  if(var32 == 47) {
                     var44 = Class39.aClass33_518.method604(var10[var8], 653224099);
                     if(null == var44) {
                        var44 = "null";
                     }

                     Class3.aStringArray32[var7++] = var44;
                     continue;
                  }

                  if(48 == var32) {
                     var10001 = var10[var8];
                     --var7;
                     Class39.aClass33_518.method636(var10001, Class3.aStringArray32[var7], (byte)0);
                     continue;
                  }
               }

               boolean var47;
	            var47 = var10[var8] == 1;

               Class116_Sub15 var16;
               Class116_Sub15 var18;
               Class116_Sub15 var19;
               int var21;
               Class116_Sub15 var35;
               int var36;
               boolean var42;
               boolean var56;
               if(var32 < 1000) {
                  if(var32 == 100) {
                     var6 -= 3;
                     var34 = Class3.anIntArray44[var6];
                     var17 = Class3.anIntArray44[1 + var6];
                     var36 = Class3.anIntArray44[var6 + 2];
                     if(0 == var17) {
                        throw new RuntimeException();
                     }

                     var19 = Class107.method1466(var34, 314639891);
                     if(var19.aClass116_Sub15Array1995 == null) {
                        var19.aClass116_Sub15Array1995 = new Class116_Sub15[var36 + 1];
                     }

                     if(var19.aClass116_Sub15Array1995.length <= var36) {
                        Class116_Sub15[] var20 = new Class116_Sub15[var36 + 1];

                        for(var21 = 0; var21 < var19.aClass116_Sub15Array1995.length; ++var21) {
                           var20[var21] = var19.aClass116_Sub15Array1995[var21];
                        }

                        var19.aClass116_Sub15Array1995 = var20;
                     }

                     if(var36 > 0 && null == var19.aClass116_Sub15Array1995[var36 - 1]) {
                        throw new RuntimeException("" + (var36 - 1));
                     }

                     Class116_Sub15 var41 = new Class116_Sub15();
                     var41.anInt2018 = var17 * 1702392323;
                     var41.anInt1944 = (var41.anInt1925 = 1 * var19.anInt1925) * 1485437425;
                     var41.anInt1926 = var36 * 938225275;
                     var41.aBool1924 = true;
                     var19.aClass116_Sub15Array1995[var36] = var41;
                     if(var47) {
                        Class29.aClass116_Sub15_410 = var41;
                     } else {
                        Class3.aClass116_Sub15_36 = var41;
                     }

                     Class79.method1097(var19, 1775934735);
                     continue;
                  }

                  if(101 == var32) {
                     var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                     var35 = Class107.method1466(-1536575275 * var16.anInt1925, 314639891);
                     var35.aClass116_Sub15Array1995[var16.anInt1926 * 2021294259] = null;
                     Class79.method1097(var35, 1086002168);
                     continue;
                  }

                  if(102 == var32) {
                     --var6;
                     var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                     var16.aClass116_Sub15Array1995 = null;
                     Class79.method1097(var16, 550540026);
                     continue;
                  }

                  if(200 == var32) {
                     var6 -= 2;
                     var34 = Class3.anIntArray44[var6];
                     var17 = Class3.anIntArray44[var6 + 1];
                     var18 = AbstractRSDrawing.method339(var34, var17, 1008129993);
                     if(var18 != null && var17 != -1) {
                        Class3.anIntArray44[var6++] = 1;
                        if(var47) {
                           Class29.aClass116_Sub15_410 = var18;
                        } else {
                           Class3.aClass116_Sub15_36 = var18;
                        }
                        continue;
                     }

                     Class3.anIntArray44[var6++] = 0;
                     continue;
                  }

                  if(201 == var32) {
                     --var6;
                     var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                     if(null != var16) {
                        Class3.anIntArray44[var6++] = 1;
                        if(var47) {
                           Class29.aClass116_Sub15_410 = var16;
                        } else {
                           Class3.aClass116_Sub15_36 = var16;
                        }
                     } else {
                        Class3.anIntArray44[var6++] = 0;
                     }
                     continue;
                  }
               } else {
                  boolean var37;
                  if((var32 < 1000 || var32 >= 1100) && (var32 < 2000 || var32 >= 2100)) {
                     String var38;
                     if((var32 < 1100 || var32 >= 1200) && (var32 < 2100 || var32 >= 2200)) {
                        if((var32 < 1200 || var32 >= 1300) && (var32 < 2200 || var32 >= 2300)) {
                           if((var32 < 1300 || var32 >= 1400) && (var32 < 2300 || var32 >= 2400)) {
                              int[] var45;
                              int var50;
                              String var55;
                              if(var32 >= 1400 && var32 < 1500 || var32 >= 2400 && var32 < 2500) {
                                 if(var32 >= 2000) {
                                    var32 -= 1000;
                                    --var6;
                                    var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                 } else {
                                    var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 }

                                 --var7;
                                 var55 = Class3.aStringArray32[var7];
                                 var45 = null;
                                 if(var55.length() > 0 && var55.charAt(var55.length() - 1) == 89) {
                                    --var6;
                                    var46 = Class3.anIntArray44[var6];
                                    if(var46 > 0) {
                                       for(var45 = new int[var46]; var46-- > 0; var45[var46] = Class3.anIntArray44[var6]) {
                                          --var6;
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
                                       --var6;
                                       Integer var10002 = new Integer(Class3.anIntArray44[var6]);
                                       var91[var50] = var10002;
                                    }
                                 }

                                 --var6;
                                 var50 = Class3.anIntArray44[var6];
                                 if(var50 != -1) {
                                    var91[0] = new Integer(var50);
                                 } else {
                                    var91 = null;
                                 }

                                 if(1400 == var32) {
                                    var16.anObjectArray2005 = var91;
                                 }

                                 if(var32 == 1401) {
                                    var16.anObjectArray2008 = var91;
                                 }

                                 if(1402 == var32) {
                                    var16.anObjectArray2007 = var91;
                                 }

                                 if(1403 == var32) {
                                    var16.anObjectArray1960 = var91;
                                 }

                                 if(var32 == 1404) {
                                    var16.anObjectArray2011 = var91;
                                 }

                                 if(var32 == 1405) {
                                    var16.anObjectArray2012 = var91;
                                 }

                                 if(var32 == 1406) {
                                    var16.anObjectArray2015 = var91;
                                 }

                                 if(1407 == var32) {
                                    var16.anObjectArray2039 = var91;
                                    var16.anIntArray2017 = var45;
                                 }

                                 if(1408 == var32) {
                                    var16.anObjectArray2022 = var91;
                                 }

                                 if(1409 == var32) {
                                    var16.anObjectArray2023 = var91;
                                 }

                                 if(1410 == var32) {
                                    var16.anObjectArray2013 = var91;
                                 }

                                 if(var32 == 1411) {
                                    var16.anObjectArray2006 = var91;
                                 }

                                 if(1412 == var32) {
                                    var16.anObjectArray1931 = var91;
                                 }

                                 if(1414 == var32) {
                                    var16.anObjectArray1972 = var91;
                                    var16.anIntArray2019 = var45;
                                 }

                                 if(var32 == 1415) {
                                    var16.anObjectArray2020 = var91;
                                    var16.anIntArray1948 = var45;
                                 }

                                 if(var32 == 1416) {
                                    var16.anObjectArray1927 = var91;
                                 }

                                 if(var32 == 1417) {
                                    var16.anObjectArray2024 = var91;
                                 }

                                 if(1418 == var32) {
                                    var16.anObjectArray2025 = var91;
                                 }

                                 if(1419 == var32) {
                                    var16.anObjectArray2026 = var91;
                                 }

                                 if(var32 == 1420) {
                                    var16.anObjectArray2027 = var91;
                                 }

                                 if(1421 == var32) {
                                    var16.anObjectArray2028 = var91;
                                 }

                                 if(var32 == 1422) {
                                    var16.anObjectArray1982 = var91;
                                 }

                                 if(var32 == 1423) {
                                    var16.anObjectArray2030 = var91;
                                 }

                                 if(var32 == 1424) {
                                    var16.anObjectArray2031 = var91;
                                 }

                                 if(var32 == 1425) {
                                    var16.anObjectArray2033 = var91;
                                 }

                                 if(var32 == 1426) {
                                    var16.anObjectArray2034 = var91;
                                 }

                                 if(var32 == 1427) {
                                    var16.anObjectArray2032 = var91;
                                 }

                                 var16.aBool2003 = true;
                                 continue;
                              }

                              if(var32 < 1600) {
                                 var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(1500 == var32) {
                                    Class3.anIntArray44[var6++] = 332168295 * var16.anInt1938;
                                    continue;
                                 }

                                 if(var32 == 1501) {
                                    Class3.anIntArray44[var6++] = var16.anInt1939 * 1492425953;
                                    continue;
                                 }

                                 if(1502 == var32) {
                                    Class3.anIntArray44[var6++] = var16.anInt1940 * 1645211541;
                                    continue;
                                 }

                                 if(1503 == var32) {
                                    Class3.anIntArray44[var6++] = 1227800423 * var16.anInt1974;
                                    continue;
                                 }

                                 if(var32 == 1504) {
                                    Class3.anIntArray44[var6++] = var16.aBool1945?1:0;
                                    continue;
                                 }

                                 if(1505 == var32) {
                                    Class3.anIntArray44[var6++] = -1652479707 * var16.anInt1944;
                                    continue;
                                 }
                              } else if(var32 < 1700) {
                                 var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(1600 == var32) {
                                    Class3.anIntArray44[var6++] = -352661099 * var16.anInt1946;
                                    continue;
                                 }

                                 if(1601 == var32) {
                                    Class3.anIntArray44[var6++] = -1602694527 * var16.anInt1947;
                                    continue;
                                 }

                                 if(1602 == var32) {
                                    Class3.aStringArray32[var7++] = var16.aString1983;
                                    continue;
                                 }

                                 if(1603 == var32) {
                                    Class3.anIntArray44[var6++] = -302755437 * var16.anInt2037;
                                    continue;
                                 }

                                 if(var32 == 1604) {
                                    Class3.anIntArray44[var6++] = 177405235 * var16.anInt1949;
                                    continue;
                                 }

                                 if(1605 == var32) {
                                    Class3.anIntArray44[var6++] = var16.anInt1977 * -1472457387;
                                    continue;
                                 }

                                 if(1606 == var32) {
                                    Class3.anIntArray44[var6++] = var16.anInt1935 * 175924351;
                                    continue;
                                 }

                                 if(var32 == 1607) {
                                    Class3.anIntArray44[var6++] = var16.anInt1990 * 681145387;
                                    continue;
                                 }

                                 if(var32 == 1608) {
                                    Class3.anIntArray44[var6++] = var16.anInt2057 * 745334365;
                                    continue;
                                 }

                                 if(var32 == 1609) {
                                    Class3.anIntArray44[var6++] = -1508397471 * var16.anInt1955;
                                    continue;
                                 }
                              } else if(var32 < 1800) {
                                 var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(var32 == 1700) {
                                    Class3.anIntArray44[var6++] = var16.anInt2043 * 813479615;
                                    continue;
                                 }

                                 if(var32 == 1701) {
                                    if(-1 != 813479615 * var16.anInt2043) {
                                       Class3.anIntArray44[var6++] = var16.anInt2044 * 1393082105;
                                    } else {
                                       Class3.anIntArray44[var6++] = 0;
                                    }
                                    continue;
                                 }

                                 if(var32 == 1702) {
                                    Class3.anIntArray44[var6++] = var16.anInt1926 * 2021294259;
                                    continue;
                                 }
                              } else if(var32 < 1900) {
                                 var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 if(var32 == 1800) {
                                    Class3.anIntArray44[var6++] = Class74.method1075(Class35.method645(var16, (byte)0), -694886802);
                                    continue;
                                 }

                                 if(1801 == var32) {
                                    --var6;
                                    var17 = Class3.anIntArray44[var6];
                                    --var17;
                                    if(null != var16.aStringArray1997 && var17 < var16.aStringArray1997.length && var16.aStringArray1997[var17] != null) {
                                       Class3.aStringArray32[var7++] = var16.aStringArray1997[var17];
                                       continue;
                                    }

                                    Class3.aStringArray32[var7++] = "";
                                    continue;
                                 }

                                 if(1802 == var32) {
                                    if(var16.aString1996 == null) {
                                       Class3.aStringArray32[var7++] = "";
                                    } else {
                                       Class3.aStringArray32[var7++] = var16.aString1996;
                                    }
                                    continue;
                                 }
                              } else if((var32 < 1900 || var32 >= 2000) && (var32 < 2900 || var32 >= 3000)) {
                                 if(var32 < 2600) {
                                    --var6;
                                    var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                    if(var32 == 2500) {
                                       Class3.anIntArray44[var6++] = var16.anInt1938 * 332168295;
                                       continue;
                                    }

                                    if(var32 == 2501) {
                                       Class3.anIntArray44[var6++] = var16.anInt1939 * 1492425953;
                                       continue;
                                    }

                                    if(var32 == 2502) {
                                       Class3.anIntArray44[var6++] = var16.anInt1940 * 1645211541;
                                       continue;
                                    }

                                    if(var32 == 2503) {
                                       Class3.anIntArray44[var6++] = var16.anInt1974 * 1227800423;
                                       continue;
                                    }

                                    if(2504 == var32) {
                                       Class3.anIntArray44[var6++] = var16.aBool1945?1:0;
                                       continue;
                                    }

                                    if(2505 == var32) {
                                       Class3.anIntArray44[var6++] = var16.anInt1944 * -1652479707;
                                       continue;
                                    }
                                 } else if(var32 < 2700) {
                                    --var6;
                                    var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                    if(2600 == var32) {
                                       Class3.anIntArray44[var6++] = -352661099 * var16.anInt1946;
                                       continue;
                                    }

                                    if(2601 == var32) {
                                       Class3.anIntArray44[var6++] = -1602694527 * var16.anInt1947;
                                       continue;
                                    }

                                    if(var32 == 2602) {
                                       Class3.aStringArray32[var7++] = var16.aString1983;
                                       continue;
                                    }

                                    if(2603 == var32) {
                                       Class3.anIntArray44[var6++] = -302755437 * var16.anInt2037;
                                       continue;
                                    }

                                    if(var32 == 2604) {
                                       Class3.anIntArray44[var6++] = var16.anInt1949 * 177405235;
                                       continue;
                                    }

                                    if(2605 == var32) {
                                       Class3.anIntArray44[var6++] = -1472457387 * var16.anInt1977;
                                       continue;
                                    }

                                    if(var32 == 2606) {
                                       Class3.anIntArray44[var6++] = var16.anInt1935 * 175924351;
                                       continue;
                                    }

                                    if(2607 == var32) {
                                       Class3.anIntArray44[var6++] = var16.anInt1990 * 681145387;
                                       continue;
                                    }

                                    if(var32 == 2608) {
                                       Class3.anIntArray44[var6++] = 745334365 * var16.anInt2057;
                                       continue;
                                    }

                                    if(2609 == var32) {
                                       Class3.anIntArray44[var6++] = -1508397471 * var16.anInt1955;
                                       continue;
                                    }
                                 } else if(var32 < 2800) {
                                    if(var32 == 2700) {
                                       --var6;
                                       var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                       Class3.anIntArray44[var6++] = var16.anInt2043 * 813479615;
                                       continue;
                                    }

                                    if(var32 == 2701) {
                                       --var6;
                                       var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                       if(var16.anInt2043 * 813479615 != -1) {
                                          Class3.anIntArray44[var6++] = var16.anInt2044 * 1393082105;
                                       } else {
                                          Class3.anIntArray44[var6++] = 0;
                                       }
                                       continue;
                                    }

                                    if(var32 == 2702) {
                                       --var6;
                                       var34 = Class3.anIntArray44[var6];
                                       Class116_Sub11 var53 = (Class116_Sub11)client.aClass127_3094.method1658((long)var34);
                                       if(var53 != null) {
                                          Class3.anIntArray44[var6++] = 1;
                                       } else {
                                          Class3.anIntArray44[var6++] = 0;
                                       }
                                       continue;
                                    }

                                    if(2706 == var32) {
                                       Class3.anIntArray44[var6++] = client.anInt3200 * -1074177723;
                                       continue;
                                    }
                                 } else if(var32 < 2900) {
                                    --var6;
                                    var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                    if(var32 == 2800) {
                                       Class3.anIntArray44[var6++] = Class74.method1075(Class35.method645(var16, (byte)0), 497101623);
                                       continue;
                                    }

                                    if(var32 == 2801) {
                                       --var6;
                                       var17 = Class3.anIntArray44[var6];
                                       --var17;
                                       if(null != var16.aStringArray1997 && var17 < var16.aStringArray1997.length && null != var16.aStringArray1997[var17]) {
                                          Class3.aStringArray32[var7++] = var16.aStringArray1997[var17];
                                          continue;
                                       }

                                       Class3.aStringArray32[var7++] = "";
                                       continue;
                                    }

                                    if(var32 == 2802) {
                                       if(null == var16.aString1996) {
                                          Class3.aStringArray32[var7++] = "";
                                       } else {
                                          Class3.aStringArray32[var7++] = var16.aString1996;
                                       }
                                       continue;
                                    }
                                 } else {
                                    int var23;
                                    int var49;
                                    int var63;
                                    if(var32 < 3200) {
                                       if(3100 == var32) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          Class86.appendMessage(0, "", var84, -75762742);
                                          continue;
                                       }

                                       if(3101 == var32) {
                                          var6 -= 2;
                                          Class53.method792(Class79.aPlayer_909, Class3.anIntArray44[var6], Class3.anIntArray44[1 + var6], (byte)99);
                                          continue;
                                       }

                                       if(var32 == 3103) {
                                          ISAAC.method794((short) -1316);
                                          continue;
                                       }

                                       boolean var43;
                                       if(3104 == var32) {
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

                                       if(3105 == var32) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          client.rsaBuffer.startPacket(84, (byte) 97);
                                          client.rsaBuffer.writeByte(var84.length() + 1, -207295491);
                                          client.rsaBuffer.writeJGString(var84, 675541373);
                                          continue;
                                       }

                                       if(3106 == var32) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          client.rsaBuffer.startPacket(58, (byte) 76);
                                          client.rsaBuffer.writeByte(var84.length() + 1, -2061267376);
                                          client.rsaBuffer.writeJGString(var84, 648526036);
                                          continue;
                                       }

                                       if(var32 == 3107) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          --var7;
                                          var55 = Class3.aStringArray32[var7];
                                          var36 = Class7.anInt107 * -334270159;
                                          int[] var40 = Class7.anIntArray108;
                                          var43 = false;

                                          for(var21 = 0; var21 < var36; ++var21) {
                                             Player var22 = client.globalPlayers[var40[var21]];
                                             if(null != var22 && var22 != Class79.aPlayer_909 && var22.username != null && var22.username.equalsIgnoreCase(var55)) {
                                                if(1 == var34) {
                                                   client.rsaBuffer.startPacket(234, (byte) 92);
                                                   client.rsaBuffer.method2135(0, -788814040);
	                                                client.rsaBuffer.writeShortA(var40[var21], -1648648956);
                                                } else if(4 == var34) {
                                                   client.rsaBuffer.startPacket(83, (byte) 45);
                                                   client.rsaBuffer.writeByte(0, -1739045830);
                                                   client.rsaBuffer.writeShort(var40[var21], -2024821059);
                                                } else if(6 == var34) {
                                                   client.rsaBuffer.startPacket(4, (byte) 81);
                                                   client.rsaBuffer.writeByteC(0, 2006247516);
	                                                client.rsaBuffer.writeShortA(var40[var21], 480613106);
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

                                       if(var32 == 3108) {
                                          var6 -= 3;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[var6 + 1];
                                          var36 = Class3.anIntArray44[2 + var6];
                                          var19 = Class107.method1466(var36, 314639891);
                                          Class79.method1098(var19, var34, var17, (short)-6817);
                                          continue;
                                       }

                                       if(var32 == 3109) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[var6 + 1];
                                          var18 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                          Class79.method1098(var18, var34, var17, (short)-36);
                                          continue;
                                       }

                                       if(3110 == var32) {
                                          --var6;
                                          PlayerAlias.aBool1756 = Class3.anIntArray44[var6] == 1;
                                          continue;
                                       }

                                       if(3111 == var32) {
                                          Class3.anIntArray44[var6++] = Class116_Sub5.aClass29_1727.aBool403?1:0;
                                          continue;
                                       }

                                       if(3112 == var32) {
                                          --var6;
                                          Class116_Sub5.aClass29_1727.aBool403 = Class3.anIntArray44[var6] == 1;
                                          Class86.method1167((byte)-62);
                                          continue;
                                       }

                                       if(3113 == var32) {
                                          --var7;
                                          var84 = Class3.aStringArray32[var7];
                                          --var6;
                                          var56 = Class3.anIntArray44[var6] == 1;
                                          Friend.method1839(var84, var56, "openjs", false, (byte) -98);
                                          continue;
                                       }

                                       if(3115 == var32) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          client.rsaBuffer.startPacket(160, (byte) 39);
                                          client.rsaBuffer.writeShort(var34, -1979866556);
                                          continue;
                                       }

                                       if(var32 == 3116) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
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
                                    } else if(var32 < 3300) {
                                       if(var32 == 3200) {
                                          var6 -= 3;
                                          TileObj5.method698(Class3.anIntArray44[var6], Class3.anIntArray44[var6 + 1], Class3.anIntArray44[2 + var6], 1880586392);
                                          continue;
                                       }

                                       if(3201 == var32) {
                                          --var6;
                                          Class26.method535(Class3.anIntArray44[var6], (byte)-86);
                                          continue;
                                       }

                                       if(var32 == 3202) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          int var10000 = Class3.anIntArray44[1 + var6];
                                          if(-1994948003 * client.anInt3171 != 0 && var34 != -1) {
                                             Class80.method1099(Class108.aClass99_Sub1_1471, var34, 0, client.anInt3171 * -1994948003, false, (short)21645);
                                             client.aBool3159 = true;
                                          }
                                          continue;
                                       }
                                    } else if(var32 < 3400) {
                                       if(3300 == var32) {
                                          Class3.anIntArray44[var6++] = -1040073859 * client.anInt2943;
                                          continue;
                                       }

                                       Class116_Sub10 var52;
                                       if(3301 == var32) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[1 + var6];
                                          var45 = Class3.anIntArray44;
                                          var46 = var6++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aClass127_1803.method1658((long)var34);
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

                                       if(3302 == var32) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[1 + var6];
                                          Class3.anIntArray44[var6++] = Class45.method714(var34, var17, -1870921613);
                                          continue;
                                       }

                                       if(var32 == 3303) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[1 + var6];
                                          var45 = Class3.anIntArray44;
                                          var46 = var6++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aClass127_1803.method1658((long)var34);
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

                                       if(var32 == 3304) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = Class103.method1448(var34, -1095058151).anInt2278 * -612948537;
                                          continue;
                                       }

                                       if(var32 == 3305) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = client.anIntArray2953[var34];
                                          continue;
                                       }

                                       if(var32 == 3306) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = client.anIntArray2951[var34];
                                          continue;
                                       }

                                       if(var32 == 3307) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = client.anIntArray3108[var34];
                                          continue;
                                       }

                                       if(3308 == var32) {
                                          var34 = Class116_Sub11.anInt1819 * -747958745;
	                                       var17 = 1426698711 * Class116_Sub17.clickX + (1272643751 * Class79.aPlayer_909.anInt2609 >> 7);
	                                       var36 = (Class79.aPlayer_909.anInt2579 * -1801433343 >> 7) + Class33.clickY * 714823515;
	                                       Class3.anIntArray44[var6++] = (var17 << 14) + (var34 << 28) + var36;
                                          continue;
                                       }

                                       if(3309 == var32) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = var34 >> 14 & 16383;
                                          continue;
                                       }

                                       if(3310 == var32) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = var34 >> 28;
                                          continue;
                                       }

                                       if(var32 == 3311) {
                                          --var6;
                                          var34 = Class3.anIntArray44[var6];
                                          Class3.anIntArray44[var6++] = var34 & 16383;
                                          continue;
                                       }

                                       if(var32 == 3312) {
                                          Class3.anIntArray44[var6++] = client.aBool2936?1:0;
                                          continue;
                                       }

                                       if(3313 == var32) {
                                          var6 -= 2;
                                          var34 = '\u8000' + Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[1 + var6];
                                          var45 = Class3.anIntArray44;
                                          var46 = var6++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aClass127_1803.method1658((long)var34);
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

                                       if(3314 == var32) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6] + '\u8000';
                                          var17 = Class3.anIntArray44[var6 + 1];
                                          Class3.anIntArray44[var6++] = Class45.method714(var34, var17, 1092133066);
                                          continue;
                                       }

                                       if(3315 == var32) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6] + '\u8000';
                                          var17 = Class3.anIntArray44[var6 + 1];
                                          var45 = Class3.anIntArray44;
                                          var46 = var6++;
                                          var52 = (Class116_Sub10)Class116_Sub10.aClass127_1803.method1658((long)var34);
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

                                       if(var32 == 3316) {
                                          if(client.playerRights * 1520983779 >= 2) {
                                             Class3.anIntArray44[var6++] = client.playerRights * 1520983779;
                                          } else {
                                             Class3.anIntArray44[var6++] = 0;
                                          }
                                          continue;
                                       }

                                       if(var32 == 3317) {
                                          Class3.anIntArray44[var6++] = client.anInt3157 * 210138957;
                                          continue;
                                       }

                                       if(var32 == 3318) {
                                          Class3.anIntArray44[var6++] = -1631311031 * client.anInt3115;
                                          continue;
                                       }

                                       if(3321 == var32) {
                                          Class3.anIntArray44[var6++] = client.anInt3098 * -1005815685;
                                          continue;
                                       }

                                       if(var32 == 3322) {
                                          Class3.anIntArray44[var6++] = -1944031695 * client.anInt3099;
                                          continue;
                                       }

                                       if(3323 == var32) {
                                          if(client.aBool3147) {
                                             Class3.anIntArray44[var6++] = 1;
                                          } else {
                                             Class3.anIntArray44[var6++] = 0;
                                          }
                                          continue;
                                       }

                                       if(var32 == 3324) {
                                          Class3.anIntArray44[var6++] = client.anInt2933 * 1115656689;
                                          continue;
                                       }
                                    } else if(var32 < 3500) {
                                       if(var32 == 3400) {
                                          var6 -= 2;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[1 + var6];
                                          Class116_Sub23_Sub5 var54 = ObjectDefinition.method2437(var34, (byte) 92);
                                          if(var54.aChar2268 != 115) {
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

                                       if(var32 == 3408) {
                                          var6 -= 4;
                                          var34 = Class3.anIntArray44[var6];
                                          var17 = Class3.anIntArray44[var6 + 1];
                                          var36 = Class3.anIntArray44[var6 + 2];
                                          var46 = Class3.anIntArray44[var6 + 3];
                                          Class116_Sub23_Sub5 var67 = ObjectDefinition.method2437(var36, (byte) 52);
                                          if(var34 == var67.aChar2269 && var67.aChar2268 == var17) {
                                             for(var21 = 0; var21 < var67.anInt2265 * 557176427; ++var21) {
                                                if(var46 == var67.anIntArray2272[var21]) {
                                                   if(115 == var17) {
                                                      Class3.aStringArray32[var7++] = var67.aStringArray2274[var21];
                                                   } else {
                                                      Class3.anIntArray44[var6++] = var67.anIntArray2273[var21];
                                                   }

                                                   var67 = null;
                                                   break;
                                                }
                                             }

                                             if(null != var67) {
                                                if(var17 == 115) {
                                                   Class3.aStringArray32[var7++] = var67.aString2275;
                                                } else {
                                                   Class3.anIntArray44[var6++] = -901678785 * var67.anInt2271;
                                                }
                                             }
                                             continue;
                                          }

                                          if(var17 == 115) {
                                             Class3.aStringArray32[var7++] = "null";
                                          } else {
                                             Class3.anIntArray44[var6++] = 0;
                                          }
                                          continue;
                                       }
                                    } else {
                                       String var61;
                                       if(var32 < 3700) {
                                          if(3600 == var32) {
                                             if(0 == client.anInt3203 * -923448785) {
                                                Class3.anIntArray44[var6++] = -2;
                                             } else if(1 == client.anInt3203 * -923448785) {
                                                Class3.anIntArray44[var6++] = -1;
                                             } else {
                                                Class3.anIntArray44[var6++] = client.anInt3152 * -1616775607;
                                             }
                                             continue;
                                          }

                                          if(var32 == 3601) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(client.anInt3203 * -923448785 == 2 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.aStringArray32[var7++] = client.aClass50Array3204[var34].aString670;
                                                Class3.aStringArray32[var7++] = client.aClass50Array3204[var34].aString676;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3602 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(2 == client.anInt3203 * -923448785 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.anIntArray44[var6++] = client.aClass50Array3204[var34].anInt666 * -698428043;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = 0;
                                             continue;
                                          }

                                          if(3603 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(-923448785 * client.anInt3203 == 2 && var34 < -1616775607 * client.anInt3152) {
                                                Class3.anIntArray44[var6++] = 1241458911 * client.aClass50Array3204[var34].anInt668;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = 0;
                                             continue;
                                          }

                                          if(3604 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
                                             client.rsaBuffer.startPacket(62, (byte) 67);
                                             client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1120455379) + 1, -474962219);
                                             client.rsaBuffer.writeJGString(var84, 2075750967);
                                             client.rsaBuffer.method2135(var17, -996040580);
                                             continue;
                                          }

                                          Class24 var64;
                                          Class50 var66;
                                          String var68;
                                          if(var32 == 3605) {
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
                                                   var68 = Class116_Sub23_Sub15.method2702(var66.aString670, Class59_Sub1.aClass143_1831, 792628251);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(30, "", var84 + Class91.aString1214, 1520403270);
                                                      continue label3080;
                                                   }

                                                   if(var66.aString676 != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var66.aString676, Class59_Sub1.aClass143_1831, 12178944);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(30, "", var84 + Class91.aString1214, -1150459998);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                for(var36 = 0; var36 < client.anInt3206 * 1820302153; ++var36) {
                                                   var64 = client.aClass24Array3207[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var64.aString345, Class59_Sub1.aClass143_1831, -698620231);
                                                   if(null != var68 && var68.equals(var55)) {
                                                      Class86.appendMessage(30, "", Class91.aString1219 + var84 + Class91.aString1220, -1835959094);
                                                      continue label3080;
                                                   }

                                                   if(null != var64.aString344) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var64.aString344, Class59_Sub1.aClass143_1831, 697105805);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(30, "", Class91.aString1219 + var84 + Class91.aString1220, -1049804126);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                if(Class116_Sub23_Sub15.method2702(Class79.aPlayer_909.username, Class59_Sub1.aClass143_1831, -147512245).equals(var55)) {
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

                                          if(3606 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class116_Sub23_Sub4.method2471(var84, -31738299);
                                             continue;
                                          }

                                          if(var32 == 3607) {
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
                                                   var68 = Class116_Sub23_Sub15.method2702(var64.aString345, Class59_Sub1.aClass143_1831, 1523642921);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(31, "", var84 + Class91.aString1216, -1460685229);
                                                      continue label3080;
                                                   }

                                                   if(var64.aString344 != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var64.aString344, Class59_Sub1.aClass143_1831, -788113340);
                                                      if(null != var61 && var61.equals(var55)) {
                                                         Class86.appendMessage(31, "", var84 + Class91.aString1216, -1647256374);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                for(var36 = 0; var36 < -1616775607 * client.anInt3152; ++var36) {
                                                   var66 = client.aClass50Array3204[var36];
                                                   var68 = Class116_Sub23_Sub15.method2702(var66.aString670, Class59_Sub1.aClass143_1831, -1312602252);
                                                   if(var68 != null && var68.equals(var55)) {
                                                      Class86.appendMessage(31, "", Class91.aString1087 + var84 + Class91.aString1222, 246529057);
                                                      continue label3080;
                                                   }

                                                   if(var66.aString676 != null) {
                                                      var61 = Class116_Sub23_Sub15.method2702(var66.aString676, Class59_Sub1.aClass143_1831, 201847740);
                                                      if(var61 != null && var61.equals(var55)) {
                                                         Class86.appendMessage(31, "", Class91.aString1087 + var84 + Class91.aString1222, 223218656);
                                                         continue label3080;
                                                      }
                                                   }
                                                }

                                                if(Class116_Sub23_Sub15.method2702(Class79.aPlayer_909.username, Class59_Sub1.aClass143_1831, 665856882).equals(var55)) {
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

                                          if(3608 == var32) {
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
                                                var68 = var64.aString345;
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

                                          if(3609 == var32) {
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

                                             Class3.anIntArray44[var6++] = Class116_Sub5.method1930(var84, false, -684129395)?1:0;
                                             continue;
                                          }

                                          String var60;
                                          String[] var92;
                                          if(3611 == var32) {
                                             if(client.aString3050 != null) {
                                                var92 = Class3.aStringArray32;
                                                var17 = var7++;
                                                var60 = client.aString3050;
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

                                          if(var32 == 3612) {
                                             if(null != client.aString3050) {
                                                Class3.anIntArray44[var6++] = -1304125287 * Class98.anInt1378;
                                             } else {
                                                Class3.anIntArray44[var6++] = 0;
                                             }
                                             continue;
                                          }

                                          if(3613 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(null != client.aString3050 && var34 < -1304125287 * Class98.anInt1378) {
                                                Class3.aStringArray32[var7++] = Class116_Sub11.aClass116_Sub7Array1820[var34].username;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3614 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(null != client.aString3050 && var34 < -1304125287 * Class98.anInt1378) {
                                                Class3.anIntArray44[var6++] = Class116_Sub11.aClass116_Sub7Array1820[var34].worldId * 1300426367;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = 0;
                                             continue;
                                          }

                                          if(var32 == 3615) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(client.aString3050 != null && var34 < -1304125287 * Class98.anInt1378) {
                                                Class3.anIntArray44[var6++] = Class116_Sub11.aClass116_Sub7Array1820[var34].clanRank;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = 0;
                                             continue;
                                          }

                                          if(3616 == var32) {
                                             Class3.anIntArray44[var6++] = Class53.currentClanKickRank;
                                             continue;
                                          }

                                          if(var32 == 3617) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(Class116_Sub11.aClass116_Sub7Array1820 != null) {
                                                client.rsaBuffer.startPacket(166, (byte) 34);
                                                client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1598119173), -876197300);
                                                client.rsaBuffer.writeJGString(var84, -610309883);
                                             }
                                             continue;
                                          }

                                          if(var32 == 3618) {
                                             Class3.anIntArray44[var6++] = client.aByte2965;
                                             continue;
                                          }

                                          if(var32 == 3619) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(!var84.equals("")) {
                                                client.rsaBuffer.startPacket(233, (byte) 80);
                                                client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -846704257), 437629603);
                                                client.rsaBuffer.writeJGString(var84, -905448115);
                                             }
                                             continue;
                                          }

                                          if(var32 == 3620) {
                                             client.rsaBuffer.startPacket(233, (byte) 47);
                                             client.rsaBuffer.writeByte(0, -1926679873);
                                             continue;
                                          }

                                          if(var32 == 3621) {
                                             if(client.anInt3203 * -923448785 == 0) {
                                                Class3.anIntArray44[var6++] = -1;
                                             } else {
                                                Class3.anIntArray44[var6++] = client.anInt3206 * 1820302153;
                                             }
                                             continue;
                                          }

                                          if(3622 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(client.anInt3203 * -923448785 != 0 && var34 < client.anInt3206 * 1820302153) {
                                                Class3.aStringArray32[var7++] = client.aClass24Array3207[var34].aString345;
                                                Class3.aStringArray32[var7++] = client.aClass24Array3207[var34].aString344;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(3623 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84.startsWith(Class51.method780(0, (short)-6393)) || var84.startsWith(Class51.method780(1, (short)-27072))) {
                                                var84 = var84.substring(7);
                                             }

                                             Class3.anIntArray44[var6++] = Class27.method568(var84, -2083371857)?1:0;
                                             continue;
                                          }

                                          if(var32 == 3624) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             if(null != Class116_Sub11.aClass116_Sub7Array1820 && var34 < -1304125287 * Class98.anInt1378 && Class116_Sub11.aClass116_Sub7Array1820[var34].username.equalsIgnoreCase(Class79.aPlayer_909.username)) {
                                                Class3.anIntArray44[var6++] = 1;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = 0;
                                             continue;
                                          }

                                          if(3625 == var32) {
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
                                       } else if(var32 < 4000) {
                                          if(3903 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = client.aClass135Array3211[var34].method1722(1836099859);
                                             continue;
                                          }

                                          if(var32 == 3904) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = client.aClass135Array3211[var34].anInt1607 * 718739463;
                                             continue;
                                          }

                                          if(3905 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = client.aClass135Array3211[var34].anInt1608 * 861377417;
                                             continue;
                                          }

                                          if(var32 == 3906) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = -794800437 * client.aClass135Array3211[var34].anInt1606;
                                             continue;
                                          }

                                          if(3907 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = -338006479 * client.aClass135Array3211[var34].anInt1611;
                                             continue;
                                          }

                                          if(3908 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = 1791988527 * client.aClass135Array3211[var34].anInt1610;
                                             continue;
                                          }

                                          if(3910 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = client.aClass135Array3211[var34].method1734(873699554);
                                             Class3.anIntArray44[var6++] = var17 == 0?1:0;
                                             continue;
                                          }

                                          if(var32 == 3911) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = client.aClass135Array3211[var34].method1734(-676855004);
                                             Class3.anIntArray44[var6++] = var17 == 2?1:0;
                                             continue;
                                          }

                                          if(3912 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = client.aClass135Array3211[var34].method1734(1848281085);
                                             Class3.anIntArray44[var6++] = 5 == var17?1:0;
                                             continue;
                                          }

                                          if(3913 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = client.aClass135Array3211[var34].method1734(-548651068);
                                             Class3.anIntArray44[var6++] = var17 == 1?1:0;
                                             continue;
                                          }

                                          boolean var98;
                                          if(var32 == 3914) {
                                             --var6;
                                             var98 = Class3.anIntArray44[var6] == 1;
                                             if(null != Class81.aClass132_928) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1593, var98, 623654685);
                                             }
                                             continue;
                                          }

                                          if(var32 == 3915) {
                                             --var6;
                                             var98 = Class3.anIntArray44[var6] == 1;
                                             if(null != Class81.aClass132_928) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1592, var98, -16447163);
                                             }
                                             continue;
                                          }

                                          if(var32 == 3916) {
                                             var6 -= 2;
                                             var98 = Class3.anIntArray44[var6] == 1;
                                             var56 = Class3.anIntArray44[1 + var6] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(new Class45(var56), var98, 1936102160);
                                             }
                                             continue;
                                          }

                                          if(var32 == 3917) {
                                             --var6;
                                             var98 = Class3.anIntArray44[var6] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1591, var98, 607130422);
                                             }
                                             continue;
                                          }

                                          if(3918 == var32) {
                                             --var6;
                                             var98 = Class3.anIntArray44[var6] == 1;
                                             if(Class81.aClass132_928 != null) {
                                                Class81.aClass132_928.method1705(Class132.aComparator1595, var98, 1813291901);
                                             }
                                             continue;
                                          }

                                          if(3919 == var32) {
                                             Class3.anIntArray44[var6++] = Class81.aClass132_928 == null?0:Class81.aClass132_928.aList1594.size();
                                             continue;
                                          }

                                          Class133 var76;
                                          if(var32 == 3920) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.anIntArray44[var6++] = var76.anInt1601 * 752101567;
                                             continue;
                                          }

                                          if(3921 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.aStringArray32[var7++] = var76.method1711(-1146535837);
                                             continue;
                                          }

                                          if(var32 == 3922) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.aStringArray32[var7++] = var76.method1710(736981672);
                                             continue;
                                          }

                                          if(var32 == 3923) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             long var27 = Class116_Sub5.method1929(-1458935439) - 8991659602621826001L * Class52.aLong687 - -3596478625201456337L * var76.aLong1599;
                                             var50 = (int)(var27 / 3600000L);
                                             var21 = (int)((var27 - (long)(var50 * 3600000)) / 60000L);
                                             var49 = (int)((var27 - (long)(3600000 * var50) - (long)(var21 * '\uea60')) / 1000L);
                                             String var59 = var50 + ":" + var21 / 10 + var21 % 10 + ":" + var49 / 10 + var49 % 10;
                                             Class3.aStringArray32[var7++] = var59;
                                             continue;
                                          }

                                          if(3924 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.anIntArray44[var6++] = var76.aClass135_1598.anInt1606 * -794800437;
                                             continue;
                                          }

                                          if(3925 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.anIntArray44[var6++] = var76.aClass135_1598.anInt1608 * 861377417;
                                             continue;
                                          }

                                          if(var32 == 3926) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var76 = (Class133)Class81.aClass132_928.aList1594.get(var34);
                                             Class3.anIntArray44[var6++] = 718739463 * var76.aClass135_1598.anInt1607;
                                             continue;
                                          }
                                       } else if(var32 < 4100) {
                                          if(var32 == 4000) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 + var17;
                                             continue;
                                          }

                                          if(var32 == 4001) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 - var17;
                                             continue;
                                          }

                                          if(var32 == 4002) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 * var17;
                                             continue;
                                          }

                                          if(var32 == 4003) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[1 + var6];
                                             Class3.anIntArray44[var6++] = var34 / var17;
                                             continue;
                                          }

                                          if(4004 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = (int)(Math.random() * (double)var34);
                                             continue;
                                          }

                                          if(4005 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = (int)(Math.random() * (double)(var34 + 1));
                                             continue;
                                          }

                                          if(4006 == var32) {
                                             var6 -= 5;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             var36 = Class3.anIntArray44[2 + var6];
                                             var46 = Class3.anIntArray44[3 + var6];
                                             var50 = Class3.anIntArray44[4 + var6];
                                             Class3.anIntArray44[var6++] = (var50 - var36) * (var17 - var34) / (var46 - var36) + var34;
                                             continue;
                                          }

                                          if(4007 == var32) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 * var17 / 100 + var34;
                                             continue;
                                          }

                                          if(4008 == var32) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 | 1 << var17;
                                             continue;
                                          }

                                          if(var32 == 4009) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 & -1 - (1 << var17);
                                             continue;
                                          }

                                          if(var32 == 4010) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = 0 != (var34 & 1 << var17)?1:0;
                                             continue;
                                          }

                                          if(var32 == 4011) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 % var17;
                                             continue;
                                          }

                                          if(var32 == 4012) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             if(var34 == 0) {
                                                Class3.anIntArray44[var6++] = 0;
                                             } else {
                                                Class3.anIntArray44[var6++] = (int)Math.pow((double)var34, (double)var17);
                                             }
                                             continue;
                                          }

                                          if(4013 == var32) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[1 + var6];
                                             if(0 == var34) {
                                                Class3.anIntArray44[var6++] = 0;
                                             } else if(var17 == 0) {
                                                Class3.anIntArray44[var6++] = Integer.MAX_VALUE;
                                             } else {
                                                Class3.anIntArray44[var6++] = (int)Math.pow((double)var34, 1.0D / (double)var17);
                                             }
                                             continue;
                                          }

                                          if(var32 == 4014) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 & var17;
                                             continue;
                                          }

                                          if(var32 == 4015) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class3.anIntArray44[var6++] = var34 | var17;
                                             continue;
                                          }
                                       } else if(var32 < 4200) {
                                          if(4100 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
                                             Class3.aStringArray32[var7++] = var84 + var17;
                                             continue;
                                          }

                                          if(4101 == var32) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             Class3.aStringArray32[var7++] = var84 + var55;
                                             continue;
                                          }

                                          if(var32 == 4102) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
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

                                          if(var32 == 4103) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class3.aStringArray32[var7++] = var84.toLowerCase();
                                             continue;
                                          }

                                          if(4104 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             long var29 = ((long)var34 + 11745L) * 86400000L;
                                             Class3.aCalendar37.setTime(new Date(var29));
                                             var46 = Class3.aCalendar37.get(5);
                                             var50 = Class3.aCalendar37.get(2);
                                             var21 = Class3.aCalendar37.get(1);
                                             Class3.aStringArray32[var7++] = var46 + "-" + Class3.aStringArray38[var50] + "-" + var21;
                                             continue;
                                          }

                                          if(var32 == 4105) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             if(Class79.aPlayer_909.aClass108_2881 != null && Class79.aPlayer_909.aClass108_2881.aBool1464) {
                                                Class3.aStringArray32[var7++] = var55;
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = var84;
                                             continue;
                                          }

                                          if(4106 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.aStringArray32[var7++] = Integer.toString(var34);
                                             continue;
                                          }

                                          if(4107 == var32) {
                                             var7 -= 2;
                                             Class3.anIntArray44[var6++] = Buffer.method2018(Friend.method1838(Class3.aStringArray32[var7], Class3.aStringArray32[var7 + 1], -1025678859 * client.anInt2938, (byte) 1), (byte) 45);
                                             continue;
                                          }

                                          byte[] var72;
                                          Class116_Sub23_Sub19_Sub4_Sub1 var80;
                                          if(var32 == 4108) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             var6 -= 2;
                                             var17 = Class3.anIntArray44[var6];
                                             var36 = Class3.anIntArray44[var6 + 1];
                                             var72 = Class2.aClass99_Sub1_12.method1394(var36, 0, -900759660);
                                             var80 = new Class116_Sub23_Sub19_Sub4_Sub1(var72);
                                             Class3.anIntArray44[var6++] = var80.method3458(var84, var17);
                                             continue;
                                          }

                                          if(var32 == 4109) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             var6 -= 2;
                                             var17 = Class3.anIntArray44[var6];
                                             var36 = Class3.anIntArray44[var6 + 1];
                                             var72 = Class2.aClass99_Sub1_12.method1394(var36, 0, -885565136);
                                             var80 = new Class116_Sub23_Sub19_Sub4_Sub1(var72);
                                             Class3.anIntArray44[var6++] = var80.method3457(var84, var17);
                                             continue;
                                          }

                                          if(var32 == 4110) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             --var6;
                                             if(Class3.anIntArray44[var6] == 1) {
                                                Class3.aStringArray32[var7++] = var84;
                                             } else {
                                                Class3.aStringArray32[var7++] = var55;
                                             }
                                             continue;
                                          }

                                          if(var32 == 4111) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             Class3.aStringArray32[var7++] = TextDrawingArea.method3459(var84);
                                             continue;
                                          }

                                          if(4112 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
                                             Class3.aStringArray32[var7++] = var84 + (char)var17;
                                             continue;
                                          }

                                          char var79;
                                          if(var32 == 4113) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var90 = Class3.anIntArray44;
                                             var36 = var6++;
                                             var79 = (char)var34;
                                             if(var79 >= 32 && var79 <= 126) {
                                                var42 = true;
                                             } else if(var79 >= 160 && var79 <= 255) {
                                                var42 = true;
                                             } else
	                                             var42 = !(var79 != 8364 && var79 != 338 && var79 != 8212 && 339 != var79 && var79 != 376);

                                             var90[var36] = var42?1:0;
                                             continue;
                                          }

                                          if(var32 == 4114) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var90 = Class3.anIntArray44;
                                             var36 = var6++;
                                             var79 = (char)var34;
                                             var42 = var79 >= 48 && var79 <= 57 || var79 >= 65 && var79 <= 90 || var79 >= 97 && var79 <= 122;
                                             var90[var36] = var42?1:0;
                                             continue;
                                          }

                                          if(4115 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Tile.method1986((char) var34, -51164715)?1:0;
                                             continue;
                                          }

                                          if(4116 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = BasicTimer.method2217((char) var34, 1968901295)?1:0;
                                             continue;
                                          }

                                          if(var32 == 4117) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             if(var84 != null) {
                                                Class3.anIntArray44[var6++] = var84.length();
                                             } else {
                                                Class3.anIntArray44[var6++] = 0;
                                             }
                                             continue;
                                          }

                                          if(var32 == 4118) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             var6 -= 2;
                                             var17 = Class3.anIntArray44[var6];
                                             var36 = Class3.anIntArray44[1 + var6];
                                             Class3.aStringArray32[var7++] = var84.substring(var17, var36);
                                             continue;
                                          }

                                          if(4119 == var32) {
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

                                          if(var32 == 4120) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = var84.indexOf(var17);
                                             continue;
                                          }

                                          if(4121 == var32) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[1 + var7];
                                             --var6;
                                             var36 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = var84.indexOf(var55, var36);
                                             continue;
                                          }
                                       } else if(var32 < 4300) {
                                          if(var32 == 4200) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.aStringArray32[var7++] = Class50.method778(var34, (byte)70).aString2361;
                                             continue;
                                          }

                                          Class116_Sub23_Sub11 var75;
                                          if(var32 == 4201) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[1 + var6];
                                             var75 = Class50.method778(var34, (byte)70);
                                             if(var17 >= 1 && var17 <= 5 && var75.aStringArray2391[var17 - 1] != null) {
                                                Class3.aStringArray32[var7++] = var75.aStringArray2391[var17 - 1];
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(4202 == var32) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             var75 = Class50.method778(var34, (byte)70);
                                             if(var17 >= 1 && var17 <= 5 && null != var75.aStringArray2387[var17 - 1]) {
                                                Class3.aStringArray32[var7++] = var75.aStringArray2387[var17 - 1];
                                                continue;
                                             }

                                             Class3.aStringArray32[var7++] = "";
                                             continue;
                                          }

                                          if(4203 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class50.method778(var34, (byte)70).anInt2365 * 60742695;
                                             continue;
                                          }

                                          if(4204 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class50.method778(var34, (byte)70).anInt2372 * 1303294175 == 1?1:0;
                                             continue;
                                          }

                                          Class116_Sub23_Sub11 var93;
                                          if(var32 == 4205) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var93 = Class50.method778(var34, (byte)70);
                                             if(-1 == -507524473 * var93.anInt2392 && var93.anInt2399 * -322771797 >= 0) {
                                                Class3.anIntArray44[var6++] = -322771797 * var93.anInt2399;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = var34;
                                             continue;
                                          }

                                          if(var32 == 4206) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             var93 = Class50.method778(var34, (byte)70);
                                             if(-507524473 * var93.anInt2392 >= 0 && -322771797 * var93.anInt2399 >= 0) {
                                                Class3.anIntArray44[var6++] = var93.anInt2399 * -322771797;
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = var34;
                                             continue;
                                          }

                                          if(4207 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class50.method778(var34, (byte)70).aBool2374?1:0;
                                             continue;
                                          }

                                          if(4210 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
                                             var42 = var17 == 1;
                                             var38 = var84.toLowerCase();
                                             short[] var81 = new short[16];
                                             var21 = 0;
                                             var49 = 0;

                                             while(true) {
                                                if(var49 >= Class14.anInt216 * -1396045331) {
                                                   Class71.aShortArray859 = var81;
                                                   Class29.anInt411 = 0;
                                                   Class116_Sub23_Sub16_Sub3.anInt2642 = var21 * -980225491;
                                                   String[] var65 = new String[-845664859 * Class116_Sub23_Sub16_Sub3.anInt2642];

                                                   for(var23 = 0; var23 < Class116_Sub23_Sub16_Sub3.anInt2642 * -845664859; ++var23) {
                                                      var65[var23] = Class50.method778(var81[var23], (byte)70).aString2361;
                                                   }

                                                   Class76.method1079(var65, Class71.aShortArray859, 796115173);
                                                   break;
                                                }

                                                Class116_Sub23_Sub11 var62 = Class50.method778(var49, (byte)70);
                                                if((!var42 || var62.aBool2380) && -1 == -507524473 * var62.anInt2392 && var62.aString2361.toLowerCase().indexOf(var38) != -1) {
                                                   if(var21 >= 250) {
                                                      Class116_Sub23_Sub16_Sub3.anInt2642 = 980225491;
                                                      Class71.aShortArray859 = null;
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

                                             Class3.anIntArray44[var6++] = -845664859 * Class116_Sub23_Sub16_Sub3.anInt2642;
                                             continue;
                                          }

                                          if(4211 == var32) {
                                             if(Class71.aShortArray859 != null && Class29.anInt411 * -2003486467 < Class116_Sub23_Sub16_Sub3.anInt2642 * -845664859) {
                                                Class3.anIntArray44[var6++] = Class71.aShortArray859[(Class29.anInt411 += -1453677483) * -2003486467 - 1] & '\uffff';
                                                continue;
                                             }

                                             Class3.anIntArray44[var6++] = -1;
                                             continue;
                                          }

                                          if(4212 == var32) {
                                             Class29.anInt411 = 0;
                                             continue;
                                          }
                                       } else if(var32 < 5100) {
                                          if(5000 == var32) {
                                             Class3.anIntArray44[var6++] = client.anInt3064 * -400704361;
                                             continue;
                                          }

                                          if(5001 == var32) {
                                             var6 -= 3;
                                             client.anInt3064 = -677280985 * Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
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

                                             client.anInt3150 = -1946178403 * Class3.anIntArray44[2 + var6];
                                             client.rsaBuffer.startPacket(44, (byte) 37);
                                             client.rsaBuffer.writeByte(-400704361 * client.anInt3064, -1727845501);
                                             client.rsaBuffer.writeByte(Class33.aClass62_449.anInt799 * -1916029001, -884411018);
                                             client.rsaBuffer.writeByte(-1975764555 * client.anInt3150, -314440789);
                                             continue;
                                          }

                                          if(5002 == var32) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             var6 -= 2;
                                             var17 = Class3.anIntArray44[var6];
                                             var36 = Class3.anIntArray44[var6 + 1];
                                             client.rsaBuffer.startPacket(71, (byte) 79);
                                             client.rsaBuffer.writeByte(Class22.calculateJGString(var84, -1810258257) + 2, -1981958345);
                                             client.rsaBuffer.writeJGString(var84, 1816099369);
                                             client.rsaBuffer.writeByte(var17 - 1, -1201088172);
                                             client.rsaBuffer.writeByte(var36, -215749679);
                                             continue;
                                          }

                                          if(5003 == var32) {
                                             var6 -= 2;
                                             var34 = Class3.anIntArray44[var6];
                                             var17 = Class3.anIntArray44[var6 + 1];
                                             Class5 var88 = (Class5)Class37.aMap498.get(Integer.valueOf(var34));
                                             ChatMessage var82 = var88.method57(var17, 1427361631);
                                             if(var82 != null) {
                                                Class3.anIntArray44[var6++] = -1699577047 * var82.anInt2342;
                                                Class3.anIntArray44[var6++] = var82.anInt2343 * -1486341595;
                                                Class3.aStringArray32[var7++] = null != var82.aString2350?var82.aString2350:"";
                                                Class3.aStringArray32[var7++] = null != var82.aString2346?var82.aString2346:"";
                                                Class3.aStringArray32[var7++] = var82.aString2347 != null?var82.aString2347:"";
                                             } else {
                                                Class3.anIntArray44[var6++] = -1;
                                                Class3.anIntArray44[var6++] = 0;
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }

                                          if(5004 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             ChatMessage var96 = Class85.method1137(var34, 1929517952);
                                             if(null != var96) {
                                                Class3.anIntArray44[var6++] = var96.anInt2344 * 555619737;
                                                Class3.anIntArray44[var6++] = var96.anInt2343 * -1486341595;
                                                Class3.aStringArray32[var7++] = null != var96.aString2350?var96.aString2350:"";
                                                Class3.aStringArray32[var7++] = var96.aString2346 != null?var96.aString2346:"";
                                                Class3.aStringArray32[var7++] = var96.aString2347 != null?var96.aString2347:"";
                                             } else {
                                                Class3.anIntArray44[var6++] = -1;
                                                Class3.anIntArray44[var6++] = 0;
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                                Class3.aStringArray32[var7++] = "";
                                             }
                                             continue;
                                          }

                                          if(5005 == var32) {
                                             if(null == Class33.aClass62_449) {
                                                Class3.anIntArray44[var6++] = -1;
                                             } else {
                                                Class3.anIntArray44[var6++] = Class33.aClass62_449.anInt799 * -1916029001;
                                             }
                                             continue;
                                          }

                                          if(var32 == 5008) {
                                             --var7;
                                             var84 = Class3.aStringArray32[var7];
                                             --var6;
                                             var17 = Class3.anIntArray44[var6];
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

                                          if(var32 == 5009) {
                                             var7 -= 2;
                                             var84 = Class3.aStringArray32[var7];
                                             var55 = Class3.aStringArray32[var7 + 1];
                                             client.rsaBuffer.startPacket(248, (byte) 89);
                                             client.rsaBuffer.writeShort(0, -1637305146);
                                             var36 = 314639891 * client.rsaBuffer.position;
                                             client.rsaBuffer.writeJGString(var84, 516581426);
                                             BitBuffer var77 = client.rsaBuffer;
                                             var50 = 314639891 * var77.position;
                                             byte[] var69 = Class64.method938(var55, (byte)-100);
                                             var77.writeSmart(var69.length, 720272980);
                                             var77.position += client.aClass52_1621.method789(var69, 0, var69.length, var77.payload, var77.position * 314639891, -2144817348) * -184175589;
                                             client.rsaBuffer.method2000(314639891 * client.rsaBuffer.position - var36, (byte)63);
                                             continue;
                                          }

                                          if(5015 == var32) {
                                             if(null != Class79.aPlayer_909 && Class79.aPlayer_909.username != null) {
                                                var84 = Class79.aPlayer_909.username;
                                             } else {
                                                var84 = "";
                                             }

                                             Class3.aStringArray32[var7++] = var84;
                                             continue;
                                          }

                                          if(5016 == var32) {
                                             Class3.anIntArray44[var6++] = -1975764555 * client.anInt3150;
                                             continue;
                                          }

                                          if(var32 == 5017) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class116_Sub23_Sub20.method2979(var34, 44112760);
                                             continue;
                                          }

                                          if(5018 == var32) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class103.method1454(var34, (byte)44);
                                             continue;
                                          }

                                          if(var32 == 5019) {
                                             --var6;
                                             var34 = Class3.anIntArray44[var6];
                                             Class3.anIntArray44[var6++] = Class25.method533(var34, -1706974434);
                                             continue;
                                          }

                                          if(var32 == 5020) {
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

                                          if(5021 == var32) {
                                             --var7;
                                             client.aString2985 = Class3.aStringArray32[var7].toLowerCase().trim();
                                             continue;
                                          }

                                          if(5022 == var32) {
                                             Class3.aStringArray32[var7++] = client.aString2985;
                                             continue;
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 if(var32 >= 2000) {
                                    var32 -= 1000;
                                    --var6;
                                    var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                                 } else {
                                    var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                                 }

                                 if(var32 == 1927) {
                                    if(Class3.anInt39 * -1024934675 >= 10) {
                                       throw new RuntimeException();
                                    }

                                    if(null == var16.anObjectArray2032) {
                                       return;
                                    }

                                    Class116_Sub6 var51 = new Class116_Sub6();
                                    var51.aClass116_Sub15_1736 = var16;
                                    var51.anObjectArray1737 = var16.anObjectArray2032;
                                    var51.anInt1744 = Class3.anInt39 * 189385479 + 1898945859;
                                    client.aClass117_3132.method1571(var0);
                                    continue;
                                 }
                              }
                           } else {
                              if(var32 >= 2000) {
                                 var32 -= 1000;
                                 --var6;
                                 var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                              } else {
                                 var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                              }

                              if(var32 == 1300) {
                                 --var6;
                                 var17 = Class3.anIntArray44[var6] - 1;
                                 if(var17 >= 0 && var17 <= 9) {
                                    --var7;
                                    var16.method2257(var17, Class3.aStringArray32[var7], -20681167);
                                    continue;
                                 }

                                 --var7;
                                 continue;
                              }

                              if(var32 == 1301) {
                                 var6 -= 2;
                                 var17 = Class3.anIntArray44[var6];
                                 var36 = Class3.anIntArray44[1 + var6];
                                 var16.aClass116_Sub15_1998 = AbstractRSDrawing.method339(var17, var36, 446603275);
                                 continue;
                              }

                              if(var32 == 1302) {
                                 --var6;
                                 var16.aBool2021 = Class3.anIntArray44[var6] == 1;
                                 continue;
                              }

                              if(var32 == 1303) {
                                 --var6;
                                 var16.anInt1999 = Class3.anIntArray44[var6] * -172520565;
                                 continue;
                              }

                              if(var32 == 1304) {
                                 --var6;
                                 var16.anInt1965 = Class3.anIntArray44[var6] * -77181551;
                                 continue;
                              }

                              if(var32 == 1305) {
                                 --var7;
                                 var16.aString1996 = Class3.aStringArray32[var7];
                                 continue;
                              }

                              if(var32 == 1306) {
                                 --var7;
                                 var16.aString2002 = Class3.aStringArray32[var7];
                                 continue;
                              }

                              if(var32 == 1307) {
                                 var16.aStringArray1997 = null;
                                 continue;
                              }
                           }
                        } else {
                           if(var32 >= 2000) {
                              var32 -= 1000;
                              --var6;
                              var16 = Class107.method1466(Class3.anIntArray44[var6], 314639891);
                           } else {
                              var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                           }

                           Class79.method1097(var16, 1020972985);
                           if(1200 == var32 || var32 == 1205 || var32 == 1212) {
                              var6 -= 2;
                              var17 = Class3.anIntArray44[var6];
                              var36 = Class3.anIntArray44[var6 + 1];
                              var16.anInt2043 = -444483265 * var17;
                              var16.anInt2044 = var36 * 1567728457;
                              Class116_Sub23_Sub11 var39 = Class50.method778(var17, (byte)70);
                              var16.anInt1935 = var39.anInt2367 * 1778672027;
                              var16.anInt2057 = var39.anInt2368 * -438177483;
                              var16.anInt1990 = 292702103 * var39.anInt2393;
                              var16.anInt2052 = var39.anInt2402 * 889655743;
                              var16.anInt1973 = -738298705 * var39.anInt2371;
                              var16.anInt1977 = -1079397735 * var39.anInt2396;
                              if(var32 == 1205) {
                                 var16.anInt1981 = 0;
                              } else if(1212 == var32 | 1 == 1303294175 * var39.anInt2372) {
                                 var16.anInt1981 = -1548696853;
                              } else {
                                 var16.anInt1981 = 1197573590;
                              }

                              if(var16.anInt1987 * 1501804265 > 0) {
                                 var16.anInt1977 = -438091779 * (126003872 * var16.anInt1977 / (1501804265 * var16.anInt1987));
                              } else if(var16.anInt1936 * 124195285 > 0) {
                                 var16.anInt1977 = 126003872 * var16.anInt1977 / (124195285 * var16.anInt1936) * -438091779;
                              }
                              continue;
                           }

                           if(1201 == var32) {
                              var16.anInt1975 = -752921414;
                              --var6;
                              var16.anInt1967 = Class3.anIntArray44[var6] * -541123263;
                              continue;
                           }

                           if(var32 == 1202) {
                              var16.anInt1975 = -1129382121;
                              var16.anInt1967 = Class79.aPlayer_909.aClass108_2881.method1475(-1808574700) * -541123263;
                              continue;
                           }
                        }
                     } else {
                        var17 = -1;
                        if(var32 >= 2000) {
                           var32 -= 1000;
                           --var6;
                           var17 = Class3.anIntArray44[var6];
                           var16 = Class107.method1466(var17, 314639891);
                        } else {
                           var16 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                        }

                        if(var32 == 1100) {
                           var6 -= 2;
                           var16.anInt1946 = 435089853 * Class3.anIntArray44[var6];
                           if(-352661099 * var16.anInt1946 > -302755437 * var16.anInt2037 - var16.anInt1940 * 1645211541) {
                              var16.anInt1946 = var16.anInt2037 * -539648889 - var16.anInt1940 * -1344985599;
                           }

                           if(var16.anInt1946 * -352661099 < 0) {
                              var16.anInt1946 = 0;
                           }

                           var16.anInt1947 = -1459786367 * Class3.anIntArray44[1 + var6];
                           if(var16.anInt1947 * -1602694527 > var16.anInt1949 * 177405235 - var16.anInt1974 * 1227800423) {
                              var16.anInt1947 = -1656271437 * var16.anInt1949 - -1999090201 * var16.anInt1974;
                           }

                           if(-1602694527 * var16.anInt1947 < 0) {
                              var16.anInt1947 = 0;
                           }

                           Class79.method1097(var16, -1238912106);
                           continue;
                        }

                        if(1101 == var32) {
                           --var6;
                           var16.anInt1950 = Class3.anIntArray44[var6] * 1053943595;
                           Class79.method1097(var16, -359414066);
                           continue;
                        }

                        if(var32 == 1102) {
                           --var6;
                           var16.aBool1989 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, -186349538);
                           continue;
                        }

                        if(var32 == 1103) {
                           --var6;
                           var16.anInt1955 = Class3.anIntArray44[var6] * -150375007;
                           Class79.method1097(var16, 673255645);
                           continue;
                        }

                        if(1104 == var32) {
                           --var6;
                           var16.anInt1942 = Class3.anIntArray44[var6] * -532092193;
                           Class79.method1097(var16, -708248723);
                           continue;
                        }

                        if(1105 == var32) {
                           --var6;
                           var16.anInt1958 = Class3.anIntArray44[var6] * 8452631;
                           Class79.method1097(var16, -111073555);
                           continue;
                        }

                        if(1106 == var32) {
                           --var6;
                           var16.anInt1922 = Class3.anIntArray44[var6] * -2073708251;
                           Class79.method1097(var16, 1652885825);
                           continue;
                        }

                        if(1107 == var32) {
                           --var6;
                           var16.aBool1961 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, 1617275281);
                           continue;
                        }

                        if(var32 == 1108) {
                           var16.anInt1975 = -376460707;
                           --var6;
                           var16.anInt1967 = Class3.anIntArray44[var6] * -541123263;
                           Class79.method1097(var16, -2024326573);
                           continue;
                        }

                        if(var32 == 1109) {
                           var6 -= 6;
                           var16.anInt2052 = 1821510845 * Class3.anIntArray44[var6];
                           var16.anInt1973 = 1509391427 * Class3.anIntArray44[var6 + 1];
                           var16.anInt1935 = Class3.anIntArray44[var6 + 2] * 1055873919;
                           var16.anInt2057 = -478470667 * Class3.anIntArray44[3 + var6];
                           var16.anInt1990 = Class3.anIntArray44[var6 + 4] * -1820349821;
                           var16.anInt1977 = -438091779 * Class3.anIntArray44[5 + var6];
                           Class79.method1097(var16, -1608913123);
                           continue;
                        }

                        if(var32 == 1110) {
                           --var6;
                           var36 = Class3.anIntArray44[var6];
                           if(var36 != 467073769 * var16.anInt1991) {
                              var16.anInt1991 = var36 * 1986493785;
                              var16.anInt2045 = 0;
                              var16.anInt1919 = 0;
                              Class79.method1097(var16, -121415893);
                           }
                           continue;
                        }

                        if(var32 == 1111) {
                           --var6;
                           var16.aBool1980 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, -449938691);
                           continue;
                        }

                        if(1112 == var32) {
                           --var7;
                           var38 = Class3.aStringArray32[var7];
                           if(!var38.equals(var16.aString1983)) {
                              var16.aString1983 = var38;
                              Class79.method1097(var16, -1395689492);
                           }
                           continue;
                        }

                        if(var32 == 1113) {
                           --var6;
                           var16.anInt1979 = Class3.anIntArray44[var6] * 189801909;
                           Class79.method1097(var16, -1866294782);
                           continue;
                        }

                        if(1114 == var32) {
                           var6 -= 3;
                           var16.anInt1986 = Class3.anIntArray44[var6] * 1328854359;
                           var16.anInt1943 = 252282377 * Class3.anIntArray44[var6 + 1];
                           var16.anInt1985 = -51845037 * Class3.anIntArray44[var6 + 2];
                           Class79.method1097(var16, -122666715);
                           continue;
                        }

                        if(var32 == 1115) {
                           --var6;
                           var16.aBool1988 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, 745108401);
                           continue;
                        }

                        if(1116 == var32) {
                           --var6;
                           var16.anInt2014 = Class3.anIntArray44[var6] * -1058827231;
                           Class79.method1097(var16, -1752556121);
                           continue;
                        }

                        if(1117 == var32) {
                           --var6;
                           var16.anInt1941 = Class3.anIntArray44[var6] * 1485125361;
                           Class79.method1097(var16, -1448288108);
                           continue;
                        }

                        if(var32 == 1118) {
                           --var6;
                           var16.aBool1964 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, 1903838538);
                           continue;
                        }

                        if(var32 == 1119) {
                           --var6;
                           var16.aBool2048 = Class3.anIntArray44[var6] == 1;
                           Class79.method1097(var16, 755324299);
                           continue;
                        }

                        if(1120 == var32) {
                           var6 -= 2;
                           var16.anInt2037 = -1460374373 * Class3.anIntArray44[var6];
                           var16.anInt1949 = Class3.anIntArray44[var6 + 1] * 2144421371;
                           Class79.method1097(var16, 142041289);
                           if(var17 != -1 && 0 == -1305917269 * var16.anInt2018) {
                              ObjectDefinition.method2435(Class116_Sub15.aClass116_Sub15ArrayArray1956[var17 >> 16], var16, false, -1150322053);
                           }
                           continue;
                        }

                        if(var32 == 1121) {
                           Class50.method779(var16.anInt1925 * -1536575275, var16.anInt1926 * 2021294259, (byte)8);
                           client.aClass116_Sub15_3097 = var16;
                           Class79.method1097(var16, 711144474);
                           continue;
                        }

                        if(1122 == var32) {
                           --var6;
                           var16.anInt1959 = Class3.anIntArray44[var6] * -134170007;
                           Class79.method1097(var16, -406414715);
                           continue;
                        }
                     }
                  } else {
                     var34 = -1;
                     if(var32 >= 2000) {
                        var32 -= 1000;
                        --var6;
                        var34 = Class3.anIntArray44[var6];
                        var35 = Class107.method1466(var34, 314639891);
                     } else {
                        var35 = var47?Class29.aClass116_Sub15_410:Class3.aClass116_Sub15_36;
                     }

                     if(var32 == 1000) {
                        var6 -= 4;
                        var35.anInt1934 = Class3.anIntArray44[var6] * 10986657;
                        var35.anInt2029 = -720369495 * Class3.anIntArray44[1 + var6];
                        var35.anInt1930 = Class3.anIntArray44[2 + var6] * 821393763;
                        var35.anInt1915 = -1510479807 * Class3.anIntArray44[3 + var6];
                        Class79.method1097(var35, 81549416);
                        Player.method3563(var35, 1201941158);
                        if(var34 != -1 && -1305917269 * var35.anInt2018 == 0) {
                           ObjectDefinition.method2435(Class116_Sub15.aClass116_Sub15ArrayArray1956[var34 >> 16], var35, false, 1755995007);
                        }
                        continue;
                     }

                     if(var32 == 1001) {
                        var6 -= 4;
                        var35.anInt1936 = Class3.anIntArray44[var6] * 934649725;
                        var35.anInt1937 = Class3.anIntArray44[var6 + 1] * -280898437;
                        var35.anInt1932 = -1174864481 * Class3.anIntArray44[var6 + 2];
                        var35.anInt1933 = Class3.anIntArray44[3 + var6] * -1361079889;
                        Class79.method1097(var35, -1320883898);
                        Player.method3563(var35, 1590938449);
                        if(-1 != var34 && -1305917269 * var35.anInt2018 == 0) {
                           ObjectDefinition.method2435(Class116_Sub15.aClass116_Sub15ArrayArray1956[var34 >> 16], var35, false, 598605660);
                        }
                        continue;
                     }

                     if(1003 == var32) {
                        --var6;
                        var37 = Class3.anIntArray44[var6] == 1;
                        if(var37 != var35.aBool1945) {
                           var35.aBool1945 = var37;
                           Class79.method1097(var35, -1662272604);
                        }
                        continue;
                     }

                     if(1005 == var32) {
                        --var6;
                        var35.aBool2056 = Class3.anIntArray44[var6] == 1;
                        continue;
                     }

                     if(1006 == var32) {
                        --var6;
                        var35.aBool2009 = Class3.anIntArray44[var6] == 1;
                        continue;
                     }
                  }
               }

               if(var32 < 5400) {
                  if(5306 == var32) {
                     int[] var100 = Class3.anIntArray44;
                     var17 = var6++;
                     var36 = client.aBool3140?2:1;
                     var100[var17] = var36;
                     continue;
                  }

                  if(5307 == var32) {
                     --var6;
                     var34 = Class3.anIntArray44[var6];
                     if(1 != var34 && 2 != var34) {
                        continue;
                     }

                     client.aLong2975 = 0L;
	                  client.aBool3140 = var34 >= 2;

                     Class116_Sub5.method1931(384444262);
                     if(client.loginStage * 846055547 >= 25) {
                        client.rsaBuffer.startPacket(23, (byte) 118);
                        BitBuffer var95 = client.rsaBuffer;
                        var36 = client.aBool3140?2:1;
                        var95.writeByte(var36, 833994503);
                        client.rsaBuffer.writeShort(-452716157 * Class42.clientWidth, -1970132148);
                        client.rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -1734157170);
                     }

                     Applet_Sub1.aBool2921 = true;
                     continue;
                  }

                  if(5308 == var32) {
                     Class3.anIntArray44[var6++] = Class116_Sub5.aClass29_1727.anInt405 * -1207115777;
                     continue;
                  }

                  if(var32 == 5309) {
                     --var6;
                     var34 = Class3.anIntArray44[var6];
                     if(var34 == 1 || 2 == var34) {
                        Class116_Sub5.aClass29_1727.anInt405 = -2081218561 * var34;
                        Class86.method1167((byte)-11);
                     }
                     continue;
                  }
               }

               if(var32 < 5600) {
                  if(5504 == var32) {
                     var6 -= 2;
                     var34 = Class3.anIntArray44[var6];
                     var17 = Class3.anIntArray44[1 + var6];
                     if(!client.aBool2988) {
                        client.anInt2994 = var34 * 1871674069;
                        client.anInt2929 = -571365833 * var17;
                     }
                     continue;
                  }

                  if(5505 == var32) {
                     Class3.anIntArray44[var6++] = client.anInt2994 * -1992036739;
                     continue;
                  }

                  if(var32 == 5506) {
                     Class3.anIntArray44[var6++] = -1916997753 * client.anInt2929;
                     continue;
                  }

                  if(5530 == var32) {
                     --var6;
                     var34 = Class3.anIntArray44[var6];
                     if(var34 < 0) {
                        var34 = 0;
                     }

                     client.anInt3153 = var34 * 1125013561;
                     continue;
                  }

                  if(5531 == var32) {
                     Class3.anIntArray44[var6++] = client.anInt3153 * -868608503;
                     continue;
                  }
               }

               if(var32 < 5700 && var32 == 5630) {
                  client.anInt2987 = -453788862;
               } else {
                  if(var32 < 6300) {
                     if(var32 == 6200) {
                        var6 -= 2;
                        client.aShort3146 = (short)Class3.anIntArray44[var6];
                        if(client.aShort3146 <= 0) {
                           client.aShort3146 = 256;
                        }

                        client.aShort3190 = (short)Class3.anIntArray44[var6 + 1];
                        if(client.aShort3190 <= 0) {
                           client.aShort3190 = 205;
                        }
                        continue;
                     }

                     if(6201 == var32) {
                        var6 -= 2;
                        client.aShort3191 = (short)Class3.anIntArray44[var6];
                        if(client.aShort3191 <= 0) {
                           client.aShort3191 = 256;
                        }

                        client.aShort2941 = (short)Class3.anIntArray44[1 + var6];
                        if(client.aShort2941 <= 0) {
                           client.aShort2941 = 320;
                        }
                        continue;
                     }

                     if(var32 == 6202) {
                        var6 -= 4;
                        client.aShort3193 = (short)Class3.anIntArray44[var6];
                        if(client.aShort3193 <= 0) {
                           client.aShort3193 = 1;
                        }

                        client.aShort3085 = (short)Class3.anIntArray44[1 + var6];
                        if(client.aShort3085 <= 0) {
                           client.aShort3085 = 32767;
                        } else if(client.aShort3085 < client.aShort3193) {
                           client.aShort3085 = client.aShort3193;
                        }

                        client.aShort3195 = (short)Class3.anIntArray44[2 + var6];
                        if(client.aShort3195 <= 0) {
                           client.aShort3195 = 1;
                        }

                        client.aShort3196 = (short)Class3.anIntArray44[3 + var6];
                        if(client.aShort3196 <= 0) {
                           client.aShort3196 = 32767;
                        } else if(client.aShort3196 < client.aShort3195) {
                           client.aShort3196 = client.aShort3195;
                        }
                        continue;
                     }

                     if(6203 == var32) {
                        if(null != client.aClass116_Sub15_3210) {
                           Class14.method255(0, 0, 1645211541 * client.aClass116_Sub15_3210.anInt1940, client.aClass116_Sub15_3210.anInt1974 * 1227800423, false, -946317863);
                           Class3.anIntArray44[var6++] = client.anInt3126 * 2112468213;
                           Class3.anIntArray44[var6++] = client.anInt2986 * -336695531;
                        } else {
                           Class3.anIntArray44[var6++] = -1;
                           Class3.anIntArray44[var6++] = -1;
                        }
                        continue;
                     }

                     if(6204 == var32) {
                        Class3.anIntArray44[var6++] = client.aShort3191;
                        Class3.anIntArray44[var6++] = client.aShort2941;
                        continue;
                     }

                     if(var32 == 6205) {
                        Class3.anIntArray44[var6++] = client.aShort3146;
                        Class3.anIntArray44[var6++] = client.aShort3190;
                        continue;
                     }
                  }

                  if(var32 < 6600) {
                     if(6500 == var32) {
                        Class3.anIntArray44[var6++] = Class35.method643(1002424370)?1:0;
                        continue;
                     }

                     Class27 var99;
                     if(6501 == var32) {
                        var99 = Mob.method3547((byte) 2);
                        if(null != var99) {
                           Class3.anIntArray44[var6++] = -145619359 * var99.anInt388;
                           Class3.anIntArray44[var6++] = var99.anInt380 * -1784645245;
                           Class3.aStringArray32[var7++] = var99.aString371;
                           Class3.anIntArray44[var6++] = var99.anInt385 * -1854937097;
                           Class3.anIntArray44[var6++] = var99.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var99.aString382;
                        } else {
                           Class3.anIntArray44[var6++] = -1;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.anIntArray44[var6++] = 0;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     if(6502 == var32) {
                        if(Class27.anInt387 * -1614070229 < Class27.anInt379 * -1946617791) {
                           var99 = Class27.aClass27Array374[(Class27.anInt387 += -1416261501) * -1614070229 - 1];
                        } else {
                           var99 = null;
                        }

                        if(var99 != null) {
                           Class3.anIntArray44[var6++] = var99.anInt388 * -145619359;
                           Class3.anIntArray44[var6++] = var99.anInt380 * -1784645245;
                           Class3.aStringArray32[var7++] = var99.aString371;
                           Class3.anIntArray44[var6++] = -1854937097 * var99.anInt385;
                           Class3.anIntArray44[var6++] = 215269871 * var99.anInt381;
                           Class3.aStringArray32[var7++] = var99.aString382;
                        } else {
                           Class3.anIntArray44[var6++] = -1;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.anIntArray44[var6++] = 0;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     Class27 var94;
                     if(var32 == 6506) {
                        --var6;
                        var34 = Class3.anIntArray44[var6];
                        var94 = null;

                        for(var36 = 0; var36 < -1946617791 * Class27.anInt379; ++var36) {
                           if(var34 == Class27.aClass27Array374[var36].anInt388 * -145619359) {
                              var94 = Class27.aClass27Array374[var36];
                              break;
                           }
                        }

                        if(var94 != null) {
                           Class3.anIntArray44[var6++] = var94.anInt388 * -145619359;
                           Class3.anIntArray44[var6++] = -1784645245 * var94.anInt380;
                           Class3.aStringArray32[var7++] = var94.aString371;
                           Class3.anIntArray44[var6++] = var94.anInt385 * -1854937097;
                           Class3.anIntArray44[var6++] = var94.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var94.aString382;
                        } else {
                           Class3.anIntArray44[var6++] = -1;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                           Class3.anIntArray44[var6++] = 0;
                           Class3.anIntArray44[var6++] = 0;
                           Class3.aStringArray32[var7++] = "";
                        }
                        continue;
                     }

                     if(6507 == var32) {
                        var6 -= 4;
                        var34 = Class3.anIntArray44[var6];
                        var56 = Class3.anIntArray44[1 + var6] == 1;
                        var36 = Class3.anIntArray44[2 + var6];
                        var42 = 1 == Class3.anIntArray44[3 + var6];
                        if(null != Class27.aClass27Array374) {
                           Class45.method710(0, Class27.aClass27Array374.length - 1, var34, var56, var36, var42, -871319848);
                        }
                        continue;
                     }

                     if(var32 == 6511) {
                        --var6;
                        var34 = Class3.anIntArray44[var6];
                        if(var34 >= 0 && var34 < -1946617791 * Class27.anInt379) {
                           var94 = Class27.aClass27Array374[var34];
                           Class3.anIntArray44[var6++] = -145619359 * var94.anInt388;
                           Class3.anIntArray44[var6++] = -1784645245 * var94.anInt380;
                           Class3.aStringArray32[var7++] = var94.aString371;
                           Class3.anIntArray44[var6++] = var94.anInt385 * -1854937097;
                           Class3.anIntArray44[var6++] = var94.anInt381 * 215269871;
                           Class3.aStringArray32[var7++] = var94.aString382;
                           continue;
                        }

                        Class3.anIntArray44[var6++] = -1;
                        Class3.anIntArray44[var6++] = 0;
                        Class3.aStringArray32[var7++] = "";
                        Class3.anIntArray44[var6++] = 0;
                        Class3.anIntArray44[var6++] = 0;
                        Class3.aStringArray32[var7++] = "";
                        continue;
                     }
                  }

                  throw new IllegalStateException();
               }
            }
         } catch (Exception var31) {
            StringBuilder var13 = new StringBuilder(30);
            var13.append("").append(var5.nodeId).append(" ");

            for(var14 = 1112721435 * Class3.anInt35 - 1; var14 >= 0; --var14) {
               var13.append("").append(Class3.aClass39Array33[var14].aClass116_Sub23_Sub18_515.nodeId).append(" ");
            }

            var13.append("").append(var11);
            Class90.method1192(var13.toString(), var31, 343294798);
         }
      }
   }

	abstract byte[] method919(int var1);

	abstract void method929(byte[] var1, int var2);

}
