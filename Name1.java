import java.util.*;

class Name1{
    public static void main(String[] args){
        System.out.println("Please enter a Firstname , MiddleName & Lastname separated by spaces");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        String[] arr = name.split(" ",3);
        System.out.println(arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
    }
} 

