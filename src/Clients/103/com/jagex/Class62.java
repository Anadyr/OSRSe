package com.jagex;
import java.util.Date;

public class Class62 {

   static Class62 aClass62_796 = new Class62(2);
   public static Class62 aClass62_797 = new Class62(1);
   public int anInt799;
   static int[] anIntArray800;
   static Class62 aClass62_802 = new Class62(0);


   Class62(int var1) {
      this.anInt799 = -587344377 * var1;
   }

   public static String method916(long var0) {
      Class64.aCalendar809.setTime(new Date(var0));
      int var5 = Class64.aCalendar809.get(7);
      int var3 = Class64.aCalendar809.get(5);
      int var6 = Class64.aCalendar809.get(2);
      int var2 = Class64.aCalendar809.get(1);
      int var4 = Class64.aCalendar809.get(11);
      int var7 = Class64.aCalendar809.get(12);
      int var8 = Class64.aCalendar809.get(13);
      return Class64.aStringArray811[var5 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Class64.aStringArrayArray812[0][var6] + "-" + var2 + " " + var4 / 10 + var4 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   static final void markMiniMap(int var0, int var1, int var2, int var3, Sprite var4, Class116_Sub23_Sub20 var5, int var6) {
      if(null != var4) {
         int var7 = client.anInt3007 * -1718342721 + -1916997753 * client.anInt2929 & 2047;
         int var10 = var2 * var2 + var3 * var3;
         if(var10 <= 6400) {
            int var9 = Texture.anIntArray2708[var7];
            int var8 = Texture.anIntArray2713[var7];
            var9 = 256 * var9 / (client.anInt3009 * -806982331 + 256);
            var8 = var8 * 256 / (-806982331 * client.anInt3009 + 256);
            int var11 = var9 * var3 + var2 * var8 >> 16;
            int var12 = var8 * var3 - var9 * var2 >> 16;
            if(var10 > 2500) {
               var4.raster(662480183 * var5.anInt2516 / 2 + var11 - var4.anInt2725 / 2, -988977157 * var5.anInt2518 / 2 - var12 - var4.anInt2726 / 2, var0, var1, 662480183 * var5.anInt2516, var5.anInt2518 * -988977157, var5.anIntArray2513, var5.anIntArray2512);
            } else {
               var4.drawSprite(var11 + 662480183 * var5.anInt2516 / 2 + var0 - var4.anInt2725 / 2, var5.anInt2518 * -988977157 / 2 + var1 - var12 - var4.anInt2726 / 2);
            }

         }
      }
   }
}
