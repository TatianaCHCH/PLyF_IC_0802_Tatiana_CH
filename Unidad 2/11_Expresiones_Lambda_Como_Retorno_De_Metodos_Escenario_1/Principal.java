public class Principal {

	public static void main(String[] args) {
		System.out.println( "\n\n CalculadoraInt --> resultado =  " + Principal.engine_1().calculate(5, 5) + "\n" );
		System.out.println( "\n\n CalculadoraLong --> resultado =  " + Principal.engine_2().calculate(6, 2) + "\n\n" );
	}

	// Retorna un objeto de tipo "CalculadoraInt"
	private static CalculadoraInt engine_1(){
		return (x, y) -> x * y;
	}

	// Retorna un objeto de tipo "CalculadoraInt"
	private static CalculadoraLong engine_2(){
		return (x, y) -> (int)(x - y);
	}

}
//