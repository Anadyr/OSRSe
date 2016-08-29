package com.jagex;

public class Class135 {

   public int anInt1606;
   public int anInt1607;
   public int anInt1608;
   byte aByte1609;
   public int anInt1610;
   public int anInt1611;

   public int method1722(int var1) {
      return (this.aByte1609 & 8) == 8?1:0;
   }

   void method1724(Integer var1, int var2) {}

   void method1726(int var1, int var2) {
      this.aByte1609 &= -9;
      if(var1 == 1) {
         this.aByte1609 = (byte)(this.aByte1609 | 8);
      }

   }

   void method1727(int var1, int var2) {
      this.aByte1609 &= -8;
      this.aByte1609 = (byte)(this.aByte1609 | var1 & 7);
   }

   public Class135(Buffer buffer, boolean var2) {
      this.aByte1609 = buffer.readUnsignedByte(1340117226);
      this.anInt1607 = buffer.readShort(580904369) * 2093012407;
      this.anInt1608 = buffer.readInt(-1646021122) * -47131975;
      this.anInt1606 = buffer.readInt(-919008561) * -176675101;
      this.anInt1611 = buffer.readInt(-1894039243) * -937940271;
      this.anInt1610 = buffer.readInt(-1083772962) * 1084003279;
      if(var2) {
         int var5 = 0;
         boolean var3 = false;

         while(true) {
            int var7 = buffer.readSignedByte(1708176767);
            if(255 == var7) {
               Integer var6 = var3?Integer.valueOf(var5):null;
               this.method1724(var6, 1845334399);
               break;
            }

            if(0 != var7) {
               throw new IllegalStateException("");
            }

            while(true) {
               int var4 = buffer.readSignedByte(1708176767);
               if(var4 == 255) {
                  break;
               }

               buffer.position -= -184175589;
               if(buffer.readShort(650805208) != 0) {
                  throw new IllegalStateException("");
               }

               if(var3) {
                  throw new IllegalStateException("");
               }

               var5 = buffer.readInt(-1350780149);
               var3 = true;
            }
         }
      }

   }

   public int method1734(int var1) {
      return this.aByte1609 & 7;
   }

   public Class135() {}

   public static void method1739(short var0) {
      Class116_Sub23_Sub14.aClass123_2428.method1635();
   }
}
