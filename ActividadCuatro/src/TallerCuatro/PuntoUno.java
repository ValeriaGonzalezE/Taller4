package TallerCuatro;
import java.util.Scanner;
public class PuntoUno {
	
	public void operadorSentencia() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite el valor de x: ");
		int x = sc.nextInt();
		
		
		//condicion a cumplir
		if(x<=7) {
			//resultado si la operacion es verdadera
			System.out.println("(TRUE) el numero " + x + " es inferior o igual a 7");
		}else {
			//resultado si la operacion es falsa
			System.out.println("(FALSE) el numero " + x + " es superior a 7");
		}
	}

}
