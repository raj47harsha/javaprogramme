public class stringval {
    public static void main(String[] args) {
        String name = "harry";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toUpperCase();
        System.out.println(lstring);
        System.out.println(name);
        System.out.println(name.trim());
        System.out.println(name.substring(5));
        System.out.println(name.endsWith("rre"));
        System.out.println(name.startsWith("har"));
    }
}
