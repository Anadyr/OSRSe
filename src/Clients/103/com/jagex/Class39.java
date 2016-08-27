package com.jagex;

public class Class39 {

   String[] aStringArray514;
   Class116_Sub23_Sub18 aClass116_Sub23_Sub18_515;
   int[] anIntArray516;
   int anInt517 = -954144041;
   static Class33 aClass33_518;
   static final int anInt519 = 128;
   static final int anInt520 = 17;
   static int[] anIntArray521;
   static final int anInt522 = 19137016;


   static final int method681(int var0, int var1, int var2) {
      int var3 = Class116_Sub23_Sub13.method2671(var0 - 1, var1 - 1, (byte)13) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 - 1, (byte)10) + Class116_Sub23_Sub13.method2671(var0 - 1, 1 + var1, (byte)-14) + Class116_Sub23_Sub13.method2671(var0 + 1, var1 + 1, (byte)-35);
      int var5 = Class116_Sub23_Sub13.method2671(var0 - 1, var1, (byte)-40) + Class116_Sub23_Sub13.method2671(1 + var0, var1, (byte)97) + Class116_Sub23_Sub13.method2671(var0, var1 - 1, (byte)-40) + Class116_Sub23_Sub13.method2671(var0, 1 + var1, (byte)-61);
      int var4 = Class116_Sub23_Sub13.method2671(var0, var1, (byte)17);
      return var4 / 4 + var5 / 8 + var3 / 16;
   }

   static void method682(int var0, byte var1) {
      Class116_Sub10 var2 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var0);
      if(var2 != null) {
         var2.unlink();
      }
   }

   static boolean method683(int var0, byte var1) {
      return var0 == 57 || 58 == var0 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   static final int method684(int var0, int var1, int var2) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }
}
