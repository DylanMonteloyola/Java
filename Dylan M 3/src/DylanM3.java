import java.util.Scanner;

public class DylanM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
// 4
		/*
// a.) AreaToRadius	
		System.out.println("What is the area?");
		double area = sc.nextDouble();
double radius = Math.sqrt(area/Math.PI);
		System.out.println("The radius of the circle is:" + radius);
		*/
		
		
		/*
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
		*/
		
// c.) MortgageCalculator

		/*
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
		*/
		
// d.) Dice Rolls
		System.out.println("Rolling...");
		for(int i=1; i<=10; i++) {
			int roll1 = (int)(Math.random() * 6 + 1);
			System.out.println("Roll "+i+" is "+ roll1);
		}
	}

}
