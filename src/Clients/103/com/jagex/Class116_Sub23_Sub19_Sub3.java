package com.jagex;

public final class Class116_Sub23_Sub19_Sub3 extends DrawingArea {

   public int[] anIntArray2761;
   public byte[] aByteArray2762;
   public int anInt2763;
   public int anInt2764;
   public int anInt2765;
   public int anInt2766;
   public int anInt2767;
   public int anInt2768;

   public void method3353(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anIntArray2761.length; ++var4) {
         int var5 = this.anIntArray2761[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var7 = this.anIntArray2761[var4] >> 8 & 255;
         var7 += var2;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         int var6 = this.anIntArray2761[var4] & 255;
         var6 += var3;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         this.anIntArray2761[var4] = (var5 << 16) + (var7 << 8) + var6;
      }

   }

   static void method3355(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         byte var11;
         int var12;
         for(var12 = var9; var12 < 0; ++var12) {
            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }

            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }
         }

         for(var12 = var5; var12 < 0; ++var12) {
            var11 = var1[var3++];
            if(var11 != 0) {
               var0[var4++] = var2[var11 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method3359(int var1, int var2) {
      var1 += this.anInt2766;
      var2 += this.anInt2765;
      int var4 = var1 + var2 * width;
      int var9 = 0;
      int var3 = this.anInt2764;
      int var5 = this.anInt2763;
      int var7 = width - var5;
      int var8 = 0;
      int var6;
      if(var2 < topY) {
         var6 = topY - var2;
         var3 -= var6;
         var2 = topY;
         var9 += var6 * var5;
         var4 += var6 * width;
      }

      if(var2 + var3 > bottomY) {
         var3 -= var2 + var3 - bottomY;
      }

      if(var1 < topX) {
         var6 = topX - var1;
         var5 -= var6;
         var1 = topX;
         var9 += var6;
         var4 += var6;
         var8 += var6;
         var7 += var6;
      }

      if(var1 + var5 > bottomX) {
         var6 = var1 + var5 - bottomX;
         var5 -= var6;
         var8 += var6;
         var7 += var6;
      }

      if(var5 > 0 && var3 > 0) {
         method3355(rasterPixels, this.aByteArray2762, this.anIntArray2761, var9, var4, var5, var3, var7, var8);
      }
   }

   public void method3360() {
      if(this.anInt2763 != this.anInt2767 || this.anInt2764 != this.anInt2768) {
         byte[] var3 = new byte[this.anInt2767 * this.anInt2768];
         int var4 = 0;

         for(int var1 = 0; var1 < this.anInt2764; ++var1) {
            for(int var2 = 0; var2 < this.anInt2763; ++var2) {
               var3[var2 + this.anInt2766 + (var1 + this.anInt2765) * this.anInt2767] = this.aByteArray2762[var4++];
            }
         }

         this.aByteArray2762 = var3;
         this.anInt2763 = this.anInt2767;
         this.anInt2764 = this.anInt2768;
         this.anInt2766 = 0;
         this.anInt2765 = 0;
      }
   }

}
