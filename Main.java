import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前：");
    String myName = scanner.next();
    // Me me = new Me(0, 1);
    System.out.print("最初に持つ武器の強さを入力してください：");
    int totalArms = scanner.nextInt();
    
    int level = 1;
    if (level == 1) {
      System.out.println("Start!");
      System.out.print(myName + " ");
      System.out.println("Level 1");
      Enemy.firstMatch();
    } else {
      // System.out.println("Level" + level);
      Enemy.enemyMatch();
    }
  }
}


class Enemy {
  private String enemyName;
  private int arms;

  public static firstMatch(int level){
    for(int level=1;level<=10;level++){
      Scanner scanner = new Scanner(System.in);
      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();
      System.out.println(enemyName + "を倒した！");
      System.out.println(enemyName + "の武器値" +  "を自分の武器に加算した！");
      return level++;
    }
  }
  
  pubric static enemyMatch(){
    super.firstMatch();
    System.out.println("Level" + level);
  }
}
