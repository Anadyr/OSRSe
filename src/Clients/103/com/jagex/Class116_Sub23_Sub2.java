package com.jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class116_Sub23_Sub2 extends NodeContainer {

   public static int anInt2175;
   static Class123 aClass123_2177 = new Class123(64);
	static Class116_Sub17 aClass116_Sub17_2186;
	static Class99 aClass99_2187;
   public int anInt2178 = 188525871;
	public boolean aBool2185 = false;
   int[] anIntArray2179;
   short[] aShortArray2180;
   int[] anIntArray2181 = new int[]{-1, -1, -1, -1, -1};
   short[] aShortArray2182;
   short[] aShortArray2183;
   short[] aShortArray2184;

   static final void decodeNpcAdditions(int var0) {
      for(int var1 = 0; var1 < -143667549 * client.npcFlagCount; ++var1) {
         int var3 = client.pendingNpcFlags[var1];
         Mob var4 = client.aMobArray2972[var3];
         int var2 = client.bitBuffer.readSignedByte(1708176767);
         if(0 != (var2 & 4)) {
            var4.forceChatString = client.bitBuffer.readString(61376769);
            var4.anInt2598 = -569035212;
         }

         if(0 != (var2 & 16)) {
            var4.anInt2603 = client.bitBuffer.readLEShort((byte) -96) * 1611414733;
            if(734924805 * var4.anInt2603 == '\uffff') {
               var4.anInt2603 = -1611414733;
            }
         }

         int var5;
         int var6;
         int var7;
         if((var2 & 1) != 0) {
            var6 = client.bitBuffer.readLEShortA(-2071246787);
            var5 = client.bitBuffer.readShortA(-338860511);
	         var7 = var4.anInt2609 * 1272643751 - (var6 - 1426698711 * Class116_Sub17.clickX - Class116_Sub17.clickX * 1426698711) * 64;
	         int var8 = var4.anInt2579 * -1801433343 - (var5 - 714823515 * Class33.clickY - Class33.clickY * 714823515) * 64;
	         if(0 != var7 || 0 != var8) {
	            var4.faceDirection = ((int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 2047) * -316267887;
	         }
         }

         if((var2 & 64) != 0) {
            var6 = client.bitBuffer.readByteS((byte) -35);
            var5 = client.bitBuffer.readByteA((byte) -1);
            var4.method3102(var6, var5, -1040073859 * client.anInt2943, 52643890);
            var4.anInt2600 = 568824035 * client.anInt2943 + -1453430444;
            var4.anInt2601 = client.bitBuffer.readLEShort((byte) -19) * -182432293;
            var4.anInt2602 = client.bitBuffer.readShort(2035754905) * 119158941;
         }

         if((var2 & 128) != 0) {
            var4.anInt2614 = client.bitBuffer.readLEShortA(-1875472717) * -1738418729;
            var6 = client.bitBuffer.readInt(-2048148009);
            var4.anInt2589 = (var6 >> 16) * 878509897;
            var4.anInt2617 = 1621235571 * (client.anInt2943 * -1040073859 + (var6 & '\uffff'));
            var4.anInt2595 = 0;
            var4.anInt2616 = 0;
            if(489022907 * var4.anInt2617 > -1040073859 * client.anInt2943) {
               var4.anInt2595 = -1825378913;
            }

            if(1631645159 * var4.anInt2614 == '\uffff') {
               var4.anInt2614 = 1738418729;
            }
         }

         if((var2 & 32) != 0) {
            var6 = client.bitBuffer.readByteC(1591384393);
            var5 = client.bitBuffer.readSignedByte(1708176767);
            var4.method3102(var6, var5, -1040073859 * client.anInt2943, 1619799537);
            var4.anInt2600 = -1453430444 + 568824035 * client.anInt2943;
            var4.anInt2601 = client.bitBuffer.readLEShort((byte) -20) * -182432293;
            var4.anInt2602 = client.bitBuffer.readLEShort((byte) -76) * 119158941;
         }

         if(0 != (var2 & 8)) {
            var4.definition = Class116_Sub23_Sub15.method2705(client.bitBuffer.readLEShortA(-2078235842), -987634260);
            var4.anInt2582 = var4.definition.tileSize * 1447916577;
            var4.anInt2630 = var4.definition.anInt2333 * 506128019;
            var4.anInt2586 = -147360311 * var4.definition.anInt2316;
            var4.anInt2629 = var4.definition.anInt2315 * 404950129;
            var4.anInt2580 = 1055000573 * var4.definition.anInt2318;
            var4.anInt2615 = 985741173 * var4.definition.anInt2319;
            var4.anInt2639 = 1706784279 * var4.definition.anInt2335;
            var4.anInt2584 = var4.definition.anInt2314 * -1634865443;
            var4.anInt2585 = 118379263 * var4.definition.anInt2322;
         }

         if((var2 & 2) != 0) {
            var6 = client.bitBuffer.readShort(1738557930);
            if('\uffff' == var6) {
               var6 = -1;
            }

            var5 = client.bitBuffer.readByteA((byte) -1);
            if(-922607859 * var4.anInt2587 == var6 && -1 != var6) {
               var7 = Class116_Sub8.method1946(var6, -1164132528).anInt2260 * 972933669;
               if(1 == var7) {
                  var4.anInt2610 = 0;
                  var4.anInt2611 = 0;
                  var4.anInt2612 = 1583839217 * var5;
                  var4.anInt2637 = 0;
               }

               if(2 == var7) {
                  var4.anInt2637 = 0;
               }
            } else if(var6 == -1 || -1 == var4.anInt2587 * -922607859 || Class116_Sub8.method1946(var6, -1128772943).anInt2254 * -610992485 >= Class116_Sub8.method1946(-922607859 * var4.anInt2587, -1033165080).anInt2254 * -610992485) {
               var4.anInt2587 = -1587034171 * var6;
               var4.anInt2610 = 0;
               var4.anInt2611 = 0;
               var4.anInt2612 = 1583839217 * var5;
               var4.anInt2637 = 0;
               var4.anInt2636 = -2078876897 * var4.anInt2578;
            }
         }
      }

   }

   public static boolean method2377(int var0, int var1) {
      if(Class116_Sub15.aBoolArray1916[var0]) {
         return true;
      } else if(!Class116_Sub15.aClass99_1917.method1420(var0, -2055197806)) {
         return false;
      } else {
         int var2 = Class116_Sub15.aClass99_1917.method1361(var0, -824500445);
         if(var2 == 0) {
            Class116_Sub15.aBoolArray1916[var0] = true;
            return true;
         } else {
            if(Class116_Sub15.aClass116_Sub15ArrayArray1956[var0] == null) {
               Class116_Sub15.aClass116_Sub15ArrayArray1956[var0] = new Class116_Sub15[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if(null == Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3]) {
                  byte[] var4 = Class116_Sub15.aClass99_1917.method1394(var0, var3, 880707290);
                  if(null != var4) {
                     Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3] = new Class116_Sub15();
                     Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3].anInt1925 = ((var0 << 16) + var3) * 1463664765;
                     if(-1 == var4[0]) {
                        Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3].method2247(new Buffer(var4), (short)21739);
                     } else {
                        Class116_Sub15.aClass116_Sub15ArrayArray1956[var0][var3].method2290(new Buffer(var4), -2113186590);
                     }
                  }
               }
            }

            Class116_Sub15.aBoolArray1916[var0] = true;
            return true;
         }
      }
   }

   static final boolean method2384(Class116_Sub15 var0, int var1) {
      int var2 = -179718399 * var0.anInt2016;
      if(205 == var2) {
         client.anInt2987 = -453788862;
         return true;
      } else {
         int var3;
         int var4;
         if(var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.aClass108_3103.method1470(var3, 1 == var4, -1894925622);
         }

         if(var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.aClass108_3103.method1469(var3, var4 == 1, 523382462);
         }

         if(var2 == 324) {
            client.aClass108_3103.method1471(false, (short)31977);
         }

         if(325 == var2) {
            client.aClass108_3103.method1471(true, (short)31339);
         }

         if(var2 == 326) {
            client.rsaBuffer.startPacket(136, (byte) 18);
            client.aClass108_3103.method1472(client.rsaBuffer, 1321398775);
            return true;
         } else {
            return false;
         }
      }
   }

   static final void method2385(int var0, int var1, int var2, int var3, short var4) {
      for(int var5 = 0; var5 < -580551879 * client.anInt3136; ++var5) {
         if(client.anIntArray3143[var5] + client.anIntArray3141[var5] > var0 && client.anIntArray3141[var5] < var0 + var2 && client.anIntArray3144[var5] + client.anIntArray3142[var5] > var1 && client.anIntArray3142[var5] < var1 + var3) {
            client.aBoolArray3073[var5] = true;
         }
      }

   }

   public static int method2388(int var0, int var1, int var2, byte var3) {
      var2 &= 3;
      return var2 != 0?(1 == var2?var1:(2 == var2?7 - var0:7 - var1)):var0;
   }

   public static void doReflectionCheck(Buffer buffer, int var1, int var2) {

      ReflectionNode var3 = new ReflectionNode();
      var3.anInt2147 = buffer.readSignedByte(1708176767) * 669809141;
      var3.anInt2154 = buffer.readInt(-370243691) * 554885847;
      var3.anIntArray2148 = new int[var3.anInt2147 * -707810723];
      var3.anIntArray2149 = new int[var3.anInt2147 * -707810723];
      var3.aFieldArray2150 = new Field[-707810723 * var3.anInt2147];
      var3.anIntArray2151 = new int[-707810723 * var3.anInt2147];
      var3.aMethodArray2152 = new Method[-707810723 * var3.anInt2147];
      var3.aByteArrayArrayArray2153 = new byte[-707810723 * var3.anInt2147][][];

      for(int var4 = 0; var4 < -707810723 * var3.anInt2147; ++var4) {
         try {
            int var5 = buffer.readSignedByte(1708176767);
            String var6;
            String var7;
            int var8;
            if(0 != var5 && var5 != 1 && var5 != 2) {
               if(var5 == 3 || 4 == var5) {
                  var6 = buffer.readString(61376769);
                  var7 = buffer.readString(61376769);
                  var8 = buffer.readSignedByte(1708176767);
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = buffer.readString(61376769);
                  }

                  String var26 = buffer.readString(61376769);
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if(var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = buffer.readInt(-2069567333);
                        var11[var12] = new byte[var13];
                        buffer.readBytes(var11[var12], 0, var13, 1904549673);
                     }
                  }

                  var3.anIntArray2148[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = Class70.method999(var9[var13], -17385769);
                  }

                  Class var28 = Class70.method999(var26, 391605870);
                  if(Class70.method999(var6, -1361175768).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = Class70.method999(var6, -1432246650).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if(var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if(var27.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if(var27[var20] != var18[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if(var19 && var28 == var17.getReturnType()) {
                              var3.aMethodArray2152[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.aByteArrayArrayArray2153[var4] = var11;
               }
            } else {
               var6 = buffer.readString(61376769);
               var7 = buffer.readString(61376769);
               var8 = 0;
               if(1 == var5) {
                  var8 = buffer.readInt(-1028493527);
               }

               var3.anIntArray2148[var4] = var5;
               var3.anIntArray2151[var4] = var8;
               if(Class70.method999(var6, 210380416).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.aFieldArray2150[var4] = Class70.method999(var6, -1859598707).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.anIntArray2149[var4] = -1;
         } catch (SecurityException var22) {
            var3.anIntArray2149[var4] = -2;
         } catch (NullPointerException var23) {
            var3.anIntArray2149[var4] = -3;
         } catch (Exception var24) {
            var3.anIntArray2149[var4] = -4;
         } catch (Throwable var25) {
            var3.anIntArray2149[var4] = -5;
         }
      }

      client.aClass119_1617.method1590(var3);
   }

   static void method2390(int var0) {
      if(client.aBool3088) {
         Class116_Sub15 var1 = AbstractRSDrawing.method339(Class116_Sub23_Sub4.anInt2262 * -1195336111, 1149825709 * client.anInt3089, -1468537866);
         if(null != var1 && var1.anObjectArray2015 != null) {
            Class116_Sub6 var2 = new Class116_Sub6();
            var2.aClass116_Sub15_1736 = var1;
            var2.anObjectArray1737 = var1.anObjectArray2015;
            Friend.method1840(var2, -2005616795);
         }

         client.aBool3088 = false;
         Class79.method1097(var1, -4213207);
      }
   }

	public Model method2358(byte var1) {
		if (null == this.anIntArray2179) {
			return null;
		} else {
			Model[] var3 = new Model[this.anIntArray2179.length];

			for (int var4 = 0; var4 < this.anIntArray2179.length; ++var4) {
				var3[var4] = Model.method3114(client.aClass99_1618, this.anIntArray2179[var4], 0);
			}

			Model var5;
			if (var3.length == 1) {
				var5 = var3[0];
			} else {
				var5 = new Model(var3, var3.length);
			}

			int var2;
			if (this.aShortArray2180 != null) {
				for (var2 = 0; var2 < this.aShortArray2180.length; ++var2) {
					var5.method3125(this.aShortArray2180[var2], this.aShortArray2184[var2]);
				}
			}

			if (this.aShortArray2182 != null) {
				for (var2 = 0; var2 < this.aShortArray2182.length; ++var2) {
					var5.method3126(this.aShortArray2182[var2], this.aShortArray2183[var2]);
				}
			}

			return var5;
		}
	}

	void method2359(Buffer var1, int var2, byte var3) {
		if (var2 == 1) {
			this.anInt2178 = var1.readSignedByte(1708176767) * -188525871;
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.readSignedByte(1708176767);
				this.anIntArray2179 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.anIntArray2179[var5] = var1.readShort(2110343470);
				}
			} else if (3 == var2) {
				this.aBool2185 = true;
			} else if (var2 == 40) {
				var4 = var1.readSignedByte(1708176767);
				this.aShortArray2180 = new short[var4];
				this.aShortArray2184 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.aShortArray2180[var5] = (short) var1.readShort(-259159103);
					this.aShortArray2184[var5] = (short) var1.readShort(1243227009);
				}
			} else if (41 == var2) {
				var4 = var1.readSignedByte(1708176767);
				this.aShortArray2182 = new short[var4];
				this.aShortArray2183 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.aShortArray2182[var5] = (short) var1.readShort(1971325418);
					this.aShortArray2183[var5] = (short) var1.readShort(1072310901);
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.anIntArray2181[var2 - 60] = var1.readShort(1068775301);
			}
		}

	}

	public boolean method2360(int var1) {
		if (this.anIntArray2179 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.anIntArray2179.length; ++var3) {
				if (!client.aClass99_1618.method1373(this.anIntArray2179[var3], 0, (byte) 1)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	public Model method2363(int var1) {
		Model[] var2 = new Model[5];
		int var5 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (-1 != this.anIntArray2181[var4]) {
				var2[var5++] = Model.method3114(client.aClass99_1618, this.anIntArray2181[var4], 0);
			}
		}

		Model var6 = new Model(var2, var5);
		int var3;
		if (this.aShortArray2180 != null) {
			for (var3 = 0; var3 < this.aShortArray2180.length; ++var3) {
				var6.method3125(this.aShortArray2180[var3], this.aShortArray2184[var3]);
			}
		}

		if (this.aShortArray2182 != null) {
			for (var3 = 0; var3 < this.aShortArray2182.length; ++var3) {
				var6.method3126(this.aShortArray2182[var3], this.aShortArray2183[var3]);
			}
		}

		return var6;
	}

	void method2375(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readSignedByte(1708176767);
			if (var3 == 0) {
				return;
			}

			this.method2359(var1, var3, (byte) 20);
		}
	}

	public boolean method2387(int var1) {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (-1 != this.anIntArray2181[var3] && !client.aClass99_1618.method1373(this.anIntArray2181[var3], 0, (byte) 1)) {
				var2 = false;
			}
		}

		return var2;
   }
}
