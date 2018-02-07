//JavaSE-1.7, 10/19/2014, 12:13 PM

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO: Math.random() 
		// UPDATE: Math.random() complete
		System.out.println("Commands:\n1 = +\n2 = -\n3 = *");
		Scanner problemType = new Scanner(System.in);
		int mType = problemType.nextInt();
		if(mType == 1){
			int var1 = 593; // Old variable
			int var2 = 384; // Old variable
			int var3 = (int) (Math.random()*625)+310;
			int var4 = (int) (Math.random()*420)+267;
			int answer = var4 + var3;
			String mProblem = var4 + "+" + var3;
			System.out.println("What is" + " " + mProblem + "?");
			Scanner userAnswer = new Scanner(System.in);
			int guess = userAnswer.nextInt();
			if(guess == answer){
				System.out.println("Good job, m8.");
			}else System.out.println("Nope.");
			System.out.println("The correct answer was: " + answer);
		}else if(mType == 2){
			int var3 = (int) (Math.random()*625)+310;
			int var4 = (int) (Math.random()*920)+867;
			int answer = var4 - var3;
			String mProblem = var4 + "-" + var3;
			System.out.println("What is" + " " + mProblem + "?");
			Scanner userAnswer = new Scanner(System.in);
			int guess = userAnswer.nextInt();
			if(guess == answer){
				System.out.println("Good job, m8.");
			}else System.out.println("Nope.");
			System.out.println("The correct answer was: " + answer);
		}else if(mType == 3){
			int var3 = (int) (Math.random()*625)+310;
			int var4 = (int) (Math.random()*420)+267;
			int answer = var4 * var3;
			String mProblem = var4 + "*" + var3;
			System.out.println("What is" + " " + mProblem + "?");
			Scanner userAnswer = new Scanner(System.in);
			int guess = userAnswer.nextInt();
			if(guess == answer){
				System.out.println("Good job, m8.");
			}else System.out.println("Nope.");
			System.out.println("The correct answer was: " + answer);
		}else{
			System.out.println("Invalid choice, terminating.");
		}
		
	}
}
