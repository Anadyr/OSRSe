package com.jagex;

public class Class116_Sub23_Sub15 extends NodeContainer {

   public static int[] anIntArray2444;
   static Class123 aClass123_2445 = new Class123(64);
   public int anInt2446 = 0;
   public static int anInt2448;
   static Class99 aClass99_2449;


   void method2690(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2698(var1, var3, -1607623407);
      }
   }

   static int method2691(int var0) {
      return (Class37.anInt495 += -1265413871) * 1518714865 - 1;
   }

   static Class116_Sub15 method2696(Class116_Sub15 var0, byte var1) {
      int var2 = Class99_Sub1.method2219(Class35.method645(var0, (byte)0), 763449230);
      if(var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = Class107.method1466(var0.anInt1944 * -1652479707, 314639891);
            if(var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   void method2698(Buffer var1, int var2, int var3) {
      if(5 == var2) {
         this.anInt2446 = var1.readShort(1280879349) * -205219945;
      }

   }

   public static void method2701(int var0) {
      aClass123_2445.method1635();
   }

   public static String method2702(CharSequence var0, Class143 var1, int var2) {
      if(null == var0) {
         return null;
      } else {
         int var5 = 0;

         int var6;
         for(var6 = var0.length(); var5 < var6 && Class116_Sub23_Sub5.method2487(var0.charAt(var5), 168026416); ++var5) {
            ;
         }

         while(var6 > var5 && Class116_Sub23_Sub5.method2487(var0.charAt(var6 - 1), -1907660319)) {
            --var6;
         }

         int var3 = var6 - var5;
         if(var3 >= 1 && var3 <= Class116_Sub23_Sub6.method2492(var1, -141411722)) {
            StringBuilder var4 = new StringBuilder(var3);

            for(int var9 = var5; var9 < var6; ++var9) {
               char var7 = var0.charAt(var9);
               if(Class116_Sub17.method2305(var7, -1560609919)) {
                  char var8 = Class47.method756(var7, -1222522152);
                  if(0 != var8) {
                     var4.append(var8);
                  }
               }
            }

            if(var4.length() == 0) {
               return null;
            } else {
               return var4.toString();
            }
         } else {
            return null;
         }
      }
   }

   public static MobDefinition method2705(int var0, int var1) {
      MobDefinition var2 = (MobDefinition) MobDefinition.aClass123_2310.method1632((long)var0);
      if(var2 == null) {
         byte[] var3 = Class96.aClass99_1367.method1394(9, var0, 903745338);
         var2 = new MobDefinition();
         var2.anInt2308 = 95406197 * var0;
         if(var3 != null) {
            var2.method2549(new Buffer(var3), 112155467);
         }

         var2.method2541((byte)9);
         MobDefinition.aClass123_2310.method1633(var2, (long)var0);
         return var2;
      } else {
         return var2;
      }
   }
}
