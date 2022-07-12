import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double medV = 0, medA = 0;
		int i = 0, cod, numV, numA, maior = 0, menor = 999999999, cidMa = 0, cidMe = 0, cont = 0;
		do {

			System.out.print("Diga o código da cidade: ");
			cod = sc.nextInt();
			System.out.print("Diga o número de veículos de passeio: ");
			numV = sc.nextInt();
			System.out.print("Diga o número de acidentes com vítimas: ");
			numA = sc.nextInt();
			if (numA > maior) {
				maior = numA;
				cidMa = cod;
			} else if (numA < menor) {
				menor = numA;
				cidMe = cod;
			}
			medV += numV;
			if (numV < 2000) {
				medA += numA;
				cont++;
			}
			i++;
		} while (i < 5);
		System.out.println("O maior indíce é de: "+maior+" da cidade: "+cidMa+"\nO menor inídice é de: "+menor+" da cidade: "+cidMe);
		System.out.println("A média de veículos das cinco cidades é de "+(medV/5));
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos: "+(medA/cont));

		sc.close();

	}

}
