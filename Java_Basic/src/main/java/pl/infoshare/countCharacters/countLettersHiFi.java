package pl.infoshare.countCharacters;

import java.util.Scanner;

public class countLettersHiFi {
    public static void main(String[] args) {
//This program counts all uppercase and lowercase and throw out which not in a-z and A-Z
        Scanner sc = new Scanner(System.in);

        int lenghtText;
        String text;
        do {
            System.out.print("Wprowadź tekst nie pusty i nie więcej niż 200 znaków >>> ");
            text = sc.nextLine();
            lenghtText = text.length();
        } while (lenghtText == 0 || lenghtText > 200);

      // Create two an array of size 26 (max size low or high letters)
        int diff = 'z' - 'a';
        int[] lowChars = new int[diff + 1];
        int[] highChars = new int[diff + 1];

     // for each of letters from text keep counter
        for (int i : text.toCharArray()) {
            if (i >= 'a' && i <= 'z') {
                lowChars[i - 'a']++;
            } else if (i >= 'A' && i <= 'Z') {
                highChars[i - 'A']++;
            }
        }
     // print low letters if counter is not null
        for (int i = 0; i < lowChars.length; i++) {
            if ((int) lowChars[i] > 0) {
                System.out.println((char)('a' + i) + " " + lowChars[i]);
            }
        }
    // print high letters if counter is not null
        for (int i = 0; i < highChars.length; i++) {
            if ((int) highChars[i] > 0) {
                System.out.println((char)('A' + i) + " " + highChars[i]);
            }
        }

    }
}
