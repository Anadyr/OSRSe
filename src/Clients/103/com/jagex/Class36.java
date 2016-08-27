package com.jagex;

public class Class36 implements Interface3 {

   int anInt480 = 1123596160;
   Deque aClass117_481 = new Deque();
   int anInt482;
   int anInt483 = 0;
   double aDouble484 = 1.0D;
   Class116_Sub9[] aClass116_Sub9Array485;
   RSIndex aRSIndex_486;
   static int anInt487;
   static int anInt488;

   public void method647(double var1) {
      this.aDouble484 = var1;
      this.method653(444018119);
   }

   public int[] method21(int var1, int var2) {
      Class116_Sub9 var3 = this.aClass116_Sub9Array485[var1];
      if(null != var3) {
         if(var3.anIntArray1799 != null) {
            this.aClass117_481.addFront(var3);
            var3.aBool1800 = true;
            return var3.anIntArray1799;
         }

         boolean var4 = var3.method1954(this.aDouble484, 403475855 * this.anInt480, this.aRSIndex_486);
         if(var4) {
            if(0 == this.anInt483 * -1517992811) {
               Class116_Sub9 var5 = (Class116_Sub9)this.aClass117_481.removeLast();
               var5.method1949();
            } else {
               this.anInt483 -= 1927636669;
            }

            this.aClass117_481.addFront(var3);
            var3.aBool1800 = true;
            return var3.anIntArray1799;
         }
      }

      return null;
   }

   public boolean method16(int var1, byte var2) {
      return this.aClass116_Sub9Array485[var1].aBool1789;
   }

   public boolean method17(int var1, byte var2) {
      return 403475855 * this.anInt480 == 64;
   }

   public Class36(RSIndex var1, RSIndex var2, int var3, double var4, int var6) {
      this.aRSIndex_486 = var2;
      this.anInt482 = -393029919 * var3;
      this.anInt483 = this.anInt482 * 1019426653;
      this.aDouble484 = var4;
      this.anInt480 = 1787162991 * var6;
      int[] var7 = var1.method1404(0, (byte)0);
      int var8 = var7.length;
      this.aClass116_Sub9Array485 = new Class116_Sub9[var1.method1361(0, -824500445)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Packet var10 = new Packet(var1.getFiles(0, var7[var9], -494564858));
         this.aClass116_Sub9Array485[var7[var9]] = new Class116_Sub9(var10);
      }

   }

   public void method649(int var1, int var2) {
      for(int var3 = 0; var3 < this.aClass116_Sub9Array485.length; ++var3) {
         Class116_Sub9 var4 = this.aClass116_Sub9Array485[var3];
         if(var4 != null && 0 != var4.anInt1801 && var4.aBool1800) {
            var4.method1950(var1);
            var4.aBool1800 = false;
         }
      }

   }

   public int method15(int var1, int var2) {
      return null != this.aClass116_Sub9Array485[var1]?this.aClass116_Sub9Array485[var1].anInt1791:0;
   }

   public void method653(int var1) {
      for(int var2 = 0; var2 < this.aClass116_Sub9Array485.length; ++var2) {
         if(null != this.aClass116_Sub9Array485[var2]) {
            this.aClass116_Sub9Array485[var2].method1949();
         }
      }

      this.aClass117_481 = new Deque();
      this.anInt483 = this.anInt482 * 1019426653;
   }

}
