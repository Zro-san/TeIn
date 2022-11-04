import java.util.Scanner;
public class potenz {
    public static void main(String[] args) {
            
        Scanner tastatur = new Scanner(System.in);


            int x;
            int y;
            int Ergebnis;

        System.out.print("Geben sie ihre Basis ein: ");
        x= tastatur.nextInt();
        System.out.print("Geben sie ihren Exponenten ein: ");
        y= tastatur.nextInt();
        Ergebnis= x;
    
        for(int i=1; i<y; i++) {
             Ergebnis = Ergebnis*x;
 
            
        }
        System.out.println("Das Ergebnis ist: " + Ergebnis);
            
            
            tastatur.close();

    }

}
