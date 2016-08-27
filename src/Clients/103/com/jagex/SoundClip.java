package com.jagex;
import java.util.Random;

public class SoundClip {

   Class12 aClass12_166;
   MidiSeq aMidiSeq_167;
   int[] anIntArray168 = new int[]{0, 0, 0, 0, 0};
   static int[] anIntArray169;
   MidiSeq aMidiSeq_170;
   static int[] anIntArray171;
   MidiSeq aMidiSeq_172;
   MidiSeq aMidiSeq_173;
   static int[] anIntArray174;
   int[] anIntArray175 = new int[]{0, 0, 0, 0, 0};
   int[] anIntArray176 = new int[]{0, 0, 0, 0, 0};
   int anInt177 = 0;
   int anInt178 = 100;
   MidiSeq aMidiSeq_179;
   MidiSeq aMidiSeq_180;
   int anInt181 = 500;
   int anInt182 = 0;
   MidiSeq aMidiSeq_183;
   static int[] anIntArray184 = new int['\u8000'];
   static int[] anIntArray185;
   MidiSeq aMidiSeq_187;
   MidiSeq aMidiSeq_188;
   static int[] anIntArray189;
   static int[] anIntArray190;
   static int[] anIntArray191;


   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray184[var1] = (var0.nextInt() & 2) - 1;
      }

      anIntArray185 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray185[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      anIntArray171 = new int[220500];
      anIntArray174 = new int[5];
      anIntArray169 = new int[5];
      anIntArray189 = new int[5];
      anIntArray190 = new int[5];
      anIntArray191 = new int[5];
   }

   final int[] method197(int var1, int var2) {
      Class56.method823(anIntArray171, 0, var1);
      if(var2 < 10) {
         return anIntArray171;
      } else {
         double var6 = (double)var1 / ((double)var2 + 0.0D);
         this.aMidiSeq_179.resetValues();
         this.aMidiSeq_167.resetValues();
         int var14 = 0;
         int var13 = 0;
         int var18 = 0;
         if(this.aMidiSeq_188 != null) {
            this.aMidiSeq_188.resetValues();
            this.aMidiSeq_173.resetValues();
            var14 = (int)((double)(this.aMidiSeq_188.anInt225 - this.aMidiSeq_188.anInt222) * 32.768D / var6);
            var13 = (int)((double)this.aMidiSeq_188.anInt222 * 32.768D / var6);
         }

         int var12 = 0;
         int var15 = 0;
         int var16 = 0;
         if(this.aMidiSeq_170 != null) {
            this.aMidiSeq_170.resetValues();
            this.aMidiSeq_183.resetValues();
            var12 = (int)((double)(this.aMidiSeq_170.anInt225 - this.aMidiSeq_170.anInt222) * 32.768D / var6);
            var15 = (int)((double)this.aMidiSeq_170.anInt222 * 32.768D / var6);
         }

         int var10;
         for(var10 = 0; var10 < 5; ++var10) {
            if(this.anIntArray168[var10] != 0) {
               anIntArray174[var10] = 0;
               anIntArray169[var10] = (int)((double)this.anIntArray176[var10] * var6);
               anIntArray189[var10] = (this.anIntArray168[var10] << 14) / 100;
               anIntArray190[var10] = (int)((double)(this.aMidiSeq_179.anInt225 - this.aMidiSeq_179.anInt222) * 32.768D * Math.pow(1.0057929410678534D, (double)this.anIntArray175[var10]) / var6);
               anIntArray191[var10] = (int)((double)this.aMidiSeq_179.anInt222 * 32.768D / var6);
            }
         }

         int var3;
         int var4;
         int var11;
         int var17;
         for(var10 = 0; var10 < var1; ++var10) {
            var4 = this.aMidiSeq_179.method273(var1);
            var11 = this.aMidiSeq_167.method273(var1);
            if(this.aMidiSeq_188 != null) {
               var3 = this.aMidiSeq_188.method273(var1);
               var17 = this.aMidiSeq_173.method273(var1);
               var4 += this.method202(var18, var17, this.aMidiSeq_188.anInt227) >> 1;
               var18 += (var3 * var14 >> 16) + var13;
            }

            if(this.aMidiSeq_170 != null) {
               var3 = this.aMidiSeq_170.method273(var1);
               var17 = this.aMidiSeq_183.method273(var1);
               var11 = var11 * ((this.method202(var16, var17, this.aMidiSeq_170.anInt227) >> 1) + '\u8000') >> 15;
               var16 += (var3 * var12 >> 16) + var15;
            }

            for(var3 = 0; var3 < 5; ++var3) {
               if(this.anIntArray168[var3] != 0) {
                  var17 = var10 + anIntArray169[var3];
                  if(var17 < var1) {
                     anIntArray171[var17] += this.method202(anIntArray174[var3], var11 * anIntArray189[var3] >> 15, this.aMidiSeq_179.anInt227);
                     anIntArray174[var3] += (var4 * anIntArray190[var3] >> 16) + anIntArray191[var3];
                  }
               }
            }
         }

         int var8;
         if(this.aMidiSeq_172 != null) {
            this.aMidiSeq_172.resetValues();
            this.aMidiSeq_187.resetValues();
            var10 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var3 = 0; var3 < var1; ++var3) {
               var17 = this.aMidiSeq_172.method273(var1);
               var8 = this.aMidiSeq_187.method273(var1);
               if(var20) {
                  var4 = this.aMidiSeq_172.anInt222 + ((this.aMidiSeq_172.anInt225 - this.aMidiSeq_172.anInt222) * var17 >> 8);
               } else {
                  var4 = this.aMidiSeq_172.anInt222 + ((this.aMidiSeq_172.anInt225 - this.aMidiSeq_172.anInt222) * var8 >> 8);
               }

               var10 += 256;
               if(var10 >= var4) {
                  var10 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  anIntArray171[var3] = 0;
               }
            }
         }

         if(this.anInt177 > 0 && this.anInt178 > 0) {
            var10 = (int)((double)this.anInt177 * var6);

            for(var4 = var10; var4 < var1; ++var4) {
               anIntArray171[var4] += anIntArray171[var4 - var10] * this.anInt178 / 100;
            }
         }

         if(this.aClass12_166.anIntArray202[0] > 0 || this.aClass12_166.anIntArray202[1] > 0) {
            this.aMidiSeq_180.resetValues();
            var10 = this.aMidiSeq_180.method273(var1 + 1);
            var4 = this.aClass12_166.method210(0, (float)var10 / 65536.0F);
            var11 = this.aClass12_166.method210(1, (float)var10 / 65536.0F);
            if(var1 >= var4 + var11) {
               var3 = 0;
               var17 = var11;
               if(var11 > var1 - var4) {
                  var17 = var1 - var4;
               }

               int var9;
               while(var3 < var17) {
                  var8 = (int)((long)anIntArray171[var3 + var4] * (long)Class12.anInt200 >> 16);

                  for(var9 = 0; var9 < var4; ++var9) {
                     var8 += (int)((long)anIntArray171[var3 + var4 - 1 - var9] * (long)Class12.anIntArrayArray198[0][var9] >> 16);
                  }

                  for(var9 = 0; var9 < var3; ++var9) {
                     var8 -= (int)((long)anIntArray171[var3 - 1 - var9] * (long)Class12.anIntArrayArray198[1][var9] >> 16);
                  }

                  anIntArray171[var3] = var8;
                  var10 = this.aMidiSeq_180.method273(var1 + 1);
                  ++var3;
               }

               var17 = 128;

               while(true) {
                  if(var17 > var1 - var4) {
                     var17 = var1 - var4;
                  }

                  int var5;
                  while(var3 < var17) {
                     var9 = (int)((long)anIntArray171[var3 + var4] * (long)Class12.anInt200 >> 16);

                     for(var5 = 0; var5 < var4; ++var5) {
                        var9 += (int)((long)anIntArray171[var3 + var4 - 1 - var5] * (long)Class12.anIntArrayArray198[0][var5] >> 16);
                     }

                     for(var5 = 0; var5 < var11; ++var5) {
                        var9 -= (int)((long)anIntArray171[var3 - 1 - var5] * (long)Class12.anIntArrayArray198[1][var5] >> 16);
                     }

                     anIntArray171[var3] = var9;
                     var10 = this.aMidiSeq_180.method273(var1 + 1);
                     ++var3;
                  }

                  if(var3 >= var1 - var4) {
                     while(var3 < var1) {
                        var9 = 0;

                        for(var5 = var3 + var4 - var1; var5 < var4; ++var5) {
                           var9 += (int)((long)anIntArray171[var3 + var4 - 1 - var5] * (long)Class12.anIntArrayArray198[0][var5] >> 16);
                        }

                        for(var5 = 0; var5 < var11; ++var5) {
                           var9 -= (int)((long)anIntArray171[var3 - 1 - var5] * (long)Class12.anIntArrayArray198[1][var5] >> 16);
                        }

                        anIntArray171[var3] = var9;
                        this.aMidiSeq_180.method273(var1 + 1);
                        ++var3;
                     }
                     break;
                  }

                  var4 = this.aClass12_166.method210(0, (float)var10 / 65536.0F);
                  var11 = this.aClass12_166.method210(1, (float)var10 / 65536.0F);
                  var17 += 128;
               }
            }
         }

         for(var10 = 0; var10 < var1; ++var10) {
            if(anIntArray171[var10] < -32768) {
               anIntArray171[var10] = -32768;
            }

            if(anIntArray171[var10] > 32767) {
               anIntArray171[var10] = 32767;
            }
         }

         return anIntArray171;
      }
   }

   final void method199(Packet var1) {
      this.aMidiSeq_179 = new MidiSeq();
      this.aMidiSeq_179.applyData(var1);
      this.aMidiSeq_167 = new MidiSeq();
      this.aMidiSeq_167.applyData(var1);
      int var3 = var1.readSignedByte(1708176767);
      if(var3 != 0) {
         var1.position -= -184175589;
         this.aMidiSeq_188 = new MidiSeq();
         this.aMidiSeq_188.applyData(var1);
         this.aMidiSeq_173 = new MidiSeq();
         this.aMidiSeq_173.applyData(var1);
      }

      var3 = var1.readSignedByte(1708176767);
      if(var3 != 0) {
         var1.position -= -184175589;
         this.aMidiSeq_170 = new MidiSeq();
         this.aMidiSeq_170.applyData(var1);
         this.aMidiSeq_183 = new MidiSeq();
         this.aMidiSeq_183.applyData(var1);
      }

      var3 = var1.readSignedByte(1708176767);
      if(var3 != 0) {
         var1.position -= -184175589;
         this.aMidiSeq_172 = new MidiSeq();
         this.aMidiSeq_172.applyData(var1);
         this.aMidiSeq_187 = new MidiSeq();
         this.aMidiSeq_187.applyData(var1);
      }

      for(int var4 = 0; var4 < 10; ++var4) {
         int var2 = var1.readSmartC(-1934264194);
         if(var2 == 0) {
            break;
         }

         this.anIntArray168[var4] = var2;
         this.anIntArray175[var4] = var1.readSmart(-699566514);
         this.anIntArray176[var4] = var1.readSmartC(-1059436450);
      }

      this.anInt177 = var1.readSmartC(195025886);
      this.anInt178 = var1.readSmartC(1760556139);
      this.anInt181 = var1.readUnsignedShort(1298607588);
      this.anInt182 = var1.readUnsignedShort(624424616);
      this.aClass12_166 = new Class12();
      this.aMidiSeq_180 = new MidiSeq();
      this.aClass12_166.method215(var1, this.aMidiSeq_180);
   }


   final int method202(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?anIntArray185[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?anIntArray184[var1 / 2607 & 32767] * var2:0)));
   }

}
