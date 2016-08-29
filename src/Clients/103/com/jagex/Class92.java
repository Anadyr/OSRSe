package com.jagex;

public class Class92 {

   int anInt1322;
   int[] anIntArray1324;
   int[] anIntArray1325;
   int[] anIntArray1326;
   int anInt1327;
   Buffer aClass116_Sub14_1329 = new Buffer((byte[])null);
   static byte[] aByteArray1330 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   int[] anIntArray1331;
   long aLong1332;


   void method1202(byte[] var1) {
      this.aClass116_Sub14_1329.payload = var1;
      this.aClass116_Sub14_1329.position = -1841755890;
      int var3 = this.aClass116_Sub14_1329.readShort(1410590027);
      this.anInt1322 = this.aClass116_Sub14_1329.readShort(755133976);
      this.anInt1327 = 500000;
      this.anIntArray1326 = new int[var3];

      int var2;
      int var5;
      for(var5 = 0; var5 < var3; this.aClass116_Sub14_1329.position += var2 * -184175589) {
         int var4 = this.aClass116_Sub14_1329.readInt(-1426064108);
         var2 = this.aClass116_Sub14_1329.readInt(-1975875572);
         if(var4 == 1297379947) {
            this.anIntArray1326[var5] = this.aClass116_Sub14_1329.position * 314639891;
            ++var5;
         }
      }

      this.aLong1332 = 0L;
      this.anIntArray1324 = new int[var3];

      for(var5 = 0; var5 < var3; ++var5) {
         this.anIntArray1324[var5] = this.anIntArray1326[var5];
      }

      this.anIntArray1325 = new int[var3];
      this.anIntArray1331 = new int[var3];
   }

   void method1203() {
      this.aClass116_Sub14_1329.payload = null;
      this.anIntArray1326 = null;
      this.anIntArray1324 = null;
      this.anIntArray1325 = null;
      this.anIntArray1331 = null;
   }

   int method1205() {
      return this.anIntArray1324.length;
   }

   void method1206(int var1) {
      this.aClass116_Sub14_1329.position = this.anIntArray1324[var1] * -184175589;
   }

   void method1207(int var1) {
      this.anIntArray1324[var1] = this.aClass116_Sub14_1329.position * 314639891;
   }

   Class92() {}

   int method1210(int var1) {
      byte var2 = this.aClass116_Sub14_1329.payload[this.aClass116_Sub14_1329.position * 314639891];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.anIntArray1331[var1] = var5;
         this.aClass116_Sub14_1329.position += -184175589;
      } else {
         var5 = this.anIntArray1331[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method1235(var1, var5);
      } else {
         int var4 = this.aClass116_Sub14_1329.method2116((byte)-120);
         if(var5 == 247 && var4 > 0) {
            int var3 = this.aClass116_Sub14_1329.payload[this.aClass116_Sub14_1329.position * 314639891] & 255;
            if(var3 >= 241 && var3 <= 243 || var3 == 246 || var3 == 248 || var3 >= 250 && var3 <= 252 || var3 == 254) {
               this.aClass116_Sub14_1329.position += -184175589;
               this.anIntArray1331[var1] = var3;
               return this.method1235(var1, var3);
            }
         }

         this.aClass116_Sub14_1329.position += var4 * -184175589;
         return 0;
      }
   }

   long method1212(int var1) {
      return this.aLong1332 + (long)var1 * (long)this.anInt1327;
   }

   int method1213() {
      int var1 = this.anIntArray1324.length;
      int var3 = -1;
      int var2 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.anIntArray1324[var4] >= 0 && this.anIntArray1325[var4] < var2) {
            var3 = var4;
            var2 = this.anIntArray1325[var4];
         }
      }

      return var3;
   }

   void method1215(long var1) {
      this.aLong1332 = var1;
      int var4 = this.anIntArray1324.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         this.anIntArray1325[var3] = 0;
         this.anIntArray1331[var3] = 0;
         this.aClass116_Sub14_1329.position = this.anIntArray1326[var3] * -184175589;
         this.method1255(var3);
         this.anIntArray1324[var3] = this.aClass116_Sub14_1329.position * 314639891;
      }

   }

   boolean method1216() {
      int var1 = this.anIntArray1324.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.anIntArray1324[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   int method1223(int var1) {
      int var2 = this.method1210(var1);
      return var2;
   }

   boolean method1228() {
      return this.aClass116_Sub14_1329.payload != null;
   }

   int method1235(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.aClass116_Sub14_1329.readSignedByte(1708176767);
         var4 = this.aClass116_Sub14_1329.method2116((byte)-16);
         if(var7 == 47) {
            this.aClass116_Sub14_1329.position += var4 * -184175589;
            return 1;
         } else if(var7 == 81) {
            int var6 = this.aClass116_Sub14_1329.readMedium((byte) 15);
            var4 -= 3;
            int var5 = this.anIntArray1325[var1];
            this.aLong1332 += (long)var5 * (long)(this.anInt1327 - var6);
            this.anInt1327 = var6;
            this.aClass116_Sub14_1329.position += var4 * -184175589;
            return 2;
         } else {
            this.aClass116_Sub14_1329.position += var4 * -184175589;
            return 3;
         }
      } else {
         byte var3 = aByteArray1330[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.aClass116_Sub14_1329.readSignedByte(1708176767) << 8;
         }

         if(var3 >= 2) {
            var4 |= this.aClass116_Sub14_1329.readSignedByte(1708176767) << 16;
         }

         return var4;
      }
   }

   Class92(byte[] var1) {
      this.method1202(var1);
   }

   void method1252() {
      this.aClass116_Sub14_1329.position = 184175589;
   }

   void method1255(int var1) {
      int var2 = this.aClass116_Sub14_1329.method2116((byte)-36);
      this.anIntArray1325[var1] += var2;
   }

}
