package verzweigungen;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        int c;
        int b;
        int j;
        int m;
        int n;
        int s;
        int e;
        int d;
        int tag;
        int monat;
       System.out.println("Geben sie das Jahr ein: ");
       j = sc.nextInt();
       a=j%19;
       b=j%4;
       c=j%7;
       m=(8*(j/100)+13)/25-2;
       s=j/100 - j/400-2;
       m=(15+s-m)%30;
       n=(6+s)%7;
       d=(m+19*a)%30;
       if (d==29) {
           d=28;
       }else if(d==28 && a >= 11) {
           d=27;
       }else {
       }
       e=(2*b+4*c+6*d+n)%7;
       tag = 21+d+e+1;
       if (tag > 31) {
           tag = tag%31;
           monat=4;
       }
       else {
           monat = 3;
       }
       System.out.println("Im Jahr " + j + " ist der Ostermontag am " + tag + "." + monat + "." );
       
    }
}