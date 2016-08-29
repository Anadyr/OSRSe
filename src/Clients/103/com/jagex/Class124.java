package com.jagex;
import java.util.Iterator;

public final class Class124 implements Iterable {

   Node[] aClass116Array1552;
   Node aClass116_1553;
   int anInt1554;


   public void method1643() {
      int var1 = 0;

      while(var1 < this.anInt1554) {
         Node var3 = this.aClass116Array1552[var1];

         while(true) {
            Node var2 = var3.prevNode;
            if(var2 == var3) {
               ++var1;
               break;
            }

            var2.unlink();
         }
      }

      this.aClass116_1553 = null;
   }

   public Node method1644(long var1) {
      Node var3 = this.aClass116Array1552[(int)(var1 & (long)(this.anInt1554 - 1))];

      for(this.aClass116_1553 = var3.prevNode; this.aClass116_1553 != var3; this.aClass116_1553 = this.aClass116_1553.prevNode) {
         if(this.aClass116_1553.nodeId == var1) {
            Node var4 = this.aClass116_1553;
            this.aClass116_1553 = this.aClass116_1553.prevNode;
            return var4;
         }
      }

      this.aClass116_1553 = null;
      return null;
   }

   public void putUniqueId(Node node, long id) {
      if(node.nextNode != null) {
         node.unlink();
      }

      Node var4 = this.aClass116Array1552[(int)(id & (long)(this.anInt1554 - 1))];
      node.nextNode = var4.nextNode;
      node.prevNode = var4;
      node.nextNode.prevNode = node;
      node.prevNode.nextNode = node;
      node.nodeId = id;
   }

   public Class124(int var1) {
      this.anInt1554 = var1;
      this.aClass116Array1552 = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.aClass116Array1552[var2] = new Node();
         var3.prevNode = var3;
         var3.nextNode = var3;
      }

   }

   public Iterator iterator() {
      return new Class111(this);
   }

   public void method1646() {
      int var1 = 0;

      while(var1 < this.anInt1554) {
         Node var2 = this.aClass116Array1552[var1];

         while(true) {
            Node var3 = var2.prevNode;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.unlink();
         }
      }

      this.aClass116_1553 = null;
   }

   public void method1647(Node var1, long var2) {
      if(var1.nextNode != null) {
         var1.unlink();
      }

      Node var4 = this.aClass116Array1552[(int)(var2 & (long)(this.anInt1554 - 1))];
      var1.nextNode = var4.nextNode;
      var1.prevNode = var4;
      var1.nextNode.prevNode = var1;
      var1.prevNode.nextNode = var1;
      var1.nodeId = var2;
   }

   public Iterator method1648() {
      return new Class111(this);
   }

   public Iterator method1649() {
      return new Class111(this);
   }
}
