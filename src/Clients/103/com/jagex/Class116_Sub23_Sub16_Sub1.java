package com.jagex;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public final class Class116_Sub23_Sub16_Sub1 extends Animable {

   int anInt2560 = 0;
   int anInt2561;
   public static final int anInt2562 = 180;
   int anInt2563;
   int anInt2564;
   int anInt2565;
   Class116_Sub23_Sub4 aClass116_Sub23_Sub4_2566;
   int anInt2567 = 0;
   int anInt2568;
   boolean aBool2569 = false;
   int anInt2572;
   static int anInt2573;

   static File method3093(String var0, String var1, int var2, int var3) {
      String var4 = var2 == 0?"":"" + var2;
      Class86.aFile1008 = new File(PacketBuilder.USER_HOME, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      Packet var9;
      File var21;
      if(Class86.aFile1008.exists()) {
         try {
            Class145 var8 = new Class145(Class86.aFile1008, "rw", 10000L);

            int var10;
            for(var9 = new Packet((int)var8.method1813(-980664584)); 314639891 * var9.position < var9.payload.length; var9.position += -184175589 * var10) {
               var10 = var8.method1811(var9.payload, var9.position * 314639891, var9.payload.length - var9.position * 314639891, 920879608);
               if(var10 == -1) {
                  throw new IOException();
               }
            }

            var9.position = 0;
            var10 = var9.readSignedByte(1708176767);
            if(var10 < 1 || var10 > 3) {
               throw new IOException("" + var10);
            }

            int var11 = 0;
            if(var10 > 1) {
               var11 = var9.readSignedByte(1708176767);
            }

            if(var10 <= 2) {
               var5 = var9.method2214(-1409763936);
               if(var11 == 1) {
                  var6 = var9.method2214(-236794918);
               }
            } else {
               var5 = var9.method2014(-360629606);
               if(1 == var11) {
                  var6 = var9.method2014(-1890242834);
               }
            }

            var8.method1828(-635075024);
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         if(null != var5) {
            var21 = new File(var5);
            if(!var21.exists()) {
               var5 = null;
            }
         }

         if(var5 != null) {
            var21 = new File(var5, "test.dat");
            if(!RSIndex.testFile(var21, true, -1522628747)) {
               var5 = null;
            }
         }
      }

      if(var5 == null && var2 == 0) {
         label113:
         for(int var19 = 0; var19 < Class78.CACHE_FOLDER_NAME.length; ++var19) {
            for(int var22 = 0; var22 < Class31.CACHE_ROOT_DIR.length; ++var22) {
               File f = new File(Class31.CACHE_ROOT_DIR[var22] + Class78.CACHE_FOLDER_NAME[var19] + File.separatorChar + var0 + File.separatorChar);
               if(f.exists() && RSIndex.testFile(new File(f, "test.dat"), true, -1707967216)) {
                   System.out.println(f.getAbsolutePath());
                  var5 = f.toString();
                  var7 = true;
                  break label113;
               }
            }
         }
      }

      if(var5 == null) {
         var5 = PacketBuilder.USER_HOME + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      File var20;
      if(var6 != null) {
         var20 = new File(var6);
         var21 = new File(var5);

         try {
            File[] var24 = var20.listFiles();
            File[] var26 = var24;

            for(int var12 = 0; var12 < var26.length; ++var12) {
               File var13 = var26[var12];
               File var14 = new File(var21, var13.getName());
               boolean var15 = var13.renameTo(var14);
               if(!var15) {
                  throw new IOException();
               }
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }

         var7 = true;
      }

      if(var7) {
         var20 = new File(var5);
         var9 = null;

         try {
            Class145 var25 = new Class145(Class86.aFile1008, "rw", 10000L);
            Packet var27 = new Packet(500);
            var27.writeByte(3, 157895064);
            var27.writeByte(var9 != null?1:0, 836871783);
            var27.writeGJString2(var20.getPath(), -1942618019);

            var25.method1832(var27.payload, 0, var27.position * 314639891, 1619660554);
            var25.method1828(-234270323);
         } catch (IOException var16) {
            var16.printStackTrace();
         }
      }

      return new File(var5);
   }

   protected final SpotAnim getRotatedModel(byte var1) {
      Class116_Sub23_Sub1 var2 = Friend.method1835(1099063177 * this.anInt2568, (byte) 1);
      SpotAnim var3;
      if(!this.aBool2569) {
         var3 = var2.method2344(this.anInt2567 * 155883933, 23804461);
      } else {
         var3 = var2.method2344(-1, 1929693220);
      }

      return null == var3?null:var3;
   }

   final void method3094(int var1, byte var2) {
      if(!this.aBool2569) {
         this.anInt2560 += 1739678157 * var1;

         while(this.anInt2560 * -1560120571 > this.aClass116_Sub23_Sub4_2566.anIntArray2255[this.anInt2567 * 155883933]) {
            this.anInt2560 -= 1739678157 * this.aClass116_Sub23_Sub4_2566.anIntArray2255[155883933 * this.anInt2567];
            this.anInt2567 += 982234293;
            if(155883933 * this.anInt2567 >= this.aClass116_Sub23_Sub4_2566.anIntArray2247.length) {
               this.aBool2569 = true;
               break;
            }
         }

      }
   }

   Class116_Sub23_Sub16_Sub1(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.anInt2568 = var1 * -2055354695;
      this.anInt2572 = var2 * 263160201;
      this.anInt2563 = var3 * 1032422341;
      this.anInt2564 = 1007615891 * var4;
      this.anInt2565 = -144474123 * var5;
      this.anInt2561 = (var6 + var7) * -1971277335;
      int var8 = Friend.method1835(1099063177 * this.anInt2568, (byte) 1).anInt2157 * -521951217;
      if(-1 != var8) {
         this.aBool2569 = false;
         this.aClass116_Sub23_Sub4_2566 = Class116_Sub8.method1946(var8, -922230802);
      } else {
         this.aBool2569 = true;
      }

   }

   public static void method3097(SignLink var0, Object var1, byte var2) {
      if(var0.anEventQueue888 != null) {
         for(int var3 = 0; var3 < 50 && var0.anEventQueue888.peekEvent() != null; ++var3) {
            Friend.sleep(1L);
         }

         if(var1 != null) {
            var0.anEventQueue888.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   public static boolean method3098(int var0) {
      ReflectionNode var1 = (ReflectionNode) client.aClass119_1617.method1591();
      return null != var1;
   }

}
