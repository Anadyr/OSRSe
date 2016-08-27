package com.jagex;

public class SpotAnim extends Animable {

   short[] aShortArray2781;
   static byte[] aByteArray2782 = new byte[1];
   static SpotAnim aSpotAnim_2783 = new SpotAnim();
   static byte[] aByteArray2784 = new byte[1];
   int anInt2785 = 0;
   int[] anIntArray2786;
   static int[] anIntArray2787 = new int[12];
   int[] anIntArray2788;
   int anInt2789;
   int[] anIntArray2790;
   int[] anIntArray2791;
   int[] anIntArray2792;
   int[] anIntArray2793;
   int[] anIntArray2794;
   int[] anIntArray2795;
   int[][] anIntArrayArray2796;
   byte[] aByteArray2797;
   byte[] aByteArray2798;
   static int[][] anIntArrayArray2799 = new int[1600][512];
   static int[] anIntArray2800 = new int[2000];
   int anInt2801 = 0;
   int[] anIntArray2802;
   int[] anIntArray2803;
   static final int anInt2804 = 50;
   int[][] anIntArrayArray2805;
   static int[] anIntArray2806 = new int[10];
   int[] anIntArray2807;
   static int anInt2808;
   public boolean aBool2809 = false;
   int anInt2810;
   byte aByte2811 = 0;
   int anInt2812;
   static SpotAnim aSpotAnim_2813 = new SpotAnim();
   static boolean[] aBoolArray2814 = new boolean[4096];
   byte[] aByteArray2815;
   static int[] anIntArray2816 = new int[4096];
   static int[] anIntArray2817 = new int[4096];
   static int[] anIntArray2818 = new int[4096];
   static int[] anIntArray2819 = new int[4096];
   static int[] anIntArray2820 = new int[4096];
   static int[] anIntArray2821 = new int[4096];
   public static int[] anIntArray2822 = new int[1000];
   static int[] anIntArray2823 = new int[1600];
   static int anInt2824;
   static int[] anIntArray2825 = new int[12];
   static final int anInt2826 = 1600;
   int anInt2827;
   static int[] anIntArray2828 = new int[2000];
   static final int anInt2829 = 4096;
   static int[] anIntArray2830 = new int[10];
   int anInt2831 = 0;
   static int[] anIntArray2832 = new int[10];
   static int[][] anIntArrayArray2833 = new int[12][2000];
   static boolean[] aBoolArray2834 = new boolean[4096];
   static int anInt2835;
   public static boolean aBool2836 = false;
   public static int anInt2837 = 0;
   int[] anIntArray2838;
   public static int anInt2839 = 0;
   static int[] anIntArray2840 = Texture.anIntArray2714;
   static int[] anIntArray2841 = Texture.anIntArray2708;
   static int[] anIntArray2842 = Texture.anIntArray2713;
   public static int anInt2843 = 0;
   static int[] anIntArray2844 = Texture.anIntArray2717;
   int anInt2845;
   static final int anInt2846 = 3500;


   public final void method3368(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 2 && this.anInt2789 != 1) {
         this.method3374();
      }

      int var9 = Texture.anInt2705;
      int var10 = Texture.anInt2706;
      int var11 = anIntArray2841[var1];
      int var12 = anIntArray2842[var1];
      int var13 = anIntArray2841[var2];
      int var14 = anIntArray2842[var2];
      int var15 = anIntArray2841[var3];
      int var16 = anIntArray2842[var3];
      int var17 = anIntArray2841[var4];
      int var18 = anIntArray2842[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.anInt2785; ++var20) {
         int var21 = this.anIntArray2786[var20];
         int var22 = this.anIntArray2807[var20];
         int var23 = this.anIntArray2788[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         anIntArray2818[var20] = var23 - var19;
         anIntArray2816[var20] = var9 + var21 * Texture.anInt2704 / var8;
         anIntArray2817[var20] = var10 + var24 * Texture.anInt2704 / var8;
         if(this.anInt2801 > 0) {
            anIntArray2819[var20] = var21;
            anIntArray2820[var20] = var24;
            anIntArray2821[var20] = var23;
         }
      }

      try {
         this.method3434(false, false, 0);
      } catch (Exception var25) {
         ;
      }

   }

   public SpotAnim method3369(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3373();
      int var15 = var2 - this.anInt2810;
      int var11 = var2 + this.anInt2810;
      int var16 = var4 - this.anInt2810;
      int var14 = var4 + this.anInt2810;
      if(var15 >= 0 && var11 + 128 >> 7 < var1.length && var16 >= 0 && var14 + 128 >> 7 < var1[0].length) {
         var15 >>= 7;
         var11 = var11 + 127 >> 7;
         var16 >>= 7;
         var14 = var14 + 127 >> 7;
         if(var1[var15][var16] == var3 && var1[var11][var16] == var3 && var1[var15][var14] == var3 && var1[var11][var14] == var3) {
            return this;
         } else {
            SpotAnim var17;
            if(var5) {
               var17 = new SpotAnim();
               var17.anInt2785 = this.anInt2785;
               var17.anInt2831 = this.anInt2831;
               var17.anInt2801 = this.anInt2801;
               var17.anIntArray2786 = this.anIntArray2786;
               var17.anIntArray2788 = this.anIntArray2788;
               var17.anIntArray2790 = this.anIntArray2790;
               var17.anIntArray2791 = this.anIntArray2791;
               var17.anIntArray2792 = this.anIntArray2792;
               var17.anIntArray2793 = this.anIntArray2793;
               var17.anIntArray2794 = this.anIntArray2794;
               var17.anIntArray2795 = this.anIntArray2795;
               var17.aByteArray2815 = this.aByteArray2815;
               var17.aByteArray2797 = this.aByteArray2797;
               var17.aByteArray2798 = this.aByteArray2798;
               var17.aShortArray2781 = this.aShortArray2781;
               var17.aByte2811 = this.aByte2811;
               var17.anIntArray2802 = this.anIntArray2802;
               var17.anIntArray2803 = this.anIntArray2803;
               var17.anIntArray2838 = this.anIntArray2838;
               var17.anIntArrayArray2805 = this.anIntArrayArray2805;
               var17.anIntArrayArray2796 = this.anIntArrayArray2796;
               var17.aBool2809 = this.aBool2809;
               var17.anIntArray2807 = new int[var17.anInt2785];
            } else {
               var17 = this;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var12;
            int var13;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var17.anInt2785; ++var12) {
                  var13 = this.anIntArray2786[var12] + var2;
                  var18 = this.anIntArray2788[var12] + var4;
                  var20 = var13 & 127;
                  var9 = var18 & 127;
                  var19 = var13 >> 7;
                  var7 = var18 >> 7;
                  var8 = var1[var19][var7] * (128 - var20) + var1[var19 + 1][var7] * var20 >> 7;
                  var10 = var1[var19][var7 + 1] * (128 - var20) + var1[var19 + 1][var7 + 1] * var20 >> 7;
                  var21 = var8 * (128 - var9) + var10 * var9 >> 7;
                  var17.anIntArray2807[var12] = this.anIntArray2807[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var17.anInt2785; ++var12) {
                  var13 = (-this.anIntArray2807[var12] << 16) / (this.modelHeight * 1812947537);
                  if(var13 < var6) {
                     var18 = this.anIntArray2786[var12] + var2;
                     var20 = this.anIntArray2788[var12] + var4;
                     var9 = var18 & 127;
                     var19 = var20 & 127;
                     var7 = var18 >> 7;
                     var8 = var20 >> 7;
                     var10 = var1[var7][var8] * (128 - var9) + var1[var7 + 1][var8] * var9 >> 7;
                     var21 = var1[var7][var8 + 1] * (128 - var9) + var1[var7 + 1][var8 + 1] * var9 >> 7;
                     int var22 = var10 * (128 - var19) + var21 * var19 >> 7;
                     var17.anIntArray2807[var12] = this.anIntArray2807[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var17.anInt2789 = 0;
            return var17;
         }
      } else {
         return this;
      }
   }

   public SpotAnim method3370(boolean var1) {
      if(!var1 && aByteArray2782.length < this.anInt2831) {
         aByteArray2782 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2813, aByteArray2782);
   }

   public SpotAnim method3371(boolean var1) {
      if(!var1 && aByteArray2784.length < this.anInt2831) {
         aByteArray2784 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2783, aByteArray2784);
   }

   SpotAnim method3372(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 100];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   public void method3373() {
      if(this.anInt2789 != 1) {
         this.anInt2789 = 1;
         this.modelHeight = 0;
         this.anInt2845 = 0;
         this.anInt2810 = 0;

         for(int var1 = 0; var1 < this.anInt2785; ++var1) {
            int var2 = this.anIntArray2786[var1];
            int var3 = this.anIntArray2807[var1];
            int var4 = this.anIntArray2788[var1];
            if(-var3 > this.modelHeight * 1812947537) {
               this.modelHeight = -var3 * -969595215;
            }

            if(var3 > this.anInt2845) {
               this.anInt2845 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.anInt2810) {
               this.anInt2810 = var5;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.modelHeight * 1812947537 * this.modelHeight * 1812947537)) + 0.99D);
         this.anInt2827 = this.anInt2812 + (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.anInt2845 * this.anInt2845)) + 0.99D);
      }
   }

   void method3374() {
      if(this.anInt2789 != 2) {
         this.anInt2789 = 2;
         this.anInt2810 = 0;

         for(int var2 = 0; var2 < this.anInt2785; ++var2) {
            int var3 = this.anIntArray2786[var2];
            int var4 = this.anIntArray2807[var2];
            int var5 = this.anIntArray2788[var2];
            int var1 = var3 * var3 + var5 * var5 + var4 * var4;
            if(var1 > this.anInt2810) {
               this.anInt2810 = var1;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = this.anInt2810;
         this.anInt2827 = this.anInt2810 + this.anInt2810;
      }
   }

   public int method3375() {
      this.method3373();
      return this.anInt2810;
   }

   public void method3376(Class116_Sub23_Sub17 var1, int var2) {
      if(this.anIntArrayArray2805 != null) {
         if(var2 != -1) {
            Class28 var4 = var1.aClass28Array2471[var2];
            Class116_Sub5 var5 = var4.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;

            for(int var3 = 0; var3 < var4.anInt395; ++var3) {
               int var6 = var4.anIntArray396[var3];
               this.method3378(var5.anIntArray1723[var6], var5.anIntArrayArray1726[var6], var4.anIntArray391[var3], var4.anIntArray398[var3], var4.anIntArray399[var3]);
            }

            this.anInt2789 = 0;
         }
      }
   }

   public void method3377() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   void method3378(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var9;
      int var10;
      int var11;
      int var13;
      if(var1 == 0) {
         var9 = 0;
         anInt2824 = 0;
         anInt2808 = 0;
         anInt2835 = 0;

         for(var10 = 0; var10 < var6; ++var10) {
            int var19 = var2[var10];
            if(var19 < this.anIntArrayArray2805.length) {
               int[] var18 = this.anIntArrayArray2805[var19];

               for(var13 = 0; var13 < var18.length; ++var13) {
                  var11 = var18[var13];
                  anInt2824 += this.anIntArray2786[var11];
                  anInt2808 += this.anIntArray2807[var11];
                  anInt2835 += this.anIntArray2788[var11];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt2824 = anInt2824 / var9 + var3;
            anInt2808 = anInt2808 / var9 + var4;
            anInt2835 = anInt2835 / var9 + var5;
         } else {
            anInt2824 = var3;
            anInt2808 = var4;
            anInt2835 = var5;
         }

      } else {
         int var12;
         int[] var14;
         if(var1 == 1) {
            for(var9 = 0; var9 < var6; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray2805.length) {
                  var14 = this.anIntArrayArray2805[var10];

                  for(var12 = 0; var12 < var14.length; ++var12) {
                     var13 = var14[var12];
                     this.anIntArray2786[var13] += var3;
                     this.anIntArray2807[var13] += var4;
                     this.anIntArray2788[var13] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var9 = 0; var9 < var6; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray2805.length) {
                  var14 = this.anIntArrayArray2805[var10];

                  for(var12 = 0; var12 < var14.length; ++var12) {
                     var13 = var14[var12];
                     this.anIntArray2786[var13] -= anInt2824;
                     this.anIntArray2807[var13] -= anInt2808;
                     this.anIntArray2788[var13] -= anInt2835;
                     var11 = (var3 & 255) * 8;
                     int var7 = (var4 & 255) * 8;
                     int var17 = (var5 & 255) * 8;
                     int var8;
                     int var15;
                     int var16;
                     if(var17 != 0) {
                        var16 = anIntArray2841[var17];
                        var8 = anIntArray2842[var17];
                        var15 = this.anIntArray2807[var13] * var16 + this.anIntArray2786[var13] * var8 >> 16;
                        this.anIntArray2807[var13] = this.anIntArray2807[var13] * var8 - this.anIntArray2786[var13] * var16 >> 16;
                        this.anIntArray2786[var13] = var15;
                     }

                     if(var11 != 0) {
                        var16 = anIntArray2841[var11];
                        var8 = anIntArray2842[var11];
                        var15 = this.anIntArray2807[var13] * var8 - this.anIntArray2788[var13] * var16 >> 16;
                        this.anIntArray2788[var13] = this.anIntArray2807[var13] * var16 + this.anIntArray2788[var13] * var8 >> 16;
                        this.anIntArray2807[var13] = var15;
                     }

                     if(var7 != 0) {
                        var16 = anIntArray2841[var7];
                        var8 = anIntArray2842[var7];
                        var15 = this.anIntArray2788[var13] * var16 + this.anIntArray2786[var13] * var8 >> 16;
                        this.anIntArray2788[var13] = this.anIntArray2788[var13] * var8 - this.anIntArray2786[var13] * var16 >> 16;
                        this.anIntArray2786[var13] = var15;
                     }

                     this.anIntArray2786[var13] += anInt2824;
                     this.anIntArray2807[var13] += anInt2808;
                     this.anIntArray2788[var13] += anInt2835;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var9 = 0; var9 < var6; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray2805.length) {
                  var14 = this.anIntArrayArray2805[var10];

                  for(var12 = 0; var12 < var14.length; ++var12) {
                     var13 = var14[var12];
                     this.anIntArray2786[var13] -= anInt2824;
                     this.anIntArray2807[var13] -= anInt2808;
                     this.anIntArray2788[var13] -= anInt2835;
                     this.anIntArray2786[var13] = this.anIntArray2786[var13] * var3 / 128;
                     this.anIntArray2807[var13] = this.anIntArray2807[var13] * var4 / 128;
                     this.anIntArray2788[var13] = this.anIntArray2788[var13] * var5 / 128;
                     this.anIntArray2786[var13] += anInt2824;
                     this.anIntArray2807[var13] += anInt2808;
                     this.anIntArray2788[var13] += anInt2835;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.anIntArrayArray2796 != null && this.aByteArray2797 != null) {
               for(var9 = 0; var9 < var6; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray2796.length) {
                     var14 = this.anIntArrayArray2796[var10];

                     for(var12 = 0; var12 < var14.length; ++var12) {
                        var13 = var14[var12];
                        var11 = (this.aByteArray2797[var13] & 255) + var3 * 8;
                        if(var11 < 0) {
                           var11 = 0;
                        } else if(var11 > 255) {
                           var11 = 255;
                        }

                        this.aByteArray2797[var13] = (byte)var11;
                     }
                  }
               }
            }

         }
      }
   }

   final void method3379(int var1) {
      if(aBoolArray2834[var1]) {
         this.method3388(var1);
      } else {
         int var2 = this.anIntArray2790[var1];
         int var3 = this.anIntArray2791[var1];
         int var4 = this.anIntArray2792[var1];
         Texture.aBool2700 = aBoolArray2814[var1];
         if(this.aByteArray2797 == null) {
            Texture.anInt2699 = 0;
         } else {
            Texture.anInt2699 = this.aByteArray2797[var1] & 255;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               int var8 = this.aByteArray2798[var1] & 255;
               var5 = this.anIntArray2802[var8];
               var6 = this.anIntArray2803[var8];
               var7 = this.anIntArray2838[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(anIntArray2817[var2], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var2], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var5], anIntArray2819[var6], anIntArray2819[var7], anIntArray2820[var5], anIntArray2820[var6], anIntArray2820[var7], anIntArray2821[var5], anIntArray2821[var6], anIntArray2821[var7], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(anIntArray2817[var2], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var2], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1], anIntArray2819[var5], anIntArray2819[var6], anIntArray2819[var7], anIntArray2820[var5], anIntArray2820[var6], anIntArray2820[var7], anIntArray2821[var5], anIntArray2821[var6], anIntArray2821[var7], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(anIntArray2817[var2], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var2], anIntArray2816[var3], anIntArray2816[var4], anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(anIntArray2817[var2], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var2], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1]);
         }

      }
   }

   public void method3380() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   public void method3381() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   public void method3382(int var1) {
      int var2 = anIntArray2841[var1];
      int var4 = anIntArray2842[var1];

      for(int var3 = 0; var3 < this.anInt2785; ++var3) {
         int var5 = this.anIntArray2807[var3] * var4 - this.anIntArray2788[var3] * var2 >> 16;
         this.anIntArray2788[var3] = this.anIntArray2807[var3] * var2 + this.anIntArray2788[var3] * var4 >> 16;
         this.anIntArray2807[var3] = var5;
      }

      this.anInt2789 = 0;
   }

   public void method3383(Class116_Sub23_Sub17 var1, int var2, Class116_Sub23_Sub17 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            Class28 var9 = var1.aClass28Array2471[var2];
            Class28 var6 = var3.aClass28Array2471[var4];
            Class116_Sub5 var12 = var9.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            byte var7 = 0;
            int var13 = var7 + 1;
            int var8 = var5[var7];

            int var10;
            int var11;
            for(var11 = 0; var11 < var9.anInt395; ++var11) {
               for(var10 = var9.anIntArray396[var11]; var10 > var8; var8 = var5[var13++]) {
                  ;
               }

               if(var10 != var8 || var12.anIntArray1723[var10] == 0) {
                  this.method3378(var12.anIntArray1723[var10], var12.anIntArrayArray1726[var10], var9.anIntArray391[var11], var9.anIntArray398[var11], var9.anIntArray399[var11]);
               }
            }

            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            var7 = 0;
            var13 = var7 + 1;
            var8 = var5[var7];

            for(var11 = 0; var11 < var6.anInt395; ++var11) {
               for(var10 = var6.anIntArray396[var11]; var10 > var8; var8 = var5[var13++]) {
                  ;
               }

               if(var10 == var8 || var12.anIntArray1723[var10] == 0) {
                  this.method3378(var12.anIntArray1723[var10], var12.anIntArrayArray1726[var10], var6.anIntArray391[var11], var6.anIntArray398[var11], var6.anIntArray399[var11]);
               }
            }

            this.anInt2789 = 0;
         } else {
            this.method3376(var1, var2);
         }
      }
   }

   public void method3384(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] = this.anIntArray2786[var4] * var1 / 128;
         this.anIntArray2807[var4] = this.anIntArray2807[var4] * var2 / 128;
         this.anIntArray2788[var4] = this.anIntArray2788[var4] * var3 / 128;
      }

      this.anInt2789 = 0;
   }

   public SpotAnim(SpotAnim[] var1, int var2) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var9 = false;
      boolean var8 = false;
      this.anInt2785 = 0;
      this.anInt2831 = 0;
      this.anInt2801 = 0;
      this.aByte2811 = -1;

      SpotAnim var3;
      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         var3 = var1[var7];
         if(var3 != null) {
            this.anInt2785 += var3.anInt2785;
            this.anInt2831 += var3.anInt2831;
            this.anInt2801 += var3.anInt2801;
            if(var3.aByteArray2815 != null) {
               var5 = true;
            } else {
               if(this.aByte2811 == -1) {
                  this.aByte2811 = var3.aByte2811;
               }

               if(this.aByte2811 != var3.aByte2811) {
                  var5 = true;
               }
            }

            var6 |= var3.aByteArray2797 != null;
            var9 |= var3.aShortArray2781 != null;
            var8 |= var3.aByteArray2798 != null;
         }
      }

      this.anIntArray2786 = new int[this.anInt2785];
      this.anIntArray2807 = new int[this.anInt2785];
      this.anIntArray2788 = new int[this.anInt2785];
      this.anIntArray2790 = new int[this.anInt2831];
      this.anIntArray2791 = new int[this.anInt2831];
      this.anIntArray2792 = new int[this.anInt2831];
      this.anIntArray2793 = new int[this.anInt2831];
      this.anIntArray2794 = new int[this.anInt2831];
      this.anIntArray2795 = new int[this.anInt2831];
      if(var5) {
         this.aByteArray2815 = new byte[this.anInt2831];
      }

      if(var6) {
         this.aByteArray2797 = new byte[this.anInt2831];
      }

      if(var9) {
         this.aShortArray2781 = new short[this.anInt2831];
      }

      if(var8) {
         this.aByteArray2798 = new byte[this.anInt2831];
      }

      if(this.anInt2801 > 0) {
         this.anIntArray2802 = new int[this.anInt2801];
         this.anIntArray2803 = new int[this.anInt2801];
         this.anIntArray2838 = new int[this.anInt2801];
      }

      this.anInt2785 = 0;
      this.anInt2831 = 0;
      this.anInt2801 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var3 = var1[var7];
         if(var3 != null) {
            int var4;
            for(var4 = 0; var4 < var3.anInt2831; ++var4) {
               this.anIntArray2790[this.anInt2831] = var3.anIntArray2790[var4] + this.anInt2785;
               this.anIntArray2791[this.anInt2831] = var3.anIntArray2791[var4] + this.anInt2785;
               this.anIntArray2792[this.anInt2831] = var3.anIntArray2792[var4] + this.anInt2785;
               this.anIntArray2793[this.anInt2831] = var3.anIntArray2793[var4];
               this.anIntArray2794[this.anInt2831] = var3.anIntArray2794[var4];
               this.anIntArray2795[this.anInt2831] = var3.anIntArray2795[var4];
               if(var5) {
                  if(var3.aByteArray2815 != null) {
                     this.aByteArray2815[this.anInt2831] = var3.aByteArray2815[var4];
                  } else {
                     this.aByteArray2815[this.anInt2831] = var3.aByte2811;
                  }
               }

               if(var6 && var3.aByteArray2797 != null) {
                  this.aByteArray2797[this.anInt2831] = var3.aByteArray2797[var4];
               }

               if(var9) {
                  if(var3.aShortArray2781 != null) {
                     this.aShortArray2781[this.anInt2831] = var3.aShortArray2781[var4];
                  } else {
                     this.aShortArray2781[this.anInt2831] = -1;
                  }
               }

               if(var8) {
                  if(var3.aByteArray2798 != null && var3.aByteArray2798[var4] != -1) {
                     this.aByteArray2798[this.anInt2831] = (byte)(var3.aByteArray2798[var4] + this.anInt2801);
                  } else {
                     this.aByteArray2798[this.anInt2831] = -1;
                  }
               }

               ++this.anInt2831;
            }

            for(var4 = 0; var4 < var3.anInt2801; ++var4) {
               this.anIntArray2802[this.anInt2801] = var3.anIntArray2802[var4] + this.anInt2785;
               this.anIntArray2803[this.anInt2801] = var3.anIntArray2803[var4] + this.anInt2785;
               this.anIntArray2838[this.anInt2801] = var3.anIntArray2838[var4] + this.anInt2785;
               ++this.anInt2801;
            }

            for(var4 = 0; var4 < var3.anInt2785; ++var4) {
               this.anIntArray2786[this.anInt2785] = var3.anIntArray2786[var4];
               this.anIntArray2807[this.anInt2785] = var3.anIntArray2807[var4];
               this.anIntArray2788[this.anInt2785] = var3.anIntArray2788[var4];
               ++this.anInt2785;
            }
         }
      }

   }

   public void method3385(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] += var1;
         this.anIntArray2807[var4] += var2;
         this.anIntArray2788[var4] += var3;
      }

      this.anInt2789 = 0;
   }

   void method2874(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 1) {
         this.method3373();
      }

      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.anInt2810 * var3 >> 16;
      int var13 = var11 + var12;
      if(var13 > 50 && var11 < 3500) {
         int var14 = var8 * var4 + var6 * var5 >> 16;
         int var15 = (var14 - this.anInt2810) * Texture.anInt2704;
         if(var15 / var13 < Texture.anInt2695) {
            int var16 = (var14 + this.anInt2810) * Texture.anInt2704;
            if(var16 / var13 > Texture.anInt2709) {
               int var17 = var7 * var3 - var10 * var2 >> 16;
               int var18 = this.anInt2810 * var2 >> 16;
               int var19 = (var17 + var18) * Texture.anInt2704;
               if(var19 / var13 > Texture.anInt2719) {
                  int var20 = var18 + (this.modelHeight * 1812947537 * var3 >> 16);
                  int var21 = (var17 - var20) * Texture.anInt2704;
                  if(var21 / var13 < Texture.anInt2701) {
                     int var22 = var12 + (this.modelHeight * 1812947537 * var2 >> 16);
                     boolean var23 = false;
                     boolean var24 = false;
                     if(var11 - var22 <= 50) {
                        var24 = true;
                     }

                     boolean var25 = var24 || this.anInt2801 > 0;
                     boolean var26 = false;
                     int var27;
                     int var28;
                     int var29;
                     if(var9 > 0 && aBool2836) {
                        var27 = var11 - var12;
                        if(var27 <= 50) {
                           var27 = 50;
                        }

                        if(var14 > 0) {
                           var15 /= var13;
                           var16 /= var27;
                        } else {
                           var16 /= var13;
                           var15 /= var27;
                        }

                        if(var17 > 0) {
                           var21 /= var13;
                           var19 /= var27;
                        } else {
                           var19 /= var13;
                           var21 /= var27;
                        }

                        var28 = anInt2837 - Texture.anInt2705;
                        var29 = anInt2843 - Texture.anInt2706;
                        if(var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                           if(this.aBool2809) {
                              anIntArray2822[anInt2839++] = var9;
                           } else {
                              var26 = true;
                           }
                        }
                     }

                     var27 = Texture.anInt2705;
                     var28 = Texture.anInt2706;
                     var29 = 0;
                     int var30 = 0;
                     if(var1 != 0) {
                        var29 = anIntArray2841[var1];
                        var30 = anIntArray2842[var1];
                     }

                     for(int var31 = 0; var31 < this.anInt2785; ++var31) {
                        int var32 = this.anIntArray2786[var31];
                        int var33 = this.anIntArray2807[var31];
                        int var34 = this.anIntArray2788[var31];
                        int var35;
                        if(var1 != 0) {
                           var35 = var34 * var29 + var32 * var30 >> 16;
                           var34 = var34 * var30 - var32 * var29 >> 16;
                           var32 = var35;
                        }

                        var32 += var6;
                        var33 += var7;
                        var34 += var8;
                        var35 = var34 * var4 + var32 * var5 >> 16;
                        var34 = var34 * var5 - var32 * var4 >> 16;
                        var32 = var35;
                        var35 = var33 * var3 - var34 * var2 >> 16;
                        var34 = var33 * var2 + var34 * var3 >> 16;
                        anIntArray2818[var31] = var34 - var11;
                        if(var34 >= 50) {
                           anIntArray2816[var31] = var27 + var32 * Texture.anInt2704 / var34;
                           anIntArray2817[var31] = var28 + var35 * Texture.anInt2704 / var34;
                        } else {
                           anIntArray2816[var31] = -5000;
                           var23 = true;
                        }

                        if(var25) {
                           anIntArray2819[var31] = var32;
                           anIntArray2820[var31] = var35;
                           anIntArray2821[var31] = var34;
                        }
                     }

                     try {
                        this.method3434(var23, var26, var9);
                     } catch (Exception var36) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   final boolean method3386(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   public void method3387() {
      if(this.anInt2789 != 1) {
         this.anInt2789 = 1;
         this.modelHeight = 0;
         this.anInt2845 = 0;
         this.anInt2810 = 0;

         for(int var2 = 0; var2 < this.anInt2785; ++var2) {
            int var3 = this.anIntArray2786[var2];
            int var1 = this.anIntArray2807[var2];
            int var4 = this.anIntArray2788[var2];
            if(-var1 > this.modelHeight * 1812947537) {
               this.modelHeight = -var1 * -969595215;
            }

            if(var1 > this.anInt2845) {
               this.anInt2845 = var1;
            }

            int var5 = var3 * var3 + var4 * var4;
            if(var5 > this.anInt2810) {
               this.anInt2810 = var5;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.modelHeight * 1812947537 * this.modelHeight * -1524552817)) + 0.99D);
         this.anInt2827 = this.anInt2812 + (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.anInt2845 * this.anInt2845)) + 0.99D);
      }
   }

   final void method3388(int var1) {
      int var2 = Texture.anInt2705;
      int var20 = Texture.anInt2706;
      int var15 = 0;
      int var12 = this.anIntArray2790[var1];
      int var19 = this.anIntArray2791[var1];
      int var13 = this.anIntArray2792[var1];
      int var17 = anIntArray2821[var12];
      int var18 = anIntArray2821[var19];
      int var16 = anIntArray2821[var13];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 255;
      }

      int var3;
      int var6;
      int var7;
      int var8;
      if(var17 >= 50) {
         anIntArray2830[var15] = anIntArray2816[var12];
         anIntArray2806[var15] = anIntArray2817[var12];
         anIntArray2832[var15++] = this.anIntArray2793[var1];
      } else {
         var6 = anIntArray2819[var12];
         var7 = anIntArray2820[var12];
         var8 = this.anIntArray2793[var1];
         if(var16 >= 50) {
            var3 = (50 - var17) * anIntArray2844[var16 - var17];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var13] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var13] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2795[var1] - var8) * var3 >> 16);
         }

         if(var18 >= 50) {
            var3 = (50 - var17) * anIntArray2844[var18 - var17];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var19] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var19] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2794[var1] - var8) * var3 >> 16);
         }
      }

      if(var18 >= 50) {
         anIntArray2830[var15] = anIntArray2816[var19];
         anIntArray2806[var15] = anIntArray2817[var19];
         anIntArray2832[var15++] = this.anIntArray2794[var1];
      } else {
         var6 = anIntArray2819[var19];
         var7 = anIntArray2820[var19];
         var8 = this.anIntArray2794[var1];
         if(var17 >= 50) {
            var3 = (50 - var18) * anIntArray2844[var17 - var18];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var12] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var12] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2793[var1] - var8) * var3 >> 16);
         }

         if(var16 >= 50) {
            var3 = (50 - var18) * anIntArray2844[var16 - var18];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var13] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var13] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2795[var1] - var8) * var3 >> 16);
         }
      }

      if(var16 >= 50) {
         anIntArray2830[var15] = anIntArray2816[var13];
         anIntArray2806[var15] = anIntArray2817[var13];
         anIntArray2832[var15++] = this.anIntArray2795[var1];
      } else {
         var6 = anIntArray2819[var13];
         var7 = anIntArray2820[var13];
         var8 = this.anIntArray2795[var1];
         if(var18 >= 50) {
            var3 = (50 - var16) * anIntArray2844[var18 - var16];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var19] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var19] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2794[var1] - var8) * var3 >> 16);
         }

         if(var17 >= 50) {
            var3 = (50 - var16) * anIntArray2844[var17 - var16];
            anIntArray2830[var15] = var2 + (var6 + ((anIntArray2819[var12] - var6) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var15] = var20 + (var7 + ((anIntArray2820[var12] - var7) * var3 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var15++] = var8 + ((this.anIntArray2793[var1] - var8) * var3 >> 16);
         }
      }

      var6 = anIntArray2830[0];
      var7 = anIntArray2830[1];
      var8 = anIntArray2830[2];
      var3 = anIntArray2806[0];
      int var4 = anIntArray2806[1];
      int var5 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var9;
      int var10;
      int var11;
      int var14;
      if(var15 == 3) {
         if(var6 < 0 || var7 < 0 || var8 < 0 || var6 > Texture.anInt2712 || var7 > Texture.anInt2712 || var8 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var14 = this.aByteArray2798[var1] & 255;
               var9 = this.anIntArray2802[var14];
               var10 = this.anIntArray2803[var14];
               var11 = this.anIntArray2838[var14];
            } else {
               var9 = var12;
               var10 = var19;
               var11 = var13;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var3, var4, var5, var6, var7, var8, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var3, var4, var5, var6, var7, var8, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var3, var4, var5, var6, var7, var8, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var3, var4, var5, var6, var7, var8, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var15 == 4) {
         if(var6 < 0 || var7 < 0 || var8 < 0 || var6 > Texture.anInt2712 || var7 > Texture.anInt2712 || var8 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var14 = this.aByteArray2798[var1] & 255;
               var9 = this.anIntArray2802[var14];
               var10 = this.anIntArray2803[var14];
               var11 = this.anIntArray2838[var14];
            } else {
               var9 = var12;
               var10 = var19;
               var11 = var13;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var3, var4, var5, var6, var7, var8, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], var21);
               Texture.method3194(var3, var5, anIntArray2806[3], var6, var8, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], var21);
            } else {
               Texture.method3194(var3, var4, var5, var6, var7, var8, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], var21);
               Texture.method3194(var3, var5, anIntArray2806[3], var6, var8, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var9], anIntArray2819[var10], anIntArray2819[var11], anIntArray2820[var9], anIntArray2820[var10], anIntArray2820[var11], anIntArray2821[var9], anIntArray2821[var10], anIntArray2821[var11], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var9 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var3, var4, var5, var6, var7, var8, var9);
            Texture.method3200(var3, var5, anIntArray2806[3], var6, var8, anIntArray2830[3], var9);
         } else {
            Texture.method3215(var3, var4, var5, var6, var7, var8, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var3, var5, anIntArray2806[3], var6, var8, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   public SpotAnim method3389(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3373();
      int var18 = var2 - this.anInt2810;
      int var10 = var2 + this.anInt2810;
      int var17 = var4 - this.anInt2810;
      int var14 = var4 + this.anInt2810;
      if(var18 >= 0 && var10 + 128 >> 7 < var1.length && var17 >= 0 && var14 + 128 >> 7 < var1[0].length) {
         var18 >>= 7;
         var10 = var10 + 127 >> 7;
         var17 >>= 7;
         var14 = var14 + 127 >> 7;
         if(var1[var18][var17] == var3 && var1[var10][var17] == var3 && var1[var18][var14] == var3 && var1[var10][var14] == var3) {
            return this;
         } else {
            SpotAnim var7;
            if(var5) {
               var7 = new SpotAnim();
               var7.anInt2785 = this.anInt2785;
               var7.anInt2831 = this.anInt2831;
               var7.anInt2801 = this.anInt2801;
               var7.anIntArray2786 = this.anIntArray2786;
               var7.anIntArray2788 = this.anIntArray2788;
               var7.anIntArray2790 = this.anIntArray2790;
               var7.anIntArray2791 = this.anIntArray2791;
               var7.anIntArray2792 = this.anIntArray2792;
               var7.anIntArray2793 = this.anIntArray2793;
               var7.anIntArray2794 = this.anIntArray2794;
               var7.anIntArray2795 = this.anIntArray2795;
               var7.aByteArray2815 = this.aByteArray2815;
               var7.aByteArray2797 = this.aByteArray2797;
               var7.aByteArray2798 = this.aByteArray2798;
               var7.aShortArray2781 = this.aShortArray2781;
               var7.aByte2811 = this.aByte2811;
               var7.anIntArray2802 = this.anIntArray2802;
               var7.anIntArray2803 = this.anIntArray2803;
               var7.anIntArray2838 = this.anIntArray2838;
               var7.anIntArrayArray2805 = this.anIntArrayArray2805;
               var7.anIntArrayArray2796 = this.anIntArrayArray2796;
               var7.aBool2809 = this.aBool2809;
               var7.anIntArray2807 = new int[var7.anInt2785];
            } else {
               var7 = this;
            }

            int var8;
            int var9;
            int var11;
            int var12;
            int var13;
            int var15;
            int var16;
            int var19;
            int var20;
            int var22;
            if(var6 == 0) {
               for(var8 = 0; var8 < var7.anInt2785; ++var8) {
                  var19 = this.anIntArray2786[var8] + var2;
                  var22 = this.anIntArray2788[var8] + var4;
                  var16 = var19 & 127;
                  var13 = var22 & 127;
                  var15 = var19 >> 7;
                  var11 = var22 >> 7;
                  var12 = var1[var15][var11] * (128 - var16) + var1[var15 + 1][var11] * var16 >> 7;
                  var20 = var1[var15][var11 + 1] * (128 - var16) + var1[var15 + 1][var11 + 1] * var16 >> 7;
                  var9 = var12 * (128 - var13) + var20 * var13 >> 7;
                  var7.anIntArray2807[var8] = this.anIntArray2807[var8] + var9 - var3;
               }
            } else {
               for(var8 = 0; var8 < var7.anInt2785; ++var8) {
                  var19 = (-this.anIntArray2807[var8] << 16) / (this.modelHeight * 1812947537);
                  if(var19 < var6) {
                     var22 = this.anIntArray2786[var8] + var2;
                     var16 = this.anIntArray2788[var8] + var4;
                     var13 = var22 & 127;
                     var15 = var16 & 127;
                     var11 = var22 >> 7;
                     var12 = var16 >> 7;
                     var20 = var1[var11][var12] * (128 - var13) + var1[var11 + 1][var12] * var13 >> 7;
                     var9 = var1[var11][var12 + 1] * (128 - var13) + var1[var11 + 1][var12 + 1] * var13 >> 7;
                     int var21 = var20 * (128 - var15) + var9 * var15 >> 7;
                     var7.anIntArray2807[var8] = this.anIntArray2807[var8] + (var21 - var3) * (var6 - var19) / var6;
                  }
               }
            }

            var7.anInt2789 = 0;
            return var7;
         }
      } else {
         return this;
      }
   }

   final void method3390(int var1) {
      if(aBoolArray2834[var1]) {
         this.method3388(var1);
      } else {
         int var8 = this.anIntArray2790[var1];
         int var4 = this.anIntArray2791[var1];
         int var2 = this.anIntArray2792[var1];
         Texture.aBool2700 = aBoolArray2814[var1];
         if(this.aByteArray2797 == null) {
            Texture.anInt2699 = 0;
         } else {
            Texture.anInt2699 = this.aByteArray2797[var1] & 255;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            int var3;
            int var5;
            int var7;
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               int var6 = this.aByteArray2798[var1] & 255;
               var7 = this.anIntArray2802[var6];
               var5 = this.anIntArray2803[var6];
               var3 = this.anIntArray2838[var6];
            } else {
               var7 = var8;
               var5 = var4;
               var3 = var2;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(anIntArray2817[var8], anIntArray2817[var4], anIntArray2817[var2], anIntArray2816[var8], anIntArray2816[var4], anIntArray2816[var2], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var5], anIntArray2819[var3], anIntArray2820[var7], anIntArray2820[var5], anIntArray2820[var3], anIntArray2821[var7], anIntArray2821[var5], anIntArray2821[var3], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(anIntArray2817[var8], anIntArray2817[var4], anIntArray2817[var2], anIntArray2816[var8], anIntArray2816[var4], anIntArray2816[var2], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1], anIntArray2819[var7], anIntArray2819[var5], anIntArray2819[var3], anIntArray2820[var7], anIntArray2820[var5], anIntArray2820[var3], anIntArray2821[var7], anIntArray2821[var5], anIntArray2821[var3], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(anIntArray2817[var8], anIntArray2817[var4], anIntArray2817[var2], anIntArray2816[var8], anIntArray2816[var4], anIntArray2816[var2], anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(anIntArray2817[var8], anIntArray2817[var4], anIntArray2817[var2], anIntArray2816[var8], anIntArray2816[var4], anIntArray2816[var2], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1]);
         }

      }
   }

   public void method3391(Class116_Sub23_Sub17 var1, int var2) {
      if(this.anIntArrayArray2805 != null) {
         if(var2 != -1) {
            Class28 var4 = var1.aClass28Array2471[var2];
            Class116_Sub5 var5 = var4.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;

            for(int var3 = 0; var3 < var4.anInt395; ++var3) {
               int var6 = var4.anIntArray396[var3];
               this.method3378(var5.anIntArray1723[var6], var5.anIntArrayArray1726[var6], var4.anIntArray391[var3], var4.anIntArray398[var3], var4.anIntArray399[var3]);
            }

            this.anInt2789 = 0;
         }
      }
   }

   void method2873(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10;
      int var11;
      int var12;
      int var13;
      do {
         anIntArray2823[0] = -1;
         if(this.anInt2789 != 1) {
            this.method3373();
         }

         var10 = var8 * var5 - var6 * var4 >> 16;
         var11 = var7 * var2 + var10 * var3 >> 16;
         var12 = this.anInt2810 * var3 >> 16;
         var13 = var11 + var12;
      } while(var13 <= 50);

      int var14 = var8 * var4 + var6 * var5 >> 16;
      int var15 = (var14 - this.anInt2810) * Texture.anInt2704;
      if(var15 / var13 < Texture.anInt2695) {
         int var16 = (var14 + this.anInt2810) * Texture.anInt2704;
         if(var16 / var13 > Texture.anInt2709) {
            int var17 = var7 * var3 - var10 * var2 >> 16;
            int var18 = this.anInt2810 * var2 >> 16;
            int var19 = (var17 + var18) * Texture.anInt2704;
            if(var19 / var13 > Texture.anInt2719) {
               int var20 = var18 + (this.modelHeight * -722326334 * var3 >> 16);
               int var21 = (var17 - var20) * Texture.anInt2704;
               if(var21 / var13 < Texture.anInt2701) {
                  int var22 = var12 + (this.modelHeight * -1441767820 * var2 >> 16);
                  boolean var23 = false;
                  boolean var24 = false;
                  if(var11 - var22 <= 50) {
                     var24 = true;
                  }

                  boolean var25 = var24 || this.anInt2801 > 0;
                  boolean var26 = false;
                  int var27;
                  int var28;
                  int var29;
                  if(var9 > 0 && aBool2836) {
                     var27 = var11 - var12;
                     if(var27 <= 50) {
                        var27 = 50;
                     }

                     if(var14 > 0) {
                        var15 /= var13;
                        var16 /= var27;
                     } else {
                        var16 /= var13;
                        var15 /= var27;
                     }

                     if(var17 > 0) {
                        var21 /= var13;
                        var19 /= var27;
                     } else {
                        var19 /= var13;
                        var21 /= var27;
                     }

                     var28 = anInt2837 - Texture.anInt2705;
                     var29 = anInt2843 - Texture.anInt2706;
                     if(var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                        if(this.aBool2809) {
                           anIntArray2822[anInt2839++] = var9;
                        } else {
                           var26 = true;
                        }
                     }
                  }

                  var27 = Texture.anInt2705;
                  var28 = Texture.anInt2706;
                  var29 = 0;
                  int var30 = 0;
                  if(var1 != 0) {
                     var29 = anIntArray2841[var1];
                     var30 = anIntArray2842[var1];
                  }

                  for(int var31 = 0; var31 < this.anInt2785; ++var31) {
                     int var32 = this.anIntArray2786[var31];
                     int var33 = this.anIntArray2807[var31];
                     int var34 = this.anIntArray2788[var31];
                     int var35;
                     if(var1 != 0) {
                        var35 = var34 * var29 + var32 * var30 >> 16;
                        var34 = var34 * var30 - var32 * var29 >> 16;
                        var32 = var35;
                     }

                     var32 += var6;
                     var33 += var7;
                     var34 += var8;
                     var35 = var34 * var4 + var32 * var5 >> 16;
                     var34 = var34 * var5 - var32 * var4 >> 16;
                     var32 = var35;
                     var35 = var33 * var3 - var34 * var2 >> 16;
                     var34 = var33 * var2 + var34 * var3 >> 16;
                     anIntArray2818[var31] = var34 - var11;
                     if(var34 >= 941699469) {
                        anIntArray2816[var31] = var27 + var32 * Texture.anInt2704 / var34;
                        anIntArray2817[var31] = var28 + var35 * Texture.anInt2704 / var34;
                     } else {
                        anIntArray2816[var31] = -5000;
                        var23 = true;
                     }

                     if(var25) {
                        anIntArray2819[var31] = var32;
                        anIntArray2820[var31] = var35;
                        anIntArray2821[var31] = var34;
                     }
                  }

                  try {
                     this.method3434(var23, var26, var9);
                  } catch (Exception var36) {
                     ;
                  }

               }
            }
         }
      }
   }

   void method2879(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10;
      int var11;
      int var12;
      int var13;
      do {
         anIntArray2823[0] = -1;
         if(this.anInt2789 != 1) {
            this.method3373();
         }

         var10 = var8 * var5 - var6 * var4 >> 16;
         var11 = var7 * var2 + var10 * var3 >> 16;
         var12 = this.anInt2810 * var3 >> 16;
         var13 = var11 + var12;
      } while(var13 <= 921137950);

      int var14 = var8 * var4 + var6 * var5 >> 16;
      int var15 = (var14 - this.anInt2810) * Texture.anInt2704;
      if(var15 / var13 < Texture.anInt2695) {
         int var16 = (var14 + this.anInt2810) * Texture.anInt2704;
         if(var16 / var13 > Texture.anInt2709) {
            int var17 = var7 * var3 - var10 * var2 >> 16;
            int var18 = this.anInt2810 * var2 >> 16;
            int var19 = (var17 + var18) * Texture.anInt2704;
            if(var19 / var13 > Texture.anInt2719) {
               int var20 = var18 + (this.modelHeight * 1812947537 * var3 >> 16);
               int var21 = (var17 - var20) * Texture.anInt2704;
               if(var21 / var13 < Texture.anInt2701) {
                  int var22 = var12 + (this.modelHeight * 1812947537 * var2 >> 16);
                  boolean var23 = false;
                  boolean var24 = false;
                  if(var11 - var22 <= 50) {
                     var24 = true;
                  }

                  boolean var25 = var24 || this.anInt2801 > 0;
                  boolean var26 = false;
                  int var27;
                  int var28;
                  int var29;
                  if(var9 > 0 && aBool2836) {
                     var27 = var11 - var12;
                     if(var27 <= 50) {
                        var27 = 50;
                     }

                     if(var14 > 0) {
                        var15 /= var13;
                        var16 /= var27;
                     } else {
                        var16 /= var13;
                        var15 /= var27;
                     }

                     if(var17 > 0) {
                        var21 /= var13;
                        var19 /= var27;
                     } else {
                        var19 /= var13;
                        var21 /= var27;
                     }

                     var28 = anInt2837 - Texture.anInt2705;
                     var29 = anInt2843 - Texture.anInt2706;
                     if(var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                        if(this.aBool2809) {
                           anIntArray2822[anInt2839++] = var9;
                        } else {
                           var26 = true;
                        }
                     }
                  }

                  var27 = Texture.anInt2705;
                  var28 = Texture.anInt2706;
                  var29 = 0;
                  int var30 = 0;
                  if(var1 != 0) {
                     var29 = anIntArray2841[var1];
                     var30 = anIntArray2842[var1];
                  }

                  for(int var31 = 0; var31 < this.anInt2785; ++var31) {
                     int var32 = this.anIntArray2786[var31];
                     int var33 = this.anIntArray2807[var31];
                     int var34 = this.anIntArray2788[var31];
                     int var35;
                     if(var1 != 0) {
                        var35 = var34 * var29 + var32 * var30 >> 16;
                        var34 = var34 * var30 - var32 * var29 >> 16;
                        var32 = var35;
                     }

                     var32 += var6;
                     var33 += var7;
                     var34 += var8;
                     var35 = var34 * var4 + var32 * var5 >> 16;
                     var34 = var34 * var5 - var32 * var4 >> 16;
                     var32 = var35;
                     var35 = var33 * var3 - var34 * var2 >> 16;
                     var34 = var33 * var2 + var34 * var3 >> 16;
                     anIntArray2818[var31] = var34 - var11;
                     if(var34 >= 50) {
                        anIntArray2816[var31] = var27 + var32 * Texture.anInt2704 / var34;
                        anIntArray2817[var31] = var28 + var35 * Texture.anInt2704 / var34;
                     } else {
                        anIntArray2816[var31] = 1278656447;
                        var23 = true;
                     }

                     if(var25) {
                        anIntArray2819[var31] = var32;
                        anIntArray2820[var31] = var35;
                        anIntArray2821[var31] = var34;
                     }
                  }

                  try {
                     this.method3434(var23, var26, var9);
                  } catch (Exception var36) {
                     ;
                  }

               }
            }
         }
      }
   }

   final void method3392(int var1) {
      if(aBoolArray2834[var1]) {
         this.method3388(var1);
      } else {
         int var4 = this.anIntArray2790[var1];
         int var5 = this.anIntArray2791[var1];
         int var7 = this.anIntArray2792[var1];
         Texture.aBool2700 = aBoolArray2814[var1];
         if(this.aByteArray2797 == null) {
            Texture.anInt2699 = 0;
         } else {
            Texture.anInt2699 = this.aByteArray2797[var1] & 255;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            int var3;
            int var6;
            int var8;
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               int var2 = this.aByteArray2798[var1] & 255;
               var6 = this.anIntArray2802[var2];
               var3 = this.anIntArray2803[var2];
               var8 = this.anIntArray2838[var2];
            } else {
               var6 = var4;
               var3 = var5;
               var8 = var7;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(anIntArray2817[var4], anIntArray2817[var5], anIntArray2817[var7], anIntArray2816[var4], anIntArray2816[var5], anIntArray2816[var7], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var6], anIntArray2819[var3], anIntArray2819[var8], anIntArray2820[var6], anIntArray2820[var3], anIntArray2820[var8], anIntArray2821[var6], anIntArray2821[var3], anIntArray2821[var8], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(anIntArray2817[var4], anIntArray2817[var5], anIntArray2817[var7], anIntArray2816[var4], anIntArray2816[var5], anIntArray2816[var7], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1], anIntArray2819[var6], anIntArray2819[var3], anIntArray2819[var8], anIntArray2820[var6], anIntArray2820[var3], anIntArray2820[var8], anIntArray2821[var6], anIntArray2821[var3], anIntArray2821[var8], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(anIntArray2817[var4], anIntArray2817[var5], anIntArray2817[var7], anIntArray2816[var4], anIntArray2816[var5], anIntArray2816[var7], anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(anIntArray2817[var4], anIntArray2817[var5], anIntArray2817[var7], anIntArray2816[var4], anIntArray2816[var5], anIntArray2816[var7], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1]);
         }

      }
   }

   public SpotAnim method3393(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3373();
      int var15 = var2 - this.anInt2810;
      int var16 = var2 + this.anInt2810;
      int var13 = var4 - this.anInt2810;
      int var14 = var4 + this.anInt2810;
      if(var15 >= 0 && var16 + -1304027329 >> 7 < var1.length && var13 >= 0 && var14 + 128 >> 7 < var1[0].length) {
         var15 >>= 7;
         var16 = var16 + 127 >> 7;
         var13 >>= 7;
         var14 = var14 + -675440853 >> 7;
         if(var1[var15][var13] == var3 && var1[var16][var13] == var3 && var1[var15][var14] == var3 && var1[var16][var14] == var3) {
            return this;
         } else {
            SpotAnim var17;
            if(var5) {
               var17 = new SpotAnim();
               var17.anInt2785 = this.anInt2785;
               var17.anInt2831 = this.anInt2831;
               var17.anInt2801 = this.anInt2801;
               var17.anIntArray2786 = this.anIntArray2786;
               var17.anIntArray2788 = this.anIntArray2788;
               var17.anIntArray2790 = this.anIntArray2790;
               var17.anIntArray2791 = this.anIntArray2791;
               var17.anIntArray2792 = this.anIntArray2792;
               var17.anIntArray2793 = this.anIntArray2793;
               var17.anIntArray2794 = this.anIntArray2794;
               var17.anIntArray2795 = this.anIntArray2795;
               var17.aByteArray2815 = this.aByteArray2815;
               var17.aByteArray2797 = this.aByteArray2797;
               var17.aByteArray2798 = this.aByteArray2798;
               var17.aShortArray2781 = this.aShortArray2781;
               var17.aByte2811 = this.aByte2811;
               var17.anIntArray2802 = this.anIntArray2802;
               var17.anIntArray2803 = this.anIntArray2803;
               var17.anIntArray2838 = this.anIntArray2838;
               var17.anIntArrayArray2805 = this.anIntArrayArray2805;
               var17.anIntArrayArray2796 = this.anIntArrayArray2796;
               var17.aBool2809 = this.aBool2809;
               var17.anIntArray2807 = new int[var17.anInt2785];
            } else {
               var17 = this;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var19 = 0; var19 < var17.anInt2785; ++var19) {
                  var18 = this.anIntArray2786[var19] + var2;
                  var11 = this.anIntArray2788[var19] + var4;
                  var9 = var18 & -1318832369;
                  var12 = var11 & 127;
                  var7 = var18 >> 7;
                  var8 = var11 >> 7;
                  var10 = var1[var7][var8] * (1384648014 - var9) + var1[var7 + 1][var8] * var9 >> 7;
                  var20 = var1[var7][var8 + 1] * (143982516 - var9) + var1[var7 + 1][var8 + 1] * var9 >> 7;
                  var21 = var10 * (128 - var12) + var20 * var12 >> 7;
                  var17.anIntArray2807[var19] = this.anIntArray2807[var19] + var21 - var3;
               }
            } else {
               for(var19 = 0; var19 < var17.anInt2785; ++var19) {
                  var18 = (-this.anIntArray2807[var19] << 16) / (this.modelHeight * -400664892);
                  if(var18 < var6) {
                     var11 = this.anIntArray2786[var19] + var2;
                     var9 = this.anIntArray2788[var19] + var4;
                     var12 = var11 & -217264065;
                     var7 = var9 & 127;
                     var8 = var11 >> 7;
                     var10 = var9 >> 7;
                     var20 = var1[var8][var10] * (-1495262479 - var12) + var1[var8 + 1][var10] * var12 >> 7;
                     var21 = var1[var8][var10 + 1] * (1336562939 - var12) + var1[var8 + 1][var10 + 1] * var12 >> 7;
                     int var22 = var20 * (128 - var7) + var21 * var7 >> 7;
                     var17.anIntArray2807[var19] = this.anIntArray2807[var19] + (var22 - var3) * (var6 - var18) / var6;
                  }
               }
            }

            var17.anInt2789 = 0;
            return var17;
         }
      } else {
         return this;
      }
   }

   public SpotAnim method3394(boolean var1) {
      if(!var1 && aByteArray2782.length < this.anInt2831) {
         aByteArray2782 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2813, aByteArray2782);
   }

   public SpotAnim method3395(boolean var1) {
      if(!var1 && aByteArray2782.length < this.anInt2831) {
         aByteArray2782 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2813, aByteArray2782);
   }

   public SpotAnim method3396(boolean var1) {
      if(!var1 && aByteArray2782.length < this.anInt2831) {
         aByteArray2782 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2813, aByteArray2782);
   }

   public SpotAnim method3397(boolean var1) {
      if(!var1 && aByteArray2784.length < this.anInt2831) {
         aByteArray2784 = new byte[this.anInt2831 + -629170191];
      }

      return this.method3372(var1, aSpotAnim_2783, aByteArray2784);
   }

   void method2877(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 1) {
         this.method3373();
      }

      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.anInt2810 * var3 >> 16;
      int var13 = var11 + var12;
      if(var13 > 50 && var11 < 3500) {
         int var14 = var8 * var4 + var6 * var5 >> 16;
         int var15 = (var14 - this.anInt2810) * Texture.anInt2704;
         if(var15 / var13 < Texture.anInt2695) {
            int var16 = (var14 + this.anInt2810) * Texture.anInt2704;
            if(var16 / var13 > Texture.anInt2709) {
               int var17 = var7 * var3 - var10 * var2 >> 16;
               int var18 = this.anInt2810 * var2 >> 16;
               int var19 = (var17 + var18) * Texture.anInt2704;
               if(var19 / var13 > Texture.anInt2719) {
                  int var20 = var18 + (this.modelHeight * 1812947537 * var3 >> 16);
                  int var21 = (var17 - var20) * Texture.anInt2704;
                  if(var21 / var13 < Texture.anInt2701) {
                     int var22 = var12 + (this.modelHeight * 1812947537 * var2 >> 16);
                     boolean var23 = false;
                     boolean var24 = false;
                     if(var11 - var22 <= 50) {
                        var24 = true;
                     }

                     boolean var25 = var24 || this.anInt2801 > 0;
                     boolean var26 = false;
                     int var27;
                     int var28;
                     int var29;
                     if(var9 > 0 && aBool2836) {
                        var27 = var11 - var12;
                        if(var27 <= 50) {
                           var27 = 50;
                        }

                        if(var14 > 0) {
                           var15 /= var13;
                           var16 /= var27;
                        } else {
                           var16 /= var13;
                           var15 /= var27;
                        }

                        if(var17 > 0) {
                           var21 /= var13;
                           var19 /= var27;
                        } else {
                           var19 /= var13;
                           var21 /= var27;
                        }

                        var28 = anInt2837 - Texture.anInt2705;
                        var29 = anInt2843 - Texture.anInt2706;
                        if(var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
                           if(this.aBool2809) {
                              anIntArray2822[anInt2839++] = var9;
                           } else {
                              var26 = true;
                           }
                        }
                     }

                     var27 = Texture.anInt2705;
                     var28 = Texture.anInt2706;
                     var29 = 0;
                     int var30 = 0;
                     if(var1 != 0) {
                        var29 = anIntArray2841[var1];
                        var30 = anIntArray2842[var1];
                     }

                     for(int var31 = 0; var31 < this.anInt2785; ++var31) {
                        int var32 = this.anIntArray2786[var31];
                        int var33 = this.anIntArray2807[var31];
                        int var34 = this.anIntArray2788[var31];
                        int var35;
                        if(var1 != 0) {
                           var35 = var34 * var29 + var32 * var30 >> 16;
                           var34 = var34 * var30 - var32 * var29 >> 16;
                           var32 = var35;
                        }

                        var32 += var6;
                        var33 += var7;
                        var34 += var8;
                        var35 = var34 * var4 + var32 * var5 >> 16;
                        var34 = var34 * var5 - var32 * var4 >> 16;
                        var32 = var35;
                        var35 = var33 * var3 - var34 * var2 >> 16;
                        var34 = var33 * var2 + var34 * var3 >> 16;
                        anIntArray2818[var31] = var34 - var11;
                        if(var34 >= 50) {
                           anIntArray2816[var31] = var27 + var32 * Texture.anInt2704 / var34;
                           anIntArray2817[var31] = var28 + var35 * Texture.anInt2704 / var34;
                        } else {
                           anIntArray2816[var31] = -5000;
                           var23 = true;
                        }

                        if(var25) {
                           anIntArray2819[var31] = var32;
                           anIntArray2820[var31] = var35;
                           anIntArray2821[var31] = var34;
                        }
                     }

                     try {
                        this.method3434(var23, var26, var9);
                     } catch (Exception var36) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   public SpotAnim method3398(boolean var1) {
      if(!var1 && aByteArray2784.length < this.anInt2831) {
         aByteArray2784 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2783, aByteArray2784);
   }

   public final void method3399(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 2 && this.anInt2789 != 1) {
         this.method3374();
      }

      int var8 = Texture.anInt2705;
      int var9 = Texture.anInt2706;
      int var10 = anIntArray2841[var1];
      int var11 = anIntArray2842[var1];
      int var12 = anIntArray2841[var2];
      int var13 = anIntArray2842[var2];
      int var14 = anIntArray2841[var3];
      int var15 = anIntArray2842[var3];
      int var16 = anIntArray2841[var4];
      int var17 = anIntArray2842[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.anInt2785; ++var19) {
         int var20 = this.anIntArray2786[var19];
         int var21 = this.anIntArray2807[var19];
         int var22 = this.anIntArray2788[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         anIntArray2818[var19] = var22 - var18;
         anIntArray2816[var19] = var8 + var20 * Texture.anInt2704 / var22;
         anIntArray2817[var19] = var9 + var23 * Texture.anInt2704 / var22;
         if(this.anInt2801 > 0) {
            anIntArray2819[var19] = var20;
            anIntArray2820[var19] = var23;
            anIntArray2821[var19] = var22;
         }
      }

      try {
         this.method3434(false, false, 0);
      } catch (Exception var24) {
         ;
      }

   }

   SpotAnim method3400(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 100];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   SpotAnim method3401(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 624199831];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 710957916];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   public void method3402() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   SpotAnim method3403(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 100];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   public SpotAnim method3404(boolean var1) {
      if(!var1 && aByteArray2784.length < this.anInt2831) {
         aByteArray2784 = new byte[this.anInt2831 + 100];
      }

      return this.method3372(var1, aSpotAnim_2783, aByteArray2784);
   }

   public void method3405() {
      if(this.anInt2789 != 1) {
         this.anInt2789 = 1;
         this.modelHeight = 0;
         this.anInt2845 = 0;
         this.anInt2810 = 0;

         for(int var4 = 0; var4 < this.anInt2785; ++var4) {
            int var1 = this.anIntArray2786[var4];
            int var5 = this.anIntArray2807[var4];
            int var2 = this.anIntArray2788[var4];
            if(-var5 > this.modelHeight * 1812947537) {
               this.modelHeight = -var5 * -969595215;
            }

            if(var5 > this.anInt2845) {
               this.anInt2845 = var5;
            }

            int var3 = var1 * var1 + var2 * var2;
            if(var3 > this.anInt2810) {
               this.anInt2810 = var3;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.modelHeight * 1812947537 * this.modelHeight * 1812947537)) + 0.99D);
         this.anInt2827 = this.anInt2812 + (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.anInt2845 * this.anInt2845)) + 0.99D);
      }
   }

   public void method3406() {
      if(this.anInt2789 != 1) {
         this.anInt2789 = 1;
         this.modelHeight = 0;
         this.anInt2845 = 0;
         this.anInt2810 = 0;

         for(int var2 = 0; var2 < this.anInt2785; ++var2) {
            int var4 = this.anIntArray2786[var2];
            int var3 = this.anIntArray2807[var2];
            int var5 = this.anIntArray2788[var2];
            if(-var3 > this.modelHeight * -1920236826) {
               this.modelHeight = -var3 * -420022389;
            }

            if(var3 > this.anInt2845) {
               this.anInt2845 = var3;
            }

            int var1 = var4 * var4 + var5 * var5;
            if(var1 > this.anInt2810) {
               this.anInt2810 = var1;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.modelHeight * -339084744 * this.modelHeight * 1812947537)) + 0.99D);
         this.anInt2827 = this.anInt2812 + (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.anInt2845 * this.anInt2845)) + 0.99D);
      }
   }

   public void method3407() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   void method3408() {
      if(this.anInt2789 != 2) {
         this.anInt2789 = 2;
         this.anInt2810 = 0;

         for(int var1 = 0; var1 < this.anInt2785; ++var1) {
            int var5 = this.anIntArray2786[var1];
            int var3 = this.anIntArray2807[var1];
            int var2 = this.anIntArray2788[var1];
            int var4 = var5 * var5 + var2 * var2 + var3 * var3;
            if(var4 > this.anInt2810) {
               this.anInt2810 = var4;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = this.anInt2810;
         this.anInt2827 = this.anInt2810 + this.anInt2810;
      }
   }

   public int method3409() {
      this.method3373();
      return this.anInt2810;
   }

   public int method3410() {
      this.method3373();
      return this.anInt2810;
   }

   public void method3411(Class116_Sub23_Sub17 var1, int var2) {
      if(this.anIntArrayArray2805 != null) {
         if(var2 != -1) {
            Class28 var4 = var1.aClass28Array2471[var2];
            Class116_Sub5 var6 = var4.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;

            for(int var3 = 0; var3 < var4.anInt395; ++var3) {
               int var5 = var4.anIntArray396[var3];
               this.method3378(var6.anIntArray1723[var5], var6.anIntArrayArray1726[var5], var4.anIntArray391[var3], var4.anIntArray398[var3], var4.anIntArray399[var3]);
            }

            this.anInt2789 = 0;
         }
      }
   }

   public void method3412(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] += var1;
         this.anIntArray2807[var4] += var2;
         this.anIntArray2788[var4] += var3;
      }

      this.anInt2789 = 0;
   }

   public void method3413(Class116_Sub23_Sub17 var1, int var2, Class116_Sub23_Sub17 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            Class28 var10 = var1.aClass28Array2471[var2];
            Class28 var7 = var3.aClass28Array2471[var4];
            Class116_Sub5 var12 = var10.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            byte var6 = 0;
            int var13 = var6 + 1;
            int var11 = var5[var6];

            int var8;
            int var9;
            for(var8 = 0; var8 < var10.anInt395; ++var8) {
               for(var9 = var10.anIntArray396[var8]; var9 > var11; var11 = var5[var13++]) {
                  ;
               }

               if(var9 != var11 || var12.anIntArray1723[var9] == 0) {
                  this.method3378(var12.anIntArray1723[var9], var12.anIntArrayArray1726[var9], var10.anIntArray391[var8], var10.anIntArray398[var8], var10.anIntArray399[var8]);
               }
            }

            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            var6 = 0;
            var13 = var6 + 1;
            var11 = var5[var6];

            for(var8 = 0; var8 < var7.anInt395; ++var8) {
               for(var9 = var7.anIntArray396[var8]; var9 > var11; var11 = var5[var13++]) {
                  ;
               }

               if(var9 == var11 || var12.anIntArray1723[var9] == 0) {
                  this.method3378(var12.anIntArray1723[var9], var12.anIntArrayArray1726[var9], var7.anIntArray391[var8], var7.anIntArray398[var8], var7.anIntArray399[var8]);
               }
            }

            this.anInt2789 = 0;
         } else {
            this.method3376(var1, var2);
         }
      }
   }

   public void method3414() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   public void method3415() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   SpotAnim method3416(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 100];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   public void method3417() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   public void method3418() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   SpotAnim method3419(boolean var1, SpotAnim var2, byte[] var3) {
      var2.anInt2785 = this.anInt2785;
      var2.anInt2831 = this.anInt2831;
      var2.anInt2801 = this.anInt2801;
      if(var2.anIntArray2786 == null || var2.anIntArray2786.length < this.anInt2785) {
         var2.anIntArray2786 = new int[this.anInt2785 + 100];
         var2.anIntArray2807 = new int[this.anInt2785 + 100];
         var2.anIntArray2788 = new int[this.anInt2785 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.anInt2785; ++var4) {
         var2.anIntArray2786[var4] = this.anIntArray2786[var4];
         var2.anIntArray2807[var4] = this.anIntArray2807[var4];
         var2.anIntArray2788[var4] = this.anIntArray2788[var4];
      }

      if(var1) {
         var2.aByteArray2797 = this.aByteArray2797;
      } else {
         var2.aByteArray2797 = var3;
         if(this.aByteArray2797 == null) {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.anInt2831; ++var4) {
               var2.aByteArray2797[var4] = this.aByteArray2797[var4];
            }
         }
      }

      var2.anIntArray2790 = this.anIntArray2790;
      var2.anIntArray2791 = this.anIntArray2791;
      var2.anIntArray2792 = this.anIntArray2792;
      var2.anIntArray2793 = this.anIntArray2793;
      var2.anIntArray2794 = this.anIntArray2794;
      var2.anIntArray2795 = this.anIntArray2795;
      var2.aByteArray2815 = this.aByteArray2815;
      var2.aByteArray2798 = this.aByteArray2798;
      var2.aShortArray2781 = this.aShortArray2781;
      var2.aByte2811 = this.aByte2811;
      var2.anIntArray2802 = this.anIntArray2802;
      var2.anIntArray2803 = this.anIntArray2803;
      var2.anIntArray2838 = this.anIntArray2838;
      var2.anIntArrayArray2805 = this.anIntArrayArray2805;
      var2.anIntArrayArray2796 = this.anIntArrayArray2796;
      var2.aBool2809 = this.aBool2809;
      var2.anInt2789 = 0;
      return var2;
   }

   public void method3420() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   final void method3421(int var1) {
      if(aBoolArray2834[var1]) {
         this.method3388(var1);
      } else {
         int var5 = this.anIntArray2790[var1];
         int var4 = this.anIntArray2791[var1];
         int var6 = this.anIntArray2792[var1];
         Texture.aBool2700 = aBoolArray2814[var1];
         if(this.aByteArray2797 == null) {
            Texture.anInt2699 = 0;
         } else {
            Texture.anInt2699 = this.aByteArray2797[var1] & -121168666;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            int var3;
            int var7;
            int var8;
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               int var2 = this.aByteArray2798[var1] & 255;
               var7 = this.anIntArray2802[var2];
               var8 = this.anIntArray2803[var2];
               var3 = this.anIntArray2838[var2];
            } else {
               var7 = var5;
               var8 = var4;
               var3 = var6;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(anIntArray2817[var5], anIntArray2817[var4], anIntArray2817[var6], anIntArray2816[var5], anIntArray2816[var4], anIntArray2816[var6], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var8], anIntArray2819[var3], anIntArray2820[var7], anIntArray2820[var8], anIntArray2820[var3], anIntArray2821[var7], anIntArray2821[var8], anIntArray2821[var3], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(anIntArray2817[var5], anIntArray2817[var4], anIntArray2817[var6], anIntArray2816[var5], anIntArray2816[var4], anIntArray2816[var6], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1], anIntArray2819[var7], anIntArray2819[var8], anIntArray2819[var3], anIntArray2820[var7], anIntArray2820[var8], anIntArray2820[var3], anIntArray2821[var7], anIntArray2821[var8], anIntArray2821[var3], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(anIntArray2817[var5], anIntArray2817[var4], anIntArray2817[var6], anIntArray2816[var5], anIntArray2816[var4], anIntArray2816[var6], anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(anIntArray2817[var5], anIntArray2817[var4], anIntArray2817[var6], anIntArray2816[var5], anIntArray2816[var4], anIntArray2816[var6], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1]);
         }

      }
   }

   SpotAnim() {}

   public final void method3422(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 2 && this.anInt2789 != 1) {
         this.method3374();
      }

      int var9 = Texture.anInt2705;
      int var10 = Texture.anInt2706;
      int var11 = anIntArray2841[var1];
      int var12 = anIntArray2842[var1];
      int var13 = anIntArray2841[var2];
      int var14 = anIntArray2842[var2];
      int var15 = anIntArray2841[var3];
      int var16 = anIntArray2842[var3];
      int var17 = anIntArray2841[var4];
      int var18 = anIntArray2842[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.anInt2785; ++var20) {
         int var21 = this.anIntArray2786[var20];
         int var22 = this.anIntArray2807[var20];
         int var23 = this.anIntArray2788[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         anIntArray2818[var20] = var23 - var19;
         anIntArray2816[var20] = var9 + var21 * Texture.anInt2704 / var8;
         anIntArray2817[var20] = var10 + var24 * Texture.anInt2704 / var8;
         if(this.anInt2801 > 0) {
            anIntArray2819[var20] = var21;
            anIntArray2820[var20] = var24;
            anIntArray2821[var20] = var23;
         }
      }

      try {
         this.method3434(false, false, 0);
      } catch (Exception var25) {
         ;
      }

   }

   public void method3423() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   public void method3424() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   public void method3425(int var1) {
      int var2 = anIntArray2841[var1];
      int var5 = anIntArray2842[var1];

      for(int var3 = 0; var3 < this.anInt2785; ++var3) {
         int var4 = this.anIntArray2807[var3] * var5 - this.anIntArray2788[var3] * var2 >> 16;
         this.anIntArray2788[var3] = this.anIntArray2807[var3] * var2 + this.anIntArray2788[var3] * var5 >> 16;
         this.anIntArray2807[var3] = var4;
      }

      this.anInt2789 = 0;
   }

   public void method3426() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   public void method3427(Class116_Sub23_Sub17 var1, int var2, Class116_Sub23_Sub17 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            Class28 var8 = var1.aClass28Array2471[var2];
            Class28 var12 = var3.aClass28Array2471[var4];
            Class116_Sub5 var6 = var8.aClass116_Sub5_394;
            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            byte var10 = 0;
            int var13 = var10 + 1;
            int var9 = var5[var10];

            int var7;
            int var11;
            for(var11 = 0; var11 < var8.anInt395; ++var11) {
               for(var7 = var8.anIntArray396[var11]; var7 > var9; var9 = var5[var13++]) {
                  ;
               }

               if(var7 != var9 || var6.anIntArray1723[var7] == 0) {
                  this.method3378(var6.anIntArray1723[var7], var6.anIntArrayArray1726[var7], var8.anIntArray391[var11], var8.anIntArray398[var11], var8.anIntArray399[var11]);
               }
            }

            anInt2824 = 0;
            anInt2808 = 0;
            anInt2835 = 0;
            var10 = 0;
            var13 = var10 + 1;
            var9 = var5[var10];

            for(var11 = 0; var11 < var12.anInt395; ++var11) {
               for(var7 = var12.anIntArray396[var11]; var7 > var9; var9 = var5[var13++]) {
                  ;
               }

               if(var7 == var9 || var6.anIntArray1723[var7] == 0) {
                  this.method3378(var6.anIntArray1723[var7], var6.anIntArrayArray1726[var7], var12.anIntArray391[var11], var12.anIntArray398[var11], var12.anIntArray399[var11]);
               }
            }

            this.anInt2789 = 0;
         } else {
            this.method3376(var1, var2);
         }
      }
   }

   public void method3428() {
      if(this.anInt2789 != 1) {
         this.anInt2789 = 1;
         this.modelHeight = 0;
         this.anInt2845 = 0;
         this.anInt2810 = 0;

         for(int var5 = 0; var5 < this.anInt2785; ++var5) {
            int var2 = this.anIntArray2786[var5];
            int var1 = this.anIntArray2807[var5];
            int var3 = this.anIntArray2788[var5];
            if(-var1 > this.modelHeight * 1812947537) {
               this.modelHeight = -var1 * -969595215;
            }

            if(var1 > this.anInt2845) {
               this.anInt2845 = var1;
            }

            int var4 = var2 * var2 + var3 * var3;
            if(var4 > this.anInt2810) {
               this.anInt2810 = var4;
            }
         }

         this.anInt2810 = (int)(Math.sqrt((double)this.anInt2810) + 0.99D);
         this.anInt2812 = (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.modelHeight * 1812947537 * this.modelHeight * 1812947537)) + 0.99D);
         this.anInt2827 = this.anInt2812 + (int)(Math.sqrt((double)(this.anInt2810 * this.anInt2810 + this.anInt2845 * this.anInt2845)) + 0.99D);
      }
   }

   public void method3429(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] += var1;
         this.anIntArray2807[var4] += var2;
         this.anIntArray2788[var4] += var3;
      }

      this.anInt2789 = 0;
   }

   public void method3430(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] = this.anIntArray2786[var4] * var1 / 128;
         this.anIntArray2807[var4] = this.anIntArray2807[var4] * var2 / 128;
         this.anIntArray2788[var4] = this.anIntArray2788[var4] * var3 / 128;
      }

      this.anInt2789 = 0;
   }

   public void method3431(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] = this.anIntArray2786[var4] * var1 / 128;
         this.anIntArray2807[var4] = this.anIntArray2807[var4] * var2 / 1096789911;
         this.anIntArray2788[var4] = this.anIntArray2788[var4] * var3 / 128;
      }

      this.anInt2789 = 0;
   }

   final void method3432(boolean var1, boolean var2, int var3) {
      if(this.anInt2827 < 1600) {
         int var4;
         for(var4 = 0; var4 < this.anInt2827; ++var4) {
            anIntArray2823[var4] = 0;
         }

         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var17;
         int var18;
         for(var4 = 0; var4 < this.anInt2831; ++var4) {
            if(this.anIntArray2795[var4] != -2) {
               var8 = this.anIntArray2790[var4];
               var9 = this.anIntArray2791[var4];
               var10 = this.anIntArray2792[var4];
               var11 = anIntArray2816[var8];
               var12 = anIntArray2816[var9];
               var7 = anIntArray2816[var10];
               int var13;
               if(var1 && (var11 == -1891255217 || var12 == 827604824 || var7 == -5000)) {
                  var13 = anIntArray2819[var8];
                  var18 = anIntArray2819[var9];
                  var17 = anIntArray2819[var10];
                  int var14 = anIntArray2820[var8];
                  var6 = anIntArray2820[var9];
                  int var5 = anIntArray2820[var10];
                  int var15 = anIntArray2821[var8];
                  int var16 = anIntArray2821[var9];
                  int var19 = anIntArray2821[var10];
                  var13 -= var18;
                  var17 -= var18;
                  var14 -= var6;
                  var5 -= var6;
                  var15 -= var16;
                  var19 -= var16;
                  int var20 = var14 * var19 - var15 * var5;
                  int var23 = var15 * var17 - var13 * var19;
                  int var21 = var13 * var5 - var14 * var17;
                  if(var18 * var20 + var6 * var23 + var16 * var21 > 0) {
                     aBoolArray2834[var4] = true;
                     int var22 = (anIntArray2818[var8] + anIntArray2818[var9] + anIntArray2818[var10]) / 3 + this.anInt2812;
                     anIntArrayArray2799[var22][anIntArray2823[var22]++] = var4;
                  }
               } else {
                  if(var2 && this.method3386(anInt2837, anInt2843, anIntArray2817[var8], anIntArray2817[var9], anIntArray2817[var10], var11, var12, var7)) {
                     anIntArray2822[anInt2839++] = var3;
                     var2 = false;
                  }

                  if((var11 - var12) * (anIntArray2817[var10] - anIntArray2817[var9]) - (anIntArray2817[var8] - anIntArray2817[var9]) * (var7 - var12) > 0) {
                     aBoolArray2834[var4] = false;
                     if(var11 >= 0 && var12 >= 0 && var7 >= 0 && var11 <= Texture.anInt2712 && var12 <= Texture.anInt2712 && var7 <= Texture.anInt2712) {
                        aBoolArray2814[var4] = false;
                     } else {
                        aBoolArray2814[var4] = true;
                     }

                     var13 = (anIntArray2818[var8] + anIntArray2818[var9] + anIntArray2818[var10]) / 3 + this.anInt2812;
                     anIntArrayArray2799[var13][anIntArray2823[var13]++] = var4;
                  }
               }
            }
         }

         int[] var25;
         if(this.aByteArray2815 == null) {
            for(var4 = this.anInt2827 - 1; var4 >= 0; --var4) {
               var8 = anIntArray2823[var4];
               if(var8 > 0) {
                  var25 = anIntArrayArray2799[var4];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method3390(var25[var10]);
                  }
               }
            }

         } else {
            for(var4 = 0; var4 < 12; ++var4) {
               anIntArray2825[var4] = 0;
               anIntArray2787[var4] = 0;
            }

            for(var4 = this.anInt2827 - 1; var4 >= 0; --var4) {
               var8 = anIntArray2823[var4];
               if(var8 > 0) {
                  var25 = anIntArrayArray2799[var4];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var25[var10];
                     byte var26 = this.aByteArray2815[var11];
                     var7 = anIntArray2825[var26]++;
                     anIntArrayArray2833[var26][var7] = var11;
                     if(var26 < 10) {
                        anIntArray2787[var26] += var4;
                     } else if(var26 == 10) {
                        anIntArray2800[var7] = var4;
                     } else {
                        anIntArray2828[var7] = var4;
                     }
                  }
               }
            }

            var4 = 0;
            if(anIntArray2825[1] > 0 || anIntArray2825[2] > 0) {
               var4 = (anIntArray2787[1] + anIntArray2787[2]) / (anIntArray2825[1] + anIntArray2825[2]);
            }

            var8 = 0;
            if(anIntArray2825[3] > 0 || anIntArray2825[4] > 0) {
               var8 = (anIntArray2787[3] + anIntArray2787[4]) / (anIntArray2825[3] + anIntArray2825[4]);
            }

            var9 = 0;
            if(anIntArray2825[6] > 0 || anIntArray2825[8] > 0) {
               var9 = (anIntArray2787[6] + anIntArray2787[8]) / (anIntArray2825[6] + anIntArray2825[8]);
            }

            var11 = 0;
            var12 = anIntArray2825[10];
            int[] var24 = anIntArrayArray2833[10];
            int[] var27 = anIntArray2800;
            if(var11 == var12) {
               var11 = 0;
               var12 = anIntArray2825[11];
               var24 = anIntArrayArray2833[11];
               var27 = anIntArray2828;
            }

            if(var11 < var12) {
               var10 = var27[var11];
            } else {
               var10 = 1845010953;
            }

            for(var18 = 0; var18 < 10; ++var18) {
               while(var18 == 0 && var10 > var4) {
                  this.method3390(var24[var11++]);
                  if(var11 == var12 && var24 != anIntArrayArray2833[11]) {
                     var11 = 0;
                     var12 = anIntArray2825[11];
                     var24 = anIntArrayArray2833[11];
                     var27 = anIntArray2828;
                  }

                  if(var11 < var12) {
                     var10 = var27[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var18 == 3 && var10 > var8) {
                  this.method3390(var24[var11++]);
                  if(var11 == var12 && var24 != anIntArrayArray2833[11]) {
                     var11 = 0;
                     var12 = anIntArray2825[11];
                     var24 = anIntArrayArray2833[11];
                     var27 = anIntArray2828;
                  }

                  if(var11 < var12) {
                     var10 = var27[var11];
                  } else {
                     var10 = 1602110509;
                  }
               }

               while(var18 == 5 && var10 > var9) {
                  this.method3390(var24[var11++]);
                  if(var11 == var12 && var24 != anIntArrayArray2833[11]) {
                     var11 = 0;
                     var12 = anIntArray2825[11];
                     var24 = anIntArrayArray2833[11];
                     var27 = anIntArray2828;
                  }

                  if(var11 < var12) {
                     var10 = var27[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var17 = anIntArray2825[var18];
               int[] var28 = anIntArrayArray2833[var18];

               for(var6 = 0; var6 < var17; ++var6) {
                  this.method3390(var28[var6]);
               }
            }

            while(var10 != -1000) {
               this.method3390(var24[var11++]);
               if(var11 == var12 && var24 != anIntArrayArray2833[11]) {
                  var11 = 0;
                  var24 = anIntArrayArray2833[11];
                  var12 = anIntArray2825[11];
                  var27 = anIntArray2828;
               }

               if(var11 < var12) {
                  var10 = var27[var11];
               } else {
                  var10 = -875762865;
               }
            }

         }
      }
   }

   public final void method3433(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      anIntArray2823[0] = -1;
      if(this.anInt2789 != 2 && this.anInt2789 != 1) {
         this.method3374();
      }

      int var8 = Texture.anInt2705;
      int var9 = Texture.anInt2706;
      int var10 = anIntArray2841[var1];
      int var11 = anIntArray2842[var1];
      int var12 = anIntArray2841[var2];
      int var13 = anIntArray2842[var2];
      int var14 = anIntArray2841[var3];
      int var15 = anIntArray2842[var3];
      int var16 = anIntArray2841[var4];
      int var17 = anIntArray2842[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.anInt2785; ++var19) {
         int var20 = this.anIntArray2786[var19];
         int var21 = this.anIntArray2807[var19];
         int var22 = this.anIntArray2788[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         anIntArray2818[var19] = var22 - var18;
         anIntArray2816[var19] = var8 + var20 * Texture.anInt2704 / var22;
         anIntArray2817[var19] = var9 + var23 * Texture.anInt2704 / var22;
         if(this.anInt2801 > 0) {
            anIntArray2819[var19] = var20;
            anIntArray2820[var19] = var23;
            anIntArray2821[var19] = var22;
         }
      }

      try {
         this.method3434(false, false, 0);
      } catch (Exception var24) {
         ;
      }

   }

   final void method3434(boolean var1, boolean var2, int var3) {
      if(this.anInt2827 < 1600) {
         int var9;
         for(var9 = 0; var9 < this.anInt2827; ++var9) {
            anIntArray2823[var9] = 0;
         }

         int var5;
         int var6;
         int var7;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         for(var9 = 0; var9 < this.anInt2831; ++var9) {
            if(this.anIntArray2795[var9] != -2) {
               var7 = this.anIntArray2790[var9];
               var11 = this.anIntArray2791[var9];
               var6 = this.anIntArray2792[var9];
               var5 = anIntArray2816[var7];
               var10 = anIntArray2816[var11];
               var12 = anIntArray2816[var6];
               int var4;
               if(var1 && (var5 == -5000 || var10 == -5000 || var12 == -5000)) {
                  var4 = anIntArray2819[var7];
                  var13 = anIntArray2819[var11];
                  var14 = anIntArray2819[var6];
                  int var8 = anIntArray2820[var7];
                  var15 = anIntArray2820[var11];
                  int var16 = anIntArray2820[var6];
                  int var17 = anIntArray2821[var7];
                  int var19 = anIntArray2821[var11];
                  int var18 = anIntArray2821[var6];
                  var4 -= var13;
                  var14 -= var13;
                  var8 -= var15;
                  var16 -= var15;
                  var17 -= var19;
                  var18 -= var19;
                  int var21 = var8 * var18 - var17 * var16;
                  int var22 = var17 * var14 - var4 * var18;
                  int var23 = var4 * var16 - var8 * var14;
                  if(var13 * var21 + var15 * var22 + var19 * var23 > 0) {
                     aBoolArray2834[var9] = true;
                     int var20 = (anIntArray2818[var7] + anIntArray2818[var11] + anIntArray2818[var6]) / 3 + this.anInt2812;
                     anIntArrayArray2799[var20][anIntArray2823[var20]++] = var9;
                  }
               } else {
                  if(var2 && this.method3386(anInt2837, anInt2843, anIntArray2817[var7], anIntArray2817[var11], anIntArray2817[var6], var5, var10, var12)) {
                     anIntArray2822[anInt2839++] = var3;
                     var2 = false;
                  }

                  if((var5 - var10) * (anIntArray2817[var6] - anIntArray2817[var11]) - (anIntArray2817[var7] - anIntArray2817[var11]) * (var12 - var10) > 0) {
                     aBoolArray2834[var9] = false;
                     if(var5 >= 0 && var10 >= 0 && var12 >= 0 && var5 <= Texture.anInt2712 && var10 <= Texture.anInt2712 && var12 <= Texture.anInt2712) {
                        aBoolArray2814[var9] = false;
                     } else {
                        aBoolArray2814[var9] = true;
                     }

                     var4 = (anIntArray2818[var7] + anIntArray2818[var11] + anIntArray2818[var6]) / 3 + this.anInt2812;
                     anIntArrayArray2799[var4][anIntArray2823[var4]++] = var9;
                  }
               }
            }
         }

         int[] var27;
         if(this.aByteArray2815 == null) {
            for(var9 = this.anInt2827 - 1; var9 >= 0; --var9) {
               var7 = anIntArray2823[var9];
               if(var7 > 0) {
                  var27 = anIntArrayArray2799[var9];

                  for(var6 = 0; var6 < var7; ++var6) {
                     this.method3390(var27[var6]);
                  }
               }
            }

         } else {
            for(var9 = 0; var9 < 12; ++var9) {
               anIntArray2825[var9] = 0;
               anIntArray2787[var9] = 0;
            }

            for(var9 = this.anInt2827 - 1; var9 >= 0; --var9) {
               var7 = anIntArray2823[var9];
               if(var7 > 0) {
                  var27 = anIntArrayArray2799[var9];

                  for(var6 = 0; var6 < var7; ++var6) {
                     var5 = var27[var6];
                     byte var26 = this.aByteArray2815[var5];
                     var12 = anIntArray2825[var26]++;
                     anIntArrayArray2833[var26][var12] = var5;
                     if(var26 < 10) {
                        anIntArray2787[var26] += var9;
                     } else if(var26 == 10) {
                        anIntArray2800[var12] = var9;
                     } else {
                        anIntArray2828[var12] = var9;
                     }
                  }
               }
            }

            var9 = 0;
            if(anIntArray2825[1] > 0 || anIntArray2825[2] > 0) {
               var9 = (anIntArray2787[1] + anIntArray2787[2]) / (anIntArray2825[1] + anIntArray2825[2]);
            }

            var7 = 0;
            if(anIntArray2825[3] > 0 || anIntArray2825[4] > 0) {
               var7 = (anIntArray2787[3] + anIntArray2787[4]) / (anIntArray2825[3] + anIntArray2825[4]);
            }

            var11 = 0;
            if(anIntArray2825[6] > 0 || anIntArray2825[8] > 0) {
               var11 = (anIntArray2787[6] + anIntArray2787[8]) / (anIntArray2825[6] + anIntArray2825[8]);
            }

            var5 = 0;
            var10 = anIntArray2825[10];
            int[] var28 = anIntArrayArray2833[10];
            int[] var24 = anIntArray2800;
            if(var5 == var10) {
               var5 = 0;
               var10 = anIntArray2825[11];
               var28 = anIntArrayArray2833[11];
               var24 = anIntArray2828;
            }

            if(var5 < var10) {
               var6 = var24[var5];
            } else {
               var6 = -1000;
            }

            for(var13 = 0; var13 < 10; ++var13) {
               while(var13 == 0 && var6 > var9) {
                  this.method3390(var28[var5++]);
                  if(var5 == var10 && var28 != anIntArrayArray2833[11]) {
                     var5 = 0;
                     var10 = anIntArray2825[11];
                     var28 = anIntArrayArray2833[11];
                     var24 = anIntArray2828;
                  }

                  if(var5 < var10) {
                     var6 = var24[var5];
                  } else {
                     var6 = -1000;
                  }
               }

               while(var13 == 3 && var6 > var7) {
                  this.method3390(var28[var5++]);
                  if(var5 == var10 && var28 != anIntArrayArray2833[11]) {
                     var5 = 0;
                     var10 = anIntArray2825[11];
                     var28 = anIntArrayArray2833[11];
                     var24 = anIntArray2828;
                  }

                  if(var5 < var10) {
                     var6 = var24[var5];
                  } else {
                     var6 = -1000;
                  }
               }

               while(var13 == 5 && var6 > var11) {
                  this.method3390(var28[var5++]);
                  if(var5 == var10 && var28 != anIntArrayArray2833[11]) {
                     var5 = 0;
                     var10 = anIntArray2825[11];
                     var28 = anIntArrayArray2833[11];
                     var24 = anIntArray2828;
                  }

                  if(var5 < var10) {
                     var6 = var24[var5];
                  } else {
                     var6 = -1000;
                  }
               }

               var14 = anIntArray2825[var13];
               int[] var25 = anIntArrayArray2833[var13];

               for(var15 = 0; var15 < var14; ++var15) {
                  this.method3390(var25[var15]);
               }
            }

            while(var6 != -1000) {
               this.method3390(var28[var5++]);
               if(var5 == var10 && var28 != anIntArrayArray2833[11]) {
                  var5 = 0;
                  var28 = anIntArrayArray2833[11];
                  var10 = anIntArray2825[11];
                  var24 = anIntArray2828;
               }

               if(var5 < var10) {
                  var6 = var24[var5];
               } else {
                  var6 = -1000;
               }
            }

         }
      }
   }

   final void method3435(int var1) {
      int var2 = Texture.anInt2705;
      int var20 = Texture.anInt2706;
      int var4 = 0;
      int var5 = this.anIntArray2790[var1];
      int var6 = this.anIntArray2791[var1];
      int var8 = this.anIntArray2792[var1];
      int var3 = anIntArray2821[var5];
      int var9 = anIntArray2821[var6];
      int var10 = anIntArray2821[var8];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 255;
      }

      int var7;
      int var11;
      int var12;
      int var15;
      if(var3 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var5];
         anIntArray2806[var4] = anIntArray2817[var5];
         anIntArray2832[var4++] = this.anIntArray2793[var1];
      } else {
         var11 = anIntArray2819[var5];
         var7 = anIntArray2820[var5];
         var15 = this.anIntArray2793[var1];
         if(var10 >= 50) {
            var12 = (50 - var3) * anIntArray2844[var10 - var3];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var8] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var8] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2795[var1] - var15) * var12 >> 16);
         }

         if(var9 >= 50) {
            var12 = (50 - var3) * anIntArray2844[var9 - var3];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var6] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var6] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2794[var1] - var15) * var12 >> 16);
         }
      }

      if(var9 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var6];
         anIntArray2806[var4] = anIntArray2817[var6];
         anIntArray2832[var4++] = this.anIntArray2794[var1];
      } else {
         var11 = anIntArray2819[var6];
         var7 = anIntArray2820[var6];
         var15 = this.anIntArray2794[var1];
         if(var3 >= 50) {
            var12 = (50 - var9) * anIntArray2844[var3 - var9];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var5] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var5] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2793[var1] - var15) * var12 >> 16);
         }

         if(var10 >= 50) {
            var12 = (50 - var9) * anIntArray2844[var10 - var9];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var8] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var8] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2795[var1] - var15) * var12 >> 16);
         }
      }

      if(var10 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var8];
         anIntArray2806[var4] = anIntArray2817[var8];
         anIntArray2832[var4++] = this.anIntArray2795[var1];
      } else {
         var11 = anIntArray2819[var8];
         var7 = anIntArray2820[var8];
         var15 = this.anIntArray2795[var1];
         if(var9 >= 50) {
            var12 = (50 - var10) * anIntArray2844[var9 - var10];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var6] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var6] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2794[var1] - var15) * var12 >> 16);
         }

         if(var3 >= 50) {
            var12 = (50 - var10) * anIntArray2844[var3 - var10];
            anIntArray2830[var4] = var2 + (var11 + ((anIntArray2819[var5] - var11) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var20 + (var7 + ((anIntArray2820[var5] - var7) * var12 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var15 + ((this.anIntArray2793[var1] - var15) * var12 >> 16);
         }
      }

      var11 = anIntArray2830[0];
      var7 = anIntArray2830[1];
      var15 = anIntArray2830[2];
      var12 = anIntArray2806[0];
      int var13 = anIntArray2806[1];
      int var14 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var16;
      int var17;
      int var18;
      int var19;
      if(var4 == 3) {
         if(var11 < 0 || var7 < 0 || var15 < 0 || var11 > Texture.anInt2712 || var7 > Texture.anInt2712 || var15 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var19 = this.aByteArray2798[var1] & 255;
               var16 = this.anIntArray2802[var19];
               var17 = this.anIntArray2803[var19];
               var18 = this.anIntArray2838[var19];
            } else {
               var16 = var5;
               var17 = var6;
               var18 = var8;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var12, var13, var14, var11, var7, var15, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var12, var13, var14, var11, var7, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var12, var13, var14, var11, var7, var15, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var12, var13, var14, var11, var7, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var7 < 0 || var15 < 0 || var11 > Texture.anInt2712 || var7 > Texture.anInt2712 || var15 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var19 = this.aByteArray2798[var1] & 255;
               var16 = this.anIntArray2802[var19];
               var17 = this.anIntArray2803[var19];
               var18 = this.anIntArray2838[var19];
            } else {
               var16 = var5;
               var17 = var6;
               var18 = var8;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var12, var13, var14, var11, var7, var15, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], var21);
               Texture.method3194(var12, var14, anIntArray2806[3], var11, var15, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], var21);
            } else {
               Texture.method3194(var12, var13, var14, var11, var7, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], var21);
               Texture.method3194(var12, var14, anIntArray2806[3], var11, var15, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var18], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var18], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var18], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var16 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var12, var13, var14, var11, var7, var15, var16);
            Texture.method3200(var12, var14, anIntArray2806[3], var11, var15, anIntArray2830[3], var16);
         } else {
            Texture.method3215(var12, var13, var14, var11, var7, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var12, var14, anIntArray2806[3], var11, var15, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   final void method3436(int var1) {
      if(aBoolArray2834[var1]) {
         this.method3388(var1);
      } else {
         int var6 = this.anIntArray2790[var1];
         int var3 = this.anIntArray2791[var1];
         int var4 = this.anIntArray2792[var1];
         Texture.aBool2700 = aBoolArray2814[var1];
         if(this.aByteArray2797 == null) {
            Texture.anInt2699 = 0;
         } else {
            Texture.anInt2699 = this.aByteArray2797[var1] & -746219882;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            int var5;
            int var7;
            int var8;
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               int var2 = this.aByteArray2798[var1] & 503945007;
               var7 = this.anIntArray2802[var2];
               var5 = this.anIntArray2803[var2];
               var8 = this.anIntArray2838[var2];
            } else {
               var7 = var6;
               var5 = var3;
               var8 = var4;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(anIntArray2817[var6], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var6], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var5], anIntArray2819[var8], anIntArray2820[var7], anIntArray2820[var5], anIntArray2820[var8], anIntArray2821[var7], anIntArray2821[var5], anIntArray2821[var8], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(anIntArray2817[var6], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var6], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1], anIntArray2819[var7], anIntArray2819[var5], anIntArray2819[var8], anIntArray2820[var7], anIntArray2820[var5], anIntArray2820[var8], anIntArray2821[var7], anIntArray2821[var5], anIntArray2821[var8], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(anIntArray2817[var6], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var6], anIntArray2816[var3], anIntArray2816[var4], anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(anIntArray2817[var6], anIntArray2817[var3], anIntArray2817[var4], anIntArray2816[var6], anIntArray2816[var3], anIntArray2816[var4], this.anIntArray2793[var1], this.anIntArray2794[var1], this.anIntArray2795[var1]);
         }

      }
   }

   public void method3437() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   public void method3438() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         this.anIntArray2786[var1] = -this.anIntArray2786[var1];
         this.anIntArray2788[var1] = -this.anIntArray2788[var1];
      }

      this.anInt2789 = 0;
   }

   final boolean method3439(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   final void method3440(int var1) {
      int var2 = Texture.anInt2705;
      int var17 = Texture.anInt2706;
      int var4 = 0;
      int var5 = this.anIntArray2790[var1];
      int var6 = this.anIntArray2791[var1];
      int var11 = this.anIntArray2792[var1];
      int var8 = anIntArray2821[var5];
      int var9 = anIntArray2821[var6];
      int var12 = anIntArray2821[var11];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 255;
      }

      int var3;
      int var10;
      int var13;
      int var14;
      if(var8 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var5];
         anIntArray2806[var4] = anIntArray2817[var5];
         anIntArray2832[var4++] = this.anIntArray2793[var1];
      } else {
         var3 = anIntArray2819[var5];
         var13 = anIntArray2820[var5];
         var10 = this.anIntArray2793[var1];
         if(var12 >= 50) {
            var14 = (50 - var8) * anIntArray2844[var12 - var8];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var11] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var11] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2795[var1] - var10) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = (50 - var8) * anIntArray2844[var9 - var8];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var6] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var6] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2794[var1] - var10) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var6];
         anIntArray2806[var4] = anIntArray2817[var6];
         anIntArray2832[var4++] = this.anIntArray2794[var1];
      } else {
         var3 = anIntArray2819[var6];
         var13 = anIntArray2820[var6];
         var10 = this.anIntArray2794[var1];
         if(var8 >= 50) {
            var14 = (50 - var9) * anIntArray2844[var8 - var9];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var5] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var5] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2793[var1] - var10) * var14 >> 16);
         }

         if(var12 >= 50) {
            var14 = (50 - var9) * anIntArray2844[var12 - var9];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var11] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var11] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2795[var1] - var10) * var14 >> 16);
         }
      }

      if(var12 >= 50) {
         anIntArray2830[var4] = anIntArray2816[var11];
         anIntArray2806[var4] = anIntArray2817[var11];
         anIntArray2832[var4++] = this.anIntArray2795[var1];
      } else {
         var3 = anIntArray2819[var11];
         var13 = anIntArray2820[var11];
         var10 = this.anIntArray2795[var1];
         if(var9 >= 50) {
            var14 = (50 - var12) * anIntArray2844[var9 - var12];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var6] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var6] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2794[var1] - var10) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = (50 - var12) * anIntArray2844[var8 - var12];
            anIntArray2830[var4] = var2 + (var3 + ((anIntArray2819[var5] - var3) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var4] = var17 + (var13 + ((anIntArray2820[var5] - var13) * var14 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var4++] = var10 + ((this.anIntArray2793[var1] - var10) * var14 >> 16);
         }
      }

      var3 = anIntArray2830[0];
      var13 = anIntArray2830[1];
      var10 = anIntArray2830[2];
      var14 = anIntArray2806[0];
      int var18 = anIntArray2806[1];
      int var19 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var7;
      int var15;
      int var16;
      int var20;
      if(var4 == 3) {
         if(var3 < 0 || var13 < 0 || var10 < 0 || var3 > Texture.anInt2712 || var13 > Texture.anInt2712 || var10 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var15 = this.aByteArray2798[var1] & 255;
               var7 = this.anIntArray2802[var15];
               var16 = this.anIntArray2803[var15];
               var20 = this.anIntArray2838[var15];
            } else {
               var7 = var5;
               var16 = var6;
               var20 = var11;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var14, var18, var19, var3, var13, var10, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var14, var18, var19, var3, var13, var10, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var14, var18, var19, var3, var13, var10, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var14, var18, var19, var3, var13, var10, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var4 == 4) {
         if(var3 < 0 || var13 < 0 || var10 < 0 || var3 > Texture.anInt2712 || var13 > Texture.anInt2712 || var10 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var15 = this.aByteArray2798[var1] & 255;
               var7 = this.anIntArray2802[var15];
               var16 = this.anIntArray2803[var15];
               var20 = this.anIntArray2838[var15];
            } else {
               var7 = var5;
               var16 = var6;
               var20 = var11;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var14, var18, var19, var3, var13, var10, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], var21);
               Texture.method3194(var14, var19, anIntArray2806[3], var3, var10, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], var21);
            } else {
               Texture.method3194(var14, var18, var19, var3, var13, var10, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], var21);
               Texture.method3194(var14, var19, anIntArray2806[3], var3, var10, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var7], anIntArray2819[var16], anIntArray2819[var20], anIntArray2820[var7], anIntArray2820[var16], anIntArray2820[var20], anIntArray2821[var7], anIntArray2821[var16], anIntArray2821[var20], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var7 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var14, var18, var19, var3, var13, var10, var7);
            Texture.method3200(var14, var19, anIntArray2806[3], var3, var10, anIntArray2830[3], var7);
         } else {
            Texture.method3215(var14, var18, var19, var3, var13, var10, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var14, var19, anIntArray2806[3], var3, var10, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   public void method3441() {
      for(int var1 = 0; var1 < this.anInt2785; ++var1) {
         int var2 = this.anIntArray2786[var1];
         this.anIntArray2786[var1] = this.anIntArray2788[var1];
         this.anIntArray2788[var1] = -var2;
      }

      this.anInt2789 = 0;
   }

   final void method3442(int var1) {
      int var2 = Texture.anInt2705;
      int var18 = Texture.anInt2706;
      int var5 = 0;
      int var14 = this.anIntArray2790[var1];
      int var12 = this.anIntArray2791[var1];
      int var13 = this.anIntArray2792[var1];
      int var15 = anIntArray2821[var14];
      int var19 = anIntArray2821[var12];
      int var16 = anIntArray2821[var13];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 255;
      }

      int var6;
      int var9;
      int var10;
      int var11;
      if(var15 >= 50) {
         anIntArray2830[var5] = anIntArray2816[var14];
         anIntArray2806[var5] = anIntArray2817[var14];
         anIntArray2832[var5++] = this.anIntArray2793[var1];
      } else {
         var9 = anIntArray2819[var14];
         var10 = anIntArray2820[var14];
         var11 = this.anIntArray2793[var1];
         if(var16 >= 50) {
            var6 = (50 - var15) * anIntArray2844[var16 - var15];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var13] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var13] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2795[var1] - var11) * var6 >> 16);
         }

         if(var19 >= 50) {
            var6 = (50 - var15) * anIntArray2844[var19 - var15];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var12] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var12] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2794[var1] - var11) * var6 >> 16);
         }
      }

      if(var19 >= 50) {
         anIntArray2830[var5] = anIntArray2816[var12];
         anIntArray2806[var5] = anIntArray2817[var12];
         anIntArray2832[var5++] = this.anIntArray2794[var1];
      } else {
         var9 = anIntArray2819[var12];
         var10 = anIntArray2820[var12];
         var11 = this.anIntArray2794[var1];
         if(var15 >= 50) {
            var6 = (50 - var19) * anIntArray2844[var15 - var19];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var14] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var14] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2793[var1] - var11) * var6 >> 16);
         }

         if(var16 >= 50) {
            var6 = (50 - var19) * anIntArray2844[var16 - var19];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var13] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var13] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2795[var1] - var11) * var6 >> 16);
         }
      }

      if(var16 >= 50) {
         anIntArray2830[var5] = anIntArray2816[var13];
         anIntArray2806[var5] = anIntArray2817[var13];
         anIntArray2832[var5++] = this.anIntArray2795[var1];
      } else {
         var9 = anIntArray2819[var13];
         var10 = anIntArray2820[var13];
         var11 = this.anIntArray2795[var1];
         if(var19 >= 50) {
            var6 = (50 - var16) * anIntArray2844[var19 - var16];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var12] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var12] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2794[var1] - var11) * var6 >> 16);
         }

         if(var15 >= 50) {
            var6 = (50 - var16) * anIntArray2844[var15 - var16];
            anIntArray2830[var5] = var2 + (var9 + ((anIntArray2819[var14] - var9) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var18 + (var10 + ((anIntArray2820[var14] - var10) * var6 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var11 + ((this.anIntArray2793[var1] - var11) * var6 >> 16);
         }
      }

      var9 = anIntArray2830[0];
      var10 = anIntArray2830[1];
      var11 = anIntArray2830[2];
      var6 = anIntArray2806[0];
      int var7 = anIntArray2806[1];
      int var8 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var3;
      int var4;
      int var17;
      int var20;
      if(var5 == 3) {
         if(var9 < 0 || var10 < 0 || var11 < 0 || var9 > Texture.anInt2712 || var10 > Texture.anInt2712 || var11 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var3 = this.aByteArray2798[var1] & 255;
               var20 = this.anIntArray2802[var3];
               var4 = this.anIntArray2803[var3];
               var17 = this.anIntArray2838[var3];
            } else {
               var20 = var14;
               var4 = var12;
               var17 = var13;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var6, var7, var8, var9, var10, var11, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var6, var7, var8, var9, var10, var11, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var6, var7, var8, var9, var10, var11, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var6, var7, var8, var9, var10, var11, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var5 == 4) {
         if(var9 < 0 || var10 < 0 || var11 < 0 || var9 > Texture.anInt2712 || var10 > Texture.anInt2712 || var11 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var3 = this.aByteArray2798[var1] & 255;
               var20 = this.anIntArray2802[var3];
               var4 = this.anIntArray2803[var3];
               var17 = this.anIntArray2838[var3];
            } else {
               var20 = var14;
               var4 = var12;
               var17 = var13;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var6, var7, var8, var9, var10, var11, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], var21);
               Texture.method3194(var6, var8, anIntArray2806[3], var9, var11, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], var21);
            } else {
               Texture.method3194(var6, var7, var8, var9, var10, var11, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], var21);
               Texture.method3194(var6, var8, anIntArray2806[3], var9, var11, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var20], anIntArray2819[var4], anIntArray2819[var17], anIntArray2820[var20], anIntArray2820[var4], anIntArray2820[var17], anIntArray2821[var20], anIntArray2821[var4], anIntArray2821[var17], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var20 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var6, var7, var8, var9, var10, var11, var20);
            Texture.method3200(var6, var8, anIntArray2806[3], var9, var11, anIntArray2830[3], var20);
         } else {
            Texture.method3215(var6, var7, var8, var9, var10, var11, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var6, var8, anIntArray2806[3], var9, var11, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   final void method3443(int var1) {
      int var2 = Texture.anInt2705;
      int var13 = Texture.anInt2706;
      int var3 = 0;
      int var9 = this.anIntArray2790[var1];
      int var5 = this.anIntArray2791[var1];
      int var7 = this.anIntArray2792[var1];
      int var10 = anIntArray2821[var9];
      int var11 = anIntArray2821[var5];
      int var12 = anIntArray2821[var7];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 255;
      }

      int var6;
      int var8;
      int var14;
      int var15;
      if(var10 >= 50) {
         anIntArray2830[var3] = anIntArray2816[var9];
         anIntArray2806[var3] = anIntArray2817[var9];
         anIntArray2832[var3++] = this.anIntArray2793[var1];
      } else {
         var6 = anIntArray2819[var9];
         var14 = anIntArray2820[var9];
         var15 = this.anIntArray2793[var1];
         if(var12 >= 50) {
            var8 = (50 - var10) * anIntArray2844[var12 - var10];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var7] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var7] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2795[var1] - var15) * var8 >> 16);
         }

         if(var11 >= 50) {
            var8 = (50 - var10) * anIntArray2844[var11 - var10];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var5] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var5] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2794[var1] - var15) * var8 >> 16);
         }
      }

      if(var11 >= 50) {
         anIntArray2830[var3] = anIntArray2816[var5];
         anIntArray2806[var3] = anIntArray2817[var5];
         anIntArray2832[var3++] = this.anIntArray2794[var1];
      } else {
         var6 = anIntArray2819[var5];
         var14 = anIntArray2820[var5];
         var15 = this.anIntArray2794[var1];
         if(var10 >= 50) {
            var8 = (50 - var11) * anIntArray2844[var10 - var11];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var9] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var9] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2793[var1] - var15) * var8 >> 16);
         }

         if(var12 >= 50) {
            var8 = (50 - var11) * anIntArray2844[var12 - var11];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var7] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var7] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2795[var1] - var15) * var8 >> 16);
         }
      }

      if(var12 >= 50) {
         anIntArray2830[var3] = anIntArray2816[var7];
         anIntArray2806[var3] = anIntArray2817[var7];
         anIntArray2832[var3++] = this.anIntArray2795[var1];
      } else {
         var6 = anIntArray2819[var7];
         var14 = anIntArray2820[var7];
         var15 = this.anIntArray2795[var1];
         if(var11 >= 50) {
            var8 = (50 - var12) * anIntArray2844[var11 - var12];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var5] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var5] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2794[var1] - var15) * var8 >> 16);
         }

         if(var10 >= 50) {
            var8 = (50 - var12) * anIntArray2844[var10 - var12];
            anIntArray2830[var3] = var2 + (var6 + ((anIntArray2819[var9] - var6) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var3] = var13 + (var14 + ((anIntArray2820[var9] - var14) * var8 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var3++] = var15 + ((this.anIntArray2793[var1] - var15) * var8 >> 16);
         }
      }

      var6 = anIntArray2830[0];
      var14 = anIntArray2830[1];
      var15 = anIntArray2830[2];
      var8 = anIntArray2806[0];
      int var18 = anIntArray2806[1];
      int var19 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var4;
      int var16;
      int var17;
      int var20;
      if(var3 == 3) {
         if(var6 < 0 || var14 < 0 || var15 < 0 || var6 > Texture.anInt2712 || var14 > Texture.anInt2712 || var15 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var4 = this.aByteArray2798[var1] & 255;
               var16 = this.anIntArray2802[var4];
               var17 = this.anIntArray2803[var4];
               var20 = this.anIntArray2838[var4];
            } else {
               var16 = var9;
               var17 = var5;
               var20 = var7;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var8, var18, var19, var6, var14, var15, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var8, var18, var19, var6, var14, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var8, var18, var19, var6, var14, var15, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var8, var18, var19, var6, var14, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var3 == 4) {
         if(var6 < 0 || var14 < 0 || var15 < 0 || var6 > Texture.anInt2712 || var14 > Texture.anInt2712 || var15 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var4 = this.aByteArray2798[var1] & 255;
               var16 = this.anIntArray2802[var4];
               var17 = this.anIntArray2803[var4];
               var20 = this.anIntArray2838[var4];
            } else {
               var16 = var9;
               var17 = var5;
               var20 = var7;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var8, var18, var19, var6, var14, var15, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], var21);
               Texture.method3194(var8, var19, anIntArray2806[3], var6, var15, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], var21);
            } else {
               Texture.method3194(var8, var18, var19, var6, var14, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], var21);
               Texture.method3194(var8, var19, anIntArray2806[3], var6, var15, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var16], anIntArray2819[var17], anIntArray2819[var20], anIntArray2820[var16], anIntArray2820[var17], anIntArray2820[var20], anIntArray2821[var16], anIntArray2821[var17], anIntArray2821[var20], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var16 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var8, var18, var19, var6, var14, var15, var16);
            Texture.method3200(var8, var19, anIntArray2806[3], var6, var15, anIntArray2830[3], var16);
         } else {
            Texture.method3215(var8, var18, var19, var6, var14, var15, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var8, var19, anIntArray2806[3], var6, var15, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   final void method3444(int var1) {
      int var2 = Texture.anInt2705;
      int var12 = Texture.anInt2706;
      int var5 = 0;
      int var13 = this.anIntArray2790[var1];
      int var3 = this.anIntArray2791[var1];
      int var7 = this.anIntArray2792[var1];
      int var11 = anIntArray2821[var13];
      int var9 = anIntArray2821[var3];
      int var15 = anIntArray2821[var7];
      if(this.aByteArray2797 == null) {
         Texture.anInt2699 = 0;
      } else {
         Texture.anInt2699 = this.aByteArray2797[var1] & 1674380437;
      }

      int var4;
      int var6;
      int var14;
      int var16;
      if(var11 >= -1899987750) {
         anIntArray2830[var5] = anIntArray2816[var13];
         anIntArray2806[var5] = anIntArray2817[var13];
         anIntArray2832[var5++] = this.anIntArray2793[var1];
      } else {
         var4 = anIntArray2819[var13];
         var6 = anIntArray2820[var13];
         var14 = this.anIntArray2793[var1];
         if(var15 >= 666685974) {
            var16 = (-1111750266 - var11) * anIntArray2844[var15 - var11];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var7] - var4) * var16 >> 16)) * Texture.anInt2704 / 1094841054;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var7] - var6) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2795[var1] - var14) * var16 >> 16);
         }

         if(var9 >= 302396007) {
            var16 = (-1487789138 - var11) * anIntArray2844[var9 - var11];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var3] - var4) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var3] - var6) * var16 >> 16)) * Texture.anInt2704 / 614362034;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2794[var1] - var14) * var16 >> 16);
         }
      }

      if(var9 >= 1106720365) {
         anIntArray2830[var5] = anIntArray2816[var3];
         anIntArray2806[var5] = anIntArray2817[var3];
         anIntArray2832[var5++] = this.anIntArray2794[var1];
      } else {
         var4 = anIntArray2819[var3];
         var6 = anIntArray2820[var3];
         var14 = this.anIntArray2794[var1];
         if(var11 >= -604926147) {
            var16 = (50 - var9) * anIntArray2844[var11 - var9];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var13] - var4) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var13] - var6) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2793[var1] - var14) * var16 >> 16);
         }

         if(var15 >= -2094212190) {
            var16 = (136138583 - var9) * anIntArray2844[var15 - var9];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var7] - var4) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var7] - var6) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2795[var1] - var14) * var16 >> 16);
         }
      }

      if(var15 >= -516907082) {
         anIntArray2830[var5] = anIntArray2816[var7];
         anIntArray2806[var5] = anIntArray2817[var7];
         anIntArray2832[var5++] = this.anIntArray2795[var1];
      } else {
         var4 = anIntArray2819[var7];
         var6 = anIntArray2820[var7];
         var14 = this.anIntArray2795[var1];
         if(var9 >= -1005933138) {
            var16 = (-1951604476 - var15) * anIntArray2844[var9 - var15];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var3] - var4) * var16 >> 16)) * Texture.anInt2704 / 1838482273;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var3] - var6) * var16 >> 16)) * Texture.anInt2704 / -1209287924;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2794[var1] - var14) * var16 >> 16);
         }

         if(var11 >= 163680190) {
            var16 = (50 - var15) * anIntArray2844[var11 - var15];
            anIntArray2830[var5] = var2 + (var4 + ((anIntArray2819[var13] - var4) * var16 >> 16)) * Texture.anInt2704 / 50;
            anIntArray2806[var5] = var12 + (var6 + ((anIntArray2820[var13] - var6) * var16 >> 16)) * Texture.anInt2704 / 193661794;
            anIntArray2832[var5++] = var14 + ((this.anIntArray2793[var1] - var14) * var16 >> 16);
         }
      }

      var4 = anIntArray2830[0];
      var6 = anIntArray2830[1];
      var14 = anIntArray2830[2];
      var16 = anIntArray2806[0];
      int var17 = anIntArray2806[1];
      int var18 = anIntArray2806[2];
      Texture.aBool2700 = false;
      int var8;
      int var10;
      int var19;
      int var20;
      if(var5 == 3) {
         if(var4 < 0 || var6 < 0 || var14 < 0 || var4 > Texture.anInt2712 || var6 > Texture.anInt2712 || var14 > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var8 = this.aByteArray2798[var1] & -325253509;
               var10 = this.anIntArray2802[var8];
               var19 = this.anIntArray2803[var8];
               var20 = this.anIntArray2838[var8];
            } else {
               var10 = var13;
               var19 = var3;
               var20 = var7;
            }

            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var16, var17, var18, var4, var6, var14, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], this.aShortArray2781[var1]);
            } else {
               Texture.method3194(var16, var17, var18, var4, var6, var14, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], this.aShortArray2781[var1]);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            Texture.method3200(var16, var17, var18, var4, var6, var14, anIntArray2840[this.anIntArray2793[var1]]);
         } else {
            Texture.method3215(var16, var17, var18, var4, var6, var14, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
         }
      }

      if(var5 == 4) {
         if(var4 < 0 || var6 < 0 || var14 < 0 || var4 > Texture.anInt2712 || var6 > Texture.anInt2712 || var14 > Texture.anInt2712 || anIntArray2830[3] < 0 || anIntArray2830[3] > Texture.anInt2712) {
            Texture.aBool2700 = true;
         }

         if(this.aShortArray2781 != null && this.aShortArray2781[var1] != -1) {
            if(this.aByteArray2798 != null && this.aByteArray2798[var1] != -1) {
               var8 = this.aByteArray2798[var1] & 255;
               var10 = this.anIntArray2802[var8];
               var19 = this.anIntArray2803[var8];
               var20 = this.anIntArray2838[var8];
            } else {
               var10 = var13;
               var19 = var3;
               var20 = var7;
            }

            short var21 = this.aShortArray2781[var1];
            if(this.anIntArray2795[var1] == -1) {
               Texture.method3194(var16, var17, var18, var4, var6, var14, this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], var21);
               Texture.method3194(var16, var18, anIntArray2806[3], var4, var14, anIntArray2830[3], this.anIntArray2793[var1], this.anIntArray2793[var1], this.anIntArray2793[var1], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], var21);
            } else {
               Texture.method3194(var16, var17, var18, var4, var6, var14, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], var21);
               Texture.method3194(var16, var18, anIntArray2806[3], var4, var14, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3], anIntArray2819[var10], anIntArray2819[var19], anIntArray2819[var20], anIntArray2820[var10], anIntArray2820[var19], anIntArray2820[var20], anIntArray2821[var10], anIntArray2821[var19], anIntArray2821[var20], var21);
            }
         } else if(this.anIntArray2795[var1] == -1) {
            var10 = anIntArray2840[this.anIntArray2793[var1]];
            Texture.method3200(var16, var17, var18, var4, var6, var14, var10);
            Texture.method3200(var16, var18, anIntArray2806[3], var4, var14, anIntArray2830[3], var10);
         } else {
            Texture.method3215(var16, var17, var18, var4, var6, var14, anIntArray2832[0], anIntArray2832[1], anIntArray2832[2]);
            Texture.method3215(var16, var18, anIntArray2806[3], var4, var14, anIntArray2830[3], anIntArray2832[0], anIntArray2832[2], anIntArray2832[3]);
         }
      }

   }

   public void method3445(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2785; ++var4) {
         this.anIntArray2786[var4] = this.anIntArray2786[var4] * var1 / 128;
         this.anIntArray2807[var4] = this.anIntArray2807[var4] * var2 / 128;
         this.anIntArray2788[var4] = this.anIntArray2788[var4] * var3 / 128;
      }

      this.anInt2789 = 0;
   }
}
