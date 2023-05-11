import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		double boy = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		int kilo = scanner.nextInt();
		
		double vki = kilo / (boy * boy);
		System.out.print("Vücut Kitle indeksiniz: " + vki);
	}
}
