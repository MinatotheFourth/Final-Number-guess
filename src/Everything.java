import java.util.Random;
import javax.swing.*;
public class Everything {

	public static void main(String[] args) 
	{
		int even, ans, loop;
		
		
		do{
			//These are the formulas the user will never see
		Random rand = new Random(); 
		even = rand.nextInt(20/2) *2;
		ans = even / 2;
		
		JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10");
		JOptionPane.showMessageDialog(null, "Double that number");
		JOptionPane.showMessageDialog(null, "Add " + even);
		JOptionPane.showMessageDialog(null, "Divide by 2");
		JOptionPane.showMessageDialog(null, "Subtract your original number from your current number");
		JOptionPane.showMessageDialog(null, "The final number is " + ans + " isn't it?");
		
		loop = JOptionPane.showConfirmDialog(null, "Do you want to go again?");
		}while(loop == 0);
		
		

	}

}
