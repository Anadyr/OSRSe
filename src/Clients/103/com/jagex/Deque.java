package com.jagex;

public class Deque {

   public Node head = new Node();
   Node current;


   public void clear() {
      while(true) {
         Node node = this.head.next;
         if(node == this.head) {
            this.current = null;
            return;
         }

         node.unlink();
      }
   }

   public Deque() {
      this.head.next = this.head;
      this.head.previous = this.head;
   }

   public static void addLast(Node node, Node head) {
      if(node.previous != null) {
         node.unlink();
      }

      node.previous = head.previous;
      node.next = head;
      node.previous.next = node;
      node.next.previous = node;
   }

   public Node removeFirst() {
      Node node = this.head.next;
      if(node == this.head) {
         return null;
      } else {
         node.unlink();
         return node;
      }
   }

   public Node removeLast() {
      Node var1 = this.head.previous;
      if(var1 == this.head) {
         return null;
      } else {
         var1.unlink();
         return var1;
      }
   }

   public Node getFirst() {
      Node node = this.head.next;
      if(node != this.head) {
         this.current = node.next;
         return node;
      } else {
         this.current = null;
         return null;
      }
   }

   public Node getLast() {
      Node var1 = this.head.previous;
      if(var1 != this.head) {
         this.current = var1.previous;
         return var1;
      } else {
         this.current = null;
         return null;
      }
   }

   public Node getNext() {
      Node node = this.current;
      if(node == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = node.next;
         return node;
      }
   }

   public void addFront(Node node) {
      if(node.previous != null) {
         node.unlink();
      }

      node.previous = this.head;
      node.next = this.head.next;
      node.previous.next = node;
      node.next.previous = node;
   }

   public void addLast(Node node) {
      if(node.previous != null) {
         node.unlink();
      }

      node.previous = this.head.previous;
      node.next = this.head;
      node.previous.next = node;
      node.next.previous = node;
   }

   public Node getPrevious() {
      Node node = this.current;
      if(node != this.head) {
         this.current = node.previous;
         return node;
      } else {
         this.current = null;
         return null;
      }
   }
}
