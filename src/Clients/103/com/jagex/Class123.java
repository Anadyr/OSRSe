package com.jagex;

public final class Class123 {

   int anInt1547;
   Hashtable aHashtable_1548;
   int anInt1549;
   NodeContainer aNodeContainer_1550 = new NodeContainer();
   Class121 aClass121_1551 = new Class121();

   public NodeContainer method1632(long var1) {
      NodeContainer var3 = (NodeContainer)this.aHashtable_1548.get(var1);
      if(var3 != null) {
         this.aClass121_1551.method1620(var3);
      }

      return var3;
   }

   public void method1633(NodeContainer var1, long var2) {
      if(this.anInt1549 == 0) {
         NodeContainer var4 = this.aClass121_1551.method1617();
         var4.unlink();
         var4.unlinkContainer();
         if(var4 == this.aNodeContainer_1550) {
            var4 = this.aClass121_1551.method1617();
            var4.unlink();
            var4.unlinkContainer();
         }
      } else {
         --this.anInt1549;
      }

      this.aHashtable_1548.put(var1, var2);
      this.aClass121_1551.method1620(var1);
   }

   public void method1635() {
      this.aClass121_1551.method1625();
      this.aHashtable_1548.pool();
      this.aNodeContainer_1550 = new NodeContainer();
      this.anInt1549 = this.anInt1547;
   }

   public Class123(int var1) {
      this.anInt1547 = var1;
      this.anInt1549 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.aHashtable_1548 = new Hashtable(var2);
   }

   public void method1642(long var1) {
      NodeContainer var3 = (NodeContainer)this.aHashtable_1548.get(var1);
      if(var3 != null) {
         var3.unlink();
         var3.unlinkContainer();
         ++this.anInt1549;
      }

   }
}
