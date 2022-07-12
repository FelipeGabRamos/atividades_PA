import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga um número que deseja que faço a tabuada: ");
		int num = sc.nextInt();
		
		for(int i = 0; i <=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		sc.close();
	}

}
