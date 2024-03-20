import java.util.Scanner;

public class cwh_operator_09 {

    public static void main(String[] args) {
        System.out.println("Enter value of b :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter value of y :");
        int y = sc.nextInt();
        float ans = (b*b - y)/2f;
        System.out.println(ans);
    }
}