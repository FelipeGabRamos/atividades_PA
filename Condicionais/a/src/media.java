import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;
		
		System.out.print("Diga a primeira nota do aluno: ");
		nota1 = sc.nextDouble();
		System.out.print("Diga a segunda nota do aluno: ");
		nota2 = sc.nextDouble();
		System.out.print("Diga a terceira nota do aluno: ");
		nota3 = sc.nextDouble();
		
		double mediaP =(nota1*2+nota2*3+nota3*5)/(1+3+5);
		
		if (mediaP>=8) {
			System.out.println("O conceito do aluno é A!");
		}else if(mediaP>=7 && mediaP<8) {
			System.out.println("O conceito do aluno é B!");
		}else if(mediaP>=6 && mediaP<7) {
			System.out.println("O conceito do aluno é C!");
		}else if(mediaP>=5 && mediaP<6) {
			System.out.println("O conceito do aluno é D!");
		}else {
			System.out.println("O conceito do aluno é E!");
		}
		
		sc.close();
	}

}
