package com.jagex;

public class NanoTimer extends Timer {

   long aLong1889 = System.nanoTime() * 7835294065936094705L;

   void reset(int var1) {
      this.aLong1889 = System.nanoTime() * 7835294065936094705L;
   }

   int method1085(int var1, int var2, byte var3) {
      long var4 = (long)var2 * 1000000L;
      long var6 = this.aLong1889 * -5715808306233115887L - System.nanoTime();
      if(var6 < var4) {
         var6 = var4;
      }

      Friend.sleep(var6 / 1000000L);
      long var9 = System.nanoTime();

      int var8;
      for(var8 = 0; var8 < 10 && (var8 < 1 || -5715808306233115887L * this.aLong1889 < var9); this.aLong1889 += 2627139815237000768L * (long)var1) {
         ++var8;
      }

      if(-5715808306233115887L * this.aLong1889 < var9) {
         this.aLong1889 = 7835294065936094705L * var9;
      }

      return var8;
   }

}
