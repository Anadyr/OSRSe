package com.jagex;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public class Class69 {

   static int[][] anIntArrayArray837 = new int[128][128];
   static int[] anIntArray838 = new int[4096];
   static int anInt839;
   static int[][] anIntArrayArray841 = new int[128][128];
   static int[] anIntArray842 = new int[4096];


   public static String method984(CharSequence var0, byte var1) {
      int var2 = var0.length();
      StringBuilder var6 = new StringBuilder(var2);

      for(int var5 = 0; var5 < var2; ++var5) {
         char var3 = var0.charAt(var5);
         if((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && 46 != var3 && 45 != var3 && var3 != 42 && var3 != 95) {
            if(32 == var3) {
               var6.append('+');
            } else {
               byte var4 = Ignore.cipherChar(var3, -543467890);
               var6.append('%');
               int var7 = var4 >> 4 & 15;
               if(var7 >= 10) {
                  var6.append((char)(55 + var7));
               } else {
                  var6.append((char)(48 + var7));
               }

               var7 = var4 & 15;
               if(var7 >= 10) {
                  var6.append((char)(var7 + 55));
               } else {
                  var6.append((char)(var7 + 48));
               }
            }
         } else {
            var6.append(var3);
         }
      }

      return var6.toString();
   }

   public static final boolean method986(int var0) {
      KeyFocusListener var1 = KeyFocusListener.aClass82_962;
      synchronized(var1) {
         if(-103725771 * KeyFocusListener.anInt956 == KeyFocusListener.anInt958 * -831835767) {
            return false;
         } else {
            Class5.anInt57 = -1084221539 * KeyFocusListener.anIntArray953[-103725771 * KeyFocusListener.anInt956];
            Class2.aChar24 = KeyFocusListener.aCharArray952[-103725771 * KeyFocusListener.anInt956];
            KeyFocusListener.anInt956 = (1 + -103725771 * KeyFocusListener.anInt956 & 127) * 821077277;
            return true;
         }
      }
   }

   public static int method987(byte[] var0, int var1, int var2, int var3) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ Packet.crcTable[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   static final void processLogin(byte var0) {
      try {
         if(0 == client.loginStep * -1250195825) {
            if(Class38.streamBuffer != null) {
               Class38.streamBuffer.sync(1137710223);
               Class38.streamBuffer = null;
            }

            KeyFocusListener.gameSocket = null;
            client.aBool3052 = false;
            client.anInt3148 = 0;
            client.loginStep = 1066981487; //1
         }

         if(client.loginStep * -1250195825 == 1) {
            if(null == KeyFocusListener.gameSocket) {
               KeyFocusListener.gameSocket = ISAAC.signLink.socket(World.aString386, Class29.anInt404 * 2028673991, (byte) 1);
            }

            if(2 == KeyFocusListener.gameSocket.anInt866) {
               throw new IOException();
            }

            if(KeyFocusListener.gameSocket.anInt866 == 1) {
               Class38.streamBuffer = new RSInputStream((Socket)KeyFocusListener.gameSocket.anObject869, ISAAC.signLink);
               KeyFocusListener.gameSocket = null;
               client.loginStep = 2133962974; //2
            }
         }

          System.out.println(-1250195825 * client.loginStep +"/"+ -1250195825+"/"+client.loginStep);
         if(2 == -1250195825 * client.loginStep) {
            client.rsaBuffer.position = 0;
            client.rsaBuffer.writeByte(14, -893105279);
            Class38.streamBuffer.flush(client.rsaBuffer.payload, 0, 1, -698540305);
            client.packetBuffer.position = 0;
            client.loginStep = -1094022835; //3
         }

         int response;
         if(3 == client.loginStep * -1250195825) {
            if(Class116_Sub23_Sub20.aClass9_2510 != null) {
               Class116_Sub23_Sub20.aClass9_2510.method163((byte) 24);
            }

            if(Class35.aClass9_475 != null) {
               Class35.aClass9_475.method163((byte)24);
            }

            response = Class38.streamBuffer.readByte(-1664441415);
            if(Class116_Sub23_Sub20.aClass9_2510 != null) {
               Class116_Sub23_Sub20.aClass9_2510.method163((byte)24);
            }

            if(Class35.aClass9_475 != null) {
               Class35.aClass9_475.method163((byte)24);
            }

            if(response != 0) {
               ObjectDefinition.method2434(response, (byte) 1);
               return;
            }

            client.packetBuffer.position = 0;
            client.loginStep = 1039940139; //5
         }

         int varStart;
         int xteaStart;
         if(client.loginStep * -1250195825 == 5) {
            int[] xteaKeys = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D)};
            client.rsaBuffer.position = 0;
            client.rsaBuffer.writeByte(1, -386086812);
             int rsaOk = Class6.aClass105_67.getDrawId(-1757328916);
            client.rsaBuffer.writeByte(rsaOk, -562881099);
            client.rsaBuffer.writeInt(xteaKeys[0], (byte)7);
            client.rsaBuffer.writeInt(xteaKeys[1], (byte)28);
            client.rsaBuffer.writeInt(xteaKeys[2], (byte)29);
            client.rsaBuffer.writeInt(xteaKeys[3], (byte)14);
            switch(Class6.aClass105_67.anInt1438 * -1271929127) {
            case 0:
               client.rsaBuffer.position += -1473404712;
               break;
            case 1:
                int lolwtf = ((Integer)Class116_Sub5.aClass29_1727.aLinkedHashMap406.get(Integer.valueOf(Class103.method1450(Class6.username, 52007586)))).intValue();
               client.rsaBuffer.writeInt(lolwtf, (byte) 81);
               client.rsaBuffer.position += -736702356;
               break;
            case 2:
            case 3:
               client.rsaBuffer.writeMedium(-898452655 * Class132.anInt1597, (byte)100);
               client.rsaBuffer.position += -920877945;
            }

            client.rsaBuffer.writeJGString(Class6.password, -789001321);
            client.rsaBuffer.applyRSA(Class49.aBigInteger658, Class49.aBigInteger659, (byte) 17);
            client.loginBuffer.position = 0;
            if(40 == client.loginStage * 846055547) {
               client.loginBuffer.writeByte(18, 638898548);
            } else {
               client.loginBuffer.writeByte(16, -154860179);
            }

            client.loginBuffer.writeShort(0, -2042361762);
            varStart = client.loginBuffer.position * 314639891;
            client.loginBuffer.writeInt(103, (byte)31);
            client.loginBuffer.method2110(client.rsaBuffer.payload, 0, 314639891 * client.rsaBuffer.position, 512611054);
            xteaStart = 314639891 * client.loginBuffer.position;
            client.loginBuffer.writeJGString(Class6.username, 1727298914);
             int resized = (client.aBool3140?1:0) << 1 | (client.aBool2937?1:0);
             System.out.println("Invisible setting=" + (client.aBool2937 ? 1 : 0) + ", display=" + (client.aBool3140 ? 1 : 0));
            client.loginBuffer.writeByte(resized, -419937067);
            client.loginBuffer.writeShort(-452716157 * Class42.clientWidth, -2129169067);
            client.loginBuffer.writeShort(Class116_Sub16.clientHeight * 674167779, -2143407622);
            PacketBuilder var4 = client.loginBuffer;
            byte[] randomData = new byte[24];

            int var6;
            try {
               Class86.aClass140_1010.method1771(0L);
               Class86.aClass140_1010.method1765(randomData, -647014115);

               for(var6 = 0; var6 < 24 && 0 == randomData[var6]; ++var6) {
                  ;
               }

               if(var6 >= 24) {
                  throw new IOException();
               }
            } catch (Exception var10) {
               for(int var7 = 0; var7 < 24; ++var7) {
                  randomData[var7] = -1;
               }
            }

            var4.method2110(randomData, 0, 24, 512611054);
            client.loginBuffer.writeJGString(client.aString2940, 319380170);
            client.loginBuffer.writeInt(-1929163163 * GameInterface.anInt1816, (byte)88);
            Packet var20 = new Packet(Class116_Sub23_Sub2.aClass116_Sub17_2186.method2307((byte)-77));
            Class116_Sub23_Sub2.aClass116_Sub17_2186.method2306(var20, 3600000);
            client.loginBuffer.method2110(var20.payload, 0, var20.payload.length, 512611054);
             int okLoginBuff1 = Class36.anInt488 * -1296445677;
            client.loginBuffer.writeByte(okLoginBuff1, 625626371);

            client.loginBuffer.writeInt(Class42.aCacheIndex_574.anInt1383 * 1153748675, (byte)117);
            client.loginBuffer.writeInt(client.aCacheIndex_2955.anInt1383 * 1153748675, (byte)75);
            client.loginBuffer.writeInt(1153748675 * client.aCacheIndex_3054.anInt1383, (byte)75);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub18.aCacheIndex_2484.anInt1383, (byte)54);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub13.aCacheIndex_2424.anInt1383, (byte)78);
            client.loginBuffer.writeInt(Class59_Sub1.mapFileIndex.anInt1383 * 1153748675, (byte)73);
            client.loginBuffer.writeInt(1153748675 * Class2.aCacheIndex_23.anInt1383, (byte)86);
            client.loginBuffer.writeInt(1153748675 * Class3.aCacheIndex_42.anInt1383, (byte)9);
            client.loginBuffer.writeInt(Class116_Sub5.spriteIndex.anInt1383 * 1153748675, (byte)117);
            client.loginBuffer.writeInt(1153748675 * Class1.aCacheIndex_6.anInt1383, (byte)73);
            client.loginBuffer.writeInt(Class49.aCacheIndex_663.anInt1383 * 1153748675, (byte)13);
            client.loginBuffer.writeInt(Class108.aCacheIndex_1471.anInt1383 * 1153748675, (byte)113);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub6.aCacheIndex_2279.anInt1383, (byte)85);
            client.loginBuffer.writeInt(Class2.aCacheIndex_12.anInt1383 * 1153748675, (byte)20);
            client.loginBuffer.writeInt(1153748675 * Class32.aCacheIndex_446.anInt1383, (byte)125);
            client.loginBuffer.writeInt(1153748675 * Class70.aCacheIndex_847.anInt1383, (byte)127);
            client.loginBuffer.method2022(xteaKeys, xteaStart, 314639891 * client.loginBuffer.position, -1958841326);
            client.loginBuffer.method2000(client.loginBuffer.position * 314639891 - varStart, (byte)76);
            Class38.streamBuffer.flush(client.loginBuffer.payload, 0, client.loginBuffer.position * 314639891, -1906339171);
            client.rsaBuffer.applyIsaac(xteaKeys);

             System.out.println(resized+"/"+-1929163163 * GameInterface.anInt1816);
            for(var6 = 0; var6 < 4; ++var6) {
               xteaKeys[var6] += 50;
            }

            client.packetBuffer.applyIsaac(xteaKeys);
            client.loginStep = 2106921626; //6
         }

         if(-1250195825 * client.loginStep == 6 && Class38.streamBuffer.readableBytes((byte) -38) > 0) {
            response = Class38.streamBuffer.readByte(-1294760630);
            if(21 == response && client.loginStage * 846055547 == 20) {
               client.loginStep = -1121064183; //7
            } else if(2 == response) {
               client.loginStep = 1012898791; //9
            } else if(response == 15 && 40 == client.loginStage * 846055547) {
               client.packetLength = -260863215;
               client.loginStep = 985857443; //13
            } else if(response == 23 && client.anInt2978 * 288795893 < 1) {
               client.anInt2978 += -260333731;
               client.loginStep = 0;
            } else {
               if(response != 29) {
                  ObjectDefinition.method2434(response, (byte) 1);
                  return;
               }

               client.loginStep = -1148105531; //11
            }
         }

         if(7 == client.loginStep * -1250195825 && Class38.streamBuffer.readableBytes((byte) -44) > 0) {
            client.anInt2971 = (Class38.streamBuffer.readByte(426620349) + 3) * -1985668988;
            client.loginStep = -54082696; //8
         }

         if(client.loginStep * -1250195825 == 8) {
            client.anInt3148 = 0;
            Class7.method110(Class91.aString1083, Class91.aString1084, client.anInt2971 * -119005137 / 60 + Class91.aString1282, 1935975903);
            if((client.anInt2971 -= -534174001) * -119005137 <= 0) {
               client.loginStep = 0;
            }

         } else {
            if(-1250195825 * client.loginStep == 9 && Class38.streamBuffer.readableBytes((byte) 32) >= 13) {
               boolean authent = Class38.streamBuffer.readByte(-1774496701) == 1;
                System.out.println(authent);
               Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, 4, 615894679);
               client.packetBuffer.position = 0;
               if(authent) {
                  varStart = client.packetBuffer.method2955((byte)53) << 24;
                  varStart |= client.packetBuffer.method2955((byte)69) << 16;
                  varStart |= client.packetBuffer.method2955((byte)44) << 8;
                  varStart |= client.packetBuffer.method2955((byte)75);
                  xteaStart = Class103.method1450(Class6.username, -2034306732);
                  if(Class116_Sub5.aClass29_1727.aLinkedHashMap406.size() >= 10 && !Class116_Sub5.aClass29_1727.aLinkedHashMap406.containsKey(Integer.valueOf(xteaStart))) {
                     Iterator var18 = Class116_Sub5.aClass29_1727.aLinkedHashMap406.entrySet().iterator();
                     var18.next();
                     var18.remove();
                  }
                  Class116_Sub5.aClass29_1727.aLinkedHashMap406.put(Integer.valueOf(xteaStart), Integer.valueOf(varStart));
                  Class86.method1167((byte)-35);
               }

                int rights, i2, index, index2, i3;
                rights = Class38.streamBuffer.readByte(-1493228653);
                i2 = Class38.streamBuffer.readByte(172572472);
                index = Class38.streamBuffer.readByte(-265383719);
                index2 = Class38.streamBuffer.readByte(414408423);
                i3 = Class38.streamBuffer.readByte(246657997);

               client.playerRights = rights * -753281333;
               client.aBool3147 = i2 == 1;
               client.playerIndex = index * -313169887;
               client.playerIndex = -313169887 * (client.playerIndex * 1467227105 << 8);
               client.playerIndex += index2 * -313169887;

               System.out.println("rights="+rights+", playerindex="+client.playerIndex * 1467227105+"["+i2+","+ index+","+index2+","+ i3+"]");

               client.membership = i3 * 1163065535;
               Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, 1, 615894679);
               client.packetBuffer.position = 0;
               client.currentOpcode = client.packetBuffer.method2955((byte)66);

               System.out.println(793368497 * client.currentOpcode+", should be 239");
               Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, 2, 615894679);
               client.packetBuffer.position = 0;
               client.packetLength = client.packetBuffer.readUnsignedShort(1931864570) * 260863215;
               client clientRef;
               if(1 == -905152705 * client.membership) {
                  try {
                     clientRef = client.aclient2930;
                     JSObject.getWindow(clientRef).call("zap", (Object[])null);
                  } catch (Throwable var9) {
                     ;
                  }
               } else {
                  try {
                     clientRef = client.aclient2930;
                     JSObject.getWindow(clientRef).call("unzap", (Object[])null);
                  } catch (Throwable var8) {
                     ;
                  }
               }

               client.loginStep = 2079880278;
            }

            if(10 == client.loginStep * -1250195825) {
               if(Class38.streamBuffer.readableBytes((byte) 61) >= client.packetLength * 371800591) {
                  client.packetBuffer.position = 0;

                  Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, client.packetLength * 371800591, 615894679);
                  BuildType.method1175(-1633279152);
                  Class116_Sub10.readPlayerHashLocations(client.packetBuffer, 443584860);
                  Class22.anInt276 = -1071803165;
                  Class8.decodeMapRegion(false, (byte)41);
                  client.currentOpcode = -1;
               }

            } else {
               if(-1250195825 * client.loginStep == 11 && Class38.streamBuffer.readableBytes((byte) 45) >= 2) {
                  client.packetBuffer.position = 0;
                  Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, 2, 615894679);
                  client.packetBuffer.position = 0;
                   int i = client.packetBuffer.readUnsignedShort(1291579526);
                  Class38.anInt511 =  i* 542937605;
                   System.out.println("short after map");

                  client.loginStep = -81124044;
               }

               if(12 == -1250195825 * client.loginStep && Class38.streamBuffer.readableBytes((byte) 14) >= Class38.anInt511 * 1528130253) {
                  client.packetBuffer.position = 0;
                  Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, Class38.anInt511 * 1528130253, 615894679);
                  client.packetBuffer.position = 0;
                  String var15 = client.packetBuffer.readString(61376769);
                  String var17 = client.packetBuffer.readString(61376769);
                  String var19 = client.packetBuffer.readString(61376769);

                   System.out.println("3 bytes after map/short "+var15+", "+var17+", "+var19);
                  Class7.method110(var15, var17, var19, 1935975903);
                  Class116_Sub12.method1983(10, (byte)60);
               }

               if(-1250195825 * client.loginStep == 13) {
                  if(-1 == 371800591 * client.packetLength) {
                     if(Class38.streamBuffer.readableBytes((byte) -6) < 2) {
                        return;
                     }

                     Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, 2, 615894679);
                     client.packetBuffer.position = 0;
                      int i = client.packetBuffer.readUnsignedShort(2140060891);
                     client.packetLength =  i* 260863215;
                      System.out.println("short after map/short/strings "+i);
                  }

                  if(Class38.streamBuffer.readableBytes((byte) -16) >= 371800591 * client.packetLength) {
                     Class38.streamBuffer.readBytes(client.packetBuffer.payload, 0, client.packetLength * 371800591, 615894679);
                     client.packetBuffer.position = 0;
                     response = 371800591 * client.packetLength;
                     Class45.method715(-1867435103);
                     Class116_Sub10.readPlayerHashLocations(client.packetBuffer, 209548896);

                      System.out.println("reading player hashLocations after map???");
                     if(response != client.packetBuffer.position * 314639891) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  client.anInt3148 += 995944239;
                  if(client.anInt3148 * 766230479 > 2000) {
                     if(288795893 * client.anInt2978 < 1) {
                        if(Class29.anInt404 * 2028673991 == Class94.port * 809635993) {
                           Class29.anInt404 = 715804305 * Class51.anInt682;
                        } else {
                           Class29.anInt404 = Class94.port * 1439019167;
                        }

                        client.anInt2978 += -260333731;
                        client.loginStep = 0;
                     } else {
                        ObjectDefinition.method2434(-3, (byte) 1);
                     }
                  }
               }
            }
         }
      } catch (IOException var11) {
         if(288795893 * client.anInt2978 < 1) {
            if(2028673991 * Class29.anInt404 == 809635993 * Class94.port) {
               Class29.anInt404 = 715804305 * Class51.anInt682;
            } else {
               Class29.anInt404 = 1439019167 * Class94.port;
            }

            client.anInt2978 += -260333731;
            client.loginStep = 0;
         } else {
            ObjectDefinition.method2434(-2, (byte) 1);
         }
      }
   }

   public static boolean method990(int var0, byte var1) {
      return 0 != (var0 >> 29 & 1);
   }

   Class69() throws Throwable {
      throw new Error();
   }

}
