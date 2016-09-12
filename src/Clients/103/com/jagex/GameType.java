package com.jagex;

public class GameType implements OrdinalInterface {

	public static final int anInt1036 = 19136776;
	static final int anInt1037 = 23;
	public static GameType aClass88_1033 = new GameType("oldscape", "RuneScape 2007", 5);
   static GameType aClass88_1029 = new GameType("stellardawn", "Stellar Dawn", 1);
   static GameType aClass88_1030 = new GameType("game3", "Game 3", 2);
   static GameType aClass88_1031 = new GameType("game4", "Game 4", 3);
   static GameType aClass88_1032 = new GameType("game5", "Game 5", 4);
   static GameType aClass88_1034 = new GameType("runescape", "RuneScape", 0);
	public String aString1028;
   int anInt1035;


	GameType(String var1, String var2, int var3) {
		this.aString1028 = var1;
		this.anInt1035 = 1757485313 * var3;
   }

   static final void method1177(Class116_Sub15[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Class116_Sub15 var6 = var0[var3];
         if(null != var6 && var6.anInt1944 * -1652479707 == var1 && (!var6.aBool1924 || !ISAAC.method806(var6, -1532620789))) {
            int var5;
            if(var6.anInt2018 * -1305917269 == 0) {
               if(!var6.aBool1924 && ISAAC.method806(var6, -1220311581) && ObjectDefinition.aClass116_Sub15_2240 != var6) {
                  continue;
               }

               method1177(var0, -1536575275 * var6.anInt1925, (byte)-4);
               if(null != var6.aClass116_Sub15Array1995) {
                  method1177(var6.aClass116_Sub15Array1995, var6.anInt1925 * -1536575275, (byte)-27);
               }

               Class116_Sub11 var4 = (Class116_Sub11)client.aClass127_3094.method1658((long)(-1536575275 * var6.anInt1925));
               if(var4 != null) {
                  var5 = 226793949 * var4.anInt1821;
                  if(Class116_Sub23_Sub2.method2377(var5, -1006212225)) {
                     method1177(Class116_Sub15.aClass116_Sub15ArrayArray1956[var5], -1, (byte)-5);
                  }
               }
            }

            if(var6.anInt2018 * -1305917269 == 6) {
               if(var6.anInt1991 * 467073769 != -1 || -1 != -213715327 * var6.anInt1971) {
                  boolean var8 = RuntimeException_Sub1.method3448(var6, -2056067154);
                  if(var8) {
                     var5 = var6.anInt1971 * -213715327;
                  } else {
                     var5 = 467073769 * var6.anInt1991;
                  }

                  if(-1 != var5) {
                     Class116_Sub23_Sub4 var7 = Class116_Sub8.method1946(var5, -193577063);

                     for(var6.anInt1919 += client.anInt3012 * -1534081229; -688156249 * var6.anInt1919 > var7.anIntArray2255[627142311 * var6.anInt2045]; Class79.method1097(var6, 396822855)) {
                        var6.anInt1919 -= var7.anIntArray2255[627142311 * var6.anInt2045] * 228853271;
                        var6.anInt2045 += -589211369;
                        if(627142311 * var6.anInt2045 >= var7.anIntArray2247.length) {
                           var6.anInt2045 -= var7.anInt2251 * 1846825653;
                           if(var6.anInt2045 * 627142311 < 0 || 627142311 * var6.anInt2045 >= var7.anIntArray2247.length) {
                              var6.anInt2045 = 0;
                           }
                        }
                     }
                  }
               }

               if(var6.anInt1970 * -2109049187 != 0 && !var6.aBool1924) {
                  int var9 = var6.anInt1970 * -2109049187 >> 16;
                  var5 = -2109049187 * var6.anInt1970 << 16 >> 16;
                  var9 *= -1163930299 * client.anInt3012;
                  var5 *= client.anInt3012 * -1163930299;
                  var6.anInt1935 = (175924351 * var6.anInt1935 + var9 & 2047) * 1055873919;
                  var6.anInt2057 = -478470667 * (var5 + 745334365 * var6.anInt2057 & 2047);
                  Class79.method1097(var6, -1701353924);
               }
            }
         }
      }

   }

   static final void method1178(int var0) {
      client.anInt3151 = 0;
	   int var2 = (1272643751 * Class79.aPlayer_909.anInt2609 >> 7) + Class116_Sub17.clickX * 1426698711;
	   int var1 = (Class79.aPlayer_909.anInt2579 * -1801433343 >> 7) + Class33.clickY * 714823515;
	   if(var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.anInt3151 = 450862527;
      }

      if(var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.anInt3151 = 450862527;
      }

      if(client.anInt3151 * 198136383 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.anInt3151 = 0;
      }

   }

	public int method34() {
		return -2121406141 * this.anInt1035;
	}

	public int getDrawId(int var1) {
		return 1118824193 * this.anInt1035;
	}

	public int method30() {
		return 1118824193 * this.anInt1035;
	}

	public int method33() {
		return 1118824193 * this.anInt1035;
	}

	public int method32() {
		return 1118824193 * this.anInt1035;
   }
}
