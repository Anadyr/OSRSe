package com.jagex;

public class BuildType {

   static BuildType aClass87_1021 = new BuildType("RC", 1);
   static BuildType aClass87_1022 = new BuildType("WIP", 2);
   static BuildType aClass87_1023 = new BuildType("LIVE", 0);
   public String aString1024;
   public int anInt1025;
   static Class32 worldListData;
   static BuildType aClass87_1027 = new BuildType("BUILDLIVE", 3);

   static void method1175(int var0) {
      client.aLong2944 = -5938907264350207555L;
      client.anInt2947 = -1669020249;
      Mob.aClass35_2879.anInt472 = 0;
      Animable.aBool2470 = true;
      client.aBool2948 = true;
      client.aLong2966 = 8084475441026814739L;
      client.aClass119_1617 = new NodeList();
      client.rsaBuffer.position = 0;
      client.packetBuffer.position = 0;
      client.currentOpcode = -1;
      client.anInt2984 = -190671919;
      client.anInt3066 = -1000495973;
      client.anInt3173 = 1230533737;
      client.anInt2982 = 0;
      client.anInt3157 = 0;
      client.anInt2987 = 0;
      client.anInt3021 = 0;
      client.anInt3075 = 0;
      client.aBool3074 = false;
      Class85.anInt986 = 0;
      Class116_Sub16.method2304(65536);
      client.anInt2991 = 0;
      client.aBool3088 = false;
      client.anInt3176 = 0;
      client.anInt3194 = ((int)(Math.random() * 100.0D) - 50) * -1631417805;
      client.anInt3002 = ((int)(Math.random() * 110.0D) - 55) * 647901671;
      client.anInt3004 = ((int)(Math.random() * 80.0D) - 40) * -795031115;
      client.anInt3007 = ((int)(Math.random() * 120.0D) - 60) * 1807074367;
      client.anInt3009 = ((int)(Math.random() * 30.0D) - 20) * 1806769549;
      client.anInt2929 = ((int)(Math.random() * 20.0D) - 10 & 2047) * -571365833;
      client.anInt3170 = 0;
      client.anInt3163 = -1008529911;
      client.anInt3168 = 0;
      client.anInt3208 = 0;
      client.aClass43_3138 = Class43.aClass43_577;
      client.aClass43_3169 = Class43.aClass43_577;
      client.npcCount = 0;
      Class7.anInt107 = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         Class7.aClass116_Sub14Array106[var1] = null;
         Class7.movementMode[var1] = 1;
      }

      for(var1 = 0; var1 < 2048; ++var1) {
         client.globalPlayers[var1] = null;
      }

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         client.aMobArray2972[var1] = null;
      }

      client.anInt3065 = 1929362559;
      client.aClass117_3028.clear();
      client.aClass117_2973.clear();

      int var2;
      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               client.aClass117ArrayArrayArray3071[var1][var2][var3] = null;
            }
         }
      }

      client.aClass117_3162 = new Deque();
      client.anInt3203 = 0;
      client.anInt3152 = 0;
      client.anInt3206 = 0;

      for(var1 = 0; var1 < -1248800389 * Class116_Sub23_Sub15.anInt2448; ++var1) {
         Class116_Sub23_Sub15 var4 = Class45.method702(var1, (short)-20488);
         if(var4 != null) {
            Class107.anIntArray1454[var1] = 0;
            Class107.varpData[var1] = 0;
         }
      }

      Class39.aClass33_518.method612(-1099191910);
      client.anInt3101 = -218906203;
      if(-1 != -1074177723 * client.anInt3200) {
         Class64.method940(client.anInt3200 * -1074177723, 1618452709);
      }

      for(GameInterface var5 = (GameInterface)client.overridedInterfaces.getFirst(); var5 != null; var5 = (GameInterface)client.overridedInterfaces.getNext()) {
         Class116_Sub23_Sub5.method2490(var5, true, (byte)1);
      }

      client.anInt3200 = 605073011;
      client.overridedInterfaces = new Hashtable(8);
      client.aClass116_Sub15_3097 = null;
      client.aBool3074 = false;
      client.anInt3075 = 0;
      client.aClass108_3103.method1468((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1, -1501417527);

      for(var1 = 0; var1 < 8; ++var1) {
         client.aStringArray3062[var1] = null;
         client.aBoolArray3063[var1] = false;
      }

      Class104.method1455(1926012050);
      client.aBool3187 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.aBoolArray3073[var1] = true;
      }

      client.rsaBuffer.startPacket(23, (byte) 106);
      PacketBuilder var6 = client.rsaBuffer;
      var2 = client.aBool3140?2:1;
      var6.writeByte(var2, 476681676);
      client.rsaBuffer.writeShort(-452716157 * Class42.clientWidth, -1915999133);
      client.rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -2118540412);
      client.currentCCName = null;
      Class98.ccPlayerCount = 0;
      GameInterface.ourCurrentCC = null;

      for(var1 = 0; var1 < 8; ++var1) {
         client.aClass135Array3211[var1] = new Class135();
      }

      Class81.aClass132_928 = null;
   }

   BuildType(String var1, int var2) {
      this.aString1024 = var1;
      this.anInt1025 = var2 * -749936875;
   }

}
