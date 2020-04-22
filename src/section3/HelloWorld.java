package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		JOptionPane.showMessageDialog(null, "Hello World");
		
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " +input);
		
		int num = 4; 
		
		if (input.equals("Marileen")) {
			num++;
		}
		
		if  (num == 5) {
			JOptionPane.showMessageDialog(null, "good to see you");
		}
		else {
			JOptionPane.showMessageDialog(null, "Who are you");
		
		}
	}
}

