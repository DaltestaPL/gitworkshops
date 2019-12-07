/**
 * ... comment class ...
 *
 * @author Paweł
 * @since 2019-12-07
 */

/*
5. Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
   Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
   W klasie głównej utwórzcie obiekt klasy prostokąt i wywołajcie metody obliczające.
 */
public final class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
        System.out.println("Wymiary prostokąta: "+ length + " x " + width);
    }


    float fieldRectangle (){
        float fieldRectangle;
        fieldRectangle = length * width;
        return  fieldRectangle;
    }

    float circumferenceRectangle () {
        float circumferenceRectangle;
        circumferenceRectangle = 2 * (length + width);
        return circumferenceRectangle;

    }


    double diagonal() {
        double diagonal;
        float a2 = length * length;
        float b2 = width * width;
        diagonal = Math.sqrt(a2 + b2);

        return diagonal;


    }




}
