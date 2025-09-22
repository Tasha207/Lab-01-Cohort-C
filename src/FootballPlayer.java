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
        if ((age>= 18 && age<= 35) && ( weight> 0 && weight < 90)){
            System.out.println("Eligible");}

        else {
            System.out.println("Not eligible");
        }

        //experimentation 2
        //if((age>= 18 && age<= 35) || ( weight> 0 && weight < 90)){
            //System.out.println("Player has a problem (either too young or too heavy)");
        //}

        //experimentation 3
        //boolean player_eligibility = (age >= 18 && age <= 35) && (weight > 0 && weight < 90);

        //if (!player_eligibility) {
         //   System.out.println("Not Eligible (using NOT)");
        //}
        //else {
         //   System.out.println("Eligible (using NOT)");
        //}

        //task 5
        if(age < 20){
            System.out.println("Rising Star");
        }
        else if(age >= 20 && age <= 30){
            System.out.println("Prime Player");
        }
        else{
            System.out.println("Veteran");
        }

        //task 6
        Scanner jer_number = new Scanner(System.in);
        System.out.println("Enter jersey number");
        int j_number = jer_number.nextInt();

        switch(j_number){
            case 1:
                System.out.println("Goalkeeper");
                break;

            case 2:
                System.out.println("defender");
                break;

            case 5:
                System.out.println("defender");
                break;

            case 6:
                System.out.println("midfielder");
                break;

            case 7:
                System.out.println("Winger");
                break;

            case 8:
                System.out.println("midfielder");
                break;

            case 9:
                System.out.println("Striker");
                break;

            case 10:
                System.out.println("Playmaker");
                break;

            case 11:
                System.out.println("Winger");
                break;

            default:
                System.out.println("Player position not known");
        }

        //task 7 part A
        Scanner jers_number = new Scanner(System.in);
        System.out.println("Enter jersey number");
        int je_number = jers_number.nextInt();

        switch(je_number){
            case 1:
                System.out.println("Goalkeeper");
                break;

            case 2:
                System.out.println("defender");

            case 5:
                System.out.println("defender");
                break;

            case 6:
                System.out.println("midfielder");

            case 7:
                System.out.println("Winger");

            case 8:
                System.out.println("midfielder");
                break;

            case 9:
                System.out.println("Striker");
                break;

            case 10:
                System.out.println("Playmaker");
                break;

            case 11:
                System.out.println("Winger");
                break;

            default:
                System.out.println("Player position not known");
        }

        //task 7 part B
        Scanner jerse_number = new Scanner(System.in);
        System.out.println("Enter jersey number");
        int jer_snumber = jerse_number.nextInt();

        switch(jer_snumber){
            case 1:
                System.out.println("Goalkeeper");
                break;

            case 2:
            case 5:
                System.out.println("defender");
                break;


            case 6:
            case 8:
                System.out.println("midfielder");
                break;

            case 7:
            case 11:
                System.out.println("Winger");
                break;


            case 9:
                System.out.println("Striker");
                break;

            case 10:
                System.out.println("Playmaker");
                break;


            default:
                System.out.println("Player position not known");
        }

        //task 8
        String category = "Prime player";
        int w_eight = 60;

        if(category == "Prime player") {
            if (w_eight < 80) ;
            System.out.println("Start lineup");
        }

        else{
            System.out.println("Bench");

        }

        //task 9
        String Eligibility = ((age >= 18 && age <= 35) && weight < 90)? "Play" : "Rest";
        System.out.println(Eligibility);




























    }
}
