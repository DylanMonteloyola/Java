package loopsDylan;
import java.util.Scanner;
public class loopsDylan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		
		
// 1.)  
/* 
int i=100;  
while (i>=10) {  
	System.out.println("i is "+i);  
i--;  
}  
*/ 
		
		
		
// 2.) A pyramid/staircase made of numbers 1 to 10.
/*
int j, i; 
for (i = 1; i <= 10; i++)  
{  
  for (j = 1 ; j <= i; j++)  
  {  
    System.out.print(j + " ");  
  }   
System.out.println("");  
}  
*/
		
		
		
//3.) RunningTally
/* 
int number = 0; 
int sum = 0; 


System.out.println("Type some numbers and I'll add them up. Type a negative number to see your total."); 
while (number >= 0) { 
sum = number + sum; 
number = sc.nextInt(); 
} 
System.out.println("Your total is " + sum + "."); 
}
*/
 

		
//4.) Bar 
/*
System.out.println("What character do you want your bar to be made of?"); 
final String character = sc.next(); 
	  
System.out.println("How long do you want the bar to be?"); 
int length = sc.nextInt(); 
  
for (int c = 1; c <= 1; c++) { 
for (int i = 0; i <= length; i++) { 
System.out.print(character); 
}  
} 
*/ 
	
		
		
//5.) Triangle
/*
System.out.println("What do you want your triangle to be made of?"); 
final String character = sc.next(); 
	  
int rows; 
System.out.println("How tall do you want your triangle to be?"); 
rows = sc.nextInt(); 
  
for (int i = 1; i <= rows; ++i) { 
for (int j = 1; j <= i; ++j) { 
System.out.print(character); 
} 
System.out.println(); 
} 
*/

		
		
//6.) NumberGuessing
/*
int attempts = 0; 
System.out.println("I have a number between 1 and 100, can you guess it?"); 
int theNumber = (int)(Math.random() * 100 + 1); 
System.out.println("Hint: It's " + (theNumber)+ "."); // For testing. You can erase this line for no hints. 
int myGuess = sc.nextInt(); 
	  
while (myGuess !=theNumber) { 
if (myGuess > theNumber) { 
System.out.println("Your number's too high. Try again."); 
myGuess = sc.nextInt(); 
attempts ++; 
} 
		  
if (myGuess < theNumber) { 
System.out.println("Your number's too low. Try again."); 
myGuess = sc.nextInt(); 
attempts ++; 
} 
} 
	  
if (myGuess == theNumber) { 
System.out.println("You guessed it. Nice job!");  
System.out.println("It took you " + attempts + " tries!"); 
}  		
*/		
		
		

}	
}
