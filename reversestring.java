import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse each word:");
        String input = scanner.nextLine();
        String reversedWords = reverseEachWord(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed Each Word: " + reversedWords);

        scanner.close();
    }
    public static String reverseEachWord(String str) {
    
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

    
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
