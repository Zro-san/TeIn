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
			streichhölzer = streichhölzer - spieler1;
			
			comp = 4 - spieler1;
			System.out.println("Der Computer zieht " + comp + " Streichholz/hölzer." );
			streichhölzer = streichhölzer - comp;
			System.out.println("Verbleibend: " + streichhölzer);
		}while(streichhölzer > 1);
		
		System.out.println(streichhölzer);
		if (streichhölzer == 1) {
			System.out.println("Computer gewinnt!");
		}

	}

}
