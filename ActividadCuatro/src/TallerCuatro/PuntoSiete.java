package TallerCuatro;
import java.util.Scanner;
public class PuntoSiete {
	
	public void pintarHabitacion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite la altura de la habitacion en pies");
		double altura =  sc.nextDouble();
		System.out.println("digite el largo de la habitacion en pies");
		double largo = sc.nextDouble();
		System.out.println("digite el ancho de la habitacion en pies");
		double ancho = sc.nextDouble();
		double piso = ancho*largo;
		double resultado;
		
		resultado = 2*(ancho*largo+largo*altura+altura*ancho);
		double total= resultado - piso;
		System.out.println(total + " pies cuadrados");
		
		double pintura1, pintura2, totalpintura;
		
		if(total<=1200) {
			pintura1 = total/300; 
			System.out.println("usted debe comprar " + Math.ceil(pintura1) + " bote de 1 litro");
		}else {
			pintura2 = total/1500;
			pintura2 = Math.ceil(pintura2)-1;
			pintura1 = total/300;
			totalpintura= total/1800-(Math.ceil(pintura1)/7);
			System.out.println("usted debe comprar " + pintura2 + " botes de 5 litros y " + Math.round(totalpintura) +" botes de 1 litro" );
		}
		
		
	}

}
