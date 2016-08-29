package com.jagex;
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

   static Applet_Sub1 anApplet_Sub1_2909 = null;
   static int anInt2910 = 0;
   static boolean aBool2912 = false;
   boolean aBool2913 = false;
   static long aLong2914 = 0L;
   static int anInt2915 = -347165529;
   static int anInt2916 = 1386635868;
   static long[] aLongArray2917 = new long[32];
   protected static int anInt2918 = 0;
   static long[] aLongArray2919 = new long[32];
   protected static int anInt2920 = 0;
   public static volatile boolean aBool2921 = true;
   static int anInt2922 = -1823610604;
   protected static boolean aBool2923 = false;
   protected static volatile boolean aBool2924 = false;
   protected static int anInt2925 = 0;
   static volatile boolean aBool2926 = true;
   static volatile long aLong2927 = 0L;
   static final int anInt2928 = 1006;

   protected final synchronized void method3570(int var1) {
      Container var2 = this.method3583(685216356);
      if(null != Tile.aCanvas1875) {
         Tile.aCanvas1875.removeFocusListener(this);
         var2.remove(Tile.aCanvas1875);
      }

      Class42.clientWidth = Math.max(var2.getWidth(), Class145.anInt1650 * 2055757083) * -780223189;
      Class116_Sub16.clientHeight = Math.max(var2.getHeight(), -1066486805 * PlayerAlias.anInt1758) * 427958731;
      Insets var3;
      if(null != Class116_Sub23_Sub13.aFrame2425) {
         var3 = Class116_Sub23_Sub13.aFrame2425.getInsets();
         Class42.clientWidth -= -780223189 * (var3.left + var3.right);
         Class116_Sub16.clientHeight -= (var3.bottom + var3.top) * 427958731;
      }

      Tile.aCanvas1875 = new Canvas_Sub1(this);
      var2.add(Tile.aCanvas1875);
      Tile.aCanvas1875.setSize(-452716157 * Class42.clientWidth, Class116_Sub16.clientHeight * 674167779);
      Tile.aCanvas1875.setVisible(true);
      if(Class116_Sub23_Sub13.aFrame2425 == var2) {
         var3 = Class116_Sub23_Sub13.aFrame2425.getInsets();
         Tile.aCanvas1875.setLocation(var3.left + 76231581 * anInt2925, var3.top + anInt2920 * -225353991);
      } else {
         Tile.aCanvas1875.setLocation(76231581 * anInt2925, anInt2920 * -225353991);
      }

      Tile.aCanvas1875.addFocusListener(this);
      Tile.aCanvas1875.requestFocus();
      aBool2921 = true;
      int var4 = -452716157 * Class42.clientWidth;
      int var5 = 674167779 * Class116_Sub16.clientHeight;
      Canvas var6 = Tile.aCanvas1875;

      Object var10;
      try {
         DirectImageProducer var7 = new DirectImageProducer();
         var7.method337(var4, var5, var6, (byte)1);
         var10 = var7;
      } catch (Throwable var9) {
         RSImageProducer var8 = new RSImageProducer();
         var8.method337(var4, var5, var6, (byte)1);
         var10 = var8;
      }

      if(Class73.aAbstractRSDrawing_874 != null) {
         Class73.aAbstractRSDrawing_874.method333(((AbstractRSDrawing)var10).finalImage.getGraphics(), 0, 0, -819332484);
      }

      Class73.aAbstractRSDrawing_874 = (AbstractRSDrawing)var10;
      aBool2924 = false;
      aLong2927 = Class116_Sub5.method1929(-1730340736) * -2460302806870968417L;
   }

   protected final boolean method3571(int var1) {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if(!var2.equals("mechscape.com") && !var2.endsWith(".mechscape.com")) {
               if(var2.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
                     var2 = var2.substring(0, var2.length() - 1);
                  }

                  if(var2.endsWith("192.168.1.")) {
                     return true;
                  } else {
                     this.method3582("invalidhost", (byte)0);
                     return false;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         if(null != Class74.aString886) {
            String var1 = Class74.aString886.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Class74.aString882;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method3582("wrongjava", (byte)0);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && BasicTimer.method2217(var2.charAt(var3), -1653901602); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  boolean var5 = false;
                  boolean var6 = false;
                  int var7 = 0;
                  int var8 = var4.length();
                  int var9 = 0;

                  boolean var11;
                  while(true) {
                     if(var9 >= var8) {
                        var11 = var6;
                        break;
                     }

                     label156: {
                        char var10 = var4.charAt(var9);
                        if(0 == var9) {
                           if(var10 == 45) {
                              var5 = true;
                              break label156;
                           }

                           if(var10 == 43) {
                              break label156;
                           }
                        }

                        int var16;
                        if(var10 >= 48 && var10 <= 57) {
                           var16 = var10 - 48;
                        } else if(var10 >= 65 && var10 <= 90) {
                           var16 = var10 - 55;
                        } else {
                           if(var10 < 97 || var10 > 122) {
                              var11 = false;
                              break;
                           }

                           var16 = var10 - 87;
                        }

                        if(var16 >= 10) {
                           var11 = false;
                           break;
                        }

                        if(var5) {
                           var16 = -var16;
                        }

                        int var12 = 10 * var7 + var16;
                        if(var12 / 10 != var7) {
                           var11 = false;
                           break;
                        }

                        var7 = var12;
                        var6 = true;
                     }

                     ++var9;
                  }

                  if(var11) {
                     int var17 = Class116_Sub5.method1932(var4, 10, true, (short)1000);
                     if(var17 < 10) {
                        this.method3582("wrongjava", (byte)0);
                        return;
                     }
                  }
               }

               anInt2915 = -1735827645;
            }
         }

         this.setFocusCycleRoot(true);
         this.method3570(232655903);
         this.method3578(-1295554880);
         Class102.aTimer_1418 = Class116_Sub23_Sub17.method2884(-74695759);

         while(aLong2914 * 2722427985237087875L == 0L || Class116_Sub5.method1929(-698246111) < 2722427985237087875L * aLong2914) {
            Class116_Sub12.anInt1836 = Class102.aTimer_1418.method1085(anInt2916 * 2081489859, anInt2915 * 87833367, (byte)-6) * 1809972633;

            for(int var15 = 0; var15 < -108132695 * Class116_Sub12.anInt1836; ++var15) {
               this.method3572(1474139726);
            }

            this.method3616((byte)-1);
            Class116_Sub23_Sub16_Sub1.method3097(ISAAC.aClass74_705, Tile.aCanvas1875, (byte)1);
         }
      } catch (Exception var14) {
         Class90.method1192((String)null, var14, 343294798);
         this.method3582("crash", (byte)0);
      }

      this.method3574(-1414134321);
   }

   void method3572(int var1) {
      long var2 = Class116_Sub5.method1929(-1491530371);
      long var4 = aLongArray2919[Class89.anInt1040 * 1149319977];
      aLongArray2919[Class89.anInt1040 * 1149319977] = var2;
      Class89.anInt1040 = 549949721 * (Class89.anInt1040 * 1149319977 + 1 & 31);
      if(0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         Animable.aBool2470 = aBool2926;
      }

      this.processFrames(-933153502);
   }

   final synchronized void method3574(int var1) {
      if(!aBool2912) {
         aBool2912 = true;

         try {
            Tile.aCanvas1875.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.method3604(-1961815165);
         } catch (Exception var5) {
            ;
         }

         if(Class116_Sub23_Sub13.aFrame2425 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if(null != ISAAC.aClass74_705) {
            try {
               ISAAC.aClass74_705.method1061((byte)10);
            } catch (Exception var3) {
               ;
            }
         }

         this.method3585((byte)-100);
      }
   }

   public void start() {
      if(anApplet_Sub1_2909 == this && !aBool2912) {
         aLong2914 = 0L;
      }
   }

   public void destroy() {
      if(this == anApplet_Sub1_2909 && !aBool2912) {
         aLong2914 = Class116_Sub5.method1929(1813802300) * 4455918119670900779L;
         Friend.method1836(5000L);
         this.method3574(-1974688852);
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void focusLost(FocusEvent var1) {
      aBool2926 = false;
   }

   public final void windowActivated(WindowEvent var1) {}

   public final void windowClosed(WindowEvent var1) {}

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {}

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   public abstract void init();

   protected abstract void method3578(int var1);


   protected void method3582(String var1, byte var2) {
      if(!this.aBool2913) {
         this.aBool2913 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }

      }
   }

   protected Container method3583(int var1) {
      return (Container)(Class116_Sub23_Sub13.aFrame2425 != null?Class116_Sub23_Sub13.aFrame2425:this);
   }

   protected Dimension method3584(byte var1) {
      Container var2 = this.method3583(1432588210);
      int var3 = Math.max(var2.getWidth(), 2055757083 * Class145.anInt1650);
      int var5 = Math.max(var2.getHeight(), PlayerAlias.anInt1758 * -1066486805);
      if(Class116_Sub23_Sub13.aFrame2425 != null) {
         Insets var4 = Class116_Sub23_Sub13.aFrame2425.getInsets();
         var3 -= var4.left + var4.right;
         var5 -= var4.bottom + var4.top;
      }

      return new Dimension(var3, var5);
   }

   protected abstract void method3585(byte var1);

   protected final void method3586(int var1, int var2, int var3, int var4) {
      try {
         if(null != anApplet_Sub1_2909) {
            anInt2910 += 2053161379;
            if(-1859094005 * anInt2910 >= 3) {
               this.method3582("alreadyloaded", (byte)0);
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         anApplet_Sub1_2909 = this;
         Class42.clientWidth = -780223189 * var1;
         Class116_Sub16.clientHeight = 427958731 * var2;
         client.anInt1646 = var3 * -778950217;
         Class58.gameApplet = this;
         if(ISAAC.aClass74_705 == null) {
            ISAAC.aClass74_705 = new Class74();
         }

         ISAAC.aClass74_705.method1063(this, 1, 1810544028);
      } catch (Exception var6) {
         Class90.method1192((String)null, var6, 343294798);
         this.method3582("crash", (byte)0);
      }

   }

   protected abstract void method3587(short var1);


   public final void focusGained(FocusEvent var1) {
      aBool2926 = true;
      aBool2921 = true;
   }


   protected abstract void processFrames(int var1);

   protected abstract void method3604(int var1);


   void method3616(byte var1) {
      Container var2 = this.method3583(912154773);
      long var6 = Class116_Sub5.method1929(-2020510104);
      long var3 = aLongArray2917[263003187 * ISAAC.anInt700];
      aLongArray2917[ISAAC.anInt700 * 263003187] = var6;
      ISAAC.anInt700 = (1 + 263003187 * ISAAC.anInt700 & 31) * 1221279483;
      if(0L != var3 && var6 > var3) {
         int var5 = (int)(var6 - var3);
         anInt2918 = ((var5 >> 1) + 32000) / var5 * -709122581;
      }

      if((anInt2922 += -871230615) * 355183833 - 1 > 50) {
         anInt2922 -= -611857790;
         aBool2921 = true;
         Tile.aCanvas1875.setSize(Class42.clientWidth * -452716157, 674167779 * Class116_Sub16.clientHeight);
         Tile.aCanvas1875.setVisible(true);
         if(Class116_Sub23_Sub13.aFrame2425 == var2) {
            Insets var8 = Class116_Sub23_Sub13.aFrame2425.getInsets();
            Tile.aCanvas1875.setLocation(anInt2925 * 76231581 + var8.left, var8.top + anInt2920 * -225353991);
         } else {
            Tile.aCanvas1875.setLocation(anInt2925 * 76231581, anInt2920 * -225353991);
         }
      }

      this.method3587((short)-22689);
   }


   public void stop() {
      if(anApplet_Sub1_2909 == this && !aBool2912) {
         aLong2914 = (Class116_Sub5.method1929(1893075306) + 4000L) * 4455918119670900779L;
      }
   }


   public final synchronized void paint(Graphics var1) {
      if(anApplet_Sub1_2909 == this && !aBool2912) {
         aBool2921 = true;
         if(Class74.aString882 != null && Class74.aString882.startsWith("1.5") && Class116_Sub5.method1929(922488009) - aLong2927 * -2499368560980646817L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(null == var2 || var2.width >= -452716157 * Class42.clientWidth && var2.height >= 674167779 * Class116_Sub16.clientHeight) {
               aBool2924 = true;
            }
         }

      }
   }


   static Class116_Sub23_Sub19_Sub3[] method3670(short var0) {
      Class116_Sub23_Sub19_Sub3[] var1 = new Class116_Sub23_Sub19_Sub3[817614505 * Class8.anInt130];

      for(int var3 = 0; var3 < Class8.anInt130 * 817614505; ++var3) {
         Class116_Sub23_Sub19_Sub3 var2 = var1[var3] = new Class116_Sub23_Sub19_Sub3();
         var2.anInt2767 = Class8.anInt122 * -749860951;
         var2.anInt2768 = Class8.anInt132 * -1945497809;
         var2.anInt2766 = Class8.anIntArray124[var3];
         var2.anInt2765 = Class116_Sub23_Sub15.anIntArray2444[var3];
         var2.anInt2763 = Class8.anIntArray125[var3];
         var2.anInt2764 = Class8.anIntArray126[var3];
         var2.anIntArray2761 = Class97.anIntArray1372;
         var2.aByteArray2762 = Mob.aByteArrayArray2877[var3];
      }

      Class76.method1080((byte)-24);
      return var1;
   }
}
