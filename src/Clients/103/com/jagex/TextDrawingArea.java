package com.jagex;
import java.util.Random;

public abstract class TextDrawingArea extends DrawingArea {

   static int anInt2853 = -1;
   byte[][] aByteArrayArray2854 = new byte[256][];
   int[] anIntArray2855;
   byte[] aByteArray2856;
   int[] anIntArray2857;
   int[] anIntArray2858;
   public int anInt2859 = 0;
   int anInt2860;
   int[] anIntArray2861;
   public static Class116_Sub23_Sub19_Sub3[] aClass116_Sub23_Sub19_Sub3Array2862;
   static Random aRandom2863 = new Random();
   static int anInt2864 = -1;
   static int anInt2865 = -1;
   static int anInt2866 = -1;
   int[] anIntArray2867;
   static int anInt2868 = 0;
   static int anInt2869 = 0;
   static int anInt2870 = 256;
   static int anInt2871 = 0;
   static int anInt2872 = 0;
   int anInt2873;
   static String[] aStringArray2874 = new String[100];


   public void method3450(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3501(var4, var5);
         int[] var8 = new int[var1.length()];

         for(int var7 = 0; var7 < var1.length(); ++var7) {
            var8[var7] = (int)(Math.sin((double)var7 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3472(var1, var2 - this.method3455(var1) / 2, var3, (int[])null, var8);
      }
   }

   void method3452(byte[] var1) {
      this.anIntArray2861 = new int[256];
      int var3;
      if(var1.length == 257) {
         for(var3 = 0; var3 < this.anIntArray2861.length; ++var3) {
            this.anIntArray2861[var3] = var1[var3] & 255;
         }

         this.anInt2859 = var1[256] & 255;
      } else {
         var3 = 0;

         for(int var5 = 0; var5 < 256; ++var5) {
            this.anIntArray2861[var5] = var1[var3++] & 255;
         }

         int[] var12 = new int[256];
         int[] var9 = new int[256];

         int var2;
         for(var2 = 0; var2 < 256; ++var2) {
            var12[var2] = var1[var3++] & 255;
         }

         for(var2 = 0; var2 < 256; ++var2) {
            var9[var2] = var1[var3++] & 255;
         }

         byte[][] var10 = new byte[256][];

         int var6;
         for(int var8 = 0; var8 < 256; ++var8) {
            var10[var8] = new byte[var12[var8]];
            byte var4 = 0;

            for(var6 = 0; var6 < var10[var8].length; ++var6) {
               var4 += var1[var3++];
               var10[var8][var6] = var4;
            }
         }

         byte[][] var14 = new byte[256][];

         int var11;
         for(var11 = 0; var11 < 256; ++var11) {
            var14[var11] = new byte[var12[var11]];
            byte var13 = 0;

            for(int var7 = 0; var7 < var14[var11].length; ++var7) {
               var13 += var1[var3++];
               var14[var11][var7] = var13;
            }
         }

         this.aByteArray2856 = new byte[65536];

         for(var11 = 0; var11 < 256; ++var11) {
            if(var11 != 32 && var11 != 160) {
               for(var6 = 0; var6 < 256; ++var6) {
                  if(var6 != 32 && var6 != 160) {
                     this.aByteArray2856[(var11 << 8) + var6] = (byte)method3511(var10, var14, var9, this.anIntArray2861, var12, var11, var6);
                  }
               }
            }
         }

         this.anInt2859 = var9[32] + var12[32];
      }

   }

   public void method3454(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3501(var4, var5);
         aRandom2863.setSeed((long)var6);
         anInt2870 = 192 + (aRandom2863.nextInt() & 31);
         int[] var9 = new int[var1.length()];
         int var8 = 0;

         for(int var7 = 0; var7 < var1.length(); ++var7) {
            var9[var7] = var8;
            if((aRandom2863.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method3472(var1, var2, var3, var9, (int[])null);
      }
   }

   public int method3455(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              String var8 = var7.substring(4);
                              int var9 = Class116_Sub5.method1932(var8, 10, true, (short)1000);
                              var4 += aClass116_Sub23_Sub19_Sub3Array2862[var9].anInt2767;
                              var3 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.anIntArray2861[(char)(Ignore.cipherChar(var6, -543467890) & 255)];
                  if(this.aByteArray2856 != null && var3 != -1) {
                     var4 += this.aByteArray2856[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   int method3456(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method3485('<');
                     if(this.aByteArray2856 != null && var11 != -1) {
                        var4 += this.aByteArray2856[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method3485('>');
                     if(this.aByteArray2856 != null && var11 != -1) {
                        var4 += this.aByteArray2856[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        String var17 = var16.substring(4);
                        int var18 = Class116_Sub5.method1932(var17, 10, true, (short)1000);
                        var4 += aClass116_Sub23_Sub19_Sub3Array2862[var18].anInt2767;
                        var11 = 0;
                     } catch (Exception var20) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method3485(var15);
                     if(this.aByteArray2856 != null && var11 != -1) {
                        var4 += this.aByteArray2856[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var21 = var6.toString();
         if(var21.length() > var5) {
            var3[var12++] = var21.substring(var5, var21.length());
         }

         return var12;
      }
   }

   public int method3457(String var1, int var2) {
      int var3 = this.method3456(var1, new int[]{var2}, aStringArray2874);
      int var5 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var6 = this.method3455(aStringArray2874[var4]);
         if(var6 > var5) {
            var5 = var6;
         }
      }

      return var5;
   }

   public int method3458(String var1, int var2) {
      return this.method3456(var1, new int[]{var2}, aStringArray2874);
   }

   public static String method3459(String var0) {
      int var1 = var0.length();
      int var3 = 0;

      for(int var2 = 0; var2 < var1; ++var2) {
         char var4 = var0.charAt(var2);
         if(var4 == 60 || var4 == 62) {
            var3 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var3);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public void method3461(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3501(var4, var5);
         this.method3471(var1, var2 - this.method3455(var1), var3);
      }
   }

   public void method3465(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method3501(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var9 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var9[var8] = (int)(Math.sin((double)var8 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method3472(var1, var2 - this.method3455(var1) / 2, var3, var7, var9);
      }
   }

   public void method3466(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method3501(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method3472(var1, var2 - this.method3455(var1) / 2, var3, (int[])null, var10);
      }
   }

   void method3471(String var1, int var2, int var3) {
      var3 -= this.anInt2859;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(Ignore.cipherChar(var1.charAt(var6), -543467890) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var10;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              String var15 = var8.substring(4);
                              var10 = Class116_Sub5.method1932(var15, 10, true, (short)1000);
                              Class116_Sub23_Sub19_Sub3 var12 = aClass116_Sub23_Sub19_Sub3Array2862[var10];
                              var12.method3359(var2, var3 + this.anInt2859 - var12.anInt2768);
                              var2 += var12.anInt2767;
                              var5 = -1;
                           } catch (Exception var13) {
                              ;
                           }
                        } else {
                           this.method3503(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 160) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.aByteArray2856 != null && var5 != -1) {
                     var2 += this.aByteArray2856[(var5 << 8) + var7];
                  }

                  int var14 = this.anIntArray2855[var7];
                  var10 = this.anIntArray2867[var7];
                  if(var7 != 32) {
                     if(anInt2870 == 256) {
                        if(anInt2865 != -1) {
                           method3474(this.aByteArrayArray2854[var7], var2 + this.anIntArray2857[var7] + 1, var3 + this.anIntArray2858[var7] + 1, var14, var10, anInt2865);
                        }

                        this.method3535(this.aByteArrayArray2854[var7], var2 + this.anIntArray2857[var7], var3 + this.anIntArray2858[var7], var14, var10, anInt2869);
                     } else {
                        if(anInt2865 != -1) {
                           method3476(this.aByteArrayArray2854[var7], var2 + this.anIntArray2857[var7] + 1, var3 + this.anIntArray2858[var7] + 1, var14, var10, anInt2865, anInt2870);
                        }

                        this.method3530(this.aByteArrayArray2854[var7], var2 + this.anIntArray2857[var7], var3 + this.anIntArray2858[var7], var14, var10, anInt2869, anInt2870);
                     }
                  } else if(anInt2871 > 0) {
                     anInt2872 += anInt2871;
                     var2 += anInt2872 >> 8;
                     anInt2872 &= 255;
                  }

                  int var9 = this.anIntArray2861[var7];
                  if(anInt2864 != -1) {
                     method2942(var2, var3 + (int)((double)this.anInt2859 * 0.7D), var9, anInt2864);
                  }

                  if(anInt2853 != -1) {
                     method2942(var2, var3 + this.anInt2859 + 1, var9, anInt2853);
                  }

                  var2 += var9;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method3472(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.anInt2859;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(Ignore.cipherChar(var1.charAt(var9), -543467890) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var15;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              String var20 = var11.substring(4);
                              var15 = Class116_Sub5.method1932(var20, 10, true, (short)1000);
                              Class116_Sub23_Sub19_Sub3 var17 = aClass116_Sub23_Sub19_Sub3Array2862[var15];
                              var17.method3359(var2 + var12, var3 + this.anInt2859 - var17.anInt2768 + var13);
                              var2 += var17.anInt2767;
                              var7 = -1;
                           } catch (Exception var18) {
                              ;
                           }
                        } else {
                           this.method3503(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.aByteArray2856 != null && var7 != -1) {
                     var2 += this.aByteArray2856[(var7 << 8) + var10];
                  }

                  int var19 = this.anIntArray2855[var10];
                  var12 = this.anIntArray2867[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var15 = var5[var8];
                  } else {
                     var15 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(anInt2870 == 256) {
                        if(anInt2865 != -1) {
                           method3474(this.aByteArrayArray2854[var10], var2 + this.anIntArray2857[var10] + 1 + var13, var3 + this.anIntArray2858[var10] + 1 + var15, var19, var12, anInt2865);
                        }

                        this.method3535(this.aByteArrayArray2854[var10], var2 + this.anIntArray2857[var10] + var13, var3 + this.anIntArray2858[var10] + var15, var19, var12, anInt2869);
                     } else {
                        if(anInt2865 != -1) {
                           method3476(this.aByteArrayArray2854[var10], var2 + this.anIntArray2857[var10] + 1 + var13, var3 + this.anIntArray2858[var10] + 1 + var15, var19, var12, anInt2865, anInt2870);
                        }

                        this.method3530(this.aByteArrayArray2854[var10], var2 + this.anIntArray2857[var10] + var13, var3 + this.anIntArray2858[var10] + var15, var19, var12, anInt2869, anInt2870);
                     }
                  } else if(anInt2871 > 0) {
                     anInt2872 += anInt2871;
                     var2 += anInt2872 >> 8;
                     anInt2872 &= 255;
                  }

                  int var14 = this.anIntArray2861[var10];
                  if(anInt2864 != -1) {
                     method2942(var2, var3 + (int)((double)this.anInt2859 * 0.7D), var14, anInt2864);
                  }

                  if(anInt2853 != -1) {
                     method2942(var2, var3 + this.anInt2859, var14, anInt2853);
                  }

                  var2 += var14;
                  var7 = var10;
               }
            }
         }
      }

   }

   TextDrawingArea(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.anIntArray2857 = var2;
      this.anIntArray2858 = var3;
      this.anIntArray2855 = var4;
      this.anIntArray2867 = var5;
      this.method3452(var1);
      this.aByteArrayArray2854 = var7;
      int var9 = Integer.MAX_VALUE;
      int var10 = Integer.MIN_VALUE;

      for(int var8 = 0; var8 < 256; ++var8) {
         if(this.anIntArray2858[var8] < var9 && this.anIntArray2867[var8] != 0) {
            var9 = this.anIntArray2858[var8];
         }

         if(this.anIntArray2858[var8] + this.anIntArray2867[var8] > var10) {
            var10 = this.anIntArray2858[var8] + this.anIntArray2867[var8];
         }
      }

      this.anInt2860 = this.anInt2859 - var9;
      this.anInt2873 = var10 - this.anInt2859;
   }

   static void method3474(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * width;
      int var10 = width - var3;
      int var7 = 0;
      int var9 = 0;
      int var8;
      if(var2 < topY) {
         var8 = topY - var2;
         var4 -= var8;
         var2 = topY;
         var9 += var8 * var3;
         var6 += var8 * width;
      }

      if(var2 + var4 > bottomY) {
         var4 -= var2 + var4 - bottomY;
      }

      if(var1 < topX) {
         var8 = topX - var1;
         var3 -= var8;
         var1 = topX;
         var9 += var8;
         var6 += var8;
         var7 += var8;
         var10 += var8;
      }

      if(var1 + var3 > bottomX) {
         var8 = var1 + var3 - bottomX;
         var3 -= var8;
         var7 += var8;
         var10 += var8;
      }

      if(var3 > 0 && var4 > 0) {
         method3525(rasterPixels, var0, var5, var9, var6, var3, var4, var10, var7);
      }
   }

   static void method3476(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * width;
      int var9 = width - var3;
      int var11 = 0;
      int var10 = 0;
      int var8;
      if(var2 < topY) {
         var8 = topY - var2;
         var4 -= var8;
         var2 = topY;
         var10 += var8 * var3;
         var7 += var8 * width;
      }

      if(var2 + var4 > bottomY) {
         var4 -= var2 + var4 - bottomY;
      }

      if(var1 < topX) {
         var8 = topX - var1;
         var3 -= var8;
         var1 = topX;
         var10 += var8;
         var7 += var8;
         var11 += var8;
         var9 += var8;
      }

      if(var1 + var3 > bottomX) {
         var8 = var1 + var3 - bottomX;
         var3 -= var8;
         var11 += var8;
         var9 += var8;
      }

      if(var3 > 0 && var4 > 0) {
         method3477(rasterPixels, var0, var5, var10, var7, var3, var4, var9, var11, var6);
      }
   }

   static void method3477(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            if(var1[var3++] != 0) {
               int var11 = var0[var4];
               var0[var4++] = (((var11 & 16711935) * var9 & -16711936) + ((var11 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void method3481(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3501(var4, var5);
         this.method3471(var1, var2, var3);
      }
   }

   int method3485(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.anIntArray2861[Ignore.cipherChar(var1, -543467890) & 255];
   }

   public void method3492(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method3501(var4, var5);
         this.method3471(var1, var2 - this.method3455(var1) / 2, var3);
      }
   }

   void method3493(String var1, int var2) {
      int var3 = 0;
      boolean var6 = false;

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         char var5 = var1.charAt(var4);
         if(var5 == 60) {
            var6 = true;
         } else if(var5 == 62) {
            var6 = false;
         } else if(!var6 && var5 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         anInt2871 = (var2 - this.method3455(var1) << 8) / var3;
      }

   }

   void method3501(int var1, int var2) {
      anInt2864 = -1;
      anInt2853 = -1;
      anInt2866 = var2;
      anInt2865 = var2;
      anInt2868 = var1;
      anInt2869 = var1;
      anInt2870 = 256;
      anInt2871 = 0;
      anInt2872 = 0;
   }

   void method3503(String var1) {
      try {
         String var2;
         int var3;
         if(var1.startsWith("col=")) {
            var2 = var1.substring(4);
            var3 = Class116_Sub5.method1932(var2, 16, true, (short)1000);
            anInt2869 = var3;
         } else if(var1.equals("/col")) {
            anInt2869 = anInt2868;
         } else if(var1.startsWith("str=")) {
            var2 = var1.substring(4);
            var3 = Class116_Sub5.method1932(var2, 16, true, (short)1000);
            anInt2864 = var3;
         } else if(var1.equals("str")) {
            anInt2864 = 8388608;
         } else if(var1.equals("/str")) {
            anInt2864 = -1;
         } else if(var1.startsWith("u=")) {
            var2 = var1.substring(2);
            var3 = Class116_Sub5.method1932(var2, 16, true, (short)1000);
            anInt2853 = var3;
         } else if(var1.equals("u")) {
            anInt2853 = 0;
         } else if(var1.equals("/u")) {
            anInt2853 = -1;
         } else if(var1.startsWith("shad=")) {
            var2 = var1.substring(5);
            var3 = Class116_Sub5.method1932(var2, 16, true, (short)1000);
            anInt2865 = var3;
         } else if(var1.equals("shad")) {
            anInt2865 = 0;
         } else if(var1.equals("/shad")) {
            anInt2865 = anInt2866;
         } else if(var1.equals("br")) {
            this.method3501(anInt2868, anInt2866);
         }
      } catch (Exception var4) {
         ;
      }

   }

   TextDrawingArea(byte[] var1) {
      this.method3452(var1);
   }

   static int method3511(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var16 = var7 + var4[var5];
      int var10 = var2[var6];
      int var18 = var10 + var4[var6];
      int var8 = var7;
      if(var10 > var7) {
         var8 = var10;
      }

      int var17 = var16;
      if(var18 < var16) {
         var17 = var18;
      }

      int var19 = var3[var5];
      if(var3[var6] < var19) {
         var19 = var3[var6];
      }

      byte[] var11 = var1[var5];
      byte[] var13 = var0[var6];
      int var12 = var8 - var7;
      int var14 = var8 - var10;

      for(int var9 = var8; var9 < var17; ++var9) {
         int var15 = var11[var12++] + var13[var14++];
         if(var15 < var19) {
            var19 = var15;
         }
      }

      return -var19;
   }


   static void method3525(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var11 = -var6; var11 < 0; ++var11) {
         int var10;
         for(var10 = var9; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   abstract void method3530(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void method3535(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   public int method3537(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method3501(var6, var7);
         if(var10 == 0) {
            var10 = this.anInt2859;
         }

         int[] var14 = new int[]{var4};
         if(var5 < this.anInt2860 + this.anInt2873 + var10 && var5 < var10 + var10) {
            var14 = null;
         }

         int var12 = this.method3456(var1, var14, aStringArray2874);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var11;
         int var13;
         if(var9 == 0) {
            var13 = var3 + this.anInt2860;
         } else if(var9 == 1) {
            var13 = var3 + this.anInt2860 + (var5 - this.anInt2860 - this.anInt2873 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.anInt2873 - (var12 - 1) * var10;
         } else {
            var11 = (var5 - this.anInt2860 - this.anInt2873 - (var12 - 1) * var10) / (var12 + 1);
            if(var11 < 0) {
               var11 = 0;
            }

            var13 = var3 + this.anInt2860 + var11;
            var10 += var11;
         }

         for(var11 = 0; var11 < var12; ++var11) {
            if(var8 == 0) {
               this.method3471(aStringArray2874[var11], var2, var13);
            } else if(var8 == 1) {
               this.method3471(aStringArray2874[var11], var2 + (var4 - this.method3455(aStringArray2874[var11])) / 2, var13);
            } else if(var8 == 2) {
               this.method3471(aStringArray2874[var11], var2 + var4 - this.method3455(aStringArray2874[var11]), var13);
            } else if(var11 == var12 - 1) {
               this.method3471(aStringArray2874[var11], var2, var13);
            } else {
               this.method3493(aStringArray2874[var11], var4);
               this.method3471(aStringArray2874[var11], var2, var13);
               anInt2871 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }
}
