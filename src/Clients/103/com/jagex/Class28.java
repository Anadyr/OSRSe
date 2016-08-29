package com.jagex;

public class Class28 {

   static int[] anIntArray390 = new int[500];
   int[] anIntArray391;
   static int[] anIntArray392 = new int[500];
   static int[] anIntArray393 = new int[500];
   Class116_Sub5 aClass116_Sub5_394 = null;
   int anInt395 = -1;
   int[] anIntArray396;
   static int[] anIntArray397 = new int[500];
   int[] anIntArray398;
   int[] anIntArray399;
   boolean aBool400 = false;


   Class28(byte[] var1, Class116_Sub5 var2) {
      this.aClass116_Sub5_394 = var2;
      Buffer var6 = new Buffer(var1);
      Buffer var9 = new Buffer(var1);
      var6.position = -368351178;
      int var7 = var6.readSignedByte(1708176767);
      int var8 = -1;
      int var4 = 0;
      var9.position = (var6.position * 314639891 + var7) * -184175589;

      int var3;
      for(var3 = 0; var3 < var7; ++var3) {
         int var5 = var6.readSignedByte(1708176767);
         if(var5 > 0) {
            if(this.aClass116_Sub5_394.anIntArray1723[var3] != 0) {
               for(int var10 = var3 - 1; var10 > var8; --var10) {
                  if(this.aClass116_Sub5_394.anIntArray1723[var10] == 0) {
                     anIntArray397[var4] = var10;
                     anIntArray390[var4] = 0;
                     anIntArray392[var4] = 0;
                     anIntArray393[var4] = 0;
                     ++var4;
                     break;
                  }
               }
            }

            anIntArray397[var4] = var3;
            short var11 = 0;
            if(this.aClass116_Sub5_394.anIntArray1723[var3] == 3) {
               var11 = 128;
            }

            if((var5 & 1) != 0) {
               anIntArray390[var4] = var9.readSmart(-933304256);
            } else {
               anIntArray390[var4] = var11;
            }

            if((var5 & 2) != 0) {
               anIntArray392[var4] = var9.readSmart(-1155364958);
            } else {
               anIntArray392[var4] = var11;
            }

            if((var5 & 4) != 0) {
               anIntArray393[var4] = var9.readSmart(-1692225443);
            } else {
               anIntArray393[var4] = var11;
            }

            var8 = var3;
            ++var4;
            if(this.aClass116_Sub5_394.anIntArray1723[var3] == 5) {
               this.aBool400 = true;
            }
         }
      }

      if(var9.position * 314639891 != var1.length) {
         throw new RuntimeException();
      } else {
         this.anInt395 = var4;
         this.anIntArray396 = new int[var4];
         this.anIntArray391 = new int[var4];
         this.anIntArray398 = new int[var4];
         this.anIntArray399 = new int[var4];

         for(var3 = 0; var3 < var4; ++var3) {
            this.anIntArray396[var3] = anIntArray397[var3];
            this.anIntArray391[var3] = anIntArray390[var3];
            this.anIntArray398[var3] = anIntArray392[var3];
            this.anIntArray399[var3] = anIntArray393[var3];
         }

      }
   }
}
