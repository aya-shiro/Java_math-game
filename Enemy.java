import java.util.Scanner;

public class Enemy {
  private String enemyName;
  private int arms;

  public static void firstMatch(int level, int totalArms){
    for(level=1; level <= 10; level++){
      Scanner scanner = new Scanner(System.in);
      int randomEnemyStatus1 = (int)(Math.random()*100);
      int randomEnemyStatus2 = (int)(Math.random()*100);
      int randomEnemyStatus3 = (int)(Math.random() * (totalArms + 1));  //totalArms以下でランダム数値生成

      System.out.print("敵A:" + totalArms + randomEnemyStatus1 + " " );
      System.out.print("敵B:" + totalArms + randomEnemyStatus2 + " " );
      System.out.println("敵C:" + randomEnemyStatus3 );
      
      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();
      if (enemyName == "A") {
        totalArms += randomEnemyStatus1;
      } else if (enemyName == "B") {
        totalArms += randomEnemyStatus2;
      } else if (enemyName == "C") {
        totalArms += randomEnemyStatus3;
      } else {
        // ABC以外を選んだ場合にやり直させる処理
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