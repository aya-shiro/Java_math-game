import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("名前：");
    String myName = scanner.next();
    System.out.print("最初に持つ武器の強さを入力してください：");
    int myArm = scanner.nextInt();
    Enemy.setMyArm(myArm);

    
    int level = 1;
    if (level == 1) {
      System.out.println("Start!");
      System.out.print(myName + " ");
      System.out.println("Level 1");
      Enemy.Match(level, myArm);
    } else {
      // System.out.println("Level" + level);
      // Enemy.enemyMatch();
    }
  }
}

