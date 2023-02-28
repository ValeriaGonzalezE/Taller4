package TallerCuatro;
import java.util.Scanner;
public class PuntoSeis {
	
	public void examenExonerar() {
		Scanner sc= new Scanner(System.in);
	double average;
	int daysAbsent;
	boolean exempt=false;
	
	
	
	System.out.println("Por favor responda las siguientes preguntas." + "\n");
	System.out.println("Cual es su promedio en la clase?");
	average=sc.nextDouble();
	System.out.println("Cuantas clases te has perdido?");
	daysAbsent=sc.nextInt();
	if(average>=90)
	{
	if(daysAbsent<=3)
	exempt=true;
	}
	else if(average>=80)
	{

	if(daysAbsent<=0)
	exempt=true;
	}
	if(exempt)
	System.out.println("Felicidades! Estas exonerado del examen.");
	else
	System.out.println("No estas exonerado del examen.");
	}//end of main
}//end of class
