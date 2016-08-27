package com.jagex;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class DirectImageProducer extends AbstractRSDrawing {

   Component ourComponent;

   public final void method325(Graphics var1, int var2, int var3, int var4, int var5, short var6) {
      Shape var7 = var1.getClip();
      var1.clipRect(var2, var3, var4, var5);
      var1.drawImage(this.finalImage, 0, 0, this.ourComponent);
      var1.setClip(var7);
   }

   public final void method337(int var1, int var2, Component var3, byte var4) {
      this.anInt264 = 409111727 * var1;
      this.anInt266 = var2 * 1577837381;
      this.anIntArray265 = new int[1 + var1 * var2];
      DataBufferInt dataBufferInt = new DataBufferInt(this.anIntArray265, this.anIntArray265.length);
      DirectColorModel directColorModel = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster writableRaster = Raster.createWritableRaster(directColorModel.createCompatibleSampleModel(this.anInt264 * 1154763343, this.anInt266 * -1725941875), dataBufferInt, (Point) null);
      this.finalImage = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
      this.ourComponent = var3;
      this.method326((byte)7);
   }

   public final void method333(Graphics var1, int var2, int var3, int var4) {
      var1.drawImage(this.finalImage, var2, var3, this.ourComponent);
   }
}
