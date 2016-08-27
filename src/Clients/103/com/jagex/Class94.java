package com.jagex;
import java.awt.Graphics;

public final class Class94 {

   static int port;

   static final void method1300(String var0, boolean var1, int var2) {
      byte var3 = 4;
      int var4 = 6 + var3;
      int var5 = var3 + 6;
      int var6 = client.aClass116_Sub23_Sub19_Sub4_Sub1_2989.method3457(var0, 250);
      int var7 = client.aClass116_Sub23_Sub19_Sub4_Sub1_2989.method3458(var0, 250) * 13;
      DrawingArea.setRasterAreaColor(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 0);
      DrawingArea.method2897(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var3 + var7, 16777215);
      client.aClass116_Sub23_Sub19_Sub4_Sub1_2989.method3537(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
      Class116_Sub23_Sub2.method2385(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, (short)10798);
      if(var1) {
         try {
            Graphics var8 = Tile.aCanvas1875.getGraphics();
            RSFIT.aAbstractRSDrawing_874.method333(var8, 0, 0, -819332484);
         } catch (Exception var13) {
            Tile.aCanvas1875.repaint();
         }
      } else {
         int var14 = var4;
         int var9 = var5;
         int var10 = var6;
         int var11 = var7;

         for(int var12 = 0; var12 < -580551879 * client.anInt3136; ++var12) {
            if(client.anIntArray3141[var12] + client.anIntArray3143[var12] > var14 && client.anIntArray3141[var12] < var10 + var14 && client.anIntArray3144[var12] + client.anIntArray3142[var12] > var9 && client.anIntArray3142[var12] < var11 + var9) {
               client.aBoolArray3139[var12] = true;
            }
         }
      }

   }
}
