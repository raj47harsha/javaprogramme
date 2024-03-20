import java.util.Scanner;

public class cwh_conditional_didi_3a {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a == b) {
        System.out.println("equal");
    }if (a<b) {
       System.out.println("smaller"); 
    }if (a>b) {
        System.out.println("greater");
    }
   } 
}
