package Entidades;
//Se le tiene que dar la instuccion de que debe heredar

public class Empleado extends Persona {
	
	//1.Atributos o priopiedades
	public String numEmpleado;
	public String nss;
	public String puesto;


	//2.Constructor con parametros (heredamos la "mitad" del constructor de persona)
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //nos indica que heredamos (esto en una clase superior)
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	//3. Metodo para imprimir informacion empleado
	       public void mostrarInformacion() {
	            System.out.println("Nombre: " + nombre);
	            System.out.println("Edad: " + edad);
	            System.out.println("Correo: " + correo);
	            System.out.println("Telefono: " + telefono);
	            System.out.println("Numero Empleado: " + numEmpleado);
	            System.out.println("Numero Seguro Social: " + nss);
	            System.out.println("Puesto: " + puesto);
	        }//cierre mostrarInformacin
	

	public static void main(String []arg) {

}//Cierre de mi metoos main
	} // Cierre de clss
