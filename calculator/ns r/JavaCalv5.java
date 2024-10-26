
import javax.swing.JOptionPane;

public class JavaCalv5 {

    public static void main(String args[]) {

        while (true) {
            try {
                String opcode = JOptionPane.showInputDialog(null,
                        "select operation\n\n" +
                                "1 for Addition (+)\n" +
                                "2 for subtraction (-)\n" +
                                "3 for multiplication (*)\n" +
                                "4 for devision (/)\n" +
                                "5 for remainder (%)\n" +
                                "0 for Exit\n");
                                
                if (opcode == "0" || opcode == null) {
                    JOptionPane.showMessageDialog(null, "Exiting Application");
                    System.exit(0);
                }

                int op = Integer.parseInt(opcode);
                
                if (op < 0 || op > 5) {
                    JOptionPane.showMessageDialog(null, "Invalid option selected");
                    continue;
                }

                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 1 :"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 2 :"));

                Double ans = 0.0;

                // Adding class object
                CalFunctions c1 = new CalFunctions(n1, n2);

                if (op == 1)
                    ans = c1.callAdd();
                else if (op == 2)
                    ans = c1.callSub();
                else if (op == 3)
                    ans = c1.callMult();
                else if (op == 4)
                    ans = c1.callDiv();
                else if (op == 5)
                    ans = c1.callRem();

                JOptionPane.showMessageDialog(null, "The Answer is :" + ans);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values.", null, 0);
            }
        }
    }

}
