package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class37 {

   static Class125 aClass125_491 = new Class125();
   static Class124 aClass124_492 = new Class124(1024);
   static int anInt493;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array494;
   static int anInt495 = 0;
   static Map aMap498 = new HashMap();


   public static void method657(RSIndex var0, RSIndex var1, RSIndex var2, RSIndex var3, int var4) {
      RSInterface.interfaceIndex = var0;
      RSInterface.aRSIndex_1929 = var1;
      Mob.aRSIndex_2878 = var2;
      Friend.aRSIndex_1664 = var3;
      RSInterface.mainInterfaceArray = new RSInterface[RSInterface.interfaceIndex.method1424(1568567108)][];
      RSInterface.interfacesLoaded = new boolean[RSInterface.interfaceIndex.method1424(976174535)];
   }


   public static void method661(int var0) {
      try {
         Class86.gameDataFile.method1763((short)128);

         for(int var1 = 0; var1 < 855046563 * Class86.anInt1019; ++var1) {
            Class47.aClass140Array625[var1].method1763((short)128);
         }

         Class86.gameDataChecksums.method1763((short)128);
         Class86.aClass140_1010.method1763((short)128);
      } catch (Exception var2) {
         ;
      }

   }

   Class37() throws Throwable {
      throw new Error();
   }

   static final void method672(int var0, int var1, int var2) {
      Deque var3 = client.aClass117ArrayArrayArray3071[-747958745 * GameInterface.anInt1819][var0][var1];
      if(null == var3) {
         GameInterface.region.method367(GameInterface.anInt1819 * -747958745, var0, var1);
      } else {
         long var8 = -99999999L;
         Class116_Sub23_Sub16_Sub3 var10 = null;

         Class116_Sub23_Sub16_Sub3 var4;
         for(var4 = (Class116_Sub23_Sub16_Sub3)var3.getFirst(); var4 != null; var4 = (Class116_Sub23_Sub16_Sub3)var3.getNext()) {
            Class116_Sub23_Sub11 var5 = RelationList.method778(-848428919 * var4.anInt2646, (byte) 70);
            long var6 = (long)(60742695 * var5.anInt2365);
            if(var5.anInt2372 * 1303294175 == 1) {
               var6 *= (long)(1308808435 * var4.anInt2640 + 1);
            }

            if(var6 > var8) {
               var8 = var6;
               var10 = var4;
            }
         }

         if(var10 == null) {
            GameInterface.region.method367(-747958745 * GameInterface.anInt1819, var0, var1);
         } else {
            var3.addFront(var10);
            Class116_Sub23_Sub16_Sub3 var13 = null;
            Class116_Sub23_Sub16_Sub3 var12 = null;

            for(var4 = (Class116_Sub23_Sub16_Sub3)var3.getFirst(); null != var4; var4 = (Class116_Sub23_Sub16_Sub3)var3.getNext()) {
               if(-848428919 * var10.anInt2646 != -848428919 * var4.anInt2646) {
                  if(var13 == null) {
                     var13 = var4;
                  }

                  if(var4.anInt2646 * -848428919 != -848428919 * var13.anInt2646 && null == var12) {
                     var12 = var4;
                  }
               }
            }

            int var11 = var0 + (var1 << 7) + 1610612736;
            GameInterface.region.method352(-747958745 * GameInterface.anInt1819, var0, var1, MobDefinition.method2552(var0 * 128 + 64, var1 * 128 + 64, -747958745 * GameInterface.anInt1819, (short) 28036), var10, var11, var13, var12);
         }
      }
   }


   public static void method676(RSIndex var0, int var1) {
      Class116_Sub23_Sub13.aRSIndex_2423 = var0;
}

}
