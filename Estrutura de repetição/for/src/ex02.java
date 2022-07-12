import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double med1 = 0, med2 = 0, medh1 = 0, medh2 = 0;
		int cont = 0, cont2 = 0;

		for (int i = 0; i <= 2; i++) {
			int b = 1;
			if (b == 1) {
				for (int a = 0; a <= 11; a++) {
					System.out.print("Diga a idade do jogador: ");
					int idade = sc.nextInt();
					System.out.print("Diga o peso do jogador: ");
					double peso = sc.nextDouble();
					System.out.print("Diga a altura do jogador: ");
					double h = sc.nextDouble();
					if (idade < 18) {
						cont++;
					}
					if(peso==80) {
						cont2++;
					}
					med1 += idade;
					medh1 += h;
				}
			} else {
				for (int a = 0; a <= 11; a++) {
					System.out.print("Diga a idade do jogador: ");
					int idade = sc.nextInt();
					System.out.print("Diga o peso do jogador: ");
					double peso = sc.nextDouble();
					System.out.print("Diga a altura do jogador: ");
					double h = sc.nextDouble();
					if (idade < 18) {
						cont++;
					}
					if(peso==80) {
						cont2++;
					}
					med2 += idade;
					medh2 += h;
				}
			}
			b++;
		}
		System.out.println("A quantidade de jogadores com idade inferior a 18 anos é de: " + cont);
		System.out.println("A média de idades dos jogadores do time A é de: " + (med1 / 11)
				+ "\nA média de idades dos jogadores do time B é de: " + (med2 / 11));
		System.out.println("Média de altura de todos os jogadores do campeonato: "+((medh1+medh2)/22));
		System.out.println("A porcentagem de todos os jogadores com mais de 80 kg é de: "+((cont2*100)/22));
		sc.close();
	}

}
