package com.jagex;

public class RSInterface extends Node {

   public int anInt1915 = 0;
   static boolean[] interfacesLoaded;
   static RSIndex interfaceIndex;
   public String aString1918 = "";
   public int anInt1919;
   static Class123 aClass123_1920 = new Class123(50);
   public int click_mask = 0;
   public int rotation = 0;
   public static boolean aBool1923 = false;
   public boolean newFormat = false;
   public int hash = -1463664765;
   public int anInt1926 = -938225275;
   public Object[] spellUsedOnItemListener;
   public int invSpritePadX = 0;
   static RSIndex aRSIndex_1929;
   public int anInt1930 = 0;
   public Object[] mouseFocusedListener;
   public int anInt1932 = 0;
   public int anInt1933 = 0;
   public int xOffset = 0;
   public int rotateX = 0;
   public int width = 0;
   public int height = 0;
   public int x = 0;
   public int y = 0;
   public int wdth = 0;
   public int shadow = 0;
   public int thickness = -532092193;
   public int verticalAlignment = 0;
   public int parent = -742443693;
   public boolean hidden = false;
   public int anInt1946 = 0;
   public int anInt1947 = 0;
   public int[] skillListenerValues;
   public int maxScrollVertical = 0;
   public int disabledColor = 0;
   public int enabledColor = 0;
   public int disabledMouseOverColor = 0;
   public int enabledMouseOverColor = 0;
   public static final int anInt1954 = 32;
   public int alpha = 0;
   public static RSInterface[][] mainInterfaceArray;
   public boolean aBool1957 = false;
   public int disabledSprite = -8452631;
   public int enabledSprite = 134170007;
   public Object[] mouseFocusListener;
   public boolean gridOriginal = false;
   public int[] spriteX;
   public boolean aBool1963;
   public boolean flipVertical;
   public int anInt1965 = 0;
   public int lastDrawCycle;
   public int mediaIdDisabled = 541123263;
   int mediaTypeEnabled = 2074402997;
   int mediaIdEnabled = -1281953087;
   public int anInt1970 = 0;
   public int enabledAnim = -1031227777;
   public Object[] inventoryUpdateListener;
   public int translateY = 0;
   public int heght = 0;
   public int modelTypeDisabled = -376460707;
   public int anInt1976 = -1116355379;
   public int zoom = -859504940;
   public int mouseOverId = -1344074445;
   public int font = -189801909;
   public boolean aBool1980 = false;
   public int anInt1981 = 1197573590;
   public Object[] anObjectArray1982;
   public String disabledText = "";
   public String enabledText = "";
   public int verticalSpacing = 0;
   public int horizontalAlignment = 0;
   public int anInt1987 = 0;
   public boolean shaded = false;
   public boolean filled = false;
   public int anInt1990 = 0;
   public int disabledAnim = -1986493785;
   public int[] spriteY;
   public int[] spriteId;
   public boolean aBool1994;
   public RSInterface[] aClass116_Sub15Array1995;
   public String action_name = "";
   public String[] niActions;
   public RSInterface aClass116_Sub15_1998 = null;
   public int anInt1999 = 0;
   static Class123 aClass123_2000 = new Class123(200);
   public int[] requiredValues;
   public String selectedActionName = "";
   public boolean aBool2003 = false;
   public Object[] onStartListener;
   public Object[] mouseClickFocusListener;
   public Object[] mouseClickListener;
   public Object[] mouseClickUnfocusListener;
   public Object[] mouseDraggedListener;
   public boolean aBool2009;
   public int invSpritePadY = 0;
   public Object[] mouseUnfocusListener;
   public Object[] anObjectArray2012;
   public Object[] anObjectArray2013;
   public int outline = 0;
   public Object[] spellUsedListener;
   public int clientCode = 0;
   public int[] varpListenerValues;
   public int type;
   public int[] inventoryListenerValues;
   public Object[] skillUpdateListener;
   public boolean modifyDraggingAlpha = false;
   public Object[] mainLoopListener;
   public Object[] anObjectArray2023;
   public Object[] mouseWheelListener;
   public Object[] anObjectArray2025;
   public Object[] anObjectArray2026;
   public Object[] anObjectArray2027;
   public Object[] anObjectArray2028;
   public int yOffset = 0;
   public Object[] anObjectArray2030;
   public Object[] anObjectArray2031;
   public Object[] anObjectArray2032;
   public Object[] anObjectArray2033;
   public Object[] anObjectArray2034;
   public int[][] cs1opcodes;
   public int[] valueCompareType;
   public int anInt2037 = 0;
   static Class123 aClass123_2038 = new Class123(20);
   public Object[] varpUpdateListener;
   public String toolTip;
   public int anInt2041 = -1646228653;
   public int[] invStackSize;
   public int anInt2043;
   public int anInt2044;
   public int anInt2045;
   public int actionType = 0;
   public int[] inv;
   public boolean flipHorizontal;
   public String[] oiActions;
   public int anInt2050;
   public int anInt2051;
   public int translateX = 0;
   public int anInt2053;
   public int redrawId;
   public int anInt2055;
   public boolean aBool2056;
   public int rotateY = 0;
   static Class123 aClass123_2058 = new Class123(8);

   void parseNew(Packet var1, short var2) {
      var1.readSignedByte(1708176767);
      this.newFormat = true;
      this.type = var1.readSignedByte(1708176767) * 1702392323;
      this.clientCode = var1.readUnsignedShort(929398375) * -2071508735;
      this.xOffset = var1.readShort(-111964471) * 10986657;
      this.yOffset = var1.readShort(-1516387895) * -720369495;
      this.width = var1.readUnsignedShort(1700829906) * 934649725;
      if(this.type * -1305917269 == 9) {
         this.height = var1.readShort(-1500497001) * -280898437;
      } else {
         this.height = var1.readUnsignedShort(-337906716) * -280898437;
      }

      this.anInt1932 = var1.readUnsignedByte(-1996264234) * -1174864481;
      this.anInt1933 = var1.readUnsignedByte(646239158) * -1361079889;
      this.anInt1930 = var1.readUnsignedByte(-1805621380) * 821393763;
      this.anInt1915 = var1.readUnsignedByte(-1739283527) * -1510479807;


      this.parent = var1.readUnsignedShort(1438091039) * 742443693;
      if('\uffff' == -1652479707 * this.parent) {
         this.parent = -742443693;
      } else {
         this.parent = 742443693 * ((this.hash * -1536575275 & -65536) + this.parent * -1652479707);
      }

      this.hidden = var1.readSignedByte(1708176767) == 1;
      if(this.type * -1305917269 == 0) {
         this.anInt2037 = var1.readUnsignedShort(1501767599) * -1460374373;
         this.maxScrollVertical = var1.readUnsignedShort(1096680476) * 2144421371;
         this.aBool2056 = var1.readSignedByte(1708176767) == 1;
      }

      if(-1305917269 * this.type == 5) {
         this.disabledSprite = var1.readInt(-1906362480) * 8452631;
         this.rotation = var1.readUnsignedShort(1493361838) * -2073708251;
         this.gridOriginal = var1.readSignedByte(1708176767) == 1;
         this.alpha = var1.readSignedByte(1708176767) * -150375007;
         this.outline = var1.readSignedByte(1708176767) * -1058827231;
         this.shadow = var1.readInt(-450968897) * 1485125361;
         this.flipVertical = var1.readSignedByte(1708176767) == 1;
         this.flipHorizontal = var1.readSignedByte(1708176767) == 1;
      }

      if(6 == -1305917269 * this.type) {
         this.modelTypeDisabled = -376460707;
         this.mediaIdDisabled = var1.readUnsignedShort(2139174303) * -541123263;
         if(this.mediaIdDisabled * 686060225 == '\uffff') {
            this.mediaIdDisabled = 541123263;
         }

         this.translateX = var1.readShort(-253929608) * 1821510845;
         this.translateY = var1.readShort(388852982) * 1509391427;
         this.rotateX = var1.readUnsignedShort(728484742) * 1055873919;
         this.rotateY = var1.readUnsignedShort(198903492) * -478470667;
         this.anInt1990 = var1.readUnsignedShort(1179394415) * -1820349821;
         this.zoom = var1.readUnsignedShort(1816042537) * -438091779;
         this.disabledAnim = var1.readUnsignedShort(1302838488) * 1986493785;
         if('\uffff' == 467073769 * this.disabledAnim) {
            this.disabledAnim = -1986493785;
         }

         this.aBool1980 = var1.readSignedByte(1708176767) == 1;
         var1.readUnsignedShort(2072604208);
         if(this.anInt1932 * -1693000097 != 0) {
            this.anInt1987 = var1.readUnsignedShort(-331316977) * 1064993113;
         }

         if(1039689039 * this.anInt1933 != 0) {
            var1.readUnsignedShort(115983753);
         }
      }

      if(4 == this.type * -1305917269) {
         this.font = var1.readUnsignedShort(180260779) * 189801909;
         if(-335454051 * this.font == '\uffff') {
            this.font = -189801909;
         }

         this.disabledText = var1.readString(61376769);
         this.verticalSpacing = var1.readSignedByte(1708176767) * -51845037;
         this.horizontalAlignment = var1.readSignedByte(1708176767) * 1328854359;
         this.verticalAlignment = var1.readSignedByte(1708176767) * 252282377;
         this.shaded = var1.readSignedByte(1708176767) == 1;
         this.disabledColor = var1.readInt(-2072327075) * 1053943595;
      }

      if(-1305917269 * this.type == 3) {
         this.disabledColor = var1.readInt(-849030856) * 1053943595;
         this.filled = var1.readSignedByte(1708176767) == 1;
         this.alpha = var1.readSignedByte(1708176767) * -150375007;
      }

      if(-1305917269 * this.type == 9) {
         this.thickness = var1.readSignedByte(1708176767) * -532092193;
         this.disabledColor = var1.readInt(-1626959902) * 1053943595;
         this.aBool1957 = var1.readSignedByte(1708176767) == 1;
      }

      this.click_mask = var1.readMedium((byte) 15) * 583340921;
      this.action_name = var1.readString(61376769);
      int var4 = var1.readSignedByte(1708176767);
      if(var4 > 0) {
         this.niActions = new String[var4];

         for(int var3 = 0; var3 < var4; ++var3) {
            this.niActions[var3] = var1.readString(61376769);
         }
      }

      this.anInt1999 = var1.readSignedByte(1708176767) * -172520565;
      this.anInt1965 = var1.readSignedByte(1708176767) * -77181551;
      this.modifyDraggingAlpha = var1.readSignedByte(1708176767) == 1;
      this.selectedActionName = var1.readString(61376769);
      this.onStartListener = this.method2283(var1, 1285253801);
      this.mouseFocusListener = this.method2283(var1, 1288207562);
      this.mouseUnfocusListener = this.method2283(var1, 1503447933);
      this.spellUsedListener = this.method2283(var1, 771484217);
      this.spellUsedOnItemListener = this.method2283(var1, 738664421);
      this.varpUpdateListener = this.method2283(var1, 721989138);
      this.inventoryUpdateListener = this.method2283(var1, 1475164321);
      this.skillUpdateListener = this.method2283(var1, 358203913);
      this.mainLoopListener = this.method2283(var1, 864333335);
      this.anObjectArray2023 = this.method2283(var1, 222597681);
      this.mouseFocusedListener = this.method2283(var1, -433480421);
      this.mouseClickFocusListener = this.method2283(var1, -448611257);
      this.mouseClickListener = this.method2283(var1, 1560385681);
      this.mouseClickUnfocusListener = this.method2283(var1, 1173394551);
      this.mouseDraggedListener = this.method2283(var1, -195166307);
      this.anObjectArray2012 = this.method2283(var1, 322183214);
      this.anObjectArray2013 = this.method2283(var1, 1721980585);
      this.mouseWheelListener = this.method2283(var1, 2102793897);
      this.varpListenerValues = this.method2249(var1, (byte)-73);
      this.inventoryListenerValues = this.method2249(var1, (byte)-83);
      this.skillListenerValues = this.method2249(var1, (byte)-52);
   }

   int[] method2249(Packet var1, byte var2) {
      int var3 = var1.readSignedByte(1708176767);
      if(var3 == 0) {
         return null;
      } else {
         int[] var5 = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            var5[var4] = var1.readInt(-520951240);
         }

         return var5;
      }
   }

   public Sprite method2250(int var1, byte var2) {
      aBool1923 = false;
      if(var1 >= 0 && var1 < this.spriteId.length) {
         int var3 = this.spriteId[var1];
         if(-1 != var3) {
            Sprite var4 = (Sprite)aClass123_2000.method1632((long)var3);
            if(var4 != null) {
               return var4;
            } else {
               RSIndex var5 = Mob.aRSIndex_2878;
               Sprite var7;
               if(!Class41.method687(var5, var3, 0, -95952057)) {
                  var7 = null;
               } else {
                  Sprite var6 = new Sprite();
                  var6.anInt2725 = -749860951 * Class8.anInt122;
                  var6.anInt2726 = -1945497809 * Class8.anInt132;
                  var6.xOffSet = Class8.anIntArray124[0];
                  var6.yOffset = Class116_Sub23_Sub15.anIntArray2444[0];
                  var6.myWidth = Class8.anIntArray125[0];
                  var6.myHeight = Class8.anIntArray126[0];
                  int var9 = var6.myWidth * var6.myHeight;
                  byte[] var10 = Mob.aByteArrayArray2877[0];
                  var6.myPixels = new int[var9];

                  for(int var8 = 0; var8 < var9; ++var8) {
                     var6.myPixels[var8] = Class97.anIntArray1372[var10[var8] & 255];
                  }

                  Class76.method1080((byte)-51);
                  var7 = var6;
               }

               if(var7 != null) {
                  aClass123_2000.method1633(var7, (long)var3);
               } else {
                  aBool1923 = true;
               }

               return var7;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public Sprite method2251(boolean var1, int var2) {
      aBool1923 = false;
      int var12;
      if(var1) {
         var12 = this.enabledSprite * -1162840615;
      } else {
         var12 = 18996647 * this.disabledSprite;
      }

      if(-1 == var12) {
         return null;
      } else {
         long var9 = ((long)(2139159057 * this.shadow) << 40) + ((this.flipVertical ?1L:0L) << 38) + (long)var12 + ((long)(-357503007 * this.outline) << 36) + ((this.flipHorizontal ?1L:0L) << 39);
         Sprite var3 = (Sprite)aClass123_2000.method1632(var9);
         if(null != var3) {
            return var3;
         } else {
            RSIndex var11 = Mob.aRSIndex_2878;
            Sprite var8;
            if(!Class41.method687(var11, var12, 0, 1199020732)) {
               var8 = null;
            } else {
               Sprite var4 = new Sprite();
               var4.anInt2725 = -749860951 * Class8.anInt122;
               var4.anInt2726 = Class8.anInt132 * -1945497809;
               var4.xOffSet = Class8.anIntArray124[0];
               var4.yOffset = Class116_Sub23_Sub15.anIntArray2444[0];
               var4.myWidth = Class8.anIntArray125[0];
               var4.myHeight = Class8.anIntArray126[0];
               int var6 = var4.myWidth * var4.myHeight;
               byte[] var13 = Mob.aByteArrayArray2877[0];
               var4.myPixels = new int[var6];

               for(int var5 = 0; var5 < var6; ++var5) {
                  var4.myPixels[var5] = Class97.anIntArray1372[var13[var5] & 255];
               }

               Class76.method1080((byte)54);
               var8 = var4;
            }

            if(null == var8) {
               aBool1923 = true;
               return null;
            } else {
               if(this.flipVertical) {
                  var8.method3260();
               }

               if(this.flipHorizontal) {
                  var8.method3259();
               }

               if(this.outline * -357503007 > 0) {
                  var8.method3258(this.outline * -357503007);
               }

               if(this.outline * -357503007 >= 1) {
                  var8.method3272(1);
               }

               if(this.outline * -357503007 >= 2) {
                  var8.method3272(16777215);
               }

               if(this.shadow * 2139159057 != 0) {
                  var8.method3319(this.shadow * 2139159057);
               }

               aClass123_2000.method1633(var8, var9);
               return var8;
            }
         }
      }
   }

   public Class116_Sub23_Sub19_Sub4_Sub1 method2252(byte var1) {
      aBool1923 = false;
      if(this.font * -335454051 == -1) {
         return null;
      } else {
         Class116_Sub23_Sub19_Sub4_Sub1 var2 = (Class116_Sub23_Sub19_Sub4_Sub1)aClass123_2038.method1632((long)(-335454051 * this.font));
         if(null == var2) {
            RSIndex var4 = Mob.aRSIndex_2878;
            RSIndex var5 = Friend.aRSIndex_1664;
            int var6 = -335454051 * this.font;
            Class116_Sub23_Sub19_Sub4_Sub1 var3;
            if(!Class41.method687(var4, var6, 0, 1835102234)) {
               var3 = null;
            } else {
               var3 = Ignore.method530(var5.getFiles(var6, 0, -989803280), 2054420591);
            }

            if(null != var3) {
               aClass123_2038.method1633(var3, (long)(this.font * -335454051));
            } else {
               aBool1923 = true;
            }

            return var3;
         } else {
            return var2;
         }
      }
   }

   public Class116_Sub23_Sub20 method2255(boolean var1, int var2) {
      if(-1 == -1162840615 * this.enabledSprite) {
         var1 = false;
      }

      int var3 = var1?this.enabledSprite * -1162840615:this.disabledSprite * 18996647;
      if(-1 == var3) {
         return null;
      } else {
         long var8 = ((long)(-357503007 * this.outline) << 36) + (long)var3 + ((this.flipVertical ?1L:0L) << 38) + ((this.flipHorizontal ?1L:0L) << 39) + ((long)(this.shadow * 2139159057) << 40);
         Class116_Sub23_Sub20 var10 = (Class116_Sub23_Sub20)aClass123_2058.method1632(var8);
         if(var10 != null) {
            return var10;
         } else {
            Sprite sprite = this.method2251(var1, -2134474908);
            if(sprite == null) {
               return null;
            } else {
               Sprite sprite1 = sprite.crop();
               int[] var11 = new int[sprite1.myHeight];
               int[] var7 = new int[sprite1.myHeight];
               int var12 = 0;

               while(var12 < sprite1.myHeight) {
                  int var14 = 0;
                  int var5 = sprite1.myWidth;
                  int var4 = 0;

                  while(true) {
                     if(var4 < sprite1.myWidth) {
                        if(0 != sprite1.myPixels[var4 + var12 * sprite1.myWidth]) {
                           ++var4;
                           continue;
                        }

                        var14 = var4;
                     }

                     for(var4 = sprite1.myWidth - 1; var4 >= var14; --var4) {
                        if(0 == sprite1.myPixels[var4 + var12 * sprite1.myWidth]) {
                           var5 = 1 + var4;
                           break;
                        }
                     }

                     var11[var12] = var14;
                     var7[var12] = var5 - var14;
                     ++var12;
                     break;
                  }
               }

               var10 = new Class116_Sub23_Sub20(sprite1.myWidth, sprite1.myHeight, var7, var11, var3);
               aClass123_2058.method1633(var10, var8);
               return var10;
            }
         }
      }
   }

   public SpotAnim method2256(Class116_Sub23_Sub4 var1, int var2, boolean var3, Class108 var4, int var5) {
      aBool1923 = false;
      int var7;
      int var8;
      if(var3) {
         var7 = this.mediaTypeEnabled * -1959457379;
         var8 = this.mediaIdEnabled * 489906879;
      } else {
         var7 = -768837131 * this.modelTypeDisabled;
         var8 = 686060225 * this.mediaIdDisabled;
      }

      if(0 == var7) {
         return null;
      } else if(1 == var7 && var8 == -1) {
         return null;
      } else {
         SpotAnim var9 = (SpotAnim)aClass123_1920.method1632((long)(var8 + (var7 << 16)));
         if(null == var9) {
            Model var6;
            if(1 == var7) {
               var6 = Model.method3114(aRSIndex_1929, var8, 0);
               if(null == var6) {
                  aBool1923 = true;
                  return null;
               }

               var9 = var6.method3133(64, 768, -50, -10, -50);
            }

            if(var7 == 2) {
               var6 = Class116_Sub23_Sub15.getMobDefinition(var8, -1251467686).method2545((byte)122);
               if(var6 == null) {
                  aBool1923 = true;
                  return null;
               }

               var9 = var6.method3133(64, 768, -50, -10, -50);
            }

            if(3 == var7) {
               if(var4 == null) {
                  return null;
               }

               var6 = var4.method1494(1860321208);
               if(null == var6) {
                  aBool1923 = true;
                  return null;
               }

               var9 = var6.method3133(64, 768, -50, -10, -50);
            }

            if(var7 == 4) {
               Class116_Sub23_Sub11 var10 = RelationList.method778(var8, (byte) 70);
               var6 = var10.method2591(10, -52018867);
               if(null == var6) {
                  aBool1923 = true;
                  return null;
               }

               var9 = var6.method3133(64 + -1058514191 * var10.anInt2373, 768 + var10.anInt2397 * 1955247405, -50, -10, -50);
            }

            aClass123_1920.method1633(var9, (long)((var7 << 16) + var8));
         }

         if(var1 != null) {
            var9 = var1.method2446(var9, var2, -1995209278);
         }

         return var9;
      }
   }

   public void method2257(int var1, String var2, int var3) {
      if(null == this.niActions || this.niActions.length <= var1) {
         String[] var5 = new String[1 + var1];
         if(null != this.niActions) {
            for(int var4 = 0; var4 < this.niActions.length; ++var4) {
               var5[var4] = this.niActions[var4];
            }
         }

         this.niActions = var5;
      }

      this.niActions[var1] = var2;
   }

   static final int method2275(int var0, int var1, int var2, int var3) {
      int var4 = var0 / var2;
      int var9 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var12 = Class39.method681(var4, var5, 1200915234);
      int var11 = Class39.method681(var4 + 1, var5, -460755594);
      int var8 = Class39.method681(var4, var5 + 1, 958765130);
      int var6 = Class39.method681(1 + var4, 1 + var5, -909283309);
      int var13 = GameInterface.method1975(var12, var11, var9, var2, -1942198136);
      int var10 = GameInterface.method1975(var8, var6, var9, var2, -1602741163);
      return GameInterface.method1975(var13, var10, var7, var2, -2002022180);
   }

   Object[] method2283(Packet var1, int var2) {
      int var3 = var1.readSignedByte(1708176767);
      if(0 == var3) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.readSignedByte(1708176767);
            if(0 != var6) {
               if(var6 == 1) {
                  var4[var5] = var1.readString(61376769);
               }
            } else {
               var4[var5] = new Integer(var1.readInt(-1762027216));
            }
         }
         this.aBool2003 = true;
         return var4;
      }
   }

   void parseOld(Packet buffer, int var2) {
      this.newFormat = false;
      this.type = buffer.readSignedByte(1708176767) * 1702392323;
      this.actionType = buffer.readSignedByte(1708176767) * 1390425787;
      this.clientCode = buffer.readUnsignedShort(1603938504) * -2071508735;
      this.xOffset = buffer.readShort(-941727762) * 10986657;
      this.yOffset = buffer.readShort(-1149961067) * -720369495;
      this.width = buffer.readUnsignedShort(436997175) * 934649725;
      this.height = buffer.readUnsignedShort(-190052874) * -280898437;
      this.alpha = buffer.readSignedByte(1708176767) * -150375007;
      this.parent = buffer.readUnsignedShort(157992499) * 742443693;
      if('\uffff' == -1652479707 * this.parent) {
         this.parent = -742443693;
      } else {
         this.parent = 742443693 * (this.parent * -1652479707 + (-1536575275 * this.hash & -65536));
      }

      this.mouseOverId = buffer.readUnsignedShort(2109582416) * 1344074445;
      if('\uffff' == this.mouseOverId * -700429819) {
         this.mouseOverId = -1344074445;
      }

      int valueCompareCount = buffer.readSignedByte(1708176767);
      int cs1length;
      if(valueCompareCount > 0) {
         this.valueCompareType = new int[valueCompareCount];
         this.requiredValues = new int[valueCompareCount];

         for(cs1length = 0; cs1length < valueCompareCount; ++cs1length) {
            this.valueCompareType[cs1length] = buffer.readSignedByte(1708176767);
            this.requiredValues[cs1length] = buffer.readUnsignedShort(1441149340);
         }
      }

      cs1length = buffer.readSignedByte(1708176767);
      int someHash1Modifier;
      int someHashModifier;
      int someHash2Modifier;
      if(cs1length > 0) {
         this.cs1opcodes = new int[cs1length][];

         for(someHashModifier = 0; someHashModifier < cs1length; ++someHashModifier) {
            someHash1Modifier = buffer.readUnsignedShort(547161756);
            this.cs1opcodes[someHashModifier] = new int[someHash1Modifier];

            for(someHash2Modifier = 0; someHash2Modifier < someHash1Modifier; ++someHash2Modifier) {
               this.cs1opcodes[someHashModifier][someHash2Modifier] = buffer.readUnsignedShort(2123429500);
               if(this.cs1opcodes[someHashModifier][someHash2Modifier] == '\uffff') {
                  this.cs1opcodes[someHashModifier][someHash2Modifier] = -1;
               }
            }
         }
      }

      if(-1305917269 * this.type == 0) {
         this.maxScrollVertical = buffer.readUnsignedShort(282794473) * 2144421371;
         this.hidden = buffer.readSignedByte(1708176767) == 1;
      }

      if(this.type * -1305917269 == 1) {
         buffer.readUnsignedShort(694073595);
         buffer.readSignedByte(1708176767);
      }

      if(2 == this.type * -1305917269) {
         this.inv = new int[124195285 * this.width * 507570867 * this.height];
         this.invStackSize = new int[124195285 * this.width * 507570867 * this.height];
         someHashModifier = buffer.readSignedByte(1708176767);
         if(someHashModifier == 1) {
            this.click_mask = 583340921 * (-1817319735 * this.click_mask | 268435456);
         }

         someHash1Modifier = buffer.readSignedByte(1708176767);
         if(1 == someHash1Modifier) {
            this.click_mask = 583340921 * (-1817319735 * this.click_mask | 1073741824);
         }

         someHash2Modifier = buffer.readSignedByte(1708176767);
         if(1 == someHash2Modifier) {
            this.click_mask = 583340921 * (this.click_mask * -1817319735 | Integer.MIN_VALUE);
         }

         int someHash3Modifier = buffer.readSignedByte(1708176767);
         if(1 == someHash3Modifier) {
            this.click_mask = (-1817319735 * this.click_mask | 536870912) * 583340921;
         }

         this.invSpritePadX = buffer.readSignedByte(1708176767) * 1585606775;
         this.invSpritePadY = buffer.readSignedByte(1708176767) * -393969859;
         this.spriteX = new int[20];
         this.spriteY = new int[20];
         this.spriteId = new int[20];

         int var7;
         for(var7 = 0; var7 < 20; ++var7) {
            int var8 = buffer.readSignedByte(1708176767);
            if(1 == var8) {
               this.spriteX[var7] = buffer.readShort(663379372);
               this.spriteY[var7] = buffer.readShort(469304326);
               this.spriteId[var7] = buffer.readInt(-573680189);
            } else {
               this.spriteId[var7] = -1;
            }
         }

         this.oiActions = new String[5];

         for(var7 = 0; var7 < 5; ++var7) {
            String var11 = buffer.readString(61376769);
            if(var11.length() > 0) {
               this.oiActions[var7] = var11;
               this.click_mask = (this.click_mask * -1817319735 | 1 << var7 + 23) * 583340921;
            }
         }
      }

      if(-1305917269 * this.type == 3) {
         this.filled = buffer.readSignedByte(1708176767) == 1;
      }

      if(4 == this.type * -1305917269 || 1 == -1305917269 * this.type) {
         this.horizontalAlignment = buffer.readSignedByte(1708176767) * 1328854359;
         this.verticalAlignment = buffer.readSignedByte(1708176767) * 252282377;
         this.verticalSpacing = buffer.readSignedByte(1708176767) * -51845037;
         this.font = buffer.readUnsignedShort(-348739723) * 189801909;
         if(-335454051 * this.font == '\uffff') {
            this.font = -189801909;
         }

         this.shaded = buffer.readSignedByte(1708176767) == 1;
      }

      if(4 == -1305917269 * this.type) {
         this.disabledText = buffer.readString(61376769);
         this.enabledText = buffer.readString(61376769);
      }

      if(1 == -1305917269 * this.type || 3 == -1305917269 * this.type || 4 == this.type * -1305917269) {
         this.disabledColor = buffer.readInt(-982442002) * 1053943595;
      }

      if(3 == this.type * -1305917269 || 4 == this.type * -1305917269) {
         this.enabledColor = buffer.readInt(-753852168) * -1762562445;
         this.disabledMouseOverColor = buffer.readInt(-1005481395) * -727461959;
         this.enabledMouseOverColor = buffer.readInt(-1804115139) * 1763279165;
      }

      if(-1305917269 * this.type == 5) {
         this.disabledSprite = buffer.readInt(-700446335) * 8452631;
         this.enabledSprite = buffer.readInt(-1722943803) * -134170007;
      }

      if(this.type * -1305917269 == 6) {
         this.modelTypeDisabled = -376460707;
         this.mediaIdDisabled = buffer.readUnsignedShort(1496166466) * -541123263;
         if('\uffff' == this.mediaIdDisabled * 686060225) {
            this.mediaIdDisabled = 541123263;
         }

         this.mediaTypeEnabled = 2074402997;
         this.mediaIdEnabled = buffer.readUnsignedShort(526329800) * 1281953087;
         if(this.mediaIdEnabled * 489906879 == '\uffff') {
            this.mediaIdEnabled = -1281953087;
         }

         this.disabledAnim = buffer.readUnsignedShort(1664214272) * 1986493785;
         if(467073769 * this.disabledAnim == '\uffff') {
            this.disabledAnim = -1986493785;
         }

         this.enabledAnim = buffer.readUnsignedShort(-46608796) * 1031227777;
         if('\uffff' == this.enabledAnim * -213715327) {
            this.enabledAnim = -1031227777;
         }

         this.zoom = buffer.readUnsignedShort(-376235872) * -438091779;
         this.rotateX = buffer.readUnsignedShort(-285789763) * 1055873919;
         this.rotateY = buffer.readUnsignedShort(1223179242) * -478470667;
      }

      if(7 == this.type * -1305917269) {
         this.inv = new int[507570867 * this.height * this.width * 124195285];
         this.invStackSize = new int[this.width * 124195285 * this.height * 507570867];
         this.horizontalAlignment = buffer.readSignedByte(1708176767) * 1328854359;
         this.font = buffer.readUnsignedShort(1643612466) * 189801909;
         if('\uffff' == this.font * -335454051) {
            this.font = -189801909;
         }

         this.shaded = buffer.readSignedByte(1708176767) == 1;
         this.disabledColor = buffer.readInt(-472656632) * 1053943595;
         this.invSpritePadX = buffer.readShort(1578439669) * 1585606775;
         this.invSpritePadY = buffer.readShort(-1293444845) * -393969859;
         someHashModifier = buffer.readSignedByte(1708176767);
         if(someHashModifier == 1) {
            this.click_mask = (-1817319735 * this.click_mask | 1073741824) * 583340921;
         }

         this.oiActions = new String[5];

         for(someHash1Modifier = 0; someHash1Modifier < 5; ++someHash1Modifier) {
            String var12 = buffer.readString(61376769);
            if(var12.length() > 0) {
               this.oiActions[someHash1Modifier] = var12;
               this.click_mask = (-1817319735 * this.click_mask | 1 << someHash1Modifier + 23) * 583340921;
            }
         }
      }

      if(-1305917269 * this.type == 8) {
         this.disabledText = buffer.readString(61376769);
      }

      if(this.actionType * -1300193677 == 2 || 2 == this.type * -1305917269) {
         this.selectedActionName = buffer.readString(61376769);
         this.aString1918 = buffer.readString(61376769);
         someHashModifier = buffer.readUnsignedShort(1515650882) & 63;
         this.click_mask = 583340921 * (-1817319735 * this.click_mask | someHashModifier << 11);
      }

      if(1 == this.actionType * -1300193677 || -1300193677 * this.actionType == 4 || -1300193677 * this.actionType == 5 || -1300193677 * this.actionType == 6) {
         this.toolTip = buffer.readString(61376769);
         if(this.toolTip.length() == 0) {
            if(1 == this.actionType * -1300193677) {
               this.toolTip = Class91.ok;
            }

            if(this.actionType * -1300193677 == 4) {
               this.toolTip = Class91.select;
            }

            if(this.actionType * -1300193677 == 5) {
               this.toolTip = Class91.select;
            }

            if(this.actionType * -1300193677 == 6) {
               this.toolTip = Class91.continueString;
            }
         }
      }

      if(this.actionType * -1300193677 == 1 || 4 == -1300193677 * this.actionType || this.actionType * -1300193677 == 5) {
         this.click_mask = 583340921 * (this.click_mask * -1817319735 | 4194304);
      }

      if(this.actionType * -1300193677 == 6) {
         this.click_mask = 583340921 * (-1817319735 * this.click_mask | 1);
      }

   }

   public void method2297(int var1, int var2, int var3) {
      int var4 = this.inv[var2];
      this.inv[var2] = this.inv[var1];
      this.inv[var1] = var4;
      var4 = this.invStackSize[var2];
      this.invStackSize[var2] = this.invStackSize[var1];
      this.invStackSize[var1] = var4;
   }

   public RSInterface() {
      this.toolTip = Class91.ok;
      this.anInt2043 = 444483265;
      this.anInt2044 = 0;
      this.anInt2045 = 0;
      this.anInt1919 = 0;
      this.aBool1994 = false;
      this.aBool1963 = false;
      this.anInt2050 = 1933665077;
      this.anInt2051 = 0;
      this.anInt2055 = 0;
      this.anInt2053 = 0;
      this.redrawId = 2140330043;
      this.lastDrawCycle = -948384899;
      this.aBool2056 = false;
      this.aBool2009 = false;
   }

}
