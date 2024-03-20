import java.util.Scanner;

public class cwh_16_ps1 {

    public static void main(String[] args) {
        System.out.print("Your age is :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >18) {
            System.out.println("Boy you can drive!");
        }else {
            System.out.println("You cannot !");
        }
    }
}