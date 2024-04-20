// klasa odpowiedzialna za ruch wolny,
// zdefiniowane są w niej wszystkie wartości potrzebne
// do wstawienia do odpowiednich setterów a następnie
// do określonych reguł. Na końcu odpalam kia session
// i są sprawdzane reguły

package com.example.model;
import java.util.Scanner;
import com.example.DroolsService;

public class RuchWolny {
    static {

        Scanner scanner = new Scanner(System.in);
        Droga droga = new Droga();

        System.out.println("Wybrałeś klase oswietlenia dla obszarów pieszych i obszarów niskiej prędkości. Proszę podać parametry.");
        System.out.println("Jaka jest prędkość na danym obszarze?:");
        System.out.println("1 - Niska");
        System.out.println("2 - Prędkość chodzenia");
        while (!scanner.hasNextInt()) scanner.next();
        int p_predkosc = scanner.nextInt();
        while (p_predkosc != 1 && p_predkosc != 2)
        {
            System.out.println("Wybrano złą opcję");
            System.out.println("Proszę ponownie wybrać prędkość na danym obszarze?:");
            System.out.println("1 - Niska");
            System.out.println("2 - Prędkość chodzenia");
            while (!scanner.hasNextInt()) scanner.next();
            p_predkosc = scanner.nextInt();
        }
        droga.setP_predkosc(p_predkosc);

        System.out.println("Jaka jest intensywnośc na danym obszarze?:");
        System.out.println("1 - Obszar zajęty");
        System.out.println("2 - Normalna");
        System.out.println("3 - Cicha");
        while (!scanner.hasNextInt()) scanner.next();
        int p_intensywnosc = scanner.nextInt();
        while (p_intensywnosc != 1 && p_intensywnosc != 2 && p_intensywnosc != 3)
        {
            System.out.println("Wybrano złą opcję");
            System.out.println("Proszę ponownie wybrać intensywnośc na danym obszarze?:");
            System.out.println("1 - Obszar zajęty");
            System.out.println("2 - Normalna");
            System.out.println("3 - Cicha");
            while (!scanner.hasNextInt()) scanner.next();
            p_intensywnosc = scanner.nextInt();
        }
        droga.setP_inten(p_intensywnosc);

        System.out.println("Proszę podać skład ruchu:");
        System.out.println("1 - Piesi, rowerzyści, ruch zmotoryzowany");
        System.out.println("2 - Piesi i ruch zmotoryzowany");
        System.out.println("3 - Piesi i rowerzyści");
        System.out.println("4 - Piesi");
        System.out.println("5 - Rowerzyści");
        while (!scanner.hasNextInt()) scanner.next();
        int  p_sklad = scanner.nextInt();
        while (p_sklad != 1 && p_sklad != 2 && p_sklad != 3 && p_sklad != 4 && p_sklad != 5)
        {
            System.out.println("Wybrano złą opcję");
            System.out.println("Proszę ponownie podać skład ruchu:");
            System.out.println("1 - Piesi, rowerzyści, ruch zmotoryzowany");
            System.out.println("2 - Piesi i ruch zmotoryzowany");
            System.out.println("3 - Piesi i rowerzyści");
            System.out.println("4 - Piesi");
            System.out.println("5 - Rowerzyści");
            while (!scanner.hasNextInt()) scanner.next();
            p_sklad = scanner.nextInt();
        }
        droga.setP_skladRuchu(p_sklad);

        System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
        scanner.nextLine();
        String p_pojazd = scanner.nextLine().toLowerCase();
        while (!p_pojazd.equals("tak") && !p_pojazd.equals("nie"))
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Czy znajduje się tutaj zaparkowany pojazd?: tak/nie");
            p_pojazd = scanner.nextLine().toLowerCase();
        }
        droga.setP_zaparkowanePojazdy(p_pojazd);

        System.out.println("Proszę podać jasność otoczenia:");
        System.out.println("1 - Wysoka");
        System.out.println("2 - Umiarkowana");
        System.out.println("3 - Niska");
        while (!scanner.hasNextInt()) scanner.next();
        int p_jasnosc = scanner.nextInt();
        while (p_jasnosc != 1 && p_jasnosc != 2 && p_jasnosc != 3)
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Proszę ponownie podać jasność otoczenia:");
            System.out.println("1 - Wysoka");
            System.out.println("2 - Umiarkowana");
            System.out.println("3 - Niska");
            while (!scanner.hasNextInt()) scanner.next();
            p_jasnosc = scanner.nextInt();
        }
        droga.setP_jasnoscOtoczenia(p_jasnosc);

        System.out.println("Czy potrzebne jest rozpoznawanie twarzy?: tak/nie");
        scanner.nextLine();
        String p_rozpoznawanie = scanner.nextLine().toLowerCase();
        while (!p_rozpoznawanie.equals("tak") && !p_rozpoznawanie.equals("nie"))
        {
            System.out.println("Wybrano złą opcję.");
            System.out.println("Czy potrzebne jest rozpoznawanie twarzy?: tak/nie");
            p_rozpoznawanie = scanner.nextLine().toLowerCase();
        }
        droga.setP_rozpoz(p_rozpoznawanie);

        DroolsService droolsy = new DroolsService();
        droolsy.executeDrools(droga, "P");

        scanner.close();
    }
}
