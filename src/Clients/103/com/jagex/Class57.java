package com.jagex;

public final class Class57 {

   int anInt716 = 6;
   int anInt717 = 16;
   byte[] aByteArray718;
   int anInt719 = 18002;
   int anInt720 = 50;
   int anInt721;
   byte[] aByteArray722;
   int anInt723 = 4096;
   int anInt724;
   int anInt725 = 258;
   boolean[] aBoolArray726 = new boolean[256];
   int anInt727;
   int anInt728;
   byte aByte729;
   int anInt730;
   int anInt731;
   int anInt732;
   int anInt733;
   int anInt734 = 0;
   static final int anInt735 = 512;
   int anInt736;
   int[] anIntArray737 = new int[256];
   int anInt738 = 0;
   int[] anIntArray739 = new int[257];
   int anInt740;
   byte[] aByteArray741 = new byte[4096];
   boolean[] aBoolArray742 = new boolean[16];
   byte[] aByteArray743 = new byte[256];
   int anInt744;
   int[] anIntArray745 = new int[16];
   byte[] aByteArray746 = new byte[18002];
   byte[] aByteArray747 = new byte[18002];
   byte[][] aByteArrayArray748 = new byte[6][258];
   int[][] anIntArrayArray749 = new int[6][258];
   int[][] anIntArrayArray750 = new int[6][258];
   int[][] anIntArrayArray751 = new int[6][258];
   int[] anIntArray752 = new int[6];
   int anInt753;
   int anInt754;


   public static String readJagString(byte[] var0, int var1, int var2, int var3) {
      char[] var4 = new char[var2];
      int var5 = 0;
      int var7 = var1;

      int var8;
      for(int var9 = var2 + var1; var7 < var9; var4[var5++] = (char)var8) {
         int var6 = var0[var7++] & 255;
         if(var6 < 128) {
            if(var6 == 0) {
               var8 = '\ufffd';
            } else {
               var8 = var6;
            }
         } else if(var6 < 192) {
            var8 = '\ufffd';
         } else if(var6 >= 224) {
            if(var6 < 240) {
               if(1 + var7 < var9 && (var0[var7] & 192) == 128 && 128 == (var0[var7 + 1] & 192)) {
                  var8 = (var6 & 15) << 12 | (var0[var7++] & 63) << 6 | var0[var7++] & 63;
                  if(var8 < 2048) {
                     var8 = '\ufffd';
                  }
               } else {
                  var8 = '\ufffd';
               }
            } else if(var6 < 248) {
               if(var7 + 2 < var9 && (var0[var7] & 192) == 128 && 128 == (var0[1 + var7] & 192) && (var0[var7 + 2] & 192) == 128) {
                  var8 = (var6 & 7) << 18 | (var0[var7++] & 63) << 12 | (var0[var7++] & 63) << 6 | var0[var7++] & 63;
                  if(var8 >= 65536 && var8 <= 1114111) {
                     var8 = '\ufffd';
                  } else {
                     var8 = '\ufffd';
                  }
               } else {
                  var8 = '\ufffd';
               }
            } else {
               var8 = '\ufffd';
            }
         } else if(var7 < var9 && 128 == (var0[var7] & 192)) {
            var8 = (var6 & 31) << 6 | var0[var7++] & 63;
            if(var8 < 128) {
               var8 = '\ufffd';
            }
         } else {
            var8 = '\ufffd';
         }
      }

      return new String(var4, 0, var5);
   }
}
