public class break_and_continue {
    public static void main(String[] args) {
        for(int i =0;i<5;i++){
            System.out.println(i);
            System.out.println("hellow world");
            if (i==3) {
                System.out.println("end of loop");
                continue;
            }
        }
    }
}
