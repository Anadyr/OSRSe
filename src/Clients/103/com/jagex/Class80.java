package com.jagex;

public class Class80 {
   static int[] anIntArray920;


   Class80() throws Throwable {
      throw new Error();
   }

   public static void method1099(Class99 var0, int var1, int var2, int var3, boolean var4, short var5) {
      Class128.anInt1574 = 325298615;
      Class128.aClass99_1575 = var0;
      Class112.anInt1485 = 18032949 * var1;
      Class129.anInt1581 = -832158449 * var2;
      Class128.anInt1579 = var3 * 827167249;
      Class55.aBool715 = var4;
      Class128.anInt1577 = -1723259600;
   }

   static final void method1100(Entity var0, int var1, int var2) {
      int var3;
      Class116_Sub23_Sub4 var12;
      if(-2112283241 * var0.anInt2599 > -1040073859 * client.anInt2943) {
         Class50.method775(var0, 1070672258);
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         if(var0.anInt2624 * -1158366777 >= client.anInt2943 * -1040073859) {
            if(-1158366777 * var0.anInt2624 == client.anInt2943 * -1040073859 || -1 == var0.anInt2587 * -922607859 || 0 != 1301453073 * var0.anInt2612 || var0.anInt2611 * -1968895439 + 1 > Class116_Sub8.method1946(var0.anInt2587 * -922607859, -763165684).anIntArray2255[1402685833 * var0.anInt2610]) {
               var3 = var0.anInt2624 * -1158366777 - var0.anInt2599 * -2112283241;
               var5 = -1040073859 * client.anInt2943 - -2112283241 * var0.anInt2599;
               var7 = -2013728192 * var0.anInt2582 + -777033600 * var0.anInt2632;
               var8 = 20962432 * var0.anInt2621 + var0.anInt2582 * -2013728192;
               int var4 = -1235303552 * var0.anInt2620 + -2013728192 * var0.anInt2582;
               var6 = -2013728192 * var0.anInt2582 + var0.anInt2594 * 2137051008;
               var0.anInt2609 = (var4 * var5 + var7 * (var3 - var5)) / var3 * 1705682711;
               var0.anInt2579 = (var6 * var5 + var8 * (var3 - var5)) / var3 * 1421914369;
            }

            var0.anInt2635 = 0;
	         var0.faceDir1 = -1269181295 * var0.anInt2625;
	         var0.anInt2613 = var0.faceDir1 * -2141141433;
         } else {
            var0.anInt2606 = var0.anInt2639 * 1277708751;
            if(0 == var0.anInt2578 * 632093179) {
               var0.anInt2635 = 0;
            } else {
               label446: {
                  if(-922607859 * var0.anInt2587 != -1 && 1301453073 * var0.anInt2612 == 0) {
                     var12 = Class116_Sub8.method1946(-922607859 * var0.anInt2587, -106152729);
                     if(-206216795 * var0.anInt2636 > 0 && 0 == -1948482873 * var12.anInt2258) {
                        var0.anInt2635 += 1675246587;
                        break label446;
                     }

                     if(var0.anInt2636 * -206216795 <= 0 && 0 == -1099577343 * var12.anInt2242) {
                        var0.anInt2635 += 1675246587;
                        break label446;
                     }
                  }

                  var3 = var0.anInt2609 * 1272643751;
                  var5 = -1801433343 * var0.anInt2579;
                  var7 = var0.anInt2582 * -2013728192 + var0.xMovementSteps[632093179 * var0.anInt2578 - 1] * 128;
                  var8 = -2013728192 * var0.anInt2582 + var0.yMovementSteps[632093179 * var0.anInt2578 - 1] * 128;
                  if(var3 < var7) {
                     if(var5 < var8) {
	                     var0.faceDir1 = -2129414400;
                     } else if(var5 > var8) {
	                     var0.faceDir1 = 1313787136;
                     } else {
	                     var0.faceDir1 = 1739670016;
                     }
                  } else if(var3 > var7) {
                     if(var5 < var8) {
	                     var0.faceDir1 = -1277648640;
                     } else if(var5 <= var8) {
	                     var0.faceDir1 = -851765760;
                     } else {
	                     var0.faceDir1 = -425882880;
                     }
                  } else if(var5 < var8) {
	                  var0.faceDir1 = -1703531520;
                  } else if(var5 > var8) {
	                  var0.faceDir1 = 0;
                  }

                  byte var13 = var0.aByteArray2628[var0.anInt2578 * 632093179 - 1];
                  if(var7 - var3 <= 256 && var7 - var3 >= -256 && var8 - var5 <= 256 && var8 - var5 >= -256) {
	                  var6 = -2061229533 * var0.faceDir1 - -2031663291 * var0.anInt2613 & 2047;
	                  if (var6 > 1024) {
		                  var6 -= 2048;
                     }

                     int var10 = var0.anInt2629 * -826106711;
                     if(var6 >= -256 && var6 <= 256) {
                        var10 = 1481286257 * var0.anInt2586;
                     } else if(var6 >= 256 && var6 < 768) {
                        var10 = -1453546357 * var0.anInt2615;
                     } else if(var6 >= -768 && var6 <= -256) {
                        var10 = var0.anInt2580 * -897665047;
                     }

                     if(var10 == -1) {
                        var10 = 1481286257 * var0.anInt2586;
                     }

                     var0.anInt2606 = var10 * 517768871;
                     int var9 = 4;
                     boolean var11 = true;
                     if(var0 instanceof Mob) {
                        var11 = ((Mob)var0).definition.aBool2321;
                     }

                     if(var11) {
	                     if (-2061229533 * var0.faceDir1 != -2031663291 * var0.anInt2613 && -1 == var0.anInt2603 * 734924805 && 1361576967 * var0.anInt2630 != 0) {
		                     var9 = 2;
	                     }

                        if(var0.anInt2578 * 632093179 > 2) {
                           var9 = 6;
                        }

                        if(632093179 * var0.anInt2578 > 3) {
                           var9 = 8;
                        }

                        if(1616877363 * var0.anInt2635 > 0 && var0.anInt2578 * 632093179 > 1) {
                           var9 = 8;
                           var0.anInt2635 -= 1675246587;
                        }
                     } else {
                        if(632093179 * var0.anInt2578 > 1) {
                           var9 = 6;
                        }

                        if(632093179 * var0.anInt2578 > 2) {
                           var9 = 8;
                        }

                        if(1616877363 * var0.anInt2635 > 0 && var0.anInt2578 * 632093179 > 1) {
                           var9 = 8;
                           var0.anInt2635 -= 1675246587;
                        }
                     }

                     if(var13 == 2) {
                        var9 <<= 1;
                     }

                     if(var9 >= 8 && 57983255 * var0.anInt2606 == 1481286257 * var0.anInt2586 && -1 != -108110871 * var0.anInt2590) {
                        var0.anInt2606 = -1707742465 * var0.anInt2590;
                     }

                     if(var7 != var3 || var5 != var8) {
                        if(var3 < var7) {
                           var0.anInt2609 += 1705682711 * var9;
                           if(1272643751 * var0.anInt2609 > var7) {
                              var0.anInt2609 = var7 * 1705682711;
                           }
                        } else if(var3 > var7) {
                           var0.anInt2609 -= var9 * 1705682711;
                           if(var0.anInt2609 * 1272643751 < var7) {
                              var0.anInt2609 = 1705682711 * var7;
                           }
                        }

                        if(var5 < var8) {
                           var0.anInt2579 += var9 * 1421914369;
                           if(-1801433343 * var0.anInt2579 > var8) {
                              var0.anInt2579 = var8 * 1421914369;
                           }
                        } else if(var5 > var8) {
                           var0.anInt2579 -= 1421914369 * var9;
                           if(var0.anInt2579 * -1801433343 < var8) {
                              var0.anInt2579 = 1421914369 * var8;
                           }
                        }
                     }

                     if(1272643751 * var0.anInt2609 == var7 && -1801433343 * var0.anInt2579 == var8) {
                        var0.anInt2578 -= 11741491;
                        if(var0.anInt2636 * -206216795 > 0) {
                           var0.anInt2636 -= 810720813;
                        }
                     }
                  } else {
                     var0.anInt2609 = 1705682711 * var7;
                     var0.anInt2579 = var8 * 1421914369;
                     var0.anInt2578 -= 11741491;
                     if(-206216795 * var0.anInt2636 > 0) {
                        var0.anInt2636 -= 810720813;
                     }
                  }
               }
            }
         }
      }

      if(var0.anInt2609 * 1272643751 < 128 || var0.anInt2579 * -1801433343 < 128 || 1272643751 * var0.anInt2609 >= 13184 || -1801433343 * var0.anInt2579 >= 13184) {
         var0.anInt2587 = 1587034171;
         var0.anInt2614 = 1738418729;
         var0.anInt2599 = 0;
         var0.anInt2624 = 0;
         var0.anInt2609 = var0.anInt2582 * -1142586432 + var0.xMovementSteps[0] * -715945088;
         var0.anInt2579 = var0.yMovementSteps[0] * 1616412800 + 1467429440 * var0.anInt2582;
         var0.method3100(570264187);
      }

      if(var0 == Class79.aPlayer_909 && (var0.anInt2609 * 1272643751 < 1536 || var0.anInt2579 * -1801433343 < 1536 || 1272643751 * var0.anInt2609 >= 11776 || -1801433343 * var0.anInt2579 >= 11776)) {
         var0.anInt2587 = 1587034171;
         var0.anInt2614 = 1738418729;
         var0.anInt2599 = 0;
         var0.anInt2624 = 0;
         var0.anInt2609 = var0.xMovementSteps[0] * -715945088 + -1142586432 * var0.anInt2582;
         var0.anInt2579 = var0.yMovementSteps[0] * 1616412800 + 1467429440 * var0.anInt2582;
         var0.method3100(-408560841);
      }

      ChatMessage.method2583(var0, (byte) 97);
      var0.aBool2588 = false;
      if(var0.anInt2606 * 57983255 != -1) {
         var12 = Class116_Sub8.method1946(var0.anInt2606 * 57983255, 470649332);
         if(var12 != null && var12.anIntArray2247 != null) {
            var0.anInt2608 += 1363672495;
            if(var0.anInt2581 * -1199565973 < var12.anIntArray2247.length && var0.anInt2608 * -1418757809 > var12.anIntArray2255[-1199565973 * var0.anInt2581]) {
               var0.anInt2608 = 1363672495;
               var0.anInt2581 += 1687585091;
               AbstractRSDrawing.method341(var12, var0.anInt2581 * -1199565973, var0.anInt2609 * 1272643751, -1801433343 * var0.anInt2579, -1095155715);
            }

            if(-1199565973 * var0.anInt2581 >= var12.anIntArray2247.length) {
               var0.anInt2608 = 0;
               var0.anInt2581 = 0;
               AbstractRSDrawing.method341(var12, var0.anInt2581 * -1199565973, var0.anInt2609 * 1272643751, -1801433343 * var0.anInt2579, 1363753235);
            }
         } else {
            var0.anInt2606 = -517768871;
         }
      }

      if(var0.anInt2614 * 1631645159 != -1 && -1040073859 * client.anInt2943 >= var0.anInt2617 * 489022907) {
         if(-1255206495 * var0.anInt2595 < 0) {
            var0.anInt2595 = 0;
         }

         var3 = Friend.method1835(1631645159 * var0.anInt2614, (byte) 1).anInt2157 * -521951217;
         if(-1 != var3) {
            Class116_Sub23_Sub4 var14 = Class116_Sub8.method1946(var3, -665663329);
            if(null != var14 && var14.anIntArray2247 != null) {
               var0.anInt2616 += -1629498229;
               if(var0.anInt2595 * -1255206495 < var14.anIntArray2247.length && 414380835 * var0.anInt2616 > var14.anIntArray2255[var0.anInt2595 * -1255206495]) {
                  var0.anInt2616 = -1629498229;
                  var0.anInt2595 += 1825378913;
                  AbstractRSDrawing.method341(var14, var0.anInt2595 * -1255206495, var0.anInt2609 * 1272643751, -1801433343 * var0.anInt2579, 667309577);
               }

               if(-1255206495 * var0.anInt2595 >= var14.anIntArray2247.length && (var0.anInt2595 * -1255206495 < 0 || -1255206495 * var0.anInt2595 >= var14.anIntArray2247.length)) {
                  var0.anInt2614 = 1738418729;
               }
            } else {
               var0.anInt2614 = 1738418729;
            }
         } else {
            var0.anInt2614 = 1738418729;
         }
      }

      if(-922607859 * var0.anInt2587 != -1 && var0.anInt2612 * 1301453073 <= 1) {
         var12 = Class116_Sub8.method1946(var0.anInt2587 * -922607859, 372703114);
         if(-1948482873 * var12.anInt2258 == 1 && var0.anInt2636 * -206216795 > 0 && var0.anInt2599 * -2112283241 <= -1040073859 * client.anInt2943 && -1158366777 * var0.anInt2624 < client.anInt2943 * -1040073859) {
            var0.anInt2612 = 1583839217;
            return;
         }
      }

      if(-922607859 * var0.anInt2587 != -1 && 1301453073 * var0.anInt2612 == 0) {
         var12 = Class116_Sub8.method1946(var0.anInt2587 * -922607859, -995326961);
         if(var12 != null && var12.anIntArray2247 != null) {
            var0.anInt2611 += -1292628271;
            if(1402685833 * var0.anInt2610 < var12.anIntArray2247.length && -1968895439 * var0.anInt2611 > var12.anIntArray2255[var0.anInt2610 * 1402685833]) {
               var0.anInt2611 = -1292628271;
               var0.anInt2610 += -1392640839;
               AbstractRSDrawing.method341(var12, var0.anInt2610 * 1402685833, var0.anInt2609 * 1272643751, var0.anInt2579 * -1801433343, 368113690);
            }

            if(var0.anInt2610 * 1402685833 >= var12.anIntArray2247.length) {
               var0.anInt2610 -= 1608002491 * var12.anInt2251;
               var0.anInt2637 += 1464507697;
               if(-1086743599 * var0.anInt2637 >= var12.anInt2257 * -1297434983) {
                  var0.anInt2587 = 1587034171;
               } else if(var0.anInt2610 * 1402685833 >= 0 && 1402685833 * var0.anInt2610 < var12.anIntArray2247.length) {
                  AbstractRSDrawing.method341(var12, var0.anInt2610 * 1402685833, 1272643751 * var0.anInt2609, var0.anInt2579 * -1801433343, 537738174);
               } else {
                  var0.anInt2587 = 1587034171;
               }
            }

            var0.aBool2588 = var12.aBool2248;
         } else {
            var0.anInt2587 = 1587034171;
         }
      }

      if(var0.anInt2612 * 1301453073 > 0) {
         var0.anInt2612 -= 1583839217;
      }

   }
}
