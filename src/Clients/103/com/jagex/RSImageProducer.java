package com.jagex;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class RSImageProducer extends AbstractRSDrawing implements ImageProducer, ImageObserver {

   ImageConsumer anImageConsumer1671;
   ColorModel aColorModel1680;

   public final void method337(int var1, int var2, Component var3, byte var4) {
      this.anInt264 = 409111727 * var1;
      this.anInt266 = var2 * 1577837381;
      this.anIntArray265 = new int[1 + var1 * var2];
      this.aColorModel1680 = new DirectColorModel(32, 16711680, 65280, 255);
      this.finalImage = var3.createImage(this);
      this.method1848((byte)17);
      var3.prepareImage(this.finalImage, this);
      this.method1848((byte)-95);
      var3.prepareImage(this.finalImage, this);
      this.method1848((byte)122);
      var3.prepareImage(this.finalImage, this);
      this.method326((byte)7);
   }

   public final void method333(Graphics var1, int var2, int var3, int var4) {
      this.method1848((byte)56);
      var1.drawImage(this.finalImage, var2, var3, this);
   }

   public final void method325(Graphics var1, int var2, int var3, int var4, int var5, short var6) {
      this.method1849(var2, var3, var4, var5, -1362173208);
      Shape var7 = var1.getClip();
      var1.clipRect(var2, var3, var4, var5);
      var1.drawImage(this.finalImage, 0, 0, this);
      var1.setClip(var7);
   }

   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public synchronized boolean isConsumer(ImageConsumer var1) {
      return this.anImageConsumer1671 == var1;
   }

   public synchronized void removeConsumer(ImageConsumer var1) {
      if(var1 == this.anImageConsumer1671) {
         this.anImageConsumer1671 = null;
      }
   }

   public void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   public void requestTopDownLeftRightResend(ImageConsumer var1) {}

   public synchronized void addConsumer(ImageConsumer var1) {
        this.anImageConsumer1671 = var1;
        var1.setDimensions(1154763343 * this.anInt264, -1725941875 * this.anInt266);
        var1.setProperties((Hashtable)null);
        var1.setColorModel(this.aColorModel1680);
        var1.setHints(14);
    }

   synchronized void method1848(byte var1) {
      if(this.anImageConsumer1671 != null) {
         this.anImageConsumer1671.setPixels(0, 0, 1154763343 * this.anInt264, -1725941875 * this.anInt266, this.aColorModel1680, this.anIntArray265, 0, this.anInt264 * 1154763343);
         this.anImageConsumer1671.imageComplete(2);
      }
   }

   synchronized void method1849(int var1, int var2, int var3, int var4, int var5) {
      if(this.anImageConsumer1671 != null) {
         this.anImageConsumer1671.setPixels(var1, var2, var3, var4, this.aColorModel1680, this.anIntArray265, this.anInt264 * 1154763343 * var2 + var1, 1154763343 * this.anInt264);
         this.anImageConsumer1671.imageComplete(2);
      }
   }

    static Class116_Sub23_Sub19_Sub4_Sub1 aClass116_Sub23_Sub19_Sub4_Sub1_1672;
    static SignlinkNode aClass72_1675;

    static Sprite[] method1850(RSIndex var0, int var1, int var2, int var3) {
        if(!Class41.method687(var0, var1, var2, 1244068136)) {
            return null;
        } else {
            Sprite[] var8 = new Sprite[Class8.anInt130 * 817614505];

            for(int var7 = 0; var7 < 817614505 * Class8.anInt130; ++var7) {
                Sprite var6 = var8[var7] = new Sprite();
                var6.anInt2725 = -749860951 * Class8.anInt122;
                var6.anInt2726 = Class8.anInt132 * -1945497809;
                var6.xOffSet = Class8.anIntArray124[var7];
                var6.yOffset = Class116_Sub23_Sub15.anIntArray2444[var7];
                var6.myWidth = Class8.anIntArray125[var7];
                var6.myHeight = Class8.anIntArray126[var7];
                int var5 = var6.myHeight * var6.myWidth;
                byte[] var9 = Mob.aByteArrayArray2877[var7];
                var6.myPixels = new int[var5];

                for(int var4 = 0; var4 < var5; ++var4) {
                    var6.myPixels[var4] = Class97.anIntArray1372[var9[var4] & 255];
                }
            }

            Class76.method1080((byte)108);
            return var8;
        }
    }

    public static Class116_Sub23_Sub2 method1871(int var0, byte var1) {
      Class116_Sub23_Sub2 var2 = (Class116_Sub23_Sub2)Class116_Sub23_Sub2.aClass123_2177.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub2.aRSIndex_2187.getFiles(3, var0, 689534874);
         var2 = new Class116_Sub23_Sub2();
         if(null != var3) {
            var2.method2375(new Packet(var3), 2124429388);
         }

         Class116_Sub23_Sub2.aClass123_2177.method1633(var2, (long)var0);
         return var2;
      }
   }

   static final boolean method1872(int var0, int var1, int var2, Class59 var3, Class58 var4, byte var5) {
      int var6 = var0;
      int var12 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      Class69.anIntArrayArray837[var7][var8] = 99;
      Class69.anIntArrayArray841[var7][var8] = 0;
      byte var11 = 0;
      int var14 = 0;
      Class69.anIntArray838[var11] = var0;
      int var21 = var11 + 1;
      Class69.anIntArray842[var11] = var1;
      int[][] var15 = var4.anIntArrayArray764;

      label256:
      while(var21 != var14) {
         var6 = Class69.anIntArray838[var14];
         var12 = Class69.anIntArray842[var14];
         var14 = var14 + 1 & 4095;
         int var19 = var6 - var9;
         int var20 = var12 - var10;
         int var16 = var6 - 1676632637 * var4.anInt765;
         int var17 = var12 - var4.anInt766 * 291084413;
         if(var3.method891(var2, var6, var12, var4, -2034765952)) {
            Class69.anInt839 = -1685050181 * var6;
            Class59_Sub1.anInt1833 = -1194986937 * var12;
            return true;
         }

         int var18 = Class69.anIntArrayArray841[var19][var20] + 1;
         int var13;
         if(var19 > 0 && Class69.anIntArrayArray837[var19 - 1][var20] == 0 && 0 == (var15[var16 - 1][var17] & 19136782) && (var15[var16 - 1][var17 + var2 - 1] & 19136824) == 0) {
            var13 = 1;

            while(true) {
               if(var13 >= var2 - 1) {
                  Class69.anIntArray838[var21] = var6 - 1;
                  Class69.anIntArray842[var21] = var12;
                  var21 = 1 + var21 & 4095;
                  Class69.anIntArrayArray837[var19 - 1][var20] = 2;
                  Class69.anIntArrayArray841[var19 - 1][var20] = var18;
                  break;
               }

               if((var15[var16 - 1][var17 + var13] & 19136830) != 0) {
                  break;
               }

               ++var13;
            }
         }

         if(var19 < 128 - var2 && 0 == Class69.anIntArrayArray837[1 + var19][var20] && 0 == (var15[var2 + var16][var17] & 19136899) && (var15[var16 + var2][var17 + var2 - 1] & 19136992) == 0) {
            var13 = 1;

            while(true) {
               if(var13 >= var2 - 1) {
                  Class69.anIntArray838[var21] = 1 + var6;
                  Class69.anIntArray842[var21] = var12;
                  var21 = 1 + var21 & 4095;
                  Class69.anIntArrayArray837[var19 + 1][var20] = 8;
                  Class69.anIntArrayArray841[var19 + 1][var20] = var18;
                  break;
               }

               if(0 != (var15[var16 + var2][var13 + var17] & 19136995)) {
                  break;
               }

               ++var13;
            }
         }

         if(var20 > 0 && Class69.anIntArrayArray837[var19][var20 - 1] == 0 && (var15[var16][var17 - 1] & 19136782) == 0 && 0 == (var15[var16 + var2 - 1][var17 - 1] & 19136899)) {
            var13 = 1;

            while(true) {
               if(var13 >= var2 - 1) {
                  Class69.anIntArray838[var21] = var6;
                  Class69.anIntArray842[var21] = var12 - 1;
                  var21 = 1 + var21 & 4095;
                  Class69.anIntArrayArray837[var19][var20 - 1] = 1;
                  Class69.anIntArrayArray841[var19][var20 - 1] = var18;
                  break;
               }

               if((var15[var16 + var13][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var13;
            }
         }

         if(var20 < 128 - var2 && Class69.anIntArrayArray837[var19][var20 + 1] == 0 && 0 == (var15[var16][var2 + var17] & 19136824) && 0 == (var15[var16 + var2 - 1][var17 + var2] & 19136992)) {
            var13 = 1;

            while(true) {
               if(var13 >= var2 - 1) {
                  Class69.anIntArray838[var21] = var6;
                  Class69.anIntArray842[var21] = var12 + 1;
                  var21 = 1 + var21 & 4095;
                  Class69.anIntArrayArray837[var19][1 + var20] = 4;
                  Class69.anIntArrayArray841[var19][1 + var20] = var18;
                  break;
               }

               if(0 != (var15[var16 + var13][var17 + var2] & 19137016)) {
                  break;
               }

               ++var13;
            }
         }

         if(var19 > 0 && var20 > 0 && Class69.anIntArrayArray837[var19 - 1][var20 - 1] == 0 && (var15[var16 - 1][var17 - 1] & 19136782) == 0) {
            var13 = 1;

            while(true) {
               if(var13 >= var2) {
                  Class69.anIntArray838[var21] = var6 - 1;
                  Class69.anIntArray842[var21] = var12 - 1;
                  var21 = var21 + 1 & 4095;
                  Class69.anIntArrayArray837[var19 - 1][var20 - 1] = 3;
                  Class69.anIntArrayArray841[var19 - 1][var20 - 1] = var18;
                  break;
               }

               if((var15[var16 - 1][var13 + (var17 - 1)] & 19136830) != 0 || (var15[var16 - 1 + var13][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var13;
            }
         }

         if(var19 < 128 - var2 && var20 > 0 && Class69.anIntArrayArray837[1 + var19][var20 - 1] == 0 && 0 == (var15[var16 + var2][var17 - 1] & 19136899)) {
            var13 = 1;

            while(true) {
               if(var13 >= var2) {
                  Class69.anIntArray838[var21] = var6 + 1;
                  Class69.anIntArray842[var21] = var12 - 1;
                  var21 = var21 + 1 & 4095;
                  Class69.anIntArrayArray837[var19 + 1][var20 - 1] = 9;
                  Class69.anIntArrayArray841[var19 + 1][var20 - 1] = var18;
                  break;
               }

               if((var15[var2 + var16][var17 - 1 + var13] & 19136995) != 0 || (var15[var13 + var16][var17 - 1] & 19136911) != 0) {
                  break;
               }

               ++var13;
            }
         }

         if(var19 > 0 && var20 < 128 - var2 && Class69.anIntArrayArray837[var19 - 1][var20 + 1] == 0 && (var15[var16 - 1][var17 + var2] & 19136824) == 0) {
            var13 = 1;

            while(true) {
               if(var13 >= var2) {
                  Class69.anIntArray838[var21] = var6 - 1;
                  Class69.anIntArray842[var21] = 1 + var12;
                  var21 = 1 + var21 & 4095;
                  Class69.anIntArrayArray837[var19 - 1][1 + var20] = 6;
                  Class69.anIntArrayArray841[var19 - 1][1 + var20] = var18;
                  break;
               }

               if((var15[var16 - 1][var17 + var13] & 19136830) != 0 || 0 != (var15[var16 - 1 + var13][var17 + var2] & 19137016)) {
                  break;
               }

               ++var13;
            }
         }

         if(var19 < 128 - var2 && var20 < 128 - var2 && Class69.anIntArrayArray837[var19 + 1][var20 + 1] == 0 && 0 == (var15[var2 + var16][var17 + var2] & 19136992)) {
            for(var13 = 1; var13 < var2; ++var13) {
               if((var15[var16 + var13][var2 + var17] & 19137016) != 0 || 0 != (var15[var16 + var2][var13 + var17] & 19136995)) {
                  continue label256;
               }
            }

            Class69.anIntArray838[var21] = var6 + 1;
            Class69.anIntArray842[var21] = 1 + var12;
            var21 = var21 + 1 & 4095;
            Class69.anIntArrayArray837[1 + var19][var20 + 1] = 12;
            Class69.anIntArrayArray841[1 + var19][1 + var20] = var18;
         }
      }

      Class69.anInt839 = var6 * -1685050181;
      Class59_Sub1.anInt1833 = var12 * -1194986937;
      return false;
   }

   static final void method1874(int var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            Class47.anIntArrayArrayArray635[var0][var4 + var1][var2 + var5] = 0;
         }
      }

      if(var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Class47.anIntArrayArrayArray635[var0][var1][var4 + var2] = Class47.anIntArrayArrayArray635[var0][var1 - 1][var2 + var4];
         }
      }

      if(var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            Class47.anIntArrayArrayArray635[var0][var1 + var4][var2] = Class47.anIntArrayArrayArray635[var0][var4 + var1][var2 - 1];
         }
      }

      if(var1 > 0 && Class47.anIntArrayArrayArray635[var0][var1 - 1][var2] != 0) {
         Class47.anIntArrayArrayArray635[var0][var1][var2] = Class47.anIntArrayArrayArray635[var0][var1 - 1][var2];
      } else if(var2 > 0 && Class47.anIntArrayArrayArray635[var0][var1][var2 - 1] != 0) {
         Class47.anIntArrayArrayArray635[var0][var1][var2] = Class47.anIntArrayArrayArray635[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && Class47.anIntArrayArrayArray635[var0][var1 - 1][var2 - 1] != 0) {
         Class47.anIntArrayArrayArray635[var0][var1][var2] = Class47.anIntArrayArrayArray635[var0][var1 - 1][var2 - 1];
      }

   }
}
