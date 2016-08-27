package com.jagex;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class RSInputStream implements Runnable {

   int anInt849 = 0;
   OutputStream anOutputStream850;
   SignLink signLink;
   InputStream anInputStream852;
   boolean aBool853 = false;
   SignlinkNode aClass72_854;
   java.net.Socket aSocket855;
   int anInt856 = 0;
   byte[] aByteArray857;
   boolean aBool858 = false;
   static short[] aShortArray859;

   public void sync(int var1) {
      if(!this.aBool853) {
         synchronized(this) {
            this.aBool853 = true;
            this.notifyAll();
         }

         if(null != this.aClass72_854) {
            while(this.aClass72_854.anInt866 == 0) {
               Friend.sleep(1L);
            }

            if(this.aClass72_854.anInt866 == 1) {
               try {
                  ((Thread)this.aClass72_854.anObject869).join();
               } catch (InterruptedException var4) {
                  ;
               }
            }
         }

         this.aClass72_854 = null;
      }
   }

   public int readableBytes(byte var1) throws IOException {
      return !this.aBool853?this.anInputStream852.available():0;
   }

   public void readBytes(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(!this.aBool853) {
         while(var3 > 0) {
            int var5 = this.anInputStream852.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
            var3 -= var5;
         }

      }
   }

   public void flush(byte[] buffer, int offset, int length, int var4) throws IOException {
      if(!this.aBool853) {
         if(this.aBool858) {
            this.aBool858 = false;
            throw new IOException();
         } else {
            if(this.aByteArray857 == null) {
               this.aByteArray857 = new byte[5000];
            }

            synchronized(this) {
               for(int var6 = 0; var6 < length; ++var6) {
                  this.aByteArray857[this.anInt849 * 823862379] = buffer[offset + var6];
                  this.anInt849 = (this.anInt849 * 823862379 + 1) % 5000 * -1278318525;
                  if(this.anInt849 * 823862379 == (4900 + this.anInt856 * -742805451) % 5000) {
                     throw new IOException();
                  }
               }

               if(this.aClass72_854 == null) {
                  this.aClass72_854 = this.signLink.method1063(this, 3, 1168261452);
               }

               this.notifyAll();
            }
         }
      }
   }

   public void run() {
      while(true) {
         try {
            label79: {
               int var3;
               int var4;
               synchronized(this) {
                  if(this.anInt856 * -742805451 == this.anInt849 * 823862379) {
                     if(this.aBool853) {
                        break label79;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var9) {
                        ;
                     }
                  }

                  var3 = -742805451 * this.anInt856;
                  if(823862379 * this.anInt849 >= -742805451 * this.anInt856) {
                     var4 = this.anInt849 * 823862379 - -742805451 * this.anInt856;
                  } else {
                     var4 = 5000 - this.anInt856 * -742805451;
                  }
               }

               if(var4 <= 0) {
                  continue;
               }

               try {
                  this.anOutputStream850.write(this.aByteArray857, var3, var4);
               } catch (IOException var8) {
                  this.aBool858 = true;
               }

               this.anInt856 = (var4 + this.anInt856 * -742805451) % 5000 * 1649418781;

               try {
                  if(this.anInt849 * 823862379 == -742805451 * this.anInt856) {
                     this.anOutputStream850.flush();
                  }
               } catch (IOException var7) {
                  this.aBool858 = true;
               }
               continue;
            }

            try {
               if(this.anInputStream852 != null) {
                  this.anInputStream852.close();
               }

               if(this.anOutputStream850 != null) {
                  this.anOutputStream850.close();
               }

               if(this.aSocket855 != null) {
                  this.aSocket855.close();
               }
            } catch (IOException var6) {
               ;
            }

            this.aByteArray857 = null;
         } catch (Exception var11) {
            Class90.method1192((String)null, var11, 343294798);
         }

         return;
      }
   }

   public int readByte(int var1) throws IOException {
      return !this.aBool853?this.anInputStream852.read():0;
   }

   public static GameType[] method1021(int var0) {
      return new GameType[]{GameType.aClass88_1033, GameType.aClass88_1032, GameType.aClass88_1030, GameType.aClass88_1029, GameType.aClass88_1031, GameType.aClass88_1034};
   }

   public RSInputStream(java.net.Socket socket, SignLink signLink) throws IOException {
      this.signLink = signLink;
      this.aSocket855 = socket;
      this.aSocket855.setSoTimeout(30000);
      this.aSocket855.setTcpNoDelay(true);
      this.aSocket855.setReceiveBufferSize(16384);
      this.aSocket855.setSendBufferSize(16384);
      this.anInputStream852 = this.aSocket855.getInputStream();
      this.anOutputStream850 = this.aSocket855.getOutputStream();
   }

   static final void method1031(int var0) {
      Class58.method886((byte)-14);
      if(null == Class116_Sub23_Sub1.aClass116_Sub15_2162) {
         if(client.aClass116_Sub15_3106 == null) {
            int var3 = 823601801 * Class85.anInt997;
            int var1;
            int var2;
            int var4;
            int var5;
            int var7;
            int var9;
            if(client.aBool3074) {
               if(1 != var3 && (PlayerAlias.aBool1756 || var3 != 4)) {
                  var2 = Class85.anInt991 * -453286219;
                  var4 = Class85.anInt992 * 103771565;
                  if(var2 < -1905311417 * Class8.anInt131 - 10 || var2 > 10 + -1905311417 * Class8.anInt131 + Class4.anInt50 * 1899383153 || var4 < Class116_Sub23_Sub6.anInt2286 * 1745388413 - 10 || var4 > 10 + Class4.anInt49 * 1426002097 + Class116_Sub23_Sub6.anInt2286 * 1745388413) {
                     client.aBool3074 = false;
                     Class116_Sub23_Sub2.method2385(-1905311417 * Class8.anInt131, 1745388413 * Class116_Sub23_Sub6.anInt2286, Class4.anInt50 * 1899383153, Class4.anInt49 * 1426002097, (short)12503);
                  }
               }

               if(var3 == 1 || !PlayerAlias.aBool1756 && 4 == var3) {
                  var2 = Class8.anInt131 * -1905311417;
                  var4 = 1745388413 * Class116_Sub23_Sub6.anInt2286;
                  var5 = 1899383153 * Class4.anInt50;
                  int var6 = -2040065729 * Class85.clickAreaX;
                  int var8 = 2090526775 * Class85.clickAreaY;
                  var7 = -1;

                  for(var1 = 0; var1 < client.anInt3075 * 1768430155; ++var1) {
                     var9 = 15 * (client.anInt3075 * 1768430155 - 1 - var1) + var4 + 31;
                     if(var6 > var2 && var6 < var2 + var5 && var8 > var9 - 13 && var8 < 3 + var9) {
                        var7 = var1;
                     }
                  }

                  if(var7 != -1) {
                     KeyFocusListener.method1128(var7, 697653192);
                  }

                  client.aBool3074 = false;
                  Class116_Sub23_Sub2.method2385(Class8.anInt131 * -1905311417, Class116_Sub23_Sub6.anInt2286 * 1745388413, Class4.anInt50 * 1899383153, 1426002097 * Class4.anInt49, (short)15871);
               }
            } else {
               if((1 == var3 || !PlayerAlias.aBool1756 && 4 == var3) && client.anInt3075 * 1768430155 > 0) {
                  var2 = client.anIntArray3037[client.anInt3075 * 1768430155 - 1];
                  if(var2 == 39 || var2 == 40 || var2 == 41 || var2 == 42 || 43 == var2 || var2 == 33 || 34 == var2 || var2 == 35 || 36 == var2 || var2 == 37 || 38 == var2 || 1005 == var2) {
                     label250: {
                        var4 = client.anIntArray3076[1768430155 * client.anInt3075 - 1];
                        var5 = client.anIntArray2932[1768430155 * client.anInt3075 - 1];
                        RSInterface var10 = Class107.getInterface(var5, 314639891);
                        var7 = Class35.method645(var10, (byte)0);
                        boolean var11 = 0 != (var7 >> 28 & 1);
                        if(!var11) {
                           Class96 var10000 = (Class96)null;
                           if(!Class69.method990(Class35.method645(var10, (byte)0), (byte)-60)) {
                              break label250;
                           }
                        }

                        if(null != Class116_Sub23_Sub1.aClass116_Sub15_2162 && !client.aBool3053 && client.anInt3110 * 1052316233 != 1 && !Class47.method758(1768430155 * client.anInt3075 - 1, 1489152586) && client.anInt3075 * 1768430155 > 0) {
                           var1 = client.anInt3092 * -827759387;
                           var9 = client.anInt3051 * 45845103;
                           Class116_Sub16.method2303(CacheIndex.aClass4_1911, var1, var9, (byte)-61);
                           CacheIndex.aClass4_1911 = null;
                        }

                        client.aBool3053 = false;
                        client.anInt3040 = 0;
                        if(null != Class116_Sub23_Sub1.aClass116_Sub15_2162) {
                           Class79.refreshInterface(Class116_Sub23_Sub1.aClass116_Sub15_2162, 581475300);
                        }

                        Class116_Sub23_Sub1.aClass116_Sub15_2162 = Class107.getInterface(var5, 314639891);
                        client.anInt3049 = 1355732049 * var4;
                        client.anInt3092 = -744800429 * Class85.clickAreaX;
                        client.anInt3051 = Class85.clickAreaY * -1619983687;
                        if(client.anInt3075 * 1768430155 > 0) {
                           var1 = 1768430155 * client.anInt3075 - 1;
                           CacheIndex.aClass4_1911 = new Class4();
                           CacheIndex.aClass4_1911.anInt51 = -615722007 * client.anIntArray3076[var1];
                           CacheIndex.aClass4_1911.anInt46 = client.anIntArray2932[var1] * 607560247;
                           CacheIndex.aClass4_1911.anInt47 = client.anIntArray3037[var1] * -859373123;
                           CacheIndex.aClass4_1911.anInt45 = client.anIntArray3079[var1] * -558864427;
                           CacheIndex.aClass4_1911.aString48 = client.aStringArray3080[var1];
                        }

                        Class79.refreshInterface(Class116_Sub23_Sub1.aClass116_Sub15_2162, 102350358);
                        return;
                     }
                  }
               }

               if((var3 == 1 || !PlayerAlias.aBool1756 && var3 == 4) && (1 == client.anInt3110 * 1052316233 && client.anInt3075 * 1768430155 > 2 || Class47.method758(client.anInt3075 * 1768430155 - 1, 308051855))) {
                  var3 = 2;
               }

               if((1 == var3 || !PlayerAlias.aBool1756 && 4 == var3) && 1768430155 * client.anInt3075 > 0) {
                  KeyFocusListener.method1128(client.anInt3075 * 1768430155 - 1, 314495494);
               }

               if(2 == var3 && 1768430155 * client.anInt3075 > 0) {
                  BasicTimer.method2218(Class85.clickAreaX * -2040065729, 2090526775 * Class85.clickAreaY, -2101275829);
               }
            }

         }
      }
   }

   protected void finalize() {
      this.sync(1234533530);
   }
}
