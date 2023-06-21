import java.util.Scanner;

public class Enemy {
  // private String enemyName;
  private static int myArm;
  
  public static void setMyArm(int value) {
    myArm = value;
  }
  
  public static int getMyArm() {
    return myArm;
  }

  public static void Match(int level, int totalArms){
    for(level=1; level <= 10; level++){
      Scanner scanner = new Scanner(System.in);
      int min = 1;
      int max = 20;
      int randomEnemyStatus = (int) Math.floor(Math.random() * (max - min + 1) + min);

      int enemyArm1 = myArm + randomEnemyStatus;
      int enemyArm2 = myArm + randomEnemyStatus;
      int enemyArm3 = myArm - randomEnemyStatus;  //この敵にだけ勝てる
      System.out.print("敵A:" + enemyArm1 + " " );
      System.out.print("敵B:" + enemyArm2 + " " );
      System.out.println("敵C:" + enemyArm3);

      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();

      // ==演算子は参照先の比較時に使う 文字列の比較にはequals("OO")を使う！

      if (enemyName.equals("A") || enemyName.equals("B") || enemyName.equals("C")) {
        // totalArms += randomEnemyStatus;
        if (totalArms > randomEnemyStatus) {
          System.out.println(enemyName + "を倒した！");
          System.out.println("Level" + level + "になった");
          System.out.println(enemyName + "の武器値" +  "を自分の武器に加算した！");
          totalArms = myArm + randomEnemyStatus;
          System.out.println("今の自分の武器数値：" + totalArms);
          System.out.println("-------------------------");
        } else {
          System.out.println("負け");
          break;
        }
      } else {
        System.out.println("敵A・敵B・Cの中から選び直してください");
        System.out.println("-------------------------");
        level -=1;  //forで加算された1を打ち消してcontinue;でやり直し
        continue;
      }



    }
  }

  // public static int myTotalArms1() {
  //   return totalArms + randomEnemyStatus1;  //自分の武器値に倒した敵の武器値を加算
  // }
}