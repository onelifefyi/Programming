public class Main{
    public static void main(String[] args){
        // arithmetics

        // double preserves decimals
        // if using int, it simply drops the decimal (no rounding)
        double x = 10;
        double y = 3;
        double z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;       // complete division (no dropped decimal)      
        z = x % y;

        // increment & decrement
        z++;
        z--;
        System.out.println(z);
    }
}