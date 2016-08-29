package com.jagex;

public class Class116_Sub18 extends Node {

   Class127 aClass127_2107;
   byte[] aByteArray2108;


   void method2315() {
      if(this.aClass127_2107 == null) {
         this.aClass127_2107 = new Class127(16);
         int[] var3 = new int[16];
         int[] var5 = new int[16];
         var5[9] = 128;
         var3[9] = 128;
         Class92 var1 = new Class92(this.aByteArray2108);
         int var2 = var1.method1205();

         int var4;
         for(var4 = 0; var4 < var2; ++var4) {
            var1.method1206(var4);
            var1.method1255(var4);
            var1.method1207(var4);
         }

         while(true) {
            var4 = var1.method1213();
            int var8 = var1.anIntArray1325[var4];

            while(var1.anIntArray1325[var4] == var8) {
               var1.method1206(var4);
               int var9 = var1.method1223(var4);
               if(var9 == 1) {
                  var1.method1252();
                  var1.method1207(var4);
                  if(var1.method1216()) {
                     return;
                  }
                  break;
               }

               int var6 = var9 & 240;
               int var10;
               int var12;
               int var13;
               if(var6 == 176) {
                  var10 = var9 & 15;
                  var13 = var9 >> 8 & 127;
                  var12 = var9 >> 16 & 127;
                  if(var13 == 0) {
                     var3[var10] = (var3[var10] & -2080769) + (var12 << 14);
                  }

                  if(var13 == 32) {
                     var3[var10] = (var3[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var6 == 192) {
                  var10 = var9 & 15;
                  var13 = var9 >> 8 & 127;
                  var5[var10] = var3[var10] + var13;
               }

               if(var6 == 144) {
                  var10 = var9 & 15;
                  var13 = var9 >> 8 & 127;
                  var12 = var9 >> 16 & 127;
                  if(var12 > 0) {
                     int var11 = var5[var10];
                     Class116_Sub22 var14 = (Class116_Sub22)this.aClass127_2107.method1658((long)var11);
                     if(var14 == null) {
                        var14 = new Class116_Sub22(new byte[128]);
                        this.aClass127_2107.method1666(var14, (long)var11);
                     }

                     var14.aByteArray2143[var13] = 1;
                  }
               }

               var1.method1255(var4);
               var1.method1207(var4);
            }
         }
      }
   }

   Class116_Sub18(Buffer var1) {
      var1.position = (var1.payload.length - 3) * -184175589;
      int var2 = var1.readSignedByte(1708176767);
      int var3 = var1.readShort(-118457989);
      int var24 = 14 + var2 * 10;
      var1.position = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var19 = 0;
      int var25 = 0;
      int var4 = 0;
      int var15 = 0;

      int var11;
      int var12;
      while(var15 < var2) {
         var12 = -1;

         while(true) {
            var11 = var1.readSignedByte(1708176767);
            if(var11 != var12) {
               ++var24;
            }

            var12 = var11 & 15;
            if(var11 == 7) {
               ++var15;
               break;
            }

            if(var11 == 23) {
               ++var5;
            } else if(var12 == 0) {
               ++var7;
            } else if(var12 == 1) {
               ++var8;
            } else if(var12 == 2) {
               ++var6;
            } else if(var12 == 3) {
               ++var9;
            } else if(var12 == 4) {
               ++var19;
            } else if(var12 == 5) {
               ++var25;
            } else {
               if(var12 != 6) {
                  throw new RuntimeException();
               }

               ++var4;
            }
         }
      }

      var24 += 5 * var5;
      var24 += 2 * (var7 + var8 + var6 + var9 + var25);
      var24 += var19 + var4;
      var15 = var1.position * 314639891;
      var12 = var2 + var5 + var6 + var7 + var8 + var9 + var19 + var25 + var4;

      for(var11 = 0; var11 < var12; ++var11) {
         var1.method2116((byte)-84);
      }

      var24 += var1.position * 314639891 - var15;
      var11 = var1.position * 314639891;
      int var27 = 0;
      int var28 = 0;
      int var16 = 0;
      int var29 = 0;
      int var30 = 0;
      int var52 = 0;
      int var32 = 0;
      int var39 = 0;
      int var40 = 0;
      int var34 = 0;
      int var35 = 0;
      int var36 = 0;
      int var21 = 0;

      int var37;
      for(var37 = 0; var37 < var6; ++var37) {
         var21 = var21 + var1.readSignedByte(1708176767) & 127;
         if(var21 != 0 && var21 != 32) {
            if(var21 == 1) {
               ++var27;
            } else if(var21 == 33) {
               ++var28;
            } else if(var21 == 7) {
               ++var16;
            } else if(var21 == 39) {
               ++var29;
            } else if(var21 == 10) {
               ++var30;
            } else if(var21 == 42) {
               ++var52;
            } else if(var21 == 99) {
               ++var32;
            } else if(var21 == 98) {
               ++var39;
            } else if(var21 == 101) {
               ++var40;
            } else if(var21 == 100) {
               ++var34;
            } else if(var21 != 64 && var21 != 65 && var21 != 120 && var21 != 121 && var21 != 123) {
               ++var36;
            } else {
               ++var35;
            }
         } else {
            ++var4;
         }
      }

      var37 = 0;
      int var13 = var1.position * 314639891;
      var1.position += var35 * -184175589;
      int var20 = var1.position * 314639891;
      var1.position += var25 * -184175589;
      int var23 = var1.position * 314639891;
      var1.position += var19 * -184175589;
      int var42 = var1.position * 314639891;
      var1.position += var9 * -184175589;
      int var44 = var1.position * 314639891;
      var1.position += var27 * -184175589;
      int var43 = var1.position * 314639891;
      var1.position += var16 * -184175589;
      int var45 = var1.position * 314639891;
      var1.position += var30 * -184175589;
      int var46 = var1.position * 314639891;
      var1.position += (var7 + var8 + var25) * -184175589;
      int var47 = var1.position * 314639891;
      var1.position += var7 * -184175589;
      int var53 = var1.position * 314639891;
      var1.position += var36 * -184175589;
      int var48 = var1.position * 314639891;
      var1.position += var8 * -184175589;
      int var64 = var1.position * 314639891;
      var1.position += var28 * -184175589;
      int var49 = var1.position * 314639891;
      var1.position += var29 * -184175589;
      int var51 = var1.position * 314639891;
      var1.position += var52 * -184175589;
      int var50 = var1.position * 314639891;
      var1.position += var4 * -184175589;
      int var18 = var1.position * 314639891;
      var1.position += var9 * -184175589;
      int var56 = var1.position * 314639891;
      var1.position += var32 * -184175589;
      int var38 = var1.position * 314639891;
      var1.position += var39 * -184175589;
      int var41 = var1.position * 314639891;
      var1.position += var40 * -184175589;
      int var57 = var1.position * 314639891;
      var1.position += var34 * -184175589;
      int var58 = var1.position * 314639891;
      var1.position += var5 * -552526767;
      this.aByteArray2108 = new byte[var24];
      Buffer var17 = new Buffer(this.aByteArray2108);
      var17.writeInt(1297377380, (byte)118);
      var17.writeInt(6, (byte)49);
      var17.writeShort(var2 > 1 ? 1 : 0, -1645400134);
      var17.writeShort(var2, -1926535990);
      var17.writeShort(var3, -1927426386);
      var1.position = var15 * -184175589;
      int var55 = 0;
      int var66 = 0;
      int var54 = 0;
      int var31 = 0;
      int var61 = 0;
      int var22 = 0;
      int var26 = 0;
      int[] var60 = new int[128];
      var21 = 0;
      int var62 = 0;

      while(var62 < var2) {
         var17.writeInt(1297379947, (byte)36);
         var17.position += -736702356;
         int var59 = var17.position * 314639891;
         int var33 = -1;

         while(true) {
            int var63 = var1.method2116((byte)-87);
            var17.method2003(var63, 81583837);
            int var65 = var1.payload[var37++] & 255;
            boolean var10 = var65 != var33;
            var33 = var65 & 15;
            if(var65 == 7) {
               if(var10) {
                  var17.writeByte(255, -1267680672);
               }

               var17.writeByte(47, 95392566);
               var17.writeByte(0, 13963248);
               var17.method1999(var17.position * 314639891 - var59, 2098819522);
               ++var62;
               break;
            }

            if(var65 == 23) {
               if(var10) {
                  var17.writeByte(255, 687106849);
               }

               var17.writeByte(81, -385312648);
               var17.writeByte(3, 389672166);
               var17.writeByte(var1.payload[var58++], 569005555);
               var17.writeByte(var1.payload[var58++], 238129847);
               var17.writeByte(var1.payload[var58++], -1628475621);
            } else {
               var55 ^= var65 >> 4;
               if(var33 == 0) {
                  if(var10) {
                     var17.writeByte(144 + var55, -1577306104);
                  }

                  var66 += var1.payload[var46++];
                  var54 += var1.payload[var47++];
                  var17.writeByte(var66 & 127, -1641256652);
                  var17.writeByte(var54 & 127, -439051844);
               } else if(var33 == 1) {
                  if(var10) {
                     var17.writeByte(128 + var55, 233994336);
                  }

                  var66 += var1.payload[var46++];
                  var31 += var1.payload[var48++];
                  var17.writeByte(var66 & 127, -1603936239);
                  var17.writeByte(var31 & 127, -1366460);
               } else if(var33 == 2) {
                  if(var10) {
                     var17.writeByte(176 + var55, 79410478);
                  }

                  var21 = var21 + var1.payload[var11++] & 127;
                  var17.writeByte(var21, -971185028);
                  byte var14;
                  if(var21 != 0 && var21 != 32) {
                     if(var21 == 1) {
                        var14 = var1.payload[var44++];
                     } else if(var21 == 33) {
                        var14 = var1.payload[var64++];
                     } else if(var21 == 7) {
                        var14 = var1.payload[var43++];
                     } else if(var21 == 39) {
                        var14 = var1.payload[var49++];
                     } else if(var21 == 10) {
                        var14 = var1.payload[var45++];
                     } else if(var21 == 42) {
                        var14 = var1.payload[var51++];
                     } else if(var21 == 99) {
                        var14 = var1.payload[var56++];
                     } else if(var21 == 98) {
                        var14 = var1.payload[var38++];
                     } else if(var21 == 101) {
                        var14 = var1.payload[var41++];
                     } else if(var21 == 100) {
                        var14 = var1.payload[var57++];
                     } else if(var21 != 64 && var21 != 65 && var21 != 120 && var21 != 121 && var21 != 123) {
                        var14 = var1.payload[var53++];
                     } else {
                        var14 = var1.payload[var13++];
                     }
                  } else {
                     var14 = var1.payload[var50++];
                  }

                  int var67 = var14 + var60[var21];
                  var60[var21] = var67;
                  var17.writeByte(var67 & 127, -1345158410);
               } else if(var33 == 3) {
                  if(var10) {
                     var17.writeByte(224 + var55, -1672985738);
                  }

                  var61 += var1.payload[var18++];
                  var61 += var1.payload[var42++] << 7;
                  var17.writeByte(var61 & 127, 517482406);
                  var17.writeByte(var61 >> 7 & 127, 801316399);
               } else if(var33 == 4) {
                  if(var10) {
                     var17.writeByte(208 + var55, -1061007105);
                  }

                  var22 += var1.payload[var23++];
                  var17.writeByte(var22 & 127, -798147337);
               } else if(var33 == 5) {
                  if(var10) {
                     var17.writeByte(160 + var55, -805306331);
                  }

                  var66 += var1.payload[var46++];
                  var26 += var1.payload[var20++];
                  var17.writeByte(var66 & 127, -2094447643);
                  var17.writeByte(var26 & 127, -1475696659);
               } else {
                  if(var33 != 6) {
                     throw new RuntimeException();
                  }

                  if(var10) {
                     var17.writeByte(192 + var55, 745422771);
                  }

                  var17.writeByte(var1.payload[var50++], -1191781807);
               }
            }
         }
      }

   }

   void method2320() {
      this.aClass127_2107 = null;
   }

   public static Class116_Sub18 method2321(Class99 var0, int var1, int var2) {
      byte[] var3 = var0.method1394(var1, var2, -1266344289);
      return var3 == null?null:new Class116_Sub18(new Buffer(var3));
   }

}
