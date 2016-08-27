package com.jagex;

public final class Class66 {

   static Class57 aClass57_819 = new Class57();

   public static int doBzipDecompression(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class57 var5 = aClass57_819;
      synchronized(var5) {
         aClass57_819.aByteArray722 = var2;
         aClass57_819.anInt738 = var4 * -1227292875;
         aClass57_819.aByteArray718 = var0;
         aClass57_819.anInt734 = 0;
         aClass57_819.anInt730 = var1 * -1267751543;
         aClass57_819.anInt721 = 0;
         aClass57_819.anInt731 = 0;
         aClass57_819.anInt727 = 0;
         aClass57_819.anInt728 = 0;
         unpackBZip(aClass57_819);
         var1 -= aClass57_819.anInt730 * 30302393;
         aClass57_819.aByteArray722 = null;
         aClass57_819.aByteArray718 = null;
         return var1;
      }
   }

   static void method944(Class57 var0) {
      byte var1 = var0.aByte729;
      int var2 = var0.anInt754 * -1718017815;
      int var3 = var0.anInt724 * 65994825;
      int var4 = var0.anInt736 * -1516697305;
      int[] var5 = Class106.anIntArray1447;
      int var6 = var0.anInt732 * 1254255873;
      byte[] var10 = var0.aByteArray718;
      int var11 = var0.anInt734 * -41744017;
      int var7 = var0.anInt730 * 30302393;
      int var9 = var0.anInt753 * -18095537 + 1;

      label116:
      while(true) {
         if(var2 > 0) {
            while(true) {
               if(var7 == 0) {
                  break label116;
               }

               if(var2 == 1) {
                  if(var7 == 0) {
                     var2 = 1;
                     break label116;
                  }

                  var10[var11] = var1;
                  ++var11;
                  --var7;
                  break;
               }

               var10[var11] = var1;
               --var2;
               ++var11;
               --var7;
            }
         }

         boolean var13 = true;

         byte var12;
         while(var13) {
            var13 = false;
            if(var3 == var9) {
               var2 = 0;
               break label116;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            var12 = (byte)(var6 & 255);
            var6 >>= 8;
            ++var3;
            if(var12 != var4) {
               var4 = var12;
               if(var7 == 0) {
                  var2 = 1;
                  break label116;
               }

               var10[var11] = var1;
               ++var11;
               --var7;
               var13 = true;
            } else if(var3 == var9) {
               if(var7 == 0) {
                  var2 = 1;
                  break label116;
               }

               var10[var11] = var1;
               ++var11;
               --var7;
               var13 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         var12 = (byte)(var6 & 255);
         var6 >>= 8;
         ++var3;
         if(var3 != var9) {
            if(var12 != var4) {
               var4 = var12;
            } else {
               var2 = 3;
               var6 = var5[var6];
               var12 = (byte)(var6 & 255);
               var6 >>= 8;
               ++var3;
               if(var3 != var9) {
                  if(var12 != var4) {
                     var4 = var12;
                  } else {
                     var6 = var5[var6];
                     var12 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                     var2 = (var12 & 255) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                  }
               }
            }
         }
      }

      int var14 = var0.anInt728 * -1561403323;
      var0.anInt728 += (var7 - var7) * -1666370931;
      if(var0.anInt728 * -1561403323 < var14) {
         ;
      }

      var0.aByte729 = var1;
      var0.anInt754 = var2 * -617236647;
      var0.anInt724 = var3 * 186970617;
      var0.anInt736 = var4 * 761517719;
      Class106.anIntArray1447 = var5;
      var0.anInt732 = var6 * 1655083777;
      var0.aByteArray718 = var10;
      var0.anInt734 = var11 * 1549956495;
      var0.anInt730 = var7 * -1267751543;
   }

   static void unpackBZip(Class57 var0) {
      boolean var1 = false;
      boolean var30 = false;
      boolean var3 = false;
      boolean var29 = false;
      boolean var5 = false;
      boolean var31 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var6 = false;
      boolean var18 = false;
      boolean var11 = false;
      boolean var2 = false;
      boolean var4 = false;
      boolean var10 = false;
      boolean var12 = false;
      boolean var16 = false;
      boolean var14 = false;
      boolean var13 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var17 = null;
      int[] var15 = null;
      var0.anInt733 = 959267293;
      if(Class106.anIntArray1447 == null) {
         Class106.anIntArray1447 = new int[var0.anInt733 * -1332132064];
      }

      boolean var23 = true;

      while(var23) {
         byte var9 = method946(var0);
         if(var9 == 23) {
            return;
         }

         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method946(var0);
         var9 = method957(var0);
         if(var9 != 0) {
            ;
         }

         var0.anInt744 = 0;
         var9 = method946(var0);
         var0.anInt744 = (var0.anInt744 * -831286639 << 8 | var9 & 255) * -1293783439;
         var9 = method946(var0);
         var0.anInt744 = (var0.anInt744 * -831286639 << 8 | var9 & 255) * -1293783439;
         var9 = method946(var0);
         var0.anInt744 = (var0.anInt744 * -831286639 << 8 | var9 & 255) * -1293783439;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var9 = method957(var0);
            if(var9 == 1) {
               var0.aBoolArray742[var35] = true;
            } else {
               var0.aBoolArray742[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.aBoolArray726[var35] = false;
         }

         int var55;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.aBoolArray742[var35]) {
               for(var55 = 0; var55 < 16; ++var55) {
                  var9 = method957(var0);
                  if(var9 == 1) {
                     var0.aBoolArray726[var35 * 16 + var55] = true;
                  }
               }
            }
         }

         method949(var0);
         int var54 = var0.anInt740 * -1672980685 + 2;
         int var39 = method948(3, var0);
         int var56 = method948(15, var0);
         var35 = 0;

         while(var35 < var56) {
            var55 = 0;

            while(true) {
               var9 = method957(var0);
               if(var9 == 0) {
                  var0.aByteArray747[var35] = (byte)var55;
                  ++var35;
                  break;
               }

               ++var55;
            }
         }

         byte[] var21 = new byte[6];

         byte var22;
         for(var22 = 0; var22 < var39; var21[var22] = var22++) {
            ;
         }

         for(var35 = 0; var35 < var56; ++var35) {
            var22 = var0.aByteArray747[var35];

            byte var27;
            for(var27 = var21[var22]; var22 > 0; --var22) {
               var21[var22] = var21[var22 - 1];
            }

            var21[0] = var27;
            var0.aByteArray746[var35] = var27;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var44 = method948(5, var0);
            var35 = 0;

            while(var35 < var54) {
               while(true) {
                  var9 = method957(var0);
                  if(var9 == 0) {
                     var0.aByteArrayArray748[var37][var35] = (byte)var44;
                     ++var35;
                     break;
                  }

                  var9 = method957(var0);
                  if(var9 == 0) {
                     ++var44;
                  } else {
                     --var44;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var26 = 32;
            byte var32 = 0;

            for(var35 = 0; var35 < var54; ++var35) {
               if(var0.aByteArrayArray748[var37][var35] > var32) {
                  var32 = var0.aByteArrayArray748[var37][var35];
               }

               if(var0.aByteArrayArray748[var37][var35] < var26) {
                  var26 = var0.aByteArrayArray748[var37][var35];
               }
            }

            method950(var0.anIntArrayArray749[var37], var0.anIntArrayArray750[var37], var0.anIntArrayArray751[var37], var0.aByteArrayArray748[var37], var26, var32, var54);
            var0.anIntArray752[var37] = var26;
         }

         int var41 = var0.anInt740 * -1672980685 + 1;
         int var43 = -1;
         byte var40 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.anIntArray737[var35] = 0;
         }

         int var52 = 4095;

         int var51;
         int var53;
         for(var51 = 15; var51 >= 0; --var51) {
            for(var53 = 15; var53 >= 0; --var53) {
               var0.aByteArray741[var52] = (byte)(var51 * 16 + var53);
               --var52;
            }

            var0.anIntArray745[var51] = var52 + 1;
         }

         int var45 = 0;
         byte var47;
         if(var40 == 0) {
            ++var43;
            var40 = 50;
            var47 = var0.aByteArray746[var43];
            var19 = var0.anIntArray752[var47];
            var20 = var0.anIntArrayArray749[var47];
            var15 = var0.anIntArrayArray751[var47];
            var17 = var0.anIntArrayArray750[var47];
         }

         int var42 = var40 - 1;
         int var46 = var19;

         byte var48;
         int var49;
         for(var49 = method948(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
            ++var46;
            var48 = method957(var0);
         }

         int var50 = var15[var49 - var17[var46]];

         while(var50 != var41) {
            if(var50 != 0 && var50 != 1) {
               int var24 = var50 - 1;
               int var33;
               if(var24 < 16) {
                  var33 = var0.anIntArray745[0];

                  for(var9 = var0.aByteArray741[var33 + var24]; var24 > 3; var24 -= 4) {
                     int var28 = var33 + var24;
                     var0.aByteArray741[var28] = var0.aByteArray741[var28 - 1];
                     var0.aByteArray741[var28 - 1] = var0.aByteArray741[var28 - 2];
                     var0.aByteArray741[var28 - 2] = var0.aByteArray741[var28 - 3];
                     var0.aByteArray741[var28 - 3] = var0.aByteArray741[var28 - 4];
                  }

                  while(var24 > 0) {
                     var0.aByteArray741[var33 + var24] = var0.aByteArray741[var33 + var24 - 1];
                     --var24;
                  }

                  var0.aByteArray741[var33] = var9;
               } else {
                  int var25 = var24 / 16;
                  int var34 = var24 % 16;
                  var33 = var0.anIntArray745[var25] + var34;

                  for(var9 = var0.aByteArray741[var33]; var33 > var0.anIntArray745[var25]; --var33) {
                     var0.aByteArray741[var33] = var0.aByteArray741[var33 - 1];
                  }

                  ++var0.anIntArray745[var25];

                  while(var25 > 0) {
                     --var0.anIntArray745[var25];
                     var0.aByteArray741[var0.anIntArray745[var25]] = var0.aByteArray741[var0.anIntArray745[var25 - 1] + 16 - 1];
                     --var25;
                  }

                  --var0.anIntArray745[0];
                  var0.aByteArray741[var0.anIntArray745[0]] = var9;
                  if(var0.anIntArray745[0] == 0) {
                     var52 = 4095;

                     for(var51 = 15; var51 >= 0; --var51) {
                        for(var53 = 15; var53 >= 0; --var53) {
                           var0.aByteArray741[var52] = var0.aByteArray741[var0.anIntArray745[var51] + var53];
                           --var52;
                        }

                        var0.anIntArray745[var51] = var52 + 1;
                     }
                  }
               }

               ++var0.anIntArray737[var0.aByteArray743[var9 & 255] & 255];
               Class106.anIntArray1447[var45] = var0.aByteArray743[var9 & 255] & 255;
               ++var45;
               if(var42 == 0) {
                  ++var43;
                  var42 = 50;
                  var47 = var0.aByteArray746[var43];
                  var19 = var0.anIntArray752[var47];
                  var20 = var0.anIntArrayArray749[var47];
                  var15 = var0.anIntArrayArray751[var47];
                  var17 = var0.anIntArrayArray750[var47];
               }

               --var42;
               var46 = var19;

               for(var49 = method948(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
                  ++var46;
                  var48 = method957(var0);
               }

               var50 = var15[var49 - var17[var46]];
            } else {
               int var36 = -1;
               int var38 = 1;

               do {
                  if(var50 == 0) {
                     var36 += 1 * var38;
                  } else if(var50 == 1) {
                     var36 += 2 * var38;
                  }

                  var38 *= 2;
                  if(var42 == 0) {
                     ++var43;
                     var42 = 50;
                     var47 = var0.aByteArray746[var43];
                     var19 = var0.anIntArray752[var47];
                     var20 = var0.anIntArrayArray749[var47];
                     var15 = var0.anIntArrayArray751[var47];
                     var17 = var0.anIntArrayArray750[var47];
                  }

                  --var42;
                  var46 = var19;

                  for(var49 = method948(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
                     ++var46;
                     var48 = method957(var0);
                  }

                  var50 = var15[var49 - var17[var46]];
               } while(var50 == 0 || var50 == 1);

               ++var36;
               var9 = var0.aByteArray743[var0.aByteArray741[var0.anIntArray745[0]] & 255];

               for(var0.anIntArray737[var9 & 255] += var36; var36 > 0; --var36) {
                  Class106.anIntArray1447[var45] = var9 & 255;
                  ++var45;
               }
            }
         }

         var0.anInt754 = 0;
         var0.aByte729 = 0;
         var0.anIntArray739[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray739[var35] = var0.anIntArray737[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray739[var35] += var0.anIntArray739[var35 - 1];
         }

         for(var35 = 0; var35 < var45; ++var35) {
            var9 = (byte)(Class106.anIntArray1447[var35] & 255);
            Class106.anIntArray1447[var0.anIntArray739[var9 & 255]] |= var35 << 8;
            ++var0.anIntArray739[var9 & 255];
         }

         var0.anInt732 = (Class106.anIntArray1447[var0.anInt744 * -831286639] >> 8) * 1655083777;
         var0.anInt724 = 0;
         var0.anInt732 = Class106.anIntArray1447[var0.anInt732 * 1254255873] * 1655083777;
         var0.anInt736 = (byte)(var0.anInt732 * 1254255873 & 255) * 761517719;
         var0.anInt732 = (var0.anInt732 * 1254255873 >> 8) * 1655083777;
         var0.anInt724 += 186970617;
         var0.anInt753 = var45 * -1276906321;
         method944(var0);
         if(var0.anInt724 * 65994825 == var0.anInt753 * -18095537 + 1 && var0.anInt754 * -1718017815 == 0) {
            var23 = true;
         } else {
            var23 = false;
         }
      }

   }

   static byte method946(Class57 var0) {
      return (byte)method948(8, var0);
   }

   static int method948(int var0, Class57 var1) {
      while(var1.anInt721 * -729094229 < var0) {
         var1.anInt731 = (var1.anInt731 * 296567033 << 8 | var1.aByteArray722[var1.anInt738 * 1779342109] & 255) * 947093833;
         var1.anInt721 += -729360360;
         var1.anInt738 += -1227292875;
         var1.anInt727 += 1204376179;
         if(var1.anInt727 * -1976786245 == 0) {
            ;
         }
      }

      int var2 = var1.anInt731 * 296567033 >> var1.anInt721 * -729094229 - var0 & (1 << var0) - 1;
      var1.anInt721 -= var0 * 445700867;
      return var2;
   }

   static void method949(Class57 var0) {
      var0.anInt740 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.aBoolArray726[var1]) {
            var0.aByteArray743[var0.anInt740 * -1672980685] = (byte)var1;
            var0.anInt740 += -1138787333;
         }
      }

   }

   static void method950(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var9;
      for(var9 = var4; var9 <= var5; ++var9) {
         for(int var8 = 0; var8 < var6; ++var8) {
            if(var3[var8] == var9) {
               var2[var7] = var8;
               ++var7;
            }
         }
      }

      for(var9 = 0; var9 < 23; ++var9) {
         var1[var9] = 0;
      }

      for(var9 = 0; var9 < var6; ++var9) {
         ++var1[var3[var9] + 1];
      }

      for(var9 = 1; var9 < 23; ++var9) {
         var1[var9] += var1[var9 - 1];
      }

      for(var9 = 0; var9 < 23; ++var9) {
         var0[var9] = 0;
      }

      int var10 = 0;

      for(var9 = var4; var9 <= var5; ++var9) {
         var10 += var1[var9 + 1] - var1[var9];
         var0[var9] = var10 - 1;
         var10 <<= 1;
      }

      for(var9 = var4 + 1; var9 <= var5; ++var9) {
         var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
      }

   }

   static byte method957(Class57 var0) {
      return (byte)method948(1, var0);
   }

   Class66() throws Throwable {
      throw new Error();
   }

}
