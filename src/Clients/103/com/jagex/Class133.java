package com.jagex;

public class Class133 {

   public Class135 aClass135_1598;
   public long aLong1599;
   String aString1600;
   public int anInt1601;
   String aString1602;
   static String OPERATING_SYSTEM_NAME;

   public String method1710(int var1) {
      return this.aString1602;
   }

   public String method1711(int var1) {
      return this.aString1600;
   }

   Class133(Packet var1, byte var2, int var3) {
      this.aString1600 = var1.readString(61376769);
      this.aString1602 = var1.readString(61376769);
      this.anInt1601 = var1.readUnsignedShort(3742389) * -1446820033;
      this.aLong1599 = var1.readLong((byte) 72) * 5393883135847443407L;
      int var4 = var1.readInt(-872024090);
      int var5 = var1.readInt(-1199921422);
      this.aClass135_1598 = new Class135();
      this.aClass135_1598.method1727(2, 1307933526);
      this.aClass135_1598.method1726(var2, -1247241066);
      this.aClass135_1598.anInt1608 = var4 * -47131975;
      this.aClass135_1598.anInt1606 = var5 * -176675101;
      this.aClass135_1598.anInt1611 = 0;
      this.aClass135_1598.anInt1610 = 0;
      this.aClass135_1598.anInt1607 = 2093012407 * var3;
   }

}
