package com.jagex;

public class Class116_Sub4_Sub1 extends Class116_Sub4 {

   Deque aClass117_2450 = new Deque();
   Deque aClass117_2451 = new Deque();
   int anInt2452 = 0;
   int anInt2453 = -1;

   public final synchronized void method2706(Class116_Sub4 var1) {
      this.aClass117_2450.addFront(var1);
   }

   public final synchronized void method2707(Class116_Sub4 var1) {
      var1.unlink();
   }

   void method2708() {
      if(this.anInt2452 > 0) {
         for(Class116_Sub1 var1 = (Class116_Sub1)this.aClass117_2451.getFirst(); var1 != null; var1 = (Class116_Sub1)this.aClass117_2451.getNext()) {
            var1.anInt1668 -= this.anInt2452;
         }

         this.anInt2453 -= this.anInt2452;
         this.anInt2452 = 0;
      }

   }

   void method2709(Node var1, Class116_Sub1 var2) {
      while(var1 != this.aClass117_2451.head && ((Class116_Sub1)var1).anInt1668 <= var2.anInt1668) {
         var1 = var1.next;
      }

      Deque.addLast(var2, var1);
      this.anInt2453 = ((Class116_Sub1)this.aClass117_2451.head.next).anInt1668;
   }

   protected Class116_Sub4 method1907() {
      return (Class116_Sub4)this.aClass117_2450.getFirst();
   }

   protected Class116_Sub4 method1913() {
      return (Class116_Sub4)this.aClass117_2450.getNext();
   }

   protected int method1909() {
      return 0;
   }

   public final synchronized void method1919(int[] var1, int var2, int var3) {
      do {
         if(this.anInt2453 < 0) {
            this.method2727(var1, var2, var3);
            return;
         }

         if(this.anInt2452 + var3 < this.anInt2453) {
            this.anInt2452 += var3;
            this.method2727(var1, var2, var3);
            return;
         }

         int var4 = this.anInt2453 - this.anInt2452;
         this.method2727(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.anInt2452 += var4;
         this.method2708();
         Class116_Sub1 var5 = (Class116_Sub1)this.aClass117_2451.getFirst();
         synchronized(var5) {
            int var7 = var5.method1844(this);
            if(var7 < 0) {
               var5.anInt1668 = 0;
               this.method2725(var5);
            } else {
               var5.anInt1668 = var7;
               this.method2709(var5.next, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void method1911(int var1) {
      do {
         if(this.anInt2453 < 0) {
            this.method2718(var1);
            return;
         }

         if(this.anInt2452 + var1 < this.anInt2453) {
            this.anInt2452 += var1;
            this.method2718(var1);
            return;
         }

         int var2 = this.anInt2453 - this.anInt2452;
         this.method2718(var2);
         var1 -= var2;
         this.anInt2452 += var2;
         this.method2708();
         Class116_Sub1 var3 = (Class116_Sub1)this.aClass117_2451.getFirst();
         synchronized(var3) {
            int var5 = var3.method1844(this);
            if(var5 < 0) {
               var3.anInt1668 = 0;
               this.method2725(var3);
            } else {
               var3.anInt1668 = var5;
               this.method2709(var3.next, var3);
            }
         }
      } while(var1 != 0);

   }

   void method2718(int var1) {
      for(Class116_Sub4 var2 = (Class116_Sub4)this.aClass117_2450.getFirst(); var2 != null; var2 = (Class116_Sub4)this.aClass117_2450.getNext()) {
         var2.method1911(var1);
      }

   }

   void method2725(Class116_Sub1 var1) {
      var1.unlink();
      var1.method1843();
      Node var2 = this.aClass117_2451.head.next;
      if(var2 == this.aClass117_2451.head) {
         this.anInt2453 = -1;
      } else {
         this.anInt2453 = ((Class116_Sub1)var2).anInt1668;
      }

   }

   void method2727(int[] var1, int var2, int var3) {
      for(Class116_Sub4 var4 = (Class116_Sub4)this.aClass117_2450.getFirst(); var4 != null; var4 = (Class116_Sub4)this.aClass117_2450.getNext()) {
         var4.method1922(var1, var2, var3);
      }

   }

}
