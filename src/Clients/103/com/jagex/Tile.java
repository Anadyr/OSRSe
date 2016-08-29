package com.jagex;
import java.awt.Canvas;

public final class Tile extends Node {

   int anInt1851 = 0;
   boolean aBool1852;
   TileObj5[] obj5s = new TileObj5[5];
   int anInt1854;
   Class38 aClass38_1855;
   Class46 aClass46_1856;
   Class40 aClass40_1857;
   static byte[][] aByteArrayArray1858;
   Class22 aClass22_1859;
   Class48 aClass48_1860;
   int anInt1861;
   int anInt1862;
   int[] anIntArray1863 = new int[5];
   int anInt1864;
   int anInt1865;
   boolean aBool1866;
   boolean aBool1867;
   Class31 aClass31_1868;
   int anInt1869;
   int anInt1870;
   int anInt1871;
   int anInt1872;
   Tile aTile_1873;
   int anInt1874;
   public static Canvas aCanvas1875;


   public static String method1985(CharSequence[] var0, int var1, int var2, int var3) {
      if(0 == var2) {
         return "";
      } else if(1 == var2) {
         CharSequence var9 = var0[var1];
         return var9 == null?"null":var9.toString();
      } else {
         int var5 = var1 + var2;
         int var4 = 0;

         for(int var6 = var1; var6 < var5; ++var6) {
            CharSequence var8 = var0[var6];
            if(var8 == null) {
               var4 += 4;
            } else {
               var4 += var8.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var4);

         for(int var11 = var1; var11 < var5; ++var11) {
            CharSequence var7 = var0[var11];
            if(var7 == null) {
               var10.append("null");
            } else {
               var10.append(var7);
            }
         }

         return var10.toString();
      }
   }

   public static boolean method1986(char var0, int var1) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   Tile(int var1, int var2, int var3) {
      this.anInt1874 = (this.anInt1870 = var1 * 1947863287) * -1721304699;
      this.anInt1862 = 1788229931 * var2;
      this.anInt1869 = -512286351 * var3;
   }

   public static String method1987(byte[] var0, int var1, int var2, byte var3) {
      char[] var4 = new char[var2];
      int var8 = 0;

      for(int var7 = 0; var7 < var2; ++var7) {
         int var5 = var0[var1 + var7] & 255;
         if(0 != var5) {
            if(var5 >= 128 && var5 < 160) {
               char var6 = Class97.aCharArray1374[var5 - 128];
               if(var6 == 0) {
                  var6 = 63;
               }

               var5 = var6;
            }

            var4[var8++] = (char)var5;
         }
      }

      return new String(var4, 0, var8);
   }
}
