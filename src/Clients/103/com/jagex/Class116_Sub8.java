package com.jagex;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class116_Sub8 extends Node {

   int anInt1767;
   int anInt1768;
   int anInt1769;
   int anInt1770;
   int[] anIntArray1771;
   int anInt1772;
   int anInt1773;
   Class116_Sub4_Sub2 aClass116_Sub4_Sub2_1775;
   int anInt1776;
   int anInt1777;
   static Class117 aClass117_1779 = new Class117();
   Class116_Sub4_Sub2 aClass116_Sub4_Sub2_1780;
   int anInt1781;
   int anInt1782;
   ObjectDefinition aClass116_Sub23_Sub3_1784;

   void method1938(int var1) {
      int var2 = this.anInt1781 * -1177973365;
      ObjectDefinition var3 = this.aClass116_Sub23_Sub3_1784.method2419(-1617474286);
      if(null != var3) {
         this.anInt1781 = var3.anInt2233 * 802663847;
         this.anInt1782 = var3.anInt2234 * 401668736;
         this.anInt1776 = 428311197 * var3.anInt2195;
         this.anInt1777 = var3.anInt2236 * 1108507363;
         this.anIntArray1771 = var3.anIntArray2211;
      } else {
         this.anInt1781 = 571100637;
         this.anInt1782 = 0;
         this.anInt1776 = 0;
         this.anInt1777 = 0;
         this.anIntArray1771 = null;
      }

      if(this.anInt1781 * -1177973365 != var2 && null != this.aClass116_Sub4_Sub2_1775) {
         Class50.aClass116_Sub4_Sub1_673.method2707(this.aClass116_Sub4_Sub2_1775);
         this.aClass116_Sub4_Sub2_1775 = null;
      }

   }

   public static void method1939(int var0) {
      Flo.aClass123_2296.method1635();
   }

   public static Object method1944(byte[] var0, boolean var1, byte var2) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !Class63.aBool808) {
            try {
               Class63_Sub1 var3 = new Class63_Sub1();
               var3.method929(var0, 1668635019);
               return var3;
            } catch (Throwable var4) {
               Class63.aBool808 = true;
            }
         }

         return var1?Class55.method813(var0, -1836351588):var0;
      }
   }

   public static void method1945(String var0, String var1, int var2, int var3, byte var4) throws IOException {
      Class86.anInt1019 = -1882193397 * var3;
      Class86.anInt1013 = 725192983 * var2;

      try {
         Class133.aString1603 = System.getProperty("os.name");
      } catch (Exception var12) {
         Class133.aString1603 = "Unknown";
      }

      Class116_Sub23_Sub16_Sub6.aString2779 = Class133.aString1603.toLowerCase();

      try {
         BitBuffer.aString2502 = System.getProperty("user.home");
         if(BitBuffer.aString2502 != null) {
            BitBuffer.aString2502 = BitBuffer.aString2502 + "/";
         }
      } catch (Exception var11) {
         ;
      }

      try {
         if(Class116_Sub23_Sub16_Sub6.aString2779.startsWith("win")) {
            if(null == BitBuffer.aString2502) {
               BitBuffer.aString2502 = System.getenv("USERPROFILE");
            }
         } else if(null == BitBuffer.aString2502) {
            BitBuffer.aString2502 = System.getenv("HOME");
         }

         if(null != BitBuffer.aString2502) {
            BitBuffer.aString2502 = BitBuffer.aString2502 + "/";
         }
      } catch (Exception var10) {
         ;
      }

      if(BitBuffer.aString2502 == null) {
         BitBuffer.aString2502 = "~/";
      }

      Class31.aStringArray429 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", BitBuffer.aString2502, "/tmp/", ""};
      Class78.aStringArray905 = new String[]{".jagex_cache_" + Class86.anInt1013 * 1502918311, ".file_store_" + 1502918311 * Class86.anInt1013};
      int var5 = 0;

      label107:
      while(var5 < 4) {
         Class86.aFile1006 = Class116_Sub23_Sub16_Sub1.method3093(var0, var1, var5, 1384750979);
         if(!Class86.aFile1006.exists()) {
            Class86.aFile1006.mkdirs();
         }

         File[] var6 = Class86.aFile1006.listFiles();
         if(null == var6) {
            break;
         }

         File[] var7 = var6;
         int var8 = 0;

         while(true) {
            if(var8 >= var7.length) {
               break label107;
            }

            File var9 = var7[var8];
            if(!Class99.method1401(var9, false, -2048036352)) {
               ++var5;
               break;
            }

            ++var8;
         }
      }

      Timer.forceFileCheck(Class86.aFile1006, -311374795);

      try {
         File var14 = new File(BitBuffer.aString2502, "random.dat");
         int var17;
         if(var14.exists()) {
            Class86.aClass140_1010 = new Class140(new Class145(var14, "rw", 25L), 24, 0);
         } else {
            label88:
            for(int var15 = 0; var15 < Class78.aStringArray905.length; ++var15) {
               for(var17 = 0; var17 < Class31.aStringArray429.length; ++var17) {
                  File var18 = new File(Class31.aStringArray429[var17] + Class78.aStringArray905[var15] + File.separatorChar + "random.dat");
                  if(var18.exists()) {
                     Class86.aClass140_1010 = new Class140(new Class145(var18, "rw", 25L), 24, 0);
                     break label88;
                  }
               }
            }
         }

         if(Class86.aClass140_1010 == null) {
            RandomAccessFile var16 = new RandomAccessFile(var14, "rw");
            var17 = var16.read();
            var16.seek(0L);
            var16.write(var17);
            var16.seek(0L);
            var16.close();
            Class86.aClass140_1010 = new Class140(new Class145(var14, "rw", 25L), 24, 0);
         }
      } catch (IOException var13) {
         ;
      }

      Class86.aClass140_1011 = new Class140(new Class145(Class116_Sub23_Sub7.method2514("main_file_cache.dat2", 271461895), "rw", 1048576000L), 5200, 0);
      Class86.aClass140_1015 = new Class140(new Class145(Class116_Sub23_Sub7.method2514("main_file_cache.idx255", -1427487052), "rw", 1048576L), 6000, 0);
      Class47.aClass140Array625 = new Class140[Class86.anInt1019 * 855046563];

      for(var5 = 0; var5 < Class86.anInt1019 * 855046563; ++var5) {
         Class47.aClass140Array625[var5] = new Class140(new Class145(Class116_Sub23_Sub7.method2514("main_file_cache.idx" + var5, -523972569), "rw", 1048576L), 6000, 0);
      }

   }

   public static Class116_Sub23_Sub4 method1946(int var0, int var1) {
      Class116_Sub23_Sub4 var2 = (Class116_Sub23_Sub4)Class116_Sub23_Sub4.aClass123_2245.method1632((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub4.aClass99_2264.method1394(12, var0, -240498268);
         var2 = new Class116_Sub23_Sub4();
         if(var3 != null) {
            var2.method2439(new Buffer(var3), 314639891);
         }

         var2.method2441(674167779);
         Class116_Sub23_Sub4.aClass123_2245.method1633(var2, (long)var0);
         return var2;
      }
   }
}
