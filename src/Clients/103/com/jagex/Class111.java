package com.jagex;
import java.util.Iterator;

public class Class111 implements Iterator {

   Node aClass116_1479 = null;
   Node aClass116_1480;
   int anInt1481;
   Class124 aClass124_1482;

   Class111(Class124 var1) {
      this.aClass124_1482 = var1;
      this.method1512();
   }

   public Object next() {
      Node var1;
      if(this.aClass116_1480 != this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1]) {
         var1 = this.aClass116_1480;
         this.aClass116_1480 = var1.next;
         this.aClass116_1479 = var1;
         return var1;
      } else {
         do {
            if(this.anInt1481 >= this.aClass124_1482.anInt1554) {
               return null;
            }

            var1 = this.aClass124_1482.aClass116Array1552[this.anInt1481++].next;
         } while(var1 == this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1]);

         this.aClass116_1480 = var1.next;
         this.aClass116_1479 = var1;
         return var1;
      }
   }

   void method1512() {
      this.aClass116_1480 = this.aClass124_1482.aClass116Array1552[0].next;
      this.anInt1481 = 1;
      this.aClass116_1479 = null;
   }

   public void remove() {
      if(this.aClass116_1479 == null) {
         throw new IllegalStateException();
      } else {
         this.aClass116_1479.unlink();
         this.aClass116_1479 = null;
      }
   }

   public boolean hasNext() {
      if(this.aClass116_1480 != this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1]) {
         return true;
      } else {
         while(this.anInt1481 < this.aClass124_1482.anInt1554) {
            if(this.aClass124_1482.aClass116Array1552[this.anInt1481++].next != this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1]) {
               this.aClass116_1480 = this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1].next;
               return true;
            }

            this.aClass116_1480 = this.aClass124_1482.aClass116Array1552[this.anInt1481 - 1];
         }

         return false;
      }
   }

}
