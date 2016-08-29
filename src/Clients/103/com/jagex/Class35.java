package com.jagex;
import java.io.IOException;
import java.net.URL;

public class Class35 implements Runnable {

   boolean aBool470 = true;
   int[] anIntArray471 = new int[500];
   int anInt472 = 0;
   static Class116_Sub15 aClass116_Sub15_473;
   int[] anIntArray474 = new int[500];
   static Class9 aClass9_475;
   static final int anInt476 = 59;
   static final int anInt477 = 67;
   Object anObject478 = new Object();
   static final String aString479 = "main_file_cache.idx";


   public static void method640(Class71 var0, boolean var1, int var2) {
      if(Class93.aClass71_1335 != null) {
         try {
            Class93.aClass71_1335.method1001(-1740220275);
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
         Class116_Sub23_Sub21 var3 = (Class116_Sub23_Sub21)Class93.aClass127_1352.method1661();
         if(var3 == null) {
            while(true) {
               var3 = (Class116_Sub23_Sub21)Class93.aClass127_1345.method1661();
               if(null == var3) {
                  if(Class93.aByte1340 != 0) {
                     try {
                        Buffer var8 = new Buffer(4);
                        var8.writeByte(4, -1126106019);
                        var8.writeByte(Class93.aByte1340, -175091979);
                        var8.writeShort(0, -1891309640);
                        Class93.aClass71_1335.method1006(var8.payload, 0, 4, -1444796574);
                     } catch (IOException var6) {
                        try {
                           Class93.aClass71_1335.method1001(-1644151489);
                        } catch (Exception var5) {
                           ;
                        }

                        Class93.anInt1354 += -1096754175;
                        Class93.aClass71_1335 = null;
                     }
                  }

                  Class93.anInt1336 = 0;
                  Class93.aLong1337 = Class116_Sub5.method1929(-1418201376) * 8420123348744189037L;
                  return;
               }

               Class93.aClass121_1342.method1616(var3);
               Class93.aClass127_1343.method1666(var3, var3.nodeId);
               Class93.anInt1344 += 556834453;
               Class93.anInt1338 -= 30759979;
            }
         }

         Class93.aClass127_1357.method1666(var3, var3.nodeId);
         Class93.anInt1339 += -1554399579;
         Class93.anInt1349 -= 255344863;
      }
   }

   public void run() {
      for(; this.aBool470; Friend.method1836(50L)) {
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
      for(; this.aBool470; Friend.method1836(50L)) {
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
      for(; this.aBool470; Friend.method1836(50L)) {
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

   static boolean method643(int var0) {
      try {
         if(BuildType.aClass32_1026 == null) {
            BuildType.aClass32_1026 = new Class32(ISAAC.aClass74_705, new URL(client.aString2939));
         } else {
            byte[] var1 = BuildType.aClass32_1026.method593((byte)-61);
            if(var1 != null) {
               Buffer var2 = new Buffer(var1);
               Class27.anInt379 = var2.readShort(682510663) * 1128208321;
               Class27.aClass27Array374 = new Class27[-1946617791 * Class27.anInt379];

               for(int var3 = 0; var3 < Class27.anInt379 * -1946617791; ++var3) {
                  Class27 var4 = Class27.aClass27Array374[var3] = new Class27();
                  var4.anInt388 = var2.readShort(1320674949) * -430891615;
                  var4.anInt380 = var2.readInt(-352478353) * 1825398059;
                  var4.aString382 = var2.readString(61376769);
                  var4.aString371 = var2.readString(61376769);
                  var4.anInt385 = var2.readSignedByte(1708176767) * -348321337;
                  var4.anInt381 = var2.method2007(-799536814) * 1388875023;
                  var4.anInt377 = var3 * -882618271;
               }

               Speach.method1129(Class27.aClass27Array374, 0, Class27.aClass27Array374.length - 1, Class27.anIntArray378, Class27.anIntArray383, -2022654930);
               BuildType.aClass32_1026 = null;
               return true;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         BuildType.aClass32_1026 = null;
      }

      return false;
   }

   public void method644() {
      for(; this.aBool470; Friend.method1836(50L)) {
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

   static int method645(Class116_Sub15 var0, byte var1) {
      InterfaceSettings var2 = (InterfaceSettings)client.aClass127_3135.method1658((long)(2021294259 * var0.anInt1926) + ((long)(-1536575275 * var0.anInt1925) << 32));
      return null != var2?var2.anInt2121:var0.anInt1921 * -1817319735;
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
