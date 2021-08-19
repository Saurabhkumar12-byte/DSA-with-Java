package Assignment1;
// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
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
