public class LambdaTest {

	public static void main(String[] args) {

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