package com.jagex;

public class Node {

   public Node prevNode, nextNode;
   public long nodeId;

   public boolean hasNext() {
      return this.nextNode != null;
   }

   public void unlink() {
      if(this.nextNode != null) {
         this.nextNode.prevNode = this.prevNode;
         this.prevNode.nextNode = this.nextNode;
         this.prevNode = null;
         this.nextNode = null;
      }
   }
}
