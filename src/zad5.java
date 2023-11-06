import java.util.Scanner;

public class zad5 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double masa;
        System.out.println("Podaj mase: ");
        masa = input.nextDouble();
        double ciezar = masa*9.8;
        System.out.println("Ciezar wynosi: " + ciezar+" newtonów");
        if(ciezar<10){
            System.out.println("Ciezar jest za maly");
        }else if(ciezar>1000){
            System.out.println("Ciezar jest za duzy");
        }
    }
}
