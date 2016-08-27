package com.jagex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Hashtable;

public class Class90 {

   static File aFile1042;
   static boolean aBool1043 = false;
   static Hashtable aHashtable1044 = new Hashtable(16);

   public static void method1192(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(null != var1) {
            Throwable var4 = var1;
            String var6;
            if(var1 instanceof RuntimeException_Sub1) {
               RuntimeException_Sub1 var5 = (RuntimeException_Sub1)var1;
               var6 = var5.aString2847 + " | ";
               var4 = var5.aThrowable2851;
            } else {
               var6 = "";
            }

            StringWriter var19 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var19);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var19.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if(var11 == null) {
                  var6 = var6 + "| " + var10;
                  var3 = var6;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, var12 + 1);
               if(var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(var12 + 1, var13);
                  int var15 = var14.indexOf(".java:");
                  if(var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var6 = var6 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var6 = var6 + var11 + ' ';
            }
         }

         if(var0 != null) {
            if(null != var1) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if(Class58.gameApplet == null) {
            return;
         }

         URL var16 = new URL(Class58.gameApplet.getCodeBase(), "clienterror.ws?c=" + 1316357127 * client.anInt1646 + "&u=" + RuntimeException_Sub1.aString2849 + "&v1=" + SignLink.aString886 + "&v2=" + SignLink.aString882 + "&e=" + var3);
         DataInputStream var18 = new DataInputStream(var16.openStream());
         var18.read();
         var18.close();
      } catch (Exception var17) {
         ;
      }

   }

   Class90() throws Throwable {
      throw new Error();
   }
}
