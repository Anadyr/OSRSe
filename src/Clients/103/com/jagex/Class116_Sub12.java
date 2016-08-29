package com.jagex;

public final class Class116_Sub12 extends Node {

   int anInt1835;
   static int anInt1836;
   int anInt1837;
   int anInt1838;
   int anInt1839;
   int anInt1840;
   int anInt1841;
   int anInt1842;
   int anInt1843;
   static Sprite[] aClass116_Sub23_Sub19_Sub2Array1844;
   int anInt1845 = 0;
   int anInt1846 = 622541955;
   int anInt1847;
   int anInt1848;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array1849;


   static final void method1979(int var0, int var1, byte var2) {
      if(-1361858763 * Class22.anInt276 != var0 || var1 != Class102.anInt1419 * 1249154187) {
         Class22.anInt276 = var0 * 1071803165;
         Class102.anInt1419 = var1 * -1066912989;
         method1983(25, (byte)124);
         Class94.method1300(Class91.aString1056, true, -408037706);
         int var6 = 1426698711 * Class116_Sub17.anInt2105;
         int var10 = 714823515 * Class33.anInt456;
         Class116_Sub17.anInt2105 = (var0 - 6) * -1551462600;
         Class33.anInt456 = (var1 - 6) * -190314856;
         int var8 = 1426698711 * Class116_Sub17.anInt2105 - var6;
         int var4 = 714823515 * Class33.anInt456 - var10;
         var6 = Class116_Sub17.anInt2105 * 1426698711;
         var10 = 714823515 * Class33.anInt456;

         int var11;
         int var12;
         for(var11 = 0; var11 < '\u8000'; ++var11) {
            Mob var9 = client.aMobArray2972[var11];
            if(null != var9) {
               for(var12 = 0; var12 < 10; ++var12) {
                  var9.xMovementSteps[var12] -= var8;
                  var9.yMovementSteps[var12] -= var4;
               }

               var9.anInt2609 -= var8 * -715945088;
               var9.anInt2579 -= var4 * 1616412800;
            }
         }

         for(var11 = 0; var11 < 2048; ++var11) {
            Player var19 = client.globalPlayers[var11];
            if(var19 != null) {
               for(var12 = 0; var12 < 10; ++var12) {
                  var19.xMovementSteps[var12] -= var8;
                  var19.yMovementSteps[var12] -= var4;
               }

               var19.anInt2609 -= var8 * -715945088;
               var19.anInt2579 -= 1616412800 * var4;
            }
         }

         byte var21 = 0;
         byte var20 = 104;
         byte var22 = 1;
         if(var8 < 0) {
            var21 = 103;
            var20 = -1;
            var22 = -1;
         }

         byte var13 = 0;
         byte var16 = 104;
         byte var3 = 1;
         if(var4 < 0) {
            var13 = 103;
            var16 = -1;
            var3 = -1;
         }

         int var14;
         for(int var7 = var21; var20 != var7; var7 += var22) {
            for(var14 = var13; var16 != var14; var14 += var3) {
               int var5 = var8 + var7;
               int var15 = var4 + var14;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if(var5 >= 0 && var15 >= 0 && var5 < 104 && var15 < 104) {
                     client.aClass117ArrayArrayArray3071[var17][var7][var14] = client.aClass117ArrayArrayArray3071[var17][var5][var15];
                  } else {
                     client.aClass117ArrayArrayArray3071[var17][var7][var14] = null;
                  }
               }
            }
         }

         for(Class116_Sub12 var18 = (Class116_Sub12)client.aClass117_3162.method1551(); var18 != null; var18 = (Class116_Sub12)client.aClass117_3162.method1553()) {
            var18.anInt1835 -= var8 * -2106367321;
            var18.anInt1847 -= var4 * 1453500391;
            if(-1096801001 * var18.anInt1835 < 0 || var18.anInt1847 * -127960105 < 0 || var18.anInt1835 * -1096801001 >= 104 || var18.anInt1847 * -127960105 >= 104) {
               var18.unlink();
            }
         }

         if(client.anInt3168 * -1712731251 != 0) {
            client.anInt3168 -= var8 * -1943900347;
            client.anInt3208 -= 317027045 * var4;
         }

         client.anInt3176 = 0;
         client.aBool2988 = false;
         client.anInt3163 = -1008529911;
         client.aClass117_2973.method1545();
         client.aClass117_3028.method1545();

         for(var14 = 0; var14 < 4; ++var14) {
            client.aClass58Array2996[var14].method890(462555413);
         }

      }
   }

   static final void drawMiniMap(Class116_Sub15 var0, int var1, int var2, int var3, short var4) {
      Class42.method695((byte)80);
      Class116_Sub23_Sub20 var7 = var0.method2255(false, 1970516760);
      if(null != var7) {
         DrawingArea.method2901(var1, var2, var1 + var7.anInt2516 * 662480183, var7.anInt2518 * -988977157 + var2);
         if(2 != client.anInt3170 * -1797803011 && 5 != client.anInt3170 * -1797803011) {
            int var9 = -1916997753 * client.anInt2929 + client.anInt3007 * -1718342721 & 2047;
            int var8 = 48 + 1272643751 * Class79.aPlayer_909.anInt2609 / 32;
            int var15 = 464 - -1801433343 * Class79.aPlayer_909.anInt2579 / 32;
            Class116_Sub23_Sub18.aClass116_Sub23_Sub19_Sub2_2487.method3283(var1, var2, var7.anInt2516 * 662480183, var7.anInt2518 * -988977157, var8, var15, var9, -806982331 * client.anInt3009 + 256, var7.anIntArray2513, var7.anIntArray2512);

            int var5;
            int var10;
            int var11;
            for(var11 = 0; var11 < client.anInt3164 * -706898549; ++var11) {
               var10 = 2 + client.anIntArray3165[var11] * 4 - Class79.aPlayer_909.anInt2609 * 1272643751 / 32;
               var5 = client.anIntArray3166[var11] * 4 + 2 - -1801433343 * Class79.aPlayer_909.anInt2579 / 32;
               Class62.markMiniMap(var1, var2, var10, var5, client.aClass116_Sub23_Sub19_Sub2Array3167[var11], var7, 433143345);
            }

            int var6;
            int var12;
            for(var11 = 0; var11 < 104; ++var11) {
               for(var10 = 0; var10 < 104; ++var10) {
                  Class117 var18 = client.aClass117ArrayArrayArray3071[Class116_Sub11.anInt1819 * -747958745][var11][var10];
                  if(var18 != null) {
                     var6 = 4 * var11 + 2 - Class79.aPlayer_909.anInt2609 * 1272643751 / 32;
                     var12 = 2 + var10 * 4 - Class79.aPlayer_909.anInt2579 * -1801433343 / 32;
                     Class62.markMiniMap(var1, var2, var6, var12, Class122.aClass116_Sub23_Sub19_Sub2Array1538[0], var7, -1029254172);
                  }
               }
            }

            for(var11 = 0; var11 < client.npcCount * 727116725; ++var11) {
               Mob var23 = client.aMobArray2972[client.npcIndicies[var11]];
               if(null != var23 && var23.method3101((byte)60)) {
                  MobDefinition var19 = var23.definition;
                  if(var19 != null && var19.anIntArray2313 != null) {
                     var19 = var19.method2546(-572852130);
                  }

                  if(null != var19 && var19.aBool2325 && var19.aBool2337) {
                     var6 = var23.anInt2609 * 1272643751 / 32 - Class79.aPlayer_909.anInt2609 * 1272643751 / 32;
                     var12 = -1801433343 * var23.anInt2579 / 32 - -1801433343 * Class79.aPlayer_909.anInt2579 / 32;
                     Class62.markMiniMap(var1, var2, var6, var12, Class122.aClass116_Sub23_Sub19_Sub2Array1538[1], var7, 1600744042);
                  }
               }
            }

            var11 = -334270159 * Class7.anInt107;
            int[] var24 = Class7.anIntArray108;

            for(var5 = 0; var5 < var11; ++var5) {
               Player var20 = client.globalPlayers[var24[var5]];
               if(var20 != null && var20.method3101((byte)60) && !var20.aBool2900 && var20 != Class79.aPlayer_909) {
                  var12 = 1272643751 * var20.anInt2609 / 32 - 1272643751 * Class79.aPlayer_909.anInt2609 / 32;
                  int var17 = -1801433343 * var20.anInt2579 / 32 - -1801433343 * Class79.aPlayer_909.anInt2579 / 32;
                  boolean var16 = false;
                  if(Class116_Sub5.method1930(var20.username, true, 1103773868)) {
                     var16 = true;
                  }

                  boolean var13 = false;

                  for(int var14 = 0; var14 < -1304125287 * Class98.anInt1378; ++var14) {
                     if(var20.username.equals(Class116_Sub11.aClass116_Sub7Array1820[var14].username)) {
                        var13 = true;
                        break;
                     }
                  }

                  boolean var25 = false;
                  if(-103629189 * Class79.aPlayer_909.anInt2899 != 0 && var20.anInt2899 * -103629189 != 0 && var20.anInt2899 * -103629189 == -103629189 * Class79.aPlayer_909.anInt2899) {
                     var25 = true;
                  }

                  if(var16) {
                     Class62.markMiniMap(var1, var2, var12, var17, Class122.aClass116_Sub23_Sub19_Sub2Array1538[3], var7, 1084717937);
                  } else if(var25) {
                     Class62.markMiniMap(var1, var2, var12, var17, Class122.aClass116_Sub23_Sub19_Sub2Array1538[4], var7, -661951595);
                  } else if(var13) {
                     Class62.markMiniMap(var1, var2, var12, var17, Class122.aClass116_Sub23_Sub19_Sub2Array1538[5], var7, 1454936829);
                  } else {
                     Class62.markMiniMap(var1, var2, var12, var17, Class122.aClass116_Sub23_Sub19_Sub2Array1538[2], var7, -387470119);
                  }
               }
            }

            if(client.anInt3021 * 314519437 != 0 && -1040073859 * client.anInt2943 % 20 < 10) {
               if(314519437 * client.anInt3021 == 1 && client.anInt2952 * 1583399955 >= 0 && 1583399955 * client.anInt2952 < client.aMobArray2972.length) {
                  Mob var21 = client.aMobArray2972[client.anInt2952 * 1583399955];
                  if(var21 != null) {
                     var6 = 1272643751 * var21.anInt2609 / 32 - 1272643751 * Class79.aPlayer_909.anInt2609 / 32;
                     var12 = -1801433343 * var21.anInt2579 / 32 - Class79.aPlayer_909.anInt2579 * -1801433343 / 32;
                     Class8.method140(var1, var2, var6, var12, Class83.aClass116_Sub23_Sub19_Sub2Array970[1], var7, (short)1003);
                  }
               }

               if(314519437 * client.anInt3021 == 2) {
                  var5 = 2 + (-751140636 * client.anInt2954 - 1411827548 * Class116_Sub17.anInt2105) - 1272643751 * Class79.aPlayer_909.anInt2609 / 32;
                  var6 = 2 + (client.anInt2950 * 985346372 - Class33.anInt456 * -1435673236) - Class79.aPlayer_909.anInt2579 * -1801433343 / 32;
                  Class8.method140(var1, var2, var5, var6, Class83.aClass116_Sub23_Sub19_Sub2Array970[1], var7, (short)1003);
               }

               if(client.anInt3021 * 314519437 == 10 && client.anInt3125 * 1613691605 >= 0 && client.anInt3125 * 1613691605 < client.globalPlayers.length) {
                  Player var22 = client.globalPlayers[client.anInt3125 * 1613691605];
                  if(var22 != null) {
                     var6 = var22.anInt2609 * 1272643751 / 32 - Class79.aPlayer_909.anInt2609 * 1272643751 / 32;
                     var12 = -1801433343 * var22.anInt2579 / 32 - -1801433343 * Class79.aPlayer_909.anInt2579 / 32;
                     Class8.method140(var1, var2, var6, var12, Class83.aClass116_Sub23_Sub19_Sub2Array970[1], var7, (short)1003);
                  }
               }
            }

            if(client.anInt3168 * -1712731251 != 0) {
               var5 = 2 + 1739009588 * client.anInt3168 - 1272643751 * Class79.aPlayer_909.anInt2609 / 32;
               var6 = 2 + 1530391476 * client.anInt3208 - Class79.aPlayer_909.anInt2579 * -1801433343 / 32;
               Class62.markMiniMap(var1, var2, var5, var6, Class83.aClass116_Sub23_Sub19_Sub2Array970[0], var7, 1522749504);
            }

            if(!Class79.aPlayer_909.aBool2900) {
               DrawingArea.method2927(var7.anInt2516 * 662480183 / 2 + var1 - 1, var2 + -988977157 * var7.anInt2518 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            DrawingArea.method2904(var1, var2, 0, var7.anIntArray2513, var7.anIntArray2512);
         }

         client.aBoolArray3139[var3] = true;
      }
   }

   static int method1981(Class99 var0, Class99 var1, int var2) {
      int var3 = 0;
      if(var0.method1369("title.jpg", "", 1952315465)) {
         ++var3;
      }

      if(var1.method1369("logo", "", 2145594855)) {
         ++var3;
      }

      if(var1.method1369("logo_deadman_mode", "", 1670354247)) {
         ++var3;
      }

      if(var1.method1369("titlebox", "", 505242715)) {
         ++var3;
      }

      if(var1.method1369("titlebutton", "", 631250854)) {
         ++var3;
      }

      if(var1.method1369("runes", "", 1918356628)) {
         ++var3;
      }

      if(var1.method1369("title_mute", "", 518620538)) {
         ++var3;
      }

      if(var1.method1370("options_radio_buttons,0", (byte)12)) {
         ++var3;
      }

      if(var1.method1370("options_radio_buttons,2", (byte)58)) {
         ++var3;
      }

      var1.method1369("sl_back", "", 998554754);
      var1.method1369("sl_flags", "", 1127238643);
      var1.method1369("sl_arrows", "", 702394526);
      var1.method1369("sl_stars", "", 398865980);
      var1.method1369("sl_button", "", 1047514124);
      return var3;
   }

   public static void method1982(Class99 var0, int var1) {
      Class116_Sub23_Sub15.aClass99_2449 = var0;
      Class116_Sub23_Sub15.anInt2448 = Class116_Sub23_Sub15.aClass99_2449.method1361(16, -824500445) * 1942513075;
   }

   static void method1983(int var0, byte var1) {
      if(846055547 * client.loginStage != var0) {
         if(846055547 * client.loginStage == 0) {
            Class17.method289(-1973302120);
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.anInt3182 = 0;
            client.anInt3148 = 0;
            client.anInt2978 = 0;
         }

         if(20 != var0 && 40 != var0 && null != Class41.aClass71_545) {
            Class41.aClass71_545.method1001(-1588464515);
            Class41.aClass71_545 = null;
         }

         if(25 == client.loginStage * 846055547) {
            client.anInt3091 = 0;
            client.anInt3078 = 0;
            client.anInt3105 = 1739605141;
            client.anInt2992 = 0;
            client.anInt2960 = 550236941;
         }

         if(var0 != 5 && 10 != var0) {
            if(20 == var0) {
               Class116_Sub23_Sub16_Sub6.method3366(Tile.aCanvas1875, Class49.aClass99_Sub1_663, Class116_Sub5.aClass99_Sub1_1729, true, 11 == 846055547 * client.loginStage?4:0, 636338739);
            } else if(var0 == 11) {
               Class116_Sub23_Sub16_Sub6.method3366(Tile.aCanvas1875, Class49.aClass99_Sub1_663, Class116_Sub5.aClass99_Sub1_1729, false, 4, 931750436);
            } else if(Class6.aBool94) {
               Class6.aClass116_Sub23_Sub19_Sub3_99 = null;
               Class6.aClass116_Sub23_Sub19_Sub3_65 = null;
               Class6.aClass116_Sub23_Sub19_Sub3Array66 = null;
               Class67.aClass116_Sub23_Sub19_Sub2_826 = null;
               Class6.aClass116_Sub23_Sub19_Sub2_89 = null;
               Class24.aClass116_Sub23_Sub19_Sub3_343 = null;
               Class50.aClass116_Sub23_Sub19_Sub3Array678 = null;
               Class6.aClass116_Sub23_Sub19_Sub3_68 = null;
               Class6.aClass116_Sub23_Sub19_Sub3_69 = null;
               Class106.aClass116_Sub23_Sub19_Sub2Array1449 = null;
               Class2.aClass116_Sub23_Sub19_Sub3Array21 = null;
               Class37.aClass116_Sub23_Sub19_Sub3Array494 = null;
               aClass116_Sub23_Sub19_Sub3Array1849 = null;
               Class116_Sub23_Sub16_Sub3.aClass116_Sub23_Sub19_Sub3_2644 = null;
               Class22.anIntArray280 = null;
               client.anIntArray1615 = null;
               Class6.anIntArray75 = null;
               Class6.anIntArray74 = null;
               Class39.anIntArray521 = null;
               Speach.anIntArray972 = null;
               Class141.anIntArray1633 = null;
               Class4.anIntArray52 = null;
               Class76.method1082(2, (byte)61);
               Class116_Sub6.method1935(true, 2021294259);
               Class6.aBool94 = false;
            }
         } else {
            Class116_Sub23_Sub16_Sub6.method3366(Tile.aCanvas1875, Class49.aClass99_Sub1_663, Class116_Sub5.aClass99_Sub1_1729, true, 0, -473752451);
         }

         client.loginStage = -317532493 * var0;
      }
   }

   static String method1984(String var0, Class116_Sub15 var1, int var2) {
      if(var0.indexOf("%") != -1) {
         int var3;
         for(var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if(-1 == var4) {
                  break;
               }

               String var7 = var0.substring(0, var4);
               int var5 = client.method1740(var1, var3 - 1, (byte)-93);
               String var6;
               if(var5 >= 999999999) {
                  var6 = "*";
               } else {
                  var6 = Integer.toString(var5);
               }

               var0 = var7 + var6 + var0.substring(2 + var4);
            }
         }

         while(true) {
            var3 = var0.indexOf("%dns");
            if(var3 == -1) {
               break;
            }

            String var8 = "";
            if(null != RSImageProducer.aClass72_1675) {
               var8 = Class74.method1076(RSImageProducer.aClass72_1675.anInt867, (short)-9075);
               if(RSImageProducer.aClass72_1675.anObject869 != null) {
                  var8 = (String) RSImageProducer.aClass72_1675.anObject869;
               }
            }

            var0 = var0.substring(0, var3) + var8 + var0.substring(var3 + 4);
         }
      }

      return var0;
   }
}
