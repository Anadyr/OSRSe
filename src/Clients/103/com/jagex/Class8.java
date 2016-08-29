package com.jagex;
import java.awt.Font;
import java.util.ArrayList;

import com.applet.Launcher;

public class Class8 {

   public static final int anInt121 = 212;
   public static int anInt122;
   public static final int anInt123 = 153;
   public static int[] anIntArray124;
   public static int[] anIntArray125;
   public static int[] anIntArray126;
   static byte[][] aByteArrayArray127;
   static final int anInt128 = 37;
   protected static Font aFont129;
   static int anInt130;
   static int anInt131;
   public static int anInt132;


   static final void decodeMapRegion(boolean dynamic, byte var1) {
      client.dynamicRegion = dynamic;
      int var2;
      int chunkY;
      int chunkX;
      int count;
      int idx;
      int xCalc;
      int regionID;
      if(!client.dynamicRegion) {
         chunkY = client.bitBuffer.readShortA(-338860511);
         chunkX = client.bitBuffer.readLEShort((byte) -126);
         count = client.bitBuffer.readShort(603012588);
         Class116_Sub23_Sub17.anIntArrayArray2472 = new int[count][4];


          ArrayList<int[]> keys = new ArrayList<int[]>();

         for(idx = 0; idx < count; ++idx) {
             int[] key = new int[4];
            for(xCalc = 0; xCalc < 4; ++xCalc) {
                key[xCalc] = Class116_Sub23_Sub17.anIntArrayArray2472[idx][xCalc] = client.bitBuffer.readInt(-906178884);
            }
             keys.add(key);
         }

         client.anIntArray2995 = new int[count];
         Class80.anIntArray920 = new int[count];
         Class116_Sub23_Sub6.anIntArray2282 = new int[count];
         aByteArrayArray127 = new byte[count][];
         Tile.aByteArrayArray1858 = new byte[count][];
         boolean forceSend = false;
         if((48 == chunkX / 8 || 49 == chunkX / 8) && 48 == chunkY / 8) {
            forceSend = true;
         }

         if(48 == chunkX / 8 && chunkY / 8 == 148) {
            forceSend = true;
         }

         count = 0;

         for(xCalc = (chunkX - 6) / 8; xCalc <= (6 + chunkX) / 8; ++xCalc) {
            for(var2 = (chunkY - 6) / 8; var2 <= (6 + chunkY) / 8; ++var2) {
               regionID = var2 + (xCalc << 8);
               if(!forceSend || 49 != var2 && 149 != var2 && 147 != var2 && 50 != xCalc && (xCalc != 49 || var2 != 47)) {
                    int[] test = keys.get(count);
                   if(test != null)
                  Launcher.dumpMap(regionID, test);
                  client.anIntArray2995[count] = regionID;
                  Class80.anIntArray920[count] = Class59_Sub1.aClass99_Sub1_1828.method1366("m" + xCalc + "_" + var2, -341994779);
                  Class116_Sub23_Sub6.anIntArray2282[count] = Class59_Sub1.aClass99_Sub1_1828.method1366("l" + xCalc + "_" + var2, -95452573);
                  ++count;
               }
            }
         }


         Class116_Sub12.method1979(chunkX, chunkY, (byte)35);
      } else {
         chunkY = client.bitBuffer.readShort(769231792);
         chunkX = client.bitBuffer.readLEShortA(-1858628130);
         count = client.bitBuffer.readShort(-438665915);
         client.bitBuffer.resetBitPos((byte) 18);

         for(idx = 0; idx < 4; ++idx) {
            for(xCalc = 0; xCalc < 13; ++xCalc) {
               for(var2 = 0; var2 < 13; ++var2) {
                  regionID = client.bitBuffer.readBits(1, (byte) -1);
                  if(regionID == 1) {
                     client.anIntArrayArrayArray2998[idx][xCalc][var2] = client.bitBuffer.readBits(26, (byte) -1);
                  } else {
                     client.anIntArrayArrayArray2998[idx][xCalc][var2] = -1;
                  }
               }
            }
         }

         client.bitBuffer.startBitAccess((byte) 76);
         Class116_Sub23_Sub17.anIntArrayArray2472 = new int[count][4];

         
         for(idx = 0; idx < count; ++idx) {
            for(xCalc = 0; xCalc < 4; ++xCalc) {
               Class116_Sub23_Sub17.anIntArrayArray2472[idx][xCalc] = client.bitBuffer.readInt(-1935483859);
            }
         }

         client.anIntArray2995 = new int[count];
         Class80.anIntArray920 = new int[count];
         Class116_Sub23_Sub6.anIntArray2282 = new int[count];
         aByteArrayArray127 = new byte[count][];
         Tile.aByteArrayArray1858 = new byte[count][];
         count = 0;
 
         for(idx = 0; idx < 4; ++idx) {
            for(xCalc = 0; xCalc < 13; ++xCalc) {
               for(var2 = 0; var2 < 13; ++var2) {
                  regionID = client.anIntArrayArrayArray2998[idx][xCalc][var2];
                  if(-1 != regionID) {
                     int var12 = regionID >> 14 & 1023;
                     int var13 = regionID >> 3 & 2047;
                     int var9 = (var12 / 8 << 8) + var13 / 8;
                    
                     int var5;
                     for(var5 = 0; var5 < count; ++var5) {
                        if(client.anIntArray2995[var5] == var9) {
                           var9 = -1;
                           break;
                        }
                     }

                     Launcher.dumpMap(regionID, anIntArray126);
                     
                     if(var9 != -1) {
                        client.anIntArray2995[count] = var9;
                        var5 = var9 >> 8 & 255;
                        int var11 = var9 & 255;
                        Class80.anIntArray920[count] = Class59_Sub1.aClass99_Sub1_1828.method1366("m" + var5 + "_" + var11, -416918321);
                        Class116_Sub23_Sub6.anIntArray2282[count] = Class59_Sub1.aClass99_Sub1_1828.method1366("l" + var5 + "_" + var11, 222447431);
                        ++count;
                     }
                  }
               }
            }
         }
         Class116_Sub12.method1979(chunkY, chunkX, (byte)11);
      }

   }

   Class8() throws Throwable {
      throw new Error();
   }

   public static int method119(byte[] var0, int var1, CharSequence var2, int var3) {
      int var4 = var2.length();
      int var6 = var1;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var7 = var2.charAt(var5);
         if(var7 <= 127) {
            var0[var6++] = (byte)var7;
         } else if(var7 <= 2047) {
            var0[var6++] = (byte)(192 | var7 >> 6);
            var0[var6++] = (byte)(128 | var7 & 63);
         } else {
            var0[var6++] = (byte)(224 | var7 >> 12);
            var0[var6++] = (byte)(128 | var7 >> 6 & 63);
            var0[var6++] = (byte)(128 | var7 & 63);
         }
      }

      return var6 - var1;
   }

   static final void method140(int var0, int var1, int var2, int var3, Sprite var4, Class116_Sub23_Sub20 var5, short var6) {
      int var7 = var3 * var3 + var2 * var2;
      if(var7 > 4225 && var7 < 90000) {
         int var11 = client.anInt2929 * -1916997753 + client.anInt3007 * -1718342721 & 2047;
         int var13 = Texture.anIntArray2708[var11];
         int var12 = Texture.anIntArray2713[var11];
         var13 = 256 * var13 / (256 + -806982331 * client.anInt3009);
         var12 = 256 * var12 / (256 + client.anInt3009 * -806982331);
         int var14 = var12 * var2 + var3 * var13 >> 16;
         int var15 = var12 * var3 - var2 * var13 >> 16;
         double var8 = Math.atan2((double)var14, (double)var15);
         int var16 = (int)(Math.sin(var8) * 63.0D);
         int var10 = (int)(Math.cos(var8) * 57.0D);
         Mob.aClass116_Sub23_Sub19_Sub2_2875.method3276(4 + var0 + 94 + var16 - 10, 83 + var1 - var10 - 20, 20, 20, 15, 15, var8, 256);
      } else {
         Class62.markMiniMap(var0, var1, var2, var3, var4, var5, 637113535);
      }

   }

   public static boolean method141(int var0, byte var1) {
      return (var0 & 1) != 0;
   }

   static final void decodeNpcUpdate(boolean var0, int var1) {
      client.anInt3055 = 0;
      client.npcFlagCount = 0;
      client.bitBuffer.resetBitPos((byte) 53);
      int var2 = client.bitBuffer.readBits(8, (byte) -1);
      int var5;
      if(var2 < 727116725 * client.npcCount) {
         for(var5 = var2; var5 < client.npcCount * 727116725; ++var5) {
            client.anIntArray3060[(client.anInt3055 += 1545207887) * 1457329839 - 1] = client.npcIndicies[var5];
         }
      }

      if(var2 > client.npcCount * 727116725) {
         throw new RuntimeException("");
      } else {
         client.npcCount = 0;

         int var3;
         int var4;
         int var8;
         int var9;
         for(var5 = 0; var5 < var2; ++var5) {
            int var6 = client.npcIndicies[var5];
            Mob var7 = client.aMobArray2972[var6];
            var3 = client.bitBuffer.readBits(1, (byte) -1);
            if(var3 == 0) {
               client.npcIndicies[(client.npcCount += -368645475) * 727116725 - 1] = var6;
               var7.anInt2626 = client.anInt2943 * 1050068427;
            } else {
               var4 = client.bitBuffer.readBits(2, (byte) -1);
               if(var4 == 0) {
                  client.npcIndicies[(client.npcCount += -368645475) * 727116725 - 1] = var6;
                  var7.anInt2626 = 1050068427 * client.anInt2943;
                  client.pendingNpcFlags[(client.npcFlagCount += 2121422091) * -143667549 - 1] = var6;
               } else if(var4 == 1) {
                  client.npcIndicies[(client.npcCount += -368645475) * 727116725 - 1] = var6;
                  var7.anInt2626 = client.anInt2943 * 1050068427;
                  var8 = client.bitBuffer.readBits(3, (byte) -1);
                  var7.handleMovement(var8, (byte) 1, (byte) -91);
                  var9 = client.bitBuffer.readBits(1, (byte) -1);
                  if(1 == var9) {
                     client.pendingNpcFlags[(client.npcFlagCount += 2121422091) * -143667549 - 1] = var6;
                  }
               } else if(2 == var4) {
                  client.npcIndicies[(client.npcCount += -368645475) * 727116725 - 1] = var6;
                  var7.anInt2626 = 1050068427 * client.anInt2943;
                  var8 = client.bitBuffer.readBits(3, (byte) -1);
                  var7.handleMovement(var8, (byte) 2, (byte) -60);
                  var9 = client.bitBuffer.readBits(3, (byte) -1);
                  var7.handleMovement(var9, (byte) 2, (byte) 73);
                  int var10 = client.bitBuffer.readBits(1, (byte) -1);
                  if(1 == var10) {
                     client.pendingNpcFlags[(client.npcFlagCount += 2121422091) * -143667549 - 1] = var6;
                  }
               } else if(3 == var4) {
                  client.anIntArray3060[(client.anInt3055 += 1545207887) * 1457329839 - 1] = var6;
               }
            }
         }

         while(client.bitBuffer.getBitPosition(client.anInt2980 * 371800591, (byte) -90) >= 27) {
            var2 = client.bitBuffer.readBits(15, (byte) -1);
            if(32767 == var2) {
               break;
            }

            boolean var11 = false;
            if(null == client.aMobArray2972[var2]) {
               client.aMobArray2972[var2] = new Mob();
               var11 = true;
            }

            Mob var12 = client.aMobArray2972[var2];
            client.npcIndicies[(client.npcCount += -368645475) * 727116725 - 1] = var2;
            var12.anInt2626 = client.anInt2943 * 1050068427;
            int var13;
            if(var0) {
               var13 = client.bitBuffer.readBits(8, (byte) -1);
               if(var13 > 127) {
                  var13 -= 256;
               }
            } else {
               var13 = client.bitBuffer.readBits(5, (byte) -1);
               if(var13 > 15) {
                  var13 -= 32;
               }
            }

            if(var0) {
               var3 = client.bitBuffer.readBits(8, (byte) -1);
               if(var3 > 127) {
                  var3 -= 256;
               }
            } else {
               var3 = client.bitBuffer.readBits(5, (byte) -1);
               if(var3 > 15) {
                  var3 -= 32;
               }
            }

            var12.definition = Class116_Sub23_Sub15.method2705(client.bitBuffer.readBits(14, (byte) -1), -1211850206);
            var4 = client.anIntArray2959[client.bitBuffer.readBits(3, (byte) -1)];
            if(var11) {
               var12.anInt2631 = (var12.anInt2613 = var4 * 518992781) * -1253637257;
            }

            var8 = client.bitBuffer.readBits(1, (byte) -1);
            var9 = client.bitBuffer.readBits(1, (byte) -1);
            if(var9 == 1) {
               client.pendingNpcFlags[(client.npcFlagCount += 2121422091) * -143667549 - 1] = var2;
            }

            var12.anInt2582 = 1447916577 * var12.definition.tileSize;
            var12.anInt2630 = 506128019 * var12.definition.anInt2333;
            if(0 == var12.anInt2630 * 1361576967) {
               var12.anInt2613 = 0;
            }

            var12.anInt2586 = var12.definition.anInt2316 * -147360311;
            var12.anInt2629 = var12.definition.anInt2315 * 404950129;
            var12.anInt2580 = var12.definition.anInt2318 * 1055000573;
            var12.anInt2615 = 985741173 * var12.definition.anInt2319;
            var12.anInt2639 = 1706784279 * var12.definition.anInt2335;
            var12.anInt2584 = var12.definition.anInt2314 * -1634865443;
            var12.anInt2585 = var12.definition.anInt2322 * 118379263;
            var12.method3540(var3 + Class79.aPlayer_909.xMovementSteps[0], var13 + Class79.aPlayer_909.yMovementSteps[0], var8 == 1, (byte)-66);
         }

         client.bitBuffer.startBitAccess((byte) 123);
         Class116_Sub23_Sub2.decodeNpcAdditions(-1361601743);

         for(var2 = 0; var2 < client.anInt3055 * 1457329839; ++var2) {
            var5 = client.anIntArray3060[var2];
            if(client.aMobArray2972[var5].anInt2626 * -494855465 != -1040073859 * client.anInt2943) {
               client.aMobArray2972[var5].definition = null;
               client.aMobArray2972[var5] = null;
            }
         }

         if(371800591 * client.anInt2980 != 314639891 * client.bitBuffer.position) {
            throw new RuntimeException(314639891 * client.bitBuffer.position + Class41.aString538 + client.anInt2980 * 371800591);
         } else {
            for(var2 = 0; var2 < 727116725 * client.npcCount; ++var2) {
               if(null == client.aMobArray2972[client.npcIndicies[var2]]) {
                  throw new RuntimeException(var2 + Class41.aString538 + 727116725 * client.npcCount);
               }
            }

         }
      }
   }
}
