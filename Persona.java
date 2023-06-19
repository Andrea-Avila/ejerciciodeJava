package Entidades;

public class Persona {
	//1. Propiedades o Atributos
	public String nombre;
	public int edad;
	public String correo;//Undefind
	public String telefono; //null
	
	
	//2.Constructor (con parametros
		public  Persona(String nombre, int edad,String correo,String telefono) {
			this.nombre =nombre;
			this.edad =edad;
			this.correo =correo;
			this.telefono =telefono;
		}//Cierre de constructor
	
		
		
		//Sobrecarga de metodos (Overloading) constructor con 3
		public  Persona(String nombre, int edad,String correo) {
			this.nombre =nombre;
			this.edad =edad;
			this.correo =correo;
		}//Cierre de constructor

		
		
		//Sobrecarga de metodos (Overloading) constructor con 2
	public  Persona(String nombre, int edad) {
			this.nombre =nombre;
			this.edad =edad;
		}//Cierre de constructor
	//3.Metodos
		
		public void mostrarInformacion () {
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Correo: " + correo);
			System.out.println("Telefono: " + telefono);
			System.out.println(">---------------------<");
			
		} //Cierre de nuestro metodo mostrarInformacion;
	
	public static void main(String []arg) {
		
		//instancia de un objeto.. llamado persona
		Persona Felipe =new Persona ("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		Felipe.mostrarInformacion();

		Persona Andrea =new Persona ("Andrea",25 , "andrea009795@gmail.com", "19364922735");
		Andrea.mostrarInformacion();
		Persona Claudia =new Persona ("Claudia",27, "claudia3719@gmail.com");
		Claudia.mostrarInformacion();
		Persona Dulce =new Persona ("Dulce", 29, "dulce134@gmail.com", "7131565695");
		Dulce.mostrarInformacion();
		Persona Carlos =new Persona ("Carlos", 25, "carlangas1212@gmail.com", "74487263791");
		Carlos.mostrarInformacion();
	}
}
