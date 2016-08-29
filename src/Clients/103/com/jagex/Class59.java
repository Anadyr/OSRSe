package com.jagex;

public abstract class Class59 {

   public int anInt774;
   public int anInt776;
   public int anInt777;
   public int anInt778;


   protected abstract boolean method891(int var1, int var2, int var3, Class58 var4, int var5);

   public static String method892(String var0, int var1) {
      int var2 = var0.length();
      char[] var5 = new char[var2];
      byte var4 = 2;

      for(int var6 = 0; var6 < var2; ++var6) {
         char var3 = var0.charAt(var6);
         if(0 != var4) {
            if(2 == var4 || Character.isUpperCase(var3)) {
               var3 = Class116_Sub23_Sub14.method2686(var3, -1304125287);
            }
         } else {
            var3 = Character.toLowerCase(var3);
         }

         if(!Character.isLetter(var3)) {
            if(var3 != 46 && var3 != 63 && var3 != 33) {
               if(Character.isSpaceChar(var3)) {
                  if(var4 != 2) {
                     var4 = 1;
                  }
               } else {
                  var4 = 1;
               }
            } else {
               var4 = 2;
            }
         } else {
            var4 = 0;
         }

         var5[var6] = var3;
      }

      return new String(var5);
   }

   static int method896(Class27 var0, Class27 var1, int var2, boolean var3, byte var4) {
      if(1 == var2) {
         int var6 = 215269871 * var0.anInt381;
         int var5 = 215269871 * var1.anInt381;
         if(!var3) {
            if(-1 == var6) {
               var6 = 2001;
            }

            if(var5 == -1) {
               var5 = 2001;
            }
         }

         return var6 - var5;
      } else {
         return var2 == 2?-1854937097 * var0.anInt385 - -1854937097 * var1.anInt385:(3 == var2?(var0.aString371.equals("-")?(var1.aString371.equals("-")?0:(var3?-1:1)):(var1.aString371.equals("-")?(var3?1:-1):var0.aString371.compareTo(var1.aString371))):(4 == var2?(var0.method540(-819065046)?(var1.method540(1318010001)?0:1):(var1.method540(-696561353)?-1:0)):(5 == var2?(var0.method538(-914466288)?(var1.method538(-1811741119)?0:1):(var1.method538(26395215)?-1:0)):(var2 == 6?(var0.method539(1217140964)?(var1.method539(-639237207)?0:1):(var1.method539(-70734957)?-1:0)):(7 == var2?(var0.method537('\uffff')?(var1.method537('\uffff')?0:1):(var1.method537('\uffff')?-1:0)):var0.anInt388 * -145619359 - var1.anInt388 * -145619359)))));
      }
   }
}
