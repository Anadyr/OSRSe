package com.jagex;
import java.io.EOFException;

public class Class33 {

   static Class62 aClass62_449;
   boolean[] aBoolArray450;
   boolean[] aBoolArray451;
   int[] anIntArray452;
   String[] aStringArray453;
   boolean aBool454 = false;
   long aLong455;
   static int anInt456;
   static final int anInt457 = 3;
   static final int anInt458 = 28;
   static final int anInt459 = 1;
   public static final int anInt460 = 210;
   public static final int anInt461 = 222;
   static final int anInt462 = 1;


   void method600(int var1, String var2) {
      this.aStringArray453[var1] = var2;
      if(this.aBoolArray451[var1]) {
         this.aBool454 = true;
      }

   }

   void method601(int var1, int var2, int var3) {
      this.anIntArray452[var1] = var2;
      if(this.aBoolArray450[var1]) {
         this.aBool454 = true;
      }

   }

   void method602() {
      Class145 var1 = this.method625(false, (byte)1);
      boolean var20 = false;

      try {
         label186: {
            try {
               var20 = true;
               byte[] var2 = new byte[(int)var1.method1813(-980664584)];

               int var4;
               for(int var3 = 0; var3 < var2.length; var3 += var4) {
                  var4 = var1.method1811(var2, var3, var2.length - var3, -931713738);
                  if(var4 == -1) {
                     throw new EOFException();
                  }
               }

               Packet var28 = new Packet(var2);
               if(var28.payload.length - var28.position * 314639891 < 1) {
                  try {
                     var1.method1828(193698177);
                  } catch (Exception var23) {
                     ;
                  }

                  return;
               }

               int var5 = var28.readSignedByte(1708176767);
               if(var5 < 0 || var5 > 1) {
                  try {
                     var1.method1828(1134800876);
                  } catch (Exception var25) {
                     ;
                  }

                  return;
               }

               int var6 = var28.readUnsignedShort(1284282166);

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var28.readUnsignedShort(334868697);
                  var9 = var28.readInt(-1634556685);
                  if(this.aBoolArray450[var8]) {
                     this.anIntArray452[var8] = var9;
                  }
               }

               var7 = var28.readUnsignedShort(1994003508);

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var28.readUnsignedShort(-329666571);
                  String var10 = var28.readString(61376769);
                  if(this.aBoolArray451[var9]) {
                     this.aStringArray453[var9] = var10;
                  }
               }
            } catch (Exception var26) {
               try {
                  var1.method1828(-1225840970);
                  var20 = false;
               } catch (Exception var22) {
                  var20 = false;
               }
               break label186;
            }

            try {
               var1.method1828(1342896989);
               var20 = false;
            } catch (Exception var24) {
               var20 = false;
            }
         }
      } finally {
         if(var20) {
            try {
               var1.method1828(1437060932);
            } catch (Exception var21) {
               ;
            }

         }
      }

      this.aBool454 = false;
   }

   void method603(int var1, String var2) {
      this.aStringArray453[var1] = var2;
      if(this.aBoolArray451[var1]) {
         this.aBool454 = true;
      }

   }

   String method604(int var1, int var2) {
      return this.aStringArray453[var1];
   }

   public static final void resetComponentAnimation(int var0, int var1) {
      if(Class116_Sub23_Sub2.loadInterface(var0, -1006212225)) {
         RSInterface[] var3 = RSInterface.mainInterfaceArray[var0];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            RSInterface var2 = var3[var4];
            if(var2 != null) {
               var2.anInt2045 = 0;
               var2.anInt1919 = 0;
            }
         }

      }
   }

   void method606(int var1) {
      Class145 var2 = this.method625(true, (byte)1);
      boolean var15 = false;

      try {
         label183: {
            try {
               var15 = true;
               int var3 = 3;
               int var4 = 0;

               int var5;
               for(var5 = 0; var5 < this.anIntArray452.length; ++var5) {
                  if(this.aBoolArray450[var5] && this.anIntArray452[var5] != -1) {
                     var3 += 6;
                     ++var4;
                  }
               }

               var3 += 2;
               var5 = 0;

               for(int var6 = 0; var6 < this.aStringArray453.length; ++var6) {
                  if(this.aBoolArray451[var6] && null != this.aStringArray453[var6]) {
                     var3 += 2 + Class22.calculateJGString(this.aStringArray453[var6], -1144492913);
                     ++var5;
                  }
               }

               Packet var21 = new Packet(var3);
               var21.writeByte(1, 785624943);
               var21.writeShort(var4, -1692652592);

               int var7;
               for(var7 = 0; var7 < this.anIntArray452.length; ++var7) {
                  if(this.aBoolArray450[var7] && -1 != this.anIntArray452[var7]) {
                     var21.writeShort(var7, -2140070292);
                     var21.writeInt(this.anIntArray452[var7], (byte)53);
                  }
               }

               var21.writeShort(var5, -1983642679);
               var7 = 0;

               while(true) {
                  if(var7 >= this.aStringArray453.length) {
                     var2.method1832(var21.payload, 0, 314639891 * var21.position, 235505689);
                     break;
                  }

                  if(this.aBoolArray451[var7] && this.aStringArray453[var7] != null) {
                     var21.writeShort(var7, -1964796706);
                     var21.writeJGString(this.aStringArray453[var7], 45554473);
                  }

                  ++var7;
               }
            } catch (Exception var19) {
               try {
                  var2.method1828(-295747323);
                  var15 = false;
               } catch (Exception var17) {
                  var15 = false;
               }
               break label183;
            }

            try {
               var2.method1828(-915992214);
               var15 = false;
            } catch (Exception var18) {
               var15 = false;
            }
         }
      } finally {
         if(var15) {
            try {
               var2.method1828(-1105944713);
            } catch (Exception var16) {
               ;
            }

         }
      }

      this.aBool454 = false;
      this.aLong455 = Class116_Sub5.generateHash(-1466167827) * -4897623063149766703L;
   }

   void method607(int var1, int var2) {
      this.anIntArray452[var1] = var2;
      if(this.aBoolArray450[var1]) {
         this.aBool454 = true;
      }

   }

   void method608(byte var1) {
      Class145 var2 = this.method625(false, (byte)1);
      boolean var21 = false;

      try {
         label186: {
            try {
               var21 = true;
               byte[] var3 = new byte[(int)var2.method1813(-980664584)];

               int var5;
               for(int var4 = 0; var4 < var3.length; var4 += var5) {
                  var5 = var2.method1811(var3, var4, var3.length - var4, 1980430204);
                  if(var5 == -1) {
                     throw new EOFException();
                  }
               }

               Packet var29 = new Packet(var3);
               if(var29.payload.length - var29.position * 314639891 < 1) {
                  try {
                     var2.method1828(-1085687152);
                  } catch (Exception var24) {
                     ;
                  }

                  return;
               }

               int var6 = var29.readSignedByte(1708176767);
               if(var6 < 0 || var6 > 1) {
                  try {
                     var2.method1828(1643787426);
                  } catch (Exception var26) {
                     ;
                  }

                  return;
               }

               int var7 = var29.readUnsignedShort(259173383);

               int var8;
               int var9;
               int var10;
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var29.readUnsignedShort(1535249708);
                  var10 = var29.readInt(-603405032);
                  if(this.aBoolArray450[var9]) {
                     this.anIntArray452[var9] = var10;
                  }
               }

               var8 = var29.readUnsignedShort(1189476030);

               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var29.readUnsignedShort(1383807353);
                  String var11 = var29.readString(61376769);
                  if(this.aBoolArray451[var10]) {
                     this.aStringArray453[var10] = var11;
                  }
               }
            } catch (Exception var27) {
               try {
                  var2.method1828(-234715711);
                  var21 = false;
               } catch (Exception var23) {
                  var21 = false;
               }
               break label186;
            }

            try {
               var2.method1828(68259871);
               var21 = false;
            } catch (Exception var25) {
               var21 = false;
            }
         }
      } finally {
         if(var21) {
            try {
               var2.method1828(456019884);
            } catch (Exception var22) {
               ;
            }

         }
      }

      this.aBool454 = false;
   }

   void method609(int var1) {
      if(this.aBool454 && this.aLong455 * -2233906655684255439L < Class116_Sub5.generateHash(-989747377) - 60000L) {
         this.method606(635250554);
      }

   }

   boolean method610(int var1) {
      return this.aBool454;
   }

   void method611(int var1, int var2) {
      this.anIntArray452[var1] = var2;
      if(this.aBoolArray450[var1]) {
         this.aBool454 = true;
      }

   }

   void method612(int var1) {
      int var2;
      for(var2 = 0; var2 < this.anIntArray452.length; ++var2) {
         if(!this.aBoolArray450[var2]) {
            this.anIntArray452[var2] = -1;
         }
      }

      for(var2 = 0; var2 < this.aStringArray453.length; ++var2) {
         if(!this.aBoolArray451[var2]) {
            this.aStringArray453[var2] = null;
         }
      }

   }

   int method613(int var1) {
      return this.anIntArray452[var1];
   }

   int method614(int var1) {
      return this.anIntArray452[var1];
   }

   String method615(int var1) {
      return this.aStringArray453[var1];
   }

   void method616(int var1, String var2) {
      this.aStringArray453[var1] = var2;
      if(this.aBoolArray451[var1]) {
         this.aBool454 = true;
      }

   }

   int method617(int var1) {
      return this.anIntArray452[var1];
   }

   void method618() {
      if(this.aBool454 && this.aLong455 * -2233906655684255439L < Class116_Sub5.generateHash(-1903266206) - 60000L) {
         this.method606(-1276450453);
      }

   }

   String method619(int var1) {
      return this.aStringArray453[var1];
   }

   void method620() {
      if(this.aBool454 && this.aLong455 * -2233906655684255439L < Class116_Sub5.generateHash(-85019628) - 60000L) {
         this.method606(-123233376);
      }

   }

   void method621() {
      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         if(!this.aBoolArray450[var1]) {
            this.anIntArray452[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         if(!this.aBoolArray451[var1]) {
            this.aStringArray453[var1] = null;
         }
      }

   }

   void method622() {
      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         if(!this.aBoolArray450[var1]) {
            this.anIntArray452[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         if(!this.aBoolArray451[var1]) {
            this.aStringArray453[var1] = null;
         }
      }

   }

   void method623() {
      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         if(!this.aBoolArray450[var1]) {
            this.anIntArray452[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         if(!this.aBoolArray451[var1]) {
            this.aStringArray453[var1] = null;
         }
      }

   }

   void method624() {
      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         if(!this.aBoolArray450[var1]) {
            this.anIntArray452[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         if(!this.aBoolArray451[var1]) {
            this.aStringArray453[var1] = null;
         }
      }

   }

   Class145 method625(boolean var1, byte var2) {
      return Class40.method686("2", client.aClass88_3039.aString1028, var1, -470578497);
   }

   Class145 method626(boolean var1) {
      return Class40.method686("2", client.aClass88_3039.aString1028, var1, 838786894);
   }

   void method627() {
      Class145 var1 = this.method625(true, (byte)1);
      boolean var14 = false;

      try {
         label183: {
            try {
               var14 = true;
               int var2 = 3;
               int var3 = 0;

               int var4;
               for(var4 = 0; var4 < this.anIntArray452.length; ++var4) {
                  if(this.aBoolArray450[var4] && this.anIntArray452[var4] != -1) {
                     var2 += 6;
                     ++var3;
                  }
               }

               var2 += 2;
               var4 = 0;

               for(int var5 = 0; var5 < this.aStringArray453.length; ++var5) {
                  if(this.aBoolArray451[var5] && null != this.aStringArray453[var5]) {
                     var2 += 2 + Class22.calculateJGString(this.aStringArray453[var5], -1706391853);
                     ++var4;
                  }
               }

               Packet var20 = new Packet(var2);
               var20.writeByte(1, -129143148);
               var20.writeShort(var3, -1819058414);

               int var6;
               for(var6 = 0; var6 < this.anIntArray452.length; ++var6) {
                  if(this.aBoolArray450[var6] && -1 != this.anIntArray452[var6]) {
                     var20.writeShort(var6, -1823217172);
                     var20.writeInt(this.anIntArray452[var6], (byte)99);
                  }
               }

               var20.writeShort(var4, -2053794791);
               var6 = 0;

               while(true) {
                  if(var6 >= this.aStringArray453.length) {
                     var1.method1832(var20.payload, 0, 314639891 * var20.position, 957753475);
                     break;
                  }

                  if(this.aBoolArray451[var6] && this.aStringArray453[var6] != null) {
                     var20.writeShort(var6, -1879223062);
                     var20.writeJGString(this.aStringArray453[var6], 567980453);
                  }

                  ++var6;
               }
            } catch (Exception var18) {
               try {
                  var1.method1828(-502351531);
                  var14 = false;
               } catch (Exception var16) {
                  var14 = false;
               }
               break label183;
            }

            try {
               var1.method1828(-998007330);
               var14 = false;
            } catch (Exception var17) {
               var14 = false;
            }
         }
      } finally {
         if(var14) {
            try {
               var1.method1828(-109241318);
            } catch (Exception var15) {
               ;
            }

         }
      }

      this.aBool454 = false;
      this.aLong455 = Class116_Sub5.generateHash(1955171302) * -4897623063149766703L;
   }

   void method628() {
      Class145 var1 = this.method625(true, (byte)1);
      boolean var14 = false;

      try {
         label183: {
            try {
               var14 = true;
               int var2 = 3;
               int var3 = 0;

               int var4;
               for(var4 = 0; var4 < this.anIntArray452.length; ++var4) {
                  if(this.aBoolArray450[var4] && this.anIntArray452[var4] != -1) {
                     var2 += 6;
                     ++var3;
                  }
               }

               var2 += 2;
               var4 = 0;

               for(int var5 = 0; var5 < this.aStringArray453.length; ++var5) {
                  if(this.aBoolArray451[var5] && null != this.aStringArray453[var5]) {
                     var2 += 2 + Class22.calculateJGString(this.aStringArray453[var5], -876004900);
                     ++var4;
                  }
               }

               Packet var20 = new Packet(var2);
               var20.writeByte(1, 266376715);
               var20.writeShort(var3, -1822759654);

               int var6;
               for(var6 = 0; var6 < this.anIntArray452.length; ++var6) {
                  if(this.aBoolArray450[var6] && -1 != this.anIntArray452[var6]) {
                     var20.writeShort(var6, -1601730405);
                     var20.writeInt(this.anIntArray452[var6], (byte)71);
                  }
               }

               var20.writeShort(var4, -2070842976);
               var6 = 0;

               while(true) {
                  if(var6 >= this.aStringArray453.length) {
                     var1.method1832(var20.payload, 0, 314639891 * var20.position, 1615363066);
                     break;
                  }

                  if(this.aBoolArray451[var6] && this.aStringArray453[var6] != null) {
                     var20.writeShort(var6, -1637439001);
                     var20.writeJGString(this.aStringArray453[var6], 305305223);
                  }

                  ++var6;
               }
            } catch (Exception var18) {
               try {
                  var1.method1828(-120791065);
                  var14 = false;
               } catch (Exception var16) {
                  var14 = false;
               }
               break label183;
            }

            try {
               var1.method1828(-560546167);
               var14 = false;
            } catch (Exception var17) {
               var14 = false;
            }
         }
      } finally {
         if(var14) {
            try {
               var1.method1828(451570275);
            } catch (Exception var15) {
               ;
            }

         }
      }

      this.aBool454 = false;
      this.aLong455 = Class116_Sub5.generateHash(-475100442) * -4897623063149766703L;
   }

   void method629() {
      Class145 var1 = this.method625(false, (byte)1);
      boolean var20 = false;

      try {
         label186: {
            try {
               var20 = true;
               byte[] var2 = new byte[(int)var1.method1813(-980664584)];

               int var4;
               for(int var3 = 0; var3 < var2.length; var3 += var4) {
                  var4 = var1.method1811(var2, var3, var2.length - var3, -1589211599);
                  if(var4 == -1) {
                     throw new EOFException();
                  }
               }

               Packet var28 = new Packet(var2);
               if(var28.payload.length - var28.position * 314639891 < 1) {
                  try {
                     var1.method1828(1793893390);
                  } catch (Exception var23) {
                     ;
                  }

                  return;
               }

               int var5 = var28.readSignedByte(1708176767);
               if(var5 < 0 || var5 > 1) {
                  try {
                     var1.method1828(-1262104110);
                  } catch (Exception var25) {
                     ;
                  }

                  return;
               }

               int var6 = var28.readUnsignedShort(905409244);

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var28.readUnsignedShort(382483270);
                  var9 = var28.readInt(-770912534);
                  if(this.aBoolArray450[var8]) {
                     this.anIntArray452[var8] = var9;
                  }
               }

               var7 = var28.readUnsignedShort(1402405777);

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var28.readUnsignedShort(1454846484);
                  String var10 = var28.readString(61376769);
                  if(this.aBoolArray451[var9]) {
                     this.aStringArray453[var9] = var10;
                  }
               }
            } catch (Exception var26) {
               try {
                  var1.method1828(855667415);
                  var20 = false;
               } catch (Exception var22) {
                  var20 = false;
               }
               break label186;
            }

            try {
               var1.method1828(820989658);
               var20 = false;
            } catch (Exception var24) {
               var20 = false;
            }
         }
      } finally {
         if(var20) {
            try {
               var1.method1828(-1365444097);
            } catch (Exception var21) {
               ;
            }

         }
      }

      this.aBool454 = false;
   }

   void method630() {
      Class145 var1 = this.method625(false, (byte)1);
      boolean var20 = false;

      try {
         label186: {
            try {
               var20 = true;
               byte[] var2 = new byte[(int)var1.method1813(-980664584)];

               int var4;
               for(int var3 = 0; var3 < var2.length; var3 += var4) {
                  var4 = var1.method1811(var2, var3, var2.length - var3, 297313572);
                  if(var4 == -1) {
                     throw new EOFException();
                  }
               }

               Packet var28 = new Packet(var2);
               if(var28.payload.length - var28.position * 314639891 < 1) {
                  try {
                     var1.method1828(-723736808);
                  } catch (Exception var23) {
                     ;
                  }

                  return;
               }

               int var5 = var28.readSignedByte(1708176767);
               if(var5 < 0 || var5 > 1) {
                  try {
                     var1.method1828(1509488048);
                  } catch (Exception var25) {
                     ;
                  }

                  return;
               }

               int var6 = var28.readUnsignedShort(114109441);

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var28.readUnsignedShort(-331045130);
                  var9 = var28.readInt(-2092973103);
                  if(this.aBoolArray450[var8]) {
                     this.anIntArray452[var8] = var9;
                  }
               }

               var7 = var28.readUnsignedShort(-389037227);

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var28.readUnsignedShort(783640965);
                  String var10 = var28.readString(61376769);
                  if(this.aBoolArray451[var9]) {
                     this.aStringArray453[var9] = var10;
                  }
               }
            } catch (Exception var26) {
               try {
                  var1.method1828(1450004380);
                  var20 = false;
               } catch (Exception var22) {
                  var20 = false;
               }
               break label186;
            }

            try {
               var1.method1828(363465588);
               var20 = false;
            } catch (Exception var24) {
               var20 = false;
            }
         }
      } finally {
         if(var20) {
            try {
               var1.method1828(-2041839310);
            } catch (Exception var21) {
               ;
            }

         }
      }

      this.aBool454 = false;
   }

   boolean method631() {
      return this.aBool454;
   }

   Class33() {
      this.anIntArray452 = new int[client.aCacheIndex_3054.method1361(19, -824500445)];
      this.aStringArray453 = new String[client.aCacheIndex_3054.method1361(15, -824500445)];
      this.aBoolArray450 = new boolean[this.anIntArray452.length];

      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         Class116_Sub23_Sub13 var2 = BasicTimer.method2216(var1, 476397876);
         this.aBoolArray450[var1] = var2.aBool2421;
      }

      this.aBoolArray451 = new boolean[this.aStringArray453.length];

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         Class116_Sub23_Sub7 var3 = PlayerAlias.method1936(var1, (byte) -6);
         this.aBoolArray451[var1] = var3.aBool2294;
      }

      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         this.anIntArray452[var1] = -1;
      }

      this.method608((byte)23);
   }

   void method632() {
      if(this.aBool454 && this.aLong455 * -2233906655684255439L < Class116_Sub5.generateHash(-1468140973) - 60000L) {
         this.method606(-1172141498);
      }

   }

   void method633() {
      int var1;
      for(var1 = 0; var1 < this.anIntArray452.length; ++var1) {
         if(!this.aBoolArray450[var1]) {
            this.anIntArray452[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.aStringArray453.length; ++var1) {
         if(!this.aBoolArray451[var1]) {
            this.aStringArray453[var1] = null;
         }
      }

   }

   int method634(int var1, byte var2) {
      return this.anIntArray452[var1];
   }

   boolean method635() {
      return this.aBool454;
   }

   void method636(int var1, String var2, byte var3) {
      this.aStringArray453[var1] = var2;
      if(this.aBoolArray451[var1]) {
         this.aBool454 = true;
      }

   }

   static final void method637(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var2 + var0; ++var6) {
            if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               Class47.aByteArrayArrayArray627[0][var6][var5] = 127;
               if(var6 == var0 && var6 > 0) {
                  Class47.anIntArrayArrayArray635[0][var6][var5] = Class47.anIntArrayArrayArray635[0][var6 - 1][var5];
               }

               if(var6 == var0 + var2 && var6 < 103) {
                  Class47.anIntArrayArrayArray635[0][var6][var5] = Class47.anIntArrayArrayArray635[0][var6 + 1][var5];
               }

               if(var1 == var5 && var5 > 0) {
                  Class47.anIntArrayArrayArray635[0][var6][var5] = Class47.anIntArrayArrayArray635[0][var6][var5 - 1];
               }

               if(var5 == var1 + var3 && var5 < 103) {
                  Class47.anIntArrayArrayArray635[0][var6][var5] = Class47.anIntArrayArrayArray635[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static void method638(RSInterface var0, int var1, int var2, boolean var3, int var4) {
      int var5 = 1645211541 * var0.wdth;
      int var7 = var0.heght * 1227800423;
      if(0 == -1693000097 * var0.anInt1932) {
         var0.wdth = var0.width * -1435301567;
      } else if(-1693000097 * var0.anInt1932 == 1) {
         var0.wdth = (var1 - var0.width * 124195285) * 786424765;
      } else if(-1693000097 * var0.anInt1932 == 2) {
         var0.wdth = 786424765 * (124195285 * var0.width * var1 >> 14);
      }

      if(var0.anInt1933 * 1039689039 == 0) {
         var0.heght = var0.height * -773929259;
      } else if(var0.anInt1933 * 1039689039 == 1) {
         var0.heght = (var2 - 507570867 * var0.height) * -1446581161;
      } else if(1039689039 * var0.anInt1933 == 2) {
         var0.heght = -1446581161 * (var2 * 507570867 * var0.height >> 14);
      }

      if(var0.anInt1932 * -1693000097 == 4) {
         var0.wdth = 786424765 * (-1440091941 * var0.anInt2041 * 1227800423 * var0.heght / (var0.anInt1976 * 1321191429));
      }

      if(var0.anInt1933 * 1039689039 == 4) {
         var0.heght = var0.wdth * 1645211541 * var0.anInt1976 * 1321191429 / (-1440091941 * var0.anInt2041) * -1446581161;
      }

      if(client.aBool2957 && 0 == var0.type * -1305917269) {
         if(var0.heght * 1227800423 < 5 && 1645211541 * var0.wdth < 5) {
            var0.heght = 1357028787;
            var0.wdth = -362843471;
         } else {
            if(var0.heght * 1227800423 <= 0) {
               var0.heght = 1357028787;
            }

            if(var0.wdth * 1645211541 <= 0) {
               var0.wdth = -362843471;
            }
         }
      }

      if(1337 == -179718399 * var0.clientCode) {
         client.aClass116_Sub15_3210 = var0;
      }

      if(var3 && var0.anObjectArray2032 != null && (var5 != 1645211541 * var0.wdth || 1227800423 * var0.heght != var7)) {
         Class116_Sub6 var6 = new Class116_Sub6();
         var6.aClass116_Sub15_1736 = var0;
         var6.anObjectArray1737 = var0.anObjectArray2032;
         client.aClass117_3132.addLast(var6);
      }

   }

   static final void method639(int var0) {
      for(Class116_Sub23_Sub16_Sub5 var1 = (Class116_Sub23_Sub16_Sub5)client.aClass117_3028.getFirst(); var1 != null; var1 = (Class116_Sub23_Sub16_Sub5)client.aClass117_3028.getNext()) {
         if(var1.anInt2733 * -2138425693 == -747958745 * GameInterface.anInt1819 && -1040073859 * client.anInt2943 <= var1.anInt2739 * -2082473613) {
            if(client.anInt2943 * -1040073859 >= 826970615 * var1.anInt2738) {
               if(846206463 * var1.anInt2742 > 0) {
                  Mob var2 = client.aMobArray2972[846206463 * var1.anInt2742 - 1];
                  if(var2 != null && var2.anInt2609 * 1272643751 >= 0 && 1272643751 * var2.anInt2609 < 13312 && -1801433343 * var2.anInt2579 >= 0 && -1801433343 * var2.anInt2579 < 13312) {
                     var1.method3343(var2.anInt2609 * 1272643751, var2.anInt2579 * -1801433343, MobDefinition.method2552(var2.anInt2609 * 1272643751, var2.anInt2579 * -1801433343, -2138425693 * var1.anInt2733, (short) 1376) - var1.anInt2737 * -1190049527, -1040073859 * client.anInt2943, -1464743663);
                  }
               }

               if(var1.anInt2742 * 846206463 < 0) {
                  int var3 = -(var1.anInt2742 * 846206463) - 1;
                  Player var4;
                  if(var3 == client.playerIndex * 1467227105) {
                     var4 = Class79.ourPlayer;
                  } else {
                     var4 = client.globalPlayers[var3];
                  }

                  if(null != var4 && 1272643751 * var4.anInt2609 >= 0 && 1272643751 * var4.anInt2609 < 13312 && var4.anInt2579 * -1801433343 >= 0 && var4.anInt2579 * -1801433343 < 13312) {
                     var1.method3343(1272643751 * var4.anInt2609, var4.anInt2579 * -1801433343, MobDefinition.method2552(1272643751 * var4.anInt2609, -1801433343 * var4.anInt2579, -2138425693 * var1.anInt2733, (short) 32012) - -1190049527 * var1.anInt2737, client.anInt2943 * -1040073859, -235326882);
                  }
               }

               var1.method3344(-1163930299 * client.anInt3012, -848428919);
               GameInterface.region.method356(-747958745 * GameInterface.anInt1819, (int)var1.aDouble2744, (int)var1.aDouble2745, (int)var1.aDouble2732, 60, var1, var1.anInt2746 * 1329670755, -1, false);
            }
         } else {
            var1.unlink();
         }
      }

   }
}
