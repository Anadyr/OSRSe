package com.jagex;

import java.math.BigInteger;

public class Packet extends Node {

	public int position;
	static int[] crcTable = new int[256];
	static long[] aLongArray1883;
	public byte[] payload;

	public Packet(byte[] var1) {
		this.payload = var1;
		this.position = 0;
	}

	public int method1989(byte var1) {
		this.position += -552526767;
		return ((this.payload[this.position * 314639891 - 2] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 3] & 255) << 8)
				+ (this.payload[314639891 * this.position - 1] & 255);
	}

	public void writeShort(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
	}

	public void writeMedium(int var1, byte var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
	}

	public void writeInt(int var1, byte var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 24);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
	}

	public void method1993(long var1) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 40));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 32));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 24));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 16));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 8));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) var1);
	}

	public void method1994(long var1) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 56));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 48));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 40));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 32));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 24));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 16));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) (var1 >> 8));
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) ((int) var1);
	}

	public void writeJGString(String var1, int var2) {
		int var3 = var1.indexOf(0);
		if (var3 < 0) {
			this.position += Class64.method939(var1, 0, var1.length(), this.payload, 314639891 * this.position,
					1588957102) * -184175589;
			this.payload[(this.position += -184175589) * 314639891 - 1] = 0;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public void method1999(int var1, int var2) {
		this.payload[this.position * 314639891 - var1 - 4] = (byte) (var1 >> 24);
		this.payload[314639891 * this.position - var1 - 3] = (byte) (var1 >> 16);
		this.payload[this.position * 314639891 - var1 - 2] = (byte) (var1 >> 8);
		this.payload[this.position * 314639891 - var1 - 1] = (byte) var1;
	}

	public void method2000(int var1, byte var2) {
		this.payload[314639891 * this.position - var1 - 2] = (byte) (var1 >> 8);
		this.payload[314639891 * this.position - var1 - 1] = (byte) var1;
	}

	public void applyRSA(BigInteger var1, BigInteger var2, byte var3) {
		int var4 = this.position * 314639891;
		this.position = 0;
		byte[] var7 = new byte[var4];
		this.readBytes(var7, 0, var4, 1968971550);
		BigInteger var8 = new BigInteger(var7);
		BigInteger var5 = client.anInt3020 * -1257630376  == 0 ? var8.modPow(var1, var2) : var8;
		byte[] var6 = var5.toByteArray();
		this.position = 0;
		this.writeShort(var6.length, -1975462452);
		this.method2110(var6, 0, var6.length, 512611054);
	}

	public void writeSmart(int var1, int var2) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1, -1739701241);
		} else if (var1 >= 0 && var1 < '\u8000') {
			this.writeShort('\u8000' + var1, -2015802360);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method2003(int var1, int var2) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if (0 != (var1 & -2097152)) {
					if (0 != (var1 & -268435456)) {
						this.writeByte(var1 >>> 28 | 128, 683503075);
					}

					this.writeByte(var1 >>> 21 | 128, -1344904243);
				}

				this.writeByte(var1 >>> 14 | 128, 260865424);
			}

			this.writeByte(var1 >>> 7 | 128, -782040340);
		}

		this.writeByte(var1 & 127, 297391225);
	}

	public int readSignedByte(int var1) {
		return this.payload[(this.position += -184175589) * 314639891 - 1] & 255;
	}

	public int readUnsignedShort(int var1) {
		this.position += -368351178;
		return ((this.payload[314639891 * this.position - 2] & 255) << 8)
				+ (this.payload[314639891 * this.position - 1] & 255);
	}

	public int readShort(int var1) {
		this.position += -368351178;
		int var2 = (this.payload[314639891 * this.position - 1] & 255)
				+ ((this.payload[this.position * 314639891 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int readMedium(byte var1) {
		this.position += -552526767;
		return (this.payload[this.position * 314639891 - 1] & 255)
				+ ((this.payload[314639891 * this.position - 3] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 2] & 255) << 8);
	}

	public int readInt(int var1) {
		this.position += -736702356;
		return (this.payload[this.position * 314639891 - 1] & 255)
				+ ((this.payload[314639891 * this.position - 4] & 255) << 24)
				+ ((this.payload[314639891 * this.position - 3] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 2] & 255) << 8);
	}

	public long readLong(byte var1) {
		long var2 = (long) this.readInt(-1859563628) & 4294967295L;
		long var4 = (long) this.readInt(-233300548) & 4294967295L;
		return (var2 << 32) + var4;
	}

	public String method2011(int var1) {
		if (this.payload[this.position * 314639891] == 0) {
			this.position += -184175589;
			return null;
		} else {
			return this.readString(61376769);
		}
	}

	public String readString(int var1) {
		int var2 = this.position * 314639891;

		while (this.payload[(this.position += -184175589) * 314639891 - 1] != 0) {
			;
		}

		int var3 = this.position * 314639891 - var2 - 1;
		return var3 == 0 ? "" : Tile.method1987(this.payload, var2, var3, (byte) 122);
	}

	public String method2014(int var1) {
		byte var2 = this.payload[(this.position += -184175589) * 314639891 - 1];
		if (0 != var2) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method2116((byte) -121);
			if (var3 + 314639891 * this.position > this.payload.length) {
				throw new IllegalStateException("");
			} else {
				String var4 = Class57.readJagString(this.payload, this.position * 314639891, var3, 793368497);
				this.position += -184175589 * var3;
				return var4;
			}
		}
	}

	public int readSmartC(int var1) {
		int var2 = this.payload[314639891 * this.position] & 255;
		return var2 >= 128 ? this.readUnsignedShort(236057209) - '\u8000' : this.readSignedByte(1708176767);
	}

	public static int method2018(int var0, byte var1) {
		return var0 <= 0 ? (var0 < 0 ? -1 : 0) : 1;
	}

	public void method2020(int[] var1, byte var2) {
		int var3 = 314639891 * this.position / 8;
		this.position = 0;

		for (int var7 = 0; var7 < var3; ++var7) {
			int var4 = this.readInt(-191301332);
			int var5 = this.readInt(-2021058636);
			int var6 = 0;
			int var9 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
				var6 += var9;
			}

			this.position -= -1473404712;
			this.writeInt(var4, (byte) 108);
			this.writeInt(var5, (byte) 58);
		}

	}

	public void method2021(int[] var1, int var2) {
		int var3 = 314639891 * this.position / 8;
		this.position = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var7 = this.readInt(-1381158735);
			int var6 = this.readInt(-605839293);
			int var8 = -957401312;
			int var4 = -1640531527;

			for (int var9 = 32; var9-- > 0; var7 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var8 + var1[var8 & 3]) {
				var6 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var8 >>> 11 & 3] + var8;
				var8 -= var4;
			}

			this.position -= -1473404712;
			this.writeInt(var7, (byte) 91);
			this.writeInt(var6, (byte) 51);
		}

	}

	public void method2022(int[] var1, int var2, int var3, int var4) {
		int var5 = this.position * 314639891;
		this.position = var2 * -184175589;
		int var9 = (var3 - var2) / 8;

		for (int var10 = 0; var10 < var9; ++var10) {
			int var7 = this.readInt(-374820370);
			int var6 = this.readInt(-785303899);
			int var8 = 0;
			int var12 = -1640531527;

			for (int var11 = 32; var11-- > 0; var6 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var8 + var1[var8 >>> 11 & 3]) {
				var7 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var8 + var1[var8 & 3];
				var8 += var12;
			}

			this.position -= -1473404712;
			this.writeInt(var7, (byte) 74);
			this.writeInt(var6, (byte) 14);
		}

		this.position = var5 * -184175589;
	}

	public void decipherXTEA(int[] var1, int var2, int var3, int var4) {
		int var5 = this.position * 314639891;
		this.position = -184175589 * var2;
		int var7 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var7; ++var6) {
			int var9 = this.readInt(-1260398686);
			int var8 = this.readInt(-1550090381);
			int var11 = -957401312;
			int var10 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var11 + var1[var11 & 3]) {
				var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var11 + var1[var11 >>> 11 & 3];
				var11 -= var10;
			}

			this.position -= -1473404712;
			this.writeInt(var9, (byte) 91);
			this.writeInt(var8, (byte) 32);
		}

		this.position = var5 * -184175589;
	}

	public int method2025(int var1, int var2) {
		int var3 = Class69.method987(this.payload, var1, this.position * 314639891, -2027077959);
		this.writeInt(var3, (byte) 45);
		return var3;
	}

	public void writeByteC(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (0 - var1);
	}

	public int readByteA(byte var1) {
		return this.payload[(this.position += -184175589) * 314639891 - 1] - 128 & 255;
	}

	public int readByteC(int var1) {
		return 0 - this.payload[(this.position += -184175589) * 314639891 - 1] & 255;
	}

	public int readByteS(byte var1) {
		return 128 - this.payload[(this.position += -184175589) * 314639891 - 1] & 255;
	}

	public void writeByte(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
	}

	public int readLEInt(byte var1) {
		this.position += -736702356;
		return ((this.payload[this.position * 314639891 - 2] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 1] & 255) << 24)
				+ ((this.payload[this.position * 314639891 - 3] & 255) << 8)
				+ (this.payload[314639891 * this.position - 4] & 255);
	}

	public int readSmart(int var1) {
		int var2 = this.payload[this.position * 314639891] & 255;
		return var2 < 128 ? this.readSignedByte(1708176767) - 64 : this.readUnsignedShort(1132262468) - '\uc000';
	}

	public int readLEShortA(int var1) {
		this.position += -368351178;
		return (this.payload[this.position * 314639891 - 2] - 128 & 255)
				+ ((this.payload[this.position * 314639891 - 1] & 255) << 8);
	}

	public int method2041(short var1) {
		this.position += -368351178;
		int var2 = ((this.payload[314639891 * this.position - 1] & 255) << 8)
				+ (this.payload[this.position * 314639891 - 2] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	static {
		int var3;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = var1;

			for (var3 = 0; var3 < 8; ++var3) {
				if (1 == (var2 & 1)) {
					var2 = var2 >>> 1 ^ -306674912;
				} else {
					var2 >>>= 1;
				}
			}

			crcTable[var1] = var2;
		}

		aLongArray1883 = new long[256];

		for (var3 = 0; var3 < 256; ++var3) {
			long var4 = (long) var3;

			for (int var0 = 0; var0 < 8; ++var0) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			aLongArray1883[var3] = var4;
		}

	}

	public void writeMedium1(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
	}

	public void method2046(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 24);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
	}

	public void readBytes(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.payload[(this.position += -184175589) * 314639891 - 1];
		}

	}

	public int readInt1(byte var1) {
		this.position += -736702356;
		return ((this.payload[this.position * 314639891 - 2] & 255) << 24)
				+ ((this.payload[this.position * 314639891 - 1] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 4] & 255) << 8)
				+ (this.payload[314639891 * this.position - 3] & 255);
	}

	public int readInt2(int var1) {
		this.position += -736702356;
		return (this.payload[314639891 * this.position - 2] & 255)
				+ ((this.payload[this.position * 314639891 - 3] & 255) << 24)
				+ ((this.payload[314639891 * this.position - 4] & 255) << 16)
				+ ((this.payload[this.position * 314639891 - 1] & 255) << 8);
	}

	public Packet(int var1) {
		this.payload = Class61.method904(var1, 1249537984);
		this.position = 0;
	}

	public void writeLEShort(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
	}

	public int method2069(byte var1) {
		this.position += -368351178;
		int var2 = ((this.payload[this.position * 314639891 - 2] & 255) << 8)
				+ (this.payload[314639891 * this.position - 1] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2075(int var1) {
		this.position += -368351178;
		int var2 = (this.payload[314639891 * this.position - 2] - 128 & 255)
				+ ((this.payload[314639891 * this.position - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method2077(byte var1) {
		return this.payload[314639891 * this.position] >= 0 ? this.readUnsignedShort(594228218)
				: this.readInt(-1607191462) & Integer.MAX_VALUE;
	}

	public void method2079(String var1, int var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.payload[(this.position += -184175589) * 314639891 - 1] = 0;
			this.position += Class64.method939(var1, 0, var1.length(), this.payload, this.position * 314639891,
					-1525519910) * -184175589;
			this.payload[(this.position += -184175589) * 314639891 - 1] = 0;
		}
	}

	public void writeInt2(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 24);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
	}

	public void writeLEInt(int var1, byte var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) var1;
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 16);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 24);
	}

	public void method2102(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (128 + var1);
	}

	public void method2110(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			this.payload[(this.position += -184175589) * 314639891 - 1] = var1[var5];
		}

	}

	public int method2116(byte var1) {
		byte var2 = this.payload[(this.position += -184175589) * 314639891 - 1];
		int var3;
		for (var3 = 0; var2 < 0; var2 = this.payload[(this.position += -184175589) * 314639891 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}
		return var3 | var2;
	}

	public byte readUnsignedByte(int var1) {
		return this.payload[(this.position += -184175589) * 314639891 - 1];
	}

	public byte method2127(int var1) {
		return (byte) (128 - this.payload[(this.position += -184175589) * 314639891 - 1]);
	}

	public int readLEShort(byte var1) {
		this.position += -368351178;
		return (this.payload[this.position * 314639891 - 2] & 255)
				+ ((this.payload[this.position * 314639891 - 1] & 255) << 8);
	}

	public void method2135(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (128 - var1);
	}

	public byte readByteA(int var1) {
		return (byte) (this.payload[(this.position += -184175589) * 314639891 - 1] - 128);
	}

	static final int method2150(int var0, int var1, int var2, int var3) {
		int var4 = 256 - var2;
		return (var4 * (var0 & '\uff00') + (var1 & '\uff00') * var2 & 16711680)
				+ ((var1 & 16711935) * var2 + (var0 & 16711935) * var4 & -16711936) >> 8;
	}

	public void method2152(int var1, int var2) {
		this.payload[314639891 * this.position - var1 - 1] = (byte) var1;
	}

	public boolean method2166(byte var1) {
		this.position -= -736702356;
		int var2 = Class69.method987(this.payload, 0, 314639891 * this.position, -2027077959);
		int var3 = this.readInt(-2090655866);
		return var2 == var3;
	}

	public void writeGJString2(CharSequence var1, int var2) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				++var4;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.payload[(this.position += -184175589) * 314639891 - 1] = 0;
		this.method2003(var4, 1054714246);
		this.position += Class8.method119(this.payload, this.position * 314639891, var1, 1576072317)
				* -184175589;
	}

	public int readShortA(int var1) {
		this.position += -368351178;
		return ((this.payload[this.position * 314639891 - 2] & 255) << 8)
				+ (this.payload[this.position * 314639891 - 1] - 128 & 255);
	}

	public void writeLEShortA(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 + 128);
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 >> 8);
	}

	public void method2209(int var1, int var2) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 + 128);
	}

	static void method2213(byte var0) {
		for (GameInterface var1 = (GameInterface) client.overridedInterfaces
				.getFirst(); null != var1; var1 = (GameInterface) client.overridedInterfaces.getNext()) {
			int var4 = var1.interfaceId * 226793949;
			if (Class116_Sub23_Sub2.loadInterface(var4, -1006212225)) {
				boolean var2 = true;
				RSInterface[] var5 = RSInterface.mainInterfaceArray[var4];

				int var3;
				for (var3 = 0; var3 < var5.length; ++var3) {
					if (var5[var3] != null) {
						var2 = var5[var3].newFormat;
						break;
					}
				}

				if (!var2) {
					var3 = (int) var1.hashId;
					RSInterface var6 = Class107.getInterface(var3, 314639891);
					if (var6 != null) {
						Class79.refreshInterface(var6, 303004546);
					}
				}
			}
		}

	}

	public String method2214(int var1) {
		byte var2 = this.payload[(this.position += -184175589) * 314639891 - 1];
		if (0 != var2) {
			throw new IllegalStateException("");
		} else {
			int var3 = 314639891 * this.position;

			while (this.payload[(this.position += -184175589) * 314639891 - 1] != 0) {
				;
			}

			int var4 = this.position * 314639891 - var3 - 1;
			return 0 == var4 ? "" : Tile.method1987(this.payload, var3, var4, (byte) 116);
		}
	}

}
