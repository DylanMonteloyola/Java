
		import java.util.Scanner;  

		   

		public class DecisionMaking {  

		public static void main(String[] args) {  

		// TODO Auto-generated method stub  

		  

		{ 

		/* 

		// 1.) PASSWORD CODE  

		final String theWord = "Dragon";  

		Scanner sc = new Scanner(System.in);  

		System.out.println("If you can guess the word, I'll tell you something. What's your guess?");  

		String myGuess = sc.next();  

		boolean win=false; 

		while(!win) { 

		if (myGuess.equals(theWord))  

		{  

		System.out.println("Nice. The letters  p, q, b, and d are the same letter. They're all just flipped around.");  

		win = true; 

		}   

		else   

		{  

		System.out.println("Nope. Try again.");   

		myGuess = sc.next(); 

		}  

		} 

		sc.close(); 

		}  

		} 

		} 

		*/ 

		/* 

		//2.) GRADEBOT CODE 

		System.out.print("What was your test out of?"); 

		double outOf = sc.nextDouble(); 

		System.out.print("What did you get?"); 

		double myMark = sc.nextDouble(); 

		int percent = (int)(100*(myMark/outOf)); 

		System.out.println("You got a " + percent + "%"); 

		if (percent >= 1 && percent <= 49) 

		{ 

		System.out.println("You got an F. Oof... that's rough, buddy."); 

		} 

		if (percent >= 50 && percent <= 59) 

		{ 

		System.out.println("You got a C-. You can do better than that!"); 

		}  

		if (percent >= 60 && percent <= 66) 

		{ 

		System.out.println("You got a C. That's okay... Could've been better, though."); 

		} 

		if (percent >= 67 && percent <= 72) 

		{ 

		System.out.println("You got a C+. That's nice..."); 

		} 

		if (percent >= 73 && percent <= 85) 

		{ 

		System.out.println("You got an B! That's pretty good!"); 

		} 

		if (percent >= 86 && percent <= 100) 

		{ 

		System.out.println("You got an A! Way to go!!"); 

		} 

		else 

		{ 

		System.out.println("How did that happen? |:I"); 

		} 

		}  

		}  

		*/ 

		 

		//3.) MAGIC 8-BALL CODE 

		System.out.println("What's your question, human?"); 

		Scanner scan = new Scanner(System.in); 

		scan.nextLine(); 

		scan.close(); 

		int randomNumber = (int)(Math.random() * 20 + 1); 

		if (randomNumber == 1) 

		{ 

		System.out.println("I think that's a good idea."); 

		} 

		if (randomNumber == 2) 

		{ 

		System.out.println("Wise choice."); 

		} 

		if (randomNumber == 3) 

		{ 

		System.out.println("I'd say go for it."); 

		} 

		if (randomNumber == 4) 

		{ 

		System.out.println("One word: yes."); 

		} 

		if (randomNumber == 5) 

		{ 

		System.out.println("HELL YEAH!"); 

		} 

		if (randomNumber == 6) 

		{ 

		System.out.println("Uhhh... no."); 

		} 

		if (randomNumber == 7) 

		{ 

		System.out.println("Nah, that sounds bad."); 

		} 

		if (randomNumber == 8) 

		{ 

		System.out.println("Do you think that's a good idea? Because I don't."); 

		} 

		if (randomNumber == 9) 

		{ 

		System.out.println("No, not really."); 

		} 

		if (randomNumber == 10) 

		{ 

		System.out.println("I have no idea."); 

		} 

		if (randomNumber == 11) 

		{ 

		System.out.println("Why are you asking me this?"); 

		} 

		if (randomNumber == 12) 

		{ 

		System.out.println("You know that answer to that already."); 

		} 

		if (randomNumber == 13) 

		{ 

		System.out.println("My opinion on this matter is irrelevant."); 

		} 

		if (randomNumber == 14) 

		{ 

		System.out.println("Vanilla ice cream sounds so good righ—What? What was the question again?"); 

		} 

		if (randomNumber == 15) 

		{ 

		System.out.println("Go ask another 8-ball for an answer."); 

		} 

		if (randomNumber == 16) 

		{ 

		System.out.println("Hmmm..."); 

		} 

		if (randomNumber == 17) 

		{ 

		System.out.println("Flip a coin on it!"); 

		} 

		if (randomNumber == 18) 

		{ 

		System.out.println("Is thinking really that difficult? Is being human really that difficult?"); 

		} 

		if (randomNumber == 19) 

		{ 

		System.out.println("Is the sky blue?"); 

		} 

		if (randomNumber == 20) 

		{ 

		System.out.println("What a dumb question."); 

		} 

		} 

		} 

		}  
