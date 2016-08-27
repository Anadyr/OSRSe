package com.jagex;
import java.util.zip.CRC32;

public class Class93 {

   public static RSInputStream aClass71_1335;
   public static int anInt1336 = 0;
   public static long aLong1337;
   public static int anInt1338 = 0;
   public static int anInt1339 = 0;
   public static byte aByte1340 = 0;
   public static Class121 aClass121_1342 = new Class121();
   static Hashtable aHashtable_1343 = new Hashtable(4096);
   public static int anInt1344 = 0;
   public static Hashtable aHashtable_1345 = new Hashtable(4096);
   public static int anInt1346 = 0;
   public static Packet aClass116_Sub14_1347 = new Packet(8);
   public static Packet aClass116_Sub14_1348;
   public static int anInt1349 = 0;
   public static CRC32 aCRC32_1350 = new CRC32();
   public static CacheIndex[] aCacheIndexArray1351 = new CacheIndex[256];
   public static Hashtable aHashtable_1352 = new Hashtable(32);
   public static int anInt1353 = 0;
   public static int anInt1354 = 0;
   public static Hashtable aHashtable_1357 = new Hashtable(4096);

   static final void method1265(int var0) {
      if(1121410397 * client.anInt2987 > 0) {
         method1270(-1305917269);
      } else {
         Class116_Sub12.method1983(40, (byte)44);
         Class41.aClass71_545 = Class38.streamBuffer;
         Class38.streamBuffer = null;
      }
   }

   static final void method1270(int var0) {
      if(null != Class38.streamBuffer) {
         Class38.streamBuffer.sync(1654855997);
         Class38.streamBuffer = null;
      }

      Timer.method1092((byte) 12);
      GameInterface.region.clearTiles();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.aClass58Array2996[var1].method890(462555413);
      }

      System.gc();
      Class76.method1082(2, (byte)49);
      client.anInt3172 = 277612363;
      client.aBool3159 = false;

      for(Class116_Sub8 var2 = (Class116_Sub8)Class116_Sub8.aClass117_1779.getFirst(); null != var2; var2 = (Class116_Sub8)Class116_Sub8.aClass117_1779.getNext()) {
         if(null != var2.aClass116_Sub4_Sub2_1775) {
            RelationList.aClass116_Sub4_Sub1_673.method2707(var2.aClass116_Sub4_Sub2_1775);
            var2.aClass116_Sub4_Sub2_1775 = null;
         }

         if(null != var2.aClass116_Sub4_Sub2_1780) {
            RelationList.aClass116_Sub4_Sub1_673.method2707(var2.aClass116_Sub4_Sub2_1780);
            var2.aClass116_Sub4_Sub2_1780 = null;
         }
      }

      Class116_Sub8.aClass117_1779.clear();
      Class116_Sub12.method1983(10, (byte)22);
   }

   Class93() throws Throwable {
      throw new Error();
   }
}
