package com.jagex;

public class Class116_Sub19 extends Node {

   int anInt2110;
   short[] aShortArray2111 = new short[128];
   byte[] aByteArray2113 = new byte[128];
   Class126[] aClass126Array2114 = new Class126[128];
   byte[] aByteArray2115 = new byte[128];
   byte[] aByteArray2116 = new byte[128];
   int[] anIntArray2118 = new int[128];
   Class116_Sub2_Sub1[] aClass116_Sub2_Sub1Array2120 = new Class116_Sub2_Sub1[128];

   Class116_Sub19(byte[] var1) {
      Buffer var3 = new Buffer(var1);

      int var4;
      for(var4 = 0; var3.payload[var4 + 314639891 * var3.position] != 0; ++var4) {
         ;
      }

      byte[] var10 = new byte[var4];

      int var9;
      for(var9 = 0; var9 < var4; ++var9) {
         var10[var9] = var3.readUnsignedByte(-39168129);
      }

      var3.position += -184175589;
      ++var4;
      var9 = 314639891 * var3.position;
      var3.position += var4 * -184175589;

      int var13;
      for(var13 = 0; var3.payload[var13 + 314639891 * var3.position] != 0; ++var13) {
         ;
      }

      byte[] var14 = new byte[var13];

      int var12;
      for(var12 = 0; var12 < var13; ++var12) {
         var14[var12] = var3.readUnsignedByte(886076857);
      }

      var3.position += -184175589;
      ++var13;
      var12 = 314639891 * var3.position;
      var3.position += var13 * -184175589;

      int var17;
      for(var17 = 0; var3.payload[314639891 * var3.position + var17] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      for(int var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var3.readUnsignedByte(124539661);
      }

      var3.position += -184175589;
      ++var17;
      byte[] var45 = new byte[var17];
      int var23;
      int var24;
      if(var17 > 1) {
         var45[1] = 1;
         int var25 = 1;
         var23 = 2;

         for(var24 = 2; var24 < var17; ++var24) {
            int var11 = var3.readSignedByte(1708176767);
            if(0 == var11) {
               var25 = var23++;
            } else {
               if(var11 <= var25) {
                  --var11;
               }

               var25 = var11;
            }

            var45[var24] = (byte)var25;
         }
      } else {
         var23 = var17;
      }

      Class126[] var48 = new Class126[var23];

      Class126 var42;
      for(var24 = 0; var24 < var48.length; ++var24) {
         var42 = var48[var24] = new Class126();
         int var21 = var3.readSignedByte(1708176767);
         if(var21 > 0) {
            var42.aByteArray1557 = new byte[var21 * 2];
         }

         var21 = var3.readSignedByte(1708176767);
         if(var21 > 0) {
            var42.aByteArray1563 = new byte[2 + 2 * var21];
            var42.aByteArray1563[1] = 64;
         }
      }

      var24 = var3.readSignedByte(1708176767);
      byte[] var43 = var24 > 0?new byte[2 * var24]:null;
      var24 = var3.readSignedByte(1708176767);
      byte[] var46 = var24 > 0?new byte[var24 * 2]:null;

      int var28;
      for(var28 = 0; var3.payload[314639891 * var3.position + var28] != 0; ++var28) {
         ;
      }

      byte[] var29 = new byte[var28];

      int var22;
      for(var22 = 0; var22 < var28; ++var22) {
         var29[var22] = var3.readUnsignedByte(159314733);
      }

      var3.position += -184175589;
      ++var28;
      var22 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var22 += var3.readSignedByte(1708176767);
         this.aShortArray2111[var20] = (short)var22;
      }

      var22 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var22 += var3.readSignedByte(1708176767);
         this.aShortArray2111[var20] = (short)(this.aShortArray2111[var20] + (var22 << 8));
      }

      var20 = 0;
      int var30 = 0;
      int var32 = 0;

      int var31;
      for(var31 = 0; var31 < 128; ++var31) {
         if(var20 == 0) {
            if(var30 < var29.length) {
               var20 = var29[var30++];
            } else {
               var20 = -1;
            }

            var32 = var3.method2116((byte)-25);
         }

         this.aShortArray2111[var31] = (short)(this.aShortArray2111[var31] + ((var32 - 1 & 2) << 14));
         this.anIntArray2118[var31] = var32;
         --var20;
      }

      var20 = 0;
      var30 = 0;
      var31 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if(this.anIntArray2118[var27] != 0) {
            if(var20 == 0) {
               if(var30 < var10.length) {
                  var20 = var10[var30++];
               } else {
                  var20 = -1;
               }

               var31 = var3.payload[var9++] - 1;
            }

            this.aByteArray2115[var27] = (byte)var31;
            --var20;
         }
      }

      var20 = 0;
      var30 = 0;
      var27 = 0;

      for(int var26 = 0; var26 < 128; ++var26) {
         if(0 != this.anIntArray2118[var26]) {
            if(var20 == 0) {
               if(var30 < var14.length) {
                  var20 = var14[var30++];
               } else {
                  var20 = -1;
               }

               var27 = var3.payload[var12++] + 16 << 2;
            }

            this.aByteArray2113[var26] = (byte)var27;
            --var20;
         }
      }

      var20 = 0;
      var30 = 0;
      Class126 var49 = null;

      int var16;
      for(var16 = 0; var16 < 128; ++var16) {
         if(0 != this.anIntArray2118[var16]) {
            if(var20 == 0) {
               var49 = var48[var45[var30]];
               if(var30 < var18.length) {
                  var20 = var18[var30++];
               } else {
                  var20 = -1;
               }
            }

            this.aClass126Array2114[var16] = var49;
            --var20;
         }
      }

      var20 = 0;
      var30 = 0;
      var16 = 0;

      int var6;
      for(var6 = 0; var6 < 128; ++var6) {
         if(var20 == 0) {
            if(var30 < var29.length) {
               var20 = var29[var30++];
            } else {
               var20 = -1;
            }

            if(this.anIntArray2118[var6] > 0) {
               var16 = var3.readSignedByte(1708176767) + 1;
            }
         }

         this.aByteArray2116[var6] = (byte)var16;
         --var20;
      }

      this.anInt2110 = (var3.readSignedByte(1708176767) + 1) * -1206623231;

      Class126 var5;
      int var8;
      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(null != var5.aByteArray1557) {
            for(var8 = 1; var8 < var5.aByteArray1557.length; var8 += 2) {
               var5.aByteArray1557[var8] = var3.readUnsignedByte(-1639216151);
            }
         }

         if(var5.aByteArray1563 != null) {
            for(var8 = 3; var8 < var5.aByteArray1563.length - 2; var8 += 2) {
               var5.aByteArray1563[var8] = var3.readUnsignedByte(-1346957817);
            }
         }
      }

      if(var43 != null) {
         for(var6 = 1; var6 < var43.length; var6 += 2) {
            var43[var6] = var3.readUnsignedByte(-1036016072);
         }
      }

      if(null != var46) {
         for(var6 = 1; var6 < var46.length; var6 += 2) {
            var46[var6] = var3.readUnsignedByte(1350200542);
         }
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(null != var5.aByteArray1563) {
            var22 = 0;

            for(var8 = 2; var8 < var5.aByteArray1563.length; var8 += 2) {
               var22 = var22 + 1 + var3.readSignedByte(1708176767);
               var5.aByteArray1563[var8] = (byte)var22;
            }
         }
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(var5.aByteArray1557 != null) {
            var22 = 0;

            for(var8 = 2; var8 < var5.aByteArray1557.length; var8 += 2) {
               var22 = 1 + var22 + var3.readSignedByte(1708176767);
               var5.aByteArray1557[var8] = (byte)var22;
            }
         }
      }

      byte var2;
      int var7;
      int var33;
      int var34;
      int var35;
      int var36;
      int var38;
      byte var41;
      if(var43 != null) {
         var22 = var3.readSignedByte(1708176767);
         var43[0] = (byte)var22;

         for(var6 = 2; var6 < var43.length; var6 += 2) {
            var22 = 1 + var22 + var3.readSignedByte(1708176767);
            var43[var6] = (byte)var22;
         }

         var41 = var43[0];
         byte var39 = var43[1];

         for(var8 = 0; var8 < var41; ++var8) {
            this.aByteArray2116[var8] = (byte)(32 + this.aByteArray2116[var8] * var39 >> 6);
         }

         for(var8 = 2; var8 < var43.length; var8 += 2) {
            var2 = var43[var8];
            byte var15 = var43[1 + var8];
            var7 = (var2 - var41) * var39 + (var2 - var41) / 2;

            for(var33 = var41; var33 < var2; ++var33) {
               var35 = var2 - var41;
               var34 = var7 >>> 31;
               var36 = (var34 + var7) / var35 - var34;
               this.aByteArray2116[var33] = (byte)(var36 * this.aByteArray2116[var33] + 32 >> 6);
               var7 += var15 - var39;
            }

            var41 = var2;
            var39 = var15;
         }

         for(var38 = var41; var38 < 128; ++var38) {
            this.aByteArray2116[var38] = (byte)(32 + var39 * this.aByteArray2116[var38] >> 6);
         }

         var42 = null;
      }

      if(var46 != null) {
         var22 = var3.readSignedByte(1708176767);
         var46[0] = (byte)var22;

         for(var6 = 2; var6 < var46.length; var6 += 2) {
            var22 = 1 + var22 + var3.readSignedByte(1708176767);
            var46[var6] = (byte)var22;
         }

         var41 = var46[0];
         int var40 = var46[1] << 1;

         for(var8 = 0; var8 < var41; ++var8) {
            var38 = (this.aByteArray2113[var8] & 255) + var40;
            if(var38 < 0) {
               var38 = 0;
            }

            if(var38 > 128) {
               var38 = 128;
            }

            this.aByteArray2113[var8] = (byte)var38;
         }

         int var44;
         for(var8 = 2; var8 < var46.length; var8 += 2) {
            var2 = var46[var8];
            var44 = var46[var8 + 1] << 1;
            var7 = var40 * (var2 - var41) + (var2 - var41) / 2;

            for(var33 = var41; var33 < var2; ++var33) {
               var35 = var2 - var41;
               var34 = var7 >>> 31;
               var36 = (var34 + var7) / var35 - var34;
               int var37 = var36 + (this.aByteArray2113[var33] & 255);
               if(var37 < 0) {
                  var37 = 0;
               }

               if(var37 > 128) {
                  var37 = 128;
               }

               this.aByteArray2113[var33] = (byte)var37;
               var7 += var44 - var40;
            }

            var41 = var2;
            var40 = var44;
         }

         for(var38 = var41; var38 < 128; ++var38) {
            var44 = var40 + (this.aByteArray2113[var38] & 255);
            if(var44 < 0) {
               var44 = 0;
            }

            if(var44 > 128) {
               var44 = 128;
            }

            this.aByteArray2113[var38] = (byte)var44;
         }

         Object var47 = null;
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var48[var6].anInt1558 = var3.readSignedByte(1708176767) * -1585241175;
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(null != var5.aByteArray1557) {
            var5.anInt1559 = var3.readSignedByte(1708176767) * 381061379;
         }

         if(var5.aByteArray1563 != null) {
            var5.anInt1560 = var3.readSignedByte(1708176767) * -1446215299;
         }

         if(141570201 * var5.anInt1558 > 0) {
            var5.anInt1561 = var3.readSignedByte(1708176767) * -738799001;
         }
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var48[var6].anInt1565 = var3.readSignedByte(1708176767) * -832748823;
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(var5.anInt1565 * 167621977 > 0) {
            var5.anInt1562 = var3.readSignedByte(1708176767) * -1580140743;
         }
      }

      for(var6 = 0; var6 < var23; ++var6) {
         var5 = var48[var6];
         if(-1320499447 * var5.anInt1562 > 0) {
            var5.anInt1564 = var3.readSignedByte(1708176767) * 1335936269;
         }
      }

   }

   void method2325(int var1) {
      this.anIntArray2118 = null;
   }

   boolean method2327(Class14 var1, byte[] var2, int[] var3, int var4) {
      boolean var5 = true;
      int var6 = 0;
      Class116_Sub2_Sub1 var9 = null;

      for(int var7 = 0; var7 < 128; ++var7) {
         if(null == var2 || var2[var7] != 0) {
            int var8 = this.anIntArray2118[var7];
            if(0 != var8) {
               if(var8 != var6) {
                  var6 = var8--;
                  if((var8 & 1) == 0) {
                     var9 = var1.method240(var8 >> 2, var3, (short)-19012);
                  } else {
                     var9 = var1.method244(var8 >> 2, var3, -885765644);
                  }

                  if(var9 == null) {
                     var5 = false;
                  }
               }

               if(null != var9) {
                  this.aClass116_Sub2_Sub1Array2120[var7] = var9;
                  this.anIntArray2118[var7] = 0;
               }
            }
         }
      }

      return var5;
   }

}
