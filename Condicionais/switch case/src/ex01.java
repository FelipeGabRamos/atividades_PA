import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double aumento;
		
		System.out.print("Informe o seu c�digo: ");
		int cod = sc.nextInt();
		
		System.out.print("Informe seu sal�rio: ");
		double sal = sc.nextDouble();
		
		switch(cod) {
		case 1:
			aumento = sal*0.5;
			System.out.println("Seu cargo: Escritu�rio\nSeu aumento: R$"+aumento+"\nSeu novo sal�rio: R$"+(aumento+sal));
			break;
		case 2:
			aumento = sal*0.35;
			System.out.println("Seu cargo: Secret�rio\nSeu aumento: R$"+aumento+"\nSeu novo sal�rio: R$"+(aumento+sal));
			break;
		case 3:
			aumento = sal*0.2;
			System.out.println("Seu cargo: Caixa\nSeu aumento: R$"+aumento+"\nSeu novo sal�rio: R$"+(aumento+sal));
			break;
		case 4:
			aumento = sal*0.1;
			System.out.println("Seu cargo: Gerente\nSeu aumento: R$"+aumento+"\nSeu novo sal�rio: R$"+(aumento+sal));
			break;
		case 5:
			aumento = 0;
			System.out.println("Seu cargo: Escritu�rio\nSeu aumento: R5"+aumento+"\nSeu novo sal�rio: R$"+(aumento+sal));
			break;
		default:
			System.out.println("C�digo inv�lido!");
		}
		
		sc.close();
	}

}
