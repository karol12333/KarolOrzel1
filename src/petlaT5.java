import java.util.Scanner;

public class petlaT5 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj lancuch znakow: ");
        String lancuch = input.nextLine();
        System.out.print("podaj znak do zliczenia: ");
        char znak = input.next().charAt(0);
        int liczwys = 0;
        for (int i = 0; i < lancuch.length(); i++){
            if(lancuch.charAt(i) == znak){
                liczwys++;
            }
        }
        System.out.print("liczba wystapien "+ znak + " to " + liczwys);
    }
}
