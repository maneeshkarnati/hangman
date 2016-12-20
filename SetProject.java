package setproject;

import java.util.*;

public class SetProject {

    private static final String[] words
            = {
                "january",
                "cheetah",
                "shark",
                "fairfield",
                "peanut",
                "georgia",
                "hockey",
                "pizza",
                "swimming",
                "horse"};

    public static void main(String[] args) {
    
       Set<String> lettersToChoose = new HashSet<>();
       Set<String> usedLetters = new HashSet<>();
        for (int i = 65; i < (65 + 26); i++) {
            lettersToChoose.add("" + ((char) i));
        }

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringToMatch = new StringBuilder(words[(int)Math.floor(Math.random() * words.length)].toUpperCase());
        
        String answer = stringToMatch.toString();
        
        int turns = 10;
        int matchIndex;
        
        /*
        replace the XXXX with the method that returns the number of items in the set
        */
        while (stringToMatch.length() > 0 && turns > 0 && lettersToChoose.size() > 0) {
            
            
            System.out.print("Letter > ");
            String enteredLetter = scanner.nextLine();
            enteredLetter = enteredLetter.toUpperCase();
            /*
            replace the XXXX with the set function that will take the object out of the set 
            */
            if (lettersToChoose.size()) {
            /*
            include enteredLetter into the set of used letters
            */
                usedLetters.enteredLetter;
                matchIndex = stringToMatch.indexOf(enteredLetter);
                if (matchIndex > -1) {
                    while ((matchIndex = stringToMatch.indexOf(enteredLetter)) > -1) {
                        stringToMatch.delete(matchIndex, matchIndex + 1);
                        System.out.println(stringToMatch.length() + " letters left");
                    }
                } else {
                    turns--;
                    System.out.println("You have " + turns + " turns left");
                }
            } else {
                System.out.println("You have already used that letter");
                System.out.println(usedLetters);
            }      
        }
            
                    
        System.out.println("The word was " + answer);
        if (turns > 0) {
            System.out.println("You had "+ turns + " turns remaining");
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }

    }
}
