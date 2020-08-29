package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class yourAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"This summer you decide to work at a science lab!");
	JOptionPane.showMessageDialog(null,"There is a jar that says contains real monsters! You open it up!POP! A couple a scary monsters appear");
	String runOrfriend=JOptionPane.showInputDialog(null,"Do you want to befriend these monsters or run!");
	
	
	
	
	if(runOrfriend.equals("befriend")) {
		JOptionPane.showMessageDialog(null,"These monsters don't look like they want a friend, And start chasing you!");
		JOptionPane.showMessageDialog(null,"Your fast! But these mosters are faster!");
		JOptionPane.showMessageDialog(null,"Finally you reach the exit!");
		JOptionPane.showMessageDialog(null,"You realize if you open the door the monsters will get out!");
		JOptionPane.showMessageDialog(null," But if you stay inside you are in danger!");
		String meanOrSave=JOptionPane.showInputDialog(null,"What will you do!")  ;
		if(meanOrSave.equals("open the door")) {
			JOptionPane.showMessageDialog(null,"Oh No The monsters are loose and are eating everything! What have you done!");
			JOptionPane.showMessageDialog(null,"Next time maybe you'll choose a quiet job at the libray,(If the monsters have not eaten it yet!)");
			JOptionPane.showMessageDialog(null,"PLay again and make differnt choses");
		}
		if(meanOrSave.equals("stay inside")) {
			JOptionPane.showMessageDialog(null,"(Gulp) It's just you and the monsters!");
			JOptionPane.showMessageDialog(null,"Wait a second you suddenly remember that the jar said something on how to destroy the monsters!");
			JOptionPane.showMessageDialog(null,"Quickly you do what the jar says! POOF their gone!That was a close one!");
			JOptionPane.showMessageDialog(null,"Maybe next summer you'll a take a quiet job at the libary !");
			JOptionPane.showMessageDialog(null,"Play again and make differnt chooses");
		}
	
	}	
if(runOrfriend.equals("run")) {
	JOptionPane.showMessageDialog(null,"Your fast! But these mosters are faster!");
	JOptionPane.showMessageDialog(null,"Finally you reach the exit!");
	JOptionPane.showMessageDialog(null,"You realize if you open the door the monsters will get out!");
	JOptionPane.showMessageDialog(null," But if you stay inside you are in danger!");
	String meanOrSave=JOptionPane.showInputDialog(null,"What will you do!")  ;
	if(meanOrSave.equals("open the door")) {
		JOptionPane.showMessageDialog(null,"Oh No The monsters are loose and are eating everything! What have you done!");
		JOptionPane.showMessageDialog(null,"Next time maybe you'll choose a quiet job at the libray,(If the monsters have not eaten it yet!)");
		JOptionPane.showMessageDialog(null,"PLay again and make differnt choses");
	}
	if(meanOrSave.equals("stay inside")) {
		JOptionPane.showMessageDialog(null,"(Gulp) It's just you and the monsters!");
		JOptionPane.showMessageDialog(null,"Wait a second you suddenly remember that the jar said something on how to destroy the monsters!");
		JOptionPane.showMessageDialog(null,"Quickly you do what the jar says! POOF their gone!That was a close one!");
		JOptionPane.showMessageDialog(null,"Maybe next summer you'll a take a quiet job at the libary !");
		JOptionPane.showMessageDialog(null,"Play again and make differnt chooses");
	}
}




}
}