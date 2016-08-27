package com.jagex;

public final class Class22 {

   int anInt269;
   static RSInterface aClass116_Sub15_270;
   int anInt271;
   public Animable anAnimable;
   public int anInt273;
   int anInt274;
   int anInt275;
   static int anInt276;
   static int[] anIntArray280;


   static final void method342(int var0, int var1, int var2, int var3, int var4) {
      if(0 == -1110581093 * client.anInt2991 && !client.aBool3088) {
         RelationList.method776(Class91.aString1202, "", 23, 0, var0 - var2, var1 - var3, (byte) -57);
      }

      int var6 = -1;
      int var5 = -1;

      int var8;
      int var9;
      for(var8 = 0; var8 < SpotAnim.anInt2839; ++var8) {
         var9 = SpotAnim.anIntArray2822[var8];
         int var10 = var9 & 127;
         int var11 = var9 >> 7 & 127;
         int var17 = var9 >> 29 & 3;
         int var18 = var9 >> 14 & 32767;
         if(var9 != var5) {
            var5 = var9;
            if(var17 == 2 && GameInterface.region.getTileContentsType(-747958745 * GameInterface.anInt1819, var10, var11, var9) >= 0) {
               ObjectDefinition var12 = Class45.method700(var18, 359750046);
               if(null != var12.childIds) {
                  var12 = var12.method2419(-1617474286);
               }

               if(var12 == null) {
                  continue;
               }

               if(-1110581093 * client.anInt2991 == 1) {
                  RelationList.method776(Class91.aString1197, client.aString3201 + " " + Class41.aString542 + " " + Class59_Sub1.method1978('\uffff', (byte) 95) + var12.objectName, 1, var9, var10, var11, (byte) -73);
               } else if(client.aBool3088) {
                  if((Class38.anInt500 * 2016481409 & 4) == 4) {
                     RelationList.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + Class59_Sub1.method1978('\uffff', (byte) 125) + var12.objectName, 2, var9, var10, var11, (byte) -90);
                  }
               } else {
                  String[] var13 = var12.actions;
                  if(client.aBool3104) {
                     var13 = Canvas_Sub1.method2978(var13, -2042062121);
                  }

                  if(null != var13) {
                     for(int var7 = 4; var7 >= 0; --var7) {
                        if(null != var13[var7]) {
                           short var14 = 0;
                           if(0 == var7) {
                              var14 = 3;
                           }

                           if(1 == var7) {
                              var14 = 4;
                           }

                           if(var7 == 2) {
                              var14 = 5;
                           }

                           if(3 == var7) {
                              var14 = 6;
                           }

                           if(4 == var7) {
                              var14 = 1001;
                           }

                           RelationList.method776(var13[var7], Class59_Sub1.method1978('\uffff', (byte) 95) + var12.objectName, var14, var9, var10, var11, (byte) -46);
                        }
                     }
                  }

                  RelationList.method776(Class91.aString1198, Class59_Sub1.method1978('\uffff', (byte) 37) + var12.objectName, 1002, var12.anInt2239 * -521826339 << 14, var10, var11, (byte) -59);
               }
            }

            Player var16;
            Mob var19;
            int[] var20;
            int var26;
            int var28;
            if(var17 == 1) {
               Mob var23 = client.aMobArray2972[var18];
               if(null == var23) {
                  continue;
               }

               if(1 == var23.definition.tileSize * -691506967 && (var23.anInt2609 * 1272643751 & 127) == 64 && 64 == (-1801433343 * var23.anInt2579 & 127)) {
                  for(var26 = 0; var26 < client.npcCount * 727116725; ++var26) {
                     var19 = client.aMobArray2972[client.npcIndicies[var26]];
                     if(var19 != null && var19 != var23 && -691506967 * var19.definition.tileSize == 1 && 1272643751 * var23.anInt2609 == 1272643751 * var19.anInt2609 && var19.anInt2579 * -1801433343 == -1801433343 * var23.anInt2579) {
                        Class47.method766(var19.definition, client.npcIndicies[var26], var10, var11, (byte)-39);
                     }
                  }

                  var26 = Class7.anInt107 * -334270159;
                  var20 = Class7.anIntArray108;

                  for(var28 = 0; var28 < var26; ++var28) {
                     var16 = client.globalPlayers[var20[var28]];
                     if(null != var16 && var23.anInt2609 * 1272643751 == var16.anInt2609 * 1272643751 && var23.anInt2579 * -1801433343 == var16.anInt2579 * -1801433343) {
                        AbstractRSDrawing.method328(var16, var20[var28], var10, var11, 574819164);
                     }
                  }
               }

               Class47.method766(var23.definition, var18, var10, var11, (byte)-39);
            }

            if(var17 == 0) {
               Player var24 = client.globalPlayers[var18];
               if(var24 == null) {
                  continue;
               }

               if((1272643751 * var24.anInt2609 & 127) == 64 && (var24.anInt2579 * -1801433343 & 127) == 64) {
                  for(var26 = 0; var26 < 727116725 * client.npcCount; ++var26) {
                     var19 = client.aMobArray2972[client.npcIndicies[var26]];
                     if(var19 != null && 1 == -691506967 * var19.definition.tileSize && var24.anInt2609 * 1272643751 == var19.anInt2609 * 1272643751 && var24.anInt2579 * -1801433343 == -1801433343 * var19.anInt2579) {
                        Class47.method766(var19.definition, client.npcIndicies[var26], var10, var11, (byte)-109);
                     }
                  }

                  var26 = Class7.anInt107 * -334270159;
                  var20 = Class7.anIntArray108;

                  for(var28 = 0; var28 < var26; ++var28) {
                     var16 = client.globalPlayers[var20[var28]];
                     if(var16 != null && var24 != var16 && 1272643751 * var16.anInt2609 == 1272643751 * var24.anInt2609 && -1801433343 * var16.anInt2579 == var24.anInt2579 * -1801433343) {
                        AbstractRSDrawing.method328(var16, var20[var28], var10, var11, 761239215);
                     }
                  }
               }

               if(var18 != client.anInt3065 * 971766913) {
                  AbstractRSDrawing.method328(var24, var18, var10, var11, 829763511);
               } else {
                  var6 = var9;
               }
            }

            if(3 == var17) {
               Deque var25 = client.aClass117ArrayArrayArray3071[-747958745 * GameInterface.anInt1819][var10][var11];
               if(var25 != null) {
                  for(Class116_Sub23_Sub16_Sub3 var27 = (Class116_Sub23_Sub16_Sub3)var25.getLast(); var27 != null; var27 = (Class116_Sub23_Sub16_Sub3)var25.getPrevious()) {
                     Class116_Sub23_Sub11 var21 = RelationList.method778(var27.anInt2646 * -848428919, (byte) 70);
                     if(1 == client.anInt2991 * -1110581093) {
                        RelationList.method776(Class91.aString1197, client.aString3201 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16748608, (byte) 113) + var21.aString2361, 16, -848428919 * var27.anInt2646, var10, var11, (byte) -82);
                     } else if(client.aBool3088) {
                        if((Class38.anInt500 * 2016481409 & 1) == 1) {
                           RelationList.method776(client.aString3192, client.aString2969 + " " + Class41.aString542 + " " + Class59_Sub1.method1978(16748608, (byte) 58) + var21.aString2361, 17, var27.anInt2646 * -848428919, var10, var11, (byte) -48);
                        }
                     } else {
                        String[] var30 = var21.aStringArray2391;
                        if(client.aBool3104) {
                           var30 = Canvas_Sub1.method2978(var30, -1719853996);
                        }

                        for(int var29 = 4; var29 >= 0; --var29) {
                           if(var30 != null && var30[var29] != null) {
                              byte var15 = 0;
                              if(0 == var29) {
                                 var15 = 18;
                              }

                              if(var29 == 1) {
                                 var15 = 19;
                              }

                              if(var29 == 2) {
                                 var15 = 20;
                              }

                              if(3 == var29) {
                                 var15 = 21;
                              }

                              if(4 == var29) {
                                 var15 = 22;
                              }

                              RelationList.method776(var30[var29], Class59_Sub1.method1978(16748608, (byte) 26) + var21.aString2361, var15, -848428919 * var27.anInt2646, var10, var11, (byte) -110);
                           } else if(var29 == 2) {
                              RelationList.method776(Class91.aString1288, Class59_Sub1.method1978(16748608, (byte) 14) + var21.aString2361, 20, -848428919 * var27.anInt2646, var10, var11, (byte) -25);
                           }
                        }

                        RelationList.method776(Class91.aString1198, Class59_Sub1.method1978(16748608, (byte) 102) + var21.aString2361, 1004, var27.anInt2646 * -848428919, var10, var11, (byte) -110);
                     }
                  }
               }
            }
         }
      }

      if(-1 != var6) {
         var8 = var6 & 127;
         var9 = var6 >> 7 & 127;
         Player var22 = client.globalPlayers[971766913 * client.anInt3065];
         AbstractRSDrawing.method328(var22, client.anInt3065 * 971766913, var8, var9, 1063597032);
      }

   }

   static final void method343(RSInterface var0, int var1) {
      int var2 = -179718399 * var0.clientCode;
      if(324 == var2) {
         if(client.anInt3209 * 986088359 == -1) {
            client.anInt3209 = var0.disabledSprite * -302180863;
            client.anInt3023 = -953380781 * var0.enabledSprite;
         }

         if(client.aClass108_3103.aBool1464) {
            var0.disabledSprite = -135861759 * client.anInt3209;
         } else {
            var0.disabledSprite = client.anInt3023 * 1903638949;
         }

      } else if(325 != var2) {
         if(var2 == 327) {
            var0.rotateX = -532702102;
            var0.rotateY = ((int)(Math.sin((double)(-1040073859 * client.anInt2943) / 40.0D) * 256.0D) & 2047) * -478470667;
            var0.modelTypeDisabled = -1882303535;
            var0.mediaIdDisabled = 0;
         } else if(328 == var2) {
            var0.rotateX = -532702102;
            var0.rotateY = ((int)(Math.sin((double)(client.anInt2943 * -1040073859) / 40.0D) * 256.0D) & 2047) * -478470667;
            var0.modelTypeDisabled = -1882303535;
            var0.mediaIdDisabled = -541123263;
         }
      } else {
         if(client.anInt3209 * 986088359 == -1) {
            client.anInt3209 = var0.disabledSprite * -302180863;
            client.anInt3023 = var0.enabledSprite * -953380781;
         }

         if(client.aClass108_3103.aBool1464) {
            var0.disabledSprite = client.anInt3023 * 1903638949;
         } else {
            var0.disabledSprite = client.anInt3209 * -135861759;
         }

      }
   }

   public static int calculateJGString(String var0, int var1) {
      return var0.length() + 1;
   }

}
