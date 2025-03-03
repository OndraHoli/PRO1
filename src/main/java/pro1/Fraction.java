package pro1;
import java.math.*;

public class Fraction {
    private long n; // numerator
    private long d; // denominator

    public Fraction(long n, long d) {
        long gcd = MathUtils.gcd(n, d);

        this.n = n/gcd;
        this.d = d/gcd;


    }
    public static Fraction parse(String str) {
        return new Fraction(1,1);
    }
    public String toString(){
        return n + "/" + d;
    }



}
