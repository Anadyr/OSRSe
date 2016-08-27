package com.jagex;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class29 {

   boolean aBool403;
   static int anInt404;
   int anInt405 = -2081218561;
   LinkedHashMap aLinkedHashMap406 = new LinkedHashMap();
   static int anInt407 = -1924448428;
   boolean aBool409;
   static RSInterface aClass116_Sub15_410;
   static int anInt411;


   Class29() {
      this.method581(true, (byte)-43);
   }

   Class29(Packet var1) {
      if(null != var1 && null != var1.payload) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 >= 0 && var3 <= -322571907 * anInt407) {
            if(var1.readSignedByte(1708176767) == 1) {
               this.aBool403 = true;
            }

            if(var3 > 1) {
               this.aBool409 = var1.readSignedByte(1708176767) == 1;
            }

            if(var3 > 3) {
               this.anInt405 = var1.readSignedByte(1708176767) * -2081218561;
            }

            if(var3 > 2) {
               int var2 = var1.readSignedByte(1708176767);

               for(int var4 = 0; var4 < var2; ++var4) {
                  int var6 = var1.readInt(-1709286290);
                  int var5 = var1.readInt(-503595812);
                  this.aLinkedHashMap406.put(Integer.valueOf(var6), Integer.valueOf(var5));
               }
            }
         } else {
            this.method581(true, (byte)-53);
         }
      } else {
         this.method581(true, (byte)-12);
      }

   }

   Packet method570(int var1) {
      Packet var2 = new Packet(100);
      var2.writeByte(anInt407 * -322571907, -344146179);
      var2.writeByte(!this.aBool403?0:1, -1898039904);
      var2.writeByte(this.aBool409?1:0, -836128620);
      var2.writeByte(this.anInt405 * -1207115777, -1176513525);
      var2.writeByte(this.aLinkedHashMap406.size(), 262957149);
      Iterator var4 = this.aLinkedHashMap406.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var3 = (Entry)var4.next();
         var2.writeInt(((Integer)var3.getKey()).intValue(), (byte)98);
         var2.writeInt(((Integer)var3.getValue()).intValue(), (byte)111);
      }

      return var2;
   }

   public static void executeOnStart(int var0, int var1) {
      if(-1 != var0) {
         if(Class116_Sub23_Sub2.loadInterface(var0, -1006212225)) {
            RSInterface[] var5 = RSInterface.mainInterfaceArray[var0];

            for(int var4 = 0; var4 < var5.length; ++var4) {
               RSInterface var3 = var5[var4];
               if(var3.onStartListener != null) {
                  Class116_Sub6 var2 = new Class116_Sub6();
                  var2.aClass116_Sub15_1736 = var3;
                  var2.anObjectArray1737 = var3.onStartListener;
                  Class63.parseScripts(var2, 2000000, 328786591);
               }
            }

         }
      }
   }

   void method581(boolean var1, byte var2) {}

   static final void method583(int var0) {
      for(Class116_Sub23_Sub16_Sub1 var1 = (Class116_Sub23_Sub16_Sub1)client.aClass117_2973.getFirst(); var1 != null; var1 = (Class116_Sub23_Sub16_Sub1)client.aClass117_2973.getNext()) {
         if(var1.anInt2572 * 1273709753 == -747958745 * GameInterface.anInt1819 && !var1.aBool2569) {
            if(client.anInt2943 * -1040073859 >= -301779367 * var1.anInt2561) {
               var1.method3094(-1163930299 * client.anInt3012, (byte)15);
               if(var1.aBool2569) {
                  var1.unlink();
               } else {
                  GameInterface.region.method356(1273709753 * var1.anInt2572, -668663027 * var1.anInt2563, 1843197595 * var1.anInt2564, 2033316957 * var1.anInt2565, 60, var1, 0, -1, false);
               }
            }
         } else {
            var1.unlink();
         }
      }

   }

   public static Class116_Sub23_Sub19_Sub4_Sub1 method584(RSIndex var0, RSIndex var1, String var2, String var3, int var4) {
      int var5 = var0.getFileIdForName(var2, -1356874345);
      int var7 = var0.method1367(var5, var3, 2106895846);
      Class116_Sub23_Sub19_Sub4_Sub1 var6;
      if(!Class41.method687(var0, var5, var7, -1938550685)) {
         var6 = null;
      } else {
         var6 = Ignore.method530(var1.getFiles(var5, var7, -177112173), -1564351986);
      }

      return var6;
   }

   static final void method585(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(Class116_Sub23_Sub2.loadInterface(var0, -1006212225)) {
         Class6.aClass116_Sub15Array98 = null;
         Class64.method937(RSInterface.mainInterfaceArray[var0], -1, var1, var2, var3, var4, var5, var6, var7, 1281193554);
         if(null != Class6.aClass116_Sub15Array98) {
            Class64.method937(Class6.aClass116_Sub15Array98, -1412584499, var1, var2, var3, var4, 316500889 * Class40.anInt523, -3174751 * Class86.anInt1016, var7, 153400043);
            Class6.aClass116_Sub15Array98 = null;
         }

      } else {
         if(-1 != var7) {
            client.aBoolArray3073[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.aBoolArray3073[var9] = true;
            }
         }

      }
   }

}
