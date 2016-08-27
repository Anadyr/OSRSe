package com.jagex;

public abstract class Animable extends NodeContainer {

   public int modelHeight = 1067393896;
   protected static boolean aBool2470;

   void method2874(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      SpotAnim var10 = this.getRotatedModel((byte) 13);
      if(null != var10) {
         this.modelHeight = 1 * var10.modelHeight;
         var10.method2874(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   protected SpotAnim getRotatedModel(byte var1) {
      return null;
   }

   public static final Sprite method2878(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      if(-1 == var1) {
         var4 = 0;
      } else if(var4 == 2 && 1 != var1) {
         var4 = 1;
      }

      long var10 = ((long)var3 << 42) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40);
      Sprite var7;
      if(!var5) {
         var7 = (Sprite)Class116_Sub23_Sub11.aClass123_2376.method1632(var10);
         if(var7 != null) {
            return var7;
         }
      }

      Class116_Sub23_Sub11 var8 = RelationList.method778(var0, (byte) 70);
      if(var1 > 1 && null != var8.anIntArray2389) {
         int var12 = -1;

         for(int var9 = 0; var9 < 10; ++var9) {
            if(var1 >= var8.anIntArray2390[var9] && var8.anIntArray2390[var9] != 0) {
               var12 = var8.anIntArray2389[var9];
            }
         }

         if(var12 != -1) {
            var8 = RelationList.method778(var12, (byte) 70);
         }
      }

      SpotAnim var21 = var8.method2593(1, -1381474275);
      if(null == var21) {
         return null;
      } else {
         Sprite sprite = null;
         if(-1 != -507524473 * var8.anInt2392) {
            sprite = method2878(var8.anInt2399 * -322771797, 10, 1, 0, 0, true, 1635379615);
            if(sprite == null) {
               return null;
            }
         } else if(-1 != 125334003 * var8.anInt2401) {
            sprite = method2878(1428864645 * var8.anInt2381, var1, var2, var3, 0, false, -651096325);
            if(sprite == null) {
               return null;
            }
         }

         int[] var16 = DrawingArea.rasterPixels;
         int var17 = DrawingArea.width;
         int var18 = DrawingArea.anInt2492;
         int[] var13 = new int[4];
         DrawingArea.method2891(var13);
         var7 = new Sprite(36, 32);
         DrawingArea.initToDrawArea(var7.myPixels, 36, 32);
         DrawingArea.method2941();
         Texture.method3190();
         Texture.method3193(16, 16);
         Texture.aBool2698 = false;
         int var14 = -757409331 * var8.anInt2396;
         if(var5) {
            var14 = (int)((double)var14 * 1.5D);
         } else if(2 == var2) {
            var14 = (int)(1.04D * (double)var14);
         }

         int var19 = var14 * Texture.anIntArray2708[-1553926171 * var8.anInt2367] >> 16;
         int var15 = var14 * Texture.anIntArray2713[-1553926171 * var8.anInt2367] >> 16;
         var21.method3373();
         var21.method3399(0, 1613119041 * var8.anInt2368, var8.anInt2393 * 400650845, var8.anInt2367 * -1553926171, 2086962731 * var8.anInt2402, var8.anInt2371 * -2057824987 + var19 + var21.modelHeight * 1812947537 / 2, var8.anInt2371 * -2057824987 + var15);
         if(var8.anInt2401 * 125334003 != -1) {
            sprite.drawSprite(0, 0);
         }

         if(var2 >= 1) {
            var7.method3272(1);
         }

         if(var2 >= 2) {
            var7.method3272(16777215);
         }

         if(0 != var3) {
            var7.method3319(var3);
         }

         DrawingArea.initToDrawArea(var7.myPixels, 36, 32);
         if(var8.anInt2392 * -507524473 != -1) {
            sprite.drawSprite(0, 0);
         }

         if(var4 == 1 || var4 == 2 && 1 == var8.anInt2372 * 1303294175) {
            Class38.aClass116_Sub23_Sub19_Sub4_Sub1_509.method3481(Class1.method35(var1, (byte)-55), 0, 9, 16776960, 1);
         }

         if(!var5) {
            Class116_Sub23_Sub11.aClass123_2376.method1633(var7, var10);
         }

         DrawingArea.initToDrawArea(var16, var17, var18);
         DrawingArea.method2892(var13);
         Texture.method3190();
         Texture.aBool2698 = true;
         return var7;
      }
   }
}
