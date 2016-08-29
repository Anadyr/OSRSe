package com.jagex;
import java.awt.Component;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class9 {

   static Class20 aClass20_133;
   public static int anInt135;
   int anInt136 = -1530849888;
   Class116_Sub4[] aClass116_Sub4Array137 = new Class116_Sub4[8];
   int[] anIntArray138;
   Class116_Sub4 aClass116_Sub4_139;
   long aLong140 = 0L;
   long aLong141 = Class116_Sub5.method1929(1970418178) * 7521534040423978303L;
   int anInt142;
   int anInt143;
   public static boolean aBool144;
   long aLong145 = 0L;
   int anInt146 = 0;
   int anInt147 = 0;
   int anInt148 = 0;
   int anInt149 = 0;
   public static int anInt151;
   boolean aBool153 = true;
   int anInt154;
   Class116_Sub4[] aClass116_Sub4Array155 = new Class116_Sub4[8];


   void method144() throws Exception {}

   static long method145(byte var0) {
      try {
         URL var1 = new URL(Class45.method713("services", false, 987802399) + "m=accountappeal/login.ws");
         URLConnection var2 = var1.openConnection();
         var2.setRequestProperty("connection", "close");
         var2.setDoInput(true);
         var2.setDoOutput(true);
         var2.setConnectTimeout(5000);
         OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
         var3.write("data1=req");
         var3.flush();
         InputStream var4 = var2.getInputStream();
         Buffer var5 = new Buffer(new byte[1000]);

         do {
            int var6 = var4.read(var5.payload, var5.position * 314639891, 1000 - 314639891 * var5.position);
            if(-1 == var6) {
               var5.position = 0;
               long var7 = var5.readLong((byte) -33);
               return var7;
            }

            var5.position += var6 * -184175589;
         } while(var5.position * 314639891 < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   public final synchronized void method146(int var1) {
      if(null != this.anIntArray138) {
         long var2 = Class116_Sub5.method1929(682131189);

         try {
            if(this.aLong145 * 4278827202856281897L != 0L) {
               if(var2 < this.aLong145 * 4278827202856281897L) {
                  return;
               }

               this.method154(-105889671 * this.anInt142);
               this.aLong145 = 0L;
               this.aBool153 = true;
            }

            int var4 = this.method155();
            if(-391291481 * this.anInt148 - var4 > this.anInt146 * 2113248743) {
               this.anInt146 = -651549225 * (this.anInt148 * -391291481 - var4);
            }

            int var5 = this.anInt154 * 785401385 + this.anInt143 * -506822939;
            if(var5 + 256 > 16384) {
               var5 = 16128;
            }

            if(var5 + 256 > -105889671 * this.anInt142) {
               this.anInt142 += 1755784192;
               if(this.anInt142 * -105889671 > 16384) {
                  this.anInt142 = -1972224000;
               }

               this.method167();
               this.method154(this.anInt142 * -105889671);
               var4 = 0;
               this.aBool153 = true;
               if(256 + var5 > this.anInt142 * -105889671) {
                  var5 = -105889671 * this.anInt142 - 256;
                  this.anInt154 = (var5 - -506822939 * this.anInt143) * 646493721;
               }
            }

            while(var4 < var5) {
               this.method186(this.anIntArray138, 256);
               this.method156();
               var4 += 256;
            }

            if(var2 > -6011821581548601501L * this.aLong140) {
               if(!this.aBool153) {
                  if(0 == this.anInt146 * 2113248743 && this.anInt147 * 510705873 == 0) {
                     this.method167();
                     this.aLong145 = 6964159870914700569L * (2000L + var2);
                     return;
                  }

                  this.anInt154 = Math.min(510705873 * this.anInt147, 2113248743 * this.anInt146) * 646493721;
                  this.anInt147 = this.anInt146 * -216178377;
               } else {
                  this.aBool153 = false;
               }

               this.anInt146 = 0;
               this.aLong140 = (2000L + var2) * -7182784584313292213L;
            }

            this.anInt148 = var4 * -1354925545;
         } catch (Exception var7) {
            this.method167();
            this.aLong145 = 6964159870914700569L * (var2 + 2000L);
         }

         try {
            if(var2 > 500000L + 4023840563415325375L * this.aLong141) {
               var2 = this.aLong141 * 4023840563415325375L;
            }

            while(var2 > 5000L + 4023840563415325375L * this.aLong141) {
               this.method150(256, (byte)14);
               this.aLong141 += 7521534040423978303L * (long)(256000 / (-954458055 * anInt135));
            }
         } catch (Exception var6) {
            this.aLong141 = 7521534040423978303L * var2;
         }

      }
   }

   public final synchronized void method148(byte var1) {
      this.aBool153 = true;

      try {
         this.method144();
      } catch (Exception var3) {
         this.method167();
         this.aLong145 = (Class116_Sub5.method1929(833067196) + 2000L) * 6964159870914700569L;
      }

   }

   public final synchronized void method149(short var1) {
      if(null != aClass20_133) {
         boolean var3 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == aClass20_133.aClass9Array258[var2]) {
               aClass20_133.aClass9Array258[var2] = null;
            }

            if(aClass20_133.aClass9Array258[var2] != null) {
               var3 = false;
            }
         }

         if(var3) {
            aClass20_133.aBool259 = true;

            while(aClass20_133.aBool260) {
               Friend.method1836(50L);
            }

            aClass20_133 = null;
         }
      }

      this.method167();
      this.anIntArray138 = null;
   }

   final void method150(int var1, byte var2) {
      this.anInt149 -= var1 * 2075018355;
      if(-2139356997 * this.anInt149 < 0) {
         this.anInt149 = 0;
      }

      if(this.aClass116_Sub4_139 != null) {
         this.aClass116_Sub4_139.method1911(var1);
      }

   }

   final void method152(Class116_Sub4 var1, int var2, int var3) {
      int var4 = var2 >> 5;
      Class116_Sub4 var5 = this.aClass116_Sub4Array155[var4];
      if(var5 == null) {
         this.aClass116_Sub4Array137[var4] = var1;
      } else {
         var5.aClass116_Sub4_1720 = var1;
      }

      this.aClass116_Sub4Array155[var4] = var1;
      var1.anInt1721 = var2;
   }

   void method153(Component var1) throws Exception {}

   void method154(int var1) throws Exception {}

   int method155() throws Exception {
      return -105889671 * this.anInt142;
   }

   void method156() throws Exception {}

   public final synchronized void method158(Class116_Sub4 var1, int var2) {
      this.aClass116_Sub4_139 = var1;
   }

   public final void method163(byte var1) {
      this.aBool153 = true;
   }

   void method167() {}

   final void method186(int[] var1, int var2) {
      int var3 = var2;
      if(aBool144) {
         var3 = var2 << 1;
      }

      Class56.method823(var1, 0, var3);
      this.anInt149 -= var2 * 2075018355;
      if(this.aClass116_Sub4_139 != null && -2139356997 * this.anInt149 <= 0) {
         this.anInt149 += 2075018355 * (-954458055 * anInt135 >> 4);
         ISAAC.method804(this.aClass116_Sub4_139, 1493379808);
         this.method152(this.aClass116_Sub4_139, this.aClass116_Sub4_139.method1906(), 1415240538);
         int var9 = 0;
         int var7 = 255;

         int var10;
         Class116_Sub4 var12;
         label132:
         for(var10 = 7; var7 != 0; --var10) {
            int var8;
            int var11;
            if(var10 < 0) {
               var8 = var10 & 3;
               var11 = -(var10 >> 2);
            } else {
               var8 = var10;
               var11 = 0;
            }

            for(int var13 = var7 >>> var8 & 286331153; 0 != var13; var13 >>>= 4) {
               if((var13 & 1) != 0) {
                  var7 &= ~(1 << var8);
                  var12 = null;
                  Class116_Sub4 var5 = this.aClass116_Sub4Array137[var8];

                  while(null != var5) {
                     Class116_Sub2 var14 = var5.aClass116_Sub2_1719;
                     if(var14 != null && var14.anInt1669 > var11) {
                        var7 |= 1 << var8;
                        var12 = var5;
                        var5 = var5.aClass116_Sub4_1720;
                     } else {
                        var5.aBool1722 = true;
                        int var15 = var5.method1909();
                        var9 += var15;
                        if(null != var14) {
                           var14.anInt1669 += var15;
                        }

                        if(var9 >= 2067831589 * this.anInt136) {
                           break label132;
                        }

                        Class116_Sub4 var6 = var5.method1907();
                        if(null != var6) {
                           for(int var4 = var5.anInt1721; var6 != null; var6 = var5.method1913()) {
                              this.method152(var6, var4 * var6.method1906() >> 8, 1415240538);
                           }
                        }

                        Class116_Sub4 var16 = var5.aClass116_Sub4_1720;
                        var5.aClass116_Sub4_1720 = null;
                        if(var12 == null) {
                           this.aClass116_Sub4Array137[var8] = var16;
                        } else {
                           var12.aClass116_Sub4_1720 = var16;
                        }

                        if(var16 == null) {
                           this.aClass116_Sub4Array155[var8] = var12;
                        }

                        var5 = var16;
                     }
                  }
               }

               var8 += 4;
               ++var11;
            }
         }

         for(var10 = 0; var10 < 8; ++var10) {
            Class116_Sub4 var17 = this.aClass116_Sub4Array137[var10];
            Class116_Sub4[] var18 = this.aClass116_Sub4Array137;
            this.aClass116_Sub4Array155[var10] = null;

            for(var18[var10] = null; var17 != null; var17 = var12) {
               var12 = var17.aClass116_Sub4_1720;
               var17.aClass116_Sub4_1720 = null;
            }
         }
      }

      if(this.anInt149 * -2139356997 < 0) {
         this.anInt149 = 0;
      }

      if(this.aClass116_Sub4_139 != null) {
         this.aClass116_Sub4_139.method1919(var1, 0, var2);
      }

      this.aLong141 = Class116_Sub5.method1929(495499856) * 7521534040423978303L;
   }

   public static Class116_Sub23_Sub12 method193(int var0, byte var1) {
      Class116_Sub23_Sub12 var2 = (Class116_Sub23_Sub12)Class116_Sub23_Sub12.aClass123_2406.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub12.aClass99_2416.method1394(4, var0, 94600076);
         var2 = new Class116_Sub23_Sub12();
         if(var3 != null) {
            var2.method2641(new Buffer(var3), var0, 1411287245);
         }

         var2.method2645(1885470859);
         Class116_Sub23_Sub12.aClass123_2406.method1633(var2, (long)var0);
         return var2;
      }
   }

   static void method194(int var0, int var1, int var2, int var3, byte var4) {
      Class116_Sub15 var5 = AbstractRSDrawing.method339(var0, var1, -218126302);
      if(null != var5 && null != var5.anObjectArray1927) {
         Class116_Sub6 var6 = new Class116_Sub6();
         var6.aClass116_Sub15_1736 = var5;
         var6.anObjectArray1737 = var5.anObjectArray1927;
         Friend.method1840(var6, -2031366285);
      }

      client.anInt3090 = 461597295 * var3;
      client.aBool3088 = true;
      Class116_Sub23_Sub4.anInt2262 = var0 * -222991695;
      client.anInt3089 = 1188249893 * var1;
      Class38.anInt500 = -1648414847 * var2;
      Class79.method1097(var5, 1261856885);
   }
}
