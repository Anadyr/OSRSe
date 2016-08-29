package com.jagex;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class AbstractRSDrawing {

   public int anInt264;
   public int[] anIntArray265;
   int anInt266;
   public Image finalImage;

   public abstract void method325(Graphics var1, int var2, int var3, int var4, int var5, short var6);

   public final void method326(byte var1) {
      DrawingArea.initToDrawArea(this.anIntArray265, this.anInt264 * 1154763343, this.anInt266 * -1725941875);
   }

   static final void method328(Player var0, int var1, int var2, int var3, int var4) {
      if(Class79.aPlayer_909 != var0) {
         if(client.anInt3075 * 1768430155 < 400) {
            String var6;
            if(var0.anInt2886 * -1553063231 == 0) {
               var6 = var0.aStringArray2884[0] + var0.username + var0.aStringArray2884[1] + Class67.method976(1614853309 * var0.anInt2908, Class79.aPlayer_909.anInt2908 * 1614853309, 1527013665) + " " + Class41.aString540 + Class91.aString1203 + 1614853309 * var0.anInt2908 + Class41.aString543 + var0.aStringArray2884[2];
            } else {
               var6 = var0.aStringArray2884[0] + var0.username + var0.aStringArray2884[1] + " " + Class41.aString540 + Class91.aString1193 + -1553063231 * var0.anInt2886 + Class41.aString543 + var0.aStringArray2884[2];
            }

            int var7;
            if(client.anInt2991 * -1110581093 == 1) {
               Class50.method776(Class91.aString1197, client.aString3201 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16777215, (byte)19) + var6, 14, var1, var2, var3, (byte)-83);
            } else if(client.aBool3088) {
               if(8 == (2016481409 * Class38.anInt500 & 8)) {
                  Class50.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16777215, (byte)105) + var6, 15, var1, var2, var3, (byte)-46);
               }
            } else {
               for(var7 = 7; var7 >= 0; --var7) {
                  if(client.aStringArray3062[var7] != null) {
                     short var5 = 0;
                     if(client.aStringArray3062[var7].equalsIgnoreCase(Class91.aString1316)) {
                        if(client.aClass43_3138 == Class43.aClass43_577) {
                           continue;
                        }

                        if(client.aClass43_3138 == Class43.aClass43_576 || client.aClass43_3138 == Class43.aClass43_581 && 1614853309 * var0.anInt2908 > 1614853309 * Class79.aPlayer_909.anInt2908) {
                           var5 = 2000;
                        }

                        if(-103629189 * Class79.aPlayer_909.anInt2899 != 0 && 0 != var0.anInt2899 * -103629189) {
                           if(var0.anInt2899 * -103629189 == Class79.aPlayer_909.anInt2899 * -103629189) {
                              var5 = 2000;
                           } else {
                              var5 = 0;
                           }
                        }
                     } else if(client.aBoolArray3063[var7]) {
                        var5 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = client.anIntArray3061[var7] + var5;
                     Class50.method776(client.aStringArray3062[var7], Class59_Sub1.method1978(16777215, (byte)8) + var6, var9, var1, var2, var3, (byte)-61);
                  }
               }
            }

            for(var7 = 0; var7 < 1768430155 * client.anInt3075; ++var7) {
               if(client.anIntArray3037[var7] == 23) {
                  client.aStringArray3184[var7] = Class59_Sub1.method1978(16777215, (byte)98) + var6;
                  break;
               }
            }

         }
      }
   }

   public abstract void method333(Graphics var1, int var2, int var3, int var4);

   public abstract void method337(int var1, int var2, Component var3, byte var4);

   public static Class116_Sub15 method339(int var0, int var1, int var2) {
      Class116_Sub15 var3 = Class107.method1466(var0, 314639891);
      return -1 == var1?var3:(null != var3 && var3.aClass116_Sub15Array1995 != null && var1 < var3.aClass116_Sub15Array1995.length?var3.aClass116_Sub15Array1995[var1]:null);
   }

   static void method341(Class116_Sub23_Sub4 var0, int var1, int var2, int var3, int var4) {
      if(client.anInt3176 * 2079336095 < 50 && 0 != client.anInt3175 * 873913835) {
         if(var0.anIntArray2261 != null && var1 < var0.anIntArray2261.length) {
            int var6 = var0.anIntArray2261[var1];
            if(0 != var6) {
               int var8 = var6 >> 8;
               int var9 = var6 >> 4 & 7;
               int var7 = var6 & 15;
               client.anIntArray3177[client.anInt3176 * 2079336095] = var8;
               client.anIntArray3019[2079336095 * client.anInt3176] = var9;
               client.anIntArray2964[client.anInt3176 * 2079336095] = 0;
               client.aClass15Array3181[2079336095 * client.anInt3176] = null;
               int var10 = (var2 - 64) / 128;
               int var5 = (var3 - 64) / 128;
               client.anIntArray3180[2079336095 * client.anInt3176] = var7 + (var5 << 8) + (var10 << 16);
               client.anInt3176 += -857377441;
            }
         }
      }
   }
}
