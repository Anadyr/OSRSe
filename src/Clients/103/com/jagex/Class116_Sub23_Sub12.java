package com.jagex;

public class Class116_Sub23_Sub12 extends NodeContainer {

   public int anInt2405 = -978001323;
   public static Class123 aClass123_2406 = new Class123(64);
   public int anInt2407;
   public int anInt2408;
   public int anInt2409 = 0;
   public int anInt2410 = 511239711;
   public int anInt2411;
   public boolean aBool2412 = true;
   public int anInt2413;
   public int anInt2414;
   public int anInt2415;
   public static Class99 aClass99_2416;

   void method2641(Buffer var1, int var2, int var3) {
      while(true) {
         int var4 = var1.readSignedByte(1708176767);
         if(0 == var4) {
            return;
         }

         this.method2642(var1, var4, var2, (byte)0);
      }
   }

   void method2642(Buffer var1, int var2, int var3, byte var4) {
      if(var2 == 1) {
         this.anInt2409 = var1.readMedium((byte) 15) * 1304176145;
      } else if(var2 == 2) {
         this.anInt2405 = var1.readSignedByte(1708176767) * 978001323;
      } else if(5 == var2) {
         this.aBool2412 = false;
      } else if(var2 == 7) {
         this.anInt2410 = var1.readMedium((byte) 15) * -511239711;
      } else if(var2 == 8) {
         ;
      }

   }

   void method2643(int var1, int var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var9 = (double)(var1 >> 8 & 255) / 256.0D;
      double var13 = (double)(var1 & 255) / 256.0D;
      double var5 = var3;
      if(var9 < var3) {
         var5 = var9;
      }

      if(var13 < var5) {
         var5 = var13;
      }

      double var7 = var3;
      if(var9 > var3) {
         var7 = var9;
      }

      if(var13 > var7) {
         var7 = var13;
      }

      double var15 = 0.0D;
      double var11 = 0.0D;
      double var17 = (var7 + var5) / 2.0D;
      if(var5 != var7) {
         if(var17 < 0.5D) {
            var11 = (var7 - var5) / (var5 + var7);
         }

         if(var17 >= 0.5D) {
            var11 = (var7 - var5) / (2.0D - var7 - var5);
         }

         if(var7 == var3) {
            var15 = (var9 - var13) / (var7 - var5);
         } else if(var9 == var7) {
            var15 = 2.0D + (var13 - var3) / (var7 - var5);
         } else if(var7 == var13) {
            var15 = (var3 - var9) / (var7 - var5) + 4.0D;
         }
      }

      var15 /= 6.0D;
      this.anInt2414 = (int)(var15 * 256.0D) * 817568045;
      this.anInt2407 = 1558847427 * (int)(var11 * 256.0D);
      this.anInt2413 = 765744919 * (int)(256.0D * var17);
      if(-958248725 * this.anInt2407 < 0) {
         this.anInt2407 = 0;
      } else if(this.anInt2407 * -958248725 > 255) {
         this.anInt2407 = -1925864643;
      }

      if(this.anInt2413 * 1921798311 < 0) {
         this.anInt2413 = 0;
      } else if(1921798311 * this.anInt2413 > 255) {
         this.anInt2413 = 1991426025;
      }

   }

   void method2645(int var1) {
      if(-1 != this.anInt2410 * -105977311) {
         this.method2643(this.anInt2410 * -105977311, 982718558);
         this.anInt2408 = 61882287 * this.anInt2414;
         this.anInt2415 = 1723377719 * this.anInt2407;
         this.anInt2411 = this.anInt2413 * 1293569841;
      }

      this.method2643(2024508145 * this.anInt2409, 982718558);
   }

   public static Class116_Sub23_Sub12 method2649(int var0) {
      Class116_Sub23_Sub12 var1 = (Class116_Sub23_Sub12)aClass123_2406.method1632((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = aClass99_2416.method1394(4, var0, -829714727);
         var1 = new Class116_Sub23_Sub12();
         if(var2 != null) {
            var1.method2641(new Buffer(var2), var0, -496265853);
         }

         var1.method2645(1730025247);
         aClass123_2406.method1633(var1, (long)var0);
         return var1;
      }
   }

   public static String method2655(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var4 = 0;

            for(long var5 = var0; var5 != 0L; var5 /= 37L) {
               ++var4;
            }

            StringBuilder var2;
            char var3;
            for(var2 = new StringBuilder(var4); 0L != var0; var2.append(var3)) {
               long var7 = var0;
               var0 /= 37L;
               var3 = Class103.lowercase[(int)(var7 - 37L * var0)];
               if(95 == var3) {
                  int var9 = var2.length() - 1;
                  var2.setCharAt(var9, Character.toUpperCase(var2.charAt(var9)));
                  var3 = 160;
               }
            }

            var2.reverse();
            var2.setCharAt(0, Character.toUpperCase(var2.charAt(0)));
            return var2.toString();
         }
      } else {
         return null;
      }
   }

   public static Class116_Sub23_Sub12 method2656(int var0) {
      Class116_Sub23_Sub12 var1 = (Class116_Sub23_Sub12)aClass123_2406.method1632((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = aClass99_2416.method1394(4, var0, -1900088754);
         var1 = new Class116_Sub23_Sub12();
         if(var2 != null) {
            var1.method2641(new Buffer(var2), var0, 580334286);
         }

         var1.method2645(1957678668);
         aClass123_2406.method1633(var1, (long)var0);
         return var1;
      }
   }
}
