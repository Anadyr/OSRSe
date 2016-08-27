package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public final class Class51 {

   static int anInt682;


   static String method780(int var0, short var1) {
      return "<img=" + var0 + ">";
   }

   Class51() throws Throwable {
      throw new Error();
   }

   static void method782(int var0) {
      Class6.username = Class6.username.trim();
      if(Class6.username.length() == 0) {
         Class7.method110(Class91.aString1289, Class91.aString1290, Class91.aString1291, 1935975903);
      } else {
         long var1 = Class9.method145((byte)-76);
         byte var3;
         if(0L == var1) {
            var3 = 5;
         } else {
            String var4 = Class6.username;
            Random var5 = new Random();
            Packet var6 = new Packet(128);
            Packet var7 = new Packet(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.writeByte(10, -161709991);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt(), (byte)26);
            }

            var6.writeInt(var8[0], (byte)41);
            var6.writeInt(var8[1], (byte)20);
            var6.method1994(var1);
            var6.method1994(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt(), (byte)12);
            }

            var6.applyRSA(Class26.aBigInteger361, Class26.aBigInteger362, (byte) 65);
            var7.writeByte(10, -1465205960);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.writeInt(var5.nextInt(), (byte)122);
            }

            var7.method1994(var5.nextLong());
            var7.method1993(var5.nextLong());
            byte[] var25 = new byte[24];

            try {
               Class86.aClass140_1010.method1771(0L);
               Class86.aClass140_1010.method1765(var25, 1498463408);

               int var10;
               for(var10 = 0; var10 < 24 && 0 == var25[var10]; ++var10) {
                  ;
               }

               if(var10 >= 24) {
                  throw new IOException();
               }
            } catch (Exception var23) {
               for(int var11 = 0; var11 < 24; ++var11) {
                  var25[var11] = -1;
               }
            }

            var7.method2110(var25, 0, 24, 512611054);
            var7.method1994(var5.nextLong());
            var7.applyRSA(Class26.aBigInteger361, Class26.aBigInteger362, (byte) 31);
            var9 = Class22.calculateJGString(var4, -1317507612);
            if(var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Packet var24 = new Packet(var9);
            var24.writeJGString(var4, -798526760);
            var24.position = var9 * -184175589;
            var24.method2020(var8, (byte)-30);
            Packet var26 = new Packet(var6.position * 314639891 + 5 + 314639891 * var7.position + var24.position * 314639891);
            var26.writeByte(2, -2084825668);
            var26.writeByte(var6.position * 314639891, -74434376);
            var26.method2110(var6.payload, 0, var6.position * 314639891, 512611054);
            var26.writeByte(314639891 * var7.position, -2109406189);
            var26.method2110(var7.payload, 0, var7.position * 314639891, 512611054);
            var26.writeShort(var24.position * 314639891, -2113824436);
            var26.method2110(var24.payload, 0, var24.position * 314639891, 512611054);
            String var12 = Entity.method3103(var26.payload, 1237578535);

            byte var18;
            try {
               URL var13 = new URL(Class45.method713("services", false, -574327206) + "m=accountappeal/login.ws");
               URLConnection var14 = var13.openConnection();
               var14.setDoInput(true);
               var14.setDoOutput(true);
               var14.setConnectTimeout(5000);
               OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
               var15.write("data2=" + Class69.method984(var12, (byte)12) + "&dest=" + Class69.method984("passwordchoice.ws", (byte)-22));
               var15.flush();
               InputStream var16 = var14.getInputStream();
               var26 = new Packet(new byte[1000]);

               while(true) {
                  int var17 = var16.read(var26.payload, 314639891 * var26.position, 1000 - var26.position * 314639891);
                  if(-1 == var17) {
                     var15.close();
                     var16.close();
                     String var27 = new String(var26.payload);
                     if(var27.startsWith("OFFLINE")) {
                        var18 = 4;
                     } else if(var27.startsWith("WRONG")) {
                        var18 = 7;
                     } else if(var27.startsWith("RELOAD")) {
                        var18 = 3;
                     } else if(var27.startsWith("Not permitted for social network accounts.")) {
                        var18 = 6;
                     } else {
                        var26.method2021(var8, 565274594);

                        while(var26.position * 314639891 > 0 && var26.payload[var26.position * 314639891 - 1] == 0) {
                           var26.position -= -184175589;
                        }

                        var27 = new String(var26.payload, 0, 314639891 * var26.position);
                        boolean var19;
                        if(null == var27) {
                           var19 = false;
                        } else {
                           label81: {
                              try {
                                 new URL(var27);
                              } catch (MalformedURLException var21) {
                                 var19 = false;
                                 break label81;
                              }

                              var19 = true;
                           }
                        }

                        if(var19) {
                           Friend.method1839(var27, true, "openjs", false, (byte) -36);
                           var18 = 2;
                        } else {
                           var18 = 5;
                        }
                     }
                     break;
                  }

                  var26.position += -184175589 * var17;
                  if(314639891 * var26.position >= 1000) {
                     var18 = 5;
                     break;
                  }
               }
            } catch (Throwable var22) {
               var22.printStackTrace();
               var18 = 5;
            }

            var3 = var18;
         }

         switch(var3) {
         case 2:
            Class7.method110(Class91.aString1292, Class91.aString1293, Class91.aString1294, 1935975903);
            Class6.anInt64 = -1303002726;
            break;
         case 3:
            Class7.method110(Class91.aString1295, Class91.aString1296, Class91.aString1162, 1935975903);
            break;
         case 4:
            Class7.method110(Class91.aString1217, Class91.aString1299, Class91.aString1105, 1935975903);
            break;
         case 5:
            Class7.method110(Class91.aString1301, Class91.aString1093, Class91.aString1303, 1935975903);
            break;
         case 6:
            Class7.method110(Class91.aString1071, Class91.aString1305, Class91.aString1260, 1935975903);
            break;
         case 7:
            Class7.method110(Class91.aString1307, Class91.aString1308, Class91.aString1309, 1935975903);
         }

      }
   }

   public static Class62[] method783(int var0) {
      return new Class62[]{Class62.aClass62_802, Class62.aClass62_797, Class62.aClass62_796};
   }

   static final void method784(Class116_Sub12 var0, int var1) {
      int var2 = 0;
      int var4 = -1;
      int var6 = 0;
      int var5 = 0;
      if(-1976125003 * var0.anInt1838 == 0) {
         var2 = GameInterface.region.method452(584375567 * var0.anInt1837, -1096801001 * var0.anInt1835, -127960105 * var0.anInt1847);
      }

      if(1 == -1976125003 * var0.anInt1838) {
         var2 = GameInterface.region.method372(584375567 * var0.anInt1837, var0.anInt1835 * -1096801001, var0.anInt1847 * -127960105);
      }

      if(2 == -1976125003 * var0.anInt1838) {
         var2 = GameInterface.region.getTileContents(584375567 * var0.anInt1837, var0.anInt1835 * -1096801001, -127960105 * var0.anInt1847);
      }

      if(-1976125003 * var0.anInt1838 == 3) {
         var2 = GameInterface.region.method374(584375567 * var0.anInt1837, var0.anInt1835 * -1096801001, var0.anInt1847 * -127960105);
      }

      if(var2 != 0) {
         int var3 = GameInterface.region.getTileContentsType(var0.anInt1837 * 584375567, var0.anInt1835 * -1096801001, var0.anInt1847 * -127960105, var2);
         var4 = var2 >> 14 & 32767;
         var6 = var3 & 31;
         var5 = var3 >> 6 & 3;
      }

      var0.anInt1839 = var4 * 561554519;
      var0.anInt1848 = var6 * 1198251989;
      var0.anInt1841 = -880682117 * var5;
   }
}
