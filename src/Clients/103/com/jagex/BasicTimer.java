package com.jagex;

public class BasicTimer extends Timer {

   int anInt1890 = -1470624512;
   long aLong1891 = Class116_Sub5.method1929(-1399179239) * -7851503190461573869L;
   long[] aLongArray1892 = new long[10];
   int anInt1894 = 0;
   int anInt1895;
   int anInt1896 = -1663734701;

   void reset(int var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.aLongArray1892[var2] = 0L;
      }

   }

   int method1085(int var1, int var2, byte var3) {
      int var4 = this.anInt1890 * -897075515;
      int var5 = this.anInt1896 * -546326565;
      this.anInt1890 = 155660092;
      this.anInt1896 = -1663734701;
      this.aLong1891 = Class116_Sub5.method1929(1791711458) * -7851503190461573869L;
      if(this.aLongArray1892[1407235087 * this.anInt1895] == 0L) {
         this.anInt1890 = var4 * -1817683955;
         this.anInt1896 = -1663734701 * var5;
      } else if(40353379429776667L * this.aLong1891 > this.aLongArray1892[1407235087 * this.anInt1895]) {
         this.anInt1890 = (int)((long)(2560 * var1) / (this.aLong1891 * 40353379429776667L - this.aLongArray1892[1407235087 * this.anInt1895])) * -1817683955;
      }

      if(this.anInt1890 * -897075515 < 25) {
         this.anInt1890 = 1802541381;
      }

      if(-897075515 * this.anInt1890 > 256) {
         this.anInt1890 = -1470624512;
         this.anInt1896 = -1663734701 * (int)((long)var1 - (40353379429776667L * this.aLong1891 - this.aLongArray1892[this.anInt1895 * 1407235087]) / 10L);
      }

      if(-546326565 * this.anInt1896 > var1) {
         this.anInt1896 = var1 * -1663734701;
      }

      this.aLongArray1892[1407235087 * this.anInt1895] = this.aLong1891 * 40353379429776667L;
      this.anInt1895 = (1407235087 * this.anInt1895 + 1) % 10 * 1917565679;
      int var6;
      if(-546326565 * this.anInt1896 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if(0L != this.aLongArray1892[var6]) {
               this.aLongArray1892[var6] += (long)(this.anInt1896 * -546326565);
            }
         }
      }

      if(this.anInt1896 * -546326565 < var2) {
         this.anInt1896 = var2 * -1663734701;
      }

      Friend.method1836((long) (this.anInt1896 * -546326565));

      for(var6 = 0; this.anInt1894 * -1165867281 < 256; this.anInt1894 += -1117782645 * this.anInt1890) {
         ++var6;
      }

      this.anInt1894 = (this.anInt1894 * -1165867281 & 255) * -784357361;
      return var6;
   }

   BasicTimer() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.aLongArray1892[var1] = this.aLong1891 * 40353379429776667L;
      }

   }
   public static Class116_Sub23_Sub13 method2216(int var0, int var1) {
      Class116_Sub23_Sub13 var2 = (Class116_Sub23_Sub13)Class116_Sub23_Sub13.aClass123_2420.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub13.aClass99_2423.method1394(19, var0, -1810551098);
         var2 = new Class116_Sub23_Sub13();
         if(var3 != null) {
            var2.method2657(new Buffer(var3), (byte)80);
         }

         Class116_Sub23_Sub13.aClass123_2420.method1633(var2, (long)var0);
         return var2;
      }
   }

   public static boolean method2217(char var0, int var1) {
      return var0 >= 48 && var0 <= 57;
   }

   static final void method2218(int var0, int var1, int var2) {
      int var3 = Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3455(Class91.aString1200);

      int var4;
      int var5;
      for(var4 = 0; var4 < client.anInt3075 * 1768430155; ++var4) {
         var5 = Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3455(Class30.method587(var4, -1802820835));
         if(var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = 756648549 * client.anInt3075 + 22;
      var5 = var0 - var3 / 2;
      if(var3 + var5 > Class42.clientWidth * -452716157) {
         var5 = -452716157 * Class42.clientWidth - var3;
      }

      if(var5 < 0) {
         var5 = 0;
      }

      int var6 = var1;
      if(var1 + var4 > 674167779 * Class116_Sub16.clientHeight) {
         var6 = 674167779 * Class116_Sub16.clientHeight - var4;
      }

      if(var6 < 0) {
         var6 = 0;
      }

      client.aBool3074 = true;
      Class8.anInt131 = var5 * -947513225;
      Class116_Sub23_Sub6.anInt2286 = -919188011 * var6;
      Class4.anInt50 = 1685804945 * var3;
      Class4.anInt49 = 1989334774 + 423879157 * client.anInt3075;
   }
}
