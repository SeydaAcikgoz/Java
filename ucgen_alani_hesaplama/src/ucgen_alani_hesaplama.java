import java.util.ArrayList;
import java.util.Scanner;
/*1. x,y şeklinde koordinatları verilen bir üçgenin alanını aşağıdaki denkleme göre arraylist kullanarak
hesaplama:Alan(ABC)=1/2 |x1.y2+x2.y3+x3.y1−(y1.x2+y2.x3+y3.x1)|
*/
public class ucgen_alani_hesaplama {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		ArrayList<Integer> x_list = new ArrayList<Integer>();		
		ArrayList<Integer> y_list = new ArrayList<Integer>();		

		System.out.print("x1:");
		int x1 = giris.nextInt();
		x_list.add(x1);
		System.out.print("y1:");
		int y1 = giris.nextInt();
		y_list.add(y1);

		System.out.print("x2:");
		int x2 = giris.nextInt();
		x_list.add(x2);
		System.out.print("y2:");
		int y2 = giris.nextInt();
		y_list.add(y2);


		System.out.print("x3:");
		int x3 = giris.nextInt();
		x_list.add(x3);
		System.out.print("y3:");
		int y3 = giris.nextInt();
		y_list.add(y3);

		
		
		double alan=Math.abs((x_list.get(0)*y_list.get(1)+(x_list.get(1))*y_list.get(2)+(x_list.get(2))*(y_list.get(0)))-
				((y_list.get(0))*(x_list.get(1))+(y_list.get(1))*(x_list.get(2))+(y_list.get(2))*(x_list.get(0))))/2;
		System.out.print("Alan:"+alan);
	}
}
