package javaWorkBookFirstVolume;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class ChapterOne {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "First steps in swing");
		
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		String name = input.nextLine();
		
		JOptionPane.showMessageDialog(null, "My name is " + name + " and I " + age + " years old");
	}

}
