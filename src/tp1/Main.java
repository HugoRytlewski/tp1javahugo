package tp1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int note1 = (int) 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        String saisie = sc.next();
        float nb = Float.parseFloat(saisie);
        System.out.println(saisie);
    }
}