package pro1;

public class MathUtils {

    public static long gcd(long a, long b){

        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
