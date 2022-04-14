// Expresiones lambda sin parámetros

public class LambdaTest{

	public static void main(String[] args) {
		
		// Expresión Lambda => representa un objeto de una interfaz funcional

		//Implementación del método abstracto "saludar()" de la intf funct
		FunctionTest ft = () -> System.out.println("Hola Mundo");

		ft.saludar();

	}
}