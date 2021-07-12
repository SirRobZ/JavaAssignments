import java.util.Scanner;
import java.util.Random;


public class numberguess {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random=new Random();Saurabh


        System.out.println("Hello! What is your name?");
        String firstName=scan.next();


        while (true){
            int number=random.nextInt(19) + 1;

            System.out.println("Well, " +firstName+" , I am thinking of a number between 1 and 20.");
            int i=1;
            int guessnumber;


            do {
                System.out.println("Take a guess.");
                guessnumber=scan.nextInt();

                if(guessnumber==number){
                    System.out.println("Good job, " +firstName+"! You guessed my number in "+i+" guesses!");
                    break;
                }else if(guessnumber-number <0){
                    System.out.println("Your guess is too low.");
                }else {
                    System.out.println("Your guess is too high.");
                }

                i++;
                if(i>5){
                    System.out.println("Bad job, " +firstName+"! my number is "+number+" !");
                }
            }while(i <=5);
            System.out.println("Would you like to play again? (y or n)");
            char playNext=scan.next().charAt(0);

            if(playNext != 'y'){
                break;
            }
        }



    }
}
