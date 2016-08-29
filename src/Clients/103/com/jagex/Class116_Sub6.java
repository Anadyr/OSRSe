package com.jagex;
import java.awt.Component;
import java.io.IOException;

public class Class116_Sub6 extends Node {

   int anInt1734;
   Class116_Sub15 aClass116_Sub15_1736;
   Object[] anObjectArray1737;
   int anInt1738;
   boolean aBool1739;
   Class116_Sub15 aClass116_Sub15_1740;
   int anInt1741;
   int anInt1742;
   String aString1743;
   int anInt1744;
   static Class116_Sub15 aClass116_Sub15_1745;
   int anInt1747;


   static final void method1933(int var0, int var1, int var2, int var3, int var4, int var5, GroundController var6, Class58 var7, byte var8) {
      if(!client.aBool2937 || (Class47.aByteArrayArrayArray634[0][var1][var2] & 2) != 0 || (Class47.aByteArrayArrayArray634[var0][var1][var2] & 16) == 0) {
         if(var0 < Class47.anInt638 * -1263368093) {
            Class47.anInt638 = var0 * -241419957;
         }

         ObjectDefinition var9 = Class45.method700(var3, 359750046);
         int var10;
         int var17;
         if(1 != var4 && 3 != var4) {
            var10 = var9.sizeX * 1162660975;
            var17 = -1976023901 * var9.sizeY;
         } else {
            var10 = -1976023901 * var9.sizeY;
            var17 = var9.sizeX * 1162660975;
         }

         int var18;
         int var19;
         if(var10 + var1 <= 104) {
            var18 = (var10 >> 1) + var1;
            var19 = (var10 + 1 >> 1) + var1;
         } else {
            var18 = var1;
            var19 = var1 + 1;
         }

         int var22;
         int var26;
         if(var2 + var17 <= 104) {
            var22 = var2 + (var17 >> 1);
            var26 = (var17 + 1 >> 1) + var2;
         } else {
            var22 = var2;
            var26 = var2 + 1;
         }

         int[][] var12 = Class47.anIntArrayArrayArray635[var0];
         int var14 = var12[var18][var26] + var12[var19][var22] + var12[var18][var22] + var12[var19][var26] >> 2;
         int var13 = (var10 << 6) + (var1 << 7);
         int var15 = (var2 << 7) + (var17 << 6);
         int var23 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
         if(var9.anInt2203 * -839074197 == 0) {
            var23 -= Integer.MIN_VALUE;
         }

         int var24 = var5 + (var4 << 6);
         if(547466771 * var9.anInt2229 == 1) {
            var24 += 256;
         }

         int var11;
         int var25;
         if(var9.method2402(2031563592)) {
            Class116_Sub8 var16 = new Class116_Sub8();
            var16.anInt1768 = var0 * 246258815;
            var16.anInt1769 = var1 * -1791242624;
            var16.anInt1770 = 620267648 * var2;
            var11 = 1162660975 * var9.sizeX;
            var25 = -1976023901 * var9.sizeY;
            if(var4 == 1 || 3 == var4) {
               var11 = -1976023901 * var9.sizeY;
               var25 = var9.sizeX * 1162660975;
            }

            var16.anInt1767 = (var11 + var1) * -1461530240;
            var16.anInt1773 = (var2 + var25) * 1218256512;
            var16.anInt1781 = 802663847 * var9.anInt2233;
            var16.anInt1782 = var9.anInt2234 * 401668736;
            var16.anInt1776 = 428311197 * var9.anInt2195;
            var16.anInt1777 = 1108507363 * var9.anInt2236;
            var16.anIntArray1771 = var9.anIntArray2211;
            if(null != var9.anIntArray2206) {
               var16.aClass116_Sub23_Sub3_1784 = var9;
               var16.method1938(424061730);
            }

            Class116_Sub8.aClass117_1779.method1571(var16);
            if(null != var16.anIntArray1771) {
               var16.anInt1772 = (-1875457101 * var16.anInt1776 + (int)(Math.random() * (double)(var16.anInt1777 * -1201579529 - var16.anInt1776 * -1875457101))) * -2049360189;
            }
         }

         Object var28;
         if(22 == var5) {
            if(!client.aBool2937 || var9.anInt2203 * -839074197 != 0 || -1030255905 * var9.actionCount == 1 || var9.clippingFlag) {
               if(var9.anInt2212 * -100857069 == -1 && null == var9.anIntArray2206) {
                  var28 = var9.method2396(22, var4, var12, var13, var14, var15, 630497929);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 22, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
               }

               var6.method351(var0, var1, var2, var14, (Animable)var28, var23, var24);
               if(1 == -1030255905 * var9.actionCount && null != var7) {
                  var7.method859(var1, var2, (byte)3);
               }

            }
         } else if(var5 != 10 && 11 != var5) {
            if(var5 >= 12) {
               if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(var5, var4, var12, var13, var14, var15, -590103718);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
               }

               var6.method355(var0, var1, var2, var14, 1, 1, (Animable)var28, 0, var23, var24);
               if(var5 >= 12 && var5 <= 17 && 13 != var5 && var0 > 0) {
                  Class47.anIntArrayArrayArray630[var0][var1][var2] |= 2340;
               }

               if(-1030255905 * var9.actionCount != 0 && var7 != null) {
                  var7.method857(var1, var2, var10, var17, var9.walkable, 1483178392);
               }

            } else if(var5 == 0) {
               if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(0, var4, var12, var13, var14, var15, -1637493647);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 0, var4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var14, (Animable)var28, (Animable)null, Class47.anIntArray632[var4], 0, var23, var24);
               if(var4 == 0) {
                  if(var9.aBool2220) {
                     Class47.aByteArrayArrayArray627[var0][var1][var2] = 50;
                     Class47.aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                  }

                  if(var9.aBool2191) {
                     Class47.anIntArrayArrayArray630[var0][var1][var2] |= 585;
                  }
               } else if(1 == var4) {
                  if(var9.aBool2220) {
                     Class47.aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     Class47.aByteArrayArrayArray627[var0][1 + var1][1 + var2] = 50;
                  }

                  if(var9.aBool2191) {
                     Class47.anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                  }
               } else if(2 == var4) {
                  if(var9.aBool2220) {
                     Class47.aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                     Class47.aByteArrayArrayArray627[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if(var9.aBool2191) {
                     Class47.anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                  }
               } else if(3 == var4) {
                  if(var9.aBool2220) {
                     Class47.aByteArrayArrayArray627[var0][var1][var2] = 50;
                     Class47.aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  }

                  if(var9.aBool2191) {
                     Class47.anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                  }
               }

               if(0 != -1030255905 * var9.actionCount && null != var7) {
                  var7.method866(var1, var2, var5, var4, var9.walkable, -1862169981);
               }

               if(16 != var9.anInt2213 * 1063235335) {
                  var6.method361(var0, var1, var2, 1063235335 * var9.anInt2213);
               }

            } else if(1 == var5) {
               if(-1 == -100857069 * var9.anInt2212 && var9.anIntArray2206 == null) {
                  var28 = var9.method2396(1, var4, var12, var13, var14, var15, 1094612006);
               } else {
                  var28 = new Class116_Sub23_Sub16_Sub6(var3, 1, var4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
               }

               var6.method353(var0, var1, var2, var14, (Animable)var28, (Animable)null, Class47.anIntArray633[var4], 0, var23, var24);
               if(var9.aBool2220) {
                  if(var4 == 0) {
                     Class47.aByteArrayArrayArray627[var0][var1][var2 + 1] = 50;
                  } else if(var4 == 1) {
                     Class47.aByteArrayArrayArray627[var0][var1 + 1][1 + var2] = 50;
                  } else if(var4 == 2) {
                     Class47.aByteArrayArrayArray627[var0][1 + var1][var2] = 50;
                  } else if(var4 == 3) {
                     Class47.aByteArrayArrayArray627[var0][var1][var2] = 50;
                  }
               }

               if(0 != var9.actionCount * -1030255905 && var7 != null) {
                  var7.method866(var1, var2, var5, var4, var9.walkable, -1901753339);
               }

            } else {
               int var29;
               Object var31;
               if(2 == var5) {
                  var29 = var4 + 1 & 3;
                  Object var27;
                  if(-1 == var9.anInt2212 * -100857069 && var9.anIntArray2206 == null) {
                     var27 = var9.method2396(2, 4 + var4, var12, var13, var14, var15, -1151450858);
                     var31 = var9.method2396(2, var29, var12, var13, var14, var15, 1907066772);
                  } else {
                     var27 = new Class116_Sub23_Sub16_Sub6(var3, 2, var4 + 4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
                     var31 = new Class116_Sub23_Sub16_Sub6(var3, 2, var29, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var14, (Animable)var27, (Animable)var31, Class47.anIntArray632[var4], Class47.anIntArray632[var29], var23, var24);
                  if(var9.aBool2191) {
                     if(0 == var4) {
                        Class47.anIntArrayArrayArray630[var0][var1][var2] |= 585;
                        Class47.anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                     } else if(var4 == 1) {
                        Class47.anIntArrayArrayArray630[var0][var1][var2 + 1] |= 1170;
                        Class47.anIntArrayArrayArray630[var0][1 + var1][var2] |= 585;
                     } else if(var4 == 2) {
                        Class47.anIntArrayArrayArray630[var0][var1 + 1][var2] |= 585;
                        Class47.anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                     } else if(3 == var4) {
                        Class47.anIntArrayArrayArray630[var0][var1][var2] |= 1170;
                        Class47.anIntArrayArrayArray630[var0][var1][var2] |= 585;
                     }
                  }

                  if(var9.actionCount * -1030255905 != 0 && null != var7) {
                     var7.method866(var1, var2, var5, var4, var9.walkable, -2083667067);
                  }

                  if(var9.anInt2213 * 1063235335 != 16) {
                     var6.method361(var0, var1, var2, 1063235335 * var9.anInt2213);
                  }

               } else if(3 == var5) {
                  if(-1 == var9.anInt2212 * -100857069 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(3, var4, var12, var13, var14, var15, 1209829635);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 3, var4, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method353(var0, var1, var2, var14, (Animable)var28, (Animable)null, Class47.anIntArray633[var4], 0, var23, var24);
                  if(var9.aBool2220) {
                     if(var4 == 0) {
                        Class47.aByteArrayArrayArray627[var0][var1][1 + var2] = 50;
                     } else if(1 == var4) {
                        Class47.aByteArrayArrayArray627[var0][1 + var1][var2 + 1] = 50;
                     } else if(2 == var4) {
                        Class47.aByteArrayArrayArray627[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        Class47.aByteArrayArrayArray627[var0][var1][var2] = 50;
                     }
                  }

                  if(-1030255905 * var9.actionCount != 0 && var7 != null) {
                     var7.method866(var1, var2, var5, var4, var9.walkable, -2006996598);
                  }

               } else if(var5 == 9) {
                  if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(var5, var4, var12, var13, var14, var15, 530299546);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, var5, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method355(var0, var1, var2, var14, 1, 1, (Animable)var28, 0, var23, var24);
                  if(-1030255905 * var9.actionCount != 0 && var7 != null) {
                     var7.method857(var1, var2, var10, var17, var9.walkable, 1483178392);
                  }

                  if(16 != 1063235335 * var9.anInt2213) {
                     var6.method361(var0, var1, var2, var9.anInt2213 * 1063235335);
                  }

               } else if(4 == var5) {
                  if(-100857069 * var9.anInt2212 == -1 && null == var9.anIntArray2206) {
                     var28 = var9.method2396(4, var4, var12, var13, var14, var15, -1375134675);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var14, (Animable)var28, (Animable)null, Class47.anIntArray632[var4], 0, 0, 0, var23, var24);
               } else if(5 == var5) {
                  var29 = 16;
                  var11 = var6.method452(var0, var1, var2);
                  if(0 != var11) {
                     var29 = Class45.method700(var11 >> 14 & 32767, 359750046).anInt2213 * 1063235335;
                  }

                  if(-1 == var9.anInt2212 * -100857069 && null == var9.anIntArray2206) {
                     var31 = var9.method2396(4, var4, var12, var13, var14, var15, 1083871377);
                  } else {
                     var31 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var14, (Animable)var31, (Animable)null, Class47.anIntArray632[var4], 0, Class47.anIntArray623[var4] * var29, Class47.anIntArray636[var4] * var29, var23, var24);
               } else if(var5 == 6) {
                  var29 = 8;
                  var11 = var6.method452(var0, var1, var2);
                  if(var11 != 0) {
                     var29 = Class45.method700(var11 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  if(-1 == -100857069 * var9.anInt2212 && var9.anIntArray2206 == null) {
                     var31 = var9.method2396(4, var4 + 4, var12, var13, var14, var15, 1120160338);
                  } else {
                     var31 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var14, (Animable)var31, (Animable)null, 256, var4, var29 * Class47.anIntArray640[var4], var29 * Class47.anIntArray637[var4], var23, var24);
               } else if(var5 == 7) {
                  var11 = 2 + var4 & 3;
                  if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                     var28 = var9.method2396(4, 4 + var11, var12, var13, var14, var15, 456929346);
                  } else {
                     var28 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var11, var0, var1, var2, var9.anInt2212 * -100857069, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var14, (Animable)var28, (Animable)null, 256, var11, 0, 0, var23, var24);
               } else if(8 == var5) {
                  var29 = 8;
                  var11 = var6.method452(var0, var1, var2);
                  if(var11 != 0) {
                     var29 = Class45.method700(var11 >> 14 & 32767, 359750046).anInt2213 * 1063235335 / 2;
                  }

                  int var20 = var4 + 2 & 3;
                  Object var30;
                  if(var9.anInt2212 * -100857069 == -1 && var9.anIntArray2206 == null) {
                     var31 = var9.method2396(4, 4 + var4, var12, var13, var14, var15, -1388587379);
                     var30 = var9.method2396(4, var20 + 4, var12, var13, var14, var15, 716868086);
                  } else {
                     var31 = new Class116_Sub23_Sub16_Sub6(var3, 4, var4 + 4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                     var30 = new Class116_Sub23_Sub16_Sub6(var3, 4, 4 + var20, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
                  }

                  var6.method354(var0, var1, var2, var14, (Animable)var31, (Animable)var30, 256, var4, Class47.anIntArray640[var4] * var29, var29 * Class47.anIntArray637[var4], var23, var24);
               }
            }
         } else {
            if(-1 == -100857069 * var9.anInt2212 && var9.anIntArray2206 == null) {
               var28 = var9.method2396(10, var4, var12, var13, var14, var15, 642791512);
            } else {
               var28 = new Class116_Sub23_Sub16_Sub6(var3, 10, var4, var0, var1, var2, -100857069 * var9.anInt2212, true, (Animable)null);
            }

            if(null != var28 && var6.method355(var0, var1, var2, var14, var10, var17, (Animable)var28, var5 == 11?256:0, var23, var24) && var9.aBool2220) {
               var11 = 15;
               if(var28 instanceof SpotAnim) {
                  var11 = ((SpotAnim)var28).method3375() / 4;
                  if(var11 > 30) {
                     var11 = 30;
                  }
               }

               for(var25 = 0; var25 <= var10; ++var25) {
                  for(int var21 = 0; var21 <= var17; ++var21) {
                     if(var11 > Class47.aByteArrayArrayArray627[var0][var25 + var1][var21 + var2]) {
                        Class47.aByteArrayArrayArray627[var0][var1 + var25][var2 + var21] = (byte)var11;
                     }
                  }
               }
            }

            if(0 != var9.actionCount * -1030255905 && var7 != null) {
               var7.method857(var1, var2, var10, var17, var9.walkable, 1483178392);
            }

         }
      }
   }

   public static final Class9 method1934(Class74 var0, Component var1, int var2, int var3, int var4) {
      if(0 == -954458055 * Class9.anInt135) {
         throw new IllegalStateException();
      } else if(var2 >= 0 && var2 < 2) {
         if(var3 < 256) {
            var3 = 256;
         }

         try {
            Class9_Sub2 var8 = new Class9_Sub2();
            var8.anIntArray138 = new int[(Class9.aBool144?2:1) * 256];
            var8.anInt143 = var3 * -256373011;
            var8.method153(var1);
            var8.anInt142 = ((var3 & -1024) + 1024) * 505031113;
            if(-105889671 * var8.anInt142 > 16384) {
               var8.anInt142 = -1972224000;
            }

            var8.method154(-105889671 * var8.anInt142);
            if(-2110982975 * Class9.anInt151 > 0 && Class9.aClass20_133 == null) {
               Class9.aClass20_133 = new Class20();
               Class9.aClass20_133.aClass74_257 = var0;
               var0.method1063(Class9.aClass20_133, Class9.anInt151 * -2110982975, -460427784);
            }

            if(null != Class9.aClass20_133) {
               if(Class9.aClass20_133.aClass9Array258[var2] != null) {
                  throw new IllegalArgumentException();
               }

               Class9.aClass20_133.aClass9Array258[var2] = var8;
            }

            return var8;
         } catch (Throwable var7) {
            try {
               Class9_Sub1 var5 = new Class9_Sub1(var0, var2);
               var5.anIntArray138 = new int[256 * (Class9.aBool144?2:1)];
               var5.anInt143 = -256373011 * var3;
               var5.method153(var1);
               var5.anInt142 = -1972224000;
               var5.method154(-105889671 * var5.anInt142);
               if(-2110982975 * Class9.anInt151 > 0 && null == Class9.aClass20_133) {
                  Class9.aClass20_133 = new Class20();
                  Class9.aClass20_133.aClass74_257 = var0;
                  var0.method1063(Class9.aClass20_133, -2110982975 * Class9.anInt151, 493210089);
               }

               if(Class9.aClass20_133 != null) {
                  if(null != Class9.aClass20_133.aClass9Array258[var2]) {
                     throw new IllegalArgumentException();
                  }

                  Class9.aClass20_133.aClass9Array258[var2] = var5;
               }

               return var5;
            } catch (Throwable var6) {
               return new Class9();
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static void method1935(boolean var0, int var1) {
      if(Class93.aClass71_1335 != null) {
         try {
            Buffer var2 = new Buffer(4);
            var2.writeByte(var0?2:3, -1569745357);
            var2.writeMedium(0, (byte)35);
            Class93.aClass71_1335.method1006(var2.payload, 0, 4, -508556464);
         } catch (IOException var5) {
            try {
               Class93.aClass71_1335.method1001(-940778318);
            } catch (Exception var4) {
               ;
            }

            Class93.anInt1354 += -1096754175;
            Class93.aClass71_1335 = null;
         }

      }
   }
}
