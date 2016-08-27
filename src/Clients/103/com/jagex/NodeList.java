package com.jagex;
import java.util.Iterator;

public class NodeList implements Iterable {

   Node currentNode = new Node();

   public void method1590(Node var1) {
      if(var1.previous != null) {
         var1.unlink();
      }

      var1.previous = this.currentNode.previous;
      var1.next = this.currentNode;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   public Node method1591() {
      return this.method1592((Node)null);
   }

   Node method1592(Node var1) {
      Node var2;
      if(var1 == null) {
         var2 = this.currentNode.next;
      } else {
         var2 = var1;
      }

      return var2 == this.currentNode ?null:var2;
   }

   public Iterator iterator() {
      return new Class120(this);
   }

   public NodeList() {
      this.currentNode.next = this.currentNode;
      this.currentNode.previous = this.currentNode;
   }

}
