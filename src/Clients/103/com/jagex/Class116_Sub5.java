package com.jagex;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;

public class Class116_Sub5 extends Node {

   int[] anIntArray1723;
   int anInt1724;
   public static final int anInt1725 = 239;
   int[][] anIntArrayArray1726;
   static Class29 aClass29_1727;
   static final int anInt1728 = 3;
   static Class99_Sub1 aClass99_Sub1_1729;
   static final int anInt1730 = 1005;
   static final int anInt1731 = 38;
   int anInt1732;
   static final int anInt1733 = 1003;


   public static synchronized long method1929(int var0) {
      long var1 = System.currentTimeMillis();
      if(var1 < Class65.aLong815 * 3305107702197510133L) {
         Class65.aLong816 += (Class65.aLong815 * 3305107702197510133L - var1) * 1735610642068573953L;
      }

      Class65.aLong815 = var1 * 4035292801851102301L;
      return var1 + 2047833492640657665L * Class65.aLong816;
   }

   static boolean method1930(String var0, boolean var1, int var2) {
      if(null == var0) {
         return false;
      } else {
         String var3 = Class116_Sub23_Sub15.method2702(var0, Class59_Sub1.aClass143_1831, 1063727324);

         for(int var4 = 0; var4 < client.anInt3152 * -1616775607; ++var4) {
            if(var3.equalsIgnoreCase(Class116_Sub23_Sub15.method2702(client.aClass50Array3204[var4].aString670, Class59_Sub1.aClass143_1831, 807859882)) && (!var1 || client.aClass50Array3204[var4].anInt666 * -698428043 != 0)) {
               return true;
            }
         }

         if(var3.equalsIgnoreCase(Class116_Sub23_Sub15.method2702(Class79.aPlayer_909.username, Class59_Sub1.aClass143_1831, 1960625428))) {
            return true;
         } else {
            return false;
         }
      }
   }

   static void method1931(int var0) {
      client var1 = client.aclient2930;
      synchronized(var1) {
         Container var2 = client.aclient2930.method3583(-1727632827);
         if(var2 != null) {
            Class116_Sub23_Sub7.anInt2289 = Math.max(var2.getSize().width, Class145.anInt1650 * 2055757083) * -1411246095;
            Class25.anInt354 = Math.max(var2.getSize().height, PlayerAlias.anInt1758 * -1066486805) * 588847321;
            if(Class116_Sub23_Sub13.aFrame2425 == var2) {
               Insets var3 = Class116_Sub23_Sub13.aFrame2425.getInsets();
               Class116_Sub23_Sub7.anInt2289 -= -1411246095 * (var3.left + var3.right);
               Class25.anInt354 -= 588847321 * (var3.top + var3.bottom);
            }

            if(-1830553327 * Class116_Sub23_Sub7.anInt2289 <= 0) {
               Class116_Sub23_Sub7.anInt2289 = -1411246095;
            }

            if(2045896553 * Class25.anInt354 <= 0) {
               Class25.anInt354 = 588847321;
            }

            boolean var16 = !client.aBool3140;
            if(var16) {
               Class42.clientWidth = client.anInt3213 * 870030517;
               Class116_Sub16.clientHeight = client.anInt3149 * -796663565;
            } else {
               Class42.clientWidth = Math.min(Class116_Sub23_Sub7.anInt2289 * -1830553327, 7680) * -780223189;
               Class116_Sub16.clientHeight = Math.min(Class25.anInt354 * 2045896553, 2160) * 427958731;
            }

            client.anInt2925 = (-1830553327 * Class116_Sub23_Sub7.anInt2289 - Class42.clientWidth * -452716157) / 2 * 1792273077;
            client.anInt2920 = 0;
            Tile.aCanvas1875.setSize(Class42.clientWidth * -452716157, 674167779 * Class116_Sub16.clientHeight);
            int var4 = Class42.clientWidth * -452716157;
            int var5 = Class116_Sub16.clientHeight * 674167779;
            Canvas var6 = Tile.aCanvas1875;

            Object var8;
            try {
               DirectImageProducer var7 = new DirectImageProducer();
               var7.method337(var4, var5, var6, (byte)1);
               var8 = var7;
            } catch (Throwable var14) {
               RSImageProducer var9 = new RSImageProducer();
               var9.method337(var4, var5, var6, (byte)1);
               var8 = var9;
            }

            Class73.aAbstractRSDrawing_874 = (AbstractRSDrawing)var8;
            if(var2 == Class116_Sub23_Sub13.aFrame2425) {
               Insets var17 = Class116_Sub23_Sub13.aFrame2425.getInsets();
               Tile.aCanvas1875.setLocation(76231581 * client.anInt2925 + var17.left, var17.top + -225353991 * client.anInt2920);
            } else {
               Tile.aCanvas1875.setLocation(76231581 * client.anInt2925, client.anInt2920 * -225353991);
            }

            int var18 = Class42.clientWidth * -452716157;
            int var19 = Class116_Sub16.clientHeight * 674167779;
            if(Class116_Sub23_Sub7.anInt2289 * -1830553327 < var18) {
               var18 = -1830553327 * Class116_Sub23_Sub7.anInt2289;
            }

            if(Class25.anInt354 * 2045896553 < var19) {
               var19 = 2045896553 * Class25.anInt354;
            }

            if(aClass29_1727 != null) {
               try {
                  client var10 = client.aclient2930;
                  int var11 = client.aBool3140?2:1;
                  Class75.method1077(var10, "resize", new Object[]{Integer.valueOf(var11)}, 750625510);
               } catch (Throwable var13) {
                  ;
               }
            }

            if(-1 != client.anInt3200 * -1074177723) {
               Class116_Sub10.method1971(true, (byte)117);
            }

            Class116_Sub23_Sub1.method2356(1706561553);
         }
      }
   }

   Class116_Sub5(int var1, byte[] var2) {
      this.anInt1724 = -586867395 * var1;
      Buffer var4 = new Buffer(var2);
      this.anInt1732 = var4.readSignedByte(1708176767) * 1534158375;
      this.anIntArray1723 = new int[-1341412969 * this.anInt1732];
      this.anIntArrayArray1726 = new int[-1341412969 * this.anInt1732][];

      int var3;
      for(var3 = 0; var3 < this.anInt1732 * -1341412969; ++var3) {
         this.anIntArray1723[var3] = var4.readSignedByte(1708176767);
      }

      for(var3 = 0; var3 < -1341412969 * this.anInt1732; ++var3) {
         this.anIntArrayArray1726[var3] = new int[var4.readSignedByte(1708176767)];
      }

      for(var3 = 0; var3 < -1341412969 * this.anInt1732; ++var3) {
         for(int var5 = 0; var5 < this.anIntArrayArray1726[var3].length; ++var5) {
            this.anIntArrayArray1726[var3][var5] = var4.readSignedByte(1708176767);
         }
      }

   }

   public static int method1932(CharSequence var0, int var1, boolean var2, short var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var9 = false;
         boolean var5 = false;
         int var7 = 0;
         int var4 = var0.length();

         for(int var8 = 0; var8 < var4; ++var8) {
            char var6 = var0.charAt(var8);
            if(0 == var8) {
               if(45 == var6) {
                  var9 = true;
                  continue;
               }

               if(43 == var6 && var2) {
                  continue;
               }
            }

            int var11;
            if(var6 >= 48 && var6 <= 57) {
               var11 = var6 - 48;
            } else if(var6 >= 65 && var6 <= 90) {
               var11 = var6 - 55;
            } else {
               if(var6 < 97 || var6 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var6 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var9) {
               var11 = -var11;
            }

            int var10 = var11 + var1 * var7;
            if(var7 != var10 / var1) {
               throw new NumberFormatException();
            }

            var7 = var10;
            var5 = true;
         }

         if(!var5) {
            throw new NumberFormatException();
         } else {
            return var7;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }
}
