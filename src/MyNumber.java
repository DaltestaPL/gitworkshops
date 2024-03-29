/**
 * ... comment class...
 *
 * @author d.skeylz@gmail.com
 * @since 07.12.2019
 **/
public class MyNumber {


        private double value;

    public MyNumber(double value) {
            this.value = value;
        }

        public boolean isOdd() {
            return ! isEven();
        }

        public boolean isEven() {
            return value % 2 == 0;
        }

        public double sqrt() {
            return Math.sqrt(value);
        }

        public MyNumber pow(MyNumber pow) {
            return new MyNumber(Math.pow(value, pow.value));
        }

        public MyNumber add(double otherValue) {
            return new MyNumber(value + otherValue);
        }

        public MyNumber subract(MyNumber otherValue) {
            return new MyNumber(value - otherValue.value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


    }




