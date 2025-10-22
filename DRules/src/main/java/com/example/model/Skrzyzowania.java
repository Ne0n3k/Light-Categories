// klasa odpowiedzialna za ruch na skrzyżowaniach,
//// zdefiniowane są w niej wszystkie wartości potrzebne
//// do wstawienia do odpowiednich setterów a następnie
//// do określonych reguł. Na końcu odpalam kia session
//// i są sprawdzane reguły

package com.example.model;
import java.util.Scanner;
import com.example.DroolsService;

public class Skrzyzowania
{
    static {

        Scanner scanner = new Scanner(System.in);
        Droga droga = new Droga();

        System.out.println("Wybrałeś wruch na skrzyżowaniach. Proszę podać parametry.");
        System.out.println("Proszę podac dozwoloną predkość na jezdni: ");
        while (!scanner.hasNextInt()) scanner.next();
        int k_predkosc = scanner.nextInt();
        while (k_predkosc <= 0 || k_predkosc > 509)
        {
            System.out.println("Podano prędkość nieosiągalną.");
            System.out.println("Proszę ponownie podac dozwoloną predkość na jezdni: ");
            while (!scanner.hasNextInt()) scanner.next();
            k_predkosc = scanner.nextInt();
        }
        droga.setK_predkosc(k_predkosc);

        System.out.println("Proszę podać natężenie ruchu na wielopasmówce:");
        System.out.println("1 - Wysoki");
        System.out.println("2 - Umiarkowany");
        System.out.println("3 - Niski");
        while (!scanner.hasNextInt()) scanner.next();
        int k_wielo = scanner.nextInt();
        while (k_wielo != 1 && k_wielo != 2 && k_wielo != 3)
        {
            System.out.println("Podano złą opcje.");
            System.out.println("Proszę ponownie podać natężenie ruchu na wielopasmówce:");
            System.out.println("1 - Wysoki");
            System.out.println("2 - Umiarkowany");
            System.out.println("3 - Niski");
            while (!scanner.hasNextInt()) scanner.next();
            k_wielo = scanner.nextInt();
        }
        droga.setK_natezenieRuchu(k_wielo);

        System.out.println("Proszę podać skład ruchu:");
        System.out.println("1 - Mieszane z dużym odsetkiem osób niezmotoryzowanych");
        System.out.println("2 - Mieszane");
        System.out.println("3 - Zmotoryzowany");
        while (!scanner.hasNextInt()) scanner.next();
        int k_sklad = scanner.nextInt();
        while (k_sklad != 1 && k_sklad != 2 && k_sklad != 3)
        {
            System.out.println("Wybrano złą opcję");
            System.out.println("Proszę ponownie podać skład ruchu:");
            System.out.println("1 - Mieszane z dużym odsetkiem osób niezmotoryzowanych");
            System.out.println("2 - Mieszane");
            System.out.println("3 - Zmotoryzowany");
            while (!scanner.hasNextInt()) scanner.next();
            k_sklad = scanner.nextInt();
        }
        droga.setK_skladRuchu(k_sklad);

        System.out.println("Czy występuje wydzielenie jezdni: tak/nie");
        scanner.nextLine();
        String k_wydzielenie = scanner.nextLine().toLowerCase();
        while (!k_wydzielenie.equals("tak") && !k_wydzielenie.equals("nie"))
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Czy występuje wydzielenie jezdni: tak/nie");
            k_wydzielenie = scanner.nextLine().toLowerCase();
        }
        droga.setK_wydzielenieJezdni(k_wydzielenie);

        System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
        String k_pojazd = scanner.nextLine().toLowerCase();
        while (!k_pojazd.equals("tak") && !k_pojazd.equals("nie"))
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
            k_pojazd = scanner.nextLine().toLowerCase();
        }
        droga.setK_zaparkowanePojazdy(k_pojazd);

        System.out.println("Proszę podać jasność otoczenia:");
        System.out.println("1 - Wysoka");
        System.out.println("2 - Umiarkowana");
        System.out.println("3 - Niska");
        while (!scanner.hasNextInt()) scanner.next();
        int k_jasnosc = scanner.nextInt();
        while (k_jasnosc != 1 && k_jasnosc != 2 && k_jasnosc != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponowniepodać jasność otoczenia:");
            System.out.println("1 - Wysoka");
            System.out.println("2 - Umiarkowana");
            System.out.println("3 - Niska");
            while (!scanner.hasNextInt()) scanner.next();
            k_jasnosc = scanner.nextInt();
        }
        droga.setK_jasnoscOtoczenia(k_jasnosc);

        System.out.println("Proszę podać trudność nawigacyjną:");
        System.out.println("1 - Bardzo trudna");
        System.out.println("2 - Trudna");
        System.out.println("3 - Łatwa");
        while (!scanner.hasNextInt()) scanner.next();
        int k_nawigacja = scanner.nextInt();
        while (k_nawigacja != 1 && k_nawigacja != 2 && k_nawigacja != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę podać trudność nawigacyjną:");
            System.out.println("1 - Bardzo trudna");
            System.out.println("2 - Trudna");
            System.out.println("3 - Łatwa");
            while (!scanner.hasNextInt()) scanner.next();
            k_nawigacja = scanner.nextInt();
        }
        droga.setK_zadanieNawigacyjne(k_nawigacja);

        DroolsService droolsy = new DroolsService();
        droolsy.executeDrools(droga, "C");

        scanner.close();
    }
}