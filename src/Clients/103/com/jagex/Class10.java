package com.jagex;

public class Class10 {

   int anInt159 = Class116_Sub3.method1881(24) + 1;
   int anInt160 = Class116_Sub3.method1881(24);
   int anInt161 = Class116_Sub3.method1881(24);
   int anInt162 = Class116_Sub3.method1881(6) + 1;
   int[] anIntArray163;
   int anInt164 = Class116_Sub3.method1881(16);
   int anInt165 = Class116_Sub3.method1881(8);


   void method195(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = Class116_Sub3.aClass13Array1704[this.anInt165].anInt209;
         int var7 = this.anInt161 - this.anInt160;
         int var6 = var7 / this.anInt159;
         int[] var13 = new int[var6];

         for(int var10 = 0; var10 < 8; ++var10) {
            int var5 = 0;

            while(var5 < var6) {
               int var11;
               int var12;
               if(var10 == 0) {
                  var11 = Class116_Sub3.aClass13Array1704[this.anInt165].method225();

                  for(var12 = var4 - 1; var12 >= 0; --var12) {
                     if(var5 + var12 < var6) {
                        var13[var5 + var12] = var11 % this.anInt162;
                     }

                     var11 /= this.anInt162;
                  }
               }

               for(var11 = 0; var11 < var4; ++var11) {
                  var12 = var13[var5];
                  int var15 = this.anIntArray163[var12 * 8 + var10];
                  if(var15 >= 0) {
                     int var16 = this.anInt160 + var5 * this.anInt159;
                     Class13 var8 = Class116_Sub3.aClass13Array1704[var15];
                     int var14;
                     if(this.anInt164 == 0) {
                        var14 = this.anInt159 / var8.anInt209;

                        for(int var19 = 0; var19 < var14; ++var19) {
                           float[] var20 = var8.method236();

                           for(int var17 = 0; var17 < var8.anInt209; ++var17) {
                              var1[var16 + var19 + var17 * var14] += var20[var17];
                           }
                        }
                     } else {
                        var14 = 0;

                        while(var14 < this.anInt159) {
                           float[] var9 = var8.method236();

                           for(int var18 = 0; var18 < var8.anInt209; ++var18) {
                              var1[var16 + var14] += var9[var18];
                              ++var14;
                           }
                        }
                     }
                  }

                  ++var5;
                  if(var5 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   Class10() {
      int[] var2 = new int[this.anInt162];

      int var1;
      for(var1 = 0; var1 < this.anInt162; ++var1) {
         int var5 = 0;
         int var3 = Class116_Sub3.method1881(3);
         boolean var4 = Class116_Sub3.method1877() != 0;
         if(var4) {
            var5 = Class116_Sub3.method1881(5);
         }

         var2[var1] = var5 << 3 | var3;
      }

      this.anIntArray163 = new int[this.anInt162 * 8];

      for(var1 = 0; var1 < this.anInt162 * 8; ++var1) {
         this.anIntArray163[var1] = (var2[var1 >> 3] & 1 << (var1 & 7)) != 0?Class116_Sub3.method1881(8):-1;
      }

   }
}
