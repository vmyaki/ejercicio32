
public class Main {

	public static void main(String[] args) {
		
		/*Otra forma de hacer el hashcode
		 
		 //Hallamos el hashcode del objeto y lo metemos en una variable
		int nombre=planeta1.hashCode();
		
		Usamos el Setter de nombre para meter el hashcode en el nombre
		 pero como es un int, hay que pasarlo a String por lo tanto usamos
		 el metodo integer.toString()
		
		planeta1.setNombre(Integer.toString(nombre));
		
		 */
		
		int contador=0;
		//Miramos en 500 planetas y si hay vida imprimimos su información y cuantos paises son
		for (int i=0; i<=5000; i++)
		{
			
			//Creamos el objeto con el constructor aleatorio
			Planeta planetaAleatorio=new Planeta ();

			//Si el planeta tiene vida imprimimos por pantalla y aumentamos el contador
			if(planetaAleatorio.hayVida()) 
				{
					System.out.println(planetaAleatorio.toString());
					contador++;
			
				}
		
			
		}
		//Imprimos cuantos paises tienen vida
		System.out.println("Total de paises con vida: "+contador);
		
		//Método fusion
		//Creamos el objeto con el constructor pasandole parametros
		Planeta planeta1=new Planeta("Tierra",150,'c',9.8f,true);
		//Creamos el objeto con el constructor aleatorio
		Planeta planetaAleatorio=new Planeta ();
		
		System.out.println("*********************************");
		System.out.println("Método fusión:");
		System.out.println("\nPlaneta a piñón: "+planeta1.toString());
		System.out.println("\nPlaneta aleatorio: "+planetaAleatorio.toString());
		//Ejecutamos metodo fusion
		Planeta planetaFusionado=planeta1.fusion(planetaAleatorio);
		System.out.println("\nPlaneta fusionado: "+planetaFusionado.toString());
		
	}

}
