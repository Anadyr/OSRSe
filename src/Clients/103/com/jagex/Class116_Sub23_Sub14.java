package com.jagex;
import java.awt.Component;

public class Class116_Sub23_Sub14 extends NodeContainer {

   public int anInt2427;
   static Class123 aClass123_2428 = new Class123(64);
   public int anInt2429;
   public static Class99 aClass99_2431;
   static Sprite[] aClass116_Sub23_Sub19_Sub2Array2433;
    public int anInt2436;

   void method2674(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2678(var1, var3, -148117759);
      }
   }

   void method2678(Buffer var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt2429 = var1.readShort(45436517) * 115382813;
         this.anInt2427 = var1.readSignedByte(1708176767) * 1344997181;
         this.anInt2436 = var1.readSignedByte(1708176767) * 2051968657;
      }

   }

   public static void method2681(Component var0, int var1) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(KeyFocusListener.aClass82_962);
      var0.addFocusListener(KeyFocusListener.aClass82_962);
   }

   static final void method2685(Class116_Sub23_Sub19_Sub3 var0, int var1) {
      short var2 = 256;

      int var6;
      for(var6 = 0; var6 < Class39.anIntArray521.length; ++var6) {
         Class39.anIntArray521[var6] = 0;
      }

      int var3;
      for(var6 = 0; var6 < 5000; ++var6) {
         var3 = (int)(Math.random() * 128.0D * (double)var2);
         Class39.anIntArray521[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var6 = 0; var6 < 20; ++var6) {
         for(var3 = 1; var3 < var2 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = (var3 << 7) + var4;
               Speach.anIntArray972[var5] = (Class39.anIntArray521[var5 + 128] + Class39.anIntArray521[var5 - 128] + Class39.anIntArray521[1 + var5] + Class39.anIntArray521[var5 - 1]) / 4;
            }
         }

         int[] var9 = Class39.anIntArray521;
         Class39.anIntArray521 = Speach.anIntArray972;
         Speach.anIntArray972 = var9;
      }

      if(null != var0) {
         var6 = 0;

         for(var3 = 0; var3 < var0.anInt2764; ++var3) {
            for(var4 = 0; var4 < var0.anInt2763; ++var4) {
               if(var0.aByteArray2762[var6++] != 0) {
                  var5 = var0.anInt2766 + 16 + var4;
                  int var7 = var3 + 16 + var0.anInt2765;
                  int var8 = var5 + (var7 << 7);
                  Class39.anIntArray521[var8] = 0;
               }
            }
         }
      }

   }

   static char method2686(char var0, int var1) {
      return 181 != var0 && var0 != 402?Character.toTitleCase(var0):var0;
   }
}
