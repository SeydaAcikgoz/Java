import java.util.Scanner;

public class harshad_sayi {
	/*
	 * 7. Belirli bir tabanda rakamları toplamına tam bölünen sayılara Harshad
	 * sayısı denir. Girilen sayının Harshad sayı olup olmadığını bulunuz.
	*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayiyi giriniz: ");
		int sayi = input.nextInt();
		int ilksayi = sayi;
		int toplam = 0;

		while (sayi > 0) {
			int kalan = sayi % 10;
			toplam += kalan;
			sayi /= 10;
		}

		if (ilksayi % toplam == 0) {
			System.out.println(ilksayi + " Harshad sayidir.");
		}

		else {
			System.out.println(ilksayi + " Harshad sayi degildir.");
		}
	}
}
