import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        System.out.println("Enter maths marks");
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        System.out.println("Enter physics marks");
        int physics = sc.nextInt();
        if (maths >=35 && physics >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
