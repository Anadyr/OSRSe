package com.jagex;
import java.awt.Component;

public abstract class Class89 {

   static int anInt1040;


   public abstract void method1180(Component var1, short var2);

   public abstract int method1182(int var1);

   public abstract void method1185(Component var1, byte var2);

   public static void method1190(Component var0, int var1) {
      var0.removeKeyListener(KeyFocusListener.aClass82_962);
      var0.removeFocusListener(KeyFocusListener.aClass82_962);
      KeyFocusListener.anInt951 = 434850385;
   }

   static final void method1191(int var0) {
      for(int var1 = 0; var1 < client.anInt3176 * 2079336095; ++var1) {
         --client.anIntArray2964[var1];
         if(client.anIntArray2964[var1] < -10) {
            client.anInt3176 -= -857377441;

            for(int var3 = var1; var3 < client.anInt3176 * 2079336095; ++var3) {
               client.anIntArray3177[var3] = client.anIntArray3177[var3 + 1];
               client.aClass15Array3181[var3] = client.aClass15Array3181[var3 + 1];
               client.anIntArray3019[var3] = client.anIntArray3019[var3 + 1];
               client.anIntArray2964[var3] = client.anIntArray2964[1 + var3];
               client.anIntArray3180[var3] = client.anIntArray3180[1 + var3];
            }

            --var1;
         } else {
            Sounds var11 = client.aClass15Array3181[var1];
            if(var11 == null) {
               Sounds var10000 = (Sounds)null;
               var11 = Sounds.method256(Class116_Sub23_Sub13.aClass99_Sub1_2424, client.anIntArray3177[var1], 0);
               if(null == var11) {
                  continue;
               }

               client.anIntArray2964[var1] += var11.method259();
               client.aClass15Array3181[var1] = var11;
            }

            if(client.anIntArray2964[var1] < 0) {
               int var9;
               if(client.anIntArray3180[var1] != 0) {
                  int var7 = 128 * (client.anIntArray3180[var1] & 255);
                  int var8 = client.anIntArray3180[var1] >> 16 & 255;
                  int var2 = 128 * var8 + 64 - Class79.aPlayer_909.anInt2609 * 1272643751;
                  if(var2 < 0) {
                     var2 = -var2;
                  }

                  int var5 = client.anIntArray3180[var1] >> 8 & 255;
                  int var6 = 64 + 128 * var5 - Class79.aPlayer_909.anInt2579 * -1801433343;
                  if(var6 < 0) {
                     var6 = -var6;
                  }

                  int var4 = var6 + var2 - 128;
                  if(var4 > var7) {
                     client.anIntArray2964[var1] = -100;
                     continue;
                  }

                  if(var4 < 0) {
                     var4 = 0;
                  }

                  var9 = (var7 - var4) * client.anInt3175 * 873913835 / var7;
               } else {
                  var9 = client.anInt3174 * 936209849;
               }

               if(var9 > 0) {
                  Class116_Sub2_Sub1 var12 = var11.method261().method2687(Class70.aClass17_844);
                  Class116_Sub4_Sub2 var13 = Class116_Sub4_Sub2.method2800(var12, 100, var9);
                  var13.method2737(client.anIntArray3019[var1] - 1);
                  Class50.aClass116_Sub4_Sub1_673.method2706(var13);
               }

               client.anIntArray2964[var1] = -100;
            }
         }
      }

      if(client.aBool3159) {
         boolean var10;
         if(0 != Class128.anInt1574 * -1587772409) {
            var10 = true;
         } else {
            var10 = Class128.aClass116_Sub4_Sub4_1576.method3000(-1828101306);
         }

         if(!var10) {
            if(0 != client.anInt3171 * -1994948003 && 850867613 * client.anInt3172 != -1) {
               Class80.method1099(Class2.aClass99_Sub1_23, client.anInt3172 * 850867613, 0, client.anInt3171 * -1994948003, false, (short)19161);
            }

            client.aBool3159 = false;
         }
      }

   }
}
