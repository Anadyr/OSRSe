package com.jagex;
import java.util.Comparator;

final class Class134 implements Comparator {


   int method1716(Class133 var1, Class133 var2, byte var3) {
      return var1.aLong1599 * -3596478625201456337L < -3596478625201456337L * var2.aLong1599?-1:(var1.aLong1599 * -3596478625201456337L == var2.aLong1599 * -3596478625201456337L?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1716((Class133)var1, (Class133)var2, (byte)127);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

}
