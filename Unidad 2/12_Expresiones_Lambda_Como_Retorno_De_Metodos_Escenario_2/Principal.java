
public class Principal{
	public static void main(String[] args) {

		Principal.engine((int x, int y) -> (long x1, long y2) -> x1 + y2);

	}

		public static void engine(CalculadoraInt obj) {

			int x = 2, y = 3;
			CalculadoraLong o = obj.calcular(x, y);
			long resultado = o.calcular((long)x, (long)y);

			System.out.println("\n\n\t Resultado =  " + resultado + "\n\n");

		}

}