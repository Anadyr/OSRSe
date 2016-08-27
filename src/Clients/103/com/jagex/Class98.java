package com.jagex;
import java.awt.Graphics;

public class Class98 {

   static int ccPlayerCount;
   public static Class116_Sub18 aClass116_Sub18_1381;

   static final void method1343(RSInterface[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         RSInterface var4 = var0[var3];
         if(null != var4) {
            if(var4.type * -1305917269 == 0) {
               if(null != var4.aClass116_Sub15Array1995) {
                  method1343(var4.aClass116_Sub15Array1995, var1, (byte)30);
               }

               GameInterface var5 = (GameInterface)client.overridedInterfaces.get((long) (-1536575275 * var4.hash));
               if(var5 != null) {
                  Class76.method1081(226793949 * var5.interfaceId, var1, (byte)2);
               }
            }

            Class116_Sub6 var6;
            if(var1 == 0 && var4.anObjectArray2030 != null) {
               var6 = new Class116_Sub6();
               var6.aClass116_Sub15_1736 = var4;
               var6.anObjectArray1737 = var4.anObjectArray2030;
               Friend.method1840(var6, -2008589859);
            }

            if(var1 == 1 && var4.anObjectArray2031 != null) {
               if(2021294259 * var4.anInt1926 >= 0) {
                  RSInterface var7 = Class107.getInterface(var4.hash * -1536575275, 314639891);
                  if(null == var7 || null == var7.aClass116_Sub15Array1995 || 2021294259 * var4.anInt1926 >= var7.aClass116_Sub15Array1995.length || var7.aClass116_Sub15Array1995[var4.anInt1926 * 2021294259] != var4) {
                     continue;
                  }
               }

               var6 = new Class116_Sub6();
               var6.aClass116_Sub15_1736 = var4;
               var6.anObjectArray1737 = var4.anObjectArray2031;
               Friend.method1840(var6, -2123054741);
            }
         }
      }

   }

   static final int method1344(int var0, int var1, byte var2) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   Class98() throws Throwable {
      throw new Error();
   }

   static void method1348(Class116_Sub23_Sub19_Sub4_Sub1 var0, Class116_Sub23_Sub19_Sub4_Sub1 var1, Class116_Sub23_Sub19_Sub4_Sub1 var2, boolean var3, byte var4) {
      if(var3) {
         Class6.anInt84 = 1079825139 * ((-452716157 * Class42.clientWidth - client.anInt3213 * 1468194207) / 2);
         Class6.anInt76 = Class6.anInt84 * 132725497 + 1843765198;
      }

      int var6;
      int var8;
      int var13;
      int var15;
      int var29;
      byte var32;
      int var37;
      int var40;
      int var41;
      if(Class6.worldListUp) {
         if(null == Class106.aClass116_Sub23_Sub19_Sub2Array1449) {
            Class106.aClass116_Sub23_Sub19_Sub2Array1449 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.spriteIndex, "sl_back", "", 946279962);
         }

         if(Class2.aClass116_Sub23_Sub19_Sub3Array21 == null) {
            Class2.aClass116_Sub23_Sub19_Sub3Array21 = ObjectDefinition.method2433(Class116_Sub5.spriteIndex, "sl_flags", "", (short) -1504);
         }

         if(Class37.aClass116_Sub23_Sub19_Sub3Array494 == null) {
            Class37.aClass116_Sub23_Sub19_Sub3Array494 = ObjectDefinition.method2433(Class116_Sub5.spriteIndex, "sl_arrows", "", (short) 2517);
         }

         if(Class116_Sub12.aClass116_Sub23_Sub19_Sub3Array1849 == null) {
            Class116_Sub12.aClass116_Sub23_Sub19_Sub3Array1849 = ObjectDefinition.method2433(Class116_Sub5.spriteIndex, "sl_stars", "", (short) 9);
         }

         DrawingArea.setRasterAreaColor(1933284923 * Class6.anInt84, 23, 765, 480, 0);
         DrawingArea.method2896(1933284923 * Class6.anInt84, 0, 125, 23, 12425273, 9135624);
         DrawingArea.method2896(Class6.anInt84 * 1933284923 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method3492(Class91.selectAWorld, 62 + Class6.anInt84 * 1933284923, 15, 0, -1);
         if(Class116_Sub12.aClass116_Sub23_Sub19_Sub3Array1849 != null) {
            Class116_Sub12.aClass116_Sub23_Sub19_Sub3Array1849[1].method3359(1933284923 * Class6.anInt84 + 140, 1);
            var1.method3481(Class91.aString1117, 1933284923 * Class6.anInt84 + 152, 10, 16777215, -1);
            Class116_Sub12.aClass116_Sub23_Sub19_Sub3Array1849[0].method3359(1933284923 * Class6.anInt84 + 140, 12);
            var1.method3481(Class91.aString1234, 1933284923 * Class6.anInt84 + 152, 21, 16777215, -1);
         }

         int var39;
         if(Class37.aClass116_Sub23_Sub19_Sub3Array494 != null) {
            var29 = Class6.anInt84 * 1933284923 + 280;
            if(0 == World.anIntArray378[0] && World.anIntArray383[0] == 0) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[2].method3359(var29, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[0].method3359(var29, 4);
            }

            if(0 == World.anIntArray378[0] && 1 == World.anIntArray383[0]) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[3].method3359(var29 + 15, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[1].method3359(var29 + 15, 4);
            }

            var0.method3481(Class91.aString1062, var29 + 32, 17, 16777215, -1);
            var6 = 1933284923 * Class6.anInt84 + 390;
            if(1 == World.anIntArray378[0] && World.anIntArray383[0] == 0) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[2].method3359(var6, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[0].method3359(var6, 4);
            }

            if(World.anIntArray378[0] == 1 && 1 == World.anIntArray383[0]) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[3].method3359(var6 + 15, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[1].method3359(15 + var6, 4);
            }

            var0.method3481(Class91.aString1089, var6 + 32, 17, 16777215, -1);
            var39 = 500 + 1933284923 * Class6.anInt84;
            if(World.anIntArray378[0] == 2 && 0 == World.anIntArray383[0]) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[2].method3359(var39, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[0].method3359(var39, 4);
            }

            if(2 == World.anIntArray378[0] && World.anIntArray383[0] == 1) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[3].method3359(var39 + 15, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[1].method3359(15 + var39, 4);
            }

            var0.method3481(Class91.aString1315, 32 + var39, 17, 16777215, -1);
            var8 = 1933284923 * Class6.anInt84 + 610;
            if(World.anIntArray378[0] == 3 && World.anIntArray383[0] == 0) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[2].method3359(var8, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[0].method3359(var8, 4);
            }

            if(3 == World.anIntArray378[0] && 1 == World.anIntArray383[0]) {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[3].method3359(var8 + 15, 4);
            } else {
               Class37.aClass116_Sub23_Sub19_Sub3Array494[1].method3359(15 + var8, 4);
            }

            var0.method3481(Class91.aString1276, 32 + var8, 17, 16777215, -1);
         }

         DrawingArea.setRasterAreaColor(Class6.anInt84 * 1933284923 + 708, 4, 50, 16, 0);
         var1.method3492(Class91.aString1283, 25 + 1933284923 * Class6.anInt84 + 708, 16, 16777215, -1);
         var29 = 0;
         var6 = 33554432;
         var39 = 1115656689 * client.anInt2933 & var6;

         for(var8 = 0; var8 < World.totalWorldCount * -1946617791; ++var8) {
            World var35 = World.worldArray[var8];
            if((-1784645245 * var35.activityFlag & var6) == var39 || 0 == (var35.activityFlag * -1784645245 & var6)) {
               ++var29;
            }
         }

         Class6.anInt96 = -2121360341;
         if(Class106.aClass116_Sub23_Sub19_Sub2Array1449 != null) {
            var32 = 88;
            byte var38 = 19;
            var37 = 765 / (1 + var32);
            var40 = 480 / (var38 + 1);

            do {
               do {
                  var41 = var40;
                  var13 = var37;
                  if((var37 - 1) * var40 >= var29) {
                     --var37;
                  }

                  if((var40 - 1) * var37 >= var29) {
                     --var40;
                  }

                  if(var37 * (var40 - 1) >= var29) {
                     --var40;
                  }
               } while(var41 != var40);
            } while(var37 != var13);

            var41 = (765 - var37 * var32) / (var37 + 1);
            if(var41 > 5) {
               var41 = 5;
            }

            var13 = (480 - var38 * var40) / (1 + var40);
            if(var13 > 5) {
               var13 = 5;
            }

            int var46 = (765 - var37 * var32 - var41 * (var37 - 1)) / 2;
            var15 = (480 - var38 * var40 - var13 * (var40 - 1)) / 2;
            int var16 = var15 + 23;
            int var17 = Class6.anInt84 * 1933284923 + var46;
            int var18 = 0;
            boolean var19 = false;

            int var20;
            for(var20 = 0; var20 < -1946617791 * World.totalWorldCount; ++var20) {
               World var21 = World.worldArray[var20];
               if(var39 == (-1784645245 * var21.activityFlag & var6) || (-1784645245 * var21.activityFlag & var6) == 0) {
                  boolean var22 = true;
                  String var23 = Integer.toString(215269871 * var21.anInt381);
                  if(215269871 * var21.anInt381 == -1) {
                     var23 = Class91.aString1317;
                     var22 = false;
                  } else if(215269871 * var21.anInt381 > 1980) {
                     var23 = Class91.aString1318;
                     var22 = false;
                  }

                  int var24 = 0;
                  byte var25;
                  if(var21.method541(-1135460363)) {
                     var24 = 16711680;
                     if(var21.method537('\uffff')) {
                        var25 = 5;
                     } else {
                        var25 = 4;
                     }
                  } else if(var21.method539(-431160157)) {
                     if(var21.method537('\uffff')) {
                        var25 = 3;
                     } else {
                        var25 = 2;
                     }
                  } else if(var21.method537('\uffff')) {
                     var25 = 1;
                  } else {
                     var25 = 0;
                  }

                  if(Class85.anInt991 * -453286219 >= var17 && 103771565 * Class85.anInt992 >= var16 && Class85.anInt991 * -453286219 < var32 + var17 && 103771565 * Class85.anInt992 < var16 + var38 && var22) {
                     Class6.anInt96 = var20 * 2121360341;
                     Class106.aClass116_Sub23_Sub19_Sub2Array1449[var25].method3269(var17, var16, 128, 16777215);
                     var19 = true;
                  } else {
                     Class106.aClass116_Sub23_Sub19_Sub2Array1449[var25].method3286(var17, var16);
                  }

                  if(Class2.aClass116_Sub23_Sub19_Sub3Array21 != null) {
                     Class2.aClass116_Sub23_Sub19_Sub3Array21[(var21.method537('\uffff')?8:0) + var21.flag * -1854937097].method3359(29 + var17, var16);
                  }

                  var0.method3492(Integer.toString(var21.worldId * -145619359), 15 + var17, 5 + var16 + var38 / 2, var24, -1);
                  var1.method3492(var23, var17 + 60, 5 + var38 / 2 + var16, 268435455, -1);
                  var16 += var13 + var38;
                  ++var18;
                  if(var18 >= var40) {
                     var16 = var15 + 23;
                     var17 += var32 + var41;
                     var18 = 0;
                  }
               }
            }

            if(var19) {
               var20 = var1.method3455(World.worldArray[Class6.anInt96 * 154582397].activity) + 6;
               int var48 = var1.anInt2859 + 8;
               DrawingArea.setRasterAreaColor(Class85.anInt991 * -453286219 - var20 / 2, 5 + 103771565 * Class85.anInt992 + 20, var20, var48, 16777120);
               DrawingArea.method2897(-453286219 * Class85.anInt991 - var20 / 2, 103771565 * Class85.anInt992 + 20 + 5, var20, var48, 0);
               var1.method3492(World.worldArray[Class6.anInt96 * 154582397].activity, Class85.anInt991 * -453286219, 5 + 20 + 103771565 * Class85.anInt992 + var1.anInt2859 + 4, 0, -1);
            }
         }

         try {
            Graphics var36 = Tile.aCanvas1875.getGraphics();
            RSFIT.aAbstractRSDrawing_874.method333(var36, 0, 0, -819332484);
         } catch (Exception var26) {
            Tile.aCanvas1875.repaint();
         }

      } else {
         if(var3) {
            Class67.aClass116_Sub23_Sub19_Sub2_826.method3286(1933284923 * Class6.anInt84, 0);
            Class6.aClass116_Sub23_Sub19_Sub2_89.method3286(Class6.anInt84 * 1933284923 + 382, 0);
            Ignore.aClass116_Sub23_Sub19_Sub3_343.method3359(1933284923 * Class6.anInt84 + 382 - Ignore.aClass116_Sub23_Sub19_Sub3_343.anInt2763 / 2, 18);
         }

         if(client.loginStage * 846055547 == 0 || 846055547 * client.loginStage == 5) {
            byte var5 = 20;
            var0.method3492(Class91.aString1065, 1744540627 * Class6.anInt76 + 180, 245 - var5, 16777215, -1);
            var6 = 253 - var5;
            DrawingArea.method2897(Class6.anInt76 * 1744540627 + 180 - 152, var6, 304, 34, 9179409);
            DrawingArea.method2897(Class6.anInt76 * 1744540627 + 180 - 151, var6 + 1, 302, 32, 0);
            DrawingArea.setRasterAreaColor(180 + 1744540627 * Class6.anInt76 - 150, var6 + 2, -140328599 * Class6.anInt72, 30, 9179409);
            DrawingArea.setRasterAreaColor(-140328599 * Class6.anInt72 + (1744540627 * Class6.anInt76 + 180 - 150), var6 + 2, 300 - -140328599 * Class6.anInt72, 30, 0);
            var0.method3492(Class6.aString83, 180 + 1744540627 * Class6.anInt76, 276 - var5, 16777215, -1);
         }

         String var7;
         String var9;
         String var11;
         String var12;
         char[] var14;
         short var28;
         short var30;
         if(846055547 * client.loginStage == 20) {
            Class6.aClass116_Sub23_Sub19_Sub3_99.method3359(Class6.anInt76 * 1744540627 + 180 - Class6.aClass116_Sub23_Sub19_Sub3_99.anInt2763 / 2, 271 - Class6.aClass116_Sub23_Sub19_Sub3_99.anInt2764 / 2);
            var28 = 211;
            var0.method3492(Class6.aString85, Class6.anInt76 * 1744540627 + 180, var28, 16776960, 0);
            var29 = var28 + 15;
            var0.method3492(Class6.aString86, 1744540627 * Class6.anInt76 + 180, var29, 16776960, 0);
            var29 += 15;
            var0.method3492(Class6.aString87, 180 + Class6.anInt76 * 1744540627, var29, 16776960, 0);
            var29 += 15;
            var29 += 10;
            if(4 != -1168104433 * Class6.anInt64) {
               var0.method3481(Class91.aString1080, 1744540627 * Class6.anInt76 + 180 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var7 = Class6.username; var0.method3455(var7) > var30; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method3481(TextDrawingArea.method3459(var7), 180 + 1744540627 * Class6.anInt76 - 70, var29, 16777215, 0);
               var29 += 15;
               var9 = Class91.aString1256;
               var11 = Class6.password;
               var13 = var11.length();
               var14 = new char[var13];

               for(var15 = 0; var15 < var13; ++var15) {
                  var14[var15] = 42;
               }

               var12 = new String(var14);
               var0.method3481(var9 + var12, 180 + Class6.anInt76 * 1744540627 - 108, var29, 16777215, 0);
               var29 += 15;
            }
         }

         if(10 == client.loginStage * 846055547 || 11 == 846055547 * client.loginStage) {
            Class6.aClass116_Sub23_Sub19_Sub3_99.method3359(Class6.anInt76 * 1744540627, 171);
            short var31;
            if(-1168104433 * Class6.anInt64 == 0) {
               var28 = 251;
               var0.method3492(Class91.aString1279, 1744540627 * Class6.anInt76 + 180, var28, 16776960, 0);
               var29 = var28 + 30;
               var6 = Class6.anInt76 * 1744540627 + 180 - 80;
               var31 = 291;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var6 - 73, var31 - 20);
               var0.method3537(Class91.aString1280, var6 - 73, var31 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var6 = 80 + Class6.anInt76 * 1744540627 + 180;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var6 - 73, var31 - 20);
               var0.method3537(Class91.aString1281, var6 - 73, var31 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(1 == Class6.anInt64 * -1168104433) {
               var0.method3492(Class91.aString1150, 180 + 1744540627 * Class6.anInt76, 211, 16776960, 0);
               var28 = 236;
               var0.method3492(Class6.aString85, Class6.anInt76 * 1744540627 + 180, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.method3492(Class6.aString86, 1744540627 * Class6.anInt76 + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method3492(Class6.aString87, 180 + 1744540627 * Class6.anInt76, var29, 16777215, 0);
               var29 += 15;
               var6 = 180 + Class6.anInt76 * 1744540627 - 80;
               var31 = 321;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var6 - 73, var31 - 20);
               var0.method3492(Class91.continueString, var6, var31 + 5, 16777215, 0);
               var6 = 80 + 1744540627 * Class6.anInt76 + 180;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var6 - 73, var31 - 20);
               var0.method3492(Class91.aString1283, var6, 5 + var31, 16777215, 0);
            } else if(2 == Class6.anInt64 * -1168104433) {
               var28 = 211;
               var0.method3492(Class6.aString85, 180 + 1744540627 * Class6.anInt76, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.method3492(Class6.aString86, 180 + Class6.anInt76 * 1744540627, var29, 16776960, 0);
               var29 += 15;
               var0.method3492(Class6.aString87, 180 + 1744540627 * Class6.anInt76, var29, 16776960, 0);
               var29 += 15;
               var29 += 10;
               var0.method3481(Class91.aString1080, 1744540627 * Class6.anInt76 + 180 - 110, var29, 16777215, 0);
               var30 = 200;

               for(var7 = Class6.username; var0.method3455(var7) > var30; var7 = var7.substring(1)) {
                  ;
               }

               var0.method3481(TextDrawingArea.method3459(var7) + (Class6.anInt63 * -1914929121 == 0 & client.anInt2943 * -1040073859 % 40 < 20?Class59_Sub1.method1978(16776960, (byte)9) + Class41.aString539:""), Class6.anInt76 * 1744540627 + 180 - 70, var29, 16777215, 0);
               var29 += 15;
               var9 = Class91.aString1256;
               var11 = Class6.password;
               var13 = var11.length();
               var14 = new char[var13];

               for(var15 = 0; var15 < var13; ++var15) {
                  var14[var15] = 42;
               }

               var12 = new String(var14);
               var0.method3481(var9 + var12 + (1 == Class6.anInt63 * -1914929121 & -1040073859 * client.anInt2943 % 40 < 20?Class59_Sub1.method1978(16776960, (byte)112) + Class41.aString539:""), Class6.anInt76 * 1744540627 + 180 - 108, var29, 16777215, 0);
               var29 += 15;
               var41 = 1744540627 * Class6.anInt76 + 180 - 80;
               short var43 = 321;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var41 - 73, var43 - 20);
               var0.method3492(Class91.aString1271, var41, 5 + var43, 16777215, 0);
               var41 = 80 + Class6.anInt76 * 1744540627 + 180;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var41 - 73, var43 - 20);
               var0.method3492(Class91.aString1283, var41, 5 + var43, 16777215, 0);
               var28 = 357;
               var1.method3492(Class91.aString1284, Class6.anInt76 * 1744540627 + 180, var28, 16776960, 0);
            } else if(4 == Class6.anInt64 * -1168104433) {
               var0.method3492(Class91.aString1320, 180 + 1744540627 * Class6.anInt76, 211, 16776960, 0);
               var28 = 236;
               var0.method3492(Class6.aString85, 180 + Class6.anInt76 * 1744540627, var28, 16777215, 0);
               var29 = var28 + 15;
               var0.method3492(Class6.aString86, Class6.anInt76 * 1744540627 + 180, var29, 16777215, 0);
               var29 += 15;
               var0.method3492(Class6.aString87, 180 + Class6.anInt76 * 1744540627, var29, 16777215, 0);
               var29 += 15;
               var7 = Class91.aString1278;
               var9 = Class45.aString599;
               var40 = var9.length();
               char[] var42 = new char[var40];

               for(var13 = 0; var13 < var40; ++var13) {
                  var42[var13] = 42;
               }

               String var10 = new String(var42);
               var0.method3481(var7 + var10 + (-1040073859 * client.anInt2943 % 40 < 20?Class59_Sub1.method1978(16776960, (byte)11) + Class41.aString539:""), Class6.anInt76 * 1744540627 + 180 - 108, var29, 16777215, 0);
               var29 -= 8;
               var0.method3481(Class91.aString1231, 180 + Class6.anInt76 * 1744540627 - 9, var29, 16776960, 0);
               var29 += 15;
               var0.method3481(Class91.aString1131, Class6.anInt76 * 1744540627 + 180 - 9, var29, 16776960, 0);
               var37 = 180 + Class6.anInt76 * 1744540627 - 9 + var0.method3455(Class91.aString1131) + 15;
               var40 = var29 - var0.anInt2859;
               Class116_Sub23_Sub19_Sub3 var44;
               if(Class6.aBool91) {
                  var44 = Class6.aClass116_Sub23_Sub19_Sub3_69;
               } else {
                  var44 = Class6.aClass116_Sub23_Sub19_Sub3_68;
               }

               var44.method3359(var37, var40);
               var29 += 15;
               var13 = 180 + 1744540627 * Class6.anInt76 - 80;
               short var45 = 321;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var13 - 73, var45 - 20);
               var0.method3492(Class91.continueString, var13, var45 + 5, 16777215, 0);
               var13 = 80 + 1744540627 * Class6.anInt76 + 180;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var13 - 73, var45 - 20);
               var0.method3492(Class91.aString1283, var13, 5 + var45, 16777215, 0);
               var1.method3492(Class91.aString1272, 180 + 1744540627 * Class6.anInt76, var45 + 36, 255, 0);
            } else if(5 == -1168104433 * Class6.anInt64) {
               var0.method3492(Class91.aString1285, 180 + Class6.anInt76 * 1744540627, 201, 16776960, 0);
               var28 = 221;
               var2.method3492(Class6.aString85, 180 + Class6.anInt76 * 1744540627, var28, 16776960, 0);
               var29 = var28 + 15;
               var2.method3492(Class6.aString86, 180 + Class6.anInt76 * 1744540627, var29, 16776960, 0);
               var29 += 15;
               var2.method3492(Class6.aString87, 1744540627 * Class6.anInt76 + 180, var29, 16776960, 0);
               var29 += 15;
               var29 += 14;
               var0.method3481(Class91.aString1286, 1744540627 * Class6.anInt76 + 180 - 145, var29, 16777215, 0);
               var30 = 174;

               for(var7 = Class6.username; var0.method3455(var7) > var30; var7 = var7.substring(1)) {
                  ;
               }

               var0.method3481(TextDrawingArea.method3459(var7) + (-1040073859 * client.anInt2943 % 40 < 20?Class59_Sub1.method1978(16776960, (byte)30) + Class41.aString539:""), 1744540627 * Class6.anInt76 + 180 - 34, var29, 16777215, 0);
               var29 += 15;
               var8 = 180 + Class6.anInt76 * 1744540627 - 80;
               short var33 = 321;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var8 - 73, var33 - 20);
               var0.method3492(Class91.aString1287, var8, 5 + var33, 16777215, 0);
               var8 = 80 + 180 + Class6.anInt76 * 1744540627;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var8 - 73, var33 - 20);
               var0.method3492(Class91.aString1199, var8, var33 + 5, 16777215, 0);
            } else if(Class6.anInt64 * -1168104433 == 6) {
               var28 = 211;
               var0.method3492(Class6.aString85, Class6.anInt76 * 1744540627 + 180, var28, 16776960, 0);
               var29 = var28 + 15;
               var0.method3492(Class6.aString86, 180 + 1744540627 * Class6.anInt76, var29, 16776960, 0);
               var29 += 15;
               var0.method3492(Class6.aString87, 180 + Class6.anInt76 * 1744540627, var29, 16776960, 0);
               var29 += 15;
               var6 = Class6.anInt76 * 1744540627 + 180;
               var31 = 321;
               Class6.aClass116_Sub23_Sub19_Sub3_65.method3359(var6 - 73, var31 - 20);
               var0.method3492(Class91.aString1199, var6, var31 + 5, 16777215, 0);
            }
         }

         if(688679029 * Class6.anInt92 > 0) {
            Class1.method36(Class6.anInt92 * 688679029, 169492689);
            Class6.anInt92 = 0;
         }

         Class14.method254((byte)-69);
         RelationList.aClass116_Sub23_Sub19_Sub3Array678[Class116_Sub5.aClass29_1727.aBool409?1:0].method3359(Class6.anInt84 * 1933284923 + 765 - 40, 463);
         if(846055547 * client.loginStage > 5 && -1025678859 * client.anInt2938 == 0) {
            if(Class116_Sub23_Sub16_Sub3.aClass116_Sub23_Sub19_Sub3_2644 != null) {
               var29 = 5 + Class6.anInt84 * 1933284923;
               var30 = 463;
               byte var34 = 100;
               var32 = 35;
               Class116_Sub23_Sub16_Sub3.aClass116_Sub23_Sub19_Sub3_2644.method3359(var29, var30);
               var0.method3492(Class91.aString1212 + " " + -1631311031 * client.anInt3115, var34 / 2 + var29, var30 + var32 / 2 - 2, 16777215, 0);
               if(null != BuildType.worldListData) {
                  var1.method3492(Class91.aString1319, var34 / 2 + var29, 12 + var32 / 2 + var30, 16777215, 0);
               } else {
                  var1.method3492(Class91.aString1133, var29 + var34 / 2, var30 + var32 / 2 + 12, 16777215, 0);
               }
            } else {
               Class116_Sub23_Sub16_Sub3.aClass116_Sub23_Sub19_Sub3_2644 = Class116_Sub23_Sub4.method2447(Class116_Sub5.spriteIndex, "sl_button", "", 1566993598);
            }
         }

         try {
            Graphics var47 = Tile.aCanvas1875.getGraphics();
            RSFIT.aAbstractRSDrawing_874.method333(var47, 0, 0, -819332484);
         } catch (Exception var27) {
            Tile.aCanvas1875.repaint();
         }

      }
   }
}
