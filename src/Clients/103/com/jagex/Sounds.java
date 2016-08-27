package com.jagex;

public class Sounds {

   int anInt218;
   SoundClip[] aSoundClipArray219 = new SoundClip[10];
   int anInt221;


   public static Sounds method256(RSIndex var0, int var1, int var2) {
      byte[] var3 = var0.getFiles(var1, var2, -516563011);
      return var3 == null?null:new Sounds(new Packet(var3));
   }

   Sounds(Packet var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 != 0) {
            var1.position -= -184175589;
            this.aSoundClipArray219[var2] = new SoundClip();
            this.aSoundClipArray219[var2].method199(var1);
         }
      }

      this.anInt218 = var1.readUnsignedShort(570142834);
      this.anInt221 = var1.readUnsignedShort(1710891158);
   }

   public Class116_Sub2_Sub1 method257() {
      byte[] var1 = this.method258();
      return new Class116_Sub2_Sub1(315195798, var1, 22050 * this.anInt218 / 1000, 1400719118 * this.anInt221 / -232635572);
   }

   final byte[] method258() {
      int var1 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(this.aSoundClipArray219[var3] != null && this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182 > var1) {
            var1 = this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var3 = 22050 * var1 / 1000;
         byte[] var9 = new byte[var3];

         for(int var2 = 0; var2 < 10; ++var2) {
            if(this.aSoundClipArray219[var2] != null) {
               int var6 = this.aSoundClipArray219[var2].anInt181 * 22050 / 1000;
               int var7 = this.aSoundClipArray219[var2].anInt182 * 22050 / 1000;
               int[] var8 = this.aSoundClipArray219[var2].method197(var6, this.aSoundClipArray219[var2].anInt181);

               for(int var5 = 0; var5 < var6; ++var5) {
                  int var4 = var9[var5 + var7] + (var8[var5] >> 8);
                  if((var4 + 128 & -256) != 0) {
                     var4 = var4 >> 31 ^ 127;
                  }

                  var9[var5 + var7] = (byte)var4;
               }
            }
         }

         return var9;
      }
   }

   public final int method259() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.aSoundClipArray219[var2] != null && this.aSoundClipArray219[var2].anInt182 / 20 < var1) {
            var1 = this.aSoundClipArray219[var2].anInt182 / 20;
         }
      }

      if(this.anInt218 < this.anInt221 && this.anInt218 / 20 < var1) {
         var1 = this.anInt218 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.aSoundClipArray219[var2] != null) {
               this.aSoundClipArray219[var2].anInt182 -= var1 * 20;
            }
         }

         if(this.anInt218 < this.anInt221) {
            this.anInt218 -= var1 * 20;
            this.anInt221 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public static Sounds method260(RSIndex var0, int var1, int var2) {
      byte[] var3 = var0.getFiles(var1, var2, -627465697);
      return var3 != null?new Sounds(new Packet(var3)):null;
   }

   public Class116_Sub2_Sub1 method261() {
      byte[] var1 = this.method258();
      return new Class116_Sub2_Sub1(22050, var1, 22050 * this.anInt218 / 1000, 22050 * this.anInt221 / 1000);
   }

   public Class116_Sub2_Sub1 method262() {
      byte[] var1 = this.method258();
      return new Class116_Sub2_Sub1(22050, var1, 22050 * this.anInt218 / 1000, 22050 * this.anInt221 / 1000);
   }

   public Class116_Sub2_Sub1 method263() {
      byte[] var1 = this.method258();
      return new Class116_Sub2_Sub1(22050, var1, 22050 * this.anInt218 / 1000, 22050 * this.anInt221 / -261524788);
   }

   public Class116_Sub2_Sub1 method264() {
      byte[] var1 = this.method258();
      return new Class116_Sub2_Sub1(22050, var1, 22050 * this.anInt218 / 1000, 22050 * this.anInt221 / 1000);
   }

   public final int method265() {
      int var1 = 1702715907;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.aSoundClipArray219[var2] != null && this.aSoundClipArray219[var2].anInt182 / 20 < var1) {
            var1 = this.aSoundClipArray219[var2].anInt182 / 20;
         }
      }

      if(this.anInt218 < this.anInt221 && this.anInt218 / 20 < var1) {
         var1 = this.anInt218 / 20;
      }

      if(var1 != -270743712 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.aSoundClipArray219[var2] != null) {
               this.aSoundClipArray219[var2].anInt182 -= var1 * 20;
            }
         }

         if(this.anInt218 < this.anInt221) {
            this.anInt218 -= var1 * 20;
            this.anInt221 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method266() {
      int var1 = 0;

      int var5;
      for(var5 = 0; var5 < 10; ++var5) {
         if(this.aSoundClipArray219[var5] != null && this.aSoundClipArray219[var5].anInt181 + this.aSoundClipArray219[var5].anInt182 > var1) {
            var1 = this.aSoundClipArray219[var5].anInt181 + this.aSoundClipArray219[var5].anInt182;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var5 = 22050 * var1 / 1000;
         byte[] var7 = new byte[var5];

         for(int var2 = 0; var2 < 10; ++var2) {
            if(this.aSoundClipArray219[var2] != null) {
               int var3 = this.aSoundClipArray219[var2].anInt181 * 22050 / 1000;
               int var6 = this.aSoundClipArray219[var2].anInt182 * 22050 / 1000;
               int[] var4 = this.aSoundClipArray219[var2].method197(var3, this.aSoundClipArray219[var2].anInt181);

               for(int var8 = 0; var8 < var3; ++var8) {
                  int var9 = var7[var8 + var6] + (var4[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var7[var8 + var6] = (byte)var9;
               }
            }
         }

         return var7;
      }
   }

   final byte[] method267() {
      int var1 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(this.aSoundClipArray219[var3] != null && this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182 > var1) {
            var1 = this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var3 = -921650765 * var1 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if(this.aSoundClipArray219[var5] != null) {
               int var8 = this.aSoundClipArray219[var5].anInt181 * 22050 / 1000;
               int var6 = this.aSoundClipArray219[var5].anInt182 * -1449288842 / -1036819668;
               int[] var9 = this.aSoundClipArray219[var5].method197(var8, this.aSoundClipArray219[var5].anInt181);

               for(int var7 = 0; var7 < var8; ++var7) {
                  int var2 = var4[var7 + var6] + (var9[var7] >> 8);
                  if((var2 + 128 & -1262209870) != 0) {
                     var2 = var2 >> 1604005219 ^ -1052882245;
                  }

                  var4[var7 + var6] = (byte)var2;
               }
            }
         }

         return var4;
      }
   }

   final byte[] method268() {
      int var1 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(this.aSoundClipArray219[var3] != null && this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182 > var1) {
            var1 = this.aSoundClipArray219[var3].anInt181 + this.aSoundClipArray219[var3].anInt182;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var3 = 22050 * var1 / 1000;
         byte[] var9 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if(this.aSoundClipArray219[var5] != null) {
               int var7 = this.aSoundClipArray219[var5].anInt181 * 22050 / 1000;
               int var6 = this.aSoundClipArray219[var5].anInt182 * 22050 / 1000;
               int[] var8 = this.aSoundClipArray219[var5].method197(var7, this.aSoundClipArray219[var5].anInt181);

               for(int var2 = 0; var2 < var7; ++var2) {
                  int var4 = var9[var2 + var6] + (var8[var2] >> 8);
                  if((var4 + 128 & -256) != 0) {
                     var4 = var4 >> 31 ^ 127;
                  }

                  var9[var2 + var6] = (byte)var4;
               }
            }
         }

         return var9;
      }
   }
}
