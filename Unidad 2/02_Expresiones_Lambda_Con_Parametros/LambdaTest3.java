// Expresiones lambda sin parámetros

public class LambdaTest3{

	public static void main(String[] args) {
		
		// Expresión Lambda => representa un objeto de una interfaz funcional

		Operaciones2 op = (num1, num2) -> System.out.println(num1 + num2);

		// Uso de una expresión
		op.imprimeOperaciones(5, 10);


		// Se cambia la expresión
		LambdaTest3 objeto = new LambdaTest3();
		objeto.miMetodo((num1, num2) -> System.out.println(num1 - num2), 20, 10);
		objeto.miMetodo((num1, num2) -> System.out.println(num1 * num2), 20, 10);

	}

	public void miMetodo(Operaciones2 op, int num1, int num2){
		op.imprimeOperaciones(num1, num2);
	}

}