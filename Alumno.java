
import java.util.Scanner;

public class Alumno 
{
	public static void main (String [] args) 
	{
		float [] notas = new float [3];
		float prom;
		Scanner tk = new Scanner (System.in);

		for (int i = 0; i <= 2; i++) {
			System.out.println ("Ingrese una nota la nota " + (i + 1) + " :"); 
			notas [i] = tk.nextFloat ();
			
			if (!isNota (notas [i])) {
				System.out.println ("Ingrese una nota válida (del 1 al 7)");
				--i;
			}
		}

		System.out.println ("El promedio de las notas es: " + prom (notas));
	}

	public static float prom (float [] notas)
	{
		float prom = 0;

		for (int i = 0; i <= 2; i++)
			prom += notas [i];

		return prom / notas.length;
	}

	public static boolean isNota (float nota)
	{
		return (nota <= 7 && nota >= 1) ? true : false;
	}
}