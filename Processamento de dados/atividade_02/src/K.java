import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, horasM, minutos, totalM;
		
		System.out.println("Diga as horas: ");
		horas = sc.nextInt();
		
		System.out.println("Diga os minutos: ");
		minutos = sc.nextInt();
		
		horasM=horas*60;
		totalM=horasM+minutos;
		System.out.println(horasM);
		System.out.println(totalM);
		System.out.println(totalM*60);
		sc.close();
	}

}
