package com.jagex;

public class Class13 {

   float[][] aFloatArrayArray204;
   int anInt205;
   int[] anIntArray206;
   int[] anIntArray207;
   int[] anIntArray208;
   int anInt209;


   int method225() {
      int var1;
      for(var1 = 0; this.anIntArray208[var1] >= 0; var1 = Class116_Sub3.method1877() != 0?this.anIntArray208[var1]:var1 + 1) {
         ;
      }

      return ~this.anIntArray208[var1];
   }

   Class13() {
      Class116_Sub3.method1881(24);
      this.anInt209 = Class116_Sub3.method1881(16);
      this.anInt205 = Class116_Sub3.method1881(24);
      this.anIntArray206 = new int[this.anInt205];
      boolean var3 = Class116_Sub3.method1877() != 0;
      int var5;
      int var7;
      int var8;
      if(var3) {
         var7 = 0;

         for(var5 = Class116_Sub3.method1881(5) + 1; var7 < this.anInt205; ++var5) {
            int var10 = Class116_Sub3.method1881(ChatMessage.method2581(this.anInt205 - var7, 639259553));

            for(var8 = 0; var8 < var10; ++var8) {
               this.anIntArray206[var7++] = var5;
            }
         }
      } else {
         boolean var15 = Class116_Sub3.method1877() != 0;

         for(var5 = 0; var5 < this.anInt205; ++var5) {
            if(var15 && Class116_Sub3.method1877() == 0) {
               this.anIntArray206[var5] = 0;
            } else {
               this.anIntArray206[var5] = Class116_Sub3.method1881(5) + 1;
            }
         }
      }

      this.method235();
      var7 = Class116_Sub3.method1881(4);
      if(var7 > 0) {
         float var14 = Class116_Sub3.method1902(Class116_Sub3.method1881(32));
         float var17 = Class116_Sub3.method1902(Class116_Sub3.method1881(32));
         var8 = Class116_Sub3.method1881(4) + 1;
         boolean var6 = Class116_Sub3.method1877() != 0;
         int var12;
         if(var7 == 1) {
            var12 = method226(this.anInt205, this.anInt209);
         } else {
            var12 = this.anInt205 * this.anInt209;
         }

         this.anIntArray207 = new int[var12];

         int var1;
         for(var1 = 0; var1 < var12; ++var1) {
            this.anIntArray207[var1] = Class116_Sub3.method1881(var8);
         }

         this.aFloatArrayArray204 = new float[this.anInt205][this.anInt209];
         int var2;
         float var4;
         int var13;
         if(var7 == 1) {
            for(var1 = 0; var1 < this.anInt205; ++var1) {
               var4 = 0.0F;
               var2 = 1;

               for(var13 = 0; var13 < this.anInt209; ++var13) {
                  int var9 = var1 / var2 % var12;
                  float var11 = (float)this.anIntArray207[var9] * var17 + var14 + var4;
                  this.aFloatArrayArray204[var1][var13] = var11;
                  if(var6) {
                     var4 = var11;
                  }

                  var2 *= var12;
               }
            }
         } else {
            for(var1 = 0; var1 < this.anInt205; ++var1) {
               var4 = 0.0F;
               var2 = var1 * this.anInt209;

               for(var13 = 0; var13 < this.anInt209; ++var13) {
                  float var16 = (float)this.anIntArray207[var2] * var17 + var14 + var4;
                  this.aFloatArrayArray204[var1][var13] = var16;
                  if(var6) {
                     var4 = var16;
                  }

                  ++var2;
               }
            }
         }
      }

   }

   static int method226(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var5 = var2;
         int var6 = var1;

         int var3;
         for(var3 = 1; var6 > 1; var6 >>= 1) {
            if(0 != (var6 & 1)) {
               var3 *= var5;
            }

            var5 *= var5;
         }

         int var4;
         if(1 == var6) {
            var4 = var5 * var3;
         } else {
            var4 = var3;
         }

         if(var4 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   void method235() {
      int[] var1 = new int[this.anInt205];
      int[] var2 = new int[33];

      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var6 = 0; var6 < this.anInt205; ++var6) {
         var8 = this.anIntArray206[var6];
         if(var8 != 0) {
            var9 = 1 << 32 - var8;
            var7 = var2[var8];
            var1[var6] = var7;
            int var4;
            if((var7 & var9) != 0) {
               var10 = var2[var8 - 1];
            } else {
               var10 = var7 | var9;

               for(var3 = var8 - 1; var3 >= 1; --var3) {
                  var4 = var2[var3];
                  if(var4 != var7) {
                     break;
                  }

                  var5 = 1 << 32 - var3;
                  if((var4 & var5) != 0) {
                     var2[var3] = var2[var3 - 1];
                     break;
                  }

                  var2[var3] = var4 | var5;
               }
            }

            var2[var8] = var10;

            for(var3 = var8 + 1; var3 <= 32; ++var3) {
               var4 = var2[var3];
               if(var4 == var7) {
                  var2[var3] = var10;
               }
            }
         }
      }

      this.anIntArray208 = new int[8];
      int var11 = 0;

      for(var6 = 0; var6 < this.anInt205; ++var6) {
         var8 = this.anIntArray206[var6];
         if(var8 != 0) {
            var9 = var1[var6];
            var7 = 0;

            for(var10 = 0; var10 < var8; ++var10) {
               var3 = Integer.MIN_VALUE >>> var10;
               if((var9 & var3) != 0) {
                  if(this.anIntArray208[var7] == 0) {
                     this.anIntArray208[var7] = var11;
                  }

                  var7 = this.anIntArray208[var7];
               } else {
                  ++var7;
               }

               if(var7 >= this.anIntArray208.length) {
                  int[] var12 = new int[this.anIntArray208.length * 2];

                  for(var5 = 0; var5 < this.anIntArray208.length; ++var5) {
                     var12[var5] = this.anIntArray208[var5];
                  }

                  this.anIntArray208 = var12;
               }

               var3 >>>= 1;
            }

            this.anIntArray208[var7] = ~var6;
            if(var7 >= var11) {
               var11 = var7 + 1;
            }
         }
      }

   }

   float[] method236() {
      return this.aFloatArrayArray204[this.method225()];
   }

}
