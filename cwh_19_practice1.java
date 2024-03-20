import java.util.Scanner;

public class cwh_19_practice1 {
    public static void main(String[] args) {
        byte m1 ,m2 ,m3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        // if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        //     System.out.println("You are promoted !");
        // } else {
        //     System.out.println("You are not promoted !");
        // } 
            if (avg>=40 && m1 >= 33 && m2 >= 33 && m3 >=33) {
                System.out.println("you are promoted");
            } else {
                System.out.println("you are not promoted");
            }
         
            
        }
         
            
        
    }

