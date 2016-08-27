package com.jagex;

public class Class116_Sub4_Sub4 extends Class116_Sub4 {

   int[] anIntArray2533 = new int[16];
   int anInt2534 = -257763072;
   int anInt2535 = 357779008;
   long aLong2536;
   int[] anIntArray2537 = new int[16];
   int[] anIntArray2538 = new int[16];
   int[] anIntArray2539 = new int[16];
   int[] anIntArray2540 = new int[16];
   int[] anIntArray2541 = new int[16];
   int[] anIntArray2542 = new int[16];
   Class116_Sub21[][] aClass116_Sub21ArrayArray2543 = new Class116_Sub21[16][128];
   int[] anIntArray2544 = new int[16];
   int[] anIntArray2545 = new int[16];
   Hashtable aHashtable_2546 = new Hashtable(128);
   int[] anIntArray2547 = new int[16];
   int[] anIntArray2548 = new int[16];
   int[] anIntArray2549 = new int[16];
   int[] anIntArray2550 = new int[16];
   Class116_Sub21[][] aClass116_Sub21ArrayArray2551 = new Class116_Sub21[16][128];
   int[] anIntArray2552 = new int[16];
   Class92 aClass92_2553 = new Class92();
   boolean aBool2554;
   int anInt2555;
   int anInt2556;
   int[] anIntArray2557 = new int[16];
   long aLong2558;
   Class116_Sub4_Sub3 aClass116_Sub4_Sub3_2559 = new Class116_Sub4_Sub3(this);


   void method2993(int var1, byte var2) {
      if(var1 >= 0) {
         this.anIntArray2552[var1] = 12800;
         this.anIntArray2537[var1] = 8192;
         this.anIntArray2538[var1] = 16383;
         this.anIntArray2542[var1] = 8192;
         this.anIntArray2544[var1] = 0;
         this.anIntArray2557[var1] = 8192;
         this.method3014(var1, 1120617067);
         this.method3015(var1, (byte)-128);
         this.anIntArray2545[var1] = 0;
         this.anIntArray2548[var1] = 32767;
         this.anIntArray2547[var1] = 256;
         this.anIntArray2541[var1] = 0;
         this.method3052(var1, 8192, (byte)-74);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method2993(var1, (byte)1);
         }

      }
   }

   public synchronized void method2994(int var1, int var2) {
      this.anInt2534 = 1844486873 * var1;
   }

   public int method2995(short var1) {
      return this.anInt2534 * 1321975145;
   }

   public synchronized boolean method2996(Class116_Sub18 var1, RSIndex var2, Class14 var3, int var4, int var5) {
      var1.method2315();
      boolean var8 = true;
      int[] var7 = null;
      if(var4 > 0) {
         var7 = new int[]{var4};
      }

      for(Class116_Sub22 var9 = (Class116_Sub22)var1.aHashtable_2107.getFirst(); null != var9; var9 = (Class116_Sub22)var1.aHashtable_2107.getNext()) {
         int var10 = (int)var9.hashId;
         Class116_Sub19 var6 = (Class116_Sub19)this.aHashtable_2546.get((long) var10);
         if(var6 == null) {
            byte[] var11 = var2.method1356(var10, 2122948392);
            Class116_Sub19 var12;
            if(null == var11) {
               var12 = null;
            } else {
               var12 = new Class116_Sub19(var11);
            }

            var6 = var12;
            if(var12 == null) {
               var8 = false;
               continue;
            }

            this.aHashtable_2546.put(var12, (long) var10);
         }

         if(!var6.method2327(var3, var9.aByteArray2143, var7, 770834553)) {
            var8 = false;
         }
      }

      if(var8) {
         var1.method2320();
      }

      return var8;
   }

   public synchronized void method2997(byte var1) {
      for(Class116_Sub19 var2 = (Class116_Sub19)this.aHashtable_2546.getFirst(); var2 != null; var2 = (Class116_Sub19)this.aHashtable_2546.getNext()) {
         var2.method2325(-828889465);
      }

   }

   public synchronized boolean method3000(int var1) {
      return this.aClass92_2553.method1228();
   }

   public synchronized void method3001(int var1, int var2, byte var3) {
      this.method3002(var1, var2, (byte)3);
   }

   void method3002(int var1, int var2, byte var3) {
      this.anIntArray2539[var1] = var2;
      this.anIntArray2533[var1] = var2 & -128;
      this.method3003(var1, var2, 1462771565);
   }

   void method3003(int var1, int var2, int var3) {
      if(this.anIntArray2540[var1] != var2) {
         this.anIntArray2540[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.aClass116_Sub21ArrayArray2551[var1][var4] = null;
         }
      }

   }

   int method3005(Class116_Sub21 var1, byte var2) {
      Class126 var3 = var1.aClass126_2127;
      int var4 = this.anIntArray2538[1956904859 * var1.anInt2125] * this.anIntArray2552[1956904859 * var1.anInt2125] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = 16384 + var1.anInt2128 * -722511999 * var4 >> 15;
      var4 = 1321975145 * this.anInt2534 * var4 + 128 >> 8;
      if(141570201 * var3.anInt1558 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)(-1039195515 * var1.anInt2142) * (double)(141570201 * var3.anInt1558)) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if(var3.aByteArray1557 != null) {
         var8 = var1.anInt2136 * 2008166831;
         var7 = var3.aByteArray1557[1 + var1.anInt2135 * 831660161];
         if(var1.anInt2135 * 831660161 < var3.aByteArray1557.length - 2) {
            var5 = (var3.aByteArray1557[var1.anInt2135 * 831660161] & 255) << 8;
            var6 = (var3.aByteArray1557[2 + var1.anInt2135 * 831660161] & 255) << 8;
            var7 += (var3.aByteArray1557[3 + 831660161 * var1.anInt2135] - var7) * (var8 - var5) / (var6 - var5);
         }

         var4 = var4 * var7 + 32 >> 6;
      }

      if(var1.anInt2122 * -524941375 > 0 && null != var3.aByteArray1563) {
         var8 = -524941375 * var1.anInt2122;
         var7 = var3.aByteArray1563[var1.anInt2123 * 1969966021 + 1];
         if(1969966021 * var1.anInt2123 < var3.aByteArray1563.length - 2) {
            var5 = (var3.aByteArray1563[var1.anInt2123 * 1969966021] & 255) << 8;
            var6 = (var3.aByteArray1563[1969966021 * var1.anInt2123 + 2] & 255) << 8;
            var7 += (var8 - var5) * (var3.aByteArray1563[var1.anInt2123 * 1969966021 + 3] - var7) / (var6 - var5);
         }

         var4 = 32 + var7 * var4 >> 6;
      }

      return var4;
   }

   void method3006(int var1, int var2, int var3, int var4) {
      Class116_Sub21 var5 = this.aClass116_Sub21ArrayArray2543[var1][var2];
      if(var5 != null) {
         this.aClass116_Sub21ArrayArray2543[var1][var2] = null;
         if((this.anIntArray2545[var1] & 2) != 0) {
            for(Class116_Sub21 var6 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getFirst(); null != var6; var6 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getNext()) {
               if(1956904859 * var6.anInt2125 == 1956904859 * var5.anInt2125 && -524941375 * var6.anInt2122 < 0 && var6 != var5) {
                  var5.anInt2122 = 0;
                  break;
               }
            }
         } else {
            var5.anInt2122 = 0;
         }

      }
   }

   void method3007(int var1, int var2, int var3, int var4) {}

   void method3009(int var1, int var2, int var3) {
      this.anIntArray2542[var1] = var2;
   }

   void method3010(int var1, int var2) {
      for(Class116_Sub21 var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getFirst(); var3 != null; var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getNext()) {
         if(var1 < 0 || var3.anInt2125 * 1956904859 == var1) {
            if(null != var3.aClass116_Sub4_Sub2_2140) {
               var3.aClass116_Sub4_Sub2_2140.method2748(-954458055 * Class9.anInt135 / 100);
               if(var3.aClass116_Sub4_Sub2_2140.method2752()) {
                  this.aClass116_Sub4_Sub3_2559.aClass116_Sub4_Sub1_2529.method2706(var3.aClass116_Sub4_Sub2_2140);
               }

               var3.method2330((byte)-41);
            }

            if(-524941375 * var3.anInt2122 < 0) {
               this.aClass116_Sub21ArrayArray2543[1956904859 * var3.anInt2125][var3.anInt2137 * 1484938015] = null;
            }

            var3.unlink();
         }
      }

   }

   void method3011(Class116_Sub21 var1, boolean var2, byte var3) {
      int var4 = var1.aClass116_Sub2_Sub1_2124.aByteArray2442.length;
      int var5;
      if(var2 && var1.aClass116_Sub2_Sub1_2124.aBool2438) {
         int var6 = var4 + var4 - var1.aClass116_Sub2_Sub1_2124.anInt2440;
         var5 = (int)((long)this.anIntArray2541[var1.anInt2125 * 1956904859] * (long)var6 >> 6);
         var4 <<= 8;
         if(var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.aClass116_Sub4_Sub2_2140.method2744(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.anIntArray2541[var1.anInt2125 * 1956904859] >> 6);
      }

      var1.aClass116_Sub4_Sub2_2140.method2743(var5);
   }

   void method3014(int var1, int var2) {
      if((this.anIntArray2545[var1] & 2) != 0) {
         for(Class116_Sub21 var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getFirst(); null != var3; var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getNext()) {
            if(1956904859 * var3.anInt2125 == var1 && null == this.aClass116_Sub21ArrayArray2543[var1][1484938015 * var3.anInt2137] && -524941375 * var3.anInt2122 < 0) {
               var3.anInt2122 = 0;
            }
         }
      }

   }

   void method3015(int var1, byte var2) {
      if(0 != (this.anIntArray2545[var1] & 4)) {
         for(Class116_Sub21 var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getFirst(); null != var3; var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getNext()) {
            if(var3.anInt2125 * 1956904859 == var1) {
               var3.anInt2134 = 0;
            }
         }
      }

   }

   void method3016(int var1, int var2) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if(128 == var3) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method3006(var4, var6, var5, 1297791039);
      } else if(var3 == 144) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var5 > 0) {
            this.method3045(var4, var6, var5, (byte)81);
         } else {
            this.method3006(var4, var6, 64, 1535865784);
         }

      } else if(var3 == 160) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method3007(var4, var6, var5, 1741691394);
      } else if(var3 == 176) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(0 == var6) {
            this.anIntArray2533[var4] = (var5 << 14) + (this.anIntArray2533[var4] & -2080769);
         }

         if(32 == var6) {
            this.anIntArray2533[var4] = (this.anIntArray2533[var4] & -16257) + (var5 << 7);
         }

         if(1 == var6) {
            this.anIntArray2544[var4] = (this.anIntArray2544[var4] & -16257) + (var5 << 7);
         }

         if(var6 == 33) {
            this.anIntArray2544[var4] = var5 + (this.anIntArray2544[var4] & -128);
         }

         if(5 == var6) {
            this.anIntArray2557[var4] = (var5 << 7) + (this.anIntArray2557[var4] & -16257);
         }

         if(var6 == 37) {
            this.anIntArray2557[var4] = var5 + (this.anIntArray2557[var4] & -128);
         }

         if(var6 == 7) {
            this.anIntArray2552[var4] = (this.anIntArray2552[var4] & -16257) + (var5 << 7);
         }

         if(39 == var6) {
            this.anIntArray2552[var4] = var5 + (this.anIntArray2552[var4] & -128);
         }

         if(10 == var6) {
            this.anIntArray2537[var4] = (this.anIntArray2537[var4] & -16257) + (var5 << 7);
         }

         if(42 == var6) {
            this.anIntArray2537[var4] = (this.anIntArray2537[var4] & -128) + var5;
         }

         if(var6 == 11) {
            this.anIntArray2538[var4] = (var5 << 7) + (this.anIntArray2538[var4] & -16257);
         }

         if(var6 == 43) {
            this.anIntArray2538[var4] = (this.anIntArray2538[var4] & -128) + var5;
         }

         if(var6 == 64) {
            if(var5 >= 64) {
               this.anIntArray2545[var4] |= 1;
            } else {
               this.anIntArray2545[var4] &= -2;
            }
         }

         if(65 == var6) {
            if(var5 >= 64) {
               this.anIntArray2545[var4] |= 2;
            } else {
               this.method3014(var4, 1950266364);
               this.anIntArray2545[var4] &= -3;
            }
         }

         if(99 == var6) {
            this.anIntArray2548[var4] = (this.anIntArray2548[var4] & 127) + (var5 << 7);
         }

         if(var6 == 98) {
            this.anIntArray2548[var4] = (this.anIntArray2548[var4] & 16256) + var5;
         }

         if(101 == var6) {
            this.anIntArray2548[var4] = (var5 << 7) + (this.anIntArray2548[var4] & 127) + 16384;
         }

         if(var6 == 100) {
            this.anIntArray2548[var4] = (this.anIntArray2548[var4] & 16256) + 16384 + var5;
         }

         if(120 == var6) {
            this.method3010(var4, 359329858);
         }

         if(121 == var6) {
            this.method2993(var4, (byte)1);
         }

         if(var6 == 123) {
            this.method3032(var4, (short)452);
         }

         int var7;
         if(6 == var6) {
            var7 = this.anIntArray2548[var4];
            if(16384 == var7) {
               this.anIntArray2547[var4] = (var5 << 7) + (this.anIntArray2547[var4] & -16257);
            }
         }

         if(38 == var6) {
            var7 = this.anIntArray2548[var4];
            if(16384 == var7) {
               this.anIntArray2547[var4] = var5 + (this.anIntArray2547[var4] & -128);
            }
         }

         if(var6 == 16) {
            this.anIntArray2541[var4] = (var5 << 7) + (this.anIntArray2541[var4] & -16257);
         }

         if(48 == var6) {
            this.anIntArray2541[var4] = var5 + (this.anIntArray2541[var4] & -128);
         }

         if(var6 == 81) {
            if(var5 >= 64) {
               this.anIntArray2545[var4] |= 4;
            } else {
               this.method3015(var4, (byte)-110);
               this.anIntArray2545[var4] &= -5;
            }
         }

         if(var6 == 17) {
            this.method3052(var4, (var5 << 7) + (this.anIntArray2549[var4] & -16257), (byte)-39);
         }

         if(var6 == 49) {
            this.method3052(var4, var5 + (this.anIntArray2549[var4] & -128), (byte)0);
         }

      } else if(var3 == 192) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         this.method3003(var4, this.anIntArray2533[var4] + var6, 1858223147);
      } else if(208 == var3) {
         var4 = var1 & 15;
         var6 = var1 >> 8 & 127;
         this.method3026(var4, var6, 1555857044);
      } else if(var3 == 224) {
         var4 = var1 & 15;
         var6 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
         this.method3009(var4, var6, -2127717764);
      } else {
         var3 = var1 & 255;
         if(var3 == 255) {
            this.method3033(-1737418714);
         }
      }
   }

   public synchronized void method3017(byte var1) {
      for(Class116_Sub19 var2 = (Class116_Sub19)this.aHashtable_2546.getFirst(); var2 != null; var2 = (Class116_Sub19)this.aHashtable_2546.getNext()) {
         var2.unlink();
      }

   }

   int method3018(Class116_Sub21 var1, int var2) {
      int var3 = var1.anInt2130 * -744296441 + (-1856256381 * var1.anInt2132 * var1.anInt2131 * 267719497 >> 12);
      var3 += this.anIntArray2547[1956904859 * var1.anInt2125] * (this.anIntArray2542[1956904859 * var1.anInt2125] - 8192) >> 12;
      Class126 var4 = var1.aClass126_2127;
      int var5;
      if(var4.anInt1565 * 167621977 > 0 && (-1320499447 * var4.anInt1562 > 0 || this.anIntArray2544[var1.anInt2125 * 1956904859] > 0)) {
         var5 = var4.anInt1562 * -1320499447 << 2;
         int var6 = -44265019 * var4.anInt1564 << 1;
         if(1779295195 * var1.anInt2138 < var6) {
            var5 = var1.anInt2138 * 1779295195 * var5 / var6;
         }

         var5 += this.anIntArray2544[var1.anInt2125 * 1956904859] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(1035944307 * var1.anInt2139 & 511));
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(256 * var1.aClass116_Sub2_Sub1_2124.anInt2441) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)(-954458055 * Class9.anInt135) + 0.5D);
      return var5 < 1?1:var5;
   }

   int method3020(Class116_Sub21 var1, int var2) {
      int var3 = this.anIntArray2537[1956904859 * var1.anInt2125];
      return var3 >= 8192?16384 - (32 + (16384 - var3) * (128 - var1.anInt2129 * 1621860817) >> 6):32 + 1621860817 * var1.anInt2129 * var3 >> 6;
   }

   protected synchronized Class116_Sub4 method1907() {
      return this.aClass116_Sub4_Sub3_2559;
   }

   protected synchronized Class116_Sub4 method1913() {
      return null;
   }

   protected synchronized int method1909() {
      return 0;
   }

   protected synchronized void method1919(int[] var1, int var2, int var3) {
      if(this.aClass92_2553.method1228()) {
         int var5 = this.aClass92_2553.anInt1322 * this.anInt2535 * 332692849 / (-954458055 * Class9.anInt135);

         do {
            long var6 = -3956681610824063275L * this.aLong2536 + (long)var5 * (long)var3;
            if(this.aLong2558 * -5392750227611328195L - var6 >= 0L) {
               this.aLong2536 = 6345129286088335997L * var6;
               break;
            }

            int var4 = (int)(((long)var5 + (-5392750227611328195L * this.aLong2558 - this.aLong2536 * -3956681610824063275L) - 1L) / (long)var5);
            this.aLong2536 += (long)var4 * (long)var5 * 6345129286088335997L;
            this.aClass116_Sub4_Sub3_2559.method1919(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.method3021(632431003);
         } while(this.aClass92_2553.method1228());
      }

      this.aClass116_Sub4_Sub3_2559.method1919(var1, var2, var3);
   }

   protected synchronized void method1911(int var1) {
      if(this.aClass92_2553.method1228()) {
         int var5 = this.aClass92_2553.anInt1322 * this.anInt2535 * 332692849 / (Class9.anInt135 * -954458055);

         do {
            long var3 = (long)var1 * (long)var5 + -3956681610824063275L * this.aLong2536;
            if(-5392750227611328195L * this.aLong2558 - var3 >= 0L) {
               this.aLong2536 = 6345129286088335997L * var3;
               break;
            }

            int var2 = (int)(((long)var5 + (-5392750227611328195L * this.aLong2558 - this.aLong2536 * -3956681610824063275L) - 1L) / (long)var5);
            this.aLong2536 += 6345129286088335997L * (long)var2 * (long)var5;
            this.aClass116_Sub4_Sub3_2559.method1911(var2);
            var1 -= var2;
            this.method3021(576440798);
         } while(this.aClass92_2553.method1228());
      }

      this.aClass116_Sub4_Sub3_2559.method1911(var1);
   }

   void method3021(int var1) {
      int var2 = 510598059 * this.anInt2555;
      int var3 = 68475093 * this.anInt2556;

      long var5;
      for(var5 = this.aLong2558 * -5392750227611328195L; var3 == 68475093 * this.anInt2556; var5 = this.aClass92_2553.method1212(var3)) {
         while(var3 == this.aClass92_2553.anIntArray1325[var2]) {
            this.aClass92_2553.method1206(var2);
            int var4 = this.aClass92_2553.method1223(var2);
            if(var4 == 1) {
               this.aClass92_2553.method1252();
               this.aClass92_2553.method1207(var2);
               if(this.aClass92_2553.method1216()) {
                  if(!this.aBool2554 || var3 == 0) {
                     this.method3033(-1737418714);
                     this.aClass92_2553.method1203();
                     return;
                  }

                  this.aClass92_2553.method1215(var5);
               }
               break;
            }

            if(0 != (var4 & 128)) {
               this.method3016(var4, -1422001595);
            }

            this.aClass92_2553.method1255(var2);
            this.aClass92_2553.method1207(var2);
         }

         var2 = this.aClass92_2553.method1213();
         var3 = this.aClass92_2553.anIntArray1325[var2];
      }

      this.anInt2555 = 1741883139 * var2;
      this.anInt2556 = 1469685885 * var3;
      this.aLong2558 = var5 * 6966871617677229589L;
   }

   boolean method3023(Class116_Sub21 var1, int[] var2, int var3, int var4, int var5) {
      var1.anInt2141 = Class9.anInt135 * -954458055 / 100 * -1258269753;
      if(-524941375 * var1.anInt2122 >= 0 && (var1.aClass116_Sub4_Sub2_2140 == null || var1.aClass116_Sub4_Sub2_2140.method2751())) {
         var1.method2330((byte)14);
         var1.unlink();
         if(var1.anInt2126 * 1587834581 > 0 && this.aClass116_Sub21ArrayArray2551[1956904859 * var1.anInt2125][var1.anInt2126 * 1587834581] == var1) {
            this.aClass116_Sub21ArrayArray2551[var1.anInt2125 * 1956904859][1587834581 * var1.anInt2126] = null;
         }

         return true;
      } else {
         int var9 = -1856256381 * var1.anInt2132;
         if(var9 > 0) {
            var9 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.anIntArray2557[var1.anInt2125 * 1956904859]) + 0.5D);
            if(var9 < 0) {
               var9 = 0;
            }

            var1.anInt2132 = -723306453 * var9;
         }

         var1.aClass116_Sub4_Sub2_2140.method2749(this.method3018(var1, 1365280984));
         Class126 var8 = var1.aClass126_2127;
         boolean var10 = false;
         var1.anInt2138 += -1674092461;
         var1.anInt2139 += -2024797437 * var8.anInt1565;
         double var6 = 5.086263020833333E-6D * (double)((var1.anInt2132 * -1856256381 * var1.anInt2131 * 267719497 >> 12) + (1484938015 * var1.anInt2137 - 60 << 8));
         if(141570201 * var8.anInt1558 > 0) {
            if(699672919 * var8.anInt1561 > 0) {
               var1.anInt2142 += (int)(128.0D * Math.pow(2.0D, var6 * (double)(699672919 * var8.anInt1561)) + 0.5D) * 1412269645;
            } else {
               var1.anInt2142 += 381888128;
            }
         }

         if(var8.aByteArray1557 != null) {
            if(var8.anInt1559 * -418698837 > 0) {
               var1.anInt2136 += (int)(128.0D * Math.pow(2.0D, (double)(var8.anInt1559 * -418698837) * var6) + 0.5D) * 560579919;
            } else {
               var1.anInt2136 += -1260214400;
            }

            while(831660161 * var1.anInt2135 < var8.aByteArray1557.length - 2 && 2008166831 * var1.anInt2136 > (var8.aByteArray1557[831660161 * var1.anInt2135 + 2] & 255) << 8) {
               var1.anInt2135 += -1193525502;
            }

            if(831660161 * var1.anInt2135 == var8.aByteArray1557.length - 2 && var8.aByteArray1557[1 + 831660161 * var1.anInt2135] == 0) {
               var10 = true;
            }
         }

         if(var1.anInt2122 * -524941375 >= 0 && var8.aByteArray1563 != null && (this.anIntArray2545[var1.anInt2125 * 1956904859] & 1) == 0 && (var1.anInt2126 * 1587834581 < 0 || var1 != this.aClass116_Sub21ArrayArray2551[1956904859 * var1.anInt2125][1587834581 * var1.anInt2126])) {
            if(var8.anInt1560 * -370360363 > 0) {
               var1.anInt2122 += (int)(128.0D * Math.pow(2.0D, var6 * (double)(-370360363 * var8.anInt1560)) + 0.5D) * -200669119;
            } else {
               var1.anInt2122 += 84156544;
            }

            while(1969966021 * var1.anInt2123 < var8.aByteArray1563.length - 2 && var1.anInt2122 * -524941375 > (var8.aByteArray1563[2 + var1.anInt2123 * 1969966021] & 255) << 8) {
               var1.anInt2123 += 617608730;
            }

            if(var8.aByteArray1563.length - 2 == var1.anInt2123 * 1969966021) {
               var10 = true;
            }
         }

         if(var10) {
            var1.aClass116_Sub4_Sub2_2140.method2748(536968695 * var1.anInt2141);
            if(null != var2) {
               var1.aClass116_Sub4_Sub2_2140.method1919(var2, var3, var4);
            } else {
               var1.aClass116_Sub4_Sub2_2140.method1911(var4);
            }

            if(var1.aClass116_Sub4_Sub2_2140.method2752()) {
               this.aClass116_Sub4_Sub3_2559.aClass116_Sub4_Sub1_2529.method2706(var1.aClass116_Sub4_Sub2_2140);
            }

            var1.method2330((byte)14);
            if(-524941375 * var1.anInt2122 >= 0) {
               var1.unlink();
               if(1587834581 * var1.anInt2126 > 0 && var1 == this.aClass116_Sub21ArrayArray2551[var1.anInt2125 * 1956904859][var1.anInt2126 * 1587834581]) {
                  this.aClass116_Sub21ArrayArray2551[var1.anInt2125 * 1956904859][var1.anInt2126 * 1587834581] = null;
               }
            }

            return true;
         } else {
            var1.aClass116_Sub4_Sub2_2140.method2772(var1.anInt2141 * 536968695, this.method3005(var1, (byte)34), this.method3020(var1, -807705657));
            return false;
         }
      }
   }

   boolean method3025(Class116_Sub21 var1, int var2) {
      if(var1.aClass116_Sub4_Sub2_2140 == null) {
         if(-524941375 * var1.anInt2122 >= 0) {
            var1.unlink();
            if(var1.anInt2126 * 1587834581 > 0 && this.aClass116_Sub21ArrayArray2551[var1.anInt2125 * 1956904859][1587834581 * var1.anInt2126] == var1) {
               this.aClass116_Sub21ArrayArray2551[1956904859 * var1.anInt2125][1587834581 * var1.anInt2126] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method3026(int var1, int var2, int var3) {}

   void method3032(int var1, short var2) {
      for(Class116_Sub21 var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getFirst(); var3 != null; var3 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getNext()) {
         if((var1 < 0 || var1 == var3.anInt2125 * 1956904859) && -524941375 * var3.anInt2122 < 0) {
            this.aClass116_Sub21ArrayArray2543[1956904859 * var3.anInt2125][var3.anInt2137 * 1484938015] = null;
            var3.anInt2122 = 0;
         }
      }

   }

   void method3033(int var1) {
      this.method3010(-1, -562669432);
      this.method2993(-1, (byte)1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.anIntArray2540[var2] = this.anIntArray2539[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.anIntArray2533[var2] = this.anIntArray2539[var2] & -128;
      }

   }

   void method3045(int var1, int var2, int var3, byte var4) {
      this.method3006(var1, var2, 64, 1839770032);
      if(0 != (this.anIntArray2545[var1] & 2)) {
         for(Class116_Sub21 var5 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getLast(); null != var5; var5 = (Class116_Sub21)this.aClass116_Sub4_Sub3_2559.aClass117_2528.getPrevious()) {
            if(var5.anInt2125 * 1956904859 == var1 && var5.anInt2122 * -524941375 < 0) {
               this.aClass116_Sub21ArrayArray2543[var1][1484938015 * var5.anInt2137] = null;
               this.aClass116_Sub21ArrayArray2543[var1][var2] = var5;
               int var7 = var5.anInt2130 * -744296441 + (267719497 * var5.anInt2131 * -1856256381 * var5.anInt2132 >> 12);
               var5.anInt2130 += (var2 - var5.anInt2137 * 1484938015 << 8) * -1554678345;
               var5.anInt2131 = (var7 - -744296441 * var5.anInt2130) * -1732227335;
               var5.anInt2132 = 864202752;
               var5.anInt2137 = 1507418335 * var2;
               return;
            }
         }
      }

      Class116_Sub19 var9 = (Class116_Sub19)this.aHashtable_2546.get((long) this.anIntArray2540[var1]);
      if(var9 != null) {
         Class116_Sub2_Sub1 var10 = var9.aClass116_Sub2_Sub1Array2120[var2];
         if(var10 != null) {
            Class116_Sub21 var8 = new Class116_Sub21();
            var8.anInt2125 = var1 * 210325139;
            var8.aClass116_Sub19_2133 = var9;
            var8.aClass116_Sub2_Sub1_2124 = var10;
            var8.aClass126_2127 = var9.aClass126Array2114[var2];
            var8.anInt2126 = -1790748035 * var9.aByteArray2115[var2];
            var8.anInt2137 = var2 * 1507418335;
            var8.anInt2128 = (var9.aByteArray2116[var2] * var9.anInt2110 * -822371327 * var3 * var3 + 1024 >> 11) * -1743198079;
            var8.anInt2129 = (var9.aByteArray2113[var2] & 255) * -626501839;
            var8.anInt2130 = -1554678345 * ((var2 << 8) - (var9.aShortArray2111[var2] & 32767));
            var8.anInt2142 = 0;
            var8.anInt2136 = 0;
            var8.anInt2135 = 0;
            var8.anInt2122 = 200669119;
            var8.anInt2123 = 0;
            if(this.anIntArray2541[var1] == 0) {
               var8.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var10, this.method3018(var8, 1766173644), this.method3005(var8, (byte)11), this.method3020(var8, -201612002));
            } else {
               var8.aClass116_Sub4_Sub2_2140 = Class116_Sub4_Sub2.method2733(var10, this.method3018(var8, 1830724324), 0, this.method3020(var8, -113384129));
               this.method3011(var8, var9.aShortArray2111[var2] < 0, (byte)29);
            }

            if(var9.aShortArray2111[var2] < 0) {
               var8.aClass116_Sub4_Sub2_2140.method2737(-1);
            }

            if(1587834581 * var8.anInt2126 >= 0) {
               Class116_Sub21 var6 = this.aClass116_Sub21ArrayArray2551[var1][1587834581 * var8.anInt2126];
               if(null != var6 && -524941375 * var6.anInt2122 < 0) {
                  this.aClass116_Sub21ArrayArray2543[var1][var6.anInt2137 * 1484938015] = null;
                  var6.anInt2122 = 0;
               }

               this.aClass116_Sub21ArrayArray2551[var1][1587834581 * var8.anInt2126] = var8;
            }

            this.aClass116_Sub4_Sub3_2559.aClass117_2528.addLast(var8);
            this.aClass116_Sub21ArrayArray2543[var1][var2] = var8;
         }
      }
   }

   void method3052(int var1, int var2, byte var3) {
      this.anIntArray2549[var1] = var2;
      this.anIntArray2550[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   public synchronized void method3057(Class116_Sub18 var1, boolean var2, int var3) {
      this.method3075(-586955557);
      this.aClass92_2553.method1202(var1.aByteArray2108);
      this.aBool2554 = var2;
      this.aLong2536 = 0L;
      int var5 = this.aClass92_2553.method1205();

      for(int var4 = 0; var4 < var5; ++var4) {
         this.aClass92_2553.method1206(var4);
         this.aClass92_2553.method1255(var4);
         this.aClass92_2553.method1207(var4);
      }

      this.anInt2555 = this.aClass92_2553.method1213() * 1741883139;
      this.anInt2556 = this.aClass92_2553.anIntArray1325[this.anInt2555 * 510598059] * 1469685885;
      this.aLong2558 = this.aClass92_2553.method1212(68475093 * this.anInt2556) * 6966871617677229589L;
   }

   public synchronized void method3075(int var1) {
      this.aClass92_2553.method1203();
      this.method3033(-1737418714);
   }

   public Class116_Sub4_Sub4() {
      this.method3033(-1737418714);
   }

}
