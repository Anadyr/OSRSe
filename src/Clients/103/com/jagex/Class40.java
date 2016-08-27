package com.jagex;
import java.io.File;
import java.io.IOException;

public final class Class40 {

   static int anInt523;
   int anInt524;
   static final int anInt525 = 4;
   int anInt526;
   int anInt527;
   public Animable anAnimable3;
   public Animable anAnimable4;
   int anInt530;
   int anInt531 = 0;
   int anInt532;
   public static final int anInt533 = 90;
   public int anInt534 = 0;
   public static final int anInt535 = 8192;
   public static final int anInt536 = 31;


   static Class116_Sub23_Sub19_Sub3 method685(byte var0) {
      Class116_Sub23_Sub19_Sub3 var1 = new Class116_Sub23_Sub19_Sub3();
      var1.anInt2767 = Class8.anInt122 * -749860951;
      var1.anInt2768 = -1945497809 * Class8.anInt132;
      var1.anInt2766 = Class8.anIntArray124[0];
      var1.anInt2765 = Class116_Sub23_Sub15.anIntArray2444[0];
      var1.anInt2763 = Class8.anIntArray125[0];
      var1.anInt2764 = Class8.anIntArray126[0];
      var1.anIntArray2761 = Class97.anIntArray1372;
      var1.aByteArray2762 = Mob.aByteArrayArray2877[0];
      Class76.method1080((byte)-28);
      return var1;
   }

   public static Class145 method686(String var0, String var1, boolean var2, int var3) {
      File var4 = new File(Class86.aFile1006, "preferences" + var0 + ".dat");
      if(var4.exists()) {
         try {
            Class145 var11 = new Class145(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if(1502918311 * Class86.anInt1013 == 33) {
         var5 = "_rc";
      } else if(34 == 1502918311 * Class86.anInt1013) {
         var5 = "_wip";
      }

      File var6 = new File(PacketBuilder.USER_HOME, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      Class145 var7;
      if(!var2 && var6.exists()) {
         try {
            var7 = new Class145(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new Class145(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }
}
