package hatayakalama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hatarunner {

	
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("bir say� giriniz...: ");
		 
		 String[] ifade = {"1","2"};
		
		try {
			 int sayi1 = sc.nextInt();
			 System.out.println(ifade[-1]);
			 int toplam = sayi1/0;
			 System.out.println("Ba�ar�l� bir �ekilde rakam al�nd�");
		} catch (InputMismatchException e) {
			System.out.println("bir hata ile kar��la��ld�.");
			System.out.println(e.toString());
		} catch(ArithmeticException ex) {
			System.out.println("Aritmetik bir hata oldu..:"+ex.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bilinmeyen bir hata oldu..:"+e.toString());
		}finally {
			System.out.println("Her hal�karda �al���r�m....");
		}
		 
		
	}
	
}




