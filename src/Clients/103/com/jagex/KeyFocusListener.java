package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyFocusListener implements KeyListener, FocusListener {

	static final int anInt929 = 22;
	public static final int anInt930 = 13;
	static final int anInt931 = 56;
	static final int anInt932 = 18;
	static Class72 aClass72_933;
	static final int anInt934 = 6;
	static final int anInt935 = 8;
	static int[] anIntArray936 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86,
			-1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1,
			-1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52,
			53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231,
			227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1,
			-1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	static final int anInt937 = 2;
	static int anInt938 = 0;
	static final int anInt939 = 20;
	public static int[] anIntArray940 = new int[128];
	static final int anInt941 = 32;
	static final int anInt942 = 34;
	static final int anInt943 = 39;
	static final int anInt944 = 42;
	static final int anInt945 = 52;
	static final int anInt946 = 55;
	static final int anInt947 = 88;
	public static boolean[] keysHeldDown = new boolean[112];
	static int[] anIntArray949 = new int[128];
	static int anInt950 = 0;
	static int anInt951 = 0;
	static char[] aCharArray952 = new char[128];
	static int[] anIntArray953 = new int[128];
	static final int anInt954 = 3;
	static final int anInt955 = 1;
	static int anInt956 = 0;
	public static final int anInt957 = 216;
	static int anInt958 = 0;
	public static volatile int anInt959 = 0;
	public static int anInt960 = 0;
	static final int anInt961 = 9;
	public static KeyFocusListener aClass82_962 = new KeyFocusListener();
	static final int anInt963 = 10;
	static final int anInt964 = 5;

	public final synchronized void keyPressed(KeyEvent key) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int value = key.getKeyCode();
			if (value >= 0 && value < anIntArray936.length) {
				value = anIntArray936[value];
				if (0 != (value & 128)) {
					value = -1;
				}
			} else {
				value = -1;
			}

			if (1397604687 * anInt951 >= 0 && value >= 0) {
				anIntArray949[1397604687 * anInt951] = value;
				anInt951 = (1 + 1397604687 * anInt951 & 127) * -434850385;
				if (1246538247 * anInt950 == anInt951 * 1397604687) {
					anInt951 = 434850385;
				}
			}

			int modifier;
			if (value >= 0) {
				modifier = -1444135991 * anInt938 + 1 & 127;
				if (anInt956 * -103725771 != modifier) {
					anIntArray953[-1444135991 * anInt938] = value;
					aCharArray952[anInt938 * -1444135991] = 0;
					anInt938 = modifier * -1017328007;
				}
			}

			modifier = key.getModifiers();
			if (0 != (modifier & 10) || value == 85 || 10 == value) {
				key.consume();
			}
		}

	}

	public static void method1109() {
		if (Class74.aString886.toLowerCase().indexOf("microsoft") != -1) {
			anIntArray936[186] = 57;
			anIntArray936[187] = 27;
			anIntArray936[188] = 71;
			anIntArray936[189] = 26;
			anIntArray936[190] = 72;
			anIntArray936[191] = 73;
			anIntArray936[192] = 58;
			anIntArray936[219] = 42;
			anIntArray936[220] = 74;
			anIntArray936[221] = 43;
			anIntArray936[222] = 59;
			anIntArray936[223] = 28;
		} else {
			anIntArray936[44] = 71;
			anIntArray936[45] = 26;
			anIntArray936[46] = 72;
			anIntArray936[47] = 73;
			anIntArray936[59] = 57;
			anIntArray936[61] = 27;
			anIntArray936[91] = 42;
			anIntArray936[92] = 74;
			anIntArray936[93] = 43;
			anIntArray936[192] = 28;
			anIntArray936[222] = 58;
			anIntArray936[520] = 59;
		}

	}

	public static void method1110(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(aClass82_962);
		var0.addFocusListener(aClass82_962);
	}

	public final void keyTyped(KeyEvent var1) {
		if (null != aClass82_962) {
			char var3 = var1.getKeyChar();
			if (var3 != 0 && var3 != '\uffff') {
				boolean var2;
				if ((var3 <= 0 || var3 >= 128) && (var3 < 160 || var3 > 255)) {
					label68: {
						if (0 != var3) {
							char[] var6 = Class97.aCharArray1374;

							for (int var4 = 0; var4 < var6.length; ++var4) {
								char var5 = var6[var4];
								if (var5 == var3) {
									var2 = true;
									break label68;
								}
							}
						}

						var2 = false;
					}
				} else {
					var2 = true;
				}

				if (var2) {
					int var7 = 1 + -1444135991 * anInt938 & 127;
					if (var7 != anInt956 * -103725771) {
						anIntArray953[-1444135991 * anInt938] = -1;
						aCharArray952[-1444135991 * anInt938] = var3;
						anInt938 = -1017328007 * var7;
					}
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (null != aClass82_962) {
			anInt951 = 434850385;
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray936.length) {
				var2 = anIntArray936[var2] & -129;
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var2 >= 0) {
				anIntArray949[anInt951 * 1397604687] = ~var2;
				anInt951 = -434850385 * (1 + 1397604687 * anInt951 & 127);
				if (1397604687 * anInt951 == 1246538247 * anInt950) {
					anInt951 = 434850385;
				}
			}
		}

		var1.consume();
	}

	public static void method1111() {
		if (Class74.aString886.toLowerCase().indexOf("microsoft") != -1) {
			anIntArray936[186] = 57;
			anIntArray936[187] = 27;
			anIntArray936[188] = 71;
			anIntArray936[189] = 26;
			anIntArray936[190] = 72;
			anIntArray936[191] = 73;
			anIntArray936[192] = 58;
			anIntArray936[219] = 42;
			anIntArray936[220] = 74;
			anIntArray936[221] = 43;
			anIntArray936[222] = 59;
			anIntArray936[223] = 28;
		} else {
			anIntArray936[44] = 71;
			anIntArray936[45] = 26;
			anIntArray936[46] = 72;
			anIntArray936[47] = 73;
			anIntArray936[59] = 57;
			anIntArray936[61] = 27;
			anIntArray936[91] = 42;
			anIntArray936[92] = 74;
			anIntArray936[93] = 43;
			anIntArray936[192] = 28;
			anIntArray936[222] = 58;
			anIntArray936[520] = 59;
		}

	}

	public final synchronized void method1112(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray936.length) {
				var2 = anIntArray936[var2] & -129;
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var2 >= 0) {
				anIntArray949[anInt951 * 1397604687] = ~var2;
				anInt951 = -434850385 * (1 + -1650537585 * anInt951 & 127);
				if (28107630 * anInt951 == -523908864 * anInt950) {
					anInt951 = 434850385;
				}
			}
		}

		var1.consume();
	}

	public static void method1113(Component var0) {
		var0.removeKeyListener(aClass82_962);
		var0.removeFocusListener(aClass82_962);
		anInt951 = 434850385;
	}

	public static void method1114() {
		if (Class74.aString886.toLowerCase().indexOf("microsoft") != -1) {
			anIntArray936[-1487930535] = -2001425166;
			anIntArray936[1961773233] = 27;
			anIntArray936[188] = -240323794;
			anIntArray936[189] = 26;
			anIntArray936[190] = 330351257;
			anIntArray936[191] = -772752088;
			anIntArray936[192] = 596602486;
			anIntArray936[739566128] = 42;
			anIntArray936[-2058338792] = 74;
			anIntArray936[221] = 43;
			anIntArray936[222] = -546285756;
			anIntArray936[-2084914163] = 28;
		} else {
			anIntArray936[369954478] = 71;
			anIntArray936[1426665531] = 26;
			anIntArray936[1660573208] = -948558714;
			anIntArray936[386087604] = 489527567;
			anIntArray936[59] = 57;
			anIntArray936[-44276467] = 27;
			anIntArray936[760876855] = 42;
			anIntArray936[-1638002593] = 440990876;
			anIntArray936[93] = 43;
			anIntArray936[192] = 28;
			anIntArray936[496578992] = -19933925;
			anIntArray936[784992817] = 205111669;
		}

	}

	public static void method1115(Component var0) {
		var0.removeKeyListener(aClass82_962);
		var0.removeFocusListener(aClass82_962);
		anInt951 = 434850385;
	}

	public static void method1116() {
		KeyFocusListener var0 = aClass82_962;
		synchronized (var0) {
			anInt959 += -1567102369;
			anInt956 = -1719539323 * anInt958;
			anInt960 = 0;
			int var1;
			if (1397604687 * anInt951 < 0) {
				for (var1 = 0; var1 < -836334541; ++var1) {
					keysHeldDown[var1] = false;
				}

				anInt951 = -557529230 * anInt950;
			} else {
				while (anInt950 * -1198783506 != 1397604687 * anInt951) {
					var1 = anIntArray949[1620586386 * anInt950];
					anInt950 = 591554189 * (1 + 1246538247 * anInt950 & 127);
					if (var1 < 0) {
						keysHeldDown[~var1] = false;
					} else {
						if (!keysHeldDown[var1] && 1701596051 * anInt960 < anIntArray940.length - 1) {
							anIntArray940[(anInt960 += -1710647516) * 83904234 - 1] = var1;
						}

						keysHeldDown[var1] = true;
					}
				}
			}

			anInt958 = -1548916671 * anInt938;
		}
	}

	public static void method1117() {
		KeyFocusListener var0 = aClass82_962;
		synchronized (var0) {
			anInt959 += 2055192291;
			anInt956 = -1719539323 * anInt958;
			anInt960 = 0;
			int var1;
			if (1397604687 * anInt951 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					keysHeldDown[var1] = false;
				}

				anInt951 = -1859441207 * anInt950;
			} else {
				while (anInt950 * 1246538247 != 1397604687 * anInt951) {
					var1 = anIntArray949[1246538247 * anInt950];
					anInt950 = 1502651319 * (1 + 1246538247 * anInt950 & 127);
					if (var1 < 0) {
						keysHeldDown[~var1] = false;
					} else {
						if (!keysHeldDown[var1] && 1701596051 * anInt960 < anIntArray940.length - 1) {
							anIntArray940[(anInt960 += -2027189605) * 1701596051 - 1] = var1;
						}

						keysHeldDown[var1] = true;
					}
				}
			}

			anInt958 = -1548916671 * anInt938;
		}
	}

	public final synchronized void method1118(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var3 = var1.getKeyCode();
			if (var3 >= 0 && var3 < anIntArray936.length) {
				var3 = anIntArray936[var3];
				if (0 != (var3 & 128)) {
					var3 = -1;
				}
			} else {
				var3 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var3 >= 0) {
				anIntArray949[1397604687 * anInt951] = var3;
				anInt951 = (1 + 1397604687 * anInt951 & 106217155) * 1716976562;
				if (1246538247 * anInt950 == anInt951 * 1397604687) {
					anInt951 = 434850385;
				}
			}

			int var2;
			if (var3 >= 0) {
				var2 = -138533071 * anInt938 + 1 & 568854930;
				if (anInt956 * -103725771 != var2) {
					anIntArray953[80279179 * anInt938] = var3;
					aCharArray952[anInt938 * -1444135991] = 0;
					anInt938 = var2 * -1017328007;
				}
			}

			var2 = var1.getModifiers();
			if (0 != (var2 & 10) || var3 == 503656148 || 10 == var3) {
				var1.consume();
			}
		}

	}

	public final synchronized void method1119(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var3 = var1.getKeyCode();
			if (var3 >= 0 && var3 < anIntArray936.length) {
				var3 = anIntArray936[var3];
				if (0 != (var3 & 128)) {
					var3 = -1;
				}
			} else {
				var3 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var3 >= 0) {
				anIntArray949[1397604687 * anInt951] = var3;
				anInt951 = (1 + 1397604687 * anInt951 & 127) * -434850385;
				if (1246538247 * anInt950 == anInt951 * 1397604687) {
					anInt951 = 434850385;
				}
			}

			int var2;
			if (var3 >= 0) {
				var2 = -1444135991 * anInt938 + 1 & 127;
				if (anInt956 * -103725771 != var2) {
					anIntArray953[-1444135991 * anInt938] = var3;
					aCharArray952[anInt938 * -1444135991] = 0;
					anInt938 = var2 * -1017328007;
				}
			}

			var2 = var1.getModifiers();
			if (0 != (var2 & 10) || var3 == 85 || 10 == var3) {
				var1.consume();
			}
		}

	}

	public final synchronized void method1120(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray936.length) {
				var2 = anIntArray936[var2] & 1141741786;
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var2 >= 0) {
				anIntArray949[anInt951 * 1397604687] = ~var2;
				anInt951 = -1474475791 * (1 + -1758674606 * anInt951 & -1587146298);
				if (1187466907 * anInt951 == 1246538247 * anInt950) {
					anInt951 = 434850385;
				}
			}
		}

		var1.consume();
	}

	public final synchronized void method1121(KeyEvent var1) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray936.length) {
				var2 = anIntArray936[var2] & -129;
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt951 >= 0 && var2 >= 0) {
				anIntArray949[anInt951 * 1397604687] = ~var2;
				anInt951 = -434850385 * (1 + 1397604687 * anInt951 & 127);
				if (1397604687 * anInt951 == 1246538247 * anInt950) {
					anInt951 = 434850385;
				}
			}
		}

		var1.consume();
	}

	public static void method1122() {
		if (Class74.aString886.toLowerCase().indexOf("microsoft") != -1) {
			anIntArray936[186] = 57;
			anIntArray936[187] = 27;
			anIntArray936[188] = 71;
			anIntArray936[189] = 26;
			anIntArray936[190] = 72;
			anIntArray936[191] = 73;
			anIntArray936[192] = 58;
			anIntArray936[219] = 42;
			anIntArray936[220] = 74;
			anIntArray936[221] = 43;
			anIntArray936[222] = 59;
			anIntArray936[223] = 28;
		} else {
			anIntArray936[44] = 71;
			anIntArray936[45] = 26;
			anIntArray936[46] = 72;
			anIntArray936[47] = 73;
			anIntArray936[59] = 57;
			anIntArray936[61] = 27;
			anIntArray936[91] = 42;
			anIntArray936[92] = 74;
			anIntArray936[93] = 43;
			anIntArray936[192] = 28;
			anIntArray936[222] = 58;
			anIntArray936[520] = 59;
		}

	}

	public final void method1123(KeyEvent var1) {
		if (null != aClass82_962) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff') {
				boolean var6;
				if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
					label68: {
						if (0 != var2) {
							char[] var4 = Class97.aCharArray1374;

							for (int var3 = 0; var3 < var4.length; ++var3) {
								char var5 = var4[var3];
								if (var5 == var2) {
									var6 = true;
									break label68;
								}
							}
						}

						var6 = false;
					}
				} else {
					var6 = true;
				}

				if (var6) {
					int var7 = 1 + -1444135991 * anInt938 & 127;
					if (var7 != anInt956 * -103725771) {
						anIntArray953[-1444135991 * anInt938] = -1;
						aCharArray952[-1444135991 * anInt938] = var2;
						anInt938 = -1017328007 * var7;
					}
				}
			}
		}

		var1.consume();
	}

	public final void method1124(FocusEvent var1) {
	}

	public final void method1125(FocusEvent var1) {
	}

	public final synchronized void method1126(FocusEvent var1) {
		if (null != aClass82_962) {
			anInt951 = 434850385;
		}

	}

	public final synchronized void method1127(FocusEvent var1) {
		if (null != aClass82_962) {
			anInt951 = 434850385;
		}

	}

	static final void method1128(int var0, int var1) {
		if (var0 >= 0) {
			int var2 = client.anIntArray3076[var0];
			int var3 = client.anIntArray2932[var0];
			int var4 = client.anIntArray3037[var0];
			int var5 = client.anIntArray3079[var0];
			String var6 = client.aStringArray3080[var0];
			String var7 = client.aStringArray3184[var0];
			ReflectionNode.method2340(var2, var3, var4, var5, var6, var7, -2040065729 * Class85.anInt998,
                    2090526775 * Class85.anInt999, 865031734);
		}
	}
}
