// MAKE SURE BEFORE RUNNING THIS CODE IN YOUR IDE YOU MAKE THE CLASS "numberguessing game .JAVA"
import java.sql.SQLOutput;
import java.util.Scanner;
public class numberguessinggame {
    public static void main(String[] args) {
        // NUMBER GUESSING GAME

        int random_number;
        random_number = (int) (Math.random() * 100 + 1); // Random Numnber GENERATE

        Scanner sc = new Scanner(System.in);      // Scanner Activition
        System.out.println("enter a number between 1-100");
        int usernum;   // user number variable
        // Game logic
        do {

            usernum = sc.nextInt();
            if (usernum < random_number) {
                System.out.println("Too Low : TRY AGAIN !"); // IF USER INPUT IS SMALLER THEN RANDOM NUMBER THIS MESSAFE  PRINTS
            } else if (usernum > random_number) {
                System.out.println("Too High : TRY AGAIN !"); // IF USER INPUT IS GREATER  THEN RANDOM NUMBER THIS MESSAGE  PRINTS

            } else
                System.out.println("Congrats You Won The Game "); //  IF USER INPUT IS EQUALS  THEN RANDOM NUMBER THIS MESSAGE PRINTS
            // ENDING THE LOOP HERE
        } while (usernum != random_number);

    }
}
