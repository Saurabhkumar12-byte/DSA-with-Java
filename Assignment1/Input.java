package Assignment1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;
        do {
            input = in.nextInt();
            sum = sum + input;
        } while (input != 0);

        System.out.println(sum);
        in.close();
    }
}
