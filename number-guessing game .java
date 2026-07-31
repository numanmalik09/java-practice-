mport java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        // THIS IS THE NUMBER GUESSING GAME 

      
        int random_number;
         random_number = (int)(Math.random() *100 +1);

//        System.out.println(random_number);
Scanner sc= new Scanner(System.in);
        System.out.println("enter a number between 1-100");
 int usernum;
do{
//    System.out.println("guess the number between 1 - 100");
   usernum = sc.nextInt();
    if( usernum < random_number) {
        System.out.println("Too Low : TRY AGAIN !");
    }else if ( usernum > random_number) {
        System.out.println("Too High : TRY AGAIN !");

    }else
    System.out.println("Congrats You Won The Game ");
}while(usernum !=random_number);

//
