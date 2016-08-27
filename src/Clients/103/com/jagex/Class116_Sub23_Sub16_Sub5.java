package com.jagex;

public final class Class116_Sub23_Sub16_Sub5 extends Animable {

   double aDouble2732;
   int anInt2733;
   int anInt2734;
   int anInt2735;
   int anInt2736;
   int anInt2737;
   int anInt2738;
   int anInt2739;
   static int anInt2740;
   int anInt2741;
   int anInt2742;
   boolean aBool2743 = false;
   double aDouble2744;
   double aDouble2745;
   int anInt2746;
   int anInt2747;
   double aDouble2748;
   double aDouble2749;
   double aDouble2750;
   double aDouble2751;
   int anInt2753;
   Class116_Sub23_Sub4 aClass116_Sub23_Sub4_2754;
   int anInt2755 = 0;
   int anInt2756 = 0;
   int anInt2758;
   double aDouble2759;

   final void method3343(int var1, int var2, int var3, int var4, int var5) {
      double var6;
      if(!this.aBool2743) {
         var6 = (double)(var1 - -415849877 * this.anInt2734);
         double var8 = (double)(var2 - -825953097 * this.anInt2735);
         double var10 = Math.sqrt(var6 * var6 + var8 * var8);
         this.aDouble2744 = var6 * (double)(this.anInt2741 * 1165100081) / var10 + (double)(this.anInt2734 * -415849877);
         this.aDouble2745 = (double)(-825953097 * this.anInt2735) + var8 * (double)(1165100081 * this.anInt2741) / var10;
         this.aDouble2732 = (double)(-360825719 * this.anInt2747);
      }

      var6 = (double)(1 + -2082473613 * this.anInt2739 - var4);
      this.aDouble2759 = ((double)var1 - this.aDouble2744) / var6;
      this.aDouble2748 = ((double)var2 - this.aDouble2745) / var6;
      this.aDouble2749 = Math.sqrt(this.aDouble2759 * this.aDouble2759 + this.aDouble2748 * this.aDouble2748);
      if(!this.aBool2743) {
         this.aDouble2750 = -this.aDouble2749 * Math.tan((double)(this.anInt2758 * -100582033) * 0.02454369D);
      }

      this.aDouble2751 = 2.0D * ((double)var3 - this.aDouble2732 - var6 * this.aDouble2750) / (var6 * var6);
   }

   final void method3344(int var1, int var2) {
      this.aBool2743 = true;
      this.aDouble2744 += this.aDouble2759 * (double)var1;
      this.aDouble2745 += (double)var1 * this.aDouble2748;
      this.aDouble2732 += (double)var1 * (double)var1 * 0.5D * this.aDouble2751 + (double)var1 * this.aDouble2750;
      this.aDouble2750 += this.aDouble2751 * (double)var1;
      this.anInt2746 = ((int)(Math.atan2(this.aDouble2759, this.aDouble2748) * 325.949D) + 1024 & 2047) * 1482073931;
      this.anInt2753 = ((int)(Math.atan2(this.aDouble2750, this.aDouble2749) * 325.949D) & 2047) * -150783261;
      if(this.aClass116_Sub23_Sub4_2754 != null) {
         this.anInt2756 += var1 * 1926871585;

         while(this.anInt2756 * -2037364255 > this.aClass116_Sub23_Sub4_2754.anIntArray2255[this.anInt2755 * -46564401]) {
            this.anInt2756 -= 1926871585 * this.aClass116_Sub23_Sub4_2754.anIntArray2255[this.anInt2755 * -46564401];
            this.anInt2755 += -602821841;
            if(-46564401 * this.anInt2755 >= this.aClass116_Sub23_Sub4_2754.anIntArray2247.length) {
               this.anInt2755 -= 860871293 * this.aClass116_Sub23_Sub4_2754.anInt2251;
               if(-46564401 * this.anInt2755 < 0 || -46564401 * this.anInt2755 >= this.aClass116_Sub23_Sub4_2754.anIntArray2247.length) {
                  this.anInt2755 = 0;
               }
            }
         }
      }

   }

   protected final SpotAnim getRotatedModel(byte var1) {
      Class116_Sub23_Sub1 var2 = Friend.method1835(this.anInt2736 * 934846163, (byte) 1);
      SpotAnim var3 = var2.method2344(-46564401 * this.anInt2755, 542668757);
      if(null == var3) {
         return null;
      } else {
         var3.method3382(964287179 * this.anInt2753);
         return var3;
      }
   }

   Class116_Sub23_Sub16_Sub5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.anInt2736 = var1 * -268867237;
      this.anInt2733 = -1878577909 * var2;
      this.anInt2734 = 1644558915 * var3;
      this.anInt2735 = -369874681 * var4;
      this.anInt2747 = -612501063 * var5;
      this.anInt2738 = 748257223 * var6;
      this.anInt2739 = var7 * -1790323781;
      this.anInt2758 = -1293762161 * var8;
      this.anInt2741 = 1192416465 * var9;
      this.anInt2742 = -206837249 * var10;
      this.anInt2737 = -970910407 * var11;
      this.aBool2743 = false;
      int var12 = Friend.method1835(934846163 * this.anInt2736, (byte) 1).anInt2157 * -521951217;
      if(-1 != var12) {
         this.aClass116_Sub23_Sub4_2754 = Class116_Sub8.method1946(var12, -978454526);
      } else {
         this.aClass116_Sub23_Sub4_2754 = null;
      }

   }

}
