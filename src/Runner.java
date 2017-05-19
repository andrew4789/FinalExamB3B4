import java.math.BigInteger;
import java.util.Scanner;


import java.lang.StringBuilder;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* INSTRUCTIONS
 * 1. Create FinalExam_lastName Java Project
 * 2. Create class "Runner," and class "Converter"
 * 3. Instantiate both classes in main
 * 4. Use JOP's for all I/O -- do not leave any syso you might have
 *    used for debugging
 * 5. In myRunner.enterInteger(); tell allowable range is 0 - 255,
 *    and test for that range; if outside of that range tell them
 *    and ask for another try at entering a base-10 number 0-255
 * 6. Complete all necessary code, below
 * 7. Create and use a Git repository
 * 8. Create and use a GitHub repository
 * 9. Show Mr. M for a grade!
 */

public class Runner {
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		
		Scanner input = new Scanner( System.in );
	     

	
		
		
		JFrame frame = new JFrame("Input decimal");

	    // prompt the user to enter their name
		int num = Integer.parseInt( JOptionPane.showInputDialog(frame,
		        "decimal"));
		
			
		//andrew heiden
		
	      
	      
	      if ( num < 256 || num < 0 ){
	    	  String str = Integer.toHexString(num);
	    	  JOptionPane.showMessageDialog(null, "hex is " + str);
	      }
	    	else{
	    	    System.out.println("not the right size");
	    	    System.exit(0);
	    	}
	      
	      
	        
	      // calling method toHexString()
	      

	    // prompt the user to enter their name
	    //String name1 = JOptionPane.showInputDialog(frame, "What's your name?");

	    // get the user's input. note that if they press Cancel, 'name' will be null
	   
	    
	  }
	
		
			
		// now JOP the answer
		// then JOP "Do you want to enter another 0-255 Yes or No"
		// place this in a loop, keep looping as long as they answer Yes

	

	private int enterInteger() {
		// code for you to complete
		// for basic test return 0 (hex 00), or 255 (hex FF)
		return 255;
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers " + "between 0-255 to hexadecimal");
	}

}
