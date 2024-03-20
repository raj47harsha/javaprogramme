import javax.swing.JOptionPane;

public class inputdialogbox {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null, "Hello: "+ name);
        int age = Integer.parseInt("Enter your age: ");
        JOptionPane.showMessageDialog(null, "You are "+age+ " years old ");
    }
}
