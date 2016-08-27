package com.jagex;

public class Class116_Sub4_Sub3 extends Class116_Sub4 {

   Deque aClass117_2528 = new Deque();
   Class116_Sub4_Sub1 aClass116_Sub4_Sub1_2529 = new Class116_Sub4_Sub1();
   Class116_Sub4_Sub4 aClass116_Sub4_Sub4_2530;

   protected Class116_Sub4 method1907() {
      Class116_Sub21 var1 = (Class116_Sub21)this.aClass117_2528.getFirst();
      return (Class116_Sub4)(var1 == null?null:(var1.aClass116_Sub4_Sub2_2140 != null?var1.aClass116_Sub4_Sub2_2140:this.method1913()));
   }

   protected Class116_Sub4 method1913() {
      Class116_Sub21 var1;
      do {
         var1 = (Class116_Sub21)this.aClass117_2528.getNext();
         if(null == var1) {
            return null;
         }
      } while(null == var1.aClass116_Sub4_Sub2_2140);

      return var1.aClass116_Sub4_Sub2_2140;
   }

   protected int method1909() {
      return 0;
   }

   protected void method1919(int[] var1, int var2, int var3) {
      this.aClass116_Sub4_Sub1_2529.method1919(var1, var2, var3);

      for(Class116_Sub21 var5 = (Class116_Sub21)this.aClass117_2528.getFirst(); var5 != null; var5 = (Class116_Sub21)this.aClass117_2528.getNext()) {
         if(!this.aClass116_Sub4_Sub4_2530.method3025(var5, -569035212)) {
            int var6 = var2;
            int var4 = var3;

            do {
               if(var4 <= var5.anInt2141 * 536968695) {
                  this.method2988(var5, var1, var6, var4, var6 + var4, (byte)20);
                  var5.anInt2141 -= var4 * -1258269753;
                  break;
               }

               this.method2988(var5, var1, var6, 536968695 * var5.anInt2141, var4 + var6, (byte)20);
               var6 += 536968695 * var5.anInt2141;
               var4 -= 536968695 * var5.anInt2141;
            } while(!this.aClass116_Sub4_Sub4_2530.method3023(var5, var1, var6, var4, 93738838));
         }
      }

   }

   protected void method1911(int var1) {
      this.aClass116_Sub4_Sub1_2529.method1911(var1);

      for(Class116_Sub21 var2 = (Class116_Sub21)this.aClass117_2528.getFirst(); var2 != null; var2 = (Class116_Sub21)this.aClass117_2528.getNext()) {
         if(!this.aClass116_Sub4_Sub4_2530.method3025(var2, -569035212)) {
            int var3 = var1;

            do {
               if(var3 <= 536968695 * var2.anInt2141) {
                  this.method2987(var2, var3, 1298742803);
                  var2.anInt2141 -= var3 * -1258269753;
                  break;
               }

               this.method2987(var2, var2.anInt2141 * 536968695, 265078547);
               var3 -= var2.anInt2141 * 536968695;
            } while(!this.aClass116_Sub4_Sub4_2530.method3023(var2, (int[])null, 0, var3, 93738838));
         }
      }

   }

   void method2987(Class116_Sub21 var1, int var2, int var3) {
      if(0 != (this.aClass116_Sub4_Sub4_2530.anIntArray2545[1956904859 * var1.anInt2125] & 4) && var1.anInt2122 * -524941375 < 0) {
         int var4 = this.aClass116_Sub4_Sub4_2530.anIntArray2550[1956904859 * var1.anInt2125] / (-954458055 * Class9.anInt135);
         int var5 = (var4 + 1048575 - var1.anInt2134 * -432572087) / var4;
         var1.anInt2134 = -319108871 * (var1.anInt2134 * -432572087 + var4 * var2 & 1048575);
         if(var5 <= var2) {
            if(0 != this.aClass116_Sub4_Sub4_2530.anIntArray2541[var1.anInt2125 * 1956904859]) {
               var1.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var1.aClass116_Sub2_Sub1_2124, var1.aClass116_Sub4_Sub2_2140.method2754(), 0, var1.aClass116_Sub4_Sub2_2140.method2742());
               this.aClass116_Sub4_Sub4_2530.method3011(var1, var1.aClass116_Sub19_2133.aShortArray2111[1484938015 * var1.anInt2137] < 0, (byte)29);
            } else {
               var1.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var1.aClass116_Sub2_Sub1_2124, var1.aClass116_Sub4_Sub2_2140.method2754(), var1.aClass116_Sub4_Sub2_2140.method2776(), var1.aClass116_Sub4_Sub2_2140.method2742());
            }

            if(var1.aClass116_Sub19_2133.aShortArray2111[var1.anInt2137 * 1484938015] < 0) {
               var1.aClass116_Sub4_Sub2_2140.method2737(-1);
            }

            var2 = var1.anInt2134 * -432572087 / var4;
         }
      }

      var1.aClass116_Sub4_Sub2_2140.method1911(var2);
   }

   Class116_Sub4_Sub3(Class116_Sub4_Sub4 var1) {
      this.aClass116_Sub4_Sub4_2530 = var1;
   }

   void method2988(Class116_Sub21 var1, int[] var2, int var3, int var4, int var5, byte var6) {
      if(0 != (this.aClass116_Sub4_Sub4_2530.anIntArray2545[var1.anInt2125 * 1956904859] & 4) && var1.anInt2122 * -524941375 < 0) {
         int var9 = this.aClass116_Sub4_Sub4_2530.anIntArray2550[1956904859 * var1.anInt2125] / (-954458055 * Class9.anInt135);

         while(true) {
            int var10 = (var9 + 1048575 - var1.anInt2134 * -432572087) / var9;
            if(var10 > var4) {
               var1.anInt2134 += var9 * var4 * -319108871;
               break;
            }

            var1.aClass116_Sub4_Sub2_2140.method1919(var2, var3, var10);
            var3 += var10;
            var4 -= var10;
            var1.anInt2134 += (var9 * var10 - 1048576) * -319108871;
            int var8 = -954458055 * Class9.anInt135 / 100;
            int var11 = 262144 / var9;
            if(var11 < var8) {
               var8 = var11;
            }

            Class116_Sub4_Sub2 var7 = var1.aClass116_Sub4_Sub2_2140;
            if(this.aClass116_Sub4_Sub4_2530.anIntArray2541[1956904859 * var1.anInt2125] == 0) {
               var1.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var1.aClass116_Sub2_Sub1_2124, var7.method2754(), var7.method2776(), var7.method2742());
            } else {
               var1.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var1.aClass116_Sub2_Sub1_2124, var7.method2754(), 0, var7.method2742());
               this.aClass116_Sub4_Sub4_2530.method3011(var1, var1.aClass116_Sub19_2133.aShortArray2111[var1.anInt2137 * 1484938015] < 0, (byte)29);
               var1.aClass116_Sub4_Sub2_2140.method2746(var8, var7.method2776());
            }

            if(var1.aClass116_Sub19_2133.aShortArray2111[1484938015 * var1.anInt2137] < 0) {
               var1.aClass116_Sub4_Sub2_2140.method2737(-1);
            }

            var7.method2748(var8);
            var7.method1919(var2, var3, var5 - var3);
            if(var7.method2752()) {
               this.aClass116_Sub4_Sub1_2529.method2706(var7);
            }
         }
      }

      var1.aClass116_Sub4_Sub2_2140.method1919(var2, var3, var4);
   }

}
