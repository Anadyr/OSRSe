package com.jagex;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class32 {

   int anInt436;
   byte[] aByteArray437;
   DataInputStream aDataInputStream438;
   byte[] aByteArray439 = new byte[4];
   static int anInt440;
   long aLong441;
   int anInt442;
   static Class89 aClass89_443;
   int anInt444;
   SignlinkNode aClass72_445;
   static CacheIndex aCacheIndex_446;
   public static final int anInt447 = 111;
   public static final int anInt448 = 80;


   byte[] method592() throws IOException {
      if(Class116_Sub5.generateHash(1176341176) > this.aLong441 * 5610376891018015397L) {
         throw new IOException();
      } else {
         if(0 == this.anInt444 * -369390683) {
            if(this.aClass72_445.anInt866 == 2) {
               throw new IOException();
            }

            if(this.aClass72_445.anInt866 == 1) {
               this.aDataInputStream438 = (DataInputStream)this.aClass72_445.anObject869;
               this.anInt444 = -427006931;
            }
         }

         int var1;
         if(1 == this.anInt444 * -1936810081) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt436 * 802462811 + var1 > 4) {
                  var1 = 4 - this.anInt436 * 727025511;
               }

               this.anInt436 += this.aDataInputStream438.read(this.aByteArray439, this.anInt436 * 802462811, var1) * -201703850;
               if(4 == this.anInt436 * -1776200656) {
                  int var2 = (new Packet(this.aByteArray439)).readInt(-1660308817);
                  this.aByteArray437 = new byte[var2];
                  this.anInt444 = -854013862;
               }
            }
         }

         if(this.anInt444 * -369390683 == 2) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt442 * 585050654 + var1 > this.aByteArray437.length) {
                  var1 = this.aByteArray437.length - -1175625780 * this.anInt442;
               }

               this.anInt442 += this.aDataInputStream438.read(this.aByteArray437, 589721777 * this.anInt442, var1) * -703473583;
               if(this.anInt442 * 589721777 == this.aByteArray437.length) {
                  return this.aByteArray437;
               }
            }
         }

         return null;
      }
   }

   byte[] getURLToData(byte var1) throws IOException {
      if(Class116_Sub5.generateHash(-651155454) > this.aLong441 * 5610376891018015397L) {
         throw new IOException();
      } else {
         if(0 == this.anInt444 * -369390683) {
            if(this.aClass72_445.anInt866 == 2) {
               throw new IOException();
            }

            if(this.aClass72_445.anInt866 == 1) {
               this.aDataInputStream438 = (DataInputStream)this.aClass72_445.anObject869;
               this.anInt444 = -427006931;
            }
         }

         int var2;
         if(1 == this.anInt444 * -369390683) {
            var2 = this.aDataInputStream438.available();
            if(var2 > 0) {
               if(this.anInt436 * 802462811 + var2 > 4) {
                  var2 = 4 - this.anInt436 * 802462811;
               }

               this.anInt436 += this.aDataInputStream438.read(this.aByteArray439, this.anInt436 * 802462811, var2) * -261671981;
               if(4 == this.anInt436 * 802462811) {
                  int var3 = (new Packet(this.aByteArray439)).readInt(-1545072513);
                  this.aByteArray437 = new byte[var3];
                  this.anInt444 = -854013862;
               }
            }
         }

         if(this.anInt444 * -369390683 == 2) {
            var2 = this.aDataInputStream438.available();
            if(var2 > 0) {
               if(this.anInt442 * 589721777 + var2 > this.aByteArray437.length) {
                  var2 = this.aByteArray437.length - 589721777 * this.anInt442;
               }

               this.anInt442 += this.aDataInputStream438.read(this.aByteArray437, 589721777 * this.anInt442, var2) * -703473583;
               if(this.anInt442 * 589721777 == this.aByteArray437.length) {
                  return this.aByteArray437;
               }
            }
         }

         return null;
      }
   }

   static String method594(RSInterface var0, byte var1) {
      return SignLink.method1075(Class35.method645(var0, (byte) 0), -438925309) == 0?null:(var0.selectedActionName != null && var0.selectedActionName.trim().length() != 0?var0.selectedActionName :null);
   }

   byte[] method595() throws IOException {
      if(Class116_Sub5.generateHash(-1164807841) > this.aLong441 * 5610376891018015397L) {
         throw new IOException();
      } else {
         if(0 == this.anInt444 * -369390683) {
            if(this.aClass72_445.anInt866 == 2) {
               throw new IOException();
            }

            if(this.aClass72_445.anInt866 == 1) {
               this.aDataInputStream438 = (DataInputStream)this.aClass72_445.anObject869;
               this.anInt444 = -427006931;
            }
         }

         int var2;
         if(1 == this.anInt444 * 2049188527) {
            var2 = this.aDataInputStream438.available();
            if(var2 > 0) {
               if(this.anInt436 * -2085424347 + var2 > 4) {
                  var2 = 4 - this.anInt436 * 802462811;
               }

               this.anInt436 += this.aDataInputStream438.read(this.aByteArray439, this.anInt436 * 802462811, var2) * -261671981;
               if(4 == this.anInt436 * 802462811) {
                  int var1 = (new Packet(this.aByteArray439)).readInt(-239358606);
                  this.aByteArray437 = new byte[var1];
                  this.anInt444 = 1831135649;
               }
            }
         }

         if(this.anInt444 * -369390683 == 2) {
            var2 = this.aDataInputStream438.available();
            if(var2 > 0) {
               if(this.anInt442 * 2090692161 + var2 > this.aByteArray437.length) {
                  var2 = this.aByteArray437.length - 589721777 * this.anInt442;
               }

               this.anInt442 += this.aDataInputStream438.read(this.aByteArray437, -149342294 * this.anInt442, var2) * -703473583;
               if(this.anInt442 * -1062436091 == this.aByteArray437.length) {
                  return this.aByteArray437;
               }
            }
         }

         return null;
      }
   }

   byte[] method596() throws IOException {
      if(Class116_Sub5.generateHash(-1942992069) > this.aLong441 * 5610376891018015397L) {
         throw new IOException();
      } else {
         if(0 == this.anInt444 * -369390683) {
            if(this.aClass72_445.anInt866 == 2) {
               throw new IOException();
            }

            if(this.aClass72_445.anInt866 == 1) {
               this.aDataInputStream438 = (DataInputStream)this.aClass72_445.anObject869;
               this.anInt444 = -427006931;
            }
         }

         int var1;
         if(1 == this.anInt444 * -369390683) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt436 * 293678275 + var1 > 4) {
                  var1 = 4 - this.anInt436 * 802462811;
               }

               this.anInt436 += this.aDataInputStream438.read(this.aByteArray439, this.anInt436 * 802462811, var1) * 1769759440;
               if(4 == this.anInt436 * 802462811) {
                  int var2 = (new Packet(this.aByteArray439)).readInt(-386401352);
                  this.aByteArray437 = new byte[var2];
                  this.anInt444 = -1189271941;
               }
            }
         }

         if(this.anInt444 * -369390683 == 2) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt442 * 589721777 + var1 > this.aByteArray437.length) {
                  var1 = this.aByteArray437.length - 589721777 * this.anInt442;
               }

               this.anInt442 += this.aDataInputStream438.read(this.aByteArray437, 589721777 * this.anInt442, var1) * -703473583;
               if(this.anInt442 * 589721777 == this.aByteArray437.length) {
                  return this.aByteArray437;
               }
            }
         }

         return null;
      }
   }

   static final void decodePlayerUpdate(PacketBuilder buffer, int var1, byte var2) {
      int var3 = 314639891 * buffer.position;
      Class7.anInt118 = 0;
      World.updateGPI(buffer, -1347519291);
        //Masks Block
      for(int i = 0; i < 716284941 * Class7.anInt118; ++i) {
         int index = Class7.anIntArray119[i];
         Player p = client.globalPlayers[index];
         int maskBlockLength = buffer.readSignedByte(1708176767);
         //byte overflow checks bitmask setting to tell if the mask update for this player is bigger than a byte
         // higher revisions do this for shorts too, and up it an extra byte ( i label that ask SHORT_OVERFLOW)
         boolean byteOverflow = (maskBlockLength & 16) != 0;
         if(byteOverflow) {
            maskBlockLength += buffer.readSignedByte(1708176767) << 8;
         }

         Timer.doPlayerMasks(buffer, index, p, maskBlockLength, -1592246232);
      }

      if(var1 != buffer.position * 314639891 - var3) {
         throw new RuntimeException(314639891 * buffer.position - var3 + " " + var1);
      }
   }

   byte[] method598() throws IOException {
      if(Class116_Sub5.generateHash(-1991820622) > this.aLong441 * 5610376891018015397L) {
         throw new IOException();
      } else {
         if(0 == this.anInt444 * -369390683) {
            if(this.aClass72_445.anInt866 == 2) {
               throw new IOException();
            }

            if(this.aClass72_445.anInt866 == 1) {
               this.aDataInputStream438 = (DataInputStream)this.aClass72_445.anObject869;
               this.anInt444 = -427006931;
            }
         }

         int var1;
         if(1 == this.anInt444 * -369390683) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt436 * 802462811 + var1 > 4) {
                  var1 = 4 - this.anInt436 * 802462811;
               }

               this.anInt436 += this.aDataInputStream438.read(this.aByteArray439, this.anInt436 * 802462811, var1) * -261671981;
               if(4 == this.anInt436 * 802462811) {
                  int var2 = (new Packet(this.aByteArray439)).readInt(-772619471);
                  this.aByteArray437 = new byte[var2];
                  this.anInt444 = -854013862;
               }
            }
         }

         if(this.anInt444 * -369390683 == 2) {
            var1 = this.aDataInputStream438.available();
            if(var1 > 0) {
               if(this.anInt442 * 589721777 + var1 > this.aByteArray437.length) {
                  var1 = this.aByteArray437.length - 589721777 * this.anInt442;
               }

               this.anInt442 += this.aDataInputStream438.read(this.aByteArray437, 589721777 * this.anInt442, var1) * -703473583;
               if(this.anInt442 * 589721777 == this.aByteArray437.length) {
                  return this.aByteArray437;
               }
            }
         }

         return null;
      }
   }

   Class32(SignLink var1, URL url) {
      this.aClass72_445 = var1.createDataStream(url, (byte) 76);
      this.anInt444 = 0;
      this.aLong441 = (Class116_Sub5.generateHash(334299940) + 30000L) * -4402853478160784083L;
   }

   public static void method599(RSIndex var0, byte var1) {
      Flo.aRSIndex_2298 = var0;
   }
}
