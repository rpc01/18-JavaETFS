import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter user name: ");
    String name = sc.nextLine();

    System.out.print("Enter user age: ");

    int age = sc.nextInt();

    System.out.print("Your Name is " +name );
    System.out.print(" and your Age is " +age +".");
		System.out.print("");
    sc.close();
  }
}
