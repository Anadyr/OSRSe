package com.jagex;

public final class Class79 {

   static Player ourPlayer;


   Class79() throws Throwable {
      throw new Error();
   }

   public static void refreshInterface(RSInterface rsInterface, int var1) {
      if(client.anInt3160 * -916689835 == rsInterface.lastDrawCycle * 182565419) {
         client.aBoolArray3073[rsInterface.redrawId * 1983233805] = true;
      }

   }

   static final void method1098(RSInterface var0, int var1, int var2, short var3) {
      if(null == client.aClass116_Sub15_3106 && !client.aBool3074) {
         if(null != var0) {
            RSInterface var6 = var0;
            int var5 = CacheIndex.method2219(Class35.method645(var0, (byte) 0), 1820774751);
            RSInterface var4;
            int var7;
            if(0 != var5) {
               var7 = 0;

               while(true) {
                  if(var7 >= var5) {
                     var4 = var6;
                     break;
                  }

                  var6 = Class107.getInterface(-1652479707 * var6.parent, 314639891);
                  if(var6 == null) {
                     var4 = null;
                     break;
                  }

                  ++var7;
               }
            } else {
               var4 = null;
            }

            RSInterface var9 = var4;
            if(var4 == null) {
               var9 = var0.aClass116_Sub15_1998;
            }

            if(null != var9) {
               client.aClass116_Sub15_3106 = var0;
               var6 = var0;
               var5 = CacheIndex.method2219(Class35.method645(var0, (byte) 0), 1729906585);
               if(0 == var5) {
                  var4 = null;
               } else {
                  var7 = 0;

                  while(true) {
                     if(var7 >= var5) {
                        var4 = var6;
                        break;
                     }

                     var6 = Class107.getInterface(-1652479707 * var6.parent, 314639891);
                     if(null == var6) {
                        var4 = null;
                        break;
                     }

                     ++var7;
                  }
               }

               var9 = var4;
               if(var4 == null) {
                  var9 = var0.aClass116_Sub15_1998;
               }

               client.aClass116_Sub15_3107 = var9;
               client.anInt3087 = 205666793 * var1;
               client.anInt3109 = var2 * -940768111;
               RelationList.anInt672 = 0;
               client.aBool3117 = false;
               if(client.anInt3075 * 1768430155 > 0) {
                  int var10 = client.anInt3075 * 1768430155 - 1;
                  CacheIndex.aClass4_1911 = new Class4();
                  CacheIndex.aClass4_1911.anInt51 = client.anIntArray3076[var10] * -615722007;
                  CacheIndex.aClass4_1911.anInt46 = 607560247 * client.anIntArray2932[var10];
                  CacheIndex.aClass4_1911.anInt47 = -859373123 * client.anIntArray3037[var10];
                  CacheIndex.aClass4_1911.anInt45 = client.anIntArray3079[var10] * -558864427;
                  CacheIndex.aClass4_1911.aString48 = client.aStringArray3080[var10];
               }

               return;
            }
         }

      }
   }
}