import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		String resp;
		System.out.println("Você quer somar dois números ou quer a raiz de um número? ");
		resp = sc.next();
		if(resp.equals("somar") || resp.equals("SOMAR") || resp.equals("Somar")) {
			System.out.println("Diga o primeiro número: ");
			num1 = sc.nextDouble();
			System.out.println("Diga o segundo número: ");
			num2 = sc.nextDouble();
			System.out.println("A soma é "+(num1+num2));
		}else if (resp.equals("raiz") || resp.equals("Raiz") || resp.equals("RAIZ")) {
			System.out.println("Diga o número: ");
			int num3 = sc.nextInt();
			System.out.println("A raiz de "+num3+" é "+Math.sqrt(num3));
		}else {
			
		}
		
		sc.close();
	}

}