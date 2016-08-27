package com.jagex;

public class NodeSub {

   NodeSub previousSub;
   NodeSub nextSub;

   public void unlink() {
      if(this.previousSub != null) {
         this.previousSub.nextSub = this.nextSub;
         this.nextSub.previousSub = this.previousSub;
         this.nextSub = null;
         this.previousSub = null;
      }
   }

}
