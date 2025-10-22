// Metoda main odpowiedzialna za cały program
// Uruchamiam w niej odrazu kia session,
// aby nie uruchamiała się gdzieś w środku
// działania programu, następnie zadaje
// pytanie o typ ruchu w jakim chcemy określić normę oświetlenia
// oraz wykonujemy odpowiednie co do wyboru polecenia

package com.example;
import java.util.Scanner;
import com.example.model.RuchSzybki;
import com.example.model.RuchWolny;
import com.example.model.Skrzyzowania;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dla jakiego ruchu drogowego chciałbyś wybrać klasę?");
        System.out.println("1 - dla szybkiego");
        System.out.println("2 - dla obszarów konfliktowych");
        System.out.println("3 - dla obszarów pieszych i obszarów niskiej prędkości");

        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3)
        {
            System.out.println("Proszę ponownie podać, dla jakiego ruchu drogowego chciałbyś wybrać klasę?");
            System.out.println("1 - dla szybkiego");
            System.out.println("2 - dla obszarów konfliktowych");
            System.out.println("3 - dla obszarów pieszych i obszarów niskiej prędkości");
            while (!scanner.hasNextInt()) scanner.next();
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                new RuchSzybki();
                break;

            case 2:
                new Skrzyzowania();
                break;

            case 3:
                new RuchWolny();
                break;
        }

        scanner.close();
    }
}