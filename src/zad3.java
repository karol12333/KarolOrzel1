import java.util.Scanner;

public class zad3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double waga;
        double wzrost;
        System.out.println("Podaj wage:  ");
        waga = scanner.nextDouble();
        System.out.println("Podaj wzrost w metrach:  ");
        wzrost = scanner.nextDouble();
        double BMI = waga/(wzrost*wzrost);
        if(BMI>25){
            System.out.println("masz nadwage");
        }else if(BMI<18.5){
            System.out.println("masz niedowage");
        }else{
            System.out.println("masz prawidłowe BMI");
        }
    }
}
