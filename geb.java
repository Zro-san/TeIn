package verzweigungen;
import java.util.*;
import java.time.LocalDate;
public class geb {
	public static void main(String[] args) {
          LocalDate current_date = LocalDate.now();
          int current_Year = current_date.getYear();
          int current_day = current_date.getDayOfMonth();
          int current_month = current_date.getMonthValue();
         
          
		System.out.println("Datum eingeben in dd.MM.yyyy Format: ");
		Scanner sc = new Scanner(System.in);
		String datum = sc.nextLine();
		String[] daten = datum.split("\\.");
		 
		int tag = Integer.parseInt(daten[0]);
		int monat = Integer.parseInt(daten[1]);
		int jahr =Integer.parseInt(daten[2]);
		
		int alter =current_Year-jahr;
		if (tag == current_day && monat == current_month) {
			System.out.println("Alles gute zum " + alter + ". Geburtstag!");
			
		}else if(tag >= current_day && monat >= current_month) {
			System.out.println("Du bist " + alter + " Jahre alt!");
		}
			
		else {
			System.out.println("Du bist " + --alter + " Jahre alt!");
	}
	}
}
