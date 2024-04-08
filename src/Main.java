import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StosWyjatkow stosWyjatkow = new StosWyjatkow();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = 0;


        try {
            liczba = scanner.nextInt();
            if(liczba<0) {
                throw new IllegalArgumentException();
            }
            System.out.println(Math.sqrt(liczba));
        }
        catch(InputMismatchException e) {
            System.out.println("tylko liczby");
        }
        catch(IllegalArgumentException e){
            System.out.println("Tylko liczby dodatnie");
        }









    }
}