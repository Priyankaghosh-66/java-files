abstract class GameConsole  {

   int score;
    void displayScore ()   {
   System.out.println("The displayScore method.");
  }
  
  abstract void computeScore();
  abstract void playGame();
 }

 class Badminton extends GameConsole   {

  void playGame()   {
   System.out.println("Starting the Badmintion Game...");
  }

  void computeScore()  {
   System.out.println("Calculating Score for the Badmintion Game...");
  }
 }
  class TableTennis extends GameConsole  {

  void playGame()   {
   System.out.println("Starting the TableTennis Game...);
  }
  void computeScore()  {
   System.out.println("Calculating Score for the TableTennis Game...");
  }
 }

 public class GameDemo   {
  
  public static void main(String args[])   {
   Badminton obj1 = new Badminton ();
   obj1.playGame();
   obj1.computeScore();
   obj1.displayScore();

   TableTennis obj2 = new TableTennis();
   obj2.playGame();
   obj2.computeScore();
   obj2.displayScore();
  }
 }