package com.jagex;

public final class TileObj5 {

   public Animable anAnimable5;
   int anInt583;
   int anInt584;
   int anInt585;
   int anInt586 = 0;
   int anInt587;
   int anInt588;
   int anInt589;
   int anInt590;
   int anInt591;
   int anInt592;
   int anInt593;
   public int anInt594 = 0;
   int anInt595;


   static void method698(int var0, int var1, int var2, int var3) {
      if(client.anInt3174 * 936209849 != 0 && var1 != 0 && client.anInt3176 * 2079336095 < 50) {
         client.anIntArray3177[client.anInt3176 * 2079336095] = var0;
         client.anIntArray3019[2079336095 * client.anInt3176] = var1;
         client.anIntArray2964[client.anInt3176 * 2079336095] = var2;
         client.aClass15Array3181[client.anInt3176 * 2079336095] = null;
         client.anIntArray3180[client.anInt3176 * 2079336095] = 0;
         client.anInt3176 += -857377441;
      }

   }

   static final void method699(Class1 var0, int var1) {
      if(1272643751 * Class79.aPlayer_909.anInt2609 >> 7 == -1712731251 * client.anInt3168 && -1801433343 * Class79.aPlayer_909.anInt2579 >> 7 == client.anInt3208 * -691143955) {
         client.anInt3168 = 0;
      }

      int var3 = -334270159 * Class7.anInt107;
      int[] var7 = Class7.anIntArray108;
      int var4 = var3;
      if(var0 == Class1.aClass1_4 || var0 == Class1.aClass1_2) {
         var4 = 1;
      }

      for(int var6 = 0; var6 < var4; ++var6) {
         Player var2;
         int var5;
         if(Class1.aClass1_4 == var0) {
            var2 = Class79.aPlayer_909;
            var5 = 1011012763 * Class79.aPlayer_909.anInt2902 << 14;
         } else if(var0 == Class1.aClass1_2) {
            var2 = client.globalPlayers[971766913 * client.anInt3065];
            var5 = 971766913 * client.anInt3065 << 14;
         } else {
            var2 = client.globalPlayers[var7[var6]];
            var5 = var7[var6] << 14;
            if(var0 == Class1.aClass1_8 && var7[var6] == 971766913 * client.anInt3065) {
               continue;
            }
         }

         if(var2 != null && var2.method3101((byte)60) && !var2.aBool2900) {
            var2.aBool2896 = false;
            if((client.aBool2937 && var3 > 50 || var3 > 200) && var0 != Class1.aClass1_4 && var2.anInt2606 * 57983255 == var2.anInt2639 * 370127001) {
               var2.aBool2896 = true;
            }

            int var8 = var2.anInt2609 * 1272643751 >> 7;
            int var9 = -1801433343 * var2.anInt2579 >> 7;
            if(var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
               if(null != var2.aSpotAnim_2903 && client.anInt2943 * -1040073859 >= 359131139 * var2.anInt2888 && client.anInt2943 * -1040073859 < var2.anInt2889 * 959962901) {
                  var2.aBool2896 = false;
                  var2.anInt2897 = MobDefinition.method2552(var2.anInt2609 * 1272643751, -1801433343 * var2.anInt2579, -747958745 * Class116_Sub11.anInt1819, (short) 11474) * 1126652769;
                  Class116_Sub11.groundItemController.method357(-747958745 * Class116_Sub11.anInt1819, 1272643751 * var2.anInt2609, -1801433343 * var2.anInt2579, var2.anInt2897 * -868972383, 60, var2, var2.anInt2613 * -2031663291, var5, 1245527343 * var2.anInt2894, var2.anInt2895 * 1547766969, var2.anInt2885 * 1357352179, var2.anInt2880 * -688461469);
               } else {
                  if(64 == (1272643751 * var2.anInt2609 & 127) && 64 == (var2.anInt2579 * -1801433343 & 127)) {
                     if(-1317183381 * client.anInt3179 == client.anIntArrayArray3081[var8][var9]) {
                        continue;
                     }

                     client.anIntArrayArray3081[var8][var9] = -1317183381 * client.anInt3179;
                  }

                  var2.anInt2897 = MobDefinition.method2552(1272643751 * var2.anInt2609, var2.anInt2579 * -1801433343, Class116_Sub11.anInt1819 * -747958745, (short) 14757) * 1126652769;
                  Class116_Sub11.groundItemController.method356(-747958745 * Class116_Sub11.anInt1819, 1272643751 * var2.anInt2609, -1801433343 * var2.anInt2579, var2.anInt2897 * -868972383, 60, var2, var2.anInt2613 * -2031663291, var5, var2.aBool2588);
               }
            }
         }
      }

   }
}
