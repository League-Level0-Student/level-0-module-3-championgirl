
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot coder = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		coder.penDown();
		coder.setSpeed(100);
		coder.move(10);
		coder.turn(10);
		String color = "";
		//3. Set the pen width to 10
		coder.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		while(!color.equals("exit")) {
		 color= JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
    if(color.equals("red")) {
    	coder.setPenColor(Color.red);
    }
    else if(color.equals("purple")) {
    	coder.setPenColor(Color.MAGENTA);
    }
    else if(color.equals("yellow")) {
    	coder.setPenColor(Color.yellow);
    }
    else if(color.equals("pink")) {
    	coder.setPenColor(Color.pink);
    }
    else if(color.equals("blue")) {
    	coder.setPenColor(Color.blue);
    }
    else if(color.equals("orange")) {
    	coder.setPenColor(Color.orange);
    }
    else if(color.equals("green")) {
    	coder.setPenColor(Color.green);
    }
    else if(color.equals("black")) {
    	coder.setPenColor(Color.black);
    }
    else if(color.equals("white")) {
    	coder.setPenColor(Color.white);
    }
    
    
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
	else  {
    	coder.setRandomPenColor();
    }
		
    for( int i = 0; i < 4; i++ ) {
		coder.move(100);
		coder.turn(90);
		}
		}

	}
}
