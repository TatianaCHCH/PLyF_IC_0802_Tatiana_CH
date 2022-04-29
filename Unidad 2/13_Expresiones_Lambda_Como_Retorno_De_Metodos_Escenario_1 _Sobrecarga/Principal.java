public class Principal {

	public static void main(String[] args) {
		System.out.println( "\n\n CalculadoraInt --> resultado =  " + Principal.engine_1().calculate(5, 5) + "\n" );

		

		System.out.println( "\n\n CalculadoraLong --> resultado =  " + Principal.engine_2().calculate(6, 2) + "\n\n" );
	}


	// Retorna un objeto de tipo "CalculadoraInt"
	private static CalculadoraInt engine_1(){
		return (x, y) -> x * y;
	}

	// Retorna un objeto de tipo "CalculadoraLong"
	private static CalculadoraLong engine_2(){
		return (x, y) -> (int)(x - y);
	}


	// Int Sobrecarga 1
	//public static CalculadoraLong engine_1(){
	//	return (x, y) -> x + y;
	//}
	// System.out.println( "\n\n CalculadoraInt --> resultado =  " + Principal.engine_1().calculate(8, 4) + "\n" );

	// Int Sobrecarga 2 
	//private static CalculadoraLong engine_1(int t){
	//	return (x, y) -> (int)(x - y);
	//}
	// System.out.println( "\n\n CalculadoraInt --> resultado =  " + Principal.engine_1(2).calculate(8, 4) + "\n" );

}