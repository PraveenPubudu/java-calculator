import javax.swing.JOptionPane;

public class CalFunctions {

    Double num1;
    Double num2;

    public CalFunctions(Double n1,Double n2) {
        num1 = n1;
        num2 = n2;
    }
    public  Double callAdd() {
        Double ans = num1 + num2;
        return ans;
    }

    public  Double callSub() {
        Double ans = num1 - num2;
        return ans;
    }

    public  Double callMult() {
        Double ans = num1 * num2;
        return ans;
    }

    public  Double callDiv() {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Can,t divide by Zero", null, JOptionPane.ERROR_MESSAGE);
        }
        Double ans = num1 / num2;
        return ans;
    }

    public  Double callRem() {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Can,t divide by Zero", null, JOptionPane.ERROR_MESSAGE);
        }
        Double ans = num1 % num2;
        return ans;
    }
}
