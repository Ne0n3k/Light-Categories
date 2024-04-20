// klasa odpowiedzialna za ruch szybki,
// zdefiniowane są w niej wszystkie wartości potrzebne
// do wstawienia do odpowiednich setterów a następnie
// do określonych reguł. Na końcu odpalam kia session
// i są sprawdzane reguły

package com.example.model;
import java.util.Scanner;
import com.example.DroolsService;

public class RuchSzybki
{
    static {

        Scanner scanner = new Scanner(System.in);
        Droga droga = new Droga();
        
        System.out.println("Wybrałeś szybki ruch drogowy.");
        System.out.println("Proszę podac dozwoloną predkość na jezdni: ");
        while (!scanner.hasNextInt()) scanner.next();
        int predkosc = scanner.nextInt();
        while (predkosc > 509 || predkosc < 0)
        {
            System.out.println("Taka prędkość jest nieosiągalna na drodze.");
            System.out.println("Proszę ponownie podac dozwoloną predkość na jezdni: ");
            while (!scanner.hasNextInt()) scanner.next();
            predkosc = scanner.nextInt();
        }
        droga.setPredkosc(predkosc);

        System.out.println("Proszę podać typ ulicy:");
        System.out.println("1 - Wielopasmowa");
        System.out.println("2 - Jednopasmowa");
        while (!scanner.hasNextInt()) scanner.next();
        int choice1 = scanner.nextInt();
        while (choice1 != 1 && choice1 != 2)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie podać typ ulicy:");
            System.out.println("1 - Wielopasmowa");
            System.out.println("2 - Jednopasmowa");
            while (!scanner.hasNextInt()) scanner.next();
            choice1 = scanner.nextInt();
        }
        switch (choice1) {
            case 1:
                System.out.println("Proszę podać natężenie ruchu na wielopasmówce w %: ");
                while (!scanner.hasNextInt()) scanner.next();
                int wielo = scanner.nextInt();
                while (wielo > 100 || wielo < 0)
                {
                    System.out.println("Podano % wykraczający ponad zakres.");
                    System.out.println("Proszę ponownie podać natężenie ruchu na wielopasmówce w %: ");
                    while (!scanner.hasNextInt()) scanner.next();
                    wielo = scanner.nextInt();
                }
                droga.setNatezenieRuchuWP(wielo);
                break;
            case 2:
                System.out.println("Proszę podać natężenie ruchu na dwupasmowce w %: ");
                while (!scanner.hasNextInt()) scanner.next();
                int dwu = scanner.nextInt();
                while (dwu > 100 || dwu < 0)
                {
                    System.out.println("Podano % wykraczający ponad zakres.");
                    System.out.println("Proszę ponownie podać natężenie ruchu na dwupasmowce w %: ");
                    while (!scanner.hasNextInt()) scanner.next();
                    dwu = scanner.nextInt();
                }
                droga.setNatezenieRuchu(dwu);
                break;
            default:
                System.err.println("Wybrano zla opcje.");
        }
        System.out.println("Proszę podać skład ruchu:");
        System.out.println("1 - Mieszane z dużym odsetkiem osób niezmotoryzowanych");
        System.out.println("2 - Mieszane");
        System.out.println("3 - Zmotoryzowany");
        while (!scanner.hasNextInt()) scanner.next();
        int sklad = scanner.nextInt();
        while (sklad != 1 && sklad != 2 && sklad != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie wybrać skład ruchu:");
            System.out.println("1 - Mieszane z dużym odsetkiem osób niezmotoryzowanych");
            System.out.println("2 - Mieszane");
            System.out.println("3 - Zmotoryzowany");
            while (!scanner.hasNextInt()) scanner.next();
            sklad = scanner.nextInt();
        }
        droga.setSkladRuchu(sklad);

        System.out.println("Czy występuje wydzielenie jezdni: tak/nie");
        scanner.nextLine();
        String wydzielenie = scanner.nextLine().toLowerCase();
        while (!wydzielenie.equals("tak") && !wydzielenie.equals("nie"))
        {
            System.out.println("Wybrano złą opcję");
            System.out.println("Czy występuje wydzielenie jezdni: tak/nie");
            scanner.nextLine();
            wydzielenie = scanner.nextLine().toLowerCase();
        }
        droga.setWydzielenieJezdni(wydzielenie);

        System.out.println("Proszę podać gestość połączeń na:");
        System.out.println("1 - Skrzyżowaniu");
        System.out.println("2 - Węźle, odległość między mostami");
        while (!scanner.hasNextInt()) scanner.next();
        int choice2 = scanner.nextInt();
        while (choice2 != 1 && choice2 != 2)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie podać gestość połączeń na:");
            System.out.println("1 - Skrzyżowaniu");
            System.out.println("2 - Węźle, odległość między mostami");
            while (!scanner.hasNextInt()) scanner.next();
            choice2 = scanner.nextInt();
        }
        switch (choice2) {
            case 1:
                System.out.println("Proszę podać gęstość połączeń: ");
                while (!scanner.hasNextInt()) scanner.next();
                int polaczenia = scanner.nextInt();
                while (polaczenia < 0)
                {
                    System.out.println("Podano nieprawdopodobną ilość połączeń.");
                    System.out.println("Proszę ponownie podać gęstość połączeń: ");
                    while (!scanner.hasNextInt()) scanner.next();
                    polaczenia = scanner.nextInt();
                }
                droga.setGestoscPolaczen(polaczenia);
                break;
            case 2:
                System.out.println("Proszę podać ile jest węzłów lub odleglość między mostami: ");
                while (!scanner.hasNextInt()) scanner.next();
                int wezel = scanner.nextInt();
                while (wezel < 0)
                {
                    System.out.println("Podano nieprawdopodobną ilość.");
                    System.out.println("Proszę ponownie podać ile jest węzłów lub odleglość między mostami: ");
                    while (!scanner.hasNextInt()) scanner.next();
                    wezel = scanner.nextInt();
                }
                droga.setWezly_mosty(wezel);
                break;
            default:
                System.err.println("Wybrano złą opcje.");
        }

        System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
        scanner.nextLine();
        String pojazd = scanner.nextLine().toLowerCase();
        while (!pojazd.equals("tak") && !pojazd.equals("nie"))
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
            pojazd = scanner.nextLine().toLowerCase();
        }
        droga.setZaparkowanePojazdy(pojazd);

        System.out.println("Proszę podać jasność otoczenia:");
        System.out.println("1 - Wysoka");
        System.out.println("2 - Umiarkowana");
        System.out.println("3 - Niska");
        while (!scanner.hasNextInt()) scanner.next();
        int jasnosc = scanner.nextInt();
        while (jasnosc != 1 && jasnosc != 2 && jasnosc != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie podać jasność otoczenia:");
            System.out.println("1 - Wysoka");
            System.out.println("2 - Umiarkowana");
            System.out.println("3 - Niska");
            while (!scanner.hasNextInt()) scanner.next();
            jasnosc = scanner.nextInt();
        }
        droga.setJasnoscOtoczenia(jasnosc);

        System.out.println("Proszę podać trudność nawigacyjną:");
        System.out.println("1 - Bardzo trudna");
        System.out.println("2 - Trudna");
        System.out.println("3 - Łatwa");
        while (!scanner.hasNextInt()) scanner.next();
        int nawigacja = scanner.nextInt();
        while (nawigacja != 1 && nawigacja != 2 && nawigacja != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie podać trudność nawigacyjną:");
            System.out.println("1 - Bardzo trudna");
            System.out.println("2 - Trudna");
            System.out.println("3 - Łatwa");
            while (!scanner.hasNextInt()) scanner.next();
            nawigacja = scanner.nextInt();
        }
        droga.setZadanieNawigacyjne(nawigacja);

        DroolsService droolsy = new DroolsService();
        droolsy.executeDrools(droga, "M");

        scanner.close();
    }
}