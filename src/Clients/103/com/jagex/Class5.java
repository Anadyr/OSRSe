package com.jagex;

public class Class5 {

   int anInt54;
   public static int anInt57;
   ChatMessage[] aChatMessageArray58 = new ChatMessage[100];


   static final void method50(int var0, int var1, int var2, int var3, int var4) {
      if(1 == client.anInt3046 * 2051359659) {
         Class100.cross[client.anInt3045 * 179229491 / 100].drawSprite(1991936279 * client.anInt3043 - 8, -1888662593 * client.anInt3044 - 8);
      }

      if(2 == client.anInt3046 * 2051359659) {
         Class100.cross[client.anInt3045 * 179229491 / 100 + 4].drawSprite(1991936279 * client.anInt3043 - 8, client.anInt3044 * -1888662593 - 8);
      }

      GameType.method1178(-2145792829);
   }

   ChatMessage method51(int var1, String var2, String var3, String var4, byte var5) {
      ChatMessage var6 = this.aChatMessageArray58[99];

      for(int var7 = this.anInt54 * -1062185627; var7 > 0; --var7) {
         if(var7 != 100) {
            this.aChatMessageArray58[var7] = this.aChatMessageArray58[var7 - 1];
         }
      }

      if(null == var6) {
         var6 = new ChatMessage(var1, var2, var4, var3);
      } else {
         var6.unlink();
         var6.unlinkContainer();
         var6.method2578(var1, var2, var4, var3, 860540801);
      }

      this.aChatMessageArray58[0] = var6;
      if(this.anInt54 * -1062185627 < 100) {
         this.anInt54 += 2082788461;
      }

      return var6;
   }

   int method52(int var1) {
      return this.anInt54 * -1062185627;
   }

   ChatMessage method57(int var1, int var2) {
      return var1 >= 0 && var1 < -1062185627 * this.anInt54?this.aChatMessageArray58[var1]:null;
   }
}
