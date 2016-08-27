package com.jagex;
import java.util.Iterator;

public class Class120 implements Iterator {

   Node aClass116_1525;
   NodeList aClass119_1526;
   Node aClass116_1527 = null;

   public boolean hasNext() {
      return this.aClass116_1525 != this.aClass119_1526.currentNode;
   }

   public void remove() {
      if(this.aClass116_1527 != null) {
         this.aClass116_1527.unlink();
         this.aClass116_1527 = null;
      } else {
         throw new IllegalStateException();
      }
   }

   public Object next() {
      Node var1 = this.aClass116_1525;
      if(var1 == this.aClass119_1526.currentNode) {
         var1 = null;
         this.aClass116_1525 = null;
      } else {
         this.aClass116_1525 = var1.next;
      }

      this.aClass116_1527 = var1;
      return var1;
   }

   Class120(NodeList var1) {
      this.aClass119_1526 = var1;
      this.aClass116_1525 = this.aClass119_1526.currentNode.next;
      this.aClass116_1527 = null;
   }

}
