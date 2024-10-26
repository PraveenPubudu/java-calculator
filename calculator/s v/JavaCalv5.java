
import javax.swing.JOptionPane;

public class JavaCalv5 {

    public static void main(String args[]) {

        while (true) {
            try {
                String opcode = JOptionPane.showInputDialog(null,
                                "select operation\n\n"+
                                "1 for Addition (+)\n" +
                                "2 for subtraction (-)\n" +
                                "3 for multiplication (*)\n" +
                                "4 for devision (/)\n" +
                                "5 for remainder (%)\n" +
                                "0 for Exit\n");

                int op = Integer.parseInt(opcode);

                if (op == 0) {
                    JOptionPane.showMessageDialog(null, "Are you shure to exit");
                    System.exit(0);
                } else if (op < 0 || op > 6) {
                    JOptionPane.showMessageDialog(null, "Invalid option selected");
                    continue;
                }

                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 1 :"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 2 :"));

                if (op == 1)
                    CalFunctions.callAdd(n1, n2);
                else if (op == 2)
                    CalFunctions.callSub(n1, n2);
                else if (op == 3)
                    CalFunctions.callMult(n1, n2);
                else if (op == 4)
                    CalFunctions.callDiv(n1, n2);
                else if (op == 5)
                    CalFunctions.callRem(n1, n2);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values.", null, 0);
            }
        }
    }

}
