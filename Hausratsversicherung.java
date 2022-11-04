package verzweigungen;
import java.util.Scanner;
public class Hausratsversicherung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int personen;
		double fläche;
		
		System.out.println("Geben sie die Anzahl der Personen die in dem Haushalt leben ein: ");
		personen = sc.nextInt();
		System.out.println("Geben sie die Größe der Fläche ihres Haushalts ein in m: ");
		fläche = sc.nextDouble();
		
		switch(personen) {
		case 1,2 :
		System.out.println("Ihre Prämie beträgt: " + (10+fläche/2));
		break;
		case (3) :
			System.out.println("Ihre Prämie beträgt: " + (15+fläche));
		break;
		case (4) :
			System.out.println("Ihre Prämie beträgt: " + (15+ 1.5*fläche));
		break;
		default :
			System.out.println("Ihre Prämie beträgt: " + (25+2*fläche));
		break;
		}
	}

}
