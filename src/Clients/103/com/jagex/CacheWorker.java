package com.jagex;

public class CacheWorker implements Runnable {

   static Deque aClass117_1413 = new Deque();
   static Deque aClass117_1414 = new Deque();
   public static int anInt1415 = 0;
   public static Object anObject1416 = new Object();
   static Timer aTimer_1418;
   static int anInt1419;

   public void run() {
      try {
         while(true) {
            Deque var1 = aClass117_1414;
            Class116_Sub16 var2;
            synchronized(var1) {
               var2 = (Class116_Sub16)aClass117_1414.getFirst();
            }

            Object var14;
            if(var2 != null) {
               if(0 == var2.anInt2064 * 1215410337) {
                  var2.aRSIndexTable_2062.method1034((int)var2.hashId, var2.aByteArray2066, var2.aByteArray2066.length, 1284101660);
                  var1 = aClass117_1414;
                  synchronized(var1) {
                     var2.unlink();
                  }
               } else if(1 == 1215410337 * var2.anInt2064) {
                  var2.aByteArray2066 = var2.aRSIndexTable_2062.getFile((int) var2.hashId, 416443930);
                  var1 = aClass117_1414;
                  synchronized(var1) {
                     aClass117_1413.addLast(var2);
                  }
               }

               var14 = anObject1416;
               synchronized(var14) {
                  if(anInt1415 * 1638013353 <= 1) {
                     anInt1415 = 0;
                     anObject1416.notifyAll();
                     return;
                  }

                  anInt1415 = 1666340504;
               }
            } else {
               Friend.sleep(100L);
               var14 = anObject1416;
               synchronized(var14) {
                  if(anInt1415 * 1638013353 <= 1) {
                     anInt1415 = 0;
                     anObject1416.notifyAll();
                     return;
                  }

                  anInt1415 -= 9935513;
               }
            }
         }
      } catch (Exception var13) {
         Class90.method1192((String)null, var13, 343294798);
      }
   }

}
