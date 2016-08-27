package com.jagex;

/**
 * Dunno what else to call this,
 * holds worldId clanrank, and all the username details.
 * For Clan/Friends
 */
public class PlayerAlias extends Node {

   int worldId;
   byte clanRank;
   String clanRankIcon, username;

   public static Class116_Sub23_Sub7 method1936(int var0, byte var1) {
      Class116_Sub23_Sub7 var2 = (Class116_Sub23_Sub7)Class116_Sub23_Sub7.aClass123_2288.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub7.aRSIndex_2290.getFiles(15, var0, -477188595);
         var2 = new Class116_Sub23_Sub7();
         if(var3 != null) {
            var2.method2504(new Packet(var3), -1960327759);
         }

         Class116_Sub23_Sub7.aClass123_2288.method1633(var2, (long)var0);
         return var2;
      }
   }

    static boolean aBool1756;
    protected static int anInt1758;
}
