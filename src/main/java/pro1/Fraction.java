package pro1;
import java.math.*;

public class Fraction {
    private long n; // numerator
    private long d; // denominator

    public Fraction(long n, long d) {
        this.n = n;
        this.d = d;
        long gcd = MathUtils.gcd(n, d);
        // priste - normalizovani zlomku GCD(n,d)

    }



}
