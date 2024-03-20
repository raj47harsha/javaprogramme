import java.util.Scanner;

public class fivetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of n");
        int n = sc.nextInt();
        // int n = 5;
        for(int i =1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,i*n);
        }
    }
}
