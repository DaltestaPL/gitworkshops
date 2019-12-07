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

        double value = 5;
        MyNumber num = new MyNumber(value);
      boolean odd = num.isOdd();
        System.out.println("Znaczenie Nie parzysty " +odd);
      boolean add = num.isEven();
        System.out.println("Znaczenie Parzysty " +add);
        int d = 4;
        num = num.add(2.0);
        System.out.println("add num " +num);
        num = num.subract(new MyNumber(5));
        System.out.println("roznice  " +num);


        Human hum= new Human("Tom","male",25,75,185);

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