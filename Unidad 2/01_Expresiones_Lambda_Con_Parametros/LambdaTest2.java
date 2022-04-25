// Expresiones lambda sin parámetros

public class LambdaTest2{

	public static void main(String[] args) {
		
		// Expresión Lambda => representa un objeto de una interfaz funcional

		Operaciones op = (num1, num2) -> System.out.println(num1 + num2);

		
		// Secambia la expresión
		LambdaTest2 objeto = new LambdaTest2();
		objeto.miMetodo(op, 10, 10);

	}

	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeSuma(num1, num2);
	}

}