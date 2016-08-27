package com.jagex;

public class Class67 {

   static Sprite aClass116_Sub23_Sub19_Sub2_826;

   public static String method974(int var0, int var1, boolean var2, byte var3) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var6 = 2;

            for(int var7 = var0 / var1; 0 != var7; ++var6) {
               var7 /= var1;
            }

            char[] var5 = new char[var6];
            var5[0] = 43;

            for(int var4 = var6 - 1; var4 > 0; --var4) {
               int var9 = var0;
               var0 /= var1;
               int var8 = var9 - var0 * var1;
               if(var8 >= 10) {
                  var5[var4] = (char)(var8 + 87);
               } else {
                  var5[var4] = (char)(48 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   static final String method976(int var0, int var1, int var2) {
      int var3 = var1 - var0;
      return var3 < -9?Class59_Sub1.method1978(16711680, (byte)114):(var3 < -6?Class59_Sub1.method1978(16723968, (byte)36):(var3 < -3?Class59_Sub1.method1978(16740352, (byte)17):(var3 < 0?Class59_Sub1.method1978(16756736, (byte)30):(var3 > 9?Class59_Sub1.method1978('\uff00', (byte)118):(var3 > 6?Class59_Sub1.method1978(4259584, (byte)50):(var3 > 3?Class59_Sub1.method1978(8453888, (byte)43):(var3 > 0?Class59_Sub1.method1978(12648192, (byte)64):Class59_Sub1.method1978(16776960, (byte)106))))))));
   }

   Class67() throws Throwable {
      throw new Error();
   }

   public static void method977(int var0, int var1) {
      if(0 != Class128.anInt1574 * -1587772409) {
         Class128.anInt1579 = var0 * 827167249;
      } else {
         Class128.aClass116_Sub4_Sub4_1576.method2994(var0, 1321810339);
      }

   }

   static final int method978(int var0) {
      if(Class116_Sub5.aClass29_1727.aBool403) {
         return GameInterface.anInt1819 * -747958745;
      } else {
         int var5 = 3;
         if(Class78.anInt904 * 1162853107 < 310) {
            int var3 = 282154897 * Class116_Sub23_Sub16_Sub5.anInt2740 >> 7;
            int var2 = Class83.anInt968 * -324676025 >> 7;
            int var4 = 1272643751 * Class79.ourPlayer.anInt2609 >> 7;
            int var1 = -1801433343 * Class79.ourPlayer.anInt2579 >> 7;
            if(var3 < 0 || var2 < 0 || var3 >= 104 || var2 >= 104) {
               return GameInterface.anInt1819 * -747958745;
            }

            if((Class47.aByteArrayArrayArray634[GameInterface.anInt1819 * -747958745][var3][var2] & 4) != 0) {
               var5 = GameInterface.anInt1819 * -747958745;
            }

            int var6;
            if(var4 > var3) {
               var6 = var4 - var3;
            } else {
               var6 = var3 - var4;
            }

            int var7;
            if(var1 > var2) {
               var7 = var1 - var2;
            } else {
               var7 = var2 - var1;
            }

            int var8;
            int var9;
            if(var6 > var7) {
               var8 = 65536 * var7 / var6;
               var9 = '\u8000';

               while(var3 != var4) {
                  if(var3 < var4) {
                     ++var3;
                  } else if(var3 > var4) {
                     --var3;
                  }

                  if(0 != (Class47.aByteArrayArrayArray634[-747958745 * GameInterface.anInt1819][var3][var2] & 4)) {
                     var5 = -747958745 * GameInterface.anInt1819;
                  }

                  var9 += var8;
                  if(var9 >= 65536) {
                     var9 -= 65536;
                     if(var2 < var1) {
                        ++var2;
                     } else if(var2 > var1) {
                        --var2;
                     }

                     if((Class47.aByteArrayArrayArray634[GameInterface.anInt1819 * -747958745][var3][var2] & 4) != 0) {
                        var5 = -747958745 * GameInterface.anInt1819;
                     }
                  }
               }
            } else {
               var8 = 65536 * var6 / var7;
               var9 = '\u8000';

               while(var1 != var2) {
                  if(var2 < var1) {
                     ++var2;
                  } else if(var2 > var1) {
                     --var2;
                  }

                  if((Class47.aByteArrayArrayArray634[GameInterface.anInt1819 * -747958745][var3][var2] & 4) != 0) {
                     var5 = GameInterface.anInt1819 * -747958745;
                  }

                  var9 += var8;
                  if(var9 >= 65536) {
                     var9 -= 65536;
                     if(var3 < var4) {
                        ++var3;
                     } else if(var3 > var4) {
                        --var3;
                     }

                     if(0 != (Class47.aByteArrayArrayArray634[-747958745 * GameInterface.anInt1819][var3][var2] & 4)) {
                        var5 = -747958745 * GameInterface.anInt1819;
                     }
                  }
               }
            }
         }

         if(1272643751 * Class79.ourPlayer.anInt2609 >= 0 && -1801433343 * Class79.ourPlayer.anInt2579 >= 0 && 1272643751 * Class79.ourPlayer.anInt2609 < 13312 && -1801433343 * Class79.ourPlayer.anInt2579 < 13312) {
            if(0 != (Class47.aByteArrayArrayArray634[GameInterface.anInt1819 * -747958745][Class79.ourPlayer.anInt2609 * 1272643751 >> 7][Class79.ourPlayer.anInt2579 * -1801433343 >> 7] & 4)) {
               var5 = GameInterface.anInt1819 * -747958745;
            }

            return var5;
         } else {
            return -747958745 * GameInterface.anInt1819;
         }
      }
   }
}
