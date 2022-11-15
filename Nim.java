package Verzweigungen;
import java.util.Scanner;
public class Nim {

	public static void main(String[] args) {
		int spieler1;
		int streichhölzer = 21;
		int comp;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Spieler 1 geben sie die Anzahl der Streichhölzer zwischen 1 und 3 an: " );
			spieler1 = sc.nextInt();
			if (spieler1 == 1 || spieler1 == 2 || spieler1 == 3) {
			streichhölzer = streichhölzer - spieler1;
			
			comp = 4 - spieler1;
			System.out.println("Der Computer zieht " + comp + " Streichholz/hölzer." );
			streichhölzer = streichhölzer - comp;
			System.out.println("Verbleibend: " + streichhölzer); }
			else {
			System.out.println("Ungültige Eingabe!");
			System.exit(1);
			}
		}while(streichhölzer > 1);
		
		System.out.println(streichhölzer);
		if (streichhölzer == 1) {
			System.out.println("Computer gewinnt!");
		}

	}

}
