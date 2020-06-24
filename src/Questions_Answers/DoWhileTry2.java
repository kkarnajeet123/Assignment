package Questions_Answers;


import javax.swing.JOptionPane;

public class DoWhileTry2 {
	
	//private static final Object YES_OPTION = null;

	public static void main(String[] args) {

		boolean des= false;
		do {
		
		String value = JOptionPane.showInputDialog("Enter your number for days: ");
		
		if(!value.equals(null)) {
		int days=Integer.parseInt(value);
	
			switch(days) {
		
				case 1:
						JOptionPane.showMessageDialog(null,"Sunday!!");
					break;
				case 2:
						JOptionPane.showMessageDialog(null,"Monday!!");
					break;
				case 3:
						JOptionPane.showMessageDialog(null,"Tuesday!!");
					break;
				case 4:
						JOptionPane.showMessageDialog(null,"Wednesday!!");
					break;
				case 5:
						JOptionPane.showMessageDialog(null,"Thursday!!");
					break;
				case 6:
						JOptionPane.showMessageDialog(null,"Friday!!");
					break;
				case 7:
						JOptionPane.showMessageDialog(null,"Saturday!!");
					break;
	}
	//String result = String.valueOf(JOptionPane.YES_OPTION);
	
			int result= JOptionPane.showConfirmDialog(null, "Would you like to try again?");
	
	//JOptionPane.showMessageDialog(null, result);
	
		if (result==0) {
		
		des=true;
			
		}else if(result==1) {
			des=false;
				JOptionPane.showMessageDialog(null, "Thank you for trying!!");
			break;
		}else {
			des=false;
			
			break;
		}
		
		}
	}while (des=true);

}
}	
	

	
		
		