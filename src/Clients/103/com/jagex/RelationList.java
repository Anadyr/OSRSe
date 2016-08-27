package com.jagex;

public class RelationList {

   int anInt666;
   boolean aBool667;
   int anInt668;
   boolean aBool669;
   String username;
   String lastUsername;


   static int anInt671;
   static int anInt672;
   static Class116_Sub4_Sub1 aClass116_Sub4_Sub1_673;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array678;


   static final void method774(int var0) {
      for(int var1 = 0; var1 < client.npcCount * 727116725; ++var1) {
         int var2 = client.npcIndicies[var1];
         Mob var3 = client.aMobArray2972[var2];
         if(var3 != null) {
            Class80.method1100(var3, -691506967 * var3.definition.tileSize, -1946368051);
         }
      }

   }

   static final void method775(Entity var0, int var1) {
      int var2 = -2112283241 * var0.anInt2599 - -1040073859 * client.anInt2943;
      int var4 = -777033600 * var0.forceMovex1 + -2013728192 * var0.tileSize;
      int var3 = -2013728192 * var0.tileSize + 20962432 * var0.forceMovey1;
      var0.anInt2609 += (var4 - 1272643751 * var0.anInt2609) / var2 * 1705682711;
      var0.anInt2579 += 1421914369 * ((var3 - -1801433343 * var0.anInt2579) / var2);
      var0.anInt2635 = 0;
      var0.anInt2631 = -1269181295 * var0.anInt2625;
   }

   static final void method776(String var0, String var1, int var2, int var3, int var4, int var5, byte var6) {
      if(!client.aBool3074) {
         if(client.anInt3075 * 1768430155 < 500) {
            client.aStringArray3080[client.anInt3075 * 1768430155] = var0;
            client.aStringArray3184[client.anInt3075 * 1768430155] = var1;
            client.anIntArray3037[1768430155 * client.anInt3075] = var2;
            client.anIntArray3079[1768430155 * client.anInt3075] = var3;
            client.anIntArray3076[client.anInt3075 * 1768430155] = var4;
            client.anIntArray2932[1768430155 * client.anInt3075] = var5;
            client.anInt3075 += 1937006435;
         }

      }
   }

   static final void method777(int var0, int var1, int var2, boolean var3, short var4) {
      if(Class116_Sub23_Sub2.loadInterface(var0, -1006212225)) {
         Class4.method49(RSInterface.mainInterfaceArray[var0], -1, var1, var2, var3, 917810794);
      }
   }

   public static Class116_Sub23_Sub11 method778(int var0, byte var1) {
      Class116_Sub23_Sub11 var2 = (Class116_Sub23_Sub11)Class116_Sub23_Sub11.aClass123_2356.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub11.aRSIndex_2378.getFiles(10, var0, -1971756020);
         var2 = new Class116_Sub23_Sub11();
         var2.anInt2359 = var0 * 763132019;
         if(null != var3) {
            var2.method2588(new Packet(var3), (byte)124);
         }

         var2.method2587(-1258932278);
         if(-1 != var2.anInt2392 * -507524473) {
            var2.method2636(method778(-507524473 * var2.anInt2392, (byte)70), method778(-322771797 * var2.anInt2399, (byte)70), -30612602);
         }

         if(125334003 * var2.anInt2401 != -1) {
            var2.method2600(method778(125334003 * var2.anInt2401, (byte)70), method778(1428864645 * var2.anInt2381, (byte)70), -1829870448);
         }

         if(!Class107.aBool1456 && var2.aBool2374) {
            var2.aString2361 = Class91.aString1160;
            var2.aBool2380 = false;
            var2.aStringArray2391 = null;
            var2.aStringArray2387 = null;
            var2.anInt2398 = 0;
         }

         Class116_Sub23_Sub11.aClass123_2356.method1633(var2, (long)var0);
         return var2;
      }
   }

   static void method779(int var0, int var1, byte var2) {
      client.rsaBuffer.startPacket(2, (byte) 76);
      client.rsaBuffer.writeLEInt(var0, (byte) 12);
      client.rsaBuffer.writeShort(var1, -1666096010);
   }
}
