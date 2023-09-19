
public class fermat_sayi {
	public static void main(String[] args) {
		int fermat;
		for (int i = 0; i < 6; i++) {
			fermat = (int) (Math.pow(2, Math.pow(2, i)) + 1);
			System.out.println(fermat);
		}
	}
}
