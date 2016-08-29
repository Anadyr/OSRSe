package com.jagex;

public class MidiSeq {

   int anInt222;
   int[] anIntArray223 = new int[2];
   int anInt224;
   int anInt225;
   int anInt226 = 2;
   int anInt227;
   int anInt228;
   int anInt229;
   int anInt230;
   int anInt231;
   int[] anIntArray232 = new int[2];

   final void applyData(Buffer var1) {
      this.anInt227 = var1.readSignedByte(1708176767);
      this.anInt222 = var1.readInt(-316753801);
      this.anInt225 = var1.readInt(-2032381067);
      this.method278(var1);
   }

   final void resetValues() {
      this.anInt228 = 0;
      this.anInt229 = 0;
      this.anInt230 = 0;
      this.anInt231 = 0;
      this.anInt224 = 0;
   }

   final int method273(int var1) {
      if(this.anInt224 >= this.anInt228) {
         this.anInt231 = this.anIntArray232[this.anInt229++] << 15;
         if(this.anInt229 >= this.anInt226) {
            this.anInt229 = this.anInt226 - 1;
         }

         this.anInt228 = (int)((double)this.anIntArray223[this.anInt229] / 65536.0D * (double)var1);
         if(this.anInt228 > this.anInt224) {
            this.anInt230 = ((this.anIntArray232[this.anInt229] << 15) - this.anInt231) / (this.anInt228 - this.anInt224);
         }
      }

      this.anInt231 += this.anInt230;
      ++this.anInt224;
      return this.anInt231 - this.anInt230 >> 15;
   }

   MidiSeq() {
      this.anIntArray223[0] = 0;
      this.anIntArray223[1] = '\uffff';
      this.anIntArray232[0] = 0;
      this.anIntArray232[1] = '\uffff';
   }

   final void method278(Buffer var1) {
      this.anInt226 = var1.readSignedByte(1708176767);
      this.anIntArray223 = new int[this.anInt226];
      this.anIntArray232 = new int[this.anInt226];

      for(int var2 = 0; var2 < this.anInt226; ++var2) {
         this.anIntArray223[var2] = var1.readShort(-65906373);
         this.anIntArray232[var2] = var1.readShort(901941890);
      }

   }

}
