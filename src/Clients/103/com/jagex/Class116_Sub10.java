package com.jagex;

public class Class116_Sub10 extends Node {

   static Class127 aClass127_1803 = new Class127(32);
   int[] anIntArray1804 = new int[]{0};
   int[] anIntArray1812 = new int[]{-1};


   public static final boolean method1960(String var0, String var1, String var2, String var3, int var4) {
	   return (null != var0 && var2 != null) && (!var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2));
   }


   static final void method1971(boolean var0, byte var1) {
      Class50.method777(-1074177723 * client.anInt3200, -452716157 * Class42.clientWidth, 674167779 * Class116_Sub16.clientHeight, var0, (short)-256);
   }

   public static void method1972(Class99 var0, byte var1) {
      Class116_Sub23_Sub5.aClass99_2267 = var0;
   }

   static final void readPlayerHashLocations(BitBuffer buffer, int var1) {
      buffer.resetBitPos((byte) 81);
      int var2 = 1467227105 * client.playerIndex;
      Player var3 = Class79.aPlayer_909 = client.globalPlayers[var2] = new Player();
      var3.anInt2902 = -1055985261 * var2;
      int var4 = buffer.readBits(30, (byte) -1);
      byte var8 = (byte)(var4 >> 28);
      int var5 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
	   var3.xMovementSteps[0] = var5 - 1426698711 * Class116_Sub17.clickX;
	   var3.anInt2609 = ((var3.xMovementSteps[0] << 7) + (var3.method3561(-1030060260) << 6)) * 1705682711;
	   var3.yMovementSteps[0] = var7 - Class33.clickY * 714823515;
	   var3.anInt2579 = ((var3.yMovementSteps[0] << 7) + (var3.method3561(1984644454) << 6)) * 1421914369;
	   Class116_Sub11.anInt1819 = (var3.anInt2906 = var8 * -1668953739) * -1941196453;
      if(null != Class7.aClass116_Sub14Array106[var2]) {
         var3.method3549(Class7.aClass116_Sub14Array106[var2], 2095903438);
      }

      Class7.anInt107 = 0;
      Class7.anIntArray108[(Class7.anInt107 += -864270383) * -334270159 - 1] = var2;
      Class7.gpiPlayerFlag[var2] = 0;
      Class7.anInt109 = 0;

      for(int var6 = 1; var6 < 2048; ++var6) {
         if(var6 != var2) {
            int var9 = buffer.readBits(18, (byte) -1);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 255;
            int var12 = var9 & 255;
            Class7.anIntArray111[var6] = (var10 << 28) + (var11 << 14) + var12;
            Class7.anIntArray103[var6] = 0;
            Class7.anIntArray102[var6] = -1;
            Class7.playerIndexes[(Class7.anInt109 += 2065293525) * 1824807037 - 1] = var6;
            Class7.gpiPlayerFlag[var6] = 0;
         }
      }

      buffer.startBitAccess((byte) 104);
   }
}
