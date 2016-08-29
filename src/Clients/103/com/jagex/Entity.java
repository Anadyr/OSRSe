package com.jagex;

public abstract class Entity extends Animable {

   int anInt2578 = 0;
   int anInt2579;
   int anInt2580 = -505909337;
   int anInt2581 = 0;
   int anInt2582 = 99722873;
   int[] anIntArray2583 = new int[4];
   int anInt2584 = 176841799;
   int anInt2585 = -1652337345;
   int anInt2586 = 929243503;
   int anInt2587 = 1587034171;
   boolean aBool2588 = false;
   int anInt2589;
   int anInt2590 = -71707737;
   String forceChatString = null;
   int anInt2592 = 0;
   boolean aBool2593 = false;
   int anInt2594;
   int anInt2595 = 0;
   int anInt2596 = 0;
   int[] anIntArray2597 = new int[4];
   int anInt2598 = -569035212;
   int anInt2599;
   int anInt2600 = 1981456616;
   int anInt2601;
   int anInt2602;
   int anInt2603 = -1611414733;
   boolean aBool2604 = false;
   int anInt2605 = 316267887;
   int anInt2606 = -517768871;
   int[] anIntArray2607 = new int[4];
   int anInt2608 = 0;
   int anInt2609;
   int anInt2610 = 0;
   int anInt2611 = 0;
   int anInt2612 = 0;
   int anInt2613;
   int anInt2614 = 1738418729;
   int anInt2615 = -1473487651;
   int anInt2616 = 0;
   int anInt2617;
   int anInt2618 = 0;
   public static final int anInt2619 = 126;
   int anInt2620;
   int anInt2621;
   int[] xMovementSteps = new int[10];
   boolean aBool2623;
   int anInt2624;
   int anInt2625;
   int anInt2626 = 0;
   int anInt2627 = 331928664;
   byte[] aByteArray2628 = new byte[10];
   int anInt2629 = 951990375;
   int anInt2630 = -939182368;
   int anInt2631;
   int anInt2632;
   int[] yMovementSteps = new int[10];
   static final int anInt2634 = 100;
   int anInt2635 = 0;
   int anInt2636 = 0;
   int anInt2637 = 0;
   static final int anInt2638 = 2;
   int anInt2639 = 592731223;



   final void method3100(int var1) {
      this.anInt2578 = 0;
      this.anInt2636 = 0;
   }

   boolean method3101(byte var1) {
      return false;
   }

   final void method3102(int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         if(this.anIntArray2583[var5] <= var3) {
            this.anIntArray2597[var5] = var1;
            this.anIntArray2607[var5] = var2;
            this.anIntArray2583[var5] = 70 + var3;
            return;
         }
      }

   }

   public static String method3103(byte[] var0, int var1) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var6 = 0; var6 < var2 + 0; var6 += 3) {
         int var5 = var0[var6] & 255;
         var3.append(Class100.aCharArray1401[var5 >>> 2]);
         if(var6 < var2 - 1) {
            int var4 = var0[1 + var6] & 255;
            var3.append(Class100.aCharArray1401[(var5 & 3) << 4 | var4 >>> 4]);
            if(var6 < var2 - 2) {
               int var7 = var0[var6 + 2] & 255;
               var3.append(Class100.aCharArray1401[(var4 & 15) << 2 | var7 >>> 6]).append(Class100.aCharArray1401[var7 & 63]);
            } else {
               var3.append(Class100.aCharArray1401[(var4 & 15) << 2]).append("=");
            }
         } else {
            var3.append(Class100.aCharArray1401[(var5 & 3) << 4]).append("==");
         }
      }

      String var8 = var3.toString();
      return var8;
   }

   static final int method3108(int var0, int var1, int var2) {
      int var3 = Class116_Sub15.method2275(var0 + '\ub135', var1 + 91923, 4, 161978140) - 128 + (Class116_Sub15.method2275(10294 + var0, var1 + '\u93bd', 2, 161978140) - 128 >> 1) + (Class116_Sub15.method2275(var0, var1, 1, 161978140) - 128 >> 2);
      var3 = 35 + (int)((double)var3 * 0.3D);
      if(var3 >= 10) {
         if(var3 > 60) {
            var3 = 60;
         }
      } else {
         var3 = 10;
      }

      return var3;
   }

   public static int method3110(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return 0 == var2?var1:(1 == var2?7 - var0 - (var3 - 1):(var2 != 2?var0:7 - var1 - (var4 - 1)));
   }
}
