package com.jagex;
import java.io.File;

public class Class86 {

   static File aFile1006;
   static File aFile1008;
   public static Class140 aClass140_1010 = null;
   public static Class140 gameDataFile = null;
   static int anInt1013;
   public static Class140 gameDataChecksums = null;
   static int anInt1016;
   static int anInt1019;


   static void appendMessage(int type, String username, String message, int var3) {
      Class116_Sub23_Sub1.appendChat(type, username, message, (String) null, 1620854561);
   }

   static void method1167(byte var0) {
      Class145 var1 = null;

      try {
         var1 = Class40.method686("", client.aClass88_3039.aString1028, true, -1969135770);
         Packet var2 = Class116_Sub5.aClass29_1727.method570(-1909862298);
         var1.method1832(var2.payload, 0, var2.position * 314639891, 1899483568);
      } catch (Exception var4) {
         ;
      }

      try {
         if(null != var1) {
            var1.method1828(-1405825097);
         }
      } catch (Exception var3) {
         ;
      }

   }

   Class86() throws Throwable {
      throw new Error();
   }

   public static void method1172(int var0, int var1, byte var2) {
      Class116_Sub23_Sub14 var3 = CacheIndex.method2226(var0, (byte) -34);
      int var7 = 12908597 * var3.anInt2429;
      int var6 = -585070571 * var3.anInt2427;
      int var4 = var3.anInt2436 * 984543857;
      int var5 = Class107.anIntArray1455[var4 - var6];
      if(var1 < 0 || var1 > var5) {
         var1 = 0;
      }

      var5 <<= var6;
      Class107.varpData[var7] = Class107.varpData[var7] & ~var5 | var1 << var6 & var5;
   }
}
