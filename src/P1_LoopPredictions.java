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
 Repeats: 0
 Expected output: None
 (c)
 Repeats: Infinite
 Expected output: 250....
 (d)
 Repeats: 50
 Expected output: None
   
 */

/*
 Was your prediction correct?
 
 (a) Yes
 (b) Yes
 (c) Yes
 (d) Yes

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");

		
		// copy and paste the loop to test between here, between the println statements
		String word = "a";
		
		while(word.length() < 10) {
			word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
