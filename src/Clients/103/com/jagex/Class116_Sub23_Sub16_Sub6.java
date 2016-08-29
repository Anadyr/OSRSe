package com.jagex;
import java.awt.Component;

public class Class116_Sub23_Sub16_Sub6 extends Animable {

   int anInt2770;
   int anInt2771;
   int anInt2772;
   int anInt2773;
   int anInt2774;
   Class116_Sub23_Sub4 aClass116_Sub23_Sub4_2775;
   int anInt2776;
   int anInt2777;
   public static String aString2779;
   int anInt2780;


   Class116_Sub23_Sub16_Sub6(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Animable var9) {
      this.anInt2776 = var1 * -1338124091;
      this.anInt2780 = -2023943149 * var2;
      this.anInt2770 = 2041023979 * var3;
      this.anInt2772 = 254224793 * var4;
      this.anInt2773 = -1322341781 * var5;
      this.anInt2774 = var6 * -1552283421;
      if(var7 != -1) {
         this.aClass116_Sub23_Sub4_2775 = Class116_Sub8.method1946(var7, -1502270040);
         this.anInt2771 = 0;
         this.anInt2777 = client.anInt2943 * -1207738427 - 932026345;
         if(0 == this.aClass116_Sub23_Sub4_2775.anInt2260 * 972933669 && var9 != null && var9 instanceof Class116_Sub23_Sub16_Sub6) {
            Class116_Sub23_Sub16_Sub6 var10 = (Class116_Sub23_Sub16_Sub6)var9;
            if(this.aClass116_Sub23_Sub4_2775 == var10.aClass116_Sub23_Sub4_2775) {
               this.anInt2771 = var10.anInt2771 * 1;
               this.anInt2777 = 1 * var10.anInt2777;
               return;
            }
         }

         if(var8 && this.aClass116_Sub23_Sub4_2775.anInt2251 * 174111251 != -1) {
            this.anInt2771 = (int)(Math.random() * (double)this.aClass116_Sub23_Sub4_2775.anIntArray2247.length) * 218220251;
            this.anInt2777 -= (int)(Math.random() * (double)this.aClass116_Sub23_Sub4_2775.anIntArray2255[-49101485 * this.anInt2771]) * 932026345;
         }
      }

   }

   protected final SpotAnim getRotatedModel(byte var1) {
      if(null != this.aClass116_Sub23_Sub4_2775) {
         int var4 = client.anInt2943 * -1040073859 - this.anInt2777 * 2095493209;
         if(var4 > 100 && 174111251 * this.aClass116_Sub23_Sub4_2775.anInt2251 > 0) {
            var4 = 100;
         }

         while(var4 > this.aClass116_Sub23_Sub4_2775.anIntArray2255[this.anInt2771 * -49101485]) {
            var4 -= this.aClass116_Sub23_Sub4_2775.anIntArray2255[this.anInt2771 * -49101485];
            this.anInt2771 += 218220251;
            if(-49101485 * this.anInt2771 >= this.aClass116_Sub23_Sub4_2775.anIntArray2247.length) {
               this.anInt2771 -= this.aClass116_Sub23_Sub4_2775.anInt2251 * 1639768129;
               if(-49101485 * this.anInt2771 < 0 || -49101485 * this.anInt2771 >= this.aClass116_Sub23_Sub4_2775.anIntArray2247.length) {
                  this.aClass116_Sub23_Sub4_2775 = null;
                  break;
               }
            }
         }

         this.anInt2777 = 932026345 * (-1040073859 * client.anInt2943 - var4);
      }

      ObjectDefinition var13 = Class45.method700(-1889540595 * this.anInt2776, 359750046);
      if(null != var13.anIntArray2206) {
         var13 = var13.method2419(-1617474286);
      }

      if(null == var13) {
         return null;
      } else {
         int var2;
         int var5;
         if(this.anInt2770 * 775238339 != 1 && 3 != 775238339 * this.anInt2770) {
            var2 = var13.sizeX * 1162660975;
            var5 = -1976023901 * var13.sizeY;
         } else {
            var2 = -1976023901 * var13.sizeY;
            var5 = 1162660975 * var13.sizeX;
         }

         int var3 = this.anInt2773 * 1134670403 + (var2 >> 1);
         int var11 = 1134670403 * this.anInt2773 + (1 + var2 >> 1);
         int var12 = (var5 >> 1) + this.anInt2774 * 317684939;
         int var6 = this.anInt2774 * 317684939 + (1 + var5 >> 1);
         int[][] var7 = Class47.anIntArrayArrayArray635[936123049 * this.anInt2772];
         int var9 = var7[var11][var12] + var7[var3][var12] + var7[var3][var6] + var7[var11][var6] >> 2;
         int var8 = (1134670403 * this.anInt2773 << 7) + (var2 << 6);
         int var10 = (var5 << 6) + (this.anInt2774 * 317684939 << 7);
         return var13.method2399(-757213669 * this.anInt2780, 775238339 * this.anInt2770, var7, var8, var9, var10, this.aClass116_Sub23_Sub4_2775, this.anInt2771 * -49101485, -1988779715);
      }
   }

   static void method3366(Component var0, Class99 var1, Class99 var2, boolean var3, int var4, int var5) {
      if(Class6.aBool94) {
         if(4 == var4) {
            Class6.anInt64 = -868668484;
         }

      } else {
         Class6.anInt64 = var4 * -217167121;
         DrawingArea.method2941();
         byte[] var7 = var1.method1374("title.jpg", "", -1557464885);
         Class67.aClass116_Sub23_Sub19_Sub2_826 = new Sprite(var7, var0);
         Class6.aClass116_Sub23_Sub19_Sub2_89 = Class67.aClass116_Sub23_Sub19_Sub2_826.method3253();
         if((client.anInt2933 * 1115656689 & 536870912) != 0) {
            Class24.aClass116_Sub23_Sub19_Sub3_343 = Class116_Sub23_Sub4.method2447(var2, "logo_deadman_mode", "", -2033819440);
         } else {
            Class24.aClass116_Sub23_Sub19_Sub3_343 = Class116_Sub23_Sub4.method2447(var2, "logo", "", 906647594);
         }

         Class6.aClass116_Sub23_Sub19_Sub3_99 = Class116_Sub23_Sub4.method2447(var2, "titlebox", "", 1311964203);
         Class6.aClass116_Sub23_Sub19_Sub3_65 = Class116_Sub23_Sub4.method2447(var2, "titlebutton", "", 906521462);
         Class6.aClass116_Sub23_Sub19_Sub3Array66 = ObjectDefinition.method2433(var2, "runes", "", (short) -11238);
         Class50.aClass116_Sub23_Sub19_Sub3Array678 = ObjectDefinition.method2433(var2, "title_mute", "", (short) -14797);
         Class6.aClass116_Sub23_Sub19_Sub3_68 = Class116_Sub23_Sub4.method2447(var2, "options_radio_buttons,0", "", 1340761243);
         Class6.aClass116_Sub23_Sub19_Sub3_69 = Class116_Sub23_Sub4.method2447(var2, "options_radio_buttons,2", "", -986295101);
         Class22.anIntArray280 = new int[256];

         int var6;
         for(var6 = 0; var6 < 64; ++var6) {
            Class22.anIntArray280[var6] = var6 * 262144;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class22.anIntArray280[64 + var6] = 16711680 + 1024 * var6;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class22.anIntArray280[128 + var6] = 4 * var6 + 16776960;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class22.anIntArray280[192 + var6] = 16777215;
         }

         client.anIntArray1615 = new int[256];

         for(var6 = 0; var6 < 64; ++var6) {
            client.anIntArray1615[var6] = var6 * 1024;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            client.anIntArray1615[64 + var6] = 4 * var6 + '\uff00';
         }

         for(var6 = 0; var6 < 64; ++var6) {
            client.anIntArray1615[var6 + 128] = '\uffff' + var6 * 262144;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            client.anIntArray1615[192 + var6] = 16777215;
         }

         Class6.anIntArray75 = new int[256];

         for(var6 = 0; var6 < 64; ++var6) {
            Class6.anIntArray75[var6] = var6 * 4;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class6.anIntArray75[var6 + 64] = 262144 * var6 + 255;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class6.anIntArray75[var6 + 128] = var6 * 1024 + 16711935;
         }

         for(var6 = 0; var6 < 64; ++var6) {
            Class6.anIntArray75[192 + var6] = 16777215;
         }

         Class6.anIntArray74 = new int[256];
         Class39.anIntArray521 = new int['\u8000'];
         Speach.anIntArray972 = new int['\u8000'];
         Class116_Sub23_Sub14.method2685((Class116_Sub23_Sub19_Sub3)null, -280638680);
         Class141.anIntArray1633 = new int['\u8000'];
         Class4.anIntArray52 = new int['\u8000'];
         if(var3) {
            Class6.username = "";
            Class6.password = "";
         }

         Class132.anInt1597 = 0;
         Class45.aString599 = "";
         Class6.aBool91 = true;
         Class6.aBool95 = false;
         if(!Class116_Sub5.aClass29_1727.aBool409) {
            Class103.method1453(2, Class2.aClass99_Sub1_23, "scape main", "", 255, false, (byte)-89);
         } else {
            Class76.method1082(2, (byte)55);
         }

         Class116_Sub6.method1935(false, 2021294259);
         Class6.aBool94 = true;
         Class6.anInt84 = 1079825139 * ((-452716157 * Class42.clientWidth - 1468194207 * client.anInt3213) / 2);
         Class6.anInt76 = 1843765198 + Class6.anInt84 * 132725497;
         Class67.aClass116_Sub23_Sub19_Sub2_826.method3286(1933284923 * Class6.anInt84, 0);
         Class6.aClass116_Sub23_Sub19_Sub2_89.method3286(Class6.anInt84 * 1933284923 + 382, 0);
         Class24.aClass116_Sub23_Sub19_Sub3_343.method3359(Class6.anInt84 * 1933284923 + 382 - Class24.aClass116_Sub23_Sub19_Sub3_343.anInt2763 / 2, 18);
      }
   }

   public static Sprite[] method3367(Class99 var0, String var1, String var2, int var3) {
      int var4 = var0.method1366(var1, 1819432134);
      int var5 = var0.method1367(var4, var2, 1940534285);
      return RSImageProducer.method1850(var0, var4, var5, 428617569);
   }
}
