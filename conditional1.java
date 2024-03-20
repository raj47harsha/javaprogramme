import java.util.Scanner;

public class conditional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your age is :");
        int age = sc.nextInt();
        if (age >=18) {
            System.out.println("you can drive!");
        } else {
            System.out.println("no, you cannot!");
        }
        
    }
}
