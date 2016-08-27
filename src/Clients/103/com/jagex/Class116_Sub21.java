package com.jagex;

public class Class116_Sub21 extends Node {

   int anInt2122;
   int anInt2123;
   Class116_Sub2_Sub1 aClass116_Sub2_Sub1_2124;
   int anInt2125;
   int anInt2126;
   Class126 aClass126_2127;
   int anInt2128;
   int anInt2129;
   int anInt2130;
   int anInt2131;
   int anInt2132;
   Class116_Sub19 aClass116_Sub19_2133;
   int anInt2134;
   int anInt2135;
   int anInt2136;
   int anInt2137;
   int anInt2138;
   int anInt2139;
   Class116_Sub4_Sub2 aClass116_Sub4_Sub2_2140;
   int anInt2141;
   int anInt2142;


   void method2330(byte var1) {
      this.aClass116_Sub19_2133 = null;
      this.aClass116_Sub2_Sub1_2124 = null;
      this.aClass126_2127 = null;
      this.aClass116_Sub4_Sub2_2140 = null;
   }

   public static int method2333(int var0, byte var1) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

}
