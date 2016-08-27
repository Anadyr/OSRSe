package com.jagex;
import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class Class9_Sub2 extends Class9 {

   int anInt1681;
   SourceDataLine aSourceDataLine1682;
   AudioFormat anAudioFormat1683;
   byte[] aByteArray1684;

   void method153(Component var1) {
      this.anAudioFormat1683 = new AudioFormat((float)(-954458055 * anInt135), 16, aBool144?2:1, true, false);
      this.aByteArray1684 = new byte[256 << (aBool144?2:1)];
   }

   void method154(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.anAudioFormat1683, var1 << (aBool144?2:1));
         this.aSourceDataLine1682 = (SourceDataLine)AudioSystem.getLine(var2);
         this.aSourceDataLine1682.open();
         this.aSourceDataLine1682.start();
         this.anInt1681 = var1 * -1584098805;
      } catch (LineUnavailableException var3) {
         if(Class116_Sub21.method2333(var1, (byte)-58) != 1) {
            this.method154(World.method542(var1, 1582993472));
         } else {
            this.aSourceDataLine1682 = null;
            throw var3;
         }
      }
   }

   int method155() {
      return this.anInt1681 * 273803683 - (this.aSourceDataLine1682.available() >> (aBool144?2:1));
   }

   void method167() {
      if(null != this.aSourceDataLine1682) {
         this.aSourceDataLine1682.close();
         this.aSourceDataLine1682 = null;
      }

   }

   void method144() {
      this.aSourceDataLine1682.flush();
   }

   void method156() {
      int var1 = 256;
      if(aBool144) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.anIntArray138[var2];
         if((8388608 + var3 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aByteArray1684[2 * var2] = (byte)(var3 >> 8);
         this.aByteArray1684[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aSourceDataLine1682.write(this.aByteArray1684, 0, var1 << 1);
   }
}
