package com.jagex;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.URL;

public class SignLink implements Runnable {

   Interface2 anInterface2_881;
   static String aString882;
   Thread aThread883;
   SignlinkNode aClass72_884 = null;
   boolean aBool885 = false;
   static String aString886;
   SignlinkNode aClass72_887 = null;
   EventQueue anEventQueue888;

   public final void run() {
      while(true) {
         SignlinkNode var2;
         synchronized(this) {
            while(true) {
               if(this.aBool885) {
                  return;
               }

               if(null != this.aClass72_884) {
                  var2 = this.aClass72_884;
                  this.aClass72_884 = this.aClass72_884.aClass72_863;
                  if(null == this.aClass72_884) {
                     this.aClass72_887 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }
         }

         try {
            int var1 = 980815541 * var2.anInt861;
            if(1 == var1) {
               var2.anObject869 = new java.net.Socket(InetAddress.getByName((String)var2.anObject868), var2.anInt867);
            } else if(2 == var1) {
               Thread var3 = new Thread((Runnable)var2.anObject868);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var2.anInt867);
               var2.anObject869 = var3;
            } else if(var1 == 4) {
               var2.anObject869 = new DataInputStream(((URL)var2.anObject868).openStream());
            } else if(var1 == 3) {
               String var9 = (var2.anInt867 >> 24 & 255) + "." + (var2.anInt867 >> 16 & 255) + "." + (var2.anInt867 >> 8 & 255) + "." + (var2.anInt867 & 255);
               var2.anObject869 = InetAddress.getByName(var9).getHostName();
            }

            var2.anInt866 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var2.anInt866 = 2;
         }
      }
   }

   final SignlinkNode method1044(int var1, int var2, int var3, Object var4, byte var5) {
      SignlinkNode var6 = new SignlinkNode();
      var6.anInt861 = 589754269 * var1;
      var6.anInt867 = var2;
      var6.anObject868 = var4;
      synchronized(this) {
         if(this.aClass72_887 != null) {
            this.aClass72_887.aClass72_863 = var6;
            this.aClass72_887 = var6;
         } else {
            this.aClass72_887 = this.aClass72_884 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final SignlinkNode workAddress(int var1, int var2) {
      return this.method1044(3, var1, 0, (Object)null, (byte)123);
   }

   public final SignlinkNode createDataStream(URL var1, byte var2) {
      return this.method1044(4, 0, 0, var1, (byte)63);
   }

   public final Interface2 method1049(byte var1) {
      return this.anInterface2_881;
   }

   public final SignlinkNode socket(String address, int port, byte var3) {
      return this.method1044(1, port, 0, address, (byte)125);
   }

   final void method1061(byte var1) {
      synchronized(this) {
         this.aBool885 = true;
         this.notifyAll();
      }

      try {
         this.aThread883.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public final SignlinkNode method1063(Runnable var1, int var2, int var3) {
      return this.method1044(2, var2, 0, var1, (byte)28);
   }

   SignLink() {
      aString886 = "Unknown";
      aString882 = "1.1";

      try {
         aString886 = System.getProperty("java.vendor");
         aString882 = System.getProperty("java.version");
      } catch (Exception var3) {
         ;
      }

      try {
         this.anEventQueue888 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var2) {
         ;
      }

      this.aBool885 = false;
      this.aThread883 = new Thread(this);
      this.aThread883.setPriority(10);
      this.aThread883.setDaemon(true);
      this.aThread883.start();
   }

   public static int method1075(int var0, int var1) {
      return var0 >> 11 & 63;
   }

   public static String method1076(int var0, short var1) {
      return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
   }
}
