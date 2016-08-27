package com.jagex;

public class Queue {

   NodeSub nextOnList;
   NodeSub head = new NodeSub();


   public NodeSub popFront() {
      NodeSub node = this.head.nextSub;
      if(node == this.head) {
         this.nextOnList = null;
         return null;
      } else {
         this.nextOnList = node.nextSub;
         return node;
      }
   }

    public NodeSub peekFront() {
        NodeSub node = this.nextOnList;
        if(node == this.head) {
            this.nextOnList = null;
            return null;
        } else {
            this.nextOnList = node.nextSub;
            return node;
        }
    }

   public void insertBack(NodeSub node) {
      if(node.previousSub != null) {
         node.unlink();
      }

      node.nextSub = this.head;
      node.previousSub = this.head.previousSub;
      node.previousSub.nextSub = node;
      node.nextSub.previousSub = node;
   }

   public Queue() {
      this.head.nextSub = this.head;
      this.head.previousSub = this.head;
   }

}
