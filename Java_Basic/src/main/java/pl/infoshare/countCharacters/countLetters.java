package pl.infoshare.countCharacters;

import java.util.Arrays;
import java.util.Scanner;

public class countLetters {
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

//        Asking, checking and control user's text
//        System.out.print("Wprowadź dowolny text nie dłuższy niż 200 znaków >>> ");
//        String text = sc.nextLine();
//
//        while (lenghtText == 0 || lenghtText > 200) {
//            System.out.print("Wprowadź ponownie. Albo wcisnąłeś Enter lub podałeś więcej niż 200 znaków >>> ");
//            text = sc.nextLine();
//            lenghtText = text.length();
//        }

        // Create an array of size 256 i.e. ASCII_SIZE, the program keeps counter of all characters from text
        int diff = 'z' - 'a';
        int[] lowChars = new int[diff + 1];
        int[] highChars = new int[diff + 1];

        for (int i : text.toCharArray()) {
            if (i >= 'a' && i <= 'z') {
                lowChars[i - 'a']++;
            } else if (i >= 'A' && i <= 'Z') {
                highChars[i - 'A']++;
            }
        }

        for (int i = 0; i < lowChars.length; i++) {
            if ((int) lowChars[i] > 0) {
                System.out.println((char)('a' + i) + " " + lowChars[i]);
            }
        }

        for (int i = 0; i < highChars.length; i++) {
            if ((int) highChars[i] > 0) {
                System.out.println((char)('A' + i) + " " + highChars[i]);
            }
        }
//
//
//
//
//        for (int i = 0; i < lenghtText; i++) {
//            count[text.charAt(i)]++;
//        }
//
//        //Part of program find and rewrite unique characters to onlyUnigChar array
//        char[] tempArrayForCompare = new char[lenghtText];
//        char[] onlyUnigChar = new char[lenghtText];
//
//        for (int i = 0; i < lenghtText; i++) {
//            //the program can return counter all of characters from text but I want only lowercase or uppercase
//            if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
//                    || ((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))) {
//                tempArrayForCompare[i] = text.charAt(i);
//            }
//
//            int find = 0;
//            for (int j = 0; j <= i; j++) {
//                // If any matches found
//                if (text.charAt(i) == tempArrayForCompare[j]) {
//                    find++;
//                }
//            }
//
//            if (find == 1) {
//                onlyUnigChar[i] = text.charAt(i);
//            }
//        }
//
//        /*Part of program  rewrite from onlyUnigChar array to lowerUpperCase
//         block of lowercase then block of uppercase */
//        Arrays.sort(onlyUnigChar);
//        String tempStringToRewrite = new String(onlyUnigChar);
//
//        char[] lowerUpperCase = new char[256];
//        int l = 0; //using to rewrite lowercase
//        int u = 100; //using to rewrite uppercase
//        for (int i = 0; i < tempStringToRewrite.length(); i++) {
//            int asCode = (int) tempStringToRewrite.charAt(i);
//
//            if (asCode > 64 && asCode < 91) {
//                lowerUpperCase[u] = tempStringToRewrite.charAt(i);
//                u++;
//            } else {
//                lowerUpperCase[l] = tempStringToRewrite.charAt(i);
//                l++;
//            }
//        }
//
////Return sorted small and large letters and counters for each of them
//        String outputCharactersFromText = new String(lowerUpperCase);
//        for (int i = 0; i < outputCharactersFromText.length(); i++) {
//            if ((int) outputCharactersFromText.charAt(i) > 0)
//
//                System.out.println(outputCharactersFromText.charAt(i) + " " + count[outputCharactersFromText.charAt(i)]);
//        }
    }
}
