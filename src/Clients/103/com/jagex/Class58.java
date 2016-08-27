package com.jagex;
import java.applet.Applet;

public class Class58 {

   int anInt760;
   public int[][] anIntArrayArray764;
   int anInt765 = 0;
   int anInt766 = 0;
   int anInt767;
   static Applet gameApplet;

   public void method857(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = 256;
      if(var5) {
         var7 += 131072;
      }

      var1 -= this.anInt765 * 1676632637;
      var2 -= 291084413 * this.anInt766;

      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         if(var8 >= 0 && var8 < this.anInt760 * 115906415) {
            for(int var9 = var2; var9 < var4 + var2; ++var9) {
               if(var9 >= 0 && var9 < -852495241 * this.anInt767) {
                  this.method860(var8, var9, var7, -719534463);
               }
            }
         }
      }

   }

   public void method858(int var1, int var2, int var3) {
      var1 -= this.anInt765 * 1676632637;
      var2 -= this.anInt766 * 291084413;
      this.anIntArrayArray764[var1][var2] |= 2097152;
   }

   public void method859(int var1, int var2, byte var3) {
      var1 -= this.anInt765 * 1676632637;
      var2 -= 291084413 * this.anInt766;
      this.anIntArrayArray764[var1][var2] |= 262144;
   }

   void method860(int var1, int var2, int var3, int var4) {
      this.anIntArrayArray764[var1][var2] |= var3;
   }

   public void method861(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.anInt765 * 1676632637;
      var2 -= this.anInt766 * 291084413;
      if(var3 == 0) {
         if(0 == var4) {
            this.method863(var1, var2, 128, -1738525806);
            this.method863(var1 - 1, var2, 8, -2120967412);
         }

         if(var4 == 1) {
            this.method863(var1, var2, 2, -126911584);
            this.method863(var1, var2 + 1, 32, -903663093);
         }

         if(2 == var4) {
            this.method863(var1, var2, 8, -1513727934);
            this.method863(var1 + 1, var2, 128, -1346108901);
         }

         if(var4 == 3) {
            this.method863(var1, var2, 32, -861763815);
            this.method863(var1, var2 - 1, 2, -270063238);
         }
      }

      if(1 == var3 || var3 == 3) {
         if(var4 == 0) {
            this.method863(var1, var2, 1, -820903986);
            this.method863(var1 - 1, 1 + var2, 16, -970307804);
         }

         if(var4 == 1) {
            this.method863(var1, var2, 4, -444799887);
            this.method863(1 + var1, 1 + var2, 64, -1418361085);
         }

         if(2 == var4) {
            this.method863(var1, var2, 16, -1210279142);
            this.method863(var1 + 1, var2 - 1, 1, -902994895);
         }

         if(var4 == 3) {
            this.method863(var1, var2, 64, -669511625);
            this.method863(var1 - 1, var2 - 1, 4, -1975045347);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method863(var1, var2, 130, -394049415);
            this.method863(var1 - 1, var2, 8, -1696716863);
            this.method863(var1, 1 + var2, 32, -1538130753);
         }

         if(1 == var4) {
            this.method863(var1, var2, 10, -217015115);
            this.method863(var1, 1 + var2, 32, -1183911856);
            this.method863(1 + var1, var2, 128, -329420901);
         }

         if(var4 == 2) {
            this.method863(var1, var2, 40, -210199716);
            this.method863(1 + var1, var2, 128, -354111092);
            this.method863(var1, var2 - 1, 2, -2000273650);
         }

         if(3 == var4) {
            this.method863(var1, var2, 160, -892922475);
            this.method863(var1, var2 - 1, 2, -661241718);
            this.method863(var1 - 1, var2, 8, -1771395844);
         }
      }

      if(var5) {
         if(0 == var3) {
            if(var4 == 0) {
               this.method863(var1, var2, 65536, -1561152636);
               this.method863(var1 - 1, var2, 4096, -351289504);
            }

            if(1 == var4) {
               this.method863(var1, var2, 1024, -2026375883);
               this.method863(var1, var2 + 1, 16384, -2067375404);
            }

            if(2 == var4) {
               this.method863(var1, var2, 4096, -1737896436);
               this.method863(1 + var1, var2, 65536, -7356838);
            }

            if(3 == var4) {
               this.method863(var1, var2, 16384, -909622250);
               this.method863(var1, var2 - 1, 1024, -1830914017);
            }
         }

         if(1 == var3 || var3 == 3) {
            if(var4 == 0) {
               this.method863(var1, var2, 512, -1320173632);
               this.method863(var1 - 1, var2 + 1, 8192, -119089730);
            }

            if(1 == var4) {
               this.method863(var1, var2, 2048, -1197193114);
               this.method863(1 + var1, var2 + 1, '\u8000', -87320740);
            }

            if(var4 == 2) {
               this.method863(var1, var2, 8192, -910775115);
               this.method863(1 + var1, var2 - 1, 512, -1826230935);
            }

            if(var4 == 3) {
               this.method863(var1, var2, '\u8000', -819671222);
               this.method863(var1 - 1, var2 - 1, 2048, -328497043);
            }
         }

         if(var3 == 2) {
            if(0 == var4) {
               this.method863(var1, var2, 66560, -1622482932);
               this.method863(var1 - 1, var2, 4096, -902301307);
               this.method863(var1, var2 + 1, 16384, -65357764);
            }

            if(1 == var4) {
               this.method863(var1, var2, 5120, -652447338);
               this.method863(var1, 1 + var2, 16384, -77188681);
               this.method863(1 + var1, var2, 65536, -809974411);
            }

            if(var4 == 2) {
               this.method863(var1, var2, 20480, -1355243833);
               this.method863(1 + var1, var2, 65536, -304029540);
               this.method863(var1, var2 - 1, 1024, -1431410075);
            }

            if(var4 == 3) {
               this.method863(var1, var2, 81920, -547062553);
               this.method863(var1, var2 - 1, 1024, -1391246996);
               this.method863(var1 - 1, var2, 4096, -1942781080);
            }
         }
      }

   }

   public void method862(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var8 = 256;
      if(var6) {
         var8 += 131072;
      }

      var1 -= this.anInt765 * 1676632637;
      var2 -= this.anInt766 * 291084413;
      int var9;
      if(1 == var5 || 3 == var5) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var3 + var1; ++var9) {
         if(var9 >= 0 && var9 < 115906415 * this.anInt760) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if(var10 >= 0 && var10 < this.anInt767 * -852495241) {
                  this.method863(var9, var10, var8, -580985453);
               }
            }
         }
      }

   }

   void method863(int var1, int var2, int var3, int var4) {
      this.anIntArrayArray764[var1][var2] &= ~var3;
   }

   public void method864(int var1, int var2, int var3) {
      var1 -= this.anInt765 * 1676632637;
      var2 -= 291084413 * this.anInt766;
      this.anIntArrayArray764[var1][var2] &= -262145;
   }

   public void method866(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      var1 -= this.anInt765 * 1676632637;
      var2 -= this.anInt766 * 291084413;
      if(0 == var3) {
         if(var4 == 0) {
            this.method860(var1, var2, 128, -719534463);
            this.method860(var1 - 1, var2, 8, -719534463);
         }

         if(1 == var4) {
            this.method860(var1, var2, 2, -719534463);
            this.method860(var1, 1 + var2, 32, -719534463);
         }

         if(var4 == 2) {
            this.method860(var1, var2, 8, -719534463);
            this.method860(1 + var1, var2, 128, -719534463);
         }

         if(var4 == 3) {
            this.method860(var1, var2, 32, -719534463);
            this.method860(var1, var2 - 1, 2, -719534463);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method860(var1, var2, 1, -719534463);
            this.method860(var1 - 1, 1 + var2, 16, -719534463);
         }

         if(var4 == 1) {
            this.method860(var1, var2, 4, -719534463);
            this.method860(1 + var1, var2 + 1, 64, -719534463);
         }

         if(2 == var4) {
            this.method860(var1, var2, 16, -719534463);
            this.method860(1 + var1, var2 - 1, 1, -719534463);
         }

         if(var4 == 3) {
            this.method860(var1, var2, 64, -719534463);
            this.method860(var1 - 1, var2 - 1, 4, -719534463);
         }
      }

      if(var3 == 2) {
         if(0 == var4) {
            this.method860(var1, var2, 130, -719534463);
            this.method860(var1 - 1, var2, 8, -719534463);
            this.method860(var1, var2 + 1, 32, -719534463);
         }

         if(1 == var4) {
            this.method860(var1, var2, 10, -719534463);
            this.method860(var1, var2 + 1, 32, -719534463);
            this.method860(var1 + 1, var2, 128, -719534463);
         }

         if(var4 == 2) {
            this.method860(var1, var2, 40, -719534463);
            this.method860(1 + var1, var2, 128, -719534463);
            this.method860(var1, var2 - 1, 2, -719534463);
         }

         if(var4 == 3) {
            this.method860(var1, var2, 160, -719534463);
            this.method860(var1, var2 - 1, 2, -719534463);
            this.method860(var1 - 1, var2, 8, -719534463);
         }
      }

      if(var5) {
         if(0 == var3) {
            if(var4 == 0) {
               this.method860(var1, var2, 65536, -719534463);
               this.method860(var1 - 1, var2, 4096, -719534463);
            }

            if(1 == var4) {
               this.method860(var1, var2, 1024, -719534463);
               this.method860(var1, 1 + var2, 16384, -719534463);
            }

            if(2 == var4) {
               this.method860(var1, var2, 4096, -719534463);
               this.method860(1 + var1, var2, 65536, -719534463);
            }

            if(var4 == 3) {
               this.method860(var1, var2, 16384, -719534463);
               this.method860(var1, var2 - 1, 1024, -719534463);
            }
         }

         if(var3 == 1 || 3 == var3) {
            if(var4 == 0) {
               this.method860(var1, var2, 512, -719534463);
               this.method860(var1 - 1, var2 + 1, 8192, -719534463);
            }

            if(var4 == 1) {
               this.method860(var1, var2, 2048, -719534463);
               this.method860(var1 + 1, 1 + var2, '\u8000', -719534463);
            }

            if(var4 == 2) {
               this.method860(var1, var2, 8192, -719534463);
               this.method860(1 + var1, var2 - 1, 512, -719534463);
            }

            if(3 == var4) {
               this.method860(var1, var2, '\u8000', -719534463);
               this.method860(var1 - 1, var2 - 1, 2048, -719534463);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method860(var1, var2, 66560, -719534463);
               this.method860(var1 - 1, var2, 4096, -719534463);
               this.method860(var1, 1 + var2, 16384, -719534463);
            }

            if(1 == var4) {
               this.method860(var1, var2, 5120, -719534463);
               this.method860(var1, var2 + 1, 16384, -719534463);
               this.method860(var1 + 1, var2, 65536, -719534463);
            }

            if(var4 == 2) {
               this.method860(var1, var2, 20480, -719534463);
               this.method860(var1 + 1, var2, 65536, -719534463);
               this.method860(var1, var2 - 1, 1024, -719534463);
            }

            if(var4 == 3) {
               this.method860(var1, var2, 81920, -719534463);
               this.method860(var1, var2 - 1, 1024, -719534463);
               this.method860(var1 - 1, var2, 4096, -719534463);
            }
         }
      }

   }

   public Class58(int var1, int var2) {
      this.anInt760 = 374777743 * var1;
      this.anInt767 = 252847431 * var2;
      this.anIntArrayArray764 = new int[this.anInt760 * 115906415][-852495241 * this.anInt767];
      this.method890(462555413);
   }

   static final void method886(byte var0) {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < client.anInt3075 * 1768430155 - 1; ++var2) {
            if(client.anIntArray3037[var2] < 1000 && client.anIntArray3037[1 + var2] > 1000) {
               String var4 = client.aStringArray3184[var2];
               client.aStringArray3184[var2] = client.aStringArray3184[1 + var2];
               client.aStringArray3184[var2 + 1] = var4;
               String var5 = client.aStringArray3080[var2];
               client.aStringArray3080[var2] = client.aStringArray3080[var2 + 1];
               client.aStringArray3080[var2 + 1] = var5;
               int var3 = client.anIntArray3037[var2];
               client.anIntArray3037[var2] = client.anIntArray3037[1 + var2];
               client.anIntArray3037[1 + var2] = var3;
               var3 = client.anIntArray3076[var2];
               client.anIntArray3076[var2] = client.anIntArray3076[var2 + 1];
               client.anIntArray3076[1 + var2] = var3;
               var3 = client.anIntArray2932[var2];
               client.anIntArray2932[var2] = client.anIntArray2932[1 + var2];
               client.anIntArray2932[1 + var2] = var3;
               var3 = client.anIntArray3079[var2];
               client.anIntArray3079[var2] = client.anIntArray3079[var2 + 1];
               client.anIntArray3079[1 + var2] = var3;
               var1 = false;
            }
         }
      }

   }

   public void method890(int var1) {
      for(int var2 = 0; var2 < this.anInt760 * 115906415; ++var2) {
         for(int var3 = 0; var3 < this.anInt767 * -852495241; ++var3) {
            if(0 != var2 && 0 != var3 && var2 < this.anInt760 * 115906415 - 5 && var3 < -852495241 * this.anInt767 - 5) {
               this.anIntArrayArray764[var2][var3] = 16777216;
            } else {
               this.anIntArrayArray764[var2][var3] = 16777215;
            }
         }
      }

   }
}
