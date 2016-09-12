package com.jagex;
import java.io.File;

public abstract class Timer {

   static void forceFileCheck(File var0, int var1) {
      Class90.aFile1042 = var0;
      if(!Class90.aFile1042.exists()) {
         throw new RuntimeException("");
      } else {
         Class90.aBool1043 = true;
      }
   }

   static final void doPlayerMasks(BitBuffer buffer, int var1, Player owner, int mask, int var4) {
      byte movement = -1;
      int i;
      if((mask & 64) != 0) { //appearance
         i = buffer.readSignedByte(1708176767);
         byte[] var7 = new byte[i];
         Buffer var8 = new Buffer(var7);
         buffer.readBytes(var7, 0, i, 2072301859);
         Class7.aClass116_Sub14Array106[var1] = var8;
         owner.method3549(var8, 2147040956);
      }

      int var20;
      if(0 != (mask & 2)) { //animation
         i = buffer.readShort(951379527);
         if('\uffff' == i) {
            i = -1;
         }

         var20 = buffer.readSignedByte(1708176767);
         Class53.method792(owner, i, var20, (byte)99);
      }

      if((mask & 128) != 0) { //faceentity
         owner.anInt2603 = buffer.readShort(155330343) * 1611414733;
         if('\uffff' == 734924805 * owner.anInt2603) {
            owner.anInt2603 = -1611414733;
         }
      }

      if(0 != (mask & 4)) { //force chat
         owner.forceChatString = buffer.readString(61376769);
         if(owner.forceChatString.charAt(0) == 126) {
            owner.forceChatString = owner.forceChatString.substring(1);
            Class86.appendMessage(2, owner.username, owner.forceChatString, 1253834526);
         } else if(owner == Class79.aPlayer_909) {
            Class86.appendMessage(2, owner.username, owner.forceChatString, -1305473767);
         }

         owner.aBool2623 = false;
         owner.anInt2618 = 0;
         owner.anInt2596 = 0;
         owner.anInt2598 = -853552818;
      }

      if((mask & 1) != 0) { //hit
         i = buffer.readShort(323428455);
         var20 = buffer.readSignedByte(1708176767);
         owner.method3102(i, var20, -1040073859 * client.anInt2943, -202753875);
         owner.anInt2600 = -1453430444 + client.anInt2943 * 568824035;
         owner.anInt2601 = buffer.readSignedByte(1708176767) * -182432293;
         owner.anInt2602 = buffer.readSignedByte(1708176767) * 119158941;
      }

      if(0 != (mask & 32)) {
	      owner.faceDirection = buffer.readShort(1868687810) * -316267887;
	      if (0 == owner.anInt2578 * 632093179) {
		      owner.faceDir1 = 47518811 * owner.faceDirection;
		      owner.faceDirection = 316267887;
	      }
      }

      if((mask & 8) != 0) { //chat
         i = buffer.readShort(1815034653);
         Speach[] var21 = new Speach[]{Speach.OFFLINE, Speach.PLAYER, Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
         Speach img = (Speach)Class35.method646(var21, buffer.readSignedByte(1708176767), (byte)-102);
         boolean var9 = buffer.readSignedByte(1708176767) == 1;
         int offset = buffer.readSignedByte(1708176767);
         int var11 = 314639891 * buffer.position;
         if(null != owner.username && null != owner.aClass108_2881) {
            boolean var12 = false;
            if(img.aBool982 && Class27.method568(owner.username, -1957582547)) {
               var12 = true;
            }

            if(!var12 && 0 == client.anInt3151 * 198136383 && !owner.aBool2900) {
               Class7.aClass116_Sub14_113.position = 0;
               buffer.readBytes(Class7.aClass116_Sub14_113.payload, 0, offset, 1888087799);
               Class7.aClass116_Sub14_113.position = 0;
               Buffer var13 = Class7.aClass116_Sub14_113;

               int var14;
               String var17;
               try {
                  var14 = var13.readSmartC(-197894626);
                  if(var14 > 32767) {
                     var14 = 32767;
                  }

                  byte[] var15 = new byte[var14];
                  var13.position += client.aClass52_1621.method786(var13.payload, 314639891 * var13.position, var15, 0, var14, (byte)16) * -184175589;
                  String var16 = Tile.method1987(var15, 0, var14, (byte) 79);
                  var17 = var16;
               } catch (Exception var19) {
                  var17 = "Cabbage";
               }

               var17 = TextDrawingArea.method3459(Class59.method892(var17, -1907852845));
               owner.forceChatString = var17.trim();
               owner.anInt2618 = -1783525269 * (i >> 8);
               owner.anInt2596 = (i & 255) * -819780711;
               owner.anInt2598 = -853552818;
               owner.aBool2623 = var9;
               owner.aBool2593 = Class79.aPlayer_909 != owner && img.aBool982 && "" != client.aString2985 && var17.toLowerCase().indexOf(client.aString2985) == -1;
               if(img.aBool978) {
                  var14 = var9?91:1;
               } else {
                  var14 = var9?90:2;
               }

               if(-2127218069 * img.iconId != -1) {
                  Class86.appendMessage(var14, Class51.method780(-2127218069 * img.iconId, (short) 1915) + owner.username, var17, -300212229);
               } else {
                  Class86.appendMessage(var14, owner.username, var17, -1390100083);
               }
            }
         }

         buffer.position = -184175589 * (offset + var11);
      }

      if((mask & 256) != 0) {
         owner.anInt2614 = buffer.readShort(1294487063) * -1738418729;
         i = buffer.readInt(-845401088);
         owner.anInt2589 = (i >> 16) * 878509897;
         owner.anInt2617 = 1621235571 * ((i & '\uffff') + client.anInt2943 * -1040073859);
         owner.anInt2595 = 0;
         owner.anInt2616 = 0;
         if(owner.anInt2617 * 489022907 > -1040073859 * client.anInt2943) {
            owner.anInt2595 = -1825378913;
         }

         if(1631645159 * owner.anInt2614 == '\uffff') {
            owner.anInt2614 = 1738418729;
         }
      }

      if(0 != (mask & 2048)) { //forced movement
          int i1,i2,i3,i4,i5,i6, i7;
          i1 = buffer.readUnsignedByte(1310953181);
          i2 = buffer.readUnsignedByte(-1224429240);
          i3 = buffer.readUnsignedByte(-611546724);
          i4 =buffer.readUnsignedByte(136330049);
          i5 = buffer.readShort(720126500);
          i6 = buffer.readShort(52893704);
          i7 = buffer.readShort(-126866961);
         owner.anInt2632 = i1 * 1999092273;
         owner.anInt2621 = i2 * 1905120905;
         owner.anInt2620 = i3 * 1171552311;
         owner.anInt2594 = i4 * -1263265185;
         owner.anInt2599 = (i5 + -1040073859 * client.anInt2943) * 1935880743;
         owner.anInt2624 = (i6 + -1040073859 * client.anInt2943) * -1370408969;
         owner.anInt2625 = i7 * -1704579493;
         if(owner.aBool2901) {
            owner.anInt2632 += owner.anInt2904 * 189523535;
            owner.anInt2621 += 1458816133 * owner.anInt2905;
            owner.anInt2620 += owner.anInt2904 * -135505079;
            owner.anInt2594 += owner.anInt2905 * -990143037;
            owner.anInt2578 = 0;
         } else {
            owner.anInt2632 += owner.xMovementSteps[0] * 1999092273;
            owner.anInt2621 += owner.yMovementSteps[0] * 1905120905;
            owner.anInt2620 += owner.xMovementSteps[0] * 1171552311;
            owner.anInt2594 += owner.yMovementSteps[0] * -1263265185;
            owner.anInt2578 = 11741491;
         }

         owner.anInt2636 = 0;
      }

      if((mask & 1024) != 0) { //hit2
         i = buffer.readShort(643241669);
         var20 = buffer.readSignedByte(1708176767);
         owner.method3102(i, var20, client.anInt2943 * -1040073859, 1350743615);
         owner.anInt2600 = client.anInt2943 * 568824035 + -1453430444;
         owner.anInt2601 = buffer.readSignedByte(1708176767) * -182432293;
         owner.anInt2602 = buffer.readSignedByte(1708176767) * 119158941;
      }

      if((mask & 512) != 0) {
         Class7.aByteArray105[var1] = buffer.readUnsignedByte(-1458109056);
      }

      if(0 != (mask & 4096)) { //movement mode
         movement = buffer.readUnsignedByte(-450722301);
          if(owner.username.equalsIgnoreCase("hi"))
            System.out.println("MOVEMENT = "+movement+", "+owner.username);
      }

	   if (0 != (mask & 8192)) { //DEADMANshitnaming
		   for (i = 0; i < 3; ++i) {
			   owner.aStringArray2884[i] = buffer.readString(61376769);
         }
      }

      if(owner.aBool2901) {
         if(movement == 127) {
            owner.method3551(-1495988097 * owner.anInt2904, owner.anInt2905 * 1538326301, 85453909);
         } else {
            byte var23;
            if(movement != -1) {
               var23 = movement;
            } else {
               var23 = Class7.aByteArray105[var1];
            }

            owner.method3553(owner.anInt2904 * -1495988097, owner.anInt2905 * 1538326301, var23, 1887777838);
         }
      }

   }

   static final void method1092(byte var0) {
      Class116_Sub23_Sub12.aClass123_2406.method1635();
      Class116_Sub8.method1939(1955842425);
      Class61.method903(-178409180);
      ObjectDefinition.aClass123_2193.method1635();
      ObjectDefinition.aClass123_2192.method1635();
      ObjectDefinition.aClass123_2204.method1635();
      ObjectDefinition.aClass123_2194.method1635();
      MobDefinition.aClass123_2310.method1635();
      MobDefinition.aClass123_2307.method1635();
      Class116_Sub23_Sub11.aClass123_2356.method1635();
      Class116_Sub23_Sub11.aClass123_2357.method1635();
      Class116_Sub23_Sub11.aClass123_2376.method1635();
      Class116_Sub23_Sub4.aClass123_2245.method1635();
      Class116_Sub23_Sub4.aClass123_2246.method1635();
      Class116_Sub23_Sub5.method2488(1695840028);
      Class135.method1739((short)-4226);
      Class116_Sub23_Sub15.method2701(-1648941827);
      Class103.method1445(320621634);
      Class43.method696(-679147442);
      ((Class36) Texture.anInterface3_2718).method653(1192732816);
      Class116_Sub23_Sub18.aClass123_2488.method1635();
      Class42.aClass99_Sub1_574.method1364((byte)95);
      client.aClass99_Sub1_2955.method1364((byte)-1);
      Class116_Sub23_Sub18.aClass99_Sub1_2484.method1364((byte)72);
      Class116_Sub23_Sub13.aClass99_Sub1_2424.method1364((byte)84);
      Class59_Sub1.aClass99_Sub1_1828.method1364((byte)-26);
      Class2.aClass99_Sub1_23.method1364((byte)-62);
      Class3.aClass99_Sub1_42.method1364((byte)4);
      Class116_Sub5.aClass99_Sub1_1729.method1364((byte)-60);
      Class1.aClass99_Sub1_6.method1364((byte)-41);
      Class49.aClass99_Sub1_663.method1364((byte)17);
      Class108.aClass99_Sub1_1471.method1364((byte)20);
      Class116_Sub23_Sub6.aClass99_Sub1_2279.method1364((byte)-66);
   }

	abstract void reset(int var1);

	abstract int method1085(int var1, int var2, byte var3);

}
