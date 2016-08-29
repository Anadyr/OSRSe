package com.jagex;
import java.nio.ByteBuffer;

public class Class63_Sub1 extends Class63 {

   ByteBuffer aByteBuffer1878;

   byte[] method919(int var1) {
      byte[] var2 = new byte[this.aByteBuffer1878.capacity()];
      this.aByteBuffer1878.position(0);
      this.aByteBuffer1878.get(var2);
      return var2;
   }

   void method929(byte[] var1, int var2) {
      this.aByteBuffer1878 = ByteBuffer.allocateDirect(var1.length);
      this.aByteBuffer1878.position(0);
      this.aByteBuffer1878.put(var1);
   }

}
