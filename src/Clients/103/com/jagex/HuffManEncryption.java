package com.jagex;

public class HuffManEncryption {

   byte[] aByteArray685;
   int[] anIntArray686;
   static long aLong687;
   int[] anIntArray691;

   public HuffManEncryption(byte[] var1) {
      int length = var1.length;
      this.anIntArray691 = new int[length];
      this.aByteArray685 = var1;
      int[] var5 = new int[33];
      this.anIntArray686 = new int[8];
      int var7 = 0;

      for(int var8 = 0; var8 < length; ++var8) {
         byte var6 = var1[var8];
         if(0 != var6) {
            int var11 = 1 << 32 - var6;
            int var9 = var5[var6];
            this.anIntArray691[var8] = var9;
            int var2;
            int var3;
            int var12;
            int var13;
            if((var9 & var11) != 0) {
               var12 = var5[var6 - 1];
            } else {
               var12 = var9 | var11;

               for(var2 = var6 - 1; var2 >= 1; --var2) {
                  var13 = var5[var2];
                  if(var13 != var9) {
                     break;
                  }

                  var3 = 1 << 32 - var2;
                  if((var13 & var3) != 0) {
                     var5[var2] = var5[var2 - 1];
                     break;
                  }

                  var5[var2] = var13 | var3;
               }
            }

            var5[var6] = var12;

            for(var2 = var6 + 1; var2 <= 32; ++var2) {
               if(var9 == var5[var2]) {
                  var5[var2] = var12;
               }
            }

            var2 = 0;

            for(var13 = 0; var13 < var6; ++var13) {
               var3 = Integer.MIN_VALUE >>> var13;
               if((var9 & var3) != 0) {
                  if(0 == this.anIntArray686[var2]) {
                     this.anIntArray686[var2] = var7;
                  }

                  var2 = this.anIntArray686[var2];
               } else {
                  ++var2;
               }

               if(var2 >= this.anIntArray686.length) {
                  int[] var10 = new int[this.anIntArray686.length * 2];

                  for(int var14 = 0; var14 < this.anIntArray686.length; ++var14) {
                     var10[var14] = this.anIntArray686[var14];
                  }

                  this.anIntArray686 = var10;
               }

               var3 >>>= 1;
            }

            this.anIntArray686[var2] = ~var8;
            if(var2 >= var7) {
               var7 = var2 + 1;
            }
         }
      }

   }

   public int method786(byte[] var1, int var2, byte[] var3, int var4, int var5, byte var6) {
      if(0 == var5) {
         return 0;
      } else {
         int var8 = 0;
         var5 += var4;
         int var9 = var2;

         while(true) {
            byte var10 = var1[var9];
            if(var10 < 0) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            int var7;
            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if(0 != (var10 & 64)) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if((var10 & 32) != 0) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if((var10 & 16) != 0) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if((var10 & 8) != 0) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if(0 != (var10 & 4)) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if(0 != (var10 & 2)) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            if((var10 & 1) != 0) {
               var8 = this.anIntArray686[var8];
            } else {
               ++var8;
            }

            if((var7 = this.anIntArray686[var8]) < 0) {
               var3[var4++] = (byte)(~var7);
               if(var4 >= var5) {
                  break;
               }

               var8 = 0;
            }

            ++var9;
         }

         return 1 + var9 - var2;
      }
   }

   public int method789(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      int var7 = 0;
      int var14 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var11 = var1[var2] & 255;
         int var12 = this.anIntArray691[var11];
         byte var13 = this.aByteArray685[var11];
         if(var13 == 0) {
            throw new RuntimeException("");
         }

         int var8 = var14 >> 3;
         int var10 = var14 & 7;
         var7 &= -var10 >> 31;
         int var9 = (var13 + var10 - 1 >> 3) + var8;
         var10 += 24;
         var4[var8] = (byte)(var7 |= var12 >>> var10);
         if(var8 < var9) {
            ++var8;
            var10 -= 8;
            var4[var8] = (byte)(var7 = var12 >>> var10);
            if(var8 < var9) {
               ++var8;
               var10 -= 8;
               var4[var8] = (byte)(var7 = var12 >>> var10);
               if(var8 < var9) {
                  ++var8;
                  var10 -= 8;
                  var4[var8] = (byte)(var7 = var12 >>> var10);
                  if(var8 < var9) {
                     ++var8;
                     var10 -= 8;
                     var4[var8] = (byte)(var7 = var12 << -var10);
                  }
               }
            }
         }

         var14 += var13;
      }

      return (7 + var14 >> 3) - var5;
   }

}
