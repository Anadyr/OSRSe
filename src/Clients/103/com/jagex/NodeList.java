package com.jagex;
import java.util.Iterator;

public class NodeList implements Iterable {

   Node currentNode = new Node();

   public void method1590(Node var1) {
      if(var1.nextNode != null) {
         var1.unlink();
      }

      var1.nextNode = this.currentNode.nextNode;
      var1.prevNode = this.currentNode;
      var1.nextNode.prevNode = var1;
      var1.prevNode.nextNode = var1;
   }

   public Node method1591() {
      return this.method1592((Node)null);
   }

   Node method1592(Node var1) {
      Node var2;
      if(var1 == null) {
         var2 = this.currentNode.prevNode;
      } else {
         var2 = var1;
      }

      return var2 == this.currentNode ?null:var2;
   }

   public Iterator iterator() {
      return new Class120(this);
   }

   public NodeList() {
      this.currentNode.prevNode = this.currentNode;
      this.currentNode.nextNode = this.currentNode;
   }

}
