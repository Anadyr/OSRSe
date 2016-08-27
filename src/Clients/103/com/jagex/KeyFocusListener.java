package com.jagex;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyFocusListener implements KeyListener, FocusListener {

	static SignlinkNode gameSocket, wlSocket;
	static int[] keyCodes = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86,
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
	static int anInt938 = 0;
	public static int[] anIntArray940 = new int[128];
	public static boolean[] keysHeldDown = new boolean[112];
	static int[] anIntArray949 = new int[128];
	static int anInt950 = 0;
	static int anInt951 = 0;
	static char[] aCharArray952 = new char[128];
	static int[] anIntArray953 = new int[128];
	static int anInt956 = 0;
	static int anInt958 = 0;
	public static volatile int anInt959 = 0;
	public static int anInt960 = 0;
	public static KeyFocusListener aClass82_962 = new KeyFocusListener();

	public final synchronized void keyPressed(KeyEvent key) {
		if (aClass82_962 != null) {
			anInt959 = 0;
			int value = key.getKeyCode();
			if (value >= 0 && value < keyCodes.length) {
				value = keyCodes[value];
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
			if (var2 >= 0 && var2 < keyCodes.length) {
				var2 = keyCodes[var2] & -129;
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

	static final void method1128(int var0, int var1) {
		if (var0 >= 0) {
			int var2 = client.anIntArray3076[var0];
			int var3 = client.anIntArray2932[var0];
			int var4 = client.anIntArray3037[var0];
			int var5 = client.anIntArray3079[var0];
			String var6 = client.aStringArray3080[var0];
			String var7 = client.aStringArray3184[var0];
			ReflectionNode.method2340(var2, var3, var4, var5, var6, var7, -2040065729 * Class85.clickAreaX,
                    2090526775 * Class85.clickAreaY, 865031734);
		}
	}
}
