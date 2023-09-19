import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_ornek {
	public static void main(String[] args) {
		ArrayList<Double> List=new ArrayList<Double>();
		SayiListesiOlustur(List);
		System.out.println();
		Siralama(List);
		
       		Scanner input=new Scanner(System.in);
		
		System.out.println("sayi giriniz:");
		double sayi=input.nextDouble();
		System.out.println(sayi);
		
		System.out.println();
		SayiEkle(List, sayi);
	}
	
	static void SayiListesiOlustur(ArrayList<Double> List){
		for(int i=0;i<10;i++)
		{
			List.add((Math.random()*100)+1);
		}
		ListeyiYazdir(List);
	}
	
	static void ListeyiYazdir(ArrayList<Double> List){
		for (Double deger : List) 
		{
			System.out.println(deger+"  ");
		}
		System.out.println();
	}
	
	static void Siralama(ArrayList<Double> List){
		double yedek;
		int minidex;
		
		for(int i=0;i<List.size()-1;i++)
		{
		   	minidex=i;
		   	
		   	for(int j=i+1;j<List.size();j++)
		   	{
		   		if (List.get(j)<List.get(minidex))
		   		 minidex=j;
		   	}   
			yedek=List.get(i);
			List.set(i,List.get(minidex));
			List.set(minidex,yedek);
	 	} 
		ListeyiYazdir(List);
	}
	
	static void SayiEkle(ArrayList<Double> List,double sayi){
		int sayac=0;
		for(int i=0;i<List.size();i++)
		{
			if(sayi<List.get(i))
			{
				List.add(i, sayi);
				sayac=1;
				break;
			}
		}
		if(sayac==0)
		{
			List.add(sayi);
		}
		ListeyiYazdir(List);
	}
}
