package com.jagex;
import java.util.Iterator;

public class Class115 implements Iterator {

   Class125 aClass125_1514;
   NodeContainer aNodeContainer_1515;
   NodeContainer aNodeContainer_1516 = null;

   public Object next() {
      NodeContainer var1 = this.aNodeContainer_1515;
      if(var1 == this.aClass125_1514.prev) {
         var1 = null;
         this.aNodeContainer_1515 = null;
      } else {
         this.aNodeContainer_1515 = var1.prevNodeContainer;
      }

      this.aNodeContainer_1516 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.aNodeContainer_1515 != this.aClass125_1514.prev;
   }

   public void remove() {
      if(this.aNodeContainer_1516 == null) {
         throw new IllegalStateException();
      } else {
         this.aNodeContainer_1516.unlinkContainer();
         this.aNodeContainer_1516 = null;
      }
   }

   Class115(Class125 var1) {
      this.aClass125_1514 = var1;
      this.aNodeContainer_1515 = this.aClass125_1514.prev.prevNodeContainer;
      this.aNodeContainer_1516 = null;
   }

}
