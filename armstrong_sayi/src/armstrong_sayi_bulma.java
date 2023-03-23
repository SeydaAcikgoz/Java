import java.util.Scanner;

public class armstrong_sayi_bulma {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += (int) Math.pow(basValue, basNumber);
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
        }


    }
}
