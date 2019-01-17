package pl.infoshare.test;

import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class jZlicz1 {

    public static void main(String[] args) {

        System.out.println("Input a string using only latin letters 'a - z' and 'A-Z' with max length of 200 characters");

        String[] userInput = new Scanner(System.in).nextLine().split("");

        if (userInput.length < 1 || userInput.length > 201) {
            System.out.println("You have entered either 0 or more than 200 characters");
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < userInput.length; i++) {
            String charToString = userInput[i];
            if (map.containsKey(charToString)) {
                int key = map.get(charToString);
                key++;
                map.put(charToString, key);
            } else {
                map.put(charToString, 1);
            }
        }
        System.out.println("\n" + "The results are: ");
        for (Map.Entry item : map.entrySet()) {
            System.out.println(item);
        }
    }
}
