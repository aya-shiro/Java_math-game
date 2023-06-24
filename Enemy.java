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

      int randomEnemyStatus = (int) (Math.random() * 10);

      int[] enemyArms = {totalArms + randomEnemyStatus, totalArms + randomEnemyStatus, totalArms - randomEnemyStatus};
      System.out.print("敵A:" + enemyArms[0] + " " );
      System.out.print("敵B:" + enemyArms[1] + " " );
      System.out.println("敵C:" + enemyArms[2]);

      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();

      // ==演算子は参照先の比較時に使う 文字列の比較にはequals("OO")を使う！
      if (enemyName.equals("A") || enemyName.equals("B") || enemyName.equals("C")) {
        selectedEnemy(totalArms, randomEnemyStatus, enemyName, level, myArm, enemyArms);
      } else {
        System.out.println("敵A・敵B・Cの中から選び直してください");
        System.out.println("-------------------------");
        level -=1;  //forで加算された1を打ち消してcontinue;でやり直し
        continue;
      }
    }
  }

  //敵A敵B敵Cのどれかを選んだ先の勝ち負け判定
  public static void selectedEnemy(int totalArms, int randomEnemyStatus, String enemyName, int level, int myArm, int[] enemyArms) {
    System.out.println("今の自分の武器数値：" + totalArms);
    boolean defeated = false; // 勝利フラグの初期化

    for (int i = 0; i < enemyArms.length; i++) {
      if (totalArms > enemyArms[i]) {
        
        // randomEnemyStatus = (int) (Math.random() * 10);
  
        int enemyArm = enemyArms[i];
        System.out.print("敵A:" + enemyArms[0] + " " );
        System.out.print("敵B:" + enemyArms[1] + " " );
        System.out.println("敵C:" + enemyArms[2]);
        
        System.out.println(enemyName + "を倒した！");
        System.out.println("Level" + level + "になった");
        System.out.println(enemyName + "の武器値を自分の武器に加算した！");
        totalArms += enemyArms[i];
        System.out.println("今の自分の武器数値：" + totalArms);
        System.out.println("-------------------------");
        defeated = true; // 勝利した場合、勝利フラグをtrueに設定
      }
    }

    if (!defeated) {
      System.out.println("負け");
    }
  }

}
