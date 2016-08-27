package com.jagex;
import java.util.Comparator;

final class Class45 implements Comparator {

   static final int anInt597 = 58;
   static final int anInt598 = 7;
   static String aString599;
   public static final int anInt600 = 160;
   // $FF: synthetic field
   boolean val$preferOwnWorld;


   public static ObjectDefinition method700(int var0, int var1) {
      ObjectDefinition var2 = (ObjectDefinition) ObjectDefinition.aClass123_2193.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = ObjectDefinition.aRSIndex_2189.getFiles(6, var0, -954216962);
         var2 = new ObjectDefinition();
         var2.anInt2239 = -55164811 * var0;
         if(null != var3) {
            var2.method2393(new Packet(var3), (byte)-86);
         }

         var2.method2392((byte)90);
         if(var2.aBool2241) {
            var2.actionCount = 0;
            var2.walkable = false;
         }

         ObjectDefinition.aClass123_2193.method1633(var2, (long)var0);
         return var2;
      }
   }

   int method701(Class133 var1, Class133 var2, int var3) {
      if(var1.anInt1601 * 752101567 == var2.anInt1601 * 752101567) {
         return 0;
      } else {
         if(this.val$preferOwnWorld) {
            if(-1631311031 * client.anInt3115 == var1.anInt1601 * 752101567) {
               return -1;
            }

            if(-1631311031 * client.anInt3115 == var2.anInt1601 * 752101567) {
               return 1;
            }
         }

         return var1.anInt1601 * 752101567 < 752101567 * var2.anInt1601?-1:1;
      }
   }

   public static Class116_Sub23_Sub15 method702(int var0, short var1) {
      Class116_Sub23_Sub15 var2 = (Class116_Sub23_Sub15)Class116_Sub23_Sub15.aClass123_2445.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub15.aRSIndex_2449.getFiles(16, var0, 466790227);
         var2 = new Class116_Sub23_Sub15();
         if(null != var3) {
            var2.method2690(new Packet(var3), 768922619);
         }

         Class116_Sub23_Sub15.aClass123_2445.method1633(var2, (long)var0);
         return var2;
      }
   }

   int method703(Class133 var1, Class133 var2) {
      if(var1.anInt1601 * 752101567 == var2.anInt1601 * 752101567) {
         return 0;
      } else {
         if(this.val$preferOwnWorld) {
            if(-1631311031 * client.anInt3115 == var1.anInt1601 * 752101567) {
               return -1;
            }

            if(-1631311031 * client.anInt3115 == var2.anInt1601 * 752101567) {
               return 1;
            }
         }

         return var1.anInt1601 * 752101567 < 752101567 * var2.anInt1601?-1:1;
      }
   }

   int method704(Class133 var1, Class133 var2) {
      if(var1.anInt1601 * 2088148509 == var2.anInt1601 * 1074210443) {
         return 0;
      } else {
         if(this.val$preferOwnWorld) {
            if(-1631311031 * client.anInt3115 == var1.anInt1601 * 752101567) {
               return -1;
            }

            if(-1694843027 * client.anInt3115 == var2.anInt1601 * -39665623) {
               return 1;
            }
         }

         return var1.anInt1601 * 1525568147 < -1433022389 * var2.anInt1601?-1:1;
      }
   }

   int method705(Class133 var1, Class133 var2) {
      if(var1.anInt1601 * 752101567 == var2.anInt1601 * 752101567) {
         return 0;
      } else {
         if(this.val$preferOwnWorld) {
            if(-1565166327 * client.anInt3115 == var1.anInt1601 * 752101567) {
               return -1;
            }

            if(-1631311031 * client.anInt3115 == var2.anInt1601 * 27897209) {
               return 1;
            }
         }

         return var1.anInt1601 * -1983767135 >= -823417424 * var2.anInt1601?1:-1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method701((Class133)var1, (Class133)var2, 866825638);
   }

   public int method706(Object var1, Object var2) {
      return this.method701((Class133)var1, (Class133)var2, 1293866839);
   }

   public int method707(Object var1, Object var2) {
      return this.method701((Class133)var1, (Class133)var2, 846906176);
   }

   public boolean method708(Object var1) {
      return super.equals(var1);
   }

   public boolean method709(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method710(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      if(var0 < var1) {
         int var8 = (var0 + var1) / 2;
         int var7 = var0;
         World var9 = World.worldArray[var8];
         World.worldArray[var8] = World.worldArray[var1];
         World.worldArray[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if(method712(World.worldArray[var10], var9, var2, var3, var4, var5, 1442998195) <= 0) {
               World var11 = World.worldArray[var10];
               World.worldArray[var10] = World.worldArray[var7];
               World.worldArray[var7++] = var11;
            }
         }

         World.worldArray[var1] = World.worldArray[var7];
         World.worldArray[var7] = var9;
         method710(var0, var7 - 1, var2, var3, var4, var5, 1541974238);
         method710(var7 + 1, var1, var2, var3, var4, var5, -1347981279);
      }

   }

   public boolean method711(Object var1) {
      return super.equals(var1);
   }

   static int method712(World var0, World var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      int var7 = Class59.method896(var0, var1, var2, var3, (byte)0);
      if(var7 != 0) {
         return var3?-var7:var7;
      } else if(-1 == var4) {
         return 0;
      } else {
         int var8 = Class59.method896(var0, var1, var4, var5, (byte)0);
         return var5?-var8:var8;
      }
   }

   static String method713(String var0, boolean var1, int var2) {
      String var3 = var1?"https://":"http://";
      if(1 == 1082541889 * client.anInt3020) {
         var0 = var0 + "-wtrc";
      } else if(1082541889 * client.anInt3020 == 2) {
         var0 = var0 + "-wtqa";
      } else if(3 == client.anInt3020 * 1082541889) {
         var0 = var0 + "-wtwip";
      } else if(5 == client.anInt3020 * 1082541889) {
         var0 = var0 + "-wti";
      } else if(1082541889 * client.anInt3020 == 4) {
         var0 = "local";
      }

      String var5 = "";
      if(client.aString2940 != null) {
         var5 = "/p=" + client.aString2940;
      }

      String var4 = "runescape.com";
      return var3 + var0 + "." + var4 + "/l=" + client.anInt2938 * -1025678859 + "/a=" + GameInterface.anInt1816 * -1929163163 + var5 + "/";
   }

   Class45(boolean var1) {
      this.val$preferOwnWorld = var1;
   }

   static int method714(int var0, int var1, int var2) {
      Class116_Sub10 var3 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var0);
      return null == var3?0:(var1 >= 0 && var1 < var3.anIntArray1804.length?var3.anIntArray1804[var1]:0);
   }

   static void method715(int var0) {
      client.rsaBuffer.position = 0;
      client.packetBuffer.position = 0;
      client.currentOpcode = -1;
      client.anInt2984 = -190671919;
      client.anInt3066 = -1000495973;
      client.anInt3173 = 1230533737;
      client.packetLength = 0;
      client.anInt2982 = 0;
      client.anInt3157 = 0;
      client.anInt3075 = 0;
      client.aBool3074 = false;
      client.anInt3170 = 0;
      client.anInt3168 = 0;

      int var2;
      for(var2 = 0; var2 < 2048; ++var2) {
         client.globalPlayers[var2] = null;
      }

      Class79.ourPlayer = null;

      for(var2 = 0; var2 < client.aMobArray2972.length; ++var2) {
         Mob var1 = client.aMobArray2972[var2];
         if(var1 != null) {
            var1.anInt2603 = -1611414733;
            var1.aBool2604 = false;
         }
      }

      Class104.method1455(2012666217);
      Class116_Sub12.method1983(30, (byte)50);

      for(var2 = 0; var2 < 100; ++var2) {
         client.aBoolArray3073[var2] = true;
      }

      client.rsaBuffer.startPacket(23, (byte) 23);
      PacketBuilder var4 = client.rsaBuffer;
      int var3 = client.aBool3140?2:1;
      var4.writeByte(var3, -1417021930);
      client.rsaBuffer.writeShort(Class42.clientWidth * -452716157, -2060763111);
      client.rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -1695556912);
   }
}
