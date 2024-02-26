import java.util.Random;
import java.util.Scanner;

public class RandomNumber{

  public RandomNumber(){
    Random rand = new Random();
    int nums = rand.nextInt(100);
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number from 1 to 100");
    int guess = scan.nextInt();
    while(guess!=nums){
      nums= rand.nextInt(100);
      System.out.println("Please try again.");
      guess = scan.nextInt();
    }
      System.out.println("Congrats you win!");
      scan.close();
  }
    
  public static void main(String[] args) {
    new RandomNumber();
  }
}
