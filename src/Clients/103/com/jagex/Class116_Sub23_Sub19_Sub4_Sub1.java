package com.jagex;

public final class Class116_Sub23_Sub19_Sub4_Sub1 extends TextDrawingArea {

   public Class116_Sub23_Sub19_Sub4_Sub1(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public Class116_Sub23_Sub19_Sub4_Sub1(byte[] var1) {
      super(var1);
   }

   final void method3535(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * width;
      int var8 = width - var4;
      int var10 = 0;
      int var11 = 0;
      int var9;
      if(var3 < topY) {
         var9 = topY - var3;
         var5 -= var9;
         var3 = topY;
         var11 += var9 * var4;
         var7 += var9 * width;
      }

      if(var3 + var5 > bottomY) {
         var5 -= var3 + var5 - bottomY;
      }

      if(var2 < topX) {
         var9 = topX - var2;
         var4 -= var9;
         var2 = topX;
         var11 += var9;
         var7 += var9;
         var10 += var9;
         var8 += var9;
      }

      if(var2 + var4 > bottomX) {
         var9 = var2 + var4 - bottomX;
         var4 -= var9;
         var10 += var9;
         var8 += var9;
      }

      if(var4 > 0 && var5 > 0) {
         method3525(rasterPixels, var1, var6, var11, var7, var4, var5, var8, var10);
      }
   }

   final void method3530(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * width;
      int var12 = width - var4;
      int var9 = 0;
      int var11 = 0;
      int var10;
      if(var3 < topY) {
         var10 = topY - var3;
         var5 -= var10;
         var3 = topY;
         var11 += var10 * var4;
         var8 += var10 * width;
      }

      if(var3 + var5 > bottomY) {
         var5 -= var3 + var5 - bottomY;
      }

      if(var2 < topX) {
         var10 = topX - var2;
         var4 -= var10;
         var2 = topX;
         var11 += var10;
         var8 += var10;
         var9 += var10;
         var12 += var10;
      }

      if(var2 + var4 > bottomX) {
         var10 = var2 + var4 - bottomX;
         var4 -= var10;
         var9 += var10;
         var12 += var10;
      }

      if(var4 > 0 && var5 > 0) {
         method3477(rasterPixels, var1, var6, var11, var8, var4, var5, var12, var9, var7);
      }
   }

}
