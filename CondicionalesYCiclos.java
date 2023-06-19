package condicionalesYciclo;

import java.util.Scanner;

public class CondicionalesYCiclos {
	public static void main(String[] args) {
	
	///	final int edad=31; //Que esta varieable es constante, a tiene un valor final
		//edad=55;
		//System.out.println("la edad es: " + edad);
		
		/*
		 * Condicionales
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		//Nenito =new Gatito (parametros);
		//Java, Crea un nuevo objeto Scaner, Llamalo hora y este seraun nuevo objeto de la clase Scanner, que tienen los argumentos para guardar la informacion que le pase como entrada
		Scanner valorIngresado = new Scanner(System.in);
	
		System.out.println("Por favor ingresa una hora en formato de 24 horas");
	
	//var valorIngresado = promp("mensaje") en una sola linea (decalor variable, asigno promp , y la info del prompt y la info del prompt la guardo en esa variable
		
		int hora = valorIngresado.nextInt();  //Usa la informacion del objeto
				//int hora =13; declaramos una variable
				
				if(hora >=0 && hora <=23) {//que es una hora valida 	
					System.out.println("Hora ingresada correctamente");
					if (hora>=0 && hora <=11) {
						System.out.println("Buenos dias solecito");
					}else if (hora>=12&& hora <=18) {
						System.out.println("Buenas tardes que calor hace");
					}else if (hora>=19&& hora <=24) {
						System.out.println("Buenas noches a mimir");
					}else {
						System.out.println("Es de madrugada, no es bueno desvelarse");
					}
				}else {
					System.out.println("error, asashora mal ingresa");
				}//Cierre del if general
		valorIngresado.close(); //Cierre del Scanner
	
		
		/*Condicional switch*/
	
		int opcion =1;
		switch (opcion) {
		case 1 :
			System.out.println("Bienvenido al sitema de reservas");
			//logica de negocio para a funcion de reservas
			//reservas(); //se invocan de la misma manera con ; 
			break;
		case 2 :
			System.out.println("Bienvenido al sitema de check-in");
			break;
		case 3 :
			System.out.println("Bienvenido al sitema de check-out");
			break;
	
		default:
			System.out.println("opcion Invalida");
			break;
		}// Cierre del switch

		//Ejemplo de switch anidado
		
		
		
		
	} //Cierre del metodo Main

}
