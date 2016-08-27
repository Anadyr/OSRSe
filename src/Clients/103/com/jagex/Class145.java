package com.jagex;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class145 {

   RandomAccessFile aRandomAccessFile1647;
   long aLong1648;
   long aLong1649;
   protected static int anInt1650;

   final void method1810(long var1) throws IOException {
      this.aRandomAccessFile1647.seek(var1);
      this.aLong1649 = var1 * 7395148145892317065L;
   }

   public final int method1811(byte[] var1, int var2, int var3, int var4) throws IOException {
      int var5 = this.aRandomAccessFile1647.read(var1, var2, var3);
      if(var5 > 0) {
         this.aLong1649 += (long)var5 * 7395148145892317065L;
      }

      return var5;
   }

   public final long method1813(int var1) throws IOException {
      return this.aRandomAccessFile1647.length();
   }

   protected void finalize() throws Throwable {
      if(null != this.aRandomAccessFile1647) {
         this.method1828(1081104472);
      }

   }

   public Class145(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() >= var3) {
         var1.delete();
      }

      this.aRandomAccessFile1647 = new RandomAccessFile(var1, var2);
      this.aLong1648 = var3 * -4964951671876364163L;
      this.aLong1649 = 0L;
      int var5 = this.aRandomAccessFile1647.read();
      if(-1 != var5 && !var2.equals("r")) {
         this.aRandomAccessFile1647.seek(0L);
         this.aRandomAccessFile1647.write(var5);
      }

      this.aRandomAccessFile1647.seek(0L);
   }

   public final void method1828(int var1) throws IOException {
      if(null != this.aRandomAccessFile1647) {
         this.aRandomAccessFile1647.close();
         this.aRandomAccessFile1647 = null;
      }

   }

   public final void method1832(byte[] var1, int var2, int var3, int var4) throws IOException {
      if((long)var3 + this.aLong1649 * -5122398371314086215L > 2578186986756399317L * this.aLong1648) {
         this.aRandomAccessFile1647.seek(2578186986756399317L * this.aLong1648 + 1L);
         this.aRandomAccessFile1647.write(1);
         throw new EOFException();
      } else {
         this.aRandomAccessFile1647.write(var1, var2, var3);
         this.aLong1649 += (long)var3 * 7395148145892317065L;
      }
   }

}
