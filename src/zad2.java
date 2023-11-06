import java.util.Scanner;

public class zad2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int dzien;
        int miesiac;
        int rok;
        System.out.println("Podaj dzien:  ");
        dzien = scanner.nextInt();
        System.out.println("Podaj miesiac:  ");
        miesiac = scanner.nextInt();
        System.out.println("Podaj ostatnie 2 cyfry roku:  ");
        rok = scanner.nextInt();
        if(dzien * miesiac == rok){
            System.out.print("data jest magiczna");
        }else{
            System.out.print("data nie jest magiczna");
        }
    }
}
