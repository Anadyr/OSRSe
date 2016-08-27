package com.jagex;
import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;

public final class RSFIT {

   int anInt871 = 566364424;
   Class140 aClass140_872 = null;
   int anInt873;
   public static AbstractRSDrawing aAbstractRSDrawing_874;
   static byte[] tempBuffer = new byte[520];
   protected static Image anImage876;
   Class140 aClass140_878 = null;

   public byte[] getFile(int var1, int var2) {
      Class140 var3 = this.aClass140_878;
      synchronized(var3) {
         try {
            if(this.aClass140_872.method1778(-1341562487) < (long)(var1 * 6 + 6)) {
               return null;
            } else {
               this.aClass140_872.method1771((long)(var1 * 6));
               this.aClass140_872.method1762(tempBuffer, 0, 6, -1591890938);
               int length = (tempBuffer[2] & 255) + ((tempBuffer[1] & 255) << 8) + ((tempBuffer[0] & 255) << 16);
               int position = (tempBuffer[5] & 255) + ((tempBuffer[4] & 255) << 8) + ((tempBuffer[3] & 255) << 16);
               if(length < 0 || length > -1757028579 * this.anInt871) {
                  return null;
               } else if(position <= 0 || (long)position > this.aClass140_878.method1778(-1341562487) / 520L) {
                  return null;
               } else {
                  byte[] fileData = new byte[length];
                  int var7 = 0;

                  for(int var8 = 0; var7 < length; ++var8) {
                     if(0 == position) {
                        return null;
                     }

                     this.aClass140_878.method1771((long)(520 * position));
                     int var9 = length - var7;
                     if(var9 > 512) {
                        var9 = 512;
                     }

                     this.aClass140_878.method1762(tempBuffer, 0, 8 + var9, -971309976);
                     int currentFileId = (tempBuffer[1] & 255) + ((tempBuffer[0] & 255) << 8);
                     int currentFileOffset = (tempBuffer[3] & 255) + ((tempBuffer[2] & 255) << 8);
                     int currPosition = ((tempBuffer[5] & 255) << 8) + ((tempBuffer[4] & 255) << 16) + (tempBuffer[6] & 255);
                     int index = tempBuffer[7] & 255;
                     if(currentFileId != var1 || var8 != currentFileOffset || 1928833099 * this.anInt873 != index) {
                        return null;
                     }

                     if(currPosition < 0 || (long)currPosition > this.aClass140_878.method1778(-1341562487) / 520L) {
                        return null;
                     }

                     for(int var14 = 0; var14 < var9; ++var14) {
                        fileData[var7++] = tempBuffer[var14 + 8];
                     }

                     position = currPosition;
                  }

                  byte[] var10000 = fileData;
                  return var10000;
               }
            }
         } catch (IOException var16) {
            return null;
         }
      }
   }

   public boolean method1034(int var1, byte[] var2, int var3, int var4) {
      Class140 var5 = this.aClass140_878;
      synchronized(var5) {
         if(var3 >= 0 && var3 <= -1757028579 * this.anInt871) {
            boolean var6 = this.method1039(var1, var2, var3, true, -1714267866);
            if(!var6) {
               var6 = this.method1039(var1, var2, var3, false, -1961447740);
            }

            return var6;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   static final int method1035(int var0, int var1, int var2, int var3) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
      return var4;
   }

   public RSFIT(int var1, Class140 var2, Class140 var3, int maxSize) {
      this.anInt873 = -1410277021 * var1;
      this.aClass140_878 = var2;
      this.aClass140_872 = var3;
      this.anInt871 = 1952963381 * maxSize;
   }

   boolean method1039(int var1, byte[] var2, int var3, boolean var4, int var5) {
      Class140 var6 = this.aClass140_878;
      synchronized(var6) {
         boolean var10000;
         try {
            int var7;
            if(var4) {
               if(this.aClass140_872.method1778(-1341562487) < (long)(6 + var1 * 6)) {
                  return false;
               }

               this.aClass140_872.method1771((long)(6 * var1));
               this.aClass140_872.method1762(tempBuffer, 0, 6, -2098781539);
               var7 = (tempBuffer[5] & 255) + ((tempBuffer[4] & 255) << 8) + ((tempBuffer[3] & 255) << 16);
               if(var7 <= 0 || (long)var7 > this.aClass140_878.method1778(-1341562487) / 520L) {
                  return false;
               }
            } else {
               var7 = (int)((this.aClass140_878.method1778(-1341562487) + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            tempBuffer[0] = (byte)(var3 >> 16);
            tempBuffer[1] = (byte)(var3 >> 8);
            tempBuffer[2] = (byte)var3;
            tempBuffer[3] = (byte)(var7 >> 16);
            tempBuffer[4] = (byte)(var7 >> 8);
            tempBuffer[5] = (byte)var7;
            this.aClass140_872.method1771((long)(6 * var1));
            this.aClass140_872.method1764(tempBuffer, 0, 6, -244324746);
            int var8 = 0;

            for(int var9 = 0; var8 < var3; ++var9) {
               int var10 = 0;
               int var11;
               if(var4) {
                  this.aClass140_878.method1771((long)(520 * var7));

                  try {
                     this.aClass140_878.method1762(tempBuffer, 0, 8, -1508272313);
                  } catch (EOFException var15) {
                     break;
                  }

                  var11 = ((tempBuffer[0] & 255) << 8) + (tempBuffer[1] & 255);
                  int var12 = ((tempBuffer[2] & 255) << 8) + (tempBuffer[3] & 255);
                  var10 = (tempBuffer[6] & 255) + ((tempBuffer[4] & 255) << 16) + ((tempBuffer[5] & 255) << 8);
                  int var13 = tempBuffer[7] & 255;
                  if(var1 != var11 || var12 != var9 || this.anInt873 * 1928833099 != var13) {
                     return false;
                  }

                  if(var10 < 0 || (long)var10 > this.aClass140_878.method1778(-1341562487) / 520L) {
                     return false;
                  }
               }

               if(var10 == 0) {
                  var4 = false;
                  var10 = (int)((this.aClass140_878.method1778(-1341562487) + 519L) / 520L);
                  if(var10 == 0) {
                     ++var10;
                  }

                  if(var10 == var7) {
                     ++var10;
                  }
               }

               if(var3 - var8 <= 512) {
                  var10 = 0;
               }

               tempBuffer[0] = (byte)(var1 >> 8);
               tempBuffer[1] = (byte)var1;
               tempBuffer[2] = (byte)(var9 >> 8);
               tempBuffer[3] = (byte)var9;
               tempBuffer[4] = (byte)(var10 >> 16);
               tempBuffer[5] = (byte)(var10 >> 8);
               tempBuffer[6] = (byte)var10;
               tempBuffer[7] = (byte)(this.anInt873 * 1928833099);
               this.aClass140_878.method1771((long)(var7 * 520));
               this.aClass140_878.method1764(tempBuffer, 0, 8, -1259521350);
               var11 = var3 - var8;
               if(var11 > 512) {
                  var11 = 512;
               }

               this.aClass140_878.method1764(var2, var8, var11, -1647747013);
               var8 += var11;
               var7 = var10;
            }

            var10000 = true;
         } catch (IOException var16) {
            return false;
         }

         return var10000;
      }
   }

   public static Class116_Sub23_Sub19_Sub3 method1041(RSIndex var0, int var1, byte var2) {
      byte[] var3 = var0.method1356(var1, 2122418320);
      boolean var4;
      if(var3 != null) {
         Player.method3550(var3, (short) -7613);
         var4 = true;
      } else {
         var4 = false;
      }

      return !var4?null:Class40.method685((byte)114);
   }
}
