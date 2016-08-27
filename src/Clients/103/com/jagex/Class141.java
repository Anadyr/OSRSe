package com.jagex;
import java.util.Comparator;

final class Class141 implements Comparator {

   static int[] anIntArray1633;

   int method1785(Class133 var1, Class133 var2, int var3) {
      return var1.method1711(-1867191562).compareTo(var2.method1711(-424979684));
   }

   public int compare(Object var1, Object var2) {
      return this.method1785((Class133)var1, (Class133)var2, 2096270368);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method1795(Packet var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      int var8;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         Class47.aByteArrayArrayArray634[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               if(var1 == 0) {
                  Class47.anIntArrayArrayArray635[0][var2][var3] = -Entity.method3108(var4 + 932731 + var2, var5 + 556238 + var3, 193181238) * 8;
               } else {
                  Class47.anIntArrayArrayArray635[var1][var2][var3] = Class47.anIntArrayArrayArray635[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var8 == 1) {
               int var9 = var0.readSignedByte(1708176767);
               if(1 == var9) {
                  var9 = 0;
               }

               if(var1 == 0) {
                  Class47.anIntArrayArrayArray635[0][var2][var3] = 8 * -var9;
               } else {
                  Class47.anIntArrayArrayArray635[var1][var2][var3] = Class47.anIntArrayArrayArray635[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if(var8 <= 49) {
               Class47.aByteArrayArrayArray626[var1][var2][var3] = var0.readUnsignedByte(-1894453784);
               Class116_Sub23_Sub7.aByteArrayArrayArray2291[var1][var2][var3] = (byte)((var8 - 2) / 4);
               Class60.aByteArrayArrayArray780[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if(var8 <= 81) {
               Class47.aByteArrayArrayArray634[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               client.aByteArrayArrayArray1614[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.readSignedByte(1708176767);
            if(0 == var8) {
               break;
            }

            if(1 == var8) {
               var0.readSignedByte(1708176767);
               break;
            }

            if(var8 <= 49) {
               var0.readSignedByte(1708176767);
            }
         }
      }

   }
}
