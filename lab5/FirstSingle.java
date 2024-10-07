package lab5;

public class FirstSingle {


        public static char firstSingleLetter(String text, int n) {
            // Create an array to store the frequency of each letter (26 letters A-Z)
            int[] frequency = new int[26];
    
            // Step 1: Count the frequency of each character
            for (int i = 0; i < n; i++) {
                char currentChar = text.charAt(i);
                frequency[currentChar - 'A']++; // Increment frequency for current character
            }
    
            // Step 2: Find the first character that occurs only once
            for (int i = 0; i < n; i++) {
                char currentChar = text.charAt(i);
                if (frequency[currentChar - 'A'] == 1) {
                    return currentChar; // Return the first non-repeating character
                }
            }
    
            // If no non-repeating character is found, return some default value
            return '\0'; // return null character if no unique letter is found
        }
    
        public static void main(String[] args) {
            String text = "AEROPLANE"; // Example input
            int n = text.length();
            
            char result = firstSingleLetter(text, n);
            
            if (result != '\0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
    }
  