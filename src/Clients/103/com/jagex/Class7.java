package com.jagex;

public class Class7 {

	public static final int anInt115 = 122;
	public static final int anInt120 = 7;
	static final int anInt112 = 48;
	static final int anInt114 = 1;
	static final int anInt116 = 2;
   static int[] anIntArray102 = new int[2048];
   static int[] anIntArray103 = new int[2048];
   static byte[] gpiPlayerFlag = new byte[2048];
   static byte[] aByteArray105 = new byte[2048];
   static Buffer[] aClass116_Sub14Array106 = new Buffer[2048];
   static int anInt107 = 0;
   static int[] anIntArray108 = new int[2048];
   static int anInt109 = 0;
   static int[] playerIndexes = new int[2048];
   static int[] anIntArray111 = new int[2048];
   static Buffer aClass116_Sub14_113 = new Buffer(new byte[5000]);
   static int anInt117;
   static int anInt118 = 0;
   static int[] anIntArray119 = new int[2048];


	Class7() throws Throwable {
		throw new Error();
	}

   static boolean method95(BitBuffer var0, int var1) {
      int var2 = var0.readBits(2, (byte) -1);
      int var3;
      int var4;
      int var6;
      int var7;
      int var8;
      int var10;
      if(0 == var2) {
         if(var0.readBits(1, (byte) -1) != 0) {
            Class4.updateGlobalPlayer(var0, var1, (byte) 0);
         }

         var10 = var0.readBits(6, (byte) -1);
         var8 = var0.readBits(6, (byte) -1);
         boolean var12 = var0.readBits(1, (byte) -1) == 1;
         if(var12) {
            anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
         }

         if(null != client.globalPlayers[var1]) {
            throw new RuntimeException();
         } else {
            Player var11 = client.globalPlayers[var1] = new Player();
            var11.anInt2902 = var1 * -1055985261;
            if(aClass116_Sub14Array106[var1] != null) {
               var11.method3549(aClass116_Sub14Array106[var1], 809263108);
            }

	         var11.faceDir1 = anIntArray103[var1] * 736533899;
	         var11.anInt2603 = anIntArray102[var1] * 1611414733;
	         var6 = anIntArray111[var1];
            var3 = var6 >> 28;
            var4 = var6 >> 14 & 255;
            var7 = var6 & 255;
            var11.aByteArray2628[0] = aByteArray105[var1];
            var11.anInt2906 = -1668953739 * (byte)var3;
	         var11.method3551(var10 + (var4 << 6) - 1426698711 * Class116_Sub17.clickX, var8 + (var7 << 6) - 714823515 * Class33.clickY, 803918560);
	         var11.aBool2901 = false;
	         return true;
         }
      } else if(var2 == 1) {
         var10 = var0.readBits(2, (byte) -1);
         var8 = anIntArray111[var1];
         anIntArray111[var1] = (var8 & 268435455) + (((var8 >> 28) + var10 & 3) << 28);
         return false;
      } else {
         int var5;
         int var9;
         if(2 == var2) {
            var10 = var0.readBits(5, (byte) -1);
            var8 = var10 >> 3;
            var9 = var10 & 7;
            var5 = anIntArray111[var1];
            var6 = (var5 >> 28) + var8 & 3;
            var3 = var5 >> 14 & 255;
            var4 = var5 & 255;
            if(0 == var9) {
               --var3;
               --var4;
            }

            if(1 == var9) {
               --var4;
            }

            if(2 == var9) {
               ++var3;
               --var4;
            }

            if(3 == var9) {
               --var3;
            }

            if(4 == var9) {
               ++var3;
            }

            if(5 == var9) {
               --var3;
               ++var4;
            }

            if(6 == var9) {
               ++var4;
            }

            if(var9 == 7) {
               ++var3;
               ++var4;
            }

            anIntArray111[var1] = (var3 << 14) + (var6 << 28) + var4;
            return false;
         } else {
            var10 = var0.readBits(18, (byte) -1);
            var8 = var10 >> 16;
            var9 = var10 >> 8 & 255;
            var5 = var10 & 255;
            var6 = anIntArray111[var1];
            var3 = (var6 >> 28) + var8 & 3;
            var4 = (var6 >> 14) + var9 & 255;
            var7 = var5 + var6 & 255;
            anIntArray111[var1] = var7 + (var4 << 14) + (var3 << 28);
            return false;
         }
      }
   }

   static void method97(BitBuffer var0, int var1) {
      boolean var4 = var0.readBits(1, (byte) -1) == 1;
      if(var4) {
         anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
      }

      int var6 = var0.readBits(2, (byte) -1);
      Player var3 = client.globalPlayers[var1];
      if(0 == var6) {
         if(var4) {
            var3.aBool2901 = false;
         } else if(client.playerIndex * 1467227105 == var1) {
            throw new RuntimeException();
         } else {
	         anIntArray111[var1] = (var3.anInt2906 * -1522270499 << 28) + (1426698711 * Class116_Sub17.clickX + var3.xMovementSteps[0] >> 6 << 14) + (Class33.clickY * 714823515 + var3.yMovementSteps[0] >> 6);
	         if (-1 != var3.faceDirection * -744366479) {
		         anIntArray103[var1] = var3.faceDirection * -744366479;
	         } else {
		         anIntArray103[var1] = -2061229533 * var3.faceDir1;
	         }

            anIntArray102[var1] = var3.anInt2603 * 734924805;
            client.globalPlayers[var1] = null;
            if(var0.readBits(1, (byte) -1) != 0) {
               Class4.updateGlobalPlayer(var0, var1, (byte) 0);
            }

         }
      } else {
         int var2;
         int var5;
         int var7;
         if(1 == var6) {
            var5 = var0.readBits(3, (byte) -1);
            var7 = var3.xMovementSteps[0];
            var2 = var3.yMovementSteps[0];
            if(0 == var5) {
               --var7;
               --var2;
            } else if(var5 == 1) {
               --var2;
            } else if(2 == var5) {
               ++var7;
               --var2;
            } else if(var5 == 3) {
               --var7;
            } else if(var5 == 4) {
               ++var7;
            } else if(var5 == 5) {
               --var7;
               ++var2;
            } else if(6 == var5) {
               ++var2;
            } else if(var5 == 7) {
               ++var7;
               ++var2;
            }

            if(var1 == 1467227105 * client.playerIndex && (var3.anInt2609 * 1272643751 < 1536 || var3.anInt2579 * -1801433343 < 1536 || var3.anInt2609 * 1272643751 >= 11776 || var3.anInt2579 * -1801433343 >= 11776)) {
               var3.method3551(var7, var2, -112067648);
               var3.aBool2901 = false;
            } else if(var4) {
               var3.aBool2901 = true;
               var3.anInt2904 = -37570689 * var7;
               var3.anInt2905 = var2 * 1026931509;
            } else {
               var3.aBool2901 = false;
               var3.method3553(var7, var2, aByteArray105[var1], -896125734);
            }

         } else if(2 == var6) {
            var5 = var0.readBits(4, (byte) -1);
            var7 = var3.xMovementSteps[0];
            var2 = var3.yMovementSteps[0];
            if(var5 == 0) {
               var7 -= 2;
               var2 -= 2;
            } else if(var5 == 1) {
               --var7;
               var2 -= 2;
            } else if(var5 == 2) {
               var2 -= 2;
            } else if(3 == var5) {
               ++var7;
               var2 -= 2;
            } else if(var5 == 4) {
               var7 += 2;
               var2 -= 2;
            } else if(5 == var5) {
               var7 -= 2;
               --var2;
            } else if(6 == var5) {
               var7 += 2;
               --var2;
            } else if(7 == var5) {
               var7 -= 2;
            } else if(var5 == 8) {
               var7 += 2;
            } else if(var5 == 9) {
               var7 -= 2;
               ++var2;
            } else if(10 == var5) {
               var7 += 2;
               ++var2;
            } else if(11 == var5) {
               var7 -= 2;
               var2 += 2;
            } else if(var5 == 12) {
               --var7;
               var2 += 2;
            } else if(var5 == 13) {
               var2 += 2;
            } else if(var5 == 14) {
               ++var7;
               var2 += 2;
            } else if(15 == var5) {
               var7 += 2;
               var2 += 2;
            }

            if(client.playerIndex * 1467227105 == var1 && (1272643751 * var3.anInt2609 < 1536 || -1801433343 * var3.anInt2579 < 1536 || var3.anInt2609 * 1272643751 >= 11776 || var3.anInt2579 * -1801433343 >= 11776)) {
               var3.method3551(var7, var2, 1584687101);
               var3.aBool2901 = false;
            } else if(var4) {
               var3.aBool2901 = true;
               var3.anInt2904 = var7 * -37570689;
               var3.anInt2905 = var2 * 1026931509;
            } else {
               var3.aBool2901 = false;
               var3.method3553(var7, var2, aByteArray105[var1], -1431456783);
            }

         } else {
            var5 = var0.readBits(1, (byte) -1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var7 = var0.readBits(12, (byte) -1);
               var2 = var7 >> 10;
               var8 = var7 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var10 = var7 & 31;
               if(var10 > 15) {
                  var10 -= 32;
               }

               var9 = var3.xMovementSteps[0] + var8;
               var11 = var3.yMovementSteps[0] + var10;
               if(var1 == client.playerIndex * 1467227105 && (var3.anInt2609 * 1272643751 < 1536 || var3.anInt2579 * -1801433343 < 1536 || 1272643751 * var3.anInt2609 >= 11776 || -1801433343 * var3.anInt2579 >= 11776)) {
                  var3.method3551(var9, var11, 1886690085);
                  var3.aBool2901 = false;
               } else if(var4) {
                  var3.aBool2901 = true;
                  var3.anInt2904 = -37570689 * var9;
                  var3.anInt2905 = var11 * 1026931509;
               } else {
                  var3.aBool2901 = false;
                  var3.method3553(var9, var11, aByteArray105[var1], -1431411747);
               }

               var3.anInt2906 = (byte)(-1522270499 * var3.anInt2906 + var2 & 3) * -1668953739;
               if(var1 == 1467227105 * client.playerIndex) {
                  Class116_Sub11.anInt1819 = var3.anInt2906 * -1941196453;
               }

            } else {
               var7 = var0.readBits(30, (byte) -1);
               var2 = var7 >> 28;
               var8 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
	            var9 = (var8 + Class116_Sub17.clickX * 1426698711 + var3.xMovementSteps[0] & 16383) - 1426698711 * Class116_Sub17.clickX;
	            var11 = (var10 + Class33.clickY * 714823515 + var3.yMovementSteps[0] & 16383) - 714823515 * Class33.clickY;
	            if (1467227105 * client.playerIndex == var1 && (1272643751 * var3.anInt2609 < 1536 || -1801433343 * var3.anInt2579 < 1536 || 1272643751 * var3.anInt2609 >= 11776 || var3.anInt2579 * -1801433343 >= 11776)) {
		            var3.method3551(var9, var11, 1221991878);
                  var3.aBool2901 = false;
               } else if(var4) {
                  var3.aBool2901 = true;
                  var3.anInt2904 = var9 * -37570689;
                  var3.anInt2905 = var11 * 1026931509;
               } else {
                  var3.aBool2901 = false;
                  var3.method3553(var9, var11, aByteArray105[var1], -1583357455);
               }

               var3.anInt2906 = -1668953739 * (byte)(var2 + -1522270499 * var3.anInt2906 & 3);
               if(client.playerIndex * 1467227105 == var1) {
                  Class116_Sub11.anInt1819 = -1941196453 * var3.anInt2906;
               }

            }
         }
      }
   }

   static boolean method100(BitBuffer var0, int var1) {
      int var2 = var0.readBits(2, (byte) -1);
      int var3;
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      if(0 == var2) {
         if(var0.readBits(1, (byte) -1) != 0) {
            Class4.updateGlobalPlayer(var0, var1, (byte) 0);
         }

         var4 = var0.readBits(6, (byte) -1);
         var3 = var0.readBits(6, (byte) -1);
         boolean var11 = var0.readBits(1, (byte) -1) == 1;
         if(var11) {
            anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
         }

         if(null != client.globalPlayers[var1]) {
            throw new RuntimeException();
         } else {
            Player var12 = client.globalPlayers[var1] = new Player();
            var12.anInt2902 = var1 * -1055985261;
            if(aClass116_Sub14Array106[var1] != null) {
               var12.method3549(aClass116_Sub14Array106[var1], -1775626165);
            }

	         var12.faceDir1 = anIntArray103[var1] * 773415966;
	         var12.anInt2603 = anIntArray102[var1] * 1611414733;
	         var9 = anIntArray111[var1];
            var5 = var9 >> 28;
            var8 = var9 >> 14 & 255;
            var10 = var9 & 255;
            var12.aByteArray2628[0] = aByteArray105[var1];
            var12.anInt2906 = -1668953739 * (byte)var5;
	         var12.method3551(var4 + (var8 << 6) - -1604897984 * Class116_Sub17.clickX, var3 + (var10 << 6) - 714823515 * Class33.clickY, -184696511);
	         var12.aBool2901 = false;
	         return true;
         }
      } else if(var2 == 1) {
         var4 = var0.readBits(2, (byte) -1);
         var3 = anIntArray111[var1];
         anIntArray111[var1] = (var3 & -1203188277) + (((var3 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if(2 == var2) {
            var4 = var0.readBits(5, (byte) -1);
            var3 = var4 >> 3;
            var6 = var4 & 7;
            var7 = anIntArray111[var1];
            var9 = (var7 >> 28) + var3 & 3;
            var5 = var7 >> 14 & 255;
            var8 = var7 & -1747372652;
            if(0 == var6) {
               --var5;
               --var8;
            }

            if(1 == var6) {
               --var8;
            }

            if(2 == var6) {
               ++var5;
               --var8;
            }

            if(3 == var6) {
               --var5;
            }

            if(4 == var6) {
               ++var5;
            }

            if(5 == var6) {
               --var5;
               ++var8;
            }

            if(6 == var6) {
               ++var8;
            }

            if(var6 == 7) {
               ++var5;
               ++var8;
            }

            anIntArray111[var1] = (var5 << 14) + (var9 << 28) + var8;
            return false;
         } else {
            var4 = var0.readBits(18, (byte) -1);
            var3 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 323432498;
            var9 = anIntArray111[var1];
            var5 = (var9 >> 28) + var3 & 3;
            var8 = (var9 >> 14) + var6 & 255;
            var10 = var7 + var9 & -306478437;
            anIntArray111[var1] = var10 + (var8 << 14) + (var5 << 28);
            return false;
         }
      }
   }

   static final void method101(BitBuffer var0) {
      var0.resetBitPos((byte) 29);
      int var1 = 1467227105 * client.playerIndex;
      Player var2 = Class79.aPlayer_909 = client.globalPlayers[var1] = new Player();
      var2.anInt2902 = -1055985261 * var1;
      int var4 = var0.readBits(30, (byte) -1);
      byte var7 = (byte)(var4 >> 28);
      int var5 = var4 >> 14 & 16383;
      int var6 = var4 & 16383;
	   var2.xMovementSteps[0] = var5 - 1426698711 * Class116_Sub17.clickX;
	   var2.anInt2609 = ((var2.xMovementSteps[0] << 7) + (var2.method3561(177974473) << 6)) * 1705682711;
	   var2.yMovementSteps[0] = var6 - Class33.clickY * 714823515;
	   var2.anInt2579 = ((var2.yMovementSteps[0] << 7) + (var2.method3561(-804141590) << 6)) * 1421914369;
	   Class116_Sub11.anInt1819 = (var2.anInt2906 = var7 * -1668953739) * -1941196453;
      if(null != aClass116_Sub14Array106[var1]) {
         var2.method3549(aClass116_Sub14Array106[var1], -186092350);
      }

      anInt107 = 0;
      anIntArray108[(anInt107 += -864270383) * -334270159 - 1] = var1;
      gpiPlayerFlag[var1] = 0;
      anInt109 = 0;

      for(int var3 = 1; var3 < 2048; ++var3) {
         if(var3 != var1) {
            int var8 = var0.readBits(18, (byte) -1);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            anIntArray111[var3] = (var9 << 28) + (var10 << 14) + var11;
            anIntArray103[var3] = 0;
            anIntArray102[var3] = -1;
            playerIndexes[(anInt109 += 2065293525) * 1824807037 - 1] = var3;
            gpiPlayerFlag[var3] = 0;
         }
      }

      var0.startBitAccess((byte) 123);
   }

   static int method102(BitBuffer var0) {
      int var1 = var0.readBits(2, (byte) -1);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(1 == var1) {
         var2 = var0.readBits(5, (byte) -1);
      } else if(2 == var1) {
         var2 = var0.readBits(8, (byte) -1);
      } else {
         var2 = var0.readBits(11, (byte) -1);
      }

      return var2;
   }

   static int method103(BitBuffer var0) {
      int var1 = var0.readBits(2, (byte) -1);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(1 == var1) {
         var2 = var0.readBits(5, (byte) -1);
      } else if(2 == var1) {
         var2 = var0.readBits(8, (byte) -1);
      } else {
         var2 = var0.readBits(11, (byte) -1);
      }

      return var2;
   }

   static void method105(BitBuffer var0, int var1) {
      boolean var6 = var0.readBits(1, (byte) -1) == 1;
      if(var6) {
         anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
      }

      int var7 = var0.readBits(2, (byte) -1);
      Player var2 = client.globalPlayers[var1];
      if(0 == var7) {
         if(var6) {
            var2.aBool2901 = false;
         } else if(client.playerIndex * 1467227105 == var1) {
            throw new RuntimeException();
         } else {
	         anIntArray111[var1] = (var2.anInt2906 * -1522270499 << 28) + (1426698711 * Class116_Sub17.clickX + var2.xMovementSteps[0] >> 6 << 14) + (Class33.clickY * 714823515 + var2.yMovementSteps[0] >> 6);
	         if (-1 != var2.faceDirection * -744366479) {
		         anIntArray103[var1] = var2.faceDirection * -744366479;
	         } else {
		         anIntArray103[var1] = -2061229533 * var2.faceDir1;
	         }

            anIntArray102[var1] = var2.anInt2603 * 734924805;
            client.globalPlayers[var1] = null;
            if(var0.readBits(1, (byte) -1) != 0) {
               Class4.updateGlobalPlayer(var0, var1, (byte) 0);
            }

         }
      } else {
         int var5;
         int var8;
         int var9;
         if(1 == var7) {
            var5 = var0.readBits(3, (byte) -1);
            var8 = var2.xMovementSteps[0];
            var9 = var2.yMovementSteps[0];
            if(0 == var5) {
               --var8;
               --var9;
            } else if(var5 == 1) {
               --var9;
            } else if(2 == var5) {
               ++var8;
               --var9;
            } else if(var5 == 3) {
               --var8;
            } else if(var5 == 4) {
               ++var8;
            } else if(var5 == 5) {
               --var8;
               ++var9;
            } else if(6 == var5) {
               ++var9;
            } else if(var5 == 7) {
               ++var8;
               ++var9;
            }

            if(var1 == 1467227105 * client.playerIndex && (var2.anInt2609 * 1272643751 < 1536 || var2.anInt2579 * -1801433343 < 1536 || var2.anInt2609 * 1272643751 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
               var2.method3551(var8, var9, 608386838);
               var2.aBool2901 = false;
            } else if(var6) {
               var2.aBool2901 = true;
               var2.anInt2904 = -37570689 * var8;
               var2.anInt2905 = var9 * 1026931509;
            } else {
               var2.aBool2901 = false;
               var2.method3553(var8, var9, aByteArray105[var1], -1356777572);
            }

         } else if(2 == var7) {
            var5 = var0.readBits(4, (byte) -1);
            var8 = var2.xMovementSteps[0];
            var9 = var2.yMovementSteps[0];
            if(var5 == 0) {
               var8 -= 2;
               var9 -= 2;
            } else if(var5 == 1) {
               --var8;
               var9 -= 2;
            } else if(var5 == 2) {
               var9 -= 2;
            } else if(3 == var5) {
               ++var8;
               var9 -= 2;
            } else if(var5 == 4) {
               var8 += 2;
               var9 -= 2;
            } else if(5 == var5) {
               var8 -= 2;
               --var9;
            } else if(6 == var5) {
               var8 += 2;
               --var9;
            } else if(7 == var5) {
               var8 -= 2;
            } else if(var5 == 8) {
               var8 += 2;
            } else if(var5 == 9) {
               var8 -= 2;
               ++var9;
            } else if(10 == var5) {
               var8 += 2;
               ++var9;
            } else if(11 == var5) {
               var8 -= 2;
               var9 += 2;
            } else if(var5 == 12) {
               --var8;
               var9 += 2;
            } else if(var5 == 13) {
               var9 += 2;
            } else if(var5 == 14) {
               ++var8;
               var9 += 2;
            } else if(15 == var5) {
               var8 += 2;
               var9 += 2;
            }

            if(client.playerIndex * 1467227105 == var1 && (1272643751 * var2.anInt2609 < 1536 || -1801433343 * var2.anInt2579 < 1536 || var2.anInt2609 * 1272643751 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
               var2.method3551(var8, var9, -559570933);
               var2.aBool2901 = false;
            } else if(var6) {
               var2.aBool2901 = true;
               var2.anInt2904 = var8 * -37570689;
               var2.anInt2905 = var9 * 1026931509;
            } else {
               var2.aBool2901 = false;
               var2.method3553(var8, var9, aByteArray105[var1], 1813015370);
            }

         } else {
            var5 = var0.readBits(1, (byte) -1);
            int var3;
            int var4;
            int var10;
            int var11;
            if(var5 == 0) {
               var8 = var0.readBits(12, (byte) -1);
               var9 = var8 >> 10;
               var11 = var8 >> 5 & 31;
               if(var11 > 15) {
                  var11 -= 32;
               }

               var10 = var8 & 31;
               if(var10 > 15) {
                  var10 -= 32;
               }

               var3 = var2.xMovementSteps[0] + var11;
               var4 = var2.yMovementSteps[0] + var10;
               if(var1 == client.playerIndex * 1467227105 && (var2.anInt2609 * 1272643751 < 1536 || var2.anInt2579 * -1801433343 < 1536 || 1272643751 * var2.anInt2609 >= 11776 || -1801433343 * var2.anInt2579 >= 11776)) {
                  var2.method3551(var3, var4, 1745659981);
                  var2.aBool2901 = false;
               } else if(var6) {
                  var2.aBool2901 = true;
                  var2.anInt2904 = -37570689 * var3;
                  var2.anInt2905 = var4 * 1026931509;
               } else {
                  var2.aBool2901 = false;
                  var2.method3553(var3, var4, aByteArray105[var1], -1762019082);
               }

               var2.anInt2906 = (byte)(-1522270499 * var2.anInt2906 + var9 & 3) * -1668953739;
               if(var1 == 1467227105 * client.playerIndex) {
                  Class116_Sub11.anInt1819 = var2.anInt2906 * -1941196453;
               }

            } else {
               var8 = var0.readBits(30, (byte) -1);
               var9 = var8 >> 28;
               var11 = var8 >> 14 & 16383;
               var10 = var8 & 16383;
	            var3 = (var11 + Class116_Sub17.clickX * 1426698711 + var2.xMovementSteps[0] & 16383) - 1426698711 * Class116_Sub17.clickX;
	            var4 = (var10 + Class33.clickY * 714823515 + var2.yMovementSteps[0] & 16383) - 714823515 * Class33.clickY;
	            if (1467227105 * client.playerIndex == var1 && (1272643751 * var2.anInt2609 < 1536 || -1801433343 * var2.anInt2579 < 1536 || 1272643751 * var2.anInt2609 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
		            var2.method3551(var3, var4, 2071302157);
                  var2.aBool2901 = false;
               } else if(var6) {
                  var2.aBool2901 = true;
                  var2.anInt2904 = var3 * -37570689;
                  var2.anInt2905 = var4 * 1026931509;
               } else {
                  var2.aBool2901 = false;
                  var2.method3553(var3, var4, aByteArray105[var1], 113772332);
               }

               var2.anInt2906 = -1668953739 * (byte)(var9 + -1522270499 * var2.anInt2906 & 3);
               if(client.playerIndex * 1467227105 == var1) {
                  Class116_Sub11.anInt1819 = -1941196453 * var2.anInt2906;
               }

            }
         }
      }
   }

   static void method106(BitBuffer var0, int var1) {
      boolean var5 = var0.readBits(1, (byte) -1) == 1;
      if(var5) {
         anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
      }

      int var6 = var0.readBits(2, (byte) -1);
      Player var2 = client.globalPlayers[var1];
      if(0 == var6) {
         if(var5) {
            var2.aBool2901 = false;
         } else if(client.playerIndex * 1467227105 == var1) {
            throw new RuntimeException();
         } else {
	         anIntArray111[var1] = (var2.anInt2906 * -1522270499 << 28) + (1426698711 * Class116_Sub17.clickX + var2.xMovementSteps[0] >> 6 << 14) + (Class33.clickY * 714823515 + var2.yMovementSteps[0] >> 6);
	         if (-1 != var2.faceDirection * -744366479) {
		         anIntArray103[var1] = var2.faceDirection * -744366479;
	         } else {
		         anIntArray103[var1] = -2061229533 * var2.faceDir1;
	         }

            anIntArray102[var1] = var2.anInt2603 * 734924805;
            client.globalPlayers[var1] = null;
            if(var0.readBits(1, (byte) -1) != 0) {
               Class4.updateGlobalPlayer(var0, var1, (byte) 0);
            }

         }
      } else {
         int var7;
         int var8;
         int var9;
         if(1 == var6) {
            var8 = var0.readBits(3, (byte) -1);
            var9 = var2.xMovementSteps[0];
            var7 = var2.yMovementSteps[0];
            if(0 == var8) {
               --var9;
               --var7;
            } else if(var8 == 1) {
               --var7;
            } else if(2 == var8) {
               ++var9;
               --var7;
            } else if(var8 == 3) {
               --var9;
            } else if(var8 == 4) {
               ++var9;
            } else if(var8 == 5) {
               --var9;
               ++var7;
            } else if(6 == var8) {
               ++var7;
            } else if(var8 == 7) {
               ++var9;
               ++var7;
            }

            if(var1 == 1467227105 * client.playerIndex && (var2.anInt2609 * 1272643751 < 1536 || var2.anInt2579 * -1801433343 < 1536 || var2.anInt2609 * 1272643751 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
               var2.method3551(var9, var7, 1478748903);
               var2.aBool2901 = false;
            } else if(var5) {
               var2.aBool2901 = true;
               var2.anInt2904 = -37570689 * var9;
               var2.anInt2905 = var7 * 1026931509;
            } else {
               var2.aBool2901 = false;
               var2.method3553(var9, var7, aByteArray105[var1], -1344532945);
            }

         } else if(2 == var6) {
            var8 = var0.readBits(4, (byte) -1);
            var9 = var2.xMovementSteps[0];
            var7 = var2.yMovementSteps[0];
            if(var8 == 0) {
               var9 -= 2;
               var7 -= 2;
            } else if(var8 == 1) {
               --var9;
               var7 -= 2;
            } else if(var8 == 2) {
               var7 -= 2;
            } else if(3 == var8) {
               ++var9;
               var7 -= 2;
            } else if(var8 == 4) {
               var9 += 2;
               var7 -= 2;
            } else if(5 == var8) {
               var9 -= 2;
               --var7;
            } else if(6 == var8) {
               var9 += 2;
               --var7;
            } else if(7 == var8) {
               var9 -= 2;
            } else if(var8 == 8) {
               var9 += 2;
            } else if(var8 == 9) {
               var9 -= 2;
               ++var7;
            } else if(10 == var8) {
               var9 += 2;
               ++var7;
            } else if(11 == var8) {
               var9 -= 2;
               var7 += 2;
            } else if(var8 == 12) {
               --var9;
               var7 += 2;
            } else if(var8 == 13) {
               var7 += 2;
            } else if(var8 == 14) {
               ++var9;
               var7 += 2;
            } else if(15 == var8) {
               var9 += 2;
               var7 += 2;
            }

            if(client.playerIndex * 1467227105 == var1 && (1272643751 * var2.anInt2609 < 1536 || -1801433343 * var2.anInt2579 < 1536 || var2.anInt2609 * 1272643751 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
               var2.method3551(var9, var7, 2103230891);
               var2.aBool2901 = false;
            } else if(var5) {
               var2.aBool2901 = true;
               var2.anInt2904 = var9 * -37570689;
               var2.anInt2905 = var7 * 1026931509;
            } else {
               var2.aBool2901 = false;
               var2.method3553(var9, var7, aByteArray105[var1], -58018642);
            }

         } else {
            var8 = var0.readBits(1, (byte) -1);
            int var3;
            int var4;
            int var10;
            int var11;
            if(var8 == 0) {
               var9 = var0.readBits(12, (byte) -1);
               var7 = var9 >> 10;
               var10 = var9 >> 5 & 31;
               if(var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 & 31;
               if(var11 > 15) {
                  var11 -= 32;
               }

               var3 = var2.xMovementSteps[0] + var10;
               var4 = var2.yMovementSteps[0] + var11;
               if(var1 == client.playerIndex * 1467227105 && (var2.anInt2609 * 1272643751 < 1536 || var2.anInt2579 * -1801433343 < 1536 || 1272643751 * var2.anInt2609 >= 11776 || -1801433343 * var2.anInt2579 >= 11776)) {
                  var2.method3551(var3, var4, 1446468632);
                  var2.aBool2901 = false;
               } else if(var5) {
                  var2.aBool2901 = true;
                  var2.anInt2904 = -37570689 * var3;
                  var2.anInt2905 = var4 * 1026931509;
               } else {
                  var2.aBool2901 = false;
                  var2.method3553(var3, var4, aByteArray105[var1], 1086578888);
               }

               var2.anInt2906 = (byte)(-1522270499 * var2.anInt2906 + var7 & 3) * -1668953739;
               if(var1 == 1467227105 * client.playerIndex) {
                  Class116_Sub11.anInt1819 = var2.anInt2906 * -1941196453;
               }

            } else {
               var9 = var0.readBits(30, (byte) -1);
               var7 = var9 >> 28;
               var10 = var9 >> 14 & 16383;
               var11 = var9 & 16383;
	            var3 = (var10 + Class116_Sub17.clickX * 1426698711 + var2.xMovementSteps[0] & 16383) - 1426698711 * Class116_Sub17.clickX;
	            var4 = (var11 + Class33.clickY * 714823515 + var2.yMovementSteps[0] & 16383) - 714823515 * Class33.clickY;
	            if (1467227105 * client.playerIndex == var1 && (1272643751 * var2.anInt2609 < 1536 || -1801433343 * var2.anInt2579 < 1536 || 1272643751 * var2.anInt2609 >= 11776 || var2.anInt2579 * -1801433343 >= 11776)) {
		            var2.method3551(var3, var4, 1232004164);
                  var2.aBool2901 = false;
               } else if(var5) {
                  var2.aBool2901 = true;
                  var2.anInt2904 = var3 * -37570689;
                  var2.anInt2905 = var4 * 1026931509;
               } else {
                  var2.aBool2901 = false;
                  var2.method3553(var3, var4, aByteArray105[var1], -1441049654);
               }

               var2.anInt2906 = -1668953739 * (byte)(var7 + -1522270499 * var2.anInt2906 & 3);
               if(client.playerIndex * 1467227105 == var1) {
                  Class116_Sub11.anInt1819 = -1941196453 * var2.anInt2906;
               }

            }
         }
      }
   }

   static boolean method107(BitBuffer var0, int var1) {
      int var2 = var0.readBits(2, (byte) -1);
      int var3;
      int var4;
      int var6;
      int var7;
      int var8;
      int var9;
      if(0 == var2) {
         if(var0.readBits(1, (byte) -1) != 0) {
            Class4.updateGlobalPlayer(var0, var1, (byte) 0);
         }

         var4 = var0.readBits(6, (byte) -1);
         var8 = var0.readBits(6, (byte) -1);
         boolean var12 = var0.readBits(1, (byte) -1) == 1;
         if(var12) {
            anIntArray119[(anInt118 += -299545915) * 716284941 - 1] = var1;
         }

         if(null != client.globalPlayers[var1]) {
            throw new RuntimeException();
         } else {
            Player var11 = client.globalPlayers[var1] = new Player();
            var11.anInt2902 = var1 * -1055985261;
            if(aClass116_Sub14Array106[var1] != null) {
               var11.method3549(aClass116_Sub14Array106[var1], -617088917);
            }

	         var11.faceDir1 = anIntArray103[var1] * 176982288;
	         var11.anInt2603 = anIntArray102[var1] * 1611414733;
	         var6 = anIntArray111[var1];
            var9 = var6 >> 28;
            var3 = var6 >> 14 & 255;
            var7 = var6 & 255;
            var11.aByteArray2628[0] = aByteArray105[var1];
            var11.anInt2906 = 1038982070 * (byte)var9;
	         var11.method3551(var4 + (var3 << 6) - 1426698711 * Class116_Sub17.clickX, var8 + (var7 << 6) - 714823515 * Class33.clickY, 572697079);
	         var11.aBool2901 = false;
	         return true;
         }
      } else if(var2 == 1) {
         var4 = var0.readBits(2, (byte) -1);
         var8 = anIntArray111[var1];
         anIntArray111[var1] = (var8 & 1558408592) + (((var8 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var5;
         int var10;
         if(2 == var2) {
            var4 = var0.readBits(5, (byte) -1);
            var8 = var4 >> 3;
            var10 = var4 & 7;
            var5 = anIntArray111[var1];
            var6 = (var5 >> 28) + var8 & 3;
            var9 = var5 >> 14 & 255;
            var3 = var5 & 255;
            if(0 == var10) {
               --var9;
               --var3;
            }

            if(1 == var10) {
               --var3;
            }

            if(2 == var10) {
               ++var9;
               --var3;
            }

            if(3 == var10) {
               --var9;
            }

            if(4 == var10) {
               ++var9;
            }

            if(5 == var10) {
               --var9;
               ++var3;
            }

            if(6 == var10) {
               ++var3;
            }

            if(var10 == 7) {
               ++var9;
               ++var3;
            }

            anIntArray111[var1] = (var9 << 14) + (var6 << 28) + var3;
            return false;
         } else {
            var4 = var0.readBits(18, (byte) -1);
            var8 = var4 >> 16;
            var10 = var4 >> 8 & 255;
            var5 = var4 & 255;
            var6 = anIntArray111[var1];
            var9 = (var6 >> 28) + var8 & 3;
            var3 = (var6 >> 14) + var10 & 255;
            var7 = var5 + var6 & 2088462215;
            anIntArray111[var1] = var7 + (var3 << 14) + (var9 << 28);
            return false;
         }
      }
   }

   static int method108(BitBuffer var0) {
      int var1 = var0.readBits(2, (byte) -1);
      int var2;
      if(var1 == 0) {
         var2 = 0;
      } else if(1 != var1) {
         if(2 == var1) {
            var2 = var0.readBits(8, (byte) -1);
         } else {
            var2 = var0.readBits(11, (byte) -1);
         }
      } else {
         var2 = var0.readBits(5, (byte) -1);
      }

      return var2;
   }

   static final void method109(BitBuffer var0, int var1, Player var2, int var3) {
      byte var4 = -1;
      int var5;
      if((var3 & 64) != 0) {
         var5 = var0.readSignedByte(1708176767);
         byte[] var6 = new byte[var5];
         Buffer var7 = new Buffer(var6);
         var0.readBytes(var6, 0, var5, 1993276467);
         aClass116_Sub14Array106[var1] = var7;
         var2.method3549(var7, -1470972281);
      }

      int var19;
      if(0 != (var3 & 2)) {
         var5 = var0.readShort(1194758937);
         if('\uffff' == var5) {
            var5 = -1;
         }

         var19 = var0.readSignedByte(1708176767);
         Class53.method792(var2, var5, var19, (byte)99);
      }

      if((var3 & 128) != 0) {
         var2.anInt2603 = var0.readShort(1095055985) * 1611414733;
         if('\uffff' == 734924805 * var2.anInt2603) {
            var2.anInt2603 = -1611414733;
         }
      }

      if(0 != (var3 & 4)) {
         var2.forceChatString = var0.readString(61376769);
         if(var2.forceChatString.charAt(0) == 126) {
            var2.forceChatString = var2.forceChatString.substring(1);
            Class86.appendMessage(2, var2.username, var2.forceChatString, -1175199206);
         } else if(var2 == Class79.aPlayer_909) {
            Class86.appendMessage(2, var2.username, var2.forceChatString, 911889508);
         }

         var2.aBool2623 = false;
         var2.anInt2618 = 0;
         var2.anInt2596 = 0;
         var2.anInt2598 = -853552818;
      }

      if((var3 & 1) != 0) {
         var5 = var0.readShort(2089216631);
         var19 = var0.readSignedByte(1708176767);
         var2.method3102(var5, var19, -1040073859 * client.anInt2943, -1636636124);
         var2.anInt2600 = -1453430444 + client.anInt2943 * 568824035;
         var2.anInt2601 = var0.readSignedByte(1708176767) * -182432293;
         var2.anInt2602 = var0.readSignedByte(1708176767) * 119158941;
      }

      if(0 != (var3 & 32)) {
	      var2.faceDirection = var0.readShort(322837279) * -316267887;
	      if (0 == var2.anInt2578 * 632093179) {
		      var2.faceDir1 = 47518811 * var2.faceDirection;
		      var2.faceDirection = 316267887;
	      }
      }

      if((var3 & 8) != 0) {
         var5 = var0.readShort(1468873820);
         Speach[] var20 = new Speach[]{Speach.OFFLINE, Speach.PLAYER, Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
         Speach var21 = (Speach)Class35.method646(var20, var0.readSignedByte(1708176767), (byte)-41);
         boolean var8 = var0.readSignedByte(1708176767) == 1;

	      int var9 = var0.readSignedByte(1708176767);
	      int var10 = 314639891 * var0.position;
         if(null != var2.username && null != var2.aClass108_2881) {
            boolean var11 = false;
            if(var21.aBool982 && Class27.method568(var2.username, -2027338129)) {
               var11 = true;
            }

            if(!var11 && 0 == client.anInt3151 * 198136383 && !var2.aBool2900) {
               aClass116_Sub14_113.position = 0;
               var0.readBytes(aClass116_Sub14_113.payload, 0, var9, 2133830402);
               aClass116_Sub14_113.position = 0;
               Buffer var12 = aClass116_Sub14_113;

               int var13;
               String var16;
               try {
                  var13 = var12.readSmartC(-1814469407);
                  if(var13 > 32767) {
                     var13 = 32767;
                  }

                  byte[] var14 = new byte[var13];
                  var12.position += client.aClass52_1621.method786(var12.payload, 314639891 * var12.position, var14, 0, var13, (byte)16) * -184175589;
                  String var15 = Tile.method1987(var14, 0, var13, (byte) 126);
                  var16 = var15;
               } catch (Exception var18) {
                  var16 = "Cabbage";
               }

               var16 = TextDrawingArea.method3459(Class59.method892(var16, -1982380987));
               var2.forceChatString = var16.trim();
               var2.anInt2618 = -1783525269 * (var5 >> 8);
               var2.anInt2596 = (var5 & 255) * -819780711;
               var2.anInt2598 = -853552818;
               var2.aBool2623 = var8;
               var2.aBool2593 = Class79.aPlayer_909 != var2 && var21.aBool982 && "" != client.aString2985 && var16.toLowerCase().indexOf(client.aString2985) == -1;
               if(var21.aBool978) {
                  var13 = var8?91:1;
               } else {
                  var13 = var8?90:2;
               }

               if(-2127218069 * var21.iconId != -1) {
                  Class86.appendMessage(var13, Class51.method780(-2127218069 * var21.iconId, (short) -29560) + var2.username, var16, 78285030);
               } else {
                  Class86.appendMessage(var13, var2.username, var16, -738012079);
               }
            }
         }

         var0.position = -184175589 * (var9 + var10);
      }

      if((var3 & 256) != 0) {
         var2.anInt2614 = var0.readShort(-359935818) * -1738418729;
         var5 = var0.readInt(-1046187162);
         var2.anInt2589 = (var5 >> 16) * 878509897;
         var2.anInt2617 = 1621235571 * ((var5 & '\uffff') + client.anInt2943 * -1040073859);
         var2.anInt2595 = 0;
         var2.anInt2616 = 0;
         if(var2.anInt2617 * 489022907 > -1040073859 * client.anInt2943) {
            var2.anInt2595 = -1825378913;
         }

         if(1631645159 * var2.anInt2614 == '\uffff') {
            var2.anInt2614 = 1738418729;
         }
      }

      if(0 != (var3 & 2048)) {
         var2.anInt2632 = var0.readUnsignedByte(345687569) * 1999092273;
         var2.anInt2621 = var0.readUnsignedByte(-1851516368) * 1905120905;
         var2.anInt2620 = var0.readUnsignedByte(-1318832945) * 1171552311;
         var2.anInt2594 = var0.readUnsignedByte(502353292) * -1263265185;
         var2.anInt2599 = (var0.readShort(1767121883) + -1040073859 * client.anInt2943) * 1935880743;
         var2.anInt2624 = (var0.readShort(1639966996) + -1040073859 * client.anInt2943) * -1370408969;
         var2.anInt2625 = var0.readShort(1414908621) * -1704579493;
         if(var2.aBool2901) {
            var2.anInt2632 += var2.anInt2904 * 189523535;
            var2.anInt2621 += 1458816133 * var2.anInt2905;
            var2.anInt2620 += var2.anInt2904 * -135505079;
            var2.anInt2594 += var2.anInt2905 * -990143037;
            var2.anInt2578 = 0;
         } else {
            var2.anInt2632 += var2.xMovementSteps[0] * 1999092273;
            var2.anInt2621 += var2.yMovementSteps[0] * 1905120905;
            var2.anInt2620 += var2.xMovementSteps[0] * 1171552311;
            var2.anInt2594 += var2.yMovementSteps[0] * -1263265185;
            var2.anInt2578 = 11741491;
         }

         var2.anInt2636 = 0;
      }

      if((var3 & 1024) != 0) {
         var5 = var0.readShort(-44683986);
         var19 = var0.readSignedByte(1708176767);
         var2.method3102(var5, var19, client.anInt2943 * -1040073859, 988178389);
         var2.anInt2600 = client.anInt2943 * 568824035 + -1453430444;
         var2.anInt2601 = var0.readSignedByte(1708176767) * -182432293;
         var2.anInt2602 = var0.readSignedByte(1708176767) * 119158941;
      }

      if((var3 & 512) != 0) {
         aByteArray105[var1] = var0.readUnsignedByte(786573254);
      }

      if(0 != (var3 & 4096)) {
         var4 = var0.readUnsignedByte(-2079173619);
      }

      if(0 != (var3 & 8192)) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.aStringArray2884[var5] = var0.readString(61376769);
         }
      }

      if(var2.aBool2901) {
         if(var4 == 127) {
            var2.method3551(-1495988097 * var2.anInt2904, var2.anInt2905 * 1538326301, 1863941056);
         } else {
            byte var22;
            if(var4 != -1) {
               var22 = var4;
            } else {
               var22 = aByteArray105[var1];
            }

            var2.method3553(var2.anInt2904 * -1495988097, var2.anInt2905 * 1538326301, var22, -1193295124);
         }
      }

   }

   static void method110(String var0, String var1, String var2, int var3) {
      Class6.aString85 = var0;
      Class6.aString86 = var1;
      Class6.aString87 = var2;
   }
}
