package pl.infoshare.test;

import java.util.HashMap;
        import java.util.Scanner;
        import java.util.Map;


public class jZlicz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst składający się z maksymalnie 200 znaków: ");
        String tekst = scanner.nextLine();


        if (tekst.length() < 1 || tekst.length() > 200) {
            System.out.println("Tekst musi mieć więcej znaków niż 0 i maksymalnie 200");
        } else {
            char[] tabela = tekst.replaceAll("\\s+", "").toCharArray();

            Map< Character, Integer> hash_map = new HashMap<>();
            for (int i = 0; i < tabela.length; i++) {

                if (hash_map.containsKey(tabela[i])) {
                    Integer nowaWartosc = hash_map.get(tabela[i]) + 1;
                    hash_map.put(tabela[i], nowaWartosc);
                } else {
                    hash_map.put(tabela[i], 1);
                }
            }

            for (Map.Entry<Character,Integer> entry : hash_map.entrySet()) {
                Character k = entry.getKey();
                Integer v = entry.getValue();
                System.out.println("Znak " + k + " występuje " + v + " razy");
            }

        }
    }
}
