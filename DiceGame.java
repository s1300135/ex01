import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public statc void main(String[] args){
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);

	int n1 = rand.nextInt(6) + 1;
	int n2 = rand.nextInt(6) + 1;
	int total = n1 + n2;

	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Hello, " + name );

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + n1);
	System.out.println("Die 2: " + n2);
	System.out.println("Total value: " + total);
    }
}
