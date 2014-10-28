package apcs;

import javax.swing.JOptionPane;



public class Guesser {
	public static void main(String [] args){
		int value = (int) (Math.random()*100);
		String guessStr = JOptionPane.showInputDialog("Guess a number, 1-100!");
		int guess = Integer.parseInt(guessStr);
		int count = 0;
		
		boolean loopActive = true;
		while(loopActive){
			//count variable used later for detailing the number of guesses made
			count = count + 1;
			//determines if the guess value is less than or greater to the hidden value, state so and
			//allow the user to make another guess by creating a new guess variable for comparison and
			//setting the original guess to the new guess
			if(guess < value){
				String newGuessPane = JOptionPane.showInputDialog("Your guess was too low! Guess again.");
				int newGuess = Integer.parseInt(newGuessPane);
				guess = newGuess;
			} else {
				String newGuessPane = JOptionPane.showInputDialog("Your guess was too high! Guess again.");
				int newGuess = Integer.parseInt(newGuessPane);
				guess = newGuess;
			}
			
			if(guess == value){
				 JOptionPane.showMessageDialog(null, "Nice job!");
				 loopActive = false;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Boom, you got it in " + count + " guesses. The number was " + value);
		Object[] options = {"Yes, please",
                "No, thanks" };
				int reset = JOptionPane.showOptionDialog(null,
						"Would you like to play again?",
								"Again?",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[1]);
				if(reset == 0)
					programRestart();

		
	}
	
	public static void programRestart(){
		Guesser.main(null);
	}
}
