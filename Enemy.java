import java.util.Scanner;

public class Enemy {
  private String enemyName;
  private int arms;

  public static void firstMatch(int level, int totalArms){
    for(level=1; level <= 10; level++){
      Scanner scanner = new Scanner(System.in);
      int randomEnemyStatus1 = (int)(Math.random()+100);
      int randomEnemyStatus2 = (int)(Math.random()+100);
      int randomEnemyStatus3 = (int)(Math.random() * (totalArms + 1));  //totalArms以下でランダム数値生成

      System.out.print("敵A:" + totalArms + randomEnemyStatus1 + " " );
      System.out.print("敵B:" + totalArms + randomEnemyStatus2 + " " );
      System.out.println("敵C:" + randomEnemyStatus3 );

      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();
      // if (enemyName == "A") {  ==演算子は参照先の比較時に使う
      if (enemyName.equals("A")) {    //文字列の比較にはequals("OO")を使う！
        totalArms += randomEnemyStatus1;
      } else if (enemyName.equals("B")) {
        totalArms += randomEnemyStatus2;
      } else if (enemyName.equals("C")) {
        totalArms += randomEnemyStatus3;
      } else {
        System.out.println("敵A・敵B・Cの中から選び直してください");
        level -=1;  //forで加算された1を打ち消してcontinue;でやり直し
        continue;
      }

      System.out.println(enemyName + "を倒した！");
      System.out.println("UP to Level " + level);
      System.out.println(enemyName + "の武器値" +  "を自分の武器に加算した！");

    }
  }

  // public static int enemyMatch(){
  //   super.firstMatch();
  //   System.out.println("Level" + level);
  // }
}