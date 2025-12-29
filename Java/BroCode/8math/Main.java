public class Main{
    public static void main(String[] args){

        // some constants:
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        // power pow()
        result = Math.pow(2, 3);

        // absolute value
        result = Math.abs(-5.5);

        // sqrt
        result = Math.sqrt(3.33);

        // floor & ceil
        result = Math.ceil(21.1);
        System.out.println(result);

        result = Math.floor(21.999);
        System.out.println(result);

        // round

        result = Math.round(21.3);
        System.out.println(result);

        // >= 0.5 rounds up
        result = Math.round(22.5);
        System.out.println(result);
    }
}