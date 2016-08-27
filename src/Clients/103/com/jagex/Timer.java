package com.jagex;
import java.io.File;

public abstract class Timer {

   abstract void reset(int var1);

   abstract int method1085(int var1, int var2, byte var3);

   static void forceFileCheck(File var0, int var1) {
      Class90.aFile1042 = var0;
      if(!Class90.aFile1042.exists()) {
         throw new RuntimeException("");
      } else {
         Class90.aBool1043 = true;
      }
   }

   static final void doPlayerMasks(PacketBuilder buffer, int var1, Player owner, int mask, int var4) {
      byte movmementResetSwitch = -1;
      int i;
       System.out.println(mask);
      if((mask & 64) != 0) { //appearance
         i = buffer.readSignedByte(1708176767);
         byte[] var7 = new byte[i];
         Packet var8 = new Packet(var7);
         buffer.readBytes(var7, 0, i, 2072301859);
         Class7.aClass116_Sub14Array106[var1] = var8;
         owner.doAppearance(var8, 2147040956);
      }

      int var20;
      if(0 != (mask & 2)) { //animation
         i = buffer.readUnsignedShort(951379527);
         if('\uffff' == i) {
            i = -1;
         }

         var20 = buffer.readSignedByte(1708176767);
         Class53.method792(owner, i, var20, (byte)99);
      }
      if((mask & 128) != 0) { //faceentity
          int i1 = buffer.readUnsignedShort(155330343);
          System.out.println("face ent = "+i1);
         owner.anInt2603 = i1 * 1611414733;
         if('\uffff' == 734924805 * owner.anInt2603) {
            owner.anInt2603 = -1611414733;
         }
      }

      if(0 != (mask & 4)) { //force chat
         owner.forceChatString = buffer.readString(61376769);
         if(owner.forceChatString.charAt(0) == 126) {
            owner.forceChatString = owner.forceChatString.substring(1);
            Class86.appendMessage(2, owner.username, owner.forceChatString, 1253834526);
         } else if(owner == Class79.ourPlayer) {
            Class86.appendMessage(2, owner.username, owner.forceChatString, -1305473767);
         }

         owner.aBool2623 = false;
         owner.anInt2618 = 0;
         owner.anInt2596 = 0;
         owner.anInt2598 = -853552818;
      }

      if((mask & 1) != 0) { //hit
         i = buffer.readUnsignedShort(323428455);
         var20 = buffer.readSignedByte(1708176767);
         owner.method3102(i, var20, -1040073859 * client.anInt2943, -202753875);
         owner.anInt2600 = -1453430444 + client.anInt2943 * 568824035;
         owner.anInt2601 = buffer.readSignedByte(1708176767) * -182432293;
         owner.anInt2602 = buffer.readSignedByte(1708176767) * 119158941;
      }

      if(0 != (mask & 32)) { //face ??
          int i1 = buffer.readUnsignedShort(1868687810);
          System.out.println("face?? = "+i1);
         owner.anInt2605 = i1 * -316267887;
         if(0 == owner.anInt2578 * 632093179) {
            owner.anInt2631 = 47518811 * owner.anInt2605;
            owner.anInt2605 = 316267887;
         }
      }

      if((mask & 8) != 0) { //chat
         i = buffer.readUnsignedShort(1815034653);
         Speach[] var21 = new Speach[]{Speach.OFFLINE, Speach.PLAYER, Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
         Speach img = (Speach)Class35.method646(var21, buffer.readSignedByte(1708176767), (byte)-102);
         boolean var9 = buffer.readSignedByte(1708176767) == 1;
         int offset = buffer.readSignedByte(1708176767);
         int var11 = 314639891 * buffer.position;
         if(null != owner.username && null != owner.aClass108_2881) {
            boolean var12 = false;
            if(img.aBool982 && World.method568(owner.username, -1957582547)) {
               var12 = true;
            }

            if(!var12 && 0 == client.anInt3151 * 198136383 && !owner.aBool2900) {
               Class7.aClass116_Sub14_113.position = 0;
               buffer.readBytes(Class7.aClass116_Sub14_113.payload, 0, offset, 1888087799);
               Class7.aClass116_Sub14_113.position = 0;
               Packet var13 = Class7.aClass116_Sub14_113;

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
               owner.aBool2593 = Class79.ourPlayer != owner && img.aBool982 && "" != client.aString2985 && var17.toLowerCase().indexOf(client.aString2985) == -1;
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

      if((mask & 256) != 0) { //gfx
         owner.currentGraphic = buffer.readUnsignedShort(1294487063) * -1738418729;
         i = buffer.readInt(-845401088);
         owner.currentGraphicDelay = (i >> 16) * 878509897;
         owner.currentGraphicHeight = 1621235571 * ((i & '\uffff') + client.anInt2943 * -1040073859);
          System.out.println(i+"/"+(i >> 16)+"/"+(i & '\uffff'));
         owner.anInt2595 = 0;
         owner.anInt2616 = 0;
         if(owner.currentGraphicHeight * 489022907 > -1040073859 * client.anInt2943) {
            owner.anInt2595 = -1825378913;
         }

         if(1631645159 * owner.currentGraphic == '\uffff') {
            owner.currentGraphic = 1738418729;
         }
      }

      if(0 != (mask & 2048)) { //forced movement
          int x1,y1,x2,y2,speed1,animation, delayms;
          x1 = buffer.readUnsignedByte(1310953181);
          y1 = buffer.readUnsignedByte(-1224429240);
          x2 = buffer.readUnsignedByte(-611546724);
          y2 =buffer.readUnsignedByte(136330049);
          speed1 = buffer.readUnsignedShort(720126500);
          animation = buffer.readUnsignedShort(52893704);
          delayms = buffer.readUnsignedShort(-126866961);
         owner.forceMovex1 = x1 * 1999092273;
         owner.forceMovey1 = y1 * 1905120905;
         owner.forceMovex2 = x2 * 1171552311;
         owner.forceMovey2 = y2 * -1263265185;
         owner.anInt2599 = (speed1 + -1040073859 * client.anInt2943) * 1935880743;
         owner.anInt2624 = (animation + -1040073859 * client.anInt2943) * -1370408969;
         owner.anInt2625 = delayms * -1704579493;
         if(owner.moving) {
            owner.forceMovex1 += owner.anInt2904 * 189523535;
            owner.forceMovey1 += 1458816133 * owner.anInt2905;
            owner.forceMovex2 += owner.anInt2904 * -135505079;
            owner.forceMovey2 += owner.anInt2905 * -990143037;
            owner.anInt2578 = 0;
         } else {
            owner.forceMovex1 += owner.xMovementSteps[0] * 1999092273;
            owner.forceMovey1 += owner.yMovementSteps[0] * 1905120905;
            owner.forceMovex2 += owner.xMovementSteps[0] * 1171552311;
            owner.forceMovey2 += owner.yMovementSteps[0] * -1263265185;
            owner.anInt2578 = 11741491;
         }

         owner.anInt2636 = 0;
      }

      if((mask & 1024) != 0) { //hit2
         i = buffer.readUnsignedShort(643241669);
         var20 = buffer.readSignedByte(1708176767);
         owner.method3102(i, var20, client.anInt2943 * -1040073859, 1350743615);
         owner.anInt2600 = client.anInt2943 * 568824035 + -1453430444;
         owner.anInt2601 = buffer.readSignedByte(1708176767) * -182432293;
         owner.anInt2602 = buffer.readSignedByte(1708176767) * 119158941;
      }

      if((mask & 512) != 0) { //movement mode
         Class7.movementMode[var1] = buffer.readUnsignedByte(-1458109056);
          if(owner.username.equalsIgnoreCase("IPotatoI"))
              System.out.println("MOVEMENT = "+ Class7.movementMode[var1] +", "+owner.username);
      }

      if(0 != (mask & 4096)) { //teleport variable, makes it so when u teleport you skip like normal
         movmementResetSwitch = buffer.readUnsignedByte(-450722301);
          if(owner.username.equalsIgnoreCase("IPotatoI"))
            System.out.println("reset movement = "+movmementResetSwitch+", "+owner.username);
      }

      if(0 != (mask & 8192)) { //player name mask
         for(i = 0; i < 3; ++i) {
            owner.rightClickOptionMask[i] = buffer.readString(61376769);
         }
      }

      if(owner.moving) {
         if(movmementResetSwitch == 127) {
            owner.method3551(-1495988097 * owner.anInt2904, owner.anInt2905 * 1538326301, 85453909);
         } else {
            byte movementMode;
            if(movmementResetSwitch != -1) {
               movementMode = movmementResetSwitch;
            } else {
               movementMode = Class7.movementMode[var1];
            }

            owner.method3553(owner.anInt2904 * -1495988097, owner.anInt2905 * 1538326301, movementMode, 1887777838);
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
      Class42.aCacheIndex_574.method1364((byte)95);
      client.aCacheIndex_2955.method1364((byte)-1);
      Class116_Sub23_Sub18.aCacheIndex_2484.method1364((byte)72);
      Class116_Sub23_Sub13.aCacheIndex_2424.method1364((byte)84);
      Class59_Sub1.mapFileIndex.method1364((byte)-26);
      Class2.aCacheIndex_23.method1364((byte)-62);
      Class3.aCacheIndex_42.method1364((byte)4);
      Class116_Sub5.spriteIndex.method1364((byte)-60);
      Class1.aCacheIndex_6.method1364((byte)-41);
      Class49.aCacheIndex_663.method1364((byte)17);
      Class108.aCacheIndex_1471.method1364((byte)20);
      Class116_Sub23_Sub6.aCacheIndex_2279.method1364((byte)-66);
   }

}
