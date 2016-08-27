package com.jagex;

public class Class106 {

   public static Packet aClass116_Sub14_1444;
   static int[] anIntArray1447;
   static Sprite[] aClass116_Sub23_Sub19_Sub2Array1449;


   Class106() throws Throwable {
      throw new Error();
   }

   static final void method1459(byte[] var0, int var1, int var2, int var3, int var4, Class58[] var5, byte var6) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if(var1 + var8 > 0 && var8 + var1 < 103 && var2 + var9 > 0 && var9 + var2 < 103) {
                  var5[var7].anIntArrayArray764[var8 + var1][var9 + var2] &= -16777217;
               }
            }
         }
      }

      Packet var11 = new Packet(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               Class141.method1795(var11, var8, var1 + var9, var2 + var10, var3, var4, 0, (byte)73);
            }
         }
      }

   }
}
