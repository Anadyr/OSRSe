package com.jagex;

public class ObjectDefinition extends NodeContainer {

   public int sizeX = 1223037583;
   static Class99 aClass99_2189;
   static Class99 aClass99_2190;
   public boolean aBool2191 = false;
   public static Class123 aClass123_2192 = new Class123(500);
   public static Class123 aClass123_2193 = new Class123(64);
   public static Class123 aClass123_2194 = new Class123(30);
   public int anInt2195 = 0;
   public String objectName = "null";
   int[] anIntArray2197;
   int[] anIntArray2198;
   public int actionCount = -616734146;
   short[] aShortArray2200;
   short[] aShortArray2201;
   short[] aShortArray2202;
   public int anInt2203 = 1731920317;
   public static Class123 aClass123_2204 = new Class123(30);
   public int sizeY = -1884647669;
   public int[] anIntArray2206;
   short[] aShortArray2207;
   static int anInt2208;
   int anInt2209 = 1376526875;
   static boolean aBool2210 = false;
   public int[] anIntArray2211;
   public int anInt2212 = 1066502373;
   public int anInt2213 = -171381904;
   int anInt2214 = 0;
   int anInt2215 = 0;
   public String[] actions = new String[5];
   boolean aBool2217 = false;
   public int anInt2218 = -19462571;
   boolean aBool2219 = false;
   public boolean aBool2220 = true;
   int anInt2221 = 286918272;
   int anInt2222 = 408619648;
   int anInt2223 = -148141952;
   int anInt2224 = 0;
   int anInt2225 = 0;
   int anInt2226 = 0;
   public boolean clippingFlag = false;
   static Model[] aClass116_Sub23_Sub16_Sub4Array2228 = new Model[4];
   public int anInt2229 = 1740157925;
   public boolean walkable = true;
   int anInt2231 = -459501529;
   int anInt2232 = 2089557189;
   public int anInt2233 = -1479982885;
   public int anInt2234 = 0;
   public int anInt2235 = 1295419843;
   public int anInt2236 = 0;
   public int anInt2239;
   static Class116_Sub15 aClass116_Sub15_2240;
   boolean aBool2241 = false;

   void method2392(byte var1) {
      if(-1 == this.anInt2203 * -839074197) {
         this.anInt2203 = 0;
         if(null != this.anIntArray2197 && (this.anIntArray2198 == null || this.anIntArray2198[0] == 10)) {
            this.anInt2203 = -1731920317;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if(this.actions[var2] != null) {
               this.anInt2203 = -1731920317;
            }
         }
      }

      if(-1 == 547466771 * this.anInt2229) {
         this.anInt2229 = -1740157925 * (0 != -1030255905 * this.actionCount ?1:0);
      }

   }

   void method2393(Buffer var1, byte var2) {
      while(true) {
         int var3 = var1.readSignedByte(1708176767);
         if(var3 == 0) {
            return;
         }

         this.method2394(var1, var3, (byte)0);
      }
   }

   void method2394(Buffer var1, int var2, byte var3) {
      int loop;
      int subId;
      if(var2 == 1) {
         subId = var1.readSignedByte(1708176767);
         if(subId > 0) {
            if(null != this.anIntArray2197 && !aBool2210) {
               var1.position += -552526767 * subId;
            } else {
               this.anIntArray2198 = new int[subId];
               this.anIntArray2197 = new int[subId];

               for(loop = 0; loop < subId; ++loop) {
                  this.anIntArray2197[loop] = var1.readShort(161432317);
                  this.anIntArray2198[loop] = var1.readSignedByte(1708176767);
               }
            }
         }
      } else if(2 == var2) {
         this.objectName = var1.readString(61376769);
      } else if(5 == var2) {
         subId = var1.readSignedByte(1708176767);
         if(subId > 0) {
            if(this.anIntArray2197 != null && !aBool2210) {
               var1.position += subId * -368351178;
            } else {
               this.anIntArray2198 = null;
               this.anIntArray2197 = new int[subId];

               for(loop = 0; loop < subId; ++loop) {
                  this.anIntArray2197[loop] = var1.readShort(839911328);
               }
            }
         }
      } else if(14 == var2) {
         this.sizeX = var1.readSignedByte(1708176767) * 1223037583;
      } else if(15 == var2) {
         this.sizeY = var1.readSignedByte(1708176767) * -1884647669;
      } else if(17 == var2) {
         this.actionCount = 0;
         this.walkable = false;
      } else if(18 == var2) {
         this.walkable = false;
      } else if(19 == var2) {
         this.anInt2203 = var1.readSignedByte(1708176767) * -1731920317;
      } else if(21 == var2) {
         this.anInt2209 = 0;
      } else if(var2 == 22) {
         this.aBool2217 = true;
      } else if(var2 == 23) {
         this.aBool2191 = true;
      } else if(var2 == 24) {
         this.anInt2212 = var1.readShort(-281492796) * -1066502373;
         if('\uffff' == this.anInt2212 * -100857069) {
            this.anInt2212 = 1066502373;
         }
      } else if(27 == var2) {
         this.actionCount = 1839116575;
      } else if(28 == var2) {
         this.anInt2213 = var1.readSignedByte(1708176767) * 1063030455;
      } else if(var2 == 29) {
         this.anInt2214 = var1.readUnsignedByte(1625724976) * -987911551;
      } else if(39 == var2) {
         this.anInt2215 = var1.readUnsignedByte(1629920609) * 790035309;
      } else if(var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readString(61376769);
         if(this.actions[var2 - 30].equalsIgnoreCase(Class91.hidden)) {
            this.actions[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         subId = var1.readSignedByte(1708176767);
         this.aShortArray2200 = new short[subId];
         this.aShortArray2201 = new short[subId];

         for(loop = 0; loop < subId; ++loop) {
            this.aShortArray2200[loop] = (short)var1.readShort(-30316754);
            this.aShortArray2201[loop] = (short)var1.readShort(1985128227);
         }
      } else if(var2 == 41) {
         subId = var1.readSignedByte(1708176767);
         this.aShortArray2202 = new short[subId];
         this.aShortArray2207 = new short[subId];

         for(loop = 0; loop < subId; ++loop) {
            this.aShortArray2202[loop] = (short)var1.readShort(-396502275);
            this.aShortArray2207[loop] = (short)var1.readShort(1157150384);
         }
      } else if(60 == var2) {
         this.anInt2235 = var1.readShort(54442791) * -1295419843;
      } else if(62 == var2) {
         this.aBool2219 = true;
      } else if(64 == var2) {
         this.aBool2220 = false;
      } else if(var2 == 65) {
         this.anInt2221 = var1.readShort(159071250) * 1478636557;
      } else if(var2 == 66) {
         this.anInt2222 = var1.readShort(-44103586) * 2016458261;
      } else if(67 == var2) {
         this.anInt2223 = var1.readShort(240624060) * -1443997935;
      } else if(var2 == 68) {
         this.anInt2218 = var1.readShort(1784424913) * 19462571;
      } else if(var2 == 69) {
         var1.readSignedByte(1708176767);
      } else if(var2 == 70) {
         this.anInt2224 = var1.method2007(1814822508) * -783331611;
      } else if(var2 == 71) {
         this.anInt2225 = var1.method2007(-133935205) * 1137245033;
      } else if(var2 == 72) {
         this.anInt2226 = var1.method2007(816560760) * -305523735;
      } else if(var2 == 73) {
         this.clippingFlag = true;
      } else if(74 == var2) {
         this.aBool2241 = true;
      } else if(75 == var2) {
         this.anInt2229 = var1.readSignedByte(1708176767) * -1740157925;
      } else if(77 == var2) {
         this.anInt2231 = var1.readShort(-353732310) * 459501529;
         if('\uffff' == -560193431 * this.anInt2231) {
            this.anInt2231 = -459501529;
         }

         this.anInt2232 = var1.readShort(1283970856) * -2089557189;
         if('\uffff' == this.anInt2232 * 560659955) {
            this.anInt2232 = 2089557189;
         }

         subId = var1.readSignedByte(1708176767);
         this.anIntArray2206 = new int[subId + 1];

         for(loop = 0; loop <= subId; ++loop) {
            this.anIntArray2206[loop] = var1.readShort(867702460);
            if('\uffff' == this.anIntArray2206[loop]) {
               this.anIntArray2206[loop] = -1;
            }
         }
      } else if(var2 == 78) {
         this.anInt2233 = var1.readShort(1183446761) * 1479982885;
         this.anInt2234 = var1.readSignedByte(1708176767) * 266176581;
      } else if(79 == var2) {
         this.anInt2195 = var1.readShort(897216197) * 1857310455;
         this.anInt2236 = var1.readShort(1125587898) * 979955917;
         this.anInt2234 = var1.readSignedByte(1708176767) * 266176581;
         subId = var1.readSignedByte(1708176767);
         this.anIntArray2211 = new int[subId];

         for(loop = 0; loop < subId; ++loop) {
            this.anIntArray2211[loop] = var1.readShort(601846703);
         }
      } else if(var2 == 81) {
         this.anInt2209 = var1.readSignedByte(1708176767) * -203561728;
      }

   }

   public final Animable method2396(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var8;
      if(this.anIntArray2198 == null) {
         var8 = (long)(var2 + (this.anInt2239 * -521826339 << 10));
      } else {
         var8 = (long)(var2 + (this.anInt2239 * -521826339 << 10) + (var1 << 3));
      }

      Object var11 = (Animable)aClass123_2204.method1632(var8);
      if(var11 == null) {
         Model var10 = this.method2400(var1, var2, 1361967299);
         if(null == var10) {
            return null;
         }

         if(!this.aBool2217) {
            var11 = var10.method3133(1607505281 * this.anInt2214 + 64, this.anInt2215 * 1352261597 + 768, -50, -10, -50);
         } else {
            var10.aShort2682 = (short)(this.anInt2214 * 1607505281 + 64);
            var10.aShort2684 = (short)(768 + this.anInt2215 * 1352261597);
            var10.method3147();
            var11 = var10;
         }

         aClass123_2204.method1633((NodeContainer)var11, var8);
      }

      if(this.aBool2217) {
         var11 = ((Model)var11).method3118();
      }

      if(912005101 * this.anInt2209 >= 0) {
         if(!(var11 instanceof SpotAnim)) {
            if(var11 instanceof Model) {
               var11 = ((Model)var11).method3119(var3, var4, var5, var6, true, 912005101 * this.anInt2209);
            }
         } else {
            var11 = ((SpotAnim)var11).method3369(var3, var4, var5, var6, true, 912005101 * this.anInt2209);
         }
      }

      return (Animable)var11;
   }

   public final SpotAnim method2398(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      long var10;
      if(this.anIntArray2198 == null) {
         var10 = (long)(var2 + (-521826339 * this.anInt2239 << 10));
      } else {
         var10 = (long)(var2 + (var1 << 3) + (this.anInt2239 * -521826339 << 10));
      }

      SpotAnim var9 = (SpotAnim)aClass123_2194.method1632(var10);
      if(var9 == null) {
         Model var8 = this.method2400(var1, var2, 1054012235);
         if(var8 == null) {
            return null;
         }

         var9 = var8.method3133(this.anInt2214 * 1607505281 + 64, this.anInt2215 * 1352261597 + 768, -50, -10, -50);
         aClass123_2194.method1633(var9, var10);
      }

      if(this.anInt2209 * 912005101 >= 0) {
         var9 = var9.method3369(var3, var4, var5, var6, true, 912005101 * this.anInt2209);
      }

      return var9;
   }

   public final SpotAnim method2399(int var1, int var2, int[][] var3, int var4, int var5, int var6, Class116_Sub23_Sub4 var7, int var8, int var9) {
      long var10;
      if(this.anIntArray2198 == null) {
         var10 = (long)((-521826339 * this.anInt2239 << 10) + var2);
      } else {
         var10 = (long)((var1 << 3) + (-521826339 * this.anInt2239 << 10) + var2);
      }

      SpotAnim var12 = (SpotAnim)aClass123_2194.method1632(var10);
      if(var12 == null) {
         Model var13 = this.method2400(var1, var2, 1674336763);
         if(var13 == null) {
            return null;
         }

         var12 = var13.method3133(this.anInt2214 * 1607505281 + 64, this.anInt2215 * 1352261597 + 768, -50, -10, -50);
         aClass123_2194.method1633(var12, var10);
      }

      if(null == var7 && -1 == this.anInt2209 * 912005101) {
         return var12;
      } else {
         if(null != var7) {
            var12 = var7.method2443(var12, var8, var2, -897423912);
         } else {
            var12 = var12.method3370(true);
         }

         if(912005101 * this.anInt2209 >= 0) {
            var12 = var12.method3369(var3, var4, var5, var6, false, 912005101 * this.anInt2209);
         }

         return var12;
      }
   }

   final Model method2400(int var1, int var2, int var3) {
      Model var4 = null;
      int var5;
      int var6;
      boolean var7;
      if(this.anIntArray2198 == null) {
         if(var1 != 10) {
            return null;
         }

         if(this.anIntArray2197 == null) {
            return null;
         }

         var7 = this.aBool2219;
         if(var1 == 2 && var2 > 3) {
            var7 = !var7;
         }

         var6 = this.anIntArray2197.length;

         for(int var8 = 0; var8 < var6; ++var8) {
            var5 = this.anIntArray2197[var8];
            if(var7) {
               var5 += 65536;
            }

            var4 = (Model)aClass123_2192.method1632((long)var5);
            if(null == var4) {
               var4 = Model.method3114(aClass99_2190, var5 & '\uffff', 0);
               if(var4 == null) {
                  return null;
               }

               if(var7) {
                  var4.method3127();
               }

               aClass123_2192.method1633(var4, (long)var5);
            }

            if(var6 > 1) {
               aClass116_Sub23_Sub16_Sub4Array2228[var8] = var4;
            }
         }

         if(var6 > 1) {
            var4 = new Model(aClass116_Sub23_Sub16_Sub4Array2228, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.anIntArray2198.length; ++var6) {
            if(this.anIntArray2198[var6] == var1) {
               var9 = var6;
               break;
            }
         }

         if(var9 == -1) {
            return null;
         }

         var6 = this.anIntArray2197[var9];
         boolean var11 = this.aBool2219 ^ var2 > 3;
         if(var11) {
            var6 += 65536;
         }

         var4 = (Model)aClass123_2192.method1632((long)var6);
         if(null == var4) {
            var4 = Model.method3114(aClass99_2190, var6 & '\uffff', 0);
            if(var4 == null) {
               return null;
            }

            if(var11) {
               var4.method3127();
            }

            aClass123_2192.method1633(var4, (long)var6);
         }
      }

      if(this.anInt2221 * -38847803 == 128 && 128 == this.anInt2222 * -295802563 && 128 == 300513777 * this.anInt2223) {
         var7 = false;
      } else {
         var7 = true;
      }

      boolean var10;
      if(-1836138771 * this.anInt2224 == 0 && -190626599 * this.anInt2225 == 0 && 1501426777 * this.anInt2226 == 0) {
         var10 = false;
      } else {
         var10 = true;
      }

      Model var12 = new Model(var4, 0 == var2 && !var7 && !var10, this.aShortArray2200 == null, this.aShortArray2202 == null, true);
      if(var1 == 4 && var2 > 3) {
         var12.method3137(256);
         var12.method3124(45, 0, -45);
      }

      var2 &= 3;
      if(1 == var2) {
         var12.method3121();
      } else if(2 == var2) {
         var12.method3180();
      } else if(3 == var2) {
         var12.method3113();
      }

      if(this.aShortArray2200 != null) {
         for(var5 = 0; var5 < this.aShortArray2200.length; ++var5) {
            var12.method3125(this.aShortArray2200[var5], this.aShortArray2201[var5]);
         }
      }

      if(this.aShortArray2202 != null) {
         for(var5 = 0; var5 < this.aShortArray2202.length; ++var5) {
            var12.method3126(this.aShortArray2202[var5], this.aShortArray2207[var5]);
         }
      }

      if(var7) {
         var12.method3128(-38847803 * this.anInt2221, this.anInt2222 * -295802563, 300513777 * this.anInt2223);
      }

      if(var10) {
         var12.method3124(-1836138771 * this.anInt2224, this.anInt2225 * -190626599, this.anInt2226 * 1501426777);
      }

      return var12;
   }

   static int method2401(char var0, int var1, int var2) {
      int var3 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      return var3;
   }

   public boolean method2402(int var1) {
      if(this.anIntArray2206 == null) {
         return this.anInt2233 * -874560339 != -1 || this.anIntArray2211 != null;
      } else {
         for(int var2 = 0; var2 < this.anIntArray2206.length; ++var2) {
            if(-1 != this.anIntArray2206[var2]) {
               ObjectDefinition var3 = Class45.method700(this.anIntArray2206[var2], 359750046);
               if(-1 != -874560339 * var3.anInt2233 || var3.anIntArray2211 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final boolean method2403(int var1, byte var2) {
      if(this.anIntArray2198 != null) {
         for(int var5 = 0; var5 < this.anIntArray2198.length; ++var5) {
            if(var1 == this.anIntArray2198[var5]) {
               return aClass99_2190.method1373(this.anIntArray2197[var5] & '\uffff', 0, (byte)1);
            }
         }

         return true;
      } else if(this.anIntArray2197 == null) {
         return true;
      } else if(var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.anIntArray2197.length; ++var4) {
            var3 &= aClass99_2190.method1373(this.anIntArray2197[var4] & '\uffff', 0, (byte)1);
         }

         return var3;
      }
   }

   public final boolean method2411(byte var1) {
      if(null == this.anIntArray2197) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.anIntArray2197.length; ++var3) {
            var2 &= aClass99_2190.method1373(this.anIntArray2197[var3] & '\uffff', 0, (byte)1);
         }

         return var2;
      }
   }

   public final ObjectDefinition method2419(int var1) {
      int var2 = -1;
      if(-1 != this.anInt2231 * -560193431) {
         var2 = Class103.method1451(-560193431 * this.anInt2231, -584760962);
      } else if(-1 != this.anInt2232 * 560659955) {
         var2 = Class107.varpData[560659955 * this.anInt2232];
      }

      return var2 >= 0 && var2 < this.anIntArray2206.length && -1 != this.anIntArray2206[var2]?Class45.method700(this.anIntArray2206[var2], 359750046):null;
   }

   public static Class116_Sub23_Sub19_Sub3[] method2433(Class99 var0, String var1, String var2, short var3) {
      int var4 = var0.method1366(var1, -714416867);
      int var5 = var0.method1367(var4, var2, 2015579647);
      Class116_Sub23_Sub19_Sub3[] var6;
      if(!Class41.method687(var0, var4, var5, -49724657)) {
         var6 = null;
      } else {
         var6 = Applet_Sub1.method3670((short)18278);
      }

      return var6;
   }

   static void method2434(int var0, byte var1) {
      if(var0 == -3) {
         Class7.method110(Class91.aString1086, Class91.aString1201, Class91.aString1164, 1935975903);
      } else if(var0 == -2) {
         Class7.method110(Class91.aString1277, Class91.aString1090, Class91.aString1091, 1935975903);
      } else if(-1 == var0) {
         Class7.method110(Class91.aString1092, Class91.aString1244, Class91.aString1094, 1935975903);
      } else if(var0 == 3) {
         Class7.method110(Class91.aString1135, Class91.aString1096, Class91.aString1097, 1935975903);
      } else if(var0 == 4) {
         Class7.method110(Class91.aString1098, Class91.aString1099, Class91.aString1100, 1935975903);
      } else if(5 == var0) {
         Class7.method110(Class91.aString1101, Class91.aString1102, Class91.aString1265, 1935975903);
      } else if(6 == var0) {
         Class7.method110(Class91.aString1104, Class91.aString1112, Class91.aString1144, 1935975903);
      } else if(7 == var0) {
         Class7.method110(Class91.aString1107, Class91.aString1108, Class91.aString1109, 1935975903);
      } else if(var0 == 8) {
         Class7.method110(Class91.aString1110, Class91.aString1088, Class91.aString1137, 1935975903);
      } else if(var0 == 9) {
         Class7.method110(Class91.aString1113, Class91.aString1114, Class91.aString1249, 1935975903);
      } else if(var0 == 10) {
         Class7.method110(Class91.aString1210, Class91.aString1258, Class91.aString1076, 1935975903);
      } else if(var0 == 11) {
         Class7.method110(Class91.aString1119, Class91.aString1120, Class91.aString1187, 1935975903);
      } else if(var0 == 12) {
         Class7.method110(Class91.aString1122, Class91.aString1123, Class91.aString1204, 1935975903);
      } else if(var0 == 13) {
         Class7.method110(Class91.aString1125, Class91.aString1126, Class91.aString1127, 1935975903);
      } else if(14 == var0) {
         Class7.method110(Class91.aString1156, Class91.aString1129, Class91.aString1130, 1935975903);
      } else if(var0 == 16) {
         Class7.method110(Class91.aString1157, Class91.aString1132, Class91.aString1159, 1935975903);
      } else if(var0 == 17) {
         Class7.method110(Class91.aString1134, Class91.aString1154, Class91.aString1136, 1935975903);
      } else if(var0 == 18) {
         Class7.method110(Class91.aString1116, Class91.aString1138, Class91.aString1139, 1935975903);
      } else if(var0 == 19) {
         Class7.method110(Class91.aString1140, Class91.aString1141, Class91.aString1142, 1935975903);
      } else if(var0 == 20) {
         Class7.method110(Class91.aString1103, Class91.aString1183, Class91.aString1145, 1935975903);
      } else if(var0 == 22) {
         Class7.method110(Class91.aString1312, Class91.aString1147, Class91.aString1148, 1935975903);
      } else if(var0 == 23) {
         Class7.method110(Class91.aString1095, Class91.aString1175, Class91.aString1151, 1935975903);
      } else if(24 == var0) {
         Class7.method110(Class91.aString1152, Class91.aString1153, Class91.aString1053, 1935975903);
      } else if(var0 == 25) {
         Class7.method110(Class91.aString1233, Class91.aString1067, Class91.aString1226, 1935975903);
      } else if(26 == var0) {
         Class7.method110(Class91.aString1314, Class91.aString1082, Class91.aString1297, 1935975903);
      } else if(var0 == 27) {
         Class7.method110(Class91.aString1161, Class91.aString1111, Class91.aString1163, 1935975903);
      } else if(var0 == 31) {
         Class7.method110(Class91.aString1124, Class91.aString1158, Class91.aString1172, 1935975903);
      } else if(32 == var0) {
         Class7.method110(Class91.aString1173, Class91.aString1174, Class91.aString1068, 1935975903);
      } else if(var0 == 37) {
         Class7.method110(Class91.aString1176, Class91.aString1177, Class91.aString1178, 1935975903);
      } else if(38 == var0) {
         Class7.method110(Class91.aString1179, Class91.aString1311, Class91.aString1181, 1935975903);
      } else if(var0 == 55) {
         Class7.method110(Class91.aString1182, Class91.aString1257, Class91.aString1184, 1935975903);
      } else {
         if(var0 == 56) {
            Class7.method110(Class91.aString1185, Class91.aString1186, Class91.aString1313, 1935975903);
            Class116_Sub12.method1983(11, (byte)72);
            return;
         }

         if(57 == var0) {
            Class7.method110(Class91.aString1205, Class91.aString1189, Class91.aString1190, 1935975903);
            Class116_Sub12.method1983(11, (byte)71);
            return;
         }

         Class7.method110(Class91.aString1191, Class91.aString1192, Class91.aString1168, 1935975903);
      }

      Class116_Sub12.method1983(10, (byte)109);
   }

   static void method2435(Class116_Sub15[] var0, Class116_Sub15 var1, boolean var2, int var3) {
      int var5 = -302755437 * var1.anInt2037 != 0?-302755437 * var1.anInt2037:var1.anInt1940 * 1645211541;
      int var4 = 0 != 177405235 * var1.anInt1949?177405235 * var1.anInt1949:1227800423 * var1.anInt1974;
      Class4.method49(var0, -1536575275 * var1.anInt1925, var5, var4, var2, 1505619252);
      if(var1.aClass116_Sub15Array1995 != null) {
         Class4.method49(var1.aClass116_Sub15Array1995, var1.anInt1925 * -1536575275, var5, var4, var2, -1237152197);
      }

      Class116_Sub11 var6 = (Class116_Sub11)client.aClass127_3094.method1658((long)(-1536575275 * var1.anInt1925));
      if(var6 != null) {
         Class50.method777(var6.anInt1821 * 226793949, var5, var4, var2, (short)-256);
      }

      if(1337 == -179718399 * var1.anInt2016) {
         ;
      }

   }

   public final Animable method2436(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var9;
      if(this.anIntArray2198 == null) {
         var9 = (long)(var2 + (this.anInt2239 * -521826339 << 10));
      } else {
         var9 = (long)(var2 + (this.anInt2239 * -521826339 << 10) + (var1 << 3));
      }

      Object var7 = (Animable)aClass123_2204.method1632(var9);
      if(var7 == null) {
         Model var8 = this.method2400(var1, var2, 1477354698);
         if(null == var8) {
            return null;
         }

         if(!this.aBool2217) {
            var7 = var8.method3133(1607505281 * this.anInt2214 + 64, this.anInt2215 * 1352261597 + 768, -50, -10, -50);
         } else {
            var8.aShort2682 = (short)(this.anInt2214 * 1607505281 + 64);
            var8.aShort2684 = (short)(768 + this.anInt2215 * 1352261597);
            var8.method3147();
            var7 = var8;
         }

         aClass123_2204.method1633((NodeContainer)var7, var9);
      }

      if(this.aBool2217) {
         var7 = ((Model)var7).method3118();
      }

      if(912005101 * this.anInt2209 >= 0) {
         if(var7 instanceof SpotAnim) {
            var7 = ((SpotAnim)var7).method3369(var3, var4, var5, var6, true, 912005101 * this.anInt2209);
         } else if(var7 instanceof Model) {
            var7 = ((Model)var7).method3119(var3, var4, var5, var6, true, 912005101 * this.anInt2209);
         }
      }

      return (Animable)var7;
   }

   public static Class116_Sub23_Sub5 method2437(int var0, byte var1) {
      Class116_Sub23_Sub5 var2 = (Class116_Sub23_Sub5)Class116_Sub23_Sub5.aClass123_2266.method1632((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class116_Sub23_Sub5.aClass99_2267.method1394(8, var0, -991185501);
         var2 = new Class116_Sub23_Sub5();
         if(null != var3) {
            var2.method2475(new Buffer(var3), (byte)64);
         }

         Class116_Sub23_Sub5.aClass123_2266.method1633(var2, (long)var0);
         return var2;
      }
   }
}
