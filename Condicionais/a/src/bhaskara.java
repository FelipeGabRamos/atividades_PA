import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,num3,delta,x1,x2;
		
		System.out.print("Diga o A: ");
		num1 = sc.nextDouble();
		
		System.out.print("Diga o B: ");
		num2 = sc.nextDouble();
		
		System.out.print("Diga o C: ");
		num3 = sc.nextDouble();
		
		delta = (Math.pow(num2, 2))-(4*num1*num3);
		
		x1 = (num2*-1+Math.sqrt(delta))/(2*num1);
		x2 = (num2*-1-Math.sqrt(delta))/(2*num1);
		System.out.println("X1 é: "+x1);
		System.out.println("X2 é: "+x2);
		
		sc.close();
	}

}
