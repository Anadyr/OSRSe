package com.jagex;

public class MobDefinition extends NodeContainer {

   public int anInt2305 = 1076528657;
   short[] aShortArray2306;
   public static Class123 aClass123_2307 = new Class123(50);
   public int anInt2308;
   int anInt2309 = 341695561;
   public static Class123 aClass123_2310 = new Class123(64);
   int[] anIntArray2311;
   int[] anIntArray2312;
   public int[] anIntArray2313;
   public int anInt2314 = -1066302605;
   public int anInt2315 = -499392937;
   public int anInt2316 = -1381705353;
   public boolean aBool2317 = false;
   public int anInt2318 = 2058554739;
   public int anInt2319 = -592426295;
   public int tileSize = 569075545;
   public boolean aBool2321 = true;
   public int anInt2322 = 1309687233;
   short[] aShortArray2323;
   public String[] aStringArray2324 = new String[5];
   public boolean aBool2325 = true;
   public int anInt2326 = 634114841;
   int anInt2327 = -787489920;
   int anInt2328 = 1544651392;
   static Class99 aClass99_2329;
   short[] aShortArray2330;
   int anInt2331 = 0;
   int anInt2332 = 0;
   public int anInt2333 = -1404806752;
   short[] aShortArray2334;
   public int anInt2335 = -382962751;
   public String name = "null";
   public boolean aBool2337 = true;
   int anInt2338 = -87498741;
   public boolean aBool2339 = false;
   public int anInt2340 = -2080856918;


   void method2540(Buffer var1, int var2, int var3) {
      int sub;
      int loop;
      if(1 == var2) {
         sub = var1.readSignedByte(1708176767);
         this.anIntArray2311 = new int[sub];

         for(loop = 0; loop < sub; ++loop) {
            this.anIntArray2311[loop] = var1.readShort(-346209211);
         }
      } else if(2 == var2) {
         this.name = var1.readString(61376769);
      } else if(var2 == 12) {
         this.tileSize = var1.readSignedByte(1708176767) * 569075545;
      } else if(13 == var2) {
         this.anInt2335 = var1.readShort(1799101930) * 382962751;
      } else if(var2 == 14) {
         this.anInt2316 = var1.readShort(1789315418) * 1381705353;
      } else if(15 == var2) {
         this.anInt2314 = var1.readShort(1980263656) * 1066302605;
      } else if(var2 == 16) {
         this.anInt2322 = var1.readShort(816593763) * -1309687233;
      } else if(var2 == 17) {
         this.anInt2316 = var1.readShort(958792659) * 1381705353;
         this.anInt2315 = var1.readShort(691261764) * 499392937;
         this.anInt2318 = var1.readShort(-298648471) * -2058554739;
         this.anInt2319 = var1.readShort(51589270) * 592426295;
      } else if(var2 >= 30 && var2 < 35) {
         this.aStringArray2324[var2 - 30] = var1.readString(61376769);
         if(this.aStringArray2324[var2 - 30].equalsIgnoreCase(Class91.hidden)) {
            this.aStringArray2324[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         sub = var1.readSignedByte(1708176767);
         this.aShortArray2306 = new short[sub];
         this.aShortArray2330 = new short[sub];

         for(loop = 0; loop < sub; ++loop) {
            this.aShortArray2306[loop] = (short)var1.readShort(667935075);
            this.aShortArray2330[loop] = (short)var1.readShort(308526109);
         }
      } else if(41 == var2) {
         sub = var1.readSignedByte(1708176767);
         this.aShortArray2334 = new short[sub];
         this.aShortArray2323 = new short[sub];

         for(loop = 0; loop < sub; ++loop) {
            this.aShortArray2334[loop] = (short)var1.readShort(468837412);
            this.aShortArray2323[loop] = (short)var1.readShort(-367465963);
         }
      } else if(var2 == 60) {
         sub = var1.readSignedByte(1708176767);
         this.anIntArray2312 = new int[sub];

         for(loop = 0; loop < sub; ++loop) {
            this.anIntArray2312[loop] = var1.readShort(1581273477);
         }
      } else if(var2 == 93) {
         this.aBool2325 = false;
      } else if(95 == var2) {
         this.anInt2326 = var1.readShort(-169771852) * -634114841;
      } else if(97 == var2) {
         this.anInt2327 = var1.readShort(1926116611) * -6152265;
      } else if(var2 == 98) {
         this.anInt2328 = var1.readShort(1336491466) * 112730885;
      } else if(99 == var2) {
         this.aBool2317 = true;
      } else if(100 == var2) {
         this.anInt2332 = var1.readUnsignedByte(334359595) * 1037968587;
      } else if(101 == var2) {
         this.anInt2331 = var1.readUnsignedByte(-18842300) * 1528591265;
      } else if(var2 == 102) {
         this.anInt2305 = var1.readShort(-444196962) * -1076528657;
      } else if(var2 == 103) {
         this.anInt2333 = var1.readShort(689372567) * 627188429;
      } else if(106 == var2) {
         this.anInt2309 = var1.readShort(1093369139) * -341695561;
         if(this.anInt2309 * 1660103175 == '\uffff') {
            this.anInt2309 = 341695561;
         }

         this.anInt2338 = var1.readShort(663834261) * 87498741;
         if('\uffff' == -1519823779 * this.anInt2338) {
            this.anInt2338 = -87498741;
         }

         sub = var1.readSignedByte(1708176767);
         this.anIntArray2313 = new int[1 + sub];

         for(loop = 0; loop <= sub; ++loop) {
            this.anIntArray2313[loop] = var1.readShort(-190485852);
            if('\uffff' == this.anIntArray2313[loop]) {
               this.anIntArray2313[loop] = -1;
            }
         }
      } else if(var2 == 107) {
         this.aBool2337 = false;
      } else if(109 == var2) {
         this.aBool2321 = false;
      } else if(var2 == 111) {
         this.aBool2339 = true;
      } else if(112 == var2) {
         this.anInt2340 = var1.readSignedByte(1708176767) * 1075962715;
      }

   }

   void method2541(byte var1) {}

   public final SpotAnim method2544(Class116_Sub23_Sub4 var1, int var2, Class116_Sub23_Sub4 var3, int var4, byte var5) {
      if(this.anIntArray2313 != null) {
         MobDefinition var11 = this.method2546(-572852130);
         return var11 == null?null:var11.method2544(var1, var2, var3, var4, (byte)-4);
      } else {
         SpotAnim var6 = (SpotAnim)aClass123_2307.method1632((long)(this.anInt2308 * -2095462435));
         if(var6 == null) {
            boolean var10 = false;

            for(int var8 = 0; var8 < this.anIntArray2311.length; ++var8) {
               if(!aClass99_2329.method1373(this.anIntArray2311[var8], 0, (byte)1)) {
                  var10 = true;
               }
            }

            if(var10) {
               return null;
            }

            Model[] var9 = new Model[this.anIntArray2311.length];

            int var7;
            for(var7 = 0; var7 < this.anIntArray2311.length; ++var7) {
               var9[var7] = Model.method3114(aClass99_2329, this.anIntArray2311[var7], 0);
            }

            Model var12;
            if(1 == var9.length) {
               var12 = var9[0];
            } else {
               var12 = new Model(var9, var9.length);
            }

            if(this.aShortArray2306 != null) {
               for(var7 = 0; var7 < this.aShortArray2306.length; ++var7) {
                  var12.method3125(this.aShortArray2306[var7], this.aShortArray2330[var7]);
               }
            }

            if(null != this.aShortArray2334) {
               for(var7 = 0; var7 < this.aShortArray2334.length; ++var7) {
                  var12.method3126(this.aShortArray2334[var7], this.aShortArray2323[var7]);
               }
            }

            var6 = var12.method3133(this.anInt2332 * 482615523 + 64, 850 + this.anInt2331 * -1720520219, -30, -50, -30);
            aClass123_2307.method1633(var6, (long)(-2095462435 * this.anInt2308));
         }

         SpotAnim var13;
         if(null != var1 && null != var3) {
            var13 = var1.method2445(var6, var2, var3, var4, (byte)1);
         } else if(null != var1) {
            var13 = var1.method2455(var6, var2, -835613486);
         } else if(var3 != null) {
            var13 = var3.method2455(var6, var4, -884800336);
         } else {
            var13 = var6.method3370(true);
         }

         if(128 != this.anInt2327 * -2053902841 || 402141645 * this.anInt2328 != 128) {
            var13.method3384(-2053902841 * this.anInt2327, 402141645 * this.anInt2328, -2053902841 * this.anInt2327);
         }

         return var13;
      }
   }

   public final Model method2545(byte var1) {
      if(this.anIntArray2313 != null) {
         MobDefinition var6 = this.method2546(-572852130);
         return var6 == null?null:var6.method2545((byte)107);
      } else if(this.anIntArray2312 == null) {
         return null;
      } else {
         boolean var3 = false;

         for(int var5 = 0; var5 < this.anIntArray2312.length; ++var5) {
            if(!aClass99_2329.method1373(this.anIntArray2312[var5], 0, (byte)1)) {
               var3 = true;
            }
         }

         if(var3) {
            return null;
         } else {
            Model[] var8 = new Model[this.anIntArray2312.length];

            for(int var4 = 0; var4 < this.anIntArray2312.length; ++var4) {
               var8[var4] = Model.method3114(aClass99_2329, this.anIntArray2312[var4], 0);
            }

            Model var7;
            if(var8.length == 1) {
               var7 = var8[0];
            } else {
               var7 = new Model(var8, var8.length);
            }

            int var2;
            if(this.aShortArray2306 != null) {
               for(var2 = 0; var2 < this.aShortArray2306.length; ++var2) {
                  var7.method3125(this.aShortArray2306[var2], this.aShortArray2330[var2]);
               }
            }

            if(this.aShortArray2334 != null) {
               for(var2 = 0; var2 < this.aShortArray2334.length; ++var2) {
                  var7.method3126(this.aShortArray2334[var2], this.aShortArray2323[var2]);
               }
            }

            return var7;
         }
      }
   }

   public final MobDefinition method2546(int var1) {
      int var2 = -1;
      if(-1 != this.anInt2309 * 1660103175) {
         var2 = Class103.method1451(this.anInt2309 * 1660103175, -584760962);
      } else if(-1 != -1519823779 * this.anInt2338) {
         var2 = Class107.anIntArray1459[this.anInt2338 * -1519823779];
      }

      return var2 >= 0 && var2 < this.anIntArray2313.length && -1 != this.anIntArray2313[var2]?Class116_Sub23_Sub15.method2705(this.anIntArray2313[var2], 1382157122):null;
   }

   void method2549(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(0 == var3) {
            return;
         }

         this.method2540(var1, var3, -717088616);
      }
   }

   static final int method2552(int var0, int var1, int var2, short var3) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if(var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var7 = var2;
         if(var2 < 3 && (Class47.aByteArrayArrayArray634[1][var4][var5] & 2) == 2) {
            var7 = var2 + 1;
         }

         int var8 = var0 & 127;
         int var6 = var1 & 127;
         int var10 = Class47.anIntArrayArrayArray635[var7][var4][var5] * (128 - var8) + Class47.anIntArrayArrayArray635[var7][1 + var4][var5] * var8 >> 7;
         int var9 = var8 * Class47.anIntArrayArrayArray635[var7][var4 + 1][var5 + 1] + Class47.anIntArrayArrayArray635[var7][var4][1 + var5] * (128 - var8) >> 7;
         return var10 * (128 - var6) + var9 * var6 >> 7;
      } else {
         return 0;
      }
   }

   public boolean method2554(short var1) {
      if(null == this.anIntArray2313) {
         return true;
      } else {
         int var2 = -1;
         if(this.anInt2309 * 1660103175 != -1) {
            var2 = Class103.method1451(1660103175 * this.anInt2309, -584760962);
         } else if(-1 != -1519823779 * this.anInt2338) {
            var2 = Class107.anIntArray1459[-1519823779 * this.anInt2338];
         }

         return var2 >= 0 && var2 < this.anIntArray2313.length && this.anIntArray2313[var2] != -1;
      }
   }

   static int method2569(int var0, int var1, byte var2) {
      long var3 = (long)(var1 + (var0 << 16));
      return null != Class1.aClass116_Sub23_Sub21_7 && Class1.aClass116_Sub23_Sub21_7.nodeId == var3?1084578137 * Class93.aClass116_Sub14_1348.position / (Class93.aClass116_Sub14_1348.payload.length - Class1.aClass116_Sub23_Sub21_7.aByte2524) + 1:0;
   }

   static final void method2574(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Class116_Sub12 var10 = null;

      for(Class116_Sub12 var11 = (Class116_Sub12)client.aClass117_3162.method1551(); var11 != null; var11 = (Class116_Sub12)client.aClass117_3162.method1553()) {
         if(var0 == var11.anInt1837 * 584375567 && var1 == -1096801001 * var11.anInt1835 && -127960105 * var11.anInt1847 == var2 && var11.anInt1838 * -1976125003 == var3) {
            var10 = var11;
            break;
         }
      }

      if(null == var10) {
         var10 = new Class116_Sub12();
         var10.anInt1837 = var0 * 1663988207;
         var10.anInt1838 = 831597725 * var3;
         var10.anInt1835 = -2106367321 * var1;
         var10.anInt1847 = var2 * 1453500391;
         Class51.method784(var10, -1752116952);
         client.aClass117_3162.method1571(var10);
      }

      var10.anInt1842 = 618060995 * var4;
      var10.anInt1840 = 545495947 * var5;
      var10.anInt1843 = 1646635879 * var6;
      var10.anInt1845 = -900151381 * var7;
      var10.anInt1846 = -622541955 * var8;
   }

   static Class99_Sub1 method2575(int var0, boolean var1, boolean var2, boolean var3, int var4) {
      Class73 var5 = null;
      if(null != Class86.aClass140_1011) {
         var5 = new Class73(var0, Class86.aClass140_1011, Class47.aClass140Array625[var0], 1000000);
      }

      return new Class99_Sub1(var5, Class3.aClass73_40, var0, var1, var2, var3);
   }

}
