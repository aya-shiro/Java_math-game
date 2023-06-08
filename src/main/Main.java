import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(this.level + "Level");
    TodoList todo = null;

    System.out.print("どの敵を倒す？：");
    String title = scanner.next();
    System.out.print(title + "の期限：");
    int limit = scanner.nextInt();