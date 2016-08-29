package com.jagex;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class116_Sub23_Sub1 extends NodeContainer {

   public static final int anInt2155 = 2;
   public static Class99 aClass99_2156;
   public int anInt2157 = 1973532945;
   static Class123 aClass123_2158 = new Class123(30);
   int anInt2159;
   int anInt2160;
   static Class123 aClass123_2161 = new Class123(64);
   static Class116_Sub15 aClass116_Sub15_2162;
   int anInt2163 = 0;
   short[] aShortArray2164;
   short[] aShortArray2165;
   int anInt2166 = 2071703936;
   short[] aShortArray2167;
   int anInt2168 = 0;
   int anInt2169 = 0;
   short[] aShortArray2170;
   int anInt2172 = -1396281216;
   public static Class99 aClass99_2174;

   void method2342(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(0 == var3) {
            return;
         }

         this.method2346(var1, var3, 1964208803);
      }
   }

   public final SpotAnim method2344(int var1, int var2) {
      SpotAnim var3 = (SpotAnim)aClass123_2158.method1632((long)(this.anInt2159 * 189082171));
      if(null == var3) {
         Model var4 = Model.method3114(aClass99_2156, this.anInt2160 * 1407877429, 0);
         if(null == var4) {
            return null;
         }

         int var5;
         if(this.aShortArray2170 != null) {
            for(var5 = 0; var5 < this.aShortArray2170.length; ++var5) {
               var4.method3125(this.aShortArray2170[var5], this.aShortArray2167[var5]);
            }
         }

         if(this.aShortArray2164 != null) {
            for(var5 = 0; var5 < this.aShortArray2164.length; ++var5) {
               var4.method3126(this.aShortArray2164[var5], this.aShortArray2165[var5]);
            }
         }

         var3 = var4.method3133(64 + -1189221219 * this.anInt2169, 850 + 443559011 * this.anInt2163, -30, -50, -30);
         aClass123_2158.method1633(var3, (long)(this.anInt2159 * 189082171));
      }

      SpotAnim var6;
      if(this.anInt2157 * -521951217 != -1 && -1 != var1) {
         var6 = Class116_Sub8.method1946(this.anInt2157 * -521951217, -34560206).method2444(var3, var1, 486744472);
      } else {
         var6 = var3.method3371(true);
      }

      if(2013938251 * this.anInt2166 != 128 || -742344927 * this.anInt2172 != 128) {
         var6.method3384(2013938251 * this.anInt2166, this.anInt2172 * -742344927, this.anInt2166 * 2013938251);
      }

      if(this.anInt2168 * -41252113 != 0) {
         if(-41252113 * this.anInt2168 == 90) {
            var6.method3402();
         }

         if(180 == this.anInt2168 * -41252113) {
            var6.method3402();
            var6.method3402();
         }

         if(this.anInt2168 * -41252113 == 270) {
            var6.method3402();
            var6.method3402();
            var6.method3402();
         }
      }

      return var6;
   }

   void method2346(Buffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt2160 = var1.readShort(831485460) * -2057139939;
      } else if(var2 == 2) {
         this.anInt2157 = var1.readShort(-205103059) * -1973532945;
      } else if(4 == var2) {
         this.anInt2166 = var1.readShort(389634248) * -1359546525;
      } else if(var2 == 5) {
         this.anInt2172 = var1.readShort(639498483) * 895061217;
      } else if(6 != var2) {
         if(var2 == 7) {
            this.anInt2169 = var1.readSignedByte(1708176767) * 59767221;
         } else if(8 == var2) {
            this.anInt2163 = var1.readSignedByte(1708176767) * 1217115467;
         } else {
            int var4;
            int var5;
            if(40 == var2) {
               var5 = var1.readSignedByte(1708176767);
               this.aShortArray2170 = new short[var5];
               this.aShortArray2167 = new short[var5];

               for(var4 = 0; var4 < var5; ++var4) {
                  this.aShortArray2170[var4] = (short)var1.readShort(476252632);
                  this.aShortArray2167[var4] = (short)var1.readShort(1650111450);
               }
            } else if(var2 == 41) {
               var5 = var1.readSignedByte(1708176767);
               this.aShortArray2164 = new short[var5];
               this.aShortArray2165 = new short[var5];

               for(var4 = 0; var4 < var5; ++var4) {
                  this.aShortArray2164[var4] = (short)var1.readShort(849218795);
                  this.aShortArray2165[var4] = (short)var1.readShort(1985930070);
               }
            }
         }
      } else {
         this.anInt2168 = var1.readShort(1539792688) * 1160504335;
      }

   }

   public static Class116_Sub23_Sub1 method2347(int var0) {
      Class116_Sub23_Sub1 var1 = (Class116_Sub23_Sub1)aClass123_2161.method1632((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = aClass99_2174.method1394(13, var0, 1102344109);
         var1 = new Class116_Sub23_Sub1();
         var1.anInt2159 = var0 * -892199181;
         if(null != var2) {
            var1.method2342(new Buffer(var2), 16488948);
         }

         aClass123_2161.method1633(var1, (long)var0);
         return var1;
      }
   }

   static void appendChat(int type, String username, String msg, String iconFunc, int d) {
      Class5 var5 = (Class5)Class37.aMap498.get(Integer.valueOf(type));
      if(var5 == null) {
         var5 = new Class5();
         Class37.aMap498.put(Integer.valueOf(type), var5);
      }

      ChatMessage var6 = var5.method51(type, username, msg, iconFunc, (byte)97);
      Class37.aClass124_492.putUniqueId(var6, (long) (-1699577047 * var6.anInt2342));
      Class37.aClass125_491.method1652(var6);
      client.anInt3024 = 1175697367 * client.anInt3118;
   }

   static void method2356(int var0) {
      int var1 = client.anInt2925 * 76231581;
      int var2 = client.anInt2920 * -225353991;
      int var3 = -1830553327 * Class116_Sub23_Sub7.anInt2289 - -452716157 * Class42.clientWidth - var1;
      int var4 = 2045896553 * Class25.anInt354 - 674167779 * Class116_Sub16.clientHeight - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = client.aclient2930.method3583(-1679725495);
            int var6 = 0;
            int var7 = 0;
            if(var5 == Class116_Sub23_Sub13.aFrame2425) {
               Insets var8 = Class116_Sub23_Sub13.aFrame2425.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, Class25.anInt354 * 2045896553);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, -1830553327 * Class116_Sub23_Sub7.anInt2289, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + Class116_Sub23_Sub7.anInt2289 * -1830553327 - var3, var7, var3, Class25.anInt354 * 2045896553);
            }

            if(var4 > 0) {
               var10.fillRect(var6, Class25.anInt354 * 2045896553 + var7 - var4, Class116_Sub23_Sub7.anInt2289 * -1830553327, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }
}
