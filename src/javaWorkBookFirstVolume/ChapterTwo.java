package javaWorkBookFirstVolume;
import javax.swing.JOptionPane;

public class ChapterTwo {
	
	public static void main(String[] args) {
		
		int selection;
		boolean isYes;
		selection = JOptionPane.showConfirmDialog(null, "Are you friend or foe?");
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, isYes);
	}

}
