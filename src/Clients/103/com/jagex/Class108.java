package com.jagex;

public class Class108 {

   public static short[][] aShortArrayArray1460;
   int[] anIntArray1461;
   public static short[] aShortArray1462;
   static Class123 aClass123_1463 = new Class123(260);
   public boolean aBool1464;
   long aLong1465;
   public int anInt1466;
   long aLong1467;
   static int[] anIntArray1468 = new int[]{8, 11, 4, 6, 9, 7, 10};
   int[] anIntArray1469;
   static Class99_Sub1 aClass99_Sub1_1471;

   public void method1468(int[] var1, int[] var2, boolean var3, int var4, int var5) {
      if(null == var1) {
         var1 = new int[12];

         for(int var7 = 0; var7 < 7; ++var7) {
            for(int var8 = 0; var8 < Class116_Sub23_Sub2.anInt2175 * 906908197; ++var8) {
               Class116_Sub23_Sub2 var6 = RSImageProducer.method1871(var8, (byte) 124);
               if(var6 != null && !var6.aBool2185 && (var3?7:0) + var7 == 746079793 * var6.anInt2178) {
                  var1[anIntArray1468[var7]] = 256 + var8;
                  break;
               }
            }
         }
      }

      this.anIntArray1469 = var1;
      this.anIntArray1461 = var2;
      this.aBool1464 = var3;
      this.anInt1466 = 1738384351 * var4;
      this.method1473((byte)0);
   }

   public void method1469(int var1, boolean var2, int var3) {
      int var4 = this.anIntArray1461[var1];
      if(var2) {
         do {
            ++var4;
            if(var4 >= aShortArrayArray1460[var1].length) {
               var4 = 0;
            }
         } while(!Class91.method1199(var1, var4, -1888368688));
      } else {
         do {
            --var4;
            if(var4 < 0) {
               var4 = aShortArrayArray1460[var1].length - 1;
            }
         } while(!Class91.method1199(var1, var4, -1973805492));
      }

      this.anIntArray1461[var1] = var4;
      this.method1473((byte)0);
   }

   public void method1470(int var1, boolean var2, int var3) {
      if(1 != var1 || !this.aBool1464) {
         int var5 = this.anIntArray1469[anIntArray1468[var1]];
         if(0 != var5) {
            var5 -= 256;

            Class116_Sub23_Sub2 var4;
            do {
               if(!var2) {
                  --var5;
                  if(var5 < 0) {
                     var5 = 906908197 * Class116_Sub23_Sub2.anInt2175 - 1;
                  }
               } else {
                  ++var5;
                  if(var5 >= 906908197 * Class116_Sub23_Sub2.anInt2175) {
                     var5 = 0;
                  }
               }

               var4 = RSImageProducer.method1871(var5, (byte) 74);
            } while(var4 == null || var4.aBool2185 || (this.aBool1464?7:0) + var1 != var4.anInt2178 * 746079793);

            this.anIntArray1469[anIntArray1468[var1]] = 256 + var5;
            this.method1473((byte)0);
         }
      }
   }

   public void method1471(boolean var1, short var2) {
      if(var1 != this.aBool1464) {
         this.method1468((int[])null, this.anIntArray1461, var1, -1, -265887913);
      }
   }

   public void method1472(Buffer var1, int var2) {
      var1.writeByte(this.aBool1464?1:0, -1729339571);

      int var4;
      for(var4 = 0; var4 < 7; ++var4) {
         int var3 = this.anIntArray1469[anIntArray1468[var4]];
         if(var3 == 0) {
            var1.writeByte(-1, -1361924407);
         } else {
            var1.writeByte(var3 - 256, -1531872334);
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         var1.writeByte(this.anIntArray1461[var4], 154138019);
      }

   }

   void method1473(byte var1) {
      long var2 = -7792981304576825055L * this.aLong1467;
      int var6 = this.anIntArray1469[5];
      int var5 = this.anIntArray1469[9];
      this.anIntArray1469[5] = var5;
      this.anIntArray1469[9] = var6;
      this.aLong1467 = 0L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.aLong1467 = -462908861650658591L * (-7792981304576825055L * this.aLong1467 << 4);
         if(this.anIntArray1469[var4] >= 256) {
            this.aLong1467 += -462908861650658591L * (long)(this.anIntArray1469[var4] - 256);
         }
      }

      if(this.anIntArray1469[0] >= 256) {
         this.aLong1467 += -462908861650658591L * (long)(this.anIntArray1469[0] - 256 >> 4);
      }

      if(this.anIntArray1469[1] >= 256) {
         this.aLong1467 += -462908861650658591L * (long)(this.anIntArray1469[1] - 256 >> 8);
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.aLong1467 = (this.aLong1467 * -7792981304576825055L << 3) * -462908861650658591L;
         this.aLong1467 += (long)this.anIntArray1461[var4] * -462908861650658591L;
      }

      this.aLong1467 = -462908861650658591L * (this.aLong1467 * -7792981304576825055L << 1);
      this.aLong1467 += -462908861650658591L * (long)(this.aBool1464?1:0);
      this.anIntArray1469[5] = var6;
      this.anIntArray1469[9] = var5;
      if(0L != var2 && var2 != this.aLong1467 * -7792981304576825055L) {
         aClass123_1463.method1642(var2);
      }

   }

   public SpotAnim method1474(Class116_Sub23_Sub4 var1, int var2, Class116_Sub23_Sub4 var3, int var4, int var5) {
      if(-1 != -84158433 * this.anInt1466) {
         return Class116_Sub23_Sub15.method2705(-84158433 * this.anInt1466, -1807583090).method2544(var1, var2, var3, var4, (byte)71);
      } else {
         long var9 = this.aLong1467 * -7792981304576825055L;
         int[] var6 = this.anIntArray1469;
         if(null != var1 && (var1.anInt2253 * 1712651899 >= 0 || var1.anInt2256 * 1963729991 >= 0)) {
            var6 = new int[12];

            for(int var7 = 0; var7 < 12; ++var7) {
               var6[var7] = this.anIntArray1469[var7];
            }

            if(1712651899 * var1.anInt2253 >= 0) {
               var9 += (long)(1712651899 * var1.anInt2253 - this.anIntArray1469[5] << 40);
               var6[5] = 1712651899 * var1.anInt2253;
            }

            if(var1.anInt2256 * 1963729991 >= 0) {
               var9 += (long)(1963729991 * var1.anInt2256 - this.anIntArray1469[3] << 48);
               var6[3] = 1963729991 * var1.anInt2256;
            }
         }

         SpotAnim var16 = (SpotAnim)aClass123_1463.method1632(var9);
         if(var16 == null) {
            boolean var13 = false;

            int var12;
            for(int var14 = 0; var14 < 12; ++var14) {
               var12 = var6[var14];
               if(var12 >= 256 && var12 < 512 && !RSImageProducer.method1871(var12 - 256, (byte) 22).method2360(193063849)) {
                  var13 = true;
               }

               if(var12 >= 512 && !Class50.method778(var12 - 512, (byte)70).method2595(this.aBool1464, -1022867603)) {
                  var13 = true;
               }
            }

            if(var13) {
               if(this.aLong1465 * 3298979106963370435L != -1L) {
                  var16 = (SpotAnim)aClass123_1463.method1632(3298979106963370435L * this.aLong1465);
               }

               if(var16 == null) {
                  return null;
               }
            }

            if(var16 == null) {
               Model[] var19 = new Model[12];
               var12 = 0;

               int var11;
               for(int var8 = 0; var8 < 12; ++var8) {
                  var11 = var6[var8];
                  Model var15;
                  if(var11 >= 256 && var11 < 512) {
                     var15 = RSImageProducer.method1871(var11 - 256, (byte) 113).method2358((byte)34);
                     if(var15 != null) {
                        var19[var12++] = var15;
                     }
                  }

                  if(var11 >= 512) {
                     var15 = Class50.method778(var11 - 512, (byte)70).method2596(this.aBool1464, 738113117);
                     if(var15 != null) {
                        var19[var12++] = var15;
                     }
                  }
               }

               Model var17 = new Model(var19, var12);

               for(var11 = 0; var11 < 5; ++var11) {
                  if(this.anIntArray1461[var11] < aShortArrayArray1460[var11].length) {
                     var17.method3125(aShortArray1462[var11], aShortArrayArray1460[var11][this.anIntArray1461[var11]]);
                  }

                  if(this.anIntArray1461[var11] < Class97.aShortArrayArray1373[var11].length) {
                     var17.method3125(Class104.aShortArray1428[var11], Class97.aShortArrayArray1373[var11][this.anIntArray1461[var11]]);
                  }
               }

               var16 = var17.method3133(64, 850, -30, -50, -30);
               aClass123_1463.method1633(var16, var9);
               this.aLong1465 = var9 * 3382972943993980651L;
            }
         }

         if(var1 == null && null == var3) {
            return var16;
         } else {
            SpotAnim var18;
            if(var1 != null && null != var3) {
               var18 = var1.method2445(var16, var2, var3, var4, (byte)1);
            } else if(var1 != null) {
               var18 = var1.method2455(var16, var2, -685570926);
            } else {
               var18 = var3.method2455(var16, var4, -819306797);
            }

            return var18;
         }
      }
   }

   public int method1475(int var1) {
      return -1 != this.anInt1466 * -84158433?305419896 + Class116_Sub23_Sub15.method2705(-84158433 * this.anInt1466, -1073521452).anInt2308 * -2095462435:(this.anIntArray1469[11] << 5) + (this.anIntArray1461[0] << 25) + (this.anIntArray1461[4] << 20) + (this.anIntArray1469[0] << 15) + (this.anIntArray1469[8] << 10) + this.anIntArray1469[1];
   }

   Model method1494(int var1) {
      if(-1 != this.anInt1466 * -84158433) {
         return Class116_Sub23_Sub15.method2705(this.anInt1466 * -84158433, -127382149).method2545((byte)37);
      } else {
         boolean var5 = false;

         int var4;
         for(int var2 = 0; var2 < 12; ++var2) {
            var4 = this.anIntArray1469[var2];
            if(var4 >= 256 && var4 < 512 && !RSImageProducer.method1871(var4 - 256, (byte) 88).method2387(-1250972748)) {
               var5 = true;
            }

            if(var4 >= 512 && !Class50.method778(var4 - 512, (byte)70).method2597(this.aBool1464, 1471416339)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            Model[] var8 = new Model[12];
            var4 = 0;

            int var3;
            for(int var6 = 0; var6 < 12; ++var6) {
               var3 = this.anIntArray1469[var6];
               Model var7;
               if(var3 >= 256 && var3 < 512) {
                  var7 = RSImageProducer.method1871(var3 - 256, (byte) 46).method2363(975522870);
                  if(null != var7) {
                     var8[var4++] = var7;
                  }
               }

               if(var3 >= 512) {
                  var7 = Class50.method778(var3 - 512, (byte)70).method2624(this.aBool1464, -1241330286);
                  if(null != var7) {
                     var8[var4++] = var7;
                  }
               }
            }

            Model var9 = new Model(var8, var4);

            for(var3 = 0; var3 < 5; ++var3) {
               if(this.anIntArray1461[var3] < aShortArrayArray1460[var3].length) {
                  var9.method3125(aShortArray1462[var3], aShortArrayArray1460[var3][this.anIntArray1461[var3]]);
               }

               if(this.anIntArray1461[var3] < Class97.aShortArrayArray1373[var3].length) {
                  var9.method3125(Class104.aShortArray1428[var3], Class97.aShortArrayArray1373[var3][this.anIntArray1461[var3]]);
               }
            }

            return var9;
         }
      }
   }

   public static void method1505(Class99 var0, String var1, String var2, int var3, boolean var4, int var5) {
      int var6 = var0.method1366(var1, -1747202576);
      int var7 = var0.method1367(var6, var2, 1921182125);
      Class80.method1099(var0, var6, var7, var3, var4, (short)18525);
   }
}
