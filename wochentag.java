package verzweigungen;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
public class wochentag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie den Tag ein: ");
		int tag = sc.nextInt();
		System.out.println("Geben sie den Monat ein: ");
		int month = sc.nextInt();
		System.out.println("Geben sie das Jahr ein: ");
		int year = sc.nextInt();
		LocalDate current_date = LocalDate.of(year, month, tag);
		DayOfWeek day = current_date.getDayOfWeek();
		System.out.println(day);

		
	}

}
