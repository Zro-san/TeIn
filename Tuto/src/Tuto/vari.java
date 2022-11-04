package Tuto;
public class vari {

	public static void main(String[] args) {
		String name = "Alex";
		String job = "Kek";

		verzweigung(19);
		System.out.println("Ich bin " + name + " und bin ein " + job + ".");
	}
	
	public static void verzweigung(int Uhrzeit) {
		if(Uhrzeit < 12) {System.out.println("Guten Morgen!");}
			else if (Uhrzeit >= 12 & Uhrzeit < 18) {System.out.println("Guten Mittag!");}
			else { System.out.println("Guten Abend!");}
		
		
	}
	
	
}
