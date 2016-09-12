package com.jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionNode extends Node {

   int anInt2147;
   int[] anIntArray2148;
   int[] anIntArray2149;
   Field[] aFieldArray2150;
   int[] anIntArray2151;
   Method[] aMethodArray2152;
   byte[][][] aByteArrayArrayArray2153;
   int anInt2154;


   static final void method2340(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      if(21 == var2) {
         client.anInt3043 = var6 * 300629671;
         client.anInt3044 = var7 * 91006015;
         client.anInt3046 = 922172934;
         client.anInt3045 = 0;
         client.anInt3168 = var0 * -1943900347;
         client.anInt3208 = 317027045 * var1;
         client.rsaBuffer.startPacket(107, (byte) 99);
         client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, -719835760);
         client.rsaBuffer.writeLEShortA(var1 + Class33.anInt456 * 714823515, 109615612);
         client.rsaBuffer.method2102(1426698711 * Class116_Sub17.anInt2105 + var0, -451570799);
         client.rsaBuffer.writeShort(var3, -1978140356);
      }

      if(23 == var2) {
         Class116_Sub11.groundItemController.method514(-747958745 * Class116_Sub11.anInt1819, var0, var1);
      }

      Class116_Sub15 var9;
      if(24 == var2) {
         var9 = Class107.method1466(var1, 314639891);
         boolean var10 = true;
         if(-179718399 * var9.anInt2016 > 0) {
            var10 = Class116_Sub23_Sub2.method2384(var9, 1000093932);
         }

         if(var10) {
            client.rsaBuffer.startPacket(80, (byte) 118);
            client.rsaBuffer.writeInt(var1, (byte)122);
         }
      }

      if(var2 == 43) {
         client.rsaBuffer.startPacket(120, (byte) 92);
         client.rsaBuffer.writeInt(var1, (byte)43);
         client.rsaBuffer.method2102(var3, 1471200376);
         client.rsaBuffer.writeShort(var0, -1881121516);
         client.anInt3047 = 0;
         Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
         client.anInt3048 = var0 * -1119534041;
      }

      if(34 == var2) {
         client.rsaBuffer.startPacket(115, (byte) 80);
         client.rsaBuffer.writeLEShortA(var0, -1983290574);
         client.rsaBuffer.writeLEShortA(var3, -128120499);
         client.rsaBuffer.method2087(var1, 1582012970);
         client.anInt3047 = 0;
         Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
         client.anInt3048 = var0 * -1119534041;
      }

      if(var2 == 42) {
         client.rsaBuffer.startPacket(212, (byte) 65);
         client.rsaBuffer.writeShort(var3, -1717128077);
         client.rsaBuffer.writeLEShort(var0, 1026860661);
         client.rsaBuffer.method2087(var1, 1078546451);
         client.anInt3047 = 0;
         Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
         client.anInt3048 = -1119534041 * var0;
      }

      if(1004 == var2) {
         client.anInt3043 = var6 * 300629671;
         client.anInt3044 = var7 * 91006015;
         client.anInt3046 = 922172934;
         client.anInt3045 = 0;
         client.rsaBuffer.startPacket(158, (byte) 29);
         client.rsaBuffer.writeLEShortA(var3, -1156579969);
      }

      if(var2 == 18) {
         client.anInt3043 = 300629671 * var6;
         client.anInt3044 = var7 * 91006015;
         client.anInt3046 = 922172934;
         client.anInt3045 = 0;
         client.anInt3168 = -1943900347 * var0;
         client.anInt3208 = 317027045 * var1;
         client.rsaBuffer.startPacket(51, (byte) 66);
         client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, 593965375);
         client.rsaBuffer.writeLEShortA(var0 + Class116_Sub17.anInt2105 * 1426698711, -1302573835);
         client.rsaBuffer.writeLEShortA(var3, -147695339);
         client.rsaBuffer.writeLEShortA(714823515 * Class33.anInt456 + var1, 499235163);
      }

      int var14;
      if(57 == var2 || 1007 == var2) {
         var9 = AbstractRSDrawing.method339(var1, var0, -1985372156);
         if(var9 != null) {
            var14 = var9.anInt2043 * 813479615;
            Class116_Sub15 var11 = AbstractRSDrawing.method339(var1, var0, -399224632);
            if(var11 != null) {
               if(var11.anObjectArray2023 != null) {
                  Class116_Sub6 var12 = new Class116_Sub6();
                  var12.aClass116_Sub15_1736 = var11;
                  var12.anInt1734 = var3 * 1329208753;
                  var12.aString1743 = var5;
                  var12.anObjectArray1737 = var11.anObjectArray2023;
                  Friend.method1840(var12, -2069888806);
               }

               boolean var17 = true;
               if(-179718399 * var11.anInt2016 > 0) {
                  var17 = Class116_Sub23_Sub2.method2384(var11, 1244772122);
               }

               if(var17 && Class116_Sub17.method2314(Class35.method645(var11, (byte)0), var3 - 1, 1717977072)) {
                  if(1 == var3) {
                     client.rsaBuffer.startPacket(149, (byte) 67);
                     client.rsaBuffer.writeInt(var1, (byte)121);
                     client.rsaBuffer.writeShort(var0, -2128928871);
                     client.rsaBuffer.writeShort(var14, -2130754846);
                  }

                  if(2 == var3) {
                     client.rsaBuffer.startPacket(209, (byte) 57);
                     client.rsaBuffer.writeInt(var1, (byte)114);
                     client.rsaBuffer.writeShort(var0, -2142995689);
                     client.rsaBuffer.writeShort(var14, -2077709357);
                  }

                  if(var3 == 3) {
                     client.rsaBuffer.startPacket(143, (byte) 50);
                     client.rsaBuffer.writeInt(var1, (byte)122);
                     client.rsaBuffer.writeShort(var0, -1818890311);
                     client.rsaBuffer.writeShort(var14, -2010787626);
                  }

                  if(4 == var3) {
                     client.rsaBuffer.startPacket(68, (byte) 114);
                     client.rsaBuffer.writeInt(var1, (byte)28);
                     client.rsaBuffer.writeShort(var0, -1940746840);
                     client.rsaBuffer.writeShort(var14, -1604755377);
                  }

                  if(var3 == 5) {
                     client.rsaBuffer.startPacket(48, (byte) 77);
                     client.rsaBuffer.writeInt(var1, (byte)22);
                     client.rsaBuffer.writeShort(var0, -1934993563);
                     client.rsaBuffer.writeShort(var14, -1983788035);
                  }

                  if(var3 == 6) {
                     client.rsaBuffer.startPacket(148, (byte) 21);
                     client.rsaBuffer.writeInt(var1, (byte)127);
                     client.rsaBuffer.writeShort(var0, -1757661173);
                     client.rsaBuffer.writeShort(var14, -1818038018);
                  }

                  if(7 == var3) {
                     client.rsaBuffer.startPacket(119, (byte) 80);
                     client.rsaBuffer.writeInt(var1, (byte)65);
                     client.rsaBuffer.writeShort(var0, -2110541002);
                     client.rsaBuffer.writeShort(var14, -1958895445);
                  }

                  if(8 == var3) {
                     client.rsaBuffer.startPacket(31, (byte) 62);
                     client.rsaBuffer.writeInt(var1, (byte)37);
                     client.rsaBuffer.writeShort(var0, -1648666295);
                     client.rsaBuffer.writeShort(var14, -1880935131);
                  }

                  if(9 == var3) {
                     client.rsaBuffer.startPacket(0, (byte) 121);
                     client.rsaBuffer.writeInt(var1, (byte)9);
                     client.rsaBuffer.writeShort(var0, -2143188895);
                     client.rsaBuffer.writeShort(var14, -1693294529);
                  }

                  if(10 == var3) {
                     client.rsaBuffer.startPacket(108, (byte) 118);
                     client.rsaBuffer.writeInt(var1, (byte)20);
                     client.rsaBuffer.writeShort(var0, -1848613675);
                     client.rsaBuffer.writeShort(var14, -2084319924);
                  }
               }
            }
         }
      }

      if(25 == var2) {
         var9 = AbstractRSDrawing.method339(var1, var0, -2079730176);
         if(var9 != null) {
            Class116_Sub23_Sub2.method2390(1602924600);
            Class9.method194(var1, var0, Class74.method1075(Class35.method645(var9, (byte)0), -1040783547), 813479615 * var9.anInt2043, (byte)-8);
            client.anInt2991 = 0;
            client.aString3192 = Class32.method594(var9, (byte)78);
            if(null == client.aString3192) {
               client.aString3192 = "Null";
            }

            if(var9.aBool1924) {
               client.aString2969 = var9.aString1996 + Class59_Sub1.method1978(16777215, (byte)36);
            } else {
               client.aString2969 = Class59_Sub1.method1978('\uff00', (byte)75) + var9.aString1918 + Class59_Sub1.method1978(16777215, (byte)22);
            }
         }

      } else {
         if(16 == var2) {
            client.anInt3043 = var6 * 300629671;
            client.anInt3044 = var7 * 91006015;
            client.anInt3046 = 922172934;
            client.anInt3045 = 0;
            client.anInt3168 = var0 * -1943900347;
            client.anInt3208 = var1 * 317027045;
            client.rsaBuffer.startPacket(208, (byte) 76);
            client.rsaBuffer.writeLEShort(543565821 * Class49.anInt661, 289816766);
            client.rsaBuffer.writeLEShort(Class116_Sub17.anInt2105 * 1426698711 + var0, 1699135091);
            client.rsaBuffer.writeLEShortA(var3, 1305424037);
            client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, 246658255);
            client.rsaBuffer.writeShort(1905121485 * Class37.anInt493, -1813968628);
            client.rsaBuffer.method2100(Class26.anInt365 * -47339353, (byte)35);
            client.rsaBuffer.writeShort(Class33.anInt456 * 714823515 + var1, -1981734451);
         }

         if(var2 == 2) {
            client.anInt3043 = 300629671 * var6;
            client.anInt3044 = var7 * 91006015;
            client.anInt3046 = 922172934;
            client.anInt3045 = 0;
            client.anInt3168 = var0 * -1943900347;
            client.anInt3208 = 317027045 * var1;
            client.rsaBuffer.startPacket(49, (byte) 37);
            client.rsaBuffer.writeLEShortA(var0 + 1426698711 * Class116_Sub17.anInt2105, 108656654);
            client.rsaBuffer.writeLEShortA(1149825709 * client.anInt3089, 53525308);
            client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -1982049967);
            client.rsaBuffer.writeInt(Class116_Sub23_Sub4.anInt2262 * -1195336111, (byte)9);
            client.rsaBuffer.writeLEShortA(var3 >> 14 & 32767, -661136740);
            client.rsaBuffer.writeLEShortA(Class33.anInt456 * 714823515 + var1, 430079352);
         }

         if(var2 == 6) {
            client.anInt3043 = 300629671 * var6;
            client.anInt3044 = 91006015 * var7;
            client.anInt3046 = 922172934;
            client.anInt3045 = 0;
            client.anInt3168 = var0 * -1943900347;
            client.anInt3208 = 317027045 * var1;
            client.rsaBuffer.startPacket(192, (byte) 38);
            client.rsaBuffer.method2102(1426698711 * Class116_Sub17.anInt2105 + var0, -765867794);
            client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, -1299110932);
            client.rsaBuffer.writeShort(var1 + Class33.anInt456 * 714823515, -1643474382);
            client.rsaBuffer.method2102(var3 >> 14 & 32767, -1718492932);
         }

         if(var2 == 28) {
            client.rsaBuffer.startPacket(80, (byte) 106);
            client.rsaBuffer.writeInt(var1, (byte)77);
            var9 = Class107.method1466(var1, 314639891);
            if(null != var9.anIntArrayArray2035 && 5 == var9.anIntArrayArray2035[0][0]) {
               var14 = var9.anIntArrayArray2035[0][1];
               Class107.varpData[var14] = 1 - Class107.varpData[var14];
               Class27.method567(var14, 2104013615);
            }
         }

         Mob var13;
         if(10 == var2) {
            var13 = client.aMobArray2972[var3];
            if(var13 != null) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(133, (byte) 45);
               client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, -851583013);
               client.rsaBuffer.writeShort(var3, -1811128142);
            }
         }

         if(35 == var2) {
            client.rsaBuffer.startPacket(6, (byte) 79);
            client.rsaBuffer.writeLEShort(var3, 1992323464);
            client.rsaBuffer.method2100(var1, (byte)64);
            client.rsaBuffer.writeLEShort(var0, 1341634511);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(1005 == var2) {
            var9 = Class107.method1466(var1, 314639891);
            if(var9 != null && var9.anIntArray2042[var0] >= 100000) {
               Class86.appendMessage(27, "", var9.anIntArray2042[var0] + " x " + Class50.method778(var3, (byte) 70).aString2361, -368486234);
            } else {
               client.rsaBuffer.startPacket(158, (byte) 85);
               client.rsaBuffer.writeLEShortA(var3, -1124935883);
            }

            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(var2 == 8) {
            var13 = client.aMobArray2972[var3];
            if(null != var13) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(74, (byte) 29);
               client.rsaBuffer.writeLEShort(var3, 760060720);
               client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 414335590);
               client.rsaBuffer.method2087(Class116_Sub23_Sub4.anInt2262 * -1195336111, 789222626);
               client.rsaBuffer.writeLEShortA(1149825709 * client.anInt3089, -35786081);
            }
         }

         if(var2 == 36) {
            client.rsaBuffer.startPacket(72, (byte) 113);
            client.rsaBuffer.writeLEShortA(var0, -721642083);
            client.rsaBuffer.writeInt(var1, (byte)49);
            client.rsaBuffer.method2102(var3, -485273282);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         Player var15;
         if(47 == var2) {
            var15 = client.globalPlayers[var3];
            if(null != var15) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(83, (byte) 57);
               client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, 779386186);
               client.rsaBuffer.writeShort(var3, -2061768506);
            }
         }

         if(var2 == 31) {
            client.rsaBuffer.startPacket(207, (byte) 76);
            client.rsaBuffer.writeLEShortA(var0, -1148766528);
            client.rsaBuffer.method2046(var1, 363001979);
            client.rsaBuffer.method2046(Class26.anInt365 * -47339353, 363001979);
            client.rsaBuffer.writeLEShortA(543565821 * Class49.anInt661, -938219239);
            client.rsaBuffer.writeLEShortA(Class37.anInt493 * 1905121485, 146583481);
            client.rsaBuffer.writeShort(var3, -2108158210);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(5 == var2) {
            client.anInt3043 = 300629671 * var6;
            client.anInt3044 = var7 * 91006015;
            client.anInt3046 = 922172934;
            client.anInt3045 = 0;
            client.anInt3168 = var0 * -1943900347;
            client.anInt3208 = 317027045 * var1;
            client.rsaBuffer.startPacket(197, (byte) 116);
            client.rsaBuffer.method2102(var1 + 714823515 * Class33.anInt456, 2006425519);
            client.rsaBuffer.writeLEShortA(1426698711 * Class116_Sub17.anInt2105 + var0, -1470191244);
            client.rsaBuffer.writeShort(var3 >> 14 & 32767, -2122903412);
            client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, -474236872);
         }

         if(var2 == 40) {
            client.rsaBuffer.startPacket(240, (byte) 19);
            client.rsaBuffer.writeLEShort(var3, 2000827503);
            client.rsaBuffer.writeLEShortA(var0, -2092765757);
            client.rsaBuffer.method2046(var1, 363001979);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = -1119534041 * var0;
         }

         if(var2 == 1) {
            client.anInt3043 = 300629671 * var6;
            client.anInt3044 = var7 * 91006015;
            client.anInt3046 = 922172934;
            client.anInt3045 = 0;
            client.anInt3168 = var0 * -1943900347;
            client.anInt3208 = var1 * 317027045;
            client.rsaBuffer.startPacket(118, (byte) 113);
            client.rsaBuffer.method2087(-47339353 * Class26.anInt365, 1546447964);
            client.rsaBuffer.writeLEShortA(var3 >> 14 & 32767, 158940329);
            client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 1618076834);
            client.rsaBuffer.writeLEShortA(1905121485 * Class37.anInt493, -2121738406);
            client.rsaBuffer.method2102(var1 + 714823515 * Class33.anInt456, -1148026980);
            client.rsaBuffer.writeLEShortA(Class116_Sub17.anInt2105 * 1426698711 + var0, -1621380409);
            client.rsaBuffer.writeLEShortA(Class49.anInt661 * 543565821, -1034876043);
         }

         if(30 == var2 && null == client.aClass116_Sub15_3097) {
            Class50.method779(var1, var0, (byte)8);
            client.aClass116_Sub15_3097 = AbstractRSDrawing.method339(var1, var0, 305498668);
            Class79.method1097(client.aClass116_Sub15_3097, -1268697776);
         }

         if(48 == var2) {
            var15 = client.globalPlayers[var3];
            if(null != var15) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(247, (byte) 106);
               client.rsaBuffer.method2102(var3, 1477473383);
               client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -900245234);
            }
         }

         if(37 == var2) {
            client.rsaBuffer.startPacket(50, (byte) 40);
            client.rsaBuffer.writeShort(var0, -2048974417);
            client.rsaBuffer.method2102(var3, -1188884851);
            client.rsaBuffer.method2100(var1, (byte)94);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(33 == var2) {
            client.rsaBuffer.startPacket(187, (byte) 113);
            client.rsaBuffer.method2100(var1, (byte)76);
            client.rsaBuffer.writeLEShort(var0, 1581782405);
            client.rsaBuffer.method2102(var3, 1623103306);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(7 == var2) {
            var13 = client.aMobArray2972[var3];
            if(null != var13) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(185, (byte) 40);
               client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 1448154050);
               client.rsaBuffer.writeShort(Class49.anInt661 * 543565821, -2144039464);
               client.rsaBuffer.method2046(-47339353 * Class26.anInt365, 363001979);
               client.rsaBuffer.method2102(var3, 334765820);
               client.rsaBuffer.method2102(Class37.anInt493 * 1905121485, -422941442);
            }
         }

         if(32 == var2) {
            client.rsaBuffer.startPacket(30, (byte) 123);
            client.rsaBuffer.method2102(1149825709 * client.anInt3089, 125713052);
            client.rsaBuffer.writeInt(var1, (byte)28);
            client.rsaBuffer.method2087(Class116_Sub23_Sub4.anInt2262 * -1195336111, -1774074017);
            client.rsaBuffer.writeShort(var3, -1761039396);
            client.rsaBuffer.method2102(var0, 556807237);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(var2 == 9) {
            var13 = client.aMobArray2972[var3];
            if(var13 != null) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(91, (byte) 42);
               client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -1316077667);
               client.rsaBuffer.writeShort(var3, -1661812998);
            }
         }

         if(41 == var2) {
            client.rsaBuffer.startPacket(110, (byte) 72);
            client.rsaBuffer.writeInt(var1, (byte)53);
            client.rsaBuffer.writeLEShort(var0, 1318713980);
            client.rsaBuffer.writeLEShortA(var3, -565903448);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(var2 == 51) {
            var15 = client.globalPlayers[var3];
            if(var15 != null) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(243, (byte) 124);
               client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, -132873712);
               client.rsaBuffer.writeShort(var3, -1613704263);
            }
         }

         if(var2 == 39) {
            client.rsaBuffer.startPacket(92, (byte) 111);
            client.rsaBuffer.writeLEShortA(var0, -1611211467);
            client.rsaBuffer.method2046(var1, 363001979);
            client.rsaBuffer.writeLEShortA(var3, -1845818499);
            client.anInt3047 = 0;
            Class35.aClass116_Sub15_473 = Class107.method1466(var1, 314639891);
            client.anInt3048 = var0 * -1119534041;
         }

         if(var2 == 38) {
            Class116_Sub23_Sub2.method2390(1696725485);
            var9 = Class107.method1466(var1, 314639891);
            client.anInt2991 = 2046756243;
            Class49.anInt661 = var0 * 1705405781;
            Class26.anInt365 = var1 * 541949719;
            Class37.anInt493 = 662033413 * var3;
            Class79.method1097(var9, -588000075);
            client.aString3201 = Class59_Sub1.method1978(16748608, (byte)117) + Class50.method778(var3, (byte)70).aString2361 + Class59_Sub1.method1978(16777215, (byte)101);
            if(client.aString3201 == null) {
               client.aString3201 = "null";
            }

         } else {
            if(var2 == 17) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(7, (byte) 87);
               client.rsaBuffer.writeLEShortA(var0 + 1426698711 * Class116_Sub17.anInt2105, -965482817);
               client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, -2128732133);
               client.rsaBuffer.method2087(-1195336111 * Class116_Sub23_Sub4.anInt2262, 1467474663);
               client.rsaBuffer.method2102(1149825709 * client.anInt3089, -596036941);
               client.rsaBuffer.writeShort(var1 + 714823515 * Class33.anInt456, -1819686272);
               client.rsaBuffer.writeLEShortA(var3, 893491265);
            }

            if(49 == var2) {
               var15 = client.globalPlayers[var3];
               if(null != var15) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = -1943900347 * var0;
                  client.anInt3208 = 317027045 * var1;
                  client.rsaBuffer.startPacket(4, (byte) 111);
                  client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, 438340746);
                  client.rsaBuffer.method2102(var3, 671868623);
               }
            }

            if(1001 == var2) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = 317027045 * var1;
               client.rsaBuffer.startPacket(195, (byte) 98);
               client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, 1709125123);
               client.rsaBuffer.writeShort(var1 + Class33.anInt456 * 714823515, -1965951089);
               client.rsaBuffer.writeShort(var3 >> 14 & 32767, -1973722803);
               client.rsaBuffer.method2102(var0 + Class116_Sub17.anInt2105 * 1426698711, -338749523);
            }

            if(1003 == var2) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               var13 = client.aMobArray2972[var3];
               if(var13 != null) {
                  MobDefinition var16 = var13.definition;
                  if(var16.anIntArray2313 != null) {
                     var16 = var16.method2546(-572852130);
                  }

                  if(null != var16) {
                     client.rsaBuffer.startPacket(111, (byte) 112);
                     client.rsaBuffer.writeLEShortA(-2095462435 * var16.anInt2308, -1252666819);
                  }
               }
            }

            if(11 == var2) {
               var13 = client.aMobArray2972[var3];
               if(var13 != null) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = -1943900347 * var0;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(37, (byte) 97);
                  client.rsaBuffer.writeShort(var3, -2067750672);
                  client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 115954719);
               }
            }

            if(1002 == var2) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.rsaBuffer.startPacket(249, (byte) 120);
               client.rsaBuffer.writeLEShortA(var3 >> 14 & 32767, 240652617);
            }

            if(var2 == 22) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = 91006015 * var7;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(109, (byte) 15);
               client.rsaBuffer.method2102(Class116_Sub17.anInt2105 * 1426698711 + var0, 1513279588);
               client.rsaBuffer.writeLEShort(var1 + 714823515 * Class33.anInt456, 523063957);
               client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, -400483938);
               client.rsaBuffer.writeShort(var3, -1821652962);
            }

            if(13 == var2) {
               var13 = client.aMobArray2972[var3];
               if(var13 != null) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = var7 * 91006015;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = -1943900347 * var0;
                  client.anInt3208 = 317027045 * var1;
                  client.rsaBuffer.startPacket(100, (byte) 51);
                  client.rsaBuffer.writeShort(var3, -1687317991);
                  client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 624168155);
               }
            }

            if(44 == var2) {
               var15 = client.globalPlayers[var3];
               if(null != var15) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = var0 * -1943900347;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(234, (byte) 46);
                  client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -967568665);
                  client.rsaBuffer.method2102(var3, 1002532582);
               }
            }

            if(var2 == 20) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(223, (byte) 80);
               client.rsaBuffer.writeLEShortA(var3, 1579835241);
               client.rsaBuffer.method2102(var0 + Class116_Sub17.anInt2105 * 1426698711, -1750444947);
               client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, 1625057630);
               client.rsaBuffer.writeLEShortA(714823515 * Class33.anInt456 + var1, -1309303305);
            }

            if(var2 == 45) {
               var15 = client.globalPlayers[var3];
               if(null != var15) {
                  client.anInt3043 = 300629671 * var6;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = var0 * -1943900347;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(35, (byte) 25);
                  client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, -349131152);
                  client.rsaBuffer.writeShort(var3, -1648357704);
               }
            }

            if(29 == var2) {
               client.rsaBuffer.startPacket(80, (byte) 113);
               client.rsaBuffer.writeInt(var1, (byte)66);
               var9 = Class107.method1466(var1, 314639891);
               if(null != var9.anIntArrayArray2035 && var9.anIntArrayArray2035[0][0] == 5) {
                  var14 = var9.anIntArrayArray2035[0][1];
                  if(Class107.varpData[var14] != var9.anIntArray2001[0]) {
                     Class107.varpData[var14] = var9.anIntArray2001[0];
                     Class27.method567(var14, 1704661204);
                  }
               }
            }

            if(15 == var2) {
               var15 = client.globalPlayers[var3];
               if(null != var15) {
                  client.anInt3043 = 300629671 * var6;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = var0 * -1943900347;
                  client.anInt3208 = 317027045 * var1;
                  client.rsaBuffer.startPacket(8, (byte) 54);
                  client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, 2041959658);
                  client.rsaBuffer.method2102(client.anInt3089 * 1149825709, -1486645754);
                  client.rsaBuffer.writeShort(var3, -1945052740);
                  client.rsaBuffer.writeInt(Class116_Sub23_Sub4.anInt2262 * -1195336111, (byte)118);
               }
            }

            if(var2 == 50) {
               var15 = client.globalPlayers[var3];
               if(var15 != null) {
                  client.anInt3043 = 300629671 * var6;
                  client.anInt3044 = var7 * 91006015;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = var0 * -1943900347;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(224, (byte) 94);
                  client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -779094188);
                  client.rsaBuffer.writeShort(var3, -2033136260);
               }
            }

            if(58 == var2) {
               var9 = AbstractRSDrawing.method339(var1, var0, -492003910);
               if(var9 != null) {
                  client.rsaBuffer.startPacket(61, (byte) 27);
                  client.rsaBuffer.writeShort(var0, -1854727998);
                  client.rsaBuffer.writeLEShortA(-1609091953 * client.anInt3090, -1720732137);
                  client.rsaBuffer.method2046(-1195336111 * Class116_Sub23_Sub4.anInt2262, 363001979);
                  client.rsaBuffer.method2100(var1, (byte)111);
                  client.rsaBuffer.writeShort(var9.anInt2043 * 813479615, -1689032643);
                  client.rsaBuffer.writeLEShortA(1149825709 * client.anInt3089, 1797799624);
               }
            }

            if(var2 == 19) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = -1943900347 * var0;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(27, (byte) 93);
               client.rsaBuffer.method2102(var1 + Class33.anInt456 * 714823515, 308098680);
               client.rsaBuffer.writeShort(1426698711 * Class116_Sub17.anInt2105 + var0, -1759266365);
               client.rsaBuffer.writeLEShortA(var3, -1798609708);
               client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, 317501006);
            }

            if(var2 == 14) {
               var15 = client.globalPlayers[var3];
               if(var15 != null) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = -1943900347 * var0;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(106, (byte) 68);
                  client.rsaBuffer.writeLEShortA(1905121485 * Class37.anInt493, -1112229279);
                  client.rsaBuffer.method2087(-47339353 * Class26.anInt365, 846818795);
                  client.rsaBuffer.writeLEShortA(Class49.anInt661 * 543565821, 1821876216);
                  client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, -2105914978);
                  client.rsaBuffer.writeLEShort(var3, 590184446);
               }
            }

            if(var2 == 12) {
               var13 = client.aMobArray2972[var3];
               if(null != var13) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = var7 * 91006015;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = -1943900347 * var0;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(218, (byte) 107);
                  client.rsaBuffer.method2209(KeyFocusListener.keysHeldDown[82]?1:0, -1579704096);
                  client.rsaBuffer.method2102(var3, -837824662);
               }
            }

            if(var2 == 4) {
               client.anInt3043 = 300629671 * var6;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(147, (byte) 84);
               client.rsaBuffer.writeLEShort(Class33.anInt456 * 714823515 + var1, 474885840);
               client.rsaBuffer.writeLEShort(var3 >> 14 & 32767, 1760973865);
               client.rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82] ? 1 : 0, -1075287625);
               client.rsaBuffer.method2102(var0 + 1426698711 * Class116_Sub17.anInt2105, 628694689);
            }

            if(46 == var2) {
               var15 = client.globalPlayers[var3];
               if(null != var15) {
                  client.anInt3043 = var6 * 300629671;
                  client.anInt3044 = 91006015 * var7;
                  client.anInt3046 = 922172934;
                  client.anInt3045 = 0;
                  client.anInt3168 = var0 * -1943900347;
                  client.anInt3208 = var1 * 317027045;
                  client.rsaBuffer.startPacket(10, (byte) 68);
                  client.rsaBuffer.method2135(KeyFocusListener.keysHeldDown[82]?1:0, -911324825);
                  client.rsaBuffer.writeShort(var3, -1814050772);
               }
            }

            if(26 == var2) {
               ISAAC.method794((short) -17837);
            }

            if(var2 == 3) {
               client.anInt3043 = var6 * 300629671;
               client.anInt3044 = var7 * 91006015;
               client.anInt3046 = 922172934;
               client.anInt3045 = 0;
               client.anInt3168 = var0 * -1943900347;
               client.anInt3208 = var1 * 317027045;
               client.rsaBuffer.startPacket(202, (byte) 19);
               client.rsaBuffer.writeByte(KeyFocusListener.keysHeldDown[82]?1:0, 508161350);
               client.rsaBuffer.writeLEShortA(var3 >> 14 & 32767, -50788550);
               client.rsaBuffer.method2102(Class116_Sub17.anInt2105 * 1426698711 + var0, -2042976935);
               client.rsaBuffer.writeShort(Class33.anInt456 * 714823515 + var1, -1847570458);
            }

            if(-1110581093 * client.anInt2991 != 0) {
               client.anInt2991 = 0;
               Class79.method1097(Class107.method1466(-47339353 * Class26.anInt365, 314639891), 1428707230);
            }

            if(client.aBool3088) {
               Class116_Sub23_Sub2.method2390(1868000638);
            }

            if(Class35.aClass116_Sub15_473 != null && 0 == -1044454887 * client.anInt3047) {
               Class79.method1097(Class35.aClass116_Sub15_473, -792871744);
            }

         }
      }
   }
}
