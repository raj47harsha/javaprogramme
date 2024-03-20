public class varitemp {
    public static void main(String[] args) {
        String x = "water";
        String y = "cock";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x is: "+x);
        System.out.println("y is:"+y);
    }
}
