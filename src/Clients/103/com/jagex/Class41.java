package com.jagex;

public class Class41 {

   static Class116_Sub23_Sub19_Sub4_Sub1 aClass116_Sub23_Sub19_Sub4_Sub1_537;
   static String aString538 = ",";
   static String aString539 = "|";
   static String aString540 = " (";
   static String aString541 = "<br>";
   static String aString542 = "->";
   static String aString543 = ")";
   static String aString544 = "</col>";
   static Class71 aClass71_545;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array546;
   static final int anInt547 = 2048;
   static String aString548 = "true";
   public static final int anInt549 = 164;


   public static boolean method687(Class99 var0, int var1, int var2, int var3) {
      byte[] var4 = var0.method1394(var1, var2, -107005032);
      if(null == var4) {
         return false;
      } else {
         Player.method3550(var4, (short) -28413);
         return true;
      }
   }

   static String method688(int var0) {
      return "<img=" + var0 + ">";
   }

   Class41() throws Throwable {
      throw new Error();
   }

   static String method689(int var0) {
      return "<img=" + var0 + ">";
   }

   static String method690(int var0) {
      return "<img=" + var0 + ">";
   }

   static String method691(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   public static void method692(Class99 var0, Class99 var1, byte var2) {
      Class116_Sub23_Sub2.aClass99_2187 = var0;
      client.aClass99_1618 = var1;
      Class116_Sub23_Sub2.anInt2175 = Class116_Sub23_Sub2.aClass99_2187.method1361(3, -824500445) * 1406368173;
   }

   public static RuntimeException_Sub1 method693(Throwable var0, String var1) {
      RuntimeException_Sub1 var2;
      if(var0 instanceof RuntimeException_Sub1) {
         var2 = (RuntimeException_Sub1)var0;
         var2.aString2847 = var2.aString2847 + ' ' + var1;
      } else {
         var2 = new RuntimeException_Sub1(var0, var1);
      }

      return var2;
   }

   static final void method694(Class116_Sub15 var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      if(client.aBool3017) {
         client.anInt3018 = -1954862944;
      } else {
         client.anInt3018 = 0;
      }

      client.aBool3017 = false;
      int var8;
      if(1 == Class85.anInt994 * -562612321 || !PlayerAlias.aBool1756 && -562612321 * Class85.anInt994 == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < 16 + var2) {
            var0.anInt1947 -= -1544178172;
            Class79.method1097(var0, 1395587280);
         } else if(var5 >= var1 && var5 < 16 + var1 && var6 >= var2 + var3 - 16 && var6 < var3 + var2) {
            var0.anInt1947 += -1544178172;
            Class79.method1097(var0, -1176264435);
         } else if(var5 >= var1 - client.anInt3018 * -1117204083 && var5 < var1 + 16 + client.anInt3018 * -1117204083 && var6 >= 16 + var2 && var6 < var3 + var2 - 16) {
            var8 = (var3 - 32) * var3 / var4;
            if(var8 < 8) {
               var8 = 8;
            }

            int var10 = var6 - var2 - 16 - var8 / 2;
            int var9 = var3 - 32 - var8;
            var0.anInt1947 = -1459786367 * (var10 * (var4 - var3) / var9);
            Class79.method1097(var0, 210445390);
            client.aBool3017 = true;
         }
      }

      if(0 != client.anInt3131 * -1955541359) {
         var8 = 1645211541 * var0.anInt1940;
         if(var5 >= var1 - var8 && var6 >= var2 && var5 < 16 + var1 && var6 <= var2 + var3) {
            var0.anInt1947 += -379762947 * client.anInt3131;
            Class79.method1097(var0, 975758206);
         }
      }

   }
}
