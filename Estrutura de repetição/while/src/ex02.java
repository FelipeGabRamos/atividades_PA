import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double num = sc.nextDouble();
		
		while(num > 0) {
			
			System.out.println("Valor lido: "+num);
			System.out.println("Quadrado do valor: "+Math.pow(num, 2));
			System.out.println("Cubo do valor: "+Math.pow(num, 3));
			System.out.println("Raiz quadrada do valor: "+Math.sqrt(num));
			System.out.println("Digite outro número: ");
			num = sc.nextDouble();
		}
		sc.close();
	}

}
