import java.util.Scanner;

public class calculato {
    public static void main(String[] args) {
        
        char op;
        double no1;
        double no2;
        double ans;
        Scanner mynum = new Scanner(System.in);
        System.out.println("enter no1");
        no1 = mynum.nextDouble();
        System.out.println("enter no2");
        no2 = mynum.nextDouble();
        System.out.println("Select operator '+','-','*','/'");
        op = mynum.next().charAt(0);
        switch (op) {
            case '+':ans =no1 + no2;
            break;
            case '-':ans =no1 - no2;
            break;
            case '*':ans =no1 * no2;
            break;
            case '/':ans =no1/no2;
            break;
            
                
        
        
            default:
                return;
                
        }  System.out.println(ans);
    }
}
