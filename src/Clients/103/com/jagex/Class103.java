package com.jagex;

public final class Class103 {

   public static char[] lowercase = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

   public static void method1445(int var0) {
      Class108.aClass123_1463.method1635();
   }

   Class103() throws Throwable {
      throw new Error();
   }

   public static Class116_Sub23_Sub6 method1448(int var0, int var1) {
      Class116_Sub23_Sub6 var2 = (Class116_Sub23_Sub6)Class116_Sub23_Sub6.aClass123_2277.method1632((long)var0);
      if(null == var2) {
         byte[] var3 = Class130.aRSIndex_1584.getFiles(5, var0, -763973017);
         var2 = new Class116_Sub23_Sub6();
         if(var3 != null) {
            var2.method2494(new Packet(var3), 1187466907);
         }

         Class116_Sub23_Sub6.aClass123_2277.method1633(var2, (long)var0);
         return var2;
      } else {
         return var2;
      }
   }

   public static int method1450(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   public static int method1451(int var0, int var1) {
      Class116_Sub23_Sub14 var2 = CacheIndex.method2226(var0, (byte) -97);
      int var5 = var2.anInt2429 * 12908597;
      int var4 = var2.anInt2427 * -585070571;
      int var3 = 984543857 * var2.anInt2436;
      int var6 = Class107.anIntArray1455[var3 - var4];
      return Class107.varpData[var5] >> var4 & var6;
   }

   public static void method1453(int var0, RSIndex var1, String var2, String var3, int var4, boolean var5, byte var6) {
      int id = var1.getFileIdForName(var2, 53507744);
      int var8 = var1.method1367(id, var3, 2037906143);
      Class128.anInt1574 = 325298615;
      Class128.aRSIndex_1575 = var1;
      Class112.anInt1485 = 18032949 * id;
      Class129.anInt1581 = -832158449 * var8;
      Class128.anInt1579 = 827167249 * var4;
      Class55.aBool715 = var5;
      Class128.anInt1577 = var0 * -1836270845;
   }

   static int method1454(int var0, byte var1) {
      ChatMessage var2 = (ChatMessage)Class37.aClass124_492.method1644((long)var0);
      return var2 == null?-1:(var2.prevNodeContainer != Class37.aClass125_491.prev ?((ChatMessage)var2.prevNodeContainer).anInt2342 * -1699577047:-1);
   }

}
