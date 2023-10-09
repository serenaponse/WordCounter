import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the number of words in the list
            System.out.print("Enter the number of words in the list: ");
            int listSize = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create an array to store the words
            String[] wordsList = new String[listSize];

            // Read the words into the array
            for (int i = 0; i < listSize; i++) {
                System.out.print("Enter word " + (i + 1) + ": ");
                wordsList[i] = scanner.nextLine();
            }

            // Read the search word
            System.out.print("Enter the search word: ");
            String searchWord = scanner.nextLine();

            // Call the getWordFrequency method to count occurrences
            int frequency = getWordFrequency(wordsList, listSize, searchWord);

            // Output the result
            System.out.println("The word '" + searchWord + "' appears " + frequency + " times in the list.");
        }
    }

    public static int getWordFrequency(String[] wordsList, int listSize, String searchWord) {
        int frequency = 0;

        // Iterate through the array and count occurrences of the search word (case insensitive)
        for (int i = 0; i < listSize; i++) {
            if (wordsList[i].equalsIgnoreCase(searchWord)) {
                frequency++;
            }
        }

        return frequency;
    }
}
