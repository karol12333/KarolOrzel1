import java.util.Scanner;

public class petlaT12 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość sprzedaży dla sklepu 1: ");
        int sklep1 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu 2: ");
        int sklep2 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu 3: ");
        int sklep3 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu 4: ");
        int sklep4 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu 5: ");
        int sklep5 = input.nextInt();

        int gwiazda = 100;
        int iloscgwiazdsklep1 = sklep1/gwiazda;
        int iloscgwiazdsklep2 = sklep2/gwiazda;
        int iloscgwiazdsklep3 = sklep3/gwiazda;
        int iloscgwiazdsklep4 = sklep4/gwiazda;
        int iloscgwiazdsklep5 = sklep5/gwiazda;

        System.out.print("sklep 1: ");
        for(int i=iloscgwiazdsklep1; i>=1; i-- ){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("sklep 2: ");
        for(int i=iloscgwiazdsklep2; i>=1; i-- ){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("sklep 3: ");
        for(int i=iloscgwiazdsklep3; i>=1; i-- ){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("sklep 4: ");
        for(int i=iloscgwiazdsklep4; i>=1; i-- ){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("sklep 5: ");
        for(int i=iloscgwiazdsklep5; i>=1; i-- ){
            System.out.print("*");
        }


    }
}
