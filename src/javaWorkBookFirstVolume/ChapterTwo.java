package javaWorkBookFirstVolume;
import javax.swing.JOptionPane;

public class ChapterTwo {
	
	public static void main(String[] args) {
		
		// Using showConfirmDialog method 
		
		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null, "Are you friend or foe?");
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, isYes);
		
		// Using showConfirmDialog to create error message
		
		JOptionPane.showConfirmDialog(null, "Input value has incorrect type. Will you continie?", "Error message", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
	}

}
