public class LambdaTest {

	public static void main(String[] args) {

		// Solucion 1
		System.out.println("\n\n\tSolucion 1\n");
		LambdaTest.engine((long x, long y) -> x + y);
		LambdaTest.engine((int x, int y) -> x * y);
		LambdaTest.engine((long x, long y) -> x / y);

		// Solucion 2
		System.out.println("\n\n\n\n\tSolucion 2\n");
		LambdaTest.engine((CalculadoraInt)(x, y) -> x - y);
		LambdaTest.engine((CalculadoraLong)(x, y) -> x % y);

		// Solucion 3
		System.out.println("\n\n\n\n\tSolucion 3\n");
		CalculadoraLong _calLong = (x, y) -> x + y;
		CalculadoraInt _calInt = (x, y) -> x * y;
		LambdaTest.engine(_calLong);
		LambdaTest.engine(_calInt);

		System.out.println("\n");

	}

	// Sobrecarga de Métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calculate(x, y);
		System.out.println("CalculadoraInt == resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calculate(x, y);
		System.out.println("CalculadoraLong == resultado = " + resultado);
	}

}


/*
// Intento

	public static void main(String[] args) {
		LambdaTest.engine((x, y) -> x + y);
		LambdaTest.engine((x, y) -> x * y);
		LambdaTest.engine((x, y) -> x / y);
		LambdaTest.engine((x, y) -> x - y);
		engine((x, y) -> x % y);
	}

	// Sobrecarga de métodos
	private static void engine(Calculadora cal){
		int x = 2, y = 4;
		int resultado = cal.calculadora(x, y);
		System.out.println("Resultado  =  " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		int x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("Resultado  =  " + resultado);
	}
*/