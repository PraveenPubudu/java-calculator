import javax.swing.JOptionPane;

public class javacal {
    
    public static void main(String[] args) {
        
        while (true) {  // Infinite loop for continuous operations
            // Input for operation choice
            String opcode = JOptionPane.showInputDialog(null,
                "Select operation:\n\n" +
                "1 for Addition (+)\n" +
                "2 for Subtraction (-)\n" +
                "3 for Multiplication (*)\n" +
                "4 for Division (/)\n" +
                "5 for Remainder (%)\n" +
                "0 to Exit");  // Option to exit
            
            // Exit condition
            if (opcode == null || opcode.equals("0")) {  // Check if user pressed Cancel or entered 0
                JOptionPane.showMessageDialog(null, "Exiting the calculator.");
                break;  // Exit the loop
            }

            // Input for two numbers
            String num1 = JOptionPane.showInputDialog("Enter Number 1:");
            String num2 = JOptionPane.showInputDialog("Enter Number 2:");

            // Parsing numbers
            double ans = 0;
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            int op = Integer.parseInt(opcode);
            
            // Perform the chosen operation
            if (op == 1) {
                ans = n1 + n2;  // Addition
            } else if (op == 2) {
                ans = n1 - n2;  // Subtraction
            } else if (op == 3) {
                ans = n1 * n2;  // Multiplication
            } else if (op == 4) {
                if (n2 != 0) {  // Check for division by zero
                    ans = n1 / n2;  // Division
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Division by zero!");
                    continue;  // Skip to the next iteration of the loop
                }
            } else if (op == 5) {
                ans = n1 % n2;  // Remainder
            } else {
                JOptionPane.showMessageDialog(null, "Invalid operation selected.");
                continue;  // Skip to the next iteration of the loop
            }
            
            // Display the result
            JOptionPane.showMessageDialog(null, "The answer is: " + ans);
        }
    }
}
