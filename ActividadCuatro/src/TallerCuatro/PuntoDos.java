package TallerCuatro;
import java.util.Scanner;
public class PuntoDos {

	public void operacionesDouble() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("elige la logica que quieres ultilizar:" + "\n" + "1. switch   2. if/else");
		int logica = sc.nextInt();
		if(logica==1) {
			
		System.out.println("escriba el primer valor: ");
		double n1 = sc.nextDouble();
		System.out.println("escriba el segundo valor: ");
		double n2 = sc.nextDouble();
		System.out.println("escriba un operador" + "\n" + "1.*   2.+   3./   4.%   5.-");
		int ope = sc.nextInt();
		double resultado;
		
		//con condicional switch
		switch(ope) {
		case 1: 
			resultado = n1*n2;
			System.out.println(" el resultado de multiplicar entre: " + n1 + " * " + n2 + "  =  " + resultado);
			break;
	    case 2:
	    	resultado = n1+n2;
			System.out.println(" el resultado de sumar entre: " + n1 + " + " + n2 + "  =  " + resultado);
			break;
	    case 3:
	    	resultado = n1/n2;
			System.out.println(" el resultado de dividir entre: " + n1 + " / " + n2 + "  =  " + resultado);
			break;
	    case 4:
	    	resultado = (n1/100)*n2;
			System.out.println(" el resultado del porcentaje entre: " + n1 + " % " + n2 + "  =  " + resultado);
			break;
	    case 5:
	    	resultado = n1-n2;
			System.out.println(" el resultado de restar entre: " + n1 + " - " + n2 + "  =  " + resultado);
			break;
		default:
			System.out.println("error: no has elegido una opcion de operador");
		}
		}else if(logica==2) {
		System.out.println("escriba el primer valor: ");
		double n1 = sc.nextDouble();
		System.out.println("escriba el segundo valor: ");
		double n2 = sc.nextDouble();
		System.out.println("escriba un operador" + "\n" + "1.*   2.+   3./   4.%   5.-");
		int ope = sc.nextInt();
		double resultado;
		if(ope==1) {
			resultado = n1*n2;
			System.out.println(" el resultado de multiplicar entre: " + n1 + " * " + n2 + "  =  " + resultado);
		}else if(ope==2) {
			resultado = n1+n2;
			System.out.println(" el resultado de sumar entre: " + n1 + " + " + n2 + "  =  " + resultado);
		}else if(ope==3) {
			resultado = n1/n2;
			System.out.println(" el resultado de dividir entre: " + n1 + " / " + n2 + "  =  " + resultado);
		}else if(ope==4) {
			resultado = (n1/100)*n2;
			System.out.println(" el resultado del porcentaje entre: " + n1 + " % " + n2 + "  =  " + resultado);
		}else if(ope==5) {
			resultado = n1-n2;
			System.out.println(" el resultado de restar entre: " + n1 + " - " + n2 + "  =  " + resultado);
		}else {
			System.out.println("no has elegido una opcion de operador");
		}
		
		}
			
	}
	
}
