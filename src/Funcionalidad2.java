import java.util.Scanner;

public class Funcionalidad2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
			
			if(n1 > n2) {
				System.out.println("El numero " + n1 + " es mayor " + n2 );
			}else {
				System.out.println("El numero " + n1 + " es menor " + n2 );
			}

	}

}
