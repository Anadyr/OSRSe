package com.jagex;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class29 {

   public static final int anInt401 = 128;
   static final int anInt402 = 10;
   boolean aBool403;
   static int anInt404;
   int anInt405 = -2081218561;
   LinkedHashMap aLinkedHashMap406 = new LinkedHashMap();
   static int anInt407 = -1924448428;
   static final int anInt408 = 40;
   boolean aBool409;
   static Class116_Sub15 aClass116_Sub15_410;
   static int anInt411;
   static final int anInt412 = 19136995;
   public static final int anInt413 = 98;
   static final int anInt414 = 1004;


   static void method569() {
      Class145 var0 = null;

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, true, -434477721);
         Buffer var1 = Class116_Sub5.aClass29_1727.method570(-1408669672);
         var0.method1832(var1.payload, 0, var1.position * -285147921, -899638705);
      } catch (Exception var3) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(1274549250);
         }
      } catch (Exception var2) {
         ;
      }

   }

   Class29() {
      this.method581(true, (byte)-43);
   }

   Class29(Buffer var1) {
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

   Buffer method570(int var1) {
      Buffer var2 = new Buffer(100);
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

   void method571(boolean var1) {}

   void method572(boolean var1) {}

   static void method573(int var0, int var1) {
      if(-1 != var0) {
         if(Class116_Sub23_Sub2.method2377(var0, -1006212225)) {
            Class116_Sub15[] var5 = Class116_Sub15.aClass116_Sub15ArrayArray1956[var0];

            for(int var4 = 0; var4 < var5.length; ++var4) {
               Class116_Sub15 var3 = var5[var4];
               if(var3.anObjectArray2004 != null) {
                  Class116_Sub6 var2 = new Class116_Sub6();
                  var2.aClass116_Sub15_1736 = var3;
                  var2.anObjectArray1737 = var3.anObjectArray2004;
                  Class63.method934(var2, 2000000, 328786591);
               }
            }

         }
      }
   }

   void method574(boolean var1) {}

   Buffer method575() {
      Buffer var1 = new Buffer(100);
      var1.writeByte(anInt407 * -322571907, -1646528150);
      var1.writeByte(this.aBool403?1:0, -1116508636);
      var1.writeByte(this.aBool409?1:0, 75282614);
      var1.writeByte(this.anInt405 * -1499954829, -100296143);
      var1.writeByte(this.aLinkedHashMap406.size(), -1523545011);
      Iterator var2 = this.aLinkedHashMap406.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeInt(((Integer)var3.getKey()).intValue(), (byte)79);
         var1.writeInt(((Integer)var3.getValue()).intValue(), (byte)112);
      }

      return var1;
   }

   static Class29 method576() {
      Class145 var0 = null;
      Class29 var1 = new Class29();

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, false, -818885993);
         byte[] var2 = new byte[(int)var0.method1813(-980664584)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method1811(var2, var3, var2.length - var3, 1613516628);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class29(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(-1346806182);
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   void method577(boolean var1) {}

   static Class29 method578() {
      Class145 var0 = null;
      Class29 var1 = new Class29();

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, false, -787276398);
         byte[] var2 = new byte[(int)var0.method1813(-980664584)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method1811(var2, var3, var2.length - var3, -1224365322);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class29(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(-1803312304);
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   static Class29 method579() {
      Class145 var0 = null;
      Class29 var1 = new Class29();

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, false, -1347452032);
         byte[] var2 = new byte[(int)var0.method1813(-980664584)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method1811(var2, var3, var2.length - var3, 311016262);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class29(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(414416534);
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   static Class29 method580() {
      Class145 var0 = null;
      Class29 var1 = new Class29();

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, false, -474593925);
         byte[] var2 = new byte[(int)var0.method1813(-980664584)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method1811(var2, var3, var2.length - var3, -910176750);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class29(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(1256556389);
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   void method581(boolean var1, byte var2) {}

   static Class29 method582() {
      Class145 var0 = null;
      Class29 var1 = new Class29();

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, false, 321426090);
         byte[] var2 = new byte[(int)var0.method1813(-980664584)];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method1811(var2, var3, var2.length - var3, -1274743897);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new Class29(new Buffer(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(1678696639);
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   static final void method583(int var0) {
      for(Class116_Sub23_Sub16_Sub1 var1 = (Class116_Sub23_Sub16_Sub1)client.aClass117_2973.method1551(); var1 != null; var1 = (Class116_Sub23_Sub16_Sub1)client.aClass117_2973.method1553()) {
         if(var1.anInt2572 * 1273709753 == -747958745 * Class116_Sub11.anInt1819 && !var1.aBool2569) {
            if(client.anInt2943 * -1040073859 >= -301779367 * var1.anInt2561) {
               var1.method3094(-1163930299 * client.anInt3012, (byte)15);
               if(var1.aBool2569) {
                  var1.unlink();
               } else {
                  Class116_Sub11.groundItemController.method356(1273709753 * var1.anInt2572, -668663027 * var1.anInt2563, 1843197595 * var1.anInt2564, 2033316957 * var1.anInt2565, 60, var1, 0, -1, false);
               }
            }
         } else {
            var1.unlink();
         }
      }

   }

   public static Class116_Sub23_Sub19_Sub4_Sub1 method584(Class99 var0, Class99 var1, String var2, String var3, int var4) {
      int var5 = var0.method1366(var2, -1356874345);
      int var7 = var0.method1367(var5, var3, 2106895846);
      Class116_Sub23_Sub19_Sub4_Sub1 var6;
      if(!Class41.method687(var0, var5, var7, -1938550685)) {
         var6 = null;
      } else {
         var6 = Class24.method530(var1.method1394(var5, var7, -177112173), -1564351986);
      }

      return var6;
   }

   static final void method585(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(Class116_Sub23_Sub2.method2377(var0, -1006212225)) {
         Class6.aClass116_Sub15Array98 = null;
         Class64.method937(Class116_Sub15.aClass116_Sub15ArrayArray1956[var0], -1, var1, var2, var3, var4, var5, var6, var7, 1281193554);
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

   static void method586() {
      Class145 var0 = null;

      try {
         var0 = Class40.method686("", client.aClass88_3039.aString1028, true, -2103683060);
         Buffer var1 = Class116_Sub5.aClass29_1727.method570(-1292719489);
         var0.method1832(var1.payload, 0, var1.position * 314639891, -400378703);
      } catch (Exception var3) {
         ;
      }

      try {
         if(null != var0) {
            var0.method1828(760924165);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
