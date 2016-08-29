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
               byte var4 = Class24.method529(var3, -543467890);
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
         var4 = var4 >>> 8 ^ Buffer.crcTable[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   static final void processLogin(byte var0) {
      try {
         if(0 == client.anInt3182 * -1250195825) {
            if(Class38.bufferIn != null) {
               Class38.bufferIn.method1001(1137710223);
               Class38.bufferIn = null;
            }

            KeyFocusListener.aClass72_933 = null;
            client.aBool3052 = false;
            client.anInt3148 = 0;
            client.anInt3182 = 1066981487;
         }

         if(client.anInt3182 * -1250195825 == 1) {
            if(null == KeyFocusListener.aClass72_933) {
               KeyFocusListener.aClass72_933 = ISAAC.aClass74_705.method1054(Class27.aString386, Class29.anInt404 * 2028673991, (byte)1);
            }

            if(2 == KeyFocusListener.aClass72_933.anInt866) {
               throw new IOException();
            }

            if(KeyFocusListener.aClass72_933.anInt866 == 1) {
               Class38.bufferIn = new Class71((Socket)KeyFocusListener.aClass72_933.anObject869, ISAAC.aClass74_705);
               KeyFocusListener.aClass72_933 = null;
               client.anInt3182 = 2133962974;
            }
         }

         if(2 == -1250195825 * client.anInt3182) {
            client.rsaBuffer.position = 0;
            client.rsaBuffer.writeByte(14, -893105279);
            Class38.bufferIn.method1006(client.rsaBuffer.payload, 0, 1, -698540305);
            client.bitBuffer.position = 0;
            client.anInt3182 = -1094022835;
         }

         int var1;
         if(3 == client.anInt3182 * -1250195825) {
            if(Class116_Sub23_Sub20.aClass9_2510 != null) {
               Class116_Sub23_Sub20.aClass9_2510.method163((byte)24);
            }

            if(Class35.aClass9_475 != null) {
               Class35.aClass9_475.method163((byte)24);
            }

            var1 = Class38.bufferIn.readByte(-1664441415);
            if(Class116_Sub23_Sub20.aClass9_2510 != null) {
               Class116_Sub23_Sub20.aClass9_2510.method163((byte)24);
            }

            if(Class35.aClass9_475 != null) {
               Class35.aClass9_475.method163((byte)24);
            }

            if(var1 != 0) {
               ObjectDefinition.method2434(var1, (byte) 1);
               return;
            }

            client.bitBuffer.position = 0;
            client.anInt3182 = 1039940139;
         }

         int varStart;
         int xteaStart;
         if(client.anInt3182 * -1250195825 == 5) {
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
            BitBuffer var4 = client.loginBuffer;
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
            client.loginBuffer.writeInt(-1929163163 * Class116_Sub11.anInt1816, (byte)88);
            Buffer var20 = new Buffer(Class116_Sub23_Sub2.aClass116_Sub17_2186.method2307((byte)-77));
            Class116_Sub23_Sub2.aClass116_Sub17_2186.method2306(var20, 3600000);
            client.loginBuffer.method2110(var20.payload, 0, var20.payload.length, 512611054);
             int okLoginBuff1 = Class36.anInt488 * -1296445677;
            client.loginBuffer.writeByte(okLoginBuff1, 625626371);

            client.loginBuffer.writeInt(Class42.aClass99_Sub1_574.anInt1383 * 1153748675, (byte)117);
            client.loginBuffer.writeInt(client.aClass99_Sub1_2955.anInt1383 * 1153748675, (byte)75);
            client.loginBuffer.writeInt(1153748675 * client.aClass99_Sub1_3054.anInt1383, (byte)75);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub18.aClass99_Sub1_2484.anInt1383, (byte)54);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub13.aClass99_Sub1_2424.anInt1383, (byte)78);
            client.loginBuffer.writeInt(Class59_Sub1.aClass99_Sub1_1828.anInt1383 * 1153748675, (byte)73);
            client.loginBuffer.writeInt(1153748675 * Class2.aClass99_Sub1_23.anInt1383, (byte)86);
            client.loginBuffer.writeInt(1153748675 * Class3.aClass99_Sub1_42.anInt1383, (byte)9);
            client.loginBuffer.writeInt(Class116_Sub5.aClass99_Sub1_1729.anInt1383 * 1153748675, (byte)117);
            client.loginBuffer.writeInt(1153748675 * Class1.aClass99_Sub1_6.anInt1383, (byte)73);
            client.loginBuffer.writeInt(Class49.aClass99_Sub1_663.anInt1383 * 1153748675, (byte)13);
            client.loginBuffer.writeInt(Class108.aClass99_Sub1_1471.anInt1383 * 1153748675, (byte)113);
            client.loginBuffer.writeInt(1153748675 * Class116_Sub23_Sub6.aClass99_Sub1_2279.anInt1383, (byte)85);
            client.loginBuffer.writeInt(Class2.aClass99_Sub1_12.anInt1383 * 1153748675, (byte)20);
            client.loginBuffer.writeInt(1153748675 * Class32.aClass99_Sub1_446.anInt1383, (byte)125);
            client.loginBuffer.writeInt(1153748675 * Class70.aClass99_Sub1_847.anInt1383, (byte)127);
            client.loginBuffer.method2022(xteaKeys, xteaStart, 314639891 * client.loginBuffer.position, -1958841326);
            client.loginBuffer.method2000(client.loginBuffer.position * 314639891 - varStart, (byte)76);
            Class38.bufferIn.method1006(client.loginBuffer.payload, 0, client.loginBuffer.position * 314639891, -1906339171);
            client.rsaBuffer.applyIsaac(xteaKeys);

             System.out.println(resized+"/"+-1929163163 * Class116_Sub11.anInt1816);
            for(var6 = 0; var6 < 4; ++var6) {
               xteaKeys[var6] += 50;
            }

            client.bitBuffer.applyIsaac(xteaKeys);
            client.anInt3182 = 2106921626;
         }

         if(-1250195825 * client.anInt3182 == 6 && Class38.bufferIn.method1004((byte)-38) > 0) {
            var1 = Class38.bufferIn.readByte(-1294760630);
            if(21 == var1 && client.loginStage * 846055547 == 20) {
               client.anInt3182 = -1121064183;
            } else if(2 == var1) {
               client.anInt3182 = 1012898791;
            } else if(var1 == 15 && 40 == client.loginStage * 846055547) {
               client.anInt2980 = -260863215;
               client.anInt3182 = 985857443;
            } else if(var1 == 23 && client.anInt2978 * 288795893 < 1) {
               client.anInt2978 += -260333731;
               client.anInt3182 = 0;
            } else {
               if(var1 != 29) {
                  ObjectDefinition.method2434(var1, (byte) 1);
                  return;
               }

               client.anInt3182 = -1148105531;
            }
         }

         if(7 == client.anInt3182 * -1250195825 && Class38.bufferIn.method1004((byte)-44) > 0) {
            client.anInt2971 = (Class38.bufferIn.readByte(426620349) + 3) * -1985668988;
            client.anInt3182 = -54082696;
         }

         if(client.anInt3182 * -1250195825 == 8) {
            client.anInt3148 = 0;
            Class7.method110(Class91.aString1083, Class91.aString1084, client.anInt2971 * -119005137 / 60 + Class91.aString1282, 1935975903);
            if((client.anInt2971 -= -534174001) * -119005137 <= 0) {
               client.anInt3182 = 0;
            }

         } else {
            if(-1250195825 * client.anInt3182 == 9 && Class38.bufferIn.method1004((byte)32) >= 13) {
               boolean authent = Class38.bufferIn.readByte(-1774496701) == 1;
                System.out.println(authent);
               Class38.bufferIn.method1005(client.bitBuffer.payload, 0, 4, 615894679);
               client.bitBuffer.position = 0;
               boolean var14 = false;
               if(authent) {
                  varStart = client.bitBuffer.method2955((byte)53) << 24;
                  varStart |= client.bitBuffer.method2955((byte)69) << 16;
                  varStart |= client.bitBuffer.method2955((byte)44) << 8;
                  varStart |= client.bitBuffer.method2955((byte)75);
                  xteaStart = Class103.method1450(Class6.username, -2034306732);
                  if(Class116_Sub5.aClass29_1727.aLinkedHashMap406.size() >= 10 && !Class116_Sub5.aClass29_1727.aLinkedHashMap406.containsKey(Integer.valueOf(xteaStart))) {
                     Iterator var18 = Class116_Sub5.aClass29_1727.aLinkedHashMap406.entrySet().iterator();
                     var18.next();
                     var18.remove();
                  }

                  Class116_Sub5.aClass29_1727.aLinkedHashMap406.put(Integer.valueOf(xteaStart), Integer.valueOf(varStart));
                  Class86.method1167((byte)-35);
               }

                int rights, i2, index, index2, i5, i6, i7;
                rights = Class38.bufferIn.readByte(-1493228653);
                i2 = Class38.bufferIn.readByte(172572472);
                index = Class38.bufferIn.readByte(-265383719);
                index2 = Class38.bufferIn.readByte(414408423);
                i5 = Class38.bufferIn.readByte(246657997);

               client.playerRights = rights * -753281333;
               client.aBool3147 = i2 == 1;
               client.playerIndex = index * -313169887;
               client.playerIndex = -313169887 * (client.playerIndex * 1467227105 << 8);
               client.playerIndex += index2 * -313169887;

                System.out.println("rights="+rights+", playerindex="+client.playerIndex * 1467227105+"["+i2+","+ index+","+index2+","+ i5+"]");
               // System.out.println(Arrays.toString(client.bitBuffer.payload));

               client.membership = i5 * 1163065535;
               Class38.bufferIn.method1005(client.bitBuffer.payload, 0, 1, 615894679);
               client.bitBuffer.position = 0;
               client.currentOpcode = client.bitBuffer.method2955((byte)66) * 726667601;

               // System.out.println(793368497 * client.currentOpcode+", should be 239");//+ authent+"/"+client.bitBuffer.method2955((byte)66)+"/"+ client.bitBuffer.method2955((byte)66));
               Class38.bufferIn.method1005(client.bitBuffer.payload, 0, 2, 615894679);
               client.bitBuffer.position = 0;
               client.anInt2980 = client.bitBuffer.readShort(1931864570) * 260863215;
               client var16;
               if(1 == -905152705 * client.membership) {
                  try {
                     var16 = client.aclient2930;
                     JSObject.getWindow(var16).call("zap", (Object[])null);
                  } catch (Throwable var9) {
                     ;
                  }
               } else {
                  try {
                     var16 = client.aclient2930;
                     JSObject.getWindow(var16).call("unzap", (Object[])null);
                  } catch (Throwable var8) {
                     ;
                  }
               }

               client.anInt3182 = 2079880278;
            }

            if(10 == client.anInt3182 * -1250195825) {
               if(Class38.bufferIn.method1004((byte)61) >= client.anInt2980 * 371800591) {
                  client.bitBuffer.position = 0;

                  Class38.bufferIn.method1005(client.bitBuffer.payload, 0, client.anInt2980 * 371800591, 615894679);
                  BuildType.method1175(-1633279152);
                   //System.out.println( client.anInt2980 * 371800591+"POSB4 BITS" + (314639891 * client.bitBuffer.position));
                   //System.out.println(Arrays.toString(client.bitBuffer.payload));
                  Class116_Sub10.readPlayerHashLocations(client.bitBuffer, 443584860);
                   //System.out.println("POSAFTER BITS" + (314639891 * client.bitBuffer.position));
                   //System.out.println(Arrays.toString(client.bitBuffer.payload));

                   //System.out.println(Arrays.toString(client.bitBuffer.payload));
                  Class22.anInt276 = -1071803165;
                  Class8.decodeMapRegion(false, (byte)41);
                  client.currentOpcode = -726667601;
               }

            } else {
               if(-1250195825 * client.anInt3182 == 11 && Class38.bufferIn.method1004((byte)45) >= 2) {
                  client.bitBuffer.position = 0;
                  Class38.bufferIn.method1005(client.bitBuffer.payload, 0, 2, 615894679);
                  client.bitBuffer.position = 0;
                   int i = client.bitBuffer.readShort(1291579526);
                  Class38.anInt511 =  i* 542937605;
                   System.out.println("short after map");

                  client.anInt3182 = -81124044;
               }

               if(12 == -1250195825 * client.anInt3182 && Class38.bufferIn.method1004((byte)14) >= Class38.anInt511 * 1528130253) {
                  client.bitBuffer.position = 0;
                  Class38.bufferIn.method1005(client.bitBuffer.payload, 0, Class38.anInt511 * 1528130253, 615894679);
                  client.bitBuffer.position = 0;
                  String var15 = client.bitBuffer.readString(61376769);
                  String var17 = client.bitBuffer.readString(61376769);
                  String var19 = client.bitBuffer.readString(61376769);

                   System.out.println("3 bytes after map/short "+var15+", "+var17+", "+var19);
                  Class7.method110(var15, var17, var19, 1935975903);
                  Class116_Sub12.method1983(10, (byte)60);
               }

               if(-1250195825 * client.anInt3182 == 13) {
                  if(-1 == 371800591 * client.anInt2980) {
                     if(Class38.bufferIn.method1004((byte)-6) < 2) {
                        return;
                     }

                     Class38.bufferIn.method1005(client.bitBuffer.payload, 0, 2, 615894679);
                     client.bitBuffer.position = 0;
                      int i = client.bitBuffer.readShort(2140060891);
                     client.anInt2980 =  i* 260863215;
                      System.out.println("short after map/short/strings "+i);
                  }

                  if(Class38.bufferIn.method1004((byte)-16) >= 371800591 * client.anInt2980) {
                     Class38.bufferIn.method1005(client.bitBuffer.payload, 0, client.anInt2980 * 371800591, 615894679);
                     client.bitBuffer.position = 0;
                     var1 = 371800591 * client.anInt2980;
                     Class45.method715(-1867435103);
                     Class116_Sub10.readPlayerHashLocations(client.bitBuffer, 209548896);

                      System.out.println("reading player hashLocations after map???");
                     if(var1 != client.bitBuffer.position * 314639891) {
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
                        client.anInt3182 = 0;
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
            client.anInt3182 = 0;
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
