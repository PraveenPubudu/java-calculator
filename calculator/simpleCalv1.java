
import javax.swing.JOptionPane;

public class simpleCalv1 {

	public static void main(String args[]) {

		while (true) {
			String opcode = JOptionPane.showInputDialog(null,
					"select operation\n\n1 for Addition(+)\n" +
							"2 for subtraction(-)\n" +
							"3 for multiplication(*)\n" +
							"4 for devision(/)\n" +
							"5 for remainder(%)\n" +
							"6 for Exit\n");

			int op = Integer.parseInt(opcode);
			if (op == 6) {
				JOptionPane.showMessageDialog(null, "Are you shure to exit");
				System.exit(0);
			}
			String num1 = JOptionPane.showInputDialog("Enter Number 1 :");
			String num2 = JOptionPane.showInputDialog("Enter Number 2 :");

			double ans = 0;
			double n1 = Double.parseDouble(num1);
			double n2 = Double.parseDouble(num2);

			if (op == 1)
				ans = n1 + n2;
			if (op == 2)
				ans = n1 - n2;
			if (op == 3)
				ans = n1 * n2;
			if (op == 4)
				ans = n1 / n2;
			if (op == 5)
				ans = n1 % n2;

			JOptionPane.showMessageDialog(null, "the answer is : " + ans);
		}
	}

}