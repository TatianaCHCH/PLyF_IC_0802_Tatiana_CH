public class Principal {

	public static void main(String[] args) {

		// Solucion 1
		Principal.engine((int x,int y) -> x + y);
		Principal.engine((int x,int y) -> x * y);
		Principal.engine((int x,int y) -> x / y);
		Principal.engine((int x,int y) -> x - y);
		Principal.engine((int x,int y) -> x % y); 

		Principal.engine((long x,long y) -> (int) x + (int) y);
		Principal.engine((long x,long y) -> (int) x * (int) y);
		Principal.engine((long x,long y) -> (int) x / (int) y);
		Principal.engine((long x,long y) -> (int) x - (int) y);
		Principal.engine((long x,long y) -> (int) x % (int) y); 

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