package com.jagex;

public class Class70 {

   static Class17 aClass17_844;
   static Class99_Sub1 aClass99_Sub1_847;

   Class70() throws Throwable {
      throw new Error();
   }

   static void method996(int var0, Class73 var1, Class99_Sub1 var2, int var3) {
      byte[] var4 = null;
      Class117 var5 = Class102.aClass117_1414;
      synchronized(var5) {
         Class116_Sub16 var6 = (Class116_Sub16)Class102.aClass117_1414.method1551();

         while(var6 != null) {
            if(var6.nodeId != (long)var0 || var6.aClass73_2062 != var1 || 1215410337 * var6.anInt2064 != 0) {
               var6 = (Class116_Sub16)Class102.aClass117_1414.method1553();
            } else {
               var4 = var6.aByteArray2066;
               break;
            }
         }
      }

      if(var4 != null) {
         var2.method2228(var1, var0, var4, true, -1331767415);
      } else {
         byte[] var9 = var1.method1033(var0, -1529493978);
         var2.method2228(var1, var0, var9, true, 126184079);
      }
   }

   static final void method997(short var0) {
      int[] var1 = Class7.anIntArray108;

      int var3;
      for(var3 = 0; var3 < -334270159 * Class7.anInt107; ++var3) {
         Player var2 = client.globalPlayers[var1[var3]];
         if(null != var2 && -346063939 * var2.anInt2598 > 0) {
            var2.anInt2598 -= -1208281195;
            if(-346063939 * var2.anInt2598 == 0) {
               var2.forceChatString = null;
            }
         }
      }

      for(var3 = 0; var3 < 727116725 * client.npcCount; ++var3) {
         int var5 = client.npcIndicies[var3];
         Mob var4 = client.aMobArray2972[var5];
         if(var4 != null && -346063939 * var4.anInt2598 > 0) {
            var4.anInt2598 -= -1208281195;
            if(var4.anInt2598 * -346063939 == 0) {
               var4.forceChatString = null;
            }
         }
      }

   }

   static Class method999(String var0, int var1) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }
}
