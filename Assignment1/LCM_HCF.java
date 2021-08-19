package Assignment1;

//  Take a 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no.:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int on1 = num1;
        int on2 = num2;
        while (num1%num2!=0) {
        int rem= num1%num2;
        num1= num2;
        num2= rem;
        }
        int HCF= num2;
        int LCM = (on1*on2)/HCF;
        System.out.println("HCF is: "+HCF);
        System.out.println("LCM is: "+LCM);



        // int i = 1;
        // while ((num1 * i) % num2 != 0) {

        //     i++;
        // }
        // System.out.println(num1 * i);
        in.close();

    }
}
