package com.jagex;

public class GameInterface extends Node {

   static long aLong1813;
   boolean aBool1815 = false;
   static int anInt1816;
   static Region region;
   static int anInt1818;
   static int anInt1819;
   static PlayerAlias[] ourCurrentCC;
   public int interfaceId;
   int type;


   public static Flo method1974(int var0, int var1) {
      Flo var2 = (Flo) Flo.aClass123_2296.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Flo.aRSIndex_2298.getFiles(1, var0, 669881277);
         var2 = new Flo();
         if(null != var3) {
            var2.method2516(new Packet(var3), var0, -1979190260);
         }

         var2.method2515(-630324663);
         Flo.aClass123_2296.method1633(var2, (long)var0);
         return var2;
      }
   }

   static final int method1975(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 65536 - Texture.anIntArray2713[1024 * var2 / var3] >> 1;
      return (var5 * var1 >> 16) + (var0 * (65536 - var5) >> 16);
   }

   public static final GameInterface display(int position, int interfaceId, int type, byte var3) {
      GameInterface var4 = new GameInterface();
      var4.interfaceId = -1987279243 * interfaceId;
      var4.type = 296579435 * type;
      client.overridedInterfaces.put(var4, (long) position);
      Class33.resetComponentAnimation(interfaceId, -867711433);
      RSInterface var5 = Class107.getInterface(position, 314639891);
      Class79.refreshInterface(var5, 1248146963);
      if(null != client.aClass116_Sub15_3097) {
         Class79.refreshInterface(client.aClass116_Sub15_3097, -1347642729);
         client.aClass116_Sub15_3097 = null;
      }
      Flo.method2529(441135845);
      ObjectDefinition.method2435(RSInterface.mainInterfaceArray[position >> 16], var5, false, 1223632516);
      Class29.executeOnStart(interfaceId, -447196070);
      if(-1 != -1074177723 * client.anInt3200) {
         Class76.method1081(client.anInt3200 * -1074177723, 1, (byte)2);
      }

      return var4;
   }

}
