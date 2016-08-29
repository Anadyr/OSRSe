package com.jagex;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Sprite extends DrawingArea {

   public int xOffSet;
   public int myWidth;
   public int myHeight;
   public int anInt2725;
   public int anInt2726;
   public int yOffset;
   public int[] myPixels;

   public Sprite(int var1, int var2) {
      this.myPixels = new int[var1 * var2];
      this.myWidth = this.anInt2725 = var1;
      this.myHeight = this.anInt2726 = var2;
      this.yOffset = 0;
      this.xOffSet = 0;
   }

   public Sprite method3253() {
      Sprite var1 = new Sprite(this.myWidth, this.myHeight);
      var1.anInt2725 = this.anInt2725;
      var1.anInt2726 = this.anInt2726;
      var1.xOffSet = this.anInt2725 - this.myWidth - this.xOffSet;
      var1.yOffset = this.yOffset;

      for(int var3 = 0; var3 < this.myHeight; ++var3) {
         for(int var2 = 0; var2 < this.myWidth; ++var2) {
            var1.myPixels[var3 * this.myWidth + var2] = this.myPixels[var3 * this.myWidth + this.myWidth - 1 - var2];
         }
      }

      return var1;
   }

   public Sprite method3254() {
      Sprite var1 = new Sprite(this.anInt2725, this.anInt2726);

      for(int var3 = 0; var3 < this.myHeight; ++var3) {
         for(int var2 = 0; var2 < this.myWidth; ++var2) {
            var1.myPixels[(var3 + this.yOffset) * this.anInt2725 + var2 + this.xOffSet] = this.myPixels[var3 * this.myWidth + var2];
         }
      }

      return var1;
   }

   public void initToDrawer() {
      initToDrawArea(this.myPixels, this.myWidth, this.myHeight);
   }

   static void method3257(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   public void method3258(int var1) {
      if(this.myWidth != this.anInt2725 || this.myHeight != this.anInt2726) {
         int var5 = var1;
         if(var1 > this.xOffSet) {
            var5 = this.xOffSet;
         }

         int var6 = var1;
         if(var1 + this.xOffSet + this.myWidth > this.anInt2725) {
            var6 = this.anInt2725 - this.xOffSet - this.myWidth;
         }

         int var2 = var1;
         if(var1 > this.yOffset) {
            var2 = this.yOffset;
         }

         int var3 = var1;
         if(var1 + this.yOffset + this.myHeight > this.anInt2726) {
            var3 = this.anInt2726 - this.yOffset - this.myHeight;
         }

         int var7 = this.myWidth + var5 + var6;
         int var4 = this.myHeight + var2 + var3;
         int[] var8 = new int[var7 * var4];

         for(int var9 = 0; var9 < this.myHeight; ++var9) {
            for(int var10 = 0; var10 < this.myWidth; ++var10) {
               var8[(var9 + var2) * var7 + var10 + var5] = this.myPixels[var9 * this.myWidth + var10];
            }
         }

         this.myPixels = var8;
         this.myWidth = var7;
         this.myHeight = var4;
         this.xOffSet -= var5;
         this.yOffset -= var2;
      }
   }

   public void method3259() {
      int[] var1 = new int[this.myWidth * this.myHeight];
      int var4 = 0;

      for(int var2 = 0; var2 < this.myHeight; ++var2) {
         for(int var3 = this.myWidth - 1; var3 >= 0; --var3) {
            var1[var4++] = this.myPixels[var3 + var2 * this.myWidth];
         }
      }

      this.myPixels = var1;
      this.xOffSet = this.anInt2725 - this.myWidth - this.xOffSet;
   }

   public void method3260() {
      int[] var1 = new int[this.myWidth * this.myHeight];
      int var4 = 0;

      for(int var2 = this.myHeight - 1; var2 >= 0; --var2) {
         for(int var3 = 0; var3 < this.myWidth; ++var3) {
            var1[var4++] = this.myPixels[var3 + var2 * this.myWidth];
         }
      }

      this.myPixels = var1;
      this.yOffset = this.anInt2726 - this.myHeight - this.yOffset;
   }

   public void method3262(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.myWidth;
         int var15 = this.myHeight;
         int var7 = 0;
         int var9 = 0;
         int var12 = this.anInt2725;
         int var10 = this.anInt2726;
         int var8 = (var12 << 16) / var3;
         int var14 = (var10 << 16) / var4;
         int var13;
         if(this.xOffSet > 0) {
            var13 = ((this.xOffSet << 16) + var8 - 1) / var8;
            var1 += var13;
            var7 += var13 * var8 - (this.xOffSet << 16);
         }

         if(this.yOffset > 0) {
            var13 = ((this.yOffset << 16) + var14 - 1) / var14;
            var2 += var13;
            var9 += var13 * var14 - (this.yOffset << 16);
         }

         if(var6 < var12) {
            var3 = ((var6 << 16) - var7 + var8 - 1) / var8;
         }

         if(var15 < var10) {
            var4 = ((var15 << 16) - var9 + var14 - 1) / var14;
         }

         var13 = var1 + var2 * width;
         int var11 = width - var3;
         if(var2 + var4 > bottomY) {
            var4 -= var2 + var4 - bottomY;
         }

         int var5;
         if(var2 < topY) {
            var5 = topY - var2;
            var4 -= var5;
            var13 += var5 * width;
            var9 += var14 * var5;
         }

         if(var1 + var3 > bottomX) {
            var5 = var1 + var3 - bottomX;
            var3 -= var5;
            var11 += var5;
         }

         if(var1 < topX) {
            var5 = topX - var1;
            var3 -= var5;
            var13 += var5;
            var7 += var8 * var5;
            var11 += var5;
         }

         method3268(rasterPixels, this.myPixels, 0, var7, var9, var13, var11, var3, var4, var8, var14, var6);
      }
   }

   public void method3264(int var1, int var2, int var3, int var4) {
      this.method3278(this.anInt2725 << 3, this.anInt2726 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   public void drawSprite(int i, int j) {
      i += this.xOffSet;
      j += this.yOffset;
      int var3 = i + j * width;
      int var5 = 0;
      int k1 = this.myHeight;
      int l1 = this.myWidth;
      int var8 = width - l1;
      int var9 = 0;
      int var4;
      if(j < topY) {
         var4 = topY - j;
         k1 -= var4;
         j = topY;
         var5 += var4 * l1;
         var3 += var4 * width;
      }

      if(j + k1 > bottomY) {
         k1 -= j + k1 - bottomY;
      }

      if(i < topX) {
         var4 = topX - i;
         l1 -= var4;
         i = topX;
         var5 += var4;
         var3 += var4;
         var9 += var4;
         var8 += var4;
      }
      if(i + l1 > bottomX) {
         var4 = i + l1 - bottomX;
         l1 -= var4;
         var9 += var4;
         var8 += var4;
      }

      if(l1 > 0 && k1 > 0) {
         rasterize(rasterPixels, this.myPixels, 0, var5, var3, l1, k1, var8, var9);
      }
   }

   static void method3266(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method3267() {
      if(this.myWidth != this.anInt2725 || this.myHeight != this.anInt2726) {
         int[] var2 = new int[this.anInt2725 * this.anInt2726];

         for(int var3 = 0; var3 < this.myHeight; ++var3) {
            for(int var1 = 0; var1 < this.myWidth; ++var1) {
               var2[(var3 + this.yOffset) * this.anInt2725 + var1 + this.xOffSet] = this.myPixels[var3 * this.myWidth + var1];
            }
         }

         this.myPixels = var2;
         this.myWidth = this.anInt2725;
         this.myHeight = this.anInt2726;
         this.xOffSet = 0;
         this.yOffset = 0;
      }
   }

   static void method3268(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var13 = (var4 >> 16) * var11;

         for(int var14 = -var7; var14 < 0; ++var14) {
            var2 = var1[(var3 >> 16) + var13];
            if(var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void method3269(int var1, int var2, int var3, int var4) {
      if(var3 == 256) {
         this.drawSprite(var1, var2);
      } else {
         var1 += this.xOffSet;
         var2 += this.yOffset;
         int var7 = var1 + var2 * width;
         int var8 = 0;
         int var5 = this.myHeight;
         int var10 = this.myWidth;
         int var11 = width - var10;
         int var9 = 0;
         int var6;
         if(var2 < topY) {
            var6 = topY - var2;
            var5 -= var6;
            var2 = topY;
            var8 += var6 * var10;
            var7 += var6 * width;
         }

         if(var2 + var5 > bottomY) {
            var5 -= var2 + var5 - bottomY;
         }

         if(var1 < topX) {
            var6 = topX - var1;
            var10 -= var6;
            var1 = topX;
            var8 += var6;
            var7 += var6;
            var9 += var6;
            var11 += var6;
         }

         if(var1 + var10 > bottomX) {
            var6 = var1 + var10 - bottomX;
            var10 -= var6;
            var9 += var6;
            var11 += var6;
         }

         if(var10 > 0 && var5 > 0) {
            method3314(rasterPixels, this.myPixels, 0, var8, var7, var10, var5, var11, var9, var3, var4);
         }
      }
   }

    static void method3314(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        int var11 = 256 - var9;
        int var13 = (var10 & 16711935) * var11 & -16711936;
        int var14 = (var10 & '\uff00') * var11 & 16711680;
        var10 = (var13 | var14) >>> 8;

        for(int var15 = -var6; var15 < 0; ++var15) {
            for(int var12 = -var5; var12 < 0; ++var12) {
                var2 = var1[var3++];
                if(var2 != 0) {
                    var13 = (var2 & 16711935) * var9 & -16711936;
                    var14 = (var2 & '\uff00') * var9 & 16711680;
                    var0[var4++] = ((var13 | var14) >>> 8) + var10;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

   public void method3271(int var1, int var2, int var3) {
      var1 += this.xOffSet;
      var2 += this.yOffset;
      int var6 = var1 + var2 * width;
      int var10 = 0;
      int var7 = this.myHeight;
      int var8 = this.myWidth;
      int var9 = width - var8;
      int var4 = 0;
      int var5;
      if(var2 < topY) {
         var5 = topY - var2;
         var7 -= var5;
         var2 = topY;
         var10 += var5 * var8;
         var6 += var5 * width;
      }

      if(var2 + var7 > bottomY) {
         var7 -= var2 + var7 - bottomY;
      }

      if(var1 < topX) {
         var5 = topX - var1;
         var8 -= var5;
         var1 = topX;
         var10 += var5;
         var6 += var5;
         var4 += var5;
         var9 += var5;
      }

      if(var1 + var8 > bottomX) {
         var5 = var1 + var8 - bottomX;
         var8 -= var5;
         var4 += var5;
         var9 += var5;
      }

      if(var8 > 0 && var7 > 0) {
         method3266(rasterPixels, this.myPixels, 0, var10, var6, var8, var7, var9, var4, var3);
      }
   }

   public void method3272(int var1) {
      int[] var2 = new int[this.myWidth * this.myHeight];
      int var3 = 0;

      for(int var4 = 0; var4 < this.myHeight; ++var4) {
         for(int var6 = 0; var6 < this.myWidth; ++var6) {
            int var5 = this.myPixels[var3];
            if(var5 == 0) {
               if(var6 > 0 && this.myPixels[var3 - 1] != 0) {
                  var5 = var1;
               } else if(var4 > 0 && this.myPixels[var3 - this.myWidth] != 0) {
                  var5 = var1;
               } else if(var6 < this.myWidth - 1 && this.myPixels[var3 + 1] != 0) {
                  var5 = var1;
               } else if(var4 < this.myHeight - 1 && this.myPixels[var3 + this.myWidth] != 0) {
                  var5 = var1;
               }
            }

            var2[var3++] = var5;
         }
      }

      this.myPixels = var2;
   }

   public void method3273(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var10 = this.myWidth;
         int var16 = this.myHeight;
         int var6 = 0;
         int var11 = 0;
         int var14 = this.anInt2725;
         int var15 = this.anInt2726;
         int var8 = (var14 << 16) / var3;
         int var13 = (var15 << 16) / var4;
         int var7;
         if(this.xOffSet > 0) {
            var7 = ((this.xOffSet << 16) + var8 - 1) / var8;
            var1 += var7;
            var6 += var7 * var8 - (this.xOffSet << 16);
         }

         if(this.yOffset > 0) {
            var7 = ((this.yOffset << 16) + var13 - 1) / var13;
            var2 += var7;
            var11 += var7 * var13 - (this.yOffset << 16);
         }

         if(var10 < var14) {
            var3 = ((var10 << 16) - var6 + var8 - 1) / var8;
         }

         if(var16 < var15) {
            var4 = ((var16 << 16) - var11 + var13 - 1) / var13;
         }

         var7 = var1 + var2 * width;
         int var12 = width - var3;
         if(var2 + var4 > bottomY) {
            var4 -= var2 + var4 - bottomY;
         }

         int var9;
         if(var2 < topY) {
            var9 = topY - var2;
            var4 -= var9;
            var7 += var9 * width;
            var11 += var13 * var9;
         }

         if(var1 + var3 > bottomX) {
            var9 = var1 + var3 - bottomX;
            var3 -= var9;
            var12 += var9;
         }

         if(var1 < topX) {
            var9 = topX - var1;
            var3 -= var9;
            var7 += var9;
            var6 += var8 * var9;
            var12 += var9;
         }

         method3327(rasterPixels, this.myPixels, 0, var6, var11, var7, var12, var3, var4, var8, var13, var10, var5);
      }
   }

   public void method3275(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var16 = var2 < 0?-var2:0;
      int var11 = var2 + this.myHeight > var6?var6 - var2:this.myHeight;
      int var9 = var1 < 0?-var1:0;
      int var10000;
      if(var1 + this.myWidth <= var5) {
         var10000 = this.myWidth;
      } else {
         var10000 = var5 - var1;
      }

      int var14 = var3 + var1 + var9 + (var4 + var2 + var16) * width;
      int var18 = var2 + var16;

      for(int var17 = var16; var17 < var11; ++var17) {
         int var12 = var7[var18];
         int var19 = var8[var18++];
         int var20 = var14;
         int var10;
         if(var1 < var12) {
            var10 = var12 - var1;
            var20 = var14 + (var10 - var9);
         } else {
            var10 = var9;
         }

         int var13;
         if(var1 + this.myWidth <= var12 + var19) {
            var13 = this.myWidth;
         } else {
            var13 = var12 + var19 - var1;
         }

         for(int var15 = var10; var15 < var13; ++var15) {
            int var21 = this.myPixels[var15 + var17 * this.myWidth];
            if(var21 != 0) {
               rasterPixels[var20++] = var21;
            } else {
               ++var20;
            }
         }

         var14 += width;
      }

   }

   public Sprite(byte[] var1, Component var2) {
      try {
         Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var4 = new MediaTracker(var2);
         var4.addImage(var3, 0);
         var4.waitForAll();
         this.myWidth = var3.getWidth(var2);
         this.myHeight = var3.getHeight(var2);
         this.anInt2725 = this.myWidth;
         this.anInt2726 = this.myHeight;
         this.xOffSet = 0;
         this.yOffset = 0;
         this.myPixels = new int[this.myWidth * this.myHeight];
         PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.myWidth, this.myHeight, this.myPixels, 0, this.myWidth);
         var5.grabPixels();
      } catch (InterruptedException var6) {
         ;
      }

   }

   public void method3276(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * width;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.myPixels[(var18 >> 16) + (var19 >> 16) * this.myWidth];
               if(var20 != 0) {
                  rasterPixels[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += width;
         }
      } catch (Exception var21) {
         ;
      }

   }

   void method3278(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 != 0) {
         var1 -= this.xOffSet << 4;
         var2 -= this.yOffset << 4;
         double var12 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var14 = (int)Math.floor(Math.sin(var12) * (double)var6 + 0.5D);
         int var15 = (int)Math.floor(Math.cos(var12) * (double)var6 + 0.5D);
         int var16 = -var1 * var15 + -var2 * var14;
         int var17 = -(-var1) * var14 + -var2 * var15;
         int var18 = ((this.myWidth << 4) - var1) * var15 + -var2 * var14;
         int var19 = -((this.myWidth << 4) - var1) * var14 + -var2 * var15;
         int var20 = -var1 * var15 + ((this.myHeight << 4) - var2) * var14;
         int var33 = -(-var1) * var14 + ((this.myHeight << 4) - var2) * var15;
         int var29 = ((this.myWidth << 4) - var1) * var15 + ((this.myHeight << 4) - var2) * var14;
         int var23 = -((this.myWidth << 4) - var1) * var14 + ((this.myHeight << 4) - var2) * var15;
         int var28;
         int var30;
         if(var16 < var18) {
            var28 = var16;
            var30 = var18;
         } else {
            var28 = var18;
            var30 = var16;
         }

         if(var20 < var28) {
            var28 = var20;
         }

         if(var29 < var28) {
            var28 = var29;
         }

         if(var20 > var30) {
            var30 = var20;
         }

         if(var29 > var30) {
            var30 = var29;
         }

         int var7;
         int var24;
         if(var17 < var19) {
            var24 = var17;
            var7 = var19;
         } else {
            var24 = var19;
            var7 = var17;
         }

         if(var33 < var24) {
            var24 = var33;
         }

         if(var23 < var24) {
            var24 = var23;
         }

         if(var33 > var7) {
            var7 = var33;
         }

         if(var23 > var7) {
            var7 = var23;
         }

         var28 >>= 12;
         var30 = var30 + 4095 >> 12;
         var24 >>= 12;
         var7 = var7 + 4095 >> 12;
         var28 += var3;
         var30 += var3;
         var24 += var4;
         var7 += var4;
         var28 >>= 4;
         var30 = var30 + 15 >> 4;
         var24 >>= 4;
         var7 = var7 + 15 >> 4;
         if(var28 < topX) {
            var28 = topX;
         }

         if(var30 > bottomX) {
            var30 = bottomX;
         }

         if(var24 < topY) {
            var24 = topY;
         }

         if(var7 > bottomY) {
            var7 = bottomY;
         }

         var30 = var28 - var30;
         if(var30 < 0) {
            var7 = var24 - var7;
            if(var7 < 0) {
               int var32 = var24 * width + var28;
               double var35 = 1.6777216E7D / (double)var6;
               int var10 = (int)Math.floor(Math.sin(var12) * var35 + 0.5D);
               int var25 = (int)Math.floor(Math.cos(var12) * var35 + 0.5D);
               int var9 = (var28 << 4) + 8 - var3;
               int var38 = (var24 << 4) + 8 - var4;
               int var37 = (var1 << 8) - (var38 * var10 >> 4);
               int var8 = (var2 << 8) + (var38 * var25 >> 4);
               int var11;
               int var21;
               int var22;
               int var26;
               int var27;
               int var31;
               int var34;
               if(var25 == 0) {
                  if(var10 == 0) {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37;
                        var11 = var8;
                        var31 = var30;
                        if(var37 >= 0 && var8 >= 0 && var37 - (this.myWidth << 12) < 0 && var8 - (this.myHeight << 12) < 0) {
                           for(; var31 < 0; ++var31) {
                              var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                              if(var21 != 0) {
                                 rasterPixels[var22++] = var21;
                              } else {
                                 ++var22;
                              }
                           }
                        }

                        ++var34;
                     }
                  } else if(var10 < 0) {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37;
                        var11 = var8 + (var9 * var10 >> 4);
                        var31 = var30;
                        if(var37 >= 0 && var37 - (this.myWidth << 12) < 0) {
                           if((var27 = var11 - (this.myHeight << 12)) >= 0) {
                              var27 = (var10 - var27) / var10;
                              var31 = var30 + var27;
                              var11 += var10 * var27;
                              var22 = var32 + var27;
                           }

                           if((var27 = (var11 - var10) / var10) > var31) {
                              var31 = var27;
                           }

                           while(var31 < 0) {
                              var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                              if(var21 != 0) {
                                 rasterPixels[var22++] = var21;
                              } else {
                                 ++var22;
                              }

                              var11 += var10;
                              ++var31;
                           }
                        }

                        ++var34;
                        var37 -= var10;
                     }
                  } else {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37;
                        var11 = var8 + (var9 * var10 >> 4);
                        var31 = var30;
                        if(var37 >= 0 && var37 - (this.myWidth << 12) < 0) {
                           if(var11 < 0) {
                              var27 = (var10 - 1 - var11) / var10;
                              var31 = var30 + var27;
                              var11 += var10 * var27;
                              var22 = var32 + var27;
                           }

                           if((var27 = (1 + var11 - (this.myHeight << 12) - var10) / var10) > var31) {
                              var31 = var27;
                           }

                           while(var31 < 0) {
                              var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                              if(var21 != 0) {
                                 rasterPixels[var22++] = var21;
                              } else {
                                 ++var22;
                              }

                              var11 += var10;
                              ++var31;
                           }
                        }

                        ++var34;
                        var37 -= var10;
                     }
                  }
               } else if(var25 < 0) {
                  if(var10 == 0) {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37 + (var9 * var25 >> 4);
                        var11 = var8;
                        var31 = var30;
                        if(var8 >= 0 && var8 - (this.myHeight << 12) < 0) {
                           if((var27 = var26 - (this.myWidth << 12)) >= 0) {
                              var27 = (var25 - var27) / var25;
                              var31 = var30 + var27;
                              var26 += var25 * var27;
                              var22 = var32 + var27;
                           }

                           if((var27 = (var26 - var25) / var25) > var31) {
                              var31 = var27;
                           }

                           while(var31 < 0) {
                              var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                              if(var21 != 0) {
                                 rasterPixels[var22++] = var21;
                              } else {
                                 ++var22;
                              }

                              var26 += var25;
                              ++var31;
                           }
                        }

                        ++var34;
                        var8 += var25;
                     }
                  } else if(var10 < 0) {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37 + (var9 * var25 >> 4);
                        var11 = var8 + (var9 * var10 >> 4);
                        var31 = var30;
                        if((var27 = var26 - (this.myWidth << 12)) >= 0) {
                           var27 = (var25 - var27) / var25;
                           var31 = var30 + var27;
                           var26 += var25 * var27;
                           var11 += var10 * var27;
                           var22 = var32 + var27;
                        }

                        if((var27 = (var26 - var25) / var25) > var31) {
                           var31 = var27;
                        }

                        if((var27 = var11 - (this.myHeight << 12)) >= 0) {
                           var27 = (var10 - var27) / var10;
                           var31 += var27;
                           var26 += var25 * var27;
                           var11 += var10 * var27;
                           var22 += var27;
                        }

                        if((var27 = (var11 - var10) / var10) > var31) {
                           var31 = var27;
                        }

                        while(var31 < 0) {
                           var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                           if(var21 != 0) {
                              rasterPixels[var22++] = var21;
                           } else {
                              ++var22;
                           }

                           var26 += var25;
                           var11 += var10;
                           ++var31;
                        }

                        ++var34;
                        var37 -= var10;
                        var8 += var25;
                     }
                  } else {
                     for(var34 = var7; var34 < 0; var32 += width) {
                        var22 = var32;
                        var26 = var37 + (var9 * var25 >> 4);
                        var11 = var8 + (var9 * var10 >> 4);
                        var31 = var30;
                        if((var27 = var26 - (this.myWidth << 12)) >= 0) {
                           var27 = (var25 - var27) / var25;
                           var31 = var30 + var27;
                           var26 += var25 * var27;
                           var11 += var10 * var27;
                           var22 = var32 + var27;
                        }

                        if((var27 = (var26 - var25) / var25) > var31) {
                           var31 = var27;
                        }

                        if(var11 < 0) {
                           var27 = (var10 - 1 - var11) / var10;
                           var31 += var27;
                           var26 += var25 * var27;
                           var11 += var10 * var27;
                           var22 += var27;
                        }

                        if((var27 = (1 + var11 - (this.myHeight << 12) - var10) / var10) > var31) {
                           var31 = var27;
                        }

                        while(var31 < 0) {
                           var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                           if(var21 != 0) {
                              rasterPixels[var22++] = var21;
                           } else {
                              ++var22;
                           }

                           var26 += var25;
                           var11 += var10;
                           ++var31;
                        }

                        ++var34;
                        var37 -= var10;
                        var8 += var25;
                     }
                  }
               } else if(var10 == 0) {
                  for(var34 = var7; var34 < 0; var32 += width) {
                     var22 = var32;
                     var26 = var37 + (var9 * var25 >> 4);
                     var11 = var8;
                     var31 = var30;
                     if(var8 >= 0 && var8 - (this.myHeight << 12) < 0) {
                        if(var26 < 0) {
                           var27 = (var25 - 1 - var26) / var25;
                           var31 = var30 + var27;
                           var26 += var25 * var27;
                           var22 = var32 + var27;
                        }

                        if((var27 = (1 + var26 - (this.myWidth << 12) - var25) / var25) > var31) {
                           var31 = var27;
                        }

                        while(var31 < 0) {
                           var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                           if(var21 != 0) {
                              rasterPixels[var22++] = var21;
                           } else {
                              ++var22;
                           }

                           var26 += var25;
                           ++var31;
                        }
                     }

                     ++var34;
                     var8 += var25;
                  }
               } else if(var10 < 0) {
                  for(var34 = var7; var34 < 0; var32 += width) {
                     var22 = var32;
                     var26 = var37 + (var9 * var25 >> 4);
                     var11 = var8 + (var9 * var10 >> 4);
                     var31 = var30;
                     if(var26 < 0) {
                        var27 = (var25 - 1 - var26) / var25;
                        var31 = var30 + var27;
                        var26 += var25 * var27;
                        var11 += var10 * var27;
                        var22 = var32 + var27;
                     }

                     if((var27 = (1 + var26 - (this.myWidth << 12) - var25) / var25) > var31) {
                        var31 = var27;
                     }

                     if((var27 = var11 - (this.myHeight << 12)) >= 0) {
                        var27 = (var10 - var27) / var10;
                        var31 += var27;
                        var26 += var25 * var27;
                        var11 += var10 * var27;
                        var22 += var27;
                     }

                     if((var27 = (var11 - var10) / var10) > var31) {
                        var31 = var27;
                     }

                     while(var31 < 0) {
                        var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                        if(var21 != 0) {
                           rasterPixels[var22++] = var21;
                        } else {
                           ++var22;
                        }

                        var26 += var25;
                        var11 += var10;
                        ++var31;
                     }

                     ++var34;
                     var37 -= var10;
                     var8 += var25;
                  }
               } else {
                  for(var34 = var7; var34 < 0; var32 += width) {
                     var22 = var32;
                     var26 = var37 + (var9 * var25 >> 4);
                     var11 = var8 + (var9 * var10 >> 4);
                     var31 = var30;
                     if(var26 < 0) {
                        var27 = (var25 - 1 - var26) / var25;
                        var31 = var30 + var27;
                        var26 += var25 * var27;
                        var11 += var10 * var27;
                        var22 = var32 + var27;
                     }

                     if((var27 = (1 + var26 - (this.myWidth << 12) - var25) / var25) > var31) {
                        var31 = var27;
                     }

                     if(var11 < 0) {
                        var27 = (var10 - 1 - var11) / var10;
                        var31 += var27;
                        var26 += var25 * var27;
                        var11 += var10 * var27;
                        var22 += var27;
                     }

                     if((var27 = (1 + var11 - (this.myHeight << 12) - var10) / var10) > var31) {
                        var31 = var27;
                     }

                     while(var31 < 0) {
                        var21 = this.myPixels[(var11 >> 12) * this.myWidth + (var26 >> 12)];
                        if(var21 != 0) {
                           rasterPixels[var22++] = var21;
                        } else {
                           ++var22;
                        }

                        var26 += var25;
                        var11 += var10;
                        ++var31;
                     }

                     ++var34;
                     var37 -= var10;
                     var8 += var25;
                  }
               }

            }
         }
      }
   }

   public void method3283(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * width;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               rasterPixels[var19++] = this.myPixels[(var20 >> 16) + (var21 >> 16) * this.myWidth];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += width;
         }
      } catch (Exception var22) {
         ;
      }

   }

   public void method3286(int var1, int var2) {
      var1 += this.xOffSet;
      var2 += this.yOffset;
      int var5 = var1 + var2 * width;
      int var6 = 0;
      int var7 = this.myHeight;
      int var8 = this.myWidth;
      int var9 = width - var8;
      int var3 = 0;
      int var4;
      if(var2 < topY) {
         var4 = topY - var2;
         var7 -= var4;
         var2 = topY;
         var6 += var4 * var8;
         var5 += var4 * width;
      }

      if(var2 + var7 > bottomY) {
         var7 -= var2 + var7 - bottomY;
      }

      if(var1 < topX) {
         var4 = topX - var1;
         var8 -= var4;
         var1 = topX;
         var6 += var4;
         var5 += var4;
         var3 += var4;
         var9 += var4;
      }

      if(var1 + var8 > bottomX) {
         var4 = var1 + var8 - bottomX;
         var8 -= var4;
         var3 += var4;
         var9 += var4;
      }

      if(var8 > 0 && var7 > 0) {
         method3257(rasterPixels, this.myPixels, var6, var5, var8, var7, var9, var3);
      }
   }

   static void rasterize(int[] to, int[] from, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var11 = -var6; var11 < 0; ++var11) {
         int var10;
         for(var10 = var9; var10 < 0; ++var10) {
            var2 = from[var3++];
            if(var2 != 0) {
               to[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = from[var3++];
            if(var2 != 0) {
               to[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = from[var3++];
            if(var2 != 0) {
               to[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = from[var3++];
            if(var2 != 0) {
               to[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            var2 = from[var3++];
            if(var2 != 0) {
               to[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public Sprite() {}

   public void method3309(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.myPixels.length; ++var4) {
         int var5 = this.myPixels[var4];
         if(var5 != 0) {
            int var6 = var5 >> 16 & 255;
            var6 += var1;
            if(var6 < 1) {
               var6 = 1;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var8 = var5 >> 8 & 255;
            var8 += var2;
            if(var8 < 1) {
               var8 = 1;
            } else if(var8 > 255) {
               var8 = 255;
            }

            int var7 = var5 & 255;
            var7 += var3;
            if(var7 < 1) {
               var7 = 1;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.myPixels[var4] = (var6 << 16) + (var8 << 8) + var7;
         }
      }

   }


   public void method3319(int var1) {
      for(int var2 = this.myHeight - 1; var2 > 0; --var2) {
         int var3 = var2 * this.myWidth;

         for(int var4 = this.myWidth - 1; var4 > 0; --var4) {
            if(this.myPixels[var4 + var3] == 0 && this.myPixels[var4 + var3 - 1 - this.myWidth] != 0) {
               this.myPixels[var4 + var3] = var1;
            }
         }
      }

   }


   static void method3327(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var18 = var3;

      for(int var14 = -var8; var14 < 0; ++var14) {
         int var15 = (var4 >> 16) * var11;

         for(int var16 = -var7; var16 < 0; ++var16) {
            var2 = var1[(var3 >> 16) + var15];
            if(var2 != 0) {
               int var17 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var17 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var17 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var18;
         var5 += var6;
      }

   }

}
