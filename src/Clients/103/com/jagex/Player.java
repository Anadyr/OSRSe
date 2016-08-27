package com.jagex;
import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public final class Player extends Entity {

   int anInt2880;
   Class108 aClass108_2881;
   int anInt2882 = 1894915347;
   int anInt2883 = 262247627;
   String[] rightClickOptionMask = new String[3];
   int anInt2885;
   int anInt2886;
   static int anInt2887;
   int anInt2888;
   int anInt2889;
   int anInt2890;
   int anInt2891;
   int anInt2892;
   String username;
   int anInt2894;
   int anInt2895;
   boolean aBool2896;
   int anInt2897;
   int anInt2899;
   boolean aBool2900;
   boolean moving;
   int anInt2902;
   SpotAnim aSpotAnim_2903;
   int anInt2904;
   int anInt2905;
   int anInt2906;
   int anInt2908;


   final void doAppearance(Packet var1, int var2) {
      var1.position = 0;
      int var3 = var1.readSignedByte(1708176767);
      this.anInt2882 = var1.readUnsignedByte(879481021) * -1894915347;
      this.anInt2883 = var1.readUnsignedByte(-1158352919) * -262247627;
      int var4 = -1;
      this.anInt2899 = 0;
      int[] var7 = new int[12];

      int var6;
      int var8;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readSignedByte(1708176767);
         if(0 == var6) {
            var7[var5] = 0;
         } else {
            var8 = var1.readSignedByte(1708176767);
            var7[var5] = var8 + (var6 << 8);
            if(0 == var5 && '\uffff' == var7[0]) {
               var4 = var1.readUnsignedShort(139513604);
               break;
            }

            if(var7[var5] >= 512) {
               int var9 = RelationList.method778(var7[var5] - 512, (byte) 70).anInt2398 * 1721605111;
               if(0 != var9) {
                  this.anInt2899 = -1052938061 * var9;
               }
            }
         }
      }

      int[] var10 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var8 = var1.readSignedByte(1708176767);
         if(var8 < 0 || var8 >= Class108.aShortArrayArray1460[var6].length) {
            var8 = 0;
         }

         var10[var6] = var8;
      }

      this.anInt2639 = var1.readUnsignedShort(-186314688) * -592731223;
      if('\uffff' == 370127001 * this.anInt2639) {
         this.anInt2639 = 592731223;
      }

      this.anInt2584 = var1.readUnsignedShort(2101883387) * -176841799;
      if('\uffff' == this.anInt2584 * 711326345) {
         this.anInt2584 = 176841799;
      }

      this.anInt2585 = 2073877321 * this.anInt2584;
      this.anInt2586 = var1.readUnsignedShort(1045091620) * -929243503;
      if(1481286257 * this.anInt2586 == '\uffff') {
         this.anInt2586 = 929243503;
      }

      this.anInt2629 = var1.readUnsignedShort(60920739) * -951990375;
      if('\uffff' == -826106711 * this.anInt2629) {
         this.anInt2629 = 951990375;
      }

      this.anInt2580 = var1.readUnsignedShort(1922132346) * 505909337;
      if(this.anInt2580 * -897665047 == '\uffff') {
         this.anInt2580 = -505909337;
      }

      this.anInt2615 = var1.readUnsignedShort(1704373309) * 1473487651;
      if(this.anInt2615 * -1453546357 == '\uffff') {
         this.anInt2615 = -1473487651;
      }

      this.anInt2590 = var1.readUnsignedShort(526093807) * 71707737;
      if(this.anInt2590 * -108110871 == '\uffff') {
         this.anInt2590 = -71707737;
      }

      this.username = var1.readString(61376769);
      if(Class79.ourPlayer == this) {
         RuntimeException_Sub1.aString2849 = this.username;
      }

      this.anInt2908 = var1.readSignedByte(1708176767) * -811997547;
      this.anInt2886 = var1.readUnsignedShort(1501916187) * -1535283903;
      this.aBool2900 = var1.readSignedByte(1708176767) == 1;
      if(0 == client.anInt3020 * 1082541889 && client.playerRights * 1520983779 >= 2) {
         this.aBool2900 = false;
      }

      if(this.aClass108_2881 == null) {
         this.aClass108_2881 = new Class108();
      }

      this.aClass108_2881.method1468(var7, var10, var3 == 1, var4, -621878850);
   }

   protected final SpotAnim getRotatedModel(byte var1) {
      if(null == this.aClass108_2881) {
         return null;
      } else {
         Class116_Sub23_Sub4 var6 = this.anInt2587 * -922607859 != -1 && 0 == this.anInt2612 * 1301453073?Class116_Sub8.method1946(this.anInt2587 * -922607859, -846609165):null;
         Class116_Sub23_Sub4 var3 = -1 != this.anInt2606 * 57983255 && !this.aBool2896 && (this.anInt2606 * 57983255 != this.anInt2639 * 370127001 || var6 == null)?Class116_Sub8.method1946(57983255 * this.anInt2606, -714223326):null;
         SpotAnim var4 = this.aClass108_2881.method1474(var6, this.anInt2610 * 1402685833, var3, this.anInt2581 * -1199565973, -531940919);
         if(null == var4) {
            return null;
         } else {
            var4.method3373();
            this.anInt2627 = var4.modelHeight * -1831653581;
            SpotAnim var2;
            SpotAnim[] var5;
            if(!this.aBool2896 && -1 != this.currentGraphic * 1631645159 && -1 != this.anInt2595 * -1255206495) {
               var2 = Friend.method1835(this.currentGraphic * 1631645159, (byte) 1).method2344(-1255206495 * this.anInt2595, -1854347926);
               if(var2 != null) {
                  var2.method3385(0, -(1719935737 * this.currentGraphicDelay), 0);
                  var5 = new SpotAnim[]{var4, var2};
                  var4 = new SpotAnim(var5, 2);
               }
            }

            if(!this.aBool2896 && this.aSpotAnim_2903 != null) {
               if(client.anInt2943 * -1040073859 >= this.anInt2889 * 959962901) {
                  this.aSpotAnim_2903 = null;
               }

               if(client.anInt2943 * -1040073859 >= this.anInt2888 * 359131139 && -1040073859 * client.anInt2943 < 959962901 * this.anInt2889) {
                  var2 = this.aSpotAnim_2903;
                  var2.method3385(-1309525793 * this.anInt2890 - this.anInt2609 * 1272643751, 597111337 * this.anInt2891 - -868972383 * this.anInt2897, 128838003 * this.anInt2892 - -1801433343 * this.anInt2579);
                  if(this.anInt2631 * -2061229533 == 512) {
                     var2.method3402();
                     var2.method3402();
                     var2.method3402();
                  } else if(this.anInt2631 * -2061229533 == 1024) {
                     var2.method3402();
                     var2.method3402();
                  } else if(-2061229533 * this.anInt2631 == 1536) {
                     var2.method3402();
                  }

                  var5 = new SpotAnim[]{var4, var2};
                  var4 = new SpotAnim(var5, 2);
                  if(this.anInt2631 * -2061229533 == 512) {
                     var2.method3402();
                  } else if(this.anInt2631 * -2061229533 == 1024) {
                     var2.method3402();
                     var2.method3402();
                  } else if(this.anInt2631 * -2061229533 == 1536) {
                     var2.method3402();
                     var2.method3402();
                     var2.method3402();
                  }

                  var2.method3385(1272643751 * this.anInt2609 - this.anInt2890 * -1309525793, -868972383 * this.anInt2897 - 597111337 * this.anInt2891, -1801433343 * this.anInt2579 - this.anInt2892 * 128838003);
               }
            }

            var4.aBool2809 = true;
            return var4;
         }
      }
   }

   static void method3550(byte[] data, short var1) {
      Packet packet = new Packet(data);
      packet.position = (data.length - 2) * -184175589;
      Class8.anInt130 = packet.readUnsignedShort(579200638) * 2080683417;
      Class8.anIntArray124 = new int[Class8.anInt130 * 817614505];
      Class116_Sub23_Sub15.anIntArray2444 = new int[817614505 * Class8.anInt130];
      Class8.anIntArray125 = new int[817614505 * Class8.anInt130];
      Class8.anIntArray126 = new int[Class8.anInt130 * 817614505];
      Mob.aByteArrayArray2877 = new byte[817614505 * Class8.anInt130][];
      packet.position = -184175589 * (data.length - 7 - Class8.anInt130 * -2049018552);
      Class8.anInt122 = packet.readUnsignedShort(2049727675) * -1327133543;
      Class8.anInt132 = packet.readUnsignedShort(1819338767) * -1754818609;
      int var4 = (packet.readSignedByte(1708176767) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < 817614505 * Class8.anInt130; ++var3) {
         Class8.anIntArray124[var3] = packet.readUnsignedShort(381534893);
      }

      for(var3 = 0; var3 < 817614505 * Class8.anInt130; ++var3) {
         Class116_Sub23_Sub15.anIntArray2444[var3] = packet.readUnsignedShort(1215495351);
      }

      for(var3 = 0; var3 < 817614505 * Class8.anInt130; ++var3) {
         Class8.anIntArray125[var3] = packet.readUnsignedShort(758314513);
      }

      for(var3 = 0; var3 < 817614505 * Class8.anInt130; ++var3) {
         Class8.anIntArray126[var3] = packet.readUnsignedShort(404240465);
      }

      packet.position = (data.length - 7 - -2049018552 * Class8.anInt130 - (var4 - 1) * 3) * -184175589;
      Class97.anIntArray1372 = new int[var4];

      for(var3 = 1; var3 < var4; ++var3) {
         Class97.anIntArray1372[var3] = packet.readMedium((byte) 15);
         if(0 == Class97.anIntArray1372[var3]) {
            Class97.anIntArray1372[var3] = 1;
         }
      }

      packet.position = 0;

      for(var3 = 0; var3 < 817614505 * Class8.anInt130; ++var3) {
         int var6 = Class8.anIntArray125[var3];
         int var9 = Class8.anIntArray126[var3];
         int var10 = var9 * var6;
         byte[] var8 = new byte[var10];
         Mob.aByteArrayArray2877[var3] = var8;
         int var7 = packet.readSignedByte(1708176767);
         int var5;
         if(0 == var7) {
            for(var5 = 0; var5 < var10; ++var5) {
               var8[var5] = packet.readUnsignedByte(933200154);
            }
         } else if(1 == var7) {
            for(var5 = 0; var5 < var6; ++var5) {
               for(int var11 = 0; var11 < var9; ++var11) {
                  var8[var6 * var11 + var5] = packet.readUnsignedByte(-227978775);
               }
            }
         }
      }

   }

   void method3551(int var1, int var2, int var3) {
      this.anInt2578 = 0;
      this.anInt2636 = 0;
      this.anInt2635 = 0;
      this.xMovementSteps[0] = var1;
      this.yMovementSteps[0] = var2;
      int var4 = this.method3561(1777860935);
      this.anInt2609 = 1789511104 * var4 + -715945088 * this.xMovementSteps[0];
      this.anInt2579 = this.yMovementSteps[0] * 1616412800 + var4 * 808206400;
   }

   final void method3552(int var1, int var2, byte var3, int var4) {
      if(632093179 * this.anInt2578 < 9) {
         this.anInt2578 += 11741491;
      }

      for(int var5 = this.anInt2578 * 632093179; var5 > 0; --var5) {
         this.xMovementSteps[var5] = this.xMovementSteps[var5 - 1];
         this.yMovementSteps[var5] = this.yMovementSteps[var5 - 1];
         this.aByteArray2628[var5] = this.aByteArray2628[var5 - 1];
      }

      this.xMovementSteps[0] = var1;
      this.yMovementSteps[0] = var2;
      this.aByteArray2628[0] = var3;
   }

   final boolean method3101(byte var1) {
      return null != this.aClass108_2881;
   }

   final void method3553(int var1, int var2, byte var3, int var4) {
      if(-1 != this.anInt2587 * -922607859 && Class116_Sub8.method1946(-922607859 * this.anInt2587, -55186589).anInt2242 * -1099577343 == 1) {
         this.anInt2587 = 1587034171;
      }

      this.anInt2605 = 316267887;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(this.xMovementSteps[0] >= 0 && this.xMovementSteps[0] < 104 && this.yMovementSteps[0] >= 0 && this.yMovementSteps[0] < 104) {
            if(var3 == 2) {
               Class25.method532(this, var1, var2, (byte)2, 1710560311);
            }

            this.method3552(var1, var2, var3, -612697518);
         } else {
            this.method3551(var1, var2, 1804940213);
         }
      } else {
         this.method3551(var1, var2, 992658966);
      }

   }

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.rightClickOptionMask[var1] = "";
      }

      this.anInt2908 = 0;
      this.anInt2886 = 0;
      this.anInt2888 = 0;
      this.anInt2889 = 0;
      this.aBool2896 = false;
      this.anInt2899 = 0;
      this.aBool2900 = false;
      this.moving = false;
   }

   int method3561(int var1) {
      return null != this.aClass108_2881 && -1 != this.aClass108_2881.anInt1466 * -84158433?Class116_Sub23_Sub15.getMobDefinition(this.aClass108_2881.anInt1466 * -84158433, -1541777826).tileSize * -691506967:1;
   }

   static void updateLocalPlayer(PacketBuilder buffer, int player, int var2) {
      boolean maskUpdate = buffer.readBits(1, (byte) -1) == 1;
      if(maskUpdate) {
         Class7.anIntArray119[(Class7.anInt118 += -299545915) * 716284941 - 1] = player;
      }
      int movement = buffer.readBits(2, (byte) -1);
      Player playerInCycle = client.globalPlayers[player];
      if(0 == movement) {
         if(maskUpdate) {
            playerInCycle.moving = false;
         } else if(client.playerIndex * 1467227105 == player) {
            throw new RuntimeException();
         } else {
            Class7.anIntArray111[player] = (playerInCycle.anInt2906 * -1522270499 << 28) + (1426698711 * Class116_Sub17.anInt2105 + playerInCycle.xMovementSteps[0] >> 6 << 14) + (Class33.anInt456 * 714823515 + playerInCycle.yMovementSteps[0] >> 6);
            if(-1 != playerInCycle.anInt2605 * -744366479) {
               Class7.anIntArray103[player] = playerInCycle.anInt2605 * -744366479;
            } else {
               Class7.anIntArray103[player] = -2061229533 * playerInCycle.anInt2631;
            }
            Class7.anIntArray102[player] = playerInCycle.anInt2603 * 734924805;
            client.globalPlayers[player] = null;
            if(buffer.readBits(1, (byte) -1) != 0) {
                System.out.println("is this a dummy?");
               Class4.updateGlobalPlayer(buffer, player, (byte) 0);
            }

         }
      } else {
         int var3;
         int xStep;
         int yStep;
         if(1 == movement) {
            var3 = buffer.readBits(3, (byte) -1);
            xStep = playerInCycle.xMovementSteps[0];
            yStep = playerInCycle.yMovementSteps[0];
            if(0 == var3) {
               --xStep;
               --yStep;
            } else if(var3 == 1) {
               --yStep;
            } else if(2 == var3) {
               ++xStep;
               --yStep;
            } else if(var3 == 3) {
               --xStep;
            } else if(var3 == 4) {
               ++xStep;
            } else if(var3 == 5) {
               --xStep;
               ++yStep;
            } else if(6 == var3) {
               ++yStep;
            } else if(var3 == 7) {
               ++xStep;
               ++yStep;
            }
             if(player == 1467227105 * client.playerIndex && (playerInCycle.anInt2609 * 1272643751 < 1536 || playerInCycle.anInt2579 * -1801433343 < 1536 || playerInCycle.anInt2609 * 1272643751 >= 11776 || playerInCycle.anInt2579 * -1801433343 >= 11776)) {
               playerInCycle.method3551(xStep, yStep, -719844896);
               playerInCycle.moving = false;
            } else if(maskUpdate) {
               playerInCycle.moving = true;
               playerInCycle.anInt2904 = -37570689 * xStep;
               playerInCycle.anInt2905 = yStep * 1026931509;
            } else {
               playerInCycle.moving = false;
               playerInCycle.method3553(xStep, yStep, Class7.movementMode[player], 402350089);
            }

         } else if(2 == movement) {
            var3 = buffer.readBits(4, (byte) -1);
            xStep = playerInCycle.xMovementSteps[0];
            yStep = playerInCycle.yMovementSteps[0];
             if(playerInCycle.username.equalsIgnoreCase("hi"))
                System.out.println("x="+xStep+", y="+yStep+", type="+var3);
            if(var3 == 0) {
               xStep -= 2;
               yStep -= 2;
            } else if(var3 == 1) {
               --xStep;
               yStep -= 2;
            } else if(var3 == 2) {
               yStep -= 2;
            } else if(3 == var3) {
               ++xStep;
               yStep -= 2;
            } else if(var3 == 4) {
               xStep += 2;
               yStep -= 2;
            } else if(5 == var3) {
               xStep -= 2;
               --yStep;
            } else if(6 == var3) {
               xStep += 2;
               --yStep;
            } else if(7 == var3) {
               xStep -= 2;
            } else if(var3 == 8) {
               xStep += 2;
            } else if(var3 == 9) {
               xStep -= 2;
               ++yStep;
            } else if(10 == var3) {
               xStep += 2;
               ++yStep;
            } else if(11 == var3) {
               xStep -= 2;
               yStep += 2;
            } else if(var3 == 12) {
               --xStep;
               yStep += 2;
            } else if(var3 == 13) {
               yStep += 2;
            } else if(var3 == 14) {
               ++xStep;
               yStep += 2;
            } else if(15 == var3) {
               xStep += 2;
               yStep += 2;
            }
            if(client.playerIndex * 1467227105 == player && (1272643751 * playerInCycle.anInt2609 < 1536 || -1801433343 * playerInCycle.anInt2579 < 1536 || playerInCycle.anInt2609 * 1272643751 >= 11776 || playerInCycle.anInt2579 * -1801433343 >= 11776)) {
               playerInCycle.method3551(xStep, yStep, 1202188093);
               playerInCycle.moving = false;
            } else if(maskUpdate) {
               playerInCycle.moving = true;
               playerInCycle.anInt2904 = xStep * -37570689;
               playerInCycle.anInt2905 = yStep * 1026931509;
            } else {
               playerInCycle.moving = false;
               playerInCycle.method3553(xStep, yStep, Class7.movementMode[player], 4980578);
            }

         } else {
            var3 = buffer.readBits(1, (byte) -1);
            int var9;
            int var10;
            int var11;
            int var12;
            if(var3 == 0) {
               xStep = buffer.readBits(12, (byte) -1);
               yStep = xStep >> 10;
               var12 = xStep >> 5 & 31;
               if(var12 > 15) {
                  var12 -= 32;
               }

               var11 = xStep & 31;
               if(var11 > 15) {
                  var11 -= 32;
               }

               var10 = playerInCycle.xMovementSteps[0] + var12;
               var9 = playerInCycle.yMovementSteps[0] + var11;
               if(player == client.playerIndex * 1467227105 && (playerInCycle.anInt2609 * 1272643751 < 1536 || playerInCycle.anInt2579 * -1801433343 < 1536 || 1272643751 * playerInCycle.anInt2609 >= 11776 || -1801433343 * playerInCycle.anInt2579 >= 11776)) {
                  playerInCycle.method3551(var10, var9, 1308806232);
                  playerInCycle.moving = false;
               } else if(maskUpdate) {
                  playerInCycle.moving = true;
                  playerInCycle.anInt2904 = -37570689 * var10;
                  playerInCycle.anInt2905 = var9 * 1026931509;
               } else {
                  playerInCycle.moving = false;
                  playerInCycle.method3553(var10, var9, Class7.movementMode[player], -1113939609);
               }
               playerInCycle.anInt2906 = (byte)(-1522270499 * playerInCycle.anInt2906 + yStep & 3) * -1668953739;
               if(player == 1467227105 * client.playerIndex) {
                  GameInterface.anInt1819 = playerInCycle.anInt2906 * -1941196453;
               }

            } else {
               xStep = buffer.readBits(30, (byte) -1);
               yStep = xStep >> 28;
               var12 = xStep >> 14 & 16383;
               var11 = xStep & 16383;
               var10 = (var12 + Class116_Sub17.anInt2105 * 1426698711 + playerInCycle.xMovementSteps[0] & 16383) - 1426698711 * Class116_Sub17.anInt2105;
               var9 = (var11 + Class33.anInt456 * 714823515 + playerInCycle.yMovementSteps[0] & 16383) - 714823515 * Class33.anInt456;
               if(1467227105 * client.playerIndex == player && (1272643751 * playerInCycle.anInt2609 < 1536 || -1801433343 * playerInCycle.anInt2579 < 1536 || 1272643751 * playerInCycle.anInt2609 >= 11776 || playerInCycle.anInt2579 * -1801433343 >= 11776)) {
                  playerInCycle.method3551(var10, var9, 898747744);
                  playerInCycle.moving = false;
               } else if(maskUpdate) {
                  playerInCycle.moving = true;
                  playerInCycle.anInt2904 = var10 * -37570689;
                  playerInCycle.anInt2905 = var9 * 1026931509;
               } else {
                  playerInCycle.moving = false;
                  playerInCycle.method3553(var10, var9, Class7.movementMode[player], -1157705353);
               }

               playerInCycle.anInt2906 = -1668953739 * (byte)(yStep + -1522270499 * playerInCycle.anInt2906 & 3);
               if(client.playerIndex * 1467227105 == player) {
                  GameInterface.anInt1819 = -1941196453 * playerInCycle.anInt2906;
               }

            }
         }
      }
   }

   static void method3563(RSInterface var0, int var1) {
      RSInterface var4 = -1652479707 * var0.parent == -1?null:Class107.getInterface(var0.parent * -1652479707, 314639891);
      int var2;
      int var3;
      if(var4 == null) {
         var2 = Class42.clientWidth * -452716157;
         var3 = 674167779 * Class116_Sub16.clientHeight;
      } else {
         var2 = 1645211541 * var4.wdth;
         var3 = 1227800423 * var4.heght;
      }

      Class33.method638(var0, var2, var3, false, 1565079094);
      Class116_Sub23_Sub4.method2469(var0, var2, var3, 1878257671);
   }

   static String method3565(RSInterface var0, int var1, int var2) {
      return !Class116_Sub17.method2314(Class35.method645(var0, (byte)0), var1, 104857025) && var0.anObjectArray2023 == null?null:(null != var0.niActions && var0.niActions.length > var1 && null != var0.niActions[var1] && var0.niActions[var1].trim().length() != 0?var0.niActions[var1]:null);
   }

   static boolean method3566(String var0, int var1, String var2, byte var3) {
      if(var1 == 0) {
         try {
            if(!Class81.aString922.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if(var12.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Object var11 = Class75.method1077(Class81.anApplet924, var2, new Object[]{(new URL(Class81.anApplet924.getCodeBase(), var0)).toString()}, 1648565546);
            return null != var11;
         } catch (Throwable var7) {
            return false;
         }
      } else if(2 == var1) {
         try {
            Class81.anApplet924.getAppletContext().showDocument(new URL(Class81.anApplet924.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if(3 == var1) {
         try {
            Applet var4 = Class81.anApplet924;
            JSObject.getWindow(var4).call("loggedout", (Object[])null);
         } catch (Throwable var10) {
            ;
         }

         try {
            Class81.anApplet924.getAppletContext().showDocument(new URL(Class81.anApplet924.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static BuildType[] method3567(int var0) {
      return new BuildType[]{BuildType.aClass87_1027, BuildType.aClass87_1023, BuildType.aClass87_1022, BuildType.aClass87_1021};
   }
}
