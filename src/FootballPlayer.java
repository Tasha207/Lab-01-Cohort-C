import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {

        //task 1
        System.out.println("Enter the details:");
        Scanner details = new Scanner(System.in);

        System.out.println("Enter name");
        String name = details.nextLine();

        System.out.println("Enter age");
        int age = details.nextInt();

        System.out.println("Enter height");
        float height = details.nextFloat();

        System.out.println("Enter weight");
        int weight = details.nextInt();

        System.out.println("Enter jersey number");
        int jersey_number = details.nextInt();

        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + height);
        System.out.println("Weight - " + weight);
        System.out.println("Jersey Number - " + jersey_number);

        //task 2



    }
}
