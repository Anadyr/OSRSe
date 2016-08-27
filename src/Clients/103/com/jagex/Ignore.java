package com.jagex;

public class Ignore {

   String lastName;
   String currentName;


   static Class116_Sub23_Sub19_Sub3[] modIcons;
   static Class116_Sub23_Sub19_Sub3 aClass116_Sub23_Sub19_Sub3_343;

   public static byte cipherChar(char var0, int var1) {
      byte var2;
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 == 8364) {
            var2 = -128;
         } else if(8218 == var0) {
            var2 = -126;
         } else if(var0 == 402) {
            var2 = -125;
         } else if(var0 != 8222) {
            if(8230 == var0) {
               var2 = -123;
            } else if(var0 == 8224) {
               var2 = -122;
            } else if(var0 == 8225) {
               var2 = -121;
            } else if(710 == var0) {
               var2 = -120;
            } else if(8240 == var0) {
               var2 = -119;
            } else if(var0 == 352) {
               var2 = -118;
            } else if(8249 == var0) {
               var2 = -117;
            } else if(338 == var0) {
               var2 = -116;
            } else if(381 == var0) {
               var2 = -114;
            } else if(8216 == var0) {
               var2 = -111;
            } else if(var0 == 8217) {
               var2 = -110;
            } else if(var0 == 8220) {
               var2 = -109;
            } else if(var0 == 8221) {
               var2 = -108;
            } else if(var0 == 8226) {
               var2 = -107;
            } else if(8211 == var0) {
               var2 = -106;
            } else if(var0 == 8212) {
               var2 = -105;
            } else if(var0 == 732) {
               var2 = -104;
            } else if(8482 == var0) {
               var2 = -103;
            } else if(353 == var0) {
               var2 = -102;
            } else if(var0 == 8250) {
               var2 = -101;
            } else if(339 == var0) {
               var2 = -100;
            } else if(var0 == 382) {
               var2 = -98;
            } else if(var0 == 376) {
               var2 = -97;
            } else {
               var2 = 63;
            }
         } else {
            var2 = -124;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   public static Class116_Sub23_Sub19_Sub4_Sub1 method530(byte[] var0, int var1) {
      if(null == var0) {
         return null;
      } else {
         Class116_Sub23_Sub19_Sub4_Sub1 var2 = new Class116_Sub23_Sub19_Sub4_Sub1(var0, Class8.anIntArray124, Class116_Sub23_Sub15.anIntArray2444, Class8.anIntArray125, Class8.anIntArray126, Class97.anIntArray1372, Mob.aByteArrayArray2877);
         Class76.method1080((byte)121);
         return var2;
      }
   }

}
