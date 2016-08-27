package com.jagex;

public class Class116_Sub23_Sub18 extends NodeContainer {

   int[] anIntArray2474;
   int anInt2475;
   String[] aStringArray2477;
   public static Class14 aClass14_2478;
   int anInt2479;
   int anInt2480;
   static int anInt2481;
   int[] anIntArray2482;
   static CacheIndex aCacheIndex_2484;
   static int[] anIntArray2486;
   static Sprite mapSprite;
   static Class123 aClass123_2488 = new Class123(128);
   int anInt2491;


   public static void method2885(HuffManEncryption var0, int var1) {
      client.aClass52_1621 = var0;
   }

   static final void method2886(int var0) {
      int var1;
      int var2;
      int var3;
      int var4;
      Class116_Sub23_Sub16_Sub3 var30;
      if(36 ==  client.currentOpcode) {
         var1 = client.packetBuffer.readLEShort((byte) -102);
         var2 = client.packetBuffer.readByteA((byte) -1);
         var3 = 1413480759 * GameInterface.anInt1818 + (var2 >> 4 & 7);
         var4 = (var2 & 7) + Player.anInt2887 * 40472155;
         if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
            Deque var31 = client.aClass117ArrayArrayArray3071[GameInterface.anInt1819 * -747958745][var3][var4];
            if(null != var31) {
               for(var30 = (Class116_Sub23_Sub16_Sub3)var31.getFirst(); null != var30; var30 = (Class116_Sub23_Sub16_Sub3)var31.getNext()) {
                  if((var1 & 32767) == -848428919 * var30.anInt2646) {
                     var30.unlink();
                     break;
                  }
               }

               if(var31.getFirst() == null) {
                  client.aClass117ArrayArrayArray3071[GameInterface.anInt1819 * -747958745][var3][var4] = null;
               }

               Class37.method672(var3, var4, 187262305);
            }
         }

      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var10;
         if(15 ==  client.currentOpcode) {
            var1 = client.packetBuffer.readSignedByte(1708176767);
            var2 = 1413480759 * GameInterface.anInt1818 + (var1 >> 4 & 7);
            var3 = Player.anInt2887 * 40472155 + (var1 & 7);
            var4 = client.packetBuffer.readUnsignedShort(1830434869);
            var5 = client.packetBuffer.readSignedByte(1708176767);
            var6 = var5 >> 4 & 15;
            var7 = var5 & 7;
            var10 = client.packetBuffer.readSignedByte(1708176767);
            if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
               var8 = var6 + 1;
               if(Class79.ourPlayer.xMovementSteps[0] >= var2 - var8 && Class79.ourPlayer.xMovementSteps[0] <= var2 + var8 && Class79.ourPlayer.yMovementSteps[0] >= var3 - var8 && Class79.ourPlayer.yMovementSteps[0] <= var8 + var3 && client.anInt3175 * 873913835 != 0 && var7 > 0 && 2079336095 * client.anInt3176 < 50) {
                  client.anIntArray3177[client.anInt3176 * 2079336095] = var4;
                  client.anIntArray3019[2079336095 * client.anInt3176] = var7;
                  client.anIntArray2964[2079336095 * client.anInt3176] = var10;
                  client.aClass15Array3181[2079336095 * client.anInt3176] = null;
                  client.anIntArray3180[2079336095 * client.anInt3176] = var6 + (var2 << 16) + (var3 << 8);
                  client.anInt3176 += -857377441;
               }
            }
         }

         if(client.currentOpcode == 220) {
            var1 = client.packetBuffer.readSignedByte(1708176767);
            var2 = 1413480759 * GameInterface.anInt1818 + (var1 >> 4 & 7);
            var3 = (var1 & 7) + Player.anInt2887 * 40472155;
            var4 = client.packetBuffer.readUnsignedShort(1314197411);
            var5 = client.packetBuffer.readUnsignedShort(1859163098);
            var6 = client.packetBuffer.readUnsignedShort(1253053663);
            if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
               Deque var34 = client.aClass117ArrayArrayArray3071[-747958745 * GameInterface.anInt1819][var2][var3];
               if(var34 != null) {
                  for(Class116_Sub23_Sub16_Sub3 var40 = (Class116_Sub23_Sub16_Sub3)var34.getFirst(); var40 != null; var40 = (Class116_Sub23_Sub16_Sub3)var34.getNext()) {
                     if((var4 & 32767) == -848428919 * var40.anInt2646 && var5 == 1308808435 * var40.anInt2640) {
                        var40.anInt2640 = var6 * 1605264443;
                        break;
                     }
                  }

                  Class37.method672(var2, var3, -889840918);
               }
            }

         } else {
            int var41;
            if( client.currentOpcode == 25) {
               var1 = client.packetBuffer.readSignedByte(1708176767);
               var2 = var1 >> 2;
               var3 = var1 & 3;
               var4 = client.anIntArray2999[var2];
               var5 = client.packetBuffer.readSignedByte(1708176767);
               var6 = GameInterface.anInt1818 * 1413480759 + (var5 >> 4 & 7);
               var7 = 40472155 * Player.anInt2887 + (var5 & 7);
               var10 = client.packetBuffer.readUnsignedShort(1421986517);
               if(var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                  if(var4 == 0) {
                     Class40 var33 = GameInterface.region.method358(GameInterface.anInt1819 * -747958745, var6, var7);
                     if(null != var33) {
                        var41 = var33.anInt534 * 785572969 >> 14 & 32767;
                        if(2 == var2) {
                           var33.anAnimable3 = new Class116_Sub23_Sub16_Sub6(var41, 2, var3 + 4, GameInterface.anInt1819 * -747958745, var6, var7, var10, false, var33.anAnimable3);
                           var33.anAnimable4 = new Class116_Sub23_Sub16_Sub6(var41, 2, var3 + 1 & 3, GameInterface.anInt1819 * -747958745, var6, var7, var10, false, var33.anAnimable4);
                        } else {
                           var33.anAnimable3 = new Class116_Sub23_Sub16_Sub6(var41, var2, var3, -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var33.anAnimable3);
                        }
                     }
                  }

                  if(1 == var4) {
                     Class31 var35 = GameInterface.region.method368(GameInterface.anInt1819 * -747958745, var6, var7);
                     if(var35 != null) {
                        var41 = var35.anInt430 * 1286385391 >> 14 & 32767;
                        if(4 != var2 && var2 != 5) {
                           if(6 == var2) {
                              var35.anAnimable1 = new Class116_Sub23_Sub16_Sub6(var41, 4, 4 + var3, GameInterface.anInt1819 * -747958745, var6, var7, var10, false, var35.anAnimable1);
                           } else if(var2 == 7) {
                              var35.anAnimable1 = new Class116_Sub23_Sub16_Sub6(var41, 4, (var3 + 2 & 3) + 4, GameInterface.anInt1819 * -747958745, var6, var7, var10, false, var35.anAnimable1);
                           } else if(8 == var2) {
                              var35.anAnimable1 = new Class116_Sub23_Sub16_Sub6(var41, 4, 4 + var3, -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var35.anAnimable1);
                              var35.anAnimable2 = new Class116_Sub23_Sub16_Sub6(var41, 4, 4 + (var3 + 2 & 3), -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var35.anAnimable2);
                           }
                        } else {
                           var35.anAnimable1 = new Class116_Sub23_Sub16_Sub6(var41, 4, var3, -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var35.anAnimable1);
                        }
                     }
                  }

                  if(var4 == 2) {
                     TileObj5 var36 = GameInterface.region.method369(-747958745 * GameInterface.anInt1819, var6, var7);
                     if(11 == var2) {
                        var2 = 10;
                     }

                     if(null != var36) {
                        var36.anAnimable5 = new Class116_Sub23_Sub16_Sub6(714123667 * var36.anInt594 >> 14 & 32767, var2, var3, -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var36.anAnimable5);
                     }
                  }

                  if(var4 == 3) {
                     Class22 var37 = GameInterface.region.method518(GameInterface.anInt1819 * -747958745, var6, var7);
                     if(null != var37) {
                        var37.anAnimable = new Class116_Sub23_Sub16_Sub6(827739875 * var37.anInt273 >> 14 & 32767, 22, var3, -747958745 * GameInterface.anInt1819, var6, var7, var10, false, var37.anAnimable);
                     }
                  }
               }

            } else if(147 == client.currentOpcode) {
               var1 = client.packetBuffer.readByteA((byte) -1);
               var2 = 1413480759 * GameInterface.anInt1818 + (var1 >> 4 & 7);
               var3 = (var1 & 7) + 40472155 * Player.anInt2887;
               var4 = client.packetBuffer.readShortA(-338860511);
               var5 = client.packetBuffer.readShortA(-338860511);
               if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                  var30 = new Class116_Sub23_Sub16_Sub3();
                  var30.anInt2646 = -1402243655 * var4;
                  var30.anInt2640 = 1605264443 * var5;
                  if(null == client.aClass117ArrayArrayArray3071[-747958745 * GameInterface.anInt1819][var2][var3]) {
                     client.aClass117ArrayArrayArray3071[GameInterface.anInt1819 * -747958745][var2][var3] = new Deque();
                  }

                  client.aClass117ArrayArrayArray3071[GameInterface.anInt1819 * -747958745][var2][var3].addLast(var30);
                  Class37.method672(var2, var3, 1442668489);
               }

            } else if( client.currentOpcode == 182) {
               var1 = client.packetBuffer.readByteS((byte) -4);
               var2 = (var1 >> 4 & 7) + GameInterface.anInt1818 * 1413480759;
               var3 = 40472155 * Player.anInt2887 + (var1 & 7);
               var4 = client.packetBuffer.readSignedByte(1708176767);
               var5 = var4 >> 2;
               var6 = var4 & 3;
               var7 = client.anIntArray2999[var5];
               if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                  MobDefinition.method2574(GameInterface.anInt1819 * -747958745, var2, var3, var7, -1, var5, var6, 0, -1, 1599332378);
               }

            } else if(231 == client.currentOpcode) {
               var1 = client.packetBuffer.readSignedByte(1708176767);
               var2 = (var1 >> 4 & 7) + GameInterface.anInt1818 * 1413480759;
               var3 = 40472155 * Player.anInt2887 + (var1 & 7);
               var4 = client.packetBuffer.readUnsignedShort(-37524387);
               var5 = client.packetBuffer.readSignedByte(1708176767);
               var6 = client.packetBuffer.readUnsignedShort(304595192);
               if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                  var2 = var2 * 128 + 64;
                  var3 = 128 * var3 + 64;
                  Class116_Sub23_Sub16_Sub1 var32 = new Class116_Sub23_Sub16_Sub1(var4, GameInterface.anInt1819 * -747958745, var2, var3, MobDefinition.method2552(var2, var3, -747958745 * GameInterface.anInt1819, (short) 19485) - var5, var6, client.anInt2943 * -1040073859);
                  client.aClass117_2973.addLast(var32);
               }

            } else {
               int var9;
               int var24;
               if(client.currentOpcode == 108) {
                  var1 = client.packetBuffer.readSignedByte(1708176767);
                  var2 = (var1 >> 4 & 7) + 1413480759 * GameInterface.anInt1818;
                  var3 = (var1 & 7) + 40472155 * Player.anInt2887;
                  var4 = var2 + client.packetBuffer.readUnsignedByte(1429411165);
                  var5 = var3 + client.packetBuffer.readUnsignedByte(-1141597886);
                  var6 = client.packetBuffer.readShort(-169875929);
                  var7 = client.packetBuffer.readUnsignedShort(1814301978);
                  var10 = client.packetBuffer.readSignedByte(1708176767) * 4;
                  var8 = client.packetBuffer.readSignedByte(1708176767) * 4;
                  var41 = client.packetBuffer.readUnsignedShort(865121947);
                  int var42 = client.packetBuffer.readUnsignedShort(1933146674);
                  var24 = client.packetBuffer.readSignedByte(1708176767);
                  var9 = client.packetBuffer.readSignedByte(1708176767);
                  if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && '\uffff' != var7) {
                     var2 = 128 * var2 + 64;
                     var3 = 128 * var3 + 64;
                     var4 = var4 * 128 + 64;
                     var5 = 64 + 128 * var5;
                     Class116_Sub23_Sub16_Sub5 var39 = new Class116_Sub23_Sub16_Sub5(var7, GameInterface.anInt1819 * -747958745, var2, var3, MobDefinition.method2552(var2, var3, GameInterface.anInt1819 * -747958745, (short) 18732) - var10, -1040073859 * client.anInt2943 + var41, var42 + client.anInt2943 * -1040073859, var24, var9, var6, var8);
                     var39.method3343(var4, var5, MobDefinition.method2552(var4, var5, GameInterface.anInt1819 * -747958745, (short) 4122) - var8, client.anInt2943 * -1040073859 + var41, -1726197719);
                     client.aClass117_3028.addLast(var39);
                  }

               } else {
                  if(client.currentOpcode == 5) {
                     var1 = client.packetBuffer.readByteC(1941673498);
                     var2 = var1 >> 2;
                     var3 = var1 & 3;
                     var4 = client.anIntArray2999[var2];
                     var5 = client.packetBuffer.readSignedByte(1708176767);
                     var6 = (var5 >> 4 & 7) + GameInterface.anInt1818 * 1413480759;
                     var7 = (var5 & 7) + 40472155 * Player.anInt2887;
                     byte var38 = client.packetBuffer.readByteA(-1486579678);
                     var8 = client.packetBuffer.readLEShort((byte) -42);
                     byte var12 = client.packetBuffer.readByteA(-1240691656);
                     byte var23 = client.packetBuffer.readByteA(881966677);
                     var24 = client.packetBuffer.readUnsignedShort(-259313343);
                     var9 = client.packetBuffer.readUnsignedShort(936733019);
                     int var11 = client.packetBuffer.readLEShortA(-1846803533);
                     byte var22 = client.packetBuffer.method2127(-786252484);
                     Player var13;
                     if(var9 == client.playerIndex * 1467227105) {
                        var13 = Class79.ourPlayer;
                     } else {
                        var13 = client.globalPlayers[var9];
                     }

                     if(var13 != null) {
                        ObjectDefinition var17 = Class45.method700(var11, 359750046);
                        int var14;
                        int var25;
                        if(var3 != 1 && var3 != 3) {
                           var25 = var17.sizeX * 1162660975;
                           var14 = -1976023901 * var17.sizeY;
                        } else {
                           var25 = -1976023901 * var17.sizeY;
                           var14 = var17.sizeX * 1162660975;
                        }

                        int var26 = var6 + (var25 >> 1);
                        int var27 = var6 + (var25 + 1 >> 1);
                        int var28 = var7 + (var14 >> 1);
                        int var29 = var7 + (1 + var14 >> 1);
                        int[][] var18 = Class47.anIntArrayArrayArray635[-747958745 * GameInterface.anInt1819];
                        int var20 = var18[var26][var29] + var18[var26][var28] + var18[var27][var28] + var18[var27][var29] >> 2;
                        int var19 = (var25 << 6) + (var6 << 7);
                        int var21 = (var14 << 6) + (var7 << 7);
                        SpotAnim var16 = var17.method2398(var2, var3, var18, var19, var20, var21, -813998597);
                        if(var16 != null) {
                           MobDefinition.method2574(-747958745 * GameInterface.anInt1819, var6, var7, var4, -1, 0, 0, var8 + 1, 1 + var24, 1599332378);
                           var13.anInt2888 = (-1040073859 * client.anInt2943 + var8) * -1231551829;
                           var13.anInt2889 = -802785219 * (var24 + client.anInt2943 * -1040073859);
                           var13.aSpotAnim_2903 = var16;
                           var13.anInt2890 = 1203867520 * var6 + var25 * 601933760;
                           var13.anInt2892 = 1790041472 * var7 + var14 * -1252462912;
                           var13.anInt2891 = 1977780761 * var20;
                           byte var15;
                           if(var22 > var38) {
                              var15 = var22;
                              var22 = var38;
                              var38 = var15;
                           }

                           if(var23 > var12) {
                              var15 = var23;
                              var23 = var12;
                              var12 = var15;
                           }

                           var13.anInt2894 = -1149163057 * (var6 + var22);
                           var13.anInt2885 = (var38 + var6) * 52718651;
                           var13.anInt2895 = (var7 + var23) * 1085487497;
                           var13.anInt2880 = -1263411125 * (var7 + var12);
                        }
                     }
                  }

                  if(189 == client.currentOpcode) {
                     var1 = client.packetBuffer.readByteA((byte) -1);
                     var2 = (var1 >> 4 & 7) + 1413480759 * GameInterface.anInt1818;
                     var3 = (var1 & 7) + Player.anInt2887 * 40472155;
                     var4 = client.packetBuffer.readSignedByte(1708176767);
                     var5 = var4 >> 2;
                     var6 = var4 & 3;
                     var7 = client.anIntArray2999[var5];
                     var10 = client.packetBuffer.readUnsignedShort(1950447029);
                     if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                        MobDefinition.method2574(GameInterface.anInt1819 * -747958745, var2, var3, var7, var10, var5, var6, 0, -1, 1599332378);
                     }

                  }
               }
            }
         }
      }
   }

}
