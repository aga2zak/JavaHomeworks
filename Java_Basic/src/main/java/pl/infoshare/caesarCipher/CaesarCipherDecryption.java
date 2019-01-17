package pl.infoshare.caesarCipher;

import java.util.Scanner;


public class CaesarCipherDecryption {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst długości 11 znaków do rozszyfrowania. \n Rozszyfrowanych zostanie 11 pierwszych znaków:");
        String inputText =  scanner.nextLine();
        int inputTextLenght=inputText.length();
        if (inputTextLenght <11){
            System.out.println("Tekst jest za krótki.");
        } else {
            int secretCode = 4;
            int[] inputTextToArray = new int[11];
            char[] backToChar = new char[11];

            inputTextToArray[0] = (inputText.charAt(0) >= 97 && inputText.charAt(0) <= 122) || (inputText.charAt(0) >= 65 && inputText.charAt(0) <= 90)
                    ? (inputText.charAt(0) - secretCode) % 123 : inputText.charAt(0);
            inputTextToArray[1] = (inputText.charAt(1) >= 97 && inputText.charAt(1) <= 122) || (inputText.charAt(1) >= 65 && inputText.charAt(1) <= 90)
                    ? (inputText.charAt(1) - secretCode) % 123 : inputText.charAt(1);
            inputTextToArray[2] = (inputText.charAt(2) >= 97 && inputText.charAt(2) <= 122) || (inputText.charAt(2) >= 65 && inputText.charAt(2) <= 90)
                    ? (inputText.charAt(2) - secretCode) % 123 : inputText.charAt(2);
            inputTextToArray[3] = (inputText.charAt(3) >= 97 && inputText.charAt(3) <= 122) || (inputText.charAt(3) >= 65 && inputText.charAt(3) <= 90)
                    ? (inputText.charAt(3) - secretCode) % 123 : inputText.charAt(3);
            inputTextToArray[4] = (inputText.charAt(4) >= 97 && inputText.charAt(4) <= 122) || (inputText.charAt(4) >= 65 && inputText.charAt(4) <= 90)
                    ? (inputText.charAt(4) - secretCode) % 123 : inputText.charAt(4);
            inputTextToArray[5] = (inputText.charAt(5) >= 97 && inputText.charAt(5) <= 122) || (inputText.charAt(5) >= 65 && inputText.charAt(5) <= 90)
                    ? (inputText.charAt(5) - secretCode) % 123 : inputText.charAt(5);
            inputTextToArray[6] = (inputText.charAt(6) >= 97 && inputText.charAt(6) <= 122) || (inputText.charAt(6) >= 65 && inputText.charAt(6) <= 90)
                    ? (inputText.charAt(6) - secretCode) % 123 : inputText.charAt(6);
            inputTextToArray[7] = (inputText.charAt(7) >= 97 && inputText.charAt(7) <= 122) || (inputText.charAt(7) >= 65 && inputText.charAt(7) <= 90)
                    ? (inputText.charAt(7) - secretCode) % 123 : inputText.charAt(7);
            inputTextToArray[8] = (inputText.charAt(8) >= 97 && inputText.charAt(8) <= 122) || (inputText.charAt(8) >= 65 && inputText.charAt(8) <= 90)
                    ? (inputText.charAt(8) - secretCode) % 123 : inputText.charAt(8);
            inputTextToArray[9] = (inputText.charAt(9) >= 97 && inputText.charAt(9) <= 122) || (inputText.charAt(9) >= 65 && inputText.charAt(9) <= 90)
                    ? (inputText.charAt(9) - secretCode) % 123 : inputText.charAt(9);
            inputTextToArray[10] = (inputText.charAt(10) >= 97 && inputText.charAt(10) <= 122) || (inputText.charAt(10) >= 65 && inputText.charAt(10) <= 90)
                    ? (inputText.charAt(10) - secretCode) % 123 : inputText.charAt(10);

            backToChar[0] = (char) inputTextToArray[0];
            backToChar[1] = (char) inputTextToArray[1];
            backToChar[2] = (char) inputTextToArray[2];
            backToChar[3] = (char) inputTextToArray[3];
            backToChar[4] = (char) inputTextToArray[4];
            backToChar[5] = (char) inputTextToArray[5];
            backToChar[6] = (char) inputTextToArray[6];
            backToChar[7] = (char) inputTextToArray[7];
            backToChar[8] = (char) inputTextToArray[8];
            backToChar[9] = (char) inputTextToArray[9];
            backToChar[10] = (char) inputTextToArray[10];


            String decryptionInputText = new String(backToChar);
            System.out.println("Tekst po rozszyfrowaniu:  " + decryptionInputText);

        }
    }
}

