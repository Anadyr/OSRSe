package com.jagex;
import java.io.File;
import java.io.RandomAccessFile;

public abstract class RSIndex {

   Class113[] aClass113Array1382;
   public int anInt1383;
   int[] anIntArray1384;
   Class113 aClass113_1385;
   int[] anIntArray1386;
   static Class60 aClass60_1387 = new Class60();
   boolean aBool1388;
   int[][] anIntArrayArray1389;
   int[] anIntArray1390;
   int[] anIntArray1391;
   Object[] anObjectArray1392;
   Object[][] anObjectArrayArray1393;
   int[][] anIntArrayArray1394;
   int[] anIntArray1395;
   boolean aBool1396;
   int anInt1397;
   static int anInt1398 = 0;

   RSIndex(boolean var1, boolean var2) {
      this.aBool1396 = var1;
      this.aBool1388 = var2;
   }

   void method1350(int var1, byte var2) {}

   public byte[] getFileData(int var1, int var2, int[] var3, int var4) {
      if(var1 >= 0 && var1 < this.anObjectArrayArray1393.length && null != this.anObjectArrayArray1393[var1] && var2 >= 0 && var2 < this.anObjectArrayArray1393[var1].length) {
         if(null == this.anObjectArrayArray1393[var1][var2]) {
            boolean sucessful = this.extract(var1, var3, -1742772819);
            if(!sucessful) {
               this.method1359(var1, -1678922494);
               sucessful = this.extract(var1, var3, 1114184606);
               if(!sucessful) {
                  return null;
               }
            }
         }

         byte[] var6 = Class116_Sub23_Sub16_Sub3.getDataFrom(this.anObjectArrayArray1393[var1][var2], false, (byte) -78);
         if(this.aBool1388) {
            this.anObjectArrayArray1393[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   void method1353(byte[] var1, int var2) {
      int var3 = var1.length;
      int var8 = Class69.method987(var1, 0, var3, -2027077959);
      this.anInt1383 = var8 * 1019466219;
      Packet var4 = new Packet(Flo.decompress(var1, -1279929989));
      int var7 = var4.readSignedByte(1708176767);
      if(var7 >= 5 && var7 <= 7) {
         if(var7 >= 6) {
            var4.readInt(-603881853);
         }

         int var13 = var4.readSignedByte(1708176767);
         if(var7 >= 7) {
            this.anInt1397 = var4.method2077((byte)-36) * -2013390665;
         } else {
            this.anInt1397 = var4.readUnsignedShort(2074262798) * -2013390665;
         }

         int var15 = 0;
         int var6 = -1;
         this.anIntArray1391 = new int[this.anInt1397 * -2084813561];
         int var5;
         if(var7 >= 7) {
            for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
               this.anIntArray1391[var5] = var15 += var4.method2077((byte)62);
               if(this.anIntArray1391[var5] > var6) {
                  var6 = this.anIntArray1391[var5];
               }
            }
         } else {
            for(var5 = 0; var5 < -2084813561 * this.anInt1397; ++var5) {
               this.anIntArray1391[var5] = var15 += var4.readUnsignedShort(1372207019);
               if(this.anIntArray1391[var5] > var6) {
                  var6 = this.anIntArray1391[var5];
               }
            }
         }

         this.anIntArray1386 = new int[var6 + 1];
         this.anIntArray1395 = new int[var6 + 1];
         this.anIntArray1390 = new int[1 + var6];
         this.anIntArrayArray1389 = new int[var6 + 1][];
         this.anObjectArray1392 = new Object[1 + var6];
         this.anObjectArrayArray1393 = new Object[1 + var6][];
         if(0 != var13) {
            this.anIntArray1384 = new int[var6 + 1];

            for(var5 = 0; var5 < -2084813561 * this.anInt1397; ++var5) {
               this.anIntArray1384[this.anIntArray1391[var5]] = var4.readInt(-1193091773);
            }

            this.aClass113_1385 = new Class113(this.anIntArray1384);
         }

         for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
            this.anIntArray1386[this.anIntArray1391[var5]] = var4.readInt(-872579930);
         }

         for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
            this.anIntArray1395[this.anIntArray1391[var5]] = var4.readInt(-1935832824);
         }

         for(var5 = 0; var5 < -2084813561 * this.anInt1397; ++var5) {
            this.anIntArray1390[this.anIntArray1391[var5]] = var4.readUnsignedShort(1300170874);
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var14;
         if(var7 >= 7) {
            for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
               var9 = this.anIntArray1391[var5];
               var10 = this.anIntArray1390[var9];
               var15 = 0;
               var11 = -1;
               this.anIntArrayArray1389[var9] = new int[var10];

               for(var14 = 0; var14 < var10; ++var14) {
                  var12 = this.anIntArrayArray1389[var9][var14] = var15 += var4.method2077((byte)6);
                  if(var12 > var11) {
                     var11 = var12;
                  }
               }

               this.anObjectArrayArray1393[var9] = new Object[var11 + 1];
            }
         } else {
            for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
               var9 = this.anIntArray1391[var5];
               var10 = this.anIntArray1390[var9];
               var15 = 0;
               var11 = -1;
               this.anIntArrayArray1389[var9] = new int[var10];

               for(var14 = 0; var14 < var10; ++var14) {
                  var12 = this.anIntArrayArray1389[var9][var14] = var15 += var4.readUnsignedShort(1163052626);
                  if(var12 > var11) {
                     var11 = var12;
                  }
               }

               this.anObjectArrayArray1393[var9] = new Object[1 + var11];
            }
         }

         if(var13 != 0) {
            this.anIntArrayArray1394 = new int[1 + var6][];
            this.aClass113Array1382 = new Class113[1 + var6];

            for(var5 = 0; var5 < this.anInt1397 * -2084813561; ++var5) {
               var9 = this.anIntArray1391[var5];
               var10 = this.anIntArray1390[var9];
               this.anIntArrayArray1394[var9] = new int[this.anObjectArrayArray1393[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.anIntArrayArray1394[var9][this.anIntArrayArray1389[var9][var11]] = var4.readInt(-1025552826);
               }

               this.aClass113Array1382[var9] = new Class113(this.anIntArrayArray1394[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean method1355(short var1) {
      boolean var2 = true;

      for(int var4 = 0; var4 < this.anIntArray1391.length; ++var4) {
         int var3 = this.anIntArray1391[var4];
         if(null == this.anObjectArray1392[var3]) {
            this.method1359(var3, -921963201);
            if(this.anObjectArray1392[var3] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public byte[] method1356(int var1, int var2) {
      if(1 == this.anObjectArrayArray1393.length) {
         return this.getFiles(0, var1, 172935968);
      } else if(1 != this.anObjectArrayArray1393[var1].length) {
         throw new RuntimeException();
      } else {
         return this.getFiles(var1, 0, -279266279);
      }
   }

   void method1359(int var1, int var2) {}

   public int method1361(int var1, int var2) {
      return this.anObjectArrayArray1393[var1].length;
   }

   public void method1364(byte var1) {
      for(int var2 = 0; var2 < this.anObjectArrayArray1393.length; ++var2) {
         if(null != this.anObjectArrayArray1393[var2]) {
            for(int var3 = 0; var3 < this.anObjectArrayArray1393[var2].length; ++var3) {
               this.anObjectArrayArray1393[var2][var3] = null;
            }
         }
      }

   }

   boolean extract(int id, int[] var2, int var3) {
      if(this.anObjectArray1392[id] == null) {
         return false;
      } else {
         int var4 = this.anIntArray1390[id];
         int[] var5 = this.anIntArrayArray1389[id];
         Object[] var6 = this.anObjectArrayArray1393[id];
         boolean var7 = true;
         for(int var8 = 0; var8 < var4; ++var8) {
            if(var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }
         if(var7) {
            return true;
         } else {
            byte[] payload;
            if(null != var2 && (var2[0] != 0 || 0 != var2[1] || 0 != var2[2] || 0 != var2[3])) {
               payload = Class116_Sub23_Sub16_Sub3.getDataFrom(this.anObjectArray1392[id], true, (byte) 5);
               Packet packet = new Packet(payload);
               packet.decipherXTEA(var2, 5, packet.payload.length, -1753970900);
            } else {
               payload = Class116_Sub23_Sub16_Sub3.getDataFrom(this.anObjectArray1392[id], false, (byte) -91);
            }

            byte[] data = Flo.decompress(payload, 420101878);
            if(this.aBool1396) {
               this.anObjectArray1392[id] = null;
            }

            if(var4 > 1) {
               int var10 = data.length;
               --var10;
               int var11 = data[var10] & 255;
               var10 -= var11 * var4 * 4;
               Packet var12 = new Packet(data);
               int[] var14 = new int[var4];
               var12.position = -184175589 * var10;

               int var15;
               int var16;
               for(int var13 = 0; var13 < var11; ++var13) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.readInt(-2113247787);
                     var14[var16] += var15;
                  }
               }

               byte[][] var21 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var21[var15] = new byte[var14[var15]];
                  var14[var15] = 0;
               }
               var12.position = var10 * -184175589;
               var15 = 0;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var18 = 0;

                  for(int var17 = 0; var17 < var4; ++var17) {
                     var18 += var12.readInt(-1036740914);
                     System.arraycopy(data, var15, var21[var17], var14[var17], var18);
                     var14[var17] += var18;
                     var15 += var18;
                  }
               }
               for(var16 = 0; var16 < var4; ++var16) {
                  if(!this.aBool1388) {
                     var6[var5[var16]] = Class116_Sub8.method1944(var21[var16], false, (byte)28);
                  } else {
                     var6[var5[var16]] = var21[var16];
                  }
               }
            } else if(!this.aBool1388) {
               var6[var5[0]] = Class116_Sub8.method1944(data, false, (byte)-13);
            } else {
               var6[var5[0]] = data;
            }

            return true;
         }
      }
   }

   public int getFileIdForName(String name, int var2) {
      name = name.toLowerCase();
      return this.aClass113_1385.getFileId(Class116_Sub23_Sub4.charToIntCipher(name, -2074551651));
   }

   public int method1367(int var1, String var2, int var3) {
      var2 = var2.toLowerCase();
      return this.aClass113Array1382[var1].getFileId(Class116_Sub23_Sub4.charToIntCipher(var2, -1883478772));
   }

   public boolean method1369(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.aClass113_1385.getFileId(Class116_Sub23_Sub4.charToIntCipher(var1, -2031069170));
      int var5 = this.aClass113Array1382[var4].getFileId(Class116_Sub23_Sub4.charToIntCipher(var2, -975585842));
      return this.method1373(var4, var5, (byte)1);
   }

   public boolean method1370(String var1, byte var2) {
      int var3 = this.getFileIdForName("", 56247406);
      return var3 != -1?this.method1369("", var1, 1724731704):this.method1369(var1, "", 1404817582);
   }

   public void method1371(String var1, byte var2) {
      var1 = var1.toLowerCase();
      int var3 = this.aClass113_1385.getFileId(Class116_Sub23_Sub4.charToIntCipher(var1, -1576375843));
      if(var3 >= 0) {
         this.method1350(var3, (byte)1);
      }
   }

   public boolean method1373(int var1, int var2, byte var3) {
      if(var1 >= 0 && var1 < this.anObjectArrayArray1393.length && null != this.anObjectArrayArray1393[var1] && var2 >= 0 && var2 < this.anObjectArrayArray1393[var1].length) {
         if(null != this.anObjectArrayArray1393[var1][var2]) {
            return true;
         } else if(null != this.anObjectArray1392[var1]) {
            return true;
         } else {
            this.method1359(var1, -1273643001);
            return this.anObjectArray1392[var1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] getFilesFromName(String var1, String var2, int var3) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.aClass113_1385.getFileId(Class116_Sub23_Sub4.charToIntCipher(var1, -1262436237));
      int var5 = this.aClass113Array1382[var4].getFileId(Class116_Sub23_Sub4.charToIntCipher(var2, -1479304712));
      return this.getFiles(var4, var5, -1505410140);
   }

   public byte[] method1379(int var1, int var2, int var3) {
      if(var1 >= 0 && var1 < this.anObjectArrayArray1393.length && null != this.anObjectArrayArray1393[var1] && var2 >= 0 && var2 < this.anObjectArrayArray1393[var1].length) {
         if(this.anObjectArrayArray1393[var1][var2] == null) {
            boolean var4 = this.extract(var1, (int[]) null, 844909215);
            if(!var4) {
               this.method1359(var1, -2032229340);
               var4 = this.extract(var1, (int[]) null, 1460409666);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = Class116_Sub23_Sub16_Sub3.getDataFrom(this.anObjectArrayArray1393[var1][var2], false, (byte) 1);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] getFiles(int parentFile, int subFiles, int var3) {
      return this.getFileData(parentFile, subFiles, (int[]) null, 2093855815);
   }

   public byte[] method1395(int var1, byte var2) {
      if(1 == this.anObjectArrayArray1393.length) {
         return this.method1379(0, var1, -636196674);
      } else if(1 != this.anObjectArrayArray1393[var1].length) {
         throw new RuntimeException();
      } else {
         return this.method1379(var1, 0, 2088191666);
      }
   }

   static boolean testFile(File ourFile, boolean delete, int var2) {
      try {
         RandomAccessFile test = new RandomAccessFile(ourFile, "rw");
         int header = test.read();
         test.seek(0L);
         test.write(header);
         test.seek(0L);
         test.close();
         if(delete) {
            ourFile.delete();
         }

         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   public int[] method1404(int var1, byte var2) {
      return this.anIntArrayArray1389[var1];
   }

   public boolean method1420(int var1, int var2) {
      if(null != this.anObjectArray1392[var1]) {
         return true;
      } else {
         this.method1359(var1, -1604977202);
         return this.anObjectArray1392[var1] != null;
      }
   }

   public void method1421(int var1, int var2) {
      for(int var3 = 0; var3 < this.anObjectArrayArray1393[var1].length; ++var3) {
         this.anObjectArrayArray1393[var1][var3] = null;
      }

   }

   public int method1424(int var1) {
      return this.anObjectArrayArray1393.length;
   }
}
