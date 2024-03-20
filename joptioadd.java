import javax.swing.JOptionPane;

public class joptioadd {
    public static void main(String[] args) {
          String x = JOptionPane.showInputDialog("Enter first integer");
        String y = JOptionPane.showInputDialog("Enter second integer");
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
         int divison = a / b;
         JOptionPane.showMessageDialog(null,"The result of a / b is "+ a +"and " +b+"is "+ divison
         
         );

    

         ;
        
    }
}
