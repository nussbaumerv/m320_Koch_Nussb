import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konto> kontos = new ArrayList<Konto>();

        Konto konto1 = new Konto(0, 1);
        Konto konto2 = new Konto(0, 2);
        Konto konto3 = new Konto(0, 3);

        kontos.add(konto1);
        kontos.add(konto2);
        kontos.add(konto3);

        Scanner scan = new Scanner(System.in);
        int input;

        do{
            System.out.println("1 - einzahlen\n2 - abheben\n3 - Saldi von Konto\n4 - ueberweisen");
            input = scan.nextInt();

            switch (input){
                case 1:
                    System.out.println("Wie viel wills du einzahlen: ");
                    input = scan.nextInt();
                    konto1.einzahlen(input);
                    break;
                case 2:
                    System.out.println("Wie viel wills du abheben: ");
                    input = scan.nextInt();
                    konto1.abheben(input);
                    break;
                case 3:
                    System.out.println("Konto1: " + konto1.getSaldo());
                    System.out.println("Konto2: " + konto2.getSaldo());
                    System.out.println("Konto3: " + konto3.getSaldo());
                    break;
                case 4:
                    System.out.println("1 - Konto2\n2 - Konto3");
                    input = scan.nextInt();
                    System.out.println("Betrag der ueberwiesen werden soll: ");
                    int betrag = scan.nextInt();
                    String status = konto1.ueberweisen(betrag, kontos.get(input));
                    System.out.println(status);
            }
        }while (true);
    }
}