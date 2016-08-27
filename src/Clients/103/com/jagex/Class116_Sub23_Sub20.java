package com.jagex;

public class Class116_Sub23_Sub20 extends NodeContainer {

   static Class9 aClass9_2510;
   public int[] anIntArray2512;
   public int[] anIntArray2513;
   public int anInt2516;
   public int anInt2518;


   static int method2979(int var0, int var1) {
      Class5 var2 = (Class5)Class37.aMap498.get(Integer.valueOf(var0));
      return var2 == null?0:var2.method52(722826209);
   }

   public boolean method2980(int var1, int var2, int var3) {
      if(var2 >= 0 && var2 < this.anIntArray2513.length) {
         int var4 = this.anIntArray2513[var2];
         if(var1 >= var4 && var1 <= this.anIntArray2512[var2] + var4) {
            return true;
         }
      }

      return false;
   }

   Class116_Sub23_Sub20(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.anInt2516 = var1 * 995238023;
      this.anInt2518 = var2 * -1016231117;
      this.anIntArray2512 = var3;
      this.anIntArray2513 = var4;
   }
}
