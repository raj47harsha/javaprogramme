import java.util.Scanner;

public class cwh_conditional_didi_cal {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator + ,-,*,/");
        operator = input.next().charAt(0);
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                 System.out.println(number1*number2);
                 break;
            case '/':
                 System.out.println(number1/number2);
                 break;

        
            default:
                break;
        }
    }
}
