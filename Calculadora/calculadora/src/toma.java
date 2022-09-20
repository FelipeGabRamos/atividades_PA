import java.util.Scanner;

public class toma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1 - Soma\n2 - Multiplicação\n3 - Divisão\n4 - Subtração\n5 - Potenciação\n6 - Porcentagem\n7 - Raiz quadrada\n\nDiga qual operação deseja realizar:");
		int escolha = sc.nextInt();
		double num = 0, num2 = 0, soma = 0, mult = 0;
		int qntd;
		switch (escolha) {
		case 1:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				System.out.print("Diga um número: ");
				num = sc.nextDouble();
				soma += num;
			}
			System.out.println("Soma: " + soma);
			break;
		case 2:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				System.out.print("Diga um número: ");
				num = sc.nextDouble();
				System.out.println("Diga por quanto deseja multiplicar: ");
				num2 = sc.nextDouble();
				System.out.println("Multiplicação: " + (num * num2));
			}
			break;
		case 3:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				do {
					System.out.print("Diga um número: ");
					num = sc.nextDouble();
					System.out.println("Diga por quanto deseja dividir: ");
					num2 = sc.nextDouble();
				} while (num2 == 0);
				System.out.println("Divisão: " + (num / num2));
			}
			break;
		case 4:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <=qntd; x++) {
				System.out.print("Deseja subtrair o\n1 - primeiro pelo segundo\nou\n2 - segundo pelo primeiro? ");
				int esc = sc.nextInt();
				if (esc == 1) {
					System.out.print("Diga um número: ");
					num = sc.nextDouble();
					System.out.print("Diga o segundo número: ");
					num2 = sc.nextDouble();
					System.out.println("Subtração: "+(num - num2));
				} else if (esc == 2) {
					System.out.print("Diga um número: ");
					num = sc.nextDouble();
					System.out.print("Diga o segundo número: ");
					num2 = sc.nextDouble();
					System.out.println("Subtração: "+(num2 - num));
				} else {
					System.out.println("Opção inválida!");
				}
			}
			break;
		case 5:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				System.out.print("Diga um número: ");
				num = sc.nextDouble();
				System.out.print("Diga por quanto deseja potencializar: ");
				int i = sc.nextInt();
				System.out.println("Potenciação de "+num+" por "+i+" "+(Math.pow(num, i)));
			}
			break;
		case 6:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				System.out.print("Diga um número: ");
				num = sc.nextDouble();
				System.out.print("Diga quantos números tem no total: ");
				int numm = sc.nextInt();
				System.out.println((num*100)/numm+"%");
			}
			break;
		case 7:
			System.out.print("Diga quantos número deseja utilizar (mínimo 1 e máximo 5): ");
			qntd = sc.nextInt();
			for (int x = 1; x <= qntd; x++) {
				System.out.print("Diga um número: ");
				num = sc.nextDouble();
				System.out.println("Raiz quadrada de: "+num+" = "+(Math.sqrt(num)));
			}
			break;
		}
		sc.close();
	}
}