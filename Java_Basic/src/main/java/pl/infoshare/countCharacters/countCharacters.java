package pl.infoshare.countCharacters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class countCharacters {
    public static void main(String[] args) {
//This program counts all uppercase and lowercase and throw out which not in a-z and A-Z
        Scanner sc = new Scanner(System.in);

        System.out.print("Wprowadź dowolny text nie dłuższy niż 200 znaków >> ");
        String text = sc.nextLine();
        int lenghtText = text.length();

        while(lenghtText==0 || lenghtText>200){
            System.out.print("Wprowadź ponownie. Albo wcisnąłeś Enter lub podałeś więcej niż 200 znaków >> ");
            text = sc.nextLine();
            lenghtText = text.length();
        }
        // Create an array of size 256 i.e. ASCII_SIZE
        int [] count = new int[256];
        Arrays.sort(count);
        char [] test = new char[lenghtText];

        // Initialize count array index
        for (int i = 0; i < lenghtText; i++) {
            count[text.charAt(i)]++;
        }


        // Create an array of given String size
        char giveOnlyUniqChar[] = new char[lenghtText];
        for (int i = 0; i < lenghtText; i++) {
            if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || ((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))){
                giveOnlyUniqChar[i] = text.charAt(i);}

            int countChar = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (text.charAt(i) == giveOnlyUniqChar[j]) {
                    countChar++;
                }
            }

            if (countChar == 1) {
                test[i]=text.charAt(i);
                System.out.println("Litera " + test[i] + " występuje " + count[text.charAt(i)] + " razy");
            }
        }

        Arrays.sort(test);
        String encryptionInputText = new String(test);

        System.out.println(encryptionInputText);
        for (int i = 0; i < encryptionInputText.length(); i++) {
            if((int)encryptionInputText.charAt(i) >0)
                System.out.println("Litera " + encryptionInputText.charAt(i) + " występuje " + count[encryptionInputText.charAt(i)]  + " razy");
        }
    }
}
