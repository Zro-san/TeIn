import java.util.Scanner;

public class Notenrechner {
   public static void main(String args[])  {

Scanner tastatur = new Scanner(System.in);

System.out.print("Geben sie die Punktzahl ein: ");

double x = tastatur.nextDouble();

   if (x<=49.5) System.out.println("Note 5");   
   else if (x<=59.5) System.out.println("Note 4.7");
   else if (x<=64.5) System.out.println("Note 4");
   else if (x<=69.5) System.out.println("Note 3,7"); 
   else if (x<=74.5) System.out.println("Note 3,3");
   else if (x<=79.5) System.out.println("Note 3");
   else if (x<=84.5) System.out.println("Note 2,7");
   else if (x<=89.5) System.out.println("Note 2,3"); 
   else if (x<=94.5) System.out.println("Note 2");
   else if (x<=99.5) System.out.println("Note 1,7"); 
   else if (x<=104.5) System.out.println("Note 1,3");   
   else if (x<=120) System.out.println("Note 1");
   else System.out.println("Es konnte keine Note berechnet werden");
tastatur.close ();
   }   
}

