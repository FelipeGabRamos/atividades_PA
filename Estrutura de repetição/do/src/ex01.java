import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		do {
			System.out.print("Diga um n�mero maior que 1: ");
			num = sc.nextInt();
			for(int i = num; i>0 ; i--) {
				if(num%i==0) {
					cont++;
				}
			}
			if(cont==2) {
				System.out.println("O n�mero � primo!");
			}else {
				System.out.println("O n�mero n�o � primo!");
			}
		} while (num <= 1);

		sc.close();
	}

}
