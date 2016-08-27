package com.jagex;

public class Region {

   static int anInt281;
   static int[] anIntArray282 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   int anInt283;
   static Class42[] aClass42Array284 = new Class42[500];
   int[][][] anIntArrayArrayArray285;
   Tile[][][] groundTiles;
   static Deque aClass117_287 = new Deque();
   static boolean[][] aBoolArrayArray288;
   TileObj5[] aTileObj5Array289 = new TileObj5[5000];
   int[][][] anIntArrayArrayArray290;
   static int anInt293;
   int anInt294;
   static int anInt295 = 0;
   static int anInt296;
   static int anInt297;
   static TileObj5[] aTileObj5Array298 = new TileObj5[100];
   static int anInt299;
   public static boolean aBool300 = true;
   static int anInt301;
   static int anInt302;
   static int anInt303;
   static final int anInt304 = 50;
   int anInt305;
   static final int anInt306 = 32;
   static int anInt307;
   static int anInt308;
   static int anInt309;
   static int anInt310;
   static final int anInt311 = 25;
   static boolean aBool312 = false;
   static int anInt313 = 0;
   static final int anInt314 = 128;
   static int anInt315 = 0;
   static int anInt316;
   static int anInt317;
   static int anInt318;
   static int anInt319 = 0;
   static int anInt320 = 4;
   static int[] anIntArray321 = new int[anInt320];
   static Class42[][] aClass42ArrayArray322 = new Class42[anInt320][500];
   int anInt323 = 0;
   static int anInt324 = 0;
   static int anInt325 = 0;
   static int[] anIntArray326 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   static int[] anIntArray327 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   static int anInt328;
   static int[] anIntArray329 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   static int[] anIntArray330 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   static int[] anIntArray331 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   static int[] anIntArray332 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   int[][] anIntArrayArray333 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] anIntArrayArray334 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   static boolean[][][][] aBoolArrayArrayArrayArray335 = new boolean[8][32][51][51];
   public static int anInt336 = -1;
   static int anInt337;
   static int anInt338;
   int anInt339 = 0;
   static int anInt340;
   public static int anInt341 = -1;
   static int anInt342;

   public void clearTiles() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.anInt305; ++var1) {
         for(var2 = 0; var2 < this.anInt283; ++var2) {
            for(int var3 = 0; var3 < this.anInt294; ++var3) {
               this.groundTiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < anInt320; ++var1) {
         for(var2 = 0; var2 < anIntArray321[var1]; ++var2) {
            aClass42ArrayArray322[var1][var2] = null;
         }

         anIntArray321[var1] = 0;
      }

      for(var1 = 0; var1 < this.anInt339; ++var1) {
         this.aTileObj5Array289[var1] = null;
      }

      this.anInt339 = 0;

      for(var1 = 0; var1 < aTileObj5Array298.length; ++var1) {
         aTileObj5Array298[var1] = null;
      }

   }

   public void method347(int var1) {
      this.anInt323 = var1;

      for(int var2 = 0; var2 < this.anInt283; ++var2) {
         for(int var3 = 0; var3 < this.anInt294; ++var3) {
            if(this.groundTiles[var1][var2][var3] == null) {
               this.groundTiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   public Region(int height, int x, int y, int[][][] var4) {
      this.anInt305 = height;
      this.anInt283 = x;
      this.anInt294 = y;
      this.groundTiles = new Tile[height][x][y];
      this.anIntArrayArrayArray290 = new int[height][x + 1][y + 1];
      this.anIntArrayArrayArray285 = var4;
      this.clearTiles();
   }

   public void method350(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      int var21;
      Class38 var22;
      if(var4 == 0) {
         var22 = new Class38(var11, var12, var13, var14, -1, var19, false);

         for(var21 = var1; var21 >= 0; --var21) {
            if(this.groundTiles[var21][var2][var3] == null) {
               this.groundTiles[var21][var2][var3] = new Tile(var21, var2, var3);
            }
         }

         this.groundTiles[var1][var2][var3].aClass38_1855 = var22;
      } else if(var4 != 1) {
         Class46 var23 = new Class46(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var21 = var1; var21 >= 0; --var21) {
            if(this.groundTiles[var21][var2][var3] == null) {
               this.groundTiles[var21][var2][var3] = new Tile(var21, var2, var3);
            }
         }

         this.groundTiles[var1][var2][var3].aClass46_1856 = var23;
      } else {
         var22 = new Class38(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var21 = var1; var21 >= 0; --var21) {
            if(this.groundTiles[var21][var2][var3] == null) {
               this.groundTiles[var21][var2][var3] = new Tile(var21, var2, var3);
            }
         }

         this.groundTiles[var1][var2][var3].aClass38_1855 = var22;
      }
   }

   public void method351(int var1, int var2, int var3, int var4, Animable var5, int var6, int var7) {
      if(var5 != null) {
         Class22 var8 = new Class22();
         var8.anAnimable = var5;
         var8.anInt269 = var2 * -1635206272 + -817603136;
         var8.anInt271 = var3 * 1413997440 + 706998720;
         var8.anInt275 = var4 * -722872229;
         var8.anInt273 = var6 * 1596679883;
         var8.anInt274 = var7 * -1848142489;
         if(this.groundTiles[var1][var2][var3] == null) {
            this.groundTiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.groundTiles[var1][var2][var3].aClass22_1859 = var8;
      }
   }

   public void method352(int var1, int var2, int var3, int var4, Animable var5, int var6, Animable var7, Animable var8) {
      Class48 var9 = new Class48();
      var9.anAnimable6 = var5;
      var9.anInt649 = var2 * 1850014080 + 925007040;
      var9.anInt650 = var3 * 1219018624 + -1537974336;
      var9.anInt653 = var4 * -1534262867;
      var9.anInt654 = var6 * -1373929709;
      var9.anAnimable7 = var7;
      var9.anAnimable8 = var8;
      int var13 = 0;
      Tile var10 = this.groundTiles[var1][var2][var3];
      if(var10 != null) {
         for(int var11 = 0; var11 < var10.anInt1861 * 1758491173; ++var11) {
            if((var10.obj5s[var11].anInt586 * 1464542121 & 256) == 256 && var10.obj5s[var11].anAnimable5 instanceof SpotAnim) {
               SpotAnim var12 = (SpotAnim)var10.obj5s[var11].anAnimable5;
               var12.method3373();
               if(var12.modelHeight * 1812947537 > var13) {
                  var13 = var12.modelHeight * 1812947537;
               }
            }
         }
      }

      var9.anInt655 = var13 * -834286085;
      if(this.groundTiles[var1][var2][var3] == null) {
         this.groundTiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.groundTiles[var1][var2][var3].aClass48_1860 = var9;
   }

   public void method353(int var1, int var2, int var3, int var4, Animable var5, Animable var6, int var7, int var8, int var9, int var10) {
      if(var5 != null || var6 != null) {
         Class40 var12 = new Class40();
         var12.anInt534 = var9 * -921637927;
         var12.anInt531 = var10 * -1866632771;
         var12.anInt532 = var2 * -302331008 + -151165504;
         var12.anInt524 = var3 * 1110186624 + -1592390336;
         var12.anInt526 = var4 * -76068125;
         var12.anAnimable3 = var5;
         var12.anAnimable4 = var6;
         var12.anInt530 = var7 * 1314298519;
         var12.anInt527 = var8 * -504980947;

         for(int var11 = var1; var11 >= 0; --var11) {
            if(this.groundTiles[var11][var2][var3] == null) {
               this.groundTiles[var11][var2][var3] = new Tile(var11, var2, var3);
            }
         }

         this.groundTiles[var1][var2][var3].aClass40_1857 = var12;
      }
   }

   public void method354(int var1, int var2, int var3, int var4, Animable var5, Animable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if(var5 != null) {
         Class31 var13 = new Class31();
         var13.anInt430 = var11 * -1942339569;
         var13.anInt432 = var12 * -2073928615;
         var13.anInt431 = var2 * 1100218240 + 550109120;
         var13.anInt423 = var3 * -132751488 + -66375744;
         var13.anInt422 = var4 * 1113740717;
         var13.anAnimable1 = var5;
         var13.anAnimable2 = var6;
         var13.anInt433 = var7 * -417666467;
         var13.anInt421 = var8 * -1361458483;
         var13.anInt426 = var9 * -770621867;
         var13.anInt427 = var10 * -1437928113;

         for(int var14 = var1; var14 >= 0; --var14) {
            if(this.groundTiles[var14][var2][var3] == null) {
               this.groundTiles[var14][var2][var3] = new Tile(var14, var2, var3);
            }
         }

         this.groundTiles[var1][var2][var3].aClass31_1868 = var13;
      }
   }

   public boolean method355(int var1, int var2, int var3, int var4, int var5, int var6, Animable var7, int var8, int var9, int var10) {
      if(var7 == null) {
         return true;
      } else {
         int var11 = var2 * 128 + 64 * var5;
         int var12 = var3 * 128 + 64 * var6;
         return this.method461(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
      }
   }

   public boolean method356(int var1, int var2, int var3, int var4, int var5, Animable var6, int var7, int var8, boolean var9) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var2 - var5;
         int var11 = var3 - var5;
         int var12 = var2 + var5;
         int var13 = var3 + var5;
         if(var9) {
            if(var7 > 640 && var7 < 1408) {
               var13 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var12 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var11 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         return this.method461(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method357(int var1, int var2, int var3, int var4, int var5, Animable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      return var6 == null?true:this.method461(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public Class40 method358(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 == null?null:var4.aClass40_1857;
   }

   static final int method359(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   void method360(TileObj5 var1) {
      for(int var2 = var1.anInt595 * 1249542337; var2 <= var1.anInt589 * 525183875; ++var2) {
         for(int var4 = var1.anInt590 * -1236081819; var4 <= var1.anInt591 * 1111111519; ++var4) {
            Tile var5 = this.groundTiles[var1.anInt588 * -599017285][var2][var4];
            if(var5 != null) {
               int var3;
               for(var3 = 0; var3 < var5.anInt1861 * 1758491173; ++var3) {
                  if(var5.obj5s[var3] == var1) {
                     var5.anInt1861 -= -1721476691;

                     for(int var6 = var3; var6 < var5.anInt1861 * 1758491173; ++var6) {
                        var5.obj5s[var6] = var5.obj5s[var6 + 1];
                        var5.anIntArray1863[var6] = var5.anIntArray1863[var6 + 1];
                     }

                     var5.obj5s[var5.anInt1861 * 1758491173] = null;
                     break;
                  }
               }

               var5.anInt1851 = 0;

               for(var3 = 0; var3 < var5.anInt1861 * 1758491173; ++var3) {
                  var5.anInt1851 = (var5.anInt1851 * -1372682459 | var5.anIntArray1863[var3]) * -893764435;
               }
            }
         }
      }

   }

   public void method361(int var1, int var2, int var3, int var4) {
      Tile var5 = this.groundTiles[var1][var2][var3];
      if(var5 != null) {
         Class31 var6 = var5.aClass31_1868;
         if(var6 != null) {
            var6.anInt426 = var6.anInt426 * 882495229 * var4 / 16 * -770621867;
            var6.anInt427 = var6.anInt427 * -1641872977 * var4 / 16 * -1437928113;
         }
      }
   }

   public void method363(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 != null) {
         var4.aClass31_1868 = null;
      }
   }

   public void method364(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 != null) {
         for(int var6 = 0; var6 < var4.anInt1861 * 1758491173; ++var6) {
            TileObj5 var5 = var4.obj5s[var6];
            if((var5.anInt594 * 714123667 >> 29 & 3) == 2 && var5.anInt595 * 1249542337 == var2 && var5.anInt590 * -1236081819 == var3) {
               this.method360(var5);
               return;
            }
         }

      }
   }

   public void method365(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 != null) {
         var4.aClass22_1859 = null;
      }
   }

   public void method367(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 != null) {
         var4.aClass48_1860 = null;
      }
   }

   public Class31 method368(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 != null?var4.aClass31_1868:null;
   }

   public TileObj5 method369(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.anInt1861 * 1758491173; ++var5) {
            TileObj5 var6 = var4.obj5s[var5];
            if((var6.anInt594 * 714123667 >> 29 & 3) == 2 && var6.anInt595 * 1249542337 == var2 && var6.anInt590 * -1236081819 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public int method372(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 != null && var4.aClass31_1868 != null?var4.aClass31_1868.anInt430 * 1286385391:0;
   }

   public int getTileContents(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 == null) {
         return 0;
      } else {
         for(int var6 = 0; var6 < var4.anInt1861 * 1758491173; ++var6) {
            TileObj5 var5 = var4.obj5s[var6];
            if((var5.anInt594 * 714123667 >> 29 & 3) == 2 && var5.anInt595 * 1249542337 == var2 && var5.anInt590 * -1236081819 == var3) {
               return var5.anInt594 * 714123667;
            }
         }

         return 0;
      }
   }

   public int method374(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 != null && var4.aClass22_1859 != null?var4.aClass22_1859.anInt273 * 827739875:0;
   }

   public int getTileContentsType(int var1, int var2, int var3, int var4) {
      Tile var5 = this.groundTiles[var1][var2][var3];
      if(var5 != null) {
         if(var5.aClass40_1857 != null && var5.aClass40_1857.anInt534 * 785572969 == var4) {
            return var5.aClass40_1857.anInt531 * 1069568405 & 255;
         } else if(var5.aClass31_1868 != null && var5.aClass31_1868.anInt430 * 1286385391 == var4) {
            return var5.aClass31_1868.anInt432 * -1177605143 & 255;
         } else if(var5.aClass22_1859 != null && var5.aClass22_1859.anInt273 * 827739875 == var4) {
            return var5.aClass22_1859.anInt274 * 1479784023 & 255;
         } else {
            for(int var6 = 0; var6 < var5.anInt1861 * 1758491173; ++var6) {
               if(var5.obj5s[var6].anInt594 * 714123667 == var4) {
                  return var5.obj5s[var6].anInt586 * 1464542121 & 255;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   public void method376(int var1, int var2) {
      Tile var3 = this.groundTiles[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.groundTiles[var4][var1][var2] = this.groundTiles[var4 + 1][var1][var2];
         if(var5 != null) {
            var5.anInt1870 -= 1947863287;

            for(int var6 = 0; var6 < var5.anInt1861 * 1758491173; ++var6) {
               TileObj5 var7 = var5.obj5s[var6];
               if((var7.anInt594 * 714123667 >> 29 & 3) == 2 && var7.anInt595 * 1249542337 == var1 && var7.anInt590 * -1236081819 == var2) {
                  var7.anInt588 -= -479867789;
               }
            }
         }
      }

      if(this.groundTiles[0][var1][var2] == null) {
         this.groundTiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.groundTiles[0][var1][var2].aTile_1873 = var3;
      this.groundTiles[3][var1][var2] = null;
   }

   public void method379(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.groundTiles[var4][var5][var6];
      if(var7 != null) {
         Class38 var9 = var7.aClass38_1855;
         int var11;
         if(var9 != null) {
            int var18 = var9.anInt506 * 803093675;
            if(var18 != 0) {
               for(var11 = 0; var11 < 4; ++var11) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            Class46 var10 = var7.aClass46_1856;
            if(var10 != null) {
               var11 = var10.anInt612;
               int var13 = var10.anInt618;
               int var12 = var10.anInt614;
               int var8 = var10.anInt615;
               int[] var15 = this.anIntArrayArray333[var11];
               int[] var14 = this.anIntArrayArray334[var13];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var15[var14[var16++]] == 0?var12:var8;
                     var1[var2 + 1] = var15[var14[var16++]] == 0?var12:var8;
                     var1[var2 + 2] = var15[var14[var16++]] == 0?var12:var8;
                     var1[var2 + 3] = var15[var14[var16++]] == 0?var12:var8;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var15[var14[var16++]] != 0) {
                        var1[var2] = var8;
                     }

                     if(var15[var14[var16++]] != 0) {
                        var1[var2 + 1] = var8;
                     }

                     if(var15[var14[var16++]] != 0) {
                        var1[var2 + 2] = var8;
                     }

                     if(var15[var14[var16++]] != 0) {
                        var1[var2 + 3] = var8;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   void method380(Model var1, int var2, int var3, int var4) {
      Tile var5;
      Model var6;
      if(var3 < this.anInt283) {
         var5 = this.groundTiles[var2][var3 + 1][var4];
         if(var5 != null && var5.aClass22_1859 != null && var5.aClass22_1859.anAnimable instanceof Model) {
            var6 = (Model)var5.aClass22_1859.anAnimable;
            Model.method3122(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.anInt283) {
         var5 = this.groundTiles[var2][var3][var4 + 1];
         if(var5 != null && var5.aClass22_1859 != null && var5.aClass22_1859.anAnimable instanceof Model) {
            var6 = (Model)var5.aClass22_1859.anAnimable;
            Model.method3122(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.anInt283 && var4 < this.anInt294) {
         var5 = this.groundTiles[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.aClass22_1859 != null && var5.aClass22_1859.anAnimable instanceof Model) {
            var6 = (Model)var5.aClass22_1859.anAnimable;
            Model.method3122(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.anInt283 && var4 > 0) {
         var5 = this.groundTiles[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.aClass22_1859 != null && var5.aClass22_1859.anAnimable instanceof Model) {
            var6 = (Model)var5.aClass22_1859.anAnimable;
            Model.method3122(var1, var6, 128, 0, -128, true);
         }
      }

   }

   static boolean method381(int var0, int var1, int var2) {
      int var3 = var2 * anInt309 + var0 * anInt310 >> 16;
      int var4 = var2 * anInt310 - var0 * anInt309 >> 16;
      int var5 = var1 * anInt307 + var4 * anInt308 >> 16;
      int var7 = var1 * anInt308 - var4 * anInt307 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var6 = anInt337 + var3 * Texture.anInt2704 / var5;
         int var8 = anInt338 + var7 * Texture.anInt2704 / var5;
         return var6 >= anInt316 && var6 <= anInt318 && var8 >= anInt340 && var8 <= anInt342;
      } else {
         return false;
      }
   }

   public void method383(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.anInt283 * 128) {
         var1 = this.anInt283 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.anInt294 * 128) {
         var3 = this.anInt294 * 128 - 1;
      }

      ++anInt297;
      anInt307 = Texture.anIntArray2708[var4];
      anInt308 = Texture.anIntArray2713[var4];
      anInt309 = Texture.anIntArray2708[var5];
      anInt310 = Texture.anIntArray2713[var5];
      aBoolArrayArray288 = aBoolArrayArrayArrayArray335[(var4 - 128) / 32][var5 / 64];
      anInt293 = var1;
      anInt281 = var2;
      anInt317 = var3;
      anInt302 = var1 / 128;
      anInt303 = var3 / 128;
      anInt324 = var6;
      anInt328 = anInt302 - 25;
      if(anInt328 < 0) {
         anInt328 = 0;
      }

      anInt296 = anInt303 - 25;
      if(anInt296 < 0) {
         anInt296 = 0;
      }

      anInt299 = anInt302 + 25;
      if(anInt299 > this.anInt283) {
         anInt299 = this.anInt283;
      }

      anInt301 = anInt303 + 25;
      if(anInt301 > this.anInt294) {
         anInt301 = this.anInt294;
      }

      this.method389();
      anInt295 = 0;

      int var8;
      Tile[][] var9;
      int var12;
      int var13;
      for(var8 = this.anInt323; var8 < this.anInt305; ++var8) {
         var9 = this.groundTiles[var8];

         for(var12 = anInt328; var12 < anInt299; ++var12) {
            for(var13 = anInt296; var13 < anInt301; ++var13) {
               Tile var10 = var9[var12][var13];
               if(var10 != null) {
                  if(var10.anInt1865 * 643122391 <= var6 && (aBoolArrayArray288[var12 - anInt302 + 25][var13 - anInt303 + 25] || this.anIntArrayArrayArray285[var8][var12][var13] - var2 >= 2000)) {
                     var10.aBool1866 = true;
                     var10.aBool1867 = true;
                     if(var10.anInt1861 * 1758491173 > 0) {
                        var10.aBool1852 = true;
                     } else {
                        var10.aBool1852 = false;
                     }

                     ++anInt295;
                  } else {
                     var10.aBool1866 = false;
                     var10.aBool1867 = false;
                     var10.anInt1864 = 0;
                  }
               }
            }
         }
      }

      Tile var7;
      int var11;
      int var14;
      int var15;
      int var16;
      for(var8 = this.anInt323; var8 < this.anInt305; ++var8) {
         var9 = this.groundTiles[var8];

         for(var12 = -25; var12 <= 0; ++var12) {
            var13 = anInt302 + var12;
            var16 = anInt302 - var12;
            if(var13 >= anInt328 || var16 < anInt299) {
               for(var11 = -25; var11 <= 0; ++var11) {
                  var15 = anInt303 + var11;
                  var14 = anInt303 - var11;
                  if(var13 >= anInt328) {
                     if(var15 >= anInt296) {
                        var7 = var9[var13][var15];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, true);
                        }
                     }

                     if(var14 < anInt301) {
                        var7 = var9[var13][var14];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, true);
                        }
                     }
                  }

                  if(var16 < anInt299) {
                     if(var15 >= anInt296) {
                        var7 = var9[var16][var15];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, true);
                        }
                     }

                     if(var14 < anInt301) {
                        var7 = var9[var16][var14];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, true);
                        }
                     }
                  }

                  if(anInt295 == 0) {
                     aBool312 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var8 = this.anInt323; var8 < this.anInt305; ++var8) {
         var9 = this.groundTiles[var8];

         for(var12 = -25; var12 <= 0; ++var12) {
            var13 = anInt302 + var12;
            var16 = anInt302 - var12;
            if(var13 >= anInt328 || var16 < anInt299) {
               for(var11 = -25; var11 <= 0; ++var11) {
                  var15 = anInt303 + var11;
                  var14 = anInt303 - var11;
                  if(var13 >= anInt328) {
                     if(var15 >= anInt296) {
                        var7 = var9[var13][var15];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, false);
                        }
                     }

                     if(var14 < anInt301) {
                        var7 = var9[var13][var14];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, false);
                        }
                     }
                  }

                  if(var16 < anInt299) {
                     if(var15 >= anInt296) {
                        var7 = var9[var16][var15];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, false);
                        }
                     }

                     if(var14 < anInt301) {
                        var7 = var9[var16][var14];
                        if(var7 != null && var7.aBool1866) {
                           this.method384(var7, false);
                        }
                     }
                  }

                  if(anInt295 == 0) {
                     aBool312 = false;
                     return;
                  }
               }
            }
         }
      }

      aBool312 = false;
   }

   void method384(Tile var1, boolean var2) {
      aClass117_287.addLast(var1);

      while(true) {
         Tile var3 = (Tile)aClass117_287.removeFirst();
         if(var3 == null) {
            return;
         }

         if(var3.aBool1867) {
            int var4 = var3.anInt1862 * 1489288579;
            int var5 = var3.anInt1869 * -648052847;
            int var6 = var3.anInt1870 * -1839515449;
            int var7 = var3.anInt1874 * 100529371;
            Tile[][] var8 = this.groundTiles[var6];
            Tile var9;
            Class40 var10;
            int var11;
            TileObj5 var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var21;
            boolean var22;
            Tile var33;
            if(var3.aBool1866) {
               if(var2) {
                  if(var6 > 0) {
                     var9 = this.groundTiles[var6 - 1][var4][var5];
                     if(var9 != null && var9.aBool1867) {
                        continue;
                     }
                  }

                  if(var4 <= anInt302 && var4 > anInt328) {
                     var9 = var8[var4 - 1][var5];
                     if(var9 != null && var9.aBool1867 && (var9.aBool1866 || (var3.anInt1851 * -1372682459 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(var4 >= anInt302 && var4 < anInt299 - 1) {
                     var9 = var8[var4 + 1][var5];
                     if(var9 != null && var9.aBool1867 && (var9.aBool1866 || (var3.anInt1851 * -1372682459 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(var5 <= anInt303 && var5 > anInt296) {
                     var9 = var8[var4][var5 - 1];
                     if(var9 != null && var9.aBool1867 && (var9.aBool1866 || (var3.anInt1851 * -1372682459 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(var5 >= anInt303 && var5 < anInt301 - 1) {
                     var9 = var8[var4][var5 + 1];
                     if(var9 != null && var9.aBool1867 && (var9.aBool1866 || (var3.anInt1851 * -1372682459 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var2 = true;
               }

               var3.aBool1866 = false;
               if(var3.aTile_1873 != null) {
                  var9 = var3.aTile_1873;
                  if(var9.aClass38_1855 != null) {
                     if(!this.method390(0, var4, var5)) {
                        this.method463(var9.aClass38_1855, 0, anInt307, anInt308, anInt309, anInt310, var4, var5);
                     }
                  } else if(var9.aClass46_1856 != null && !this.method390(0, var4, var5)) {
                     this.method386(var9.aClass46_1856, anInt307, anInt308, anInt309, anInt310, var4, var5);
                  }

                  var10 = var9.aClass40_1857;
                  if(var10 != null) {
                     var10.anAnimable3.method2874(0, anInt307, anInt308, anInt309, anInt310, var10.anInt532 * 702405159 - anInt293, var10.anInt526 * -506049845 - anInt281, var10.anInt524 * -1481754083 - anInt317, var10.anInt534 * 785572969);
                  }

                  for(var11 = 0; var11 < var9.anInt1861 * 1758491173; ++var11) {
                     var12 = var9.obj5s[var11];
                     if(var12 != null) {
                        var12.anAnimable5.method2874(var12.anInt587 * -1981858225, anInt307, anInt308, anInt309, anInt310, var12.anInt584 * -501472545 - anInt293, var12.anInt593 * -712455821 - anInt281, var12.anInt585 * 20674077 - anInt317, var12.anInt594 * 714123667);
                     }
                  }
               }

               var22 = false;
               if(var3.aClass38_1855 != null) {
                  if(!this.method390(var7, var4, var5)) {
                     var22 = true;
                     if(var3.aClass38_1855.anInt502 * 457420757 != 12345678 || aBool312 && var6 <= anInt313) {
                        this.method463(var3.aClass38_1855, var7, anInt307, anInt308, anInt309, anInt310, var4, var5);
                     }
                  }
               } else if(var3.aClass46_1856 != null && !this.method390(var7, var4, var5)) {
                  var22 = true;
                  this.method386(var3.aClass46_1856, anInt307, anInt308, anInt309, anInt310, var4, var5);
               }

               var21 = 0;
               var11 = 0;
               Class40 var23 = var3.aClass40_1857;
               Class31 var13 = var3.aClass31_1868;
               if(var23 != null || var13 != null) {
                  if(anInt302 == var4) {
                     ++var21;
                  } else if(anInt302 < var4) {
                     var21 += 2;
                  }

                  if(anInt303 == var5) {
                     var21 += 3;
                  } else if(anInt303 > var5) {
                     var21 += 6;
                  }

                  var11 = anIntArray326[var21];
                  var3.anInt1872 = anIntArray282[var21] * 152382137;
               }

               if(var23 != null) {
                  if((var23.anInt530 * 1194493223 & anIntArray327[var21]) != 0) {
                     if(var23.anInt530 * 1194493223 == 16) {
                        var3.anInt1864 = 1225511745;
                        var3.anInt1854 = anIntArray329[var21] * -1457668737;
                        var3.anInt1871 = -395327125 - var3.anInt1854 * 1415484935;
                     } else if(var23.anInt530 * 1194493223 == 32) {
                        var3.anInt1864 = -1843943806;
                        var3.anInt1854 = anIntArray330[var21] * -1457668737;
                        var3.anInt1871 = -790654250 - var3.anInt1854 * 1415484935;
                     } else if(var23.anInt530 * 1194493223 == 64) {
                        var3.anInt1864 = 607079684;
                        var3.anInt1854 = anIntArray331[var21] * -1457668737;
                        var3.anInt1871 = -1581308500 - var3.anInt1854 * 1415484935;
                     } else {
                        var3.anInt1864 = -618432061;
                        var3.anInt1854 = anIntArray332[var21] * -1457668737;
                        var3.anInt1871 = -1185981375 - var3.anInt1854 * 1415484935;
                     }
                  } else {
                     var3.anInt1864 = 0;
                  }

                  if((var23.anInt530 * 1194493223 & var11) != 0 && !this.method391(var7, var4, var5, var23.anInt530 * 1194493223)) {
                     var23.anAnimable3.method2874(0, anInt307, anInt308, anInt309, anInt310, var23.anInt532 * 702405159 - anInt293, var23.anInt526 * -506049845 - anInt281, var23.anInt524 * -1481754083 - anInt317, var23.anInt534 * 785572969);
                  }

                  if((var23.anInt527 * -287128155 & var11) != 0 && !this.method391(var7, var4, var5, var23.anInt527 * -287128155)) {
                     var23.anAnimable4.method2874(0, anInt307, anInt308, anInt309, anInt310, var23.anInt532 * 702405159 - anInt293, var23.anInt526 * -506049845 - anInt281, var23.anInt524 * -1481754083 - anInt317, var23.anInt534 * 785572969);
                  }
               }

               if(var13 != null && !this.method392(var7, var4, var5, var13.anAnimable1.modelHeight * 1812947537)) {
                  if((var13.anInt433 * 1046166005 & var11) != 0) {
                     var13.anAnimable1.method2874(0, anInt307, anInt308, anInt309, anInt310, var13.anInt431 * -1321412609 - anInt293 + var13.anInt426 * 882495229, var13.anInt422 * 2084034085 - anInt281, var13.anInt423 * -2070854849 - anInt317 + var13.anInt427 * -1641872977, var13.anInt430 * 1286385391);
                  } else if(var13.anInt433 * 1046166005 == 256) {
                     var14 = var13.anInt431 * -1321412609 - anInt293;
                     var15 = var13.anInt422 * 2084034085 - anInt281;
                     var16 = var13.anInt423 * -2070854849 - anInt317;
                     var17 = var13.anInt421 * 313471493;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        var13.anAnimable1.method2874(0, anInt307, anInt308, anInt309, anInt310, var14 + var13.anInt426 * 882495229, var15, var16 + var13.anInt427 * -1641872977, var13.anInt430 * 1286385391);
                     } else if(var13.anAnimable2 != null) {
                        var13.anAnimable2.method2874(0, anInt307, anInt308, anInt309, anInt310, var14, var15, var16, var13.anInt430 * 1286385391);
                     }
                  }
               }

               if(var22) {
                  Class22 var27 = var3.aClass22_1859;
                  if(var27 != null) {
                     var27.anAnimable.method2874(0, anInt307, anInt308, anInt309, anInt310, var27.anInt269 * -1707403193 - anInt293, var27.anInt275 * -687892525 - anInt281, var27.anInt271 * -1882816009 - anInt317, var27.anInt273 * 827739875);
                  }

                  Class48 var31 = var3.aClass48_1860;
                  if(var31 != null && var31.anInt655 * 32060723 == 0) {
                     if(var31.anAnimable7 != null) {
                        var31.anAnimable7.method2874(0, anInt307, anInt308, anInt309, anInt310, var31.anInt649 * 865285947 - anInt293, var31.anInt653 * -913962459 - anInt281, var31.anInt650 * -1659081089 - anInt317, var31.anInt654 * 564011803);
                     }

                     if(var31.anAnimable8 != null) {
                        var31.anAnimable8.method2874(0, anInt307, anInt308, anInt309, anInt310, var31.anInt649 * 865285947 - anInt293, var31.anInt653 * -913962459 - anInt281, var31.anInt650 * -1659081089 - anInt317, var31.anInt654 * 564011803);
                     }

                     if(var31.anAnimable6 != null) {
                        var31.anAnimable6.method2874(0, anInt307, anInt308, anInt309, anInt310, var31.anInt649 * 865285947 - anInt293, var31.anInt653 * -913962459 - anInt281, var31.anInt650 * -1659081089 - anInt317, var31.anInt654 * 564011803);
                     }
                  }
               }

               var14 = var3.anInt1851 * -1372682459;
               if(var14 != 0) {
                  if(var4 < anInt302 && (var14 & 4) != 0) {
                     var33 = var8[var4 + 1][var5];
                     if(var33 != null && var33.aBool1867) {
                        aClass117_287.addLast(var33);
                     }
                  }

                  if(var5 < anInt303 && (var14 & 2) != 0) {
                     var33 = var8[var4][var5 + 1];
                     if(var33 != null && var33.aBool1867) {
                        aClass117_287.addLast(var33);
                     }
                  }

                  if(var4 > anInt302 && (var14 & 1) != 0) {
                     var33 = var8[var4 - 1][var5];
                     if(var33 != null && var33.aBool1867) {
                        aClass117_287.addLast(var33);
                     }
                  }

                  if(var5 > anInt303 && (var14 & 8) != 0) {
                     var33 = var8[var4][var5 - 1];
                     if(var33 != null && var33.aBool1867) {
                        aClass117_287.addLast(var33);
                     }
                  }
               }
            }

            if(var3.anInt1864 * -2057816509 != 0) {
               var22 = true;

               for(var21 = 0; var21 < var3.anInt1861 * 1758491173; ++var21) {
                  if(var3.obj5s[var21].anInt592 * -1820256133 != anInt297 && (var3.anIntArray1863[var21] & var3.anInt1864 * -2057816509) == var3.anInt1854 * 188482175) {
                     var22 = false;
                     break;
                  }
               }

               if(var22) {
                  var10 = var3.aClass40_1857;
                  if(!this.method391(var7, var4, var5, var10.anInt530 * 1194493223)) {
                     var10.anAnimable3.method2874(0, anInt307, anInt308, anInt309, anInt310, var10.anInt532 * 702405159 - anInt293, var10.anInt526 * -506049845 - anInt281, var10.anInt524 * -1481754083 - anInt317, var10.anInt534 * 785572969);
                  }

                  var3.anInt1864 = 0;
               }
            }

            int var24;
            int var26;
            if(var3.aBool1852) {
               try {
                  int var25 = var3.anInt1861 * 1758491173;
                  var3.aBool1852 = false;
                  var21 = 0;

                  label542:
                  for(var11 = 0; var11 < var25; ++var11) {
                     var12 = var3.obj5s[var11];
                     if(var12.anInt592 * -1820256133 != anInt297) {
                        for(var26 = var12.anInt595 * 1249542337; var26 <= var12.anInt589 * 525183875; ++var26) {
                           for(var14 = var12.anInt590 * -1236081819; var14 <= var12.anInt591 * 1111111519; ++var14) {
                              var33 = var8[var26][var14];
                              if(var33.aBool1866) {
                                 var3.aBool1852 = true;
                                 continue label542;
                              }

                              if(var33.anInt1864 * -2057816509 != 0) {
                                 var16 = 0;
                                 if(var26 > var12.anInt595 * 1249542337) {
                                    ++var16;
                                 }

                                 if(var26 < var12.anInt589 * 525183875) {
                                    var16 += 4;
                                 }

                                 if(var14 > var12.anInt590 * -1236081819) {
                                    var16 += 8;
                                 }

                                 if(var14 < var12.anInt591 * 1111111519) {
                                    var16 += 2;
                                 }

                                 if((var16 & var33.anInt1864 * -2057816509) == var3.anInt1871 * 1149260233) {
                                    var3.aBool1852 = true;
                                    continue label542;
                                 }
                              }
                           }
                        }

                        aTileObj5Array298[var21++] = var12;
                        var26 = anInt302 - var12.anInt595 * 1249542337;
                        var14 = var12.anInt589 * 525183875 - anInt302;
                        if(var14 > var26) {
                           var26 = var14;
                        }

                        var15 = anInt303 - var12.anInt590 * -1236081819;
                        var16 = var12.anInt591 * 1111111519 - anInt303;
                        if(var16 > var15) {
                           var12.anInt583 = (var26 + var16) * -940806893;
                        } else {
                           var12.anInt583 = (var26 + var15) * -940806893;
                        }
                     }
                  }

                  while(var21 > 0) {
                     var11 = -50;
                     var24 = -1;

                     for(var26 = 0; var26 < var21; ++var26) {
                        TileObj5 var34 = aTileObj5Array298[var26];
                        if(var34.anInt592 * -1820256133 != anInt297) {
                           if(var34.anInt583 * 1507353883 > var11) {
                              var11 = var34.anInt583 * 1507353883;
                              var24 = var26;
                           } else if(var34.anInt583 * 1507353883 == var11) {
                              var15 = var34.anInt584 * -501472545 - anInt293;
                              var16 = var34.anInt585 * 20674077 - anInt317;
                              var17 = aTileObj5Array298[var24].anInt584 * -501472545 - anInt293;
                              var18 = aTileObj5Array298[var24].anInt585 * 20674077 - anInt317;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var24 = var26;
                              }
                           }
                        }
                     }

                     if(var24 == -1) {
                        break;
                     }

                     TileObj5 var35 = aTileObj5Array298[var24];
                     var35.anInt592 = anInt297 * -1263860045;
                     if(!this.method393(var7, var35.anInt595 * 1249542337, var35.anInt589 * 525183875, var35.anInt590 * -1236081819, var35.anInt591 * 1111111519, var35.anAnimable5.modelHeight * 1812947537)) {
                        var35.anAnimable5.method2874(var35.anInt587 * -1981858225, anInt307, anInt308, anInt309, anInt310, var35.anInt584 * -501472545 - anInt293, var35.anInt593 * -712455821 - anInt281, var35.anInt585 * 20674077 - anInt317, var35.anInt594 * 714123667);
                     }

                     for(var14 = var35.anInt595 * 1249542337; var14 <= var35.anInt589 * 525183875; ++var14) {
                        for(var15 = var35.anInt590 * -1236081819; var15 <= var35.anInt591 * 1111111519; ++var15) {
                           Tile var36 = var8[var14][var15];
                           if(var36.anInt1864 * -2057816509 != 0) {
                              aClass117_287.addLast(var36);
                           } else if((var14 != var4 || var15 != var5) && var36.aBool1867) {
                              aClass117_287.addLast(var36);
                           }
                        }
                     }
                  }

                  if(var3.aBool1852) {
                     continue;
                  }
               } catch (Exception var20) {
                  var3.aBool1852 = false;
               }
            }

            if(var3.aBool1867 && var3.anInt1864 * -2057816509 == 0) {
               if(var4 <= anInt302 && var4 > anInt328) {
                  var9 = var8[var4 - 1][var5];
                  if(var9 != null && var9.aBool1867) {
                     continue;
                  }
               }

               if(var4 >= anInt302 && var4 < anInt299 - 1) {
                  var9 = var8[var4 + 1][var5];
                  if(var9 != null && var9.aBool1867) {
                     continue;
                  }
               }

               if(var5 <= anInt303 && var5 > anInt296) {
                  var9 = var8[var4][var5 - 1];
                  if(var9 != null && var9.aBool1867) {
                     continue;
                  }
               }

               if(var5 >= anInt303 && var5 < anInt301 - 1) {
                  var9 = var8[var4][var5 + 1];
                  if(var9 != null && var9.aBool1867) {
                     continue;
                  }
               }

               var3.aBool1867 = false;
               --anInt295;
               Class48 var29 = var3.aClass48_1860;
               if(var29 != null && var29.anInt655 * 32060723 != 0) {
                  if(var29.anAnimable7 != null) {
                     var29.anAnimable7.method2874(0, anInt307, anInt308, anInt309, anInt310, var29.anInt649 * 865285947 - anInt293, var29.anInt653 * -913962459 - anInt281 - var29.anInt655 * 32060723, var29.anInt650 * -1659081089 - anInt317, var29.anInt654 * 564011803);
                  }

                  if(var29.anAnimable8 != null) {
                     var29.anAnimable8.method2874(0, anInt307, anInt308, anInt309, anInt310, var29.anInt649 * 865285947 - anInt293, var29.anInt653 * -913962459 - anInt281 - var29.anInt655 * 32060723, var29.anInt650 * -1659081089 - anInt317, var29.anInt654 * 564011803);
                  }

                  if(var29.anAnimable6 != null) {
                     var29.anAnimable6.method2874(0, anInt307, anInt308, anInt309, anInt310, var29.anInt649 * 865285947 - anInt293, var29.anInt653 * -913962459 - anInt281 - var29.anInt655 * 32060723, var29.anInt650 * -1659081089 - anInt317, var29.anInt654 * 564011803);
                  }
               }

               if(var3.anInt1872 * -1045447799 != 0) {
                  Class31 var30 = var3.aClass31_1868;
                  if(var30 != null && !this.method392(var7, var4, var5, var30.anAnimable1.modelHeight * 1812947537)) {
                     if((var30.anInt433 * 1046166005 & var3.anInt1872 * -1045447799) != 0) {
                        var30.anAnimable1.method2874(0, anInt307, anInt308, anInt309, anInt310, var30.anInt431 * -1321412609 - anInt293 + var30.anInt426 * 882495229, var30.anInt422 * 2084034085 - anInt281, var30.anInt423 * -2070854849 - anInt317 + var30.anInt427 * -1641872977, var30.anInt430 * 1286385391);
                     } else if(var30.anInt433 * 1046166005 == 256) {
                        var11 = var30.anInt431 * -1321412609 - anInt293;
                        var24 = var30.anInt422 * 2084034085 - anInt281;
                        var26 = var30.anInt423 * -2070854849 - anInt317;
                        var14 = var30.anInt421 * 313471493;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var26;
                        } else {
                           var16 = -var26;
                        }

                        if(var16 >= var15) {
                           var30.anAnimable1.method2874(0, anInt307, anInt308, anInt309, anInt310, var11 + var30.anInt426 * 882495229, var24, var26 + var30.anInt427 * -1641872977, var30.anInt430 * 1286385391);
                        } else if(var30.anAnimable2 != null) {
                           var30.anAnimable2.method2874(0, anInt307, anInt308, anInt309, anInt310, var11, var24, var26, var30.anInt430 * 1286385391);
                        }
                     }
                  }

                  Class40 var28 = var3.aClass40_1857;
                  if(var28 != null) {
                     if((var28.anInt527 * -287128155 & var3.anInt1872 * -1045447799) != 0 && !this.method391(var7, var4, var5, var28.anInt527 * -287128155)) {
                        var28.anAnimable4.method2874(0, anInt307, anInt308, anInt309, anInt310, var28.anInt532 * 702405159 - anInt293, var28.anInt526 * -506049845 - anInt281, var28.anInt524 * -1481754083 - anInt317, var28.anInt534 * 785572969);
                     }

                     if((var28.anInt530 * 1194493223 & var3.anInt1872 * -1045447799) != 0 && !this.method391(var7, var4, var5, var28.anInt530 * 1194493223)) {
                        var28.anAnimable3.method2874(0, anInt307, anInt308, anInt309, anInt310, var28.anInt532 * 702405159 - anInt293, var28.anInt526 * -506049845 - anInt281, var28.anInt524 * -1481754083 - anInt317, var28.anInt534 * 785572969);
                     }
                  }
               }

               Tile var32;
               if(var6 < this.anInt305 - 1) {
                  var32 = this.groundTiles[var6 + 1][var4][var5];
                  if(var32 != null && var32.aBool1867) {
                     aClass117_287.addLast(var32);
                  }
               }

               if(var4 < anInt302) {
                  var32 = var8[var4 + 1][var5];
                  if(var32 != null && var32.aBool1867) {
                     aClass117_287.addLast(var32);
                  }
               }

               if(var5 < anInt303) {
                  var32 = var8[var4][var5 + 1];
                  if(var32 != null && var32.aBool1867) {
                     aClass117_287.addLast(var32);
                  }
               }

               if(var4 > anInt302) {
                  var32 = var8[var4 - 1][var5];
                  if(var32 != null && var32.aBool1867) {
                     aClass117_287.addLast(var32);
                  }
               }

               if(var5 > anInt303) {
                  var32 = var8[var4][var5 - 1];
                  if(var32 != null && var32.aBool1867) {
                     aClass117_287.addLast(var32);
                  }
               }
            }
         }
      }
   }

   void method386(Class46 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.anIntArray620.length;

      int var9;
      int var10;
      int var11;
      int var17;
      int var18;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.anIntArray620[var9] - anInt293;
         var17 = var1.anIntArray621[var9] - anInt281;
         var18 = var1.anIntArray603[var9] - anInt317;
         var11 = var18 * var4 + var10 * var5 >> 16;
         var18 = var18 * var5 - var10 * var4 >> 16;
         var10 = var11;
         var11 = var17 * var3 - var18 * var2 >> 16;
         var18 = var17 * var2 + var18 * var3 >> 16;
         if(var18 < 50) {
            return;
         }

         if(var1.anIntArray610 != null) {
            Class46.anIntArray608[var9] = var10;
            Class46.anIntArray601[var9] = var11;
            Class46.anIntArray604[var9] = var18;
         }

         Class46.anIntArray616[var9] = Texture.anInt2705 + var10 * Texture.anInt2704 / var18;
         Class46.anIntArray617[var9] = Texture.anInt2706 + var11 * Texture.anInt2704 / var18;
      }

      Texture.anInt2699 = 0;
      var8 = var1.anIntArray607.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.anIntArray607[var9];
         var17 = var1.anIntArray622[var9];
         var18 = var1.anIntArray609[var9];
         var11 = Class46.anIntArray616[var10];
         int var12 = Class46.anIntArray616[var17];
         int var16 = Class46.anIntArray616[var18];
         int var15 = Class46.anIntArray617[var10];
         int var14 = Class46.anIntArray617[var17];
         int var13 = Class46.anIntArray617[var18];
         if((var11 - var12) * (var13 - var14) - (var15 - var14) * (var16 - var12) > 0) {
            Texture.aBool2700 = false;
            if(var11 < 0 || var12 < 0 || var16 < 0 || var11 > Texture.anInt2712 || var12 > Texture.anInt2712 || var16 > Texture.anInt2712) {
               Texture.aBool2700 = true;
            }

            if(aBool312 && this.method388(anInt319, anInt315, var15, var14, var13, var11, var12, var16)) {
               anInt336 = var6;
               anInt341 = var7;
            }

            if(var1.anIntArray610 != null && var1.anIntArray610[var9] != -1) {
               if(!aBool300) {
                  if(var1.aBool611) {
                     Texture.method3248(var15, var14, var13, var11, var12, var16, var1.anIntArray613[var9], var1.anIntArray605[var9], var1.anIntArray606[var9], Class46.anIntArray608[0], Class46.anIntArray608[1], Class46.anIntArray608[3], Class46.anIntArray601[0], Class46.anIntArray601[1], Class46.anIntArray601[3], Class46.anIntArray604[0], Class46.anIntArray604[1], Class46.anIntArray604[3], var1.anIntArray610[var9]);
                  } else {
                     Texture.method3248(var15, var14, var13, var11, var12, var16, var1.anIntArray613[var9], var1.anIntArray605[var9], var1.anIntArray606[var9], Class46.anIntArray608[var10], Class46.anIntArray608[var17], Class46.anIntArray608[var18], Class46.anIntArray601[var10], Class46.anIntArray601[var17], Class46.anIntArray601[var18], Class46.anIntArray604[var10], Class46.anIntArray604[var17], Class46.anIntArray604[var18], var1.anIntArray610[var9]);
                  }
               } else {
                  int var19 = Texture.anInterface3_2718.method15(var1.anIntArray610[var9], -1275367594);
                  Texture.method3215(var15, var14, var13, var11, var12, var16, method359(var19, var1.anIntArray613[var9]), method359(var19, var1.anIntArray605[var9]), method359(var19, var1.anIntArray606[var9]));
               }
            } else if(var1.anIntArray613[var9] != 12345678) {
               Texture.method3215(var15, var14, var13, var11, var12, var16, var1.anIntArray613[var9], var1.anIntArray605[var9], var1.anIntArray606[var9]);
            }
         }
      }

   }

   boolean method388(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if(var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else if(var1 < var6 && var1 < var7 && var1 < var8) {
         return false;
      } else if(var1 > var6 && var1 > var7 && var1 > var8) {
         return false;
      } else {
         int var11 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
         int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
         int var9 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
         return var11 * var9 > 0 && var9 * var10 > 0;
      }
   }

   void method389() {
      int var1 = anIntArray321[anInt324];
      Class42[] var11 = aClass42ArrayArray322[anInt324];
      anInt325 = 0;

      for(int var9 = 0; var9 < var1; ++var9) {
         Class42 var5 = var11[var9];
         boolean var3;
         int var6;
         int var7;
         int var8;
         int var10;
         if(var5.anInt554 * -881222499 == 1) {
            var6 = var5.anInt573 * -209310663 - anInt302 + 25;
            if(var6 >= 0 && var6 <= 50) {
               var7 = var5.anInt552 * 1501564945 - anInt303 + 25;
               if(var7 < 0) {
                  var7 = 0;
               }

               var8 = var5.anInt561 * -1639430109 - anInt303 + 25;
               if(var8 > 50) {
                  var8 = 50;
               }

               var3 = false;

               while(var7 <= var8) {
                  if(aBoolArrayArray288[var6][var7++]) {
                     var3 = true;
                     break;
                  }
               }

               if(var3) {
                  var10 = anInt293 - var5.anInt555 * 1375633411;
                  if(var10 > 32) {
                     var5.anInt559 = -1024523365;
                  } else {
                     if(var10 >= -32) {
                        continue;
                     }

                     var5.anInt559 = -2049046730;
                     var10 = -var10;
                  }

                  var5.anInt553 = (var5.anInt557 * -732285699 - anInt317 << 8) / var10 * -1271422745;
                  var5.anInt565 = (var5.anInt550 * -1407244941 - anInt317 << 8) / var10 * 1219929915;
                  var5.anInt569 = (var5.anInt563 * -2134622617 - anInt281 << 8) / var10 * 303221777;
                  var5.anInt567 = (var5.anInt560 * -204626027 - anInt281 << 8) / var10 * -1356797911;
                  aClass42Array284[anInt325++] = var5;
               }
            }
         } else if(var5.anInt554 * -881222499 == 2) {
            var6 = var5.anInt552 * 1501564945 - anInt303 + 25;
            if(var6 >= 0 && var6 <= 50) {
               var7 = var5.anInt573 * -209310663 - anInt302 + 25;
               if(var7 < 0) {
                  var7 = 0;
               }

               var8 = var5.anInt551 * -2135912995 - anInt302 + 25;
               if(var8 > 50) {
                  var8 = 50;
               }

               var3 = false;

               while(var7 <= var8) {
                  if(aBoolArrayArray288[var7++][var6]) {
                     var3 = true;
                     break;
                  }
               }

               if(var3) {
                  var10 = anInt317 - var5.anInt557 * -732285699;
                  if(var10 > 32) {
                     var5.anInt559 = 1221397201;
                  } else {
                     if(var10 >= -32) {
                        continue;
                     }

                     var5.anInt559 = 196873836;
                     var10 = -var10;
                  }

                  var5.anInt562 = (var5.anInt555 * 1375633411 - anInt293 << 8) / var10 * -1890844241;
                  var5.anInt564 = (var5.anInt556 * 2081657663 - anInt293 << 8) / var10 * -1087396065;
                  var5.anInt569 = (var5.anInt563 * -2134622617 - anInt281 << 8) / var10 * 303221777;
                  var5.anInt567 = (var5.anInt560 * -204626027 - anInt281 << 8) / var10 * -1356797911;
                  aClass42Array284[anInt325++] = var5;
               }
            }
         } else if(var5.anInt554 * -881222499 == 4) {
            var6 = var5.anInt563 * -2134622617 - anInt281;
            if(var6 > 128) {
               var7 = var5.anInt552 * 1501564945 - anInt303 + 25;
               if(var7 < 0) {
                  var7 = 0;
               }

               var8 = var5.anInt561 * -1639430109 - anInt303 + 25;
               if(var8 > 50) {
                  var8 = 50;
               }

               if(var7 <= var8) {
                  int var13 = var5.anInt573 * -209310663 - anInt302 + 25;
                  if(var13 < 0) {
                     var13 = 0;
                  }

                  var10 = var5.anInt551 * -2135912995 - anInt302 + 25;
                  if(var10 > 50) {
                     var10 = 50;
                  }

                  boolean var12 = false;

                  label150:
                  for(int var2 = var13; var2 <= var10; ++var2) {
                     for(int var4 = var7; var4 <= var8; ++var4) {
                        if(aBoolArrayArray288[var2][var4]) {
                           var12 = true;
                           break label150;
                        }
                     }
                  }

                  if(var12) {
                     var5.anInt559 = -827649529;
                     var5.anInt562 = (var5.anInt555 * 1375633411 - anInt293 << 8) / var6 * -1890844241;
                     var5.anInt564 = (var5.anInt556 * 2081657663 - anInt293 << 8) / var6 * -1087396065;
                     var5.anInt553 = (var5.anInt557 * -732285699 - anInt317 << 8) / var6 * -1271422745;
                     var5.anInt565 = (var5.anInt550 * -1407244941 - anInt317 << 8) / var6 * 1219929915;
                     aClass42Array284[anInt325++] = var5;
                  }
               }
            }
         }
      }

   }

   boolean method390(int var1, int var2, int var3) {
      int var4 = this.anIntArrayArrayArray290[var1][var2][var3];
      if(var4 == -anInt297) {
         return false;
      } else if(var4 == anInt297) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method394(var5 + 1, this.anIntArrayArrayArray285[var1][var2][var3], var6 + 1) && this.method394(var5 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var3], var6 + 1) && this.method394(var5 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method394(var5 + 1, this.anIntArrayArrayArray285[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.anIntArrayArrayArray290[var1][var2][var3] = anInt297;
            return true;
         } else {
            this.anIntArrayArrayArray290[var1][var2][var3] = -anInt297;
            return false;
         }
      }
   }

   boolean method391(int var1, int var2, int var3, int var4) {
      if(!this.method390(var1, var2, var3)) {
         return false;
      } else {
         int var9 = var2 << 7;
         int var5 = var3 << 7;
         int var6 = this.anIntArrayArrayArray285[var1][var2][var3] - 1;
         int var7 = var6 - 120;
         int var10 = var6 - 230;
         int var8 = var6 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var9 > anInt293) {
                  if(!this.method394(var9, var6, var5)) {
                     return false;
                  }

                  if(!this.method394(var9, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method394(var9, var7, var5)) {
                     return false;
                  }

                  if(!this.method394(var9, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!this.method394(var9, var10, var5)) {
                  return false;
               }

               if(!this.method394(var9, var10, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var5 < anInt317) {
                  if(!this.method394(var9, var6, var5 + 128)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method394(var9, var7, var5 + 128)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!this.method394(var9, var10, var5 + 128)) {
                  return false;
               }

               if(!this.method394(var9 + 128, var10, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var9 < anInt293) {
                  if(!this.method394(var9 + 128, var6, var5)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method394(var9 + 128, var7, var5)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!this.method394(var9 + 128, var10, var5)) {
                  return false;
               }

               if(!this.method394(var9 + 128, var10, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var5 > anInt317) {
                  if(!this.method394(var9, var6, var5)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var6, var5)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method394(var9, var7, var5)) {
                     return false;
                  }

                  if(!this.method394(var9 + 128, var7, var5)) {
                     return false;
                  }
               }

               if(!this.method394(var9, var10, var5)) {
                  return false;
               }

               if(!this.method394(var9 + 128, var10, var5)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method394(var9 + 64, var8, var5 + 64)?false:(var4 == 16?this.method394(var9, var10, var5 + 128):(var4 == 32?this.method394(var9 + 128, var10, var5 + 128):(var4 == 64?this.method394(var9 + 128, var10, var5):(var4 == 128?this.method394(var9, var10, var5):true))));
      }
   }

   boolean method392(int var1, int var2, int var3, int var4) {
      if(!this.method390(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method394(var5 + 1, this.anIntArrayArrayArray285[var1][var2][var3] - var4, var6 + 1) && this.method394(var5 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var3] - var4, var6 + 1) && this.method394(var5 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method394(var5 + 1, this.anIntArrayArrayArray285[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method393(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method390(var1, var2, var4)) {
            return false;
         } else {
            var8 = var2 << 7;
            var7 = var4 << 7;
            return this.method394(var8 + 1, this.anIntArrayArrayArray285[var1][var2][var4] - var6, var7 + 1) && this.method394(var8 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var4] - var6, var7 + 1) && this.method394(var8 + 128 - 1, this.anIntArrayArrayArray285[var1][var2 + 1][var4 + 1] - var6, var7 + 128 - 1) && this.method394(var8 + 1, this.anIntArrayArrayArray285[var1][var2][var4 + 1] - var6, var7 + 128 - 1);
         }
      } else {
         for(var8 = var2; var8 <= var3; ++var8) {
            for(var7 = var4; var7 <= var5; ++var7) {
               if(this.anIntArrayArrayArray290[var1][var8][var7] == -anInt297) {
                  return false;
               }
            }
         }

         var8 = (var2 << 7) + 1;
         var7 = (var4 << 7) + 2;
         int var10 = this.anIntArrayArrayArray285[var1][var2][var4] - var6;
         if(!this.method394(var8, var10, var7)) {
            return false;
         } else {
            int var9 = (var3 << 7) - 1;
            if(!this.method394(var9, var10, var7)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method394(var8, var10, var11)) {
                  return false;
               } else if(!this.method394(var9, var10, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method394(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < anInt325; ++var4) {
         Class42 var6 = aClass42Array284[var4];
         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var6.anInt559 * -724260205 == 1) {
            var5 = var6.anInt555 * 1375633411 - var1;
            if(var5 > 0) {
               var10 = var6.anInt557 * -732285699 + (var6.anInt553 * -2110295337 * var5 >> 8);
               var8 = var6.anInt550 * -1407244941 + (var6.anInt565 * 2033687027 * var5 >> 8);
               var9 = var6.anInt563 * -2134622617 + (var6.anInt569 * -1755077391 * var5 >> 8);
               var7 = var6.anInt560 * -204626027 + (var6.anInt567 * 163132441 * var5 >> 8);
               if(var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
                  return true;
               }
            }
         } else if(var6.anInt559 * -724260205 == 2) {
            var5 = var1 - var6.anInt555 * 1375633411;
            if(var5 > 0) {
               var10 = var6.anInt557 * -732285699 + (var6.anInt553 * -2110295337 * var5 >> 8);
               var8 = var6.anInt550 * -1407244941 + (var6.anInt565 * 2033687027 * var5 >> 8);
               var9 = var6.anInt563 * -2134622617 + (var6.anInt569 * -1755077391 * var5 >> 8);
               var7 = var6.anInt560 * -204626027 + (var6.anInt567 * 163132441 * var5 >> 8);
               if(var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
                  return true;
               }
            }
         } else if(var6.anInt559 * -724260205 == 3) {
            var5 = var6.anInt557 * -732285699 - var3;
            if(var5 > 0) {
               var10 = var6.anInt555 * 1375633411 + (var6.anInt562 * -876481201 * var5 >> 8);
               var8 = var6.anInt556 * 2081657663 + (var6.anInt564 * -793701153 * var5 >> 8);
               var9 = var6.anInt563 * -2134622617 + (var6.anInt569 * -1755077391 * var5 >> 8);
               var7 = var6.anInt560 * -204626027 + (var6.anInt567 * 163132441 * var5 >> 8);
               if(var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
                  return true;
               }
            }
         } else if(var6.anInt559 * -724260205 == 4) {
            var5 = var3 - var6.anInt557 * -732285699;
            if(var5 > 0) {
               var10 = var6.anInt555 * 1375633411 + (var6.anInt562 * -876481201 * var5 >> 8);
               var8 = var6.anInt556 * 2081657663 + (var6.anInt564 * -793701153 * var5 >> 8);
               var9 = var6.anInt563 * -2134622617 + (var6.anInt569 * -1755077391 * var5 >> 8);
               var7 = var6.anInt560 * -204626027 + (var6.anInt567 * 163132441 * var5 >> 8);
               if(var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
                  return true;
               }
            }
         } else if(var6.anInt559 * -724260205 == 5) {
            var5 = var2 - var6.anInt563 * -2134622617;
            if(var5 > 0) {
               var10 = var6.anInt555 * 1375633411 + (var6.anInt562 * -876481201 * var5 >> 8);
               var8 = var6.anInt556 * 2081657663 + (var6.anInt564 * -793701153 * var5 >> 8);
               var9 = var6.anInt557 * -732285699 + (var6.anInt553 * -2110295337 * var5 >> 8);
               var7 = var6.anInt550 * -1407244941 + (var6.anInt565 * 2033687027 * var5 >> 8);
               if(var1 >= var10 && var1 <= var8 && var3 >= var9 && var3 <= var7) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void method408(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class42 var8 = new Class42();
      var8.anInt573 = var2 / 128 * 1668284937;
      var8.anInt551 = var3 / 128 * 694301301;
      var8.anInt552 = var4 / 128 * -868032271;
      var8.anInt561 = var5 / 128 * -341399669;
      var8.anInt554 = var1 * 1362217397;
      var8.anInt555 = var2 * 2113940139;
      var8.anInt556 = var3 * -1117397825;
      var8.anInt557 = var4 * -1587640235;
      var8.anInt550 = var5 * -1518303301;
      var8.anInt563 = var6 * -882508457;
      var8.anInt560 = var7 * 1403022269;
      aClass42ArrayArray322[var0][anIntArray321[var0]++] = var8;
   }

   public void method412() {
      for(int var1 = 0; var1 < this.anInt339; ++var1) {
         TileObj5 var2 = this.aTileObj5Array289[var1];
         this.method360(var2);
         this.aTileObj5Array289[var1] = null;
      }

      this.anInt339 = 0;
   }

   public static void method428(int[] var0, int var1, int var2, int var3, int var4) {
      anInt316 = 0;
      anInt340 = 0;
      anInt318 = var3;
      anInt342 = var4;
      anInt337 = var3 / 2;
      anInt338 = var4 / 2;
      boolean[][][][] var6 = new boolean[9][32][53][53];

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      for(var8 = 128; var8 <= 384; var8 += 32) {
         for(var9 = 0; var9 < 2048; var9 += 64) {
            anInt307 = Texture.anIntArray2708[var8];
            anInt308 = Texture.anIntArray2713[var8];
            anInt309 = Texture.anIntArray2708[var9];
            anInt310 = Texture.anIntArray2713[var9];
            var10 = (var8 - 128) / 32;
            var11 = var9 / 64;

            for(int var13 = -26; var13 <= 26; ++var13) {
               var7 = -26;

               while(var7 <= 26) {
                  var12 = var13 * 128;
                  int var14 = var7 * 128;
                  boolean var15 = false;
                  int var5 = -var1;

                  while(true) {
                     if(var5 <= var2) {
                        if(!method381(var12, var0[var10] + var5, var14)) {
                           var5 += 128;
                           continue;
                        }

                        var15 = true;
                     }

                     var6[var10][var11][var13 + 25 + 1][var7 + 25 + 1] = var15;
                     ++var7;
                     break;
                  }
               }
            }
         }
      }

      for(var8 = 0; var8 < 8; ++var8) {
         for(var9 = 0; var9 < 32; ++var9) {
            for(var10 = -25; var10 < 25; ++var10) {
               var11 = -25;

               while(var11 < 25) {
                  boolean var16 = false;
                  var7 = -1;

                  label91:
                  while(true) {
                     if(var7 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var7;
                              continue label91;
                           }

                           if(var6[var8][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var6[var8][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var6[var8 + 1][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var6[var8 + 1][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     aBoolArrayArrayArrayArray335[var8][var9][var10 + 25][var11 + 25] = var16;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

   }

   public void method440(int var1, int var2, int var3, int var4) {
      Tile var5 = this.groundTiles[var1][var2][var3];
      if(var5 != null) {
         this.groundTiles[var1][var2][var3].anInt1865 = var4 * -1802899737;
      }
   }

   public int method452(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 != null && var4.aClass40_1857 != null?var4.aClass40_1857.anInt534 * 785572969:0;
   }

   boolean method461(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Animable var9, int var10, boolean var11, int var12, int var13) {
      int var16;
      for(int var14 = var2; var14 < var2 + var4; ++var14) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var14 < 0 || var16 < 0 || var14 >= this.anInt283 || var16 >= this.anInt294) {
               return false;
            }

            Tile var15 = this.groundTiles[var1][var14][var16];
            if(var15 != null && var15.anInt1861 * 1758491173 >= 5) {
               return false;
            }
         }
      }

      TileObj5 var20 = new TileObj5();
      var20.anInt594 = var12 * 1173740699;
      var20.anInt586 = var13 * -1289211751;
      var20.anInt588 = var1 * -479867789;
      var20.anInt584 = var6 * -1227876065;
      var20.anInt585 = var7 * -1805845451;
      var20.anInt593 = var8 * -565869637;
      var20.anAnimable5 = var9;
      var20.anInt587 = var10 * 644028591;
      var20.anInt595 = var2 * -2049306815;
      var20.anInt590 = var3 * -870803859;
      var20.anInt589 = (var2 + var4 - 1) * 1313815339;
      var20.anInt591 = (var3 + var5 - 1) * 198829215;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var21 = var3; var21 < var3 + var5; ++var21) {
            int var17 = 0;
            if(var16 > var2) {
               ++var17;
            }

            if(var16 < var2 + var4 - 1) {
               var17 += 4;
            }

            if(var21 > var3) {
               var17 += 8;
            }

            if(var21 < var3 + var5 - 1) {
               var17 += 2;
            }

            for(int var18 = var1; var18 >= 0; --var18) {
               if(this.groundTiles[var18][var16][var21] == null) {
                  this.groundTiles[var18][var16][var21] = new Tile(var18, var16, var21);
               }
            }

            Tile var22 = this.groundTiles[var1][var16][var21];
            var22.obj5s[var22.anInt1861 * 1758491173] = var20;
            var22.anIntArray1863[var22.anInt1861 * 1758491173] = var17;
            var22.anInt1851 = (var22.anInt1851 * -1372682459 | var17) * -893764435;
            var22.anInt1861 += -1721476691;
         }
      }

      if(var11) {
         this.aTileObj5Array289[this.anInt339++] = var20;
      }

      return true;
   }

   void method463(Class38 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - anInt293;
      int var27;
      int var20 = var27 = (var8 << 7) - anInt317;
      int var12;
      int var13 = var12 = var10 + 128;
      int var17;
      int var19 = var17 = var20 + 128;
      int var15 = this.anIntArrayArrayArray285[var2][var7][var8] - anInt281;
      int var11 = this.anIntArrayArrayArray285[var2][var7 + 1][var8] - anInt281;
      int var16 = this.anIntArrayArrayArray285[var2][var7 + 1][var8 + 1] - anInt281;
      int var28 = this.anIntArrayArrayArray285[var2][var7][var8 + 1] - anInt281;
      int var18 = var20 * var5 + var10 * var6 >> 16;
      var20 = var20 * var6 - var10 * var5 >> 16;
      var10 = var18;
      var18 = var15 * var4 - var20 * var3 >> 16;
      var20 = var15 * var3 + var20 * var4 >> 16;
      var15 = var18;
      if(var20 >= 50) {
         var18 = var27 * var5 + var13 * var6 >> 16;
         var27 = var27 * var6 - var13 * var5 >> 16;
         var13 = var18;
         var18 = var11 * var4 - var27 * var3 >> 16;
         var27 = var11 * var3 + var27 * var4 >> 16;
         var11 = var18;
         if(var27 >= 50) {
            var18 = var19 * var5 + var12 * var6 >> 16;
            var19 = var19 * var6 - var12 * var5 >> 16;
            var12 = var18;
            var18 = var16 * var4 - var19 * var3 >> 16;
            var19 = var16 * var3 + var19 * var4 >> 16;
            var16 = var18;
            if(var19 >= 50) {
               var18 = var17 * var5 + var9 * var6 >> 16;
               var17 = var17 * var6 - var9 * var5 >> 16;
               var9 = var18;
               var18 = var28 * var4 - var17 * var3 >> 16;
               var17 = var28 * var3 + var17 * var4 >> 16;
               if(var17 >= 50) {
                  int var24 = Texture.anInt2705 + var10 * Texture.anInt2704 / var20;
                  int var21 = Texture.anInt2706 + var15 * Texture.anInt2704 / var20;
                  int var25 = Texture.anInt2705 + var13 * Texture.anInt2704 / var27;
                  int var22 = Texture.anInt2706 + var11 * Texture.anInt2704 / var27;
                  int var29 = Texture.anInt2705 + var12 * Texture.anInt2704 / var19;
                  int var30 = Texture.anInt2706 + var16 * Texture.anInt2704 / var19;
                  int var26 = Texture.anInt2705 + var9 * Texture.anInt2704 / var17;
                  int var23 = Texture.anInt2706 + var18 * Texture.anInt2704 / var17;
                  Texture.anInt2699 = 0;
                  int var14;
                  if((var29 - var26) * (var22 - var23) - (var30 - var23) * (var25 - var26) > 0) {
                     Texture.aBool2700 = false;
                     if(var29 < 0 || var26 < 0 || var25 < 0 || var29 > Texture.anInt2712 || var26 > Texture.anInt2712 || var25 > Texture.anInt2712) {
                        Texture.aBool2700 = true;
                     }

                     if(aBool312 && this.method388(anInt319, anInt315, var30, var23, var22, var29, var26, var25)) {
                        anInt336 = var7;
                        anInt341 = var8;
                     }

                     if(var1.anInt504 * 1798787571 == -1) {
                        if(var1.anInt502 * 457420757 != 12345678) {
                           Texture.method3215(var30, var23, var22, var29, var26, var25, var1.anInt502 * 457420757, var1.anInt503 * 2026532237, var1.anInt512 * 2017637797);
                        }
                     } else if(!aBool300) {
                        if(var1.aBool501) {
                           Texture.method3248(var30, var23, var22, var29, var26, var25, var1.anInt502 * 457420757, var1.anInt503 * 2026532237, var1.anInt512 * 2017637797, var10, var13, var9, var15, var11, var18, var20, var27, var17, var1.anInt504 * 1798787571);
                        } else {
                           Texture.method3248(var30, var23, var22, var29, var26, var25, var1.anInt502 * 457420757, var1.anInt503 * 2026532237, var1.anInt512 * 2017637797, var12, var9, var13, var16, var18, var11, var19, var17, var27, var1.anInt504 * 1798787571);
                        }
                     } else {
                        var14 = Texture.anInterface3_2718.method15(var1.anInt504 * 1798787571, 2091687573);
                        Texture.method3215(var30, var23, var22, var29, var26, var25, method359(var14, var1.anInt502 * 457420757), method359(var14, var1.anInt503 * 2026532237), method359(var14, var1.anInt512 * 2017637797));
                     }
                  }

                  if((var24 - var25) * (var23 - var22) - (var21 - var22) * (var26 - var25) > 0) {
                     Texture.aBool2700 = false;
                     if(var24 < 0 || var25 < 0 || var26 < 0 || var24 > Texture.anInt2712 || var25 > Texture.anInt2712 || var26 > Texture.anInt2712) {
                        Texture.aBool2700 = true;
                     }

                     if(aBool312 && this.method388(anInt319, anInt315, var21, var22, var23, var24, var25, var26)) {
                        anInt336 = var7;
                        anInt341 = var8;
                     }

                     if(var1.anInt504 * 1798787571 == -1) {
                        if(var1.anInt505 * -527486671 != 12345678) {
                           Texture.method3215(var21, var22, var23, var24, var25, var26, var1.anInt505 * -527486671, var1.anInt512 * 2017637797, var1.anInt503 * 2026532237);
                        }
                     } else if(!aBool300) {
                        Texture.method3248(var21, var22, var23, var24, var25, var26, var1.anInt505 * -527486671, var1.anInt512 * 2017637797, var1.anInt503 * 2026532237, var10, var13, var9, var15, var11, var18, var20, var27, var17, var1.anInt504 * 1798787571);
                     } else {
                        var14 = Texture.anInterface3_2718.method15(var1.anInt504 * 1798787571, 1488423271);
                        Texture.method3215(var21, var22, var23, var24, var25, var26, method359(var14, var1.anInt505 * -527486671), method359(var14, var1.anInt512 * 2017637797), method359(var14, var1.anInt503 * 2026532237));
                     }
                  }

               }
            }
         }
      }
   }

   public void method466(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt305; ++var4) {
         for(int var6 = 0; var6 < this.anInt283; ++var6) {
            for(int var7 = 0; var7 < this.anInt294; ++var7) {
               Tile var9 = this.groundTiles[var4][var6][var7];
               if(var9 != null) {
                  Class40 var5 = var9.aClass40_1857;
                  Model var8;
                  if(var5 != null && var5.anAnimable3 instanceof Model) {
                     Model var10 = (Model)var5.anAnimable3;
                     this.method510(var10, var4, var6, var7, 1, 1);
                     if(var5.anAnimable4 instanceof Model) {
                        var8 = (Model)var5.anAnimable4;
                        this.method510(var8, var4, var6, var7, 1, 1);
                        Model.method3122(var10, var8, 0, 0, 0, false);
                        var5.anAnimable4 = var8.method3133(var8.aShort2682, var8.aShort2684, var1, var2, var3);
                     }

                     var5.anAnimable3 = var10.method3133(var10.aShort2682, var10.aShort2684, var1, var2, var3);
                  }

                  for(int var13 = 0; var13 < var9.anInt1861 * 1758491173; ++var13) {
                     TileObj5 var12 = var9.obj5s[var13];
                     if(var12 != null && var12.anAnimable5 instanceof Model) {
                        Model var11 = (Model)var12.anAnimable5;
                        this.method510(var11, var4, var6, var7, var12.anInt589 * 525183875 - var12.anInt595 * 1249542337 + 1, var12.anInt591 * 1111111519 - var12.anInt590 * -1236081819 + 1);
                        var12.anAnimable5 = var11.method3133(var11.aShort2682, var11.aShort2684, var1, var2, var3);
                     }
                  }

                  Class22 var14 = var9.aClass22_1859;
                  if(var14 != null && var14.anAnimable instanceof Model) {
                     var8 = (Model)var14.anAnimable;
                     this.method380(var8, var4, var6, var7);
                     var14.anAnimable = var8.method3133(var8.aShort2682, var8.aShort2684, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void method485(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      if(var4 != null) {
         var4.aClass40_1857 = null;
      }
   }

   void method510(Model var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var15 = var3;
      int var12 = var3 + var5;
      int var13 = var4 - 1;
      int var17 = var4 + var6;

      for(int var8 = var2; var8 <= var2 + 1; ++var8) {
         if(var8 != this.anInt305) {
            for(int var9 = var15; var9 <= var12; ++var9) {
               if(var9 >= 0 && var9 < this.anInt283) {
                  for(int var10 = var13; var10 <= var17; ++var10) {
                     if(var10 >= 0 && var10 < this.anInt294 && (!var7 || var9 >= var12 || var10 >= var17 || var10 < var4 && var9 != var3)) {
                        Tile var18 = this.groundTiles[var8][var9][var10];
                        if(var18 != null) {
                           int var11 = (this.anIntArrayArrayArray285[var8][var9][var10] + this.anIntArrayArrayArray285[var8][var9 + 1][var10] + this.anIntArrayArrayArray285[var8][var9][var10 + 1] + this.anIntArrayArrayArray285[var8][var9 + 1][var10 + 1]) / 4 - (this.anIntArrayArrayArray285[var2][var3][var4] + this.anIntArrayArrayArray285[var2][var3 + 1][var4] + this.anIntArrayArrayArray285[var2][var3][var4 + 1] + this.anIntArrayArrayArray285[var2][var3 + 1][var4 + 1]) / 4;
                           Class40 var16 = var18.aClass40_1857;
                           if(var16 != null) {
                              Model var14;
                              if(var16.anAnimable3 instanceof Model) {
                                 var14 = (Model)var16.anAnimable3;
                                 Model.method3122(var1, var14, (var9 - var3) * 128 + (1 - var5) * 64, var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var16.anAnimable4 instanceof Model) {
                                 var14 = (Model)var16.anAnimable4;
                                 Model.method3122(var1, var14, (var9 - var3) * 128 + (1 - var5) * 64, var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var18.anInt1861 * 1758491173; ++var23) {
                              TileObj5 var19 = var18.obj5s[var23];
                              if(var19 != null && var19.anAnimable5 instanceof Model) {
                                 Model var20 = (Model)var19.anAnimable5;
                                 int var21 = var19.anInt589 * 525183875 - var19.anInt595 * 1249542337 + 1;
                                 int var22 = var19.anInt591 * 1111111519 - var19.anInt590 * -1236081819 + 1;
                                 Model.method3122(var1, var20, (var19.anInt595 * 1249542337 - var3) * 128 + (var21 - var5) * 64, var11, (var19.anInt590 * -1236081819 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var15;
            var7 = false;
         }
      }

   }

   public void method514(int var1, int var2, int var3) {
      aBool312 = true;
      anInt313 = var1;
      anInt319 = var2;
      anInt315 = var3;
      anInt336 = -1;
      anInt341 = -1;
   }

   public Class22 method518(int var1, int var2, int var3) {
      Tile var4 = this.groundTiles[var1][var2][var3];
      return var4 != null && var4.aClass22_1859 != null?var4.aClass22_1859:null;
   }

}
