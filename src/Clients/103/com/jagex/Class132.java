package com.jagex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class132 {

   public static Comparator aComparator1591 = new Class134();
   public static Comparator aComparator1592;
   public static Comparator aComparator1593;
   public List aList1594;
   public static Comparator aComparator1595;
   static int anInt1597;


   public Class132(Packet var1, boolean var2) {
      int var4 = var1.readUnsignedShort(1890999996);
      boolean var5 = var1.readSignedByte(1708176767) == 1;
      byte var6;
      if(var5) {
         var6 = 1;
      } else {
         var6 = 0;
      }

      int var7 = var1.readUnsignedShort(-264672068);

       System.out.print("readUnsignedShort="+var4+", readBoolean="+var5+", readUnsignedShort="+var7);
      this.aList1594 = new ArrayList(var7);

      for(int var3 = 0; var3 < var7; ++var3) {
         this.aList1594.add(new Class133(var1, var6, var4));
      }

   }

   static {
      new Class130();
      aComparator1592 = new Class129();
      aComparator1593 = new Class141();
      aComparator1595 = new Class142();
   }

   public void method1705(Comparator var1, boolean var2, int var3) {
      if(!var2) {
         Collections.sort(this.aList1594, Collections.reverseOrder(var1));
      } else {
         Collections.sort(this.aList1594, var1);
      }

   }

}
