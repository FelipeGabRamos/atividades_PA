import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;
		
		System.out.println("Digite a primeira nota: ");
		nota1=sc.nextDouble();
		System.out.println("Digite a primeira nota: ");
		nota2=sc.nextDouble();
		System.out.println("Digite a primeira nota: ");
		nota3=sc.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		if(media>=7) {
			System.out.println("Aprovado");
		}else if(media>=3 && media<7) {
			System.out.println("Em exame");
		}else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
