package com.jagex;

public class Class116_Sub23_Sub5 extends NodeContainer {

   public int anInt2265 = 0;
   static Class123 aClass123_2266 = new Class123(64);
   static RSIndex aRSIndex_2267;
   public char aChar2268;
   public char aChar2269;
   public int anInt2271;
   public int[] anIntArray2272;
   public int[] anIntArray2273;
   public String[] aStringArray2274;
   public String aString2275 = "null";

   void method2475(Packet var1, byte var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2481(var1, var3, 1102727820);
      }
   }

   void method2481(Packet var1, int var2, int var3) {
      if(var2 == 1) {
         this.aChar2269 = (char)var1.readSignedByte(1708176767);
      } else if(2 == var2) {
         this.aChar2268 = (char)var1.readSignedByte(1708176767);
      } else if(3 != var2) {
         if(var2 == 4) {
            this.anInt2271 = var1.readInt(-648780806) * 1683814079;
         } else {
            int var4;
            if(var2 == 5) {
               this.anInt2265 = var1.readUnsignedShort(490195531) * 1451173443;
               this.anIntArray2272 = new int[this.anInt2265 * 557176427];
               this.aStringArray2274 = new String[this.anInt2265 * 557176427];

               for(var4 = 0; var4 < this.anInt2265 * 557176427; ++var4) {
                  this.anIntArray2272[var4] = var1.readInt(-1181676727);
                  this.aStringArray2274[var4] = var1.readString(61376769);
               }
            } else if(6 == var2) {
               this.anInt2265 = var1.readUnsignedShort(1675196555) * 1451173443;
               this.anIntArray2272 = new int[this.anInt2265 * 557176427];
               this.anIntArray2273 = new int[557176427 * this.anInt2265];

               for(var4 = 0; var4 < this.anInt2265 * 557176427; ++var4) {
                  this.anIntArray2272[var4] = var1.readInt(-1686643567);
                  this.anIntArray2273[var4] = var1.readInt(-328019364);
               }
            }
         }
      } else {
         this.aString2275 = var1.readString(61376769);

      }

   }

   static final boolean method2487(char var0, int var1) {
      return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
   }

   public static void method2488(int var0) {
      Class116_Sub23_Sub1.aClass123_2161.method1635();
      Class116_Sub23_Sub1.aClass123_2158.method1635();
   }

   static final String method2489(int var0, int var1) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + Class41.aString538 + var2.substring(var3);
      }

      return var2.length() > 9?" " + Class59_Sub1.method1978('\uff80', (byte)122) + var2.substring(0, var2.length() - 8) + Class91.aString1208 + " " + Class41.aString540 + var2 + Class41.aString543 + Class41.aString544:(var2.length() > 6?" " + Class59_Sub1.method1978(16777215, (byte)34) + var2.substring(0, var2.length() - 4) + Class91.aString1268 + " " + Class41.aString540 + var2 + Class41.aString543 + Class41.aString544:" " + Class59_Sub1.method1978(16776960, (byte)123) + var2 + Class41.aString544);
   }

   public static final void method2490(GameInterface var0, boolean var1, byte var2) {
      int var3 = 226793949 * var0.interfaceId;
      int var4 = (int)var0.hashId;
      var0.unlink();
      if(var1) {
         Class64.method940(var3, -511114832);
      }

      for(InterfaceSettings var5 = (InterfaceSettings)client.aHashtable_3135.getFirst(); var5 != null; var5 = (InterfaceSettings)client.aHashtable_3135.getNext()) {
         if((var5.hashId >> 48 & 65535L) == (long)var3) {
            var5.unlink();
         }
      }

      RSInterface var6 = Class107.getInterface(var4, 314639891);
      if(null != var6) {
         Class79.refreshInterface(var6, -80945740);
      }

      Flo.method2529(441135845);
      if(-1 != -1074177723 * client.anInt3200) {
         Class76.method1081(-1074177723 * client.anInt3200, 1, (byte)2);
      }

   }
}
