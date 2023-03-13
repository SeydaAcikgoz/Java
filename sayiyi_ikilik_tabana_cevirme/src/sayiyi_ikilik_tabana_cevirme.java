import java.util.Scanner;

public class sayiyi_ikilik_tabana_cevirme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Sayi giriniz:");
		int sayi = input.nextInt();
		System.out.print(sayi + "->");
		ikilik(sayi);

	}

	static void ikilik(int sayi) {
		int dizi[] = new int[20];
		int i = 0;

		while (sayi > 0) {
			dizi[i] = sayi % 2;
			sayi = sayi / 2;
			i++;
		}

		for (int j = i-1; j >= 0; j--) {
			System.out.print(dizi[j]);
		}
	}

}
