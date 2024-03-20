import java.util.Date;
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        int a = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user input");
        float num = sc.nextFloat();
        System.out.println("output = "+num);
        System.out.println("Enter the String");
        sc.nextLine();

        String str = sc.nextLine();
        System.out.println("Output is = "+str);
        System.out.println("Enter the character");
        char at = sc.next().charAt(3);
        System.out.println("output = "+ at);
        System.out.println(new Date());
    
    }
}
