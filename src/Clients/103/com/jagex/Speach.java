package com.jagex;

public class Speach implements OrdinalInterface {

   static int[] anIntArray972;
   public int iconId;
   public static Speach OFFLINE = new Speach(0, -1, false, true);
   public static Speach PLAYER = new Speach(1, 0, true, true);
   public static Speach MOD = new Speach(2, 1, true, false);
   public static Speach ADMIN = new Speach(3, 2, false, true);
   public static Speach ULT_IRONMAN = new Speach(4, 3, false, true);

   int anInt977;
   public boolean aBool978;
   static int[] anIntArray981;
   public boolean aBool982;

   public int method30() {
      return this.anInt977 * 1983721639;
   }

   public int getDrawId(int var1) {
      return this.anInt977 * -463554219;
   }

   public int method32() {
      return this.anInt977 * 94226872;
   }

   Speach(int var1, int right, boolean var4, boolean var5) {

      this.anInt977 = var1 * -1040483331;
      this.iconId = right * -87121341;
      this.aBool978 = var4;
      this.aBool982 = var5;
   }

   public int method33() {
      return this.anInt977 * 294582408;
   }

   public int method34() {
      return this.anInt977 * -2052295414;
   }

   static void handleWorldList(World[] worlds, int var1, int var2, int[] var3, int[] var4, int var5) {
      if(var1 < var2) {
         int var13 = var1 - 1;
         int var8 = 1 + var2;
         int var9 = (var1 + var2) / 2;
         World var6 = worlds[var9];
         worlds[var9] = worlds[var1];
         worlds[var1] = var6;

         label178:
         while(var13 < var8) {
            boolean var11 = true;

            while(true) {
               --var8;
               int var12 = 0;

               while(true) {
                  int var7;
                  int var10;
                  if(var12 < 4) {
                     if(2 == var3[var12]) {
                        var10 = 639259553 * worlds[var8].anInt377;
                        var7 = 639259553 * var6.anInt377;
                     } else if(var3[var12] == 1) {
                        var10 = 215269871 * worlds[var8].anInt381;
                        var7 = 215269871 * var6.anInt381;
                        if(var10 == -1 && 1 == var4[var12]) {
                           var10 = 2001;
                        }

                        if(-1 == var7 && var4[var12] == 1) {
                           var7 = 2001;
                        }
                     } else if(var3[var12] == 3) {
                        var10 = worlds[var8].method537('\uffff')?1:0;
                        var7 = !var6.method537('\uffff')?0:1;
                     } else {
                        var10 = worlds[var8].worldId * -145619359;
                        var7 = var6.worldId * -145619359;
                     }

                     if(var7 == var10) {
                        if(var12 == 3) {
                           var11 = false;
                        }

                        ++var12;
                        continue;
                     }

                     if((var4[var12] != 1 || var10 <= var7) && (var4[var12] != 0 || var10 >= var7)) {
                        var11 = false;
                     }
                  }

                  if(!var11) {
                     var11 = true;

                     while(true) {
                        ++var13;
                        var12 = 0;

                        while(true) {
                           if(var12 < 4) {
                              if(var3[var12] == 2) {
                                 var10 = 639259553 * worlds[var13].anInt377;
                                 var7 = 639259553 * var6.anInt377;
                              } else if(1 == var3[var12]) {
                                 var10 = 215269871 * worlds[var13].anInt381;
                                 var7 = var6.anInt381 * 215269871;
                                 if(var10 == -1 && 1 == var4[var12]) {
                                    var10 = 2001;
                                 }

                                 if(-1 == var7 && 1 == var4[var12]) {
                                    var7 = 2001;
                                 }
                              } else if(var3[var12] == 3) {
                                 var10 = worlds[var13].method537('\uffff')?1:0;
                                 var7 = var6.method537('\uffff')?1:0;
                              } else {
                                 var10 = -145619359 * worlds[var13].worldId;
                                 var7 = -145619359 * var6.worldId;
                              }

                              if(var10 == var7) {
                                 if(var12 == 3) {
                                    var11 = false;
                                 }

                                 ++var12;
                                 continue;
                              }

                              if((1 != var4[var12] || var10 >= var7) && (var4[var12] != 0 || var10 <= var7)) {
                                 var11 = false;
                              }
                           }

                           if(!var11) {
                              if(var13 < var8) {
                                 World var14 = worlds[var13];
                                 worlds[var13] = worlds[var8];
                                 worlds[var8] = var14;
                              }
                              continue label178;
                           }
                           break;
                        }
                     }
                  }
                  break;
               }
            }
         }

         handleWorldList(worlds, var1, var8, var3, var4, -1874643746);
         handleWorldList(worlds, var8 + 1, var2, var3, var4, -2021687307);
      }

   }
}
