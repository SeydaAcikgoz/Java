import java.util.Scanner;

public class palindrom_kelime {
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Metin giriniz:");
		String metin = input.nextLine();

		if (palindrom(metin) == true) {
			System.out.println(metin + "  palindromdur.");
		} else {
			System.out.println(metin + "  palindrom degildir..");

		}

	}

	static boolean palindrom(String metin) {
		int i = 0;
		int j = metin.length() - 1;

		while (i < j) {
			if (metin.charAt(i) != metin.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
