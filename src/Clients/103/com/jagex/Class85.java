package com.jagex;
import com.applet.Launcher;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Class85 implements MouseListener, MouseMotionListener, FocusListener {

   public static volatile long aLong985 = 0L;
   public static volatile int anInt986 = 0;
   public static Class85 aClass85_987 = new Class85();
   public static volatile int anInt989 = -36787019;
   public static volatile int anInt990 = 0;
   public static int anInt991 = 0;
   public static int anInt992 = 0;
   public static volatile int anInt993 = 0;
   public static int anInt994 = 0;
   public static volatile int anInt995 = -884290827;
   public static volatile int anInt996 = 0;
   public static int anInt997 = 0;
   public static int clickAreaX = 0;
   public static int clickAreaY = 0;
   public static long aLong1000 = 0L;
   public static volatile int anInt1003 = 0;


   public final synchronized void mouseReleased(MouseEvent var1) {
      if(null != aClass85_987) {
         anInt986 = 0;
         anInt996 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(null != aClass85_987) {
         anInt986 = 0;
         anInt995 = var1.getX() * 884290827;
         anInt989 = var1.getY() * 36787019;
      }

   }

   public final void focusGained(FocusEvent var1) {}

   static ChatMessage method1137(int var0, int var1) {
      return (ChatMessage)Class37.aClass124_492.method1644((long)var0);
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if(null != aClass85_987) {
         anInt986 = 0;
         anInt1003 = var1.getX() * -2121653949;
         anInt990 = var1.getY() * -1947749793;
         aLong985 = Class116_Sub5.generateHash(1330920504) * 1504365569888336301L;
         if(var1.isAltDown()) {
            anInt993 = -679655996;
            anInt996 = 1605267244;
         } else if(var1.isMetaDown()) {
            anInt993 = 1807655650;
            anInt996 = -1344850026;
         } else {
            anInt993 = -1243655823;
            anInt996 = -672425013;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(null != aClass85_987) {
         anInt986 = 0;
         anInt995 = var1.getX() * 884290827;
         anInt989 = var1.getY() * 36787019;
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(aClass85_987 != null) {
         anInt986 = 0;
         anInt995 = var1.getX() * 884290827;
         anInt989 = var1.getY() * 36787019;
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(aClass85_987 != null) {
         anInt986 = 0;
         anInt995 = -884290827;
         anInt989 = -36787019;
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(aClass85_987 != null) {
         anInt996 = 0;
      }

   }

   static final void method1157(boolean var0, byte var1) {
      Class42.method695((byte)122);
      client.anInt2983 += 530378793;
      if(736734233 * client.anInt2983 >= 50 || var0) {
         client.anInt2983 = 0;
         if(!client.aBool3052 && null != Class38.streamBuffer) {
             if(Launcher.rsps)
                 return;
            client.rsaBuffer.startPacket(126, (byte) 41);

            try {
               Class38.streamBuffer.flush(client.rsaBuffer.payload, 0, 314639891 * client.rsaBuffer.position, 272474741);
               client.rsaBuffer.position = 0;
            } catch (IOException var3) {
               client.aBool3052 = true;
            }
         }

      }
   }
}
