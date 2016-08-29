package com.jagex;

public class Model extends Animable {

   byte[] aByteArray2648;
   int[] triangle_a;
   int[] triangle_b;
   int[] triangle_c;
   int anInt2652 = 0;
   byte[] aByteArray2653;
   int[] anIntArray2654;
   int[] anIntArray2655;
   short[] aShortArray2656;
   byte[] aByteArray2657;
   static int[] anIntArray2658 = new int[10000];
   int[] anIntArray2659;
   int anInt2660;
   short[] aShortArray2661;
   byte[] aByteArray2662;
   int anInt2663;
   byte[] aByteArray2664;
   short[] aShortArray2665;
   short[] aShortArray2666;
   byte aByte2667 = 0;
   short[] aShortArray2668;
   short[] aShortArray2669;
   byte[] aByteArray2670;
   short[] aShortArray2671;
   short[] aShortArray2672;
   short[] aShortArray2673;
   int[] anIntArray2674;
   int anInt2675;
   static int[] anIntArray2676 = Texture.anIntArray2708;
   int[][] anIntArrayArray2677;
   int[][] anIntArrayArray2678;
   Class34[] aClass34Array2679;
   Class25[] aClass25Array2680;
   Class25[] aClass25Array2681;
   public short aShort2682;
   int anInt2683;
   public short aShort2684;
   short[] aShortArray2685;
   short[] aShortArray2686;
   int anInt2687;
   int anInt2688 = 0;
   int anInt2689;
   int[] anIntArray2690;
   static int[] anIntArray2691 = new int[10000];
   static int anInt2692 = 0;
   boolean aBool2693 = false;
   static int[] anIntArray2694 = Texture.anIntArray2713;


   public void method3113() {
      for(int var1 = 0; var1 < this.anInt2688; ++var1) {
         int var2 = this.triangle_c[var1];
         this.triangle_c[var1] = this.triangle_a[var1];
         this.triangle_a[var1] = -var2;
      }

      this.method3130();
   }

   public static Model method3114(Class99 var0, int var1, int var2) {
      byte[] var3 = var0.method1394(var1, var2, 807823598);
      return var3 == null?null:new Model(var3);
   }

   void method3116(byte[] var1) {
      boolean var2 = false;
      boolean var9 = false;
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      Buffer var38 = new Buffer(var1);
      var5.position = (var1.length - 18) * -184175589;
      int var10 = var5.readShort(188608189);
      int var11 = var5.readShort(-253649436);
      int var12 = var5.readSignedByte(1708176767);
      int var42 = var5.readSignedByte(1708176767);
      int var15 = var5.readSignedByte(1708176767);
      int var16 = var5.readSignedByte(1708176767);
      int var25 = var5.readSignedByte(1708176767);
      int var17 = var5.readSignedByte(1708176767);
      int var18 = var5.readShort(1204133330);
      int var19 = var5.readShort(-258835004);
      int var20 = var5.readShort(764022142);
      int var21 = var5.readShort(724559698);
      byte var13 = 0;
      int var46 = var13 + var10;
      int var24 = var46;
      var46 += var11;
      int var14 = var46;
      if(var15 == 255) {
         var46 += var11;
      }

      int var26 = var46;
      if(var25 == 1) {
         var46 += var11;
      }

      int var22 = var46;
      if(var42 == 1) {
         var46 += var11;
      }

      int var28 = var46;
      if(var17 == 1) {
         var46 += var10;
      }

      int var30 = var46;
      if(var16 == 1) {
         var46 += var11;
      }

      int var39 = var46;
      var46 += var21;
      int var34 = var46;
      var46 += var11 * 2;
      int var35 = var46;
      var46 += var12 * 6;
      int var36 = var46;
      var46 += var18;
      int var41 = var46;
      var46 += var19;
      int var10000 = var46 + var20;
      this.anInt2688 = var10;
      this.anInt2652 = var11;
      this.anInt2663 = var12;
      this.triangle_a = new int[var10];
      this.triangle_b = new int[var10];
      this.triangle_c = new int[var10];
      this.anIntArray2674 = new int[var11];
      this.anIntArray2654 = new int[var11];
      this.anIntArray2655 = new int[var11];
      if(var12 > 0) {
         this.aByteArray2664 = new byte[var12];
         this.aShortArray2665 = new short[var12];
         this.aShortArray2666 = new short[var12];
         this.aShortArray2656 = new short[var12];
      }

      if(var17 == 1) {
         this.anIntArray2659 = new int[var10];
      }

      if(var42 == 1) {
         this.aByteArray2662 = new byte[var11];
         this.aByteArray2648 = new byte[var11];
         this.aShortArray2661 = new short[var11];
      }

      if(var15 == 255) {
         this.aByteArray2657 = new byte[var11];
      } else {
         this.aByte2667 = (byte)var15;
      }

      if(var16 == 1) {
         this.aByteArray2670 = new byte[var11];
      }

      if(var25 == 1) {
         this.anIntArray2690 = new int[var11];
      }

      this.aShortArray2671 = new short[var11];
      var5.position = var13 * -184175589;
      var6.position = var36 * -184175589;
      var7.position = var41 * -184175589;
      var8.position = var46 * -184175589;
      var38.position = var28 * -184175589;
      int var29 = 0;
      int var32 = 0;
      int j12 = 0;

      int il2;
      int var4;
      int k12;
      int var27;
      int k11;
      for(k12 = 0; k12 < var10; ++k12) {
         var27 = var5.readSignedByte(1708176767);
         var4 = 0;
         if((var27 & 1) != 0) {
            var4 = var6.readSmart(-322635127);
         }

         k11 = 0;
         if((var27 & 2) != 0) {
            k11 = var7.readSmart(-537309738);
         }

         il2 = 0;
         if((var27 & 4) != 0) {
            il2 = var8.readSmart(-57504417);
         }

         this.triangle_a[k12] = var29 + var4;
         this.triangle_b[k12] = var32 + k11;
         this.triangle_c[k12] = j12 + il2;
         var29 = this.triangle_a[k12];
         var32 = this.triangle_b[k12];
         j12 = this.triangle_c[k12];
         if(var17 == 1) {
            this.anIntArray2659[k12] = var38.readSignedByte(1708176767);
         }
      }

      var5.position = var34 * -184175589;
      var6.position = var22 * -184175589;
      var7.position = var14 * -184175589;
      var8.position = var30 * -184175589;
      var38.position = var26 * -184175589;

      for(k12 = 0; k12 < var11; ++k12) {
         this.aShortArray2671[k12] = (short)var5.readShort(1553044671);
         if(var42 == 1) {
            var27 = var6.readSignedByte(1708176767);
            if((var27 & 1) == 1) {
               this.aByteArray2662[k12] = 1;
               var2 = true;
            } else {
               this.aByteArray2662[k12] = 0;
            }

            if((var27 & 2) == 2) {
               this.aByteArray2648[k12] = (byte)(var27 >> 2);
               this.aShortArray2661[k12] = this.aShortArray2671[k12];
               this.aShortArray2671[k12] = 127;
               if(this.aShortArray2661[k12] != -1) {
                  var9 = true;
               }
            } else {
               this.aByteArray2648[k12] = -1;
               this.aShortArray2661[k12] = -1;
            }
         }

         if(var15 == 255) {
            this.aByteArray2657[k12] = var7.readUnsignedByte(1084143238);
         }

         if(var16 == 1) {
            this.aByteArray2670[k12] = var8.readUnsignedByte(-522962432);
         }

         if(var25 == 1) {
            this.anIntArray2690[k12] = var38.readSignedByte(1708176767);
         }
      }

      var5.position = var39 * -184175589;
      var6.position = var24 * -184175589;
      k12 = 0;
      var27 = 0;
      var4 = 0;
      k11 = 0;

      int var31;
      int var44;
      for(il2 = 0; il2 < var11; ++il2) {
         var31 = var6.readSignedByte(1708176767);
         if(var31 == 1) {
            k12 = var5.readSmart(-119668994) + k11;
            var27 = var5.readSmart(-398818363) + k12;
            var4 = var5.readSmart(-1437673740) + var27;
            k11 = var4;
            this.anIntArray2674[il2] = k12;
            this.anIntArray2654[il2] = var27;
            this.anIntArray2655[il2] = var4;
         }

         if(var31 == 2) {
            var27 = var4;
            var4 = var5.readSmart(-963936271) + k11;
            k11 = var4;
            this.anIntArray2674[il2] = k12;
            this.anIntArray2654[il2] = var27;
            this.anIntArray2655[il2] = var4;
         }

         if(var31 == 3) {
            k12 = var4;
            var4 = var5.readSmart(-457855302) + k11;
            k11 = var4;
            this.anIntArray2674[il2] = k12;
            this.anIntArray2654[il2] = var27;
            this.anIntArray2655[il2] = var4;
         }

         if(var31 == 4) {
            var44 = k12;
            k12 = var27;
            var27 = var44;
            var4 = var5.readSmart(-711545369) + k11;
            k11 = var4;
            this.anIntArray2674[il2] = k12;
            this.anIntArray2654[il2] = var44;
            this.anIntArray2655[il2] = var4;
         }
      }

      var5.position = var35 * -184175589;

      for(il2 = 0; il2 < var12; ++il2) {
         this.aByteArray2664[il2] = 0;
         this.aShortArray2665[il2] = (short)var5.readShort(1255103629);
         this.aShortArray2666[il2] = (short)var5.readShort(537938330);
         this.aShortArray2656[il2] = (short)var5.readShort(1869385509);
      }

      if(this.aByteArray2648 != null) {
         boolean var45 = false;

         for(var31 = 0; var31 < var11; ++var31) {
            var44 = this.aByteArray2648[var31] & 255;
            if(var44 != 255) {
               if((this.aShortArray2665[var44] & '\uffff') == this.anIntArray2674[var31] && (this.aShortArray2666[var44] & '\uffff') == this.anIntArray2654[var31] && (this.aShortArray2656[var44] & '\uffff') == this.anIntArray2655[var31]) {
                  this.aByteArray2648[var31] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if(!var45) {
            this.aByteArray2648 = null;
         }
      }

      if(!var9) {
         this.aShortArray2661 = null;
      }

      if(!var2) {
         this.aByteArray2662 = null;
      }

   }

   public Model(Model[] var1, int var2) {
      boolean var11 = false;
      boolean var5 = false;
      boolean var7 = false;
      boolean var6 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.anInt2688 = 0;
      this.anInt2652 = 0;
      this.anInt2663 = 0;
      this.aByte2667 = -1;

      Model var3;
      int var10;
      for(var10 = 0; var10 < var2; ++var10) {
         var3 = var1[var10];
         if(var3 != null) {
            this.anInt2688 += var3.anInt2688;
            this.anInt2652 += var3.anInt2652;
            this.anInt2663 += var3.anInt2663;
            if(var3.aByteArray2657 != null) {
               var5 = true;
            } else {
               if(this.aByte2667 == -1) {
                  this.aByte2667 = var3.aByte2667;
               }

               if(this.aByte2667 != var3.aByte2667) {
                  var5 = true;
               }
            }

            var11 |= var3.aByteArray2662 != null;
            var7 |= var3.aByteArray2670 != null;
            var6 |= var3.anIntArray2690 != null;
            var8 |= var3.aShortArray2661 != null;
            var9 |= var3.aByteArray2648 != null;
         }
      }

      this.triangle_a = new int[this.anInt2688];
      this.triangle_b = new int[this.anInt2688];
      this.triangle_c = new int[this.anInt2688];
      this.anIntArray2659 = new int[this.anInt2688];
      this.anIntArray2674 = new int[this.anInt2652];
      this.anIntArray2654 = new int[this.anInt2652];
      this.anIntArray2655 = new int[this.anInt2652];
      if(var11) {
         this.aByteArray2662 = new byte[this.anInt2652];
      }

      if(var5) {
         this.aByteArray2657 = new byte[this.anInt2652];
      }

      if(var7) {
         this.aByteArray2670 = new byte[this.anInt2652];
      }

      if(var6) {
         this.anIntArray2690 = new int[this.anInt2652];
      }

      if(var8) {
         this.aShortArray2661 = new short[this.anInt2652];
      }

      if(var9) {
         this.aByteArray2648 = new byte[this.anInt2652];
      }

      this.aShortArray2671 = new short[this.anInt2652];
      if(this.anInt2663 > 0) {
         this.aByteArray2664 = new byte[this.anInt2663];
         this.aShortArray2665 = new short[this.anInt2663];
         this.aShortArray2666 = new short[this.anInt2663];
         this.aShortArray2656 = new short[this.anInt2663];
         this.aShortArray2668 = new short[this.anInt2663];
         this.aShortArray2669 = new short[this.anInt2663];
         this.aShortArray2685 = new short[this.anInt2663];
         this.aShortArray2686 = new short[this.anInt2663];
         this.aByteArray2653 = new byte[this.anInt2663];
         this.aShortArray2672 = new short[this.anInt2663];
         this.aShortArray2673 = new short[this.anInt2663];
      }

      this.anInt2688 = 0;
      this.anInt2652 = 0;
      this.anInt2663 = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var3 = var1[var10];
         if(var3 != null) {
            int var4;
            for(var4 = 0; var4 < var3.anInt2652; ++var4) {
               if(var11 && var3.aByteArray2662 != null) {
                  this.aByteArray2662[this.anInt2652] = var3.aByteArray2662[var4];
               }

               if(var5) {
                  if(var3.aByteArray2657 != null) {
                     this.aByteArray2657[this.anInt2652] = var3.aByteArray2657[var4];
                  } else {
                     this.aByteArray2657[this.anInt2652] = var3.aByte2667;
                  }
               }

               if(var7 && var3.aByteArray2670 != null) {
                  this.aByteArray2670[this.anInt2652] = var3.aByteArray2670[var4];
               }

               if(var6 && var3.anIntArray2690 != null) {
                  this.anIntArray2690[this.anInt2652] = var3.anIntArray2690[var4];
               }

               if(var8) {
                  if(var3.aShortArray2661 != null) {
                     this.aShortArray2661[this.anInt2652] = var3.aShortArray2661[var4];
                  } else {
                     this.aShortArray2661[this.anInt2652] = -1;
                  }
               }

               if(var9) {
                  if(var3.aByteArray2648 != null && var3.aByteArray2648[var4] != -1) {
                     this.aByteArray2648[this.anInt2652] = (byte)(var3.aByteArray2648[var4] + this.anInt2663);
                  } else {
                     this.aByteArray2648[this.anInt2652] = -1;
                  }
               }

               this.aShortArray2671[this.anInt2652] = var3.aShortArray2671[var4];
               this.anIntArray2674[this.anInt2652] = this.method3120(var3, var3.anIntArray2674[var4]);
               this.anIntArray2654[this.anInt2652] = this.method3120(var3, var3.anIntArray2654[var4]);
               this.anIntArray2655[this.anInt2652] = this.method3120(var3, var3.anIntArray2655[var4]);
               ++this.anInt2652;
            }

            for(var4 = 0; var4 < var3.anInt2663; ++var4) {
               byte var12 = this.aByteArray2664[this.anInt2663] = var3.aByteArray2664[var4];
               if(var12 == 0) {
                  this.aShortArray2665[this.anInt2663] = (short)this.method3120(var3, var3.aShortArray2665[var4]);
                  this.aShortArray2666[this.anInt2663] = (short)this.method3120(var3, var3.aShortArray2666[var4]);
                  this.aShortArray2656[this.anInt2663] = (short)this.method3120(var3, var3.aShortArray2656[var4]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.aShortArray2665[this.anInt2663] = var3.aShortArray2665[var4];
                  this.aShortArray2666[this.anInt2663] = var3.aShortArray2666[var4];
                  this.aShortArray2656[this.anInt2663] = var3.aShortArray2656[var4];
                  this.aShortArray2668[this.anInt2663] = var3.aShortArray2668[var4];
                  this.aShortArray2669[this.anInt2663] = var3.aShortArray2669[var4];
                  this.aShortArray2685[this.anInt2663] = var3.aShortArray2685[var4];
                  this.aShortArray2686[this.anInt2663] = var3.aShortArray2686[var4];
                  this.aByteArray2653[this.anInt2663] = var3.aByteArray2653[var4];
                  this.aShortArray2672[this.anInt2663] = var3.aShortArray2672[var4];
               }

               if(var12 == 2) {
                  this.aShortArray2673[this.anInt2663] = var3.aShortArray2673[var4];
               }

               ++this.anInt2663;
            }
         }
      }

   }

   public Model(Model var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.anInt2688 = var1.anInt2688;
      this.anInt2652 = var1.anInt2652;
      this.anInt2663 = var1.anInt2663;
      int var6;
      if(var2) {
         this.triangle_a = var1.triangle_a;
         this.triangle_b = var1.triangle_b;
         this.triangle_c = var1.triangle_c;
      } else {
         this.triangle_a = new int[this.anInt2688];
         this.triangle_b = new int[this.anInt2688];
         this.triangle_c = new int[this.anInt2688];

         for(var6 = 0; var6 < this.anInt2688; ++var6) {
            this.triangle_a[var6] = var1.triangle_a[var6];
            this.triangle_b[var6] = var1.triangle_b[var6];
            this.triangle_c[var6] = var1.triangle_c[var6];
         }
      }

      if(var3) {
         this.aShortArray2671 = var1.aShortArray2671;
      } else {
         this.aShortArray2671 = new short[this.anInt2652];

         for(var6 = 0; var6 < this.anInt2652; ++var6) {
            this.aShortArray2671[var6] = var1.aShortArray2671[var6];
         }
      }

      if(!var4 && var1.aShortArray2661 != null) {
         this.aShortArray2661 = new short[this.anInt2652];

         for(var6 = 0; var6 < this.anInt2652; ++var6) {
            this.aShortArray2661[var6] = var1.aShortArray2661[var6];
         }
      } else {
         this.aShortArray2661 = var1.aShortArray2661;
      }

      if(var5) {
         this.aByteArray2670 = var1.aByteArray2670;
      } else {
         this.aByteArray2670 = new byte[this.anInt2652];
         if(var1.aByteArray2670 == null) {
            for(var6 = 0; var6 < this.anInt2652; ++var6) {
               this.aByteArray2670[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.anInt2652; ++var6) {
               this.aByteArray2670[var6] = var1.aByteArray2670[var6];
            }
         }
      }

      this.anIntArray2674 = var1.anIntArray2674;
      this.anIntArray2654 = var1.anIntArray2654;
      this.anIntArray2655 = var1.anIntArray2655;
      this.aByteArray2662 = var1.aByteArray2662;
      this.aByteArray2657 = var1.aByteArray2657;
      this.aByteArray2648 = var1.aByteArray2648;
      this.aByte2667 = var1.aByte2667;
      this.aByteArray2664 = var1.aByteArray2664;
      this.aShortArray2665 = var1.aShortArray2665;
      this.aShortArray2666 = var1.aShortArray2666;
      this.aShortArray2656 = var1.aShortArray2656;
      this.aShortArray2668 = var1.aShortArray2668;
      this.aShortArray2669 = var1.aShortArray2669;
      this.aShortArray2685 = var1.aShortArray2685;
      this.aShortArray2686 = var1.aShortArray2686;
      this.aByteArray2653 = var1.aByteArray2653;
      this.aShortArray2672 = var1.aShortArray2672;
      this.aShortArray2673 = var1.aShortArray2673;
      this.anIntArray2659 = var1.anIntArray2659;
      this.anIntArray2690 = var1.anIntArray2690;
      this.anIntArrayArray2677 = var1.anIntArrayArray2677;
      this.anIntArrayArray2678 = var1.anIntArrayArray2678;
      this.aClass25Array2680 = var1.aClass25Array2680;
      this.aClass34Array2679 = var1.aClass34Array2679;
      this.aClass25Array2681 = var1.aClass25Array2681;
      this.aShort2682 = var1.aShort2682;
      this.aShort2684 = var1.aShort2684;
   }

   public Model method3118() {
      Model var1 = new Model();
      if(this.aByteArray2662 != null) {
         var1.aByteArray2662 = new byte[this.anInt2652];

         for(int var2 = 0; var2 < this.anInt2652; ++var2) {
            var1.aByteArray2662[var2] = this.aByteArray2662[var2];
         }
      }

      var1.anInt2688 = this.anInt2688;
      var1.anInt2652 = this.anInt2652;
      var1.anInt2663 = this.anInt2663;
      var1.triangle_a = this.triangle_a;
      var1.triangle_b = this.triangle_b;
      var1.triangle_c = this.triangle_c;
      var1.anIntArray2674 = this.anIntArray2674;
      var1.anIntArray2654 = this.anIntArray2654;
      var1.anIntArray2655 = this.anIntArray2655;
      var1.aByteArray2657 = this.aByteArray2657;
      var1.aByteArray2670 = this.aByteArray2670;
      var1.aByteArray2648 = this.aByteArray2648;
      var1.aShortArray2671 = this.aShortArray2671;
      var1.aShortArray2661 = this.aShortArray2661;
      var1.aByte2667 = this.aByte2667;
      var1.aByteArray2664 = this.aByteArray2664;
      var1.aShortArray2665 = this.aShortArray2665;
      var1.aShortArray2666 = this.aShortArray2666;
      var1.aShortArray2656 = this.aShortArray2656;
      var1.aShortArray2668 = this.aShortArray2668;
      var1.aShortArray2669 = this.aShortArray2669;
      var1.aShortArray2685 = this.aShortArray2685;
      var1.aShortArray2686 = this.aShortArray2686;
      var1.aByteArray2653 = this.aByteArray2653;
      var1.aShortArray2672 = this.aShortArray2672;
      var1.aShortArray2673 = this.aShortArray2673;
      var1.anIntArray2659 = this.anIntArray2659;
      var1.anIntArray2690 = this.anIntArray2690;
      var1.anIntArrayArray2677 = this.anIntArrayArray2677;
      var1.anIntArrayArray2678 = this.anIntArrayArray2678;
      var1.aClass25Array2680 = this.aClass25Array2680;
      var1.aClass34Array2679 = this.aClass34Array2679;
      var1.aShort2682 = this.aShort2682;
      var1.aShort2684 = this.aShort2684;
      return var1;
   }

   public Model method3119(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3131();
      int var12 = var2 + this.anInt2660;
      int var7 = var2 + this.anInt2687;
      int var8 = var4 + this.anInt2689;
      int var9 = var4 + this.anInt2683;
      if(var12 >= 0 && var7 + 128 >> 7 < var1.length && var8 >= 0 && var9 + 128 >> 7 < var1[0].length) {
         var12 >>= 7;
         var7 = var7 + 127 >> 7;
         var8 >>= 7;
         var9 = var9 + 127 >> 7;
         if(var1[var12][var8] == var3 && var1[var7][var8] == var3 && var1[var12][var9] == var3 && var1[var7][var9] == var3) {
            return this;
         } else {
            Model var11;
            if(var5) {
               var11 = new Model();
               var11.anInt2688 = this.anInt2688;
               var11.anInt2652 = this.anInt2652;
               var11.anInt2663 = this.anInt2663;
               var11.triangle_a = this.triangle_a;
               var11.triangle_c = this.triangle_c;
               var11.anIntArray2674 = this.anIntArray2674;
               var11.anIntArray2654 = this.anIntArray2654;
               var11.anIntArray2655 = this.anIntArray2655;
               var11.aByteArray2662 = this.aByteArray2662;
               var11.aByteArray2657 = this.aByteArray2657;
               var11.aByteArray2670 = this.aByteArray2670;
               var11.aByteArray2648 = this.aByteArray2648;
               var11.aShortArray2671 = this.aShortArray2671;
               var11.aShortArray2661 = this.aShortArray2661;
               var11.aByte2667 = this.aByte2667;
               var11.aByteArray2664 = this.aByteArray2664;
               var11.aShortArray2665 = this.aShortArray2665;
               var11.aShortArray2666 = this.aShortArray2666;
               var11.aShortArray2656 = this.aShortArray2656;
               var11.aShortArray2668 = this.aShortArray2668;
               var11.aShortArray2669 = this.aShortArray2669;
               var11.aShortArray2685 = this.aShortArray2685;
               var11.aShortArray2686 = this.aShortArray2686;
               var11.aByteArray2653 = this.aByteArray2653;
               var11.aShortArray2672 = this.aShortArray2672;
               var11.aShortArray2673 = this.aShortArray2673;
               var11.anIntArray2659 = this.anIntArray2659;
               var11.anIntArray2690 = this.anIntArray2690;
               var11.anIntArrayArray2677 = this.anIntArrayArray2677;
               var11.anIntArrayArray2678 = this.anIntArrayArray2678;
               var11.aShort2682 = this.aShort2682;
               var11.aShort2684 = this.aShort2684;
               var11.triangle_b = new int[var11.anInt2688];
            } else {
               var11 = this;
            }

            int var10;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(var6 == 0) {
               for(var10 = 0; var10 < var11.anInt2688; ++var10) {
                  var13 = this.triangle_a[var10] + var2;
                  var20 = this.triangle_c[var10] + var4;
                  var18 = var13 & 127;
                  var22 = var20 & 127;
                  var15 = var13 >> 7;
                  var19 = var20 >> 7;
                  var21 = var1[var15][var19] * (128 - var18) + var1[var15 + 1][var19] * var18 >> 7;
                  var14 = var1[var15][var19 + 1] * (128 - var18) + var1[var15 + 1][var19 + 1] * var18 >> 7;
                  var16 = var21 * (128 - var22) + var14 * var22 >> 7;
                  var11.triangle_b[var10] = this.triangle_b[var10] + var16 - var3;
               }
            } else {
               for(var10 = 0; var10 < var11.anInt2688; ++var10) {
                  var13 = (-this.triangle_b[var10] << 16) / (this.modelHeight * 1812947537);
                  if(var13 < var6) {
                     var20 = this.triangle_a[var10] + var2;
                     var18 = this.triangle_c[var10] + var4;
                     var22 = var20 & 127;
                     var15 = var18 & 127;
                     var19 = var20 >> 7;
                     var21 = var18 >> 7;
                     var14 = var1[var19][var21] * (128 - var22) + var1[var19 + 1][var21] * var22 >> 7;
                     var16 = var1[var19][var21 + 1] * (128 - var22) + var1[var19 + 1][var21 + 1] * var22 >> 7;
                     int var17 = var14 * (128 - var15) + var16 * var15 >> 7;
                     var11.triangle_b[var10] = this.triangle_b[var10] + (var17 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method3130();
            return var11;
         }
      } else {
         return this;
      }
   }

   final int method3120(Model var1, int var2) {
      int var3 = -1;
      int var7 = var1.triangle_a[var2];
      int var4 = var1.triangle_b[var2];
      int var5 = var1.triangle_c[var2];

      for(int var6 = 0; var6 < this.anInt2688; ++var6) {
         if(var7 == this.triangle_a[var6] && var4 == this.triangle_b[var6] && var5 == this.triangle_c[var6]) {
            var3 = var6;
            break;
         }
      }

      if(var3 == -1) {
         this.triangle_a[this.anInt2688] = var7;
         this.triangle_b[this.anInt2688] = var4;
         this.triangle_c[this.anInt2688] = var5;
         if(var1.anIntArray2659 != null) {
            this.anIntArray2659[this.anInt2688] = var1.anIntArray2659[var2];
         }

         var3 = this.anInt2688++;
      }

      return var3;
   }

   public void method3121() {
      for(int var1 = 0; var1 < this.anInt2688; ++var1) {
         int var2 = this.triangle_a[var1];
         this.triangle_a[var1] = this.triangle_c[var1];
         this.triangle_c[var1] = -var2;
      }

      this.method3130();
   }

   Model() {}

   static void method3122(Model var0, Model var1, int var2, int var3, int var4, boolean var5) {
      var0.method3131();
      var0.method3147();
      var1.method3131();
      var1.method3147();
      ++anInt2692;
      int var7 = 0;
      int[] var8 = var1.triangle_a;
      int var14 = var1.anInt2688;

      int var6;
      for(var6 = 0; var6 < var0.anInt2688; ++var6) {
         Class25 var9 = var0.aClass25Array2680[var6];
         if(var9.anInt353 * 1053423383 != 0) {
            int var10 = var0.triangle_b[var6] - var3;
            if(var10 <= var1.anInt2675) {
               int var11 = var0.triangle_a[var6] - var2;
               if(var11 >= var1.anInt2660 && var11 <= var1.anInt2687) {
                  int var12 = var0.triangle_c[var6] - var4;
                  if(var12 >= var1.anInt2689 && var12 <= var1.anInt2683) {
                     for(int var13 = 0; var13 < var14; ++var13) {
                        Class25 var15 = var1.aClass25Array2680[var13];
                        if(var11 == var8[var13] && var12 == var1.triangle_c[var13] && var10 == var1.triangle_b[var13] && var15.anInt353 * 1053423383 != 0) {
                           if(var0.aClass25Array2681 == null) {
                              var0.aClass25Array2681 = new Class25[var0.anInt2688];
                           }

                           if(var1.aClass25Array2681 == null) {
                              var1.aClass25Array2681 = new Class25[var14];
                           }

                           Class25 var17 = var0.aClass25Array2681[var6];
                           if(var17 == null) {
                              var17 = var0.aClass25Array2681[var6] = new Class25(var9);
                           }

                           Class25 var16 = var1.aClass25Array2681[var13];
                           if(var16 == null) {
                              var16 = var1.aClass25Array2681[var13] = new Class25(var15);
                           }

                           var17.anInt350 += var15.anInt350 * 1;
                           var17.anInt355 += var15.anInt355 * 1;
                           var17.anInt352 += var15.anInt352 * 1;
                           var17.anInt353 += var15.anInt353 * 1;
                           var16.anInt350 += var9.anInt350 * 1;
                           var16.anInt355 += var9.anInt355 * 1;
                           var16.anInt352 += var9.anInt352 * 1;
                           var16.anInt353 += var9.anInt353 * 1;
                           ++var7;
                           anIntArray2658[var6] = anInt2692;
                           anIntArray2691[var13] = anInt2692;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var7 >= 3 && var5) {
         for(var6 = 0; var6 < var0.anInt2652; ++var6) {
            if(anIntArray2658[var0.anIntArray2674[var6]] == anInt2692 && anIntArray2658[var0.anIntArray2654[var6]] == anInt2692 && anIntArray2658[var0.anIntArray2655[var6]] == anInt2692) {
               if(var0.aByteArray2662 == null) {
                  var0.aByteArray2662 = new byte[var0.anInt2652];
               }

               var0.aByteArray2662[var6] = 2;
            }
         }

         for(var6 = 0; var6 < var1.anInt2652; ++var6) {
            if(anIntArray2691[var1.anIntArray2674[var6]] == anInt2692 && anIntArray2691[var1.anIntArray2654[var6]] == anInt2692 && anIntArray2691[var1.anIntArray2655[var6]] == anInt2692) {
               if(var1.aByteArray2662 == null) {
                  var1.aByteArray2662 = new byte[var1.anInt2652];
               }

               var1.aByteArray2662[var6] = 2;
            }
         }

      }
   }

   public void method3124(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2688; ++var4) {
         this.triangle_a[var4] += var1;
         this.triangle_b[var4] += var2;
         this.triangle_c[var4] += var3;
      }

      this.method3130();
   }

   public void method3125(short var1, short var2) {
      for(int var3 = 0; var3 < this.anInt2652; ++var3) {
         if(this.aShortArray2671[var3] == var1) {
            this.aShortArray2671[var3] = var2;
         }
      }

   }

   public void method3126(short var1, short var2) {
      if(this.aShortArray2661 != null) {
         for(int var3 = 0; var3 < this.anInt2652; ++var3) {
            if(this.aShortArray2661[var3] == var1) {
               this.aShortArray2661[var3] = var2;
            }
         }

      }
   }

   public void method3127() {
      int var1;
      for(var1 = 0; var1 < this.anInt2688; ++var1) {
         this.triangle_c[var1] = -this.triangle_c[var1];
      }

      for(var1 = 0; var1 < this.anInt2652; ++var1) {
         int var2 = this.anIntArray2674[var1];
         this.anIntArray2674[var1] = this.anIntArray2655[var1];
         this.anIntArray2655[var1] = var2;
      }

      this.method3130();
   }

   public void method3128(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt2688; ++var4) {
         this.triangle_a[var4] = this.triangle_a[var4] * var1 / 128;
         this.triangle_b[var4] = this.triangle_b[var4] * var2 / 128;
         this.triangle_c[var4] = this.triangle_c[var4] * var3 / 128;
      }

      this.method3130();
   }

   void method3130() {
      this.aClass25Array2680 = null;
      this.aClass25Array2681 = null;
      this.aClass34Array2679 = null;
      this.aBool2693 = false;
   }

   void method3131() {
      if(!this.aBool2693) {
         this.modelHeight = 0;
         this.anInt2675 = 0;
         this.anInt2660 = 999999;
         this.anInt2687 = -999999;
         this.anInt2683 = -99999;
         this.anInt2689 = 99999;

         for(int var3 = 0; var3 < this.anInt2688; ++var3) {
            int var4 = this.triangle_a[var3];
            int var2 = this.triangle_b[var3];
            int var1 = this.triangle_c[var3];
            if(var4 < this.anInt2660) {
               this.anInt2660 = var4;
            }

            if(var4 > this.anInt2687) {
               this.anInt2687 = var4;
            }

            if(var1 < this.anInt2689) {
               this.anInt2689 = var1;
            }

            if(var1 > this.anInt2683) {
               this.anInt2683 = var1;
            }

            if(-var2 > this.modelHeight * 1812947537) {
               this.modelHeight = -var2 * -969595215;
            }

            if(var2 > this.anInt2675) {
               this.anInt2675 = var2;
            }
         }

         this.aBool2693 = true;
      }
   }

   static final int method3132(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public final SpotAnim method3133(int var1, int var2, int var3, int var4, int var5) {
      this.method3147();
      int var15 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var8 = var2 * var15 >> 8;
      SpotAnim var10 = new SpotAnim();
      var10.anIntArray2793 = new int[this.anInt2652];
      var10.anIntArray2794 = new int[this.anInt2652];
      var10.anIntArray2795 = new int[this.anInt2652];
      if(this.anInt2663 > 0 && this.aByteArray2648 != null) {
         int[] var6 = new int[this.anInt2663];

         int var11;
         for(var11 = 0; var11 < this.anInt2652; ++var11) {
            if(this.aByteArray2648[var11] != -1) {
               ++var6[this.aByteArray2648[var11] & 255];
            }
         }

         var10.anInt2801 = 0;

         for(var11 = 0; var11 < this.anInt2663; ++var11) {
            if(var6[var11] > 0 && this.aByteArray2664[var11] == 0) {
               ++var10.anInt2801;
            }
         }

         var10.anIntArray2802 = new int[var10.anInt2801];
         var10.anIntArray2803 = new int[var10.anInt2801];
         var10.anIntArray2838 = new int[var10.anInt2801];
         var11 = 0;

         int var12;
         for(var12 = 0; var12 < this.anInt2663; ++var12) {
            if(var6[var12] > 0 && this.aByteArray2664[var12] == 0) {
               var10.anIntArray2802[var11] = this.aShortArray2665[var12] & '\uffff';
               var10.anIntArray2803[var11] = this.aShortArray2666[var12] & '\uffff';
               var10.anIntArray2838[var11] = this.aShortArray2656[var12] & '\uffff';
               var6[var12] = var11++;
            } else {
               var6[var12] = -1;
            }
         }

         var10.aByteArray2798 = new byte[this.anInt2652];

         for(var12 = 0; var12 < this.anInt2652; ++var12) {
            if(this.aByteArray2648[var12] != -1) {
               var10.aByteArray2798[var12] = (byte)var6[this.aByteArray2648[var12] & 255];
            } else {
               var10.aByteArray2798[var12] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.anInt2652; ++var16) {
         byte var18;
         if(this.aByteArray2662 == null) {
            var18 = 0;
         } else {
            var18 = this.aByteArray2662[var16];
         }

         byte var19;
         if(this.aByteArray2670 == null) {
            var19 = 0;
         } else {
            var19 = this.aByteArray2670[var16];
         }

         short var14;
         if(this.aShortArray2661 == null) {
            var14 = -1;
         } else {
            var14 = this.aShortArray2661[var16];
         }

         if(var19 == -2) {
            var18 = 3;
         }

         if(var19 == -1) {
            var18 = 2;
         }

         Class25 var7;
         int var9;
         Class34 var17;
         if(var14 == -1) {
            if(var18 == 0) {
               int var13 = this.aShortArray2671[var16] & '\uffff';
               if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2674[var16]] != null) {
                  var7 = this.aClass25Array2681[this.anIntArray2674[var16]];
               } else {
                  var7 = this.aClass25Array2680[this.anIntArray2674[var16]];
               }

               var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
               var10.anIntArray2793[var16] = method3132(var13, var9);
               if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2654[var16]] != null) {
                  var7 = this.aClass25Array2681[this.anIntArray2654[var16]];
               } else {
                  var7 = this.aClass25Array2680[this.anIntArray2654[var16]];
               }

               var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
               var10.anIntArray2794[var16] = method3132(var13, var9);
               if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2655[var16]] != null) {
                  var7 = this.aClass25Array2681[this.anIntArray2655[var16]];
               } else {
                  var7 = this.aClass25Array2680[this.anIntArray2655[var16]];
               }

               var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
               var10.anIntArray2795[var16] = method3132(var13, var9);
            } else if(var18 == 1) {
               var17 = this.aClass34Array2679[var16];
               var9 = var1 + (var3 * var17.anInt469 * -1007204591 + var4 * var17.anInt467 * -1133994153 + var5 * var17.anInt465 * -1926770859) / (var8 + var8 / 2);
               var10.anIntArray2793[var16] = method3132(this.aShortArray2671[var16] & '\uffff', var9);
               var10.anIntArray2795[var16] = -1;
            } else if(var18 == 3) {
               var10.anIntArray2793[var16] = 128;
               var10.anIntArray2795[var16] = -1;
            } else {
               var10.anIntArray2795[var16] = -2;
            }
         } else if(var18 == 0) {
            if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2674[var16]] != null) {
               var7 = this.aClass25Array2681[this.anIntArray2674[var16]];
            } else {
               var7 = this.aClass25Array2680[this.anIntArray2674[var16]];
            }

            var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
            var10.anIntArray2793[var16] = method3135(var9);
            if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2654[var16]] != null) {
               var7 = this.aClass25Array2681[this.anIntArray2654[var16]];
            } else {
               var7 = this.aClass25Array2680[this.anIntArray2654[var16]];
            }

            var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
            var10.anIntArray2794[var16] = method3135(var9);
            if(this.aClass25Array2681 != null && this.aClass25Array2681[this.anIntArray2655[var16]] != null) {
               var7 = this.aClass25Array2681[this.anIntArray2655[var16]];
            } else {
               var7 = this.aClass25Array2680[this.anIntArray2655[var16]];
            }

            var9 = var1 + (var3 * var7.anInt350 * -1716485273 + var4 * var7.anInt355 * -1481331485 + var5 * var7.anInt352 * 1113369919) / (var8 * var7.anInt353 * 1053423383);
            var10.anIntArray2795[var16] = method3135(var9);
         } else if(var18 == 1) {
            var17 = this.aClass34Array2679[var16];
            var9 = var1 + (var3 * var17.anInt469 * -1007204591 + var4 * var17.anInt467 * -1133994153 + var5 * var17.anInt465 * -1926770859) / (var8 + var8 / 2);
            var10.anIntArray2793[var16] = method3135(var9);
            var10.anIntArray2795[var16] = -1;
         } else {
            var10.anIntArray2795[var16] = -2;
         }
      }

      this.method3188();
      var10.anInt2785 = this.anInt2688;
      var10.anIntArray2786 = this.triangle_a;
      var10.anIntArray2807 = this.triangle_b;
      var10.anIntArray2788 = this.triangle_c;
      var10.anInt2831 = this.anInt2652;
      var10.anIntArray2790 = this.anIntArray2674;
      var10.anIntArray2791 = this.anIntArray2654;
      var10.anIntArray2792 = this.anIntArray2655;
      var10.aByteArray2815 = this.aByteArray2657;
      var10.aByteArray2797 = this.aByteArray2670;
      var10.aByte2811 = this.aByte2667;
      var10.anIntArrayArray2805 = this.anIntArrayArray2677;
      var10.anIntArrayArray2796 = this.anIntArrayArray2678;
      var10.aShortArray2781 = this.aShortArray2661;
      return var10;
   }

   static final int method3135(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   public void method3137(int var1) {
      int var2 = anIntArray2676[var1];
      int var4 = anIntArray2694[var1];

      for(int var3 = 0; var3 < this.anInt2688; ++var3) {
         int var5 = this.triangle_c[var3] * var2 + this.triangle_a[var3] * var4 >> 16;
         this.triangle_c[var3] = this.triangle_c[var3] * var4 - this.triangle_a[var3] * var2 >> 16;
         this.triangle_a[var3] = var5;
      }

      this.method3130();
   }

   Model(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3184(var1);
      } else {
         this.method3116(var1);
      }

   }

   public void method3147() {
      if(this.aClass25Array2680 == null) {
         this.aClass25Array2680 = new Class25[this.anInt2688];

         int var3;
         for(var3 = 0; var3 < this.anInt2688; ++var3) {
            this.aClass25Array2680[var3] = new Class25();
         }

         for(var3 = 0; var3 < this.anInt2652; ++var3) {
            int var7 = this.anIntArray2674[var3];
            int var5 = this.anIntArray2654[var3];
            int var6 = this.anIntArray2655[var3];
            int var13 = this.triangle_a[var5] - this.triangle_a[var7];
            int var8 = this.triangle_b[var5] - this.triangle_b[var7];
            int var12 = this.triangle_c[var5] - this.triangle_c[var7];
            int var9 = this.triangle_a[var6] - this.triangle_a[var7];
            int var14 = this.triangle_b[var6] - this.triangle_b[var7];
            int var11 = this.triangle_c[var6] - this.triangle_c[var7];
            int var2 = var8 * var11 - var14 * var12;
            int var4 = var12 * var9 - var11 * var13;

            int var10;
            for(var10 = var13 * var14 - var9 * var8; var2 > 8192 || var4 > 8192 || var10 > 8192 || var2 < -8192 || var4 < -8192 || var10 < -8192; var10 >>= 1) {
               var2 >>= 1;
               var4 >>= 1;
            }

            int var15 = (int)Math.sqrt((double)(var2 * var2 + var4 * var4 + var10 * var10));
            if(var15 <= 0) {
               var15 = 1;
            }

            var2 = var2 * 256 / var15;
            var4 = var4 * 256 / var15;
            var10 = var10 * 256 / var15;
            byte var16;
            if(this.aByteArray2662 == null) {
               var16 = 0;
            } else {
               var16 = this.aByteArray2662[var3];
            }

            if(var16 == 0) {
               Class25 var1 = this.aClass25Array2680[var7];
               var1.anInt350 += var2 * -1411192745;
               var1.anInt355 += var4 * 234223819;
               var1.anInt352 += var10 * -852507969;
               var1.anInt353 += -1902071641;
               var1 = this.aClass25Array2680[var5];
               var1.anInt350 += var2 * -1411192745;
               var1.anInt355 += var4 * 234223819;
               var1.anInt352 += var10 * -852507969;
               var1.anInt353 += -1902071641;
               var1 = this.aClass25Array2680[var6];
               var1.anInt350 += var2 * -1411192745;
               var1.anInt355 += var4 * 234223819;
               var1.anInt352 += var10 * -852507969;
               var1.anInt353 += -1902071641;
            } else if(var16 == 1) {
               if(this.aClass34Array2679 == null) {
                  this.aClass34Array2679 = new Class34[this.anInt2652];
               }

               Class34 var17 = this.aClass34Array2679[var3] = new Class34();
               var17.anInt469 = var2 * 139364849;
               var17.anInt467 = var4 * -809714585;
               var17.anInt465 = var10 * 130921981;
            }
         }

      }
   }

   public void method3180() {
      for(int var1 = 0; var1 < this.anInt2688; ++var1) {
         this.triangle_a[var1] = -this.triangle_a[var1];
         this.triangle_c[var1] = -this.triangle_c[var1];
      }

      this.method3130();
   }

   void method3184(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var9 = new Buffer(var1);
      Buffer var33 = new Buffer(var1);
      Buffer var49 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      Buffer var46 = new Buffer(var1);
      var2.position = (var1.length - 23) * -184175589;
      int var11 = var2.readShort(478472557);
      int var12 = var2.readShort(528004133);
      int var27 = var2.readSignedByte(1708176767);
      int var13 = var2.readSignedByte(1708176767);
      int var31 = var2.readSignedByte(1708176767);
      int var16 = var2.readSignedByte(1708176767);
      int var4 = var2.readSignedByte(1708176767);
      int var18 = var2.readSignedByte(1708176767);
      int var19 = var2.readSignedByte(1708176767);
      int var20 = var2.readShort(2095046537);
      int var21 = var2.readShort(171805959);
      int var22 = var2.readShort(293620621);
      int var23 = var2.readShort(1765199163);
      int var24 = var2.readShort(339901634);
      int var25 = 0;
      int var3 = 0;
      int var26 = 0;
      int var5;
      if(var27 > 0) {
         this.aByteArray2664 = new byte[var27];
         var2.position = 0;

         for(var5 = 0; var5 < var27; ++var5) {
            byte var30 = this.aByteArray2664[var5] = var2.readUnsignedByte(924099996);
            if(var30 == 0) {
               ++var25;
            }

            if(var30 >= 1 && var30 <= 3) {
               ++var3;
            }

            if(var30 == 2) {
               ++var26;
            }
         }
      }

      var5 = var27 + var11;
      int var55 = var5;
      if(var13 == 1) {
         var5 += var12;
      }

      int var35 = var5;
      var5 += var12;
      int var56 = var5;
      if(var31 == 255) {
         var5 += var12;
      }

      int var37 = var5;
      if(var4 == 1) {
         var5 += var12;
      }

      int var48 = var5;
      if(var19 == 1) {
         var5 += var11;
      }

      int var39 = var5;
      if(var16 == 1) {
         var5 += var12;
      }

      int var40 = var5;
      var5 += var23;
      int var57 = var5;
      if(var18 == 1) {
         var5 += var12 * 2;
      }

      int var42 = var5;
      var5 += var24;
      int var50 = var5;
      var5 += var12 * 2;
      int var10 = var5;
      var5 += var20;
      int var51 = var5;
      var5 += var21;
      int var6 = var5;
      var5 += var22;
      int var43 = var5;
      var5 += var25 * 6;
      int var52 = var5;
      var5 += var3 * 6;
      int var44 = var5;
      var5 += var3 * 6;
      int var54 = var5;
      var5 += var3 * 2;
      int var45 = var5;
      var5 += var3;
      int var47 = var5;
      var5 += var3 * 2 + var26 * 2;
      this.anInt2688 = var11;
      this.anInt2652 = var12;
      this.anInt2663 = var27;
      this.triangle_a = new int[var11];
      this.triangle_b = new int[var11];
      this.triangle_c = new int[var11];
      this.anIntArray2674 = new int[var12];
      this.anIntArray2654 = new int[var12];
      this.anIntArray2655 = new int[var12];
      if(var19 == 1) {
         this.anIntArray2659 = new int[var11];
      }

      if(var13 == 1) {
         this.aByteArray2662 = new byte[var12];
      }

      if(var31 == 255) {
         this.aByteArray2657 = new byte[var12];
      } else {
         this.aByte2667 = (byte)var31;
      }

      if(var16 == 1) {
         this.aByteArray2670 = new byte[var12];
      }

      if(var4 == 1) {
         this.anIntArray2690 = new int[var12];
      }

      if(var18 == 1) {
         this.aShortArray2661 = new short[var12];
      }

      if(var18 == 1 && var27 > 0) {
         this.aByteArray2648 = new byte[var12];
      }

      this.aShortArray2671 = new short[var12];
      if(var27 > 0) {
         this.aShortArray2665 = new short[var27];
         this.aShortArray2666 = new short[var27];
         this.aShortArray2656 = new short[var27];
         if(var3 > 0) {
            this.aShortArray2668 = new short[var3];
            this.aShortArray2669 = new short[var3];
            this.aShortArray2685 = new short[var3];
            this.aShortArray2686 = new short[var3];
            this.aByteArray2653 = new byte[var3];
            this.aShortArray2672 = new short[var3];
         }

         if(var26 > 0) {
            this.aShortArray2673 = new short[var26];
         }
      }

      var2.position = var27 * -184175589;
      var9.position = var10 * -184175589;
      var33.position = var51 * -184175589;
      var49.position = var6 * -184175589;
      var7.position = var48 * -184175589;
      int var53 = 0;
      int var28 = 0;
      int var34 = 0;

      int var14;
      int var15;
      int var17;
      int var29;
      int var38;
      for(var15 = 0; var15 < var11; ++var15) {
         var29 = var2.readSignedByte(1708176767);
         var38 = 0;
         if((var29 & 1) != 0) {
            var38 = var9.readSmart(317694933);
         }

         var17 = 0;
         if((var29 & 2) != 0) {
            var17 = var33.readSmart(-1684792488);
         }

         var14 = 0;
         if((var29 & 4) != 0) {
            var14 = var49.readSmart(-1885055943);
         }

         this.triangle_a[var15] = var53 + var38;
         this.triangle_b[var15] = var28 + var17;
         this.triangle_c[var15] = var34 + var14;
         var53 = this.triangle_a[var15];
         var28 = this.triangle_b[var15];
         var34 = this.triangle_c[var15];
         if(var19 == 1) {
            this.anIntArray2659[var15] = var7.readSignedByte(1708176767);
         }
      }

      var2.position = var50 * -184175589;
      var9.position = var55 * -184175589;
      var33.position = var56 * -184175589;
      var49.position = var39 * -184175589;
      var7.position = var37 * -184175589;
      var8.position = var57 * -184175589;
      var46.position = var42 * -184175589;

      for(var15 = 0; var15 < var12; ++var15) {
         this.aShortArray2671[var15] = (short)var2.readShort(1768491177);
         if(var13 == 1) {
            this.aByteArray2662[var15] = var9.readUnsignedByte(-318131253);
         }

         if(var31 == 255) {
            this.aByteArray2657[var15] = var33.readUnsignedByte(1742474200);
         }

         if(var16 == 1) {
            this.aByteArray2670[var15] = var49.readUnsignedByte(908901629);
         }

         if(var4 == 1) {
            this.anIntArray2690[var15] = var7.readSignedByte(1708176767);
         }

         if(var18 == 1) {
            this.aShortArray2661[var15] = (short)(var8.readShort(137844241) - 1);
         }

         if(this.aByteArray2648 != null && this.aShortArray2661[var15] != -1) {
            this.aByteArray2648[var15] = (byte)(var46.readSignedByte(1708176767) - 1);
         }
      }

      var2.position = var40 * -184175589;
      var9.position = var35 * -184175589;
      var15 = 0;
      var29 = 0;
      var38 = 0;
      var17 = 0;

      int var32;
      for(var14 = 0; var14 < var12; ++var14) {
         var32 = var9.readSignedByte(1708176767);
         if(var32 == 1) {
            var15 = var2.readSmart(294337919) + var17;
            var29 = var2.readSmart(-262032273) + var15;
            var38 = var2.readSmart(117322641) + var29;
            var17 = var38;
            this.anIntArray2674[var14] = var15;
            this.anIntArray2654[var14] = var29;
            this.anIntArray2655[var14] = var38;
         }

         if(var32 == 2) {
            var29 = var38;
            var38 = var2.readSmart(150936029) + var17;
            var17 = var38;
            this.anIntArray2674[var14] = var15;
            this.anIntArray2654[var14] = var29;
            this.anIntArray2655[var14] = var38;
         }

         if(var32 == 3) {
            var15 = var38;
            var38 = var2.readSmart(-81125595) + var17;
            var17 = var38;
            this.anIntArray2674[var14] = var15;
            this.anIntArray2654[var14] = var29;
            this.anIntArray2655[var14] = var38;
         }

         if(var32 == 4) {
            int var41 = var15;
            var15 = var29;
            var29 = var41;
            var38 = var2.readSmart(-969913398) + var17;
            var17 = var38;
            this.anIntArray2674[var14] = var15;
            this.anIntArray2654[var14] = var41;
            this.anIntArray2655[var14] = var38;
         }
      }

      var2.position = var43 * -184175589;
      var9.position = var52 * -184175589;
      var33.position = var44 * -184175589;
      var49.position = var54 * -184175589;
      var7.position = var45 * -184175589;
      var8.position = var47 * -184175589;

      for(var14 = 0; var14 < var27; ++var14) {
         var32 = this.aByteArray2664[var14] & 255;
         if(var32 == 0) {
            this.aShortArray2665[var14] = (short)var2.readShort(750478498);
            this.aShortArray2666[var14] = (short)var2.readShort(969927180);
            this.aShortArray2656[var14] = (short)var2.readShort(1962985673);
         }

         if(var32 == 1) {
            this.aShortArray2665[var14] = (short)var9.readShort(1636665350);
            this.aShortArray2666[var14] = (short)var9.readShort(1067364929);
            this.aShortArray2656[var14] = (short)var9.readShort(1800234935);
            this.aShortArray2668[var14] = (short)var33.readShort(-38992183);
            this.aShortArray2669[var14] = (short)var33.readShort(-412398138);
            this.aShortArray2685[var14] = (short)var33.readShort(-3213613);
            this.aShortArray2686[var14] = (short)var49.readShort(-144343004);
            this.aByteArray2653[var14] = var7.readUnsignedByte(100072808);
            this.aShortArray2672[var14] = (short)var8.readShort(835367600);
         }

         if(var32 == 2) {
            this.aShortArray2665[var14] = (short)var9.readShort(557934644);
            this.aShortArray2666[var14] = (short)var9.readShort(-414775516);
            this.aShortArray2656[var14] = (short)var9.readShort(-355910644);
            this.aShortArray2668[var14] = (short)var33.readShort(2143372387);
            this.aShortArray2669[var14] = (short)var33.readShort(1011349249);
            this.aShortArray2685[var14] = (short)var33.readShort(485899624);
            this.aShortArray2686[var14] = (short)var49.readShort(-442507293);
            this.aByteArray2653[var14] = var7.readUnsignedByte(-2042914090);
            this.aShortArray2672[var14] = (short)var8.readShort(11278514);
            this.aShortArray2673[var14] = (short)var8.readShort(1361146368);
         }

         if(var32 == 3) {
            this.aShortArray2665[var14] = (short)var9.readShort(565960167);
            this.aShortArray2666[var14] = (short)var9.readShort(919765384);
            this.aShortArray2656[var14] = (short)var9.readShort(868640232);
            this.aShortArray2668[var14] = (short)var33.readShort(340866419);
            this.aShortArray2669[var14] = (short)var33.readShort(-449703302);
            this.aShortArray2685[var14] = (short)var33.readShort(673829165);
            this.aShortArray2686[var14] = (short)var49.readShort(-217641994);
            this.aByteArray2653[var14] = var7.readUnsignedByte(-1289221817);
            this.aShortArray2672[var14] = (short)var8.readShort(1922650677);
         }
      }

      var2.position = var5 * -184175589;
      var14 = var2.readSignedByte(1708176767);
      if(var14 != 0) {
         new Class30();
         var2.readShort(84419115);
         var2.readShort(1300861724);
         var2.readShort(-320563092);
         var2.readInt(-995564962);
      }

   }

   void method3188() {
      int var1;
      int var2;
      int var3;
      int[] var4;
      if(this.anIntArray2659 != null) {
         var4 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.anInt2688; ++var1) {
            var3 = this.anIntArray2659[var1];
            ++var4[var3];
            if(var3 > var2) {
               var2 = var3;
            }
         }

         this.anIntArrayArray2677 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; ++var1) {
            this.anIntArrayArray2677[var1] = new int[var4[var1]];
            var4[var1] = 0;
         }

         for(var1 = 0; var1 < this.anInt2688; this.anIntArrayArray2677[var3][var4[var3]++] = var1++) {
            var3 = this.anIntArray2659[var1];
         }

         this.anIntArray2659 = null;
      }

      if(this.anIntArray2690 != null) {
         var4 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.anInt2652; ++var1) {
            var3 = this.anIntArray2690[var1];
            ++var4[var3];
            if(var3 > var2) {
               var2 = var3;
            }
         }

         this.anIntArrayArray2678 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; ++var1) {
            this.anIntArrayArray2678[var1] = new int[var4[var1]];
            var4[var1] = 0;
         }

         for(var1 = 0; var1 < this.anInt2652; this.anIntArrayArray2678[var3][var4[var3]++] = var1++) {
            var3 = this.anIntArray2690[var1];
         }

         this.anIntArray2690 = null;
      }

   }
}
