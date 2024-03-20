public class stringlength {
    public static void main(String[] args) {
        String sent =" How are you mehul ?";
        int value = sent.length();
        System.out.println(value);
        String loString = sent.toLowerCase();
        System.out.println(loString);
        String upstring = sent.toUpperCase();
        System.out.println(upstring);
        System.out.println(sent.substring(5,10));
        System.out.println(sent.substring(4, value));
        System.out.println(sent.replace("mehul", "Kinjal"));
    }
}
