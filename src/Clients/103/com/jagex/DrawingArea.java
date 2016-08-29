package com.jagex;

public class DrawingArea extends NodeContainer {

   public static int anInt2492;
   public static int[] rasterPixels;
   protected static int topX = 0;
   public static int topY = 0;
   public static int bottomY = 0;
   public static int width;
   protected static int bottomX = 0;


   public static void initToDrawArea(int[] var0, int var1, int var2) {
      rasterPixels = var0;
      width = var1;
      anInt2492 = var2;
      method2901(0, 0, var1, var2);
   }

   public static void method2888() {
      topX = 0;
      topY = 0;
      bottomX = width;
      bottomY = anInt2492;
   }

   public static void method2890(int var0, int var1, int var2, int var3) {
      if(topX < var0) {
         topX = var0;
      }

      if(topY < var1) {
         topY = var1;
      }

      if(bottomX > var2) {
         bottomX = var2;
      }

      if(bottomY > var3) {
         bottomY = var3;
      }

   }

   public static void method2891(int[] var0) {
      var0[0] = topX;
      var0[1] = topY;
      var0[2] = bottomX;
      var0[3] = bottomY;
   }

   public static void method2892(int[] var0) {
      topX = var0[0];
      topY = var0[1];
      bottomX = var0[2];
      bottomY = var0[3];
   }

   public static void method2893(int var0, int var1, int var2, int var3) {
      if(var0 >= topX && var0 < bottomX) {
         if(var1 < topY) {
            var2 -= topY - var1;
            var1 = topY;
         }

         if(var1 + var2 > bottomY) {
            var2 = bottomY - var1;
         }

         int var5 = var0 + var1 * width;

         for(int var4 = 0; var4 < var2; ++var4) {
            rasterPixels[var5 + var4 * width] = var3;
         }

      }
   }

   public static void method2894(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var9 = 256 - var5;
      int var10 = width - var2;
      int var6 = var0 + var1 * width;

      for(int var11 = 0; var11 < var3; ++var11) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            int var7 = rasterPixels[var6];
            var7 = ((var7 & 16711935) * var9 >> 8 & 16711935) + ((var7 & '\uff00') * var9 >> 8 & '\uff00');
            rasterPixels[var6++] = var4 + var7;
         }

         var6 += var10;
      }

   }

   public static void method2896(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var10 = 65536 / var3;
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var6 += (topY - var1) * var10;
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      int var14 = width - var2;
      int var7 = var0 + var1 * width;

      for(int var9 = -var3; var9 < 0; ++var9) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var8 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

         for(int var13 = -var2; var13 < 0; ++var13) {
            rasterPixels[var7++] = var8;
         }

         var7 += var14;
         var6 += var10;
      }

   }

   public static void method2897(int var0, int var1, int var2, int var3, int var4) {
      method2942(var0, var1, var2, var4);
      method2942(var0, var1 + var3 - 1, var2, var4);
      method2893(var0, var1, var3, var4);
      method2893(var0 + var2 - 1, var1, var3, var4);
   }

   static void method2900(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= topY && var1 < bottomY) {
         if(var0 < topX) {
            var2 -= topX - var0;
            var0 = topX;
         }

         if(var0 + var2 > bottomX) {
            var2 = bottomX - var0;
         }

         int var6 = 256 - var4;
         int var8 = (var3 >> 16 & 255) * var4;
         int var10 = (var3 >> 8 & 255) * var4;
         int var11 = (var3 & 255) * var4;
         int var5 = var0 + var1 * width;

         for(int var14 = 0; var14 < var2; ++var14) {
            int var9 = (rasterPixels[var5] >> 16 & 255) * var6;
            int var7 = (rasterPixels[var5] >> 8 & 255) * var6;
            int var12 = (rasterPixels[var5] & 255) * var6;
            int var13 = (var8 + var9 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var12 >> 8);
            rasterPixels[var5++] = var13;
         }

      }
   }

   public static void method2901(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > width) {
         var2 = width;
      }

      if(var3 > anInt2492) {
         var3 = anInt2492;
      }

      topX = var0;
      topY = var1;
      bottomX = var2;
      bottomY = var3;
   }

   static void method2902(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= topX && var0 < bottomX) {
         if(var1 < topY) {
            var2 -= topY - var1;
            var1 = topY;
         }

         if(var1 + var2 > bottomY) {
            var2 = bottomY - var1;
         }

         int var5 = 256 - var4;
         int var14 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var6 = var0 + var1 * width;

         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = (rasterPixels[var6] >> 16 & 255) * var5;
            int var11 = (rasterPixels[var6] >> 8 & 255) * var5;
            int var12 = (rasterPixels[var6] & 255) * var5;
            int var13 = (var14 + var10 >> 8 << 16) + (var7 + var11 >> 8 << 8) + (var8 + var12 >> 8);
            rasterPixels[var6] = var13;
            var6 += width;
         }

      }
   }

   public static void method2903(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method2942(var0, var1, var2 + 1, var4);
         } else {
            method2942(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method2893(var0, var1, var3 + 1, var4);
         } else {
            method2893(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var6 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < topX) {
               var1 += var6 * (topX - var0);
               var0 = topX;
            }

            if(var2 >= bottomX) {
               var2 = bottomX - 1;
            }

            while(var0 <= var2) {
               var5 = var1 >> 16;
               if(var5 >= topY && var5 < bottomY) {
                  rasterPixels[var0 + var5 * width] = var4;
               }

               var1 += var6;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var6 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < topY) {
               var0 += var6 * (topY - var1);
               var1 = topY;
            }

            if(var3 >= bottomY) {
               var3 = bottomY - 1;
            }

            while(var1 <= var3) {
               var5 = var0 >> 16;
               if(var5 >= topX && var5 < bottomX) {
                  rasterPixels[var5 + var1 * width] = var4;
               }

               var0 += var6;
               ++var1;
            }
         }

      }
   }

   public static void method2904(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * width;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            rasterPixels[var6++] = var2;
         }

         var5 += width;
      }

   }

   public static void method2927(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < topX) {
         var2 -= topX - var0;
         var0 = topX;
      }

      if(var1 < topY) {
         var3 -= topY - var1;
         var1 = topY;
      }

      if(var0 + var2 > bottomX) {
         var2 = bottomX - var0;
      }

      if(var1 + var3 > bottomY) {
         var3 = bottomY - var1;
      }

      int var8 = width - var2;
      int var6 = var0 + var1 * width;

      for(int var5 = -var3; var5 < 0; ++var5) {
         for(int var7 = -var2; var7 < 0; ++var7) {
            rasterPixels[var6++] = var4;
         }

         var6 += var8;
      }

   }

   public static void method2938(int var0, int var1, int var2, int var3, int var4, int var5) {
      method2900(var0, var1, var2, var4, var5);
      method2900(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method2902(var0, var1 + 1, var3 - 2, var4, var5);
         method2902(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void method2941() {
      int var0 = 0;

      int var1;
      for(var1 = width * anInt2492 - 7; var0 < var1; rasterPixels[var0++] = 0) {
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
         rasterPixels[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; rasterPixels[var0++] = 0) {
         ;
      }

   }

   public static void method2942(int var0, int var1, int var2, int var3) {
      if(var1 >= topY && var1 < bottomY) {
         if(var0 < topX) {
            var2 -= topX - var0;
            var0 = topX;
         }

         if(var0 + var2 > bottomX) {
            var2 = bottomX - var0;
         }

         int var4 = var0 + var1 * width;

         for(int var5 = 0; var5 < var2; ++var5) {
            rasterPixels[var4 + var5] = var3;
         }

      }
   }

}
