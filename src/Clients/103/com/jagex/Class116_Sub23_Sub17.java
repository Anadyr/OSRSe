package com.jagex;

public class Class116_Sub23_Sub17 extends NodeContainer {

   Class28[] aClass28Array2471;
   static int[][] reagionXTEAKeys;

   public boolean method2881(int var1, byte var2) {
      return this.aClass28Array2471[var1].aBool400;
   }

   public Class116_Sub23_Sub17(RSIndex var1, RSIndex var2, int var3, boolean var4) {
      Deque var5 = new Deque();
      int var6 = var1.method1361(var3, -824500445);
      this.aClass28Array2471 = new Class28[var6];
      int[] var7 = var1.method1404(var3, (byte)0);
      int var8 = 0;

      while(var8 < var7.length) {
         byte[] var9 = var1.getFiles(var3, var7[var8], -2013451143);
         Class116_Sub5 var10 = null;
         int var12 = (var9[0] & 255) << 8 | var9[1] & 255;
         Class116_Sub5 var11 = (Class116_Sub5)var5.getFirst();

         while(true) {
            if(var11 != null) {
               if(var12 != -207314411 * var11.anInt1724) {
                  var11 = (Class116_Sub5)var5.getNext();
                  continue;
               }

               var10 = var11;
            }

            if(var10 == null) {
               byte[] var13;
               if(var4) {
                  var13 = var2.method1379(0, var12, -924550464);
               } else {
                  var13 = var2.method1379(var12, 0, 1864363857);
               }

               var10 = new Class116_Sub5(var12, var13);
               var5.addLast(var10);
            }

            this.aClass28Array2471[var7[var8]] = new Class28(var9, var10);
            ++var8;
            break;
         }
      }

   }

   static final void method2883(Entity var0, int var1, int var2) {
      Class2.method39(1272643751 * var0.anInt2609, -1801433343 * var0.anInt2579, var1, (byte)31);
   }

   static Timer method2884(int var0) {
      try {
         return new NanoTimer();
      } catch (Throwable var2) {
         return new BasicTimer();
      }
   }
}
