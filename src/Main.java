import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean istFehler = false;

        int zahl1 = 0;
        int zahl2 = 0;

        VierSpezies vierSpezies = new VierSpezies();

        do {
            istFehler = false;
            try {
                System.out.print("Zahl1: ");
                String str = input.nextLine();
                zahl1 = Integer.parseInt(str);

            }catch (NumberFormatException nef){
                System.out.println("Fehlerhafte Zahl!");
                istFehler = true;

            }
        }while (istFehler == true);

        do {
            istFehler = false;
            try {
                System.out.print("Zahl2: ");
                String str = input.nextLine();
                zahl2 = Integer.parseInt(str);
            }catch (NumberFormatException nfe){
                System.out.println("Fehlerhafte Zahl!");
                istFehler = true;
            }

        }while (istFehler == true);

        int result1 = vierSpezies.addition(zahl1, zahl2);
        int result2 = vierSpezies.subraktion(zahl1, zahl2);
        int result3 = vierSpezies.multiplikation(zahl1, zahl2);
        double result4 = vierSpezies.division(zahl1, zahl2);

        System.out.println(zahl1 + " + " + zahl1 + ": " + result1);
        System.out.println(zahl1 + " - " + zahl2 + ": " + result2);
        System.out.println(zahl1 + " * " + zahl2 + ": " + result3);
        System.out.println(zahl1 + " / " + zahl2 + ": " + result4);




    }
}
