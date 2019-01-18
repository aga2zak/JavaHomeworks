package pl.infoshare.simpleTests;

import java.util.Scanner;

public class simpleTests {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //americanFlag();
        //face();


        addBinary(1011, 1111);
    }
        public static void americanFlag(){


            for (int i = 0; i <= 8; i++) {
                if(i%2==0){
                    System.out.print("* * * * * * ");
                }else {
                    System.out.print(" * * * * *  ");
                }
                System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            }

            for (int i = 1; i <= 15; i++){
                System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            }
        }

    public static void face(){

        String [] arrayFace = new String[5];

        arrayFace[0]=" +\"\"\"\"\"\"+";
        arrayFace[1]="[| o o |]";
        arrayFace[2]=" |  ^  | ";
        arrayFace[3]=" | '_' | ";
        arrayFace[4]=" +-----+ ";

        for(int i=0; i<arrayFace.length; i++){

            System.out.println(arrayFace[i]);
         }
    }

    public static void addBinary(long b1, long b2){

        int i = 0, carry = 0;
//
        //This is to hold the output binary number
        int[] sum = new int[10];
//
//        //To read the input binary numbers entered by user
//        Scanner scanner = new Scanner(System.in);
//
//        //getting first binary number from user
//        System.out.print("Enter first binary number: ");
//        b1 = scanner.nextLong();
//        //getting second binary number from user
//        System.out.print("Enter second binary number: ");
//        b2 = scanner.nextLong();
//
//        //closing scanner after use to avoid memory leak
//        scanner.close();
        while (b1 != 0 || b2 != 0)
        {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            int test=(int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
            System.out.println(test+"   "+carry + "  "+b1 +"   "+b2);

        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
