import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
   public static void main() {

       Scanner user= new Scanner(System.in);
       System.out.println("enter your text for repitation");
       String  user_text =user.nextLine(); // user_text is a variable
       System.out.println("enter the number of repitations");
       int number_of_repitations=user.nextInt(); //  number_of_repitattions is a variable

for (int i =0 ; i<number_of_repitations; i++){
    System.out.println(user_text);
}

   }
}
