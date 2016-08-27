package com.jagex;
import java.util.zip.Inflater;

public class Class60 {

   static RSInputStream aClass71_779;
   static byte[][][] aByteArrayArrayArray780;
   Inflater anInflater782;
   public static RSIndex aRSIndex_783;

   Class60(int var1, int var2, int var3) {}

   public void unpackGZip(Packet packet, byte[] payload, byte var3) {
      if(31 == packet.payload[314639891 * packet.position] && -117 == packet.payload[1 + packet.position * 314639891]) {
         if(this.anInflater782 == null) {
            this.anInflater782 = new Inflater(true);
         }

         try {
            this.anInflater782.setInput(packet.payload, 10 + 314639891 * packet.position, packet.payload.length - (8 + 10 + packet.position * 314639891));
            this.anInflater782.inflate(payload);
         } catch (Exception var5) {
            this.anInflater782.reset();
            throw new RuntimeException("");
         }

         this.anInflater782.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   static final void method899(boolean var0, int var1) {
      for(int var2 = 0; var2 < 727116725 * client.npcCount; ++var2) {
         Mob var3 = client.aMobArray2972[client.npcIndicies[var2]];
         int var5 = 536870912 + (client.npcIndicies[var2] << 14);
         if(null != var3 && var3.method3101((byte)60) && var0 == var3.definition.aBool2317 && var3.definition.method2554((short)3030)) {
            int var6 = 1272643751 * var3.anInt2609 >> 7;
            int var4 = -1801433343 * var3.anInt2579 >> 7;
            if(var6 >= 0 && var6 < 104 && var4 >= 0 && var4 < 104) {
               if(-1776294967 * var3.tileSize == 1 && 64 == (var3.anInt2609 * 1272643751 & 127) && (-1801433343 * var3.anInt2579 & 127) == 64) {
                  if(-1317183381 * client.anInt3179 == client.anIntArrayArray3081[var6][var4]) {
                     continue;
                  }

                  client.anIntArrayArray3081[var6][var4] = client.anInt3179 * -1317183381;
               }

               if(!var3.definition.aBool2337) {
                  var5 -= Integer.MIN_VALUE;
               }

               GameInterface.region.method356(GameInterface.anInt1819 * -747958745, 1272643751 * var3.anInt2609, -1801433343 * var3.anInt2579, MobDefinition.method2552(var3.tileSize * -2013728192 - 64 + var3.anInt2609 * 1272643751, var3.tileSize * -2013728192 - 64 + -1801433343 * var3.anInt2579, GameInterface.anInt1819 * -747958745, (short) 15323), 60 + (var3.tileSize * -2013728192 - 64), var3, var3.anInt2613 * -2031663291, var5, var3.aBool2588);
            }
         }
      }

   }

   public static long method902(CharSequence var0, int var1) {
      long var2 = 0L;
      int var6 = var0.length();

      for(int var4 = 0; var4 < var6; ++var4) {
         var2 *= 37L;
         char var5 = var0.charAt(var4);
         if(var5 >= 65 && var5 <= 90) {
            var2 += (long)(1 + var5 - 65);
         } else if(var5 >= 97 && var5 <= 122) {
            var2 += (long)(1 + var5 - 97);
         } else if(var5 >= 48 && var5 <= 57) {
            var2 += (long)(27 + var5 - 48);
         }

         if(var2 >= 177917621779460413L) {
            break;
         }
      }

      while(var2 % 37L == 0L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }

   public Class60() {
      this(-1, 1000000, 1000000);
   }
}
