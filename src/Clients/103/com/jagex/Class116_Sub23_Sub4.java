package com.jagex;

public class Class116_Sub23_Sub4 extends NodeContainer {

   public int anInt2242 = 1379256319;
   static Class99 aClass99_2243;
   static Class99 aClass99_2244;
   public static Class123 aClass123_2245 = new Class123(64);
   public static Class123 aClass123_2246 = new Class123(100);
   public int[] anIntArray2247;
   public boolean aBool2248 = false;
   static int anInt2249;
   public int anInt2251 = -1049501723;
   int[] anIntArray2252;
   public int anInt2253 = 647941965;
   public int anInt2254 = -529361441;
   public int[] anIntArray2255;
   public int anInt2256 = 808696457;
   public int anInt2257 = 1430313051;
   public int anInt2258 = -927047415;
   int[] anIntArray2259;
   public int anInt2260 = 1981711194;
   public int[] anIntArray2261;
   static int anInt2262;
   static Class99 aClass99_2264;

   void method2439(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(0 == var3) {
            return;
         }

         this.method2440(var1, var3, 427573210);
      }
   }

   void method2440(Buffer var1, int var2, int var3) {
      int var4;
      int var5;
      if(1 == var2) {
         var5 = var1.readShort(1534595847);
         this.anIntArray2255 = new int[var5];

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2255[var4] = var1.readShort(381110350);
         }

         this.anIntArray2247 = new int[var5];

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2247[var4] = var1.readShort(1391590719);
         }

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2247[var4] += var1.readShort(1171785672) << 16;
         }
      } else if(2 == var2) {
         this.anInt2251 = var1.readShort(1883372109) * 1049501723;
      } else if(3 == var2) {
         var5 = var1.readSignedByte(1708176767);
         this.anIntArray2252 = new int[1 + var5];

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2252[var4] = var1.readSignedByte(1708176767);
         }

         this.anIntArray2252[var5] = 9999999;
      } else if(4 == var2) {
         this.aBool2248 = true;
      } else if(var2 == 5) {
         this.anInt2254 = var1.readSignedByte(1708176767) * 753121171;
      } else if(var2 == 6) {
         this.anInt2253 = var1.readShort(1632841621) * -647941965;
      } else if(var2 == 7) {
         this.anInt2256 = var1.readShort(-122781693) * -808696457;
      } else if(8 == var2) {
         this.anInt2257 = var1.readSignedByte(1708176767) * -1677509207;
      } else if(var2 == 9) {
         this.anInt2258 = var1.readSignedByte(1708176767) * 927047415;
      } else if(var2 == 10) {
         this.anInt2242 = var1.readSignedByte(1708176767) * -1379256319;
      } else if(11 == var2) {
         this.anInt2260 = var1.readSignedByte(1708176767) * 990855597;
      } else if(12 == var2) {
         var5 = var1.readSignedByte(1708176767);
         this.anIntArray2259 = new int[var5];

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2259[var4] = var1.readShort(1839025841);
         }

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2259[var4] += var1.readShort(767002877) << 16;
         }
      } else if(var2 == 13) {
         var5 = var1.readSignedByte(1708176767);
         this.anIntArray2261 = new int[var5];

         for(var4 = 0; var4 < var5; ++var4) {
            this.anIntArray2261[var4] = var1.readMedium((byte) 15);
         }
      }

   }

   void method2441(int var1) {
      if(-1 == this.anInt2258 * -1948482873) {
         if(this.anIntArray2252 == null) {
            this.anInt2258 = 0;
         } else {
            this.anInt2258 = 1854094830;
         }
      }

      if(-1 == -1099577343 * this.anInt2242) {
         if(this.anIntArray2252 != null) {
            this.anInt2242 = 1536454658;
         } else {
            this.anInt2242 = 0;
         }
      }

   }

   SpotAnim method2443(SpotAnim var1, int var2, int var3, int var4) {
      var2 = this.anIntArray2247[var2];
      Class116_Sub23_Sub17 var6 = method2473(var2 >> 16, (byte)-37);
      var2 &= '\uffff';
      if(var6 == null) {
         return var1.method3370(true);
      } else {
         SpotAnim var5 = var1.method3370(!var6.method2881(var2, (byte)-110));
         var3 &= 3;
         if(1 == var3) {
            var5.method3381();
         } else if(var3 == 2) {
            var5.method3380();
         } else if(3 == var3) {
            var5.method3402();
         }

         var5.method3376(var6, var2);
         if(1 == var3) {
            var5.method3402();
         } else if(var3 == 2) {
            var5.method3380();
         } else if(3 == var3) {
            var5.method3381();
         }

         return var5;
      }
   }

   SpotAnim method2444(SpotAnim var1, int var2, int var3) {
      var2 = this.anIntArray2247[var2];
      Class116_Sub23_Sub17 var4 = method2473(var2 >> 16, (byte)35);
      var2 &= '\uffff';
      if(null == var4) {
         return var1.method3371(true);
      } else {
         SpotAnim var5 = var1.method3371(!var4.method2881(var2, (byte)-36));
         var5.method3376(var4, var2);
         return var5;
      }
   }

   public SpotAnim method2445(SpotAnim var1, int var2, Class116_Sub23_Sub4 var3, int var4, byte var5) {
      var2 = this.anIntArray2247[var2];
      Class116_Sub23_Sub17 var7 = method2473(var2 >> 16, (byte)5);
      var2 &= '\uffff';
      if(null == var7) {
         return var3.method2455(var1, var4, -1853457244);
      } else {
         var4 = var3.anIntArray2247[var4];
         Class116_Sub23_Sub17 var8 = method2473(var4 >> 16, (byte)1);
         var4 &= '\uffff';
         SpotAnim var6;
         if(null == var8) {
            var6 = var1.method3370(!var7.method2881(var2, (byte)-108));
            var6.method3376(var7, var2);
            return var6;
         } else {
            var6 = var1.method3370(!var7.method2881(var2, (byte)-102) & !var8.method2881(var4, (byte)-72));
            var6.method3383(var7, var2, var8, var4, this.anIntArray2252);
            return var6;
         }
      }
   }

   public SpotAnim method2446(SpotAnim var1, int var2, int var3) {
      int var4 = this.anIntArray2247[var2];
      Class116_Sub23_Sub17 var5 = method2473(var4 >> 16, (byte)9);
      var4 &= '\uffff';
      if(var5 == null) {
         return var1.method3370(true);
      } else {
         Class116_Sub23_Sub17 var6 = null;
         int var7 = 0;
         if(null != this.anIntArray2259 && var2 < this.anIntArray2259.length) {
            var7 = this.anIntArray2259[var2];
            var6 = method2473(var7 >> 16, (byte)9);
            var7 &= '\uffff';
         }

         SpotAnim var8;
         if(null != var6 && var7 != '\uffff') {
            var8 = var1.method3370(!var5.method2881(var4, (byte)-35) & !var6.method2881(var7, (byte)-91));
            var8.method3376(var5, var4);
            var8.method3376(var6, var7);
            return var8;
         } else {
            var8 = var1.method3370(!var5.method2881(var4, (byte)-103));
            var8.method3376(var5, var4);
            return var8;
         }
      }
   }

   public static Class116_Sub23_Sub19_Sub3 method2447(Class99 var0, String var1, String var2, int var3) {
      int var4 = var0.method1366(var1, -779655899);
      int var6 = var0.method1367(var4, var2, 1840613538);
      Class116_Sub23_Sub19_Sub3 var5;
      if(!Class41.method687(var0, var4, var6, -1222348333)) {
         var5 = null;
      } else {
         var5 = Class40.method685((byte)9);
      }

      return var5;
   }

   public SpotAnim method2455(SpotAnim var1, int var2, int var3) {
      var2 = this.anIntArray2247[var2];
      Class116_Sub23_Sub17 var5 = method2473(var2 >> 16, (byte)57);
      var2 &= '\uffff';
      if(var5 == null) {
         return var1.method3370(true);
      } else {
         SpotAnim var4 = var1.method3370(!var5.method2881(var2, (byte)-78));
         var4.method3376(var5, var2);
         return var4;
      }
   }

   static void method2469(Class116_Sub15 var0, int var1, int var2, int var3) {
      if(0 == var0.anInt1930 * -1186475957) {
         var0.anInt1938 = 1700268279 * var0.anInt1934;
      } else if(var0.anInt1930 * -1186475957 == 1) {
         var0.anInt1938 = ((var1 - var0.anInt1940 * 1645211541) / 2 + var0.anInt1934 * -459849887) * -79896745;
      } else if(2 == var0.anInt1930 * -1186475957) {
         var0.anInt1938 = -79896745 * (var1 - var0.anInt1940 * 1645211541 - -459849887 * var0.anInt1934);
      } else if(-1186475957 * var0.anInt1930 == 3) {
         var0.anInt1938 = -79896745 * (var0.anInt1934 * -459849887 * var1 >> 14);
      } else if(-1186475957 * var0.anInt1930 == 4) {
         var0.anInt1938 = ((var1 - 1645211541 * var0.anInt1940) / 2 + (var1 * var0.anInt1934 * -459849887 >> 14)) * -79896745;
      } else {
         var0.anInt1938 = -79896745 * (var1 - 1645211541 * var0.anInt1940 - (var1 * -459849887 * var0.anInt1934 >> 14));
      }

      if(0 == -306698303 * var0.anInt1915) {
         var0.anInt1939 = var0.anInt2029 * 1595301305;
      } else if(1 == var0.anInt1915 * -306698303) {
         var0.anInt1939 = 1094821665 * (var0.anInt2029 * 538516377 + (var2 - 1227800423 * var0.anInt1974) / 2);
      } else if(2 == -306698303 * var0.anInt1915) {
         var0.anInt1939 = (var2 - 1227800423 * var0.anInt1974 - 538516377 * var0.anInt2029) * 1094821665;
      } else if(3 == var0.anInt1915 * -306698303) {
         var0.anInt1939 = (var2 * 538516377 * var0.anInt2029 >> 14) * 1094821665;
      } else if(4 == -306698303 * var0.anInt1915) {
         var0.anInt1939 = 1094821665 * ((var2 - 1227800423 * var0.anInt1974) / 2 + (var0.anInt2029 * 538516377 * var2 >> 14));
      } else {
         var0.anInt1939 = 1094821665 * (var2 - 1227800423 * var0.anInt1974 - (var2 * 538516377 * var0.anInt2029 >> 14));
      }

      if(client.aBool2957 && var0.anInt2018 * -1305917269 == 0) {
         if(332168295 * var0.anInt1938 < 0) {
            var0.anInt1938 = 0;
         } else if(1645211541 * var0.anInt1940 + 332168295 * var0.anInt1938 > var1) {
            var0.anInt1938 = -79896745 * (var1 - 1645211541 * var0.anInt1940);
         }

         if(var0.anInt1939 * 1492425953 < 0) {
            var0.anInt1939 = 0;
         } else if(1492425953 * var0.anInt1939 + 1227800423 * var0.anInt1974 > var2) {
            var0.anInt1939 = (var2 - var0.anInt1974 * 1227800423) * 1094821665;
         }
      }

   }

   public static int method2470(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var4 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         var4 = (var4 << 5) - var4 + Class24.method529(var0.charAt(var3), -543467890);
      }

      return var4;
   }

   static final void method2471(String var0, int var1) {
      if(null != var0) {
         String var4 = Class116_Sub23_Sub15.method2702(var0, Class59_Sub1.aClass143_1831, 732631240);
         if(null != var4) {
            for(int var2 = 0; var2 < -1616775607 * client.anInt3152; ++var2) {
               Class50 var3 = client.aClass50Array3204[var2];
               String var5 = var3.aString670;
               String var6 = Class116_Sub23_Sub15.method2702(var5, Class59_Sub1.aClass143_1831, 2024279034);
               if(Class116_Sub10.method1960(var0, var4, var5, var6, -1945936884)) {
                  client.anInt3152 -= -1013982215;

                  for(int var7 = var2; var7 < client.anInt3152 * -1616775607; ++var7) {
                     client.aClass50Array3204[var7] = client.aClass50Array3204[var7 + 1];
                  }

                  client.anInt3068 = client.anInt3118 * -712636309;
                  client.rsaBuffer.startPacket(210, (byte) 47);
                  client.rsaBuffer.writeByte(Class22.calculateJGString(var0, -2076938461), -1977616253);
                  client.rsaBuffer.writeJGString(var0, 1109292050);
                  break;
               }
            }

         }
      }
   }

   static Class116_Sub23_Sub17 method2473(int var0, byte var1) {
      Class116_Sub23_Sub17 var2 = (Class116_Sub23_Sub17)aClass123_2246.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         Class99 var3 = aClass99_2243;
         Class99 var4 = aClass99_2244;
         boolean var5 = true;
         int[] var6 = var3.method1404(var0, (byte)0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method1379(var0, var6[var7], 1571558328);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method1379(var9, 0, 562585169);
               if(null == var10) {
                  var5 = false;
               }
            }
         }

         Class116_Sub23_Sub17 var11;
         if(!var5) {
            var11 = null;
         } else {
            try {
               var11 = new Class116_Sub23_Sub17(var3, var4, var0, false);
            } catch (Exception var12) {
               var11 = null;
            }
         }

         if(var11 != null) {
            aClass123_2246.method1633(var11, (long)var0);
         }

         return var11;
      }
   }
}
