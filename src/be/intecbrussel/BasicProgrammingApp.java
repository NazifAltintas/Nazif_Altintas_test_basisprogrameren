package be.intecbrussel;

import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 getal.");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

//        Print het grootste getal.

        int grootsteGetal = num1;

        if (num2 > grootsteGetal) {
            grootsteGetal = num2;
        }
        if (num3 > grootsteGetal) {
            grootsteGetal = num3;
        }
        if (num4 > grootsteGetal) {
            grootsteGetal = num4;
        }
        System.out.println("Grootstegetal is: " + grootsteGetal);

//        Print het kleinste getal.

        int kleinsteGetal = num1;

        if (num2 < kleinsteGetal) {
            kleinsteGetal = num2;
        }
        if (num3 < kleinsteGetal) {
            kleinsteGetal = num3;
        }
        if (num4 < kleinsteGetal) {
            kleinsteGetal = num4;
        }
        System.out.println("Kleinstegetal is: " + kleinsteGetal);

//        Print alle getallen van het kleinste getal tot het gemiddelde van de 4 getallen.

        int gemiddelde = (num1 + num2 + num3 + num4) / 4;

        System.out.println("Alle getallen van het kleinste getal tot het gemiddelde van de 4 getallen:");

        for (int i = kleinsteGetal; i <= gemiddelde; i++) {

            System.out.print(i);

            if (i < gemiddelde) {
                System.out.print(",");
            }

        }
        System.out.println("");
        
//         Print alle getallen van 0 tot 2000 maar wanneer het een van de 4 getallen tegenkomt, stopt de loop.
        
        System.out.println("Alle getallen van 0 tot 2000 maar wanneer het een van de 4 getallen tegenkomt.");


        for (int j = 0; j < 2000; j++) {

            System.out.print(j);

            int count = 0;

            if (j == num1 || j == num2 || j == num3 || j == num4) {
                count = 1;
                break;
            }
            if (count == 0) {
                System.out.print(",");
            }


        }

//        Print alle getallen van 0 tot 100, van groot naar klein  EN klein naar groot in afwisselende volgorde.

        System.out.println("");
        System.out.println("Alle getallen van 0 tot 100, van groot naar klein EN klein naar groot in afwisselende volgorde.");

        int l=0;

        for (int k=99;k>=0;k--) {

            System.out.print(k+"-"+l);
            l++;

            if (l<=99){
                System.out.print("-");
            }



        }

        scan.close();

    }
}
