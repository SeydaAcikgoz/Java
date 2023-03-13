import java.util.Scanner;

public class yildizlarla_sekil_yapma {
	public static void main(String[] args) {
		Kare();
		Dikdortgen();
		Dik_ucgen();
		Eskenar();
	}

	static void Kare() {
		System.out.println("KARE");
		Scanner input = new Scanner(System.in);
		System.out.print("Kenari giriniz:");
		int a = input.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void Dikdortgen() {
		System.out.println("\nDIKDORTGEN");
		Scanner input = new Scanner(System.in);
		System.out.print("1.kenari giriniz:");
		int a = input.nextInt();

		System.out.print("2.kenari giriniz:");
		int b = input.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void Dik_ucgen() {
		System.out.println("\nDIK UCGEN");
		Scanner input = new Scanner(System.in);
		System.out.print("Sayi giriniz:");
		int a = input.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void Eskenar() {
		System.out.println("\nESKENAR UCGEN");
		int bosluk = 4;
		int yildiz = 1;

		for (int i = bosluk; i >= 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < yildiz; j++) {
				System.out.print("*");
			}
			yildiz += 2;
			System.out.print("\n");
		}
	}
}
