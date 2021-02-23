import java.util.Scanner;

public class DylanM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
// 1
int x, y;
x = 1;
y = 4;
		System.out.println(1/4);
// a.) Answer: 0

		System.out.println(4.0/2);
// b.) Answer: 2.0
			
		System.out.println(1.0/4.0);
// c.) Answer: 0.25
			
int, x, y;
x = 4.0;
y = 2;
// d.) Syntax error.
			
double x, y;
x = 1;
y = 4;
		System.out.println(x/y);
// e.) Syntax error.
			
		
		
// 2
double x, y:
		x = 1.0;
		y = 3.0;
		System.out.println(1/3)
			// a.) Answer: 0.3333333333

		
		
// 3 
int x = (int) Math.PI;
		System.out.println((int)Math.PI);
// This one is just the example ^
				
		System.out.println((int)4.999);
// a.) Answer = 4
				 
		System.out.println((double)0.999);
// b.) Answer = 0.999
				
		System.out.println((double)8);
// c.) Answer = 8.0
				
		System.out.println(((int)4.999)/((int)2.5));
// d.) Answer = 2
				
		System.out.println((int)4.5/0.09);
// e.) Answer = 44.44444444444
				
				
		
		Scanner sc = new Scanner(System.in);
// 4

// a.) AreaToRadius	
		System.out.println("What is the area?");
		double area = sc.nextDouble();
double radius = Math.sqrt(area/Math.PI);
		System.out.println("The radius of the circle is:" + radius);

		
// b.) DistFormula
		System.out.println("What are the coordinates of the first point?");
int x1, y1; 
x1 = sc.nextInt();
y1 = sc.nextInt();
		System.out.println("What are the coordinates of the first point?");
int x2, y2; 
x2 = sc.nextInt();
y2 = sc.nextInt();
double dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("The distance between these points:" + dis);
		
		
// c.) MortgageCalculator
		  System.out.println("What is your initial amount?");
double P;
P = sc.nextDouble();

		System.out.println("What is the interest rate, in decimals?");
double R;
R = sc.nextDouble();

		System.out.println("How many years?");
double N;
N = sc.nextDouble();

double A = P*Math.pow(( 1.00 + R ), N);
		System.out.println("Your final amount is..." + A);
		
		
// d.) DiceRolls
		System.out.println("Rolling...");
		for(int i = 1; i< = 10; i++) {
			int roll1 = (int)(Math.random() * 6 + 1);
			System.out.println("Roll " + i + " is " + roll1);
		}
		}

}
