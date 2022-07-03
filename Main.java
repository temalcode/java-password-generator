package com.company;

import java.util.Scanner;

public class Main {

    static String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"
                        , "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
                        , "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "$", "&"
                        , "&", "*"};
    public static void main(String[] args) {

        System.out.println("Welcome to the password generator");
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("How many characters do you want? ");
            int length = scanner.nextInt();

            System.out.print("Here's your password: ");
            for (int i = 0; i < length; i++) {
                System.out.print(characters[random.generateRandom()]);
            }

            System.out.println();
            System.out.print("Do you want another password (true/false)? ");
            boolean userResponse = scanner.nextBoolean();
            System.out.println();
            if (userResponse) {
                Main.main(null);
            } else {
                System.exit(0);
            }
        }
        catch (Exception InputMismatchException){
            System.out.println("Invalid input, please try again.");
            System.out.println();
            Main.main(null);
        }
    }
}
