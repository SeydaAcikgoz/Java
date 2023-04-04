import java.util.ArrayList;
import java.util.Scanner;

public class string_fonksiyonlari_ornek2 {
	public static void main(String[] args) {
		/* 10 adet isim içinden İsim bilgisinin orta karakteri ‘m’ olan isimleri gösteriniz. Örnek: cemal, sami
		(gösterilecek) vb. İsim Listesini ilk başta manuel oluşturunuz. “Ahmet”, “Ali”, “Veli” şeklinde.*/

		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ".ismi girin:");
			String isim = input.nextLine();
			list.add(isim);
		
			if (isim.charAt(isim.length()/2)=='m' ||isim.charAt(isim.length()/2+1)=='m' ||isim.charAt(isim.length()/2-1)=='m' ) {
				list2.add(isim);
			}

		}

		for (String string : list2) {
			System.out.print(string + "\t");
		}
	}
}
