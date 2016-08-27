package com.jagex;
import java.io.File;
import java.io.RandomAccessFile;

public class Class116_Sub23_Sub7 extends NodeContainer {

   static Class123 aClass123_2288 = new Class123(64);
   protected static int anInt2289;
   public static RSIndex aRSIndex_2290;
   static byte[][][] aByteArrayArrayArray2291;
   public boolean aBool2294 = false;


   void method2504(Packet var1, int var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2505(var1, var3, -442685267);
      }
   }

   void method2505(Packet var1, int var2, int var3) {
      if(var2 == 2) {
         this.aBool2294 = true;
      }

   }

   public static void method2510(int var0) {
      while(true) {
         Deque var1 = CacheWorker.aClass117_1414;
         Class116_Sub16 var2;
         synchronized(var1) {
            var2 = (Class116_Sub16) CacheWorker.aClass117_1413.removeFirst();
         }

         if(null == var2) {
            return;
         }

         var2.aCacheIndex_2063.method2228(var2.aRSIndexTable_2062, (int)var2.hashId, var2.aByteArray2066, false, 845312457);
      }
   }

   public static void method2513(RSIndex var0, RSIndex var1, RSIndex var2, int var3) {
      Class116_Sub23_Sub4.aRSIndex_2264 = var0;
      Class116_Sub23_Sub4.aRSIndex_2243 = var1;
      Class116_Sub23_Sub4.aRSIndex_2244 = var2;
   }

   static File loadFile(String filename, int var1) {
      if(!Class90.aBool1043) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)Class90.aHashtable1044.get(filename);
         if(var2 != null) {
            return var2;
         } else {
            File var3 = new File(Class90.aFile1042, filename);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if(!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  Class90.aHashtable1044.put(filename, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if(null != var4) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

}
