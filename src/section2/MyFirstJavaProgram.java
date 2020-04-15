package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	 
	public static void main(String[] args) {
		
		// START HERE
	Robot sally = new Robot();
	
	sally.setSpeed(100);
	sally.penDown();
	
	for (int i = 0; i < 4; i++) {
		sally.move(200);
		sally.turn(90);
	}
	
	
	
	}
}
