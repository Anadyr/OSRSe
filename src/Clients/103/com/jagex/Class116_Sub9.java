package com.jagex;

public class Class116_Sub9 extends Node {

   static int[] anIntArray1787;
   boolean aBool1789;
   int anInt1791;
   int[] anIntArray1793;
   int[] anIntArray1794;
   int[] anIntArray1795;
   int[] anIntArray1796;
   int anInt1798;
   int[] anIntArray1799;
   boolean aBool1800 = false;
   int anInt1801;

   void method1949() {
      this.anIntArray1799 = null;
   }

   void method1950(int var1) {
      if(this.anIntArray1799 != null) {
         int var2;
         short var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.anInt1801 == 1 || this.anInt1801 == 3) {
            if(anIntArray1787 == null || anIntArray1787.length < this.anIntArray1799.length) {
               anIntArray1787 = new int[this.anIntArray1799.length];
            }

            if(this.anIntArray1799.length == 4096) {
               var3 = 64;
            } else {
               var3 = 128;
            }

            var6 = this.anIntArray1799.length;
            var5 = var3 * var1 * this.anInt1798;
            var7 = var6 - 1;
            if(this.anInt1801 == 1) {
               var5 = -var5;
            }

            for(var4 = 0; var4 < var6; ++var4) {
               var2 = var4 + var5 & var7;
               anIntArray1787[var4] = this.anIntArray1799[var2];
            }

            var10 = this.anIntArray1799;
            this.anIntArray1799 = anIntArray1787;
            anIntArray1787 = var10;
         }

         if(this.anInt1801 == 2 || this.anInt1801 == 4) {
            if(anIntArray1787 == null || anIntArray1787.length < this.anIntArray1799.length) {
               anIntArray1787 = new int[this.anIntArray1799.length];
            }

            if(this.anIntArray1799.length == 4096) {
               var3 = 64;
            } else {
               var3 = 128;
            }

            var6 = this.anIntArray1799.length;
            var5 = var1 * this.anInt1798;
            var7 = var3 - 1;
            if(this.anInt1801 == 2) {
               var5 = -var5;
            }

            for(var4 = 0; var4 < var6; var4 += var3) {
               for(var2 = 0; var2 < var3; ++var2) {
                  int var8 = var4 + var2;
                  int var9 = var4 + (var2 + var5 & var7);
                  anIntArray1787[var8] = this.anIntArray1799[var9];
               }
            }

            var10 = this.anIntArray1799;
            this.anIntArray1799 = anIntArray1787;
            anIntArray1787 = var10;
         }

      }
   }

   Class116_Sub9(Buffer var1) {
      this.anInt1791 = var1.readShort(-293599102);
      this.aBool1789 = var1.readSignedByte(1708176767) == 1;
      int var3 = var1.readSignedByte(1708176767);
      if(var3 >= 1 && var3 <= 4) {
         this.anIntArray1793 = new int[var3];

         int var2;
         for(var2 = 0; var2 < var3; ++var2) {
            this.anIntArray1793[var2] = var1.readShort(1814184791);
         }

         if(var3 > 1) {
            this.anIntArray1794 = new int[var3 - 1];

            for(var2 = 0; var2 < var3 - 1; ++var2) {
               this.anIntArray1794[var2] = var1.readSignedByte(1708176767);
            }
         }

         if(var3 > 1) {
            this.anIntArray1795 = new int[var3 - 1];

            for(var2 = 0; var2 < var3 - 1; ++var2) {
               this.anIntArray1795[var2] = var1.readSignedByte(1708176767);
            }
         }

         this.anIntArray1796 = new int[var3];

         for(var2 = 0; var2 < var3; ++var2) {
            this.anIntArray1796[var2] = var1.readInt(-1009502412);
         }

         this.anInt1801 = var1.readSignedByte(1708176767);
         this.anInt1798 = var1.readSignedByte(1708176767);
         this.anIntArray1799 = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean method1954(double var1, int var3, Class99 var4) {
      int var5;
      for(var5 = 0; var5 < this.anIntArray1793.length; ++var5) {
         if(var4.method1395(this.anIntArray1793[var5], (byte)-112) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.anIntArray1799 = new int[var5];

      for(int var7 = 0; var7 < this.anIntArray1793.length; ++var7) {
         Class116_Sub23_Sub19_Sub3 var12 = Class73.method1041(var4, this.anIntArray1793[var7], (byte)-120);
         var12.method3360();
         byte[] var14 = var12.aByteArray2762;
         int[] var9 = var12.anIntArray2761;
         int var13 = this.anIntArray1796[var7];
         if((var13 & -16777216) == 16777216) {
            ;
         }

         if((var13 & -16777216) == 33554432) {
            ;
         }

         int var6;
         int var8;
         int var10;
         int var11;
         if((var13 & -16777216) == 50331648) {
            var10 = var13 & 16711935;
            var11 = var13 >> 8 & 255;

            for(var8 = 0; var8 < var9.length; ++var8) {
               var6 = var9[var8];
               if((var6 & '\uffff') == var6 >> 8) {
                  var6 &= 255;
                  var9[var8] = var10 * var6 >> 8 & 16711935 | var11 * var6 & '\uff00';
               }
            }
         }

         for(var10 = 0; var10 < var9.length; ++var10) {
            var9[var10] = Texture.method3197(var9[var10], var1);
         }

         if(var7 == 0) {
            var10 = 0;
         } else {
            var10 = this.anIntArray1794[var7 - 1];
         }

         if(var7 == 0) {
            ;
         }

         if(var10 == 0) {
            if(var12.anInt2763 == var3) {
               for(var11 = 0; var11 < var5; ++var11) {
                  this.anIntArray1799[var11] = var9[var14[var11] & 255];
               }
            } else if(var12.anInt2763 == 64 && var3 == 128) {
               var11 = 0;

               for(var8 = 0; var8 < var3; ++var8) {
                  for(var6 = 0; var6 < var3; ++var6) {
                     this.anIntArray1799[var11++] = var9[var14[(var6 >> 1) + (var8 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if(var12.anInt2763 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var11 = 0;

               for(var8 = 0; var8 < var3; ++var8) {
                  for(var6 = 0; var6 < var3; ++var6) {
                     this.anIntArray1799[var11++] = var9[var14[(var6 << 1) + (var8 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var10 == 1) {
            ;
         }

         if(var10 == 2) {
            ;
         }

         if(var10 == 3) {
            ;
         }
      }

      return true;
   }

}
