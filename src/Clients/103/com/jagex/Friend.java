package com.jagex;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;

public class Friend extends ListEntry {

   static Sprite[] aClass116_Sub23_Sub19_Sub2Array1660;
   static Class99 aClass99_1664;
   static Class72 aClass72_1665;
   String username;
   short clanRank;
   int anInt1663 = (int) (Class116_Sub5.method1929(-374874055) / 1000L) * 1225451051;


   Friend(String name, int rank) {
      this.username = name;
      this.clanRank = (short) rank;
   }

   public static void method1834(Class99 var0, Class99 var1, boolean var2, int var3) {
      ObjectDefinition.aClass99_2189 = var0;
      ObjectDefinition.aClass99_2190 = var1;
      ObjectDefinition.aBool2210 = var2;
   }

   public static Class116_Sub23_Sub1 method1835(int var0, byte var1) {
      Class116_Sub23_Sub1 var2 = (Class116_Sub23_Sub1)Class116_Sub23_Sub1.aClass123_2161.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub1.aClass99_2174.method1394(13, var0, 591564079);
         var2 = new Class116_Sub23_Sub1();
         var2.anInt2159 = var0 * -892199181;
         if(null != var3) {
            var2.method2342(new Buffer(var3), 987589626);
         }

         Class116_Sub23_Sub1.aClass123_2161.method1633(var2, (long)var0);
         return var2;
      }
   }

   public static final void method1836(long var0) {
      if(var0 > 0L) {
         if(var0 % 10L == 0L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
            }
         }

      }
   }

   public static void method1837(int var0) {
      if(Class74.aString886.toLowerCase().indexOf("microsoft") != -1) {
         KeyFocusListener.anIntArray936[186] = 57;
         KeyFocusListener.anIntArray936[187] = 27;
         KeyFocusListener.anIntArray936[188] = 71;
         KeyFocusListener.anIntArray936[189] = 26;
         KeyFocusListener.anIntArray936[190] = 72;
         KeyFocusListener.anIntArray936[191] = 73;
         KeyFocusListener.anIntArray936[192] = 58;
         KeyFocusListener.anIntArray936[219] = 42;
         KeyFocusListener.anIntArray936[220] = 74;
         KeyFocusListener.anIntArray936[221] = 43;
         KeyFocusListener.anIntArray936[222] = 59;
         KeyFocusListener.anIntArray936[223] = 28;
      } else {
         KeyFocusListener.anIntArray936[44] = 71;
         KeyFocusListener.anIntArray936[45] = 26;
         KeyFocusListener.anIntArray936[46] = 72;
         KeyFocusListener.anIntArray936[47] = 73;
         KeyFocusListener.anIntArray936[59] = 57;
         KeyFocusListener.anIntArray936[61] = 27;
         KeyFocusListener.anIntArray936[91] = 42;
         KeyFocusListener.anIntArray936[92] = 74;
         KeyFocusListener.anIntArray936[93] = 43;
         KeyFocusListener.anIntArray936[192] = 28;
         KeyFocusListener.anIntArray936[222] = 58;
         KeyFocusListener.anIntArray936[520] = 59;
      }

   }

   public static int method1838(CharSequence var0, CharSequence var1, int var2, byte var3) {
      int var4 = var0.length();
      int var12 = var1.length();
      int var10 = 0;
      int var11 = 0;
      byte var8 = 0;
      byte var9 = 0;

      while(var10 - var8 < var4 || var11 - var9 < var12) {
         if(var10 - var8 >= var4) {
            return -1;
         }

         if(var11 - var9 >= var12) {
            return 1;
         }

         char var13;
         if(var8 != 0) {
            var13 = (char)var8;
            boolean var17 = false;
         } else {
            var13 = var0.charAt(var10++);
         }

         char var14;
         if(0 != var9) {
            var14 = (char)var9;
            boolean var19 = false;
         } else {
            var14 = var1.charAt(var11++);
         }

         byte var5;
         if(var13 == 198) {
            var5 = 69;
         } else if(230 == var13) {
            var5 = 101;
         } else if(var13 == 223) {
            var5 = 115;
         } else if(var13 != 338) {
            if(339 == var13) {
               var5 = 101;
            } else {
               var5 = 0;
            }
         } else {
            var5 = 69;
         }

         var8 = var5;
         byte var7;
         if(198 == var14) {
            var7 = 69;
         } else if(230 != var14) {
            if(223 == var14) {
               var7 = 115;
            } else if(338 != var14) {
               if(var14 == 339) {
                  var7 = 101;
               } else {
                  var7 = 0;
               }
            } else {
               var7 = 69;
            }
         } else {
            var7 = 101;
         }

         var9 = var7;
         var13 = Class116_Sub23_Sub6.method2496(var13, var2, (byte)-55);
         var14 = Class116_Sub23_Sub6.method2496(var14, var2, (byte)-45);
         if(var14 != var13 && Character.toUpperCase(var13) != Character.toUpperCase(var14)) {
            var13 = Character.toLowerCase(var13);
            var14 = Character.toLowerCase(var14);
            if(var13 != var14) {
               return ObjectDefinition.method2401(var13, var2, 1179648901) - ObjectDefinition.method2401(var14, var2, 1179648901);
            }
         }
      }

      int var20 = Math.min(var4, var12);

      char var18;
      int var21;
      for(var21 = 0; var21 < var20; ++var21) {
         char var15 = var0.charAt(var21);
         var18 = var1.charAt(var21);
         if(var15 != var18 && Character.toUpperCase(var15) != Character.toUpperCase(var18)) {
            var15 = Character.toLowerCase(var15);
            var18 = Character.toLowerCase(var18);
            if(var18 != var15) {
               return ObjectDefinition.method2401(var15, var2, 1179648901) - ObjectDefinition.method2401(var18, var2, 1179648901);
            }
         }
      }

      var21 = var4 - var12;
      if(var21 != 0) {
         return var21;
      } else {
         for(int var16 = 0; var16 < var20; ++var16) {
            var18 = var0.charAt(var16);
            char var6 = var1.charAt(var16);
            if(var18 != var6) {
               return ObjectDefinition.method2401(var18, var2, 1179648901) - ObjectDefinition.method2401(var6, var2, 1179648901);
            }
         }

         return 0;
      }
   }

   public static void method1839(String var0, boolean var1, String var2, boolean var3, byte var4) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
            }
         }

         if(Class81.aString922.startsWith("win") && !var3) {
            Player.method3566(var0, 0, "openjs", (byte) -15);
            return;
         }

         if(Class81.aString922.startsWith("mac")) {
            Player.method3566(var0, 1, var2, (byte) -17);
            return;
         }

         Player.method3566(var0, 2, "openjs", (byte) -49);
      } else {
         Player.method3566(var0, 3, "openjs", (byte) -127);
      }

   }

   static void method1840(Class116_Sub6 var0, int var1) {
      Class63.method934(var0, 200000, 1405115201);
   }

   static final void method1841(Class116_Sub15[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         Class116_Sub15 var14 = var0[var9];
         if(var14 != null && (!var14.aBool1924 || var14.anInt2018 * -1305917269 == 0 || var14.aBool2003 || Class35.method645(var14, (byte)0) != 0 || var14 == client.aClass116_Sub15_3107 || 1338 == -179718399 * var14.anInt2016) && var1 == var14.anInt1944 * -1652479707 && (!var14.aBool1924 || !ISAAC.method806(var14, -1543523372))) {
            int var21 = var6 + 332168295 * var14.anInt1938;
            int var16 = 1492425953 * var14.anInt1939 + var7;
            int var12;
            int var13;
            int var17;
            int var18;
            int var22;
            int var23;
            int var24;
            int var26;
            if(2 == -1305917269 * var14.anInt2018) {
               var24 = var2;
               var26 = var3;
               var17 = var4;
               var18 = var5;
            } else if(var14.anInt2018 * -1305917269 == 9) {
               var22 = var21;
               var23 = var16;
               var13 = var14.anInt1940 * 1645211541 + var21;
               var12 = var16 + 1227800423 * var14.anInt1974;
               if(var13 < var21) {
                  var22 = var13;
                  var13 = var21;
               }

               if(var12 < var16) {
                  var23 = var12;
                  var12 = var16;
               }

               ++var13;
               ++var12;
               var24 = var22 > var2?var22:var2;
               var26 = var23 > var3?var23:var3;
               var17 = var13 < var4?var13:var4;
               var18 = var12 < var5?var12:var5;
            } else {
               var22 = var21 + 1645211541 * var14.anInt1940;
               var23 = var16 + 1227800423 * var14.anInt1974;
               var24 = var21 > var2?var21:var2;
               var26 = var16 > var3?var16:var3;
               var17 = var22 < var4?var22:var4;
               var18 = var23 < var5?var23:var5;
            }

            if(client.aClass116_Sub15_3106 == var14) {
               client.aBool3114 = true;
               client.anInt2993 = -693748815 * var21;
               client.anInt3116 = 740381373 * var16;
            }

            if(!var14.aBool1924 || var24 < var17 && var26 < var18) {
               var22 = -453286219 * Class85.anInt991;
               var23 = Class85.anInt992 * 103771565;
               if(823601801 * Class85.anInt997 != 0) {
                  var22 = -2040065729 * Class85.anInt998;
                  var23 = Class85.anInt999 * 2090526775;
               }

               if(1337 == -179718399 * var14.anInt2016) {
                  if(!client.aBool3187 && !client.aBool3074 && var22 >= var24 && var23 >= var26 && var22 < var17 && var23 < var18) {
                     Class22.method342(var22, var23, var24, var26, -1502774106);
                  }
               } else {
                  int var11;
                  int var19;
                  int var25;
                  int var27;
                  int var28;
                  int var47;
                  if(var14.anInt2016 * -179718399 == 1338) {
                     if((-1797803011 * client.anInt3170 == 0 || client.anInt3170 * -1797803011 == 3) && (1 == Class85.anInt997 * 823601801 || !PlayerAlias.aBool1756 && Class85.anInt997 * 823601801 == 4)) {
                        Class116_Sub23_Sub20 var45 = var14.method2255(true, 1970516760);
                        if(null != var45) {
                           var12 = Class85.anInt998 * -2040065729 - var21;
                           var47 = Class85.anInt999 * 2090526775 - var16;
                           if(var45.method2980(var12, var47, 230943591)) {
                              var12 -= var45.anInt2516 * 662480183 / 2;
                              var47 -= var45.anInt2518 * -988977157 / 2;
                              var11 = -1718342721 * client.anInt3007 + client.anInt2929 * -1916997753 & 2047;
                              var25 = Texture.anIntArray2708[var11];
                              var27 = Texture.anIntArray2713[var11];
                              var25 = var25 * (256 + client.anInt3009 * -806982331) >> 8;
                              var27 = var27 * (-806982331 * client.anInt3009 + 256) >> 8;
                              var28 = var12 * var27 + var25 * var47 >> 11;
                              int var53 = var27 * var47 - var12 * var25 >> 11;
                              int var54 = var28 + 1272643751 * Class79.aPlayer_909.anInt2609 >> 7;
                              var19 = Class79.aPlayer_909.anInt2579 * -1801433343 - var53 >> 7;
                              client.rsaBuffer.startPacket(239, (byte) 51);
                              client.rsaBuffer.writeByte(18, 402383460);
                              client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? (KeyFocusListener.keysHeldDown[81] ? 2 : 1) : 0, 113168318);
                              client.rsaBuffer.writeLEShortA(Class116_Sub17.clickX * 1426698711 + var54, 1447178959);
                              client.rsaBuffer.writeLEShort(Class33.clickY * 714823515 + var19, 1565527644);
                              client.rsaBuffer.writeByte(var12, 53190968);
                              client.rsaBuffer.writeByte(var47, 229708442);
                              client.rsaBuffer.writeShort(-1916997753 * client.anInt2929, -1656763529);
                              client.rsaBuffer.writeByte(57, -1146220280);
                              client.rsaBuffer.writeByte(client.anInt3007 * -1718342721, 200560506);
                              client.rsaBuffer.writeByte(-806982331 * client.anInt3009, 92383934);
                              client.rsaBuffer.writeByte(89, -47964150);
                              client.rsaBuffer.writeShort(1272643751 * Class79.aPlayer_909.anInt2609, -2070520008);
                              client.rsaBuffer.writeShort(-1801433343 * Class79.aPlayer_909.anInt2579, -1974282343);
                              client.rsaBuffer.writeByte(63, -1153782391);
                              client.anInt3168 = var54 * -1943900347;
                              client.anInt3208 = 317027045 * var19;
                           }
                        }
                     }
                  } else {
                     boolean var48;
                     if(!client.aBool3074 && var22 >= var24 && var23 >= var26 && var22 < var17 && var23 < var18) {
                        var13 = var22 - var21;
                        var12 = var23 - var16;
                        if(-1300193677 * var14.anInt2046 == 1) {
                           Class50.method776(var14.aString2040, "", 24, 0, 0, -1536575275 * var14.anInt1925, (byte)-42);
                        }

                        String var20;
                        if(-1300193677 * var14.anInt2046 == 2 && !client.aBool3088) {
                           var20 = Class32.method594(var14, (byte)78);
                           if(null != var20) {
                              Class50.method776(var20, Class59_Sub1.method1978('\uff00', (byte)64) + var14.aString1918, 25, 0, -1, -1536575275 * var14.anInt1925, (byte)-9);
                           }
                        }

                        if(3 == var14.anInt2046 * -1300193677) {
                           Class50.method776(Class91.aString1211, "", 26, 0, 0, var14.anInt1925 * -1536575275, (byte)-1);
                        }

                        if(4 == var14.anInt2046 * -1300193677) {
                           Class50.method776(var14.aString2040, "", 28, 0, 0, -1536575275 * var14.anInt1925, (byte)-71);
                        }

                        if(-1300193677 * var14.anInt2046 == 5) {
                           Class50.method776(var14.aString2040, "", 29, 0, 0, var14.anInt1925 * -1536575275, (byte)-3);
                        }

                        if(-1300193677 * var14.anInt2046 == 6 && null == client.aClass116_Sub15_3097) {
                           Class50.method776(var14.aString2040, "", 30, 0, -1, var14.anInt1925 * -1536575275, (byte)-50);
                        }

                        if(2 == -1305917269 * var14.anInt2018) {
                           var47 = 0;

                           for(var11 = 0; var11 < 1227800423 * var14.anInt1974; ++var11) {
                              for(var25 = 0; var25 < 1645211541 * var14.anInt1940; ++var25) {
                                 var27 = (var14.anInt1928 * 1918789959 + 32) * var25;
                                 var28 = (32 + var14.anInt2010 * -1195323371) * var11;
                                 if(var47 < 20) {
                                    var27 += var14.anIntArray1962[var47];
                                    var28 += var14.anIntArray1992[var47];
                                 }

                                 if(var13 >= var27 && var12 >= var28 && var13 < var27 + 32 && var12 < 32 + var28) {
                                    client.anInt3084 = -582656979 * var47;
                                    Class22.aClass116_Sub15_270 = var14;
                                    if(var14.anIntArray2047[var47] > 0) {
                                       label1179: {
                                          Class116_Sub23_Sub11 var30 = Class50.method778(var14.anIntArray2047[var47] - 1, (byte)70);
                                          boolean var29;
                                          if(client.anInt2991 * -1110581093 == 1) {
                                             var19 = Class35.method645(var14, (byte)0);
                                             var29 = (var19 >> 30 & 1) != 0;
                                             if(var29) {
                                                if(-47339353 * Class26.anInt365 != -1536575275 * var14.anInt1925 || 543565821 * Class49.anInt661 != var47) {
                                                   Class50.method776(Class91.aString1197, client.aString3201 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16748608, (byte)60) + var30.aString2361, 31, 1548676283 * var30.anInt2359, var47, var14.anInt1925 * -1536575275, (byte)-22);
                                                }
                                                break label1179;
                                             }
                                          }

                                          if(client.aBool3088) {
                                             var19 = Class35.method645(var14, (byte)0);
                                             var29 = (var19 >> 30 & 1) != 0;
                                             if(var29) {
                                                if((2016481409 * Class38.anInt500 & 16) == 16) {
                                                   Class50.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16748608, (byte)123) + var30.aString2361, 32, 1548676283 * var30.anInt2359, var47, var14.anInt1925 * -1536575275, (byte)-20);
                                                }
                                                break label1179;
                                             }
                                          }

                                          String[] var52 = var30.aStringArray2387;
                                          if(client.aBool3104) {
                                             var52 = Canvas_Sub1.method2978(var52, -1913521574);
                                          }

                                          int var33 = Class35.method645(var14, (byte)0);
                                          boolean var46 = 0 != (var33 >> 30 & 1);
                                          if(var46) {
                                             for(int var10 = 4; var10 >= 3; --var10) {
                                                if(var52 != null && var52[var10] != null) {
                                                   byte var34;
                                                   if(var10 == 3) {
                                                      var34 = 36;
                                                   } else {
                                                      var34 = 37;
                                                   }

                                                   Class50.method776(var52[var10], Class59_Sub1.method1978(16748608, (byte)122) + var30.aString2361, var34, 1548676283 * var30.anInt2359, var47, var14.anInt1925 * -1536575275, (byte)-55);
                                                } else if(4 == var10) {
                                                   Class50.method776(Class91.aString1048, Class59_Sub1.method1978(16748608, (byte)59) + var30.aString2361, 37, var30.anInt2359 * 1548676283, var47, var14.anInt1925 * -1536575275, (byte)-97);
                                                }
                                             }
                                          }

                                          int var55 = Class35.method645(var14, (byte)0);
                                          boolean var36 = 0 != (var55 >> 31 & 1);
                                          if(var36) {
                                             Class50.method776(Class91.aString1197, Class59_Sub1.method1978(16748608, (byte)54) + var30.aString2361, 38, var30.anInt2359 * 1548676283, var47, var14.anInt1925 * -1536575275, (byte)-24);
                                          }

                                          int var35 = Class35.method645(var14, (byte)0);
                                          boolean var32 = (var35 >> 30 & 1) != 0;
                                          byte var15;
                                          int var31;
                                          if(var32 && var52 != null) {
                                             for(var31 = 2; var31 >= 0; --var31) {
                                                if(var52[var31] != null) {
                                                   var15 = 0;
                                                   if(0 == var31) {
                                                      var15 = 33;
                                                   }

                                                   if(1 == var31) {
                                                      var15 = 34;
                                                   }

                                                   if(var31 == 2) {
                                                      var15 = 35;
                                                   }

                                                   Class50.method776(var52[var31], Class59_Sub1.method1978(16748608, (byte)118) + var30.aString2361, var15, 1548676283 * var30.anInt2359, var47, -1536575275 * var14.anInt1925, (byte)-17);
                                                }
                                             }
                                          }

                                          var52 = var14.aStringArray2049;
                                          if(client.aBool3104) {
                                             var52 = Canvas_Sub1.method2978(var52, -2013100815);
                                          }

                                          if(var52 != null) {
                                             for(var31 = 4; var31 >= 0; --var31) {
                                                if(null != var52[var31]) {
                                                   var15 = 0;
                                                   if(var31 == 0) {
                                                      var15 = 39;
                                                   }

                                                   if(1 == var31) {
                                                      var15 = 40;
                                                   }

                                                   if(2 == var31) {
                                                      var15 = 41;
                                                   }

                                                   if(3 == var31) {
                                                      var15 = 42;
                                                   }

                                                   if(var31 == 4) {
                                                      var15 = 43;
                                                   }

                                                   Class50.method776(var52[var31], Class59_Sub1.method1978(16748608, (byte)61) + var30.aString2361, var15, var30.anInt2359 * 1548676283, var47, -1536575275 * var14.anInt1925, (byte)-53);
                                                }
                                             }
                                          }

                                          Class50.method776(Class91.aString1198, Class59_Sub1.method1978(16748608, (byte)111) + var30.aString2361, 1005, 1548676283 * var30.anInt2359, var47, -1536575275 * var14.anInt1925, (byte)-97);
                                       }
                                    }
                                 }

                                 ++var47;
                              }
                           }
                        }

                        if(var14.aBool1924) {
                           if(client.aBool3088) {
                              var11 = Class35.method645(var14, (byte)0);
                              var48 = 0 != (var11 >> 21 & 1);
                              if(var48 && (2016481409 * Class38.anInt500 & 32) == 32) {
                                 Class50.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + var14.aString1996, 58, 0, 2021294259 * var14.anInt1926, var14.anInt1925 * -1536575275, (byte)-77);
                              }
                           } else {
                              for(var47 = 9; var47 >= 5; --var47) {
                                 String var37 = Player.method3565(var14, var47, 1928454074);
                                 if(var37 != null) {
                                    Class50.method776(var37, var14.aString1996, 1007, var47 + 1, var14.anInt1926 * 2021294259, -1536575275 * var14.anInt1925, (byte)-4);
                                 }
                              }

                              var20 = Class32.method594(var14, (byte)78);
                              if(var20 != null) {
                                 Class50.method776(var20, var14.aString1996, 25, 0, 2021294259 * var14.anInt1926, var14.anInt1925 * -1536575275, (byte)-117);
                              }

                              for(var11 = 4; var11 >= 0; --var11) {
                                 String var49 = Player.method3565(var14, var11, 24344481);
                                 if(null != var49) {
                                    Class50.method776(var49, var14.aString1996, 57, var11 + 1, 2021294259 * var14.anInt1926, -1536575275 * var14.anInt1925, (byte)-34);
                                 }
                              }

                              if(Class8.method141(Class35.method645(var14, (byte)0), (byte)1)) {
                                 Class50.method776(Class91.aString1052, "", 30, 0, 2021294259 * var14.anInt1926, var14.anInt1925 * -1536575275, (byte)-120);
                              }
                           }
                        }
                     }

                     if(-1305917269 * var14.anInt2018 == 0) {
                        if(!var14.aBool1924 && ISAAC.method806(var14, -1384487692) && ObjectDefinition.aClass116_Sub15_2240 != var14) {
                           continue;
                        }

                        method1841(var0, -1536575275 * var14.anInt1925, var24, var26, var17, var18, var21 - var14.anInt1946 * -352661099, var16 - -1602694527 * var14.anInt1947, -1381298403);
                        if(var14.aClass116_Sub15Array1995 != null) {
                           method1841(var14.aClass116_Sub15Array1995, -1536575275 * var14.anInt1925, var24, var26, var17, var18, var21 - var14.anInt1946 * -352661099, var16 - var14.anInt1947 * -1602694527, 679451363);
                        }

                        Class116_Sub11 var42 = (Class116_Sub11)client.aClass127_3094.method1658((long)(-1536575275 * var14.anInt1925));
                        if(var42 != null) {
                           if(var42.anInt1822 * -1882639549 == 0 && Class85.anInt991 * -453286219 >= var24 && 103771565 * Class85.anInt992 >= var26 && -453286219 * Class85.anInt991 < var17 && Class85.anInt992 * 103771565 < var18 && !client.aBool3074 && !client.aBool2957) {
                              for(Class116_Sub6 var40 = (Class116_Sub6)client.aClass117_3132.method1551(); null != var40; var40 = (Class116_Sub6)client.aClass117_3132.method1553()) {
                                 if(var40.aBool1739) {
                                    var40.unlink();
                                    var40.aClass116_Sub15_1736.aBool1994 = false;
                                 }
                              }

                              if(Class50.anInt672 * 1559668895 == 0) {
                                 client.aClass116_Sub15_3106 = null;
                                 client.aClass116_Sub15_3107 = null;
                              }

                              if(!client.aBool3074) {
                                 client.aStringArray3080[0] = Class91.aString1283;
                                 client.aStringArray3184[0] = "";
                                 client.anIntArray3037[0] = 1006;
                                 client.anInt3075 = 1937006435;
                              }
                           }

                           Class49.method773(226793949 * var42.anInt1821, var24, var26, var17, var18, var21, var16, (byte)75);
                        }
                     }

                     if(var14.aBool1924) {
                        Class116_Sub6 var43;
                        if(var14.aBool2056) {
                           if(-453286219 * Class85.anInt991 >= var24 && 103771565 * Class85.anInt992 >= var26 && Class85.anInt991 * -453286219 < var17 && 103771565 * Class85.anInt992 < var18) {
                              for(var43 = (Class116_Sub6)client.aClass117_3132.method1551(); null != var43; var43 = (Class116_Sub6)client.aClass117_3132.method1553()) {
                                 if(var43.aBool1739) {
                                    var43.unlink();
                                    var43.aClass116_Sub15_1736.aBool1994 = false;
                                 }
                              }

                              if(0 == Class50.anInt672 * 1559668895) {
                                 client.aClass116_Sub15_3106 = null;
                                 client.aClass116_Sub15_3107 = null;
                              }

                              if(!client.aBool3074) {
                                 client.aStringArray3080[0] = Class91.aString1283;
                                 client.aStringArray3184[0] = "";
                                 client.anIntArray3037[0] = 1006;
                                 client.anInt3075 = 1937006435;
                              }
                           }
                        } else if(var14.aBool2009 && -453286219 * Class85.anInt991 >= var24 && Class85.anInt992 * 103771565 >= var26 && -453286219 * Class85.anInt991 < var17 && Class85.anInt992 * 103771565 < var18) {
                           for(var43 = (Class116_Sub6)client.aClass117_3132.method1551(); var43 != null; var43 = (Class116_Sub6)client.aClass117_3132.method1553()) {
                              if(var43.aBool1739 && var43.anObjectArray1737 == var43.aClass116_Sub15_1736.anObjectArray2024) {
                                 var43.unlink();
                              }
                           }
                        }

                        boolean var44;
                        var44 = -453286219 * Class85.anInt991 >= var24 && Class85.anInt992 * 103771565 >= var26 && Class85.anInt991 * -453286219 < var17 && 103771565 * Class85.anInt992 < var18;

                        boolean var41 = false;
                        if((-562612321 * Class85.anInt994 == 1 || !PlayerAlias.aBool1756 && 4 == Class85.anInt994 * -562612321) && var44) {
                           var41 = true;
                        }

                        var48 = (823601801 * Class85.anInt997 == 1 || !PlayerAlias.aBool1756 && 4 == 823601801 * Class85.anInt997) && -2040065729 * Class85.anInt998 >= var24 && Class85.anInt999 * 2090526775 >= var26 && Class85.anInt998 * -2040065729 < var17 && Class85.anInt999 * 2090526775 < var18;

                        if(var48) {
                           Class79.method1098(var14, Class85.anInt998 * -2040065729 - var21, Class85.anInt999 * 2090526775 - var16, (short)-7416);
                        }

                        if(null != client.aClass116_Sub15_3106 && var14 != client.aClass116_Sub15_3106 && var44) {
                           var25 = Class35.method645(var14, (byte)0);
                           boolean var38 = 0 != (var25 >> 20 & 1);
                           if(var38) {
                              client.aClass116_Sub15_2935 = var14;
                           }
                        }

                        if(client.aClass116_Sub15_3107 == var14) {
                           client.aBool3111 = true;
                           client.anInt3112 = var21 * -548999593;
                           client.anInt3113 = -553751249 * var16;
                        }

                        if(var14.aBool2003) {
                           Class116_Sub6 var39;
                           if(var44 && 0 != -1955541359 * client.anInt3131 && null != var14.anObjectArray2024) {
                              var39 = new Class116_Sub6();
                              var39.aBool1739 = true;
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anInt1738 = client.anInt3131 * -528893375;
                              var39.anObjectArray1737 = var14.anObjectArray2024;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.aClass116_Sub15_3106 != null || Class116_Sub23_Sub1.aClass116_Sub15_2162 != null || client.aBool3074) {
                              var48 = false;
                              var41 = false;
                              var44 = false;
                           }

                           if(!var14.aBool1963 && var48) {
                              var14.aBool1963 = true;
                              if(var14.anObjectArray2005 != null) {
                                 var39 = new Class116_Sub6();
                                 var39.aBool1739 = true;
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anInt1747 = (Class85.anInt998 * -2040065729 - var21) * 1833150263;
                                 var39.anInt1738 = 1385195697 * (2090526775 * Class85.anInt999 - var16);
                                 var39.anObjectArray1737 = var14.anObjectArray2005;
                                 client.aClass117_3132.method1571(var39);
                              }
                           }

                           if(var14.aBool1963 && var41 && null != var14.anObjectArray2006) {
                              var39 = new Class116_Sub6();
                              var39.aBool1739 = true;
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anInt1747 = (Class85.anInt991 * -453286219 - var21) * 1833150263;
                              var39.anInt1738 = (103771565 * Class85.anInt992 - var16) * 1385195697;
                              var39.anObjectArray1737 = var14.anObjectArray2006;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(var14.aBool1963 && !var41) {
                              var14.aBool1963 = false;
                              if(null != var14.anObjectArray2007) {
                                 var39 = new Class116_Sub6();
                                 var39.aBool1739 = true;
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anInt1747 = (-453286219 * Class85.anInt991 - var21) * 1833150263;
                                 var39.anInt1738 = (103771565 * Class85.anInt992 - var16) * 1385195697;
                                 var39.anObjectArray1737 = var14.anObjectArray2007;
                                 client.aClass117_3134.method1571(var39);
                              }
                           }

                           if(var41 && var14.anObjectArray2008 != null) {
                              var39 = new Class116_Sub6();
                              var39.aBool1739 = true;
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anInt1747 = (-453286219 * Class85.anInt991 - var21) * 1833150263;
                              var39.anInt1738 = (Class85.anInt992 * 103771565 - var16) * 1385195697;
                              var39.anObjectArray1737 = var14.anObjectArray2008;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(!var14.aBool1994 && var44) {
                              var14.aBool1994 = true;
                              if(null != var14.anObjectArray1960) {
                                 var39 = new Class116_Sub6();
                                 var39.aBool1739 = true;
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anInt1747 = 1833150263 * (Class85.anInt991 * -453286219 - var21);
                                 var39.anInt1738 = (Class85.anInt992 * 103771565 - var16) * 1385195697;
                                 var39.anObjectArray1737 = var14.anObjectArray1960;
                                 client.aClass117_3132.method1571(var39);
                              }
                           }

                           if(var14.aBool1994 && var44 && null != var14.anObjectArray1931) {
                              var39 = new Class116_Sub6();
                              var39.aBool1739 = true;
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anInt1747 = (-453286219 * Class85.anInt991 - var21) * 1833150263;
                              var39.anInt1738 = 1385195697 * (Class85.anInt992 * 103771565 - var16);
                              var39.anObjectArray1737 = var14.anObjectArray1931;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(var14.aBool1994 && !var44) {
                              var14.aBool1994 = false;
                              if(var14.anObjectArray2011 != null) {
                                 var39 = new Class116_Sub6();
                                 var39.aBool1739 = true;
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anInt1747 = 1833150263 * (-453286219 * Class85.anInt991 - var21);
                                 var39.anInt1738 = (Class85.anInt992 * 103771565 - var16) * 1385195697;
                                 var39.anObjectArray1737 = var14.anObjectArray2011;
                                 client.aClass117_3134.method1571(var39);
                              }
                           }

                           if(null != var14.anObjectArray2022) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2022;
                              client.aClass117_3133.method1571(var39);
                           }

                           Class116_Sub6 var51;
                           if(null != var14.anObjectArray2039 && client.anInt3120 * -729938695 > var14.anInt2051 * -1243107947) {
                              if(null != var14.anIntArray2017 && client.anInt3120 * -729938695 - var14.anInt2051 * -1243107947 <= 32) {
                                 label957:
                                 for(var11 = -1243107947 * var14.anInt2051; var11 < client.anInt3120 * -729938695; ++var11) {
                                    var25 = client.anIntArray3119[var11 & 31];

                                    for(var27 = 0; var27 < var14.anIntArray2017.length; ++var27) {
                                       if(var25 == var14.anIntArray2017[var27]) {
                                          var51 = new Class116_Sub6();
                                          var51.aClass116_Sub15_1736 = var14;
                                          var51.anObjectArray1737 = var14.anObjectArray2039;
                                          client.aClass117_3132.method1571(var51);
                                          break label957;
                                       }
                                    }
                                 }
                              } else {
                                 var39 = new Class116_Sub6();
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anObjectArray1737 = var14.anObjectArray2039;
                                 client.aClass117_3132.method1571(var39);
                              }

                              var14.anInt2051 = client.anInt3120 * 1429878997;
                           }

                           if(var14.anObjectArray1972 != null && -1512766933 * client.anInt3025 > -1925975647 * var14.anInt2055) {
                              if(var14.anIntArray2019 != null && -1512766933 * client.anInt3025 - -1925975647 * var14.anInt2055 <= 32) {
                                 label938:
                                 for(var11 = var14.anInt2055 * -1925975647; var11 < -1512766933 * client.anInt3025; ++var11) {
                                    var25 = client.anIntArray3121[var11 & 31];

                                    for(var27 = 0; var27 < var14.anIntArray2019.length; ++var27) {
                                       if(var14.anIntArray2019[var27] == var25) {
                                          var51 = new Class116_Sub6();
                                          var51.aClass116_Sub15_1736 = var14;
                                          var51.anObjectArray1737 = var14.anObjectArray1972;
                                          client.aClass117_3132.method1571(var51);
                                          break label938;
                                       }
                                    }
                                 }
                              } else {
                                 var39 = new Class116_Sub6();
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anObjectArray1737 = var14.anObjectArray1972;
                                 client.aClass117_3132.method1571(var39);
                              }

                              var14.anInt2055 = -679331765 * client.anInt3025;
                           }

                           if(var14.anObjectArray2020 != null && -549276637 * client.anInt3124 > 415543593 * var14.anInt2053) {
                              if(var14.anIntArray1948 != null && -549276637 * client.anInt3124 - var14.anInt2053 * 415543593 <= 32) {
                                 label919:
                                 for(var11 = 415543593 * var14.anInt2053; var11 < -549276637 * client.anInt3124; ++var11) {
                                    var25 = client.anIntArray3123[var11 & 31];

                                    for(var27 = 0; var27 < var14.anIntArray1948.length; ++var27) {
                                       if(var14.anIntArray1948[var27] == var25) {
                                          var51 = new Class116_Sub6();
                                          var51.aClass116_Sub15_1736 = var14;
                                          var51.anObjectArray1737 = var14.anObjectArray2020;
                                          client.aClass117_3132.method1571(var51);
                                          break label919;
                                       }
                                    }
                                 }
                              } else {
                                 var39 = new Class116_Sub6();
                                 var39.aClass116_Sub15_1736 = var14;
                                 var39.anObjectArray1737 = var14.anObjectArray2020;
                                 client.aClass117_3132.method1571(var39);
                              }

                              var14.anInt2053 = -218863509 * client.anInt3124;
                           }

                           if(client.anInt3024 * -2089342185 > 1565124835 * var14.anInt2050 && null != var14.anObjectArray2025) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2025;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.anInt3068 * -537338829 > 1565124835 * var14.anInt2050 && null != var14.anObjectArray2027) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2027;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.anInt3127 * -1898555245 > var14.anInt2050 * 1565124835 && null != var14.anObjectArray2028) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2028;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.anInt3128 * 1861004399 > var14.anInt2050 * 1565124835 && var14.anObjectArray2033 != null) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2033;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.anInt3129 * -596556353 > 1565124835 * var14.anInt2050 && var14.anObjectArray2034 != null) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray2034;
                              client.aClass117_3132.method1571(var39);
                           }

                           if(client.anInt3122 * -747354515 > 1565124835 * var14.anInt2050 && null != var14.anObjectArray1982) {
                              var39 = new Class116_Sub6();
                              var39.aClass116_Sub15_1736 = var14;
                              var39.anObjectArray1737 = var14.anObjectArray1982;
                              client.aClass117_3132.method1571(var39);
                           }

                           var14.anInt2050 = client.anInt3118 * -1951905989;
                           if(null != var14.anObjectArray2026) {
                              for(var11 = 0; var11 < client.anInt3156 * -703165807; ++var11) {
                                 Class116_Sub6 var50 = new Class116_Sub6();
                                 var50.aClass116_Sub15_1736 = var14;
                                 var50.anInt1741 = -411848293 * client.anIntArray3158[var11];
                                 var50.anInt1742 = client.anIntArray3130[var11] * -784457691;
                                 var50.anObjectArray1737 = var14.anObjectArray2026;
                                 client.aClass117_3132.method1571(var50);
                              }
                           }
                        }
                     }

                     if(!var14.aBool1924 && client.aClass116_Sub15_3106 == null && Class116_Sub23_Sub1.aClass116_Sub15_2162 == null && !client.aBool3074) {
                        if((var14.anInt1978 * -700429819 >= 0 || 301172361 * var14.anInt1952 != 0) && -453286219 * Class85.anInt991 >= var24 && 103771565 * Class85.anInt992 >= var26 && Class85.anInt991 * -453286219 < var17 && Class85.anInt992 * 103771565 < var18) {
                           if(-700429819 * var14.anInt1978 >= 0) {
                              ObjectDefinition.aClass116_Sub15_2240 = var0[var14.anInt1978 * -700429819];
                           } else {
                              ObjectDefinition.aClass116_Sub15_2240 = var14;
                           }
                        }

                        if(-1305917269 * var14.anInt2018 == 8 && Class85.anInt991 * -453286219 >= var24 && 103771565 * Class85.anInt992 >= var26 && Class85.anInt991 * -453286219 < var17 && Class85.anInt992 * 103771565 < var18) {
                           Class116_Sub6.aClass116_Sub15_1745 = var14;
                        }

                        if(var14.anInt1949 * 177405235 > var14.anInt1974 * 1227800423) {
                           Class41.method694(var14, var14.anInt1940 * 1645211541 + var21, var16, 1227800423 * var14.anInt1974, 177405235 * var14.anInt1949, -453286219 * Class85.anInt991, Class85.anInt992 * 103771565, (short)-1386);
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
