package com.jagex;
import java.lang.management.GarbageCollectorMXBean;

public class Class43 implements OrdinalInterface {

   static Class43 aClass43_575 = new Class43(2);
   static Class43 aClass43_576 = new Class43(1);
   static Class43 aClass43_577 = new Class43(3);
   static GarbageCollectorMXBean aGarbageCollectorMXBean578;
   int anInt579;
   static int anInt580;
   static Class43 aClass43_581 = new Class43(0);


   public int getDrawId(int var1) {
      return -1221060991 * this.anInt579;
   }

   public int method32() {
      return -1221060991 * this.anInt579;
   }

   public int method34() {
      return -1221060991 * this.anInt579;
   }

   public int method30() {
      return 454990240 * this.anInt579;
   }

   public int method33() {
      return -1221060991 * this.anInt579;
   }

   public static void method696(int var0) {
      RSInterface.aClass123_2000.method1635();
      RSInterface.aClass123_1920.method1635();
      RSInterface.aClass123_2038.method1635();
      RSInterface.aClass123_2058.method1635();
   }

   static final void method697(int var0) {
      int var1 = -1905311417 * Class8.anInt131;
      int var2 = Class116_Sub23_Sub6.anInt2286 * 1745388413;
      int var4 = 1899383153 * Class4.anInt50;
      int var5 = 1426002097 * Class4.anInt49;
      int var3 = 6116423;
      DrawingArea.setRasterAreaColor(var1, var2, var4, var5, var3);
      DrawingArea.setRasterAreaColor(1 + var1, var2 + 1, var4 - 2, 16, 0);
      DrawingArea.method2897(1 + var1, 18 + var2, var4 - 2, var5 - 19, 0);
      Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3481(Class91.aString1200, var1 + 3, var2 + 14, var3, -1);
      int var6 = -453286219 * Class85.anInt991;
      int var10 = Class85.anInt992 * 103771565;

      int var8;
      int var9;
      int var11;
      for(var9 = 0; var9 < client.anInt3075 * 1768430155; ++var9) {
         var8 = var2 + 31 + (1768430155 * client.anInt3075 - 1 - var9) * 15;
         var11 = 16777215;
         if(var6 > var1 && var6 < var1 + var4 && var10 > var8 - 13 && var10 < 3 + var8) {
            var11 = 16776960;
         }

         Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537.method3481(Class30.method587(var9, -1802820835), var1 + 3, var8, var11, 0);
      }

      var9 = Class8.anInt131 * -1905311417;
      var8 = Class116_Sub23_Sub6.anInt2286 * 1745388413;
      var11 = Class4.anInt50 * 1899383153;
      int var12 = Class4.anInt49 * 1426002097;

      for(int var7 = 0; var7 < client.anInt3136 * -580551879; ++var7) {
         if(client.anIntArray3143[var7] + client.anIntArray3141[var7] > var9 && client.anIntArray3141[var7] < var9 + var11 && client.anIntArray3142[var7] + client.anIntArray3144[var7] > var8 && client.anIntArray3142[var7] < var8 + var12) {
            client.aBoolArray3139[var7] = true;
         }
      }

   }

   Class43(int var1) {
      this.anInt579 = -1272829567 * var1;
   }
}
