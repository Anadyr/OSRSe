package com.jagex;
import java.util.zip.CRC32;

public class Class93 {

   public static Class71 aClass71_1335;
   public static int anInt1336 = 0;
   public static long aLong1337;
   public static int anInt1338 = 0;
   public static int anInt1339 = 0;
   public static byte aByte1340 = 0;
   public static Class121 aClass121_1342 = new Class121();
   static Class127 aClass127_1343 = new Class127(4096);
   public static int anInt1344 = 0;
   public static Class127 aClass127_1345 = new Class127(4096);
   public static int anInt1346 = 0;
   public static Buffer aClass116_Sub14_1347 = new Buffer(8);
   public static Buffer aClass116_Sub14_1348;
   public static int anInt1349 = 0;
   public static CRC32 aCRC32_1350 = new CRC32();
   public static Class99_Sub1[] aClass99_Sub1Array1351 = new Class99_Sub1[256];
   public static Class127 aClass127_1352 = new Class127(32);
   public static int anInt1353 = 0;
   public static int anInt1354 = 0;
   public static Class127 aClass127_1357 = new Class127(4096);

   static final void method1265(int var0) {
      if(1121410397 * client.anInt2987 > 0) {
         method1270(-1305917269);
      } else {
         Class116_Sub12.method1983(40, (byte)44);
         Class41.aClass71_545 = Class38.bufferIn;
         Class38.bufferIn = null;
      }
   }

   static final void method1270(int var0) {
      if(null != Class38.bufferIn) {
         Class38.bufferIn.method1001(1654855997);
         Class38.bufferIn = null;
      }

      Timer.method1092((byte) 12);
      Class116_Sub11.groundItemController.clearTiles();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.aClass58Array2996[var1].method890(462555413);
      }

      System.gc();
      Class76.method1082(2, (byte)49);
      client.anInt3172 = 277612363;
      client.aBool3159 = false;

      for(Class116_Sub8 var2 = (Class116_Sub8)Class116_Sub8.aClass117_1779.method1551(); null != var2; var2 = (Class116_Sub8)Class116_Sub8.aClass117_1779.method1553()) {
         if(null != var2.aClass116_Sub4_Sub2_1775) {
            Class50.aClass116_Sub4_Sub1_673.method2707(var2.aClass116_Sub4_Sub2_1775);
            var2.aClass116_Sub4_Sub2_1775 = null;
         }

         if(null != var2.aClass116_Sub4_Sub2_1780) {
            Class50.aClass116_Sub4_Sub1_673.method2707(var2.aClass116_Sub4_Sub2_1780);
            var2.aClass116_Sub4_Sub2_1780 = null;
         }
      }

      Class116_Sub8.aClass117_1779.method1545();
      Class116_Sub12.method1983(10, (byte)22);
   }

   Class93() throws Throwable {
      throw new Error();
   }
}
