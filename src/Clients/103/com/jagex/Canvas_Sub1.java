package com.jagex;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {

   Component aComponent2506;
   public static final int anInt2507 = 30;
   public static final int anInt2508 = 110;
   static final int anInt2509 = 19136824;


   static void method2972(int var0, int var1) {
      Class116_Sub10 var2 = (Class116_Sub10)Class116_Sub10.aClass127_1803.method1658((long)var0);
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.anIntArray1812.length; ++var3) {
            var2.anIntArray1812[var3] = -1;
            var2.anIntArray1804[var3] = 0;
         }

      }
   }

   public final void update(Graphics var1) {
      this.aComponent2506.update(var1);
   }

   public final void paint(Graphics var1) {
      this.aComponent2506.paint(var1);
   }

   public final void method2973(Graphics var1) {
      this.aComponent2506.update(var1);
   }

   public final void method2974(Graphics var1) {
      this.aComponent2506.update(var1);
   }

   public final void method2975(Graphics var1) {
      this.aComponent2506.update(var1);
   }

   public final void method2976(Graphics var1) {
      this.aComponent2506.paint(var1);
   }

   public final void method2977(Graphics var1) {
      this.aComponent2506.paint(var1);
   }

   Canvas_Sub1(Component var1) {
      this.aComponent2506 = var1;
   }

   static final String[] method2978(String[] var0, int var1) {
      String[] var2 = new String[5];

      for(int var3 = 0; var3 < 5; ++var3) {
         var2[var3] = var3 + ": ";
         if(var0 != null && null != var0[var3]) {
            var2[var3] = var2[var3] + var0[var3];
         }
      }

      return var2;
   }
}
