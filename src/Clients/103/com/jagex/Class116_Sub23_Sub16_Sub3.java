package com.jagex;

public final class Class116_Sub23_Sub16_Sub3 extends Animable {

   int anInt2640;
   static int anInt2642;
   static Class116_Sub23_Sub19_Sub3 aClass116_Sub23_Sub19_Sub3_2644;
   int anInt2646;

   public static byte[] method3111(Object var0, boolean var1, byte var2) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1?Class55.method813(var4, -1836351588):var4;
      } else if(var0 instanceof Class63) {
         Class63 var3 = (Class63)var0;
         return var3.method919(1130068802);
      } else {
         throw new IllegalArgumentException();
      }
   }

   protected final SpotAnim getRotatedModel(byte var1) {
      return Class50.method778(this.anInt2646 * -848428919, (byte)70).method2593(1308808435 * this.anInt2640, 173624722);
   }
}
