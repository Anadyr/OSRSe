package com.jagex;

public class Class14 {

   Class99 aClass99_211;
   Class127 aClass127_212 = new Class127(256);
   Class127 aClass127_213 = new Class127(256);
   Class99 aClass99_215;
   public static int anInt216;


   public Class116_Sub2_Sub1 method240(int var1, int[] var2, short var3) {
      if(this.aClass99_215.method1424(567579185) == 1) {
         return this.method246(0, var1, var2, -868998725);
      } else if(this.aClass99_215.method1361(var1, -824500445) == 1) {
         return this.method246(var1, 0, var2, -2012079315);
      } else {
         throw new RuntimeException();
      }
   }

   Class116_Sub2_Sub1 method243(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      Class116_Sub2_Sub1 var9 = (Class116_Sub2_Sub1)this.aClass127_213.method1658(var6);
      if(null != var9) {
         return var9;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         Class116_Sub3 var8 = (Class116_Sub3)this.aClass127_212.method1658(var6);
         if(null == var8) {
            var8 = Class116_Sub3.method1889(this.aClass99_211, var1, var2);
            if(null == var8) {
               return null;
            }

            this.aClass127_212.method1666(var8, var6);
         }

         var9 = var8.method1885(var3);
         if(var9 == null) {
            return null;
         } else {
            var8.unlink();
            this.aClass127_213.method1666(var9, var6);
            return var9;
         }
      }
   }

   public Class116_Sub2_Sub1 method244(int var1, int[] var2, int var3) {
      if(this.aClass99_211.method1424(-200551522) != 1) {
         if(this.aClass99_211.method1361(var1, -824500445) == 1) {
            return this.method243(var1, 0, var2, 897127095);
         } else {
            throw new RuntimeException();
         }
      } else {
         return this.method243(0, var1, var2, 897127095);
      }
   }

   Class116_Sub2_Sub1 method246(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      Class116_Sub2_Sub1 var8 = (Class116_Sub2_Sub1)this.aClass127_213.method1658(var6);
      if(var8 != null) {
         return var8;
      } else if(null != var3 && var3[0] <= 0) {
         return null;
      } else {
         Sounds var9 = Sounds.method256(this.aClass99_215, var1, var2);
         if(var9 == null) {
            return null;
         } else {
            var8 = var9.method261();
            this.aClass127_213.method1666(var8, var6);
            if(var3 != null) {
               var3[0] -= var8.aByteArray2442.length;
            }

            return var8;
         }
      }
   }

   public Class14(Class99 var1, Class99 var2) {
      this.aClass99_215 = var1;
      this.aClass99_211 = var2;
   }

   static final void method254(byte var0) {
      short var1 = 256;
      int var2;
      if(-1468156361 * Class6.anInt90 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if(Class6.anInt90 * -1468156361 > 768) {
               Class6.anIntArray74[var2] = Buffer.method2150(Class22.anIntArray280[var2], client.anIntArray1615[var2], 1024 - Class6.anInt90 * -1468156361, 1562158132);
            } else if(Class6.anInt90 * -1468156361 <= 256) {
               Class6.anIntArray74[var2] = Buffer.method2150(client.anIntArray1615[var2], Class22.anIntArray280[var2], 256 - -1468156361 * Class6.anInt90, 1883119742);
            } else {
               Class6.anIntArray74[var2] = client.anIntArray1615[var2];
            }
         }
      } else if(Class6.anInt77 * 560977075 > 0) {
         for(var2 = 0; var2 < 256; ++var2) {
            if(Class6.anInt77 * 560977075 > 768) {
               Class6.anIntArray74[var2] = Buffer.method2150(Class22.anIntArray280[var2], Class6.anIntArray75[var2], 1024 - Class6.anInt77 * 560977075, 1610997705);
            } else if(560977075 * Class6.anInt77 > 256) {
               Class6.anIntArray74[var2] = Class6.anIntArray75[var2];
            } else {
               Class6.anIntArray74[var2] = Buffer.method2150(Class6.anIntArray75[var2], Class22.anIntArray280[var2], 256 - Class6.anInt77 * 560977075, 1820755221);
            }
         }
      } else {
         for(var2 = 0; var2 < 256; ++var2) {
            Class6.anIntArray74[var2] = Class22.anIntArray280[var2];
         }
      }

      DrawingArea.method2901(Class6.anInt84 * 1933284923, 9, 128 + 1933284923 * Class6.anInt84, var1 + 7);
      Class67.aClass116_Sub23_Sub19_Sub2_826.method3286(Class6.anInt84 * 1933284923, 0);
      DrawingArea.method2888();
      var2 = 0;
      int var3 = Class73.aAbstractRSDrawing_874.anInt264 * 1802935495 + 1933284923 * Class6.anInt84;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var6 = 1; var6 < var1 - 1; ++var6) {
         var8 = Class6.anIntArray97[var6] * (var1 - var6) / var1;
         var5 = var8 + 22;
         if(var5 < 0) {
            var5 = 0;
         }

         var2 += var5;

         for(var7 = var5; var7 < 128; ++var7) {
            var4 = Class141.anIntArray1633[var2++];
            if(0 != var4) {
               var11 = var4;
               var9 = 256 - var4;
               var4 = Class6.anIntArray74[var4];
               var10 = Class73.aAbstractRSDrawing_874.anIntArray265[var3];
               Class73.aAbstractRSDrawing_874.anIntArray265[var3++] = (var9 * (var10 & 16711935) + var11 * (var4 & 16711935) & -16711936) + ((var10 & '\uff00') * var9 + var11 * (var4 & '\uff00') & 16711680) >> 8;
            } else {
               ++var3;
            }
         }

         var3 += var5 + 1154763343 * Class73.aAbstractRSDrawing_874.anInt264 - 128;
      }

      DrawingArea.method2901(1933284923 * Class6.anInt84 + 765 - 128, 9, 1933284923 * Class6.anInt84 + 765, var1 + 7);
      Class6.aClass116_Sub23_Sub19_Sub2_89.method3286(382 + 1933284923 * Class6.anInt84, 0);
      DrawingArea.method2888();
      var2 = 0;
      var3 = 637 + 24 + 1802935495 * Class73.aAbstractRSDrawing_874.anInt264 + Class6.anInt84 * 1933284923;

      for(var6 = 1; var6 < var1 - 1; ++var6) {
         var8 = Class6.anIntArray97[var6] * (var1 - var6) / var1;
         var5 = 103 - var8;
         var3 += var8;

         for(var7 = 0; var7 < var5; ++var7) {
            var4 = Class141.anIntArray1633[var2++];
            if(var4 != 0) {
               var11 = var4;
               var9 = 256 - var4;
               var4 = Class6.anIntArray74[var4];
               var10 = Class73.aAbstractRSDrawing_874.anIntArray265[var3];
               Class73.aAbstractRSDrawing_874.anIntArray265[var3++] = (var11 * (var4 & '\uff00') + var9 * (var10 & '\uff00') & 16711680) + ((var4 & 16711935) * var11 + var9 * (var10 & 16711935) & -16711936) >> 8;
            } else {
               ++var3;
            }
         }

         var2 += 128 - var5;
         var3 += Class73.aAbstractRSDrawing_874.anInt264 * 1154763343 - var5 - var8;
      }

   }

   static final void method255(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      if(var6 < 0) {
         var6 = 0;
      } else if(var6 > 100) {
         var6 = 100;
      }

      int var9 = var6 * (client.aShort3190 - client.aShort3146) / 100 + client.aShort3146;
      int var8 = var3 * var9 * 512 / (var2 * 334);
      int var7;
      int var13;
      short var16;
      if(var8 < client.aShort3195) {
         var16 = client.aShort3195;
         var9 = var2 * var16 * 334 / (512 * var3);
         if(var9 > client.aShort3085) {
            var9 = client.aShort3085;
            var13 = 512 * var9 * var3 / (334 * var16);
            var7 = (var2 - var13) / 2;
            if(var4) {
               DrawingArea.method2888();
               DrawingArea.method2927(var0, var1, var7, var3, -16777216);
               DrawingArea.method2927(var0 + var2 - var7, var1, var7, var3, -16777216);
            }

            var0 += var7;
            var2 -= var7 * 2;
         }
      } else if(var8 > client.aShort3196) {
         var16 = client.aShort3196;
         var9 = 334 * var2 * var16 / (512 * var3);
         if(var9 < client.aShort3193) {
            var9 = client.aShort3193;
            var13 = var2 * var16 * 334 / (512 * var9);
            var7 = (var3 - var13) / 2;
            if(var4) {
               DrawingArea.method2888();
               DrawingArea.method2927(var0, var1, var2, var7, -16777216);
               DrawingArea.method2927(var0, var3 + var1 - var7, var2, var7, -16777216);
            }

            var1 += var7;
            var3 -= 2 * var7;
         }
      }

      var13 = (client.aShort2941 - client.aShort3191) * var6 / 100 + client.aShort3191;
      client.anInt3059 = 96042709 * (var3 * var9 * var13 / 85504 << 1);
      if(2112468213 * client.anInt3126 != var2 || client.anInt2986 * -336695531 != var3) {
         int[] var15 = new int[9];

         for(int var10 = 0; var10 < 9; ++var10) {
            int var14 = var10 * 32 + 128 + 15;
            int var12 = 3 * var14 + 600;
            int var11 = Texture.anIntArray2708[var14];
            var15[var10] = var11 * var12 >> 16;
         }

         GroundController.method428(var15, 500, 800, var2, var3);
      }

      client.anInt3197 = var0 * 878924253;
      client.anInt3198 = var1 * -2084624847;
      client.anInt3126 = -286107811 * var2;
      client.anInt2986 = var3 * 445868093;
   }
}
