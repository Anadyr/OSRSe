package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class Class26 {

   static final int anInt357 = 64;
   static final int anInt358 = 47;
   public static final int anInt359 = 8;
   static final int anInt360 = 1000;
   static BigInteger aBigInteger361 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static BigInteger aBigInteger362 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final int anInt363 = 4;
   static BuildType aClass87_364;
   static int anInt365;
   static final String aString366 = "m=accountappeal/login.ws";
   static final String aString367 = "services";
   public static final int anInt368 = 37;
   static final String aString369 = "passwordchoice.ws";


   Class26() throws Throwable {
      throw new Error();
   }

   static long method534() {
      try {
         URL var0 = new URL(Class45.method713("services", false, 497802578) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(-1146305973);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.payload, var4.position * 314639891, 1000 - 1360342224 * var4.position);
            if(-1 == var5) {
               var4.position = 0;
               long var6 = var4.readLong((byte) -39);
               return var6;
            }

            var4.position += var5 * 705688380;
         } while(var4.position * 314639891 < 1000);

         return 0L;
      } catch (Exception var8) {
         return 0L;
      }
   }

   static void method535(int var0, byte var1) {
      if(-1 == var0 && !client.aBool3159) {
         Class128.aClass116_Sub4_Sub4_1576.method3075(143263271);
         Class128.anInt1574 = 325298615;
         Class128.aClass99_1575 = null;
      } else if(var0 != -1 && var0 != client.anInt3172 * 850867613 && 0 != client.anInt3171 * -1994948003 && !client.aBool3159) {
         Class99_Sub1 var3 = Class2.aClass99_Sub1_23;
         int var2 = client.anInt3171 * -1994948003;
         Class128.anInt1574 = 325298615;
         Class128.aClass99_1575 = var3;
         Class112.anInt1485 = 18032949 * var0;
         Class129.anInt1581 = 0;
         Class128.anInt1579 = 827167249 * var2;
         Class55.aBool715 = false;
         Class128.anInt1577 = 622425606;
      }

      client.anInt3172 = var0 * -277612363;
   }
}
