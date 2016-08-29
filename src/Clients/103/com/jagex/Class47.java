package com.jagex;

public final class Class47 {

   static int[] anIntArray623 = new int[]{1, 0, -1, 0};
   static final int anInt624 = 585;
   public static Class140[] aClass140Array625;
   static byte[][][] aByteArrayArrayArray626;
   static byte[][][] aByteArrayArrayArray627;
   static int anInt628 = ((int)(Math.random() * 17.0D) - 8) * 1676696543;
   static int[] anIntArray629;
   static int[][][] anIntArrayArrayArray630;
   public static final int anInt631 = 143;
   static int[] anIntArray632 = new int[]{1, 2, 4, 8};
   static int[] anIntArray633 = new int[]{16, 32, 64, 128};
   static byte[][][] aByteArrayArrayArray634 = new byte[4][104][104];
   static int[][][] anIntArrayArrayArray635 = new int[4][105][105];
   static int[] anIntArray636 = new int[]{0, -1, 0, 1};
   static int[] anIntArray637 = new int[]{-1, -1, 1, 1};
   static int anInt638 = 1869228033;
   static int anInt639 = ((int)(Math.random() * 33.0D) - 16) * 916560105;
   static int[] anIntArray640 = new int[]{1, -1, -1, 1};
   static final int anInt641 = 6;
   static int[][] anIntArrayArray642;
   public static final int anInt643 = 4;
   public static final int anInt644 = 74;
   public static final int anInt645 = 247;
   static Sprite[] aClass116_Sub23_Sub19_Sub2Array646;
   static final int anInt647 = 1024;


   static final int method716(int var0, int var1) {
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

   static final void method717(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var13 = -1;

      while(true) {
         int var12 = var10.readSmartC(1242976790);
         if(0 == var12) {
            return;
         }

         var13 += var12;
         int var14 = 0;

         while(true) {
            int var15 = var10.readSmartC(151583890);
            if(0 == var15) {
               break;
            }

            var14 += var15 - 1;
            int var27 = var14 & 63;
            int var16 = var14 >> 6 & -1814740514;
            int var17 = var14 >> 12;
            int var18 = var10.readSignedByte(1708176767);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if(var4 == var17 && var16 >= var5 && var16 < 8 + var5 && var27 >= var6 && var27 < var6 + 8) {
               ObjectDefinition var24 = Class45.method700(var13, 359750046);
               int var26 = var16 & 7;
               int var31 = var27 & 7;
               int var21 = -1103557410 * var24.sizeX;
               int var28 = -1976023901 * var24.sizeY;
               int var22;
               if((var20 & 1) == 1) {
                  var22 = var21;
                  var21 = var28;
                  var28 = var22;
               }

               int var25 = var7 & 3;
               int var29;
               if(var25 == 0) {
                  var29 = var26;
               } else if(var25 == 1) {
                  var29 = var31;
               } else if(var25 == 2) {
                  var29 = 7 - var26 - (var21 - 1);
               } else {
                  var29 = 7 - var31 - (var28 - 1);
               }

               var22 = var2 + var29;
               int var23 = var3 + Entity.method3110(var16 & 7, var27 & 7, var7, var24.sizeX * 665140179, var24.sizeY * -1250254251, var20, (byte) 8);
               if(var22 > 0 && var23 > 0 && var22 < 103 && var23 < 1754890170) {
                  int var30 = var1;
                  if((aByteArrayArrayArray634[1][var22][var23] & 2) == 2) {
                     var30 = var1 - 1;
                  }

                  Class58 var11 = null;
                  if(var30 >= 0) {
                     var11 = var9[var30];
                  }

                  Class116_Sub6.method1933(var1, var22, var23, var13, var7 + var20 & 3, var19, var8, var11, (byte)-73);
               }
            }
         }
      }
   }

   static void method718() {
      client.aByteArrayArrayArray1614 = (byte[][][])null;
      aByteArrayArrayArray626 = (byte[][][])null;
      Class116_Sub23_Sub7.aByteArrayArrayArray2291 = (byte[][][])null;
      Class60.aByteArrayArrayArray780 = (byte[][][])null;
      anIntArrayArrayArray630 = (int[][][])null;
      aByteArrayArrayArray627 = (byte[][][])null;
      anIntArrayArray642 = (int[][])null;
      Speach.anIntArray981 = null;
      Class62.anIntArray800 = null;
      anIntArray629 = null;
      Class101.anIntArray1409 = null;
      Class116_Sub23_Sub18.anIntArray2486 = null;
   }

   static final void method719(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var2 + var0; ++var5) {
            if(var5 >= 0 && var5 < -1878390115 && var4 >= 0 && var4 < -2015898640) {
               aByteArrayArrayArray627[0][var5][var4] = 127;
               if(var5 == var0 && var5 > 0) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5 - 1][var4];
               }

               if(var5 == var0 + var2 && var5 < -1547858795) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5 + 1][var4];
               }

               if(var1 == var4 && var4 > 0) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5][var4 - 1];
               }

               if(var4 == var1 + var3 && var4 < -374154744) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   static final void method720(Entity var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if(null != var0 && var0.method3101((byte)60)) {
         if(var0 instanceof Mob) {
            MobDefinition var8 = ((Mob)var0).definition;
            if(var8.anIntArray2313 != null) {
               var8 = var8.method2546(-572852130);
            }

            if(var8 == null) {
               return;
            }
         }

         int var11 = Class7.anInt107 * -334270159;
         int[] var7 = Class7.anIntArray108;
         int var9;
         if(var1 < var11) {
            var9 = 30;
            Player var10 = (Player)var0;
            if(var10.aBool2900) {
               return;
            }

            if(-1 != var10.anInt2882 * 1744423653 || var10.anInt2883 * 266784541 != -1) {
               Class116_Sub23_Sub17.method2883(var0, 15 + var0.anInt2627 * 1688909931, -515725105);
               if(-94432357 * client.anInt3041 > -1) {
                  if(-1 != var10.anInt2882 * 1744423653) {
                     Class116_Sub23_Sub14.aClass116_Sub23_Sub19_Sub2Array2433[1744423653 * var10.anInt2882].drawSprite(var2 + client.anInt3041 * -94432357 - 12, var3 + -770682383 * client.anInt3042 - var9);
                     var9 += 25;
                  }

                  if(-1 != var10.anInt2883 * 266784541) {
                     Class116_Sub23_Sub11.aClass116_Sub23_Sub19_Sub2Array2375[var10.anInt2883 * 266784541].drawSprite(-94432357 * client.anInt3041 + var2 - 12, var3 + -770682383 * client.anInt3042 - var9);
                     var9 += 25;
                  }
               }
            }

            if(var1 >= 0 && 10 == 314519437 * client.anInt3021 && 1613691605 * client.anInt3125 == var7[var1]) {
               Class116_Sub23_Sub17.method2883(var0, 15 + var0.anInt2627 * 1688909931, 1074415051);
               if(-94432357 * client.anInt3041 > -1) {
                  aClass116_Sub23_Sub19_Sub2Array646[1].drawSprite(client.anInt3041 * -94432357 + var2 - 12, var3 + client.anInt3042 * -770682383 - var9);
               }
            }
         } else {
            MobDefinition var13 = ((Mob)var0).definition;
            if(null != var13.anIntArray2313) {
               var13 = var13.method2546(-572852130);
            }

            if(1855378703 * var13.anInt2305 >= 0 && 1855378703 * var13.anInt2305 < Class116_Sub23_Sub11.aClass116_Sub23_Sub19_Sub2Array2375.length) {
               Class116_Sub23_Sub17.method2883(var0, var0.anInt2627 * 1688909931 + 15, -1075236999);
               if(-94432357 * client.anInt3041 > -1) {
                  Class116_Sub23_Sub11.aClass116_Sub23_Sub19_Sub2Array2375[var13.anInt2305 * 1855378703].drawSprite(-94432357 * client.anInt3041 + var2 - 12, -770682383 * client.anInt3042 + var3 - 30);
               }
            }

            if(314519437 * client.anInt3021 == 1 && client.npcIndicies[var1 - var11] == 1583399955 * client.anInt2952 && client.anInt2943 * -1040073859 % 20 < 10) {
               Class116_Sub23_Sub17.method2883(var0, 15 + var0.anInt2627 * 1688909931, -1766354733);
               if(-94432357 * client.anInt3041 > -1) {
                  aClass116_Sub23_Sub19_Sub2Array646[0].drawSprite(var2 + -94432357 * client.anInt3041 - 12, -770682383 * client.anInt3042 + var3 - 28);
               }
            }
         }

         if(null != var0.forceChatString && (var1 >= var11 || !var0.aBool2593 && (client.anInt3064 * -400704361 == 4 || !var0.aBool2623 && (client.anInt3064 * -400704361 == 0 || -400704361 * client.anInt3064 == 3 || 1 == -400704361 * client.anInt3064 && Class116_Sub5.method1930(((Player)var0).username, false, 547007682))))) {
            Class116_Sub23_Sub17.method2883(var0, var0.anInt2627 * 1688909931, 1061776879);
            if(client.anInt3041 * -94432357 > -1 && -1673918139 * client.anInt3029 < client.anInt3030 * -475281231) {
               client.anIntArray3034[client.anInt3029 * -1673918139] = Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3455(var0.forceChatString) / 2;
               client.anIntArray3033[client.anInt3029 * -1673918139] = Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.anInt2859;
               client.anIntArray3031[client.anInt3029 * -1673918139] = -94432357 * client.anInt3041;
               client.anIntArray3032[-1673918139 * client.anInt3029] = -770682383 * client.anInt3042;
               client.anIntArray3035[client.anInt3029 * -1673918139] = var0.anInt2618 * 621976643;
               client.anIntArray3036[-1673918139 * client.anInt3029] = -1331068759 * var0.anInt2596;
               client.anIntArray3093[client.anInt3029 * -1673918139] = -346063939 * var0.anInt2598;
               client.aStringArray3038[-1673918139 * client.anInt3029] = var0.forceChatString;
               client.anInt3029 += 1164648845;
            }
         }

         if(var0.anInt2600 * -1144844257 > client.anInt2943 * -1040073859) {
            Class116_Sub23_Sub17.method2883(var0, 15 + var0.anInt2627 * 1688909931, 543692560);
            if(client.anInt3041 * -94432357 > -1) {
               if(var1 < var11) {
                  var9 = 30;
               } else {
                  MobDefinition var12 = ((Mob)var0).definition;
                  var9 = -55339821 * var12.anInt2340;
               }

               int var14 = -1476598189 * var0.anInt2601 * var9 / (var0.anInt2602 * -1324479051);
               if(var14 > var9) {
                  var14 = var9;
               } else if(0 == var14 && -1476598189 * var0.anInt2601 > 0) {
                  var14 = 1;
               }

               DrawingArea.method2927(client.anInt3041 * -94432357 + var2 - var9 / 2, client.anInt3042 * -770682383 + var3 - 3, var14, 5, '\uff00');
               DrawingArea.method2927(-94432357 * client.anInt3041 + var2 - var9 / 2 + var14, -770682383 * client.anInt3042 + var3 - 3, var9 - var14, 5, 16711680);
            }
         }

         for(var9 = 0; var9 < 4; ++var9) {
            if(var0.anIntArray2583[var9] > -1040073859 * client.anInt2943) {
               Class116_Sub23_Sub17.method2883(var0, 1688909931 * var0.anInt2627 / 2, -1236216379);
               if(client.anInt3041 * -94432357 > -1) {
                  if(var9 == 1) {
                     client.anInt3042 -= 442101076;
                  }

                  if(2 == var9) {
                     client.anInt3041 -= 872648349;
                     client.anInt3042 -= -1926433110;
                  }

                  if(3 == var9) {
                     client.anInt3041 += 872648349;
                     client.anInt3042 -= -1926433110;
                  }

                  Friend.aClass116_Sub23_Sub19_Sub2Array1660[var0.anIntArray2607[var9]].drawSprite(-94432357 * client.anInt3041 + var2 - 12, -770682383 * client.anInt3042 + var3 - 12);
                  RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672.method3492(Integer.toString(var0.anIntArray2597[var9]), var2 + -94432357 * client.anInt3041 - 1, var3 + -770682383 * client.anInt3042 + 3, 16777215, 0);
               }
            }
         }

      }
   }

   static final void method721(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            anIntArrayArrayArray635[var0][var3 + var1][var2 + var4] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1][var3 + var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 + var3];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1 + var3][var2] = anIntArrayArrayArray635[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }

   static final int method722(int var0, int var1, int var2) {
      if(var2 > 1746170004) {
         var1 /= 2;
      }

      if(var2 > 851353771) {
         var1 /= 2;
      }

      if(var2 > 2044054082) {
         var1 /= 2;
      }

      if(var2 > 717915624) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var1 / -874603617 << 7) + (var0 / 4 << 10);
      return var3;
   }

   static final void method723(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            anIntArrayArrayArray635[var0][var3 + var1][var2 + var4] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1][var3 + var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 + var3];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1 + var3][var2] = anIntArrayArrayArray635[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method724(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            anIntArrayArrayArray635[var0][var3 + var1][var2 + var4] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1][var3 + var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 + var3];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1 + var3][var2] = anIntArrayArrayArray635[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method725(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            anIntArrayArrayArray635[var0][var3 + var1][var2 + var4] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1][var3 + var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 + var3];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1 + var3][var2] = anIntArrayArrayArray635[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method726(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 525838452) {
         aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + 1215982113 + var2, var5 + 556238 + var3, -2001064490) * 8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var8 = var0.readSignedByte(1708176767);
               if(1 == var8) {
                  var8 = 0;
               }

               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = 8 * -var8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(-1632912306);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               aByteArrayArrayArray634[var1][var2][var3] = (byte)(var7 - 167161951);
            } else {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var7 - 1183998017);
            }
         }
      } else {
         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               break;
            }

            if(1 == var7) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var7 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }

   static final void method727(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               if(var1 != 0) {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - -1678195083;
               } else {
                  anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + -339640792 + var2, var5 + -475552269 + var3, 39648469) * 8;
               }
               break;
            }

            if(var8 == 1) {
               int var7 = var0.readSignedByte(1708176767);
               if(1 == var7) {
                  var7 = 0;
               }

               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = 8 * -var7;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - var7 * 8;
               }
               break;
            }

            if(var8 <= -1919617319) {
               aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(878384166);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var8 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if(var8 <= 81) {
               aByteArrayArrayArray634[var1][var2][var3] = (byte)(var8 - -482203568);
            } else {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var8 - 1956023518);
            }
         }
      } else {
         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               break;
            }

            if(1 == var8) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var8 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }

   static final void method728(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + 932731 + var2, var5 + 556238 + var3, -1393350074) * 8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var8 == 1) {
               int var7 = var0.readSignedByte(1708176767);
               if(1 == var7) {
                  var7 = 0;
               }

               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = 8 * -var7;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - var7 * 8;
               }
               break;
            }

            if(var8 <= 49) {
               aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(1054662502);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var8 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if(var8 <= 81) {
               aByteArrayArrayArray634[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               break;
            }

            if(1 == var8) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var8 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }

   static final void method729(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + 932731 + var2, var5 + 556238 + var3, -1547494140) * 8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var8 = var0.readSignedByte(1708176767);
               if(1 == var8) {
                  var8 = 0;
               }

               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = 8 * -var8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(-1879344606);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 > 81) {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var7 - 81);
            } else {
               aByteArrayArrayArray634[var1][var2][var3] = (byte)(var7 - 49);
            }
         }
      } else {
         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               break;
            }

            if(1 == var7) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var7 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }

   static final void method730(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + 932731 + var2, var5 + 556238 + var3, 522508726) * 8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var8 = var0.readSignedByte(1708176767);
               if(1 == var8) {
                  var8 = 0;
               }

               if(var1 == 0) {
                  anIntArrayArrayArray635[0][var2][var3] = 8 * -var8;
               } else {
                  anIntArrayArrayArray635[var1][var2][var3] = anIntArrayArrayArray635[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(-2104816507);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var7 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               aByteArrayArrayArray634[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readSignedByte(1708176767);
            if(0 == var7) {
               break;
            }

            if(1 == var7) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var7 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }

   static final boolean method731(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var6 = new Buffer(var0);
      int var5 = -1;

      while(true) {
         int var8 = var6.readSmartC(-340093934);
         if(0 == var8) {
            return var3;
         }

         var5 += var8;
         int var9 = 0;
         boolean var10 = false;

         while(true) {
            int var12;
            if(var10) {
               var12 = var6.readSmartC(-2139238427);
               if(var12 == 0) {
                  break;
               }

               var6.readSignedByte(1708176767);
            } else {
               var12 = var6.readSmartC(-1458146986);
               if(var12 == 0) {
                  break;
               }

               var9 += var12 - 1;
               int var14 = var9 & 63;
               int var11 = var9 >> 6 & 63;
               int var7 = var6.readSignedByte(1708176767) >> 2;
               int var4 = var11 + var1;
               int var15 = var2 + var14;
               if(var4 > 0 && var15 > 0 && var4 < 103 && var15 < 103) {
                  ObjectDefinition var13 = Class45.method700(var5, 359750046);
                  if(var7 != 22 || !client.aBool2937 || var13.anInt2203 * -839074197 != 0 || -1030255905 * var13.actionCount == 1 || var13.clippingFlag) {
                     if(!var13.method2411((byte)-78)) {
                        client.anInt2992 += -34022823;
                        var3 = false;
                     }

                     var10 = true;
                  }
               }
            }
         }
      }
   }

   static int method732(int var0, int var1, int var2) {
      return (aByteArrayArrayArray634[var0][var1][var2] & 8) != 0?0:(var0 > 0 && 0 != (aByteArrayArrayArray634[1][var1][var2] & 2)?var0 - 1:var0);
   }

   static final void method733(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var14 = -1;

      while(true) {
         int var13 = var10.readSmartC(1386872769);
         if(0 == var13) {
            return;
         }

         var14 += var13;
         int var11 = 0;

         while(true) {
            int var15 = var10.readSmartC(-1549742835);
            if(0 == var15) {
               break;
            }

            var11 += var15 - 1;
            int var12 = var11 & 63;
            int var18 = var11 >> 6 & 63;
            int var19 = var11 >> 12;
            int var20 = var10.readSignedByte(1708176767);
            int var21 = var20 >> 2;
            int var22 = var20 & 3;
            if(var4 == var19 && var18 >= var5 && var18 < 8 + var5 && var12 >= var6 && var12 < var6 + 8) {
               ObjectDefinition var28 = Class45.method700(var14, 359750046);
               int var26 = var18 & 7;
               int var27 = var12 & 7;
               int var17 = 1162660975 * var28.sizeX;
               int var16 = -1976023901 * var28.sizeY;
               int var23;
               if((var22 & 1) == 1) {
                  var23 = var17;
                  var17 = var16;
                  var16 = var23;
               }

               int var31 = var7 & 3;
               int var29;
               if(var31 == 0) {
                  var29 = var26;
               } else if(var31 == 1) {
                  var29 = var27;
               } else if(var31 == 2) {
                  var29 = 7 - var26 - (var17 - 1);
               } else {
                  var29 = 7 - var27 - (var16 - 1);
               }

               var23 = var2 + var29;
               int var24 = var3 + Entity.method3110(var18 & 7, var12 & 7, var7, var28.sizeX * 1162660975, var28.sizeY * -1976023901, var22, (byte) 8);
               if(var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                  int var30 = var1;
                  if((aByteArrayArrayArray634[1][var23][var24] & 2) == 2) {
                     var30 = var1 - 1;
                  }

                  Class58 var32 = null;
                  if(var30 >= 0) {
                     var32 = var9[var30];
                  }

                  Class116_Sub6.method1933(var1, var23, var24, var14, var7 + var22 & 3, var21, var8, var32, (byte)-78);
               }
            }
         }
      }
   }

   static final void method734(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var25 = -1;

      while(true) {
         int var12 = var10.readSmartC(-514397680);
         if(0 == var12) {
            return;
         }

         var25 += var12;
         int var15 = 0;

         while(true) {
            int var18 = var10.readSmartC(-1461028334);
            if(0 == var18) {
               break;
            }

            var15 += var18 - 1;
            int var19 = var15 & 63;
            int var23 = var15 >> 6 & 63;
            int var20 = var15 >> 12;
            int var21 = var10.readSignedByte(1708176767);
            int var22 = var21 >> 2;
            int var16 = var21 & 3;
            if(var4 == var20 && var23 >= var5 && var23 < 8 + var5 && var19 >= var6 && var19 < var6 + 8) {
               ObjectDefinition var13 = Class45.method700(var25, 359750046);
               int var31 = var23 & 7;
               int var27 = var19 & 7;
               int var17 = 1162660975 * var13.sizeX;
               int var14 = -1976023901 * var13.sizeY;
               int var11;
               if((var16 & 1) == 1) {
                  var11 = var17;
                  var17 = var14;
                  var14 = var11;
               }

               int var29 = var7 & 3;
               int var28;
               if(var29 == 0) {
                  var28 = var31;
               } else if(var29 == 1) {
                  var28 = var27;
               } else if(var29 == 2) {
                  var28 = 7 - var31 - (var17 - 1);
               } else {
                  var28 = 7 - var27 - (var14 - 1);
               }

               var11 = var2 + var28;
               int var24 = var3 + Entity.method3110(var23 & 7, var19 & 7, var7, var13.sizeX * 1162660975, var13.sizeY * -1976023901, var16, (byte) 8);
               if(var11 > 0 && var24 > 0 && var11 < 103 && var24 < 103) {
                  int var32 = var1;
                  if((aByteArrayArrayArray634[1][var11][var24] & 2) == 2) {
                     var32 = var1 - 1;
                  }

                  Class58 var30 = null;
                  if(var32 >= 0) {
                     var30 = var9[var32];
                  }

                  Class116_Sub6.method1933(var1, var11, var24, var25, var7 + var16 & 3, var22, var8, var30, (byte)-112);
               }
            }
         }
      }
   }

   static final void method735(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var19 = -1;

      while(true) {
         int var13 = var10.readSmartC(-51591544);
         if(0 == var13) {
            return;
         }

         var19 += var13;
         int var21 = 0;

         while(true) {
            int var20 = var10.readSmartC(-1187267587);
            if(0 == var20) {
               break;
            }

            var21 += var20 - 1;
            int var15 = var21 & 63;
            int var14 = var21 >> 6 & 63;
            int var23 = var21 >> 12;
            int var24 = var10.readSignedByte(1708176767);
            int var25 = var24 >> 2;
            int var17 = var24 & 3;
            if(var4 == var23 && var14 >= var5 && var14 < 8 + var5 && var15 >= var6 && var15 < var6 + 8) {
               ObjectDefinition var16 = Class45.method700(var19, 359750046);
               int var29 = var14 & 7;
               int var27 = var15 & 7;
               int var12 = 1162660975 * var16.sizeX;
               int var11 = -1976023901 * var16.sizeY;
               int var26;
               if((var17 & 1) == 1) {
                  var26 = var12;
                  var12 = var11;
                  var11 = var26;
               }

               int var22 = var7 & 3;
               int var30;
               if(var22 == 0) {
                  var30 = var29;
               } else if(var22 != 1) {
                  if(var22 == 2) {
                     var30 = 7 - var29 - (var12 - 1);
                  } else {
                     var30 = 7 - var27 - (var11 - 1);
                  }
               } else {
                  var30 = var27;
               }

               var26 = var2 + var30;
               int var18 = var3 + Entity.method3110(var14 & 7, var15 & 7, var7, var16.sizeX * 1162660975, var16.sizeY * -1976023901, var17, (byte) 8);
               if(var26 > 0 && var18 > 0 && var26 < 103 && var18 < 103) {
                  int var28 = var1;
                  if((aByteArrayArrayArray634[1][var26][var18] & 2) == 2) {
                     var28 = var1 - 1;
                  }

                  Class58 var32 = null;
                  if(var28 >= 0) {
                     var32 = var9[var28];
                  }

                  Class116_Sub6.method1933(var1, var26, var18, var19, var7 + var17 & 3, var25, var8, var32, (byte)-109);
               }
            }
         }
      }
   }

   static void method736() {
      client.aByteArrayArrayArray1614 = (byte[][][])null;
      aByteArrayArrayArray626 = (byte[][][])null;
      Class116_Sub23_Sub7.aByteArrayArrayArray2291 = (byte[][][])null;
      Class60.aByteArrayArrayArray780 = (byte[][][])null;
      anIntArrayArrayArray630 = (int[][][])null;
      aByteArrayArrayArray627 = (byte[][][])null;
      anIntArrayArray642 = (int[][])null;
      Speach.anIntArray981 = null;
      Class62.anIntArray800 = null;
      anIntArray629 = null;
      Class101.anIntArray1409 = null;
      Class116_Sub23_Sub18.anIntArray2486 = null;
   }

   static final int method737(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final int method738(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var10 = var0 & var2 - 1;
      int var4 = var1 / var2;
      int var5 = var1 & var2 - 1;
      int var9 = Class39.method681(var3, var4, 209503115);
      int var8 = Class39.method681(var3 + 1, var4, -1516548061);
      int var6 = Class39.method681(var3, var4 + 1, 265753722);
      int var7 = Class39.method681(1 + var3, 1 + var4, 781736917);
      int var11 = Class116_Sub11.method1975(var9, var8, var10, var2, -1735266932);
      int var12 = Class116_Sub11.method1975(var6, var7, var10, var2, -2080825067);
      return Class116_Sub11.method1975(var11, var12, var5, var2, -1946004947);
   }

   static final void method739(int var0, int var1, int var2, int var3, int var4, int var5, GroundController var6, Class58 var7) {
      if(!client.aBool2937 || (aByteArrayArrayArray634[0][var1][var2] & 2) != 0 || (aByteArrayArrayArray634[var0][var1][var2] & 16) == 0) {
         if(var0 < anInt638 * -207909178) {
            anInt638 = var0 * -659489436;
         }

         ObjectDefinition var9 = Class45.method700(var3, 359750046);
         int var10;
         int var11;
         if(1 != var4 && 3 != var4) {
            var10 = var9.sizeX * -1564204173;
            var11 = -1427685542 * var9.sizeY;
         } else {
            var10 = 2063421768 * var9.sizeY;
            var11 = var9.sizeX * -35101588;
         }

         int var19;
         int var20;
         if(var10 + var1 <= -807323392) {
            var20 = (var10 >> 1) + var1;
            var19 = (var10 + 1 >> 1) + var1;
         } else {
            var20 = var1;
            var19 = var1 + 1;
         }

         int var8;
         int var25;
         if(var2 + var11 <= -68984988) {
            var8 = var2 + (var11 >> 1);
            var25 = (var11 + 1 >> 1) + var2;
         } else {
            var8 = var2;
            var25 = var2 + 1;
         }

         int[][] var14 = anIntArrayArrayArray635[var0];
         int var16 = var14[var20][var25] + var14[var19][var8] + var14[var20][var8] + var14[var19][var25] >> 2;
         int var15 = (var10 << 6) + (var1 << 7);
         int var17 = (var2 << 7) + (var11 << 6);
         int var23 = -1726720471 + (var3 << 14) + (var2 << 7) + var1;
         if(var9.anInt2203 * -839074197 == 0) {
            var23 -= Integer.MIN_VALUE;
         }

         int var24 = var5 + (var4 << 6);
         if(547466771 * var9.anInt2229 == 1) {
            var24 += 256;
         }

         int var12;
         int var21;
         if(var9.method2402(2031563592)) {
            Class116_Sub8 var22 = new Class116_Sub8();
            var22.anInt1768 = var0 * -914554225;
            var22.anInt1769 = var1 * -321811903;
            var22.anInt1770 = 620267648 * var2;
            var12 = -997870586 * var9.sizeX;
            var21 = -929536728 * var9.sizeY;
            if(var4 == 1 || 3 == var4) {
               var12 = -294942623 * var9.sizeY;
               var21 = var9.sizeX * -1760749505;
            }

            var22.anInt1767 = (var12 + var1) * -1461530240;
            var22.anInt1773 = (var2 + var21) * 1218256512;
            var22.anInt1781 = 802663847 * var9.anInt2233;
            var22.anInt1782 = var9.anInt2234 * 22205099;
            var22.anInt1776 = 428311197 * var9.anInt2195;
            var22.anInt1777 = 1108507363 * var9.anInt2236;
            var22.anIntArray1771 = var9.anIntArray2211;
            if(null != var9.anIntArray2206) {
               var22.aClass116_Sub23_Sub3_1784 = var9;
               var22.method1938(-725176532);
            }

            Class116_Sub8.aClass117_1779.method1571(var22);
            if(null != var22.anIntArray1771) {
               var22.anInt1772 = (-1875457101 * var22.anInt1776 + (int)(Math.random() * (double)(var22.anInt1777 * -1201579529 - var22.anInt1776 * 741068522))) * 694957804;
            }
         }

         Object var28;
         if(22 == var5) {
            if(!client.aBool2937 || var9.anInt2203 * 549148666 != 0 || -1030255905 * var9.actionCount == 1 || var9.clippingFlag) {
               if(var9.anInt2212 * -100857069 == -1 && null == var9.anIntArray2206) {
                  var28 = var9.method2396(22, var4, var14, var15, var16, var17, -358861862);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 22, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
               }

               var6.method351(var0, var1, var2, var16, (Animable)var28, var23, var24);
               if(1 == -1030255905 * var9.actionCount && null != var7) {
                  var7.method859(var1, var2, (byte)3);
               }

            }
         } else if(var5 != 10 && 11 != var5) {
            if(var5 >= 12) {
               if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(var5, var4, var14, var15, var16, var17, -2138113355);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -1910234713 * var9.anInt2212, true, (Animable)null);
               }

               var6.method355(var0, var1, var2, var16, 1, 1, (Animable)var28, 0, var23, var24);
               if(var5 >= 12 && var5 <= 17 && 13 != var5 && var0 > 0) {
                  anIntArrayArrayArray630[var0][var1][var2] |= -1292256881;
               }

               if(-1030255905 * var9.actionCount != 0 && var7 != null) {
                  var7.method857(var1, var2, var10, var11, var9.walkable, 1483178392);
               }

            } else if(var5 == 0) {
               if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(0, var4, var14, var15, var16, var17, 1295337336);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 0, var4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var16, (Animable)var28, (Animable)null, anIntArray632[var4], 0, var23, var24);
               if(var4 == 0) {
                  if(var9.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                  }

                  if(var9.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= -1568642303;
                  }
               } else if(1 == var4) {
                  if(var9.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][1 + var2] = (byte)-1459454791;
                     aByteArrayArrayArray627[var0][1 + var1][1 + var2] = (byte)-1272579507;
                  }

                  if(var9.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1402406565;
                  }
               } else if(2 == var4) {
                  if(var9.aBool2220) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var9.aBool2191) {
                     anIntArrayArrayArray630[var0][1 + var1][var2] |= 17286720;
                  }
               } else if(3 == var4) {
                  if(var9.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = (byte)-728157737;
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  }

                  if(var9.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= -1007892817;
                  }
               }

               if(0 != -1030255905 * var9.actionCount && null != var7) {
                  var7.method866(var1, var2, var5, var4, var9.walkable, -1846117798);
               }

               if(16 != var9.anInt2213 * -1304612347) {
                  var6.method361(var0, var1, var2, -1333089832 * var9.anInt2213);
               }

            } else if(1 == var5) {
               if(-1 == -100857069 * var9.anInt2212 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(1, var4, var14, var15, var16, var17, 633415585);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 1, var4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var16, (Animable)var28, (Animable)null, anIntArray633[var4], 0, var23, var24);
               if(var9.aBool2220) {
                  if(var4 == 0) {
                     aByteArrayArrayArray627[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     aByteArrayArrayArray627[var0][var1 + 1][1 + var2] = (byte)1708955298;
                  } else if(var4 == 2) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  } else if(var4 == 3) {
                     aByteArrayArrayArray627[var0][var1][var2] = (byte)956244063;
                  }
               }

               if(0 != var9.actionCount * -243957112 && var7 != null) {
                  var7.method866(var1, var2, var5, var4, var9.walkable, -1862772354);
               }

            } else {
               Object var29;
               int var30;
               if(2 == var5) {
                  var30 = var4 + 1 & 3;
                  Object var26;
                  if(-1 == var9.anInt2212 * -100857069 && var9.anIntArray2206 == null) {
                     var26 = var9.method2396(2, 4 + var4, var14, var15, var16, var17, -1500340242);
                     var29 = var9.method2396(2, var30, var14, var15, var16, var17, 1959047865);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 2, var4 + 4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 2, var30, var0, var1, var2, -1315696052 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var16, (Animable)var26, (Animable)var29, anIntArray632[var4], anIntArray632[var30], var23, var24);
                  if(var9.aBool2191) {
                     if(0 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= -459481744;
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 734887443;
                     } else if(var4 == 1) {
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                        anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                     } else if(var4 == 2) {
                        anIntArrayArrayArray630[var0][var1 + 1][var2] |= 585;
                        anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                     } else if(3 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= 1688302634;
                        anIntArrayArrayArray630[var0][var1][var2] |= 1111969278;
                     }
                  }

                  if(var9.actionCount * -1030255905 != 0 && null != var7) {
                     var7.method866(var1, var2, var5, var4, var9.walkable, -2059036809);
                  }

                  if(var9.anInt2213 * -511445585 != 16) {
                     var6.method361(var0, var1, var2, -1017149678 * var9.anInt2213);
                  }

               } else if(3 == var5) {
                  if(-1 == var9.anInt2212 * -100857069 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(3, var4, var14, var15, var16, var17, 427994842);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 3, var4, var0, var1, var2, var9.anInt2212 * 381991400, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var16, (Animable)var28, (Animable)null, anIntArray633[var4], 0, var23, var24);
                  if(var9.aBool2220) {
                     if(var4 == 0) {
                        aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     } else if(1 == var4) {
                        aByteArrayArrayArray627[var0][1 + var1][var2 + 1] = 50;
                     } else if(2 == var4) {
                        aByteArrayArrayArray627[var0][var1 + 1][var2] = (byte)1266161251;
                     } else if(var4 == 3) {
                        aByteArrayArrayArray627[var0][var1][var2] = 50;
                     }
                  }

                  if(-1030255905 * var9.actionCount != 0 && var7 != null) {
                     var7.method866(var1, var2, var5, var4, var9.walkable, -2050464828);
                  }

               } else if(var5 == 9) {
                  if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(var5, var4, var14, var15, var16, var17, -2130046911);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, 672285489 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method355(var0, var1, var2, var16, 1, 1, (Animable)var28, 0, var23, var24);
                  if(-36359730 * var9.actionCount != 0 && var7 != null) {
                     var7.method857(var1, var2, var10, var11, var9.walkable, 1483178392);
                  }

                  if(16 != 1063235335 * var9.anInt2213) {
                     var6.method361(var0, var1, var2, var9.anInt2213 * 1063235335);
                  }

               } else if(4 == var5) {
                  if(-494010810 * var9.anInt2212 == -1 && null == var9.anIntArray2206) {
                     var28 = var9.method2396(4, var4, var14, var15, var16, var17, -760884742);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -31629091 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var16, (Animable)var28, (Animable)null, anIntArray632[var4], 0, 0, 0, var23, var24);
               } else if(5 == var5) {
                  var30 = 16;
                  var12 = var6.method452(var0, var1, var2);
                  if(0 != var12) {
                     var30 = Class45.method700(var12 >> 14 & 1233008074, 359750046).anInt2213 * 726675909;
                  }

                  if(-1 == var9.anInt2212 * -860462208 && null == var9.anIntArray2206) {
                     var29 = var9.method2396(4, var4, var14, var15, var16, var17, 1525099063);
                  } else {
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -1452665731 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var16, (Animable)var29, (Animable)null, anIntArray632[var4], 0, anIntArray623[var4] * var30, anIntArray636[var4] * var30, var23, var24);
               } else if(var5 == 6) {
                  var30 = 8;
                  var12 = var6.method452(var0, var1, var2);
                  if(var12 != 0) {
                     var30 = Class45.method700(var12 >> 14 & 350768410, 359750046).anInt2213 * -1632280566 / 2;
                  }

                  if(-1 == 1643440421 * var9.anInt2212 && var9.anIntArray2206 == null) {
                     var29 = var9.method2396(4, var4 + 4, var14, var15, var16, var17, -390927887);
                  } else {
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var16, (Animable)var29, (Animable)null, 1114187999, var4, var30 * anIntArray640[var4], var30 * anIntArray637[var4], var23, var24);
               } else if(var5 == 7) {
                  var12 = 2 + var4 & 3;
                  if(var9.anInt2212 * 1237770252 == -1 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(4, 4 + var12, var14, var15, var16, var17, 1063936737);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var12, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var16, (Animable)var28, (Animable)null, 256, var12, 0, 0, var23, var24);
               } else if(8 == var5) {
                  var30 = 8;
                  var12 = var6.method452(var0, var1, var2);
                  if(var12 != 0) {
                     var30 = Class45.method700(var12 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  int var13 = var4 + 2 & 3;
                  Object var27;
                  if(var9.anInt2212 * -163874693 == -1 && var9.anIntArray2206 == null) {
                     var29 = var9.method2396(4, 4 + var4, var14, var15, var16, var17, 1847396173);
                     var27 = var9.method2396(4, var13 + 4, var14, var15, var16, var17, 1947283553);
                  } else {
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4 + 4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                     var27 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var13, var0, var1, var2, 1907703913 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var16, (Animable)var29, (Animable)var27, 256, var4, anIntArray640[var4] * var30, var30 * anIntArray637[var4], var23, var24);
               }
            }
         } else {
            if(-1 == -100857069 * var9.anInt2212 && var9.anIntArray2206 == null) {
               var28 = var9.method2396(10, var4, var14, var15, var16, var17, -2008756599);
            } else {
               var28 = new Class116_Sub23_Sub16_Sub6(var3, 10, var4, var0, var1, var2, -1745962761 * var9.anInt2212, true, (Animable)null);
            }

            if(null != var28 && var6.method355(var0, var1, var2, var16, var10, var11, (Animable)var28, var5 == 11?-827166645:0, var23, var24) && var9.aBool2220) {
               var12 = 15;
               if(var28 instanceof SpotAnim) {
                  var12 = ((SpotAnim)var28).method3375() / 4;
                  if(var12 > 30) {
                     var12 = 30;
                  }
               }

               for(var21 = 0; var21 <= var10; ++var21) {
                  for(int var18 = 0; var18 <= var11; ++var18) {
                     if(var12 > aByteArrayArrayArray627[var0][var21 + var1][var18 + var2]) {
                        aByteArrayArrayArray627[var0][var1 + var21][var2 + var18] = (byte)var12;
                     }
                  }
               }
            }

            if(0 != var9.actionCount * -1867537822 && var7 != null) {
               var7.method857(var1, var2, var10, var11, var9.walkable, 1483178392);
            }

         }
      }
   }

   static final int method740(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 544131362) {
         var1 /= 2;
      }

      int var3 = var2 / 2 + (var1 / -2112428059 << 7) + (var0 / 4 << 10);
      return var3;
   }

   static final void method741(int var0, int var1, int var2, int var3, int var4, int var5, GroundController var6, Class58 var7) {
      if(!client.aBool2937 || (aByteArrayArrayArray634[0][var1][var2] & 2) != 0 || (aByteArrayArrayArray634[var0][var1][var2] & 16) == 0) {
         if(var0 < anInt638 * -1263368093) {
            anInt638 = var0 * -241419957;
         }

         ObjectDefinition var10 = Class45.method700(var3, 359750046);
         int var11;
         int var12;
         if(1 != var4 && 3 != var4) {
            var12 = var10.sizeX * 1162660975;
            var11 = -1976023901 * var10.sizeY;
         } else {
            var12 = -1976023901 * var10.sizeY;
            var11 = var10.sizeX * 1162660975;
         }

         int var13;
         int var24;
         if(var12 + var1 <= 104) {
            var13 = (var12 >> 1) + var1;
            var24 = (var12 + 1 >> 1) + var1;
         } else {
            var13 = var1;
            var24 = var1 + 1;
         }

         int var17;
         int var18;
         if(var2 + var11 <= 104) {
            var17 = var2 + (var11 >> 1);
            var18 = (var11 + 1 >> 1) + var2;
         } else {
            var17 = var2;
            var18 = var2 + 1;
         }

         int[][] var8 = anIntArrayArrayArray635[var0];
         int var22 = var8[var13][var18] + var8[var24][var17] + var8[var13][var17] + var8[var24][var18] >> 2;
         int var20 = (var12 << 6) + (var1 << 7);
         int var21 = (var2 << 7) + (var11 << 6);
         int var14 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
         if(var10.anInt2203 * -839074197 == 0) {
            var14 -= Integer.MIN_VALUE;
         }

         int var9 = var5 + (var4 << 6);
         if(547466771 * var10.anInt2229 == 1) {
            var9 += 256;
         }

         int var16;
         int var19;
         if(var10.method2402(2031563592)) {
            Class116_Sub8 var15 = new Class116_Sub8();
            var15.anInt1768 = var0 * 246258815;
            var15.anInt1769 = var1 * -1791242624;
            var15.anInt1770 = 620267648 * var2;
            var19 = 1162660975 * var10.sizeX;
            var16 = -1976023901 * var10.sizeY;
            if(var4 == 1 || 3 == var4) {
               var19 = -1976023901 * var10.sizeY;
               var16 = var10.sizeX * 1162660975;
            }

            var15.anInt1767 = (var19 + var1) * -1461530240;
            var15.anInt1773 = (var2 + var16) * 1218256512;
            var15.anInt1781 = 802663847 * var10.anInt2233;
            var15.anInt1782 = var10.anInt2234 * 401668736;
            var15.anInt1776 = 428311197 * var10.anInt2195;
            var15.anInt1777 = 1108507363 * var10.anInt2236;
            var15.anIntArray1771 = var10.anIntArray2211;
            if(null != var10.anIntArray2206) {
               var15.aClass116_Sub23_Sub3_1784 = var10;
               var15.method1938(1767720367);
            }

            Class116_Sub8.aClass117_1779.method1571(var15);
            if(null != var15.anIntArray1771) {
               var15.anInt1772 = (-1875457101 * var15.anInt1776 + (int)(Math.random() * (double)(var15.anInt1777 * -1201579529 - var15.anInt1776 * -1875457101))) * -2049360189;
            }
         }

         Object var26;
         if(22 == var5) {
            if(!client.aBool2937 || var10.anInt2203 * -839074197 != 0 || -1030255905 * var10.actionCount == 1 || var10.clippingFlag) {
               if(var10.anInt2212 * -100857069 == -1 && null == var10.anIntArray2206) {
                  var26 = var10.method2396(22, var4, var8, var20, var22, var21, 1273223214);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 22, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
               }

               var6.method351(var0, var1, var2, var22, (Animable)var26, var14, var9);
               if(1 == -1030255905 * var10.actionCount && null != var7) {
                  var7.method859(var1, var2, (byte)3);
               }

            }
         } else if(var5 != 10 && 11 != var5) {
            if(var5 >= 12) {
               if(var10.anInt2212 * -100857069 == -1 && var10.anIntArray2206 == null) {
                  var26 = var10.method2396(var5, var4, var8, var20, var22, var21, 1303288315);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
               }

               var6.method355(var0, var1, var2, var22, 1, 1, (Animable)var26, 0, var14, var9);
               if(var5 >= 12 && var5 <= 17 && 13 != var5 && var0 > 0) {
                  anIntArrayArrayArray630[var0][var1][var2] |= 2340;
               }

               if(-1030255905 * var10.actionCount != 0 && var7 != null) {
                  var7.method857(var1, var2, var12, var11, var10.walkable, 1483178392);
               }

            } else if(var5 == 0) {
               if(var10.anInt2212 * -100857069 == -1 && var10.anIntArray2206 == null) {
                  var26 = var10.method2396(0, var4, var8, var20, var22, var21, -1893180220);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 0, var4, var0, var1, var2, var10.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var22, (Animable)var26, (Animable)null, anIntArray632[var4], 0, var14, var9);
               if(var4 == 0) {
                  if(var10.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                  }

                  if(var10.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= 585;
                  }
               } else if(1 == var4) {
                  if(var10.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     aByteArrayArrayArray627[var0][1 + var1][1 + var2] = 50;
                  }

                  if(var10.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                  }
               } else if(2 == var4) {
                  if(var10.aBool2220) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var10.aBool2191) {
                     anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                  }
               } else if(3 == var4) {
                  if(var10.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  }

                  if(var10.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                  }
               }

               if(0 != -1030255905 * var10.actionCount && null != var7) {
                  var7.method866(var1, var2, var5, var4, var10.walkable, -1993843627);
               }

               if(16 != var10.anInt2213 * 1063235335) {
                  var6.method361(var0, var1, var2, 1063235335 * var10.anInt2213);
               }

            } else if(1 == var5) {
               if(-1 == -100857069 * var10.anInt2212 && var10.anIntArray2206 == null) {
                  var26 = var10.method2396(1, var4, var8, var20, var22, var21, 1883501623);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 1, var4, var0, var1, var2, var10.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var22, (Animable)var26, (Animable)null, anIntArray633[var4], 0, var14, var9);
               if(var10.aBool2220) {
                  if(var4 == 0) {
                     aByteArrayArrayArray627[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     aByteArrayArrayArray627[var0][var1 + 1][1 + var2] = 50;
                  } else if(var4 == 2) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  } else if(var4 == 3) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                  }
               }

               if(0 != var10.actionCount * -1030255905 && var7 != null) {
                  var7.method866(var1, var2, var5, var4, var10.walkable, -2079480710);
               }

            } else {
               int var27;
               Object var28;
               if(2 == var5) {
                  var27 = var4 + 1 & 3;
                  Object var29;
                  if(-1 == var10.anInt2212 * -100857069 && var10.anIntArray2206 == null) {
                     var29 = var10.method2396(2, 4 + var4, var8, var20, var22, var21, 734988472);
                     var28 = var10.method2396(2, var27, var8, var20, var22, var21, 1826967667);
                  } else {
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 2, var4 + 4, var0, var1, var2, var10.anInt2212 * -100857069, true, (Animable)null);
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 2, var27, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var22, (Animable)var29, (Animable)var28, anIntArray632[var4], anIntArray632[var27], var14, var9);
                  if(var10.aBool2191) {
                     if(0 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= 585;
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                     } else if(var4 == 1) {
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                        anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                     } else if(var4 == 2) {
                        anIntArrayArrayArray630[var0][var1 + 1][var2] |= 585;
                        anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                     } else if(3 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                        anIntArrayArrayArray630[var0][var1][var2] |= 585;
                     }
                  }

                  if(var10.actionCount * -1030255905 != 0 && null != var7) {
                     var7.method866(var1, var2, var5, var4, var10.walkable, -2115194690);
                  }

                  if(var10.anInt2213 * 1063235335 != 16) {
                     var6.method361(var0, var1, var2, 1063235335 * var10.anInt2213);
                  }

               } else if(3 == var5) {
                  if(-1 == var10.anInt2212 * -100857069 && var10.anIntArray2206 == null) {
                     var26 = var10.method2396(3, var4, var8, var20, var22, var21, 2001073165);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 3, var4, var0, var1, var2, var10.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var22, (Animable)var26, (Animable)null, anIntArray633[var4], 0, var14, var9);
                  if(var10.aBool2220) {
                     if(var4 == 0) {
                        aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     } else if(1 == var4) {
                        aByteArrayArrayArray627[var0][1 + var1][var2 + 1] = 50;
                     } else if(2 == var4) {
                        aByteArrayArrayArray627[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        aByteArrayArrayArray627[var0][var1][var2] = 50;
                     }
                  }

                  if(-1030255905 * var10.actionCount != 0 && var7 != null) {
                     var7.method866(var1, var2, var5, var4, var10.walkable, -1866778911);
                  }

               } else if(var5 == 9) {
                  if(var10.anInt2212 * -100857069 == -1 && var10.anIntArray2206 == null) {
                     var26 = var10.method2396(var5, var4, var8, var20, var22, var21, 1295570141);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method355(var0, var1, var2, var22, 1, 1, (Animable)var26, 0, var14, var9);
                  if(-1030255905 * var10.actionCount != 0 && var7 != null) {
                     var7.method857(var1, var2, var12, var11, var10.walkable, 1483178392);
                  }

                  if(16 != 1063235335 * var10.anInt2213) {
                     var6.method361(var0, var1, var2, var10.anInt2213 * 1063235335);
                  }

               } else if(4 == var5) {
                  if(-100857069 * var10.anInt2212 == -1 && null == var10.anIntArray2206) {
                     var26 = var10.method2396(4, var4, var8, var20, var22, var21, -708412862);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var22, (Animable)var26, (Animable)null, anIntArray632[var4], 0, 0, 0, var14, var9);
               } else if(5 == var5) {
                  var27 = 16;
                  var19 = var6.method452(var0, var1, var2);
                  if(0 != var19) {
                     var27 = Class45.method700(var19 >> 14 & 32767, 359750046).anInt2213 * 1063235335;
                  }

                  if(-1 == var10.anInt2212 * -100857069 && null == var10.anIntArray2206) {
                     var28 = var10.method2396(4, var4, var8, var20, var22, var21, 1558049993);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var22, (Animable)var28, (Animable)null, anIntArray632[var4], 0, anIntArray623[var4] * var27, anIntArray636[var4] * var27, var14, var9);
               } else if(var5 == 6) {
                  var27 = 8;
                  var19 = var6.method452(var0, var1, var2);
                  if(var19 != 0) {
                     var27 = Class45.method700(var19 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  if(-1 == -100857069 * var10.anInt2212 && var10.anIntArray2206 == null) {
                     var28 = var10.method2396(4, var4 + 4, var8, var20, var22, var21, 992884389);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var22, (Animable)var28, (Animable)null, 256, var4, var27 * anIntArray640[var4], var27 * anIntArray637[var4], var14, var9);
               } else if(var5 == 7) {
                  var19 = 2 + var4 & 3;
                  if(var10.anInt2212 * -100857069 == -1 && var10.anIntArray2206 == null) {
                     var26 = var10.method2396(4, 4 + var19, var8, var20, var22, var21, 514882114);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var19, var0, var1, var2, var10.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var22, (Animable)var26, (Animable)null, 256, var19, 0, 0, var14, var9);
               } else if(8 == var5) {
                  var27 = 8;
                  var19 = var6.method452(var0, var1, var2);
                  if(var19 != 0) {
                     var27 = Class45.method700(var19 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  int var23 = var4 + 2 & 3;
                  Object var30;
                  if(var10.anInt2212 * -100857069 == -1 && var10.anIntArray2206 == null) {
                     var28 = var10.method2396(4, 4 + var4, var8, var20, var22, var21, 937267302);
                     var30 = var10.method2396(4, var23 + 4, var8, var20, var22, var21, 193501346);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4 + 4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                     var30 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var23, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var22, (Animable)var28, (Animable)var30, 256, var4, anIntArray640[var4] * var27, var27 * anIntArray637[var4], var14, var9);
               }
            }
         } else {
            if(-1 == -100857069 * var10.anInt2212 && var10.anIntArray2206 == null) {
               var26 = var10.method2396(10, var4, var8, var20, var22, var21, 1931995506);
            } else {
               var26 = new Class116_Sub23_Sub16_Sub6(var3, 10, var4, var0, var1, var2, -100857069 * var10.anInt2212, true, (Animable)null);
            }

            if(null != var26 && var6.method355(var0, var1, var2, var22, var12, var11, (Animable)var26, var5 == 11?256:0, var14, var9) && var10.aBool2220) {
               var19 = 15;
               if(var26 instanceof SpotAnim) {
                  var19 = ((SpotAnim)var26).method3375() / 4;
                  if(var19 > 30) {
                     var19 = 30;
                  }
               }

               for(var16 = 0; var16 <= var12; ++var16) {
                  for(int var25 = 0; var25 <= var11; ++var25) {
                     if(var19 > aByteArrayArrayArray627[var0][var16 + var1][var25 + var2]) {
                        aByteArrayArrayArray627[var0][var1 + var16][var2 + var25] = (byte)var19;
                     }
                  }
               }
            }

            if(0 != var10.actionCount * -1030255905 && var7 != null) {
               var7.method857(var1, var2, var12, var11, var10.walkable, 1483178392);
            }

         }
      }
   }

   static final int method742(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static int method743(int var0, int var1, int var2) {
      return (aByteArrayArrayArray634[var0][var1][var2] & 8) != 0?0:(var0 > 0 && 0 != (aByteArrayArrayArray634[1][var1][var2] & 2)?var0 - 1:var0);
   }

   static int method744(int var0, int var1, int var2) {
      return (aByteArrayArrayArray634[var0][var1][var2] & 8) != 0?0:(var0 > 0 && 0 != (aByteArrayArrayArray634[1][var1][var2] & 2)?var0 - 1:var0);
   }

   static final int method745(int var0, int var1) {
      int var2 = Class116_Sub15.method2275(var0 + -1625901129, var1 + 692568559, 4, 161978140) - 128 + (Class116_Sub15.method2275(-1351439156 + var0, var1 + '\u93bd', 2, 161978140) - 1468482305 >> 1) + (Class116_Sub15.method2275(var0, var1, 1, 161978140) - 128 >> 2);
      var2 = -809659784 + (int)((double)var2 * 0.3D);
      if(var2 < 10) {
         var2 = 10;
      } else if(var2 > -1217750024) {
         var2 = 60;
      }

      return var2;
   }

   static final int method746(int var0, int var1) {
      int var2 = Class116_Sub15.method2275(var0 + '\ub135', var1 + 91923, 4, 161978140) - 128 + (Class116_Sub15.method2275(10294 + var0, var1 + '\u93bd', 2, 161978140) - 128 >> 1) + (Class116_Sub15.method2275(var0, var1, 1, 161978140) - 128 >> 2);
      var2 = 35 + (int)((double)var2 * 0.3D);
      if(var2 < 10) {
         var2 = 10;
      } else if(var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   static final int method747(int var0, int var1) {
      int var2 = Class116_Sub15.method2275(var0 + '\ub135', var1 + 91923, 4, 161978140) - 128 + (Class116_Sub15.method2275(10294 + var0, var1 + '\u93bd', 2, 161978140) - 128 >> 1) + (Class116_Sub15.method2275(var0, var1, 1, 161978140) - 128 >> 2);
      var2 = 35 + (int)((double)var2 * 0.3D);
      if(var2 < 10) {
         var2 = 10;
      } else if(var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   static final void method748(byte[] var0, int var1, int var2, GroundController var3, Class58[] var4) {
      Buffer var5 = new Buffer(var0);
      int var14 = -1;

      while(true) {
         int var8 = var5.readSmartC(-301149412);
         if(0 == var8) {
            return;
         }

         var14 += var8;
         int var11 = 0;

         while(true) {
            int var12 = var5.readSmartC(1983496920);
            if(0 == var12) {
               break;
            }

            var11 += var12 - 1;
            int var19 = var11 & 63;
            int var15 = var11 >> 6 & 63;
            int var16 = var11 >> 12;
            int var6 = var5.readSignedByte(1708176767);
            int var17 = var6 >> 2;
            int var7 = var6 & 3;
            int var13 = var15 + var1;
            int var18 = var2 + var19;
            if(var13 > 0 && var18 > 0 && var13 < 103 && var18 < 103) {
               int var9 = var16;
               if((aByteArrayArrayArray634[1][var13][var18] & 2) == 2) {
                  var9 = var16 - 1;
               }

               Class58 var10 = null;
               if(var9 >= 0) {
                  var10 = var4[var9];
               }

               Class116_Sub6.method1933(var16, var13, var18, var14, var7, var17, var3, var10, (byte)-12);
            }
         }
      }
   }

   static final int method749(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var6 = var0 & var2 - 1;
      int var8 = var1 / var2;
      int var10 = var1 & var2 - 1;
      int var4 = Class39.method681(var3, var8, -1841464619);
      int var5 = Class39.method681(var3 + 1, var8, 2007646853);
      int var11 = Class39.method681(var3, var8 + 1, 1372357581);
      int var9 = Class39.method681(1 + var3, 1 + var8, 919132812);
      int var7 = Class116_Sub11.method1975(var4, var5, var6, var2, -2094229694);
      int var12 = Class116_Sub11.method1975(var11, var9, var6, var2, -1924529662);
      return Class116_Sub11.method1975(var7, var12, var10, var2, -1856479806);
   }

   static final int method750(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - Texture.anIntArray2713[1024 * var2 / var3] >> 1;
      return (var4 * var1 >> 16) + (var0 * (65536 - var4) >> 16);
   }

   static final void method751(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var15 = -1;

      while(true) {
         int var14 = var10.readSmartC(-634255938);
         if(0 == var14) {
            return;
         }

         var15 += var14;
         int var17 = 0;

         while(true) {
            int var13 = var10.readSmartC(-410625727);
            if(0 == var13) {
               break;
            }

            var17 += var13 - 1;
            int var26 = var17 & 63;
            int var21 = var17 >> 6 & 63;
            int var22 = var17 >> 12;
            int var23 = var10.readSignedByte(1708176767);
            int var28 = var23 >> 2;
            int var25 = var23 & 3;
            if(var4 == var22 && var21 >= var5 && var21 < 8 + var5 && var26 >= var6 && var26 < var6 + 8) {
               ObjectDefinition var24 = Class45.method700(var15, 359750046);
               int var31 = var21 & 7;
               int var18 = var26 & 7;
               int var11 = 1162660975 * var24.sizeX;
               int var19 = -1976023901 * var24.sizeY;
               int var12;
               if((var25 & 1) == 1) {
                  var12 = var11;
                  var11 = var19;
                  var19 = var12;
               }

               int var16 = var7 & 3;
               int var20;
               if(var16 == 0) {
                  var20 = var31;
               } else if(var16 == 1) {
                  var20 = var18;
               } else if(var16 == 2) {
                  var20 = 7 - var31 - (var11 - 1);
               } else {
                  var20 = 7 - var18 - (var19 - 1);
               }

               var12 = var2 + var20;
               int var27 = var3 + Entity.method3110(var21 & 7, var26 & 7, var7, var24.sizeX * 1162660975, var24.sizeY * -1976023901, var25, (byte) 8);
               if(var12 > 0 && var27 > 0 && var12 < 103 && var27 < 103) {
                  int var29 = var1;
                  if((aByteArrayArrayArray634[1][var12][var27] & 2) == 2) {
                     var29 = var1 - 1;
                  }

                  Class58 var32 = null;
                  if(var29 >= 0) {
                     var32 = var9[var29];
                  }

                  Class116_Sub6.method1933(var1, var12, var27, var15, var7 + var25 & 3, var28, var8, var32, (byte)-8);
               }
            }
         }
      }
   }

   static final int method752(int var0, int var1) {
      int var2 = Class116_Sub23_Sub13.method2671(var0 - 1, var1 - 1, (byte)-3) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 - 1, (byte)88) + Class116_Sub23_Sub13.method2671(var0 - 1, 1 + var1, (byte)-79) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 + 1, (byte)-26);
      int var3 = Class116_Sub23_Sub13.method2671(var0 - 1, var1, (byte)77) + Class116_Sub23_Sub13.method2671(1 + var0, var1, (byte)-37) + Class116_Sub23_Sub13.method2671(var0, var1 - 1, (byte)93) + Class116_Sub23_Sub13.method2671(var0, 1 + var1, (byte)68);
      int var4 = Class116_Sub23_Sub13.method2671(var0, var1, (byte)-83);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   static final int method753(int var0, int var1) {
      int var2 = Class116_Sub23_Sub13.method2671(var0 - 1, var1 - 1, (byte)-53) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 - 1, (byte)-59) + Class116_Sub23_Sub13.method2671(var0 - 1, 1 + var1, (byte)71) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 + 1, (byte)-98);
      int var3 = Class116_Sub23_Sub13.method2671(var0 - 1, var1, (byte)82) + Class116_Sub23_Sub13.method2671(1 + var0, var1, (byte)-88) + Class116_Sub23_Sub13.method2671(var0, var1 - 1, (byte)-30) + Class116_Sub23_Sub13.method2671(var0, 1 + var1, (byte)54);
      int var4 = Class116_Sub23_Sub13.method2671(var0, var1, (byte)57);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   static final int method754(int var0, int var1) {
      int var2 = var1 * -1568745319 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (-123520799 + var2 * var2 * 15731) + 422631285 & -1265682954;
      return var3 >> 19 & 255;
   }

   static final int method755(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 808207194);
      }
   }

   static char method756(char var0, int var1) {
      switch(var0) {
      case 32:
      case 45:
      case 95:
      case 160:
         return '_';
      case 35:
      case 91:
      case 93:
         return var0;
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 224:
      case 225:
      case 226:
      case 227:
      case 228:
         return 'a';
      case 199:
      case 231:
         return 'c';
      case 200:
      case 201:
      case 202:
      case 203:
      case 232:
      case 233:
      case 234:
      case 235:
         return 'e';
      case 205:
      case 206:
      case 207:
      case 237:
      case 238:
      case 239:
         return 'i';
      case 209:
      case 241:
         return 'n';
      case 210:
      case 211:
      case 212:
      case 213:
      case 214:
      case 242:
      case 243:
      case 244:
      case 245:
      case 246:
         return 'o';
      case 217:
      case 218:
      case 219:
      case 220:
      case 249:
      case 250:
      case 251:
      case 252:
         return 'u';
      case 223:
         return 'b';
      case 255:
      case 376:
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   static final int method757(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 >= 2) {
            if(var1 > 126) {
               var1 = 126;
            }
         } else {
            var1 = 2;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final boolean method758(int var0, int var1) {
      if(var0 >= 0) {
         int var2 = client.anIntArray3037[var0];
         if(var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      } else {
         return false;
      }
   }

   static final int method759(int var0, int var1) {
      if(var0 == 611763837) {
         return -1972584188;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > -347791082) {
            var1 = -1671705830;
         }

         return var1;
      } else {
         var1 = (var0 & -1728790678) * var1 / -1542338478;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > -1948517893) {
            var1 = 2098996147;
         }

         return var1 + (var0 & 1079624011);
      }
   }

   static final int method760(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 >= 2) {
            if(var1 > 126) {
               var1 = 126;
            }
         } else {
            var1 = 2;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final int method761(int var0, int var1) {
      int var2 = Class116_Sub23_Sub13.method2671(var0 - 1, var1 - 1, (byte)-95) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 - 1, (byte)39) + Class116_Sub23_Sub13.method2671(var0 - 1, 1 + var1, (byte)-21) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 + 1, (byte)-15);
      int var4 = Class116_Sub23_Sub13.method2671(var0 - 1, var1, (byte)-35) + Class116_Sub23_Sub13.method2671(1 + var0, var1, (byte)-42) + Class116_Sub23_Sub13.method2671(var0, var1 - 1, (byte)-80) + Class116_Sub23_Sub13.method2671(var0, 1 + var1, (byte)53);
      int var3 = Class116_Sub23_Sub13.method2671(var0, var1, (byte)82);
      return var3 / 4 + var4 / 8 + var2 / 16;
   }

   static final void method762(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, GroundController var8, Class58[] var9) {
      Buffer var10 = new Buffer(var0);
      int var13 = -1;

      while(true) {
         int var14 = var10.readSmartC(2052155411);
         if(0 == var14) {
            return;
         }

         var13 += var14;
         int var11 = 0;

         while(true) {
            int var15 = var10.readSmartC(-878094732);
            if(0 == var15) {
               break;
            }

            var11 += var15 - 1;
            int var16 = var11 & -1427776264;
            int var17 = var11 >> 6 & 63;
            int var12 = var11 >> 12;
            int var20 = var10.readSignedByte(1708176767);
            int var21 = var20 >> 2;
            int var26 = var20 & 3;
            if(var4 == var12 && var17 >= var5 && var17 < 8 + var5 && var16 >= var6 && var16 < var6 + 8) {
               ObjectDefinition var23 = Class45.method700(var13, 359750046);
               int var24 = var17 & 7;
               int var25 = var16 & 7;
               int var19 = 1162660975 * var23.sizeX;
               int var18 = 742274172 * var23.sizeY;
               int var29;
               if((var26 & 1) == 1) {
                  var29 = var19;
                  var19 = var18;
                  var18 = var29;
               }

               int var22 = var7 & 3;
               int var30;
               if(var22 == 0) {
                  var30 = var24;
               } else if(var22 == 1) {
                  var30 = var25;
               } else if(var22 == 2) {
                  var30 = 7 - var24 - (var19 - 1);
               } else {
                  var30 = 7 - var25 - (var18 - 1);
               }

               var29 = var2 + var30;
               int var27 = var3 + Entity.method3110(var17 & 7, var16 & 7, var7, var23.sizeX * 888976295, var23.sizeY * -1976023901, var26, (byte) 8);
               if(var29 > 0 && var27 > 0 && var29 < 103 && var27 < -1759483317) {
                  int var28 = var1;
                  if((aByteArrayArrayArray634[1][var29][var27] & 2) == 2) {
                     var28 = var1 - 1;
                  }

                  Class58 var32 = null;
                  if(var28 >= 0) {
                     var32 = var9[var28];
                  }

                  Class116_Sub6.method1933(var1, var29, var27, var13, var7 + var26 & 3, var21, var8, var32, (byte)-79);
               }
            }
         }
      }
   }

   static final void method763(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var2 + var0; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               aByteArrayArrayArray627[0][var5][var4] = 127;
               if(var5 == var0 && var5 > 0) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5 - 1][var4];
               }

               if(var5 == var0 + var2 && var5 < 103) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5 + 1][var4];
               }

               if(var1 == var4 && var4 > 0) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5][var4 - 1];
               }

               if(var4 == var1 + var3 && var4 < 103) {
                  anIntArrayArrayArray635[0][var5][var4] = anIntArrayArrayArray635[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   public static int method764(int var0, int var1, int var2, Class59 var3, Class58 var4, boolean var5, int[] var6, int[] var7, int var8) {
      int var13;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var13 = 0; var13 < 128; ++var13) {
            Class69.anIntArrayArray837[var9][var13] = 0;
            Class69.anIntArrayArray841[var9][var13] = 99999999;
         }
      }

      byte var10;
      int var11;
      int var12;
      byte var14;
      int var15;
      int var16;
      int var17;
      byte var18;
      int[][] var19;
      int var20;
      int var21;
      int var22;
      boolean var28;
      int var29;
      boolean var30;
      int var31;
      int var33;
      if(var2 == 1) {
         var15 = var0;
         var12 = var1;
         var10 = 64;
         var14 = 64;
         var11 = var0 - var10;
         var17 = var1 - var14;
         Class69.anIntArrayArray837[var10][var14] = 99;
         Class69.anIntArrayArray841[var10][var14] = 0;
         var18 = 0;
         var22 = 0;
         Class69.anIntArray838[var18] = var0;
         var33 = var18 + 1;
         Class69.anIntArray842[var18] = var1;
         var19 = var4.anIntArrayArray764;

         while(true) {
            if(var33 == var22) {
               Class69.anInt839 = var15 * -1685050181;
               Class59_Sub1.anInt1833 = -1194986937 * var12;
               var30 = false;
               break;
            }

            var15 = Class69.anIntArray838[var22];
            var12 = Class69.anIntArray842[var22];
            var22 = 1 + var22 & 4095;
            var29 = var15 - var11;
            var31 = var12 - var17;
            var20 = var15 - 1676632637 * var4.anInt765;
            var21 = var12 - var4.anInt766 * 291084413;
            if(var3.method891(1, var15, var12, var4, -1909538051)) {
               Class69.anInt839 = var15 * -1685050181;
               Class59_Sub1.anInt1833 = var12 * -1194986937;
               var30 = true;
               break;
            }

            var16 = Class69.anIntArrayArray841[var29][var31] + 1;
            if(var29 > 0 && 0 == Class69.anIntArrayArray837[var29 - 1][var31] && 0 == (var19[var20 - 1][var21] & 19136776)) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31] = 2;
               Class69.anIntArrayArray841[var29 - 1][var31] = var16;
            }

            if(var29 < 127 && Class69.anIntArrayArray837[var29 + 1][var31] == 0 && 0 == (var19[var20 + 1][var21] & 19136896)) {
               Class69.anIntArray838[var33] = var15 + 1;
               Class69.anIntArray842[var33] = var12;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[1 + var29][var31] = 8;
               Class69.anIntArrayArray841[var29 + 1][var31] = var16;
            }

            if(var31 > 0 && 0 == Class69.anIntArrayArray837[var29][var31 - 1] && 0 == (var19[var20][var21 - 1] & 19136770)) {
               Class69.anIntArray838[var33] = var15;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29][var31 - 1] = 1;
               Class69.anIntArrayArray841[var29][var31 - 1] = var16;
            }

            if(var31 < 127 && Class69.anIntArrayArray837[var29][1 + var31] == 0 && 0 == (var19[var20][1 + var21] & 19136800)) {
               Class69.anIntArray838[var33] = var15;
               Class69.anIntArray842[var33] = 1 + var12;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29][1 + var31] = 4;
               Class69.anIntArrayArray841[var29][var31 + 1] = var16;
            }

            if(var29 > 0 && var31 > 0 && Class69.anIntArrayArray837[var29 - 1][var31 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 19136782) == 0 && (var19[var20 - 1][var21] & 19136776) == 0 && 0 == (var19[var20][var21 - 1] & 19136770)) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31 - 1] = 3;
               Class69.anIntArrayArray841[var29 - 1][var31 - 1] = var16;
            }

            if(var29 < 127 && var31 > 0 && Class69.anIntArrayArray837[1 + var29][var31 - 1] == 0 && (var19[1 + var20][var21 - 1] & 19136899) == 0 && (var19[1 + var20][var21] & 19136896) == 0 && 0 == (var19[var20][var21 - 1] & 19136770)) {
               Class69.anIntArray838[var33] = 1 + var15;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[1 + var29][var31 - 1] = 9;
               Class69.anIntArrayArray841[var29 + 1][var31 - 1] = var16;
            }

            if(var29 > 0 && var31 < 127 && 0 == Class69.anIntArrayArray837[var29 - 1][1 + var31] && 0 == (var19[var20 - 1][1 + var21] & 19136824) && (var19[var20 - 1][var21] & 19136776) == 0 && (var19[var20][var21 + 1] & 19136800) == 0) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31 + 1] = 6;
               Class69.anIntArrayArray841[var29 - 1][var31 + 1] = var16;
            }

            if(var29 < 127 && var31 < 127 && 0 == Class69.anIntArrayArray837[var29 + 1][var31 + 1] && (var19[1 + var20][var21 + 1] & 19136992) == 0 && 0 == (var19[var20 + 1][var21] & 19136896) && 0 == (var19[var20][var21 + 1] & 19136800)) {
               Class69.anIntArray838[var33] = 1 + var15;
               Class69.anIntArray842[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[1 + var29][1 + var31] = 12;
               Class69.anIntArrayArray841[var29 + 1][1 + var31] = var16;
            }
         }

         var28 = var30;
      } else if(2 == var2) {
         var15 = var0;
         var12 = var1;
         var10 = 64;
         var14 = 64;
         var11 = var0 - var10;
         var17 = var1 - var14;
         Class69.anIntArrayArray837[var10][var14] = 99;
         Class69.anIntArrayArray841[var10][var14] = 0;
         var18 = 0;
         var22 = 0;
         Class69.anIntArray838[var18] = var0;
         var33 = var18 + 1;
         Class69.anIntArray842[var18] = var1;
         var19 = var4.anIntArrayArray764;

         while(true) {
            if(var22 == var33) {
               Class69.anInt839 = -1685050181 * var15;
               Class59_Sub1.anInt1833 = -1194986937 * var12;
               var30 = false;
               break;
            }

            var15 = Class69.anIntArray838[var22];
            var12 = Class69.anIntArray842[var22];
            var22 = 1 + var22 & 4095;
            var29 = var15 - var11;
            var31 = var12 - var17;
            var20 = var15 - 1676632637 * var4.anInt765;
            var21 = var12 - 291084413 * var4.anInt766;
            if(var3.method891(2, var15, var12, var4, -1833137502)) {
               Class69.anInt839 = var15 * -1685050181;
               Class59_Sub1.anInt1833 = -1194986937 * var12;
               var30 = true;
               break;
            }

            var16 = Class69.anIntArrayArray841[var29][var31] + 1;
            if(var29 > 0 && Class69.anIntArrayArray837[var29 - 1][var31] == 0 && 0 == (var19[var20 - 1][var21] & 19136782) && 0 == (var19[var20 - 1][1 + var21] & 19136824)) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31] = 2;
               Class69.anIntArrayArray841[var29 - 1][var31] = var16;
            }

            if(var29 < 126 && Class69.anIntArrayArray837[1 + var29][var31] == 0 && (var19[var20 + 2][var21] & 19136899) == 0 && (var19[2 + var20][var21 + 1] & 19136992) == 0) {
               Class69.anIntArray838[var33] = var15 + 1;
               Class69.anIntArray842[var33] = var12;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[1 + var29][var31] = 8;
               Class69.anIntArrayArray841[var29 + 1][var31] = var16;
            }

            if(var31 > 0 && Class69.anIntArrayArray837[var29][var31 - 1] == 0 && 0 == (var19[var20][var21 - 1] & 19136782) && 0 == (var19[1 + var20][var21 - 1] & 19136899)) {
               Class69.anIntArray838[var33] = var15;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29][var31 - 1] = 1;
               Class69.anIntArrayArray841[var29][var31 - 1] = var16;
            }

            if(var31 < 126 && 0 == Class69.anIntArrayArray837[var29][1 + var31] && (var19[var20][2 + var21] & 19136824) == 0 && (var19[1 + var20][var21 + 2] & 19136992) == 0) {
               Class69.anIntArray838[var33] = var15;
               Class69.anIntArray842[var33] = 1 + var12;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29][var31 + 1] = 4;
               Class69.anIntArrayArray841[var29][var31 + 1] = var16;
            }

            if(var29 > 0 && var31 > 0 && 0 == Class69.anIntArrayArray837[var29 - 1][var31 - 1] && (var19[var20 - 1][var21] & 19136830) == 0 && 0 == (var19[var20 - 1][var21 - 1] & 19136782) && (var19[var20][var21 - 1] & 19136911) == 0) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31 - 1] = 3;
               Class69.anIntArrayArray841[var29 - 1][var31 - 1] = var16;
            }

            if(var29 < 126 && var31 > 0 && 0 == Class69.anIntArrayArray837[1 + var29][var31 - 1] && (var19[var20 + 1][var21 - 1] & 19136911) == 0 && (var19[2 + var20][var21 - 1] & 19136899) == 0 && 0 == (var19[2 + var20][var21] & 19136995)) {
               Class69.anIntArray838[var33] = var15 + 1;
               Class69.anIntArray842[var33] = var12 - 1;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29 + 1][var31 - 1] = 9;
               Class69.anIntArrayArray841[1 + var29][var31 - 1] = var16;
            }

            if(var29 > 0 && var31 < 126 && Class69.anIntArrayArray837[var29 - 1][1 + var31] == 0 && 0 == (var19[var20 - 1][1 + var21] & 19136830) && (var19[var20 - 1][var21 + 2] & 19136824) == 0 && (var19[var20][var21 + 2] & 19137016) == 0) {
               Class69.anIntArray838[var33] = var15 - 1;
               Class69.anIntArray842[var33] = var12 + 1;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29 - 1][var31 + 1] = 6;
               Class69.anIntArrayArray841[var29 - 1][var31 + 1] = var16;
            }

            if(var29 < 126 && var31 < 126 && Class69.anIntArrayArray837[var29 + 1][1 + var31] == 0 && 0 == (var19[1 + var20][var21 + 2] & 19137016) && 0 == (var19[var20 + 2][var21 + 2] & 19136992) && (var19[var20 + 2][var21 + 1] & 19136995) == 0) {
               Class69.anIntArray838[var33] = var15 + 1;
               Class69.anIntArray842[var33] = var12 + 1;
               var33 = 1 + var33 & 4095;
               Class69.anIntArrayArray837[var29 + 1][1 + var31] = 12;
               Class69.anIntArrayArray841[1 + var29][1 + var31] = var16;
            }
         }

         var28 = var30;
      } else {
         var28 = RSImageProducer.method1872(var0, var1, var2, var3, var4, (byte) -56);
      }

      var13 = var0 - 64;
      var15 = var1 - 64;
      var12 = Class69.anInt839 * -676775821;
      var29 = -1224206473 * Class59_Sub1.anInt1833;
      if(!var28) {
         if(!var5) {
            return -1;
         }

         var31 = Integer.MAX_VALUE;
         var11 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.anInt777 * 2014068737;
         var22 = -1876894601 * var3.anInt774;
         int var34 = var3.anInt778 * 1842929661;
         var20 = -564046377 * var3.anInt776;

         for(var21 = var33 - var32; var21 <= var32 + var33; ++var21) {
            for(var16 = var22 - var32; var16 <= var22 + var32; ++var16) {
               int var27 = var21 - var13;
               int var23 = var16 - var15;
               if(var27 >= 0 && var23 >= 0 && var27 < 128 && var23 < 128 && Class69.anIntArrayArray841[var27][var23] < 100) {
                  int var25 = 0;
                  if(var21 < var33) {
                     var25 = var33 - var21;
                  } else if(var21 > var33 + var34 - 1) {
                     var25 = var21 - (var33 + var34 - 1);
                  }

                  int var24 = 0;
                  if(var16 < var22) {
                     var24 = var22 - var16;
                  } else if(var16 > var20 + var22 - 1) {
                     var24 = var16 - (var20 + var22 - 1);
                  }

                  int var26 = var24 * var24 + var25 * var25;
                  if(var26 < var31 || var26 == var31 && Class69.anIntArrayArray841[var27][var23] < var11) {
                     var31 = var26;
                     var11 = Class69.anIntArrayArray841[var27][var23];
                     var12 = var21;
                     var29 = var16;
                  }
               }
            }
         }

         if(Integer.MAX_VALUE == var31) {
            return -1;
         }
      }

      if(var0 == var12 && var29 == var1) {
         return 0;
      } else {
         var14 = 0;
         Class69.anIntArray838[var14] = var12;
         var31 = var14 + 1;
         Class69.anIntArray842[var14] = var29;

         for(var11 = var17 = Class69.anIntArrayArray837[var12 - var13][var29 - var15]; var12 != var0 || var1 != var29; var11 = Class69.anIntArrayArray837[var12 - var13][var29 - var15]) {
            if(var11 != var17) {
               var17 = var11;
               Class69.anIntArray838[var31] = var12;
               Class69.anIntArray842[var31++] = var29;
            }

            if(0 != (var11 & 2)) {
               ++var12;
            } else if((var11 & 8) != 0) {
               --var12;
            }

            if(0 != (var11 & 1)) {
               ++var29;
            } else if(0 != (var11 & 4)) {
               --var29;
            }
         }

         var33 = 0;

         while(var31-- > 0) {
            var6[var33] = Class69.anIntArray838[var31];
            var7[var33++] = Class69.anIntArray842[var31];
            if(var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   static final void method765(int var0, int var1, int var2, int var3, int var4, int var5, GroundController var6, Class58 var7) {
      if(!client.aBool2937 || (aByteArrayArrayArray634[0][var1][var2] & 2) != 0 || (aByteArrayArrayArray634[var0][var1][var2] & 16) == 0) {
         if(var0 < anInt638 * -1263368093) {
            anInt638 = var0 * -241419957;
         }

         ObjectDefinition var8 = Class45.method700(var3, 359750046);
         int var9;
         int var12;
         if(1 != var4 && 3 != var4) {
            var12 = var8.sizeX * 1162660975;
            var9 = -1976023901 * var8.sizeY;
         } else {
            var12 = -1976023901 * var8.sizeY;
            var9 = var8.sizeX * 1162660975;
         }

         int var13;
         int var19;
         if(var12 + var1 <= 104) {
            var13 = (var12 >> 1) + var1;
            var19 = (var12 + 1 >> 1) + var1;
         } else {
            var13 = var1;
            var19 = var1 + 1;
         }

         int var16;
         int var18;
         if(var2 + var9 <= 104) {
            var16 = var2 + (var9 >> 1);
            var18 = (var9 + 1 >> 1) + var2;
         } else {
            var16 = var2;
            var18 = var2 + 1;
         }

         int[][] var17 = anIntArrayArrayArray635[var0];
         int var20 = var17[var13][var18] + var17[var19][var16] + var17[var13][var16] + var17[var19][var18] >> 2;
         int var24 = (var12 << 6) + (var1 << 7);
         int var10 = (var2 << 7) + (var9 << 6);
         int var21 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
         if(var8.anInt2203 * -839074197 == 0) {
            var21 -= Integer.MIN_VALUE;
         }

         int var22 = var5 + (var4 << 6);
         if(547466771 * var8.anInt2229 == 1) {
            var22 += 256;
         }

         int var14;
         int var15;
         if(var8.method2402(2031563592)) {
            Class116_Sub8 var11 = new Class116_Sub8();
            var11.anInt1768 = var0 * 246258815;
            var11.anInt1769 = var1 * -1791242624;
            var11.anInt1770 = 620267648 * var2;
            var14 = 1162660975 * var8.sizeX;
            var15 = -1976023901 * var8.sizeY;
            if(var4 == 1 || 3 == var4) {
               var14 = -1976023901 * var8.sizeY;
               var15 = var8.sizeX * 1162660975;
            }

            var11.anInt1767 = (var14 + var1) * -1461530240;
            var11.anInt1773 = (var2 + var15) * 1218256512;
            var11.anInt1781 = 802663847 * var8.anInt2233;
            var11.anInt1782 = var8.anInt2234 * 401668736;
            var11.anInt1776 = 428311197 * var8.anInt2195;
            var11.anInt1777 = 1108507363 * var8.anInt2236;
            var11.anIntArray1771 = var8.anIntArray2211;
            if(null != var8.anIntArray2206) {
               var11.aClass116_Sub23_Sub3_1784 = var8;
               var11.method1938(-406353621);
            }

            Class116_Sub8.aClass117_1779.method1571(var11);
            if(null != var11.anIntArray1771) {
               var11.anInt1772 = (-1875457101 * var11.anInt1776 + (int)(Math.random() * (double)(var11.anInt1777 * -1201579529 - var11.anInt1776 * -1875457101))) * -2049360189;
            }
         }

         Object var26;
         if(22 == var5) {
            if(!client.aBool2937 || var8.anInt2203 * -839074197 != 0 || -1030255905 * var8.actionCount == 1 || var8.clippingFlag) {
               if(var8.anInt2212 * -100857069 == -1 && null == var8.anIntArray2206) {
                  var26 = var8.method2396(22, var4, var17, var24, var20, var10, 1192024226);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 22, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
               }

               var6.method351(var0, var1, var2, var20, (Animable)var26, var21, var22);
               if(1 == -1030255905 * var8.actionCount && null != var7) {
                  var7.method859(var1, var2, (byte)3);
               }

            }
         } else if(var5 != 10 && 11 != var5) {
            if(var5 >= 12) {
               if(var8.anInt2212 * -100857069 == -1 && var8.anIntArray2206 == null) {
                  var26 = var8.method2396(var5, var4, var17, var24, var20, var10, 1233709458);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
               }

               var6.method355(var0, var1, var2, var20, 1, 1, (Animable)var26, 0, var21, var22);
               if(var5 >= 12 && var5 <= 17 && 13 != var5 && var0 > 0) {
                  anIntArrayArrayArray630[var0][var1][var2] |= 2340;
               }

               if(-1030255905 * var8.actionCount != 0 && var7 != null) {
                  var7.method857(var1, var2, var12, var9, var8.walkable, 1483178392);
               }

            } else if(var5 == 0) {
               if(var8.anInt2212 * -100857069 == -1 && var8.anIntArray2206 == null) {
                  var26 = var8.method2396(0, var4, var17, var24, var20, var10, -588703243);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 0, var4, var0, var1, var2, var8.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var20, (Animable)var26, (Animable)null, anIntArray632[var4], 0, var21, var22);
               if(var4 == 0) {
                  if(var8.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                  }

                  if(var8.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= 585;
                  }
               } else if(1 == var4) {
                  if(var8.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     aByteArrayArrayArray627[var0][1 + var1][1 + var2] = 50;
                  }

                  if(var8.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                  }
               } else if(2 == var4) {
                  if(var8.aBool2220) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                     aByteArrayArrayArray627[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var8.aBool2191) {
                     anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                  }
               } else if(3 == var4) {
                  if(var8.aBool2220) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  }

                  if(var8.aBool2191) {
                     anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                  }
               }

               if(0 != -1030255905 * var8.actionCount && null != var7) {
                  var7.method866(var1, var2, var5, var4, var8.walkable, -1876671473);
               }

               if(16 != var8.anInt2213 * 1063235335) {
                  var6.method361(var0, var1, var2, 1063235335 * var8.anInt2213);
               }

            } else if(1 == var5) {
               if(-1 == -100857069 * var8.anInt2212 && var8.anIntArray2206 == null) {
                  var26 = var8.method2396(1, var4, var17, var24, var20, var10, -1773616414);
               } else {
                  var26 = new Class116_Sub23_Sub16_Sub6(var3, 1, var4, var0, var1, var2, var8.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var20, (Animable)var26, (Animable)null, anIntArray633[var4], 0, var21, var22);
               if(var8.aBool2220) {
                  if(var4 == 0) {
                     aByteArrayArrayArray627[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     aByteArrayArrayArray627[var0][var1 + 1][1 + var2] = 50;
                  } else if(var4 == 2) {
                     aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  } else if(var4 == 3) {
                     aByteArrayArrayArray627[var0][var1][var2] = 50;
                  }
               }

               if(0 != var8.actionCount * -1030255905 && var7 != null) {
                  var7.method866(var1, var2, var5, var4, var8.walkable, -1805219362);
               }

            } else {
               int var27;
               Object var28;
               if(2 == var5) {
                  var27 = var4 + 1 & 3;
                  Object var29;
                  if(-1 == var8.anInt2212 * -100857069 && var8.anIntArray2206 == null) {
                     var29 = var8.method2396(2, 4 + var4, var17, var24, var20, var10, -620192873);
                     var28 = var8.method2396(2, var27, var17, var24, var20, var10, -899679355);
                  } else {
                     var29 = new Class116_Sub23_Sub16_Sub6(var3, 2, var4 + 4, var0, var1, var2, var8.anInt2212 * -100857069, true, (Animable)null);
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 2, var27, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var20, (Animable)var29, (Animable)var28, anIntArray632[var4], anIntArray632[var27], var21, var22);
                  if(var8.aBool2191) {
                     if(0 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= 585;
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                     } else if(var4 == 1) {
                        anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                        anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                     } else if(var4 == 2) {
                        anIntArrayArrayArray630[var0][var1 + 1][var2] |= 585;
                        anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                     } else if(3 == var4) {
                        anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                        anIntArrayArrayArray630[var0][var1][var2] |= 585;
                     }
                  }

                  if(var8.actionCount * -1030255905 != 0 && null != var7) {
                     var7.method866(var1, var2, var5, var4, var8.walkable, -1827292039);
                  }

                  if(var8.anInt2213 * 1063235335 != 16) {
                     var6.method361(var0, var1, var2, 1063235335 * var8.anInt2213);
                  }

               } else if(3 == var5) {
                  if(-1 == var8.anInt2212 * -100857069 && var8.anIntArray2206 == null) {
                     var26 = var8.method2396(3, var4, var17, var24, var20, var10, 1691738950);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 3, var4, var0, var1, var2, var8.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var20, (Animable)var26, (Animable)null, anIntArray633[var4], 0, var21, var22);
                  if(var8.aBool2220) {
                     if(var4 == 0) {
                        aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     } else if(1 == var4) {
                        aByteArrayArrayArray627[var0][1 + var1][var2 + 1] = 50;
                     } else if(2 == var4) {
                        aByteArrayArrayArray627[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        aByteArrayArrayArray627[var0][var1][var2] = 50;
                     }
                  }

                  if(-1030255905 * var8.actionCount != 0 && var7 != null) {
                     var7.method866(var1, var2, var5, var4, var8.walkable, -1800345491);
                  }

               } else if(var5 == 9) {
                  if(var8.anInt2212 * -100857069 == -1 && var8.anIntArray2206 == null) {
                     var26 = var8.method2396(var5, var4, var17, var24, var20, var10, 632244916);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method355(var0, var1, var2, var20, 1, 1, (Animable)var26, 0, var21, var22);
                  if(-1030255905 * var8.actionCount != 0 && var7 != null) {
                     var7.method857(var1, var2, var12, var9, var8.walkable, 1483178392);
                  }

                  if(16 != 1063235335 * var8.anInt2213) {
                     var6.method361(var0, var1, var2, var8.anInt2213 * 1063235335);
                  }

               } else if(4 == var5) {
                  if(-100857069 * var8.anInt2212 == -1 && null == var8.anIntArray2206) {
                     var26 = var8.method2396(4, var4, var17, var24, var20, var10, 740963021);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var20, (Animable)var26, (Animable)null, anIntArray632[var4], 0, 0, 0, var21, var22);
               } else if(5 == var5) {
                  var27 = 16;
                  var14 = var6.method452(var0, var1, var2);
                  if(0 != var14) {
                     var27 = Class45.method700(var14 >> 14 & 32767, 359750046).anInt2213 * 1063235335;
                  }

                  if(-1 == var8.anInt2212 * -100857069 && null == var8.anIntArray2206) {
                     var28 = var8.method2396(4, var4, var17, var24, var20, var10, -1730499852);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var20, (Animable)var28, (Animable)null, anIntArray632[var4], 0, anIntArray623[var4] * var27, anIntArray636[var4] * var27, var21, var22);
               } else if(var5 == 6) {
                  var27 = 8;
                  var14 = var6.method452(var0, var1, var2);
                  if(var14 != 0) {
                     var27 = Class45.method700(var14 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  if(-1 == -100857069 * var8.anInt2212 && var8.anIntArray2206 == null) {
                     var28 = var8.method2396(4, var4 + 4, var17, var24, var20, var10, 905351732);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var20, (Animable)var28, (Animable)null, 256, var4, var27 * anIntArray640[var4], var27 * anIntArray637[var4], var21, var22);
               } else if(var5 == 7) {
                  var14 = 2 + var4 & 3;
                  if(var8.anInt2212 * -100857069 == -1 && var8.anIntArray2206 == null) {
                     var26 = var8.method2396(4, 4 + var14, var17, var24, var20, var10, -2140889554);
                  } else {
                     var26 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var14, var0, var1, var2, var8.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var20, (Animable)var26, (Animable)null, 256, var14, 0, 0, var21, var22);
               } else if(8 == var5) {
                  var27 = 8;
                  var14 = var6.method452(var0, var1, var2);
                  if(var14 != 0) {
                     var27 = Class45.method700(var14 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  int var25 = var4 + 2 & 3;
                  Object var30;
                  if(var8.anInt2212 * -100857069 == -1 && var8.anIntArray2206 == null) {
                     var28 = var8.method2396(4, 4 + var4, var17, var24, var20, var10, 1864063558);
                     var30 = var8.method2396(4, var25 + 4, var17, var24, var20, var10, 1384096442);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4 + 4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                     var30 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var25, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var20, (Animable)var28, (Animable)var30, 256, var4, anIntArray640[var4] * var27, var27 * anIntArray637[var4], var21, var22);
               }
            }
         } else {
            if(-1 == -100857069 * var8.anInt2212 && var8.anIntArray2206 == null) {
               var26 = var8.method2396(10, var4, var17, var24, var20, var10, 1315103036);
            } else {
               var26 = new Class116_Sub23_Sub16_Sub6(var3, 10, var4, var0, var1, var2, -100857069 * var8.anInt2212, true, (Animable)null);
            }

            if(null != var26 && var6.method355(var0, var1, var2, var20, var12, var9, (Animable)var26, var5 == 11?256:0, var21, var22) && var8.aBool2220) {
               var14 = 15;
               if(var26 instanceof SpotAnim) {
                  var14 = ((SpotAnim)var26).method3375() / 4;
                  if(var14 > 30) {
                     var14 = 30;
                  }
               }

               for(var15 = 0; var15 <= var12; ++var15) {
                  for(int var23 = 0; var23 <= var9; ++var23) {
                     if(var14 > aByteArrayArrayArray627[var0][var15 + var1][var23 + var2]) {
                        aByteArrayArrayArray627[var0][var1 + var15][var2 + var23] = (byte)var14;
                     }
                  }
               }
            }

            if(0 != var8.actionCount * -1030255905 && var7 != null) {
               var7.method857(var1, var2, var12, var9, var8.walkable, 1483178392);
            }

         }
      }
   }

   static final void method766(MobDefinition var0, int var1, int var2, int var3, byte var4) {
      if(client.anInt3075 * 1768430155 < 400) {
         if(null != var0.anIntArray2313) {
            var0 = var0.method2546(-572852130);
         }

         if(null != var0) {
            if(var0.aBool2337) {
               if(!var0.aBool2339 || -1668103725 * client.anInt3101 == var1) {
                  String var7 = var0.name;
                  if(0 != 802957015 * var0.anInt2326) {
                     var7 = var7 + Class67.method976(802957015 * var0.anInt2326, 1614853309 * Class79.aPlayer_909.anInt2908, 706221228) + " " + Class41.aString540 + Class91.aString1203 + var0.anInt2326 * 802957015 + Class41.aString543;
                  }

                  if(1 == client.anInt2991 * -1110581093) {
                     Class50.method776(Class91.aString1197, client.aString3201 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16776960, (byte)105) + var7, 7, var1, var2, var3, (byte)-80);
                  } else if(client.aBool3088) {
                     if((Class38.anInt500 * 2016481409 & 2) == 2) {
                        Class50.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16776960, (byte)42) + var7, 8, var1, var2, var3, (byte)-7);
                     }
                  } else {
                     String[] var5 = var0.aStringArray2324;
                     if(client.aBool3104) {
                        var5 = Canvas_Sub1.method2978(var5, -1697124208);
                     }

                     int var6;
                     if(var5 != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(null != var5[var6] && !var5[var6].equalsIgnoreCase(Class91.aString1316)) {
                              byte var8 = 0;
                              if(0 == var6) {
                                 var8 = 9;
                              }

                              if(var6 == 1) {
                                 var8 = 10;
                              }

                              if(var6 == 2) {
                                 var8 = 11;
                              }

                              if(3 == var6) {
                                 var8 = 12;
                              }

                              if(4 == var6) {
                                 var8 = 13;
                              }

                              Class50.method776(var5[var6], Class59_Sub1.method1978(16776960, (byte)59) + var7, var8, var1, var2, var3, (byte)-110);
                           }
                        }
                     }

                     if(null != var5) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(var5[var6] != null && var5[var6].equalsIgnoreCase(Class91.aString1316)) {
                              short var10 = 0;
                              if(Class43.aClass43_577 != client.aClass43_3169) {
                                 if(client.aClass43_3169 == Class43.aClass43_576 || Class43.aClass43_581 == client.aClass43_3169 && var0.anInt2326 * 802957015 > Class79.aPlayer_909.anInt2908 * 1614853309) {
                                    var10 = 2000;
                                 }

                                 int var9 = 0;
                                 if(0 == var6) {
                                    var9 = 9 + var10;
                                 }

                                 if(1 == var6) {
                                    var9 = var10 + 10;
                                 }

                                 if(var6 == 2) {
                                    var9 = var10 + 11;
                                 }

                                 if(var6 == 3) {
                                    var9 = 12 + var10;
                                 }

                                 if(4 == var6) {
                                    var9 = var10 + 13;
                                 }

                                 Class50.method776(var5[var6], Class59_Sub1.method1978(16776960, (byte)125) + var7, var9, var1, var2, var3, (byte)-51);
                              }
                           }
                        }
                     }

                     Class50.method776(Class91.aString1198, Class59_Sub1.method1978(16776960, (byte)109) + var7, 1003, var1, var2, var3, (byte)-78);
                  }

               }
            }
         }
      }
   }

   Class47() throws Throwable {
      throw new Error();
   }

   static void method767(int var0) {
      for(Class116_Sub8 var1 = (Class116_Sub8)Class116_Sub8.aClass117_1779.method1551(); var1 != null; var1 = (Class116_Sub8)Class116_Sub8.aClass117_1779.method1553()) {
         if(var1.aClass116_Sub23_Sub3_1784 != null) {
            var1.method1938(-61806771);
         }
      }

   }

   static void method768(Class99_Sub1 var0, int var1, int var2, int var3, byte var4, boolean var5, int var6) {
      long var7 = (long)(var2 + (var1 << 16));
      Class116_Sub23_Sub21 var9 = (Class116_Sub23_Sub21)Class93.aClass127_1357.method1658(var7);
      if(var9 == null) {
         var9 = (Class116_Sub23_Sub21)Class93.aClass127_1352.method1658(var7);
         if(null == var9) {
            var9 = (Class116_Sub23_Sub21)Class93.aClass127_1343.method1658(var7);
            if(var9 != null) {
               if(var5) {
                  var9.unlinkContainer();
                  Class93.aClass127_1357.method1666(var9, var7);
                  Class93.anInt1344 -= 556834453;
                  Class93.anInt1339 += -1554399579;
               }

            } else {
               if(!var5) {
                  var9 = (Class116_Sub23_Sub21)Class93.aClass127_1345.method1658(var7);
                  if(var9 != null) {
                     return;
                  }
               }

               var9 = new Class116_Sub23_Sub21();
               var9.aClass99_Sub1_2523 = var0;
               var9.anInt2525 = -1759629139 * var3;
               var9.aByte2524 = var4;
               if(var5) {
                  Class93.aClass127_1357.method1666(var9, var7);
                  Class93.anInt1339 += -1554399579;
               } else {
                  Class93.aClass121_1342.method1620(var9);
                  Class93.aClass127_1343.method1666(var9, var7);
                  Class93.anInt1344 += 556834453;
               }

            }
         }
      }
   }

   static Class116_Sub23_Sub18 method769(int var0, int var1) {
      Class116_Sub23_Sub18 var2 = (Class116_Sub23_Sub18)Class116_Sub23_Sub18.aClass123_2488.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var5 = Class116_Sub23_Sub6.aClass99_Sub1_2279.method1394(var0, 0, -1124281660);
         if(var5 == null) {
            return null;
         } else {
            var2 = new Class116_Sub23_Sub18();
            Buffer var3 = new Buffer(var5);
            var3.position = -184175589 * (var3.payload.length - 12);
            int var7 = var3.readInt(-1895777063);
            var2.anInt2475 = var3.readShort(33220628) * 2055457427;
            var2.anInt2479 = var3.readShort(2016090960) * 1720774461;
            var2.anInt2480 = var3.readShort(1018692331) * -1455792945;
            var2.anInt2491 = var3.readShort(667991141) * -144149209;
            var3.position = 0;
            var3.method2011(-2112693806);
            var2.anIntArray2474 = new int[var7];
            var2.anIntArray2482 = new int[var7];
            var2.aStringArray2477 = new String[var7];

            int var4;
            for(int var6 = 0; var3.position * 314639891 < var3.payload.length - 12; var2.anIntArray2474[var6++] = var4) {
               var4 = var3.readShort(-240945141);
               if(var4 == 3) {
                  var2.aStringArray2477[var6] = var3.readString(61376769);
               } else if(var4 < 100 && var4 != 21 && 38 != var4 && var4 != 39) {
                  var2.anIntArray2482[var6] = var3.readInt(-1949468257);
               } else {
                  var2.anIntArray2482[var6] = var3.readSignedByte(1708176767);
               }
            }

            Class116_Sub23_Sub18.aClass123_2488.method1633(var2, (long)var0);
            return var2;
         }
      }
   }

   static final void method770(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            anIntArrayArrayArray635[var0][var3 + var1][var2 + var4] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1][var3 + var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 + var3];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            anIntArrayArrayArray635[var0][var1 + var3][var2] = anIntArrayArrayArray635[var0][var3 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         anIntArrayArrayArray635[var0][var1][var2] = anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }
}
