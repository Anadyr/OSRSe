package com.jagex;

public class Class25 {

   int anInt350;
   int anInt352;
   int anInt353;
   protected static int anInt354;
   int anInt355;


   static final boolean method531(byte[] var0, int var1, int var2, byte var3) {
      boolean var4 = true;
      Packet var6 = new Packet(var0);
      int var8 = -1;

      while(true) {
         int var7 = var6.readSmartC(-533441705);
         if(0 == var7) {
            return var4;
         }

         var8 += var7;
         int var12 = 0;
         boolean var9 = false;

         while(true) {
            int var5;
            if(var9) {
               var5 = var6.readSmartC(664533460);
               if(var5 == 0) {
                  break;
               }

               var6.readSignedByte(1708176767);
            } else {
               var5 = var6.readSmartC(-1467556000);
               if(var5 == 0) {
                  break;
               }

               var12 += var5 - 1;
               int var13 = var12 & 63;
               int var10 = var12 >> 6 & 63;
               int var15 = var6.readSignedByte(1708176767) >> 2;
               int var11 = var10 + var1;
               int var14 = var2 + var13;
               if(var11 > 0 && var14 > 0 && var11 < 103 && var14 < 103) {
                  ObjectDefinition var16 = Class45.method700(var8, 359750046);
                  if(var15 != 22 || !client.aBool2937 || var16.anInt2203 * -839074197 != 0 || -1030255905 * var16.actionCount == 1 || var16.clippingFlag) {
                     if(!var16.method2411((byte)6)) {
                        client.anInt2992 += -34022823;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }
         }
      }
   }

   Class25() {}

   static final void method532(Player var0, int var1, int var2, byte var3, int var4) {
      int var5 = var0.xMovementSteps[0];
      int var8 = var0.yMovementSteps[0];
      int var7 = var0.method3561(1463893155);
      if(var5 >= var7 && var5 < 104 - var7 && var8 >= var7 && var8 < 104 - var7) {
         if(var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
            int var10 = var0.method3561(129758278);
            client.aClass59_Sub1_3214.anInt777 = -1745633279 * var1;
            client.aClass59_Sub1_3214.anInt774 = var2 * 1201257799;
            client.aClass59_Sub1_3214.anInt778 = 1741387093;
            client.aClass59_Sub1_3214.anInt776 = -25596441;
            Class59_Sub1 var12 = client.aClass59_Sub1_3214;
            int var11 = Class47.method764(var5, var8, var10, var12, client.aClass58Array2996[-1522270499 * var0.anInt2906], true, client.anIntArray3215, client.anIntArray3216, -556499332);
            if(var11 >= 1) {
               for(int var6 = 0; var6 < var11 - 1; ++var6) {
                  var0.method3552(client.anIntArray3215[var6], client.anIntArray3216[var6], var3, -867305060);
               }

            }
         }
      }
   }

   static int method533(int var0, int var1) {
      ChatMessage var2 = (ChatMessage)Class37.aClass124_492.method1644((long)var0);
      return var2 == null?-1:(var2.nextNodeContainer == Class37.aClass125_491.prev ?-1:-1699577047 * ((ChatMessage)var2.nextNodeContainer).anInt2342);
   }

   Class25(Class25 var1) {
      this.anInt350 = 1 * var1.anInt350;
      this.anInt355 = 1 * var1.anInt355;
      this.anInt352 = var1.anInt352 * 1;
      this.anInt353 = var1.anInt353 * 1;
   }
}
