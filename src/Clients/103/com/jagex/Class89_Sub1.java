package com.jagex;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class89_Sub1 extends Class89 implements MouseWheelListener {

   int anInt1900 = 0;

   public void method1185(Component var1, byte var2) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int method1182(int var1) {
      int var2 = this.anInt1900 * -1019968763;
      this.anInt1900 = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.anInt1900 += var1.getWheelRotation() * 1221382605;
   }

   public void method1180(Component var1, short var2) {
      var1.addMouseWheelListener(this);
   }
}
