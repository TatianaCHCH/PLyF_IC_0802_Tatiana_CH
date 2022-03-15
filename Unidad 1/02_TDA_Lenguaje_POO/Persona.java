import java.util.Scanner;

public class Persona{

	// Atribs
	public String nombre;
	public String apellido;
	public int edad;
	public char genero;

	// Method
	public static void beber(String name, int age){
		if(age >= 18){
			System.out.println("\n " +name+ "  la cantidad aproximada de agua que debes beber para tu edad de  " +age+ "  es:  2.5 L \n");
		}
		else{
			System.out.println("\n " +name+ "  la cantidad aproximada de agua que debes beber para tu edad de  " +age+ "  es:  2 L \n");
		}
	}
	public static void mensajito(String name, char gender){        
	    if (gender=='F' || gender=='f' ){
	    	System.out.println("\n Amiga  " +name+ "  ten un excelente viernes \n");
		}
		if (gender=='M' || gender=='m'){
	        System.out.println("\n Amigo  " +name+ "  ten un excelente viernes \n");
		}
		else{
	        System.out.println("\n Amigo Marciano ten un excelente viernes \n");
		}
	}

	
	//MAIN
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Persona persona= new Persona();
		System.out.println("Ingrese el nombre");
		persona.nombre=sc.nextLine();
		System.out.println("Ingrese el apellido");
		persona.apellido=sc.nextLine();
		System.out.println("Ingrese la edad");
		persona.edad=sc.nextInt();
		System.out.println("Ingrese el genero");
		persona.genero=sc.next().charAt(0);

		String name=persona.nombre;
		int age=persona.edad;
		char gender=persona.genero;

		beber(name, age);
		mensajito(name, gender);
	}

}