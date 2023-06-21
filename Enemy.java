import java.util.Scanner;

public class Enemy {
  // private String enemyName;
  // private int arms;

  public static void Match(int level, int totalArms){
    for(level=1; level <= 10; level++){
      Scanner scanner = new Scanner(System.in);
      int min = 1;
      int max = 20;
      int randomEnemyStatus = (int) Math.floor(Math.random() + (max - min + 1) + min);


      System.out.print("敵A:" + (totalArms + randomEnemyStatus) + " " );
      System.out.print("敵B:" + (totalArms + randomEnemyStatus) + " " );
      System.out.println("敵C:" + (totalArms - randomEnemyStatus));

      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();

      // if (enemyName == "A") {  ==演算子は参照先の比較時に使う
      if (enemyName.equals("A") || enemyName.equals("B") || enemyName.equals("C")) {
       //文字列の比較にはequals("OO")を使う！
        // totalArms += randomEnemyStatus;
      } else {
        System.out.println("敵A・敵B・Cの中から選び直してください");
        System.out.println("-------------------------");
        level -=1;  //forで加算された1を打ち消してcontinue;でやり直し
        continue;
      }

      if (totalArms > randomEnemyStatus) {
        System.out.println(enemyName + "を倒した！");
        System.out.println("Level" + level + "になった");
        System.out.println(enemyName + "の武器値" +  "を自分の武器に加算した！");
        totalArms += randomEnemyStatus;

        System.out.println("-------------------------");
      } else {
        System.out.println("負け");
        break;
      }

    }
  }

  // public static int myTotalArms1() {
  //   return totalArms + randomEnemyStatus1;  //自分の武器値に倒した敵の武器値を加算
  // }
}