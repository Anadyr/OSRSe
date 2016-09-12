package com.jagex;

public class ChatMessage extends NodeContainer {

   int anInt2342 = Class116_Sub23_Sub15.method2691(-993358405) * 396806425;
   int anInt2343;
   int anInt2344;
   String aString2346;
   String aString2347;
   String aString2350;

   ChatMessage(int var1, String var2, String var3, String var4) {
      this.anInt2343 = 1070678137 * client.anInt2943;
      this.anInt2344 = var1 * 373059241;
      this.aString2350 = var2;
      this.aString2346 = var3;
      this.aString2347 = var4;
   }

   public static int method2581(int var0, int var1) {
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   static final void method2583(Entity var0, byte var1) {
      if(var0.anInt2630 * 1361576967 != 0) {
         if(-1 != 734924805 * var0.anInt2603) {
            Object var4 = null;
            if(var0.anInt2603 * 734924805 < '\u8000') {
               var4 = client.aMobArray2972[var0.anInt2603 * 734924805];
            } else if(734924805 * var0.anInt2603 >= '\u8000') {
               var4 = client.globalPlayers[734924805 * var0.anInt2603 - '\u8000'];
            }

            if(null != var4) {
               int var2 = 1272643751 * var0.anInt2609 - ((Entity)var4).anInt2609 * 1272643751;
               int var3 = -1801433343 * var0.anInt2579 - ((Entity)var4).anInt2579 * -1801433343;
               if(0 != var2 || 0 != var3) {
	               var0.faceDir1 = ((int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 2047) * 736533899;
               }
            } else if(var0.aBool2604) {
               var0.anInt2603 = -1611414733;
               var0.aBool2604 = false;
            }
         }

	      if (-1 != -744366479 * var0.faceDirection && (632093179 * var0.anInt2578 == 0 || var0.anInt2635 * 1616877363 > 0)) {
		      var0.faceDir1 = var0.faceDirection * 47518811;
		      var0.faceDirection = 316267887;
	      }

	      int var6 = -2061229533 * var0.faceDir1 - var0.anInt2613 * -2031663291 & 2047;
	      if (var6 == 0 && var0.aBool2604) {
		      var0.anInt2603 = -1611414733;
            var0.aBool2604 = false;
         }

         if(var6 != 0) {
            var0.anInt2592 += -1568587987;
            boolean var5;
            if(var6 > 1024) {
               var0.anInt2613 -= var0.anInt2630 * 1080073435;
               var5 = true;
               if(var6 < 1361576967 * var0.anInt2630 || var6 > 2048 - var0.anInt2630 * 1361576967) {
	               var0.anInt2613 = var0.faceDir1 * -2141141433;
	               var5 = false;
               }

               if(370127001 * var0.anInt2639 == var0.anInt2606 * 57983255 && (var0.anInt2592 * -1440192347 > 25 || var5)) {
                  if(-1 != var0.anInt2584 * 711326345) {
                     var0.anInt2606 = var0.anInt2584 * 1701193055;
                  } else {
                     var0.anInt2606 = var0.anInt2586 * -2133647945;
                  }
               }
            } else {
               var0.anInt2613 += 1080073435 * var0.anInt2630;
               var5 = true;
               if(var6 < 1361576967 * var0.anInt2630 || var6 > 2048 - var0.anInt2630 * 1361576967) {
	               var0.anInt2613 = var0.faceDir1 * -2141141433;
	               var5 = false;
               }

               if(370127001 * var0.anInt2639 == 57983255 * var0.anInt2606 && (-1440192347 * var0.anInt2592 > 25 || var5)) {
                  if(-1 != var0.anInt2585 * -1575295679) {
                     var0.anInt2606 = var0.anInt2585 * 1969722215;
                  } else {
                     var0.anInt2606 = -2133647945 * var0.anInt2586;
                  }
               }
            }

            var0.anInt2613 = (-2031663291 * var0.anInt2613 & 2047) * 518992781;
         } else {
            var0.anInt2592 = 0;
         }

      }
   }

   public static void method2585(int var0) {
      Class116_Sub23_Sub11.aClass123_2376.method1635();
   }

	void method2578(int var1, String var2, String var3, String var4, int var5) {
		this.anInt2342 = Class116_Sub23_Sub15.method2691(-993358405) * 396806425;
		this.anInt2343 = 1070678137 * client.anInt2943;
		this.anInt2344 = var1 * 373059241;
		this.aString2350 = var2;
		this.aString2346 = var3;
		this.aString2347 = var4;
   }
}
