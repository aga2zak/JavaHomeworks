package pl.infoshare.test;


import java.util.*;
        import static java.lang.System.*;

public class jZlicz
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter your text. Application will count letters:");
        String inputText = scanner.nextLine();
        char[] inputTexttoCharArray = inputText.toCharArray();
        Map<String, Integer> lettersMap = new HashMap<>();
        for (int i = 0; i < inputTexttoCharArray.length; i++){
            if (lettersMap.containsKey(String.valueOf(inputTexttoCharArray[i]))){
                String currentLetter = String.valueOf(inputTexttoCharArray[i]);
                Integer newValue = lettersMap.get(currentLetter) + 1;
                lettersMap.put(currentLetter, newValue);
            }
            else {
                lettersMap.put(String.valueOf(inputTexttoCharArray[i]), 1);
            }
        }
        System.out.println("Result: " +lettersMap.entrySet());
        lettersMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}