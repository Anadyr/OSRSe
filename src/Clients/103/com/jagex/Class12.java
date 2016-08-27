package com.jagex;

public class Class12 {

   int[][][] anIntArrayArrayArray193 = new int[2][2][4];
   int[][][] anIntArrayArrayArray195 = new int[2][2][4];
   int[] anIntArray196 = new int[2];
   static float[][] aFloatArrayArray197 = new float[2][8];
   static int[][] anIntArrayArray198 = new int[2][8];
   static float aFloat199;
   static int anInt200;
   int[] anIntArray202 = new int[2];


   int method210(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.anIntArray196[0] + (float)(this.anIntArray196[1] - this.anIntArray196[0]) * var2;
         var3 *= 0.0030517578F;
         aFloat199 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         anInt200 = (int)(aFloat199 * 65536.0F);
      }

      if(this.anIntArray202[var1] == 0) {
         return 0;
      } else {
         var3 = this.method211(var1, 0, var2);
         aFloatArrayArray197[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method218(var1, 0, var2));
         aFloatArrayArray197[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.anIntArray202[var1]; ++var4) {
            var3 = this.method211(var1, var4, var2);
            float var6 = -2.0F * var3 * (float)Math.cos((double)this.method218(var1, var4, var2));
            float var7 = var3 * var3;
            aFloatArrayArray197[var1][var4 * 2 + 1] = aFloatArrayArray197[var1][var4 * 2 - 1] * var7;
            aFloatArrayArray197[var1][var4 * 2] = aFloatArrayArray197[var1][var4 * 2 - 1] * var6 + aFloatArrayArray197[var1][var4 * 2 - 2] * var7;

            for(int var5 = var4 * 2 - 1; var5 >= 2; --var5) {
               aFloatArrayArray197[var1][var5] += aFloatArrayArray197[var1][var5 - 1] * var6 + aFloatArrayArray197[var1][var5 - 2] * var7;
            }

            aFloatArrayArray197[var1][1] += aFloatArrayArray197[var1][0] * var6 + var7;
            aFloatArrayArray197[var1][0] += var6;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.anIntArray202[0] * 2; ++var4) {
               aFloatArrayArray197[0][var4] *= aFloat199;
            }
         }

         for(var4 = 0; var4 < this.anIntArray202[var1] * 2; ++var4) {
            anIntArrayArray198[var1][var4] = (int)(aFloatArrayArray197[var1][var4] * 65536.0F);
         }

         return this.anIntArray202[var1] * 2;
      }
   }

   float method211(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray195[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray195[var1][1][var2] - this.anIntArrayArrayArray195[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float method212(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   final void method215(Packet var1, MidiSeq var2) {
      int var3 = var1.readSignedByte(1708176767);
      this.anIntArray202[0] = var3 >> 4;
      this.anIntArray202[1] = var3 & 15;
      if(var3 != 0) {
         this.anIntArray196[0] = var1.readUnsignedShort(656652422);
         this.anIntArray196[1] = var1.readUnsignedShort(1009093508);
         int var6 = var1.readSignedByte(1708176767);

         int var4;
         int var5;
         for(var4 = 0; var4 < 2; ++var4) {
            for(var5 = 0; var5 < this.anIntArray202[var4]; ++var5) {
               this.anIntArrayArrayArray193[var4][0][var5] = var1.readUnsignedShort(798475648);
               this.anIntArrayArrayArray195[var4][0][var5] = var1.readUnsignedShort(277675887);
            }
         }

         for(var4 = 0; var4 < 2; ++var4) {
            for(var5 = 0; var5 < this.anIntArray202[var4]; ++var5) {
               if((var6 & 1 << var4 * 4 << var5) != 0) {
                  this.anIntArrayArrayArray193[var4][1][var5] = var1.readUnsignedShort(358945024);
                  this.anIntArrayArrayArray195[var4][1][var5] = var1.readUnsignedShort(290341204);
               } else {
                  this.anIntArrayArrayArray193[var4][1][var5] = this.anIntArrayArrayArray193[var4][0][var5];
                  this.anIntArrayArrayArray195[var4][1][var5] = this.anIntArrayArrayArray195[var4][0][var5];
               }
            }
         }

         if(var6 != 0 || this.anIntArray196[1] != this.anIntArray196[0]) {
            var2.method278(var1);
         }
      } else {
         int[] var7 = this.anIntArray196;
         this.anIntArray196[1] = 0;
         var7[0] = 0;
      }

   }

   float method218(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray193[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray193[var1][1][var2] - this.anIntArrayArrayArray193[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method212(var4);
   }

}
