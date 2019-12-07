import java.util.Arrays;

/**
 * ... comment class...
 *
 * @author tomasz.wojtyra.tw@gmail.com
 * @since 07.12.2019
 *
 *
 * 3. W klasie głównej uruchamiającej program (z funkcją main) napiszcie metody statyczne i wystartujcie je w metodzie main:
 *    - metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
 *    - metodę, która wyświetli Wasze imię
 **/
final class Main {

    static final String [] alphabetLetters() {
        String[] table = {"A", "B", "C", "D", "E"};
        return table;
    }

    static final void printName() {
        System.out.println("Tomek");
    }

    public static void main(String[] args) {
        printName();
        System.out.println(Arrays.toString(alphabetLetters()));
    }
}