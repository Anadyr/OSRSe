package com.jagex;

public final class Class31 {

   int anInt421;
   int anInt422;
   int anInt423;
   public Animable anAnimable1;
   public Animable anAnimable2;
   int anInt426;
   int anInt427;
   static int anInt428;
   static String[] aStringArray429;
   public int anInt430 = 0;
   int anInt431;
   int anInt432 = 0;
   int anInt433;
   public static final int anInt434 = 110;
   static final int anInt435 = 36;


   static final void method589(byte[] var0, int var1, int var2, GroundController var3, Class58[] var4, int var5) {
      Buffer var6 = new Buffer(var0);
      int var10 = -1;

      while(true) {
         int var8 = var6.readSmartC(1609876733);
         if(0 == var8) {
            return;
         }

         var10 += var8;
         int var11 = 0;

         while(true) {
            int var13 = var6.readSmartC(-25106946);
            if(0 == var13) {
               break;
            }

            var11 += var13 - 1;
            int var16 = var11 & 63;
            int var18 = var11 >> 6 & 63;
            int var19 = var11 >> 12;
            int var14 = var6.readSignedByte(1708176767);
            int var15 = var14 >> 2;
            int var17 = var14 & 3;
            int var9 = var18 + var1;
            int var12 = var2 + var16;
            if(var9 > 0 && var12 > 0 && var9 < 103 && var12 < 103) {
               int var20 = var19;
               if((Class47.aByteArrayArrayArray634[1][var9][var12] & 2) == 2) {
                  var20 = var19 - 1;
               }

               Class58 var7 = null;
               if(var20 >= 0) {
                  var7 = var4[var20];
               }

               Class116_Sub6.method1933(var19, var9, var12, var10, var17, var15, var3, var7, (byte)-97);
            }
         }
      }
   }

   static void method590(Applet_Sub1 var0, int var1) {
      if(823601801 * Class85.anInt997 == 1 || !PlayerAlias.aBool1756 && 823601801 * Class85.anInt997 == 4) {
         int var3 = 280 + 1933284923 * Class6.anInt84;
         if(-2040065729 * Class85.anInt998 >= var3 && -2040065729 * Class85.anInt998 <= var3 + 14 && Class85.anInt999 * 2090526775 >= 4 && 2090526775 * Class85.anInt999 <= 18) {
            Flo.method2524(0, 0, 2122547715);
            return;
         }

         if(-2040065729 * Class85.anInt998 >= var3 + 15 && Class85.anInt998 * -2040065729 <= 80 + var3 && Class85.anInt999 * 2090526775 >= 4 && 2090526775 * Class85.anInt999 <= 18) {
            Flo.method2524(0, 1, 1788514000);
            return;
         }

         int var4 = Class6.anInt84 * 1933284923 + 390;
         if(-2040065729 * Class85.anInt998 >= var4 && -2040065729 * Class85.anInt998 <= var4 + 14 && 2090526775 * Class85.anInt999 >= 4 && Class85.anInt999 * 2090526775 <= 18) {
            Flo.method2524(1, 0, 2139732127);
            return;
         }

         if(Class85.anInt998 * -2040065729 >= 15 + var4 && Class85.anInt998 * -2040065729 <= var4 + 80 && 2090526775 * Class85.anInt999 >= 4 && Class85.anInt999 * 2090526775 <= 18) {
            Flo.method2524(1, 1, 1948949456);
            return;
         }

         int var2 = 1933284923 * Class6.anInt84 + 500;
         if(Class85.anInt998 * -2040065729 >= var2 && Class85.anInt998 * -2040065729 <= 14 + var2 && 2090526775 * Class85.anInt999 >= 4 && Class85.anInt999 * 2090526775 <= 18) {
            Flo.method2524(2, 0, 1652793176);
            return;
         }

         if(Class85.anInt998 * -2040065729 >= 15 + var2 && -2040065729 * Class85.anInt998 <= 80 + var2 && 2090526775 * Class85.anInt999 >= 4 && Class85.anInt999 * 2090526775 <= 18) {
            Flo.method2524(2, 1, 1806806036);
            return;
         }

         int var5 = Class6.anInt84 * 1933284923 + 610;
         if(Class85.anInt998 * -2040065729 >= var5 && Class85.anInt998 * -2040065729 <= var5 + 14 && Class85.anInt999 * 2090526775 >= 4 && 2090526775 * Class85.anInt999 <= 18) {
            Flo.method2524(3, 0, 2035334332);
            return;
         }

         if(Class85.anInt998 * -2040065729 >= 15 + var5 && -2040065729 * Class85.anInt998 <= 80 + var5 && Class85.anInt999 * 2090526775 >= 4 && Class85.anInt999 * 2090526775 <= 18) {
            Flo.method2524(3, 1, 1951285432);
            return;
         }

         if(Class85.anInt998 * -2040065729 >= Class6.anInt84 * 1933284923 + 708 && Class85.anInt999 * 2090526775 >= 4 && Class85.anInt998 * -2040065729 <= 708 + 1933284923 * Class6.anInt84 + 50 && 2090526775 * Class85.anInt999 <= 20) {
            Class6.aBool95 = false;
            Class67.aClass116_Sub23_Sub19_Sub2_826.method3286(Class6.anInt84 * 1933284923, 0);
            Class6.aClass116_Sub23_Sub19_Sub2_89.method3286(Class6.anInt84 * 1933284923 + 382, 0);
            Class24.aClass116_Sub23_Sub19_Sub3_343.method3359(382 + 1933284923 * Class6.anInt84 - Class24.aClass116_Sub23_Sub19_Sub3_343.anInt2763 / 2, 18);
            return;
         }

         if(Class6.anInt96 * 154582397 != -1) {
            Class27 var6 = Class27.aClass27Array374[154582397 * Class6.anInt96];
            Class100.method1427(var6, 2067568192);
            Class6.aBool95 = false;
            Class67.aClass116_Sub23_Sub19_Sub2_826.method3286(1933284923 * Class6.anInt84, 0);
            Class6.aClass116_Sub23_Sub19_Sub2_89.method3286(382 + Class6.anInt84 * 1933284923, 0);
            Class24.aClass116_Sub23_Sub19_Sub3_343.method3359(1933284923 * Class6.anInt84 + 382 - Class24.aClass116_Sub23_Sub19_Sub3_343.anInt2763 / 2, 18);
            return;
         }
      }

   }

   static void method591(int var0) {
      int var1;
      if(client.anInt2962 * -773857325 == 0) {
         Class116_Sub11.groundItemController = new GroundController(4, 104, 104, Class47.anIntArrayArrayArray635);

         for(var1 = 0; var1 < 4; ++var1) {
            client.aClass58Array2996[var1] = new Class58(104, 104);
         }

         Class116_Sub23_Sub18.aClass116_Sub23_Sub19_Sub2_2487 = new Sprite(512, 512);
         Class6.aString83 = Class91.aString1059;
         Class6.anInt72 = 1559498423;
         client.anInt2962 = -472889572;
      } else {
         int var2;
         int var3;
         int var4;
         int var5;
         if(20 == client.anInt2962 * -773857325) {
            int[] var23 = new int[9];

            for(var2 = 0; var2 < 9; ++var2) {
               var3 = 128 + 32 * var2 + 15;
               var5 = var3 * 3 + 600;
               var4 = Texture.anIntArray2708[var3];
               var23[var2] = var5 * var4 >> 16;
            }

            GroundController.method428(var23, 500, 800, 512, 334);
            Class6.aString83 = Class91.aString1060;
            Class6.anInt72 = -1175970450;
            client.anInt2962 = 1438149290;
         } else if(30 == client.anInt2962 * -773857325) {
            Class42.aClass99_Sub1_574 = MobDefinition.method2575(0, false, true, true, -746620362);
            client.aClass99_Sub1_2955 = MobDefinition.method2575(1, false, true, true, 1443598473);
            client.aClass99_Sub1_3054 = MobDefinition.method2575(2, true, false, true, 400896250);
            Class116_Sub23_Sub18.aClass99_Sub1_2484 = MobDefinition.method2575(3, false, true, true, -1444765595);
            Class116_Sub23_Sub13.aClass99_Sub1_2424 = MobDefinition.method2575(4, false, true, true, -2022133925);
            Class59_Sub1.aClass99_Sub1_1828 = MobDefinition.method2575(5, true, true, true, -439475973);
            Class2.aClass99_Sub1_23 = MobDefinition.method2575(6, true, true, false, -559543765);
            Class3.aClass99_Sub1_42 = MobDefinition.method2575(7, false, true, true, -1784107868);
            Class116_Sub5.aClass99_Sub1_1729 = MobDefinition.method2575(8, false, true, true, -2067527026);
            Class1.aClass99_Sub1_6 = MobDefinition.method2575(9, false, true, true, -1073983432);
            Class49.aClass99_Sub1_663 = MobDefinition.method2575(10, false, true, true, -1309115753);
            Class108.aClass99_Sub1_1471 = MobDefinition.method2575(11, false, true, true, 1369674277);
            Class116_Sub23_Sub6.aClass99_Sub1_2279 = MobDefinition.method2575(12, false, true, true, -997545266);
            Class2.aClass99_Sub1_12 = MobDefinition.method2575(13, true, false, true, -1411786122);
            Class32.aClass99_Sub1_446 = MobDefinition.method2575(14, false, true, false, 1873723592);
            Class70.aClass99_Sub1_847 = MobDefinition.method2575(15, false, true, true, 2091928552);
            Class6.aString83 = Class91.aString1061;
            Class6.anInt72 = 1943026396;
            client.anInt2962 = -945779144;
         } else if(40 == client.anInt2962 * -773857325) {
            byte var22 = 0;
            var1 = var22 + Class42.aClass99_Sub1_574.method2220(429899160) * 4 / 100;
            var1 += client.aClass99_Sub1_2955.method2220(-1114765084) * 4 / 100;
            var1 += client.aClass99_Sub1_3054.method2220(1406028301) * 2 / 100;
            var1 += Class116_Sub23_Sub18.aClass99_Sub1_2484.method2220(-1533201440) * 2 / 100;
            var1 += Class116_Sub23_Sub13.aClass99_Sub1_2424.method2220(-384634522) * 6 / 100;
            var1 += Class59_Sub1.aClass99_Sub1_1828.method2220(-1732494774) * 4 / 100;
            var1 += Class2.aClass99_Sub1_23.method2220(-648034636) * 2 / 100;
            var1 += Class3.aClass99_Sub1_42.method2220(-1976471111) * 60 / 100;
            var1 += Class116_Sub5.aClass99_Sub1_1729.method2220(-548159868) * 2 / 100;
            var1 += Class1.aClass99_Sub1_6.method2220(-790961843) * 2 / 100;
            var1 += Class49.aClass99_Sub1_663.method2220(-661315006) * 2 / 100;
            var1 += Class108.aClass99_Sub1_1471.method2220(-3625591) * 2 / 100;
            var1 += Class116_Sub23_Sub6.aClass99_Sub1_2279.method2220(1180559480) * 2 / 100;
            var1 += Class2.aClass99_Sub1_12.method2220(2017489176) * 2 / 100;
            var1 += Class32.aClass99_Sub1_446.method2220(1230193191) * 2 / 100;
            var1 += Class70.aClass99_Sub1_847.method2220(1588286116) * 2 / 100;
            if(100 != var1) {
               if(0 != var1) {
                  Class6.aString83 = Class91.aString1221 + var1 + "%";
               }

               Class6.anInt72 = 767055946;
            } else {
               Class6.aString83 = Class91.aString1063;
               Class6.anInt72 = 767055946;
               client.anInt2962 = -2137743361;
            }
         } else {
            Class99_Sub1 var12;
            if(45 == client.anInt2962 * -773857325) {
               boolean var21 = !client.aBool2937;
               Class9.anInt135 = -999529678;
               Class9.aBool144 = var21;
               Class9.anInt151 = -179620222;
               Class116_Sub4_Sub4 var11 = new Class116_Sub4_Sub4();
               var11.method3001(9, 128, (byte)-101);
               Class116_Sub23_Sub20.aClass9_2510 = Class116_Sub6.method1934(ISAAC.aClass74_705, Tile.aCanvas1875, 0, 22050, -405745530);
               Class116_Sub23_Sub20.aClass9_2510.method158(var11, -228775353);
               var12 = Class70.aClass99_Sub1_847;
               Class99_Sub1 var16 = Class32.aClass99_Sub1_446;
               Class99_Sub1 var14 = Class116_Sub23_Sub13.aClass99_Sub1_2424;
               Class101.aClass99_1411 = var12;
               Class128.aClass99_1578 = var16;
               Class128.aClass99_1573 = var14;
               Class128.aClass116_Sub4_Sub4_1576 = var11;
               Class35.aClass9_475 = Class116_Sub6.method1934(ISAAC.aClass74_705, Tile.aCanvas1875, 1, 2048, -405745530);
               Class50.aClass116_Sub4_Sub1_673 = new Class116_Sub4_Sub1();
               Class35.aClass9_475.method158(Class50.aClass116_Sub4_Sub1_673, 829816735);
               Class70.aClass17_844 = new Class17(22050, Class9.anInt135 * -954458055);
               Class6.aString83 = Class91.aString1064;
               Class6.anInt72 = -1968412927;
               client.anInt2962 = 965259718;
            } else if(50 == client.anInt2962 * -773857325) {
               var1 = 0;
               if(null == RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672) {
                  RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672 = Class29.method584(Class116_Sub5.aClass99_Sub1_1729, Class2.aClass99_Sub1_12, "p11_full", "", 1243148742);
               } else {
                  ++var1;
               }

               if(client.aClass116_Sub23_Sub19_Sub4_Sub1_2989 == null) {
                  client.aClass116_Sub23_Sub19_Sub4_Sub1_2989 = Class29.method584(Class116_Sub5.aClass99_Sub1_1729, Class2.aClass99_Sub1_12, "p12_full", "", 2095967898);
               } else {
                  ++var1;
               }

               if(null == Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537) {
                  Class41.aClass116_Sub23_Sub19_Sub4_Sub1_537 = Class29.method584(Class116_Sub5.aClass99_Sub1_1729, Class2.aClass99_Sub1_12, "b12_full", "", 159551647);
               } else {
                  ++var1;
               }

               if(var1 < 3) {
                  Class6.aString83 = Class91.aString1261 + 100 * var1 / 3 + "%";
                  Class6.anInt72 = -408914504;
               } else {
                  Class116_Sub23_Sub2.aClass116_Sub17_2186 = new Class116_Sub17(true);
                  Class6.aString83 = Class91.aString1066;
                  Class6.anInt72 = -408914504;
                  client.anInt2962 = -1418668716;
               }
            } else if(60 == -773857325 * client.anInt2962) {
               var1 = Class116_Sub12.method1981(Class49.aClass99_Sub1_663, Class116_Sub5.aClass99_Sub1_1729, 1379942096);
               var2 = Class61.method907((byte)-85);
               if(var1 < var2) {
                  Class6.aString83 = Class91.aString1171 + var1 * 100 / var2 + "%";
                  Class6.anInt72 = -1584884954;
               } else {
                  Class6.aString83 = Class91.aString1188;
                  Class6.anInt72 = -1584884954;
                  Class116_Sub12.method1983(5, (byte)74);
                  client.anInt2962 = 492370146;
               }
            } else if(client.anInt2962 * -773857325 == 70) {
               if(!client.aClass99_Sub1_3054.method1355((short)925)) {
                  Class6.aString83 = Class91.aString1069 + client.aClass99_Sub1_3054.method2225(798959234) + "%";
                  Class6.anInt72 = 1534111892;
               } else {
                  Class99_Sub1 var20 = client.aClass99_Sub1_3054;
                  Class116_Sub23_Sub12.aClass99_2416 = var20;
                  Class32.method599(client.aClass99_Sub1_3054, (byte)-12);
                  Class41.method692(client.aClass99_Sub1_3054, Class3.aClass99_Sub1_42, (byte)-35);
                  Friend.method1834(client.aClass99_Sub1_3054, Class3.aClass99_Sub1_42, client.aBool2937, 1365325724);
                  Class2.method37(client.aClass99_Sub1_3054, Class3.aClass99_Sub1_42, -1043496977);
                  Class99_Sub1 var10 = client.aClass99_Sub1_3054;
                  var12 = Class3.aClass99_Sub1_42;
                  boolean var15 = client.aBool2936;
                  Class116_Sub23_Sub19_Sub4_Sub1 var13 = RSImageProducer.aClass116_Sub23_Sub19_Sub4_Sub1_1672;
                  Class116_Sub23_Sub11.aClass99_2378 = var10;
                  Class60.aClass99_783 = var12;
                  Class107.aBool1456 = var15;
                  Class14.anInt216 = Class116_Sub23_Sub11.aClass99_2378.method1361(10, -824500445) * -1384530971;
                  Class38.aClass116_Sub23_Sub19_Sub4_Sub1_509 = var13;
                  Class116_Sub23_Sub7.method2513(client.aClass99_Sub1_3054, Class42.aClass99_Sub1_574, client.aClass99_Sub1_2955, -2003228924);
                  Class99_Sub1 var17 = client.aClass99_Sub1_3054;
                  Class99_Sub1 var9 = Class3.aClass99_Sub1_42;
                  Class116_Sub23_Sub1.aClass99_2174 = var17;
                  Class116_Sub23_Sub1.aClass99_2156 = var9;
                  Class99_Sub1 var8 = client.aClass99_Sub1_3054;
                  Class116_Sub23_Sub14.aClass99_2431 = var8;
                  Class116_Sub12.method1982(client.aClass99_Sub1_3054, 1780345997);
                  Class37.method657(Class116_Sub23_Sub18.aClass99_Sub1_2484, Class3.aClass99_Sub1_42, Class116_Sub5.aClass99_Sub1_1729, Class2.aClass99_Sub1_12, -314451305);
                  Class38.method678(client.aClass99_Sub1_3054, -1179984571);
                  Class116_Sub10.method1972(client.aClass99_Sub1_3054, (byte)-19);
                  Class37.method676(client.aClass99_Sub1_3054, -1584102277);
                  Class99_Sub1 var7 = client.aClass99_Sub1_3054;
                  Class116_Sub23_Sub7.aClass99_2290 = var7;
                  Class39.aClass33_518 = new Class33();
                  Class6.aString83 = Class91.aString1070;
                  Class6.anInt72 = 1534111892;
                  client.anInt2962 = -1891558288;
               }
            } else if(client.anInt2962 * -773857325 != 80) {
               if(client.anInt2962 * -773857325 == 90) {
                  if(!Class1.aClass99_Sub1_6.method1355((short)24468)) {
                     Class6.aString83 = Class91.aString1073 + Class1.aClass99_Sub1_6.method2225(1682618453) + "%";
                     Class6.anInt72 = -1993799458;
                  } else {
                     Class36 var19 = new Class36(Class1.aClass99_Sub1_6, Class116_Sub5.aClass99_Sub1_1729, 20, 0.8D, client.aBool2937?64:128);
                     Texture.method3235(var19);
                     Texture.method3195(0.8D);
                     Class6.aString83 = Class91.aString1180;
                     Class6.anInt72 = -1993799458;
                     client.anInt2962 = -453408998;
                  }
               } else if(-773857325 * client.anInt2962 == 110) {
                  Mob.aClass35_2879 = new Class35();
                  ISAAC.aClass74_705.method1063(Mob.aClass35_2879, 10, 1400454008);
                  Class6.aString83 = Class91.aString1075;
                  Class6.anInt72 = 1830779658;
                  client.anInt2962 = 1457629864;
               } else if(120 == client.anInt2962 * -773857325) {
                  if(!Class49.aClass99_Sub1_663.method1369("huffman", "", 1815004978)) {
                     Class6.aString83 = Class91.aString1239 + 0 + "%";
                     Class6.anInt72 = 1595585568;
                  } else {
                     Class52 var18 = new Class52(Class49.aClass99_Sub1_663.method1374("huffman", "", -1557464885));
                     Class116_Sub23_Sub18.method2885(var18, 1835579841);
                     Class6.aString83 = Class91.aString1077;
                     Class6.anInt72 = 1595585568;
                     client.anInt2962 = -926298570;
                  }
               } else if(130 == client.anInt2962 * -773857325) {
                  if(!Class116_Sub23_Sub18.aClass99_Sub1_2484.method1355((short)13805)) {
                     Class6.aString83 = Class91.aString1078 + Class116_Sub23_Sub18.aClass99_Sub1_2484.method2225(1659184733) * 4 / 5 + "%";
                     Class6.anInt72 = 1125197388;
                  } else if(!Class116_Sub23_Sub6.aClass99_Sub1_2279.method1355((short)8324)) {
                     Class6.aString83 = Class91.aString1078 + (80 + Class116_Sub23_Sub6.aClass99_Sub1_2279.method2225(1652264271) / 6) + "%";
                     Class6.anInt72 = 1125197388;
                  } else if(!Class2.aClass99_Sub1_12.method1355((short)4021)) {
                     Class6.aString83 = Class91.aString1078 + (96 + Class2.aClass99_Sub1_12.method2225(1387153597) / 20) + "%";
                     Class6.anInt72 = 1125197388;
                  } else {
                     Class6.aString83 = Class91.aString1079;
                     Class6.anInt72 = 1125197388;
                     client.anInt2962 = 984740292;
                  }
               } else if(client.anInt2962 * -773857325 == 140) {
                  Class116_Sub12.method1983(10, (byte)30);
               }
            } else {
               var1 = 0;
               if(Class59_Sub1.aClass116_Sub23_Sub19_Sub2_1829 == null) {
                  Class59_Sub1.aClass116_Sub23_Sub19_Sub2_1829 = Class63.method918(Class116_Sub5.aClass99_Sub1_1729, "compass", "", -1453620198);
               } else {
                  ++var1;
               }

               if(null == Mob.aClass116_Sub23_Sub19_Sub2_2875) {
                  Mob.aClass116_Sub23_Sub19_Sub2_2875 = Class63.method918(Class116_Sub5.aClass99_Sub1_1729, "mapedge", "", -851887359);
               } else {
                  ++var1;
               }

               if(Class2.aClass116_Sub23_Sub19_Sub3Array18 == null) {
                  Class2.aClass116_Sub23_Sub19_Sub3Array18 = ObjectDefinition.method2433(Class116_Sub5.aClass99_Sub1_1729, "mapscene", "", (short) -17110);
               } else {
                  ++var1;
               }

               if(Class116_Sub12.aClass116_Sub23_Sub19_Sub2Array1844 == null) {
                  Class116_Sub12.aClass116_Sub23_Sub19_Sub2Array1844 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "mapfunction", "", -463449516);
               } else {
                  ++var1;
               }

               if(Friend.aClass116_Sub23_Sub19_Sub2Array1660 == null) {
                  Friend.aClass116_Sub23_Sub19_Sub2Array1660 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "hitmarks", "", 197817649);
               } else {
                  ++var1;
               }

               if(Class116_Sub23_Sub14.aClass116_Sub23_Sub19_Sub2Array2433 == null) {
                  Class116_Sub23_Sub14.aClass116_Sub23_Sub19_Sub2Array2433 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "headicons_pk", "", -328029273);
               } else {
                  ++var1;
               }

               if(Class116_Sub23_Sub11.aClass116_Sub23_Sub19_Sub2Array2375 == null) {
                  Class116_Sub23_Sub11.aClass116_Sub23_Sub19_Sub2Array2375 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "headicons_prayer", "", -996579160);
               } else {
                  ++var1;
               }

               if(Class47.aClass116_Sub23_Sub19_Sub2Array646 == null) {
                  Class47.aClass116_Sub23_Sub19_Sub2Array646 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "headicons_hint", "", -374607021);
               } else {
                  ++var1;
               }

               if(null == Class83.aClass116_Sub23_Sub19_Sub2Array970) {
                  Class83.aClass116_Sub23_Sub19_Sub2Array970 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "mapmarker", "", 1855090201);
               } else {
                  ++var1;
               }

               if(null == Class100.aClass116_Sub23_Sub19_Sub2Array1402) {
                  Class100.aClass116_Sub23_Sub19_Sub2Array1402 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "cross", "", -1113050695);
               } else {
                  ++var1;
               }

               if(Class122.aClass116_Sub23_Sub19_Sub2Array1538 == null) {
                  Class122.aClass116_Sub23_Sub19_Sub2Array1538 = Class116_Sub23_Sub16_Sub6.method3367(Class116_Sub5.aClass99_Sub1_1729, "mapdots", "", 1247203881);
               } else {
                  ++var1;
               }

               if(null == Class41.aClass116_Sub23_Sub19_Sub3Array546) {
                  Class41.aClass116_Sub23_Sub19_Sub3Array546 = ObjectDefinition.method2433(Class116_Sub5.aClass99_Sub1_1729, "scrollbar", "", (short) 27332);
               } else {
                  ++var1;
               }

               if(Class24.aClass116_Sub23_Sub19_Sub3Array349 == null) {
                  Class24.aClass116_Sub23_Sub19_Sub3Array349 = ObjectDefinition.method2433(Class116_Sub5.aClass99_Sub1_1729, "mod_icons", "", (short) 4397);
               } else {
                  ++var1;
               }

               if(var1 < 13) {
                  Class6.aString83 = Class91.aString1047 + var1 * 100 / 13 + "%";
                  Class6.anInt72 = 358141442;
               } else {
                  TextDrawingArea.aClass116_Sub23_Sub19_Sub3Array2862 = Class24.aClass116_Sub23_Sub19_Sub3Array349;
                  Mob.aClass116_Sub23_Sub19_Sub2_2875.method3267();
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var5 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;

                  for(int var6 = 0; var6 < Class116_Sub12.aClass116_Sub23_Sub19_Sub2Array1844.length; ++var6) {
                     Class116_Sub12.aClass116_Sub23_Sub19_Sub2Array1844[var6].method3309(var2 + var4, var3 + var4, var4 + var5);
                  }

                  Class2.aClass116_Sub23_Sub19_Sub3Array18[0].method3353(var4 + var2, var4 + var3, var5 + var4);
                  Class6.aString83 = Class91.aString1072;
                  Class6.anInt72 = 358141442;
                  client.anInt2962 = 19480574;
               }
            }
         }
      }
   }

}
