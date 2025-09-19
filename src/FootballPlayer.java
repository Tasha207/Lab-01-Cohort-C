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
        System.out.println("Height - " + height +"m");
        System.out.println("Weight - " + weight + "lbs");
        System.out.println("Jersey Number - " + jersey_number);

        //task 2
        final float pound = 0.45359237f;
        final int  meter = 100;
        float kilograms = weight * pound;
        float centimeters = height * meter;

        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters - " + centimeters + "cm");
        System.out.println("Weight in kilograms - " + weight +"kg");
        System.out.println("Jersey Number - " + jersey_number);

        //task 3

        System.out.println("Age now  " + age);
        age++;
        jersey_number--;

        System.out.println("New age after one season " + age);
        System.out.println("New jersey number after one season " + jersey_number);

        //task 4











    }
}
