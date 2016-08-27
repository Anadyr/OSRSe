package com.jagex;
import java.io.IOException;
import java.net.URL;

public class Class35 implements Runnable {

   boolean aBool470 = true;
   int[] anIntArray471 = new int[500];
   int anInt472 = 0;
   static RSInterface aClass116_Sub15_473;
   int[] anIntArray474 = new int[500];
   static Class9 aClass9_475;
   static final int anInt476 = 59;
   static final int anInt477 = 67;
   Object anObject478 = new Object();
   static final String aString479 = "main_file_cache.idx";


   public static void method640(RSInputStream var0, boolean var1, int var2) {
      if(Class93.aClass71_1335 != null) {
         try {
            Class93.aClass71_1335.sync(-1740220275);
         } catch (Exception var7) {
            ;
         }

         Class93.aClass71_1335 = null;
      }

      Class93.aClass71_1335 = var0;
      Class116_Sub6.method1935(var1, 2021294259);
      Class93.aClass116_Sub14_1347.position = 0;
      Class1.aClass116_Sub23_Sub21_7 = null;
      Class93.aClass116_Sub14_1348 = null;
      Class93.anInt1346 = 0;

      while(true) {
         Class116_Sub23_Sub21 var3 = (Class116_Sub23_Sub21)Class93.aHashtable_1352.getFirst();
         if(var3 == null) {
            while(true) {
               var3 = (Class116_Sub23_Sub21)Class93.aHashtable_1345.getFirst();
               if(null == var3) {
                  if(Class93.aByte1340 != 0) {
                     try {
                        Packet var8 = new Packet(4);
                        var8.writeByte(4, -1126106019);
                        var8.writeByte(Class93.aByte1340, -175091979);
                        var8.writeShort(0, -1891309640);
                        Class93.aClass71_1335.flush(var8.payload, 0, 4, -1444796574);
                     } catch (IOException var6) {
                        try {
                           Class93.aClass71_1335.sync(-1644151489);
                        } catch (Exception var5) {
                           ;
                        }

                        Class93.anInt1354 += -1096754175;
                        Class93.aClass71_1335 = null;
                     }
                  }

                  Class93.anInt1336 = 0;
                  Class93.aLong1337 = Class116_Sub5.generateHash(-1418201376) * 8420123348744189037L;
                  return;
               }

               Class93.aClass121_1342.method1616(var3);
               Class93.aHashtable_1343.put(var3, var3.hashId);
               Class93.anInt1344 += 556834453;
               Class93.anInt1338 -= 30759979;
            }
         }

         Class93.aHashtable_1357.put(var3, var3.hashId);
         Class93.anInt1339 += -1554399579;
         Class93.anInt1349 -= 255344863;
      }
   }

   public void run() {
      for(; this.aBool470; Friend.sleep(50L)) {
         Object var1 = this.anObject478;
         synchronized(var1) {
            if(this.anInt472 * 598524519 < 500) {
               this.anIntArray471[598524519 * this.anInt472] = -453286219 * Class85.anInt991;
               this.anIntArray474[598524519 * this.anInt472] = Class85.anInt992 * 103771565;
               this.anInt472 += -396936873;
            }
         }
      }

   }

   public void method641() {
      for(; this.aBool470; Friend.sleep(50L)) {
         Object var1 = this.anObject478;
         synchronized(var1) {
            if(this.anInt472 * 598524519 < 500) {
               this.anIntArray471[598524519 * this.anInt472] = -453286219 * Class85.anInt991;
               this.anIntArray474[598524519 * this.anInt472] = Class85.anInt992 * 103771565;
               this.anInt472 += -396936873;
            }
         }
      }

   }

   public void method642() {
      for(; this.aBool470; Friend.sleep(50L)) {
         Object var1 = this.anObject478;
         synchronized(var1) {
            if(this.anInt472 * 1415091532 < 500) {
               this.anIntArray471[598524519 * this.anInt472] = -20521583 * Class85.anInt991;
               this.anIntArray474[598524519 * this.anInt472] = Class85.anInt992 * 103771565;
               this.anInt472 += 492453855;
            }
         }
      }

   }

   static boolean readWorldList(int var0) {
      try {
          if(KeyFocusListener.wlSocket == null) {

          } else {

          }
         if(BuildType.worldListData == null) {
            BuildType.worldListData = new Class32(ISAAC.signLink, new URL(client.worldListAddress));
         } else {
            byte[] data = BuildType.worldListData.getURLToData((byte) -61);
            if(data != null) {
               Packet buffer = new Packet(data);
               World.totalWorldCount = buffer.readUnsignedShort(682510663) * 1128208321;
               World.worldArray = new World[-1946617791 * World.totalWorldCount];

               for(int var3 = 0; var3 < World.totalWorldCount * -1946617791; ++var3) {
                  World curr = World.worldArray[var3] = new World();
                   int worldId = buffer.readUnsignedShort(1320674949);
                  curr.worldId = worldId * -430891615;
                   int flag = buffer.readInt(-352478353);
                   curr.activityFlag = flag * 1825398059;
                  curr.address = buffer.readString(61376769);
                  curr.activity = buffer.readString(61376769);
                   int i = buffer.readSignedByte(1708176767);
                   curr.flag = i * -348321337;
                   int iiii =  buffer.readShort(-799536814);
                  curr.anInt381 = iiii * 1388875023;
                    System.out.println(worldId+"/"+flag+"/"+i+"/"+iiii+"/"+curr.activity);
                  curr.anInt377 = var3 * -882618271;
               }

               Speach.handleWorldList(World.worldArray, 0, World.worldArray.length - 1, World.anIntArray378, World.anIntArray383, -2022654930);
               BuildType.worldListData = null;
               return true;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         BuildType.worldListData = null;
      }

      return false;
   }

   public void method644() {
      for(; this.aBool470; Friend.sleep(50L)) {
         Object var1 = this.anObject478;
         synchronized(var1) {
            if(this.anInt472 * 598524519 < 500) {
               this.anIntArray471[598524519 * this.anInt472] = -453286219 * Class85.anInt991;
               this.anIntArray474[598524519 * this.anInt472] = Class85.anInt992 * 103771565;
               this.anInt472 += -396936873;
            }
         }
      }

   }

   static int method645(RSInterface var0, byte var1) {
      InterfaceSettings var2 = (InterfaceSettings)client.aHashtable_3135.get((long) (2021294259 * var0.anInt1926) + ((long) (-1536575275 * var0.hash) << 32));
      return null != var2?var2.anInt2121:var0.click_mask * -1817319735;
   }

   public static OrdinalInterface method646(OrdinalInterface[] ordinalInterfaces, int drawIcon, byte var2) {
      OrdinalInterface[] var3 = ordinalInterfaces;

      for(int var5 = 0; var5 < var3.length; ++var5) {
         OrdinalInterface ord = var3[var5];
         if(drawIcon == ord.getDrawId(-2125828334)) {
            return ord;
         }
      }

      return null;
   }
}
