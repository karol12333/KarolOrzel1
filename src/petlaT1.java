import java.util.Scanner;

public class petlaT1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("podaj liczbe: ");
        int n;
        while (true){
            System.out.print("podaj liczbe: ");
            if (input.hasNextInt()){
                n = input.nextInt();
                if(n>0){
                    break;
                }else{
                    System.out.print("Podaj liczbe wiekszą od zera");
                }
            }else{
                System.out.print("blad");
                input.next();
            }
        }
        int suma = 0;
        for (int i = 1; i <= n; i++){
            suma += i;
        }
        System.out.print("Suma " + n + " wynosi: " + suma);
    }
}
