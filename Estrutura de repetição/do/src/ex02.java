import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double medV = 0, medA = 0;
		int i = 0, cod, numV, numA, maior = 0, menor = 999999999, cidMa = 0, cidMe = 0, cont = 0;
		do {

			System.out.print("Diga o c�digo da cidade: ");
			cod = sc.nextInt();
			System.out.print("Diga o n�mero de ve�culos de passeio: ");
			numV = sc.nextInt();
			System.out.print("Diga o n�mero de acidentes com v�timas: ");
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
		System.out.println("O maior ind�ce � de: "+maior+" da cidade: "+cidMa+"\nO menor in�dice � de: "+menor+" da cidade: "+cidMe);
		System.out.println("A m�dia de ve�culos das cinco cidades � de "+(medV/5));
		System.out.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos: "+(medA/cont));

		sc.close();

	}

}
