package com.jagex;

public class NodeContainer extends Node {

   public NodeContainer nextNodeContainer, prevNodeContainer;

   public void unlinkContainer() {
      if(this.nextNodeContainer != null) {
         this.nextNodeContainer.prevNodeContainer = this.prevNodeContainer;
         this.prevNodeContainer.nextNodeContainer = this.nextNodeContainer;
         this.prevNodeContainer = null;
         this.nextNodeContainer = null;
      }
   }

}
