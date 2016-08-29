package com.jagex;

public class Class113 {

   int[] anIntArray1486;

   public int method1525(int var1) {
      int var2 = (this.anIntArray1486.length >> 1) - 1;
      int var3 = var1 & var2;

      while(true) {
         int var4 = this.anIntArray1486[var3 + var3 + 1];
         if(var4 == -1) {
            return -1;
         }

         if(this.anIntArray1486[var3 + var3] == var1) {
            return var4;
         }

         var3 = var3 + 1 & var2;
      }
   }

   public Class113(int[] var1) {
      int var3;
      for(var3 = 1; var3 <= var1.length + (var1.length >> 1); var3 <<= 1) {
         ;
      }

      this.anIntArray1486 = new int[var3 + var3];

      int var2;
      for(var2 = 0; var2 < var3 + var3; ++var2) {
         this.anIntArray1486[var2] = -1;
      }

      int var4;
      for(var2 = 0; var2 < var1.length; this.anIntArray1486[var4 + var4 + 1] = var2++) {
         for(var4 = var1[var2] & var3 - 1; this.anIntArray1486[var4 + var4 + 1] != -1; var4 = var4 + 1 & var3 - 1) {
            ;
         }

         this.anIntArray1486[var4 + var4] = var1[var2];
      }

   }
}
