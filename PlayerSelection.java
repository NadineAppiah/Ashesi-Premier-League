//Name of the project: Ashesi Premier League
//Author: Nadine Appiah
//Date created: 22/09/2025
//Purpose of the project: Practicing Java concepts

import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        //player details
        Scanner input = new Scanner(System.in);
        System.out.print("Enter player's name: " );
        String name = input.nextLine();
        System.out.print("Enter player age: ");
        int age = input.nextInt();
        System.out.print("Enter player's height in meters: ");
        double height = input.nextDouble();
        System.out.print("Enter player's weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter player's jersey number: ");
        int jersey_number = input.nextInt();

        //data conversion
        double POUND = 0.45359237f;
        double METER = 100;

        int heightInCm = (int) (METER * height);
        double weightInKg   =  (POUND * weight);
        int weightRounded = (int) weightInKg;

        //category
        String category;
        if (age >= 18 && age < 20){
            category = "Rising star";
        } else if (age >= 20 && age <= 30){
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        //position
        String position;
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position is unknown";
        }

        //attacker jersey
        String attacker_jersey = (jersey_number == 7 || jersey_number == 9 || jersey_number == 10 || jersey_number == 11)? "Yes":"No";
        System.out.println("Attacker jersey number is " + attacker_jersey);

        //eligibility
        String eligibility;
        if (age >= 18 && age <= 35 && weightInKg < 90) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not eligible";
        }

        //lineup decision
        String lineup_decision;
        if (age >= 20 && age <= 30) {
            if (weightInKg < 80) {
                lineup_decision = "Starting lineup";
            } else {
                lineup_decision = "Bench";
            }
        } else {
            lineup_decision = "Bench";

        }

        //final decision
        String status = (age >= 18 && age <= 35)? "Play":"Rest";
        System.out.println("Final status:" + status);

        //player report
        System.out.println("Player Report");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + "("+category+")");
        System.out.println("Height: " + heightInCm + "cm");
        System.out.println("Weight: " + weightInKg + "kg");
        System.out.println("Jersey number: " + jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey number: " + attacker_jersey);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup decision: " + lineup_decision);
        System.out.println("Final decision: " + status);

        //unwanted fall-through demo
        switch (jersey_number) {
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
            default:
                System.out.println("Default case");
        }
    }
}
