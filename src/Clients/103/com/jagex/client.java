package com.jagex;

import java.awt.*;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;

import com.applet.Launcher;
import netscape.javascript.JSObject;

public final class client extends Applet_Sub1 {

	static int anInt2929 = 0;
	static client aclient2930;
	static boolean aBool2931 = false;
	static int[] anIntArray2932 = new int[500];
	static int anInt2933 = 0;
	static int anInt2934 = -2027276566;
	static RSInterface aClass116_Sub15_2935 = null;
	static boolean aBool2936 = false;
	static boolean aBool2937 = false;
	static int anInt2938 = 0;
	static String worldListAddress;
	static String aString2940;
	static short aShort2941 = 320;
	static int anInt2942 = 0;
	static int anInt2943 = 0;
	static long aLong2944 = -5938907264350207555L;
	static int anInt2945 = 834705573;
	static int anInt2946 = 0;
	static int anInt2947 = -1669020249;
	static boolean aBool2948 = true;
	static boolean aBool2949 = false;
	static int anInt2950 = 0;
	static int[] anIntArray2951 = new int[25];
	static int anInt2952 = 0;
	static int[] anIntArray2953 = new int[25];
	static int anInt2954 = 0;
	static CacheIndex aCacheIndex_2955;
	static int[] anIntArray2956 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
	static boolean aBool2957 = false;
	static int anInt2958 = 0;
	static int[] anIntArray2959 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	static int anInt2960 = 550236941;
	static final int anInt2961 = 16;
	static int anInt2962 = 0;
	static int anInt2963 = 0;
	static int[] anIntArray2964 = new int[50];
	static byte ourccrank;
	static long aLong2966 = 8084475441026814739L;
	static int anInt2967 = 0;
	static int anInt2968 = 0;
	static String aString2969 = null;
	static boolean[] aBoolArray2970 = new boolean[5];
	static int anInt2971 = 0;
	static Mob[] aMobArray2972 = new Mob['\u8000'];
	static Deque aClass117_2973 = new Deque();
	static int[] npcIndicies = new int['\u8000'];
	static long aLong2975 = 0L;
	static int[] pendingNpcFlags = new int[250];
	static PacketBuilder rsaBuffer = new PacketBuilder(5000);
	static int anInt2978 = 0;
	static PacketBuilder packetBuffer = new PacketBuilder(15000);
	static int packetLength = 0;
	static int currentOpcode = 0;
	static int anInt2982 = 0;
	static int anInt2983 = 0;
	static int anInt2984 = 0;
	static String aString2985 = "";
	static int anInt2986 = 0;
	static int anInt2987 = 0;
	static boolean aBool2988 = false;
	static Class116_Sub23_Sub19_Sub4_Sub1 aClass116_Sub23_Sub19_Sub4_Sub1_2989;
	static int anInt2990 = 0;
	static int anInt2991 = 0;
	static int anInt2992 = 0;
	static int anInt2993 = 693748815;
	static int anInt2994 = -943887744;
	static int[] regionIdArray;
	static Class58[] aClass58Array2996 = new Class58[4];
	static boolean dynamicRegion = false;
	static int[][][] anIntArrayArrayArray2998 = new int[4][13][13];
	static int[] anIntArray2999 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int anInt3001 = 1609074786;
	static int anInt3002 = 0;
	static int anInt3003 = 975522870;
	static int anInt3004 = 0;
	static int anInt3005 = 804940911;
	static int anInt3006 = 0;
	static int anInt3007 = 0;
	static int anInt3008 = 1760620982;
	static int anInt3009 = 0;
	static int anInt3010 = -2064007701;
	static int npcFlagCount = 0;
	static int anInt3012 = 0;
	static int anInt3013 = -1838575403;
	static int anInt3014 = 414781363;
	static int anInt3015 = 1653772723;
	static int anInt3016 = 1704404612;
	static boolean aBool3017 = false;
	static int anInt3018 = 0;
	static int[] anIntArray3019 = new int[50];
	static int anInt3020 = 0;
	static int anInt3021 = 0;
	static int anInt3022 = 0;
	static int anInt3023 = -2049146891;
	static int anInt3024 = 0;
	static int anInt3025 = 0;
	static int anInt3026 = 0;
	static boolean aBool3027 = false;
	static Deque aClass117_3028 = new Deque();
	static int anInt3029 = 0;
	static int anInt3030 = -2042425390;
	static int[] anIntArray3031 = new int[-475281231 * anInt3030];
	static int[] anIntArray3032 = new int[anInt3030 * -475281231];
	static int[] anIntArray3033 = new int[anInt3030 * -475281231];
	static int[] anIntArray3034 = new int[-475281231 * anInt3030];
	static int[] anIntArray3035 = new int[-475281231 * anInt3030];
	static int[] anIntArray3036 = new int[-475281231 * anInt3030];
	static int[] anIntArray3037 = new int[500];
	static String[] aStringArray3038 = new String[-475281231 * anInt3030];
	static GameType aClass88_3039;
	static int anInt3040 = 0;
	static int anInt3041 = -1776163475;
	static int anInt3042 = 192643311;
	static int anInt3043 = 0;
	static int anInt3044 = 0;
	static int anInt3045 = 0;
	static int anInt3046 = 0;
	static int anInt3047 = 0;
	static int anInt3048 = 0;
	static int anInt3049 = 0;
	static String currentCCName = null;
	static int anInt3051 = 0;
	static boolean aBool3052 = false;
	static boolean aBool3053 = false;
	static CacheIndex aCacheIndex_3054;
	static int anInt3055 = 0;
	static Player[] globalPlayers = new Player[2048];
	static int playerIndex = 313169887;
	static int membership = 0;
	static int anInt3059 = 0;
	static int[] pendingRemovalMobs = new int[1000];
	static int[] anIntArray3061 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
	static String[] aStringArray3062 = new String[8];
	static boolean[] aBoolArray3063 = new boolean[8];
	static int anInt3064 = 0;
	static int anInt3065 = 1929362559;
	static int anInt3066 = 0;
	static int loginStage = 0;
	static int anInt3068 = 0;
	static PacketBuilder loginBuffer = new PacketBuilder(5000);
	static int anInt3070 = 0;
	static Deque[][][] aClass117ArrayArrayArray3071 = new Deque[4][104][104];
	static int anInt3072 = 0;
	static boolean[] aBoolArray3073 = new boolean[100];
	static boolean aBool3074 = false;
	static int anInt3075 = 0;
	static int[] anIntArray3076 = new int[500];
	static int anInt3077 = 0;
	static int anInt3078 = 0;
	static int[] anIntArray3079 = new int[500];
	static String[] aStringArray3080 = new String[500];
	static int[][] anIntArrayArray3081 = new int[104][104];
	static int anInt3082 = 247064981;
	static int anInt3083 = 630066539;
	static int anInt3084 = 0;
	static short aShort3085 = 32767;
	static long aLong3086 = -3199879388585765537L;
	static int anInt3087 = 0;
	static boolean aBool3088 = false;
	static int anInt3089 = -1188249893;
	static int anInt3090 = -461597295;
	static int anInt3091 = 0;
	static int anInt3092 = 0;
	static int[] anIntArray3093 = new int[anInt3030 * -475281231];
	public static Hashtable overridedInterfaces = new Hashtable(8);
	static int anInt3095 = 0;
	static int anInt3096 = 0;
	static RSInterface aClass116_Sub15_3097 = null;
	static int anInt3098 = 0;
	static int anInt3099 = 0;
	static int playerRights = 0;
	static int anInt3101 = -218906203;
	static boolean[] aBoolArray3102 = new boolean[100];
	static Class108 aClass108_3103 = new Class108();
	static boolean aBool3104 = false;
	static int anInt3105 = 1739605141;
	static RSInterface aClass116_Sub15_3106 = null;
	static RSInterface aClass116_Sub15_3107 = null;
	static int[] anIntArray3108 = new int[25];
	static int anInt3109 = 0;
	static int anInt3110 = 0;
	static boolean aBool3111 = false;
	static int anInt3112 = 548999593;
	static int anInt3113 = 553751249;
	static boolean aBool3114 = false;
	static int anInt3115 = 1829549817;
	static int anInt3116 = -740381373;
	static boolean aBool3117 = false;
	static int anInt3118 = 44844977;
	static int[] anIntArray3119 = new int[32];
	static int anInt3120 = 0;
	static int[] anIntArray3121 = new int[32];
	static int anInt3122 = 0;
	static int[] anIntArray3123 = new int[32];
	static int anInt3124 = 0;
	static int anInt3125 = 0;
	static int anInt3126 = 0;
	static int anInt3127 = 0;
	static int anInt3128 = 0;
	static int anInt3129 = 0;
	static int[] anIntArray3130 = new int[128];
	static int anInt3131 = 0;
	static Deque aClass117_3132 = new Deque();
	static Deque aClass117_3133 = new Deque();
	static Deque aClass117_3134 = new Deque();
	static Hashtable aHashtable_3135 = new Hashtable(512);
	static int anInt3136 = 0;
	static int anInt3137 = 0;
	static Class43 aClass43_3138 = Class43.aClass43_577;
	static boolean[] aBoolArray3139 = new boolean[100];
	static boolean aBool3140 = true;
	static int[] anIntArray3141 = new int[100];
	static int[] anIntArray3142 = new int[100];
	static int[] anIntArray3143 = new int[100];
	static int[] anIntArray3144 = new int[100];
	static int anInt3145 = 0;
	static short aShort3146 = 256;
	static boolean aBool3147 = false;
	static int anInt3148 = 0;
	static int anInt3149 = -1238773265;
	static int anInt3150 = 0;
	static int anInt3151 = 0;
	static int anInt3152 = 0;
	static int anInt3153 = 416103202;
	static long[] msgUid = new long[100];
	static int anInt3155 = 0;
	static int anInt3156 = 0;
	static int anInt3157 = 0;
	static int[] anIntArray3158 = new int[128];
	static boolean aBool3159 = false;
	static int anInt3160 = -233464314;
	static String currentClanOwner = null;
	static Deque aClass117_3162 = new Deque();
	static int anInt3163 = -1008529911;
	static int anInt3164 = 0;
	static int[] anIntArray3165 = new int[1000];
	static int[] anIntArray3166 = new int[1000];
	static Sprite[] aClass116_Sub23_Sub19_Sub2Array3167 = new Sprite[1000];
	static int anInt3168 = 0;
	static Class43 aClass43_3169 = Class43.aClass43_577;
	static int anInt3170 = 0;
	static int anInt3171 = 1317704459;
	static int anInt3172 = 277612363;
	static int anInt3173 = 0;
	static int anInt3174 = 1632484343;
	static int anInt3175 = 1108213437;
	static int anInt3176 = 0;
	static int[] anIntArray3177 = new int[50];
	static int anInt3178 = 0;
	static int anInt3179 = 0;
	static int[] anIntArray3180 = new int[50];
	static Sounds[] aClass15Array3181 = new Sounds[50];
	static int loginStep = 0;
	static int anInt3183;
	static String[] aStringArray3184 = new String[500];
	static int[] anIntArray3185 = new int[5];
	static int[] anIntArray3186 = new int[5];
	static boolean aBool3187 = true;
	static int[] anIntArray3188 = new int[5];
	static int[] anIntArray3189 = new int[5];
	static short aShort3190 = 205;
	static short aShort3191 = 256;
	static String aString3192 = null;
	static short aShort3193 = 1;
	static int anInt3194 = 0;
	static short aShort3195 = 1;
	static short aShort3196 = 32767;
	static int anInt3197 = 0;
	static int anInt3198 = 0;
	static int npcCount = 0;
	static int anInt3200 = 605073011;
	static String aString3201 = null;
	static int anInt3202 = 1955793445;
	static int anInt3203 = 0;
	static RelationList[] aClass50Array3204 = new RelationList[400];
	static Queue friendList = new Queue();
	static int anInt3206 = 0;
	static Ignore[] aClass24Array3207 = new Ignore[400];
	static int anInt3208 = 0;
	static int anInt3209 = 1984302057;
	static RSInterface aClass116_Sub15_3210 = null;
	static Class135[] aClass135Array3211 = new Class135[8];
	static long aLong3212 = -2086566510266153657L;
	static int anInt3213 = -719576605;
	static Class59_Sub1 aClass59_Sub1_3214 = new Class59_Sub1();
	static int[] anIntArray3215 = new int[50];
	static int[] anIntArray3216 = new int[50];

	public final void init() {
		if (this.method3571(797241207)) {
			Class122[] var1 = new Class122[] { Class122.aClass122_1543, Class122.aClass122_1532,
					Class122.aClass122_1542, Class122.aClass122_1533, Class122.aClass122_1530, Class122.aClass122_1534,
					Class122.aClass122_1531, Class122.aClass122_1535, Class122.aClass122_1540, Class122.aClass122_1541,
					Class122.aClass122_1546, Class122.aClass122_1539, Class122.aClass122_1529, Class122.aClass122_1536,
					Class122.aClass122_1537 };
			Class122[] var2 = var1;

			for (int var3 = 0; var3 < var2.length; ++var3) {
				Class122 var4 = var2[var3];
				String var5 = this.getParameter(var4.aString1544);
				if (null != var5) {
					switch (Integer.parseInt(var4.aString1544)) {
					case 1:
						GameInterface.anInt1816 = Integer.parseInt(var5) * -1162103955;
						break;
					case 2:
						anInt2938 = Integer.parseInt(var5) * 2086765149;
						break;
					case 3:
						int var6 = Integer.parseInt(var5);
						BuildType[] var7 = Player.method3567(447274925);
						int var8 = 0;

						BuildType var10;
						while (true) {
							if (var8 >= var7.length) {
								var10 = null;
								break;
							}

							BuildType var9 = var7[var8];
							if (1156151357 * var9.anInt1025 == var6) {
								var10 = var9;
								break;
							}

							++var8;
						}

						Class26.aClass87_364 = var10;
						break;
					case 4:
						worldListAddress = var5;
					case 5:
					case 9:
					default:
						break;
					case 6:
						anInt3115 = Integer.parseInt(var5) * 1829549817;
						break;
					case 7:
						if (var5.equalsIgnoreCase(Class41.aString548)) {
							;
						}
						break;
					case 8:
						Class36.anInt488 = Integer.parseInt(var5) * -1960029413;
						break;
					case 10:
						anInt3020 = Integer.parseInt(var5) * -231061311;
						break;
					case 11:
						aClass88_3039 = (GameType) Class35.method646(RSInputStream.method1021(545495947),
								Integer.parseInt(var5), (byte) -9);
						if (GameType.aClass88_1033 == aClass88_3039) {
							Class59_Sub1.aClass143_1831 = ClanRank.aClass143_1636;
						} else {
							Class59_Sub1.aClass143_1831 = ClanRank.aClass143_1643;
						}
						break;
					case 12:
						if (var5.equalsIgnoreCase(Class41.aString548)) {
							aBool2936 = true;
						} else {
							aBool2936 = false;
						}
						break;
					case 13:
						aString2940 = var5;
						break;
					case 14:
						anInt2933 = Integer.parseInt(var5) * -580042991;
					}
				}
			}

			Class91.method1200(338654022);
			World.aString386 = this.getCodeBase().getHost();
			String var12 = Class26.aClass87_364.aString1024;
			byte var13 = 0;

			try {
				Class116_Sub8.method1945("oldschool", var12, var13, 16, (byte) 127);
			} catch (Exception var11) {
				Class90.method1192((String) null, var11, 343294798);
			}

			aclient2930 = this;
			this.method3586(765, 503, 103, 375026762);
		}
	}

	protected final void processFrames(int var1) {
		anInt2943 += 1724962261;
		this.method3677(-124609283);
		Class116_Sub23_Sub7.method2510(-838286722);

		int var2;
		try {
			if (-1587772409 * Class128.anInt1574 == 1) {
				var2 = Class128.aClass116_Sub4_Sub4_1576.method2995((short) -5187);
				if (var2 > 0 && Class128.aClass116_Sub4_Sub4_1576.method3000(-934008817)) {
					var2 -= Class128.anInt1577 * -621410389;
					if (var2 < 0) {
						var2 = 0;
					}

					Class128.aClass116_Sub4_Sub4_1576.method2994(var2, 1693883277);
				} else {
					Class128.aClass116_Sub4_Sub4_1576.method3075(903708083);
					Class128.aClass116_Sub4_Sub4_1576.method3017((byte) -42);
					if (null != Class128.aRSIndex_1575) {
						Class128.anInt1574 = 650597230;
					} else {
						Class128.anInt1574 = 0;
					}

					Class98.aClass116_Sub18_1381 = null;
					Class116_Sub23_Sub18.aClass14_2478 = null;
				}
			}
		} catch (Exception var80) {
			var80.printStackTrace();
			Class128.aClass116_Sub4_Sub4_1576.method3075(-777251838);
			Class128.anInt1574 = 0;
			Class98.aClass116_Sub18_1381 = null;
			Class116_Sub23_Sub18.aClass14_2478 = null;
			Class128.aRSIndex_1575 = null;
		}

		Class42.method695((byte) 57);
		Class38.method680((byte) -57);
		Class85 var81 = Class85.aClass85_987;
		synchronized (var81) {
			Class85.anInt994 = -1824690371 * Class85.anInt996;
			Class85.anInt991 = 52838135 * Class85.anInt995;
			Class85.anInt992 = 2128944719 * Class85.anInt989;
			Class85.anInt997 = Class85.anInt993 * 389487305;
			Class85.clickAreaX = 1773102805 * Class85.anInt1003;
			Class85.clickAreaY = Class85.anInt990 * 1659422169;
			Class85.aLong1000 = -1772624683215344831L * Class85.aLong985;
			Class85.anInt993 = 0;
		}

		if (Class32.aClass89_443 != null) {
			var2 = Class32.aClass89_443.method1182(1367062203);
			anInt3131 = 2085925489 * var2;
		}

		int i2;
		int value1;
		int value2;
		int clanRank;
		int var9;
		int col;
		int var11;
		int id;
		int var13;
		int var14;
		int var16;
		int var17;
		int var18;
		int availData;
		int value3;
		int var114;
		int var145;
		if (0 == 846055547 * loginStage) {
			Class31.method591(439256549);
			Class2.method38((short) 11776);
		} else if (loginStage * 846055547 == 5) {
			Class17.method280(this, -69862791);
			Class31.method591(-1772779177);
			Class2.method38((short) 11776);
		} else if (846055547 * loginStage != 10 && 846055547 * loginStage != 11) {
			if (846055547 * loginStage == 20) {
				Class17.method280(this, -69862791);
				Class69.processLogin((byte) 1);
			} else if (846055547 * loginStage == 25) {
				Class85.method1157(false, (byte) -117);
				anInt3078 = 0;
				boolean var82 = true;

				for (i2 = 0; i2 < Class8.aByteArrayArray127.length; ++i2) {
					if (Class80.anIntArray920[i2] != -1 && Class8.aByteArrayArray127[i2] == null) {
						Class8.aByteArrayArray127[i2] = Class59_Sub1.mapFileIndex
								.getFiles(Class80.anIntArray920[i2], 0, -1585901328);
						if (null == Class8.aByteArrayArray127[i2]) {
							var82 = false;
							anInt3078 += 1643775755;
						}
					}

					if (Class116_Sub23_Sub6.landscapeArray[i2] != -1
							&& null == Tile.mapBufferArray[i2]) {
						Tile.mapBufferArray[i2] = Class59_Sub1.mapFileIndex.getFileData(
                                Class116_Sub23_Sub6.landscapeArray[i2], 0,
                                Class116_Sub23_Sub17.reagionXTEAKeys[i2], 2124420900);
						if (null == Tile.mapBufferArray[i2]) {
							var82 = false;
							anInt3078 += 1643775755;
						}
					}
				}

				if (!var82) {
					anInt3091 = 2127768527;
				} else {
					anInt2992 = 0;
					var82 = true;

					for (i2 = 0; i2 < Class8.aByteArrayArray127.length; ++i2) {
						byte[] var4 = Tile.mapBufferArray[i2];
						if (var4 != null) {
							value1 = 64 * (regionIdArray[i2] >> 8) - Class116_Sub17.anInt2105 * 1426698711;
							value2 = 64 * (regionIdArray[i2] & 255) - Class33.anInt456 * 714823515;
							if (dynamicRegion) {
								value1 = 10;
								value2 = 10;
							}

							var82 &= Class25.method531(var4, value1, value2, (byte) 3);
						}
					}

					if (!var82) {
						anInt3091 = -39430242;
					} else {
						if (0 != anInt3091 * 252312367) {
							Class94.method1300(Class91.aString1056 + Class41.aString541 + Class41.aString540 + 100 + "%"
									+ Class41.aString543, true, 971123864);
						}

						Class42.method695((byte) 61);
						Timer.method1092((byte) -9);
						Class42.method695((byte) 121);
						GameInterface.region.clearTiles();
						Class42.method695((byte) 110);
						System.gc();

						for (i2 = 0; i2 < 4; ++i2) {
							aClass58Array2996[i2].method890(462555413);
						}

						for (i2 = 0; i2 < 4; ++i2) {
							for (availData = 0; availData < 104; ++availData) {
								for (value1 = 0; value1 < 104; ++value1) {
									Class47.aByteArrayArrayArray634[i2][availData][value1] = 0;
								}
							}
						}

						Class42.method695((byte) 113);
						Class47.anInt638 = 1869228033;
						client.aByteArrayArrayArray1614 = new byte[4][104][104];
						Class47.aByteArrayArrayArray626 = new byte[4][104][104];
						Class116_Sub23_Sub7.aByteArrayArrayArray2291 = new byte[4][104][104];
						Class60.aByteArrayArrayArray780 = new byte[4][104][104];
						Class47.anIntArrayArrayArray630 = new int[4][105][105];
						Class47.aByteArrayArrayArray627 = new byte[4][105][105];
						Class47.anIntArrayArray642 = new int[105][105];
						Speach.anIntArray981 = new int[104];
						Class62.anIntArray800 = new int[104];
						Class47.anIntArray629 = new int[104];
						Class101.anIntArray1409 = new int[104];
						Class116_Sub23_Sub18.anIntArray2486 = new int[104];
						i2 = Class8.aByteArrayArray127.length;

						for (Class116_Sub8 var84 = (Class116_Sub8) Class116_Sub8.aClass117_1779
								.getFirst(); var84 != null; var84 = (Class116_Sub8) Class116_Sub8.aClass117_1779
										.getNext()) {
							if (null != var84.aClass116_Sub4_Sub2_1775) {
								RelationList.aClass116_Sub4_Sub1_673.method2707(var84.aClass116_Sub4_Sub2_1775);
								var84.aClass116_Sub4_Sub2_1775 = null;
							}

							if (var84.aClass116_Sub4_Sub2_1780 != null) {
								RelationList.aClass116_Sub4_Sub1_673.method2707(var84.aClass116_Sub4_Sub2_1780);
								var84.aClass116_Sub4_Sub2_1780 = null;
							}
						}

						Class116_Sub8.aClass117_1779.clear();
						Class85.method1157(true, (byte) -66);
						if (!dynamicRegion) {
							byte[] var7;
							for (availData = 0; availData < i2; ++availData) {
								value1 = (regionIdArray[availData] >> 8) * 64 - 1426698711 * Class116_Sub17.anInt2105;
								value2 = 64 * (regionIdArray[availData] & 255) - Class33.anInt456 * 714823515;
								var7 = Class8.aByteArrayArray127[availData];
								if (var7 != null) {
									Class42.method695((byte) 49);
									Class106.method1459(var7, value1, value2, 1990031784 * Class22.anInt276 - 48,
											1403298904 * CacheWorker.anInt1419 - 48, aClass58Array2996, (byte) 1);
								}
							}

							for (availData = 0; availData < i2; ++availData) {
								value1 = (regionIdArray[availData] >> 8) * 64 - 1426698711 * Class116_Sub17.anInt2105;
								value2 = 64 * (regionIdArray[availData] & 255) - Class33.anInt456 * 714823515;
								var7 = Class8.aByteArrayArray127[availData];
								if (null == var7 && 1249154187 * CacheWorker.anInt1419 < 800) {
									Class42.method695((byte) 19);
									Class33.method637(value1, value2, 64, 64, 1719974944);
								}
							}

							Class85.method1157(true, (byte) 0);

							for (availData = 0; availData < i2; ++availData) {
								byte[] var87 = Tile.mapBufferArray[availData];
								if (var87 != null) {
									value2 = 64 * (regionIdArray[availData] >> 8) - Class116_Sub17.anInt2105 * 1426698711;
									value3 = 64 * (regionIdArray[availData] & 255) - 714823515 * Class33.anInt456;
									Class42.method695((byte) 57);
									Class31.method589(var87, value2, value3, GameInterface.region,
											aClass58Array2996, -1871600971);
								}
							}
						}

						int var19;
						int var21;
						int var22;
						int var23;
						int var24;
						int var27;
						int var29;
						int var30;
						int var31;
						int var32;
						if (dynamicRegion) {
							for (availData = 0; availData < 4; ++availData) {
								Class42.method695((byte) 4);

								for (value1 = 0; value1 < 13; ++value1) {
									for (value2 = 0; value2 < 13; ++value2) {
										boolean var90 = false;
										clanRank = anIntArrayArrayArray2998[availData][value1][value2];
										if (-1 != clanRank) {
											var9 = clanRank >> 24 & 3;
											col = clanRank >> 1 & 3;
											var11 = clanRank >> 14 & 1023;
											id = clanRank >> 3 & 2047;
											var13 = (var11 / 8 << 8) + id / 8;

											for (var14 = 0; var14 < regionIdArray.length; ++var14) {
												if (regionIdArray[var14] == var13
														&& null != Class8.aByteArrayArray127[var14]) {
													byte[] var15 = Class8.aByteArrayArray127[var14];
													var16 = value1 * 8;
													var17 = 8 * value2;
													var18 = 8 * (var11 & 7);
													var19 = (id & 7) * 8;
													Class58[] var20 = aClass58Array2996;

													for (var21 = 0; var21 < 8; ++var21) {
														for (var22 = 0; var22 < 8; ++var22) {
															if (var16 + var21 > 0 && var16 + var21 < 103
																	&& var22 + var17 > 0 && var22 + var17 < 103) {
																var20[availData].anIntArrayArray764[var21 + var16][var22
																		+ var17] &= -16777217;
															}
														}
													}

													Packet var151 = new Packet(var15);

													for (var22 = 0; var22 < 4; ++var22) {
														for (var23 = 0; var23 < 64; ++var23) {
															for (var24 = 0; var24 < 64; ++var24) {
																if (var9 == var22 && var23 >= var18 && var23 < 8 + var18
																		&& var24 >= var19 && var24 < 8 + var19) {
																	var27 = var16 + Class116_Sub23_Sub2.method2388(
																			var23 & 7, var24 & 7, col, (byte) 119);
																	var29 = var23 & 7;
																	var30 = var24 & 7;
																	var31 = col & 3;
																	if (var31 == 0) {
																		var32 = var30;
																	} else if (1 == var31) {
																		var32 = 7 - var29;
																	} else if (var31 == 2) {
																		var32 = 7 - var30;
																	} else {
																		var32 = var29;
																	}

																	Class141.method1795(var151, availData, var27,
																			var17 + var32, 0, 0, col, (byte) -1);
																} else {
																	Class141.method1795(var151, 0, -1, -1, 0, 0, 0,
																			(byte) 12);
																}
															}
														}
													}

													var90 = true;
													break;
												}
											}
										}

										if (!var90) {
											RSImageProducer.method1874(availData, value1 * 8, value2 * 8, -1427766149);
										}
									}
								}
							}

							for (availData = 0; availData < 13; ++availData) {
								for (value1 = 0; value1 < 13; ++value1) {
									value2 = anIntArrayArrayArray2998[0][availData][value1];
									if (value2 == -1) {
										Class33.method637(8 * availData, 8 * value1, 8, 8, 1382678139);
									}
								}
							}

							Class85.method1157(true, (byte) -22);

							for (availData = 0; availData < 4; ++availData) {
								Class42.method695((byte) 23);

								for (value1 = 0; value1 < 13; ++value1) {
									for (value2 = 0; value2 < 13; ++value2) {
										value3 = anIntArrayArrayArray2998[availData][value1][value2];
										if (value3 != -1) {
											clanRank = value3 >> 24 & 3;
											var9 = value3 >> 1 & 3;
											col = value3 >> 14 & 1023;
											var11 = value3 >> 3 & 2047;
											id = var11 / 8 + (col / 8 << 8);

											for (var13 = 0; var13 < regionIdArray.length; ++var13) {
												if (id == regionIdArray[var13]
														&& Tile.mapBufferArray[var13] != null) {
													Class107.method1465(Tile.mapBufferArray[var13],
															availData, value1 * 8, 8 * value2, clanRank, 8 * (col & 7),
															(var11 & 7) * 8, var9, GameInterface.region,
															aClass58Array2996, -422893524);
													break;
												}
											}
										}
									}
								}
							}
						}

						Class85.method1157(true, (byte) -88);
						Timer.method1092((byte) 19);
						Class42.method695((byte) 120);
						Region var92 = GameInterface.region;
						Class58[] var93 = aClass58Array2996;

						for (value2 = 0; value2 < 4; ++value2) {
							for (value3 = 0; value3 < 104; ++value3) {
								for (clanRank = 0; clanRank < 104; ++clanRank) {
									if ((Class47.aByteArrayArrayArray634[value2][value3][clanRank] & 1) == 1) {
										var9 = value2;
										if (2 == (Class47.aByteArrayArrayArray634[1][value3][clanRank] & 2)) {
											var9 = value2 - 1;
										}

										if (var9 >= 0) {
											var93[var9].method858(value3, clanRank, -1767893563);
										}
									}
								}
							}
						}

						Class47.anInt628 += ((int) (Math.random() * 5.0D) - 2) * 1676696543;
						if (Class47.anInt628 * -1833492449 < -8) {
							Class47.anInt628 = -528670456;
						}

						if (-1833492449 * Class47.anInt628 > 8) {
							Class47.anInt628 = 528670456;
						}

						Class47.anInt639 += ((int) (Math.random() * 5.0D) - 2) * 916560105;
						if (1969012569 * Class47.anInt639 < -16) {
							Class47.anInt639 = -1780059792;
						}

						if (1969012569 * Class47.anInt639 > 16) {
							Class47.anInt639 = 1780059792;
						}

						for (value2 = 0; value2 < 4; ++value2) {
							byte[][] var95 = Class47.aByteArrayArrayArray627[value2];
							var13 = (int) Math.sqrt(5100.0D);
							var14 = var13 * 768 >> 8;

							for (var114 = 1; var114 < 103; ++var114) {
								for (var16 = 1; var16 < 103; ++var16) {
									var17 = Class47.anIntArrayArrayArray635[value2][1 + var16][var114]
											- Class47.anIntArrayArrayArray635[value2][var16 - 1][var114];
									var18 = Class47.anIntArrayArrayArray635[value2][var16][1 + var114]
											- Class47.anIntArrayArrayArray635[value2][var16][var114 - 1];
									var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
									var145 = (var17 << 8) / var19;
									var21 = 65536 / var19;
									var22 = (var18 << 8) / var19;
									var23 = 96 + (var145 * -50 + var21 * -10 + -50 * var22) / var14;
									var24 = (var95[var16][var114 - 1] >> 2) + (var95[var16 - 1][var114] >> 2)
											+ (var95[var16 + 1][var114] >> 3) + (var95[var16][1 + var114] >> 3)
											+ (var95[var16][var114] >> 1);
									Class47.anIntArrayArray642[var16][var114] = var23 - var24;
								}
							}

							for (var114 = 0; var114 < 104; ++var114) {
								Speach.anIntArray981[var114] = 0;
								Class62.anIntArray800[var114] = 0;
								Class47.anIntArray629[var114] = 0;
								Class101.anIntArray1409[var114] = 0;
								Class116_Sub23_Sub18.anIntArray2486[var114] = 0;
							}

							for (var114 = -5; var114 < 109; ++var114) {
								for (var16 = 0; var16 < 104; ++var16) {
									var17 = 5 + var114;
									if (var17 >= 0 && var17 < 104) {
										var18 = client.aByteArrayArrayArray1614[value2][var17][var16] & 255;
										if (var18 > 0) {
											Flo var143 = GameInterface.method1974(var18 - 1,
                                                    -1048537678);
											Speach.anIntArray981[var16] += var143.anInt2299 * -389568753;
											Class62.anIntArray800[var16] += 1757454653 * var143.anInt2303;
											Class47.anIntArray629[var16] += var143.anInt2300 * 789203561;
											Class101.anIntArray1409[var16] += var143.anInt2304 * 837190867;
											++Class116_Sub23_Sub18.anIntArray2486[var16];
										}
									}

									var18 = var114 - 5;
									if (var18 >= 0 && var18 < 104) {
										var19 = client.aByteArrayArrayArray1614[value2][var18][var16] & 255;
										if (var19 > 0) {
											Flo var146 = GameInterface.method1974(var19 - 1,
                                                    -1533837593);
											Speach.anIntArray981[var16] -= var146.anInt2299 * -389568753;
											Class62.anIntArray800[var16] -= var146.anInt2303 * 1757454653;
											Class47.anIntArray629[var16] -= 789203561 * var146.anInt2300;
											Class101.anIntArray1409[var16] -= 837190867 * var146.anInt2304;
											--Class116_Sub23_Sub18.anIntArray2486[var16];
										}
									}
								}

								if (var114 >= 1 && var114 < 103) {
									var16 = 0;
									var17 = 0;
									var18 = 0;
									var19 = 0;
									var145 = 0;

									for (var21 = -5; var21 < 109; ++var21) {
										var22 = 5 + var21;
										if (var22 >= 0 && var22 < 104) {
											var16 += Speach.anIntArray981[var22];
											var17 += Class62.anIntArray800[var22];
											var18 += Class47.anIntArray629[var22];
											var19 += Class101.anIntArray1409[var22];
											var145 += Class116_Sub23_Sub18.anIntArray2486[var22];
										}

										var23 = var21 - 5;
										if (var23 >= 0 && var23 < 104) {
											var16 -= Speach.anIntArray981[var23];
											var17 -= Class62.anIntArray800[var23];
											var18 -= Class47.anIntArray629[var23];
											var19 -= Class101.anIntArray1409[var23];
											var145 -= Class116_Sub23_Sub18.anIntArray2486[var23];
										}

										if (var21 >= 1 && var21 < 103 && (!aBool2937
												|| 0 != (Class47.aByteArrayArrayArray634[0][var114][var21] & 2)
												|| (Class47.aByteArrayArrayArray634[value2][var114][var21] & 16) == 0)) {
											if (value2 < Class47.anInt638 * -1263368093) {
												Class47.anInt638 = value2 * -241419957;
											}

											var24 = client.aByteArrayArrayArray1614[value2][var114][var21] & 255;
											int var25 = Class47.aByteArrayArrayArray626[value2][var114][var21] & 255;
											if (var24 > 0 || var25 > 0) {
												int var26 = Class47.anIntArrayArrayArray635[value2][var114][var21];
												var27 = Class47.anIntArrayArrayArray635[value2][var114 + 1][var21];
												int var28 = Class47.anIntArrayArrayArray635[value2][var114 + 1][var21
														+ 1];
												var32 = Class47.anIntArrayArrayArray635[value2][var114][var21 + 1];
												var29 = Class47.anIntArrayArray642[var114][var21];
												var30 = Class47.anIntArrayArray642[1 + var114][var21];
												var31 = Class47.anIntArrayArray642[1 + var114][var21 + 1];
												int var33 = Class47.anIntArrayArray642[var114][1 + var21];
												int var34 = -1;
												int var35 = -1;
												int var36;
												int var37;
												if (var24 > 0) {
													var36 = 256 * var16 / var19;
													var37 = var17 / var145;
													int var38 = var18 / var145;
													var34 = RSFIT.method1035(var36, var37, var38, 599723067);
													var36 = var36 + Class47.anInt628 * -1833492449 & 255;
													var38 += 1969012569 * Class47.anInt639;
													if (var38 < 0) {
														var38 = 0;
													} else if (var38 > 255) {
														var38 = 255;
													}

													var35 = RSFIT.method1035(var36, var37, var38, 508398812);
												}

												if (value2 > 0) {
													boolean var179 = true;
													if (0 == var24
															&& 0 != Class116_Sub23_Sub7.aByteArrayArrayArray2291[value2][var114][var21]) {
														var179 = false;
													}

													if (var25 > 0
															&& !Class9.method193(var25 - 1, (byte) -1).aBool2412) {
														var179 = false;
													}

													if (var179 && var26 == var27 && var26 == var28 && var26 == var32) {
														Class47.anIntArrayArrayArray630[value2][var114][var21] |= 2340;
													}
												}

												var36 = 0;
												if (var35 != -1) {
													var36 = Texture.anIntArray2714[Class98
															.method1344(var35, 96, (byte) 15)];
												}

												if (0 == var25) {
													var92.method350(value2, var114, var21, 0, 0, -1, var26, var27, var28,
															var32, Class98.method1344(var34, var29, (byte) 15),
															Class98.method1344(var34, var30, (byte) 15),
															Class98.method1344(var34, var31, (byte) 15),
															Class98.method1344(var34, var33, (byte) 15), 0, 0, 0, 0,
															var36, 0);
												} else {
													var37 = 1
															+ Class116_Sub23_Sub7.aByteArrayArrayArray2291[value2][var114][var21];
													byte var180 = Class60.aByteArrayArrayArray780[value2][var114][var21];
													Class116_Sub23_Sub12 var39 = Class9.method193(var25 - 1, (byte) -1);
													int var40 = var39.anInt2405 * 1261368579;
													int var41;
													int var42;
													int var43;
													int var44;
													if (var40 >= 0) {
														var41 = Texture.anInterface3_2718
																.method15(var40, -1299505992);
														var42 = -1;
													} else if (var39.anInt2409 * 2024508145 == 16711935) {
														var42 = -2;
														var40 = -1;
														var41 = -2;
													} else {
														var42 = RSFIT.method1035(-491020635 * var39.anInt2414,
                                                                var39.anInt2407 * -958248725,
                                                                1921798311 * var39.anInt2413, 1107209710);
														var43 = Class47.anInt628 * -1833492449
																+ -491020635 * var39.anInt2414 & 255;
														var44 = Class47.anInt639 * 1969012569
																+ var39.anInt2413 * 1921798311;
														if (var44 < 0) {
															var44 = 0;
														} else if (var44 > 255) {
															var44 = 255;
														}

														var41 = RSFIT.method1035(var43, -958248725 * var39.anInt2407,
                                                                var44, 79641394);
													}

													var43 = 0;
													if (-2 != var41) {
														var43 = Texture.anIntArray2714[Class39
																.method684(var41, 96, -1278133570)];
													}

													if (-1 != -105977311 * var39.anInt2410) {
														var44 = var39.anInt2408 * -478500885
																+ -1833492449 * Class47.anInt628 & 255;
														int var45 = Class47.anInt639 * 1969012569
																+ var39.anInt2411 * 1172182871;
														if (var45 < 0) {
															var45 = 0;
														} else if (var45 > 255) {
															var45 = 255;
														}

														var41 = RSFIT.method1035(var44, -285023507 * var39.anInt2415,
                                                                var45, 1688802341);
														var43 = Texture.anIntArray2714[Class39
																.method684(var41, 96, -198695545)];
													}

													var92.method350(value2, var114, var21, var37, var180, var40, var26,
															var27, var28, var32,
															Class98.method1344(var34, var29, (byte) 15),
															Class98.method1344(var34, var30, (byte) 15),
															Class98.method1344(var34, var31, (byte) 15),
															Class98.method1344(var34, var33, (byte) 15),
															Class39.method684(var42, var29, -509009018),
															Class39.method684(var42, var30, 1438849737),
															Class39.method684(var42, var31, -286019781),
															Class39.method684(var42, var33, -610464029), var36, var43);
												}
											}
										}
									}
								}
							}

							for (var114 = 1; var114 < 103; ++var114) {
								for (var16 = 1; var16 < 103; ++var16) {
									var92.method440(value2, var16, var114,
											RuntimeException_Sub1.method3446(value2, var16, var114, -431635258));
								}
							}

							client.aByteArrayArrayArray1614[value2] = (byte[][]) null;
							Class47.aByteArrayArrayArray626[value2] = (byte[][]) null;
							Class116_Sub23_Sub7.aByteArrayArrayArray2291[value2] = (byte[][]) null;
							Class60.aByteArrayArrayArray780[value2] = (byte[][]) null;
							Class47.aByteArrayArrayArray627[value2] = (byte[][]) null;
						}

						var92.method466(-50, -10, -50);

						for (value2 = 0; value2 < 104; ++value2) {
							for (value3 = 0; value3 < 104; ++value3) {
								if ((Class47.aByteArrayArrayArray634[1][value2][value3] & 2) == 2) {
									var92.method376(value2, value3);
								}
							}
						}

						value2 = 1;
						value3 = 2;
						clanRank = 4;

						for (var9 = 0; var9 < 4; ++var9) {
							if (var9 > 0) {
								value2 <<= 3;
								value3 <<= 3;
								clanRank <<= 3;
							}

							for (col = 0; col <= var9; ++col) {
								for (var11 = 0; var11 <= 104; ++var11) {
									for (id = 0; id <= 104; ++id) {
										short var147;
										if ((Class47.anIntArrayArrayArray630[col][id][var11] & value2) != 0) {
											var13 = var11;
											var14 = var11;
											var114 = col;

											for (var16 = col; var13 > 0
													&& (Class47.anIntArrayArrayArray630[col][id][var13 - 1]
															& value2) != 0; --var13) {
												;
											}

											while (var14 < 104
													&& (Class47.anIntArrayArrayArray630[col][id][var14 + 1]
															& value2) != 0) {
												++var14;
											}

											label3175: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if (0 == (Class47.anIntArrayArrayArray630[var114 - 1][id][var17]
															& value2)) {
														break label3175;
													}
												}

												--var114;
											}

											label3186: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class47.anIntArrayArrayArray630[1 + var16][id][var17]
															& value2) == 0) {
														break label3186;
													}
												}

												++var16;
											}

											var17 = (var16 + 1 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var147 = 240;
												var19 = Class47.anIntArrayArrayArray635[var16][id][var13] - var147;
												var145 = Class47.anIntArrayArrayArray635[var114][id][var13];
												Region.method408(var9, 1, 128 * id, 128 * id, var13 * 128,
                                                        128 + 128 * var14, var19, var145);

												for (var21 = var114; var21 <= var16; ++var21) {
													for (var22 = var13; var22 <= var14; ++var22) {
														Class47.anIntArrayArrayArray630[var21][id][var22] &= ~value2;
													}
												}
											}
										}

										if ((Class47.anIntArrayArrayArray630[col][id][var11] & value3) != 0) {
											var13 = id;
											var14 = id;
											var114 = col;

											for (var16 = col; var13 > 0
													&& 0 != (Class47.anIntArrayArrayArray630[col][var13 - 1][var11]
															& value3); --var13) {
												;
											}

											while (var14 < 104
													&& 0 != (Class47.anIntArrayArrayArray630[col][var14 + 1][var11]
															& value3)) {
												++var14;
											}

											label3224: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class47.anIntArrayArrayArray630[var114 - 1][var17][var11]
															& value3) == 0) {
														break label3224;
													}
												}

												--var114;
											}

											label3235: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class47.anIntArrayArrayArray630[1 + var16][var17][var11]
															& value3) == 0) {
														break label3235;
													}
												}

												++var16;
											}

											var17 = (1 + var16 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var147 = 240;
												var19 = Class47.anIntArrayArrayArray635[var16][var13][var11] - var147;
												var145 = Class47.anIntArrayArrayArray635[var114][var13][var11];
												Region.method408(var9, 2, 128 * var13, var14 * 128 + 128, 128 * var11,
                                                        var11 * 128, var19, var145);

												for (var21 = var114; var21 <= var16; ++var21) {
													for (var22 = var13; var22 <= var14; ++var22) {
														Class47.anIntArrayArrayArray630[var21][var22][var11] &= ~value3;
													}
												}
											}
										}

										if ((Class47.anIntArrayArrayArray630[col][id][var11] & clanRank) != 0) {
											var13 = id;
											var14 = id;
											var114 = var11;

											for (var16 = var11; var114 > 0
													&& (Class47.anIntArrayArrayArray630[col][id][var114 - 1]
															& clanRank) != 0; --var114) {
												;
											}

											while (var16 < 104
													&& (Class47.anIntArrayArrayArray630[col][id][var16 + 1]
															& clanRank) != 0) {
												++var16;
											}

											label3274: while (var13 > 0) {
												for (var17 = var114; var17 <= var16; ++var17) {
													if ((Class47.anIntArrayArrayArray630[col][var13 - 1][var17]
															& clanRank) == 0) {
														break label3274;
													}
												}

												--var13;
											}

											label3285: while (var14 < 104) {
												for (var17 = var114; var17 <= var16; ++var17) {
													if (0 == (Class47.anIntArrayArrayArray630[col][var14 + 1][var17]
															& clanRank)) {
														break label3285;
													}
												}

												++var14;
											}

											if ((1 + (var14 - var13)) * (1 + (var16 - var114)) >= 4) {
												var17 = Class47.anIntArrayArrayArray635[col][var13][var114];
												Region.method408(var9, 4, 128 * var13, 128 * var14 + 128, var114 * 128,
                                                        128 + 128 * var16, var17, var17);

												for (var18 = var13; var18 <= var14; ++var18) {
													for (var19 = var114; var19 <= var16; ++var19) {
														Class47.anIntArrayArrayArray630[col][var18][var19] &= ~clanRank;
													}
												}
											}
										}
									}
								}
							}
						}

						Class85.method1157(true, (byte) -87);
						value2 = Class47.anInt638 * -1263368093;
						if (value2 > -747958745 * GameInterface.anInt1819) {
							value2 = -747958745 * GameInterface.anInt1819;
						}

						if (value2 < GameInterface.anInt1819 * -747958745 - 1) {
							value2 = -747958745 * GameInterface.anInt1819 - 1;
						}

						if (aBool2937) {
							GameInterface.region.method347(Class47.anInt638 * -1263368093);
						} else {
							GameInterface.region.method347(0);
						}

						for (value3 = 0; value3 < 104; ++value3) {
							for (clanRank = 0; clanRank < 104; ++clanRank) {
								Class37.method672(value3, clanRank, -781684645);
							}
						}

						Class42.method695((byte) 119);

						for (Class116_Sub12 var99 = (Class116_Sub12) aClass117_3162
								.getFirst(); null != var99; var99 = (Class116_Sub12) aClass117_3162.getNext()) {
							if (var99.anInt1846 * 1030491605 == -1) {
								var99.anInt1845 = 0;
								Class51.method784(var99, -1072094094);
							} else {
								var99.unlink();
							}
						}

						ObjectDefinition.aClass123_2192.method1635();
						if (Class116_Sub23_Sub13.aFrame2425 != null) {
							rsaBuffer.startPacket(245, (byte) 97);
							rsaBuffer.writeInt(1057001181, (byte) 14);
						}

						if (!dynamicRegion) {
							value3 = (-1361858763 * Class22.anInt276 - 6) / 8;
							clanRank = (6 + -1361858763 * Class22.anInt276) / 8;
							var9 = (CacheWorker.anInt1419 * 1249154187 - 6) / 8;
							col = (6 + 1249154187 * CacheWorker.anInt1419) / 8;

							for (var11 = value3 - 1; var11 <= clanRank + 1; ++var11) {
								for (id = var9 - 1; id <= 1 + col; ++id) {
									if (var11 < value3 || var11 > clanRank || id < var9 || id > col) {
										Class59_Sub1.mapFileIndex.method1371("m" + var11 + "_" + id,
												(byte) -3);
										Class59_Sub1.mapFileIndex.method1371("l" + var11 + "_" + id,
												(byte) -15);
									}
								}
							}
						}

						Class116_Sub12.method1983(30, (byte) 73);
						Class42.method695((byte) 1);
						Class30.method588(-1865965786);
						rsaBuffer.startPacket(179, (byte) 50);
						Class2.method38((short) 11776);
					}
				}
			}
		} else {
			Class17.method280(this, -69862791);
		}

		if (loginStage * 846055547 == 30) {
			if (anInt3157 * 210138957 > 1) {
				anInt3157 -= -1900832379;
			}

			if (1121410397 * anInt2987 > 0) {
				anInt2987 -= 2094128885;
			}

			if (aBool3052) {
				aBool3052 = false;
				Class93.method1265(-1231009074);
			} else {
				if (!aBool3074) {
					aStringArray3080[0] = Class91.aString1283;
					aStringArray3184[0] = "";
					anIntArray3037[0] = 1006;
					anInt3075 = 1937006435;
				}

				long key;
				boolean var85;
				String var94;
				RSInterface var121;
				for (var2 = 0; var2 < 100; ++var2) {
					if (null == Class38.streamBuffer) {
						var85 = false;
					} else {
						readBuffer: {
							try {
								availData = Class38.streamBuffer.readableBytes((byte) -24);
								if (0 == availData) {
									var85 = false;
									break readBuffer;
								}

								if (currentOpcode == -1) {
									Class38.streamBuffer.readBytes(packetBuffer.payload, 0, 1, 615894679);
									packetBuffer.position = 0;
									currentOpcode = packetBuffer.method2955((byte) 112);
									packetLength = 260863215 * Class114.anIntArray1513[currentOpcode];
									--availData;
								}

								if (-1 == packetLength * 371800591) {
									if (availData <= 0) {
										var85 = false;
										break readBuffer;
									}

									Class38.streamBuffer.readBytes(packetBuffer.payload, 0, 1, 615894679);
									packetLength = 260863215 * (packetBuffer.payload[0] & 255);
									--availData;
								}

								if (-2 == 371800591 * packetLength) {
									if (availData <= 1) {
										var85 = false;
										break readBuffer;
									}

									Class38.streamBuffer.readBytes(packetBuffer.payload, 0, 2, 615894679);
									packetBuffer.position = 0;
									packetLength = packetBuffer.readUnsignedShort(374567938) * 260863215;
									availData -= 2;
								}

								if (availData < packetLength * 371800591) {
									var85 = false;
									break readBuffer;
								}

								packetBuffer.position = 0;
								Class38.streamBuffer.readBytes(packetBuffer.payload, 0, packetLength * 371800591, 615894679);
								anInt2982 = 0;
								anInt3173 = 470278475 * anInt3066;
								anInt3066 = anInt2984 * -633837397;
								anInt2984 = (currentOpcode * 793368497) * -874887809;
                                Launcher.dumpOpcode(currentOpcode);
								if (120 == currentOpcode) {//interface config?
									value1 = packetBuffer.readInt2(2114849364);
									value2 = packetBuffer.readLEShortA(-2137447339);
									value3 = value2 >> 10 & 31;
									clanRank = value2 >> 5 & 31;
									var9 = value2 & 31;
									col = (var9 << 3) + (clanRank << 11) + (value3 << 19);
									RSInterface var142 = Class107.getInterface(value1, 314639891);
									if (var142.disabledColor * 1384750979 != col) {
										var142.disabledColor = 1053943595 * col;
										Class79.refreshInterface(var142, -1046712732);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 98) {
									Class7.anInt107 = 0;

									for (value1 = 0; value1 < 2048; ++value1) {
										Class7.aClass116_Sub14Array106[value1] = null;
										Class7.movementMode[value1] = 1;
									}

									for (value1 = 0; value1 < 2048; ++value1) {
										globalPlayers[value1] = null;
									}

									Class116_Sub10.readPlayerHashLocations(packetBuffer, 1698553703);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								GameInterface var163;
								if (158 == currentOpcode ) {
									value1 = packetBuffer.readUnsignedShort(1637048889);
									value2 = packetBuffer.readLEInt((byte) -55);
									value3 = packetBuffer.readByteS((byte) -125);
							         int root = value2 >> 16;
							         int child = value2 - (root << 16);
							         System.out.println("window: "+root+", Interface: "+value1+", Widget: "+child+", clickThrough: "+(value3 == 1));
									var163 = (GameInterface) overridedInterfaces.get((long) value2);
									if (null != var163) {
										Class116_Sub23_Sub5.method2490(var163, var163.interfaceId * 226793949 != value1, (byte) 1);
									}

									GameInterface.display(value2, value1, value3, (byte) 13);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (77 == currentOpcode ) {
									anInt3157 = packetBuffer.readShortA(-338860511) * -1190396522;
									anInt3122 = anInt3118 * 434653173;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								RSInterface var105;
								if (152 == currentOpcode) {
									value1 = packetBuffer.readInt(-525694326);
									value2 = packetBuffer.readInt(-881353325);
									value3 = packetBuffer.readLEShortA(-1863125256);
									if ('\uffff' == value3) {
										value3 = -1;
									}

									var105 = Class107.getInterface(value2, 314639891);
									Class116_Sub23_Sub11 var150;
									if (!var105.newFormat) {
										if (value3 == -1) {
											var105.modelTypeDisabled = 0;
											currentOpcode = -1;
											var85 = true;
											break readBuffer;
										}

										var150 = RelationList.method778(value3, (byte) 70);
										var105.modelTypeDisabled = -1505842828;
										var105.mediaIdDisabled = value3 * -541123263;
										var105.rotateX = var150.anInt2367 * 1778672027;
										var105.rotateY = var150.anInt2368 * -438177483;
										var105.zoom = -438091779 * (1568478228 * var150.anInt2396 / value1);
										Class79.refreshInterface(var105, 392272303);
									} else {
										var105.anInt2043 = value3 * -444483265;
										var105.anInt2044 = value1 * 1567728457;
										var150 = RelationList.method778(value3, (byte) 70);
										var105.rotateX = 1778672027 * var150.anInt2367;
										var105.rotateY = -438177483 * var150.anInt2368;
										var105.anInt1990 = 292702103 * var150.anInt2393;
										var105.translateX = 889655743 * var150.anInt2402;
										var105.translateY = var150.anInt2371 * -738298705;
										var105.zoom = -1079397735 * var150.anInt2396;
										if (1 == var150.anInt2372 * 1303294175) {
											var105.anInt1981 = -1548696853;
										} else {
											var105.anInt1981 = 1197573590;
										}

										if (var105.anInt1987 * 1501804265 > 0) {
											var105.zoom = -438091779
													* (126003872 * var105.zoom / (var105.anInt1987 * 1501804265));
										} else if (var105.width * 124195285 > 0) {
											var105.zoom = -438091779
													* (var105.zoom * 126003872 / (124195285 * var105.width));
										}

										Class79.refreshInterface(var105, 1734335051);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 187) { //delete ground object?
									value1 = packetBuffer.readUnsignedShort(1520365580);
									value2 = packetBuffer.readSignedByte(1708176767);
									value3 = packetBuffer.readUnsignedShort(1680557255);
									TileObj5.method698(value1, value2, value3, 1962531113);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								boolean var125;
								if (161 == currentOpcode ) {
									var125 = packetBuffer.readSignedByte(1708176767) == 1;
                                    System.out.print("Packet 161 b="+var125);
									if (var125) {
                                        long l = packetBuffer.readLong((byte) -57);
                                        System.out.print("l="+l+", ");
										HuffManEncryption.aLong687 = (Class116_Sub5.generateHash(-2137110599)
												- l) * 3889566144197309745L;
										Class81.aClass132_928 = new Class132(packetBuffer, true);
									} else {
										Class81.aClass132_928 = null;
									}
									anInt3129 = 263290095 * anInt3118;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 176) {
									anInt3168 = packetBuffer.readSignedByte(1708176767) * -1943900347;
									if (255 == anInt3168 * -1712731251) {
										anInt3168 = 0;
									}

									anInt3208 = packetBuffer.readSignedByte(1708176767) * 317027045;
									if (-691143955 * anInt3208 == 255) {
										anInt3208 = 0;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 171) {
									value1 = 314639891 * packetBuffer.position + 371800591 * packetLength;
									value2 = packetBuffer.readUnsignedShort(2005300630);
									value3 = packetBuffer.readUnsignedShort(1530454988);

                                    System.out.print(value2+"/"+ anInt3200 * -1074177723+"Packet 171 [readUnsignedShort=" + value2 + ", readUnsignedShort=" + value3 + " =");
									if (value2 != anInt3200 * -1074177723) {
										anInt3200 = value2 * -605073011;
										Class116_Sub10.method1971(false, (byte) 90);
										Class33.resetComponentAnimation(anInt3200 * -1074177723, -389379352);
										Class29.executeOnStart(-1074177723 * anInt3200, -447196070);
										for (clanRank = 0; clanRank < 100; ++clanRank) {
											aBoolArray3073[clanRank] = true;
										}
									}

									GameInterface var130;
									for (; value3-- > 0; var130.aBool1815 = true) {
										clanRank = packetBuffer.readInt(-1434644251);
										var9 = packetBuffer.readUnsignedShort(1655721914);
										col = packetBuffer.readSignedByte(1708176767);
                                        System.out.print("[readInt="+clanRank+", readUnsignedShort="+var9+", readByte="+col+"],");
										var130 = (GameInterface) overridedInterfaces.get((long) clanRank);
										if (var130 != null && 226793949 * var130.interfaceId != var9) {
											Class116_Sub23_Sub5.method2490(var130, true, (byte) 1);
											var130 = null;
										}

										if (var130 == null) {
											var130 = GameInterface.display(clanRank, var9, col, (byte) -7);
										}
									}
                                    System.out.print("- next -");

									for (var163 = (GameInterface) overridedInterfaces
											.getFirst(); var163 != null; var163 = (GameInterface) overridedInterfaces
													.getNext()) {
										if (var163.aBool1815) {
											var163.aBool1815 = false;
										} else {
											Class116_Sub23_Sub5.method2490(var163, true, (byte) 1);
										}
									}

									aHashtable_3135 = new Hashtable(512);

									while (packetBuffer.position * 314639891 < value1) {
										clanRank = packetBuffer.readInt(-936716570);
										var9 = packetBuffer.readUnsignedShort(1612930959);
										col = packetBuffer.readUnsignedShort(-29618334);
										var11 = packetBuffer.readInt(-236698976);
                                        System.out.print("[readInt="+clanRank+", readUnsignedShort="+var9+", readUnsignedShort="+col+", readInt="+var11+"],");
										for (id = var9; id <= col; ++id) {
											long var46 = ((long) clanRank << 32) + (long) id;
											aHashtable_3135.put(new InterfaceSettings(var11), var46);
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								long var48;
								if (196 == currentOpcode) {
									value1 = packetBuffer.readShortA(-338860511);
									if (value1 == '\uffff') {
										value1 = -1;
									}

									value2 = packetBuffer.readLEInt((byte) -121);
									value3 = packetBuffer.readLEShort((byte) -5);
									if (value3 == '\uffff') {
										value3 = -1;
									}

									clanRank = packetBuffer.readInt(-1120701666);

									for (var9 = value3; var9 <= value1; ++var9) {
										var48 = (long) var9 + ((long) value2 << 32);
										Node var123 = aHashtable_3135.get(var48);
										if (var123 != null) {
											var123.unlink();
										}

										aHashtable_3135.put(new InterfaceSettings(clanRank), var48);
									}
                                    System.out.println("opcode 196="+value1+"/"+value2+"/"+value3+"/"+clanRank);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}
								if (currentOpcode  == 201) {
									byte var173 = packetBuffer.readByteA(-2111583012);
									value2 = packetBuffer.readShortA(-338860511);
                                    //System.out.println("Small configP201 "+var173+"/"+interfaceHash);
									Class107.anIntArray1454[value2] = var173;
									if (Class107.varpData[value2] != var173) {
										Class107.varpData[value2] = var173;
									}

									World.method567(value2, 1814638903);
									anIntArray3119[(anInt3120 += 1551596873) * -729938695 - 1 & 31] = value2;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 192) {
									value1 = packetBuffer.readInt(-1927934378);
									value2 = packetBuffer.readLEShort((byte) -107);
									Class107.anIntArray1454[value2] = value1;
									if (value1 != Class107.varpData[value2]) {
										Class107.varpData[value2] = value1;
									}

									World.method567(value2, 1714872839);
									anIntArray3119[(anInt3120 += 1551596873) * -729938695 - 1 & 31] = value2;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (218 == currentOpcode) {
									value1 = packetBuffer.readSignedByte(1708176767);
									if (packetBuffer.readSignedByte(1708176767) == 0) {
										aClass135Array3211[value1] = new Class135();
										packetBuffer.position += 979806694;
									} else {
										packetBuffer.position -= -184175589;
										aClass135Array3211[value1] = new Class135(packetBuffer, false);
									}

									anInt3128 = anInt3118 * -929632705;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 247) {
									value1 = packetBuffer.readLEShortA(-1842019943);
									Class39.method682(value1, (byte) -69);
									anIntArray3121[(anInt3025 += -1121866621) * -1512766933 - 1 & 31] = value1 & 32767;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								long var52;
								long var54;
								if (currentOpcode  == 1) {
									var94 = packetBuffer.readString(61376769);
									key = (long) packetBuffer.readUnsignedShort(1083471355);
									var52 = (long) packetBuffer.readMedium((byte) 15);
									Speach[] icons = new Speach[] { Speach.OFFLINE, Speach.PLAYER,
											Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
                                    int rank = packetBuffer.readSignedByte(1708176767);
									Speach thisIcon = (Speach) Class35.method646(icons, rank, (byte) -30);
									var54 = (key << 32) + var52;
									boolean var136 = false;

									for (var114 = 0; var114 < 100; ++var114) {
										if (msgUid[var114] == var54) {
                                                var136 = true;
											    break;
										}
									}

									if (World.method568(var94, -2142744792)) {
										var136 = true;
									}

									if (!var136 && anInt3151 * 198136383 == 0) {
										msgUid[anInt3155 * 1926465309] = var54;
										anInt3155 = (1 + anInt3155 * 1926465309) % 100 * -1205898443;
										PacketBuilder var162 = packetBuffer;

										String var167;
										try {
											var18 = var162.readSmartC(1574291335);
											if (var18 > 32767) {
												var18 = 32767;
											}

											byte[] var166 = new byte[var18];
											var162.position += client.aClass52_1621.method786(var162.payload,
													314639891 * var162.position, var166, 0, var18, (byte) 16)
													* -184175589;
											String var164 = Tile.method1987(var166, 0, var18, (byte) 89);
											var167 = var164;
										} catch (Exception var74) {
											var167 = "Cabbage";
										}

										var167 = TextDrawingArea
												.method3459(Class59.method892(var167, -2005798157));
										byte var161 = 7;
                                        if(!Launcher.rsps) {
                                            if (thisIcon.aBool978) {
                                                var161 = 7;
                                            } else {
                                                System.err.println("SOMEHOW ITS 3!?!?1?1?1?1?"+thisIcon.iconId+", rank="+rank);
                                                var161 = 3;
                                            }
                                        }

										if (thisIcon.iconId * -2127218069 != -1) {
											Class86.appendMessage(var161,
                                                    Class51.method780(-2127218069 * thisIcon.iconId, (short) -9483) + var94,
                                                    var167, -2055323816);
										} else {
											Class86.appendMessage(var161, var94, var167, -1453123591);
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								RSInterface var109;
								if (225 == currentOpcode) {
									value1 = packetBuffer.readUnsignedShort(-414514260);
									value2 = packetBuffer.readInt1((byte) -42);
									var109 = Class107.getInterface(value2, 314639891);
									if (null != var109 && 0 == var109.type * -1305917269) {
										if (value1 > 177405235 * var109.maxScrollVertical - 1227800423 * var109.heght) {
											value1 = 177405235 * var109.maxScrollVertical - 1227800423 * var109.heght;
										}

										if (value1 < 0) {
											value1 = 0;
										}

										if (value1 != -1602694527 * var109.anInt1947) {
											var109.anInt1947 = value1 * -1459786367;
											Class79.refreshInterface(var109, -504138998);
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (236 == currentOpcode) {
									GameInterface.anInt1818 = packetBuffer.readByteA((byte) -1) * -958823289;
									Player.anInt2887 = packetBuffer.readSignedByte(1708176767)
											* 1689579987;

									while (packetBuffer.position * 314639891 < packetLength * 371800591) {
										currentOpcode = packetBuffer.readSignedByte(1708176767);
										Class116_Sub23_Sub18.method2886(1665542406);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (80 == currentOpcode ) { // CS2
																	// Scripts
									var94 = packetBuffer.readString(61376769);
									Object[] var172 = new Object[var94.length() + 1];
                                    boolean intt = true;
									for (value3 = var94.length() - 1; value3 >= 0; --value3) {
										if (var94.charAt(value3) == 115) {
                                            intt = false;
											var172[1 + value3] = packetBuffer.readString(61376769);
										} else {
											var172[value3 + 1] = new Integer(packetBuffer.readInt(-2123480913));
										}
									}
									var172[0] = new Integer(packetBuffer.readInt(-409921150));
                                    System.out.println(intt+"CSConfig dump[backwards]"+var94+", "+ Arrays.toString(var172));
									Class116_Sub6 var171 = new Class116_Sub6();
									var171.anObjectArray1737 = var172;
									Friend.method1840(var171, -2062508489);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 212) {
                                    int ok = packetBuffer.readSignedByte(1708176767);
                                    int ok2 = packetBuffer.readSignedByte(1708176767);
									anInt3064 = ok * -677280985;
									anInt3150 = ok2 * -1946178403;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (15 == currentOpcode  || 220 == currentOpcode
										|| 5 == currentOpcode || currentOpcode  == 231
										|| currentOpcode == 108 || currentOpcode  == 36
										|| currentOpcode  == 147 || 25 == currentOpcode
										|| currentOpcode == 182 || currentOpcode == 189) {
									Class116_Sub23_Sub18.method2886(1880607336);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 190) {
									aBool2988 = true;
									Class59_Sub1.anInt1834 = packetBuffer.readSignedByte(1708176767) * 182040463;
									anInt3183 = packetBuffer.readSignedByte(1708176767) * 1904595561;
									Class116_Sub23_Sub16_Sub1.anInt2573 = packetBuffer.readUnsignedShort(321813526) * 1696668619;
									Class43.anInt580 = packetBuffer.readSignedByte(1708176767) * 1081596097;
									Class36.anInt487 = packetBuffer.readSignedByte(1708176767) * 1511028371;
									if (549132187 * Class36.anInt487 >= 100) {
										value1 = 64 + 1908651904 * Class59_Sub1.anInt1834;
										value2 = 64 + 107932800 * anInt3183;
										value3 = MobDefinition.method2552(value1, value2,
                                                -747958745 * GameInterface.anInt1819, (short) 19328)
												- Class116_Sub23_Sub16_Sub1.anInt2573 * 715633123;
										clanRank = value1 - Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897;
										var9 = value3 - RelationList.anInt671 * 1447873857;
										col = value2 - Class83.anInt968 * -324676025;
										var11 = (int) Math.sqrt((double) (clanRank * clanRank + col * col));
										Class78.anInt904 = ((int) (Math.atan2((double) var9, (double) var11) * 325.949D)
												& 2047) * 1852239419;
										Class76.anInt895 = ((int) (Math.atan2((double) clanRank, (double) col)
												* -325.949D) & 2047) * 531969645;
										if (Class78.anInt904 * 1162853107 < 128) {
											Class78.anInt904 = 863444352;
										}

										if (Class78.anInt904 * 1162853107 > 383) {
											Class78.anInt904 = 738093637;
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 31) {
									Class8.decodeNpcUpdate(false, 1645385550);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (96 == currentOpcode) {
									value1 = packetBuffer.method2041((short) -21192);
									value2 = packetBuffer.readLEInt((byte) -38);
									var109 = Class107.getInterface(value2, 314639891);
									if (value1 != var109.disabledAnim * 467073769 || value1 == -1) {
										var109.disabledAnim = value1 * 1986493785;
										var109.anInt2045 = 0;
										var109.anInt1919 = 0;
										Class79.refreshInterface(var109, 727765596);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								RSInterface var141;
								if (currentOpcode == 126) {
									value1 = packetBuffer.readLEInt((byte) -21);
									value2 = packetBuffer.readInt1((byte) -123);
									GameInterface var169 = (GameInterface) overridedInterfaces.get((long) value2);
									var163 = (GameInterface) overridedInterfaces.get((long) value1);
									if (null != var163) {
										Class116_Sub23_Sub5.method2490(var163,
												var169 == null
														|| var163.interfaceId * 226793949 != var169.interfaceId * 226793949,
												(byte) 1);
									}

									if (null != var169) {
										var169.unlink();
										overridedInterfaces.put(var169, (long) value1);
									}

									var141 = Class107.getInterface(value2, 314639891);
									if (null != var141) {
										Class79.refreshInterface(var141, -1205316273);
									}

									var141 = Class107.getInterface(value1, 314639891);
									if (null != var141) {
										Class79.refreshInterface(var141, 1018130792);
										ObjectDefinition.method2435(
                                                RSInterface.mainInterfaceArray[var141.hash
                                                        * -1536575275 >>> 16],
                                                var141, true, 1094777552);
									}

									if (anInt3200 * -1074177723 != -1) {
										Class76.method1081(anInt3200 * -1074177723, 1, (byte) 2);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 144) {
									value1 = packetBuffer.readUnsignedShort(135593029);
									value2 = packetBuffer.readUnsignedShort(2133692823);
									value3 = packetBuffer.readInt(-1542050773);
									clanRank = packetBuffer.readUnsignedShort(1082949407);
									var141 = Class107.getInterface(value3, 314639891);
									if (value1 != var141.rotateX * 175924351 || 745334365 * var141.rotateY != clanRank
											|| var141.zoom * -1472457387 != value2) {
										var141.rotateX = value1 * 1055873919;
										var141.rotateY = -478470667 * clanRank;
										var141.zoom = value2 * -438091779;
										Class79.refreshInterface(var141, 7689073);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								long var56;
								if (currentOpcode  == 214) {
									var94 = packetBuffer.readString(61376769);
									key = packetBuffer.readLong((byte) -17);
									var52 = (long) packetBuffer.readUnsignedShort(647124529);
									var48 = (long) packetBuffer.readMedium((byte) 15);
									Speach[] var118 = new Speach[] { Speach.OFFLINE, Speach.PLAYER,
											Speach.MOD, Speach.ADMIN, Speach.ULT_IRONMAN};
									Speach var137 = (Speach) Class35.method646(var118,
											packetBuffer.readSignedByte(1708176767), (byte) -86);
									var56 = (var52 << 32) + var48;
									boolean draw = false;

									for (var17 = 0; var17 < 100; ++var17) {
										if (msgUid[var17] == var56) {
											draw = true;
											break;
										}
									}

									if (var137.aBool982 && World.method568(var94, -1959669550)) {
										draw = true;
									}

									if (!draw && 198136383 * anInt3151 == 0) {
										msgUid[1926465309 * anInt3155] = var56;
										anInt3155 = -1205898443 * ((1 + anInt3155 * 1926465309) % 100);
										PacketBuilder buff = packetBuffer;

										String var158;
										try {
											var145 = buff.readShort(0);//buff.readSmartC(-1841595977);
                                            System.out.println(var145);
											if (var145 > 32767) {
												var145 = 32767;
											}

											byte[] var165 = new byte[var145];
											buff.position += client.aClass52_1621.method786(buff.payload,
													314639891 * buff.position, var165, 0, var145, (byte) 16)
													* -184175589;
											String var168 = Tile.method1987(var165, 0, var145, (byte) 122);
											var158 = var168;
										} catch (Exception var73) {
                                            var73.printStackTrace();
											var158 = "Cabbage";
										}

										var158 = TextDrawingArea
												.method3459(Class59.method892(var158, -1433905521));
										if (var137.iconId * -2127218069 != -1) {
											Class116_Sub23_Sub1.appendChat(9,
                                                    Class51.method780(-2127218069 * var137.iconId, (short) -12678)
                                                            + var94,
                                                    var158, Class116_Sub23_Sub12.method2655(key), -2040945609);
										} else {
											Class116_Sub23_Sub1.appendChat(9, var94, var158,
                                                    Class116_Sub23_Sub12.method2655(key), -1649261059);
										}
									}
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (90 == currentOpcode) {
									Packet.method2213((byte) -128);
									anInt3099 = packetBuffer.readShort(-460342608) * 135408337;
									anInt3122 = anInt3118 * 434653173;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (180 == currentOpcode) {
									anInt3021 = packetBuffer.readSignedByte(1708176767) * -2000049339;
									if (1 == anInt3021 * 314519437) {
										anInt2952 = packetBuffer.readUnsignedShort(1233316153) * 1604167195;
									}

									if (anInt3021 * 314519437 >= 2 && 314519437 * anInt3021 <= 6) {
										if (2 == anInt3021 * 314519437) {
											anInt3070 = 578314048;
											anInt2958 = -340788800;
										}

										if (3 == 314519437 * anInt3021) {
											anInt3070 = 0;
											anInt2958 = -340788800;
										}

										if (4 == 314519437 * anInt3021) {
											anInt3070 = 1156628096;
											anInt2958 = -340788800;
										}

										if (314519437 * anInt3021 == 5) {
											anInt3070 = 578314048;
											anInt2958 = 0;
										}

										if (6 == 314519437 * anInt3021) {
											anInt3070 = 578314048;
											anInt2958 = -681577600;
										}

										anInt3021 = 294868618;
										anInt2954 = packetBuffer.readUnsignedShort(131355065) * -918335991;
										anInt2950 = packetBuffer.readUnsignedShort(1504877900) * -1217004367;
										anInt2968 = packetBuffer.readSignedByte(1708176767) * -537897385;
									}

									if (anInt3021 * 314519437 == 10) {
										anInt3125 = packetBuffer.readUnsignedShort(1992660421) * 136867453;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (183 == currentOpcode ) {
									anInt3203 = -593871665;
									anInt3068 = -712636309 * anInt3118;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (237 == currentOpcode) {
									Packet.method2213((byte) -128);
									value1 = packetBuffer.readInt(-1679285157);
									value2 = packetBuffer.readByteS((byte) -119);
									value3 = packetBuffer.readByteC(-143981914);
									anIntArray3108[value3] = value1;
									anIntArray2953[value3] = value2;
									anIntArray2951[value3] = 1;

									for (clanRank = 0; clanRank < 98; ++clanRank) {
										if (value1 >= Class76.anIntArray891[clanRank]) {
											anIntArray2951[value3] = clanRank + 2;
										}
									}

									anIntArray3123[(anInt3124 += -245523573) * -549276637 - 1 & 31] = value3;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								String username;
								if (110 == currentOpcode) {//send music
									value1 = packetBuffer.readInt(-236513998);
									username = packetBuffer.readString(61376769);

									var109 = Class107.getInterface(value1, 314639891);
									if (!username.equals(var109.disabledText)) {
										var109.disabledText = username;
										Class79.refreshInterface(var109, 1670119001);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								String name;
								boolean var124;
								String lastUser;
								if (currentOpcode  == 107) {
									while (packetBuffer.position * 314639891 < 371800591 * packetLength) {
										value1 = packetBuffer.readSignedByte(1708176767);
										var124 = 1 == (value1 & 1);
										name = packetBuffer.readString(61376769);
										lastUser = packetBuffer.readString(61376769);
										packetBuffer.readString(61376769);

										for (var9 = 0; var9 < 1820302153 * anInt3206; ++var9) {
											Ignore var126 = aClass24Array3207[var9];
											if (var124) {
												if (lastUser.equals(var126.currentName)) {
													var126.currentName = name;
													var126.lastName = lastUser;
													name = null;
													break;
												}
											} else if (name.equals(var126.currentName)) {
												var126.currentName = name;
												var126.lastName = lastUser;
												name = null;
												break;
											}
										}

										if (null != name && anInt3206 * 1820302153 < 400) {
											Ignore var140 = new Ignore();
											aClass24Array3207[anInt3206 * 1820302153] = var140;
											var140.currentName = name;
											var140.lastName = lastUser;
											anInt3206 += -334739719;
										}
									}

									anInt3068 = anInt3118 * -712636309;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 242) {
									Class116_Sub23_Sub2.doReflectionCheck(packetBuffer, packetLength * 371800591, -1457674298);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 87) {
									value1 = packetBuffer.readLEShortA(-2094345266);
									value2 = packetBuffer.readInt2(2137652109);
									var109 = Class107.getInterface(value2, 314639891);
									if (1 != var109.modelTypeDisabled * -768837131 || value1 != 686060225 * var109.mediaIdDisabled) {
										var109.modelTypeDisabled = -376460707;
										var109.mediaIdDisabled = value1 * -541123263;
										Class79.refreshInterface(var109, -961889719);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 217) {
									value2 = packetBuffer.readSignedByte(1708176767);
									Class62[] var159 = Class51.method783(94483834);
									clanRank = 0;

									Class62 var170;
									while (true) {
										if (clanRank >= var159.length) {
											var170 = null;
											break;
										}

										Class62 var133 = var159[clanRank];
										if (var133.anInt799 * -1916029001 == value2) {
											var170 = var133;
											break;
										}

										++clanRank;
									}

									Class33.aClass62_449 = var170;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (103 == currentOpcode) {
									value1 = packetBuffer.readLEShortA(-2038534886);
									if (value1 == '\uffff') {
										value1 = -1;
									}

									Class26.method535(value1, (byte) -6);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 135) {
									value1 = packetBuffer.readShortA(-338860511);
									if ('\uffff' == value1) {
										value1 = -1;
									}

									value2 = packetBuffer.method1989((byte) -61);
									if (anInt3171 * -1994948003 != 0 && -1 != value1) {
										Class80.method1099(Class108.aCacheIndex_1471, value1, 0,
												anInt3171 * -1994948003, false, (short) 3438);
										aBool3159 = true;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (239 == currentOpcode) {
									Class8.decodeMapRegion(false, (byte) 10);
									int packetId =  packetBuffer.method2955((byte) 9);
									value1 = packetBuffer.readUnsignedShort(-59243090);
									Class32.decodePlayerUpdate(packetBuffer, value1, (byte) 10);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 143) {
									value1 = packetBuffer.readInt(-273006259);
									RSImageProducer.aClass72_1675 = ISAAC.signLink.workAddress(value1, 769075048);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								boolean var108;
								if (84 == currentOpcode) { //send entire cc
									anInt3127 = anInt3118 * -942030581;
									if (371800591 * packetLength == 0) { //exit
										currentCCName = null;
										currentClanOwner = null;
										Class98.ccPlayerCount = 0;
										GameInterface.ourCurrentCC = null;
										currentOpcode = -1;
										var85 = true;
									} else {
										currentClanOwner = packetBuffer.readString(61376769);
										long ccName = packetBuffer.readLong((byte) 27);
										var52 = ccName;
										if (ccName > 0L && ccName < 6582952005840035281L) {
											if (0L == ccName % 37L) {
												name = null;
											} else {
												col = 0;

												for (long var60 = ccName; 0L != var60; var60 /= 37L) {
													++col;
												}

												StringBuilder var132 = new StringBuilder(col);

												while (0L != var52) {
													var56 = var52;
													var52 /= 37L;
													var132.append(Class103.lowercase[(int) (var56 - 37L * var52)]);
												}

												name = var132.reverse().toString();
											}
										} else {
											name = null;
										}

										currentCCName = name;
                                        packetBuffer.readUnsignedByte(985375785);
										Class53.currentClanKickRank = 0;
										col = packetBuffer.readSignedByte(1708176767); //people in cc max is 100 iirc
										if (col == 255) { //empty
											currentOpcode = -1;
											var85 = true;
										} else {
											Class98.ccPlayerCount = -1124093015 * col;
											PlayerAlias[] incc = new PlayerAlias[100];

											for (id = 0; id < -1304125287 * Class98.ccPlayerCount; ++id) {
												incc[id] = new PlayerAlias();
												incc[id].username = packetBuffer.readString(61376769);
												incc[id].clanRankIcon = Class116_Sub23_Sub15.method2702(incc[id].username, Class59_Sub1.aClass143_1831, 1351377995);
                                                int ok = packetBuffer.readUnsignedShort(1895289456);
												incc[id].worldId = ok * 967496063;
                                                byte lol =  packetBuffer.readUnsignedByte(1016104202);
												incc[id].clanRank = lol;
												packetBuffer.readString(61376769);
                                                System.out.println(incc[id].username+"/"+ok+"/"+lol+"/"+-1304125287 * Class98.ccPlayerCount+"/"+id);
												if (incc[id].username.equals(Class79.ourPlayer.username)) {
													ourccrank = incc[id].clanRank;
												}
											}

											var108 = false;
											var14 = Class98.ccPlayerCount * -1304125287;

											while (var14 > 0) {
												var108 = true;
												--var14;

												for (var114 = 0; var114 < var14; ++var114) {
													if (incc[var114].clanRankIcon
															.compareTo(incc[var114 + 1].clanRankIcon) > 0) {
														PlayerAlias var134 = incc[var114];
														incc[var114] = incc[1 + var114];
														incc[var114 + 1] = var134;
														var108 = false;
													}
												}

												if (var108) {
													break;
												}
											}

											GameInterface.ourCurrentCC = incc;
											currentOpcode = -1;
											var85 = true;
										}
									}
									break readBuffer;
								}

								if (208 == currentOpcode ) {
									value1 = packetBuffer.readLEShort((byte) -60);
									anInt3200 = -605073011 * value1;
									Class116_Sub10.method1971(false, (byte) 95);
									Class33.resetComponentAnimation(value1, 1196532469);
									Class29.executeOnStart(-1074177723 * anInt3200, -447196070);

									for (value2 = 0; value2 < 100; ++value2) {
										aBoolArray3073[value2] = true;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 132) {
                                    int i = packetBuffer.readByteS((byte) -119);
                                    int ii = packetBuffer.readSignedByte(1708176767);
                                    Player.anInt2887 = i * 1689579987;
									GameInterface.anInt1818 = ii * -958823289;

									for (value1 = 1413480759
											* GameInterface.anInt1818; value1 < GameInterface.anInt1818 * 1413480759
													+ 8; ++value1) {
										for (value2 = 40472155
												* Player.anInt2887; value2 < Player.anInt2887
														* 40472155 + 8; ++value2) {
											if (null != aClass117ArrayArrayArray3071[-747958745
													* GameInterface.anInt1819][value1][value2]) {
												aClass117ArrayArrayArray3071[GameInterface.anInt1819
														* -747958745][value1][value2] = null;
												Class37.method672(value1, value2, -1770186955);
											}
										}
									}

									for (Class116_Sub12 var157 = (Class116_Sub12) aClass117_3162
											.getFirst(); var157 != null; var157 = (Class116_Sub12) aClass117_3162
													.getNext()) {
										if (var157.anInt1835 * -1096801001 >= 1413480759 * GameInterface.anInt1818
												&& -1096801001 * var157.anInt1835 < 8
														+ GameInterface.anInt1818 * 1413480759
												&& -127960105 * var157.anInt1847 >= 40472155
														* Player.anInt2887
												&& -127960105
														* var157.anInt1847 < Player.anInt2887
																* 40472155 + 8
												&& GameInterface.anInt1819 * -747958745 == var157.anInt1837
														* 584375567) {
											var157.anInt1846 = 0;
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 151) {
									Class93.method1270(-1305917269);
									currentOpcode = -1;
									var85 = false;
									break readBuffer;
								}

								if (199 == currentOpcode) {
									var94 = packetBuffer.readString(61376769);
									PacketBuilder buffer = packetBuffer;
									try {
										var9 = buffer.readSmartC(485266038);
										if (var9 > 32767) {
											var9 = 32767;
										}

										byte[] var116 = new byte[var9];
										buffer.position += client.aClass52_1621.method786(buffer.payload,
										buffer.position * 314639891, var116, 0, var9, (byte) 16) * -184175589;
										String var119 = Tile.method1987(var116, 0, var9, (byte) 63);
										lastUser = var119;
									} catch (Exception var72) {
										lastUser = "Cabbage";
									}

									lastUser = TextDrawingArea
											.method3459(Class59.method892(lastUser, -1536394700));
									Class86.appendMessage(6, var94, lastUser, -1880322425);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 142) {
									value1 = packetBuffer.readLEInt((byte) -32);
									var124 = packetBuffer.readByteA((byte) -1) == 1;
									var109 = Class107.getInterface(value1, 314639891);
									if (var109.hidden != var124) {
										var109.hidden = var124;
										Class79.refreshInterface(var109, -2067500791);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (29 == currentOpcode ) {
									value1 = packetBuffer.readInt1((byte) -59);
									var121 = Class107.getInterface(value1, 314639891);
									var121.modelTypeDisabled = -1129382121;
									var121.mediaIdDisabled = Class79.ourPlayer.aClass108_2881
											.method1475(-1887969660) * -541123263;
									Class79.refreshInterface(var121, 1384098274);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (244 == currentOpcode) {
									value1 = packetBuffer.readInt(-1869764490);
									GameInterface var160 = (GameInterface) overridedInterfaces.get((long) value1);
									if (var160 != null) {
										Class116_Sub23_Sub5.method2490(var160, true, (byte) 1);
									}

									if (aClass116_Sub15_3097 != null) {
										Class79.refreshInterface(aClass116_Sub15_3097, -1829538804);
										aClass116_Sub15_3097 = null;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (216 == currentOpcode ) {
									value1 = packetBuffer.readInt(-1564411053);
									value2 = packetBuffer.readUnsignedShort(1794487952);
									if (value1 < -70000) {
										value2 += '\u8000';
									}

									if (value1 >= 0) {
										var109 = Class107.getInterface(value1, 314639891);
									} else {
										var109 = null;
									}

									for (; 314639891 * packetBuffer.position < 371800591 * packetLength; Class116_Sub23_Sub11
											.method2637(value2, clanRank, var9 - 1, col, 1100895887)) {
										clanRank = packetBuffer.readSmartC(1333330635);
										var9 = packetBuffer.readUnsignedShort(1329782102);
										col = 0;
										if (0 != var9) {
											col = packetBuffer.readSignedByte(1708176767);
											if (255 == col) {
												col = packetBuffer.readInt(-169482322);
											}
										}

										if (null != var109 && clanRank >= 0 && clanRank < var109.inv.length) {
											var109.inv[clanRank] = var9;
											var109.invStackSize[clanRank] = col;
										}
									}

									if (var109 != null) {
										Class79.refreshInterface(var109, 2122052560);
									}

									Packet.method2213((byte) -119);
									anIntArray3121[(anInt3025 += -1121866621) * -1512766933 - 1 & 31] = value2 & 32767;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (41 == currentOpcode ) {
									Player.anInt2887 = packetBuffer.readByteC(908877591)
											* 1689579987;
									GameInterface.anInt1818 = packetBuffer.readByteC(1673471458) * -958823289;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (82 == currentOpcode ) {
									var94 = packetBuffer.readString(61376769); //playeroption
									value2 = packetBuffer.readByteA((byte) -1); //??
									value3 = packetBuffer.readByteC(382677552); //option
									if (value3 >= 1 && value3 <= 8) {
										if (var94.equalsIgnoreCase("null")) {
											var94 = null;
										}

										aStringArray3062[value3 - 1] = var94;
										aBoolArray3063[value3 - 1] = 0 == value2;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 137) {
									for (value1 = 0; value1 < -1248800389 * Class116_Sub23_Sub15.anInt2448; ++value1) {
										Class116_Sub23_Sub15 var148 = Class45.method702(value1, (short) -19370);
										if (var148 != null) {
											Class107.anIntArray1454[value1] = 0;
											Class107.varpData[value1] = 0;
										}
									}

									Packet.method2213((byte) -127);
									anInt3120 += -1888507616;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 202) {
									if (-1 != -1074177723 * anInt3200) {
										Class76.method1081(-1074177723 * anInt3200, 0, (byte) 2);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (160 == currentOpcode ) { // senditemupdate
									value1 = packetBuffer.readInt(-972423359);
									value2 = packetBuffer.readUnsignedShort(1705911463);
									if (value1 < -70000) {
										value2 += '\u8000';
									}

									if (value1 >= 0) {
										var109 = Class107.getInterface(value1, 314639891);
									} else {
										var109 = null;
									}

									if (null != var109) {
										for (clanRank = 0; clanRank < var109.inv.length; ++clanRank) {
											var109.inv[clanRank] = 0;
											var109.invStackSize[clanRank] = 0;
										}
									}

									Canvas_Sub1.method2972(value2, -2134508792);
									clanRank = packetBuffer.readUnsignedShort(952313331);

                                    System.out.print("160=" + value2 + "/" + value2 + ", size=" + clanRank);
									for (var9 = 0; var9 < clanRank; ++var9) {
										col = packetBuffer.readLEShortA(-2069803972);
										var11 = packetBuffer.readSignedByte(1708176767);
                                        System.out.print("[id["+var9+"]= 1="+col+", 2="+var11);
										if (255 == var11) {
											var11 = packetBuffer.readInt1((byte) -74);
                                            System.out.print(", 3=" + var11);
										}

										if (var109 != null && var9 < var109.inv.length) {
											var109.inv[var9] = col;
											var109.invStackSize[var9] = var11;
									} 
										Class116_Sub23_Sub11.method2637(value2, var9, col - 1, var11, -455301126);
									}
                                    System.out.println(" -done");

									if (var109 != null) {
										Class79.refreshInterface(var109, -182733946);
									}

									Packet.method2213((byte) -125);
									anIntArray3121[(anInt3025 += -1121866621) * -1512766933 - 1 & 31] = value2 & 32767;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 9) {
									var94 = packetBuffer.readString(61376769);
									aString2940 = var94;

									try {
										username = aclient2930.getParameter(Class122.aClass122_1529.aString1544);
										name = aclient2930.getParameter(Class122.aClass122_1542.aString1544);
										lastUser = username + "settings=" + var94 + "; version=1; path=/; domain=" + name;
										if (var94.length() == 0) {
											lastUser = lastUser + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
										} else {
											lastUser = lastUser + "; Expires="
													+ Class62.method916(
															Class116_Sub5.generateHash(-2027425312) + 94608000000L)
													+ "; Max-Age=" + 94608000L;
										}

										client var117 = aclient2930;
										String var102 = "document.cookie=\"" + lastUser + "\"";
										JSObject.getWindow(var117).eval(var102);
									} catch (Throwable var71) {
										;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 117) {
									aBool2988 = true;
									Class31.anInt428 = packetBuffer.readSignedByte(1708176767) * -1737876805;
									Class32.anInt440 = packetBuffer.readSignedByte(1708176767) * -1608345747;
									Class3.anInt43 = packetBuffer.readUnsignedShort(797348180) * 1185326837;
									ObjectDefinition.anInt2208 = packetBuffer.readSignedByte(1708176767) * 1146873531;
									Class116_Sub23_Sub18.anInt2481 = packetBuffer.readSignedByte(1708176767) * -714496409;
									if (-2101471913 * Class116_Sub23_Sub18.anInt2481 >= 100) {
										Class116_Sub23_Sub16_Sub5.anInt2740 = -910433920 * Class31.anInt428
												+ -401449920;
										Class83.anInt968 = -1084622464 * Class32.anInt440 + 1463606720;
										RelationList.anInt671 = (MobDefinition.method2552(
                                                Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897,
                                                -324676025 * Class83.anInt968, GameInterface.anInt1819 * -747958745,
                                                (short) 20581) - 3036509 * Class3.anInt43) * -1022442815;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (43 == currentOpcode) {///hmmm interfaceconfig?
									value1 = packetBuffer.readSignedByte(1708176767);
									value2 = packetBuffer.readSignedByte(1708176767);
									value3 = packetBuffer.readSignedByte(1708176767);
									clanRank = packetBuffer.readSignedByte(1708176767);
									aBoolArray2970[value1] = true;
									anIntArray3185[value1] = value2;
									anIntArray3186[value1] = value3;
									anIntArray3189[value1] = clanRank;
									anIntArray3188[value1] = 0;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								boolean var97;
								if (currentOpcode == 165) {
                                    System.out.print("Packet 165 = [");
									while (packetBuffer.position * 314639891 < packetLength * 371800591) {
										var125 = packetBuffer.readSignedByte(1708176767) == 1;
										username = packetBuffer.readString(61376769);
										name = packetBuffer.readString(61376769);
										clanRank = packetBuffer.readUnsignedShort(1822095344);
										var9 = packetBuffer.readSignedByte(1708176767);
										col = packetBuffer.readSignedByte(1708176767);
                                        System.out.print("readbool=" + var125 + ", readString=" + username + ", readString=" + name + ", readUnsignedShort=" + clanRank + ", rank=" + var9 + ", byte=" + col + ", byte 0 end., ");
										boolean var107 = (col & 2) != 0;
										var108 = (col & 1) != 0;
										if (clanRank > 0) {
											String lol = packetBuffer.readString(61376769);
											int i = packetBuffer.readSignedByte(1708176767);
											int iii = packetBuffer.readInt(-298677770);
                                            System.out.print("read 6 bytes" + lol + ", i=" + i + ", i2=" + iii);
										}

										String l = packetBuffer.readString(61376769);
                                        System.out.print("str =" + l + ", ");

										for (var13 = 0; var13 < -1616775607 * anInt3152; ++var13) {
											RelationList list = aClass50Array3204[var13];
											if (!var125) {
												if (username.equals(list.username)) {
													if (-698428043 * list.anInt666 != clanRank) {
														boolean var144 = true;
														for (Friend frnd = (Friend) friendList.popFront(); frnd != null; frnd = (Friend) friendList.peekFront()) {
															if (frnd.username.equals(username)) {
																if (0 != clanRank && 0 == frnd.clanRank) {
																	frnd.unlink();
																	var144 = false;
																} else if (clanRank == 0 && 0 != frnd.clanRank) {
																	frnd.unlink();
																	var144 = false;
																}
															}
														}
														if (var144) {
															friendList.insertBack(new Friend(username, clanRank));
														}
														list.anInt666 = 590451421 * clanRank;
													}
													list.lastUsername = name;
													list.anInt668 = var9 * 882807583;
													list.aBool667 = var107;
													list.aBool669 = var108;
													username = null;
													break;
												}
											} else if (name.equals(list.username)) {
												list.username = username;
												list.lastUsername = name;
												username = null;
												break;
											}
										}

										if (username != null && anInt3152 * -1616775607 < 400) {
											RelationList var129 = new RelationList();
											aClass50Array3204[anInt3152 * -1616775607] = var129;
											var129.username = username;
											var129.lastUsername = name;
											var129.anInt666 = clanRank * 590451421;
											var129.anInt668 = var9 * 882807583;
											var129.aBool667 = var107;
											var129.aBool669 = var108;
											anInt3152 += -1013982215;
										}
									}
                                    System.out.println("] end");

									anInt3203 = -1187743330;
									anInt3068 = -712636309 * anInt3118;
									var125 = false;
									value2 = -1616775607 * anInt3152;

									while (value2 > 0) {
										var125 = true;
										--value2;

										for (value3 = 0; value3 < value2; ++value3) {
											var97 = false;
											RelationList var113 = aClass50Array3204[value3];
											RelationList var100 = aClass50Array3204[value3 + 1];
											if (var113.anInt666 * -698428043 != anInt3115 * -1631311031
													&& -698428043 * var100.anInt666 == -1631311031 * anInt3115) {
												var97 = true;
											}

											if (!var97 && 0 == -698428043 * var113.anInt666
													&& -698428043 * var100.anInt666 != 0) {
												var97 = true;
											}

											if (!var97 && !var113.aBool667 && var100.aBool667) {
												var97 = true;
											}

											if (!var97 && !var113.aBool669 && var100.aBool669) {
												var97 = true;
											}

											if (var97) {
												RelationList var111 = aClass50Array3204[value3];
												aClass50Array3204[value3] = aClass50Array3204[value3 + 1];
												aClass50Array3204[value3 + 1] = var111;
												var125 = false;
											}
										}

										if (var125) {
											break;
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 0) {
									value1 = packetBuffer.readUnsignedShort(899145687);
									value2 = packetBuffer.readUnsignedShort(-151732770);
									value3 = packetBuffer.readInt(-321469433);
									var105 = Class107.getInterface(value3, 314639891);
									var105.anInt1970 = -103301195 * (value2 + (value1 << 16));
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 153) {
                                    int i = packetBuffer.readSignedByte(1708176767);
									anInt3170 = i * 583418197;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 122) {
									value1 = packetBuffer.readInt2(2133575024);
									value2 = packetBuffer.method2069((byte) 0);
									value3 = packetBuffer.method2075(-202112122);
									var105 = Class107.getInterface(value1, 314639891);
									if (-459849887 * var105.xOffset != value2 || value3 != 538516377 * var105.yOffset
											|| var105.anInt1930 * -1186475957 != 0
											|| -306698303 * var105.anInt1915 != 0) {
										var105.xOffset = 10986657 * value2;
										var105.yOffset = -720369495 * value3;
										var105.anInt1930 = 0;
										var105.anInt1915 = 0;
										Class79.refreshInterface(var105, -1396732294);
										Player.method3563(var105, 1950203888);
										if (0 == -1305917269 * var105.type) {
											ObjectDefinition.method2435(
                                                    RSInterface.mainInterfaceArray[value1 >> 16], var105,
                                                    false, 1213318410);
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (177 == currentOpcode ) {
									Packet.method2213((byte) -118);
                                    int i = packetBuffer.readSignedByte(1708176767);
									anInt3098 = i * -84367693;
									anInt3122 = anInt3118 * 434653173;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 116) { //remove or add to cc
									var94 = packetBuffer.readString(61376769);
									value2 = packetBuffer.readUnsignedShort(-237384292);
									byte removeByte = packetBuffer.readUnsignedByte(1390301658);
									var97 = false;
									if (removeByte == -128) {
										var97 = true;
									}

									if (var97) { //remove player
										if (-1304125287 * Class98.ccPlayerCount == 0) {
											currentOpcode = -1;
											var85 = true;
											break readBuffer;
										}

										boolean var103 = false;

										for (var9 = 0; var9 < Class98.ccPlayerCount * -1304125287
												&& (!GameInterface.ourCurrentCC[var9].username
														.equals(var94)
														|| value2 != GameInterface.ourCurrentCC[var9].worldId
																* 1300426367); ++var9) {
											;
										}

										if (var9 < Class98.ccPlayerCount * -1304125287) {
											while (var9 < -1304125287 * Class98.ccPlayerCount - 1) {
												GameInterface.ourCurrentCC[var9] = GameInterface.ourCurrentCC[1
														+ var9];
												++var9;
											}

											Class98.ccPlayerCount -= -1124093015;
											GameInterface.ourCurrentCC[Class98.ccPlayerCount
													* -1304125287] = null;
										}
									} else { //add player/change rank
										packetBuffer.readString(61376769);
										PlayerAlias per = new PlayerAlias();
										per.username = var94;
										per.clanRankIcon = Class116_Sub23_Sub15.method2702(per.username,
												Class59_Sub1.aClass143_1831, -806241291);
										per.worldId = 967496063 * value2;
										per.clanRank = removeByte;

										for (col = Class98.ccPlayerCount * -1304125287 - 1; col >= 0; --col) {
											var11 = GameInterface.ourCurrentCC[col].clanRankIcon
													.compareTo(per.clanRankIcon);
											if (var11 == 0) {
												GameInterface.ourCurrentCC[col].worldId = 967496063
														* value2;
												GameInterface.ourCurrentCC[col].clanRank = removeByte;
												if (var94.equals(
														Class79.ourPlayer.username)) {
													ourccrank = removeByte;
												}

												anInt3127 = -942030581 * anInt3118;
												currentOpcode = -1;
												var85 = true;
												break readBuffer;
											}

											if (var11 < 0) {
												break;
											}
										}

										if (-1304125287
												* Class98.ccPlayerCount >= GameInterface.ourCurrentCC.length) {
											currentOpcode = -1;
											var85 = true;
											break readBuffer;
										}

										for (var11 = Class98.ccPlayerCount * -1304125287 - 1; var11 > col; --var11) {
											GameInterface.ourCurrentCC[var11
													+ 1] = GameInterface.ourCurrentCC[var11];
										}

										if (0 == -1304125287 * Class98.ccPlayerCount) {
											GameInterface.ourCurrentCC = new PlayerAlias[100];
										}

										GameInterface.ourCurrentCC[1 + col] = per;
										Class98.ccPlayerCount += -1124093015;
										if (var94.equals(Class79.ourPlayer.username)) {
											ourccrank = removeByte;
										}
									}

									anInt3127 = -942030581 * anInt3118;
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (156 == currentOpcode) {
									aBool2988 = false;

									for (value1 = 0; value1 < 5; ++value1) {
										aBoolArray2970[value1] = false;
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 19) {
									for (value1 = 0; value1 < Class107.varpData.length; ++value1) {
										if (Class107.varpData[value1] != Class107.anIntArray1454[value1]) {
											Class107.varpData[value1] = Class107.anIntArray1454[value1];
											World.method567(value1, 1961008023);
											anIntArray3119[(anInt3120 += 1551596873) * -729938695 - 1 & 31] = value1;
										}
									} 
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (145 == currentOpcode ) {//sendmessage
									value1 = packetBuffer.readSmartC(-14393444);
									var124 = packetBuffer.readSignedByte(1708176767) == 1;
									name = "";
									var97 = false;
									if (var124) {
										name = packetBuffer.readString(61376769);
										if (World.method568(name, -1976350399)) {
											var97 = true;
										}
									}

									String someStr = packetBuffer.readString(61376769);
									if (!var97) {
										Class86.appendMessage(value1, name, someStr, 1763502798);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (185 == currentOpcode ) {
									value1 = packetBuffer.readInt(-1454872856);
									var121 = Class107.getInterface(value1, 314639891);

									for (value3 = 0; value3 < var121.inv.length; ++value3) {
										var121.inv[value3] = -1;
										var121.inv[value3] = 0;
									}

									Class79.refreshInterface(var121, 888621302);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (62 == currentOpcode ) {
									World var104 = new World();
									var104.address = packetBuffer.readString(61376769);
									var104.worldId = packetBuffer.readUnsignedShort(1354845383) * -430891615;
									value2 = packetBuffer.readInt(-895205583);
									var104.activityFlag = 1825398059 * value2;
									Class116_Sub12.method1983(45, (byte) 69);
									Class38.streamBuffer.sync(1615140366);
									Class38.streamBuffer = null;
									Class100.method1427(var104, 2115992956);
									currentOpcode = -1;
									var85 = false;
									break readBuffer;
								}

								if (currentOpcode == 35) {
									Class8.decodeMapRegion(true, (byte) 110);
									packetBuffer.method2955((byte) 15);
									value1 = packetBuffer.readUnsignedShort(1091601294);
									Class32.decodePlayerUpdate(packetBuffer, value1, (byte) 10);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 181) {
									Class8.decodeNpcUpdate(true, 1550204582);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 172) {
									value1 = packetBuffer.readUnsignedShort(787331107);
									value2 = packetBuffer.readInt(-1422557084);
									var109 = Class107.getInterface(value2, 314639891);
									if (2 != var109.modelTypeDisabled * -768837131 || value1 != var109.mediaIdDisabled * 686060225) {
										var109.modelTypeDisabled = -752921414;
										var109.mediaIdDisabled = -541123263 * value1;
										Class79.refreshInterface(var109, 231468397);
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (169 == currentOpcode ) {
									Class32.decodePlayerUpdate(packetBuffer, 371800591 * packetLength, (byte) 10);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode == 4) { //dafuq 4?nigger
									packetBuffer.position += -861949196;
									if (packetBuffer.method2166((byte) 50)) {
										PacketBuilder var98 = packetBuffer;
										value2 = packetBuffer.position * 314639891 - 28;
										if (Class86.aClass140_1010 != null) {
											try {
												Class86.aClass140_1010.method1771(0L);
												Class86.aClass140_1010.method1764(var98.payload, value2, 24, -348227858);
											} catch (Exception var70) {
												;
											}
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (222 == currentOpcode) { //for custom regions reset
									for (value1 = 0; value1 < globalPlayers.length; ++value1) {
										if (globalPlayers[value1] != null) {
											globalPlayers[value1].anInt2587 = 1587034171;
										}
									}

									for (value1 = 0; value1 < aMobArray2972.length; ++value1) {
										if (null != aMobArray2972[value1]) {
											aMobArray2972[value1].anInt2587 = 1587034171;
										}
									}

									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								if (currentOpcode  == 68) {
									value1 = packetBuffer.readInt(-1759251463);
									value2 = packetBuffer.readInt(-436481837);
									if (null == Class43.aGarbageCollectorMXBean578
											|| !Class43.aGarbageCollectorMXBean578.isValid()) {
										try {
											Iterator var106 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

											while (var106.hasNext()) {
												GarbageCollectorMXBean var96 = (GarbageCollectorMXBean) var106.next();
												if (var96.isValid()) {
													Class43.aGarbageCollectorMXBean578 = var96;
													aLong3086 = -3199879388585765537L;
													aLong3212 = -2086566510266153657L;
												}
											}
										} catch (Throwable var77) {
											;
										}
									}

									long var62 = Class116_Sub5.generateHash(135540026);
									var9 = -1;
									if (null != Class43.aGarbageCollectorMXBean578) {
										var48 = Class43.aGarbageCollectorMXBean578.getCollectionTime();
										if (-1L != 229038749475924873L * aLong3212) {
											var54 = var48 - 229038749475924873L * aLong3212;
											var56 = var62 - aLong3086 * 6918662072055282017L;
											if (var56 != 0L) {
												var9 = (int) (100L * var54 / var56);
											}
										}

										aLong3212 = 2086566510266153657L * var48;
										aLong3086 = var62 * 3199879388585765537L;
									}

									rsaBuffer.startPacket(230, (byte) 84);
									rsaBuffer.writeByteC(anInt2918 * 305420995, 218638507);
									rsaBuffer.writeByteC(var9, 1888483689);
									rsaBuffer.writeLEInt(value1, (byte) 80);
									rsaBuffer.method2046(value2, 363001979);
									currentOpcode = -1;
									var85 = true;
									break readBuffer;
								}

								Class90.method1192("" + currentOpcode  + Class41.aString538
										+ anInt3066 * -1475322259 + Class41.aString538 + anInt3173 * 385590311
										+ Class41.aString538 + packetLength * 371800591, (Throwable) null, 343294798);
								Class93.method1270(-1305917269);
							} catch (IOException var78) {
								Class93.method1265(1847951744);
							} catch (Exception var79) {
								var94 = "" + currentOpcode + Class41.aString538 + anInt3066 * -1475322259
										+ Class41.aString538 + 385590311 * anInt3173 + Class41.aString538
										+ packetLength * 371800591 + Class41.aString538
										+ (Class79.ourPlayer.xMovementSteps[0]
												+ Class116_Sub17.anInt2105 * 1426698711)
										+ Class41.aString538
										+ (714823515 * Class33.anInt456
												+ Class79.ourPlayer.yMovementSteps[0])
										+ Class41.aString538;

								for (value2 = 0; value2 < 371800591 * packetLength && value2 < 50; ++value2) {
									var94 = var94 + packetBuffer.payload[value2] + Class41.aString538;
								}

								Class90.method1192(var94, var79, 343294798);
								Class93.method1270(-1305917269);
							}

							var85 = true;
						}
					}

					if (!var85) {
						break;
					}
				}

				if (30 == 846055547 * loginStage) {
					while (Class116_Sub23_Sub16_Sub1.method3098(-504055230)) {
						rsaBuffer.startPacket(54, (byte) 125);
						rsaBuffer.writeByte(0, 18641204);
						var2 = rsaBuffer.position * 314639891;
						PacketBuilder.addressReflection(rsaBuffer, 1078920098);
						rsaBuffer.method2152(rsaBuffer.position * 314639891 - var2, -801848431);
					}

					Object var86 = Mob.aClass35_2879.anObject478;
					synchronized (var86) {
						if (aBool2931) {

							if (Class85.anInt997 * 823601801 != 0
									|| 598524519 * Mob.aClass35_2879.anInt472 >= 40) {
								rsaBuffer.startPacket(157, (byte) 40);
								rsaBuffer.writeByte(0, 716656388);
								i2 = rsaBuffer.position * 314639891;
								availData = 0;

								for (value1 = 0; value1 < Mob.aClass35_2879.anInt472 * 598524519
										&& 314639891 * rsaBuffer.position - i2 < 240; ++value1) {
									++availData;
									value2 = Mob.aClass35_2879.anIntArray474[value1];
									if (value2 < 0) {
										value2 = 0;
									} else if (value2 > 502) {
										value2 = 502;
									}

									value3 = Mob.aClass35_2879.anIntArray471[value1];
									if (value3 < 0) {
										value3 = 0;
									} else if (value3 > 764) {
										value3 = 764;
									}

									clanRank = value3 + value2 * 765;
									if (-1 == Mob.aClass35_2879.anIntArray474[value1]
											&& -1 == Mob.aClass35_2879.anIntArray471[value1]) {
										value3 = -1;
										value2 = -1;
										clanRank = 524287;
									}

									if (443707603 * anInt2945 == value3 && value2 == -2142765485 * anInt3202) {
										if (anInt2947 * 1157656041 < 2047) {
											anInt2947 += 1669020249;
										}
									} else {
										var9 = value3 - anInt2945 * 443707603;
										anInt2945 = value3 * -834705573;
										col = value2 - anInt3202 * -2142765485;
										anInt3202 = value2 * -1955793445;
										if (anInt2947 * 1157656041 < 8 && var9 >= -32 && var9 <= 31 && col >= -32
												&& col <= 31) {
											var9 += 32;
											col += 32;
                                            int okk = anInt2947 * 1157656041;
											rsaBuffer.writeShort(col + (var9 << 6) + (anInt2947 * 1157656041 << 12),
                                                    -1913737174);
											anInt2947 = 0;
										} else if (1157656041 * anInt2947 < 8) {
                                            int okk = anInt2947 * 1157656041;
											rsaBuffer.writeMedium(clanRank + (1157656041 * anInt2947 << 19) + 8388608,
													(byte) 2);
											anInt2947 = 0;
										} else {
                                            int okk = anInt2947 * 1157656041;
											rsaBuffer.writeInt(-1073741824 + (anInt2947 * 1157656041 << 19) + clanRank,
													(byte) 108);
											anInt2947 = 0;
										}
									}
								}

								rsaBuffer.method2152(314639891 * rsaBuffer.position - i2, 16463291);
								if (availData >= Mob.aClass35_2879.anInt472 * 598524519) {
									Mob.aClass35_2879.anInt472 = 0;
								} else {
									Mob.aClass35_2879.anInt472 -= availData * -396936873;

									for (value1 = 0; value1 < Mob.aClass35_2879.anInt472
											* 598524519; ++value1) {
										Mob.aClass35_2879.anIntArray471[value1] = Mob.aClass35_2879.anIntArray471[value1
												+ availData];
										Mob.aClass35_2879.anIntArray474[value1] = Mob.aClass35_2879.anIntArray474[value1
												+ availData];
									}
								}
							}
						} else {
							Mob.aClass35_2879.anInt472 = 0;
						}
					}

					if (1 == Class85.anInt997 * 823601801
							|| !PlayerAlias.aBool1756 && Class85.anInt997 * 823601801 == 4
							|| 2 == Class85.anInt997 * 823601801) {
						long var65 = (Class85.aLong1000 * -3096940007801216539L - aLong2944 * -5594866611567002005L)
								/ 50L;
						if (var65 > 4095L) {
							var65 = 4095L;
						}

						aLong2944 = -6014946799255235345L * Class85.aLong1000;
						availData = 2090526775 * Class85.clickAreaY;
						if (availData < 0) {
							availData = 0;
						} else if (availData > 674167779 * Class116_Sub16.clientHeight) {
							availData = Class116_Sub16.clientHeight * 674167779;
						}

						value1 = Class85.clickAreaX * -2040065729;
						if (value1 < 0) {
							value1 = 0;
						} else if (value1 > Class42.clientWidth * -452716157) {
							value1 = -452716157 * Class42.clientWidth;
						}

						value2 = (int) var65;
						rsaBuffer.startPacket(253, (byte) 50);
						rsaBuffer.writeShort((value2 << 1) + (2 == 823601801 * Class85.anInt997 ? 1 : 0), -1767559648);
						rsaBuffer.writeShort(value1, -2095351373);
						rsaBuffer.writeShort(availData, -2115189406);
					}

					if (KeyFocusListener.anInt960 * 1701596051 > 0) {
						rsaBuffer.startPacket(251, (byte) 80);
						rsaBuffer.writeShort(0, -2033053465);
						var2 = rsaBuffer.position * 314639891;
						long var67 = Class116_Sub5.generateHash(280981620);

						for (value1 = 0; value1 < 1701596051 * KeyFocusListener.anInt960; ++value1) {
							key = var67 - aLong2966 * -7993424411696623387L;
							if (key > 16777215L) {
								key = 16777215L;
							}

							aLong2966 = -8084475441026814739L * var67;
							rsaBuffer.writeMedium1((int) key, 750099869);
							rsaBuffer.writeByteC(KeyFocusListener.anIntArray940[value1], 1009803743);
						}

						rsaBuffer.method2000(314639891 * rsaBuffer.position - var2, (byte) 56);
					}

					if (1957286053 * anInt3026 > 0) {
						anInt3026 -= 716281645;
					}

					if (KeyFocusListener.keysHeldDown[96] || KeyFocusListener.keysHeldDown[97]
							|| KeyFocusListener.keysHeldDown[98] || KeyFocusListener.keysHeldDown[99]) {
						aBool3027 = true;
					}

					if (aBool3027 && anInt3026 * 1957286053 <= 0) {
						anInt3026 = 1440731012;
						aBool3027 = false;
						rsaBuffer.startPacket(153, (byte) 117);
						rsaBuffer.writeLEShortA(anInt2994 * -1992036739, -406848979);
						rsaBuffer.writeLEShort(anInt2929 * -1916997753, 1229081150);
					}

					if (Animable.aBool2470 && !aBool2948) {
						aBool2948 = true;
						rsaBuffer.startPacket(188, (byte) 63);
						rsaBuffer.writeByte(1, -1459688955);
					}

					if (!Animable.aBool2470 && aBool2948) {
						aBool2948 = false;
						rsaBuffer.startPacket(188, (byte) 120);
						rsaBuffer.writeByte(0, -186352084);
					}

					if (GameInterface.anInt1819 * -747958745 != anInt3163 * -1331355705) {
						anInt3163 = 1960926881 * GameInterface.anInt1819;
						var2 = GameInterface.anInt1819 * -747958745;
						int[] var174 = Class116_Sub23_Sub18.mapSprite.myPixels;
						availData = var174.length;

						for (value1 = 0; value1 < availData; ++value1) {
							var174[value1] = 0;
						}

						for (value1 = 1; value1 < 103; ++value1) {
							value2 = (103 - value1) * 2048 + 24628;

							for (value3 = 1; value3 < 103; ++value3) {
								if (0 == (Class47.aByteArrayArrayArray634[var2][value3][value1] & 24)) {
									GameInterface.region.method379(var174, value2, 512, var2, value3, value1);
								}

								if (var2 < 3 && 0 != (Class47.aByteArrayArrayArray634[1 + var2][value3][value1] & 8)) {
									GameInterface.region.method379(var174, value2, 512, 1 + var2, value3, value1);
								}

								value2 += 4;
							}
						}

						value1 = (238 + (int) (Math.random() * 20.0D) - 10 << 16)
								+ (238 + (int) (Math.random() * 20.0D) - 10 << 8)
								+ (238 + (int) (Math.random() * 20.0D) - 10);
						value2 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
						Class116_Sub23_Sub18.mapSprite.initToDrawer();

						for (value3 = 1; value3 < 103; ++value3) {
							for (clanRank = 1; clanRank < 103; ++clanRank) {
								if (0 == (Class47.aByteArrayArrayArray634[var2][clanRank][value3] & 24)) {
									method3952(var2, clanRank, value3, value1, value2, (byte) 0);
								}

								if (var2 < 3 && 0 != (Class47.aByteArrayArrayArray634[var2 + 1][clanRank][value3] & 8)) {
									method3952(1 + var2, clanRank, value3, value1, value2, (byte) 0);
								}
							}
						}

						anInt3164 = 0;

						for (value3 = 0; value3 < 104; ++value3) {
							for (clanRank = 0; clanRank < 104; ++clanRank) {
								var9 = GameInterface.region.method374(GameInterface.anInt1819 * -747958745,
										value3, clanRank);
								if (var9 != 0) {
									var9 = var9 >> 14 & 32767;
									col = Class45.method700(var9, 359750046).anInt2235 * 1951420693;
									if (col >= 0) {
										var11 = value3;
										id = clanRank;
										if (22 != col && col != 29 && 34 != col && col != 36 && 46 != col
												&& 47 != col && col != 48) {
											int[][] var154 = aClass58Array2996[-747958745
													* GameInterface.anInt1819].anIntArrayArray764;

											for (var16 = 0; var16 < 10; ++var16) {
												var17 = (int) (Math.random() * 4.0D);
												if (var17 == 0 && var11 > 0 && var11 > value3 - 3
														&& 0 == (var154[var11 - 1][id] & 19136776)) {
													--var11;
												}

												if (var17 == 1 && var11 < 103 && var11 < 3 + value3
														&& (var154[var11 + 1][id] & 19136896) == 0) {
													++var11;
												}

												if (var17 == 2 && id > 0 && id > clanRank - 3
														&& 0 == (var154[var11][id - 1] & 19136770)) {
													--id;
												}

												if (var17 == 3 && id < 103 && id < clanRank + 3
														&& (var154[var11][1 + id] & 19136800) == 0) {
													++id;
												}
											}
										}

										aClass116_Sub23_Sub19_Sub2Array3167[-706898549
												* anInt3164] = Class116_Sub12.mapFunction[col];
										anIntArray3165[-706898549 * anInt3164] = var11;
										anIntArray3166[anInt3164 * -706898549] = id;
										anInt3164 += -1686410717;
									}
								}
							}
						}

						RSFIT.aAbstractRSDrawing_874.method326((byte) 7);
					}

					if (30 == 846055547 * loginStage) {
						for (Class116_Sub12 var88 = (Class116_Sub12) aClass117_3162
								.getFirst(); var88 != null; var88 = (Class116_Sub12) aClass117_3162.getNext()) {
							if (var88.anInt1846 * 1030491605 > 0) {
								var88.anInt1846 -= -622541955;
							}

							ObjectDefinition var175;
							if (1030491605 * var88.anInt1846 == 0) {
								if (-1525381273 * var88.anInt1839 >= 0) {
									availData = var88.anInt1839 * -1525381273;
									value1 = -2072747651 * var88.anInt1848;
									var175 = Class45.method700(availData, 359750046);
									if (value1 == 11) {
										value1 = 10;
									}

									if (value1 >= 5 && value1 <= 8) {
										value1 = 4;
									}

									var85 = var175.method2403(value1, (byte) -17);
									if (!var85) {
										continue;
									}
								}

								Class48.method771(var88.anInt1837 * 584375567, var88.anInt1838 * -1976125003,
										var88.anInt1835 * -1096801001, var88.anInt1847 * -127960105,
										var88.anInt1839 * -1525381273, var88.anInt1841 * 1621871539,
										-2072747651 * var88.anInt1848, (short) 430);
								var88.unlink();
							} else {
								if (var88.anInt1845 * -896271613 > 0) {
									var88.anInt1845 -= -900151381;
								}

								if (var88.anInt1845 * -896271613 == 0 && var88.anInt1835 * -1096801001 >= 1
										&& var88.anInt1847 * -127960105 >= 1 && -1096801001 * var88.anInt1835 <= 102
										&& -127960105 * var88.anInt1847 <= 102) {
									if (-1987202069 * var88.anInt1842 >= 0) {
										availData = var88.anInt1842 * -1987202069;
										value1 = -227757021 * var88.anInt1840;
										var175 = Class45.method700(availData, 359750046);
										if (11 == value1) {
											value1 = 10;
										}

										if (value1 >= 5 && value1 <= 8) {
											value1 = 4;
										}

										var85 = var175.method2403(value1, (byte) -50);
										if (!var85) {
											continue;
										}
									}

									Class48.method771(584375567 * var88.anInt1837, var88.anInt1838 * -1976125003,
											-1096801001 * var88.anInt1835, -127960105 * var88.anInt1847,
											var88.anInt1842 * -1987202069, var88.anInt1843 * 339689559,
											var88.anInt1840 * -227757021, (short) -2806);
									var88.anInt1845 = 900151381;
									if (-1987202069 * var88.anInt1842 == var88.anInt1839 * -1525381273
											&& -1 == -1525381273 * var88.anInt1839) {
										var88.unlink();
									} else if (-1525381273 * var88.anInt1839 == var88.anInt1842 * -1987202069
											&& 1621871539 * var88.anInt1841 == 339689559 * var88.anInt1843
											&& -2072747651 * var88.anInt1848 == var88.anInt1840 * -227757021) {
										var88.unlink();
									}
								}
							}
						}

						Class89.method1191(-1761604227);
						anInt2982 += 1497043651;
						if (anInt2982 * -955732501 > 750) {
							Class93.method1265(807289975);
						} else {
							Class95.method1310((byte) 127);
							RelationList.method774(-631947116);
							Class70.method997((short) -19269);
							anInt3012 += -437029491;
							if (0 != 2051359659 * anInt3046) {
								anInt3045 += -1836351588;
								if (179229491 * anInt3045 >= 400) {
									anInt3046 = 0;
								}
							}

							if (Class35.aClass116_Sub15_473 != null) {
								anInt3047 += 479812137;
								if (-1044454887 * anInt3047 >= 15) {
									Class79.refreshInterface(Class35.aClass116_Sub15_473, 1124078602);
									Class35.aClass116_Sub15_473 = null;
								}
							}

							RSInterface var91 = ObjectDefinition.aClass116_Sub15_2240;
							RSInterface var176 = Class116_Sub6.aClass116_Sub15_1745;
							ObjectDefinition.aClass116_Sub15_2240 = null;
							Class116_Sub6.aClass116_Sub15_1745 = null;
							aClass116_Sub15_2935 = null;
							aBool3114 = false;
							aBool3111 = false;
							anInt3156 = 0;

							while (Class69.method986(2023348341) && -703165807 * anInt3156 < 128) {
								if (playerRights * 1520983779 >= 2 && KeyFocusListener.keysHeldDown[82]
										&& Class5.anInt57 * -1989794123 == 66) {
									var94 = "";

									ChatMessage var178;
									for (Iterator var177 = Class37.aClass124_492.iterator(); var177
											.hasNext(); var94 = var94 + var178.aString2350 + ':' + var178.aString2347
													+ '\n') {
										var178 = (ChatMessage) var177.next();
									}

									CacheIndex.aClipboard1907.setContents(new StringSelection(var94),
											(ClipboardOwner) null);
								} else {
									anIntArray3158[-703165807 * anInt3156] = Class5.anInt57 * -1989794123;
									anIntArray3130[-703165807 * anInt3156] = Class2.aChar24;
									anInt3156 += -1538361743;
								}
							}

							if (anInt3200 * -1074177723 != -1) {
								Class49.method773(-1074177723 * anInt3200, 0, 0, Class42.clientWidth * -452716157,
										Class116_Sub16.clientHeight * 674167779, 0, 0, (byte) 75);
							}

							anInt3118 += 44844977;

							while (true) {
								Class116_Sub6 var115 = (Class116_Sub6) aClass117_3133.removeFirst();
								RSInterface var182;
								if (var115 == null) {
									while (true) {
										var115 = (Class116_Sub6) aClass117_3134.removeFirst();
										if (var115 == null) {
											while (true) {
												var115 = (Class116_Sub6) aClass117_3132.removeFirst();
												if (null == var115) {
													RSInputStream.method1031(-2073277849);
													if (null != aClass116_Sub15_3106) {
														Class79.refreshInterface(aClass116_Sub15_3106, 1768459946);
														RelationList.anInt672 += -95915169;
														if (aBool3114 && aBool3111) {
															availData = Class85.anInt991 * -453286219;
															value1 = Class85.anInt992 * 103771565;
															availData -= anInt3087 * -725471655;
															value1 -= 702495857 * anInt3109;
															if (availData < anInt3112 * 1272175975) {
																availData = anInt3112 * 1272175975;
															}

															if (availData + aClass116_Sub15_3106.wdth
																	* 1645211541 > aClass116_Sub15_3107.wdth
																			* 1645211541 + anInt3112 * 1272175975) {
																availData = anInt3112 * 1272175975
																		+ aClass116_Sub15_3107.wdth * 1645211541
																		- aClass116_Sub15_3106.wdth * 1645211541;
															}

															if (value1 < -765593137 * anInt3113) {
																value1 = -765593137 * anInt3113;
															}

															if (value1 + aClass116_Sub15_3106.heght
																	* 1227800423 > -765593137 * anInt3113
																			+ aClass116_Sub15_3107.heght
																					* 1227800423) {
																value1 = anInt3113 * -765593137
																		+ aClass116_Sub15_3107.heght * 1227800423
																		- 1227800423 * aClass116_Sub15_3106.heght;
															}

															value2 = availData - anInt2993 * -625398447;
															value3 = value1 - 1566554261 * anInt3116;
															clanRank = -345684957 * aClass116_Sub15_3106.anInt1999;
															if (1559668895
																	* RelationList.anInt672 > aClass116_Sub15_3106.anInt1965
																			* 464917361
																	&& (value2 > clanRank || value2 < -clanRank || value3 > clanRank
																			|| value3 < -clanRank)) {
																aBool3117 = true;
															}

															var9 = -352661099 * aClass116_Sub15_3107.anInt1946
																	+ (availData - 1272175975 * anInt3112);
															col = aClass116_Sub15_3107.anInt1947 * -1602694527
																	+ (value1 - anInt3113 * -765593137);
															Class116_Sub6 var149;
															if (aClass116_Sub15_3106.anObjectArray2012 != null
																	&& aBool3117) {
																var149 = new Class116_Sub6();
																var149.aClass116_Sub15_1736 = aClass116_Sub15_3106;
																var149.anInt1747 = var9 * 1833150263;
																var149.anInt1738 = col * 1385195697;
																var149.anObjectArray1737 = aClass116_Sub15_3106.anObjectArray2012;
																Friend.method1840(var149, -1995423912);
															}

															if (0 == Class85.anInt994 * -562612321) {
																if (aBool3117) {
																	if (null != aClass116_Sub15_3106.anObjectArray2013) {
																		var149 = new Class116_Sub6();
																		var149.aClass116_Sub15_1736 = aClass116_Sub15_3106;
																		var149.anInt1747 = var9 * 1833150263;
																		var149.anInt1738 = 1385195697 * col;
																		var149.aClass116_Sub15_1740 = aClass116_Sub15_2935;
																		var149.anObjectArray1737 = aClass116_Sub15_3106.anObjectArray2013;
																		Friend.method1840(var149, -2005386357);
																	}

																	if (aClass116_Sub15_2935 != null
																			&& Class116_Sub23_Sub15.method2696(
																					aClass116_Sub15_3106,
																					(byte) 109) != null) {
																		rsaBuffer.startPacket(216, (byte) 73);
																		rsaBuffer.writeShort(
                                                                                813479615
                                                                                        * aClass116_Sub15_2935.anInt2043,
                                                                                -1806855152);
																		rsaBuffer.writeInt(
																				-1536575275
																						* aClass116_Sub15_2935.hash,
																				(byte) 51);
																		rsaBuffer
																				.writeLEShortA(
                                                                                        aClass116_Sub15_2935.anInt1926
                                                                                                * 2021294259,
                                                                                        1181998013);
																		rsaBuffer.method2102(
																				813479615
																						* aClass116_Sub15_3106.anInt2043,
																				773256407);
																		rsaBuffer.method2046(
																				-1536575275
																						* aClass116_Sub15_3106.hash,
																				363001979);
																		rsaBuffer
																				.writeLEShortA(
                                                                                        aClass116_Sub15_3106.anInt1926
                                                                                                * 2021294259,
                                                                                        1416168887);
																	}
																} else if ((anInt3110 * 1052316233 == 1
																		|| Class47.method758(1768430155 * anInt3075 - 1,
																				1188831786))
																		&& 1768430155 * anInt3075 > 2) {
																	BasicTimer.method2218(
                                                                            anInt3087 * -725471655
                                                                                    + -625398447 * anInt2993,
                                                                            anInt3116 * 1566554261
                                                                                    + 702495857 * anInt3109,
                                                                            -823889771);
																} else if (anInt3075 * 1768430155 > 0) {
																	var11 = -725471655 * anInt3087
																			+ -625398447 * anInt2993;
																	id = 1566554261 * anInt3116
																			+ anInt3109 * 702495857;
																	Class116_Sub16.method2303(CacheIndex.aClass4_1911,
																			var11, id, (byte) -77);
																	CacheIndex.aClass4_1911 = null;
																}

																aClass116_Sub15_3106 = null;
															}
														} else if (RelationList.anInt672 * 1559668895 > 1) {
															aClass116_Sub15_3106 = null;
														}
													}

													if (null != Class116_Sub23_Sub1.aClass116_Sub15_2162) {
														Class79.refreshInterface(Class116_Sub23_Sub1.aClass116_Sub15_2162,
                                                                129159276);
														anInt3040 += -1664677949;
														if (-562612321 * Class85.anInt994 == 0) {
															if (aBool3053) {
																if (Class116_Sub23_Sub1.aClass116_Sub15_2162 == Class22.aClass116_Sub15_270
																		&& anInt3049 * 1979905201 != anInt3084
																				* -408071259) {
																	RSInterface var139 = Class116_Sub23_Sub1.aClass116_Sub15_2162;
																	byte var183 = 0;
																	if (anInt3096 * -137828697 == 1
																			&& 206 == -179718399 * var139.clientCode) {
																		var183 = 1;
																	}

																	if (var139.inv[-408071259
																			* anInt3084] <= 0) {
																		var183 = 0;
																	}

																	if (Class69.method990(
																			Class35.method645(var139, (byte) 0),
																			(byte) 4)) {
																		value2 = anInt3049 * 1979905201;
																		value3 = anInt3084 * -408071259;
																		var139.inv[value3] = var139.inv[value2];
																		var139.invStackSize[value3] = var139.invStackSize[value2];
																		var139.inv[value2] = -1;
																		var139.invStackSize[value2] = 0;
																	} else if (1 == var183) {
																		value2 = anInt3049 * 1979905201;
																		value3 = anInt3084 * -408071259;

																		while (value2 != value3) {
																			if (value2 > value3) {
																				var139.method2297(value2 - 1, value2,
																						-1598843181);
																				--value2;
																			} else if (value2 < value3) {
																				var139.method2297(1 + value2, value2,
																						1296469503);
																				++value2;
																			}
																		}
																	} else {
																		var139.method2297(anInt3084 * -408071259,
																				1979905201 * anInt3049, 143403744);
																	}

																	rsaBuffer.startPacket(219, (byte) 68);
																	rsaBuffer.writeShort(anInt3084 * -408071259,
                                                                            -2121228661);
																	rsaBuffer.writeByteC(var183, -612734714);
																	rsaBuffer.method2102(anInt3049 * 1979905201,
																			-627792754);
																	rsaBuffer.writeInt2(
                                                                            Class116_Sub23_Sub1.aClass116_Sub15_2162.hash
                                                                                    * -1536575275,
                                                                            1655679789);
																}
															} else if ((1 == anInt3110 * 1052316233 || Class47
																	.method758(anInt3075 * 1768430155 - 1, -777039393))
																	&& 1768430155 * anInt3075 > 2) {
																BasicTimer.method2218(anInt3092 * -827759387,
                                                                        45845103 * anInt3051, -1966311464);
															} else if (anInt3075 * 1768430155 > 0) {
																availData = -827759387 * anInt3092;
																value1 = anInt3051 * 45845103;
																Class116_Sub16.method2303(CacheIndex.aClass4_1911,
																		availData, value1, (byte) -52);
																CacheIndex.aClass4_1911 = null;
															}

															anInt3047 = 503154074;
															Class85.anInt997 = 0;
															Class116_Sub23_Sub1.aClass116_Sub15_2162 = null;
														} else if (950444267 * anInt3040 >= 5 && (-453286219
																* Class85.anInt991 > -827759387 * anInt3092 + 5
																|| Class85.anInt991
																		* -453286219 < anInt3092 * -827759387 - 5
																|| Class85.anInt992 * 103771565 > 5
																		+ 45845103 * anInt3051
																|| Class85.anInt992 * 103771565 < anInt3051 * 45845103
																		- 5)) {
															aBool3053 = true;
														}
													}

													if (-1 != Region.anInt336) {
														availData = Region.anInt336;
														value1 = Region.anInt341;
														rsaBuffer.startPacket(12, (byte) 21);
														rsaBuffer.writeByte(5, 477370879);
                                                        //82 = ctrl for running
														rsaBuffer.writeByteC(KeyFocusListener.keysHeldDown[82]  ? (KeyFocusListener.keysHeldDown[81] ? 2 : 1) : 0,
                                                                1357281269);
														rsaBuffer.writeLEShortA(
                                                                Class116_Sub17.anInt2105 * 1426698711 + availData,
                                                                -31505191);
														rsaBuffer.writeLEShort(Class33.anInt456 * 714823515 + value1,
                                                                1405134017);
														Region.anInt336 = -1;
														anInt3043 = Class85.clickAreaX * -1489075687;
														anInt3044 = -250191479 * Class85.clickAreaY;
														anInt3046 = 461086467;
														anInt3045 = 0;
														anInt3168 = -1943900347 * availData;
														anInt3208 = value1 * 317027045;
													}

													if (var91 != ObjectDefinition.aClass116_Sub15_2240) {
														if (null != var91) {
															Class79.refreshInterface(var91, -1073672970);
														}

														if (ObjectDefinition.aClass116_Sub15_2240 != null) {
															Class79.refreshInterface(ObjectDefinition.aClass116_Sub15_2240,
                                                                    1574680721);
														}
													}

													if (Class116_Sub6.aClass116_Sub15_1745 != var176
															&& 1149981077 * anInt2934 == 1046829805 * anInt3072) {
														if (null != var176) {
															Class79.refreshInterface(var176, 1081083694);
														}

														if (Class116_Sub6.aClass116_Sub15_1745 != null) {
															Class79.refreshInterface(Class116_Sub6.aClass116_Sub15_1745,
                                                                    -841448050);
														}
													}

													if (Class116_Sub6.aClass116_Sub15_1745 != null) {
														if (1046829805 * anInt3072 < 1149981077 * anInt2934) {
															anInt3072 += 1335169765;
															if (anInt3072 * 1046829805 == anInt2934 * 1149981077) {
																Class79.refreshInterface(Class116_Sub6.aClass116_Sub15_1745,
                                                                        -670094191);
															}
														}
													} else if (anInt3072 * 1046829805 > 0) {
														anInt3072 -= 1335169765;
													}

													availData = Class79.ourPlayer.anInt2609
															* 1272643751 + anInt3194 * 1311998203;
													value1 = -896118313 * anInt3002 + -1801433343
															* Class79.ourPlayer.anInt2579;
													if (-2122646045 * Class7.anInt117 - availData < -500
															|| Class7.anInt117 * -2122646045 - availData > 500
															|| Class116_Sub23_Sub4.anInt2249 * 1406199355 - value1 < -500
															|| 1406199355 * Class116_Sub23_Sub4.anInt2249
																	- value1 > 500) {
														Class7.anInt117 = availData * -1133236277;
														Class116_Sub23_Sub4.anInt2249 = 959120115 * value1;
													}

													if (-2122646045 * Class7.anInt117 != availData) {
														Class7.anInt117 += -1133236277
																* ((availData - Class7.anInt117 * -2122646045) / 16);
													}

													if (1406199355 * Class116_Sub23_Sub4.anInt2249 != value1) {
														Class116_Sub23_Sub4.anInt2249 += (value1
																- 1406199355 * Class116_Sub23_Sub4.anInt2249) / 16
																* 959120115;
													}

													if (Class85.anInt994 * -562612321 == 4 && PlayerAlias.aBool1756) {
														value2 = 103771565 * Class85.anInt992 - -1174998117 * anInt2990;
														anInt3022 = value2 * 1215960858;
														anInt2990 = 1184053907 * (value2 != -1 && value2 != 1
																? (103771565 * Class85.anInt992
																		+ -1174998117 * anInt2990) / 2
																: 103771565 * Class85.anInt992);
														value3 = 371877991 * anInt2942 - Class85.anInt991 * -453286219;
														anInt3178 = value3 * -1440533622;
														anInt2942 = (value3 != -1 && value3 != 1
																? (Class85.anInt991 * -453286219
																		+ 371877991 * anInt2942) / 2
																: -453286219 * Class85.anInt991) * -559533225;
													} else {
														if (KeyFocusListener.keysHeldDown[96]) {
															anInt3178 += (-24 - anInt3178 * 206470413) / 2 * 1427216837;
														} else if (KeyFocusListener.keysHeldDown[97]) {
															anInt3178 += (24 - anInt3178 * 206470413) / 2 * 1427216837;
														} else {
															anInt3178 = 1427216837 * (206470413 * anInt3178 / 2);
														}

														if (KeyFocusListener.keysHeldDown[98]) {
															anInt3022 += 607980429
																	* ((12 - -1100927163 * anInt3022) / 2);
														} else if (KeyFocusListener.keysHeldDown[99]) {
															anInt3022 += 607980429
																	* ((-12 - anInt3022 * -1100927163) / 2);
														} else {
															anInt3022 = 607980429 * (anInt3022 * -1100927163 / 2);
														}

														anInt2990 = Class85.anInt992 * -1804850089;
														anInt2942 = 1984165507 * Class85.anInt991;
													}

													anInt2929 = (anInt2929 * -1916997753 + 206470413 * anInt3178 / 2
															& 2047) * -571365833;
													anInt2994 += -1100927163 * anInt3022 / 2 * 1871674069;
													if (anInt2994 * -1992036739 < 128) {
														anInt2994 = -943887744;
													}

													if (anInt2994 * -1992036739 > 383) {
														anInt2994 = -408370005;
													}

													value2 = Class7.anInt117 * -2122646045 >> 7;
													value3 = 1406199355 * Class116_Sub23_Sub4.anInt2249 >> 7;
													clanRank = MobDefinition.method2552(-2122646045 * Class7.anInt117,
                                                            Class116_Sub23_Sub4.anInt2249 * 1406199355,
                                                            -747958745 * GameInterface.anInt1819, (short) 2178);
													var9 = 0;
													if (value2 > 3 && value3 > 3 && value2 < 100 && value3 < 100) {
														for (col = value2 - 4; col <= value2 + 4; ++col) {
															for (var11 = value3 - 4; var11 <= 4 + value3; ++var11) {
																id = GameInterface.anInt1819 * -747958745;
																if (id < 3
																		&& 2 == (Class47.aByteArrayArrayArray634[1][col][var11]
																				& 2)) {
																	++id;
																}

																var13 = clanRank
																		- Class47.anIntArrayArrayArray635[id][col][var11];
																if (var13 > var9) {
																	var9 = var13;
																}
															}
														}
													}

													col = var9 * 192;
													if (col > 98048) {
														col = 98048;
													}

													if (col < '\u8000') {
														col = '\u8000';
													}

													if (col > 137595259 * anInt3077) {
														anInt3077 += (col - anInt3077 * 137595259) / 24 * 34663859;
													} else if (col < 137595259 * anInt3077) {
														anInt3077 += 34663859 * ((col - anInt3077 * 137595259) / 80);
													}

													if (aBool2988) {
														availData = Class31.anInt428 * 915224960 + 64;
														value1 = Class32.anInt440 * 402993792 + 64;
														value2 = MobDefinition.method2552(availData, value1,
                                                                -747958745 * GameInterface.anInt1819, (short) 15766)
																- Class3.anInt43 * 3036509;
														if (282154897 * Class116_Sub23_Sub16_Sub5.anInt2740 < availData) {
															Class116_Sub23_Sub16_Sub5.anInt2740 += 933251441 * ((availData
																	- Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897)
																	* -2101471913 * Class116_Sub23_Sub18.anInt2481
																	/ 1000
																	+ ObjectDefinition.anInt2208 * -2096533901);
															if (282154897
																	* Class116_Sub23_Sub16_Sub5.anInt2740 > availData) {
																Class116_Sub23_Sub16_Sub5.anInt2740 = availData * 933251441;
															}
														}

														if (282154897 * Class116_Sub23_Sub16_Sub5.anInt2740 > availData) {
															Class116_Sub23_Sub16_Sub5.anInt2740 -= 933251441
																	* ((Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897
																			- availData) * Class116_Sub23_Sub18.anInt2481
																			* -2101471913 / 1000
																			+ ObjectDefinition.anInt2208
																					* -2096533901);
															if (282154897
																	* Class116_Sub23_Sub16_Sub5.anInt2740 < availData) {
																Class116_Sub23_Sub16_Sub5.anInt2740 = 933251441 * availData;
															}
														}

														if (RelationList.anInt671 * 1447873857 < value2) {
															RelationList.anInt671 += (ObjectDefinition.anInt2208
																	* -2096533901
																	+ Class116_Sub23_Sub18.anInt2481 * -2101471913
																			* (value2 - RelationList.anInt671 * 1447873857)
																			/ 1000)
																	* -1022442815;
															if (1447873857 * RelationList.anInt671 > value2) {
																RelationList.anInt671 = value2 * -1022442815;
															}
														}

														if (1447873857 * RelationList.anInt671 > value2) {
															RelationList.anInt671 -= -1022442815
																	* (-2096533901 * ObjectDefinition.anInt2208
																			+ (1447873857 * RelationList.anInt671 - value2)
																					* Class116_Sub23_Sub18.anInt2481
																					* -2101471913 / 1000);
															if (1447873857 * RelationList.anInt671 < value2) {
																RelationList.anInt671 = -1022442815 * value2;
															}
														}

														if (-324676025 * Class83.anInt968 < value1) {
															Class83.anInt968 += 1432154999
																	* (-2096533901 * ObjectDefinition.anInt2208
																			+ (value1 - -324676025 * Class83.anInt968)
																					* Class116_Sub23_Sub18.anInt2481
																					* -2101471913 / 1000);
															if (Class83.anInt968 * -324676025 > value1) {
																Class83.anInt968 = 1432154999 * value1;
															}
														}

														if (Class83.anInt968 * -324676025 > value1) {
															Class83.anInt968 -= (Class116_Sub23_Sub18.anInt2481
																	* -2101471913
																	* (-324676025 * Class83.anInt968 - value1) / 1000
																	+ ObjectDefinition.anInt2208 * -2096533901)
																	* 1432154999;
															if (-324676025 * Class83.anInt968 < value1) {
																Class83.anInt968 = 1432154999 * value1;
															}
														}

														availData = 64 + Class59_Sub1.anInt1834 * 1908651904;
														value1 = anInt3183 * 107932800 + 64;
														value2 = MobDefinition.method2552(availData, value1,
                                                                -747958745 * GameInterface.anInt1819, (short) 2695)
																- Class116_Sub23_Sub16_Sub1.anInt2573 * 715633123;
														value3 = availData - Class116_Sub23_Sub16_Sub5.anInt2740 * 282154897;
														clanRank = value2 - 1447873857 * RelationList.anInt671;
														var9 = value1 - -324676025 * Class83.anInt968;
														col = (int) Math.sqrt((double) (value3 * value3 + var9 * var9));
														var11 = (int) (Math.atan2((double) clanRank, (double) col)
																* 325.949D) & 2047;
														id = (int) (Math.atan2((double) value3, (double) var9)
																* -325.949D) & 2047;
														if (var11 < 128) {
															var11 = 128;
														}

														if (var11 > 383) {
															var11 = 383;
														}

														if (Class78.anInt904 * 1162853107 < var11) {
															Class78.anInt904 += (Class36.anInt487 * 549132187
																	* (var11 - 1162853107 * Class78.anInt904) / 1000
																	+ -1113540799 * Class43.anInt580) * 1852239419;
															if (1162853107 * Class78.anInt904 > var11) {
																Class78.anInt904 = var11 * 1852239419;
															}
														}

														if (Class78.anInt904 * 1162853107 > var11) {
															Class78.anInt904 -= ((Class78.anInt904 * 1162853107 - var11)
																	* Class36.anInt487 * 549132187 / 1000
																	+ -1113540799 * Class43.anInt580) * 1852239419;
															if (1162853107 * Class78.anInt904 < var11) {
																Class78.anInt904 = 1852239419 * var11;
															}
														}

														var13 = id - -210812059 * Class76.anInt895;
														if (var13 > 1024) {
															var13 -= 2048;
														}

														if (var13 < -1024) {
															var13 += 2048;
														}

														if (var13 > 0) {
															Class76.anInt895 += (-1113540799 * Class43.anInt580
																	+ var13 * Class36.anInt487 * 549132187 / 1000)
																	* 531969645;
															Class76.anInt895 = (-210812059 * Class76.anInt895 & 2047)
																	* 531969645;
														}

														if (var13 < 0) {
															Class76.anInt895 -= (-1113540799 * Class43.anInt580
																	+ 549132187 * Class36.anInt487 * -var13 / 1000)
																	* 531969645;
															Class76.anInt895 = (-210812059 * Class76.anInt895 & 2047)
																	* 531969645;
														}

														var14 = id - -210812059 * Class76.anInt895;
														if (var14 > 1024) {
															var14 -= 2048;
														}

														if (var14 < -1024) {
															var14 += 2048;
														}

														if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
															Class76.anInt895 = 531969645 * id;
														}
													}

													for (availData = 0; availData < 5; ++availData) {
														++anIntArray3188[availData];
													}

													Class39.aClass33_518.method609(-595957965);
													availData = Class116_Sub23_Sub13.method2667(-1747370542);
													value1 = 689796811 * KeyFocusListener.anInt959;
													if (availData > 15000 && value1 > 15000) {
														anInt2987 = -453788862;
														Class85.anInt986 = -1867429308;
														rsaBuffer.startPacket(182, (byte) 19);
													}

													anInt3006 += -1363846693;
													if (-2137195949 * anInt3006 > 500) {
														anInt3006 = 0;
														value3 = (int) (Math.random() * 8.0D);
														if ((value3 & 1) == 1) {
															anInt3194 += 741363619 * anInt3001;
														}

														if (2 == (value3 & 2)) {
															anInt3002 += -330854363 * anInt3003;
														}

														if ((value3 & 4) == 4) {
															anInt3004 += anInt3005 * -1044167141;
														}
													}

													if (1311998203 * anInt3194 < -50) {
														anInt3001 = 1609074786;
													}

													if (anInt3194 * 1311998203 > 50) {
														anInt3001 = -1609074786;
													}

													if (-896118313 * anInt3002 < -55) {
														anInt3003 = 975522870;
													}

													if (-896118313 * anInt3002 > 55) {
														anInt3003 = -975522870;
													}

													if (-1913217891 * anInt3004 < -40) {
														anInt3005 = 804940911;
													}

													if (-1913217891 * anInt3004 > 40) {
														anInt3005 = -804940911;
													}

													anInt2946 += 745733717;
													if (1420431101 * anInt2946 > 500) {
														anInt2946 = 0;
														value3 = (int) (Math.random() * 8.0D);
														if (1 == (value3 & 1)) {
															anInt3007 += -1297834643 * anInt3008;
														}

														if ((value3 & 2) == 2) {
															anInt3009 += anInt3010 * -2091901849;
														}
													}

													if (anInt3007 * -1718342721 < -60) {
														anInt3008 = 1760620982;
													}

													if (anInt3007 * -1718342721 > 60) {
														anInt3008 = -1760620982;
													}

													if (anInt3009 * -806982331 < -20) {
														anInt3010 = -2064007701;
													}

													if (-806982331 * anInt3009 > 10) {
														anInt3010 = 2064007701;
													}

													for (Friend var181 = (Friend) friendList
															.popFront(); null != var181; var181 = (Friend) friendList
																	.peekFront()) {
														if ((long) (var181.anInt1663 * -1725912957) < Class116_Sub5
																.generateHash(1788993582) / 1000L - 5L) {
															if (var181.clanRank > 0) {
																Class86.appendMessage(5, "",
                                                                        var181.username + Class91.hasLoggedIn,
                                                                        9194405);
															}

															if (var181.clanRank == 0) {
																Class86.appendMessage(5, "",
                                                                        var181.username + Class91.hasLoggedOut,
                                                                        -1762729715);
															}

															var181.unlink();
														}
													}

													anInt2983 += 530378793;
													if (anInt2983 * 736734233 > 50) {
                                                        if(!Launcher.rsps)
														rsaBuffer.startPacket(126, (byte) 38);
													}

													try {
														if (null != Class38.streamBuffer
																&& 314639891 * rsaBuffer.position > 0) {
															Class38.streamBuffer.flush(rsaBuffer.payload, 0,
                                                                    314639891 * rsaBuffer.position, 1619314133);
															rsaBuffer.position = 0;
															anInt2983 = 0;
															return;
														}
													} catch (IOException var69) {
														Class93.method1265(1264153010);
													}

													return;
												}

												var182 = var115.aClass116_Sub15_1736;
												if (2021294259 * var182.anInt1926 >= 0) {
													var121 = Class107.getInterface(var182.parent * -1652479707,
                                                            314639891);
													if (null == var121 || null == var121.aClass116_Sub15Array1995
															|| 2021294259
																	* var182.anInt1926 >= var121.aClass116_Sub15Array1995.length
															|| var121.aClass116_Sub15Array1995[var182.anInt1926
																	* 2021294259] != var182) {
														continue;
													}
												}

												Friend.method1840(var115, -2082272399);
											}
										}

										var182 = var115.aClass116_Sub15_1736;
										if (2021294259 * var182.anInt1926 >= 0) {
											var121 = Class107.getInterface(var182.parent * -1652479707, 314639891);
											if (null == var121 || null == var121.aClass116_Sub15Array1995
													|| 2021294259
															* var182.anInt1926 >= var121.aClass116_Sub15Array1995.length
													|| var121.aClass116_Sub15Array1995[2021294259
															* var182.anInt1926] != var182) {
												continue;
											}
										}

										Friend.method1840(var115, -2004209918);
									}
								}

								var182 = var115.aClass116_Sub15_1736;
								if (var182.anInt1926 * 2021294259 >= 0) {
									var121 = Class107.getInterface(-1652479707 * var182.parent, 314639891);
									if (var121 == null || null == var121.aClass116_Sub15Array1995
											|| 2021294259 * var182.anInt1926 >= var121.aClass116_Sub15Array1995.length
											|| var121.aClass116_Sub15Array1995[2021294259
													* var182.anInt1926] != var182) {
										continue;
									}
								}

								Friend.method1840(var115, -2137672048);
							}
						}
					}
				}
			}
		} else if (846055547 * loginStage == 40 || 45 == 846055547 * loginStage) {
			Class69.processLogin((byte) 1);
		}

	}

	void method3677(int var1) {
		if (loginStage * 846055547 != 1000) {
			long var2 = Class116_Sub5.generateHash(-975988584);
			int var4 = (int) (var2 - Class93.aLong1337 * -7519494246777129627L);
			Class93.aLong1337 = 8420123348744189037L * var2;
			if (var4 > 200) {
				var4 = 200;
			}

			Class93.anInt1336 += 272638619 * var4;
			boolean var5;
			if (Class93.anInt1338 * -1358134653 == 0 && 0 == 1721465631 * Class93.anInt1349
					&& Class93.anInt1344 * 1714437309 == 0 && 0 == 1018165549 * Class93.anInt1339) {
				var5 = true;
			} else if (null == Class93.aClass71_1335) {
				var5 = false;
			} else {
				try {
					if (-156634221 * Class93.anInt1336 > 30000) {
						throw new IOException();
					}

					Class116_Sub23_Sub21 var6;
					Packet var7;
					while (Class93.anInt1349 * 1721465631 < 20 && 1018165549 * Class93.anInt1339 > 0) {
						var6 = (Class116_Sub23_Sub21) Class93.aHashtable_1357.getFirst();
						var7 = new Packet(4);
						var7.writeByte(1, 190496985);
						var7.writeMedium((int) var6.hashId, (byte) 92);
						Class93.aClass71_1335.flush(var7.payload, 0, 4, -2108577204);
						Class93.aHashtable_1352.put(var6, var6.hashId);
						Class93.anInt1339 -= -1554399579;
						Class93.anInt1349 += 255344863;
					}

					while (-1358134653 * Class93.anInt1338 < 20 && 1714437309 * Class93.anInt1344 > 0) {
						var6 = (Class116_Sub23_Sub21) Class93.aClass121_1342.method1618();
						var7 = new Packet(4);
						var7.writeByte(0, -1122938777);
						var7.writeMedium((int) var6.hashId, (byte) -58);
						Class93.aClass71_1335.flush(var7.payload, 0, 4, -1321971833);
						var6.unlinkContainer();
						Class93.aHashtable_1345.put(var6, var6.hashId);
						Class93.anInt1344 -= 556834453;
						Class93.anInt1338 += 30759979;
					}

					int var23 = 0;

					while (true) {
						if (var23 < 100) {
							int var24 = Class93.aClass71_1335.readableBytes((byte) -7);
							if (var24 < 0) {
								throw new IOException();
							}

							if (0 != var24) {
								label205: {
									Class93.anInt1336 = 0;
									byte var8 = 0;
									if (Class1.aClass116_Sub23_Sub21_7 == null) {
										var8 = 8;
									} else if (0 == -1986173707 * Class93.anInt1346) {
										var8 = 1;
									}

									int var9;
									int var10;
									int var11;
									int var13;
									if (var8 > 0) {
										var9 = var8 - 314639891 * Class93.aClass116_Sub14_1347.position;
										if (var9 > var24) {
											var9 = var24;
										}

										Class93.aClass71_1335.readBytes(Class93.aClass116_Sub14_1347.payload,
                                                Class93.aClass116_Sub14_1347.position * 314639891, var9, 615894679);
										if (Class93.aByte1340 != 0) {
											for (var10 = 0; var10 < var9; ++var10) {
												Class93.aClass116_Sub14_1347.payload[Class93.aClass116_Sub14_1347.position
														* 314639891 + var10] ^= Class93.aByte1340;
											}
										}

										Class93.aClass116_Sub14_1347.position += -184175589 * var9;
										if (Class93.aClass116_Sub14_1347.position * 314639891 < var8) {
											break label205;
										}

										if (null == Class1.aClass116_Sub23_Sub21_7) {
											Class93.aClass116_Sub14_1347.position = 0;
											var10 = Class93.aClass116_Sub14_1347.readSignedByte(1708176767);
											var11 = Class93.aClass116_Sub14_1347.readUnsignedShort(1893562159);
											int var12 = Class93.aClass116_Sub14_1347.readSignedByte(1708176767);
											var13 = Class93.aClass116_Sub14_1347.readInt(-1238876923);
											long var14 = (long) ((var10 << 16) + var11);
											Class116_Sub23_Sub21 var16 = (Class116_Sub23_Sub21) Class93.aHashtable_1352
													.get(var14);
											Class105.aBool1435 = true;
											if (var16 == null) {
												var16 = (Class116_Sub23_Sub21) Class93.aHashtable_1345.get(var14);
												Class105.aBool1435 = false;
											}

											if (var16 == null) {
												throw new IOException();
											}

											int var17 = var12 == 0 ? 5 : 9;
											Class1.aClass116_Sub23_Sub21_7 = var16;
											Class93.aClass116_Sub14_1348 = new Packet(
													var17 + var13 + Class1.aClass116_Sub23_Sub21_7.aByte2524);
											Class93.aClass116_Sub14_1348.writeByte(var12, -190710003);
											Class93.aClass116_Sub14_1348.writeInt(var13, (byte) 69);
											Class93.anInt1346 = 1483291368;
											Class93.aClass116_Sub14_1347.position = 0;
										} else if (-1986173707 * Class93.anInt1346 == 0) {
											if (-1 == Class93.aClass116_Sub14_1347.payload[0]) {
												Class93.anInt1346 = -351459491;
												Class93.aClass116_Sub14_1347.position = 0;
											} else {
												Class1.aClass116_Sub23_Sub21_7 = null;
											}
										}
									} else {
										var9 = Class93.aClass116_Sub14_1348.payload.length
												- Class1.aClass116_Sub23_Sub21_7.aByte2524;
										var10 = 512 - Class93.anInt1346 * -1986173707;
										if (var10 > var9 - 314639891 * Class93.aClass116_Sub14_1348.position) {
											var10 = var9 - 314639891 * Class93.aClass116_Sub14_1348.position;
										}

										if (var10 > var24) {
											var10 = var24;
										}

										Class93.aClass71_1335.readBytes(Class93.aClass116_Sub14_1348.payload,
                                                314639891 * Class93.aClass116_Sub14_1348.position, var10, 615894679);
										if (Class93.aByte1340 != 0) {
											for (var11 = 0; var11 < var10; ++var11) {
												Class93.aClass116_Sub14_1348.payload[Class93.aClass116_Sub14_1348.position
														* 314639891 + var11] ^= Class93.aByte1340;
											}
										}

										Class93.aClass116_Sub14_1348.position += -184175589 * var10;
										Class93.anInt1346 += var10 * -351459491;
										if (Class93.aClass116_Sub14_1348.position * 314639891 == var9) {
											if (Class1.aClass116_Sub23_Sub21_7.hashId == 16711935L) {
												Class106.aClass116_Sub14_1444 = Class93.aClass116_Sub14_1348;

												for (var11 = 0; var11 < 256; ++var11) {
													CacheIndex var25 = Class93.aCacheIndexArray1351[var11];
													if (null != var25) {
														Class106.aClass116_Sub14_1444.position = -920877945
																+ var11 * -1473404712;
														var13 = Class106.aClass116_Sub14_1444.readInt(-1061779679);
														int var18 = Class106.aClass116_Sub14_1444
																.readInt(-1835757879);
														var25.method2233(var13, var18, 556895211);
													}
												}
											} else {
												Class93.aCRC32_1350.reset();
												Class93.aCRC32_1350.update(Class93.aClass116_Sub14_1348.payload, 0,
														var9);
												var11 = (int) Class93.aCRC32_1350.getValue();
												if (Class1.aClass116_Sub23_Sub21_7.anInt2525 * -2143112411 != var11) {
													try {
														Class93.aClass71_1335.sync(-1395799089);
													} catch (Exception var21) {
														;
													}

													Class93.anInt1353 += 1983812729;
													Class93.aClass71_1335 = null;
													Class93.aByte1340 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
													var5 = false;
													break;
												}

												Class93.anInt1353 = 0;
												Class93.anInt1354 = 0;
												Class1.aClass116_Sub23_Sub21_7.aCacheIndex_2523
														.method2221(
																(int) (Class1.aClass116_Sub23_Sub21_7.hashId
																		& 65535L),
																Class93.aClass116_Sub14_1348.payload,
																16711680L == (Class1.aClass116_Sub23_Sub21_7.hashId
																		& 16711680L),
																Class105.aBool1435, (byte) 49);
											}

											Class1.aClass116_Sub23_Sub21_7.unlink();
											if (Class105.aBool1435) {
												Class93.anInt1349 -= 255344863;
											} else {
												Class93.anInt1338 -= 30759979;
											}

											Class93.anInt1346 = 0;
											Class1.aClass116_Sub23_Sub21_7 = null;
											Class93.aClass116_Sub14_1348 = null;
										} else {
											if (-1986173707 * Class93.anInt1346 != 512) {
												break label205;
											}

											Class93.anInt1346 = 0;
										}
									}

									++var23;
									continue;
								}
							}
						}

						var5 = true;
						break;
					}
				} catch (IOException var22) {
                    var22.printStackTrace();
					try {
						Class93.aClass71_1335.sync(1426280457);
					} catch (Exception var20) {
                        var22.printStackTrace();
						;
					}

					Class93.anInt1354 += -1096754175;
					Class93.aClass71_1335 = null;
					var5 = false;
				}
			}

			if (!var5) {
				this.method3700(-9919200);
			}

		}
	}

	protected final void method3585(byte var1) {
	}


	void method3700(int var1) {
		if (-448031287 * Class93.anInt1353 >= 4) {
			this.method3582("js5crc", (byte) 0);
			loginStage = 295086904;
		} else {
			if (Class93.anInt1354 * 1047471105 >= 4) {
				if (loginStage * 846055547 <= 5) {
					this.method3582("js5io", (byte) 0);
					loginStage = 295086904;
					return;
				}

				anInt3137 = 1244563592;
				Class93.anInt1354 = 1004704771;
			}

			if ((anInt3137 -= 1071293367) * 1042459143 + 1 <= 0) {
				try {
					if (anInt2963 * 871661897 == 0) {
						Friend.aClass72_1665 = ISAAC.signLink.socket(World.aString386,
                                Class29.anInt404 * 2028673991, (byte) 1);
						anInt2963 += 2080129273;
					}

					if (1 == 871661897 * anInt2963) {
						if (Friend.aClass72_1665.anInt866 == 2) {
							this.method3803(-1, -486091785);
							return;
						}

						if (Friend.aClass72_1665.anInt866 == 1) {
							anInt2963 += 2080129273;
						}
					}

					if (2 == 871661897 * anInt2963) {
						Class60.aClass71_779 = new RSInputStream((Socket) Friend.aClass72_1665.anObject869,
								ISAAC.signLink);
						Packet var2 = new Packet(5);
						var2.writeByte(15, 763184261);
						var2.writeInt(103, (byte) 74);
						Class60.aClass71_779.flush(var2.payload, 0, 5, 990017971);
						anInt2963 += 2080129273;
						GameInterface.aLong1813 = Class116_Sub5.generateHash(-1961009970) * 438338058587165431L;
					}

					if (3 == 871661897 * anInt2963) {
						if (loginStage * 846055547 > 5 && Class60.aClass71_779.readableBytes((byte) -38) <= 0) {
							if (Class116_Sub5.generateHash(-739190424)
									- GameInterface.aLong1813 * 6665081146797919943L > 30000L) {
								this.method3803(-2, -486091785);
								return;
							}
						} else {
							int var4 = Class60.aClass71_779.readByte(-404936723);
							if (var4 != 0) {
								this.method3803(var4, -486091785);
								return;
							}

							anInt2963 += 2080129273;
						}
					}

					if (anInt2963 * 871661897 == 4) {
						Class35.method640(Class60.aClass71_779, loginStage * 846055547 > 20, -558244889);
						Friend.aClass72_1665 = null;
						Class60.aClass71_779 = null;
						anInt2963 = 0;
						anInt2967 = 0;
					}
				} catch (IOException var3) {
					this.method3803(-3, -486091785);
				}

			}
		}
	}

	void method3803(int var1, int var2) {
		Friend.aClass72_1665 = null;
		Class60.aClass71_779 = null;
		anInt2963 = 0;
		if (Class94.port * 809635993 == 2028673991 * Class29.anInt404) {
			Class29.anInt404 = Class51.anInt682 * 715804305;
		} else {
			Class29.anInt404 = 1439019167 * Class94.port;
		}

		anInt2967 += -1173968285;
		if (anInt2967 * -608360629 >= 2 && (7 == var1 || 9 == var1)) {
			if (846055547 * loginStage <= 5) {
				this.method3582("js5connect_full", (byte) 0);
				loginStage = 295086904;
			} else {
				anInt3137 = 1244563592;
			}
		} else if (-608360629 * anInt2967 >= 2 && var1 == 6) {
			this.method3582("js5connect_outofdate", (byte) 0);
			loginStage = 295086904;
		} else if (-608360629 * anInt2967 >= 4) {
			if (loginStage * 846055547 <= 5) {
				this.method3582("js5connect", (byte) 0);
				loginStage = 295086904;
			} else {
				anInt3137 = 1244563592;
			}
		}

	}

	protected final void method3604(int var1) {
		if (Class39.aClass33_518.method610(966621959)) {
			Class39.aClass33_518.method606(898217222);
		}

		if (null != Mob.aClass35_2879) {
			Mob.aClass35_2879.aBool470 = false;
		}

		Mob.aClass35_2879 = null;
		if (null != Class38.streamBuffer) {
			Class38.streamBuffer.sync(592546375);
			Class38.streamBuffer = null;
		}

		if (null != KeyFocusListener.aClass82_962) {
			KeyFocusListener var2 = KeyFocusListener.aClass82_962;
			synchronized (var2) {
				KeyFocusListener.aClass82_962 = null;
			}
		}

		if (null != Class85.aClass85_987) {
			Class85 var10 = Class85.aClass85_987;
			synchronized (var10) {
				Class85.aClass85_987 = null;
			}
		}

		Class32.aClass89_443 = null;
		if (Class116_Sub23_Sub20.aClass9_2510 != null) {
			Class116_Sub23_Sub20.aClass9_2510.method149((short) -5658);
		}

		if (null != Class35.aClass9_475) {
			Class35.aClass9_475.method149((short) -23084);
		}

		if (Class93.aClass71_1335 != null) {
			Class93.aClass71_1335.sync(1912589932);
		}

		Object var11 = CacheWorker.anObject1416;
		synchronized (var11) {
			if (0 != CacheWorker.anInt1415 * 1638013353) {
				CacheWorker.anInt1415 = 9935513;

				try {
					CacheWorker.anObject1416.wait();
				} catch (InterruptedException var6) {
					;
				}
			}
		}

		Class37.method661(300064424);
	}

	protected final void method3578(int var1) {
		Class94.port = (anInt3020 * 1082541889 == 0 ? '\uaa4a' : '\u9c40' + -1631311031 * anInt3115) * -767343703;
		Class51.anInt682 = (1082541889 * anInt3020 == 0 ? 443 : anInt3115 * -1631311031 + '\uc350') * 701960199;
		Class29.anInt404 = Class94.port * 1439019167;
		Class108.aShortArray1462 = Class104.aShortArray1430;
		Class108.aShortArrayArray1460 = Class104.aShortArrayArray1425;
		Class104.aShortArray1428 = Class104.aShortArray1426;
		Class97.aShortArrayArray1373 = Class104.aShortArrayArray1424;
		Friend.method1837(83176752);
		Class116_Sub23_Sub14.method2681(Tile.aCanvas1875, 1387887133);
		Canvas var2 = Tile.aCanvas1875;
		var2.addMouseListener(Class85.aClass85_987);
		var2.addMouseMotionListener(Class85.aClass85_987);
		var2.addFocusListener(Class85.aClass85_987);

		Class89_Sub1 var3;
		try {
			var3 = new Class89_Sub1();
		} catch (Throwable var7) {
			var3 = null;
		}

		Class32.aClass89_443 = var3;
		if (null != Class32.aClass89_443) {
			Class32.aClass89_443.method1180(Tile.aCanvas1875, (short) 17146);
		}

		Class3.checksumIndex = new RSFIT(255, Class86.gameDataFile, Class86.gameDataChecksums, 500000);
		Class116_Sub5.aClass29_1727 = Class116_Sub23_Sub11.method2638(-215124388);
		CacheIndex.aClipboard1907 = this.getToolkit().getSystemClipboard();
		Class63.method933(this, Class38.aString507, (byte) 91);
		if (0 != anInt3020 * 1082541889) {
			aBool2949 = true;
		}

		int var4 = -1207115777 * Class116_Sub5.aClass29_1727.anInt405;
		aLong2975 = 0L;
		if (var4 >= 2) {
			aBool3140 = true;
		} else {
			aBool3140 = false;
		}

		Class116_Sub5.method1931(-1960013450);
		if (846055547 * loginStage >= 25) {
			rsaBuffer.startPacket(23, (byte) 55);
			PacketBuilder var5 = rsaBuffer;
			int var6 = aBool3140 ? 2 : 1;
			var5.writeByte(var6, -1525728607);
			rsaBuffer.writeShort(Class42.clientWidth * -452716157, -2066709703);
			rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -1772054626);
		}

		aBool2921 = true;
	}


	protected final void method3587(short var1) {
		boolean var2;
		label202: {
			try {
				if (-1587772409 * Class128.anInt1574 == 2) {
					if (null == Class98.aClass116_Sub18_1381) {
						Class98.aClass116_Sub18_1381 = Class116_Sub18.method2321(Class128.aRSIndex_1575,
								Class112.anInt1485 * 729981213, -664270353 * Class129.anInt1581);
						if (null == Class98.aClass116_Sub18_1381) {
							var2 = false;
							break label202;
						}
					}

					if (Class116_Sub23_Sub18.aClass14_2478 == null) {
						Class116_Sub23_Sub18.aClass14_2478 = new Class14(Class128.aRSIndex_1573,
								Class128.aRSIndex_1578);
					}

					if (Class128.aClass116_Sub4_Sub4_1576.method2996(Class98.aClass116_Sub18_1381,
							Class101.aRSIndex_1411, Class116_Sub23_Sub18.aClass14_2478, 22050, -1235957410)) {
						Class128.aClass116_Sub4_Sub4_1576.method2997((byte) -75);
						Class128.aClass116_Sub4_Sub4_1576.method2994(1705221873 * Class128.anInt1579, 1310409596);
						Class128.aClass116_Sub4_Sub4_1576.method3057(Class98.aClass116_Sub18_1381, Class55.aBool715,
								-2136407815);
						Class128.anInt1574 = 0;
						Class98.aClass116_Sub18_1381 = null;
						Class116_Sub23_Sub18.aClass14_2478 = null;
						Class128.aRSIndex_1575 = null;
						var2 = true;
						break label202;
					}
				}
			} catch (Exception var17) {
				var17.printStackTrace();
				Class128.aClass116_Sub4_Sub4_1576.method3075(1733994109);
				Class128.anInt1574 = 0;
				Class98.aClass116_Sub18_1381 = null;
				Class116_Sub23_Sub18.aClass14_2478 = null;
				Class128.aRSIndex_1575 = null;
			}

			var2 = false;
		}

		if (var2 && aBool3159 && Class116_Sub23_Sub20.aClass9_2510 != null) {
			Class116_Sub23_Sub20.aClass9_2510.method148((byte) -47);
		}

		int var6;
		if (loginStage * 846055547 == 10 || loginStage * 846055547 == 20 || loginStage * 846055547 == 30) {
			if (0L != aLong2975 * 203608972292936527L
					&& Class116_Sub5.generateHash(2036828818) > 203608972292936527L * aLong2975) {
				int var4 = aBool3140 ? 2 : 1;
				aLong2975 = 0L;
				if (var4 >= 2) {
					aBool3140 = true;
				} else {
					aBool3140 = false;
				}

				Class116_Sub5.method1931(-1638007568);
				if (846055547 * loginStage >= 25) {
					rsaBuffer.startPacket(23, (byte) 99);
					PacketBuilder var5 = rsaBuffer;
					var6 = aBool3140 ? 2 : 1;
					var5.writeByte(var6, 543693404);
					rsaBuffer.writeShort(-452716157 * Class42.clientWidth, -1692676158);
					rsaBuffer.writeShort(674167779 * Class116_Sub16.clientHeight, -1902240064);
				}

				aBool2921 = true;
			} else if (aBool2924) {
				Class116_Sub23_Sub11.method2592(-1506567528);
			}
		}

		Dimension var18 = this.method3584((byte) 24);
		if (var18.width != -1830553327 * Class116_Sub23_Sub7.anInt2289 || var18.height != Class25.anInt354 * 2045896553
				|| aBool2923) {
			Class116_Sub5.method1931(-826328067);
			aLong2975 = (Class116_Sub5.generateHash(115647549) + 500L) * 276652985331671983L;
			aBool2923 = false;
		}

		boolean var19 = false;
		if (aBool2921) {
			aBool2921 = false;
			var19 = true;

			for (var6 = 0; var6 < 100; ++var6) {
				aBoolArray3073[var6] = true;
			}
		}

		if (var19) {
			Class116_Sub23_Sub1.method2356(1706561553);
		}

		if (0 == 846055547 * loginStage) {
			var6 = -1478431965 * Class6.anInt72;
			String var7 = Class6.aString83;
			Color var8 = null;

			try {
				Graphics var9 = Tile.aCanvas1875.getGraphics();
				if (Class8.aFont129 == null) {
					Class8.aFont129 = new Font("Helvetica", 1, 13);
					ISAAC.aFontMetrics701 = Tile.aCanvas1875.getFontMetrics(Class8.aFont129);
				}

				if (var19) {
					var9.setColor(Color.black);
					var9.fillRect(0, 0, Class42.clientWidth * -452716157, 674167779 * Class116_Sub16.clientHeight);
				}

				if (null == var8) {
					var8 = new Color(140, 17, 17);
				}

				try {
					if (null == RSFIT.anImage876) {
						RSFIT.anImage876 = Tile.aCanvas1875.createImage(304, 34);
					}

					Graphics var10 = RSFIT.anImage876.getGraphics();
					var10.setColor(var8);
					var10.drawRect(0, 0, 303, 33);
					var10.fillRect(2, 2, 3 * var6, 30);
					var10.setColor(Color.black);
					var10.drawRect(1, 1, 301, 31);
					var10.fillRect(2 + 3 * var6, 2, 300 - var6 * 3, 30);
					var10.setFont(Class8.aFont129);
					var10.setColor(Color.white);
					var10.drawString(var7, (304 - ISAAC.aFontMetrics701.stringWidth(var7)) / 2, 22);
					var9.drawImage(RSFIT.anImage876, Class42.clientWidth * -452716157 / 2 - 152,
							Class116_Sub16.clientHeight * 674167779 / 2 - 18, (ImageObserver) null);
				} catch (Exception var13) {
					int var11 = -452716157 * Class42.clientWidth / 2 - 152;
					int var12 = 674167779 * Class116_Sub16.clientHeight / 2 - 18;
					var9.setColor(var8);
					var9.drawRect(var11, var12, 303, 33);
					var9.fillRect(var11 + 2, 2 + var12, 3 * var6, 30);
					var9.setColor(Color.black);
					var9.drawRect(var11 + 1, var12 + 1, 301, 31);
					var9.fillRect(var6 * 3 + 2 + var11, 2 + var12, 300 - var6 * 3, 30);
					var9.setFont(Class8.aFont129);
					var9.setColor(Color.white);
					var9.drawString(var7, var11 + (304 - ISAAC.aFontMetrics701.stringWidth(var7)) / 2, 22 + var12);
				}
			} catch (Exception var14) {
				Tile.aCanvas1875.repaint();
			}
		} else if (5 == 846055547 * loginStage) {
			Class98.method1348(Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537,
					RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672, aClass116_Sub23_Sub19_Sub4_Sub1_2989, var19,
					(byte) 124);
		} else if (10 != 846055547 * loginStage && 11 != 846055547 * loginStage) {
			if (20 == 846055547 * loginStage) {
				Class98.method1348(Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537,
						RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672, aClass116_Sub23_Sub19_Sub4_Sub1_2989, var19,
						(byte) 119);
			} else if (25 == 846055547 * loginStage) {
				if (anInt3091 * 252312367 == 1) {
					if (anInt3078 * -938799965 > anInt3105 * -52271427) {
						anInt3105 = -1562794273 * anInt3078;
					}

					var6 = (1681395946 * anInt3105 - anInt3078 * 304642006) / (-52271427 * anInt3105);
					Class94.method1300(Class91.aString1056 + Class41.aString541 + Class41.aString540 + var6 + "%"
							+ Class41.aString543, false, -618120603);
				} else if (anInt3091 * 252312367 == 2) {
					if (434687465 * anInt2992 > 1863586757 * anInt2960) {
						anInt2960 = -1274437675 * anInt2992;
					}

					var6 = (-1309942662 * anInt2960 - 259536770 * anInt2992) / (anInt2960 * 1863586757) + 50;
					Class94.method1300(Class91.aString1056 + Class41.aString541 + Class41.aString540 + var6 + "%"
							+ Class41.aString543, false, -2002901797);
				} else {
					Class94.method1300(Class91.aString1056, false, -1567789362);
				}
			} else if (846055547 * loginStage == 30) {
				Class61.method912(-806559289);
			} else if (loginStage * 846055547 == 40) {
				Class94.method1300(Class91.aString1057 + Class41.aString541 + Class91.aString1058, false, -1985497829);
			} else if (loginStage * 846055547 == 45) {
				Class94.method1300(Class91.aString1149, false, -1831619486);
			}
		} else {
			Class98.method1348(Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537,
					RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672, aClass116_Sub23_Sub19_Sub4_Sub1_2989, var19,
					(byte) 105);
		}

		int var20;
		Graphics var21;
		if (loginStage * 846055547 == 30 && 0 == 1685649351 * anInt3145 && !var19) {
			try {
				var21 = Tile.aCanvas1875.getGraphics();

				for (var20 = 0; var20 < anInt3136 * -580551879; ++var20) {
					if (aBoolArray3139[var20]) {
						RSFIT.aAbstractRSDrawing_874.method325(var21, anIntArray3141[var20], anIntArray3142[var20],
								anIntArray3143[var20], anIntArray3144[var20], (short) 271);
						aBoolArray3139[var20] = false;
					}
				}
			} catch (Exception var16) {
				Tile.aCanvas1875.repaint();
			}
		} else if (loginStage * 846055547 > 0) {
			try {
				var21 = Tile.aCanvas1875.getGraphics();
				RSFIT.aAbstractRSDrawing_874.method333(var21, 0, 0, -819332484);

				for (var20 = 0; var20 < anInt3136 * -580551879; ++var20) {
					aBoolArray3139[var20] = false;
				}
			} catch (Exception var15) {
				Tile.aCanvas1875.repaint();
			}
		}

	}

	static final void method3952(int var0, int var1, int var2, int var3, int var4, byte var5) {
		int onTile = GameInterface.region.method452(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int objectId;
		int var12;
		int var15;
		if (0 != onTile) {
			var8 = GameInterface.region.getTileContentsType(var0, var1, var2, onTile);
			var15 = var8 >> 6 & 3;
			var9 = var8 & 31;
			objectId = var3;
			if (onTile > 0) {
				objectId = var4;
			}

			int[] var10 = Class116_Sub23_Sub18.mapSprite.myPixels;
			var7 = 4 * var1 + 24624 + 2048 * (103 - var2);
			var12 = onTile >> 14 & 32767;
			ObjectDefinition var13 = Class45.method700(var12, 359750046);
			if (-1 != var13.anInt2218 * -1798686461) {
				Class116_Sub23_Sub19_Sub3 var14 = Class2.mapScene[var13.anInt2218
						* -1798686461];
				if (var14 != null) {
					int var16 = (var13.sizeX * 355676604 - var14.anInt2763) / 2;
					int var17 = (685838988 * var13.sizeY - var14.anInt2764) / 2;
					var14.method3359(4 * var1 + 48 + var16,
							4 * (104 - var2 - var13.sizeY * -1976023901) + 48 + var17);
				}
			} else {
				if (var9 == 0 || 2 == var9) {
					if (0 == var15) {
						var10[var7] = objectId;
						var10[512 + var7] = objectId;
						var10[var7 + 1024] = objectId;
						var10[var7 + 1536] = objectId;
					} else if (var15 == 1) {
						var10[var7] = objectId;
						var10[1 + var7] = objectId;
						var10[2 + var7] = objectId;
						var10[3 + var7] = objectId;
					} else if (2 == var15) {
						var10[var7 + 3] = objectId;
						var10[512 + 3 + var7] = objectId;
						var10[1024 + 3 + var7] = objectId;
						var10[1536 + var7 + 3] = objectId;
					} else if (3 == var15) {
						var10[var7 + 1536] = objectId;
						var10[var7 + 1536 + 1] = objectId;
						var10[1536 + var7 + 2] = objectId;
						var10[var7 + 1536 + 3] = objectId;
					}
				}

				if (3 == var9) {
					if (var15 == 0) {
						var10[var7] = objectId;
					} else if (var15 == 1) {
						var10[3 + var7] = objectId;
					} else if (2 == var15) {
						var10[var7 + 3 + 1536] = objectId;
					} else if (3 == var15) {
						var10[1536 + var7] = objectId;
					}
				}

				if (var9 == 2) {
					if (3 == var15) {
						var10[var7] = objectId;
						var10[var7 + 512] = objectId;
						var10[var7 + 1024] = objectId;
						var10[1536 + var7] = objectId;
					} else if (var15 == 0) {
						var10[var7] = objectId;
						var10[1 + var7] = objectId;
						var10[2 + var7] = objectId;
						var10[3 + var7] = objectId;
					} else if (1 == var15) {
						var10[3 + var7] = objectId;
						var10[512 + var7 + 3] = objectId;
						var10[1024 + var7 + 3] = objectId;
						var10[1536 + var7 + 3] = objectId;
					} else if (2 == var15) {
						var10[var7 + 1536] = objectId;
						var10[1 + 1536 + var7] = objectId;
						var10[2 + var7 + 1536] = objectId;
						var10[var7 + 1536 + 3] = objectId;
					}
				}
			}
		}

		onTile = GameInterface.region.getTileContents(var0, var1, var2);
		if (onTile != 0) {
			var8 = GameInterface.region.getTileContentsType(var0, var1, var2, onTile);
			var15 = var8 >> 6 & 3;
			var9 = var8 & 31;
			objectId = onTile >> 14 & 32767;
			ObjectDefinition var20 = Class45.method700(objectId, 359750046);
			int var23;
			if (var20.anInt2218 * -1798686461 != -1) {
				Class116_Sub23_Sub19_Sub3 var18 = Class2.mapScene[-1798686461
						* var20.anInt2218];
				if (var18 != null) {
					var12 = (355676604 * var20.sizeX - var18.anInt2763) / 2;
					var23 = (685838988 * var20.sizeY - var18.anInt2764) / 2;
					var18.method3359(var1 * 4 + 48 + var12,
							48 + (104 - var2 - -1976023901 * var20.sizeY) * 4 + var23);
				}
			} else if (9 == var9) {
				var7 = 15658734;
				if (onTile > 0) {
					var7 = 15597568;
				}

				int[] var22 = Class116_Sub23_Sub18.mapSprite.myPixels;
				var23 = var1 * 4 + 24624 + 2048 * (103 - var2);
				if (0 != var15 && var15 != 2) {
					var22[var23] = var7;
					var22[1 + 512 + var23] = var7;
					var22[var23 + 1024 + 2] = var7;
					var22[3 + var23 + 1536] = var7;
				} else {
					var22[1536 + var23] = var7;
					var22[1024 + var23 + 1] = var7;
					var22[2 + 512 + var23] = var7;
					var22[var23 + 3] = var7;
				}
			}
		}

		onTile = GameInterface.region.method374(var0, var1, var2);
		if (0 != onTile) {
			var8 = onTile >> 14 & 32767;
			ObjectDefinition var24 = Class45.method700(var8, 359750046);
			if (var24.anInt2218 * -1798686461 != -1) {
				Class116_Sub23_Sub19_Sub3 var19 = Class2.mapScene[var24.anInt2218
						* -1798686461];
				if (null != var19) {
					objectId = (var24.sizeX * 355676604 - var19.anInt2763) / 2;
					int var21 = (685838988 * var24.sizeY - var19.anInt2764) / 2;
					var19.method3359(48 + var1 * 4 + objectId,
							var21 + (104 - var2 - -1976023901 * var24.sizeY) * 4 + 48);
				}
			}
		}

	}

	public static int method3953(Packet var0, String var1, int var2) {
		int var3 = var0.position * 314639891;
		byte[] var4 = Class64.method938(var1, (byte) -97);
		var0.writeSmart(var4.length, 720272980);
		var0.position += client.aClass52_1621.method789(var4, 0, var4.length, var0.payload, 314639891 * var0.position,
				-1887037095) * -184175589;
		return var0.position * 314639891 - var3;
	}












    static RSIndex aRSIndex_1618;
    public static HuffManEncryption aClass52_1621;

    static int anInt1646;
    public static NodeList aClass119_1617 = new NodeList();


    static byte[][][] aByteArrayArrayArray1614;
    static int[] anIntArray1615;


    static final int method1740(RSInterface var0, int var1, byte var2) {
        if(var0.cs1opcodes != null && var1 < var0.cs1opcodes.length) {
            try {
                int[] var3 = var0.cs1opcodes[var1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;

                while(true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if(var7 == 0) {
                        return var4;
                    }

                    if(1 == var7) {
                        var8 = client.anIntArray2953[var3[var5++]];
                    }

                    if(var7 == 2) {
                        var8 = client.anIntArray2951[var3[var5++]];
                    }

                    if(var7 == 3) {
                        var8 = client.anIntArray3108[var3[var5++]];
                    }

                    int var10;
                    RSInterface var11;
                    int var12;
                    int var13;
                    if(4 == var7) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = Class107.getInterface(var10, 314639891);
                        var12 = var3[var5++];
                        if(var12 != -1 && (!RelationList.method778(var12, (byte) 70).aBool2374 || client.aBool2936)) {
                            for(var13 = 0; var13 < var11.inv.length; ++var13) {
                                if(1 + var12 == var11.inv[var13]) {
                                    var8 += var11.invStackSize[var13];
                                }
                            }
                        }
                    }

                    if(var7 == 5) {
                        var8 = Class107.varpData[var3[var5++]];
                    }

                    if(var7 == 6) {
                        var8 = Class76.anIntArray891[client.anIntArray2951[var3[var5++]] - 1];
                    }

                    if(7 == var7) {
                        var8 = Class107.varpData[var3[var5++]] * 100 / '\ub71b';
                    }

                    if(8 == var7) {
                        var8 = Class79.ourPlayer.anInt2908 * 1614853309;
                    }

                    if(var7 == 9) {
                        for(var10 = 0; var10 < 25; ++var10) {
                            if(Class76.aBoolArray892[var10]) {
                                var8 += client.anIntArray2951[var10];
                            }
                        }
                    }

                    if(var7 == 10) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = Class107.getInterface(var10, 314639891);
                        var12 = var3[var5++];
                        if(-1 != var12 && (!RelationList.method778(var12, (byte) 70).aBool2374 || client.aBool2936)) {
                            for(var13 = 0; var13 < var11.inv.length; ++var13) {
                                if(var12 + 1 == var11.inv[var13]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }

                    if(var7 == 11) {
                        var8 = client.anInt3098 * -1005815685;
                    }

                    if(var7 == 12) {
                        var8 = client.anInt3099 * -1944031695;
                    }

                    if(var7 == 13) {
                        var10 = Class107.varpData[var3[var5++]];
                        int var15 = var3[var5++];
                        var8 = (var10 & 1 << var15) != 0?1:0;
                    }

                    if(var7 == 14) {
                        var10 = var3[var5++];
                        var8 = Class103.method1451(var10, -584760962);
                    }

                    if(15 == var7) {
                        var9 = 1;
                    }

                    if(16 == var7) {
                        var9 = 2;
                    }

                    if(17 == var7) {
                        var9 = 3;
                    }

                    if(var7 == 18) {
                        var8 = 1426698711 * Class116_Sub17.anInt2105 + (1272643751 * Class79.ourPlayer.anInt2609 >> 7);
                    }

                    if(var7 == 19) {
                        var8 = (Class79.ourPlayer.anInt2579 * -1801433343 >> 7) + 714823515 * Class33.anInt456;
                    }

                    if(var7 == 20) {
                        var8 = var3[var5++];
                    }

                    if(var9 == 0) {
                        if(0 == var6) {
                            var4 += var8;
                        }

                        if(1 == var6) {
                            var4 -= var8;
                        }

                        if(var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }

                        if(3 == var6) {
                            var4 *= var8;
                        }

                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var14) {
                return -1;
            }
        } else {
            return -2;
        }
    }


}