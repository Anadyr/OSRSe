package com.jagex;

public class RuntimeException_Sub1 extends RuntimeException {

   String aString2847;
   public static String aString2849;
   Throwable aThrowable2851;


   static int method3446(int var0, int var1, int var2, int var3) {
      return (Class47.aByteArrayArrayArray634[var0][var1][var2] & 8) != 0?0:(var0 > 0 && 0 != (Class47.aByteArrayArrayArray634[1][var1][var2] & 2)?var0 - 1:var0);
   }

   RuntimeException_Sub1(Throwable var1, String var2) {
      this.aString2847 = var2;
      this.aThrowable2851 = var1;
   }

   static final boolean method3448(RSInterface var0, int var1) {
      if(null == var0.valueCompareType) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.valueCompareType.length; ++var2) {
            int var3 = client.method1740(var0, var2, (byte)24);
            int var4 = var0.requiredValues[var2];
            if(var0.valueCompareType[var2] == 2) {
               if(var3 >= var4) {
                  return false;
               }
            } else if(3 == var0.valueCompareType[var2]) {
               if(var3 <= var4) {
                  return false;
               }
            } else if(var0.valueCompareType[var2] == 4) {
               if(var3 == var4) {
                  return false;
               }
            } else if(var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }
}
