package com.jagex;

public class Class100 {

   static char[] aCharArray1401 = new char[64];
   static Sprite[] cross;
   static int[] anIntArray1403;
   static char[] aCharArray1404;

   Class100() throws Throwable {
      throw new Error();
   }

   static void method1427(World var0, int var1) {
      if(var0.method537('\uffff') != client.aBool2936) {
         client.aBool2936 = var0.method537('\uffff');
         boolean var2 = var0.method537('\uffff');
         if(var2 != Class107.aBool1456) {
            Class116_Sub23_Sub11.aClass123_2356.method1635();
            Class116_Sub23_Sub11.aClass123_2357.method1635();
            Class116_Sub23_Sub11.aClass123_2376.method1635();
            Class107.aBool1456 = var2;
         }
      }

      World.aString386 = var0.address;
      client.anInt3115 = var0.worldId * 2027760217;
      client.anInt2933 = 1096175283 * var0.activityFlag;
      Class94.port = -767343703 * (1082541889 * client.anInt3020 == 0?'\uaa4a':'\u9c40' + -145619359 * var0.worldId);
      Class51.anInt682 = 701960199 * (1082541889 * client.anInt3020 == 0?443:var0.worldId * -145619359 + '\uc350');
      Class29.anInt404 = 1439019167 * Class94.port;
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray1401[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray1401[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray1401[var0] = (char)(48 + var0 - 52);
      }

      aCharArray1401[62] = 43;
      aCharArray1401[63] = 47;
      aCharArray1404 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray1404[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray1404[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray1404[var0] = (char)(48 + var0 - 52);
      }

      aCharArray1404[62] = 42;
      aCharArray1404[63] = 45;
      anIntArray1403 = new int[128];

      for(var0 = 0; var0 < anIntArray1403.length; ++var0) {
         anIntArray1403[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         anIntArray1403[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         anIntArray1403[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         anIntArray1403[var0] = var0 - 48 + 52;
      }

      int[] var2 = anIntArray1403;
      anIntArray1403[43] = 62;
      var2[42] = 62;
      int[] var1 = anIntArray1403;
      anIntArray1403[47] = 63;
      var1[45] = 63;
   }
}
