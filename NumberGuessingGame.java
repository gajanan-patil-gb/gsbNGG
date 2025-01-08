import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String AArg[])
    {
        
        Scanner scanner = new Scanner(System.in);
        int difficultyLevel;

        System.out.println("Choose difficulty level (1: EASY, 2: MEDIUM, 3: HARD): ");
        difficultyLevel = scanner.nextInt();

         Random random = new Random();
        int guess;
        {

        int maxNumber;
        switch (difficultyLevel)
         {
            case 1:
                maxNumber = 20;
                break;
            case 2:
                maxNumber = 50;
                break;
            case 3:
                maxNumber = 100;
                break;
            default:
                System.out.println("Invalid difficulty level. Defaulting to medium.");
                maxNumber = 50;
        }
        }

        while(true)
        {
            guess = scanner.nextInt();

            if(guess == number)
            {
                System.out.println("CONGRATULATION, YOU GUESSED THE NUMBER !");
                break;
            }

            else if(guess < number)
            {
                System.out.println("TOO LOW.");
            }

            else
            {
                System.out.println("TOO HIGH.");
            }
        }

        scanner.close();
    }
}