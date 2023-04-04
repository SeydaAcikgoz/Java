import java.util.ArrayList;
import java.util.Scanner;

public class string_fonksiyonlari_ornek {
	public static void main(String[] args) {
		/*9 10 tane isim giriniz. Oluşturduğunuz listede ‘a’ ile başlayıp “c” ile biten isimleri listeleyiniz*/

		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ".ismi girin:");
			String isim = input.nextLine();
			list.add(isim);

			int j = 0;
			int k = isim.length() - 1;
			if (isim.startsWith("a")&& isim.endsWith("c")) {
				list2.add(isim);
				
			}
			
		}
		
		for(String string:list2)
		{
			System.out.print(string+"\t");
		}
	}
}
