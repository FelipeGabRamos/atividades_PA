import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4;
		
		System.out.println("Diga os n�meros em ordem crescente menos o quarto!");
		System.out.println("Diga o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.println("Diga o segundo n�mero: ");
		num2 = sc.nextDouble();
		System.out.println("Diga o terceiro n�mero: ");
		num3 = sc.nextDouble();
		System.out.println("Diga o quarto n�mero: ");
		num4 = sc.nextDouble();
		
		if(num2<num1 || num3<num1 || num3<num2) {
			System.out.println("Ordem n�o crescente dita!");
		
		}
		if(num1>num2 && num1>num3 && num1>num4) {
			if(num2>num3) {
				System.out.println("Ordem crescente �: "+num3+" "+num2+" "+num1);
			}else {
				System.out.println("Ordem crescente �: "+num2+" "+num3+" "+num1);
			}
		}else if(num2>num1 && num2>num3) {
			if(num1>num3) {
				System.out.println("Ordem crescente �: "+num3+" "+num1+" "+num2);
			}else {
				System.out.println("Ordem crescente �: "+num1+" "+num3+" "+num2);
			}
		}else if(num3>num1 && num3>num2) {
			if(num2>num1) {
				System.out.println("Ordem crescente �: "+num1+" "+num2+" "+num3);
			}else {
				System.out.println("Ordem crescente �: "+num2+" "+num1+" "+num3);
			}
		}
		
	
		
		sc.close();
	}

}
