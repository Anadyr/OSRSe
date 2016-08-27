package com.jagex;

public class Class4 {

   int anInt45;
   int anInt46;
   int anInt47;
   String aString48;
   static int anInt49;
   static int anInt50;
   int anInt51;
   static int[] anIntArray52;

   static boolean updateGlobalPlayer(PacketBuilder var0, int var1, byte var2) {
      int var3 = var0.readBits(2, (byte) -1);
      int var4;
      int var5;
      int var7;
      int var8;
      int var9;
      int var11;
      if(0 == var3) {
         if(var0.readBits(1, (byte) -1) != 0) {
            updateGlobalPlayer(var0, var1, (byte) 0);
         }

         var5 = var0.readBits(6, (byte) -1);
         var8 = var0.readBits(6, (byte) -1);
         boolean var13 = var0.readBits(1, (byte) -1) == 1;
         if(var13) {
            Class7.anIntArray119[(Class7.anInt118 += -299545915) * 716284941 - 1] = var1;
         }

         if(null != client.globalPlayers[var1]) {
            throw new RuntimeException();
         } else {
            Player var12 = client.globalPlayers[var1] = new Player();
            var12.anInt2902 = var1 * -1055985261;
            if(Class7.aClass116_Sub14Array106[var1] != null) {
               var12.doAppearance(Class7.aClass116_Sub14Array106[var1], -112397156);
            }

            var12.anInt2631 = Class7.anIntArray103[var1] * 736533899;
            var12.anInt2603 = Class7.anIntArray102[var1] * 1611414733;
            var11 = Class7.anIntArray111[var1];
            var4 = var11 >> 28;
            var7 = var11 >> 14 & 255;
            var9 = var11 & 255;
            var12.aByteArray2628[0] = Class7.movementMode[var1];
            var12.anInt2906 = -1668953739 * (byte)var4;
            var12.method3551(var5 + (var7 << 6) - 1426698711 * Class116_Sub17.anInt2105, var8 + (var9 << 6) - 714823515 * Class33.anInt456, 512250771);
            var12.moving = false;
            return true;
         }
      } else if(var3 == 1) {
         var5 = var0.readBits(2, (byte) -1);
         var8 = Class7.anIntArray111[var1];
         Class7.anIntArray111[var1] = (var8 & 268435455) + (((var8 >> 28) + var5 & 3) << 28);
         return false;
      } else {
         int var6;
         int var10;
         if(2 == var3) {
            var5 = var0.readBits(5, (byte) -1);
            var8 = var5 >> 3;
            var10 = var5 & 7;
            var6 = Class7.anIntArray111[var1];
            var11 = (var6 >> 28) + var8 & 3;
            var4 = var6 >> 14 & 255;
            var7 = var6 & 255;
            if(0 == var10) {
               --var4;
               --var7;
            }

            if(1 == var10) {
               --var7;
            }

            if(2 == var10) {
               ++var4;
               --var7;
            }

            if(3 == var10) {
               --var4;
            }

            if(4 == var10) {
               ++var4;
            }

            if(5 == var10) {
               --var4;
               ++var7;
            }

            if(6 == var10) {
               ++var7;
            }

            if(var10 == 7) {
               ++var4;
               ++var7;
            }

            Class7.anIntArray111[var1] = (var4 << 14) + (var11 << 28) + var7;
            return false;
         } else {
            var5 = var0.readBits(18, (byte) -1);
            var8 = var5 >> 16;
            var10 = var5 >> 8 & 255;
            var6 = var5 & 255;
            var11 = Class7.anIntArray111[var1];
            var4 = (var11 >> 28) + var8 & 3;
            var7 = (var11 >> 14) + var10 & 255;
            var9 = var6 + var11 & 255;
            Class7.anIntArray111[var1] = var9 + (var7 << 14) + (var4 << 28);
            return false;
         }
      }
   }

   static void method49(RSInterface[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         RSInterface var7 = var0[var6];
         if(null != var7 && var1 == var7.parent * -1652479707) {
            Class33.method638(var7, var2, var3, var4, 285272969);
            Class116_Sub23_Sub4.method2469(var7, var2, var3, 2003239806);
            if(var7.anInt1946 * -352661099 > var7.anInt2037 * -302755437 - var7.wdth * 1645211541) {
               var7.anInt1946 = -539648889 * var7.anInt2037 - var7.wdth * -1344985599;
            }

            if(-352661099 * var7.anInt1946 < 0) {
               var7.anInt1946 = 0;
            }

            if(-1602694527 * var7.anInt1947 > 177405235 * var7.maxScrollVertical - 1227800423 * var7.heght) {
               var7.anInt1947 = -1656271437 * var7.maxScrollVertical - var7.heght * -1999090201;
            }

            if(-1602694527 * var7.anInt1947 < 0) {
               var7.anInt1947 = 0;
            }

            if(var7.type * -1305917269 == 0) {
               ObjectDefinition.method2435(var0, var7, var4, -1212205195);
            }
         }
      }

   }
}
