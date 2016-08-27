package com.jagex;

public class Class1 {

   static Class1 aClass1_2 = new Class1();
   static Class1 aClass1_3 = new Class1();
   static Class1 aClass1_4 = new Class1();
   static CacheIndex aCacheIndex_6;
   public static Class116_Sub23_Sub21 aClass116_Sub23_Sub21_7;
   static Class1 aClass1_8 = new Class1();


   static final String method35(int var0, byte var1) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + Class91.aString1155 + "</col>":"<col=00ff80>" + var0 / 1000000 + Class91.aString1209 + "</col>");
   }

   static final void method36(int var0, int var1) {
      short var2 = 256;
      Class6.anInt62 += var0 * -254253952;
      int var3;
      if(-1479972487 * Class6.anInt62 > Class39.anIntArray521.length) {
         Class6.anInt62 -= Class39.anIntArray521.length * 266449097;
         var3 = (int)(Math.random() * 12.0D);
         Class116_Sub23_Sub14.method2685(Class6.aClass116_Sub23_Sub19_Sub3Array66[var3], -1897759937);
      }

      var3 = 0;
      int var5 = var0 * 128;
      int var6 = 128 * (var2 - var0);

      int var4;
      int var8;
      for(var4 = 0; var4 < var6; ++var4) {
         var8 = Class141.anIntArray1633[var3 + var5] - Class39.anIntArray521[var3 + -1479972487 * Class6.anInt62 & Class39.anIntArray521.length - 1] * var0 / 6;
         if(var8 < 0) {
            var8 = 0;
         }

         Class141.anIntArray1633[var3++] = var8;
      }

      int var7;
      int var9;
      for(var4 = var2 - var0; var4 < var2; ++var4) {
         var8 = var4 * 128;

         for(var9 = 0; var9 < 128; ++var9) {
            var7 = (int)(Math.random() * 100.0D);
            if(var7 < 50 && var9 > 10 && var9 < 118) {
               Class141.anIntArray1633[var9 + var8] = 255;
            } else {
               Class141.anIntArray1633[var9 + var8] = 0;
            }
         }
      }

      if(-1468156361 * Class6.anInt90 > 0) {
         Class6.anInt90 -= 2037874204 * var0;
      }

      if(560977075 * Class6.anInt77 > 0) {
         Class6.anInt77 -= 1290529260 * var0;
      }

      if(Class6.anInt90 * -1468156361 == 0 && 0 == 560977075 * Class6.anInt77) {
         var4 = (int)(Math.random() * (double)(2000 / var0));
         if(var4 == 0) {
            Class6.anInt90 = 2004753408;
         }

         if(var4 == 1) {
            Class6.anInt77 = -336991232;
         }
      }

      for(var4 = 0; var4 < var2 - var0; ++var4) {
         Class6.anIntArray97[var4] = Class6.anIntArray97[var4 + var0];
      }

      for(var4 = var2 - var0; var4 < var2; ++var4) {
         Class6.anIntArray97[var4] = (int)(Math.sin((double)(Class6.anInt81 * 364548381) / 14.0D) * 16.0D + Math.sin((double)(364548381 * Class6.anInt81) / 15.0D) * 14.0D + Math.sin((double)(Class6.anInt81 * 364548381) / 16.0D) * 12.0D);
         Class6.anInt81 += -571819723;
      }

      Class6.anInt79 += var0 * -809494109;
      var4 = (var0 + (client.anInt2943 * -1040073859 & 1)) / 2;
      if(var4 > 0) {
         for(var8 = 0; var8 < Class6.anInt79 * 1962167372; ++var8) {
            var9 = (int)(Math.random() * 124.0D) + 2;
            var7 = (int)(Math.random() * 128.0D) + 128;
            Class141.anIntArray1633[var9 + (var7 << 7)] = 192;
         }

         Class6.anInt79 = 0;

         int var10;
         for(var8 = 0; var8 < var2; ++var8) {
            var9 = 0;
            var7 = 128 * var8;

            for(var10 = -var4; var10 < 128; ++var10) {
               if(var4 + var10 < 128) {
                  var9 += Class141.anIntArray1633[var4 + var7 + var10];
               }

               if(var10 - (1 + var4) >= 0) {
                  var9 -= Class141.anIntArray1633[var7 + var10 - (var4 + 1)];
               }

               if(var10 >= 0) {
                  Class4.anIntArray52[var7 + var10] = var9 / (1 + var4 * 2);
               }
            }
         }

         for(var8 = 0; var8 < 128; ++var8) {
            var9 = 0;

            for(var7 = -var4; var7 < var2; ++var7) {
               var10 = var7 * 128;
               if(var7 + var4 < var2) {
                  var9 += Class4.anIntArray52[var10 + var8 + 128 * var4];
               }

               if(var7 - (1 + var4) >= 0) {
                  var9 -= Class4.anIntArray52[var10 + var8 - (1 + var4) * 128];
               }

               if(var7 >= 0) {
                  Class141.anIntArray1633[var8 + var10] = var9 / (1 + var4 * 2);
               }
            }
         }
      }

   }

}
