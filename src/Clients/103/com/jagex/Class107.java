package com.jagex;

public class Class107 {

   public static int[] anIntArray1454;
   static int[] anIntArray1455 = new int[32];
   public static boolean aBool1456;
   public static int[] varpData;


   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         anIntArray1455[var1] = var0 - 1;
         var0 += var0;
      }

      anIntArray1454 = new int[2000];
      varpData = new int[2000];
   }

   Class107() throws Throwable {
      throw new Error();
   }

   static final void method1465(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Region var8, Class58[] var9, int var10) {
      Packet var11 = new Packet(var0);
      int var26 = -1;

      while(true) {
         int var13 = var11.readSmartC(-14802722);
         if(0 == var13) {
            return;
         }

         var26 += var13;
         int var23 = 0;

         while(true) {
            int var15 = var11.readSmartC(-525376012);
            if(0 == var15) {
               break;
            }

            var23 += var15 - 1;
            int var19 = var23 & 63;
            int var18 = var23 >> 6 & 63;
            int var14 = var23 >> 12;
            int var24 = var11.readSignedByte(1708176767);
            int var31 = var24 >> 2;
            int var21 = var24 & 3;
            if(var4 == var14 && var18 >= var5 && var18 < 8 + var5 && var19 >= var6 && var19 < var6 + 8) {
               ObjectDefinition var20 = Class45.method700(var26, 359750046);
               int var25 = var18 & 7;
               int var30 = var19 & 7;
               int var28 = 1162660975 * var20.sizeX;
               int var29 = -1976023901 * var20.sizeY;
               int var12;
               if((var21 & 1) == 1) {
                  var12 = var28;
                  var28 = var29;
                  var29 = var12;
               }

               int var27 = var7 & 3;
               int var17;
               if(var27 == 0) {
                  var17 = var25;
               } else if(var27 == 1) {
                  var17 = var30;
               } else if(var27 == 2) {
                  var17 = 7 - var25 - (var28 - 1);
               } else {
                  var17 = 7 - var30 - (var29 - 1);
               }

               var12 = var2 + var17;
               int var22 = var3 + Entity.method3110(var18 & 7, var19 & 7, var7, var20.sizeX * 1162660975, var20.sizeY * -1976023901, var21, (byte) 8);
               if(var12 > 0 && var22 > 0 && var12 < 103 && var22 < 103) {
                  int var32 = var1;
                  if((Class47.aByteArrayArrayArray634[1][var12][var22] & 2) == 2) {
                     var32 = var1 - 1;
                  }

                  Class58 var33 = null;
                  if(var32 >= 0) {
                     var33 = var9[var32];
                  }

                  Class116_Sub6.method1933(var1, var12, var22, var26, var7 + var21 & 3, var31, var8, var33, (byte)-39);
               }
            }
         }
      }
   }

   public static RSInterface getInterface(int var0, int var1) {
      int interfaceId = var0 >> 16;
      int childId = var0 & '\uffff';
      if(null == RSInterface.mainInterfaceArray[interfaceId] || RSInterface.mainInterfaceArray[interfaceId][childId] == null) {
         boolean var4 = Class116_Sub23_Sub2.loadInterface(interfaceId, -1006212225);
         if(!var4) {
            return null;
         }
      }

      return RSInterface.mainInterfaceArray[interfaceId][childId];
   }
}
