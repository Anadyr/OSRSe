package com.jagex;

public class World {

   String activity;
   static World[] worldArray;
   int anInt377;
   static int[] anIntArray378 = new int[]{0, 1, 2, 3};
   static int totalWorldCount = 0;
   int activityFlag;
   int anInt381;
   String address;
   static int[] anIntArray383 = new int[]{1, 1, 1, 1};
   int flag;
   static String aString386;
   static int anInt387 = 0;
   int worldId;

   boolean method537(int var1) {
      return (1 & this.activityFlag * -1784645245) != 0;
   }

   boolean method538(int var1) {
      return (2 & this.activityFlag * -1784645245) != 0;
   }

   boolean method539(int var1) {
      return (4 & this.activityFlag * -1784645245) != 0;
   }

   boolean method540(int var1) {
      return (8 & -1784645245 * this.activityFlag) != 0;
   }

   boolean method541(int var1) {
      return (536870912 & this.activityFlag * -1784645245) != 0;
   }

   public static int method542(int var0, int var1) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return 1 + var0;
   }

    /**
     * Update gpi we send 2 local and 2 global updates
     * viewport = can we see him in our 16x16 (?i think its tht) view on the game screen
     * Local 1, players who are already registered in our viewport
     * Local 2, players who aren't who are joining, or leaving our view
     * Global 1, players outside of our viewport, but registered in the cycle
     * Global 2, players outside of our viewport, but adding to the cycle
     * Adding to the cycle is two part, 1 cycle to register on nsn1, and nsn 3
     * and then another cycle to finish on nsn0 and nsn 2.
     * just because it loops 2048 4 times doesnt mean each cycle sends the update for each player
     * It cycles all players then checks their flags for the corresponding part
     *  BitMasks are used here for viewport flags, which the client stores, and the server MUST store.
     *   (gpiPlayerFlag[var3] & 1) == 0) Shows us if the player is flagged to be in this clients viewport.
     *
     * @param buffer
     * @param var1
     */
   static final void updateGPI(PacketBuilder buffer, int var1) {
      int skip = 0;
       /**
        * Local update 1, nsn0
        */
      buffer.resetBitPos((byte) 59);

      int curr;
      int index;
      int var5;
      for(index = 0; index < -334270159 * Class7.anInt107; ++index) {
         curr = Class7.anIntArray108[index];
          //if player is in viewport, and registered in the (LOCAL) cycle
         if((Class7.gpiPlayerFlag[curr] & 1) == 0) {
            if(skip > 0) {
               --skip;
               Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
            } else {
               var5 = buffer.readBits(1, (byte) -1);
               if(0 == var5) {
                   //SKIPPED THIS CYCLE
                  skip = Class116_Sub23_Sub13.readSkip(buffer, -784050510);
                  Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
               } else {
                  Player.updateLocalPlayer(buffer, curr, -1020594872);
               }
            }
         }
      }

       /**
        * Local update 2, nsn1
        */
      buffer.startBitAccess((byte) 120);
      if(skip != 0) {
         throw new RuntimeException();
      } else {
         buffer.resetBitPos((byte) 22);

         for(index = 0; index < Class7.anInt107 * -334270159; ++index) {
            curr = Class7.anIntArray108[index];
             //if player isnt in viewport, but should be/game screen, we add him this (LOCAL)cycle
             //server sided flag this player to owner, skipped this
            if(0 != (Class7.gpiPlayerFlag[curr] & 1)) {
               if(skip > 0) {
                  --skip;
                  Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
               } else {
                  var5 = buffer.readBits(1, (byte) -1);
                  if(var5 == 0) {
                      //SKIPPED THIS FLAG
                     skip = Class116_Sub23_Sub13.readSkip(buffer, -727152417);
                     Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                  } else {
                     Player.updateLocalPlayer(buffer, curr, -1953454485);
                  }
               }
            }
         }

          /**
           * Global update 1, nsn2
           */
         buffer.startBitAccess((byte) 93);
         if(0 != skip) {
            throw new RuntimeException();
         } else {
            buffer.resetBitPos((byte) -42);

            for(index = 0; index < 1824807037 * Class7.anInt109; ++index) {
               curr = Class7.playerIndexes[index];
                //if player is in (GLOBAL) cycle, and isnt drawn on game screen
               if(0 != (Class7.gpiPlayerFlag[curr] & 1)) {
                  if(skip > 0) {
                     --skip;
                     Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                  } else {
                     var5 = buffer.readBits(1, (byte) -1);
                     if(var5 == 0) {
                        skip = Class116_Sub23_Sub13.readSkip(buffer, -869373198);
                        Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                     } else if(Class4.updateGlobalPlayer(buffer, curr, (byte) 0)) {
                        Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                     }
                  }
               }
            }

             /**
              * Global update 2, nsn3
              */
            buffer.startBitAccess((byte) 71);
            if(skip != 0) {
               throw new RuntimeException();
            } else {
               buffer.resetBitPos((byte) -34);

               for(index = 0; index < 1824807037 * Class7.anInt109; ++index) {
                  curr = Class7.playerIndexes[index];
                   //if player skipped last/joined this (GLOBAL) cycle and isnt on screen
                  if(0 == (Class7.gpiPlayerFlag[curr] & 1)) {
                     if(skip > 0) {
                        --skip;
                        Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                     } else {
                        var5 = buffer.readBits(1, (byte) -1);
                        if(0 == var5) {
                           skip = Class116_Sub23_Sub13.readSkip(buffer, -607267338);
                           Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                        } else if(Class4.updateGlobalPlayer(buffer, curr, (byte) 0)) {
                           Class7.gpiPlayerFlag[curr] = (byte)(Class7.gpiPlayerFlag[curr] | 2);
                        }
                     }
                  }
               }
                /**
                 * Mask check, we go to another method to complete this buffer
                 */
               buffer.startBitAccess((byte) 119);
               if(skip != 0) {
                  throw new RuntimeException();
               } else {
                  Class7.anInt107 = 0;
                  Class7.anInt109 = 0;

                  for(index = 1; index < 2048; ++index) {
                     Class7.gpiPlayerFlag[index] = (byte)(Class7.gpiPlayerFlag[index] >> 1);
                     Player var6 = client.globalPlayers[index];
                     if(null != var6) {
                        Class7.anIntArray108[(Class7.anInt107 += -864270383) * -334270159 - 1] = index;
                     } else {
                        Class7.playerIndexes[(Class7.anInt109 += 2065293525) * 1824807037 - 1] = index;
                     }
                  }

               }
            }
         }
      }
   }


   static final void method567(int var0, int var1) {
      Packet.method2213((byte) -118);
      Class47.method767(180692953);
      int var3 = Class45.method702(var0, (short)-25885).anInt2446 * -189310937;
      if(0 != var3) {
         int var2 = Class107.varpData[var0];
         if(1 == var3) {
            if(var2 == 1) {
               Texture.method3195(0.9D);
               ((Class36) Texture.anInterface3_2718).method647(0.9D);
            }

            if(var2 == 2) {
               Texture.method3195(0.8D);
               ((Class36) Texture.anInterface3_2718).method647(0.8D);
            }

            if(var2 == 3) {
               Texture.method3195(0.7D);
               ((Class36) Texture.anInterface3_2718).method647(0.7D);
            }

            if(4 == var2) {
               Texture.method3195(0.6D);
               ((Class36) Texture.anInterface3_2718).method647(0.6D);
            }

            ChatMessage.method2585(1781333277);
         }

         if(3 == var3) {
            short var4 = 0;
            if(var2 == 0) {
               var4 = 255;
            }

            if(var2 == 1) {
               var4 = 192;
            }

            if(var2 == 2) {
               var4 = 128;
            }

            if(var2 == 3) {
               var4 = 64;
            }

            if(var2 == 4) {
               var4 = 0;
            }

            if(var4 != client.anInt3171 * -1994948003) {
               if(-1994948003 * client.anInt3171 == 0 && -1 != client.anInt3172 * 850867613) {
                  Class80.method1099(Class2.aCacheIndex_23, 850867613 * client.anInt3172, 0, var4, false, (short)21215);
                  client.aBool3159 = false;
               } else if(0 == var4) {
                  Class128.aClass116_Sub4_Sub4_1576.method3075(264748539);
                  Class128.anInt1574 = 325298615;
                  Class128.aRSIndex_1575 = null;
                  client.aBool3159 = false;
               } else {
                  Class67.method977(var4, 1829382355);
               }

               client.anInt3171 = -1999150603 * var4;
            }
         }

         if(4 == var3) {
            if(var2 == 0) {
               client.anInt3174 = 1632484343;
            }

            if(1 == var2) {
               client.anInt3174 = -1133300896;
            }

            if(var2 == 2) {
               client.anInt3174 = 2107777600;
            }

            if(3 == var2) {
               client.anInt3174 = 1053888800;
            }

            if(var2 == 4) {
               client.anInt3174 = 0;
            }
         }

         if(var3 == 5) {
            client.anInt3110 = var2 * 1049853945;
         }

         if(6 == var3) {
            client.anInt3095 = var2 * -1829432231;
         }

         if(9 == var3) {
            client.anInt3096 = -171810537 * var2;
         }

         if(10 == var3) {
            if(0 == var2) {
               client.anInt3175 = 1108213437;
            }

            if(1 == var2) {
               client.anInt3175 = -582678240;
            }

            if(2 == var2) {
               client.anInt3175 = -388452160;
            }

            if(var2 == 3) {
               client.anInt3175 = -194226080;
            }

            if(4 == var2) {
               client.anInt3175 = 0;
            }
         }

         if(17 == var3) {
            client.anInt3101 = (var2 & '\uffff') * 218906203;
         }

         Class43[] var5;
         if(var3 == 18) {
            var5 = new Class43[]{Class43.aClass43_575, Class43.aClass43_577, Class43.aClass43_581, Class43.aClass43_576};
            client.aClass43_3138 = (Class43)Class35.method646(var5, var2, (byte)-87);
            if(null == client.aClass43_3138) {
               client.aClass43_3138 = Class43.aClass43_581;
            }
         }

         if(19 == var3) {
            if(-1 == var2) {
               client.anInt3065 = 1929362559;
            } else {
               client.anInt3065 = -1929362559 * (var2 & 2047);
            }
         }

         if(22 == var3) {
            var5 = new Class43[]{Class43.aClass43_575, Class43.aClass43_577, Class43.aClass43_581, Class43.aClass43_576};
            client.aClass43_3169 = (Class43)Class35.method646(var5, var2, (byte)-58);
            if(client.aClass43_3169 == null) {
               client.aClass43_3169 = Class43.aClass43_581;
            }
         }

      }
   }

   static boolean method568(String var0, int var1) {
      if(null == var0) {
         return false;
      } else {
         String var3 = Class116_Sub23_Sub15.method2702(var0, Class59_Sub1.aClass143_1831, 180219041);

         for(int var2 = 0; var2 < 1820302153 * client.anInt3206; ++var2) {
            Ignore var4 = client.aClass24Array3207[var2];
            if(var3.equalsIgnoreCase(Class116_Sub23_Sub15.method2702(var4.currentName, Class59_Sub1.aClass143_1831, 1391467140))) {
               return true;
            }

            if(var3.equalsIgnoreCase(Class116_Sub23_Sub15.method2702(var4.lastName, Class59_Sub1.aClass143_1831, -1007733444))) {
               return true;
            }
         }

         return false;
      }
   }
}
