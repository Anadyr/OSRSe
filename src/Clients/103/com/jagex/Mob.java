package com.jagex;

public final class Mob extends Entity {

   static Sprite aClass116_Sub23_Sub19_Sub2_2875;
   MobDefinition definition;
   public static byte[][] aByteArrayArray2877;
   static Class99 aClass99_2878;
   static Class35 aClass35_2879;


   final void handleMovement(int direction, byte movementMode, byte var3) {
      int var4 = this.xMovementSteps[0];
      int var5 = this.yMovementSteps[0];
      if(direction == 0) {
         --var4;
         ++var5;
      }

      if(1 == direction) {
         ++var5;
      }

      if(direction == 2) {
         ++var4;
         ++var5;
      }

      if(direction == 3) {
         --var4;
      }

      if(direction == 4) {
         ++var4;
      }

      if(direction == 5) {
         --var4;
         --var5;
      }

      if(direction == 6) {
         --var5;
      }

      if(direction == 7) {
         ++var4;
         --var5;
      }

      if(-922607859 * this.anInt2587 != -1 && Class116_Sub8.method1946(this.anInt2587 * -922607859, -990032604).anInt2242 * -1099577343 == 1) {
         this.anInt2587 = 1587034171;
      }

      if(this.anInt2578 * 632093179 < 9) {
         this.anInt2578 += 11741491;
      }

      for(int var6 = this.anInt2578 * 632093179; var6 > 0; --var6) {
         this.xMovementSteps[var6] = this.xMovementSteps[var6 - 1];
         this.yMovementSteps[var6] = this.yMovementSteps[var6 - 1];
         this.aByteArray2628[var6] = this.aByteArray2628[var6 - 1];
      }

      this.xMovementSteps[0] = var4;
      this.yMovementSteps[0] = var5;
      this.aByteArray2628[0] = movementMode;
   }

   protected final SpotAnim getRotatedModel(byte var1) {
      if(this.definition == null) {
         return null;
      } else {
         Class116_Sub23_Sub4 var3 = -1 != -922607859 * this.anInt2587 && 1301453073 * this.anInt2612 == 0?Class116_Sub8.method1946(-922607859 * this.anInt2587, -1057804674):null;
         Class116_Sub23_Sub4 var4 = 57983255 * this.anInt2606 != -1 && (370127001 * this.anInt2639 != this.anInt2606 * 57983255 || var3 == null)?Class116_Sub8.method1946(57983255 * this.anInt2606, -411318777):null;
         SpotAnim var2 = this.definition.method2544(var3, 1402685833 * this.anInt2610, var4, -1199565973 * this.anInt2581, (byte)-56);
         if(null == var2) {
            return null;
         } else {
            var2.method3373();
            this.anInt2627 = var2.modelHeight * -1831653581;
            if(1631645159 * this.anInt2614 != -1 && -1 != this.anInt2595 * -1255206495) {
               SpotAnim var5 = Friend.method1835(1631645159 * this.anInt2614, (byte) 1).method2344(-1255206495 * this.anInt2595, -1123899554);
               if(null != var5) {
                  var5.method3385(0, -(1719935737 * this.anInt2589), 0);
                  SpotAnim[] var6 = new SpotAnim[]{var2, var5};
                  var2 = new SpotAnim(var6, 2);
               }
            }

            if(this.definition.tileSize * -691506967 == 1) {
               var2.aBool2809 = true;
            }

            return var2;
         }
      }
   }

   final boolean method3101(byte var1) {
      return this.definition != null;
   }

   final void method3540(int var1, int var2, boolean var3, byte var4) {
      if(this.anInt2587 * -922607859 != -1 && Class116_Sub8.method1946(this.anInt2587 * -922607859, -42968786).anInt2242 * -1099577343 == 1) {
         this.anInt2587 = 1587034171;
      }

      if(!var3) {
         int var5 = var1 - this.xMovementSteps[0];
         int var7 = var2 - this.yMovementSteps[0];
         if(var5 >= -8 && var5 <= 8 && var7 >= -8 && var7 <= 8) {
            if(632093179 * this.anInt2578 < 9) {
               this.anInt2578 += 11741491;
            }

            for(int var6 = this.anInt2578 * 632093179; var6 > 0; --var6) {
               this.xMovementSteps[var6] = this.xMovementSteps[var6 - 1];
               this.yMovementSteps[var6] = this.yMovementSteps[var6 - 1];
               this.aByteArray2628[var6] = this.aByteArray2628[var6 - 1];
            }

            this.xMovementSteps[0] = var1;
            this.yMovementSteps[0] = var2;
            this.aByteArray2628[0] = 1;
            return;
         }
      }

      this.anInt2578 = 0;
      this.anInt2636 = 0;
      this.anInt2635 = 0;
      this.xMovementSteps[0] = var1;
      this.yMovementSteps[0] = var2;
      this.anInt2609 = this.anInt2582 * -1142586432 + -715945088 * this.xMovementSteps[0];
      this.anInt2579 = this.anInt2582 * 1467429440 + this.yMovementSteps[0] * 1616412800;
   }

   static Class27 method3547(byte var0) {
      Class27.anInt387 = 0;
      Class27 var1;
      if(Class27.anInt387 * -1614070229 >= Class27.anInt379 * -1946617791) {
         var1 = null;
      } else {
         var1 = Class27.aClass27Array374[(Class27.anInt387 += -1416261501) * -1614070229 - 1];
      }

      return var1;
   }
}
