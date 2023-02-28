package TallerCuatro;
import java.util.Scanner;
public class PuntoCuatro {

	public void pesoPlanetas() {
		Scanner sc = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("ingrese su peso");
		double peso = sc.nextDouble();
		
		System.out.println("MENU:"+ "\n" + "1. mercurio"+ "\n" + "2. venus"+ "\n" + "3. marte"+ "\n" + "4. jupiter"+ "\n" + "5. saturno"+ "\n" + "6. urano"+ "\n" + "7. neptuno");
		
		System.out.println("digite el planeta en el que quieras ver tu peso");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			resultado = peso*0.38;
			System.out.println("el peso en mercurio es: " + resultado+ " lbs");
		    break;
		case 2:
			resultado = peso*0.91;
			System.out.println("el peso en venus es: " + resultado+ " lbs");
			break;
		case 3:
			resultado = peso*0.38;
			System.out.println("el peso en marte es: " + resultado+ " lbs");
			break;
		case 4:
			resultado = peso*2.36;
			System.out.println("el peso en jupiter es: " + resultado+ " lbs");
			break;
		case 5:
			resultado = peso*0.92;
			System.out.println("el peso en saturno es: " + resultado+ " lbs");
			break;
		case 6:
			resultado = peso*0.89;
			System.out.println("el peso en urano es: " + resultado+ " lbs");
			break;
		case 7:
			resultado = peso*1.13;
			System.out.println("el peso en neptuno es: " + resultado+ " lbs");
			break;	
		}
		
		
	}
}
