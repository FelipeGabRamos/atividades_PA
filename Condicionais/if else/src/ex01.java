import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		String resp;
		System.out.println("Voc� quer somar dois n�meros ou quer a raiz de um n�mero? ");
		resp = sc.next();
		if(resp.equals("somar") || resp.equals("SOMAR") || resp.equals("Somar")) {
			System.out.println("Diga o primeiro n�mero: ");
			num1 = sc.nextDouble();
			System.out.println("Diga o segundo n�mero: ");
			num2 = sc.nextDouble();
			System.out.println("A soma � "+(num1+num2));
		}else if (resp.equals("raiz") || resp.equals("Raiz") || resp.equals("RAIZ")) {
			System.out.println("Diga o n�mero: ");
			int num3 = sc.nextInt();
			System.out.println("A raiz de "+num3+" � "+Math.sqrt(num3));
		}else {
			
		}
		
		sc.close();
	}

}