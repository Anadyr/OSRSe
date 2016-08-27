package com.jagex;

public class Texture extends DrawingArea {

   static int anInt2695;
   static boolean aBool2696 = false;
   static boolean aBool2697 = false;
   public static boolean aBool2698 = true;
   static int anInt2699 = 0;
   static boolean aBool2700 = false;
   static int anInt2701;
   public static int anInt2704 = 512;
   static int anInt2705;
   static int anInt2706;
   static int anInt2707;
   public static int[] anIntArray2708 = new int[2048];
   static int anInt2709;
   static int[] anIntArray2710 = new int[1024];
   static int anInt2712;
   public static int[] anIntArray2713 = new int[2048];
   public static int[] anIntArray2714 = new int[65536];
   static int[] anIntArray2716 = new int[512];
   static int[] anIntArray2717 = new int[2048];
   public static Interface3 anInterface3_2718;
   static int anInt2719;


   public static final void method3190() {
      method3232(topX, topY, bottomX, bottomY);
   }

   public static final void method3192() {
      anInt2705 = anInt2712 / 2;
      anInt2706 = anInt2707 / 2;
      anInt2709 = -anInt2705;
      anInt2695 = anInt2712 - anInt2705;
      anInt2719 = -anInt2706;
      anInt2701 = anInt2707 - anInt2706;
   }

   public static final void method3193(int var0, int var1) {
      int var2 = anIntArray2710[0];
      int var3 = var2 / width;
      int var4 = var2 - var3 * width;
      anInt2705 = var0 - var4;
      anInt2706 = var1 - var3;
      anInt2709 = -anInt2705;
      anInt2695 = anInt2712 - anInt2705;
      anInt2719 = -anInt2706;
      anInt2701 = anInt2707 - anInt2706;
   }

   static final void method3194(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = anInterface3_2718.method21(var18, -1976759906);
      int var22;
      if(var19 == null) {
         var22 = anInterface3_2718.method15(var18, -1018118266);
         method3215(var0, var1, var2, var3, var4, var5, method3206(var22, var6), method3206(var22, var7), method3206(var22, var8));
      } else {
         aBool2697 = anInterface3_2718.method17(var18, (byte)1);
         aBool2696 = anInterface3_2718.method16(var18, (byte)78);
          var22 = var4 - var3;
         int var24 = var1 - var0;
         int var31 = var5 - var3;
         int var30 = var2 - var0;
         int var26 = var7 - var6;
         int var40 = var8 - var6;
         int var27 = 0;
         if(var1 != var0) {
            var27 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var29 = 0;
         if(var2 != var1) {
            var29 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var23 = 0;
         if(var2 != var0) {
            var23 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var32 = var22 * var30 - var31 * var24;
         if(var32 != 0) {
            int var33 = (var26 * var30 - var40 * var24 << 9) / var32;
            int var25 = (var40 * var22 - var26 * var31 << 9) / var32;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var34 = var11 * var12 - var14 * var9 << 14;
            int var36 = (int)(((long)(var14 * var15 - var17 * var12) << 3 << 14) / (long)anInt2704);
            int var41 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)anInt2704);
            int var20 = var10 * var12 - var13 * var9 << 14;
            int var37 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)anInt2704);
            int var21 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)anInt2704);
            int var35 = var13 * var11 - var10 * var14 << 14;
            int var38 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)anInt2704);
            int var39 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)anInt2704);
            int var28;
            if(var0 <= var1 && var0 <= var2) {
               if(var0 < anInt2707) {
                  if(var1 > anInt2707) {
                     var1 = anInt2707;
                  }

                  if(var2 > anInt2707) {
                     var2 = anInt2707;
                  }

                  var6 = (var6 << 9) - var33 * var3 + var33;
                  if(var1 < var2) {
                     var5 = var3 <<= 14;
                     if(var0 < 0) {
                        var5 -= var23 * var0;
                        var3 -= var27 * var0;
                        var6 -= var25 * var0;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if(var1 < 0) {
                        var4 -= var29 * var1;
                        var1 = 0;
                     }

                     var28 = var0 - anInt2706;
                     var34 += var41 * var28;
                     var20 += var21 * var28;
                     var35 += var39 * var28;
                     if((var0 == var1 || var23 >= var27) && (var0 != var1 || var23 <= var29)) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                                 var5 += var23;
                                 var4 += var29;
                                 var6 += var25;
                                 var0 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                           var5 += var23;
                           var3 += var27;
                           var6 += var25;
                           var0 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                                 var5 += var23;
                                 var4 += var29;
                                 var6 += var25;
                                 var0 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                           var5 += var23;
                           var3 += var27;
                           var6 += var25;
                           var0 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     }
                  } else {
                     var4 = var3 <<= 14;
                     if(var0 < 0) {
                        var4 -= var23 * var0;
                        var3 -= var27 * var0;
                        var6 -= var25 * var0;
                        var0 = 0;
                     }

                     var5 <<= 14;
                     if(var2 < 0) {
                        var5 -= var29 * var2;
                        var2 = 0;
                     }

                     var28 = var0 - anInt2706;
                     var34 += var41 * var28;
                     var20 += var21 * var28;
                     var35 += var39 * var28;
                     if((var0 == var2 || var23 >= var27) && (var0 != var2 || var29 <= var27)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                                 var5 += var29;
                                 var3 += var27;
                                 var6 += var25;
                                 var0 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                           var4 += var23;
                           var3 += var27;
                           var6 += var25;
                           var0 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                                 var5 += var29;
                                 var3 += var27;
                                 var6 += var25;
                                 var0 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var33, var34, var20, var35, var36, var37, var38);
                           var4 += var23;
                           var3 += var27;
                           var6 += var25;
                           var0 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     }
                  }
               }
            } else if(var1 <= var2) {
               if(var1 < anInt2707) {
                  if(var2 > anInt2707) {
                     var2 = anInt2707;
                  }

                  if(var0 > anInt2707) {
                     var0 = anInt2707;
                  }

                  var7 = (var7 << 9) - var33 * var4 + var33;
                  if(var2 < var0) {
                     var3 = var4 <<= 14;
                     if(var1 < 0) {
                        var3 -= var27 * var1;
                        var4 -= var29 * var1;
                        var7 -= var25 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if(var2 < 0) {
                        var5 -= var23 * var2;
                        var2 = 0;
                     }

                     var28 = var1 - anInt2706;
                     var34 += var41 * var28;
                     var20 += var21 * var28;
                     var35 += var39 * var28;
                     if((var1 == var2 || var27 >= var29) && (var1 != var2 || var27 <= var23)) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                                 var3 += var27;
                                 var5 += var23;
                                 var7 += var25;
                                 var1 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                           var3 += var27;
                           var4 += var29;
                           var7 += var25;
                           var1 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                                 var3 += var27;
                                 var5 += var23;
                                 var7 += var25;
                                 var1 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                           var3 += var27;
                           var4 += var29;
                           var7 += var25;
                           var1 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if(var1 < 0) {
                        var5 -= var27 * var1;
                        var4 -= var29 * var1;
                        var7 -= var25 * var1;
                        var1 = 0;
                     }

                     var3 <<= 14;
                     if(var0 < 0) {
                        var3 -= var23 * var0;
                        var0 = 0;
                     }

                     var28 = var1 - anInt2706;
                     var34 += var41 * var28;
                     var20 += var21 * var28;
                     var35 += var39 * var28;
                     if(var27 < var29) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                                 var3 += var23;
                                 var4 += var29;
                                 var7 += var25;
                                 var1 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                           var5 += var27;
                           var4 += var29;
                           var7 += var25;
                           var1 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3203(rasterPixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                                 var3 += var23;
                                 var4 += var29;
                                 var7 += var25;
                                 var1 += width;
                                 var34 += var41;
                                 var20 += var21;
                                 var35 += var39;
                              }
                           }

                           method3203(rasterPixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var33, var34, var20, var35, var36, var37, var38);
                           var5 += var27;
                           var4 += var29;
                           var7 += var25;
                           var1 += width;
                           var34 += var41;
                           var20 += var21;
                           var35 += var39;
                        }
                     }
                  }
               }
            } else if(var2 < anInt2707) {
               if(var0 > anInt2707) {
                  var0 = anInt2707;
               }

               if(var1 > anInt2707) {
                  var1 = anInt2707;
               }

               var8 = (var8 << 9) - var33 * var5 + var33;
               if(var0 < var1) {
                  var4 = var5 <<= 14;
                  if(var2 < 0) {
                     var4 -= var29 * var2;
                     var5 -= var23 * var2;
                     var8 -= var25 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if(var0 < 0) {
                     var3 -= var27 * var0;
                     var0 = 0;
                  }

                  var28 = var2 - anInt2706;
                  var34 += var41 * var28;
                  var20 += var21 * var28;
                  var35 += var39 * var28;
                  if(var29 < var23) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3203(rasterPixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                              var4 += var29;
                              var3 += var27;
                              var8 += var25;
                              var2 += width;
                              var34 += var41;
                              var20 += var21;
                              var35 += var39;
                           }
                        }

                        method3203(rasterPixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                        var4 += var29;
                        var5 += var23;
                        var8 += var25;
                        var2 += width;
                        var34 += var41;
                        var20 += var21;
                        var35 += var39;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3203(rasterPixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                              var4 += var29;
                              var3 += var27;
                              var8 += var25;
                              var2 += width;
                              var34 += var41;
                              var20 += var21;
                              var35 += var39;
                           }
                        }

                        method3203(rasterPixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                        var4 += var29;
                        var5 += var23;
                        var8 += var25;
                        var2 += width;
                        var34 += var41;
                        var20 += var21;
                        var35 += var39;
                     }
                  }
               } else {
                  var3 = var5 <<= 14;
                  if(var2 < 0) {
                     var3 -= var29 * var2;
                     var5 -= var23 * var2;
                     var8 -= var25 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if(var1 < 0) {
                     var4 -= var27 * var1;
                     var1 = 0;
                  }

                  var28 = var2 - anInt2706;
                  var34 += var41 * var28;
                  var20 += var21 * var28;
                  var35 += var39 * var28;
                  if(var29 < var23) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3203(rasterPixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                              var4 += var27;
                              var5 += var23;
                              var8 += var25;
                              var2 += width;
                              var34 += var41;
                              var20 += var21;
                              var35 += var39;
                           }
                        }

                        method3203(rasterPixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                        var3 += var29;
                        var5 += var23;
                        var8 += var25;
                        var2 += width;
                        var34 += var41;
                        var20 += var21;
                        var35 += var39;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3203(rasterPixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                              var4 += var27;
                              var5 += var23;
                              var8 += var25;
                              var2 += width;
                              var34 += var41;
                              var20 += var21;
                              var35 += var39;
                           }
                        }

                        method3203(rasterPixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var33, var34, var20, var35, var36, var37, var38);
                        var3 += var29;
                        var5 += var23;
                        var8 += var25;
                        var2 += width;
                        var34 += var41;
                        var20 += var21;
                        var35 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   public static final void method3195(double var0) {
      method3196(var0, 0, 512);
   }

   static final void method3196(double var0, int var2, int var3) {
      var0 += Math.random() * 0.03D - 0.015D;
      int var8 = var2 * 128;

      for(int var9 = var2; var9 < var3; ++var9) {
         double var10 = (double)(var9 >> 3) / 64.0D + 0.0078125D;
         double var19 = (double)(var9 & 7) / 8.0D + 0.0625D;

         for(int var16 = 0; var16 < 128; ++var16) {
            double var4 = (double)var16 / 128.0D;
            double var6 = var4;
            double var31 = var4;
            double var21 = var4;
            if(var19 != 0.0D) {
               double var23;
               if(var4 < 0.5D) {
                  var23 = var4 * (1.0D + var19);
               } else {
                  var23 = var4 + var19 - var4 * var19;
               }

               double var25 = 2.0D * var4 - var23;
               double var27 = var10 + 0.3333333333333333D;
               if(var27 > 1.0D) {
                  --var27;
               }

               double var17 = var10 - 0.3333333333333333D;
               if(var17 < 0.0D) {
                  ++var17;
               }

               if(6.0D * var27 < 1.0D) {
                  var6 = var25 + (var23 - var25) * 6.0D * var27;
               } else if(2.0D * var27 < 1.0D) {
                  var6 = var23;
               } else if(3.0D * var27 < 2.0D) {
                  var6 = var25 + (var23 - var25) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var6 = var25;
               }

               if(6.0D * var10 < 1.0D) {
                  var31 = var25 + (var23 - var25) * 6.0D * var10;
               } else if(2.0D * var10 < 1.0D) {
                  var31 = var23;
               } else if(3.0D * var10 < 2.0D) {
                  var31 = var25 + (var23 - var25) * (0.6666666666666666D - var10) * 6.0D;
               } else {
                  var31 = var25;
               }

               if(6.0D * var17 < 1.0D) {
                  var21 = var25 + (var23 - var25) * 6.0D * var17;
               } else if(2.0D * var17 < 1.0D) {
                  var21 = var23;
               } else if(3.0D * var17 < 2.0D) {
                  var21 = var25 + (var23 - var25) * (0.6666666666666666D - var17) * 6.0D;
               } else {
                  var21 = var25;
               }
            }

            int var12 = (int)(var6 * 256.0D);
            int var13 = (int)(var31 * 256.0D);
            int var14 = (int)(var21 * 256.0D);
            int var15 = (var12 << 16) + (var13 << 8) + var14;
            var15 = method3197(var15, var0);
            if(var15 == 0) {
               var15 = 1;
            }

            anIntArray2714[var8++] = var15;
         }
      }

   }

   static int method3197(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var8 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var8 = Math.pow(var8, var1);
      int var10 = (int)(var3 * 256.0D);
      int var7 = (int)(var5 * 256.0D);
      int var11 = (int)(var8 * 256.0D);
      return (var10 << 16) + (var7 << 8) + var11;
   }

   public static void method3199(int var0, int var1, int var2) {
      aBool2700 = var0 < 0 || var0 > anInt2712 || var1 < 0 || var1 > anInt2712 || var2 < 0 || var2 > anInt2712;
   }

   public static final void method3200(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var1 != var0) {
         var7 = (var4 - var3 << 14) / (var1 - var0);
      }

      int var8 = 0;
      if(var2 != var1) {
         var8 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var9 = 0;
      if(var2 != var0) {
         var9 = (var3 - var5 << 14) / (var0 - var2);
      }

      if(var0 <= var1 && var0 <= var2) {
         if(var0 < anInt2707) {
            if(var1 > anInt2707) {
               var1 = anInt2707;
            }

            if(var2 > anInt2707) {
               var2 = anInt2707;
            }

            if(var1 < var2) {
               var5 = var3 <<= 14;
               if(var0 < 0) {
                  var5 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 14;
               if(var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = anIntArray2710[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var0, var6, 0, var4 >> 14, var5 >> 14);
                           var5 += var9;
                           var4 += var8;
                           var0 += width;
                        }
                     }

                     method3201(rasterPixels, var0, var6, 0, var3 >> 14, var5 >> 14);
                     var5 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = anIntArray2710[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var0, var6, 0, var5 >> 14, var4 >> 14);
                           var5 += var9;
                           var4 += var8;
                           var0 += width;
                        }
                     }

                     method3201(rasterPixels, var0, var6, 0, var5 >> 14, var3 >> 14);
                     var5 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               }
            } else {
               var4 = var3 <<= 14;
               if(var0 < 0) {
                  var4 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var5 <<= 14;
               if(var2 < 0) {
                  var5 -= var8 * var2;
                  var2 = 0;
               }

               if((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = anIntArray2710[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var0, var6, 0, var3 >> 14, var5 >> 14);
                           var5 += var8;
                           var3 += var7;
                           var0 += width;
                        }
                     }

                     method3201(rasterPixels, var0, var6, 0, var3 >> 14, var4 >> 14);
                     var4 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = anIntArray2710[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var0, var6, 0, var5 >> 14, var3 >> 14);
                           var5 += var8;
                           var3 += var7;
                           var0 += width;
                        }
                     }

                     method3201(rasterPixels, var0, var6, 0, var4 >> 14, var3 >> 14);
                     var4 += var9;
                     var3 += var7;
                     var0 += width;
                  }
               }
            }
         }
      } else if(var1 <= var2) {
         if(var1 < anInt2707) {
            if(var2 > anInt2707) {
               var2 = anInt2707;
            }

            if(var0 > anInt2707) {
               var0 = anInt2707;
            }

            if(var2 < var0) {
               var3 = var4 <<= 14;
               if(var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if(var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = anIntArray2710[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var1, var6, 0, var5 >> 14, var3 >> 14);
                           var3 += var7;
                           var5 += var9;
                           var1 += width;
                        }
                     }

                     method3201(rasterPixels, var1, var6, 0, var4 >> 14, var3 >> 14);
                     var3 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = anIntArray2710[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var1, var6, 0, var3 >> 14, var5 >> 14);
                           var3 += var7;
                           var5 += var9;
                           var1 += width;
                        }
                     }

                     method3201(rasterPixels, var1, var6, 0, var3 >> 14, var4 >> 14);
                     var3 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if(var1 < 0) {
                  var5 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var3 <<= 14;
               if(var0 < 0) {
                  var3 -= var9 * var0;
                  var0 = 0;
               }

               if(var7 < var8) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = anIntArray2710[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var1, var6, 0, var3 >> 14, var4 >> 14);
                           var3 += var9;
                           var4 += var8;
                           var1 += width;
                        }
                     }

                     method3201(rasterPixels, var1, var6, 0, var5 >> 14, var4 >> 14);
                     var5 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = anIntArray2710[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           method3201(rasterPixels, var1, var6, 0, var4 >> 14, var3 >> 14);
                           var3 += var9;
                           var4 += var8;
                           var1 += width;
                        }
                     }

                     method3201(rasterPixels, var1, var6, 0, var4 >> 14, var5 >> 14);
                     var5 += var7;
                     var4 += var8;
                     var1 += width;
                  }
               }
            }
         }
      } else if(var2 < anInt2707) {
         if(var0 > anInt2707) {
            var0 = anInt2707;
         }

         if(var1 > anInt2707) {
            var1 = anInt2707;
         }

         if(var0 < var1) {
            var4 = var5 <<= 14;
            if(var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 14;
            if(var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if(var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = anIntArray2710[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method3201(rasterPixels, var2, var6, 0, var4 >> 14, var3 >> 14);
                        var4 += var8;
                        var3 += var7;
                        var2 += width;
                     }
                  }

                  method3201(rasterPixels, var2, var6, 0, var4 >> 14, var5 >> 14);
                  var4 += var8;
                  var5 += var9;
                  var2 += width;
               }
            } else {
               var1 -= var0;
               var0 -= var2;
               var2 = anIntArray2710[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method3201(rasterPixels, var2, var6, 0, var3 >> 14, var4 >> 14);
                        var4 += var8;
                        var3 += var7;
                        var2 += width;
                     }
                  }

                  method3201(rasterPixels, var2, var6, 0, var5 >> 14, var4 >> 14);
                  var4 += var8;
                  var5 += var9;
                  var2 += width;
               }
            }
         } else {
            var3 = var5 <<= 14;
            if(var2 < 0) {
               var3 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var4 <<= 14;
            if(var1 < 0) {
               var4 -= var7 * var1;
               var1 = 0;
            }

            if(var8 < var9) {
               var0 -= var1;
               var1 -= var2;
               var2 = anIntArray2710[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        method3201(rasterPixels, var2, var6, 0, var4 >> 14, var5 >> 14);
                        var4 += var7;
                        var5 += var9;
                        var2 += width;
                     }
                  }

                  method3201(rasterPixels, var2, var6, 0, var3 >> 14, var5 >> 14);
                  var3 += var8;
                  var5 += var9;
                  var2 += width;
               }
            } else {
               var0 -= var1;
               var1 -= var2;
               var2 = anIntArray2710[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        method3201(rasterPixels, var2, var6, 0, var5 >> 14, var4 >> 14);
                        var4 += var7;
                        var5 += var9;
                        var2 += width;
                     }
                  }

                  method3201(rasterPixels, var2, var6, 0, var5 >> 14, var3 >> 14);
                  var3 += var8;
                  var5 += var9;
                  var2 += width;
               }
            }
         }
      }
   }

   static final void method3201(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if(aBool2700) {
         if(var5 > anInt2712) {
            var5 = anInt2712;
         }

         if(var4 < 0) {
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var1 += var4;
         var3 = var5 - var4 >> 2;
         if(anInt2699 == 0) {
            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }
         } else if(anInt2699 == 254) {
            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var0[var1++] = var0[var1];
                  }
               }

               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
            }
         } else {
            int var7 = anInt2699;
            int var8 = 256 - anInt2699;
            var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & '\uff00') * var8 >> 8 & '\uff00');

            while(true) {
               --var3;
               int var6;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     var6 = var0[var1];
                     var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
                  }
               }

               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
               var6 = var0[var1];
               var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & '\uff00') * var7 >> 8 & '\uff00');
            }
         }
      }
   }

   static final void method3203(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if(aBool2700) {
         if(var6 > anInt2712) {
            var6 = anInt2712;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var23 = var6 - var5;
         int var15;
         int var16;
         int var10000;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         if(aBool2697) {
            var19 = var5 - anInt2705;
            var9 += (var12 >> 3) * var19;
            var10 += (var13 >> 3) * var19;
            var11 += (var14 >> 3) * var19;
            var20 = var11 >> 12;
            if(var20 != 0) {
               var16 = var9 / var20;
               var21 = var10 / var20;
               if(var16 < 0) {
                  var16 = 0;
               } else if(var16 > 4032) {
                  var16 = 4032;
               }
            } else {
               var16 = 0;
               var21 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var20 = var11 >> 12;
            if(var20 != 0) {
               var15 = var9 / var20;
               var22 = var10 / var20;
               if(var15 < 0) {
                  var15 = 0;
               } else if(var15 > 4032) {
                  var15 = 4032;
               }
            } else {
               var15 = 0;
               var22 = 0;
            }

            var2 = (var16 << 20) + var21;
            var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
            var23 >>= 3;
            var8 <<= 3;
            var18 = var7 >> 8;
            if(aBool2696) {
               if(var23 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var10000 = var2 + var17;
                     var16 = var15;
                     var21 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var20 = var11 >> 12;
                     if(var20 != 0) {
                        var15 = var9 / var20;
                        var22 = var10 / var20;
                        if(var15 < 0) {
                           var15 = 0;
                        } else if(var15 > 4032) {
                           var15 = 4032;
                        }
                     } else {
                        var15 = 0;
                        var22 = 0;
                     }

                     var2 = (var16 << 20) + var21;
                     var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
                     var7 += var8;
                     var18 = var7 >> 8;
                     --var23;
                  } while(var23 > 0);
               }

               var23 = var6 - var5 & 7;
               if(var23 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     --var23;
                  } while(var23 > 0);
               }
            } else {
               if(var23 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var17;
                     var16 = var15;
                     var21 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var20 = var11 >> 12;
                     if(var20 != 0) {
                        var15 = var9 / var20;
                        var22 = var10 / var20;
                        if(var15 < 0) {
                           var15 = 0;
                        } else if(var15 > 4032) {
                           var15 = 4032;
                        }
                     } else {
                        var15 = 0;
                        var22 = 0;
                     }

                     var2 = (var16 << 20) + var21;
                     var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
                     var7 += var8;
                     var18 = var7 >> 8;
                     --var23;
                  } while(var23 > 0);
               }

               var23 = var6 - var5 & 7;
               if(var23 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     --var23;
                  } while(var23 > 0);
               }
            }
         } else {
            var19 = var5 - anInt2705;
            var9 += (var12 >> 3) * var19;
            var10 += (var13 >> 3) * var19;
            var11 += (var14 >> 3) * var19;
            var20 = var11 >> 14;
            if(var20 != 0) {
               var16 = var9 / var20;
               var21 = var10 / var20;
               if(var16 < 0) {
                  var16 = 0;
               } else if(var16 > 16256) {
                  var16 = 16256;
               }
            } else {
               var16 = 0;
               var21 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var20 = var11 >> 14;
            if(var20 != 0) {
               var15 = var9 / var20;
               var22 = var10 / var20;
               if(var15 < 0) {
                  var15 = 0;
               } else if(var15 > 16256) {
                  var15 = 16256;
               }
            } else {
               var15 = 0;
               var22 = 0;
            }

            var2 = (var16 << 18) + var21;
            var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
            var23 >>= 3;
            var8 <<= 3;
            var18 = var7 >> 8;
            if(aBool2696) {
               if(var23 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var10000 = var2 + var17;
                     var16 = var15;
                     var21 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var20 = var11 >> 14;
                     if(var20 != 0) {
                        var15 = var9 / var20;
                        var22 = var10 / var20;
                        if(var15 < 0) {
                           var15 = 0;
                        } else if(var15 > 16256) {
                           var15 = 16256;
                        }
                     } else {
                        var15 = 0;
                        var22 = 0;
                     }

                     var2 = (var16 << 18) + var21;
                     var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
                     var7 += var8;
                     var18 = var7 >> 8;
                     --var23;
                  } while(var23 > 0);
               }

               var23 = var6 - var5 & 7;
               if(var23 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     var2 += var17;
                     --var23;
                  } while(var23 > 0);
               }
            } else {
               if(var23 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var10000 = var2 + var17;
                     var16 = var15;
                     var21 = var22;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var20 = var11 >> 14;
                     if(var20 != 0) {
                        var15 = var9 / var20;
                        var22 = var10 / var20;
                        if(var15 < 0) {
                           var15 = 0;
                        } else if(var15 > 16256) {
                           var15 = 16256;
                        }
                     } else {
                        var15 = 0;
                        var22 = 0;
                     }

                     var2 = (var16 << 18) + var21;
                     var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
                     var7 += var8;
                     var18 = var7 >> 8;
                     --var23;
                  } while(var23 > 0);
               }

               var23 = var6 - var5 & 7;
               if(var23 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var18 & -16711936) + ((var3 & '\uff00') * var18 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var17;
                     --var23;
                  } while(var23 > 0);
               }
            }
         }

      }
   }

   static final void method3205(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      if(aBool2700) {
         if(var6 > anInt2712) {
            var6 = anInt2712;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var16 = var6 - var5;
         int var15;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(aBool2697) {
            var18 = var5 - anInt2705;
            var9 += var12 * var18;
            var10 += var13 * var18;
            var11 += var14 * var18;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var20 = var9 / var19;
               var21 = var10 / var19;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var9 += var12 * var16;
            var10 += var13 * var16;
            var11 += var14 * var16;
            var19 = var11 >> 12;
            if(var19 != 0) {
               var22 = var9 / var19;
               var23 = var10 / var19;
            } else {
               var22 = 0;
               var23 = 0;
            }

            var2 = (var20 << 20) + var21;
            var15 = ((var22 - var20) / var16 << 20) + (var23 - var21) / var16;
            var16 >>= 3;
            var8 <<= 3;
            var17 = var7 >> 8;
            if(aBool2696) {
               if(var16 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var7 += var8;
                     var17 = var7 >> 8;
                     --var16;
                  } while(var16 > 0);
               }

               var16 = var6 - var5 & 7;
               if(var16 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     --var16;
                  } while(var16 > 0);
               }
            } else {
               if(var16 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     var7 += var8;
                     var17 = var7 >> 8;
                     --var16;
                  } while(var16 > 0);
               }

               var16 = var6 - var5 & 7;
               if(var16 > 0) {
                  do {
                     if((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     --var16;
                  } while(var16 > 0);
               }
            }
         } else {
            var18 = var5 - anInt2705;
            var9 += var12 * var18;
            var10 += var13 * var18;
            var11 += var14 * var18;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var20 = var9 / var19;
               var21 = var10 / var19;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var9 += var12 * var16;
            var10 += var13 * var16;
            var11 += var14 * var16;
            var19 = var11 >> 14;
            if(var19 != 0) {
               var22 = var9 / var19;
               var23 = var10 / var19;
            } else {
               var22 = 0;
               var23 = 0;
            }

            var2 = (var20 << 18) + var21;
            var15 = ((var22 - var20) / var16 << 18) + (var23 - var21) / var16;
            var16 >>= 3;
            var8 <<= 3;
            var17 = var7 >> 8;
            if(aBool2696) {
               if(var16 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     var7 += var8;
                     var17 = var7 >> 8;
                     --var16;
                  } while(var16 > 0);
               }

               var16 = var6 - var5 & 7;
               if(var16 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     var2 += var15;
                     --var16;
                  } while(var16 > 0);
               }
            } else {
               if(var16 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     var7 += var8;
                     var17 = var7 >> 8;
                     --var16;
                  } while(var16 > 0);
               }

               var16 = var6 - var5 & 7;
               if(var16 > 0) {
                  do {
                     if((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var17 & -16711936) + ((var3 & '\uff00') * var17 & 16711680) >> 8;
                     }

                     ++var4;
                     var2 += var15;
                     --var16;
                  } while(var16 > 0);
               }
            }
         }

      }
   }

   static final int method3206(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         anIntArray2716[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         anIntArray2717[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         anIntArray2708[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         anIntArray2713[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

   }


   static final void method3215(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var4 - var3;
      int var16 = var1 - var0;
      int var10 = var5 - var3;
      int var11 = var2 - var0;
      int var12 = var7 - var6;
      int var20 = var8 - var6;
      int var13;
      if(var2 != var1) {
         var13 = (var5 - var4 << 14) / (var2 - var1);
      } else {
         var13 = 0;
      }

      int var14;
      if(var1 != var0) {
         var14 = (var9 << 14) / var16;
      } else {
         var14 = 0;
      }

      int var18;
      if(var2 != var0) {
         var18 = (var10 << 14) / var11;
      } else {
         var18 = 0;
      }

      int var17 = var9 * var11 - var10 * var16;
      if(var17 != 0) {
         int var19 = (var12 * var11 - var20 * var16 << 8) / var17;
         int var15 = (var20 * var9 - var12 * var10 << 8) / var17;
         if(var0 <= var1 && var0 <= var2) {
            if(var0 < anInt2707) {
               if(var1 > anInt2707) {
                  var1 = anInt2707;
               }

               if(var2 > anInt2707) {
                  var2 = anInt2707;
               }

               var6 = (var6 << 8) - var19 * var3 + var19;
               if(var1 < var2) {
                  var5 = var3 <<= 14;
                  if(var0 < 0) {
                     var5 -= var18 * var0;
                     var3 -= var14 * var0;
                     var6 -= var15 * var0;
                     var0 = 0;
                  }

                  var4 <<= 14;
                  if(var1 < 0) {
                     var4 -= var13 * var1;
                     var1 = 0;
                  }

                  if((var0 == var1 || var18 >= var14) && (var0 != var1 || var18 <= var13)) {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = anIntArray2710[var0];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
                              var5 += var18;
                              var4 += var13;
                              var6 += var15;
                              var0 += width;
                           }
                        }

                        method3226(rasterPixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                        var5 += var18;
                        var3 += var14;
                        var6 += var15;
                        var0 += width;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;
                     var0 = anIntArray2710[var0];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
                              var5 += var18;
                              var4 += var13;
                              var6 += var15;
                              var0 += width;
                           }
                        }

                        method3226(rasterPixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                        var5 += var18;
                        var3 += var14;
                        var6 += var15;
                        var0 += width;
                     }
                  }
               } else {
                  var4 = var3 <<= 14;
                  if(var0 < 0) {
                     var4 -= var18 * var0;
                     var3 -= var14 * var0;
                     var6 -= var15 * var0;
                     var0 = 0;
                  }

                  var5 <<= 14;
                  if(var2 < 0) {
                     var5 -= var13 * var2;
                     var2 = 0;
                  }

                  if((var0 == var2 || var18 >= var14) && (var0 != var2 || var13 <= var14)) {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = anIntArray2710[var0];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                              var5 += var13;
                              var3 += var14;
                              var6 += var15;
                              var0 += width;
                           }
                        }

                        method3226(rasterPixels, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
                        var4 += var18;
                        var3 += var14;
                        var6 += var15;
                        var0 += width;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;
                     var0 = anIntArray2710[var0];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                              var5 += var13;
                              var3 += var14;
                              var6 += var15;
                              var0 += width;
                           }
                        }

                        method3226(rasterPixels, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
                        var4 += var18;
                        var3 += var14;
                        var6 += var15;
                        var0 += width;
                     }
                  }
               }
            }
         } else if(var1 <= var2) {
            if(var1 < anInt2707) {
               if(var2 > anInt2707) {
                  var2 = anInt2707;
               }

               if(var0 > anInt2707) {
                  var0 = anInt2707;
               }

               var7 = (var7 << 8) - var19 * var4 + var19;
               if(var2 < var0) {
                  var3 = var4 <<= 14;
                  if(var1 < 0) {
                     var3 -= var14 * var1;
                     var4 -= var13 * var1;
                     var7 -= var15 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if(var2 < 0) {
                     var5 -= var18 * var2;
                     var2 = 0;
                  }

                  if((var1 == var2 || var14 >= var13) && (var1 != var2 || var14 <= var18)) {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = anIntArray2710[var1];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
                              var3 += var14;
                              var5 += var18;
                              var7 += var15;
                              var1 += width;
                           }
                        }

                        method3226(rasterPixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                        var3 += var14;
                        var4 += var13;
                        var7 += var15;
                        var1 += width;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;
                     var1 = anIntArray2710[var1];

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
                              var3 += var14;
                              var5 += var18;
                              var7 += var15;
                              var1 += width;
                           }
                        }

                        method3226(rasterPixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                        var3 += var14;
                        var4 += var13;
                        var7 += var15;
                        var1 += width;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if(var1 < 0) {
                     var5 -= var14 * var1;
                     var4 -= var13 * var1;
                     var7 -= var15 * var1;
                     var1 = 0;
                  }

                  var3 <<= 14;
                  if(var0 < 0) {
                     var3 -= var18 * var0;
                     var0 = 0;
                  }

                  if(var14 < var13) {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = anIntArray2710[var1];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                              var3 += var18;
                              var4 += var13;
                              var7 += var15;
                              var1 += width;
                           }
                        }

                        method3226(rasterPixels, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
                        var5 += var14;
                        var4 += var13;
                        var7 += var15;
                        var1 += width;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;
                     var1 = anIntArray2710[var1];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 return;
                              }

                              method3226(rasterPixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                              var3 += var18;
                              var4 += var13;
                              var7 += var15;
                              var1 += width;
                           }
                        }

                        method3226(rasterPixels, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
                        var5 += var14;
                        var4 += var13;
                        var7 += var15;
                        var1 += width;
                     }
                  }
               }
            }
         } else if(var2 < anInt2707) {
            if(var0 > anInt2707) {
               var0 = anInt2707;
            }

            if(var1 > anInt2707) {
               var1 = anInt2707;
            }

            var8 = (var8 << 8) - var19 * var5 + var19;
            if(var0 < var1) {
               var4 = var5 <<= 14;
               if(var2 < 0) {
                  var4 -= var13 * var2;
                  var5 -= var18 * var2;
                  var8 -= var15 * var2;
                  var2 = 0;
               }

               var3 <<= 14;
               if(var0 < 0) {
                  var3 -= var14 * var0;
                  var0 = 0;
               }

               if(var13 < var18) {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = anIntArray2710[var2];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           method3226(rasterPixels, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
                           var4 += var13;
                           var3 += var14;
                           var8 += var15;
                           var2 += width;
                        }
                     }

                     method3226(rasterPixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                     var4 += var13;
                     var5 += var18;
                     var8 += var15;
                     var2 += width;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;
                  var2 = anIntArray2710[var2];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           method3226(rasterPixels, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
                           var4 += var13;
                           var3 += var14;
                           var8 += var15;
                           var2 += width;
                        }
                     }

                     method3226(rasterPixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                     var4 += var13;
                     var5 += var18;
                     var8 += var15;
                     var2 += width;
                  }
               }
            } else {
               var3 = var5 <<= 14;
               if(var2 < 0) {
                  var3 -= var13 * var2;
                  var5 -= var18 * var2;
                  var8 -= var15 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if(var1 < 0) {
                  var4 -= var14 * var1;
                  var1 = 0;
               }

               if(var13 < var18) {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = anIntArray2710[var2];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           method3226(rasterPixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                           var4 += var14;
                           var5 += var18;
                           var8 += var15;
                           var2 += width;
                        }
                     }

                     method3226(rasterPixels, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
                     var3 += var13;
                     var5 += var18;
                     var8 += var15;
                     var2 += width;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;
                  var2 = anIntArray2710[var2];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           method3226(rasterPixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                           var4 += var14;
                           var5 += var18;
                           var8 += var15;
                           var2 += width;
                        }
                     }

                     method3226(rasterPixels, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
                     var3 += var13;
                     var5 += var18;
                     var8 += var15;
                     var2 += width;
                  }
               }
            }
         }
      }
   }

   static final void method3226(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(aBool2700) {
         if(var5 > anInt2712) {
            var5 = anInt2712;
         }

         if(var4 < 0) {
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var1 += var4;
         var6 += var7 * var4;
         int var8;
         int var9;
         int var10;
         if(aBool2698) {
            var3 = var5 - var4 >> 2;
            var7 <<= 2;
            if(anInt2699 == 0) {
               if(var3 > 0) {
                  do {
                     var2 = anIntArray2714[var6 >> 8];
                     var6 += var7;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if(var3 > 0) {
                  var2 = anIntArray2714[var6 >> 8];

                  do {
                     var0[var1++] = var2;
                     --var3;
                  } while(var3 > 0);
               }
            } else {
               var10 = anInt2699;
               var8 = 256 - anInt2699;
               if(var3 > 0) {
                  do {
                     var2 = anIntArray2714[var6 >> 8];
                     var6 += var7;
                     var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & '\uff00') * var8 >> 8 & '\uff00');
                     var9 = var0[var1];
                     var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                     var9 = var0[var1];
                     var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                     var9 = var0[var1];
                     var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                     var9 = var0[var1];
                     var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if(var3 > 0) {
                  var2 = anIntArray2714[var6 >> 8];
                  var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & '\uff00') * var8 >> 8 & '\uff00');

                  do {
                     var9 = var0[var1];
                     var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                     --var3;
                  } while(var3 > 0);
               }
            }

         } else {
            var3 = var5 - var4;
            if(anInt2699 == 0) {
               do {
                  var0[var1++] = anIntArray2714[var6 >> 8];
                  var6 += var7;
                  --var3;
               } while(var3 > 0);
            } else {
               var10 = anInt2699;
               var8 = 256 - anInt2699;

               do {
                  var2 = anIntArray2714[var6 >> 8];
                  var6 += var7;
                  var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & '\uff00') * var8 >> 8 & '\uff00');
                  var9 = var0[var1];
                  var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & '\uff00') * var10 >> 8 & '\uff00');
                  --var3;
               } while(var3 > 0);
            }

         }
      }
   }


   static final void method3232(int var0, int var1, int var2, int var3) {
      anInt2712 = var2 - var0;
      anInt2707 = var3 - var1;
      method3192();
      if(anIntArray2710.length < anInt2707) {
         anIntArray2710 = new int[World.method542(anInt2707, 1417738334)];
      }

      int var5 = var1 * width + var0;

      for(int var4 = 0; var4 < anInt2707; ++var4) {
         anIntArray2710[var4] = var5;
         var5 += width;
      }

   }

   public static final void method3235(Interface3 var0) {
      anInterface3_2718 = var0;
   }

   static final void method3248(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      int[] var19 = anInterface3_2718.method21(var18, 2080527932);
      int var21;
      if(var19 == null) {
         var21 = anInterface3_2718.method15(var18, 1168499268);
         method3215(var0, var1, var2, var3, var4, var5, method3206(var21, var6), method3206(var21, var7), method3206(var21, var8));
      } else {
         aBool2697 = anInterface3_2718.method17(var18, (byte)1);
         aBool2696 = anInterface3_2718.method16(var18, (byte)73);
         var21 = var4 - var3;
         int var22 = var1 - var0;
         int var23 = var5 - var3;
         int var24 = var2 - var0;
         int var25 = var7 - var6;
         int var33 = var8 - var6;
         int var20 = 0;
         if(var1 != var0) {
            var20 = (var4 - var3 << 14) / (var1 - var0);
         }

         int var29 = 0;
         if(var2 != var1) {
            var29 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var26 = 0;
         if(var2 != var0) {
            var26 = (var3 - var5 << 14) / (var0 - var2);
         }

         int var30 = var21 * var24 - var23 * var22;
         if(var30 != 0) {
            int var34 = (var25 * var24 - var33 * var22 << 9) / var30;
            int var38 = (var33 * var21 - var25 * var23 << 9) / var30;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var40 = var11 * var12 - var14 * var9 << 14;
            int var35 = (int)(((long)(var14 * var15 - var17 * var12) << 14) / (long)anInt2704);
            int var36 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)anInt2704);
            int var27 = var10 * var12 - var13 * var9 << 14;
            int var41 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)anInt2704);
            int var28 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)anInt2704);
            int var31 = var13 * var11 - var10 * var14 << 14;
            int var37 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)anInt2704);
            int var32 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)anInt2704);
            int var39;
            if(var0 <= var1 && var0 <= var2) {
               if(var0 < anInt2707) {
                  if(var1 > anInt2707) {
                     var1 = anInt2707;
                  }

                  if(var2 > anInt2707) {
                     var2 = anInt2707;
                  }

                  var6 = (var6 << 9) - var34 * var3 + var34;
                  if(var1 < var2) {
                     var5 = var3 <<= 14;
                     if(var0 < 0) {
                        var5 -= var26 * var0;
                        var3 -= var20 * var0;
                        var6 -= var38 * var0;
                        var0 = 0;
                     }

                     var4 <<= 14;
                     if(var1 < 0) {
                        var4 -= var29 * var1;
                        var1 = 0;
                     }

                     var39 = var0 - anInt2706;
                     var40 += var36 * var39;
                     var27 += var28 * var39;
                     var31 += var32 * var39;
                     if((var0 == var1 || var26 >= var20) && (var0 != var1 || var26 <= var29)) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                                 var5 += var26;
                                 var4 += var29;
                                 var6 += var38;
                                 var0 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                           var5 += var26;
                           var3 += var20;
                           var6 += var38;
                           var0 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                                 var5 += var26;
                                 var4 += var29;
                                 var6 += var38;
                                 var0 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                           var5 += var26;
                           var3 += var20;
                           var6 += var38;
                           var0 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     }
                  } else {
                     var4 = var3 <<= 14;
                     if(var0 < 0) {
                        var4 -= var26 * var0;
                        var3 -= var20 * var0;
                        var6 -= var38 * var0;
                        var0 = 0;
                     }

                     var5 <<= 14;
                     if(var2 < 0) {
                        var5 -= var29 * var2;
                        var2 = 0;
                     }

                     var39 = var0 - anInt2706;
                     var40 += var36 * var39;
                     var27 += var28 * var39;
                     var31 += var32 * var39;
                     if((var0 == var2 || var26 >= var20) && (var0 != var2 || var29 <= var20)) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                                 var5 += var29;
                                 var3 += var20;
                                 var6 += var38;
                                 var0 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                           var4 += var26;
                           var3 += var20;
                           var6 += var38;
                           var0 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray2710[var0];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                                 var5 += var29;
                                 var3 += var20;
                                 var6 += var38;
                                 var0 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var34, var40, var27, var31, var35, var41, var37);
                           var4 += var26;
                           var3 += var20;
                           var6 += var38;
                           var0 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     }
                  }
               }
            } else if(var1 <= var2) {
               if(var1 < anInt2707) {
                  if(var2 > anInt2707) {
                     var2 = anInt2707;
                  }

                  if(var0 > anInt2707) {
                     var0 = anInt2707;
                  }

                  var7 = (var7 << 9) - var34 * var4 + var34;
                  if(var2 < var0) {
                     var3 = var4 <<= 14;
                     if(var1 < 0) {
                        var3 -= var20 * var1;
                        var4 -= var29 * var1;
                        var7 -= var38 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if(var2 < 0) {
                        var5 -= var26 * var2;
                        var2 = 0;
                     }

                     var39 = var1 - anInt2706;
                     var40 += var36 * var39;
                     var27 += var28 * var39;
                     var31 += var32 * var39;
                     if((var1 == var2 || var20 >= var29) && (var1 != var2 || var20 <= var26)) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                                 var3 += var20;
                                 var5 += var26;
                                 var7 += var38;
                                 var1 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                           var3 += var20;
                           var4 += var29;
                           var7 += var38;
                           var1 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              while(true) {
                                 --var0;
                                 if(var0 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                                 var3 += var20;
                                 var5 += var26;
                                 var7 += var38;
                                 var1 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                           var3 += var20;
                           var4 += var29;
                           var7 += var38;
                           var1 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if(var1 < 0) {
                        var5 -= var20 * var1;
                        var4 -= var29 * var1;
                        var7 -= var38 * var1;
                        var1 = 0;
                     }

                     var3 <<= 14;
                     if(var0 < 0) {
                        var3 -= var26 * var0;
                        var0 = 0;
                     }

                     var39 = var1 - anInt2706;
                     var40 += var36 * var39;
                     var27 += var28 * var39;
                     var31 += var32 * var39;
                     if(var20 < var29) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                                 var3 += var26;
                                 var4 += var29;
                                 var7 += var38;
                                 var1 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                           var5 += var20;
                           var4 += var29;
                           var7 += var38;
                           var1 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray2710[var1];

                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              while(true) {
                                 --var2;
                                 if(var2 < 0) {
                                    return;
                                 }

                                 method3205(rasterPixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                                 var3 += var26;
                                 var4 += var29;
                                 var7 += var38;
                                 var1 += width;
                                 var40 += var36;
                                 var27 += var28;
                                 var31 += var32;
                              }
                           }

                           method3205(rasterPixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var34, var40, var27, var31, var35, var41, var37);
                           var5 += var20;
                           var4 += var29;
                           var7 += var38;
                           var1 += width;
                           var40 += var36;
                           var27 += var28;
                           var31 += var32;
                        }
                     }
                  }
               }
            } else if(var2 < anInt2707) {
               if(var0 > anInt2707) {
                  var0 = anInt2707;
               }

               if(var1 > anInt2707) {
                  var1 = anInt2707;
               }

               var8 = (var8 << 9) - var34 * var5 + var34;
               if(var0 < var1) {
                  var4 = var5 <<= 14;
                  if(var2 < 0) {
                     var4 -= var29 * var2;
                     var5 -= var26 * var2;
                     var8 -= var38 * var2;
                     var2 = 0;
                  }

                  var3 <<= 14;
                  if(var0 < 0) {
                     var3 -= var20 * var0;
                     var0 = 0;
                  }

                  var39 = var2 - anInt2706;
                  var40 += var36 * var39;
                  var27 += var28 * var39;
                  var31 += var32 * var39;
                  if(var29 < var26) {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3205(rasterPixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                              var4 += var29;
                              var3 += var20;
                              var8 += var38;
                              var2 += width;
                              var40 += var36;
                              var27 += var28;
                              var31 += var32;
                           }
                        }

                        method3205(rasterPixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                        var4 += var29;
                        var5 += var26;
                        var8 += var38;
                        var2 += width;
                        var40 += var36;
                        var27 += var28;
                        var31 += var32;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 return;
                              }

                              method3205(rasterPixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                              var4 += var29;
                              var3 += var20;
                              var8 += var38;
                              var2 += width;
                              var40 += var36;
                              var27 += var28;
                              var31 += var32;
                           }
                        }

                        method3205(rasterPixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                        var4 += var29;
                        var5 += var26;
                        var8 += var38;
                        var2 += width;
                        var40 += var36;
                        var27 += var28;
                        var31 += var32;
                     }
                  }
               } else {
                  var3 = var5 <<= 14;
                  if(var2 < 0) {
                     var3 -= var29 * var2;
                     var5 -= var26 * var2;
                     var8 -= var38 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if(var1 < 0) {
                     var4 -= var20 * var1;
                     var1 = 0;
                  }

                  var39 = var2 - anInt2706;
                  var40 += var36 * var39;
                  var27 += var28 * var39;
                  var31 += var32 * var39;
                  if(var29 < var26) {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3205(rasterPixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                              var4 += var20;
                              var5 += var26;
                              var8 += var38;
                              var2 += width;
                              var40 += var36;
                              var27 += var28;
                              var31 += var32;
                           }
                        }

                        method3205(rasterPixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                        var3 += var29;
                        var5 += var26;
                        var8 += var38;
                        var2 += width;
                        var40 += var36;
                        var27 += var28;
                        var31 += var32;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;
                     var2 = anIntArray2710[var2];

                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           while(true) {
                              --var0;
                              if(var0 < 0) {
                                 return;
                              }

                              method3205(rasterPixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                              var4 += var20;
                              var5 += var26;
                              var8 += var38;
                              var2 += width;
                              var40 += var36;
                              var27 += var28;
                              var31 += var32;
                           }
                        }

                        method3205(rasterPixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var34, var40, var27, var31, var35, var41, var37);
                        var3 += var29;
                        var5 += var26;
                        var8 += var38;
                        var2 += width;
                        var40 += var36;
                        var27 += var28;
                        var31 += var32;
                     }
                  }
               }
            }
         }
      }
   }

}
