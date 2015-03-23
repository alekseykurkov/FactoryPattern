import java.util.Scanner;

/**
 * Created by Aleksey Kurkov on 23.03.15.
 */

public class EnemyShipTesting {
  public static void main(String[] args) {

    EnemyShipFactory shipFactory = new EnemyShipFactory();

    EnemyShip theEnemy = null;

    Scanner userInput = new Scanner(System.in);

    System.out.println("What type ship? (U/R/B)");

    if (userInput.hasNextLine()) {

      String typeOfShip = userInput.nextLine();

      theEnemy = shipFactory.makeEnemyShip(typeOfShip);
    }

    if (theEnemy != null) {
      doStuffEnemy(theEnemy);
    } else {
      System.out.println("Enter a U, R or B next time");
    }
  }

  private static void doStuffEnemy(EnemyShip anEnemyShip) {
    anEnemyShip.displayEnemyShip();
    anEnemyShip.followHeroShip();
    anEnemyShip.enemyShipShoots();
  }
}