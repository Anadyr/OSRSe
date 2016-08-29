package com.jagex;

public class Class116_Sub3 extends Node {

   static int soundBufferPos;
   int anInt1686;
   int anInt1687;
   int anInt1688;
   int anInt1689;
   boolean aBool1690;
   static Class10[] aClass10Array1691;
   static float[] aFloatArray1692;
   static int anInt1693;
   static int[] anIntArray1694;
   static int anInt1695;
   byte[] aByteArray1696;
   static Class19[] aClass19Array1697;
   static int anInt1698;
   static Class18[] aClass18Array1699;
   static boolean[] aBoolArray1700;
   int anInt1701;
   static boolean aBool1702 = false;
   float[] aFloatArray1703;
   static Class13[] aClass13Array1704;
   int anInt1705;
   boolean aBool1706;
   static float[] aFloatArray1707;
   static float[] aFloatArray1708;
   static float[] aFloatArray1709;
   static float[] aFloatArray1710;
   static float[] aFloatArray1711;
   static float[] aFloatArray1712;
   static byte[] soundBuffer;
   static int[] anIntArray1714;
   static int[] anIntArray1715;
   byte[][] aByteArrayArray1716;
   int anInt1717;
   int anInt1718;

   static int method1877() {
      int var0 = soundBuffer[soundBufferPos] >> anInt1693 & 1;
      ++anInt1693;
      soundBufferPos += anInt1693 >> 3;
      anInt1693 &= 7;
      return var0;
   }

   static void method1880(byte[] var0) {
      method1888(var0, 0);
      anInt1698 = 1 << method1881(4);
      anInt1695 = 1 << method1881(4);
      aFloatArray1707 = new float[anInt1695];

      int var1;
      int var2;
      int var3;
      int var6;
      int var7;
      for(var6 = 0; var6 < 2; ++var6) {
         var7 = var6 != 0?anInt1695:anInt1698;
         var3 = var7 >> 1;
         var2 = var7 >> 2;
         var1 = var7 >> 3;
         float[] var9 = new float[var3];

         for(int var4 = 0; var4 < var2; ++var4) {
            var9[2 * var4] = (float)Math.cos((double)(4 * var4) * 3.141592653589793D / (double)var7);
            var9[2 * var4 + 1] = -((float)Math.sin((double)(4 * var4) * 3.141592653589793D / (double)var7));
         }

         float[] var18 = new float[var3];

         for(int var10 = 0; var10 < var2; ++var10) {
            var18[2 * var10] = (float)Math.cos((double)(2 * var10 + 1) * 3.141592653589793D / (double)(2 * var7));
            var18[2 * var10 + 1] = (float)Math.sin((double)(2 * var10 + 1) * 3.141592653589793D / (double)(2 * var7));
         }

         float[] var20 = new float[var2];

         for(int var11 = 0; var11 < var1; ++var11) {
            var20[2 * var11] = (float)Math.cos((double)(4 * var11 + 2) * 3.141592653589793D / (double)var7);
            var20[2 * var11 + 1] = -((float)Math.sin((double)(4 * var11 + 2) * 3.141592653589793D / (double)var7));
         }

         int[] var21 = new int[var1];
         int var12 = ChatMessage.method2581(var1 - 1, 639259553);

         for(int var8 = 0; var8 < var1; ++var8) {
            int var5 = var8;
            int var13 = var12;

            int var15;
            for(var15 = 0; var13 > 0; --var13) {
               var15 = var15 << 1 | var5 & 1;
               var5 >>>= 1;
            }

            var21[var8] = var15;
         }

         if(var6 != 0) {
            aFloatArray1710 = var9;
            aFloatArray1712 = var18;
            aFloatArray1692 = var20;
            anIntArray1715 = var21;
         } else {
            aFloatArray1708 = var9;
            aFloatArray1709 = var18;
            aFloatArray1711 = var20;
            anIntArray1714 = var21;
         }
      }

      var6 = method1881(8) + 1;
      aClass13Array1704 = new Class13[var6];

      for(var7 = 0; var7 < var6; ++var7) {
         aClass13Array1704[var7] = new Class13();
      }

      var7 = method1881(6) + 1;

      for(var3 = 0; var3 < var7; ++var3) {
         method1881(16);
      }

      var7 = method1881(6) + 1;
      aClass19Array1697 = new Class19[var7];

      for(var3 = 0; var3 < var7; ++var3) {
         aClass19Array1697[var3] = new Class19();
      }

      var3 = method1881(6) + 1;
      aClass10Array1691 = new Class10[var3];

      for(var2 = 0; var2 < var3; ++var2) {
         aClass10Array1691[var2] = new Class10();
      }

      var2 = method1881(6) + 1;
      aClass18Array1699 = new Class18[var2];

      for(var1 = 0; var1 < var2; ++var1) {
         aClass18Array1699[var1] = new Class18();
      }

      var1 = method1881(6) + 1;
      aBoolArray1700 = new boolean[var1];
      anIntArray1694 = new int[var1];

      for(int var19 = 0; var19 < var1; ++var19) {
         aBoolArray1700[var19] = method1877() != 0;
         method1881(16);
         method1881(16);
         anIntArray1694[var19] = method1881(8);
      }

   }

   static int method1881(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - anInt1693; var0 -= var3) {
         var3 = 8 - anInt1693;
         int nextSytemNoise = (1 << var3) - 1;
         var1 += (soundBuffer[soundBufferPos] >> anInt1693 & nextSytemNoise) << var2;
         anInt1693 = 0;
         ++soundBufferPos;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (soundBuffer[soundBufferPos] >> anInt1693 & var3) << var2;
         anInt1693 += var0;
      }

      return var1;
   }

   static boolean method1882(Class99 var0) {
      if(!aBool1702) {
         byte[] var1 = var0.method1394(0, 0, -1530234715);
         if(var1 == null) {
            return false;
         }

         method1880(var1);
         aBool1702 = true;
      }

      return true;
   }

   Class116_Sub2_Sub1 method1885(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.aByteArray1696 == null) {
            this.anInt1686 = 0;
            this.aFloatArray1703 = new float[anInt1695];
            this.aByteArray1696 = new byte[this.anInt1687];
            this.anInt1688 = 0;
            this.anInt1718 = 0;
         }

         for(; this.anInt1718 < this.aByteArrayArray1716.length; ++this.anInt1718) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1899(this.anInt1718);
            if(var2 != null) {
               int var5 = this.anInt1688;
               int var6 = var2.length;
               if(var6 > this.anInt1687 - var5) {
                  var6 = this.anInt1687 - var5;
               }

               for(int var3 = 0; var3 < var6; ++var3) {
                  int var4 = (int)(128.0F + var2[var3] * 128.0F);
                  if((var4 & -256) != 0) {
                     var4 = ~var4 >> 31;
                  }

                  this.aByteArray1696[var5++] = (byte)(var4 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var5 - this.anInt1688;
               }

               this.anInt1688 = var5;
            }
         }

         this.aFloatArray1703 = null;
         byte[] var7 = this.aByteArray1696;
         this.aByteArray1696 = null;
         return new Class116_Sub2_Sub1(this.anInt1701, var7, this.anInt1717, this.anInt1689, this.aBool1690);
      }
   }

   void method1887(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      this.anInt1701 = var2.readInt(-833702041);
      this.anInt1687 = var2.readInt(-139471892);
      this.anInt1717 = var2.readInt(-1378692472);
      this.anInt1689 = var2.readInt(-566501854);
      if(this.anInt1689 < 0) {
         this.anInt1689 = ~this.anInt1689;
         this.aBool1690 = true;
      }

      int var5 = var2.readInt(-1674610618);
      this.aByteArrayArray1716 = new byte[var5][];

      for(int var3 = 0; var3 < var5; ++var3) {
         int var6 = 0;

         int var4;
         do {
            var4 = var2.readSignedByte(1708176767);
            var6 += var4;
         } while(var4 >= 255);

         byte[] var7 = new byte[var6];
         var2.readBytes(var7, 0, var6, 1890005733);
         this.aByteArrayArray1716[var3] = var7;
      }

   }

   static void method1888(byte[] var0, int var1) {
      soundBuffer = var0;
      soundBufferPos = var1;
      anInt1693 = 0;
   }

   static Class116_Sub3 method1889(Class99 var0, int var1, int var2) {
      if(!method1882(var0)) {
         var0.method1373(var1, var2, (byte)1);
         return null;
      } else {
         byte[] var3 = var0.method1394(var1, var2, -808646941);
         return var3 == null?null:new Class116_Sub3(var3);
      }
   }

   Class116_Sub3(byte[] var1) {
      this.method1887(var1);
   }

   float[] method1899(int var1) {
      method1888(this.aByteArrayArray1716[var1], 0);
      method1877();
      int var25 = method1881(ChatMessage.method2581(anIntArray1694.length - 1, 639259553));
      boolean var10 = aBoolArray1700[var25];
      int var9 = var10?anInt1695:anInt1698;
      boolean var13 = false;
      boolean var14 = false;
      if(var10) {
         var13 = method1877() != 0;
         var14 = method1877() != 0;
      }

      int var22 = var9 >> 1;
      int var11;
      int var19;
      int var21;
      if(var10 && !var13) {
         var11 = (var9 >> 2) - (anInt1698 >> 2);
         var19 = (var9 >> 2) + (anInt1698 >> 2);
         var21 = anInt1698 >> 1;
      } else {
         var11 = 0;
         var19 = var22;
         var21 = var9 >> 1;
      }

      int var20;
      int var23;
      int var24;
      if(var10 && !var14) {
         var23 = var9 - (var9 >> 2) - (anInt1698 >> 2);
         var20 = var9 - (var9 >> 2) + (anInt1698 >> 2);
         var24 = anInt1698 >> 1;
      } else {
         var23 = var22;
         var20 = var9;
         var24 = var9 >> 1;
      }

      Class18 var26 = aClass18Array1699[anIntArray1694[var25]];
      int var27 = var26.anInt243;
      int var28 = var26.anIntArray242[var27];
      boolean var29 = !aClass19Array1697[var28].method297();
      boolean var50 = var29;

      for(var28 = 0; var28 < var26.anInt241; ++var28) {
         Class10 var30 = aClass10Array1691[var26.anIntArray244[var28]];
         float[] var12 = aFloatArray1707;
         var30.method195(var12, var9 >> 1, var50);
      }

      int var51;
      if(!var29) {
         var28 = var26.anInt243;
         var51 = var26.anIntArray242[var28];
         aClass19Array1697[var51].method316(aFloatArray1707, var9 >> 1);
      }

      int var47;
      if(var29) {
         for(var28 = var9 >> 1; var28 < var9; ++var28) {
            aFloatArray1707[var28] = 0.0F;
         }
      } else {
         var28 = var9 >> 1;
         var51 = var9 >> 2;
         var47 = var9 >> 3;
         float[] var15 = aFloatArray1707;

         int var33;
         for(var33 = 0; var33 < var28; ++var33) {
            var15[var33] *= 0.5F;
         }

         for(var33 = var28; var33 < var9; ++var33) {
            var15[var33] = -var15[var9 - var33 - 1];
         }

         float[] var54 = var10?aFloatArray1710:aFloatArray1708;
         float[] var34 = var10?aFloatArray1712:aFloatArray1709;
         float[] var18 = var10?aFloatArray1692:aFloatArray1711;
         int[] var39 = var10?anIntArray1715:anIntArray1714;

         float var2;
         float var3;
         float var5;
         int var16;
         float var17;
         for(var16 = 0; var16 < var51; ++var16) {
            var17 = var15[4 * var16] - var15[var9 - 4 * var16 - 1];
            var5 = var15[4 * var16 + 2] - var15[var9 - 4 * var16 - 3];
            var2 = var54[2 * var16];
            var3 = var54[2 * var16 + 1];
            var15[var9 - 4 * var16 - 1] = var17 * var2 - var5 * var3;
            var15[var9 - 4 * var16 - 3] = var17 * var3 + var5 * var2;
         }

         float var4;
         float var6;
         for(var16 = 0; var16 < var47; ++var16) {
            var17 = var15[var28 + 3 + 4 * var16];
            var5 = var15[var28 + 1 + 4 * var16];
            var2 = var15[4 * var16 + 3];
            var3 = var15[4 * var16 + 1];
            var15[var28 + 3 + 4 * var16] = var17 + var2;
            var15[var28 + 1 + 4 * var16] = var5 + var3;
            var6 = var54[var28 - 4 - 4 * var16];
            var4 = var54[var28 - 3 - 4 * var16];
            var15[4 * var16 + 3] = (var17 - var2) * var6 - (var5 - var3) * var4;
            var15[4 * var16 + 1] = (var5 - var3) * var6 + (var17 - var2) * var4;
         }

         var16 = ChatMessage.method2581(var9 - 1, 639259553);

         int var40;
         int var41;
         int var43;
         int var49;
         for(var49 = 0; var49 < var16 - 3; ++var49) {
            var43 = var9 >> var49 + 2;
            var40 = 8 << var49;

            for(var41 = 0; var41 < 2 << var49; ++var41) {
               int var44 = var9 - var43 * 2 * var41;
               int var42 = var9 - var43 * (2 * var41 + 1);

               for(int var7 = 0; var7 < var9 >> var49 + 4; ++var7) {
                  int var8 = 4 * var7;
                  float var35 = var15[var44 - 1 - var8];
                  float var31 = var15[var44 - 3 - var8];
                  float var36 = var15[var42 - 1 - var8];
                  float var32 = var15[var42 - 3 - var8];
                  var15[var44 - 1 - var8] = var35 + var36;
                  var15[var44 - 3 - var8] = var31 + var32;
                  float var37 = var54[var7 * var40];
                  float var38 = var54[var7 * var40 + 1];
                  var15[var42 - 1 - var8] = (var35 - var36) * var37 - (var31 - var32) * var38;
                  var15[var42 - 3 - var8] = (var31 - var32) * var37 + (var35 - var36) * var38;
               }
            }
         }

         for(var49 = 1; var49 < var47 - 1; ++var49) {
            var43 = var39[var49];
            if(var49 < var43) {
               var40 = 8 * var49;
               var41 = 8 * var43;
               var6 = var15[var40 + 1];
               var15[var40 + 1] = var15[var41 + 1];
               var15[var41 + 1] = var6;
               var6 = var15[var40 + 3];
               var15[var40 + 3] = var15[var41 + 3];
               var15[var41 + 3] = var6;
               var6 = var15[var40 + 5];
               var15[var40 + 5] = var15[var41 + 5];
               var15[var41 + 5] = var6;
               var6 = var15[var40 + 7];
               var15[var40 + 7] = var15[var41 + 7];
               var15[var41 + 7] = var6;
            }
         }

         for(var49 = 0; var49 < var28; ++var49) {
            var15[var49] = var15[2 * var49 + 1];
         }

         for(var49 = 0; var49 < var47; ++var49) {
            var15[var9 - 1 - 2 * var49] = var15[4 * var49];
            var15[var9 - 2 - 2 * var49] = var15[4 * var49 + 1];
            var15[var9 - var51 - 1 - 2 * var49] = var15[4 * var49 + 2];
            var15[var9 - var51 - 2 - 2 * var49] = var15[4 * var49 + 3];
         }

         for(var49 = 0; var49 < var47; ++var49) {
            var5 = var18[2 * var49];
            var2 = var18[2 * var49 + 1];
            var3 = var15[var28 + 2 * var49];
            var6 = var15[var28 + 2 * var49 + 1];
            var4 = var15[var9 - 2 - 2 * var49];
            float var45 = var15[var9 - 1 - 2 * var49];
            float var46 = var2 * (var3 - var4) + var5 * (var6 + var45);
            var15[var28 + 2 * var49] = (var3 + var4 + var46) * 0.5F;
            var15[var9 - 2 - 2 * var49] = (var3 + var4 - var46) * 0.5F;
            var46 = var2 * (var6 + var45) - var5 * (var3 - var4);
            var15[var28 + 2 * var49 + 1] = (var6 - var45 + var46) * 0.5F;
            var15[var9 - 1 - 2 * var49] = (-var6 + var45 + var46) * 0.5F;
         }

         for(var49 = 0; var49 < var51; ++var49) {
            var15[var49] = var15[2 * var49 + var28] * var34[2 * var49] + var15[2 * var49 + 1 + var28] * var34[2 * var49 + 1];
            var15[var28 - 1 - var49] = var15[2 * var49 + var28] * var34[2 * var49 + 1] - var15[2 * var49 + 1 + var28] * var34[2 * var49];
         }

         for(var49 = 0; var49 < var51; ++var49) {
            var15[var9 - var51 + var49] = -var15[var49];
         }

         for(var49 = 0; var49 < var51; ++var49) {
            var15[var49] = var15[var51 + var49];
         }

         for(var49 = 0; var49 < var51; ++var49) {
            var15[var51 + var49] = -var15[var51 - var49 - 1];
         }

         for(var49 = 0; var49 < var51; ++var49) {
            var15[var28 + var49] = var15[var9 - var49 - 1];
         }

         for(var49 = var11; var49 < var19; ++var49) {
            var5 = (float)Math.sin(((double)(var49 - var11) + 0.5D) / (double)var21 * 0.5D * 3.141592653589793D);
            aFloatArray1707[var49] *= (float)Math.sin(1.5707963267948966D * (double)var5 * (double)var5);
         }

         for(var49 = var23; var49 < var20; ++var49) {
            var5 = (float)Math.sin(((double)(var49 - var23) + 0.5D) / (double)var24 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            aFloatArray1707[var49] *= (float)Math.sin(1.5707963267948966D * (double)var5 * (double)var5);
         }
      }

      float[] var52 = null;
      if(this.anInt1686 > 0) {
         var51 = this.anInt1686 + var9 >> 2;
         var52 = new float[var51];
         int var48;
         if(!this.aBool1706) {
            for(var47 = 0; var47 < this.anInt1705; ++var47) {
               var48 = (this.anInt1686 >> 1) + var47;
               var52[var47] += this.aFloatArray1703[var48];
            }
         }

         if(!var29) {
            for(var47 = var11; var47 < var9 >> 1; ++var47) {
               var48 = var52.length - (var9 >> 1) + var47;
               var52[var48] += aFloatArray1707[var47];
            }
         }
      }

      float[] var53 = this.aFloatArray1703;
      this.aFloatArray1703 = aFloatArray1707;
      aFloatArray1707 = var53;
      this.anInt1686 = var9;
      this.anInt1705 = var20 - (var9 >> 1);
      this.aBool1706 = var29;
      return var52;
   }

   static float method1902(int var0) {
      int var1 = var0 & 2097151;
      int var3 = var0 & Integer.MIN_VALUE;
      int var2 = (var0 & 2145386496) >> 21;
      if(var3 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var2 - 788)));
   }

}
