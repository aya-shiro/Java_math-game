import java.util.Scanner;

public class Enemy {
  private String enemyName;
  private int arms;

  public static void firstMatch(int level){
    for(level=1; level <= 10; level++){
      Scanner scanner = new Scanner(System.in);
      System.out.print("どの敵を倒す？：");
      int randomNumber = (int)(Math.random()*100);
      // System.println(totalArms + randomNumber );
      // System.println(totalArms + randomNumber );
      // System.println(totalArms + randomNumber );
      String enemyName = scanner.next();
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