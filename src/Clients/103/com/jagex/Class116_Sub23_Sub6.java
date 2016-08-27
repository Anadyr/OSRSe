package com.jagex;

public class Class116_Sub23_Sub6 extends NodeContainer {

   static Class123 aClass123_2277 = new Class123(64);
   public int anInt2278 = 0;
   static CacheIndex aCacheIndex_2279;
   static int[] landscapeArray;
   static int anInt2286;


   void method2491(Packet var1, int var2, int var3) {
      if(var2 == 2) {
         this.anInt2278 = var1.readUnsignedShort(468365172) * -683865097;
      }

   }

   static final int method2492(ClanRank var0, int var1) {
      if(null == var0) {
         return 12;
      } else {
         switch(var0.anInt1644 * -1635059495) {
         case 4:
            return 20;
         default:
            return 12;
         }
      }
   }

   void method2494(Packet var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2491(var1, var3, 1167209142);
      }
   }

   static char method2496(char var0, int var1, byte var2) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(199 == var0) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(var0 == 221) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(var0 == 231) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || 255 == var0) {
            return 'y';
         }
      }

      return 338 == var0?'O':(var0 == 339?'o':(376 == var0?'Y':var0));
   }

}
