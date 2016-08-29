package com.jagex;

public class Class2 {

   static Class99_Sub1 aClass99_Sub1_12;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array18;
   static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array21;
   static Class99_Sub1 aClass99_Sub1_23;
   public static char aChar24;


   public static void method37(Class99 var0, Class99 var1, int var2) {
      Class96.aClass99_1367 = var0;
      MobDefinition.aClass99_2329 = var1;
   }

   Class2() throws Throwable {
      throw new Error();
   }

   protected static final void method38(short var0) {
      Class102.aTimer_1418.reset(-1108956053);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2917[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         Applet_Sub1.aLongArray2919[var1] = 0L;
      }

      Class116_Sub12.anInt1836 = 0;
   }

   static final void method39(int var0, int var1, int var2, byte var3) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var5 = MobDefinition.method2552(var0, var1, -747958745 * Class116_Sub11.anInt1819, (short) 25536) - var2;
         var0 -= 282154897 * Class116_Sub23_Sub16_Sub5.anInt2740;
         var5 -= 1447873857 * Class50.anInt671;
         var1 -= -324676025 * Class83.anInt968;
         int var9 = Texture.anIntArray2708[1162853107 * Class78.anInt904];
         int var7 = Texture.anIntArray2713[1162853107 * Class78.anInt904];
         int var4 = Texture.anIntArray2708[Class76.anInt895 * -210812059];
         int var8 = Texture.anIntArray2713[Class76.anInt895 * -210812059];
         int var6 = var0 * var8 + var1 * var4 >> 16;
         var1 = var8 * var1 - var0 * var4 >> 16;
         var0 = var6;
         var6 = var7 * var5 - var9 * var1 >> 16;
         var1 = var9 * var5 + var1 * var7 >> 16;
         if(var1 >= 50) {
            client.anInt3041 = (2112468213 * client.anInt3126 / 2 + var0 * client.anInt3059 * -478819715 / var1) * 1776163475;
            client.anInt3042 = -192643311 * (-478819715 * client.anInt3059 * var6 / var1 + -336695531 * client.anInt2986 / 2);
         } else {
            client.anInt3041 = -1776163475;
            client.anInt3042 = 192643311;
         }

      } else {
         client.anInt3041 = -1776163475;
         client.anInt3042 = 192643311;
      }
   }
}
