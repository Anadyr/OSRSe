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
            Node var2 = var3.next;
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

      for(this.aClass116_1553 = var3.next; this.aClass116_1553 != var3; this.aClass116_1553 = this.aClass116_1553.next) {
         if(this.aClass116_1553.hashId == var1) {
            Node var4 = this.aClass116_1553;
            this.aClass116_1553 = this.aClass116_1553.next;
            return var4;
         }
      }

      this.aClass116_1553 = null;
      return null;
   }

   public void putUniqueId(Node node, long id) {
      if(node.previous != null) {
         node.unlink();
      }

      Node var4 = this.aClass116Array1552[(int)(id & (long)(this.anInt1554 - 1))];
      node.previous = var4.previous;
      node.next = var4;
      node.previous.next = node;
      node.next.previous = node;
      node.hashId = id;
   }

   public Class124(int var1) {
      this.anInt1554 = var1;
      this.aClass116Array1552 = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.aClass116Array1552[var2] = new Node();
         var3.next = var3;
         var3.previous = var3;
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
            Node var3 = var2.next;
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
      if(var1.previous != null) {
         var1.unlink();
      }

      Node var4 = this.aClass116Array1552[(int)(var2 & (long)(this.anInt1554 - 1))];
      var1.previous = var4.previous;
      var1.next = var4;
      var1.previous.next = var1;
      var1.next.previous = var1;
      var1.hashId = var2;
   }

   public Iterator method1648() {
      return new Class111(this);
   }

   public Iterator method1649() {
      return new Class111(this);
   }
}
