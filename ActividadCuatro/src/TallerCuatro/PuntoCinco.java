package TallerCuatro;
import java.util.Scanner;
public class PuntoCinco {

	public void universidadNotas() {
		 Scanner sc = new Scanner(System.in); 
		 
		int x=0;
		if(x==0) {
			System.out.println( " ingresa la cantidad de alumnos de tu instituto " );
		int alumnos = sc.nextInt();
		
		if(alumnos>=1400) {
			System.out.println("usted obtuvo el 1er o 2do lugar en la calificacion mas alta del instituto? "+ "\n" + "1. si    2. no");
			int lugar = sc.nextInt();
			if(lugar==1) {
				System.out.println("usted es aceptado en la universidad Mountville");
			}else {
				x=x+1;
			}	
		}else {
			x=x+1;
		}
		}
		if(x==1) {
			
		System.out.println("cual fue su promedio: ");
			double prom = sc.nextDouble();
			
			if(prom>=4 && prom<=5) {
				System.out.println("digite su puntuacion en el SAT:");
				int sat = sc.nextInt();
				if(sat>=1100) {
					System.out.println("usted es aceptado en la universidad Mountville ");
				}else {
					x=x+1;
				}		
			}else if(prom>=3.5 && prom<4) {
					System.out.println("digite su puntuacion en el SAT:");
						int sat = sc.nextInt();
						if(sat>=1300) {
							System.out.println("usted es aceptado en la universidad Mountville ");
				        }else {
				        	x=x+1;
				        }
				
			}else if(prom>=3.0 && prom<3.5) {
				System.out.println("digite su puntuacion en el SAT:");
					int sat = sc.nextInt();
					if(sat>=1500) {
						System.out.println("usted es aceptado en la universidad Mountville ");
			        }else {
			        	System.out.println("usted no es aceptado en la universidad Mountville");;
			        }
			
		   }else if(prom<3) {
			System.out.println("usted no es aceptado en la universidad Mountville");
		   }
	
		if(x>=2) {
			System.out.println("usted no es aceptado en la universidad Mountville");
		}

}
	}
}
