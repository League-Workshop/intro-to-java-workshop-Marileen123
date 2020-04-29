package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
	/*	int num = 0;
		num = num + 1; //increment
		num +=1;
		num++;
		
		
		num = num - 1; //decrement
		num -=1;
		num--;
		
		Random rand = new Random();
		num = rand.nextInt(101);
		System.out.println(num);
		num = rand.nextInt(101);
		System.out.println(num);
		num = new Random().nextInt(4);
		*/
		// 1.  Create a variable to hold the user's score/
		int num = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog(null, "What is your favorite color?");
		
		// 3.  Use an if statement to check if their answer is correct
		if  (input.equals("blue")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			num++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		// 4.  if the user's answer was correct, add one to their score 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
			
		}
		input = JOptionPane.showInputDialog(null, "What is your favorite food?");
		if (input.equals("sushi")) {
			JOptionPane.showMessageDialog(null, "Correct");
			num++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		System.out.println(num);
		}
	}
	
