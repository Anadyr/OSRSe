package com.jagex;

public final class Class121 {

   NodeContainer aNodeContainer_1528 = new NodeContainer();

   public void method1616(NodeContainer var1) {
      if(var1.nextNodeContainer != null) {
         var1.unlinkContainer();
      }

      var1.nextNodeContainer = this.aNodeContainer_1528;
      var1.prevNodeContainer = this.aNodeContainer_1528.prevNodeContainer;
      var1.nextNodeContainer.prevNodeContainer = var1;
      var1.prevNodeContainer.nextNodeContainer = var1;
   }

   NodeContainer method1617() {
      NodeContainer var1 = this.aNodeContainer_1528.prevNodeContainer;
      if(var1 == this.aNodeContainer_1528) {
         return null;
      } else {
         var1.unlinkContainer();
         return var1;
      }
   }

   public NodeContainer method1618() {
      NodeContainer var1 = this.aNodeContainer_1528.prevNodeContainer;
      return var1 == this.aNodeContainer_1528 ?null:var1;
   }

   public void method1620(NodeContainer var1) {
      if(var1.nextNodeContainer != null) {
         var1.unlinkContainer();
      }

      var1.nextNodeContainer = this.aNodeContainer_1528.nextNodeContainer;
      var1.prevNodeContainer = this.aNodeContainer_1528;
      var1.nextNodeContainer.prevNodeContainer = var1;
      var1.prevNodeContainer.nextNodeContainer = var1;
   }

   void method1625() {
      while(true) {
         NodeContainer var1 = this.aNodeContainer_1528.prevNodeContainer;
         if(var1 == this.aNodeContainer_1528) {
            return;
         }

         var1.unlinkContainer();
      }
   }

   public Class121() {
      this.aNodeContainer_1528.prevNodeContainer = this.aNodeContainer_1528;
      this.aNodeContainer_1528.nextNodeContainer = this.aNodeContainer_1528;
   }
}
