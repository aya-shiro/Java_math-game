class Enemy {
  private String enemyName;
  private int arms;

  public static enemyMatch(){
    for(int level=1;level<=10;level++){
      System.out.print("どの敵を倒す？：");
      String enemyName = scanner.next();
      System.out.println(enemyName + "を倒した！");
      System.out.println(enemyName + "の武器値" +  "を自分の武器に加算した！");
      // int limit = scanner.nextInt();
    }
  }
}