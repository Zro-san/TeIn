package Tuto;
import java.util.Scanner;


public class w�hrung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben sie ihren Wert in EUR ein: ");
		double money = sc.nextDouble();
		euroindollar(money);
		//euroinyen(money);
		
		
		
	}
	public static void euroindollar(double eur) {
		System.out.println("Neuer Wert in Dollar: " + (eur*1.0));
	}

	public static void euroinyen(double eur) {
		System.out.println("Neuer Wert in Yen" + (eur*141.64));
	}

	} 

//euro = "€"; €
//dollar = "$"; $
//yen = "¥"; ¥