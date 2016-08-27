package com.jagex;

public final class Hashtable {

   Node next;
   Node[] table;
   int size;
   Node lastIterated;
   int current = 0;


   public Node get(long h) {
      Node var3 = this.table[(int)(h & (long)(this.size - 1))];

      for(this.next = var3.next; this.next != var3; this.next = this.next.next) {
         if(this.next.hashId == h) {
            Node var4 = this.next;
            this.next = this.next.next;
            return var4;
         }
      }

      this.next = null;
      return null;
   }

   void pool() {
      int var1 = 0;

      while(var1 < this.size) {
         Node var2 = this.table[var1];

         while(true) {
            Node var3 = var2.next;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.unlink();
         }
      }

      this.next = null;
      this.lastIterated = null;
   }

   public Node getFirst() {
      this.current = 0;
      return this.getNext();
   }

   public Node getNext() {
      Node var1;
      if(this.current > 0 && this.lastIterated != this.table[this.current - 1]) {
         var1 = this.lastIterated;
         this.lastIterated = var1.next;
         return var1;
      } else {
         do {
            if(this.current >= this.size) {
               return null;
            }

            var1 = this.table[this.current++].next;
         } while(var1 == this.table[this.current - 1]);

         this.lastIterated = var1.next;
         return var1;
      }
   }

   public Hashtable(int i) {
      this.size = i;
      this.table = new Node[i];

      for(int var3 = 0; var3 < i; ++var3) {
         Node var2 = this.table[var3] = new Node();
         var2.next = var2;
         var2.previous = var2;
      }

   }

   public void put(Node remove, long hash) {
      if(remove.previous != null) {
         remove.unlink();
      }

      Node var4 = this.table[(int)(hash & (long)(this.size - 1))];
      remove.previous = var4.previous;
      remove.next = var4;
      remove.previous.next = remove;
      remove.next.previous = remove;
      remove.hashId = hash;
   }

}
