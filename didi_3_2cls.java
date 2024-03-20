import java.util.Scanner;

public class didi_3_2cls {
    public static void main(String[] args) {
        System.out.println("what is the number?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number%2 == 0)
         { System.out.println("even");
            
        }else 
        System.out.println("odd");
    }
    
}
