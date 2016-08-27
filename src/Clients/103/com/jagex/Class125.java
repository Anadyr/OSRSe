package com.jagex;
import java.util.Iterator;

public class Class125 implements Iterable {

   public NodeContainer prev = new NodeContainer();

   public void method1650() {
      while(this.prev.prevNodeContainer != this.prev) {
         this.prev.prevNodeContainer.unlinkContainer();
      }

   }

   public void method1652(NodeContainer var1) {
      if(var1.nextNodeContainer != null) {
         var1.unlinkContainer();
      }

      var1.nextNodeContainer = this.prev.nextNodeContainer;
      var1.prevNodeContainer = this.prev;
      var1.nextNodeContainer.prevNodeContainer = var1;
      var1.prevNodeContainer.nextNodeContainer = var1;
   }

   public Iterator iterator() {
      return new Class115(this);
   }

   public Class125() {
      this.prev.prevNodeContainer = this.prev;
      this.prev.nextNodeContainer = this.prev;
   }

}
