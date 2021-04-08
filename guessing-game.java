package guess;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		int secretno;
		int guess;
     	boolean correct = false;
		
		Scanner s = new Scanner(System.in);
		System.out.println("give me your secret no");
		secretno = s.nextInt();
		
		while(!correct)
		{
			System.out.println("guess:");
			guess = s.nextInt();
			
			if(guess == secretno) 
			{
			correct = true;
				System.out.println("you are right");
			}
			else if(guess < secretno)
			{
				
				System.out.println("higher");
			}
			else if(guess > secretno)
			{
				System.out.println("lower");
			}
		}
		
	}

}
