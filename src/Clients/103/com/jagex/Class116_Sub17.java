package com.jagex;

public class Class116_Sub17 extends Node {

   int anInt2067;
   int anInt2068;
   int anInt2072;
   boolean aBool2073;
   int anInt2079;
   int anInt2082;
   int anInt2083;
   int anInt2085;
   int anInt2087;
   int anInt2088;
   String aString2089;
   int anInt2090;
   int anInt2091;
   String aString2092;
   String aString2094;
   String aString2095;
   int anInt2096;
   int anInt2097;
   int anInt2099;
   String aString2100;
   String aString2101;
   int[] anIntArray2102 = new int[3];
   int anInt2103;
   boolean aBool2104;
   static int anInt2105;

   static final boolean method2305(char var0, int var1) {
      if(Character.isISOControl(var0)) {
         return false;
      } else {
         boolean var5 = var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
         if(var5) {
            return true;
         } else {
            char[] var2 = Class95.aCharArray1362;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if(var4 == var0) {
                  return true;
               }
            }

            var2 = Class95.aCharArray1361;

            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if(var4 == var0) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public void method2306(Buffer var1, int var2) {
      var1.writeByte(6, 576235594);
      var1.writeByte(-411220879 * this.anInt2072, -992562519);
      var1.writeByte(this.aBool2073?1:0, 498870517);
      var1.writeByte(this.anInt2079 * 567640867, -958779416);
      var1.writeByte(-1844108581 * this.anInt2103, 116731030);
      var1.writeByte(this.anInt2087 * 535197789, -466813891);
      var1.writeByte(-1149750771 * this.anInt2085, -1632207459);
      var1.writeByte(1374491313 * this.anInt2068, -2093625522);
      var1.writeByte(this.aBool2104?1:0, -1323010348);
      var1.writeShort(-864398599 * this.anInt2088, -1642370960);
      var1.writeByte(-856978823 * this.anInt2083, 86061193);
      var1.writeMedium(-830383997 * this.anInt2090, (byte)15);
      var1.writeShort(-620298247 * this.anInt2091, -2087249060);
      var1.method2079(this.aString2092, -1800967893);
      var1.method2079(this.aString2089, 1020438195);
      var1.method2079(this.aString2094, 576880156);
      var1.method2079(this.aString2095, -1281968322);
      var1.writeByte(1311683181 * this.anInt2097, -771989611);
      var1.writeShort(32408097 * this.anInt2096, -1651629051);
      var1.method2079(this.aString2100, -1669179969);
      var1.method2079(this.aString2101, 1643557033);
      var1.writeByte(this.anInt2067 * 153252251, -1212804235);
      var1.writeByte(this.anInt2099 * 2060761779, -311458014);

      for(int var3 = 0; var3 < this.anIntArray2102.length; ++var3) {
         var1.writeInt(this.anIntArray2102[var3], (byte)18);
      }

      var1.writeInt(1223494517 * this.anInt2082, (byte)125);
   }

   public Class116_Sub17(boolean var1) {
      if(var1) {
         if(Class116_Sub23_Sub16_Sub6.aString2779.startsWith("win")) {
            this.anInt2072 = 1610480785;
         } else if(Class116_Sub23_Sub16_Sub6.aString2779.startsWith("mac")) {
            this.anInt2072 = -1074005726;
         } else if(Class116_Sub23_Sub16_Sub6.aString2779.startsWith("linux")) {
            this.anInt2072 = 536475059;
         } else {
            this.anInt2072 = 2146955844;
         }

         String var2;
         try {
            var2 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var11) {
            var2 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var10) {
            var4 = "";
         }

         String var3 = "Unknown";
         String var5 = "1.1";

         try {
            var3 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
         } catch (Exception var9) {
            ;
         }

         if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
            this.aBool2073 = false;
         } else {
            this.aBool2073 = true;
         }

         if(1 == this.anInt2072 * -411220879) {
            if(var4.indexOf("4.0") != -1) {
               this.anInt2079 = 14271627;
            } else if(var4.indexOf("4.1") != -1) {
               this.anInt2079 = 28543254;
            } else if(var4.indexOf("4.9") != -1) {
               this.anInt2079 = 42814881;
            } else if(var4.indexOf("5.0") != -1) {
               this.anInt2079 = 57086508;
            } else if(var4.indexOf("5.1") != -1) {
               this.anInt2079 = 71358135;
            } else if(var4.indexOf("5.2") != -1) {
               this.anInt2079 = 114173016;
            } else if(var4.indexOf("6.0") != -1) {
               this.anInt2079 = 85629762;
            } else if(var4.indexOf("6.1") != -1) {
               this.anInt2079 = 99901389;
            } else if(var4.indexOf("6.2") != -1) {
               this.anInt2079 = 128444643;
            } else if(var4.indexOf("6.3") != -1) {
               this.anInt2079 = 142716270;
            }
         } else if(this.anInt2072 * -411220879 == 2) {
            if(var4.indexOf("10.4") != -1) {
               this.anInt2079 = 285432540;
            } else if(var4.indexOf("10.5") != -1) {
               this.anInt2079 = 299704167;
            } else if(var4.indexOf("10.6") != -1) {
               this.anInt2079 = 313975794;
            } else if(var4.indexOf("10.7") != -1) {
               this.anInt2079 = 328247421;
            } else if(var4.indexOf("10.8") != -1) {
               this.anInt2079 = 342519048;
            } else if(var4.indexOf("10.9") != -1) {
               this.anInt2079 = 356790675;
            } else if(var4.indexOf("10.10") != -1) {
               this.anInt2079 = 371062302;
            }
         }

         if(var3.toLowerCase().indexOf("sun") != -1) {
            this.anInt2103 = -2071721645;
         } else if(var3.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt2103 = 151524006;
         } else if(var3.toLowerCase().indexOf("apple") != -1) {
            this.anInt2103 = -1920197639;
         } else if(var3.toLowerCase().indexOf("oracle") != -1) {
            this.anInt2103 = -1768673633;
         } else {
            this.anInt2103 = 303048012;
         }

         int var6 = 2;
         int var7 = 0;

         char var8;
         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var8 - 48 + 10 * var7;
               ++var6;
            }
         } catch (Exception var14) {
            ;
         }

         this.anInt2087 = var7 * -522118155;
         var6 = var5.indexOf(46, 2) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var7 * 10 + (var8 - 48);
               ++var6;
            }
         } catch (Exception var13) {
            ;
         }

         this.anInt2085 = -537629499 * var7;
         var6 = var5.indexOf(95, 4) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = 10 * var7 + (var8 - 48);
               ++var6;
            }
         } catch (Exception var12) {
            ;
         }

         this.anInt2068 = 1077409361 * var7;
         this.aBool2104 = false;
         this.anInt2088 = ((int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1291858103;
         if(535197789 * this.anInt2087 > 3) {
            this.anInt2083 = Runtime.getRuntime().availableProcessors() * -1530871863;
         } else {
            this.anInt2083 = 0;
         }

         this.anInt2090 = 0;
      }

      if(this.aString2092 == null) {
         this.aString2092 = "";
      }

      if(this.aString2089 == null) {
         this.aString2089 = "";
      }

      if(null == this.aString2094) {
         this.aString2094 = "";
      }

      if(null == this.aString2095) {
         this.aString2095 = "";
      }

      if(null == this.aString2100) {
         this.aString2100 = "";
      }

      if(null == this.aString2101) {
         this.aString2101 = "";
      }

      this.method2313(-483832203);
   }

   public int method2307(byte var1) {
      byte var2 = 38;
      String var17 = this.aString2092;
      int var8 = var17.length() + 2;
      int var21 = var2 + var8;
      String var12 = this.aString2089;
      int var4 = var12.length() + 2;
      var21 += var4;
      String var15 = this.aString2094;
      int var13 = var15.length() + 2;
      var21 += var13;
      String var9 = this.aString2095;
      int var10 = var9.length() + 2;
      var21 += var10;
      String var5 = this.aString2100;
      int var19 = var5.length() + 2;
      var21 += var19;
      String var6 = this.aString2101;
      int var11 = var6.length() + 2;
      var21 += var11;
      return var21;
   }

   void method2313(int var1) {
      if(this.aString2092.length() > 40) {
         this.aString2092 = this.aString2092.substring(0, 40);
      }

      if(this.aString2089.length() > 40) {
         this.aString2089 = this.aString2089.substring(0, 40);
      }

      if(this.aString2094.length() > 10) {
         this.aString2094 = this.aString2094.substring(0, 10);
      }

      if(this.aString2095.length() > 10) {
         this.aString2095 = this.aString2095.substring(0, 10);
      }

   }

   public static boolean method2314(int var0, int var1, int var2) {
      return (var0 >> var1 + 1 & 1) != 0;
   }
}
