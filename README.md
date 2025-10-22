# System Ekspertowy do Klasyfikacji Oświetlenia Drogowego (EN below)

Ten projekt implementuje system ekspertowy w Javie, wykorzystujący technologię Drools do klasyfikacji oświetlenia drogowego na podstawie różnych parametrów ruchu i otoczenia. Aplikacja interaktywnie zbiera dane od użytkownika, a następnie stosuje zestaw reguł biznesowych do określenia odpowiedniej klasy oświetlenia.

## Struktura Projektu

Projekt zbudowany jest w oparciu o Maven i zawiera następujące kluczowe komponenty:

- **`pom.xml`**: Plik konfiguracyjny Maven, definiujący zależności projektu (głównie Drools) oraz konfigurację kompilacji. Wymaga Javy 11 lub starszej do poprawnego działania.
- **`Application.java`**: Główna klasa aplikacji, zawierająca metodę `main`. Odpowiada za uruchomienie programu, interakcję z użytkownikiem w celu wyboru typu ruchu drogowego (szybki, obszary konfliktowe, obszary piesze/niskiej prędkości) i inicjalizację odpowiednich klas wejściowych.
- **`DroolsService.java`**: Serwis odpowiedzialny za integrację z silnikiem reguł Drools. Tworzy `KieSession`, wstawia obiekt `Droga` z danymi wejściowymi i uruchamia reguły z pliku `oswietlenie.drl`. Następnie na podstawie wyniku reguł, określa i wyświetla przydzieloną klasę oświetlenia.
- **`model/Droga.java`**: Klasa modelu, która przechowuje wszystkie parametry wejściowe dotyczące drogi, ruchu i otoczenia, a także pole `wartoscVW`, które jest modyfikowane przez reguły Drools. Zawiera gettery i settery dla wszystkich parametrów.
- **`model/RuchSzybki.java`**, **`model/Skrzyzowania.java`**, **`model/RuchWolny.java`**: Te klasy odpowiadają za zbieranie danych od użytkownika dla poszczególnych typów ruchu (szybki, obszary konfliktowe, piesze/niskiej prędkości). Po zebraniu danych, tworzą obiekt `Droga` i przekazują go do `DroolsService`.
- **`rules/oswietlenie.drl`**: Plik reguł Drools, zawierający logikę biznesową systemu. Reguły te modyfikują `wartoscVW` obiektu `Droga` na podstawie zadanych kryteriów, takich jak prędkość, natężenie ruchu, skład ruchu, wydzielenie jezdni, gęstość połączeń, obecność zaparkowanych pojazdów, jasność otoczenia i zadanie nawigacyjne. Istnieją również specyficzne reguły dla obszarów konfliktu i obszarów niskiej prędkości.

## Wymagania

- Java Development Kit (JDK) 11 lub starsze.
- Maven do zarządzania zależnościami i budowania projektu.

## Uruchamianie Projektu

Aby uruchomić projekt, wykonaj następujące kroki:

1. **Sklonuj repozytorium** (jeśli jeszcze tego nie zrobiłeś).
2. **Przejdź do katalogu projektu**:
   ```bash
   cd DRules - Jakub B
   ```
3. **Zbuduj projekt za pomocą Mavena**:
   ```bash
   mvn clean install
   ```
4. **Uruchom aplikację**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.Application"
   ```
   Lub, jeśli posiadasz plik JAR:
   ```bash
   java -jar target/drools-expert-system-1.0-SNAPSHOT.jar
   ```

Po uruchomieniu aplikacja poprosi o podanie parametrów dotyczących ruchu drogowego, na podstawie których zostanie określona odpowiednia klasa oświetlenia.

## Zasady Działania Reguł

Reguły w pliku `oswietlenie.drl` są odpowiedzialne za obliczanie wartości `wartoscVW` obiektu `Droga`. Każda reguła dodaje lub odejmuje punkty od `wartoscVW` w zależności od spełnionych warunków. Na przykład:
- Wyższa prędkość projektowa może zwiększać `wartoscVW`.
- Wysokie natężenie ruchu na trasach wielopasmowych może zwiększać `wartoscVW`.
- Obecność zaparkowanych pojazdów może zwiększać `wartoscVW`.

Ostateczna wartość `wartoscVW` jest używana przez `DroolsService` do przydzielenia końcowej klasy oświetlenia (np. M1, M2, P1, P2 itp.).

# Road Lighting Classification Expert System

This project implements an expert system in Java, utilizing Drools technology to classify road lighting based on various traffic and environmental parameters. The application interactively collects data from the user and then applies a set of business rules to determine the appropriate lighting class.

## Project Structure

The project is built using Maven and includes the following key components:

- **`pom.xml`**: Maven configuration file, defining project dependencies (mainly Drools) and build configuration. Requires Java 11 or older to function correctly.
- **`Application.java`**: The main application class, containing the `main` method. It is responsible for starting the program, interacting with the user to select the type of road traffic (fast, conflict areas, pedestrian/low-speed areas), and initializing the corresponding input classes.
- **`DroolsService.java`**: A service responsible for integrating with the Drools rule engine. It creates a `KieSession`, inserts a `Droga` object with input data, and fires rules from the `oswietlenie.drl` file. Based on the rule results, it then determines and displays the assigned lighting class.
- **`model/Droga.java`**: The model class that stores all input parameters related to the road, traffic, and environment, as well as the `wartoscVW` field, which is modified by the Drools rules. It contains getters and setters for all parameters.
- **`model/RuchSzybki.java`**, **`model/Skrzyzowania.java`**, **`model/RuchWolny.java`**: These classes are responsible for collecting data from the user for specific traffic types (fast, conflict areas, pedestrian/low-speed areas). After collecting data, they create a `Droga` object and pass it to `DroolsService`.
- **`rules/oswietlenie.drl`**: The Drools rule file, containing the business logic of the system. These rules modify the `wartoscVW` of the `Droga` object based on specified criteria, such as speed, traffic intensity, traffic composition, road separation, connection density, presence of parked vehicles, ambient brightness, and navigation task. There are also specific rules for conflict areas and low-speed areas.

## Requirements

- Java Development Kit (JDK) 11 or older.
- Maven for dependency management and project building.

## Running the Project

To run the project, follow these steps:

1. **Clone the repository** (if you haven't already).
2. **Navigate to the project directory**:
   ```bash
   cd DRules - Jakub B
   ```
3. **Build the project using Maven**:
   ```bash
   mvn clean install
   ```
4. **Run the application**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.Application"
   ```
   Or, if you have the JAR file:
   ```bash
   java -jar target/drools-expert-system-1.0-SNAPSHOT.jar
   ```

After launching, the application will prompt you to enter parameters related to road traffic, based on which the appropriate lighting class will be determined.

## Principles of Rule Operation

The rules in the `oswietlenie.drl` file are responsible for calculating the `wartoscVW` value of the `Droga` object. Each rule adds or subtracts points from `wartoscVW` depending on the fulfilled conditions. For example:
- Higher design speed can increase `wartoscVW`.
- High traffic intensity on multi-lane roads can increase `wartoscVW`.
- The presence of parked vehicles can increase `wartoscVW`.

The final `wartoscVW` value is used by `DroolsService` to assign the final lighting class (e.g., M1, M2, P1, P2, etc.).
