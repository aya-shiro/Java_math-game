import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Me me = new Me("YOU", 0, 1);
    if (me.level == 0) {
      System.out.print("Start!");
      System.out.println("Level 1");
    } else {
      System.out.println("Level" + this.level);
    }
    
    // TodoList todo = null;

    System.out.print("どの敵を倒す？：");
    String enemyName = scanner.next();
    System.out.print(Enmy.arms + "の武器を落とした！");
    int limit = scanner.nextInt();
  }
}