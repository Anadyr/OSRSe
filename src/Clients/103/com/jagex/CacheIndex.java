package com.jagex;
import java.awt.datatransfer.Clipboard;
import java.util.zip.CRC32;

public class CacheIndex extends RSIndex {

   RSFIT aRSIndexTable_1902;
   int anInt1903;
   volatile boolean[] aBoolArray1904;
   boolean aBool1905 = false;
   static CRC32 aCRC32_1906 = new CRC32();
   static Clipboard aClipboard1907;
   volatile boolean aBool1908 = false;
   int anInt1909;
   int anInt1910;
   static Class4 aClass4_1911;
   RSFIT aRSIndexTable_1912;
   int anInt1913 = 439070177;

   public static int method2219(int var0, int var1) {
      return var0 >> 17 & 7;
   }

   public int method2220(int var1) {
      if(this.aBool1908) {
         return 100;
      } else if(this.anObjectArray1392 != null) {
         return 99;
      } else {
         int var2 = MobDefinition.method2569(255, -1858370801 * this.anInt1903, (byte) 95);
         if(var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   void method1350(int var1, byte var2) {
      int var3 = -1858370801 * this.anInt1903;
      long var4 = (long)(var1 + (var3 << 16));
      Class116_Sub23_Sub21 var6 = (Class116_Sub23_Sub21)Class93.aHashtable_1343.get(var4);
      if(var6 != null) {
         Class93.aClass121_1342.method1616(var6);
      }

   }

   void method1359(int var1, int var2) {
      if(this.aRSIndexTable_1912 != null && null != this.aBoolArray1904 && this.aBoolArray1904[var1]) {
         Class70.method996(var1, this.aRSIndexTable_1912, this, 635525406);
      } else {
         Class47.method768(this, -1858370801 * this.anInt1903, var1, this.anIntArray1386[var1], (byte)2, true, 1904407913);
      }

   }

   public void method2221(int var1, byte[] var2, boolean var3, boolean var4, byte var5) {
      if(var3) {
         if(this.aBool1908) {
            throw new RuntimeException();
         }

         if(null != this.aRSIndexTable_1902) {
            int var6 = this.anInt1903 * -1858370801;
            RSFIT var7 = this.aRSIndexTable_1902;
            Class116_Sub16 var8 = new Class116_Sub16();
            var8.anInt2064 = 0;
            var8.hashId = (long)var6;
            var8.aByteArray2066 = var2;
            var8.aRSIndexTable_2062 = var7;
            Deque var9 = CacheWorker.aClass117_1414;
            synchronized(var9) {
               CacheWorker.aClass117_1414.addLast(var8);
            }

            Object var22 = CacheWorker.anObject1416;
            synchronized(var22) {
               if(1638013353 * CacheWorker.anInt1415 == 0) {
                  ISAAC.signLink.method1063(new CacheWorker(), 5, 249426401);
               }

               CacheWorker.anInt1415 = 1666340504;
            }
         }

         this.method1353(var2, 2079307840);
         this.method2223(2134010427);
      } else {
         var2[var2.length - 2] = (byte)(this.anIntArray1395[var1] >> 8);
         var2[var2.length - 1] = (byte)this.anIntArray1395[var1];
         if(null != this.aRSIndexTable_1912) {
            RSFIT var18 = this.aRSIndexTable_1912;
            Class116_Sub16 var19 = new Class116_Sub16();
            var19.anInt2064 = 0;
            var19.hashId = (long)var1;
            var19.aByteArray2066 = var2;
            var19.aRSIndexTable_2062 = var18;
            Deque var20 = CacheWorker.aClass117_1414;
            synchronized(var20) {
               CacheWorker.aClass117_1414.addLast(var19);
            }

            Object var21 = CacheWorker.anObject1416;
            synchronized(var21) {
               if(0 == 1638013353 * CacheWorker.anInt1415) {
                  ISAAC.signLink.method1063(new CacheWorker(), 5, 2138415273);
               }

               CacheWorker.anInt1415 = 1666340504;
            }

            this.aBoolArray1904[var1] = true;
         }

         if(var4) {
            this.anObjectArray1392[var1] = Class116_Sub8.method1944(var2, false, (byte)34);
         }
      }

   }

   void method2223(int var1) {
      this.aBoolArray1904 = new boolean[this.anObjectArray1392.length];

      int var2;
      for(var2 = 0; var2 < this.aBoolArray1904.length; ++var2) {
         this.aBoolArray1904[var2] = false;
      }

      if(null == this.aRSIndexTable_1912) {
         this.aBool1908 = true;
      } else {
         this.anInt1913 = 439070177;

         for(var2 = 0; var2 < this.aBoolArray1904.length; ++var2) {
            if(this.anIntArray1390[var2] > 0) {
               RSFIT var3 = this.aRSIndexTable_1912;
               Class116_Sub16 var5 = new Class116_Sub16();
               var5.anInt2064 = -516148383;
               var5.hashId = (long)var2;
               var5.aRSIndexTable_2062 = var3;
               var5.aCacheIndex_2063 = this;
               Deque var6 = CacheWorker.aClass117_1414;
               synchronized(var6) {
                  CacheWorker.aClass117_1414.addLast(var5);
               }

               Object var11 = CacheWorker.anObject1416;
               synchronized(var11) {
                  if(1638013353 * CacheWorker.anInt1415 == 0) {
                     ISAAC.signLink.method1063(new CacheWorker(), 5, 527896267);
                  }

                  CacheWorker.anInt1415 = 1666340504;
               }

               this.anInt1913 = var2 * -439070177;
            }
         }

         if(-1 == this.anInt1913 * 1063954911) {
            this.aBool1908 = true;
         }

      }
   }

   public int method2225(int var1) {
      int var2 = 0;
      int var4 = 0;

      int var3;
      for(var3 = 0; var3 < this.anObjectArray1392.length; ++var3) {
         if(this.anIntArray1390[var3] > 0) {
            var2 += 100;
            var4 += this.method2235(var3, 1367740300);
         }
      }

      if(var2 == 0) {
         return 100;
      } else {
         var3 = var4 * 100 / var2;
         return var3;
      }
   }

   public CacheIndex(RSFIT var1, RSFIT var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.aRSIndexTable_1912 = var1;
      this.aRSIndexTable_1902 = var2;
      this.anInt1903 = var3 * 742460399;
      this.aBool1905 = var6;
      int var7 = this.anInt1903 * -1858370801;
      if(Class106.aClass116_Sub14_1444 != null) {
         Class106.aClass116_Sub14_1444.position = -920877945 + -1473404712 * var7;
         int var9 = Class106.aClass116_Sub14_1444.readInt(-706880922);
         int var10 = Class106.aClass116_Sub14_1444.readInt(-567344617);
         this.method2233(var9, var10, 1102304224);
      } else {
         Class47.method768((CacheIndex)null, 255, 255, 0, (byte)0, true, 1810097804);
         Class93.aCacheIndexArray1351[var7] = this;
      }

   }

   public static Class116_Sub23_Sub14 method2226(int var0, byte var1) {
      Class116_Sub23_Sub14 var2 = (Class116_Sub23_Sub14)Class116_Sub23_Sub14.aClass123_2428.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub14.aRSIndex_2431.getFiles(14, var0, -93840928);
         var2 = new Class116_Sub23_Sub14();
         if(null != var3) {
            var2.method2674(new Packet(var3), 870631467);
         }

         Class116_Sub23_Sub14.aClass123_2428.method1633(var2, (long)var0);
         return var2;
      }
   }

   void method2228(RSFIT var1, int var2, byte[] var3, boolean var4, int var5) {
      int var7;
      if(this.aRSIndexTable_1902 == var1) {
         if(this.aBool1908) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            Class47.method768(this, 255, -1858370801 * this.anInt1903, this.anInt1909 * 457223413, (byte)0, true, 1386872448);
            return;
         }

         aCRC32_1906.reset();
         aCRC32_1906.update(var3, 0, var3.length);
         var7 = (int)aCRC32_1906.getValue();
         Packet var8 = new Packet(Flo.decompress(var3, -385137541));
         int var6 = var8.readSignedByte(1708176767);
         if(var6 != 5 && 6 != var6) {
            throw new RuntimeException(var6 + "," + this.anInt1903 * -1858370801 + "," + var2);
         }

         int var9 = 0;
         if(var6 >= 6) {
            var9 = var8.readInt(-636868075);
         }

         if(var7 != 457223413 * this.anInt1909 || var9 != 1796955907 * this.anInt1910) {
            Class47.method768(this, 255, this.anInt1903 * -1858370801, 457223413 * this.anInt1909, (byte)0, true, 797483977);
            return;
         }

         this.method1353(var3, 1853275693);
         this.method2223(1899672306);
      } else {
         if(!var4 && 1063954911 * this.anInt1913 == var2) {
            this.aBool1908 = true;
         }

         if(null == var3 || var3.length <= 2) {
            this.aBoolArray1904[var2] = false;
            if(this.aBool1905 || var4) {
               Class47.method768(this, this.anInt1903 * -1858370801, var2, this.anIntArray1386[var2], (byte)2, var4, 1964940509);
            }

            return;
         }

         aCRC32_1906.reset();
         aCRC32_1906.update(var3, 0, var3.length - 2);
         var7 = (int)aCRC32_1906.getValue();
         int var10 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(this.anIntArray1386[var2] != var7 || var10 != this.anIntArray1395[var2]) {
            this.aBoolArray1904[var2] = false;
            if(this.aBool1905 || var4) {
               Class47.method768(this, -1858370801 * this.anInt1903, var2, this.anIntArray1386[var2], (byte)2, var4, 899264336);
            }

            return;
         }

         this.aBoolArray1904[var2] = true;
         if(var4) {
            this.anObjectArray1392[var2] = Class116_Sub8.method1944(var3, false, (byte)-21);
         }
      }

   }

   public void method2233(int var1, int var2, int var3) {
      this.anInt1909 = -2002673827 * var1;
      this.anInt1910 = -1397521493 * var2;
      if(this.aRSIndexTable_1902 != null) {
         Class70.method996(-1858370801 * this.anInt1903, this.aRSIndexTable_1902, this, 648039848);
      } else {
         Class47.method768(this, 255, -1858370801 * this.anInt1903, this.anInt1909 * 457223413, (byte)0, true, 1824893663);
      }

   }

   int method2235(int var1, int var2) {
      return this.anObjectArray1392[var1] != null?100:(this.aBoolArray1904[var1]?100: MobDefinition.method2569(this.anInt1903 * -1858370801, var1, (byte) 49));
   }

}
