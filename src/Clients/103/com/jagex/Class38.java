package com.jagex;

public final class Class38 {

   static int anInt500;
   boolean aBool501 = true;
   int anInt502;
   int anInt503;
   int anInt504;
   int anInt505;
   int anInt506;
   protected static String aString507;
   static final int anInt508 = 5;
   public static Class116_Sub23_Sub19_Sub4_Sub1 aClass116_Sub23_Sub19_Sub4_Sub1_509;
   static Class71 bufferIn;
   static int anInt511;
   int anInt512;
   static final int anInt513 = 131072;


   public static void method678(Class99 var0, int var1) {
      Class130.aClass99_1584 = var0;
   }

   public static int method679(int var0, int var1, byte var2) {
      int var3;
      if(var1 > var0) {
         var3 = var0;
         var0 = var1;
         var1 = var3;
      }

      while(0 != var1) {
         var3 = var0 % var1;
         var0 = var1;
         var1 = var3;
      }

      return var0;
   }

   public static void method680(byte var0) {
      KeyFocusListener listener = KeyFocusListener.aClass82_962;
      synchronized(listener) {
         KeyFocusListener.anInt959 += 2055192291;
         KeyFocusListener.anInt956 = -1719539323 * KeyFocusListener.anInt958;
         KeyFocusListener.anInt960 = 0;
         int var2;
         if(1397604687 * KeyFocusListener.anInt951 < 0) {
            for(var2 = 0; var2 < 112; ++var2) {
               KeyFocusListener.keysHeldDown[var2] = false;
            }

            KeyFocusListener.anInt951 = -1859441207 * KeyFocusListener.anInt950;
         } else {
            while(KeyFocusListener.anInt950 * 1246538247 != 1397604687 * KeyFocusListener.anInt951) {
               var2 = KeyFocusListener.anIntArray949[1246538247 * KeyFocusListener.anInt950];
               KeyFocusListener.anInt950 = 1502651319 * (1 + 1246538247 * KeyFocusListener.anInt950 & 127);
               if(var2 < 0) {
                  KeyFocusListener.keysHeldDown[~var2] = false;
               } else {
                  if(!KeyFocusListener.keysHeldDown[var2] && 1701596051 * KeyFocusListener.anInt960 < KeyFocusListener.anIntArray940.length - 1) {
                     KeyFocusListener.anIntArray940[(KeyFocusListener.anInt960 += -2027189605) * 1701596051 - 1] = var2;
                  }

                  KeyFocusListener.keysHeldDown[var2] = true;
               }
            }
         }

         KeyFocusListener.anInt958 = -1548916671 * KeyFocusListener.anInt938;
      }
   }

   Class38(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.anInt505 = -525826095 * var1;
      this.anInt512 = 289745453 * var2;
      this.anInt502 = var3 * -1255272067;
      this.anInt503 = 1787141445 * var4;
      this.anInt504 = 1167699771 * var5;
      this.anInt506 = var6 * 1968954883;
      this.aBool501 = var7;
   }
}
