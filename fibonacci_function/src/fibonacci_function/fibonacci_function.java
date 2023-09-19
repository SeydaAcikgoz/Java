package fibonacci_function;

public class fibonacci_function {
	public static void main(String args[]) {
		int sayi = 11;
		FibHesapla(sayi);
	}

	static void FibHesapla(int sayi) {
		int n1 = 1, n2 = 1, n3;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < sayi; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
