import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class CatchPhrase {
    public static void main(String[] args) {
        boolean done = true;
        boolean yes = true;
        String operator;
        //while (done) {
        System.out.println("Welcome to Catch Phrase! ");
        System.out.println("-------------------------------");
        System.out.println("Choose a Category:  ");
        System.out.println("1: Animal");
        System.out.println("2: Occupation");
        System.out.println("3: Celebrity");
        System.out.println("4: Exit");
        System.out.println("Enter a category number:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("-------------------------");
        boolean outOfGuesses = false;
        String guessWord = "";
        String guess = input.nextLine();
        int guessCount = 0;
        int guessLimit = 5;
        if (x != 4) {
        }

        switch (x) {
            case 1:
                Random randCategory = new Random();
                List<String> animalCategory = new ArrayList<String>();
                animalCategory.add("Lion");
                animalCategory.add("Elephant");
                animalCategory.add("Giraffe");
                int numberOfElements = 1;
                for (int i = 0; i < numberOfElements; i++) {
                    int randomIndex = randCategory.nextInt(animalCategory.size());
                    guessWord = animalCategory.get(randomIndex);


                    break;
                }

                while (!guess.equalsIgnoreCase(guessWord) && !outOfGuesses) {

                    if (guessCount < guessLimit) {
                        System.out.print("Enter a guess: ");
                        guess = input.nextLine();
                        guessCount++;

                    }

                    if (guessCount == 2) {
                        System.out.println("Hint:" + guessWord.charAt(0));

                    }

                    if (guessCount == 5) {
                        outOfGuesses = true;
                        System.out.println("You lose!");

                    }
                    if(guess.equalsIgnoreCase(guessWord)){
                        System.out.println("You win!");
                    }
                }


                break;


            case 2:
                Random randCategory1 = new Random();
                List<String> occupationCategory = new ArrayList<String>();
                occupationCategory.add("Programmer");
                occupationCategory.add("Lawyer");
                occupationCategory.add("Doctor");
                int numberOfElements1 = 1;

                for (int i = 0; i < numberOfElements1; i++) {
                    int randomIndex = randCategory1.nextInt(occupationCategory.size());
                    guessWord = occupationCategory.get(randomIndex);
                    break;
                }

                while (!guess.equalsIgnoreCase(guessWord) && !outOfGuesses) {

                    if (guessCount < guessLimit) {
                        System.out.print("Enter a guess: ");
                        guess = input.nextLine();
                        guessCount++;

                    }

                    if (guessCount == 2) {
                        System.out.println("Hint:" + guessWord.charAt(0));

                    }

                    if (guessCount == 5) {
                        outOfGuesses = true;
                        System.out.println("You lose!");

                    }
                    if(guess.equalsIgnoreCase(guessWord)){
                        System.out.println("You win!");

                    }
                }


                break;
            case 3:
                Random randCategory2 = new Random();
                List<String> celebritiesCategory = new ArrayList<String>();
                celebritiesCategory.add("Obama");
                celebritiesCategory.add("Beyonce");
                celebritiesCategory.add("Rihanna");
                int numberOfElements2 = 1;

                for (int i = 0; i < numberOfElements2; i++) {
                    int randomIndex = randCategory2.nextInt(celebritiesCategory.size());
                    guessWord = celebritiesCategory.get(randomIndex);
                    break;

                }
                while (!guess.equalsIgnoreCase(guessWord) && !outOfGuesses) {

                    if (guessCount < guessLimit) {
                        System.out.print("Enter a guess: ");
                        guess = input.nextLine();
                        guessCount++;

                    }

                    if (guessCount == 2) {
                        System.out.println("Hint:" + guessWord.charAt(0));

                    }

                    if (guessCount == 5 && !guess.equalsIgnoreCase(guessWord)) {
                        outOfGuesses = true;
                        System.out.println("You lose!");

                    }
                    if(guess.equalsIgnoreCase(guessWord)){
                        System.out.println("You win!");

                    }
                }
                break;

            case 4:
                //The program will run until the user chooses to exit
                System.out.println("Goodbye!");
                System.exit(0);



        }
    }
}
