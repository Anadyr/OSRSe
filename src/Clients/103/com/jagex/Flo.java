package com.jagex;

public class Flo extends NodeContainer {

   static Class123 aClass123_2296 = new Class123(64);
   int anInt2297 = 0;
   static RSIndex aRSIndex_2298;
   public int anInt2299;
   public int anInt2300;
   public int anInt2303;
   public int anInt2304;

   void method2515(int var1) {
      this.method2518(this.anInt2297 * -1160088629, (short)-23061);
   }

   void method2516(Packet var1, int var2, int var3) {
      while(true) {
         int var4 = var1.readSignedByte(1708176767);
         if(var4 == 0) {
            return;
         }

         this.method2538(var1, var4, var2, -2101568443);
      }
   }

   void method2518(int var1, short var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var11 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if(var11 < var3) {
         var9 = var11;
      }

      if(var7 < var9) {
         var9 = var7;
      }

      double var13 = var3;
      if(var11 > var3) {
         var13 = var11;
      }

      if(var7 > var13) {
         var13 = var7;
      }

      double var15 = 0.0D;
      double var5 = 0.0D;
      double var17 = (var9 + var13) / 2.0D;
      if(var13 != var9) {
         if(var17 < 0.5D) {
            var5 = (var13 - var9) / (var13 + var9);
         }

         if(var17 >= 0.5D) {
            var5 = (var13 - var9) / (2.0D - var13 - var9);
         }

         if(var13 == var3) {
            var15 = (var11 - var7) / (var13 - var9);
         } else if(var13 == var11) {
            var15 = (var7 - var3) / (var13 - var9) + 2.0D;
         } else if(var13 == var7) {
            var15 = 4.0D + (var3 - var11) / (var13 - var9);
         }
      }

      var15 /= 6.0D;
      this.anInt2303 = (int)(256.0D * var5) * 203308565;
      this.anInt2300 = -2128615975 * (int)(256.0D * var17);
      if(this.anInt2303 * 1757454653 < 0) {
         this.anInt2303 = 0;
      } else if(1757454653 * this.anInt2303 > 255) {
         this.anInt2303 = 304076523;
      }

      if(this.anInt2300 * 789203561 < 0) {
         this.anInt2300 = 0;
      } else if(this.anInt2300 * 789203561 > 255) {
         this.anInt2300 = -1631194329;
      }

      if(var17 > 0.5D) {
         this.anInt2304 = 1720480603 * (int)((1.0D - var17) * var5 * 512.0D);
      } else {
         this.anInt2304 = (int)(512.0D * var5 * var17) * 1720480603;
      }

      if(this.anInt2304 * 837190867 < 1) {
         this.anInt2304 = 1720480603;
      }

      this.anInt2299 = -1336121361 * (int)(var15 * (double)(837190867 * this.anInt2304));
   }

   static void method2524(int var0, int var1, int var2) {
      int[] var3 = new int[4];
      int[] var5 = new int[4];
      var3[0] = var0;
      var5[0] = var1;
      int var6 = 1;

      for(int var4 = 0; var4 < 4; ++var4) {
         if(World.anIntArray378[var4] != var0) {
            var3[var6] = World.anIntArray378[var4];
            var5[var6] = World.anIntArray383[var4];
            ++var6;
         }
      }

      World.anIntArray378 = var3;
      World.anIntArray383 = var5;
      Speach.handleWorldList(World.worldArray, 0, World.worldArray.length - 1, World.anIntArray378, World.anIntArray383, -1981081763);
   }

   static void method2529(int var0) {
      for(int var1 = 0; var1 < 1768430155 * client.anInt3075; ++var1) {
         if(Class39.method683(client.anIntArray3037[var1], (byte)87)) {
            if(var1 < 1768430155 * client.anInt3075 - 1) {
               for(int var2 = var1; var2 < 1768430155 * client.anInt3075 - 1; ++var2) {
                  client.aStringArray3080[var2] = client.aStringArray3080[var2 + 1];
                  client.aStringArray3184[var2] = client.aStringArray3184[var2 + 1];
                  client.anIntArray3037[var2] = client.anIntArray3037[var2 + 1];
                  client.anIntArray3079[var2] = client.anIntArray3079[var2 + 1];
                  client.anIntArray3076[var2] = client.anIntArray3076[1 + var2];
                  client.anIntArray2932[var2] = client.anIntArray2932[var2 + 1];
               }
            }

            client.anInt3075 -= 1937006435;
         }
      }

   }

   void method2538(Packet var1, int var2, int var3, int var4) {
      if(1 == var2) {
         this.anInt2297 = var1.readMedium((byte) 15) * -161113629;
      }

   }

   static final byte[] decompress(byte[] compressedBuffer, int var1) {
      Packet packet = new Packet(compressedBuffer);
      int compression = packet.readSignedByte(1708176767);
      int compressedLength = packet.readInt(-746666995);
      if(compressedLength >= 0 && (-1150359653 * RSIndex.anInt1398 == 0 || compressedLength <= -1150359653 * RSIndex.anInt1398)) {
         if(0 == compression) {
            byte[] data = new byte[compressedLength];
            packet.readBytes(data, 0, compressedLength, 1978056667);
            return data;
         } else {
            int decompressedLength = packet.readInt(-463996695);
            if(decompressedLength >= 0 && (0 == -1150359653 * RSIndex.anInt1398 || decompressedLength <= RSIndex.anInt1398 * -1150359653)) {
               byte[] decompressedBuffer = new byte[decompressedLength];
               if(compression == 1) {
                  Class66.doBzipDecompression(decompressedBuffer, decompressedLength, compressedBuffer, compressedLength, 9);
               } else {
                  RSIndex.aClass60_1387.unpackGZip(packet, decompressedBuffer, (byte) 59);
               }
               return decompressedBuffer;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }
}
