package pl.infoshare.pregSpec;

import java.util.Scanner;

import static java.lang.Math.abs;
/*
This program will calculate time's period of pregnancy for any species if it was entered three of values X, Y, Z follow by this problem:
"Mother is X years older of her child. By Y years her child will have been Z years younger then mother.".
 */

public class PregSepc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby oddzielone spacjami: ");
        String input = scanner.nextLine();

        String x = ""; //helping to calculate howOlder parameter (it's X value of problem)
        String y = ""; //helping to calculate inWhile parameter (it's Y value of problem)
        String z = ""; //helping to calculate howYounger parameter (it's Z value of problem)
        char c;       // helping to check of Ascii table if char is numeral from input
        int i, j, k; // only use in loops

//This section checks all characters form input and builds new strings x, y, z. I know that below is better to use a function but we haven't had it yet.

        for (i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (c > 47 && c < 58) {
                x += c;
            } else {
                i++;
                break;
            }
        };

        for (j = i; j < input.length(); j++) {
            c = input.charAt(j);
            if (c > 47 && c < 58) {
                y += c;
            } else {
                j++;
                break;
            }
        };

        for (k = j; k < input.length(); k++) {
            c = input.charAt(k);
            if (c > 47 && c < 58) {
                z += c;
            }
        };

//Check the input is properly i.e. the section above finds x, y, z. If it's not be found, the program will be ended.

        if (x.length() != 0 && y.length() != 0 && z.length() != 0) {

            double howOlder = Integer.parseInt(x);
            double inWhile = Integer.parseInt(y);
            double howYounger = Integer.parseInt(z);

//This is hart of this program.
            int howLongPreg = (int) abs((howYounger * inWhile - (howOlder + inWhile)) / (1 - howYounger) * 12);

            System.out.println("Ciąża dla tego gatunku trwa " + howLongPreg + " miesięcy");

        } else {
            System.out.println("Podano niewłaściwy ciag znaków !");
        }
    }
}


