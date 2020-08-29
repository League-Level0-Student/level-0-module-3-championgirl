package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	
	String HappyLevel=JOptionPane.showInputDialog(null,"Are you happy?");
	if(HappyLevel.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Keep doing whatever your doing!");
		}
	
	
	else if(HappyLevel.equals("no")){
		String Want=JOptionPane.showInputDialog(null,"Do you want to be happy?");
		
		if(Want.equals("no")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever your doing!");
		}
		
		
		if(Want.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Change something");
	
	
	}
	
	
	
}
}
}