package com.jagex;

public abstract class Class116_Sub4 extends Node {

   Class116_Sub2 aClass116_Sub2_1719;
   Class116_Sub4 aClass116_Sub4_1720;
   int anInt1721;
   volatile boolean aBool1722 = true;


   int method1906() {
      return 255;
   }

   protected abstract Class116_Sub4 method1907();


   protected abstract int method1909();

   protected abstract void method1911(int var1);

   protected abstract Class116_Sub4 method1913();


   protected abstract void method1919(int[] var1, int var2, int var3);


   final void method1922(int[] var1, int var2, int var3) {
      if(this.aBool1722) {
         this.method1919(var1, var2, var3);
      } else {
         this.method1911(var3);
      }

   }
}
