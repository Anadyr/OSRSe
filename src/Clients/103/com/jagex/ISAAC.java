package com.jagex;

import com.applet.Launcher;

import java.awt.FontMetrics;

public final class ISAAC {

   int count;
   int accumulator;
   int lastResult;
   int counter;

   int[] memory = new int[256];
   int[] result = new int[256];

   final void isaac() {
      lastResult += ++counter;
      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.memory[var2];
         if((var2 & 2) == 0) {
            if((var2 & 1) == 0) {
               this.accumulator = (this.accumulator  ^ this.accumulator  << 13) ;
            } else {
               this.accumulator = (this.accumulator ^  this.accumulator >>> 6) ;
            }
         } else if((var2 & 1) == 0) {
            this.accumulator = (this.accumulator ^  this.accumulator << 2);
         } else {
            this.accumulator = (this.accumulator  ^ this.accumulator  >>> 16);
         }
         this.accumulator += this.memory[128 + var2 & 255];
         int var4;
         this.memory[var2] = var4 = this.memory[(var3 & 1020) >> 2] +  this.accumulator + this.lastResult ;
         this.result[var2] = (this.lastResult = (var3 + this.memory[(var4 >> 8 & 1020) >> 2]));
      }

   }

   final void initializeKeySet() {
       int i1;
       int j1;
       int k1;
       int l1;
       int i2;
       int j2;
       int k2;
       int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
      int i;
      for(i = 0; i < 4; ++i) {
         l ^= i1 << 11;
         k1 += l;
         i1 += j1;
         i1 ^= j1 >>> 2;
         l1 += i1;
         j1 += k1;
         j1 ^= k1 << 8;
         i2 += j1;
         k1 += l1;
         k1 ^= l1 >>> 16;
         j2 += k1;
         l1 += i2;
         l1 ^= i2 << 10;
         k2 += l1;
         i2 += j2;
         i2 ^= j2 >>> 4;
         l += i2;
         j2 += k2;
         j2 ^= k2 << 8;
         i1 += j2;
         k2 += l;
         k2 ^= l >>> 9;
         j1 += k2;
         l += i1;
      }

      for(i = 0; i < 256; i += 8) {
         l += this.result[i];
         i1 += this.result[1 + i];
         j1 += this.result[2 + i];
         k1 += this.result[3 + i];
         l1 += this.result[4 + i];
         i2 += this.result[5 + i];
         j2 += this.result[6 + i];
         k2 += this.result[7 + i];
         l ^= i1 << 11;
         k1 += l;
         i1 += j1;
         i1 ^= j1 >>> 2;
         l1 += i1;
         j1 += k1;
         j1 ^= k1 << 8;
         i2 += j1;
         k1 += l1;
         k1 ^= l1 >>> 16;
         j2 += k1;
         l1 += i2;
         l1 ^= i2 << 10;
         k2 += l1;
         i2 += j2;
         i2 ^= j2 >>> 4;
         l += i2;
         j2 += k2;
         j2 ^= k2 << 8;
         i1 += j2;
         k2 += l;
         k2 ^= l >>> 9;
         j1 += k2;
         l += i1;
         this.memory[i] = l;
         this.memory[i + 1] = i1;
         this.memory[2 + i] = j1;
         this.memory[i + 3] = k1;
         this.memory[i + 4] = l1;
         this.memory[5 + i] = i2;
         this.memory[6 + i] = j2;
         this.memory[7 + i] = k2;
      }

      for(i = 0; i < 256; i += 8) {
         l += this.memory[i];
         i1 += this.memory[i + 1];
         j1 += this.memory[i + 2];
         k1 += this.memory[3 + i];
         l1 += this.memory[4 + i];
         i2 += this.memory[5 + i];
         j2 += this.memory[i + 6];
         k2 += this.memory[7 + i];
         l ^= i1 << 11;
         k1 += l;
         i1 += j1;
         i1 ^= j1 >>> 2;
         l1 += i1;
         j1 += k1;
         j1 ^= k1 << 8;
         i2 += j1;
         k1 += l1;
         k1 ^= l1 >>> 16;
         j2 += k1;
         l1 += i2;
         l1 ^= i2 << 10;
         k2 += l1;
         i2 += j2;
         i2 ^= j2 >>> 4;
         l += i2;
         j2 += k2;
         j2 ^= k2 << 8;
         i1 += j2;
         k2 += l;
         k2 ^= l >>> 9;
         j1 += k2;
         l += i1;
         this.memory[i] = l;
         this.memory[i + 1] = i1;
         this.memory[i + 2] = j1;
         this.memory[i + 3] = k1;
         this.memory[4 + i] = l1;
         this.memory[i + 5] = i2;
         this.memory[i + 6] = j2;
         this.memory[i + 7] = k2;
      }

      this.isaac();
      this.count = 256;
   }

   ISAAC(int[] key) {
      for(int var2 = 0; var2 < key.length; ++var2) {
         this.result[var2] = key[var2];
      }

      this.initializeKeySet();
   }

   final int getNextValue() {
      if(count-- == 0) {
         this.isaac();
         this.count = 255;
      }
      // if(!Launcher.rsps)
      //  return 0;
       return this.result[this.count];
   }

    
    protected static FontMetrics aFontMetrics701;
    public static SignLink signLink;
    static int anInt700;
    
   static final void method794(short var0) {
        client.rsaBuffer.startPacket(217, (byte) 32);

        for(GameInterface var1 = (GameInterface)client.overridedInterfaces.getFirst(); null != var1; var1 = (GameInterface)client.overridedInterfaces.getNext()) {
            if(-1882639549 * var1.type == 0 || var1.type * -1882639549 == 3) {
                Class116_Sub23_Sub5.method2490(var1, true, (byte)1);
            }
        }

        if(client.aClass116_Sub15_3097 != null) {
            Class79.refreshInterface(client.aClass116_Sub15_3097, 2133316706);
            client.aClass116_Sub15_3097 = null;
        }

    }

   static final void method804(Class116_Sub4 var0, int var1) {
      var0.aBool1722 = false;
      if(var0.aClass116_Sub2_1719 != null) {
         var0.aClass116_Sub2_1719.anInt1669 = 0;
      }

      for(Class116_Sub4 var2 = var0.method1907(); null != var2; var2 = var0.method1913()) {
         method804(var2, 1493379808);
      }

   }

   static boolean method806(RSInterface var0, int var1) {
      if(client.aBool2957) {
         if(Class35.method645(var0, (byte)0) != 0) {
            return false;
         }

         if(0 == -1305917269 * var0.type) {
            return false;
         }
      }

      return var0.hidden;
   }
}
