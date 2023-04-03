import java.util.Scanner;

public class harflerin_frekansini_bulma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("string bir ifade giriniz");
		String myStr = input.nextLine();
		
		System.out.println(myStr);

		for (int i = 0; i < myStr.length(); i++) {
			int sayac = 0, harf = 0;
			for (int j = 0; j < i; j++) {
				if (myStr.charAt(i) == myStr.charAt(j)) {
					sayac = 1;
					break;
				}
			}
			for (int j = i; j < myStr.length(); j++) {
				if (myStr.charAt(i) == myStr.charAt(j)) {
					harf++;
				}
			}
			if (sayac == 0) {
				System.out.println(myStr.charAt(i) + " harfi:" + harf + " kere tekrar etmistir");
			}
		}
	}
}
