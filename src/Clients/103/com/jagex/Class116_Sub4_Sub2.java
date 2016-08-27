package com.jagex;

public class Class116_Sub4_Sub2 extends Class116_Sub4 {

   int anInt2454;
   int anInt2455;
   boolean aBool2456;
   int anInt2457;
   int anInt2458;
   int anInt2459;
   int anInt2460;
   int anInt2461;
   int anInt2462;
   int anInt2463;
   int anInt2464;
   int anInt2465;
   int anInt2466;
   int anInt2467;
   int anInt2468;


   public synchronized void method1911(int var1) {
      if(this.anInt2464 > 0) {
         if(var1 >= this.anInt2464) {
            if(this.anInt2462 == Integer.MIN_VALUE) {
               this.anInt2462 = 0;
               this.anInt2460 = 0;
               this.anInt2459 = 0;
               this.anInt2461 = 0;
               this.unlink();
               var1 = this.anInt2464;
            }

            this.anInt2464 = 0;
            this.method2736();
         } else {
            this.anInt2461 += this.anInt2466 * var1;
            this.anInt2459 += this.anInt2465 * var1;
            this.anInt2460 += this.anInt2468 * var1;
            this.anInt2464 -= var1;
         }
      }

      Class116_Sub2_Sub1 var2 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
      int var4 = this.anInt2463 << 8;
      int var5 = this.anInt2454 << 8;
      int var7 = var2.aByteArray2442.length << 8;
      int var6 = var5 - var4;
      if(var6 <= 0) {
         this.anInt2467 = 0;
      }

      if(this.anInt2458 < 0) {
         if(this.anInt2455 <= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = 0;
      }

      if(this.anInt2458 >= var7) {
         if(this.anInt2455 >= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = var7 - 1;
      }

      this.anInt2458 += this.anInt2455 * var1;
      if(this.anInt2467 < 0) {
         if(!this.aBool2456) {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var5 - 1 - (var5 - 1 - this.anInt2458) % var6;
            } else {
               if(this.anInt2458 < var5) {
                  return;
               }

               this.anInt2458 = var4 + (this.anInt2458 - var4) % var6;
            }

         } else {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

            while(this.anInt2458 >= var5) {
               this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

         }
      } else {
         if(this.anInt2467 > 0) {
            if(this.aBool2456) {
               label166: {
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break label166;
                     }
                  }

                  do {
                     if(this.anInt2458 < var5) {
                        return;
                     }

                     this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break;
                     }

                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                  } while(--this.anInt2467 != 0);
               }
            } else {
               label176: {
                  int var3;
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     var3 = (var5 - 1 - this.anInt2458) / var6;
                     if(var3 >= this.anInt2467) {
                        this.anInt2458 += var6 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label176;
                     }

                     this.anInt2458 += var6 * var3;
                     this.anInt2467 -= var3;
                  } else {
                     if(this.anInt2458 < var5) {
                        return;
                     }

                     var3 = (this.anInt2458 - var4) / var6;
                     if(var3 >= this.anInt2467) {
                        this.anInt2458 -= var6 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label176;
                     }

                     this.anInt2458 -= var6 * var3;
                     this.anInt2467 -= var3;
                  }

                  return;
               }
            }
         }

         if(this.anInt2455 < 0) {
            if(this.anInt2458 < 0) {
               this.anInt2458 = -1;
               this.method2781();
               this.unlink();
            }
         } else if(this.anInt2458 >= var7) {
            this.anInt2458 = var7;
            this.method2781();
            this.unlink();
         }

      }
   }

   static int method2732(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   public static Class116_Sub4_Sub2 method2733(Class116_Sub2_Sub1 var0, int var1, int var2, int var3) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, var1, var2, var3):null;
   }

   Class116_Sub4_Sub2(Class116_Sub2_Sub1 var1, int var2, int var3) {
      this.aClass116_Sub2_1719 = var1;
      this.anInt2463 = var1.anInt2440;
      this.anInt2454 = var1.anInt2439;
      this.aBool2456 = var1.aBool2438;
      this.anInt2455 = var2;
      this.anInt2462 = var3;
      this.anInt2457 = 8192;
      this.anInt2458 = 0;
      this.method2736();
   }

   Class116_Sub4_Sub2(Class116_Sub2_Sub1 var1, int var2, int var3, int var4) {
      this.aClass116_Sub2_1719 = var1;
      this.anInt2463 = var1.anInt2440;
      this.anInt2454 = var1.anInt2439;
      this.aBool2456 = var1.aBool2438;
      this.anInt2455 = var2;
      this.anInt2462 = var3;
      this.anInt2457 = var4;
      this.anInt2458 = 0;
      this.method2736();
   }

   public synchronized int method2734() {
      return this.anInt2457 < 0?-1:this.anInt2457;
   }

   static int method2735(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   void method2736() {
      this.anInt2461 = this.anInt2462;
      this.anInt2459 = method2822(this.anInt2462, this.anInt2457);
      this.anInt2460 = method2732(this.anInt2462, this.anInt2457);
   }

   public synchronized void method2737(int var1) {
      this.anInt2467 = var1;
   }

   public synchronized void method2738(int var1) {
      this.method2740(var1 << 6, this.method2742());
   }

   synchronized void method2739(int var1) {
      this.method2740(var1, this.method2742());
   }

   synchronized void method2740(int var1, int var2) {
      this.anInt2462 = var1;
      this.anInt2457 = var2;
      this.anInt2464 = 0;
      this.method2736();
   }

   static int method2741(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 734102534 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   public synchronized int method2742() {
      return this.anInt2457 < 0?-1:this.anInt2457;
   }

   public synchronized void method2743(int var1) {
      int var2 = ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.anInt2458 = var1;
   }

   public synchronized void method2744(boolean var1) {
      this.anInt2455 = (this.anInt2455 ^ this.anInt2455 >> 31) + (this.anInt2455 >>> 31);
      if(var1) {
         this.anInt2455 = -this.anInt2455;
      }

   }

   public synchronized void method2745(boolean var1) {
      this.anInt2455 = (this.anInt2455 ^ this.anInt2455 >> 31) + (this.anInt2455 >>> 31);
      if(var1) {
         this.anInt2455 = -this.anInt2455;
      }

   }

   public synchronized void method2746(int var1, int var2) {
      this.method2772(var1, var2, this.method2742());
   }

   static int method2747(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   public synchronized void method2748(int var1) {
      if(var1 == 0) {
         this.method2739(0);
         this.unlink();
      } else if(this.anInt2459 == 0 && this.anInt2460 == 0) {
         this.anInt2464 = 0;
         this.anInt2462 = 0;
         this.anInt2461 = 0;
         this.unlink();
      } else {
         int var2 = -this.anInt2461;
         if(this.anInt2461 > var2) {
            var2 = this.anInt2461;
         }

         if(-this.anInt2459 > var2) {
            var2 = -this.anInt2459;
         }

         if(this.anInt2459 > var2) {
            var2 = this.anInt2459;
         }

         if(-this.anInt2460 > var2) {
            var2 = -this.anInt2460;
         }

         if(this.anInt2460 > var2) {
            var2 = this.anInt2460;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.anInt2464 = var1;
         this.anInt2462 = Integer.MIN_VALUE;
         this.anInt2466 = -this.anInt2461 / var1;
         this.anInt2465 = -this.anInt2459 / var1;
         this.anInt2468 = -this.anInt2460 / var1;
      }
   }

   public synchronized void method2749(int var1) {
      if(this.anInt2455 >= 0) {
         this.anInt2455 = var1;
      } else {
         this.anInt2455 = -var1;
      }

   }

   static int method2750(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   public boolean method2751() {
      return this.anInt2458 < 0 || this.anInt2458 >= ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
   }

   public boolean method2752() {
      return this.anInt2464 != 0;
   }

   static int method2753(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 633359260 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 1671611565);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   protected Class116_Sub4 method1913() {
      return null;
   }

   protected int method1909() {
      return this.anInt2462 == 0 && this.anInt2464 == 0?0:1;
   }

   protected Class116_Sub4 method1907() {
      return null;
   }

   public synchronized int method2754() {
      return this.anInt2455 >= 0?this.anInt2455:-this.anInt2455;
   }

   int method2755(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2765(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2764(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2769(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2768(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2735(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2758(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2775(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2762(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   int method2756(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2785(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2766(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2771(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2770(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2858(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2827(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2853(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2774(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   boolean method2757() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2822(var1, this.anInt2457);
         var3 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var2 && this.anInt2460 == var3) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var2) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2459) {
               this.anInt2464 = var2 - this.anInt2459;
            }
         } else if(this.anInt2459 > var2) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var2) {
               this.anInt2464 = this.anInt2459 - var2;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var3) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2460) {
               this.anInt2464 = var3 - this.anInt2460;
            }
         } else if(this.anInt2460 > var3) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var3) {
               this.anInt2464 = this.anInt2460 - var3;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   static int method2758(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2759(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   int method2760(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == 256 && (this.anInt2458 & -1167851366) == 0) {
               if(Class9.aBool144) {
                  var2 = method2765(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2764(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2769(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2768(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == 967052595 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2735(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2758(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2775(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2762(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   static int method2761(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2762(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2458 = var4;
      return var5;
   }

   int method1916() {
      int var1 = this.anInt2461 * 3 >> 6;
      var1 = (var1 ^ var1 >> -1621216227) + (var1 >>> -511626309);
      if(this.anInt2467 == 0) {
         var1 -= var1 * this.anInt2458 / (((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8);
      } else if(this.anInt2467 >= 0) {
         var1 -= var1 * this.anInt2463 / ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length;
      }

      return var1 > -1150096222?1839781084:var1;
   }

   public synchronized int method2763() {
      return this.anInt2455 < 0?-this.anInt2455:this.anInt2455;
   }

   int method1923() {
      int var1 = this.anInt2461 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.anInt2467 == 0) {
         var1 -= var1 * this.anInt2458 / (((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8);
      } else if(this.anInt2467 >= 0) {
         var1 -= var1 * this.anInt2463 / ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length;
      }

      return var1 > 255?255:var1;
   }

   static int method2764(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2765(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2766(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   public boolean method2767() {
      return this.anInt2464 != 0;
   }

   static int method2768(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2769(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   static int method2770(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2771(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   protected Class116_Sub4 method1910() {
      return null;
   }

   public synchronized void method2772(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2740(var2, var3);
      } else {
         int var6 = method2822(var2, var3);
         int var5 = method2732(var2, var3);
         if(this.anInt2459 == var6 && this.anInt2460 == var5) {
            this.anInt2464 = 0;
         } else {
            int var4 = var2 - this.anInt2461;
            if(this.anInt2461 - var2 > var4) {
               var4 = this.anInt2461 - var2;
            }

            if(var6 - this.anInt2459 > var4) {
               var4 = var6 - this.anInt2459;
            }

            if(this.anInt2459 - var6 > var4) {
               var4 = this.anInt2459 - var6;
            }

            if(var5 - this.anInt2460 > var4) {
               var4 = var5 - this.anInt2460;
            }

            if(this.anInt2460 - var5 > var4) {
               var4 = this.anInt2460 - var5;
            }

            if(var1 > var4) {
               var1 = var4;
            }

            this.anInt2464 = var1;
            this.anInt2462 = var2;
            this.anInt2457 = var3;
            this.anInt2466 = (var2 - this.anInt2461) / var1;
            this.anInt2465 = (var6 - this.anInt2459) / var1;
            this.anInt2468 = (var5 - this.anInt2460) / var1;
         }
      }
   }

   protected Class116_Sub4 method1914() {
      return null;
   }

   protected Class116_Sub4 method1915() {
      return null;
   }

   protected int method1905() {
      return this.anInt2462 == 0 && this.anInt2464 == 0?0:1;
   }

   int method1925() {
      int var1 = this.anInt2461 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.anInt2467 == 0) {
         var1 -= var1 * this.anInt2458 / (((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8);
      } else if(this.anInt2467 >= 0) {
         var1 -= var1 * this.anInt2463 / ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length;
      }

      return var1 > 255?255:var1;
   }

   public synchronized void method2773(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2740(var2, var3);
      } else {
         int var5 = method2822(var2, var3);
         int var6 = method2732(var2, var3);
         if(this.anInt2459 == var5 && this.anInt2460 == var6) {
            this.anInt2464 = 0;
         } else {
            int var4 = var2 - this.anInt2461;
            if(this.anInt2461 - var2 > var4) {
               var4 = this.anInt2461 - var2;
            }

            if(var5 - this.anInt2459 > var4) {
               var4 = var5 - this.anInt2459;
            }

            if(this.anInt2459 - var5 > var4) {
               var4 = this.anInt2459 - var5;
            }

            if(var6 - this.anInt2460 > var4) {
               var4 = var6 - this.anInt2460;
            }

            if(this.anInt2460 - var6 > var4) {
               var4 = this.anInt2460 - var6;
            }

            if(var1 > var4) {
               var1 = var4;
            }

            this.anInt2464 = var1;
            this.anInt2462 = var2;
            this.anInt2457 = var3;
            this.anInt2466 = (var2 - this.anInt2461) / var1;
            this.anInt2465 = (var5 - this.anInt2459) / var1;
            this.anInt2468 = (var6 - this.anInt2460) / var1;
         }
      }
   }

   public synchronized void method1920(int var1) {
      if(this.anInt2464 > 0) {
         if(var1 >= this.anInt2464) {
            if(this.anInt2462 == Integer.MIN_VALUE) {
               this.anInt2462 = 0;
               this.anInt2460 = 0;
               this.anInt2459 = 0;
               this.anInt2461 = 0;
               this.unlink();
               var1 = this.anInt2464;
            }

            this.anInt2464 = 0;
            this.method2736();
         } else {
            this.anInt2461 += this.anInt2466 * var1;
            this.anInt2459 += this.anInt2465 * var1;
            this.anInt2460 += this.anInt2468 * var1;
            this.anInt2464 -= var1;
         }
      }

      Class116_Sub2_Sub1 var4 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
      int var3 = this.anInt2463 << 8;
      int var5 = this.anInt2454 << 8;
      int var2 = var4.aByteArray2442.length << 8;
      int var6 = var5 - var3;
      if(var6 <= 0) {
         this.anInt2467 = 0;
      }

      if(this.anInt2458 < 0) {
         if(this.anInt2455 <= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = 0;
      }

      if(this.anInt2458 >= var2) {
         if(this.anInt2455 >= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = var2 - 1;
      }

      this.anInt2458 += this.anInt2455 * var1;
      if(this.anInt2467 < 0) {
         if(!this.aBool2456) {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var3) {
                  return;
               }

               this.anInt2458 = var5 - 1 - (var5 - 1 - this.anInt2458) % var6;
            } else {
               if(this.anInt2458 < var5) {
                  return;
               }

               this.anInt2458 = var3 + (this.anInt2458 - var3) % var6;
            }

         } else {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var3) {
                  return;
               }

               this.anInt2458 = var3 + var3 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

            while(this.anInt2458 >= var5) {
               this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
               if(this.anInt2458 >= var3) {
                  return;
               }

               this.anInt2458 = var3 + var3 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

         }
      } else {
         if(this.anInt2467 > 0) {
            if(this.aBool2456) {
               label157: {
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var3) {
                        return;
                     }

                     this.anInt2458 = var3 + var3 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break label157;
                     }
                  }

                  do {
                     if(this.anInt2458 < var5) {
                        return;
                     }

                     this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break;
                     }

                     if(this.anInt2458 >= var3) {
                        return;
                     }

                     this.anInt2458 = var3 + var3 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                  } while(--this.anInt2467 != 0);
               }
            } else {
               label167: {
                  int var7;
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var3) {
                        return;
                     }

                     var7 = (var5 - 1 - this.anInt2458) / var6;
                     if(var7 >= this.anInt2467) {
                        this.anInt2458 += var6 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label167;
                     }

                     this.anInt2458 += var6 * var7;
                     this.anInt2467 -= var7;
                  } else {
                     if(this.anInt2458 < var5) {
                        return;
                     }

                     var7 = (this.anInt2458 - var3) / var6;
                     if(var7 >= this.anInt2467) {
                        this.anInt2458 -= var6 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label167;
                     }

                     this.anInt2458 -= var6 * var7;
                     this.anInt2467 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.anInt2455 < 0) {
            if(this.anInt2458 < 0) {
               this.anInt2458 = -1;
               this.method2781();
               this.unlink();
            }
         } else if(this.anInt2458 >= var2) {
            this.anInt2458 = var2;
            this.method2781();
            this.unlink();
         }

      }
   }

   static int method2774(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2458 = var4;
      return var5;
   }

   static int method2775(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   public synchronized void method1908(int var1) {
      if(this.anInt2464 > 0) {
         if(var1 >= this.anInt2464) {
            if(this.anInt2462 == Integer.MIN_VALUE) {
               this.anInt2462 = 0;
               this.anInt2460 = 0;
               this.anInt2459 = 0;
               this.anInt2461 = 0;
               this.unlink();
               var1 = this.anInt2464;
            }

            this.anInt2464 = 0;
            this.method2736();
         } else {
            this.anInt2461 += this.anInt2466 * var1;
            this.anInt2459 += this.anInt2465 * var1;
            this.anInt2460 += this.anInt2468 * var1;
            this.anInt2464 -= var1;
         }
      }

      Class116_Sub2_Sub1 var2 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
      int var7 = this.anInt2463 << 8;
      int var6 = this.anInt2454 << 8;
      int var3 = var2.aByteArray2442.length << 8;
      int var4 = var6 - var7;
      if(var4 <= 0) {
         this.anInt2467 = 0;
      }

      if(this.anInt2458 < 0) {
         if(this.anInt2455 <= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = 0;
      }

      if(this.anInt2458 >= var3) {
         if(this.anInt2455 >= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = var3 - 1;
      }

      this.anInt2458 += this.anInt2455 * var1;
      if(this.anInt2467 < 0) {
         if(!this.aBool2456) {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var7) {
                  return;
               }

               this.anInt2458 = var6 - 1 - (var6 - 1 - this.anInt2458) % var4;
            } else {
               if(this.anInt2458 < var6) {
                  return;
               }

               this.anInt2458 = var7 + (this.anInt2458 - var7) % var4;
            }

         } else {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var7) {
                  return;
               }

               this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

            while(this.anInt2458 >= var6) {
               this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
               if(this.anInt2458 >= var7) {
                  return;
               }

               this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

         }
      } else {
         if(this.anInt2467 > 0) {
            if(this.aBool2456) {
               label169: {
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var7) {
                        return;
                     }

                     this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break label169;
                     }
                  }

                  do {
                     if(this.anInt2458 < var6) {
                        return;
                     }

                     this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break;
                     }

                     if(this.anInt2458 >= var7) {
                        return;
                     }

                     this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                  } while(--this.anInt2467 != 0);
               }
            } else {
               label179: {
                  int var5;
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var7) {
                        return;
                     }

                     var5 = (var6 - 1 - this.anInt2458) / var4;
                     if(var5 >= this.anInt2467) {
                        this.anInt2458 += var4 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label179;
                     }

                     this.anInt2458 += var4 * var5;
                     this.anInt2467 -= var5;
                  } else {
                     if(this.anInt2458 < var6) {
                        return;
                     }

                     var5 = (this.anInt2458 - var7) / var4;
                     if(var5 >= this.anInt2467) {
                        this.anInt2458 -= var4 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label179;
                     }

                     this.anInt2458 -= var4 * var5;
                     this.anInt2467 -= var5;
                  }

                  return;
               }
            }
         }

         if(this.anInt2455 < 0) {
            if(this.anInt2458 < 0) {
               this.anInt2458 = -1;
               this.method2781();
               this.unlink();
            }
         } else if(this.anInt2458 >= var3) {
            this.anInt2458 = var3;
            this.method2781();
            this.unlink();
         }

      }
   }

   public synchronized int method2776() {
      return this.anInt2462 == Integer.MIN_VALUE?0:this.anInt2462;
   }

   static int method2777(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(-1905685609 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method2778(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(1460288937 - var1) * 1.220703125E-4D) + 0.5D);
   }

   public synchronized int method2779() {
      return this.anInt2462 == -1346552575?0:this.anInt2462;
   }

   static int method2780(int var0, int var1) {
      return var1 >= 0?(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D):-var0;
   }

   int method1924() {
      int var1 = this.anInt2461 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.anInt2467 == 0) {
         var1 -= var1 * this.anInt2458 / (((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8);
      } else if(this.anInt2467 >= 0) {
         var1 -= var1 * this.anInt2463 / ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length;
      }

      return var1 > 255?1282923729:var1;
   }

   void method2781() {
      if(this.anInt2464 != 0) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
         }

         this.anInt2464 = 0;
         this.method2736();
      }

   }

   public synchronized void method1921(int var1) {
      if(this.anInt2464 > 0) {
         if(var1 >= this.anInt2464) {
            if(this.anInt2462 == Integer.MIN_VALUE) {
               this.anInt2462 = 0;
               this.anInt2460 = 0;
               this.anInt2459 = 0;
               this.anInt2461 = 0;
               this.unlink();
               var1 = this.anInt2464;
            }

            this.anInt2464 = 0;
            this.method2736();
         } else {
            this.anInt2461 += this.anInt2466 * var1;
            this.anInt2459 += this.anInt2465 * var1;
            this.anInt2460 += this.anInt2468 * var1;
            this.anInt2464 -= var1;
         }
      }

      Class116_Sub2_Sub1 var6 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
      int var4 = this.anInt2463 << 8;
      int var2 = this.anInt2454 << 8;
      int var7 = var6.aByteArray2442.length << 8;
      int var5 = var2 - var4;
      if(var5 <= 0) {
         this.anInt2467 = 0;
      }

      if(this.anInt2458 < 0) {
         if(this.anInt2455 <= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = 0;
      }

      if(this.anInt2458 >= var7) {
         if(this.anInt2455 >= 0) {
            this.method2781();
            this.unlink();
            return;
         }

         this.anInt2458 = var7 - 1;
      }

      this.anInt2458 += this.anInt2455 * var1;
      if(this.anInt2467 < 0) {
         if(!this.aBool2456) {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var2 - 1 - (var2 - 1 - this.anInt2458) % var5;
            } else {
               if(this.anInt2458 < var2) {
                  return;
               }

               this.anInt2458 = var4 + (this.anInt2458 - var4) % var5;
            }

         } else {
            if(this.anInt2455 < 0) {
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

            while(this.anInt2458 >= var2) {
               this.anInt2458 = var2 + var2 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
               if(this.anInt2458 >= var4) {
                  return;
               }

               this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
               this.anInt2455 = -this.anInt2455;
            }

         }
      } else {
         if(this.anInt2467 > 0) {
            if(this.aBool2456) {
               label165: {
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break label165;
                     }
                  }

                  do {
                     if(this.anInt2458 < var2) {
                        return;
                     }

                     this.anInt2458 = var2 + var2 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                     if(--this.anInt2467 == 0) {
                        break;
                     }

                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                     this.anInt2455 = -this.anInt2455;
                  } while(--this.anInt2467 != 0);
               }
            } else {
               label175: {
                  int var3;
                  if(this.anInt2455 < 0) {
                     if(this.anInt2458 >= var4) {
                        return;
                     }

                     var3 = (var2 - 1 - this.anInt2458) / var5;
                     if(var3 >= this.anInt2467) {
                        this.anInt2458 += var5 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label175;
                     }

                     this.anInt2458 += var5 * var3;
                     this.anInt2467 -= var3;
                  } else {
                     if(this.anInt2458 < var2) {
                        return;
                     }

                     var3 = (this.anInt2458 - var4) / var5;
                     if(var3 >= this.anInt2467) {
                        this.anInt2458 -= var5 * this.anInt2467;
                        this.anInt2467 = 0;
                        break label175;
                     }

                     this.anInt2458 -= var5 * var3;
                     this.anInt2467 -= var3;
                  }

                  return;
               }
            }
         }

         if(this.anInt2455 < 0) {
            if(this.anInt2458 < 0) {
               this.anInt2458 = -1;
               this.method2781();
               this.unlink();
            }
         } else if(this.anInt2458 >= var7) {
            this.anInt2458 = var7;
            this.method2781();
            this.unlink();
         }

      }
   }

   public static Class116_Sub4_Sub2 method2782(Class116_Sub2_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, (int)((long)var0.anInt2441 * 256L * (long)var1 / (long)(Class9.anInt135 * -956524988)), var2 << 6):null;
   }

   public static Class116_Sub4_Sub2 method2783(Class116_Sub2_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, (int)((long)var0.anInt2441 * 256L * (long)var1 / (long)(Class9.anInt135 * -956524988)), var2 << 6):null;
   }

   public static Class116_Sub4_Sub2 method2784(Class116_Sub2_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, (int)((long)var0.anInt2441 * 256L * (long)var1 / (long)(Class9.anInt135 * -956524988)), var2 << 6):null;
   }

   static int method2785(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   public static Class116_Sub4_Sub2 method2786(Class116_Sub2_Sub1 var0, int var1, int var2, int var3) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, var1, var2, var3):null;
   }

   public static Class116_Sub4_Sub2 method2787(Class116_Sub2_Sub1 var0, int var1, int var2, int var3) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, var1, var2, var3):null;
   }

   public static Class116_Sub4_Sub2 method2788(Class116_Sub2_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, (int)((long)var0.anInt2441 * 256L * (long)var1 / (long)(Class9.anInt135 * -956524988)), var2 << 6):null;
   }

   boolean method2789() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2822(var1, this.anInt2457);
         var2 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var3 && this.anInt2460 == var2) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var3) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2459) {
               this.anInt2464 = var3 - this.anInt2459;
            }
         } else if(this.anInt2459 > var3) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var3) {
               this.anInt2464 = this.anInt2459 - var3;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var2) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2460) {
               this.anInt2464 = var2 - this.anInt2460;
            }
         } else if(this.anInt2460 > var2) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var2) {
               this.anInt2464 = this.anInt2460 - var2;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   public synchronized int method2790() {
      return this.anInt2457 < 0?-1:this.anInt2457;
   }

   public synchronized void method2791(int var1) {
      this.anInt2467 = var1;
   }

   static int method2792(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   public synchronized void method2793(int var1) {
      this.method2740(var1 << 6, this.method2742());
   }

   synchronized void method2794(int var1) {
      this.method2740(var1, this.method2742());
   }

   synchronized void method2795(int var1) {
      this.method2740(var1, this.method2742());
   }

   int method1906() {
      int var1 = this.anInt2461 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.anInt2467 == 0) {
         var1 -= var1 * this.anInt2458 / (((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8);
      } else if(this.anInt2467 >= 0) {
         var1 -= var1 * this.anInt2463 / ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length;
      }

      return var1 > 255?255:var1;
   }

   synchronized void method2796(int var1) {
      this.method2740(var1, this.method2742());
   }

   synchronized void method2797(int var1, int var2) {
      this.anInt2462 = var1;
      this.anInt2457 = var2;
      this.anInt2464 = 0;
      this.method2736();
   }

   synchronized void method2798(int var1, int var2) {
      this.anInt2462 = var1;
      this.anInt2457 = var2;
      this.anInt2464 = 0;
      this.method2736();
   }

   synchronized void method2799(int var1, int var2) {
      this.anInt2462 = var1;
      this.anInt2457 = var2;
      this.anInt2464 = 0;
      this.method2736();
   }

   public static Class116_Sub4_Sub2 method2800(Class116_Sub2_Sub1 var0, int var1, int var2) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, (int)((long)var0.anInt2441 * 256L * (long)var1 / (long)(Class9.anInt135 * -956524988)), var2 << 6):null;
   }

   public synchronized int method2801() {
      return this.anInt2462 == Integer.MIN_VALUE?0:this.anInt2462;
   }

   public synchronized int method2802() {
      return this.anInt2462 == Integer.MIN_VALUE?0:this.anInt2462;
   }

   public synchronized void method2803(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2740(var2, var3);
      } else {
         int var5 = method2822(var2, var3);
         int var6 = method2732(var2, var3);
         if(this.anInt2459 == var5 && this.anInt2460 == var6) {
            this.anInt2464 = 0;
         } else {
            int var4 = var2 - this.anInt2461;
            if(this.anInt2461 - var2 > var4) {
               var4 = this.anInt2461 - var2;
            }

            if(var5 - this.anInt2459 > var4) {
               var4 = var5 - this.anInt2459;
            }

            if(this.anInt2459 - var5 > var4) {
               var4 = this.anInt2459 - var5;
            }

            if(var6 - this.anInt2460 > var4) {
               var4 = var6 - this.anInt2460;
            }

            if(this.anInt2460 - var6 > var4) {
               var4 = this.anInt2460 - var6;
            }

            if(var1 > var4) {
               var1 = var4;
            }

            this.anInt2464 = var1;
            this.anInt2462 = var2;
            this.anInt2457 = var3;
            this.anInt2466 = (var2 - this.anInt2461) / var1;
            this.anInt2465 = (var5 - this.anInt2459) / var1;
            this.anInt2468 = (var6 - this.anInt2460) / var1;
         }
      }
   }

   public synchronized int method2804() {
      return this.anInt2457 < 0?-1:this.anInt2457;
   }

   synchronized void method2805(int var1) {
      this.method2740(var1, this.method2742());
   }

   public synchronized void method2806(int var1) {
      int var2 = ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.anInt2458 = var1;
   }

   public synchronized void method2807(int var1) {
      int var2 = ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.anInt2458 = var1;
   }

   public synchronized void method2808(int var1) {
      int var2 = ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.anInt2458 = var1;
   }

   public synchronized void method2809(int var1) {
      if(this.anInt2455 < 0) {
         this.anInt2455 = -var1;
      } else {
         this.anInt2455 = var1;
      }

   }

   public synchronized void method2810(boolean var1) {
      this.anInt2455 = (this.anInt2455 ^ this.anInt2455 >> -1804619794) + (this.anInt2455 >>> 31);
      if(var1) {
         this.anInt2455 = -this.anInt2455;
      }

   }

   public synchronized void method2811(int var1, int var2) {
      this.method2772(var1, var2, this.method2742());
   }

   public synchronized void method2812(boolean var1) {
      this.anInt2455 = (this.anInt2455 ^ this.anInt2455 >> 31) + (this.anInt2455 >>> -915852065);
      if(var1) {
         this.anInt2455 = -this.anInt2455;
      }

   }

   void method2813() {
      if(this.anInt2464 != 0) {
         if(this.anInt2462 == 917555248) {
            this.anInt2462 = 0;
         }

         this.anInt2464 = 0;
         this.method2736();
      }

   }

   void method2814() {
      if(this.anInt2464 != 0) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
         }

         this.anInt2464 = 0;
         this.method2736();
      }

   }

   void method2815() {
      if(this.anInt2464 != 0) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
         }

         this.anInt2464 = 0;
         this.method2736();
      }

   }

   void method2816() {
      this.anInt2461 = this.anInt2462;
      this.anInt2459 = method2822(this.anInt2462, this.anInt2457);
      this.anInt2460 = method2732(this.anInt2462, this.anInt2457);
   }

   static int method2817(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 1167719115);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   public synchronized void method2818(int var1, int var2) {
      this.method2772(var1, var2, this.method2742());
   }

   public synchronized void method2819(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2740(var2, var3);
      } else {
         int var4 = method2822(var2, var3);
         int var5 = method2732(var2, var3);
         if(this.anInt2459 == var4 && this.anInt2460 == var5) {
            this.anInt2464 = 0;
         } else {
            int var6 = var2 - this.anInt2461;
            if(this.anInt2461 - var2 > var6) {
               var6 = this.anInt2461 - var2;
            }

            if(var4 - this.anInt2459 > var6) {
               var6 = var4 - this.anInt2459;
            }

            if(this.anInt2459 - var4 > var6) {
               var6 = this.anInt2459 - var4;
            }

            if(var5 - this.anInt2460 > var6) {
               var6 = var5 - this.anInt2460;
            }

            if(this.anInt2460 - var5 > var6) {
               var6 = this.anInt2460 - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.anInt2464 = var1;
            this.anInt2462 = var2;
            this.anInt2457 = var3;
            this.anInt2466 = (var2 - this.anInt2461) / var1;
            this.anInt2465 = (var4 - this.anInt2459) / var1;
            this.anInt2468 = (var5 - this.anInt2460) / var1;
         }
      }
   }

   static int method2820(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   public synchronized void method2821(int var1) {
      if(var1 == 0) {
         this.method2739(0);
         this.unlink();
      } else if(this.anInt2459 == 0 && this.anInt2460 == 0) {
         this.anInt2464 = 0;
         this.anInt2462 = 0;
         this.anInt2461 = 0;
         this.unlink();
      } else {
         int var2 = -this.anInt2461;
         if(this.anInt2461 > var2) {
            var2 = this.anInt2461;
         }

         if(-this.anInt2459 > var2) {
            var2 = -this.anInt2459;
         }

         if(this.anInt2459 > var2) {
            var2 = this.anInt2459;
         }

         if(-this.anInt2460 > var2) {
            var2 = -this.anInt2460;
         }

         if(this.anInt2460 > var2) {
            var2 = this.anInt2460;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.anInt2464 = var1;
         this.anInt2462 = Integer.MIN_VALUE;
         this.anInt2466 = -this.anInt2461 / var1;
         this.anInt2465 = -this.anInt2459 / var1;
         this.anInt2468 = -this.anInt2460 / var1;
      }
   }

   static int method2822(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   public synchronized void method2823(int var1) {
      if(this.anInt2455 < 0) {
         this.anInt2455 = -var1;
      } else {
         this.anInt2455 = var1;
      }

   }

   public synchronized void method2824(int var1) {
      if(this.anInt2455 < 0) {
         this.anInt2455 = -var1;
      } else {
         this.anInt2455 = var1;
      }

   }

   public synchronized int method2825() {
      return this.anInt2455 >= 0?this.anInt2455:-this.anInt2455;
   }

   public synchronized int method2826() {
      return this.anInt2455 < 0?-this.anInt2455:this.anInt2455;
   }

   static int method2827(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2828(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   public boolean method2829() {
      return this.anInt2458 < 0 || this.anInt2458 >= ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
   }

   static int method2830(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   public boolean method2831() {
      return this.anInt2464 != 0;
   }

   int method2832(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2765(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2764(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2769(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2768(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2735(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2758(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2775(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2762(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   int method2833(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2765(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2764(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2769(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2768(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == 256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2735(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2758(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2775(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2762(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   static int method2834(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & -687996562)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   int method2835(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2785(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2766(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2771(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2770(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2858(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2827(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2853(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2774(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   int method2836(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt2464 > 0) {
            int var6 = var2 + this.anInt2464;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt2464 += var2;
            if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
               if(Class9.aBool144) {
                  var2 = method2785(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this);
               } else {
                  var2 = method2766(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this);
               }
            } else if(Class9.aBool144) {
               var2 = method2771(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, this.anInt2465, this.anInt2468, 0, var6, var3, this, this.anInt2455, var5);
            } else {
               var2 = method2770(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, this.anInt2466, 0, var6, var3, this, this.anInt2455, var5);
            }

            this.anInt2464 -= var2;
            if(this.anInt2464 != 0) {
               return var2;
            }

            if(!this.method2757()) {
               continue;
            }

            return var4;
         }

         if(this.anInt2455 == -256 && (this.anInt2458 & 255) == 0) {
            if(Class9.aBool144) {
               return method2858(0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this);
            }

            return method2827(((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this);
         }

         if(Class9.aBool144) {
            return method2853(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2459, this.anInt2460, 0, var4, var3, this, this.anInt2455, var5);
         }

         return method2774(0, 0, ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442, var1, this.anInt2458, var2, this.anInt2461, 0, var4, var3, this, this.anInt2455, var5);
      }
   }

   boolean method2837() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2822(var1, this.anInt2457);
         var2 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var3 && this.anInt2460 == var2) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var3) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2459) {
               this.anInt2464 = var3 - this.anInt2459;
            }
         } else if(this.anInt2459 > var3) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var3) {
               this.anInt2464 = this.anInt2459 - var3;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var2) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2460) {
               this.anInt2464 = var2 - this.anInt2460;
            }
         } else if(this.anInt2460 > var2) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var2) {
               this.anInt2464 = this.anInt2460 - var2;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   public synchronized void method2838(int var1) {
      this.anInt2467 = var1;
   }

   boolean method2839() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2822(var1, this.anInt2457);
         var3 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var2 && this.anInt2460 == var3) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var2) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2459) {
               this.anInt2464 = var2 - this.anInt2459;
            }
         } else if(this.anInt2459 > var2) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var2) {
               this.anInt2464 = this.anInt2459 - var2;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var3) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2460) {
               this.anInt2464 = var3 - this.anInt2460;
            }
         } else if(this.anInt2460 > var3) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var3) {
               this.anInt2464 = this.anInt2460 - var3;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   boolean method2840() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == 1082377867) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2822(var1, this.anInt2457);
         var3 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var2 && this.anInt2460 == var3) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var2) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2459) {
               this.anInt2464 = var2 - this.anInt2459;
            }
         } else if(this.anInt2459 > var2) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var2) {
               this.anInt2464 = this.anInt2459 - var2;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var3) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2460) {
               this.anInt2464 = var3 - this.anInt2460;
            }
         } else if(this.anInt2460 > var3) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var3) {
               this.anInt2464 = this.anInt2460 - var3;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   boolean method2841() {
      int var1 = this.anInt2462;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method2822(var1, this.anInt2457);
         var2 = method2732(var1, this.anInt2457);
      }

      if(this.anInt2461 == var1 && this.anInt2459 == var3 && this.anInt2460 == var2) {
         if(this.anInt2462 == Integer.MIN_VALUE) {
            this.anInt2462 = 0;
            this.anInt2460 = 0;
            this.anInt2459 = 0;
            this.anInt2461 = 0;
            this.unlink();
            return true;
         } else {
            this.method2736();
            return false;
         }
      } else {
         if(this.anInt2461 < var1) {
            this.anInt2466 = 1;
            this.anInt2464 = var1 - this.anInt2461;
         } else if(this.anInt2461 > var1) {
            this.anInt2466 = -1;
            this.anInt2464 = this.anInt2461 - var1;
         } else {
            this.anInt2466 = 0;
         }

         if(this.anInt2459 < var3) {
            this.anInt2465 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var3 - this.anInt2459) {
               this.anInt2464 = var3 - this.anInt2459;
            }
         } else if(this.anInt2459 > var3) {
            this.anInt2465 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2459 - var3) {
               this.anInt2464 = this.anInt2459 - var3;
            }
         } else {
            this.anInt2465 = 0;
         }

         if(this.anInt2460 < var2) {
            this.anInt2468 = 1;
            if(this.anInt2464 == 0 || this.anInt2464 > var2 - this.anInt2460) {
               this.anInt2464 = var2 - this.anInt2460;
            }
         } else if(this.anInt2460 > var2) {
            this.anInt2468 = -1;
            if(this.anInt2464 == 0 || this.anInt2464 > this.anInt2460 - var2) {
               this.anInt2464 = this.anInt2460 - var2;
            }
         } else {
            this.anInt2468 = 0;
         }

         return false;
      }
   }

   static int method2842(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2843(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2844(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   protected Class116_Sub4 method1926() {
      return null;
   }

   static int method2845(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2846(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2847(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class116_Sub4_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2848(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 254682338)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2458 = var4;
      return var5;
   }

   static int method2849(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   public synchronized void method1918(int[] var1, int var2, int var3) {
      if(this.anInt2462 == 0 && this.anInt2464 == 0) {
         this.method1911(var3);
      } else {
         Class116_Sub2_Sub1 var4 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
         int var6 = this.anInt2463 << 8;
         int var7 = this.anInt2454 << 8;
         int var8 = var4.aByteArray2442.length << 8;
         int var9 = var7 - var6;
         if(var9 <= 0) {
            this.anInt2467 = 0;
         }

         int var5 = var2;
         var3 += var2;
         if(this.anInt2458 < 0) {
            if(this.anInt2455 <= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = 0;
         }

         if(this.anInt2458 >= var8) {
            if(this.anInt2455 >= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = var8 - 1;
         }

         if(this.anInt2467 < 0) {
            if(this.aBool2456) {
               if(this.anInt2455 < 0) {
                  var5 = this.method2756(var1, var2, var6, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var6) {
                     return;
                  }

                  this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }

               while(true) {
                  var5 = this.method2755(var1, var5, var7, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 < var7) {
                     return;
                  }

                  this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
                  var5 = this.method2756(var1, var5, var6, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var6) {
                     return;
                  }

                  this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }
            } else if(this.anInt2455 < 0) {
               while(true) {
                  var5 = this.method2756(var1, var5, var6, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 >= var6) {
                     return;
                  }

                  this.anInt2458 = var7 - 1 - (var7 - 1 - this.anInt2458) % var9;
               }
            } else {
               while(true) {
                  var5 = this.method2755(var1, var5, var7, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 < var7) {
                     return;
                  }

                  this.anInt2458 = var6 + (this.anInt2458 - var6) % var9;
               }
            }
         } else {
            if(this.anInt2467 > 0) {
               if(this.aBool2456) {
                  label174: {
                     if(this.anInt2455 < 0) {
                        var5 = this.method2756(var1, var2, var6, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var6) {
                           return;
                        }

                        this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break label174;
                        }
                     }

                     do {
                        var5 = this.method2755(var1, var5, var7, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 < var7) {
                           return;
                        }

                        this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break;
                        }

                        var5 = this.method2756(var1, var5, var6, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var6) {
                           return;
                        }

                        this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                     } while(--this.anInt2467 != 0);
                  }
               } else {
                  int var10;
                  if(this.anInt2455 < 0) {
                     while(true) {
                        var5 = this.method2756(var1, var5, var6, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 >= var6) {
                           return;
                        }

                        var10 = (var7 - 1 - this.anInt2458) / var9;
                        if(var10 >= this.anInt2467) {
                           this.anInt2458 += var9 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 += var9 * var10;
                        this.anInt2467 -= var10;
                     }
                  } else {
                     while(true) {
                        var5 = this.method2755(var1, var5, var7, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 < var7) {
                           return;
                        }

                        var10 = (this.anInt2458 - var6) / var9;
                        if(var10 >= this.anInt2467) {
                           this.anInt2458 -= var9 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 -= var9 * var10;
                        this.anInt2467 -= var10;
                     }
                  }
               }
            }

            if(this.anInt2455 < 0) {
               this.method2756(var1, var5, 0, var3, 0);
               if(this.anInt2458 < 0) {
                  this.anInt2458 = -1;
                  this.method2781();
                  this.unlink();
               }
            } else {
               this.method2755(var1, var5, var8, var3, 0);
               if(this.anInt2458 >= var8) {
                  this.anInt2458 = var8;
                  this.method2781();
                  this.unlink();
               }
            }

         }
      }
   }

   static int method2850(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2458 = var4;
      return var5;
   }

   static int method2851(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt2458 = var4;
      return var5;
   }

   static int method2852(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   static int method2853(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   public static Class116_Sub4_Sub2 method2854(Class116_Sub2_Sub1 var0, int var1, int var2, int var3) {
      return var0.aByteArray2442 != null && var0.aByteArray2442.length != 0?new Class116_Sub4_Sub2(var0, var1, var2, var3):null;
   }

   static int method2855(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2856(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void method1912(int[] var1, int var2, int var3) {
      if(this.anInt2462 == 0 && this.anInt2464 == 0) {
         this.method1911(var3);
      } else {
         Class116_Sub2_Sub1 var6 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
         int var4 = this.anInt2463 << 8;
         int var5 = this.anInt2454 << 8;
         int var7 = var6.aByteArray2442.length << 8;
         int var8 = var5 - var4;
         if(var8 <= 0) {
            this.anInt2467 = 0;
         }

         int var10 = var2;
         var3 += var2;
         if(this.anInt2458 < 0) {
            if(this.anInt2455 <= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = 0;
         }

         if(this.anInt2458 >= var7) {
            if(this.anInt2455 >= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = var7 - 1;
         }

         if(this.anInt2467 < 0) {
            if(this.aBool2456) {
               if(this.anInt2455 < 0) {
                  var10 = this.method2756(var1, var2, var4, var3, var6.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var4) {
                     return;
                  }

                  this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }

               while(true) {
                  var10 = this.method2755(var1, var10, var5, var3, var6.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 < var5) {
                     return;
                  }

                  this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
                  var10 = this.method2756(var1, var10, var4, var3, var6.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var4) {
                     return;
                  }

                  this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }
            } else if(this.anInt2455 < 0) {
               while(true) {
                  var10 = this.method2756(var1, var10, var4, var3, var6.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 >= var4) {
                     return;
                  }

                  this.anInt2458 = var5 - 1 - (var5 - 1 - this.anInt2458) % var8;
               }
            } else {
               while(true) {
                  var10 = this.method2755(var1, var10, var5, var3, var6.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 < var5) {
                     return;
                  }

                  this.anInt2458 = var4 + (this.anInt2458 - var4) % var8;
               }
            }
         } else {
            if(this.anInt2467 > 0) {
               if(this.aBool2456) {
                  label183: {
                     if(this.anInt2455 < 0) {
                        var10 = this.method2756(var1, var2, var4, var3, var6.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var4) {
                           return;
                        }

                        this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break label183;
                        }
                     }

                     do {
                        var10 = this.method2755(var1, var10, var5, var3, var6.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 < var5) {
                           return;
                        }

                        this.anInt2458 = var5 + var5 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break;
                        }

                        var10 = this.method2756(var1, var10, var4, var3, var6.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var4) {
                           return;
                        }

                        this.anInt2458 = var4 + var4 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                     } while(--this.anInt2467 != 0);
                  }
               } else {
                  int var9;
                  if(this.anInt2455 < 0) {
                     while(true) {
                        var10 = this.method2756(var1, var10, var4, var3, var6.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 >= var4) {
                           return;
                        }

                        var9 = (var5 - 1 - this.anInt2458) / var8;
                        if(var9 >= this.anInt2467) {
                           this.anInt2458 += var8 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 += var8 * var9;
                        this.anInt2467 -= var9;
                     }
                  } else {
                     while(true) {
                        var10 = this.method2755(var1, var10, var5, var3, var6.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 < var5) {
                           return;
                        }

                        var9 = (this.anInt2458 - var4) / var8;
                        if(var9 >= this.anInt2467) {
                           this.anInt2458 -= var8 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 -= var8 * var9;
                        this.anInt2467 -= var9;
                     }
                  }
               }
            }

            if(this.anInt2455 < 0) {
               this.method2756(var1, var10, 0, var3, 0);
               if(this.anInt2458 < 0) {
                  this.anInt2458 = -1;
                  this.method2781();
                  this.unlink();
               }
            } else {
               this.method2755(var1, var10, var7, var3, 0);
               if(this.anInt2458 >= var7) {
                  this.anInt2458 = var7;
                  this.method2781();
                  this.unlink();
               }
            }

         }
      }
   }

   public synchronized void method1919(int[] var1, int var2, int var3) {
      if(this.anInt2462 == 0 && this.anInt2464 == 0) {
         this.method1911(var3);
      } else {
         Class116_Sub2_Sub1 var4 = (Class116_Sub2_Sub1)this.aClass116_Sub2_1719;
         int var7 = this.anInt2463 << 8;
         int var6 = this.anInt2454 << 8;
         int var5 = var4.aByteArray2442.length << 8;
         int var8 = var6 - var7;
         if(var8 <= 0) {
            this.anInt2467 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.anInt2458 < 0) {
            if(this.anInt2455 <= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = 0;
         }

         if(this.anInt2458 >= var5) {
            if(this.anInt2455 >= 0) {
               this.method2781();
               this.unlink();
               return;
            }

            this.anInt2458 = var5 - 1;
         }

         if(this.anInt2467 < 0) {
            if(this.aBool2456) {
               if(this.anInt2455 < 0) {
                  var9 = this.method2756(var1, var2, var7, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var7) {
                     return;
                  }

                  this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }

               while(true) {
                  var9 = this.method2755(var1, var9, var6, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 < var6) {
                     return;
                  }

                  this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
                  var9 = this.method2756(var1, var9, var7, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 >= var7) {
                     return;
                  }

                  this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                  this.anInt2455 = -this.anInt2455;
               }
            } else if(this.anInt2455 < 0) {
               while(true) {
                  var9 = this.method2756(var1, var9, var7, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                  if(this.anInt2458 >= var7) {
                     return;
                  }

                  this.anInt2458 = var6 - 1 - (var6 - 1 - this.anInt2458) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2755(var1, var9, var6, var3, var4.aByteArray2442[this.anInt2463]);
                  if(this.anInt2458 < var6) {
                     return;
                  }

                  this.anInt2458 = var7 + (this.anInt2458 - var7) % var8;
               }
            }
         } else {
            if(this.anInt2467 > 0) {
               if(this.aBool2456) {
                  label177: {
                     if(this.anInt2455 < 0) {
                        var9 = this.method2756(var1, var2, var7, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var7) {
                           return;
                        }

                        this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break label177;
                        }
                     }

                     do {
                        var9 = this.method2755(var1, var9, var6, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 < var6) {
                           return;
                        }

                        this.anInt2458 = var6 + var6 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                        if(--this.anInt2467 == 0) {
                           break;
                        }

                        var9 = this.method2756(var1, var9, var7, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 >= var7) {
                           return;
                        }

                        this.anInt2458 = var7 + var7 - 1 - this.anInt2458;
                        this.anInt2455 = -this.anInt2455;
                     } while(--this.anInt2467 != 0);
                  }
               } else {
                  int var10;
                  if(this.anInt2455 < 0) {
                     while(true) {
                        var9 = this.method2756(var1, var9, var7, var3, var4.aByteArray2442[this.anInt2454 - 1]);
                        if(this.anInt2458 >= var7) {
                           return;
                        }

                        var10 = (var6 - 1 - this.anInt2458) / var8;
                        if(var10 >= this.anInt2467) {
                           this.anInt2458 += var8 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 += var8 * var10;
                        this.anInt2467 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method2755(var1, var9, var6, var3, var4.aByteArray2442[this.anInt2463]);
                        if(this.anInt2458 < var6) {
                           return;
                        }

                        var10 = (this.anInt2458 - var7) / var8;
                        if(var10 >= this.anInt2467) {
                           this.anInt2458 -= var8 * this.anInt2467;
                           this.anInt2467 = 0;
                           break;
                        }

                        this.anInt2458 -= var8 * var10;
                        this.anInt2467 -= var10;
                     }
                  }
               }
            }

            if(this.anInt2455 < 0) {
               this.method2756(var1, var9, 0, var3, 0);
               if(this.anInt2458 < 0) {
                  this.anInt2458 = -1;
                  this.method2781();
                  this.unlink();
               }
            } else {
               this.method2755(var1, var9, var5, var3, 0);
               if(this.anInt2458 >= var5) {
                  this.anInt2458 = var5;
                  this.method2781();
                  this.unlink();
               }
            }

         }
      }
   }

   static int method2857(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class116_Sub4_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt2459 += var9.anInt2465 * (var6 - var3);
      var9.anInt2460 += var9.anInt2468 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt2461 = var4 >> 2;
      var9.anInt2458 = var2 << 8;
      return var3;
   }

   static int method2858(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class116_Sub4_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2859(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   public boolean method2860() {
      return this.anInt2458 < 0 || this.anInt2458 >= ((Class116_Sub2_Sub1)this.aClass116_Sub2_1719).aByteArray2442.length << 8;
   }

   static int method2861(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2862(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class116_Sub4_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt2461 += var12.anInt2466 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt2459 = var5 >> 2;
      var12.anInt2460 = var6 >> 2;
      var12.anInt2458 = var3 << 8;
      return var4 >> 1;
   }

   static int method2863(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2864(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & -1960269727)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   public synchronized void method2865(boolean var1) {
      this.anInt2455 = (this.anInt2455 ^ this.anInt2455 >> 31) + (this.anInt2455 >>> 31);
      if(var1) {
         this.anInt2455 = -this.anInt2455;
      }

   }

   protected int method1917() {
      return this.anInt2462 == 0 && this.anInt2464 == 0?0:1;
   }

   void method2866() {
      this.anInt2461 = this.anInt2462;
      this.anInt2459 = method2822(this.anInt2462, this.anInt2457);
      this.anInt2460 = method2732(this.anInt2462, this.anInt2457);
   }

   static int method2867(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class116_Sub4_Sub2 var13, int var14, int var15) {
      var13.anInt2461 -= var13.anInt2466 * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt2461 += var13.anInt2466 * var5;
      var13.anInt2459 = var6;
      var13.anInt2460 = var7;
      var13.anInt2458 = var4;
      return var5;
   }

   static int method2868(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2869(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt2458 = var4;
      return var5 >> 1;
   }

   static int method2870(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2871(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class116_Sub4_Sub2 var11, int var12, int var13) {
      var11.anInt2459 -= var11.anInt2465 * var5;
      var11.anInt2460 -= var11.anInt2468 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & -303433224)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 751812475)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt2459 += var11.anInt2465 * var5;
      var11.anInt2460 += var11.anInt2468 * var5;
      var11.anInt2461 = var6;
      var11.anInt2458 = var4;
      return var5;
   }

   static int method2872(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(-1732053712 - var1) * 1.220703125E-4D) + 0.5D);
   }
}
