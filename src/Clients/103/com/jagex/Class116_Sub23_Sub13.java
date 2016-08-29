package com.jagex;
import java.awt.Frame;

public class Class116_Sub23_Sub13 extends NodeContainer {

   static Class123 aClass123_2420 = new Class123(64);
   public boolean aBool2421 = false;
   static Class99 aClass99_2423;
   static Class99_Sub1 aClass99_Sub1_2424;
   public static Frame aFrame2425;


   void method2657(Buffer var1, byte var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2658(var1, var3, -2056580850);
      }
   }

   void method2658(Buffer var1, int var2, int var3) {
      if(2 == var2) {
         this.aBool2421 = true;
      }

   }

   public static int method2667(int var0) {
      return (Class85.anInt986 += 673144361) * 932126233 - 1;
   }

   static int readSkip(BitBuffer buffer, int var1) {
      int type = buffer.readBits(2, (byte) -1);
      int skip;
      if(type == 0) {
         skip = 0;
      } else if(1 == type) {
         skip = buffer.readBits(5, (byte) -1);
      } else if(2 == type) {
         skip = buffer.readBits(8, (byte) -1);
      } else {
         skip = buffer.readBits(11, (byte) -1);
      }

      return skip;
   }

   static final int method2671(int var0, int var1, byte var2) {
      int var3 = var1 * 57 + var0;
      var3 ^= var3 << 13;
      int var4 = var3 * (789221 + var3 * var3 * 15731) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

}
