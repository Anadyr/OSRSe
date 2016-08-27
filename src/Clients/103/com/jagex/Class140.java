package com.jagex;
import java.io.EOFException;
import java.io.IOException;

public class Class140 {

   int anInt1622 = 0;
   byte[] aByteArray1623;
   long aLong1624 = 5253023908969503755L;
   long aLong1625;
   int anInt1626;
   byte[] aByteArray1627;
   long aLong1628;
   long aLong1629;
   long aLong1630 = -5097607827615164521L;
   long aLong1631;
   Class145 aClass145_1632;


   public void method1762(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-1L != -2285779735292712999L * this.aLong1630 && -8326374793673939791L * this.aLong1629 >= this.aLong1630 * -2285779735292712999L && -8326374793673939791L * this.aLong1629 + (long)var3 <= -2285779735292712999L * this.aLong1630 + (long)(this.anInt1622 * 183200453)) {
            System.arraycopy(this.aByteArray1627, (int)(this.aLong1629 * -8326374793673939791L - this.aLong1630 * -2285779735292712999L), var1, var2, var3);
            this.aLong1629 += (long)var3 * -5616494910779726767L;
            return;
         }

         long var5 = this.aLong1629 * -8326374793673939791L;
         int var8 = var3;
         int var9;
         if(this.aLong1629 * -8326374793673939791L >= this.aLong1624 * 5978608391698526301L && this.aLong1629 * -8326374793673939791L < (long)(this.anInt1626 * -293863773) + this.aLong1624 * 5978608391698526301L) {
            var9 = (int)((long)(-293863773 * this.anInt1626) - (this.aLong1629 * -8326374793673939791L - 5978608391698526301L * this.aLong1624));
            if(var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.aByteArray1623, (int)(this.aLong1629 * -8326374793673939791L - 5978608391698526301L * this.aLong1624), var1, var2, var9);
            this.aLong1629 += -5616494910779726767L * (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if(var3 > this.aByteArray1623.length) {
            this.aClass145_1632.method1810(-8326374793673939791L * this.aLong1629);

            for(this.aLong1625 = this.aLong1629 * 1575725130253279575L; var3 > 0; var3 -= var9) {
               var9 = this.aClass145_1632.method1811(var1, var2, var3, 1066868057);
               if(var9 == -1) {
                  break;
               }

               this.aLong1625 += -7398757543161329529L * (long)var9;
               this.aLong1629 += (long)var9 * -5616494910779726767L;
               var2 += var9;
            }
         } else if(var3 > 0) {
            this.method1767((byte)-35);
            var9 = var3;
            if(var3 > this.anInt1626 * -293863773) {
               var9 = -293863773 * this.anInt1626;
            }

            System.arraycopy(this.aByteArray1623, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.aLong1629 += -5616494910779726767L * (long)var9;
         }

         if(-1L != this.aLong1630 * -2285779735292712999L) {
            if(this.aLong1630 * -2285779735292712999L > this.aLong1629 * -8326374793673939791L && var3 > 0) {
               var9 = (int)(this.aLong1630 * -2285779735292712999L - -8326374793673939791L * this.aLong1629) + var2;
               if(var9 > var2 + var3) {
                  var9 = var2 + var3;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  this.aLong1629 += -5616494910779726767L;
               }
            }

            long var10 = -1L;
            long var12 = -1L;
            if(-2285779735292712999L * this.aLong1630 >= var5 && -2285779735292712999L * this.aLong1630 < (long)var8 + var5) {
               var10 = this.aLong1630 * -2285779735292712999L;
            } else if(var5 >= -2285779735292712999L * this.aLong1630 && var5 < this.aLong1630 * -2285779735292712999L + (long)(183200453 * this.anInt1622)) {
               var10 = var5;
            }

            if(-2285779735292712999L * this.aLong1630 + (long)(183200453 * this.anInt1622) > var5 && this.aLong1630 * -2285779735292712999L + (long)(this.anInt1622 * 183200453) <= var5 + (long)var8) {
               var12 = this.aLong1630 * -2285779735292712999L + (long)(this.anInt1622 * 183200453);
            } else if((long)var8 + var5 > this.aLong1630 * -2285779735292712999L && (long)var8 + var5 <= (long)(183200453 * this.anInt1622) + -2285779735292712999L * this.aLong1630) {
               var12 = (long)var8 + var5;
            }

            if(var10 > -1L && var12 > var10) {
               int var14 = (int)(var12 - var10);
               System.arraycopy(this.aByteArray1627, (int)(var10 - this.aLong1630 * -2285779735292712999L), var1, (int)(var10 - var5) + var2, var14);
               if(var12 > this.aLong1629 * -8326374793673939791L) {
                  var3 = (int)((long)var3 - (var12 - -8326374793673939791L * this.aLong1629));
                  this.aLong1629 = var12 * -5616494910779726767L;
               }
            }
         }
      } catch (IOException var16) {
         this.aLong1625 = 7398757543161329529L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   public void method1763(short var1) throws IOException {
      this.method1772(727116725);
      this.aClass145_1632.method1828(2144410629);
   }

   public void method1764(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if((long)var3 + this.aLong1629 * -8326374793673939791L > this.aLong1631 * -6553346398192807047L) {
            this.aLong1631 = -6892656516173322551L * ((long)var3 + this.aLong1629 * -8326374793673939791L);
         }

         if(-1L != this.aLong1630 * -2285779735292712999L && (-8326374793673939791L * this.aLong1629 < -2285779735292712999L * this.aLong1630 || this.aLong1629 * -8326374793673939791L > (long)(183200453 * this.anInt1622) + this.aLong1630 * -2285779735292712999L)) {
            this.method1772(727116725);
         }

         if(-1L != this.aLong1630 * -2285779735292712999L && (long)var3 + this.aLong1629 * -8326374793673939791L > this.aLong1630 * -2285779735292712999L + (long)this.aByteArray1627.length) {
            int var5 = (int)((long)this.aByteArray1627.length - (this.aLong1629 * -8326374793673939791L - this.aLong1630 * -2285779735292712999L));
            System.arraycopy(var1, var2, this.aByteArray1627, (int)(-8326374793673939791L * this.aLong1629 - this.aLong1630 * -2285779735292712999L), var5);
            this.aLong1629 += -5616494910779726767L * (long)var5;
            var2 += var5;
            var3 -= var5;
            this.anInt1622 = this.aByteArray1627.length * -1159298035;
            this.method1772(727116725);
         }

         if(var3 <= this.aByteArray1627.length) {
            if(var3 > 0) {
               if(-2285779735292712999L * this.aLong1630 == -1L) {
                  this.aLong1630 = -5837336162449394535L * this.aLong1629;
               }

               System.arraycopy(var1, var2, this.aByteArray1627, (int)(this.aLong1629 * -8326374793673939791L - this.aLong1630 * -2285779735292712999L), var3);
               this.aLong1629 += -5616494910779726767L * (long)var3;
               if(this.aLong1629 * -8326374793673939791L - this.aLong1630 * -2285779735292712999L > (long)(this.anInt1622 * 183200453)) {
                  this.anInt1622 = (int)(-8326374793673939791L * this.aLong1629 - this.aLong1630 * -2285779735292712999L) * -1159298035;
               }

            }
         } else {
            if(-4876416496348054217L * this.aLong1625 != -8326374793673939791L * this.aLong1629) {
               this.aClass145_1632.method1810(this.aLong1629 * -8326374793673939791L);
               this.aLong1625 = 1575725130253279575L * this.aLong1629;
            }

            this.aClass145_1632.method1832(var1, var2, var3, -449795454);
            this.aLong1625 += -7398757543161329529L * (long)var3;
            if(-4876416496348054217L * this.aLong1625 > 182354950301920001L * this.aLong1628) {
               this.aLong1628 = 2869469855561285687L * this.aLong1625;
            }

            long var6 = -1L;
            long var8 = -1L;
            if(-8326374793673939791L * this.aLong1629 >= 5978608391698526301L * this.aLong1624 && -8326374793673939791L * this.aLong1629 < 5978608391698526301L * this.aLong1624 + (long)(-293863773 * this.anInt1626)) {
               var6 = this.aLong1629 * -8326374793673939791L;
            } else if(5978608391698526301L * this.aLong1624 >= -8326374793673939791L * this.aLong1629 && this.aLong1624 * 5978608391698526301L < (long)var3 + -8326374793673939791L * this.aLong1629) {
               var6 = 5978608391698526301L * this.aLong1624;
            }

            if((long)var3 + -8326374793673939791L * this.aLong1629 > 5978608391698526301L * this.aLong1624 && -8326374793673939791L * this.aLong1629 + (long)var3 <= (long)(-293863773 * this.anInt1626) + this.aLong1624 * 5978608391698526301L) {
               var8 = (long)var3 + this.aLong1629 * -8326374793673939791L;
            } else if(this.aLong1624 * 5978608391698526301L + (long)(this.anInt1626 * -293863773) > -8326374793673939791L * this.aLong1629 && this.aLong1624 * 5978608391698526301L + (long)(-293863773 * this.anInt1626) <= (long)var3 + -8326374793673939791L * this.aLong1629) {
               var8 = (long)(-293863773 * this.anInt1626) + 5978608391698526301L * this.aLong1624;
            }

            if(var6 > -1L && var8 > var6) {
               int var10 = (int)(var8 - var6);
               System.arraycopy(var1, (int)(var6 + (long)var2 - this.aLong1629 * -8326374793673939791L), this.aByteArray1623, (int)(var6 - this.aLong1624 * 5978608391698526301L), var10);
            }

            this.aLong1629 += (long)var3 * -5616494910779726767L;
         }
      } catch (IOException var11) {
         this.aLong1625 = 7398757543161329529L;
         throw var11;
      }
   }

   public Class140(Class145 var1, int var2, int var3) throws IOException {
      this.aClass145_1632 = var1;
      this.aLong1631 = (this.aLong1628 = var1.method1813(-980664584) * -5755731196710398719L) * -9096814420392384055L;
      this.aByteArray1623 = new byte[var2];
      this.aByteArray1627 = new byte[var3];
      this.aLong1629 = 0L;
   }

   public void method1765(byte[] var1, int var2) throws IOException {
      this.method1762(var1, 0, var1.length, -1307615779);
   }

   void method1767(byte var1) throws IOException {
      this.anInt1626 = 0;
      if(-4876416496348054217L * this.aLong1625 != this.aLong1629 * -8326374793673939791L) {
         this.aClass145_1632.method1810(this.aLong1629 * -8326374793673939791L);
         this.aLong1625 = this.aLong1629 * 1575725130253279575L;
      }

      int var2;
      for(this.aLong1624 = this.aLong1629 * 3944497200042446949L; this.anInt1626 * -293863773 < this.aByteArray1623.length; this.anInt1626 += 235906315 * var2) {
         var2 = this.aClass145_1632.method1811(this.aByteArray1623, this.anInt1626 * -293863773, this.aByteArray1623.length - this.anInt1626 * -293863773, -1101347858);
         if(var2 == -1) {
            break;
         }

         this.aLong1625 += (long)var2 * -7398757543161329529L;
      }

   }

   public void method1771(long var1) throws IOException {
      if(var1 >= 0L) {
         this.aLong1629 = -5616494910779726767L * var1;
      } else {
         throw new IOException("");
      }
   }

   void method1772(int var1) throws IOException {
      if(-1L != this.aLong1630 * -2285779735292712999L) {
         if(this.aLong1625 * -4876416496348054217L != -2285779735292712999L * this.aLong1630) {
            this.aClass145_1632.method1810(-2285779735292712999L * this.aLong1630);
            this.aLong1625 = -5602583930400994449L * this.aLong1630;
         }

         this.aClass145_1632.method1832(this.aByteArray1627, 0, 183200453 * this.anInt1622, -943822271);
         this.aLong1625 += (long)this.anInt1622 * 8285643226346288611L;
         if(-4876416496348054217L * this.aLong1625 > 182354950301920001L * this.aLong1628) {
            this.aLong1628 = 2869469855561285687L * this.aLong1625;
         }

         long var2 = -1L;
         long var4 = -1L;
         if(-2285779735292712999L * this.aLong1630 >= this.aLong1624 * 5978608391698526301L && this.aLong1630 * -2285779735292712999L < this.aLong1624 * 5978608391698526301L + (long)(this.anInt1626 * -293863773)) {
            var2 = this.aLong1630 * -2285779735292712999L;
         } else if(this.aLong1624 * 5978608391698526301L >= this.aLong1630 * -2285779735292712999L && 5978608391698526301L * this.aLong1624 < this.aLong1630 * -2285779735292712999L + (long)(183200453 * this.anInt1622)) {
            var2 = 5978608391698526301L * this.aLong1624;
         }

         if((long)(183200453 * this.anInt1622) + -2285779735292712999L * this.aLong1630 > 5978608391698526301L * this.aLong1624 && (long)(183200453 * this.anInt1622) + -2285779735292712999L * this.aLong1630 <= 5978608391698526301L * this.aLong1624 + (long)(-293863773 * this.anInt1626)) {
            var4 = (long)(this.anInt1622 * 183200453) + -2285779735292712999L * this.aLong1630;
         } else if(5978608391698526301L * this.aLong1624 + (long)(this.anInt1626 * -293863773) > -2285779735292712999L * this.aLong1630 && (long)(-293863773 * this.anInt1626) + 5978608391698526301L * this.aLong1624 <= -2285779735292712999L * this.aLong1630 + (long)(183200453 * this.anInt1622)) {
            var4 = (long)(this.anInt1626 * -293863773) + 5978608391698526301L * this.aLong1624;
         }

         if(var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.aByteArray1627, (int)(var2 - this.aLong1630 * -2285779735292712999L), this.aByteArray1623, (int)(var2 - 5978608391698526301L * this.aLong1624), var6);
         }

         this.aLong1630 = -5097607827615164521L;
         this.anInt1622 = 0;
      }

   }

   public long method1778(int var1) {
      return this.aLong1631 * -6553346398192807047L;
   }

}
