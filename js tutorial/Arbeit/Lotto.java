import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        int[] lotto = new int[50];
        int ziehung = 0;
        int zahl1,zahl2,zahl3,zahl4,zahl5,zahl6;
 

        System.out.print("Geben sie ihre 1. Zahl ein zwischen 1 und 49 ein: ");
        zahl1 = tastatur.nextInt();
        if (zahl1 >= 1 && zahl1 <= 49) {
            System.out.print("Geben sie ihre 2. Zahl ein zwischen 1 und 49 ein: ");

        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);
        }
        zahl2 = tastatur.nextInt();
        if (zahl2 >= 1 && zahl2 <= 49)  {
            System.out.print("Geben sie ihre 3. Zahl ein zwischen 1 und 49 ein: ");
        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);
        }
        zahl3 = tastatur.nextInt();

        if (zahl3 >= 1 && zahl3 <= 49) {
            System.out.print("Geben sie ihre 4. Zahl ein zwischen 1 und 49 ein: ");

        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);

        }
        zahl4 = tastatur.nextInt();
        if (zahl4 >= 1 && zahl4 <= 49) {
            System.out.print("Geben sie ihre 5. Zahl ein zwischen 1 und 49 ein: ");

        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);
        }
        zahl5 = tastatur.nextInt();

        if (zahl5 >= 1 && zahl5 <= 49) {
            System.out.print("Geben sie ihre 6. Zahl ein zwischen 1 und 49 ein: ");

        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);
        }
        zahl6 = tastatur.nextInt();
        if (zahl6 >= 1 && zahl6 <= 49) {
            System.out.print(
                    "Ihr Tipp: " + zahl1 + ", " + zahl2 + ", " + zahl3 + ", " + zahl4 + ", " + zahl5 + ", " + zahl6);
            ;
        } else {
            System.out.println("Error! Ihre Zahl liegt nicht zwischen 1 und 49");
            System.exit(0);
        }

        for (int i = 1; i <= 7; i++) {
            ziehung = (int) (Math.random() * 49 + 1);
            if (lotto[ziehung] == 0) {
                lotto[ziehung] = 1;
            } else {
                i--;
            }

        }
        lotto[ziehung] = 2;

        System.out.println("\nZiehung:");
        for (int k = 1; k <= 49; k++) {
            if (lotto[k] == 1 && (k == zahl1 || k == zahl2 || k == zahl3 || k == zahl4 || k == zahl5 || k == zahl6)) {
                System.out.println(k + " getippt");
            } else if (lotto[k] == 1) {
                System.out.println(k + " nicht getippt");

            }

        }

        tastatur.close();
    }
}
