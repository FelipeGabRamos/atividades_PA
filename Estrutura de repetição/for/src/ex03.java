import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal = 1212, salP = 0, total = 0, medM = 0, medF = 0, maior = 0;
		int cont = 0, contM = 0, contF = 0, M = 0, num = 0, numP = 0;
		for (int i = 0; i < 3; i++) {
			salP = 0;
			System.out.print("Diga o seu n�mero de oper�rio: ");
			num = sc.nextInt();
			System.out.print("Diga o n�mero de pe�as f�bricadas por voc�: ");
			numP = sc.nextInt();
			System.out.print("Diga o seu sexo: (M OU F) ");
			String sexo = sc.next();
			cont+=numP;
			if (numP <= 30) {
				salP = sal;
			} else if (numP > 30 && numP <= 50) {
				salP = sal * 1.03;
			} else {
				salP = sal * 1.05;
			}
			if(salP>maior) {
				maior = salP;
				M = num;
			}
			if(sexo.equals("M") || sexo.equals("m")) {
				medM += numP;
				contM++;
			}else if(sexo.equals("F") || sexo.equals("f")){
				medF += numP;
				contF++;
			}else {
				System.out.println("Sexo inv�lido!");
			}
			total+=salP;
			System.out.println("Seu n�mero de oper�rio: "+num+"\nSeu sal�rio: "+salP);
		}
		System.out.printf("A folha total de pagamento da f�brica � de: %.2f",total);
		System.out.println("\nN�mero total de pe�as f�bricadas: "+cont);
		System.out.println("M�dia de pe�as fabricadas por homens: "+(medM/contM));
		System.out.println("M�dia de pe�as fabricadas por homens: "+(medF/contF));
		System.out.printf("O funcion�rio de n�mero "+M+" ficou com o maior sal�rio, com R$%.2f",maior);
		

		sc.close();
	}

}
