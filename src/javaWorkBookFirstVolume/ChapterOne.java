package javaWorkBookFirstVolume;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class ChapterOne {

	public static void main(String[] args) {
		// Creation of message dialog
		JOptionPane.showMessageDialog(null, "First steps in swing");
		
		
		// Creation Scanner class object for input
		Scanner input = new Scanner(System.in);
		
		
		// Variables for input		
		String name = input.nextLine();
		int age = input.nextInt();
		
		String message = "My name is " + name + " and I " + age + " years old";
		input.close();
		
		// Message dialog with input values
		JOptionPane.showMessageDialog(null, message);
		
		
		// Use showInputDialog() method
		// 1. Asking for user's name
		String result;
		
		result = JOptionPane.showInputDialog(null, "What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello, " + result + ".");
		
		
		// 2. Asking for area code
		
		JOptionPane.showInputDialog(null, "Enter your area code", "Area code request", JOptionPane.QUESTION_MESSAGE);
		
		
		// 3. Salary dialog
		
		
		String occupation = JOptionPane.showInputDialog(null, "Enter your occupation", "Occupation blank", JOptionPane.INFORMATION_MESSAGE); 
		
		String salary = JOptionPane.showInputDialog(null, "How big is your salary", "Salary request", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "My occupation is " + occupation + " and my salary is " + salary);
	}

}
