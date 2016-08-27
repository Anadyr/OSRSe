package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class PacketBuilder extends Packet {

   ISAAC isaac;
   int bitPointer;
   static String USER_HOME;
   static int[] anIntArray2505 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

   public void applyIsaac(int[] key) {
      this.isaac = new ISAAC(key);
   }

   public void startPacket(int var1, byte var2) {
      this.payload[(this.position += -184175589) * 314639891 - 1] = (byte)(var1 + this.isaac.getNextValue());
   }

   public int getBitPosition(int var1, byte var2) {
      return 8 * var1 - this.bitPointer * 1539886523;
   }

   public void resetBitPos(byte var1) {
      this.bitPointer = 928758856 * this.position;
   }

   public int method2955(byte var1) {
      return this.payload[(this.position += -184175589) * 314639891 - 1] - this.isaac.getNextValue() & 255;
   }

   public void startBitAccess(byte var1) {
      this.position = (7 + this.bitPointer * 1539886523) / 8 * -184175589;
   }

   public int readBits(int bitAmt, byte var2) {
      int var3 = 1539886523 * this.bitPointer >> 3;
      int var5 = 8 - (this.bitPointer * 1539886523 & 7);
      int var4 = 0;

      for(this.bitPointer += 495906675 * bitAmt; bitAmt > var5; var5 = 8) {
         var4 += (this.payload[var3++] & anIntArray2505[var5]) << bitAmt - var5;
         bitAmt -= var5;
      }

      if(var5 == bitAmt) {
         var4 += this.payload[var3] & anIntArray2505[var5];
      } else {
         var4 += this.payload[var3] >> var5 - bitAmt & anIntArray2505[bitAmt];
      }

      return var4;
   }

   public PacketBuilder(int var1) {
      super(var1);
   }

   public static void addressReflection(PacketBuilder var0, int var1) {
      ReflectionNode var2 = (ReflectionNode) client.aClass119_1617.method1591();
      if(var2 != null) {
         int var3 = var0.position * 314639891;
         var0.writeInt(var2.anInt2154 * 2103128295, (byte)95);

         for(int var4 = 0; var4 < var2.anInt2147 * -707810723; ++var4) {
            if(var2.anIntArray2149[var4] != 0) {
               var0.writeByte(var2.anIntArray2149[var4], -844789398);
            } else {
               try {
                  int var5 = var2.anIntArray2148[var4];
                  Field var6;
                  int var7;
                  if(var5 == 0) {
                     var6 = var2.aFieldArray2150[var4];
                     var7 = var6.getInt((Object)null);
                     var0.writeByte(0, -1927315059);
                     var0.writeInt(var7, (byte)104);
                  } else if(var5 == 1) {
                     var6 = var2.aFieldArray2150[var4];
                     var6.setInt((Object)null, var2.anIntArray2151[var4]);
                     var0.writeByte(0, -903227475);
                  } else if(2 == var5) {
                     var6 = var2.aFieldArray2150[var4];
                     var7 = var6.getModifiers();
                     var0.writeByte(0, -667413090);
                     var0.writeInt(var7, (byte)122);
                  }

                  Method var23;
                  if(3 == var5) {
                     var23 = var2.aMethodArray2152[var4];
                     byte[][] var24 = var2.aByteArrayArrayArray2153[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if(null == var25) {
                        var0.writeByte(0, -1810863287);
                     } else if(var25 instanceof Number) {
                        var0.writeByte(1, -1499776101);
                        var0.method1994(((Number)var25).longValue());
                     } else if(var25 instanceof String) {
                        var0.writeByte(2, 393198005);
                        var0.writeJGString((String) var25, 1142489285);
                     } else {
                        var0.writeByte(4, -1622757271);
                     }
                  } else if(4 == var5) {
                     var23 = var2.aMethodArray2152[var4];
                     var7 = var23.getModifiers();
                     var0.writeByte(0, -968831902);
                     var0.writeInt(var7, (byte)42);
                  }
               } catch (ClassNotFoundException var11) {
                  var0.writeByte(-10, -1935636573);
               } catch (InvalidClassException var12) {
                  var0.writeByte(-11, -88891598);
               } catch (StreamCorruptedException var13) {
                  var0.writeByte(-12, 427769701);
               } catch (OptionalDataException var14) {
                  var0.writeByte(-13, 358747636);
               } catch (IllegalAccessException var15) {
                  var0.writeByte(-14, -2108375393);
               } catch (IllegalArgumentException var16) {
                  var0.writeByte(-15, 409304509);
               } catch (InvocationTargetException var17) {
                  var0.writeByte(-16, -1737219259);
               } catch (SecurityException var18) {
                  var0.writeByte(-17, -955236952);
               } catch (IOException var19) {
                  var0.writeByte(-18, -1338449991);
               } catch (NullPointerException var20) {
                  var0.writeByte(-19, 541337596);
               } catch (Exception var21) {
                  var0.writeByte(-20, 750388576);
               } catch (Throwable var22) {
                  var0.writeByte(-21, -106202952);
               }
            }
         }

         var0.method2025(var3, -554702642);
         var2.unlink();
      }
   }
}
