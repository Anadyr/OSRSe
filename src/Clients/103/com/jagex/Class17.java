package com.jagex;

public class Class17 {

   public static final int anInt233 = 183;
   int[][] anIntArrayArray234;
   static final int anInt235 = 6;
   static final int anInt236 = 14;
   int anInt237;
   static final int anInt238 = 7;
   public static final int anInt239 = 15;
   int anInt240;


   public Class17(int var1, int var2) {
      if(var2 != var1) {
         int var7 = Class38.method679(var1, var2, (byte)20);
         var1 /= var7;
         var2 /= var7;
         this.anInt240 = var1 * 253720335;
         this.anInt237 = var2 * 1723015537;
         this.anIntArrayArray234 = new int[var1][14];

         for(int var8 = 0; var8 < var1; ++var8) {
            int[] var3 = this.anIntArrayArray234[var8];
            double var11 = (double)var8 / (double)var1 + 6.0D;
            int var4 = (int)Math.floor(var11 - 7.0D + 1.0D);
            if(var4 < 0) {
               var4 = 0;
            }

            int var13 = (int)Math.ceil(var11 + 7.0D);
            if(var13 > 14) {
               var13 = 14;
            }

            for(double var9 = (double)var2 / (double)var1; var4 < var13; ++var4) {
               double var14 = 3.141592653589793D * ((double)var4 - var11);
               double var5 = var9;
               if(var14 < -1.0E-4D || var14 > 1.0E-4D) {
                  var5 = var9 * (Math.sin(var14) / var14);
               }

               var5 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var4 - var11));
               var3[var4] = (int)Math.floor(65536.0D * var5 + 0.5D);
            }
         }

      }
   }

   static void method280(Applet_Sub1 var0, int var1) {
      if(Class6.worldListUp) {
         Class31.drawWorldList(var0, 1945802104);
      } else {
         if((823601801 * Class85.anInt997 == 1 || !PlayerAlias.aBool1756 && 4 == 823601801 * Class85.anInt997) && Class85.clickAreaX * -2040065729 >= Class6.anInt84 * 1933284923 + 765 - 50 && Class85.clickAreaY * 2090526775 >= 453) {
            Class116_Sub5.aClass29_1727.aBool409 = !Class116_Sub5.aClass29_1727.aBool409;
            Class86.method1167((byte)-38);
            if(!Class116_Sub5.aClass29_1727.aBool409) {
               Class108.method1505(Class2.aCacheIndex_23, "scape main", "", 255, false, 474250760);
            } else {
               Class128.aClass116_Sub4_Sub4_1576.method3075(-1740135719);
               Class128.anInt1574 = 325298615;
               Class128.aRSIndex_1575 = null;
            }
         }

         if(846055547 * client.loginStage != 5) {
            Class6.anInt92 += 1860184029;
            if(10 == 846055547 * client.loginStage || 11 == client.loginStage * 846055547) {
               int var7;
               if(0 == -1025678859 * client.anInt2938) {
                  if(1 == 823601801 * Class85.anInt997 || !PlayerAlias.aBool1756 && Class85.anInt997 * 823601801 == 4) {
                     var7 = 1933284923 * Class6.anInt84 + 5;
                     short var2 = 463;
                     byte var5 = 100;
                     byte var3 = 35;
                     if(-2040065729 * Class85.clickAreaX >= var7 && -2040065729 * Class85.clickAreaX <= var7 + var5 && Class85.clickAreaY * 2090526775 >= var2 && 2090526775 * Class85.clickAreaY <= var3 + var2) {
                        if(Class35.readWorldList(1002424370)) {
                           Class6.worldListUp = true;
                        }

                        return;
                     }
                  }

                  if(BuildType.worldListData != null && Class35.readWorldList(1002424370)) {
                     Class6.worldListUp = true;
                  }
               }

               var7 = Class85.anInt997 * 823601801;
               int var10 = Class85.clickAreaX * -2040065729;
               int var15 = 2090526775 * Class85.clickAreaY;
               if(!PlayerAlias.aBool1756 && 4 == var7) {
                  var7 = 1;
               }

               String var4;
               short var6;
               int var11;
               if(-1168104433 * Class6.anInt64 == 0) {
                  var11 = 180 + 1744540627 * Class6.anInt76 - 80;
                  var6 = 291;
                  if(var7 == 1 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= var6 + 20) {
                     var4 = Class45.method713("secure", true, -1643961891) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                     Friend.method1839(var4, true, "openjs", false, (byte) 3);
                  }

                  var11 = 80 + 1744540627 * Class6.anInt76 + 180;
                  if(1 == var7 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= var6 + 20) {
                     if(0 != (client.anInt2933 * 1115656689 & 4)) {
                        if(0 != (1115656689 * client.anInt2933 & 1024)) {
                           Class6.aString85 = Class91.aString1128;
                           Class6.aString86 = Class91.aString1269;
                           Class6.aString87 = Class91.aString1270;
                        } else {
                           Class6.aString85 = Class91.aString1262;
                           Class6.aString86 = Class91.aString1263;
                           Class6.aString87 = Class91.aString1143;
                        }

                        Class6.anInt64 = -217167121;
                        Class6.anInt63 = 0;
                     } else if(0 != (client.anInt2933 * 1115656689 & 1024)) {
                        Class6.aString85 = Class91.aString1264;
                        Class6.aString86 = Class91.aString1266;
                        Class6.aString87 = Class91.aString1267;
                        Class6.anInt64 = -217167121;
                        Class6.anInt63 = 0;
                     } else {
                        Class6.aString85 = Class91.aString1046;
                        Class6.aString86 = Class91.aString1259;
                        Class6.aString87 = Class91.aString1121;
                        Class6.anInt64 = -434334242;
                        Class6.anInt63 = 0;
                     }
                  }
               } else if(-1168104433 * Class6.anInt64 == 1) {
                  while(Class69.method986(2102970548)) {
                     if(Class5.anInt57 * -1989794123 == 84) {
                        Class6.aString85 = Class91.aString1046;
                        Class6.aString86 = Class91.aString1259;
                        Class6.aString87 = Class91.aString1121;
                        Class6.anInt64 = -434334242;
                        Class6.anInt63 = 0;
                     } else if(Class5.anInt57 * -1989794123 == 13) {
                        Class6.anInt64 = 0;
                     }
                  }

                  var11 = 1744540627 * Class6.anInt76 + 180 - 80;
                  var6 = 321;
                  if(var7 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var15 >= var6 - 20 && var15 <= var6 + 20) {
                     Class6.aString85 = Class91.aString1046;
                     Class6.aString86 = Class91.aString1259;
                     Class6.aString87 = Class91.aString1121;
                     Class6.anInt64 = -434334242;
                     Class6.anInt63 = 0;
                  }

                  var11 = 180 + 1744540627 * Class6.anInt76 + 80;
                  if(1 == var7 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= 20 + var6) {
                     Class6.anInt64 = 0;
                  }
               } else {
                  short var13;
                  if(-1168104433 * Class6.anInt64 == 2) {
                     var13 = 231;
                     var11 = var13 + 30;
                     if(1 == var7 && var15 >= var11 - 15 && var15 < var11) {
                        Class6.anInt63 = 0;
                     }

                     var11 += 15;
                     if(1 == var7 && var15 >= var11 - 15 && var15 < var11) {
                        Class6.anInt63 = 586349535;
                     }

                     var11 += 15;
                     var13 = 361;
                     if(var7 == 1 && var15 >= var13 - 15 && var15 < var13) {
                        Class7.method110(Class91.aString1289, Class91.aString1290, Class91.aString1291, 1935975903);
                        Class6.anInt64 = -1085835605;
                        return;
                     }

                     int var16 = Class6.anInt76 * 1744540627 + 180 - 80;
                     short var12 = 321;
                     if(var7 == 1 && var10 >= var16 - 75 && var10 <= 75 + var16 && var15 >= var12 - 20 && var15 <= var12 + 20) {
                        Class6.username = Class6.username.trim();
                        if(Class6.username.length() == 0) {
                           Class7.method110(Class91.aString1194, Class91.aString1306, Class91.aString1166, 1935975903);
                           return;
                        }

                        if(Class6.password.length() == 0) {
                           Class7.method110(Class91.aString1167, Class91.aString1085, Class91.aString1169, 1935975903);
                           return;
                        }

                        Class7.method110(Class91.aString1273, Class91.aString1274, Class91.aString1275, 1935975903);
                        Class6.aClass105_67 = Class116_Sub5.aClass29_1727.aLinkedHashMap406.containsKey(Integer.valueOf(Class103.method1450(Class6.username, 2044110770)))?Class105.aClass105_1434:Class105.aClass105_1436;
                        Class116_Sub12.method1983(20, (byte)87);
                        return;
                     }

                     var16 = 80 + Class6.anInt76 * 1744540627 + 180;
                     if(var7 == 1 && var10 >= var16 - 75 && var10 <= 75 + var16 && var15 >= var12 - 20 && var15 <= var12 + 20) {
                        Class6.anInt64 = 0;
                        Class6.username = "";
                        Class6.password = "";
                        Class132.anInt1597 = 0;
                        Class45.aString599 = "";
                        Class6.aBool91 = true;
                     }

                     while(Class69.method986(1859574103)) {
                        boolean var8 = false;

                        for(int var9 = 0; var9 < Class6.aString93.length(); ++var9) {
                           if(Class2.aChar24 == Class6.aString93.charAt(var9)) {
                              var8 = true;
                              break;
                           }
                        }

                        if(Class5.anInt57 * -1989794123 == 13) {
                           Class6.anInt64 = 0;
                           Class6.username = "";
                           Class6.password = "";
                           Class132.anInt1597 = 0;
                           Class45.aString599 = "";
                           Class6.aBool91 = true;
                        } else if(Class6.anInt63 * -1914929121 == 0) {
                           if(-1989794123 * Class5.anInt57 == 85 && Class6.username.length() > 0) {
                              Class6.username = Class6.username.substring(0, Class6.username.length() - 1);
                           }

                           if(-1989794123 * Class5.anInt57 == 84 || -1989794123 * Class5.anInt57 == 80) {
                              Class6.anInt63 = 586349535;
                           }

                           if(var8 && Class6.username.length() < 320) {
                              Class6.username = Class6.username + Class2.aChar24;
                           }
                        } else if(-1914929121 * Class6.anInt63 == 1) {
                           if(-1989794123 * Class5.anInt57 == 85 && Class6.password.length() > 0) {
                              Class6.password = Class6.password.substring(0, Class6.password.length() - 1);
                           }

                           if(84 == Class5.anInt57 * -1989794123 || -1989794123 * Class5.anInt57 == 80) {
                              Class6.anInt63 = 0;
                           }

                           if(Class5.anInt57 * -1989794123 == 84) {
                              Class6.username = Class6.username.trim();
                              if(Class6.username.length() == 0) {
                                 Class7.method110(Class91.aString1194, Class91.aString1306, Class91.aString1166, 1935975903);
                                 return;
                              }

                              if(Class6.password.length() == 0) {
                                 Class7.method110(Class91.aString1167, Class91.aString1085, Class91.aString1169, 1935975903);
                                 return;
                              }

                              Class7.method110(Class91.aString1273, Class91.aString1274, Class91.aString1275, 1935975903);
                              Class6.aClass105_67 = Class116_Sub5.aClass29_1727.aLinkedHashMap406.containsKey(Integer.valueOf(Class103.method1450(Class6.username, -1642290033)))?Class105.aClass105_1434:Class105.aClass105_1436;
                              Class116_Sub12.method1983(20, (byte)127);
                              return;
                           }

                           if(var8 && Class6.password.length() < 20) {
                              Class6.password = Class6.password + Class2.aChar24;
                           }
                        }
                     }
                  } else {
                     boolean var14;
                     int var17;
                     if(-1168104433 * Class6.anInt64 == 4) {
                        var11 = 180 + 1744540627 * Class6.anInt76 - 80;
                        var6 = 321;
                        if(1 == var7 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= 20 + var6) {
                           Class45.aString599.trim();
                           if(Class45.aString599.length() != 6) {
                              Class7.method110(Class91.aString1118, Class91.aString1081, Class91.aString1225, 1935975903);
                              return;
                           }

                           Class132.anInt1597 = Integer.parseInt(Class45.aString599) * -748784207;
                           Class45.aString599 = "";
                           Class6.aClass105_67 = Class6.aBool91?Class105.aClass105_1439:Class105.aClass105_1437;
                           Class7.method110(Class91.aString1273, Class91.aString1274, Class91.aString1275, 1935975903);
                           Class116_Sub12.method1983(20, (byte)34);
                           return;
                        }

                        if(var7 == 1 && var10 >= Class6.anInt76 * 1744540627 + 180 - 9 && var10 <= 130 + 1744540627 * Class6.anInt76 + 180 && var15 >= 263 && var15 <= 296) {
                           Class6.aBool91 = !Class6.aBool91;
                        }

                        if(var7 == 1 && var10 >= 1744540627 * Class6.anInt76 + 180 - 34 && var10 <= 34 + 1744540627 * Class6.anInt76 + 180 && var15 >= 351 && var15 <= 363) {
                           var4 = Class45.method713("secure", true, 851927232) + "m=totp-authenticator/disableTOTPRequest";
                           Friend.method1839(var4, true, "openjs", false, (byte) -10);
                        }

                        var11 = Class6.anInt76 * 1744540627 + 180 + 80;
                        if(var7 == 1 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= var6 + 20) {
                           Class6.anInt64 = 0;
                           Class6.username = "";
                           Class6.password = "";
                           Class132.anInt1597 = 0;
                           Class45.aString599 = "";
                        }

                        while(Class69.method986(1935265234)) {
                           var14 = false;

                           for(var17 = 0; var17 < Class6.aString78.length(); ++var17) {
                              if(Class2.aChar24 == Class6.aString78.charAt(var17)) {
                                 var14 = true;
                                 break;
                              }
                           }

                           if(Class5.anInt57 * -1989794123 == 13) {
                              Class6.anInt64 = 0;
                              Class6.username = "";
                              Class6.password = "";
                              Class132.anInt1597 = 0;
                              Class45.aString599 = "";
                           } else {
                              if(85 == -1989794123 * Class5.anInt57 && Class45.aString599.length() > 0) {
                                 Class45.aString599 = Class45.aString599.substring(0, Class45.aString599.length() - 1);
                              }

                              if(-1989794123 * Class5.anInt57 == 84) {
                                 Class45.aString599.trim();
                                 if(Class45.aString599.length() != 6) {
                                    Class7.method110(Class91.aString1118, Class91.aString1081, Class91.aString1225, 1935975903);
                                    return;
                                 }

                                 Class132.anInt1597 = Integer.parseInt(Class45.aString599) * -748784207;
                                 Class45.aString599 = "";
                                 Class6.aClass105_67 = Class6.aBool91?Class105.aClass105_1439:Class105.aClass105_1437;
                                 Class7.method110(Class91.aString1273, Class91.aString1274, Class91.aString1275, 1935975903);
                                 Class116_Sub12.method1983(20, (byte)58);
                                 return;
                              }

                              if(var14 && Class45.aString599.length() < 6) {
                                 Class45.aString599 = Class45.aString599 + Class2.aChar24;
                              }
                           }
                        }
                     } else if(5 == Class6.anInt64 * -1168104433) {
                        var11 = 180 + Class6.anInt76 * 1744540627 - 80;
                        var6 = 321;
                        if(var7 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var15 >= var6 - 20 && var15 <= 20 + var6) {
                           Class51.method782(-314141211);
                           return;
                        }

                        var11 = 180 + Class6.anInt76 * 1744540627 + 80;
                        if(var7 == 1 && var10 >= var11 - 75 && var10 <= var11 + 75 && var15 >= var6 - 20 && var15 <= 20 + var6) {
                           Class6.aString85 = Class91.aString1046;
                           Class6.aString86 = Class91.aString1259;
                           Class6.aString87 = Class91.aString1121;
                           Class6.anInt64 = -434334242;
                           Class6.anInt63 = 0;
                           Class6.password = "";
                        }

                        while(Class69.method986(1912057832)) {
                           var14 = false;

                           for(var17 = 0; var17 < Class6.aString93.length(); ++var17) {
                              if(Class2.aChar24 == Class6.aString93.charAt(var17)) {
                                 var14 = true;
                                 break;
                              }
                           }

                           if(13 == Class5.anInt57 * -1989794123) {
                              Class6.aString85 = Class91.aString1046;
                              Class6.aString86 = Class91.aString1259;
                              Class6.aString87 = Class91.aString1121;
                              Class6.anInt64 = -434334242;
                              Class6.anInt63 = 0;
                              Class6.password = "";
                           } else {
                              if(Class5.anInt57 * -1989794123 == 85 && Class6.username.length() > 0) {
                                 Class6.username = Class6.username.substring(0, Class6.username.length() - 1);
                              }

                              if(84 == -1989794123 * Class5.anInt57) {
                                 Class51.method782(-1659531954);
                                 return;
                              }

                              if(var14 && Class6.username.length() < 320) {
                                 Class6.username = Class6.username + Class2.aChar24;
                              }
                           }
                        }
                     } else if(Class6.anInt64 * -1168104433 == 6) {
                        while(Class69.method986(1992890020)) {
                           if(84 == -1989794123 * Class5.anInt57 || 13 == -1989794123 * Class5.anInt57) {
                              Class6.aString85 = Class91.aString1046;
                              Class6.aString86 = Class91.aString1259;
                              Class6.aString87 = Class91.aString1121;
                              Class6.anInt64 = -434334242;
                              Class6.anInt63 = 0;
                              Class6.password = "";
                           }
                        }

                        var13 = 321;
                        if(1 == var7 && var15 >= var13 - 20 && var15 <= 20 + var13) {
                           Class6.aString85 = Class91.aString1046;
                           Class6.aString86 = Class91.aString1259;
                           Class6.aString87 = Class91.aString1121;
                           Class6.anInt64 = -434334242;
                           Class6.anInt63 = 0;
                           Class6.password = "";
                        }
                     }
                  }
               }

            }
         }
      }
   }

   int method281(int var1, int var2) {
      if(this.anIntArrayArray234 != null) {
         var1 = (int)((long)(this.anInt237 * 1822654353) * (long)var1 / (long)(this.anInt240 * 389715951));
      }

      return var1;
   }

   byte[] method285(byte[] var1, int var2) {
      if(this.anIntArrayArray234 != null) {
         int var10 = (int)((long)var1.length * (long)(this.anInt237 * 1822654353) / (long)(389715951 * this.anInt240)) + 14;
         int[] var9 = new int[var10];
         int var3 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.anIntArrayArray234[var5];

            int var4;
            for(var4 = 0; var4 < 14; ++var4) {
               var9[var3 + var4] += var8[var4] * var7;
            }

            var5 += 1822654353 * this.anInt237;
            var4 = var5 / (389715951 * this.anInt240);
            var3 += var4;
            var5 -= 389715951 * this.anInt240 * var4;
         }

         var1 = new byte[var10];

         for(var6 = 0; var6 < var10; ++var6) {
            int var11 = '\u8000' + var9[var6] >> 16;
            if(var11 < -128) {
               var1[var6] = -128;
            } else if(var11 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var11;
            }
         }
      }

      return var1;
   }

   protected static final void method289(int var0) {
      RSFIT.anImage876 = null;
      Class8.aFont129 = null;
      ISAAC.aFontMetrics701 = null;
   }

   int method290(int var1, int var2) {
      if(this.anIntArrayArray234 != null) {
         var1 = 6 + (int)((long)(1822654353 * this.anInt237) * (long)var1 / (long)(this.anInt240 * 389715951));
      }

      return var1;
   }
}
