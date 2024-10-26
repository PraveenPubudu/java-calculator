import javax.swing.JOptionPane;

public class CalFunctions {
    public static void callAdd(double n1,double n2){
        Double ans = n1 + n2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public static void callSub(double n1,double n2){
        Double ans = n1 - n2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public static void callMult(double n1,double n2){
        Double ans = n1 * n2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public static void callDiv(double n1,double n2){
        // if (n2 == 0){
        //     throw new ArithmeticException("Can't divide by zero");
        // }
        Double ans = n1 / n2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public static void callRem(double n1,double n2){
        Double ans = n1 % n2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
}
