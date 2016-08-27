package com.jagex;

public class Class116_Sub2_Sub1 extends Class116_Sub2 {

   public boolean aBool2438;
   int anInt2439;
   public int anInt2440;
   public int anInt2441;
   public byte[] aByteArray2442;


   public Class116_Sub2_Sub1 method2687(Class17 var1) {
      this.aByteArray2442 = var1.method285(this.aByteArray2442, 529935759);
      this.anInt2441 = var1.method281(this.anInt2441, 81738837);
      if(this.anInt2440 == this.anInt2439) {
         this.anInt2440 = this.anInt2439 = var1.method290(this.anInt2440, -782641330);
      } else {
         this.anInt2440 = var1.method290(this.anInt2440, -782641330);
         this.anInt2439 = var1.method290(this.anInt2439, -782641330);
         if(this.anInt2440 == this.anInt2439) {
            --this.anInt2440;
         }
      }

      return this;
   }

   Class116_Sub2_Sub1(int var1, byte[] var2, int var3, int var4) {
      this.anInt2441 = var1;
      this.aByteArray2442 = var2;
      this.anInt2440 = var3;
      this.anInt2439 = var4;
   }

   Class116_Sub2_Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.anInt2441 = var1;
      this.aByteArray2442 = var2;
      this.anInt2440 = var3;
      this.anInt2439 = var4;
      this.aBool2438 = var5;
   }
}
