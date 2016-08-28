package com.jagex;
import java.awt.Canvas;
import java.awt.Color;
import java.io.IOException;

public class Class116_Sub23_Sub11 extends NodeContainer {

   public static final int anInt2353 = 4;
   public static final int anInt2354 = 1;
   int anInt2355;
   public static Class123 aClass123_2356 = new Class123(64);
   public static Class123 aClass123_2357 = new Class123(50);
   int anInt2358;
   public int anInt2359;
   short[] aShortArray2360;
   public String aString2361 = "null";
   short[] aShortArray2362;
   short[] aShortArray2363;
   short[] aShortArray2364;
   public int anInt2365 = 1382601623;
   public static final int anInt2366 = 0;
   public int anInt2367 = 0;
   public int anInt2368 = 0;
   int anInt2369;
   int anInt2370;
   public int anInt2371 = 0;
   public int anInt2372 = 0;
   public int anInt2373;
   public boolean aBool2374 = false;
   static Sprite[] headIconsPrayer;
   public static Class123 aClass123_2376 = new Class123(200);
   int anInt2377;
   public static RSIndex aRSIndex_2378;
   int anInt2379;
   public boolean aBool2380;
   int anInt2381;
   int anInt2382;
   int anInt2383;
   int anInt2384;
   int anInt2385;
   int anInt2386;
   public String[] aStringArray2387;
   int anInt2388;
   int[] anIntArray2389;
   int[] anIntArray2390;
   public String[] aStringArray2391;
   public int anInt2392;
   public int anInt2393 = 0;
   int anInt2394;
   int anInt2395;
   public int anInt2396 = -960162032;
   public int anInt2397;
   public int anInt2398;
   public int anInt2399;
   int anInt2400;
   int anInt2401;
   public int anInt2402 = 0;
   int anInt2403;
   void method2587(int var1) {}

   void method2588(Packet var1, byte var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2605(var1, var3, (short)5161);
      }
   }

   public final Model method2591(int var1, int var2) {
      int var4;
      if(this.anIntArray2389 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.anIntArray2390[var4] && this.anIntArray2390[var4] != 0) {
               var3 = this.anIntArray2389[var4];
            }
         }

         if(var3 != -1) {
            return RelationList.method778(var3, (byte) 70).method2591(1, -52018867);
         }
      }

      Model var5 = Model.method3114(Class60.aRSIndex_783, this.anInt2388 * 908818241, 0);
      if(var5 == null) {
         return null;
      } else {
         if(-1690965437 * this.anInt2370 != 128 || 128 != -128875985 * this.anInt2394 || 128 != this.anInt2395 * -1842417525) {
            var5.method3128(-1690965437 * this.anInt2370, -128875985 * this.anInt2394, this.anInt2395 * -1842417525);
         }

         if(this.aShortArray2362 != null) {
            for(var4 = 0; var4 < this.aShortArray2362.length; ++var4) {
               var5.method3125(this.aShortArray2362[var4], this.aShortArray2363[var4]);
            }
         }

         if(null != this.aShortArray2364) {
            for(var4 = 0; var4 < this.aShortArray2364.length; ++var4) {
               var5.method3126(this.aShortArray2364[var4], this.aShortArray2360[var4]);
            }
         }

         return var5;
      }
   }

   static void method2592(int var0) {
      Class89.method1190(Tile.aCanvas1875, -1566496928);
      Canvas var1 = Tile.aCanvas1875;
      var1.removeMouseListener(Class85.aClass85_987);
      var1.removeMouseMotionListener(Class85.aClass85_987);
      var1.removeFocusListener(Class85.aClass85_987);
      Class85.anInt996 = 0;
      if(null != Class32.aClass89_443) {
         Class32.aClass89_443.method1185(Tile.aCanvas1875, (byte)-9);
      }

      client.aclient2930.method3570(-560768201);
      Tile.aCanvas1875.setBackground(Color.black);
      Class116_Sub23_Sub14.method2681(Tile.aCanvas1875, 1387887133);
      Canvas var2 = Tile.aCanvas1875;
      var2.addMouseListener(Class85.aClass85_987);
      var2.addMouseMotionListener(Class85.aClass85_987);
      var2.addFocusListener(Class85.aClass85_987);
      if(Class32.aClass89_443 != null) {
         Class32.aClass89_443.method1180(Tile.aCanvas1875, (short)22759);
      }

      if(-1 != -1074177723 * client.anInt3200) {
         Class116_Sub10.method1971(false, (byte)122);
      }

      client.aBool2923 = true;
   }

   public final SpotAnim method2593(int var1, int var2) {
      if(this.anIntArray2389 != null && var1 > 1) {
         int var4 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.anIntArray2390[var3] && this.anIntArray2390[var3] != 0) {
               var4 = this.anIntArray2389[var3];
            }
         }

         if(-1 != var4) {
            return RelationList.method778(var4, (byte) 70).method2593(1, 1861499827);
         }
      }

      SpotAnim var7 = (SpotAnim)aClass123_2357.method1632((long)(this.anInt2359 * 1548676283));
      if(var7 != null) {
         return var7;
      } else {
         Model var6 = Model.method3114(Class60.aRSIndex_783, this.anInt2388 * 908818241, 0);
         if(var6 == null) {
            return null;
         } else {
            if(128 != -1690965437 * this.anInt2370 || 128 != -128875985 * this.anInt2394 || 128 != -1842417525 * this.anInt2395) {
               var6.method3128(-1690965437 * this.anInt2370, this.anInt2394 * -128875985, -1842417525 * this.anInt2395);
            }

            int var5;
            if(this.aShortArray2362 != null) {
               for(var5 = 0; var5 < this.aShortArray2362.length; ++var5) {
                  var6.method3125(this.aShortArray2362[var5], this.aShortArray2363[var5]);
               }
            }

            if(this.aShortArray2364 != null) {
               for(var5 = 0; var5 < this.aShortArray2364.length; ++var5) {
                  var6.method3126(this.aShortArray2364[var5], this.aShortArray2360[var5]);
               }
            }

            var7 = var6.method3133(-1058514191 * this.anInt2373 + 64, 768 + this.anInt2397 * 1955247405, -50, -10, -50);
            var7.aBool2809 = true;
            aClass123_2357.method1633(var7, (long)(this.anInt2359 * 1548676283));
            return var7;
         }
      }
   }

   public Class116_Sub23_Sub11 method2594(int var1, byte var2) {
      if(this.anIntArray2389 != null && var1 > 1) {
         int var4 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.anIntArray2390[var3] && 0 != this.anIntArray2390[var3]) {
               var4 = this.anIntArray2389[var3];
            }
         }

         if(-1 != var4) {
            return RelationList.method778(var4, (byte) 70);
         }
      }

      return this;
   }

   public final boolean method2595(boolean var1, int var2) {
      int var3 = -821171859 * this.anInt2400;
      int var4 = -1921075131 * this.anInt2358;
      int var5 = -649106615 * this.anInt2383;
      if(var1) {
         var3 = 1114049831 * this.anInt2355;
         var4 = -792495881 * this.anInt2369;
         var5 = -316692799 * this.anInt2384;
      }

      if(-1 == var3) {
         return true;
      } else {
         boolean var6 = true;
         if(!Class60.aRSIndex_783.method1373(var3, 0, (byte)1)) {
            var6 = false;
         }

         if(-1 != var4 && !Class60.aRSIndex_783.method1373(var4, 0, (byte)1)) {
            var6 = false;
         }

         if(var5 != -1 && !Class60.aRSIndex_783.method1373(var5, 0, (byte)1)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final Model method2596(boolean var1, int var2) {
      int var3 = -821171859 * this.anInt2400;
      int var6 = -1921075131 * this.anInt2358;
      int var5 = this.anInt2383 * -649106615;
      if(var1) {
         var3 = 1114049831 * this.anInt2355;
         var6 = -792495881 * this.anInt2369;
         var5 = -316692799 * this.anInt2384;
      }

      if(-1 == var3) {
         return null;
      } else {
         Model var7 = Model.method3114(Class60.aRSIndex_783, var3, 0);
         if(var6 != -1) {
            Model var4 = Model.method3114(Class60.aRSIndex_783, var6, 0);
            if(-1 != var5) {
               Model var8 = Model.method3114(Class60.aRSIndex_783, var5, 0);
               Model[] var9 = new Model[]{var7, var4, var8};
               var7 = new Model(var9, 3);
            } else {
               Model[] var11 = new Model[]{var7, var4};
               var7 = new Model(var11, 2);
            }
         }

         if(!var1 && 0 != this.anInt2379 * 287819475) {
            var7.method3124(0, this.anInt2379 * 287819475, 0);
         }

         if(var1 && 0 != this.anInt2382 * 130573621) {
            var7.method3124(0, 130573621 * this.anInt2382, 0);
         }

         int var10;
         if(this.aShortArray2362 != null) {
            for(var10 = 0; var10 < this.aShortArray2362.length; ++var10) {
               var7.method3125(this.aShortArray2362[var10], this.aShortArray2363[var10]);
            }
         }

         if(null != this.aShortArray2364) {
            for(var10 = 0; var10 < this.aShortArray2364.length; ++var10) {
               var7.method3126(this.aShortArray2364[var10], this.aShortArray2360[var10]);
            }
         }

         return var7;
      }
   }

   public final boolean method2597(boolean var1, int var2) {
      int var3 = -1745101833 * this.anInt2385;
      int var5 = 737513797 * this.anInt2386;
      if(var1) {
         var3 = 1382121007 * this.anInt2403;
         var5 = 1943979269 * this.anInt2377;
      }

      if(-1 == var3) {
         return true;
      } else {
         boolean var4 = true;
         if(!Class60.aRSIndex_783.method1373(var3, 0, (byte)1)) {
            var4 = false;
         }

         if(-1 != var5 && !Class60.aRSIndex_783.method1373(var5, 0, (byte)1)) {
            var4 = false;
         }

         return var4;
      }
   }

   void method2600(Class116_Sub23_Sub11 var1, Class116_Sub23_Sub11 var2, int var3) {
      this.anInt2388 = var1.anInt2388 * 1;
      this.anInt2396 = var1.anInt2396 * 1;
      this.anInt2367 = var1.anInt2367 * 1;
      this.anInt2368 = 1 * var1.anInt2368;
      this.anInt2393 = 1 * var1.anInt2393;
      this.anInt2402 = var1.anInt2402 * 1;
      this.anInt2371 = var1.anInt2371 * 1;
      this.aShortArray2362 = var2.aShortArray2362;
      this.aShortArray2363 = var2.aShortArray2363;
      this.aShortArray2364 = var2.aShortArray2364;
      this.aShortArray2360 = var2.aShortArray2360;
      this.aString2361 = var2.aString2361;
      this.aBool2374 = var2.aBool2374;
      this.anInt2372 = 1 * var2.anInt2372;
      this.anInt2400 = 1 * var2.anInt2400;
      this.anInt2358 = var2.anInt2358 * 1;
      this.anInt2383 = var2.anInt2383 * 1;
      this.anInt2355 = var2.anInt2355 * 1;
      this.anInt2369 = 1 * var2.anInt2369;
      this.anInt2384 = var2.anInt2384 * 1;
      this.anInt2385 = 1 * var2.anInt2385;
      this.anInt2386 = var2.anInt2386 * 1;
      this.anInt2403 = 1 * var2.anInt2403;
      this.anInt2377 = 1 * var2.anInt2377;
      this.anInt2398 = 1 * var2.anInt2398;
      this.aStringArray2391 = var2.aStringArray2391;
      this.aStringArray2387 = new String[5];
      if(var2.aStringArray2387 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.aStringArray2387[var4] = var2.aStringArray2387[var4];
         }
      }

      this.aStringArray2387[4] = Class91.aString1170;
      this.anInt2365 = 0;
   }

   void method2605(Packet var1, int var2, short var3) {
      if(1 == var2) {
         this.anInt2388 = var1.readUnsignedShort(839602619) * -674424639;
      } else if(2 == var2) {
         this.aString2361 = var1.readString(61376769);
      } else if(4 == var2) {
         this.anInt2396 = var1.readUnsignedShort(1169797142) * -1306150139;
      } else if(var2 == 5) {
         this.anInt2367 = var1.readUnsignedShort(1986676049) * 135687661;
      } else if(var2 == 6) {
         this.anInt2368 = var1.readUnsignedShort(346814689) * -463941183;
      } else if(var2 == 7) {
         this.anInt2402 = var1.readUnsignedShort(807365027) * -1139144573;
         if(this.anInt2402 * 2086962731 > 32767) {
            this.anInt2402 -= 142802944;
         }
      } else if(var2 == 8) {
         this.anInt2371 = var1.readUnsignedShort(2078798660) * 2111045293;
         if(-2057824987 * this.anInt2371 > 32767) {
            this.anInt2371 -= -22216704;
         }
      } else if(11 == var2) {
         this.anInt2372 = 1721830175;
      } else if(var2 == 12) {
         this.anInt2365 = var1.readInt(-461551426) * 1382601623;
      } else if(var2 == 16) {
         this.aBool2374 = true;
      } else if(23 == var2) {
         this.anInt2400 = var1.readUnsignedShort(1924820596) * 1910868069;
         this.anInt2379 = var1.readSignedByte(1708176767) * -1037794981;
      } else if(var2 == 24) {
         this.anInt2358 = var1.readUnsignedShort(726658145) * -836789619;
      } else if(var2 == 25) {
         this.anInt2355 = var1.readUnsignedShort(2032323900) * -1561226601;
         this.anInt2382 = var1.readSignedByte(1708176767) * -908557027;
      } else if(var2 == 26) {
         this.anInt2369 = var1.readUnsignedShort(1622815270) * -1814771513;
      } else if(var2 >= 30 && var2 < 35) {
         this.aStringArray2391[var2 - 30] = var1.readString(61376769);
         if(this.aStringArray2391[var2 - 30].equalsIgnoreCase(Class91.hidden)) {
            this.aStringArray2391[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.aStringArray2387[var2 - 35] = var1.readString(61376769);
      } else {
         int var4;
         int var5;
         if(var2 == 40) {
            var5 = var1.readSignedByte(1708176767);
            this.aShortArray2362 = new short[var5];
            this.aShortArray2363 = new short[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.aShortArray2362[var4] = (short)var1.readUnsignedShort(1626592604);
               this.aShortArray2363[var4] = (short)var1.readUnsignedShort(526027824);
            }
         } else if(var2 == 41) {
            var5 = var1.readSignedByte(1708176767);
            this.aShortArray2364 = new short[var5];
            this.aShortArray2360 = new short[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.aShortArray2364[var4] = (short)var1.readUnsignedShort(1582650826);
               this.aShortArray2360[var4] = (short)var1.readUnsignedShort(-393583002);
            }
         } else if(var2 == 65) {
            this.aBool2380 = true;
         } else if(var2 == 78) {
            this.anInt2383 = var1.readUnsignedShort(-350169089) * -1629128967;
         } else if(var2 == 79) {
            this.anInt2384 = var1.readUnsignedShort(1395518503) * -1586370239;
         } else if(var2 == 90) {
            this.anInt2385 = var1.readUnsignedShort(-233772154) * -1668721209;
         } else if(var2 == 91) {
            this.anInt2403 = var1.readUnsignedShort(-205340022) * 327059663;
         } else if(92 == var2) {
            this.anInt2386 = var1.readUnsignedShort(1271561739) * 304503181;
         } else if(93 == var2) {
            this.anInt2377 = var1.readUnsignedShort(499158228) * 228605901;
         } else if(95 == var2) {
            this.anInt2393 = var1.readUnsignedShort(2121333323) * -375066123;
         } else if(var2 == 97) {
            this.anInt2399 = var1.readUnsignedShort(-394139370) * 133297667;
         } else if(98 == var2) {
            this.anInt2392 = var1.readUnsignedShort(45026868) * -1767449801;
         } else if(var2 >= 100 && var2 < 110) {
            if(this.anIntArray2389 == null) {
               this.anIntArray2389 = new int[10];
               this.anIntArray2390 = new int[10];
            }

            this.anIntArray2389[var2 - 100] = var1.readUnsignedShort(233689216);
            this.anIntArray2390[var2 - 100] = var1.readUnsignedShort(1215390393);
         } else if(var2 == 110) {
            this.anInt2370 = var1.readUnsignedShort(1624869876) * 1611805291;
         } else if(111 == var2) {
            this.anInt2394 = var1.readUnsignedShort(1987437728) * 1478558927;
         } else if(var2 == 112) {
            this.anInt2395 = var1.readUnsignedShort(1198132810) * -446826717;
         } else if(113 == var2) {
            this.anInt2373 = var1.readUnsignedByte(1993877045) * -262842863;
         } else if(var2 == 114) {
            this.anInt2397 = var1.readUnsignedByte(1289444180) * 886041913;
         } else if(var2 == 115) {
            this.anInt2398 = var1.readSignedByte(1708176767) * -1632397881;
         } else if(var2 == 139) {
            this.anInt2381 = var1.readUnsignedShort(1677369300) * 922585677;
         } else if(var2 == 140) {
            this.anInt2401 = var1.readUnsignedShort(91956155) * 1087213371;
         }
      }

   }

   Class116_Sub23_Sub11() {
      this.aStringArray2391 = new String[]{null, null, Class91.aString1288, null, null};
      this.aStringArray2387 = new String[]{null, null, null, null, Class91.aString1048};
      this.anInt2400 = -1910868069;
      this.anInt2358 = 836789619;
      this.anInt2379 = 0;
      this.anInt2355 = 1561226601;
      this.anInt2369 = 1814771513;
      this.anInt2382 = 0;
      this.anInt2383 = 1629128967;
      this.anInt2384 = 1586370239;
      this.anInt2385 = 1668721209;
      this.anInt2386 = -304503181;
      this.anInt2403 = -327059663;
      this.anInt2377 = -228605901;
      this.anInt2399 = -133297667;
      this.anInt2392 = 1767449801;
      this.anInt2370 = 152647040;
      this.anInt2394 = 276981632;
      this.anInt2395 = -1359244928;
      this.anInt2373 = 0;
      this.anInt2397 = 0;
      this.anInt2398 = 0;
      this.aBool2380 = false;
      this.anInt2381 = -922585677;
      this.anInt2401 = -1087213371;
   }

   public final Model method2624(boolean var1, int var2) {
      int var3 = -1745101833 * this.anInt2385;
      int var5 = this.anInt2386 * 737513797;
      if(var1) {
         var3 = 1382121007 * this.anInt2403;
         var5 = 1943979269 * this.anInt2377;
      }

      if(var3 == -1) {
         return null;
      } else {
         Model var6 = Model.method3114(Class60.aRSIndex_783, var3, 0);
         if(var5 != -1) {
            Model var4 = Model.method3114(Class60.aRSIndex_783, var5, 0);
            Model[] var7 = new Model[]{var6, var4};
            var6 = new Model(var7, 2);
         }

         int var8;
         if(null != this.aShortArray2362) {
            for(var8 = 0; var8 < this.aShortArray2362.length; ++var8) {
               var6.method3125(this.aShortArray2362[var8], this.aShortArray2363[var8]);
            }
         }

         if(null != this.aShortArray2364) {
            for(var8 = 0; var8 < this.aShortArray2364.length; ++var8) {
               var6.method3126(this.aShortArray2364[var8], this.aShortArray2360[var8]);
            }
         }

         return var6;
      }
   }

   void method2636(Class116_Sub23_Sub11 var1, Class116_Sub23_Sub11 var2, int var3) {
      this.anInt2388 = var1.anInt2388 * 1;
      this.anInt2396 = var1.anInt2396 * 1;
      this.anInt2367 = var1.anInt2367 * 1;
      this.anInt2368 = 1 * var1.anInt2368;
      this.anInt2393 = var1.anInt2393 * 1;
      this.anInt2402 = var1.anInt2402 * 1;
      this.anInt2371 = var1.anInt2371 * 1;
      this.aShortArray2362 = var1.aShortArray2362;
      this.aShortArray2363 = var1.aShortArray2363;
      this.aShortArray2364 = var1.aShortArray2364;
      this.aShortArray2360 = var1.aShortArray2360;
      this.aString2361 = var2.aString2361;
      this.aBool2374 = var2.aBool2374;
      this.anInt2365 = var2.anInt2365 * 1;
      this.anInt2372 = 1721830175;
   }

   static void method2637(int var0, int var1, int itemId, int amt, int var4) {
      Class116_Sub10 var5 = (Class116_Sub10)Class116_Sub10.aHashtable_1803.get((long) var0);
      if(var5 == null) {
         var5 = new Class116_Sub10();
         Class116_Sub10.aHashtable_1803.put(var5, (long) var0);
      }

      if(var5.anIntArray1812.length <= var1) {
         int[] var8 = new int[1 + var1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var5.anIntArray1812.length; ++var7) {
            var8[var7] = var5.anIntArray1812[var7];
            var6[var7] = var5.anIntArray1804[var7];
         }

         for(var7 = var5.anIntArray1812.length; var7 < var1; ++var7) {
            var8[var7] = -1;
            var6[var7] = 0;
         }

         var5.anIntArray1812 = var8;
         var5.anIntArray1804 = var6;
      }

      var5.anIntArray1812[var1] = itemId;
      var5.anIntArray1804[var1] = amt;
   }

   static Class29 method2638(int var0) {
      Class145 var1 = null;
      Class29 var2 = new Class29();

      try {
         var1 = Class40.method686("", client.aClass88_3039.aString1028, false, -138811260);
         byte[] var3 = new byte[(int)var1.method1813(-980664584)];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method1811(var3, var4, var3.length - var4, -1783119663);
            if(var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new Class29(new Packet(var3));
      } catch (Exception var7) {
         ;
      }

      try {
         if(null != var1) {
            var1.method1828(1574320643);
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }

}
