/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr22, 2018
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 â€œzero,â€? â€œinfinity,â€? and â€œunknownâ€? are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 10
 Expected output: 1 11 21 31 41 51 61 71 81 91
 (b)
 Repeats: Infinite
 Expected output: Unknown
 (c)
 Repeats: Infinit
 Expected output: 250...
 (d)
 Repeats: 5
 Expected output: bbbbbabbbbb
   
 */

/*
 Was your prediction correct?
 
 (a) Yes
 (b) Yes
 (c) Yes
 (d) Yes

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");

				
		// copy and paste the loop to test between here, between the println statements
		
		String x = "a";
		int y = 0;
		
		do {
			
			y++;
			x = "b" + x + "b";
			
		} while(x.length() < 10);
		
		System.out.println(y);	
		System.out.println("ENDING LOOP TEST");

	}

}
