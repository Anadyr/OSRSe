package com.jagex;

public final class Class48 {

   Animable anAnimable6;
   int anInt649;
   int anInt650;
   Animable anAnimable7;
   public static final int anInt652 = 243;
   int anInt653;
   int anInt654;
   int anInt655;
   Animable anAnimable8;
   static final int anInt657 = 7680;


   static final void method771(int var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      if(var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if(client.aBool2937 && GameInterface.anInt1819 * -747958745 != var0) {
            return;
         }

         int var8 = 0;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if(0 == var1) {
            var8 = GameInterface.region.method452(var0, var2, var3);
         }

         if(var1 == 1) {
            var8 = GameInterface.region.method372(var0, var2, var3);
         }

         if(2 == var1) {
            var8 = GameInterface.region.getTileContents(var0, var2, var3);
         }

         if(3 == var1) {
            var8 = GameInterface.region.method374(var0, var2, var3);
         }

         int var15;
         if(0 != var8) {
            var15 = GameInterface.region.getTileContentsType(var0, var2, var3, var8);
            int var33 = var8 >> 14 & 32767;
            int var34 = var15 & 31;
            int var35 = var15 >> 6 & 3;
            ObjectDefinition var17;
            if(0 == var1) {
               GameInterface.region.method485(var0, var2, var3);
               var17 = Class45.method700(var33, 359750046);
               if(-1030255905 * var17.actionCount != 0) {
                  client.aClass58Array2996[var0].method861(var2, var3, var34, var35, var17.walkable, 2135432117);
               }
            }

            if(var1 == 1) {
               GameInterface.region.method363(var0, var2, var3);
            }

            if(var1 == 2) {
               GameInterface.region.method364(var0, var2, var3);
               var17 = Class45.method700(var33, 359750046);
               if(1162660975 * var17.sizeX + var2 > 103 || var3 + 1162660975 * var17.sizeX > 103 || var2 + -1976023901 * var17.sizeY > 103 || var17.sizeY * -1976023901 + var3 > 103) {
                  return;
               }

               if(var17.actionCount * -1030255905 != 0) {
                  client.aClass58Array2996[var0].method862(var2, var3, 1162660975 * var17.sizeX, var17.sizeY * -1976023901, var35, var17.walkable, -1429732894);
               }
            }

            if(var1 == 3) {
               GameInterface.region.method365(var0, var2, var3);
               var17 = Class45.method700(var33, 359750046);
               if(1 == var17.actionCount * -1030255905) {
                  client.aClass58Array2996[var0].method864(var2, var3, -2134012373);
               }
            }
         }

         if(var4 >= 0) {
            var15 = var0;
            if(var0 < 3 && 2 == (Class47.aByteArrayArrayArray634[1][var2][var3] & 2)) {
               var15 = var0 + 1;
            }

            Region var37 = GameInterface.region;
            Class58 var22 = client.aClass58Array2996[var0];
            ObjectDefinition var9 = Class45.method700(var4, 359750046);
            int var13;
            int var28;
            if(1 != var5 && var5 != 3) {
               var13 = 1162660975 * var9.sizeX;
               var28 = var9.sizeY * -1976023901;
            } else {
               var13 = var9.sizeY * -1976023901;
               var28 = 1162660975 * var9.sizeX;
            }

            int var29;
            int var30;
            if(var2 + var13 <= 104) {
               var29 = var2 + (var13 >> 1);
               var30 = var2 + (var13 + 1 >> 1);
            } else {
               var29 = var2;
               var30 = var2 + 1;
            }

            int var31;
            int var32;
            if(var28 + var3 <= 104) {
               var32 = var3 + (var28 >> 1);
               var31 = (1 + var28 >> 1) + var3;
            } else {
               var32 = var3;
               var31 = 1 + var3;
            }

            int[][] var18 = Class47.anIntArrayArrayArray635[var15];
            int var19 = var18[var30][var31] + var18[var30][var32] + var18[var29][var32] + var18[var29][var31] >> 2;
            int var14 = (var2 << 7) + (var13 << 6);
            int var20 = (var28 << 6) + (var3 << 7);
            int var23 = (var4 << 14) + var2 + (var3 << 7) + 1073741824;
            if(-839074197 * var9.anInt2203 == 0) {
               var23 -= Integer.MIN_VALUE;
            }

            int var24 = (var5 << 6) + var6;
            if(1 == var9.anInt2229 * 547466771) {
               var24 += 256;
            }

            Object var21;
            if(var6 == 22) {
               if(-1 == var9.anInt2212 * -100857069 && var9.childIds == null) {
                  var21 = var9.method2398(22, var5, var18, var14, var19, var20, -813998597);
               } else {
                  var21 = new Class116_Sub23_Sub16_Sub6(var4, 22, var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               var37.method351(var0, var2, var3, var19, (Animable)var21, var23, var24);
               if(1 == var9.actionCount * -1030255905) {
                  var22.method859(var2, var3, (byte)3);
               }
            } else if(10 != var6 && var6 != 11) {
               if(var6 >= 12) {
                  if(-100857069 * var9.anInt2212 == -1 && null == var9.childIds) {
                     var21 = var9.method2398(var6, var5, var18, var14, var19, var20, -813998597);
                  } else {
                     var21 = new Class116_Sub23_Sub16_Sub6(var4, var6, var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var37.method355(var0, var2, var3, var19, 1, 1, (Animable)var21, 0, var23, var24);
                  if(0 != -1030255905 * var9.actionCount) {
                     var22.method857(var2, var3, var13, var28, var9.walkable, 1483178392);
                  }
               } else if(var6 == 0) {
                  if(-1 == -100857069 * var9.anInt2212 && var9.childIds == null) {
                     var21 = var9.method2398(0, var5, var18, var14, var19, var20, -813998597);
                  } else {
                     var21 = new Class116_Sub23_Sub16_Sub6(var4, 0, var5, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var37.method353(var0, var2, var3, var19, (Animable)var21, (Animable)null, Class47.anIntArray632[var5], 0, var23, var24);
                  if(var9.actionCount * -1030255905 != 0) {
                     var22.method866(var2, var3, var6, var5, var9.walkable, -2118822687);
                  }
               } else if(1 == var6) {
                  if(-1 == var9.anInt2212 * -100857069 && null == var9.childIds) {
                     var21 = var9.method2398(1, var5, var18, var14, var19, var20, -813998597);
                  } else {
                     var21 = new Class116_Sub23_Sub16_Sub6(var4, 1, var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var37.method353(var0, var2, var3, var19, (Animable)var21, (Animable)null, Class47.anIntArray633[var5], 0, var23, var24);
                  if(0 != var9.actionCount * -1030255905) {
                     var22.method866(var2, var3, var6, var5, var9.walkable, -1996603433);
                  }
               } else {
                  Object var25;
                  int var38;
                  if(2 == var6) {
                     var38 = 1 + var5 & 3;
                     Object var16;
                     if(-1 == -100857069 * var9.anInt2212 && null == var9.childIds) {
                        var16 = var9.method2398(2, 4 + var5, var18, var14, var19, var20, -813998597);
                        var25 = var9.method2398(2, var38, var18, var14, var19, var20, -813998597);
                     } else {
                        var16 = new Class116_Sub23_Sub16_Sub6(var4, 2, var5 + 4, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                        var25 = new Class116_Sub23_Sub16_Sub6(var4, 2, var38, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                     }

                     var37.method353(var0, var2, var3, var19, (Animable)var16, (Animable)var25, Class47.anIntArray632[var5], Class47.anIntArray632[var38], var23, var24);
                     if(-1030255905 * var9.actionCount != 0) {
                        var22.method866(var2, var3, var6, var5, var9.walkable, -1997216221);
                     }
                  } else if(3 == var6) {
                     if(-1 == -100857069 * var9.anInt2212 && null == var9.childIds) {
                        var21 = var9.method2398(3, var5, var18, var14, var19, var20, -813998597);
                     } else {
                        var21 = new Class116_Sub23_Sub16_Sub6(var4, 3, var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                     }

                     var37.method353(var0, var2, var3, var19, (Animable)var21, (Animable)null, Class47.anIntArray633[var5], 0, var23, var24);
                     if(0 != -1030255905 * var9.actionCount) {
                        var22.method866(var2, var3, var6, var5, var9.walkable, -2019491467);
                     }
                  } else if(9 == var6) {
                     if(-1 == -100857069 * var9.anInt2212 && null == var9.childIds) {
                        var21 = var9.method2398(var6, var5, var18, var14, var19, var20, -813998597);
                     } else {
                        var21 = new Class116_Sub23_Sub16_Sub6(var4, var6, var5, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                     }

                     var37.method355(var0, var2, var3, var19, 1, 1, (Animable)var21, 0, var23, var24);
                     if(0 != -1030255905 * var9.actionCount) {
                        var22.method857(var2, var3, var13, var28, var9.walkable, 1483178392);
                     }
                  } else if(var6 == 4) {
                     if(-100857069 * var9.anInt2212 == -1 && var9.childIds == null) {
                        var21 = var9.method2398(4, var5, var18, var14, var19, var20, -813998597);
                     } else {
                        var21 = new Class116_Sub23_Sub16_Sub6(var4, 4, var5, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                     }

                     var37.method354(var0, var2, var3, var19, (Animable)var21, (Animable)null, Class47.anIntArray632[var5], 0, 0, 0, var23, var24);
                  } else {
                     int var36;
                     if(var6 == 5) {
                        var38 = 16;
                        var36 = var37.method452(var0, var2, var3);
                        if(0 != var36) {
                           var38 = Class45.method700(var36 >> 14 & 32767, 359750046).anInt2213 * 1063235335;
                        }

                        if(-100857069 * var9.anInt2212 == -1 && var9.childIds == null) {
                           var25 = var9.method2398(4, var5, var18, var14, var19, var20, -813998597);
                        } else {
                           var25 = new Class116_Sub23_Sub16_Sub6(var4, 4, var5, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                        }

                        var37.method354(var0, var2, var3, var19, (Animable)var25, (Animable)null, Class47.anIntArray632[var5], 0, Class47.anIntArray623[var5] * var38, var38 * Class47.anIntArray636[var5], var23, var24);
                     } else if(6 == var6) {
                        var38 = 8;
                        var36 = var37.method452(var0, var2, var3);
                        if(0 != var36) {
                           var38 = Class45.method700(var36 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                        }

                        if(-1 == var9.anInt2212 * -100857069 && var9.childIds == null) {
                           var25 = var9.method2398(4, var5 + 4, var18, var14, var19, var20, -813998597);
                        } else {
                           var25 = new Class116_Sub23_Sub16_Sub6(var4, 4, var5 + 4, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                        }

                        var37.method354(var0, var2, var3, var19, (Animable)var25, (Animable)null, 256, var5, var38 * Class47.anIntArray640[var5], var38 * Class47.anIntArray637[var5], var23, var24);
                     } else if(var6 == 7) {
                        var36 = var5 + 2 & 3;
                        if(var9.anInt2212 * -100857069 == -1 && null == var9.childIds) {
                           var21 = var9.method2398(4, var36 + 4, var18, var14, var19, var20, -813998597);
                        } else {
                           var21 = new Class116_Sub23_Sub16_Sub6(var4, 4, var36 + 4, var15, var2, var3, -100857069 * var9.anInt2212, true, (Animable)null);
                        }

                        var37.method354(var0, var2, var3, var19, (Animable)var21, (Animable)null, 256, var36, 0, 0, var23, var24);
                     } else if(var6 == 8) {
                        var38 = 8;
                        var36 = var37.method452(var0, var2, var3);
                        if(var36 != 0) {
                           var38 = Class45.method700(var36 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                        }

                        int var26 = 2 + var5 & 3;
                        Object var27;
                        if(-1 == -100857069 * var9.anInt2212 && null == var9.childIds) {
                           var25 = var9.method2398(4, 4 + var5, var18, var14, var19, var20, -813998597);
                           var27 = var9.method2398(4, 4 + var26, var18, var14, var19, var20, -813998597);
                        } else {
                           var25 = new Class116_Sub23_Sub16_Sub6(var4, 4, 4 + var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                           var27 = new Class116_Sub23_Sub16_Sub6(var4, 4, var26 + 4, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
                        }

                        var37.method354(var0, var2, var3, var19, (Animable)var25, (Animable)var27, 256, var5, var38 * Class47.anIntArray640[var5], var38 * Class47.anIntArray637[var5], var23, var24);
                     }
                  }
               }
            } else {
               if(-1 == -100857069 * var9.anInt2212 && null == var9.childIds) {
                  var21 = var9.method2398(10, var5, var18, var14, var19, var20, -813998597);
               } else {
                  var21 = new Class116_Sub23_Sub16_Sub6(var4, 10, var5, var15, var2, var3, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               if(null != var21) {
                  var37.method355(var0, var2, var3, var19, var13, var28, (Animable)var21, 11 == var6?256:0, var23, var24);
               }

               if(var9.actionCount * -1030255905 != 0) {
                  var22.method857(var2, var3, var13, var28, var9.walkable, 1483178392);
               }
            }
         }
      }

   }

   static void method772(String[] var0, short[] var1, int var2, int var3, byte var4) {
      if(var2 < var3) {
         int var7 = (var2 + var3) / 2;
         int var6 = var2;
         String var8 = var0[var7];
         var0[var7] = var0[var3];
         var0[var3] = var8;
         short var9 = var1[var7];
         var1[var7] = var1[var3];
         var1[var3] = var9;

         for(int var5 = var2; var5 < var3; ++var5) {
            if(null == var8 || null != var0[var5] && var0[var5].compareTo(var8) < (var5 & 1)) {
               String var10 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var5];
               var1[var5] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var8;
         var1[var3] = var1[var6];
         var1[var6] = var9;
         method772(var0, var1, var2, var6 - 1, (byte)68);
         method772(var0, var1, var6 + 1, var3, (byte)-43);
      }

   }
}
