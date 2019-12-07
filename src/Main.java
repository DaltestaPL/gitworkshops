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
        Rectangle rect = new Rectangle(10, 5);
        float P = rect.fieldRectangle();
        System.out.println("Pole prostokąta: " + P);

        float O = rect.circumferenceRectangle();
        System.out.println("Obwód prostokąta: " + O);

        double przekatna = rect.diagonal();
        System.out.println("Przekątna prostokąta: " + przekatna);

        printName();
        System.out.println(Arrays.toString(alphabetLetters()));
    }
}