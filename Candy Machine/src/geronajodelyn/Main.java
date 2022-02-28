package geronajodelyn;
import java.util.Scanner;
public class Main {

    static Scanner keyboard = new Scanner(System.in);

    //Method to Display item choices
    public static double displayChoices() {
        double price = -1;
        System.out.println("Well here's what I have.");
        System.out.println("A.      Php 2.00     Sweet Caramel");
        System.out.println("B.      Php 20.00    Potato Chips");
        System.out.println("C.      Php 1.50     Cool Gums");
        System.out.println("D.      Php 45.00    DeuPretty Cookies");

        System.out.println();
        System.out.println("Which candy do you like: (letter)?");
        String choice = keyboard.next().toUpperCase();

        if (choice.equals("A")) {
            price = 2.00;
            return 2.00;
        } else if (choice.equals("B")) {
            price = 20.00;
            return 20.00;
        } else if (choice.equals("C")) {
            price = 1.50;
            return 1.50;
        } else if (choice.equals("D")) {
            price = 45.00;
            return 45.00;
        }
        return price;
    }

    //Method to Dispense Candy and Return change
    public static void dispense(double moneyInserted, double candyCost){
        if(moneyInserted > candyCost){
            System.out.println("Vending...");
            System.out.println("Here's your candy!");
            double change = (double) moneyInserted - (double) candyCost;
            System.out.println("Here's your Php " + change + " in change.");
            System.out.println("Please comeback again :)");
        }
        else{
            System.out.println("Sorry mate, you're too broke. Here's your Php."+ moneyInserted +"Back. Thank you.");
        }
    }



    public static void main(String[] args) {
        //Welcome Statement To Vending Machine
        System.out.println("Welcome To Jade's Candy Machine!!!");
        System.out.println("The Sweetest Me :)");

        //Prompt & Store for User Information
        System.out.print("How much money do you have?");
        double moneyInserted = keyboard.nextDouble();

        //return type of the method was double,so have to store it
        double candyCost = displayChoices();

        //return type was void so don't have to store it
        dispense(moneyInserted,candyCost);

    }
}

