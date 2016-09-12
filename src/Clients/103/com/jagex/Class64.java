package com.jagex;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class64 {

   public static final int anInt810 = 144;
	static final int anInt813 = 41;
	static Calendar aCalendar809;
   static String[] aStringArray811 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   static String[][] aStringArrayArray812 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};

   static {
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      aCalendar809 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

	Class64() throws Throwable {
		throw new Error();
	}

   public static String method936(long var0) {
      aCalendar809.setTime(new Date(var0));
      int var2 = aCalendar809.get(7);
      int var3 = aCalendar809.get(5);
      int var4 = aCalendar809.get(2);
      int var5 = aCalendar809.get(1);
      int var6 = aCalendar809.get(11);
      int var7 = aCalendar809.get(12);
      int var8 = aCalendar809.get(13);
      return aStringArray811[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + aStringArrayArray812[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   static final void method937(Class116_Sub15[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      DrawingArea.method2901(var2, var3, var4, var5);
      Texture.method3190();

      for(int var15 = 0; var15 < var0.length; ++var15) {
         Class116_Sub15 var16 = var0[var15];
         if(var16 != null && (var1 == -1652479707 * var16.anInt1944 || -1412584499 == var1 && client.aClass116_Sub15_3106 == var16)) {
            int var19;
            if(-1 == var8) {
               client.anIntArray3141[client.anInt3136 * -580551879] = var6 + 332168295 * var16.anInt1938;
               client.anIntArray3142[-580551879 * client.anInt3136] = var7 + var16.anInt1939 * 1492425953;
               client.anIntArray3143[-580551879 * client.anInt3136] = 1645211541 * var16.anInt1940;
               client.anIntArray3144[-580551879 * client.anInt3136] = var16.anInt1974 * 1227800423;
               var19 = (client.anInt3136 += 904200969) * -580551879 - 1;
            } else {
               var19 = var8;
            }

            var16.anInt2054 = var19 * -2140330043;
            var16.anInt1966 = client.anInt2943 * -672967433;
            if(!var16.aBool1924 || !ISAAC.method806(var16, -2103870416)) {
               if(var16.anInt2016 * -179718399 > 0) {
                  Class22.method343(var16, 2068232623);
               }

               int var11 = var6 + 332168295 * var16.anInt1938;
               int var12 = var7 + 1492425953 * var16.anInt1939;
               int var20 = -1508397471 * var16.anInt1955;
               int var23;
               int var24;
               if(client.aClass116_Sub15_3106 == var16) {
                  if(-1412584499 != var1 && !var16.aBool2021) {
                     Class6.aClass116_Sub15Array98 = var0;
                     Class40.anInt523 = 959363241 * var6;
                     Class86.anInt1016 = 1028642145 * var7;
                     continue;
                  }

                  if(client.aBool3117 && client.aBool3111) {
                     var23 = -453286219 * Class85.anInt991;
                     var24 = Class85.anInt992 * 103771565;
                     var23 -= client.anInt3087 * -725471655;
                     var24 -= 702495857 * client.anInt3109;
                     if(var23 < 1272175975 * client.anInt3112) {
                        var23 = 1272175975 * client.anInt3112;
                     }

                     if(1645211541 * var16.anInt1940 + var23 > client.aClass116_Sub15_3107.anInt1940 * 1645211541 + client.anInt3112 * 1272175975) {
                        var23 = 1272175975 * client.anInt3112 + client.aClass116_Sub15_3107.anInt1940 * 1645211541 - var16.anInt1940 * 1645211541;
                     }

                     if(var24 < client.anInt3113 * -765593137) {
                        var24 = -765593137 * client.anInt3113;
                     }

                     if(var24 + var16.anInt1974 * 1227800423 > 1227800423 * client.aClass116_Sub15_3107.anInt1974 + -765593137 * client.anInt3113) {
                        var24 = -765593137 * client.anInt3113 + 1227800423 * client.aClass116_Sub15_3107.anInt1974 - var16.anInt1974 * 1227800423;
                     }

                     var11 = var23;
                     var12 = var24;
                  }

                  if(!var16.aBool2021) {
                     var20 = 128;
                  }
               }

               int var10;
               int var14;
               int var17;
               int var29;
               int var30;
               int var32;
               if(var16.anInt2018 * -1305917269 == 2) {
                  var23 = var2;
                  var24 = var3;
                  var29 = var4;
                  var30 = var5;
               } else if(var16.anInt2018 * -1305917269 == 9) {
                  var10 = var11;
                  var17 = var12;
                  var14 = var16.anInt1940 * 1645211541 + var11;
                  var32 = var16.anInt1974 * 1227800423 + var12;
                  if(var14 < var11) {
                     var10 = var14;
                     var14 = var11;
                  }

                  if(var32 < var12) {
                     var17 = var32;
                     var32 = var12;
                  }

                  ++var14;
                  ++var32;
                  var23 = var10 > var2?var10:var2;
                  var24 = var17 > var3?var17:var3;
                  var29 = var14 < var4?var14:var4;
                  var30 = var32 < var5?var32:var5;
               } else {
                  var10 = var16.anInt1940 * 1645211541 + var11;
                  var17 = 1227800423 * var16.anInt1974 + var12;
                  var23 = var11 > var2?var11:var2;
                  var24 = var12 > var3?var12:var3;
                  var29 = var10 < var4?var10:var4;
                  var30 = var17 < var5?var17:var5;
               }

               if(!var16.aBool1924 || var23 < var29 && var24 < var30) {
                  int var25;
                  int var26;
                  int var27;
                  int var28;
                  int var31;
                  int var35;
                  int var36;
                  int var37;
                  int var38;
                  int var39;
                  int var40;
                  int var41;
                  if(-179718399 * var16.anInt2016 != 0) {
                     if(var16.anInt2016 * -179718399 == 1336) {
                        if(client.aBool2949) {
                           var12 += 15;
                           client.aClass116_Sub23_Sub19_Sub4_Sub1_2989.method3461("Fps:" + client.anInt2918 * 305420995, var11 + 1645211541 * var16.anInt1940, var12, 16776960, -1);
                           var12 += 15;
                           Runtime var57 = Runtime.getRuntime();
                           var17 = (int)((var57.totalMemory() - var57.freeMemory()) / 1024L);
                           var14 = 16776960;
                           if(var17 > '\u8000' && client.aBool2937) {
                              var14 = 16711680;
                           }

                           if(var17 > 65536 && !client.aBool2937) {
                              var14 = 16711680;
                           }

                           client.aClass116_Sub23_Sub19_Sub4_Sub1_2989.method3461("Mem:" + var17 + "k", var11 + 1645211541 * var16.anInt1940, var12, var14, -1);
                           var12 += 15;
                        }
                        continue;
                     }

                     if(-179718399 * var16.anInt2016 == 1337) {
                        client.anInt3082 = -247064981 * var11;
                        client.anInt3083 = -630066539 * var12;
                        var14 = 1645211541 * var16.anInt1940;
                        var32 = var16.anInt1974 * 1227800423;
                        client.anInt3179 += -1632613309;
                        TileObj5.method699(Class1.aClass1_4, 431562137);
                        boolean var60 = false;
                        if(971766913 * client.anInt3065 >= 0) {
                           var31 = -334270159 * Class7.anInt107;
                           int[] var73 = Class7.anIntArray108;

                           for(var25 = 0; var25 < var31; ++var25) {
                              if(971766913 * client.anInt3065 == var73[var25]) {
                                 var60 = true;
                                 break;
                              }
                           }
                        }

                        if(var60) {
                           TileObj5.method699(Class1.aClass1_2, 1008786065);
                        }

                        Class60.method899(true, -1629932980);
                        TileObj5.method699(var60 ? Class1.aClass1_8 : Class1.aClass1_3, 312852137);
                        Class60.method899(false, -1629932980);
                        Class33.method639(-21847456);
                        Class29.method583(1897316947);
                        Class14.method255(var11, var12, var14, var32, true, 711654574);
                        var10 = 1146064501 * client.anInt3197;
                        var17 = client.anInt3198 * -990874927;
                        var14 = 2112468213 * client.anInt3126;
                        var32 = -336695531 * client.anInt2986;
                        DrawingArea.method2901(var10, var17, var10 + var14, var32 + var17);
                        Texture.method3190();
                        int var21;
                        if(!client.aBool2988) {
                           var31 = -1992036739 * client.anInt2994;
                           if(client.anInt3077 * 137595259 / 256 > var31) {
                              var31 = 137595259 * client.anInt3077 / 256;
                           }

                           if(client.aBoolArray2970[4] && client.anIntArray3186[4] + 128 > var31) {
                              var31 = 128 + client.anIntArray3186[4];
                           }

                           var39 = client.anInt3004 * -1913217891 + client.anInt2929 * -1916997753 & 2047;
                           var25 = -2122646045 * Class7.anInt117;
                           var41 = MobDefinition.method2552(1272643751 * Class79.aPlayer_909.anInt2609, Class79.aPlayer_909.anInt2579 * -1801433343, -747958745 * Class116_Sub11.anInt1819, (short) 12477) - client.anInt3153 * -868608503;
                           var26 = 1406199355 * Class116_Sub23_Sub4.anInt2249;
                           var27 = 3 * var31 + 600;
                           var28 = 2048 - var31 & 2047;
                           var38 = 2048 - var39 & 2047;
                           var40 = 0;
                           var35 = 0;
                           var37 = var27;
                           int var34;
                           if(var28 != 0) {
                              var36 = Texture.anIntArray2708[var28];
                              var34 = Texture.anIntArray2713[var28];
                              var21 = var34 * var35 - var36 * var27 >> 16;
                              var37 = var34 * var27 + var36 * var35 >> 16;
                              var35 = var21;
                           }

                           if(0 != var38) {
                              var36 = Texture.anIntArray2708[var38];
                              var34 = Texture.anIntArray2713[var38];
                              var21 = var34 * var40 + var36 * var37 >> 16;
                              var37 = var34 * var37 - var40 * var36 >> 16;
                              var40 = var21;
                           }

                           Class116_Sub23_Sub16_Sub5.anInt2740 = (var25 - var40) * 933251441;
                           Class50.anInt671 = (var41 - var35) * -1022442815;
                           Class83.anInt968 = (var26 - var37) * 1432154999;
                           Class78.anInt904 = 1852239419 * var31;
                           Class76.anInt895 = 531969645 * var39;
                        }

                        if(!client.aBool2988) {
                           var31 = Class67.method978(-680324867);
                        } else {
                           var31 = Class59_Sub1.method1977(921831519);
                        }

                        var39 = 282154897 * Class116_Sub23_Sub16_Sub5.anInt2740;
                        var25 = Class50.anInt671 * 1447873857;
                        var41 = -324676025 * Class83.anInt968;
                        var26 = Class78.anInt904 * 1162853107;
                        var27 = Class76.anInt895 * -210812059;

                        for(var28 = 0; var28 < 5; ++var28) {
                           if(client.aBoolArray2970[var28]) {
                              var38 = (int)(Math.random() * (double)(1 + client.anIntArray3185[var28] * 2) - (double)client.anIntArray3185[var28] + Math.sin((double)client.anIntArray3188[var28] * ((double)client.anIntArray3189[var28] / 100.0D)) * (double)client.anIntArray3186[var28]);
                              if(0 == var28) {
                                 Class116_Sub23_Sub16_Sub5.anInt2740 += var38 * 933251441;
                              }

                              if(var28 == 1) {
                                 Class50.anInt671 += var38 * -1022442815;
                              }

                              if(var28 == 2) {
                                 Class83.anInt968 += var38 * 1432154999;
                              }

                              if(3 == var28) {
                                 Class76.anInt895 = 531969645 * (Class76.anInt895 * -210812059 + var38 & 2047);
                              }

                              if(var28 == 4) {
                                 Class78.anInt904 += var38 * 1852239419;
                                 if(1162853107 * Class78.anInt904 < 128) {
                                    Class78.anInt904 = 863444352;
                                 }

                                 if(Class78.anInt904 * 1162853107 > 383) {
                                    Class78.anInt904 = 738093637;
                                 }
                              }
                           }
                        }

                        var28 = -453286219 * Class85.anInt991;
                        var38 = Class85.anInt992 * 103771565;
                        if(0 != Class85.anInt997 * 823601801) {
                           var28 = -2040065729 * Class85.anInt998;
                           var38 = 2090526775 * Class85.anInt999;
                        }

                        if(var28 >= var10 && var28 < var10 + var14 && var38 >= var17 && var38 < var32 + var17) {
                           SpotAnim.aBool2836 = true;
                           SpotAnim.anInt2839 = 0;
                           SpotAnim.anInt2837 = var28 - var10;
                           SpotAnim.anInt2843 = var38 - var17;
                        } else {
                           SpotAnim.aBool2836 = false;
                           SpotAnim.anInt2839 = 0;
                        }

                        Class42.method695((byte)59);
                        DrawingArea.method2927(var10, var17, var14, var32, 0);
                        Class42.method695((byte)75);
                        var40 = Texture.anInt2704;
                        Texture.anInt2704 = -478819715 * client.anInt3059;
                        Class116_Sub11.groundItemController.method383(Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897, 1447873857 * Class50.anInt671, -324676025 * Class83.anInt968, Class78.anInt904 * 1162853107, Class76.anInt895 * -210812059, var31);
                        Texture.anInt2704 = var40;
                        Class42.method695((byte)35);
                        Class116_Sub11.groundItemController.method412();
                        client.anInt3029 = 0;
                        boolean var66 = false;
                        var37 = -1;
                        var36 = Class7.anInt107 * -334270159;
                        int[] var64 = Class7.anIntArray108;

                        for(var21 = 0; var21 < var36 + client.npcCount * 727116725; ++var21) {
                           Object var44;
                           if(var21 < var36) {
                              var44 = client.globalPlayers[var64[var21]];
                              if(971766913 * client.anInt3065 == var64[var21]) {
                                 var66 = true;
                                 var37 = var21;
                                 continue;
                              }
                           } else {
                              var44 = client.aMobArray2972[client.npcIndicies[var21 - var36]];
                           }

                           Class47.method720((Entity)var44, var21, var10, var17, var14, var32, (byte)-97);
                        }

                        if(var66) {
                           Class47.method720(client.globalPlayers[971766913 * client.anInt3065], var37, var10, var17, var14, var32, (byte)-98);
                        }

                        for(var21 = 0; var21 < -1673918139 * client.anInt3029; ++var21) {
                           int var74 = client.anIntArray3031[var21];
                           int var45 = client.anIntArray3032[var21];
                           int var46 = client.anIntArray3034[var21];
                           int var22 = client.anIntArray3033[var21];
                           boolean var47 = true;

                           while(var47) {
                              var47 = false;

                              for(int var42 = 0; var42 < var21; ++var42) {
                                 if(2 + var45 > client.anIntArray3032[var42] - client.anIntArray3033[var42] && var45 - var22 < client.anIntArray3032[var42] + 2 && var74 - var46 < client.anIntArray3031[var42] + client.anIntArray3034[var42] && var74 + var46 > client.anIntArray3031[var42] - client.anIntArray3034[var42] && client.anIntArray3032[var42] - client.anIntArray3033[var42] < var45) {
                                    var45 = client.anIntArray3032[var42] - client.anIntArray3033[var42];
                                    var47 = true;
                                 }
                              }
                           }

                           client.anInt3041 = client.anIntArray3031[var21] * 1776163475;
                           client.anInt3042 = (client.anIntArray3032[var21] = var45) * -192643311;
                           String var72 = client.aStringArray3038[var21];
                           if(1839264745 * client.anInt3095 == 0) {
                              int var13 = 16776960;
                              if(client.anIntArray3035[var21] < 6) {
                                 var13 = client.anIntArray2956[client.anIntArray3035[var21]];
                              }

                              if(client.anIntArray3035[var21] == 6) {
                                 var13 = -1317183381 * client.anInt3179 % 20 < 10?16711680:16776960;
                              }

                              if(7 == client.anIntArray3035[var21]) {
                                 var13 = client.anInt3179 * -1317183381 % 20 < 10?255:'\uffff';
                              }

                              if(8 == client.anIntArray3035[var21]) {
                                 var13 = client.anInt3179 * -1317183381 % 20 < 10?'\ub000':8454016;
                              }

                              int var33;
                              if(9 == client.anIntArray3035[var21]) {
                                 var33 = 150 - client.anIntArray3093[var21];
                                 if(var33 < 50) {
                                    var13 = 1280 * var33 + 16711680;
                                 } else if(var33 < 100) {
                                    var13 = 16776960 - (var33 - 50) * 327680;
                                 } else if(var33 < 150) {
                                    var13 = 5 * (var33 - 100) + '\uff00';
                                 }
                              }

                              if(client.anIntArray3035[var21] == 10) {
                                 var33 = 150 - client.anIntArray3093[var21];
                                 if(var33 < 50) {
                                    var13 = var33 * 5 + 16711680;
                                 } else if(var33 < 100) {
                                    var13 = 16711935 - (var33 - 50) * 327680;
                                 } else if(var33 < 150) {
                                    var13 = 327680 * (var33 - 100) + 255 - 5 * (var33 - 100);
                                 }
                              }

                              if(client.anIntArray3035[var21] == 11) {
                                 var33 = 150 - client.anIntArray3093[var21];
                                 if(var33 < 50) {
                                    var13 = 16777215 - var33 * 327685;
                                 } else if(var33 < 100) {
                                    var13 = '\uff00' + (var33 - 50) * 327685;
                                 } else if(var33 < 150) {
                                    var13 = 16777215 - 327680 * (var33 - 100);
                                 }
                              }

                              if(client.anIntArray3036[var21] == 0) {
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3492(var72, client.anInt3041 * -94432357 + var10, client.anInt3042 * -770682383 + var17, var13, 0);
                              }

                              if(1 == client.anIntArray3036[var21]) {
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3450(var72, var10 + client.anInt3041 * -94432357, client.anInt3042 * -770682383 + var17, var13, 0, client.anInt3179 * -1317183381);
                              }

                              if(client.anIntArray3036[var21] == 2) {
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3465(var72, var10 + -94432357 * client.anInt3041, var17 + client.anInt3042 * -770682383, var13, 0, -1317183381 * client.anInt3179);
                              }

                              if(client.anIntArray3036[var21] == 3) {
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3466(var72, var10 + -94432357 * client.anInt3041, var17 + -770682383 * client.anInt3042, var13, 0, -1317183381 * client.anInt3179, 150 - client.anIntArray3093[var21]);
                              }

                              if(client.anIntArray3036[var21] == 4) {
                                 var33 = (150 - client.anIntArray3093[var21]) * (Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3455(var72) + 100) / 150;
                                 DrawingArea.method2890(client.anInt3041 * -94432357 + var10 - 50, var17, var10 + client.anInt3041 * -94432357 + 50, var17 + var32);
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3481(var72, -94432357 * client.anInt3041 + var10 + 50 - var33, var17 + -770682383 * client.anInt3042, var13, 0);
                                 DrawingArea.method2901(var10, var17, var10 + var14, var17 + var32);
                              }

                              if(5 == client.anIntArray3036[var21]) {
                                 var33 = 150 - client.anIntArray3093[var21];
                                 int var43 = 0;
                                 if(var33 < 25) {
                                    var43 = var33 - 25;
                                 } else if(var33 > 125) {
                                    var43 = var33 - 125;
                                 }

                                 DrawingArea.method2890(var10, -770682383 * client.anInt3042 + var17 - Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.anInt2859 - 1, var14 + var10, 5 + var17 + -770682383 * client.anInt3042);
                                 Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3492(var72, var10 + client.anInt3041 * -94432357, client.anInt3042 * -770682383 + var17 + var43, var13, 0);
                                 DrawingArea.method2901(var10, var17, var14 + var10, var32 + var17);
                              }
                           } else {
                              Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3492(var72, var10 + client.anInt3041 * -94432357, -770682383 * client.anInt3042 + var17, 16776960, 0);
                           }
                        }

                        if(314519437 * client.anInt3021 == 2) {
	                        Class2.method39(client.anInt3070 * -1809686571 + (-1261526983 * client.anInt2954 - 1426698711 * Class116_Sub17.clickX << 7), (client.anInt2950 * -1901147055 - Class33.clickY * 714823515 << 7) + -1460280361 * client.anInt2958, 1818880718 * client.anInt2968, (byte) -10);
	                        if(-94432357 * client.anInt3041 > -1 && client.anInt2943 * -1040073859 % 20 < 10) {
                              Class47.aClass116_Sub23_Sub19_Sub2Array646[0].drawSprite(-94432357 * client.anInt3041 + var10 - 12, -770682383 * client.anInt3042 + var17 - 28);
                           }
                        }

                        ((Class36) Texture.anInterface3_2718).method649(-1163930299 * client.anInt3012, 1616687758);
                        Class5.method50(var10, var17, var14, var32, 1359159281);
                        Class116_Sub23_Sub16_Sub5.anInt2740 = 933251441 * var39;
                        Class50.anInt671 = var25 * -1022442815;
                        Class83.anInt968 = 1432154999 * var41;
                        Class78.anInt904 = var26 * 1852239419;
                        Class76.anInt895 = var27 * 531969645;
                        if(client.aBool3187) {
                           byte var68 = 0;
                           var37 = var68 + 1721465631 * Class93.anInt1349 + 1018165549 * Class93.anInt1339;
                           if(var37 == 0) {
                              client.aBool3187 = false;
                           }
                        }

                        if(client.aBool3187) {
                           DrawingArea.method2927(var10, var17, var14, var32, 0);
                           Class94.method1300(Class91.aString1056, false, 192613465);
                        }

                        client.aBoolArray3073[var16.anInt2054 * 1983233805] = true;
                        DrawingArea.method2901(var2, var3, var4, var5);
                        continue;
                     }

                     if(var16.anInt2016 * -179718399 == 1338) {
                        Class116_Sub12.drawMiniMap(var16, var11, var12, var19, (short) 25182);
                        DrawingArea.method2901(var2, var3, var4, var5);
                        continue;
                     }

                     if(1339 == var16.anInt2016 * -179718399) {
                        Class116_Sub23_Sub20 var56 = var16.method2255(false, 1970516760);
                        if(var56 != null) {
                           if(-1797803011 * client.anInt3170 < 3) {
                              Class59_Sub1.aClass116_Sub23_Sub19_Sub2_1829.method3283(var11, var12, var56.anInt2516 * 662480183, -988977157 * var56.anInt2518, 25, 25, client.anInt2929 * -1916997753, 256, var56.anIntArray2513, var56.anIntArray2512);
                           } else {
                              DrawingArea.method2904(var11, var12, 0, var56.anIntArray2513, var56.anIntArray2512);
                           }
                        }

                        DrawingArea.method2901(var2, var3, var4, var5);
                        continue;
                     }
                  }

                  if(0 == var16.anInt2018 * -1305917269) {
                     if(!var16.aBool1924 && ISAAC.method806(var16, -1754691995) && ObjectDefinition.aClass116_Sub15_2240 != var16) {
                        continue;
                     }

                     if(!var16.aBool1924) {
                        if(-1602694527 * var16.anInt1947 > var16.anInt1949 * 177405235 - var16.anInt1974 * 1227800423) {
                           var16.anInt1947 = var16.anInt1949 * -1656271437 - var16.anInt1974 * -1999090201;
                        }

                        if(-1602694527 * var16.anInt1947 < 0) {
                           var16.anInt1947 = 0;
                        }
                     }

                     method937(var0, var16.anInt1925 * -1536575275, var23, var24, var29, var30, var11 - -352661099 * var16.anInt1946, var12 - var16.anInt1947 * -1602694527, var19, -433614785);
                     if(var16.aClass116_Sub15Array1995 != null) {
                        method937(var16.aClass116_Sub15Array1995, var16.anInt1925 * -1536575275, var23, var24, var29, var30, var11 - var16.anInt1946 * -352661099, var12 - var16.anInt1947 * -1602694527, var19, -2108828245);
                     }

                     Class116_Sub11 var48 = (Class116_Sub11)client.aClass127_3094.method1658((long)(-1536575275 * var16.anInt1925));
                     if(var48 != null) {
                        Class29.method585(226793949 * var48.anInt1821, var23, var24, var29, var30, var11, var12, var19, 1922789842);
                     }

                     DrawingArea.method2901(var2, var3, var4, var5);
                     Texture.method3190();
                  }

                  if(client.aBool3140 || client.aBoolArray3102[var19] || 1685649351 * client.anInt3145 > 1) {
                     int var18;
                     if(-1305917269 * var16.anInt2018 == 0 && !var16.aBool1924 && 177405235 * var16.anInt1949 > 1227800423 * var16.anInt1974) {
                        var10 = var16.anInt1940 * 1645211541 + var11;
                        var17 = -1602694527 * var16.anInt1947;
                        var14 = 1227800423 * var16.anInt1974;
                        var32 = 177405235 * var16.anInt1949;
                        Class41.aClass116_Sub23_Sub19_Sub3Array546[0].method3359(var10, var12);
                        Class41.aClass116_Sub23_Sub19_Sub3Array546[1].method3359(var10, var14 + var12 - 16);
                        DrawingArea.method2927(var10, var12 + 16, 16, var14 - 32, 15197487 * client.anInt3013);
                        var18 = (var14 - 32) * var14 / var32;
                        if(var18 < 8) {
                           var18 = 8;
                        }

                        var31 = var17 * (var14 - 32 - var18) / (var32 - var14);
                        DrawingArea.method2927(var10, var31 + 16 + var12, 16, var18, 403555201 * client.anInt3014);
                        DrawingArea.method2893(var10, var31 + var12 + 16, var18, 439456629 * client.anInt3016);
                        DrawingArea.method2893(var10 + 1, 16 + var12 + var31, var18, 439456629 * client.anInt3016);
                        DrawingArea.method2942(var10, var31 + 16 + var12, 16, client.anInt3016 * 439456629);
                        DrawingArea.method2942(var10, var12 + 17 + var31, 16, client.anInt3016 * 439456629);
                        DrawingArea.method2893(var10 + 15, var12 + 16 + var31, var18, 1001974215 * client.anInt3015);
                        DrawingArea.method2893(14 + var10, var31 + 17 + var12, var18 - 1, client.anInt3015 * 1001974215);
                        DrawingArea.method2942(var10, var18 + var31 + var12 + 15, 16, 1001974215 * client.anInt3015);
                        DrawingArea.method2942(var10 + 1, var12 + 14 + var31 + var18, 15, client.anInt3015 * 1001974215);
                     }

                     if(1 != var16.anInt2018 * -1305917269) {
                        if(2 == var16.anInt2018 * -1305917269) {
                           var10 = 0;

                           for(var17 = 0; var17 < 507570867 * var16.anInt1937; ++var17) {
                              for(var14 = 0; var14 < var16.anInt1936 * 124195285; ++var14) {
                                 var32 = (1918789959 * var16.anInt1928 + 32) * var14 + var11;
                                 var18 = var12 + (var16.anInt2010 * -1195323371 + 32) * var17;
                                 if(var10 < 20) {
                                    var32 += var16.anIntArray1962[var10];
                                    var18 += var16.anIntArray1992[var10];
                                 }

                                 if(var16.anIntArray2047[var10] > 0) {
                                    boolean var65 = false;
                                    boolean var70 = false;
                                    var25 = var16.anIntArray2047[var10] - 1;
                                    if(var32 + 32 > var2 && var32 < var4 && var18 + 32 > var3 && var18 < var5 || var16 == Class116_Sub23_Sub1.aClass116_Sub15_2162 && 1979905201 * client.anInt3049 == var10) {
                                       Sprite var71;
                                       if(1 == client.anInt2991 * -1110581093 && var10 == 543565821 * Class49.anInt661 && -1536575275 * var16.anInt1925 == Class26.anInt365 * -47339353) {
                                          var71 = Animable.method2878(var25, var16.anIntArray2042[var10], 2, 0, 2, false, 940233548);
                                       } else {
                                          var71 = Animable.method2878(var25, var16.anIntArray2042[var10], 1, 3153952, 2, false, 389483616);
                                       }

                                       if(var71 != null) {
                                          if(Class116_Sub23_Sub1.aClass116_Sub15_2162 == var16 && client.anInt3049 * 1979905201 == var10) {
                                             var31 = Class85.anInt991 * -453286219 - client.anInt3092 * -827759387;
                                             var39 = Class85.anInt992 * 103771565 - client.anInt3051 * 45845103;
                                             if(var31 < 5 && var31 > -5) {
                                                var31 = 0;
                                             }

                                             if(var39 < 5 && var39 > -5) {
                                                var39 = 0;
                                             }

                                             if(950444267 * client.anInt3040 < 5) {
                                                var31 = 0;
                                                var39 = 0;
                                             }

                                             var71.method3271(var32 + var31, var18 + var39, 128);
                                             if(var1 != -1) {
                                                Class116_Sub15 var61 = var0[var1 & '\uffff'];
                                                if(var39 + var18 < DrawingArea.topY && var61.anInt1947 * -1602694527 > 0) {
                                                   var27 = -1163930299 * client.anInt3012 * (DrawingArea.topY - var18 - var39) / 3;
                                                   if(var27 > client.anInt3012 * 1245598898) {
                                                      var27 = client.anInt3012 * 1245598898;
                                                   }

                                                   if(var27 > -1602694527 * var61.anInt1947) {
                                                      var27 = -1602694527 * var61.anInt1947;
                                                   }

                                                   var61.anInt1947 -= -1459786367 * var27;
                                                   client.anInt3051 += 249762959 * var27;
                                                   Class79.method1097(var61, -1735709142);
                                                }

                                                if(var39 + var18 + 32 > DrawingArea.bottomY && -1602694527 * var61.anInt1947 < var61.anInt1949 * 177405235 - var61.anInt1974 * 1227800423) {
                                                   var27 = client.anInt3012 * -1163930299 * (32 + var39 + var18 - DrawingArea.bottomY) / 3;
                                                   if(var27 > 1245598898 * client.anInt3012) {
                                                      var27 = client.anInt3012 * 1245598898;
                                                   }

                                                   if(var27 > var61.anInt1949 * 177405235 - var61.anInt1974 * 1227800423 - var61.anInt1947 * -1602694527) {
                                                      var27 = 177405235 * var61.anInt1949 - var61.anInt1974 * 1227800423 - var61.anInt1947 * -1602694527;
                                                   }

                                                   var61.anInt1947 += -1459786367 * var27;
                                                   client.anInt3051 -= 249762959 * var27;
                                                   Class79.method1097(var61, 1001351643);
                                                }
                                             }
                                          } else if(Class35.aClass116_Sub15_473 == var16 && client.anInt3048 * -387716201 == var10) {
                                             var71.method3271(var32, var18, 128);
                                          } else {
                                             var71.drawSprite(var32, var18);
                                          }
                                       } else {
                                          Class79.method1097(var16, -1124070003);
                                       }
                                    }
                                 } else if(var16.anIntArray1993 != null && var10 < 20) {
                                    Sprite var67 = var16.method2250(var10, (byte)-30);
                                    if(null != var67) {
                                       var67.drawSprite(var32, var18);
                                    } else if(Class116_Sub15.aBool1923) {
                                       Class79.method1097(var16, -946510845);
                                    }
                                 }

                                 ++var10;
                              }
                           }
                        } else if(3 == -1305917269 * var16.anInt2018) {
                           if(RuntimeException_Sub1.method3448(var16, -332140586)) {
                              var10 = 2125719227 * var16.anInt1951;
                              if(ObjectDefinition.aClass116_Sub15_2240 == var16 && 0 != var16.anInt1953 * -528196075) {
                                 var10 = -528196075 * var16.anInt1953;
                              }
                           } else {
                              var10 = 1384750979 * var16.anInt1950;
                              if(ObjectDefinition.aClass116_Sub15_2240 == var16 && 0 != var16.anInt1952 * 301172361) {
                                 var10 = var16.anInt1952 * 301172361;
                              }
                           }

                           if(0 == var20) {
                              if(var16.aBool1989) {
                                 DrawingArea.method2927(var11, var12, 1645211541 * var16.anInt1940, 1227800423 * var16.anInt1974, var10);
                              } else {
                                 DrawingArea.method2897(var11, var12, var16.anInt1940 * 1645211541, 1227800423 * var16.anInt1974, var10);
                              }
                           } else if(var16.aBool1989) {
                              DrawingArea.method2894(var11, var12, var16.anInt1940 * 1645211541, 1227800423 * var16.anInt1974, var10, 256 - (var20 & 255));
                           } else {
                              DrawingArea.method2938(var11, var12, 1645211541 * var16.anInt1940, var16.anInt1974 * 1227800423, var10, 256 - (var20 & 255));
                           }
                        } else {
                           Class116_Sub23_Sub19_Sub4_Sub1 var49;
                           if(4 == -1305917269 * var16.anInt2018) {
                              var49 = var16.method2252((byte)1);
                              if(null == var49) {
                                 if(Class116_Sub15.aBool1923) {
                                    Class79.method1097(var16, -1372695359);
                                 }
                              } else {
                                 String var58 = var16.aString1983;
                                 if(RuntimeException_Sub1.method3448(var16, -380906075)) {
                                    var17 = var16.anInt1951 * 2125719227;
                                    if(ObjectDefinition.aClass116_Sub15_2240 == var16 && var16.anInt1953 * -528196075 != 0) {
                                       var17 = -528196075 * var16.anInt1953;
                                    }

                                    if(var16.aString1984.length() > 0) {
                                       var58 = var16.aString1984;
                                    }
                                 } else {
                                    var17 = 1384750979 * var16.anInt1950;
                                    if(var16 == ObjectDefinition.aClass116_Sub15_2240 && 0 != 301172361 * var16.anInt1952) {
                                       var17 = 301172361 * var16.anInt1952;
                                    }
                                 }

                                 if(var16.aBool1924 && var16.anInt2043 * 813479615 != -1) {
                                    Class116_Sub23_Sub11 var69 = Class50.method778(var16.anInt2043 * 813479615, (byte)70);
                                    var58 = var69.aString2361;
                                    if(null == var58) {
                                       var58 = "null";
                                    }

                                    if((1 == var69.anInt2372 * 1303294175 || var16.anInt2044 * 1393082105 != 1) && 1393082105 * var16.anInt2044 != -1) {
                                       var58 = Class59_Sub1.method1978(16748608, (byte)124) + var58 + Class41.aString544 + " " + 'x' + Class116_Sub23_Sub5.method2489(var16.anInt2044 * 1393082105, 744421804);
                                    }
                                 }

                                 if(var16 == client.aClass116_Sub15_3097) {
	                                 Class91 var10000 = null;
	                                 var58 = Class91.aString1149;
                                    var17 = var16.anInt1950 * 1384750979;
                                 }

                                 if(!var16.aBool1924) {
                                    var58 = Class116_Sub12.method1984(var58, var16, -1382742104);
                                 }

                                 var49.method3537(var58, var11, var12, var16.anInt1940 * 1645211541, 1227800423 * var16.anInt1974, var17, var16.aBool1988?0:-1, -1662187929 * var16.anInt1986, var16.anInt1943 * 1549920313, var16.anInt1985 * -525493285);
                              }
                           } else if(-1305917269 * var16.anInt2018 == 5) {
                              Sprite var51;
                              if(!var16.aBool1924) {
                                 var51 = var16.method2251(RuntimeException_Sub1.method3448(var16, -1143682952), -2145716380);
                                 if(var51 != null) {
                                    var51.drawSprite(var11, var12);
                                 } else if(Class116_Sub15.aBool1923) {
                                    Class79.method1097(var16, 1378739044);
                                 }
                              } else {
                                 if(-1 != 813479615 * var16.anInt2043) {
                                    var51 = Animable.method2878(var16.anInt2043 * 813479615, var16.anInt2044 * 1393082105, -357503007 * var16.anInt2014, 2139159057 * var16.anInt1941, -1559571005 * var16.anInt1981, false, -499619652);
                                 } else {
                                    var51 = var16.method2251(false, -2109012146);
                                 }

                                 if(null == var51) {
                                    if(Class116_Sub15.aBool1923) {
                                       Class79.method1097(var16, 1329423102);
                                    }
                                 } else {
                                    var17 = var51.anInt2725;
                                    var14 = var51.anInt2726;
                                    if(!var16.aBool1961) {
                                       var32 = var16.anInt1940 * -17215488 / var17;
                                       if(var16.anInt1922 * -1749435731 != 0) {
                                          var51.method3264(1645211541 * var16.anInt1940 / 2 + var11, var12 + 1227800423 * var16.anInt1974 / 2, -1749435731 * var16.anInt1922, var32);
                                       } else if(0 != var20) {
                                          var51.method3273(var11, var12, var16.anInt1940 * 1645211541, 1227800423 * var16.anInt1974, 256 - (var20 & 255));
                                       } else if(var17 == 1645211541 * var16.anInt1940 && var16.anInt1974 * 1227800423 == var14) {
                                          var51.drawSprite(var11, var12);
                                       } else {
                                          var51.method3262(var11, var12, 1645211541 * var16.anInt1940, 1227800423 * var16.anInt1974);
                                       }
                                    } else {
                                       DrawingArea.method2890(var11, var12, var16.anInt1940 * 1645211541 + var11, 1227800423 * var16.anInt1974 + var12);
                                       var32 = (1645211541 * var16.anInt1940 + (var17 - 1)) / var17;
                                       var18 = (var16.anInt1974 * 1227800423 + (var14 - 1)) / var14;

                                       for(var31 = 0; var31 < var32; ++var31) {
                                          for(var39 = 0; var39 < var18; ++var39) {
                                             if(var16.anInt1922 * -1749435731 != 0) {
                                                var51.method3264(var17 * var31 + var11 + var17 / 2, var12 + var14 * var39 + var14 / 2, var16.anInt1922 * -1749435731, 4096);
                                             } else if(0 != var20) {
                                                var51.method3271(var11 + var17 * var31, var12 + var14 * var39, 256 - (var20 & 255));
                                             } else {
                                                var51.drawSprite(var17 * var31 + var11, var39 * var14 + var12);
                                             }
                                          }
                                       }

                                       DrawingArea.method2901(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              Class116_Sub23_Sub11 var54;
                              if(6 == var16.anInt2018 * -1305917269) {
                                 boolean var50 = RuntimeException_Sub1.method3448(var16, -1582200429);
                                 if(var50) {
                                    var17 = -213715327 * var16.anInt1971;
                                 } else {
                                    var17 = var16.anInt1991 * 467073769;
                                 }

                                 SpotAnim var53 = null;
                                 var32 = 0;
                                 if(-1 != var16.anInt2043 * 813479615) {
                                    var54 = Class50.method778(813479615 * var16.anInt2043, (byte)70);
                                    if(var54 != null) {
                                       var54 = var54.method2594(var16.anInt2044 * 1393082105, (byte)8);
                                       var53 = var54.method2593(1, -594040528);
                                       if(null != var53) {
                                          var53.method3373();
                                          var32 = 1812947537 * var53.modelHeight / 2;
                                       } else {
                                          Class79.method1097(var16, 1426410920);
                                       }
                                    }
                                 } else if(var16.anInt1975 * -768837131 == 5) {
                                    if(0 == 686060225 * var16.anInt1967) {
	                                    var53 = client.aClass108_3103.method1474(null, -1, null, -1, -1054926160);
                                    } else {
                                       var53 = Class79.aPlayer_909.getRotatedModel((byte) 13);
                                    }
                                 } else if(-1 == var17) {
	                                 var53 = var16.method2256(null, -1, var50, Class79.aPlayer_909.aClass108_2881, -131892088);
	                                 if(null == var53 && Class116_Sub15.aBool1923) {
                                       Class79.method1097(var16, 1847164270);
                                    }
                                 } else {
                                    Class116_Sub23_Sub4 var59 = Class116_Sub8.method1946(var17, -1992589394);
                                    var53 = var16.method2256(var59, var16.anInt2045 * 627142311, var50, Class79.aPlayer_909.aClass108_2881, 926952112);
                                    if(var53 == null && Class116_Sub15.aBool1923) {
                                       Class79.method1097(var16, 574986412);
                                    }
                                 }

                                 Texture.method3193(var16.anInt1940 * 1645211541 / 2 + var11, 1227800423 * var16.anInt1974 / 2 + var12);
                                 var18 = var16.anInt1977 * -1472457387 * Texture.anIntArray2708[175924351 * var16.anInt1935] >> 16;
                                 var31 = -1472457387 * var16.anInt1977 * Texture.anIntArray2713[175924351 * var16.anInt1935] >> 16;
                                 if(var53 != null) {
                                    if(!var16.aBool1924) {
                                       var53.method3399(0, 745334365 * var16.anInt2057, 0, 175924351 * var16.anInt1935, 0, var18, var31);
                                    } else {
                                       var53.method3373();
                                       if(var16.aBool1980) {
                                          var53.method3422(0, var16.anInt2057 * 745334365, 681145387 * var16.anInt1990, var16.anInt1935 * 175924351, -505327979 * var16.anInt2052, var18 + var32 + 2110500971 * var16.anInt1973, 2110500971 * var16.anInt1973 + var31, var16.anInt1977 * -1472457387);
                                       } else {
                                          var53.method3399(0, 745334365 * var16.anInt2057, 681145387 * var16.anInt1990, var16.anInt1935 * 175924351, -505327979 * var16.anInt2052, 2110500971 * var16.anInt1973 + var18 + var32, var16.anInt1973 * 2110500971 + var31);
                                       }
                                    }
                                 }

                                 Texture.method3192();
                              } else {
                                 if(7 == var16.anInt2018 * -1305917269) {
                                    var49 = var16.method2252((byte)1);
                                    if(var49 == null) {
                                       if(Class116_Sub15.aBool1923) {
                                          Class79.method1097(var16, 819011832);
                                       }
                                       continue;
                                    }

                                    var17 = 0;

                                    for(var14 = 0; var14 < 507570867 * var16.anInt1937; ++var14) {
                                       for(var32 = 0; var32 < 124195285 * var16.anInt1936; ++var32) {
                                          if(var16.anIntArray2047[var17] > 0) {
                                             var54 = Class50.method778(var16.anIntArray2047[var17] - 1, (byte)70);
                                             String var62;
                                             if(1303294175 * var54.anInt2372 != 1 && 1 == var16.anIntArray2042[var17]) {
                                                var62 = Class59_Sub1.method1978(16748608, (byte)122) + var54.aString2361 + Class41.aString544;
                                             } else {
                                                var62 = Class59_Sub1.method1978(16748608, (byte)39) + var54.aString2361 + Class41.aString544 + " " + 'x' + Class116_Sub23_Sub5.method2489(var16.anIntArray2042[var17], 744421804);
                                             }

                                             var39 = var11 + (var16.anInt1928 * 1918789959 + 115) * var32;
                                             var25 = (12 + -1195323371 * var16.anInt2010) * var14 + var12;
                                             if(var16.anInt1986 * -1662187929 == 0) {
                                                var49.method3481(var62, var39, var25, 1384750979 * var16.anInt1950, var16.aBool1988?0:-1);
                                             } else if(1 == -1662187929 * var16.anInt1986) {
                                                var49.method3492(var62, var16.anInt1940 * 1645211541 / 2 + var39, var25, 1384750979 * var16.anInt1950, var16.aBool1988?0:-1);
                                             } else {
                                                var49.method3461(var62, var39 + var16.anInt1940 * 1645211541 - 1, var25, 1384750979 * var16.anInt1950, var16.aBool1988?0:-1);
                                             }
                                          }

                                          ++var17;
                                       }
                                    }
                                 }

                                 if(8 == -1305917269 * var16.anInt2018 && var16 == Class116_Sub6.aClass116_Sub15_1745 && client.anInt2934 * 1149981077 == 1046829805 * client.anInt3072) {
                                    var10 = 0;
                                    var17 = 0;
                                    Class116_Sub23_Sub19_Sub4_Sub1 var52 = client.aClass116_Sub23_Sub19_Sub4_Sub1_2989;
                                    String var63 = var16.aString1983;

                                    String var55;
                                    for(var63 = Class116_Sub12.method1984(var63, var16, -1382742104); var63.length() > 0; var17 += 1 + var52.anInt2859) {
                                       var31 = var63.indexOf(Class41.aString541);
                                       if(var31 != -1) {
                                          var55 = var63.substring(0, var31);
                                          var63 = var63.substring(var31 + 4);
                                       } else {
                                          var55 = var63;
                                          var63 = "";
                                       }

                                       var39 = var52.method3455(var55);
                                       if(var39 > var10) {
                                          var10 = var39;
                                       }
                                    }

                                    var10 += 6;
                                    var17 += 7;
                                    var31 = var16.anInt1940 * 1645211541 + var11 - 5 - var10;
                                    var39 = 5 + var16.anInt1974 * 1227800423 + var12;
                                    if(var31 < 5 + var11) {
                                       var31 = 5 + var11;
                                    }

                                    if(var10 + var31 > var4) {
                                       var31 = var4 - var10;
                                    }

                                    if(var39 + var17 > var5) {
                                       var39 = var5 - var17;
                                    }

                                    DrawingArea.method2927(var31, var39, var10, var17, 16777120);
                                    DrawingArea.method2897(var31, var39, var10, var17, 0);
                                    var63 = var16.aString1983;
                                    var25 = var39 + var52.anInt2859 + 2;

                                    for(var63 = Class116_Sub12.method1984(var63, var16, -1382742104); var63.length() > 0; var25 += 1 + var52.anInt2859) {
                                       var41 = var63.indexOf(Class41.aString541);
                                       if(var41 != -1) {
                                          var55 = var63.substring(0, var41);
                                          var63 = var63.substring(var41 + 4);
                                       } else {
                                          var55 = var63;
                                          var63 = "";
                                       }

                                       var52.method3481(var55, 3 + var31, var25, 0, -1);
                                    }
                                 }

                                 if(var16.anInt2018 * -1305917269 == 9) {
                                    if(1 == 562385183 * var16.anInt1942) {
                                       if(var16.aBool1957) {
                                          var10 = var11;
                                          var17 = var16.anInt1974 * 1227800423 + var12;
                                          var14 = 1645211541 * var16.anInt1940 + var11;
                                          var32 = var12;
                                       } else {
                                          var10 = var11;
                                          var17 = var12;
                                          var14 = var11 + var16.anInt1940 * 1645211541;
                                          var32 = var16.anInt1974 * 1227800423 + var12;
                                       }

                                       DrawingArea.method2903(var10, var17, var14, var32, 1384750979 * var16.anInt1950);
                                    } else {
                                       var10 = 1645211541 * var16.anInt1940 >= 0?var16.anInt1940 * 1645211541:-(var16.anInt1940 * 1645211541);
                                       var17 = var16.anInt1974 * 1227800423 >= 0?1227800423 * var16.anInt1974:-(var16.anInt1974 * 1227800423);
                                       var14 = var10;
                                       if(var10 < var17) {
                                          var14 = var17;
                                       }

                                       if(var14 != 0) {
                                          var32 = (var16.anInt1940 * 1645211541 << 16) / var14;
                                          var18 = (var16.anInt1974 * 1227800423 << 16) / var14;
                                          if(var18 <= var32) {
                                             var32 = -var32;
                                          } else {
                                             var18 = -var18;
                                          }

                                          var31 = var16.anInt1942 * 562385183 * var18 >> 17;
                                          var39 = 1 + 562385183 * var16.anInt1942 * var18 >> 17;
                                          var25 = var32 * 562385183 * var16.anInt1942 >> 17;
                                          var41 = 1 + var16.anInt1942 * 562385183 * var32 >> 17;
                                          var26 = var11 + var31;
                                          var27 = var11 - var39;
                                          var28 = var11 + 1645211541 * var16.anInt1940 - var39;
                                          var38 = var31 + var11 + 1645211541 * var16.anInt1940;
                                          var40 = var25 + var12;
                                          var35 = var12 - var41;
                                          var37 = var16.anInt1974 * 1227800423 + var12 - var41;
                                          var36 = var25 + var12 + var16.anInt1974 * 1227800423;
                                          Texture.method3199(var26, var27, var28);
                                          Texture.method3200(var40, var35, var37, var26, var27, var28, 1384750979 * var16.anInt1950);
                                          Texture.method3199(var26, var28, var38);
                                          Texture.method3200(var40, var37, var36, var26, var28, var38, var16.anInt1950 * 1384750979);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static byte[] method938(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var5 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var3 = var0.charAt(var4);
         if((var3 <= 0 || var3 >= 128) && (var3 < 160 || var3 > 255)) {
            if(var3 == 8364) {
               var5[var4] = -128;
            } else if(8218 == var3) {
               var5[var4] = -126;
            } else if(var3 == 402) {
               var5[var4] = -125;
            } else if(8222 == var3) {
               var5[var4] = -124;
            } else if(var3 == 8230) {
               var5[var4] = -123;
            } else if(8224 == var3) {
               var5[var4] = -122;
            } else if(var3 == 8225) {
               var5[var4] = -121;
            } else if(var3 == 710) {
               var5[var4] = -120;
            } else if(8240 == var3) {
               var5[var4] = -119;
            } else if(var3 == 352) {
               var5[var4] = -118;
            } else if(8249 == var3) {
               var5[var4] = -117;
            } else if(var3 == 338) {
               var5[var4] = -116;
            } else if(var3 == 381) {
               var5[var4] = -114;
            } else if(8216 == var3) {
               var5[var4] = -111;
            } else if(var3 == 8217) {
               var5[var4] = -110;
            } else if(8220 == var3) {
               var5[var4] = -109;
            } else if(var3 == 8221) {
               var5[var4] = -108;
            } else if(var3 == 8226) {
               var5[var4] = -107;
            } else if(var3 == 8211) {
               var5[var4] = -106;
            } else if(var3 == 8212) {
               var5[var4] = -105;
            } else if(var3 == 732) {
               var5[var4] = -104;
            } else if(var3 == 8482) {
               var5[var4] = -103;
            } else if(var3 == 353) {
               var5[var4] = -102;
            } else if(8250 == var3) {
               var5[var4] = -101;
            } else if(var3 == 339) {
               var5[var4] = -100;
            } else if(382 == var3) {
               var5[var4] = -98;
            } else if(376 == var3) {
               var5[var4] = -97;
            } else {
               var5[var4] = 63;
            }
         } else {
            var5[var4] = (byte)var3;
         }
      }

      return var5;
   }

   public static int method939(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var1 + var7);
         if((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if(8364 == var8) {
               var3[var4 + var7] = -128;
            } else if(8218 == var8) {
               var3[var4 + var7] = -126;
            } else if(402 == var8) {
               var3[var4 + var7] = -125;
            } else if(var8 == 8222) {
               var3[var4 + var7] = -124;
            } else if(8230 == var8) {
               var3[var4 + var7] = -123;
            } else if(8224 == var8) {
               var3[var7 + var4] = -122;
            } else if(8225 == var8) {
               var3[var4 + var7] = -121;
            } else if(var8 == 710) {
               var3[var4 + var7] = -120;
            } else if(8240 == var8) {
               var3[var7 + var4] = -119;
            } else if(352 == var8) {
               var3[var7 + var4] = -118;
            } else if(var8 == 8249) {
               var3[var4 + var7] = -117;
            } else if(var8 == 338) {
               var3[var7 + var4] = -116;
            } else if(var8 == 381) {
               var3[var7 + var4] = -114;
            } else if(var8 == 8216) {
               var3[var7 + var4] = -111;
            } else if(8217 == var8) {
               var3[var7 + var4] = -110;
            } else if(var8 == 8220) {
               var3[var7 + var4] = -109;
            } else if(var8 == 8221) {
               var3[var4 + var7] = -108;
            } else if(var8 == 8226) {
               var3[var4 + var7] = -107;
            } else if(var8 == 8211) {
               var3[var4 + var7] = -106;
            } else if(var8 == 8212) {
               var3[var7 + var4] = -105;
            } else if(732 == var8) {
               var3[var4 + var7] = -104;
            } else if(var8 == 8482) {
               var3[var7 + var4] = -103;
            } else if(var8 == 353) {
               var3[var7 + var4] = -102;
            } else if(8250 == var8) {
               var3[var7 + var4] = -101;
            } else if(var8 == 339) {
               var3[var7 + var4] = -100;
            } else if(382 == var8) {
               var3[var7 + var4] = -98;
            } else if(376 == var8) {
               var3[var7 + var4] = -97;
            } else {
               var3[var7 + var4] = 63;
            }
         } else {
            var3[var4 + var7] = (byte)var8;
         }
      }

      return var6;
   }

   public static void method940(int var0, int var1) {
      if(-1 != var0) {
         if(Class116_Sub15.aBoolArray1916[var0]) {
            Class116_Sub15.aClass99_1917.method1421(var0, 1831998645);
            if(Class116_Sub15.aClass116_Sub15ArrayArray1956[var0] != null) {
               boolean var2 = true;

               for(int var3 = 0; var3 < Class116_Sub15.aClass116_Sub15ArrayArray1956[var0].length; ++var3) {
                  if(null != Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3]) {
                     if(-1305917269 * Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3].anInt2018 != 2) {
                        Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if(var2) {
                  Class116_Sub15.aClass116_Sub15ArrayArray1956[var0] = null;
               }

               Class116_Sub15.aBoolArray1916[var0] = false;
            }
         }
      }
   }
}
