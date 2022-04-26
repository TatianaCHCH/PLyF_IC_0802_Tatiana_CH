// Expresiones lambda sin parámetros

public class LambdaTest2{

	public static void main(String[] args) {
		
		// Expresión Lambda => representa un objeto de una interfaz funcional

		//Implementación del método abstracto "saludar()" de la intf funct
		FunctionTest ft = () -> System.out.println("Hola Mundo");

		LambdaTest2 objeto = new LambdaTest2();
		objeto.miMetodo(ft);

	}

	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}

}