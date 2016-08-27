package com.jagex;

public class ClanRank {

   static ClanRank aClass143_1635 = new ClanRank(6, 1, "", "");
   public static ClanRank aClass143_1636 = new ClanRank(8, 0, "", "");
   static ClanRank aClass143_1637 = new ClanRank(7, 2, "", "");
   static ClanRank aClass143_1638 = new ClanRank(0, 4, "", "");
   static ClanRank aClass143_1639 = new ClanRank(3, 3, "", "");
   public static ClanRank aClass143_1643 = new ClanRank(1, -1, "", "", true, new ClanRank[]{aClass143_1636, aClass143_1635, aClass143_1637, aClass143_1638, aClass143_1639});
   public int anInt1644;
   String aString1645;


   ClanRank(int var1, int var2, String var3, String var4, boolean var5, ClanRank[] var6) {
      this.anInt1644 = 2122450793 * var1;
      this.aString1645 = var4;
   }

   public String toString() {
      return this.aString1645;
   }

   ClanRank(int var1, int var2, String var3, String var4) {
      this.anInt1644 = var1 * 2122450793;
      this.aString1645 = var4;
   }
}
