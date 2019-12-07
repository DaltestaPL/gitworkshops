/**
 * ... comment class...
 *
 * @author tomasz.wojtyra.tw@gmail.com
 * @since 07.12.2019
 **/



final class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        float P = rect.fieldRectangle();
        System.out.println("Pole prostokąta: " + P);

        float O = rect.circumferenceRectangle();
        System.out.println("Obwód prostokąta: " + O);

        double przekatna = rect.diagonal();
        System.out.println("Przekątna prostokąta: " + przekatna);


    }
}