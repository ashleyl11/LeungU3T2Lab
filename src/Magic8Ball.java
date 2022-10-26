import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
//        // Tell the user to enter a question
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Magic 8 Ball!");
//        System.out.print("Enter a yes-no question and I will answer it: ");
//        String question = scan.nextLine();
//
//        String response = "";  // update this variable with the response
//
//        // Write code here to generate a random number from 1 to 6
//        int randomNum = (int)(Math.random()* (6 - 1 + 1)) + 1;
//
//        // Write code here to use
//        // appropriate selection statements (if, if else, else)
//        // to choose from 1 of 6 responses and set response to it.
//        // for example, if the number is 1, set response to "Outlook good"
//        // if it’s 2, set response to "Without a doubt!"
//        // etc.
//
//        if (randomNum == 1){
//            response += "Most definately!";
//        }
//        if (randomNum == 2){
//            response += "There's a high chance!";
//        }
//        if (randomNum == 3){
//            response += "Sure!";
//        }
//        if (randomNum == 4){
//            response += "Maybe...";
//        }
//        if (randomNum == 5){
//            response += "Probably not";
//        }
//        if (randomNum == 6){
//            response += "Of course not!";
//        }
//
//        System.out.println(response);  // print response
        int score = 53;
        String grade = "";  // initialize to empty string

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);

    }
}

