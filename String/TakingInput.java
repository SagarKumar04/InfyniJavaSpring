package String;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        System.out.println("str1: " + str1);

        int i = scanner.nextInt();
        System.out.println("i: " + i);

        scanner.nextLine();

        String str2 = scanner.nextLine();
        System.out.println("str2: " + str2);
    }
}
