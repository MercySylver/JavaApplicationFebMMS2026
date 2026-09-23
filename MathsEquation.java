import java.util.Scanner;

public class MathsEquation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
		int sum5th_7th = 0;
		int sum1st_9th = 0;
		
		System.out.print("Enter the first number: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter the third number: ");
		num3 = scan.nextInt();
		
		System.out.print("Enter the fourth number: ");
		num4 = scan.nextInt();
		
		System.out.print("Enter the fifth number: ");
		num5 = scan.nextInt();
		
		System.out.print("Enter the sixth number: ");
		num6 = scan.nextInt();
		
		System.out.print("Enter the seventh number: ");
		num7 = scan.nextInt();
		
		System.out.print("Enter the eighth number: ");
		num8 = scan.nextInt();
		
		System.out.print("Enter the ninth number: ");
		num9 = scan.nextInt();
		
		System.out.print("Enter the tenth number: ");
		num10 = scan.nextInt();
		
		sum5th_7th = num5 + num6 + num7;
		sum1st_9th = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
		int difference = sum1st_9th - sum5th_7th;
		
		System.out.println("The difference is "+ difference);
	}
}