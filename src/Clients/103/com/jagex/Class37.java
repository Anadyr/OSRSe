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


   public static void method657(Class99 var0, Class99 var1, Class99 var2, Class99 var3, int var4) {
      Class116_Sub15.aClass99_1917 = var0;
      Class116_Sub15.aClass99_1929 = var1;
      Mob.aClass99_2878 = var2;
      Friend.aClass99_1664 = var3;
      Class116_Sub15.aClass116_Sub15ArrayArray1956 = new Class116_Sub15[Class116_Sub15.aClass99_1917.method1424(1568567108)][];
      Class116_Sub15.aBoolArray1916 = new boolean[Class116_Sub15.aClass99_1917.method1424(976174535)];
   }


   public static void method661(int var0) {
      try {
         Class86.aClass140_1011.method1763((short)128);

         for(int var1 = 0; var1 < 855046563 * Class86.anInt1019; ++var1) {
            Class47.aClass140Array625[var1].method1763((short)128);
         }

         Class86.aClass140_1015.method1763((short)128);
         Class86.aClass140_1010.method1763((short)128);
      } catch (Exception var2) {
         ;
      }

   }

   Class37() throws Throwable {
      throw new Error();
   }

   static final void method672(int var0, int var1, int var2) {
      Class117 var3 = client.aClass117ArrayArrayArray3071[-747958745 * Class116_Sub11.anInt1819][var0][var1];
      if(null == var3) {
         Class116_Sub11.groundItemController.method367(Class116_Sub11.anInt1819 * -747958745, var0, var1);
      } else {
         long var8 = -99999999L;
         Class116_Sub23_Sub16_Sub3 var10 = null;

         Class116_Sub23_Sub16_Sub3 var4;
         for(var4 = (Class116_Sub23_Sub16_Sub3)var3.method1551(); var4 != null; var4 = (Class116_Sub23_Sub16_Sub3)var3.method1553()) {
            Class116_Sub23_Sub11 var5 = Class50.method778(-848428919 * var4.anInt2646, (byte)70);
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
            Class116_Sub11.groundItemController.method367(-747958745 * Class116_Sub11.anInt1819, var0, var1);
         } else {
            var3.method1568(var10);
            Class116_Sub23_Sub16_Sub3 var13 = null;
            Class116_Sub23_Sub16_Sub3 var12 = null;

            for(var4 = (Class116_Sub23_Sub16_Sub3)var3.method1551(); null != var4; var4 = (Class116_Sub23_Sub16_Sub3)var3.method1553()) {
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
            Class116_Sub11.groundItemController.method352(-747958745 * Class116_Sub11.anInt1819, var0, var1, MobDefinition.method2552(var0 * 128 + 64, var1 * 128 + 64, -747958745 * Class116_Sub11.anInt1819, (short) 28036), var10, var11, var13, var12);
         }
      }
   }


   public static void method676(Class99 var0, int var1) {
      Class116_Sub23_Sub13.aClass99_2423 = var0;
}

}
