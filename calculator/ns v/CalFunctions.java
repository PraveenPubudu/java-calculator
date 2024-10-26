import javax.swing.JOptionPane;

public class CalFunctions {

    // universal variables 

    Double num1 ; 
    Double num2 ;


    // Constructor method for creating class coppy (object)

    public CalFunctions(Double n1,Double n2) {
        num1 = n1;
        num2 = n2;
    }


    public void callAdd(Double n1,Double n2){
        Double ans = num1 + num2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public void callSub(Double n1,Double n2){
        Double ans = num1 - num2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public void callMult(Double n1,Double n2){
        Double ans = num1 * num2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public void callDiv(Double n1,Double n2){
        if (num2 == 0){
            throw new ArithmeticException("Can't divide by zero");
        }
        Double ans = num1 / num2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
    public void callRem(Double n1,Double n2){
        Double ans = num1 % num2;
        JOptionPane.showMessageDialog(null, "The Answe is :" + ans, null, 0); 
    }
}
