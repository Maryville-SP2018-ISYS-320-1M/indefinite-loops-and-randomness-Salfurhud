import java.util.Random;
import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr22, 2018
*/

public class P5_RandomMessageRepeater {

	public static void main(String[] args) {
		// Call your getRandomMessage method from here
		// Be sure you do not print out the message in the getRandomMessage method
		
		Scanner console = new Scanner( System.in );
		
		String x = "";
		
		while(!x.equals("-1")) {
		
			String messageToPrint = getRandomMessage();
			System.out.println(messageToPrint);
			
			System.out.print("Do you want to hear it again (-1 for no)?");
			x = console.next();
		}
		
		console.close();
	}
	
	public static String getRandomMessage() {
		
		String[] messages = {
				"This is a random message",
				"This is another random message",
				"And finally this is another random message"
			};
		
		Random rand = new Random();
		int messageToShow = rand.nextInt(messages.length);

		return messages[messageToShow];

				
	}

}
