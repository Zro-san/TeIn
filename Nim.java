package Verzweigungen;
import java.util.Scanner;
public class Nim {

	public static void main(String[] args) {
		int spieler1;
		int streichh�lzer = 21;
		int comp;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Spieler 1 geben sie die Anzahl der Streichh�lzer zwischen 1 und 3 an: " );
			spieler1 = sc.nextInt();
			if (spieler1 == 1 || spieler1 == 2 || spieler1 == 3) {
			streichh�lzer = streichh�lzer - spieler1;
			
			comp = 4 - spieler1;
			System.out.println("Der Computer zieht " + comp + " Streichholz/h�lzer." );
			streichh�lzer = streichh�lzer - comp;
			System.out.println("Verbleibend: " + streichh�lzer); }
			else {
			System.out.println("Ung�ltige Eingabe!");
			System.exit(1);
			}
		}while(streichh�lzer > 1);
		
		System.out.println(streichh�lzer);
		if (streichh�lzer == 1) {
			System.out.println("Computer gewinnt!");
		}

	}

}
