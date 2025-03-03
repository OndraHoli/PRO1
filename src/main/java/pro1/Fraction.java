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
    public Fraction add(Fraction other) {
        //scitani dvou zlomku
        return new Fraction(n*other.d + other.n * d, d*other.d); // pristup o ohter d a n mam i kdyz jsou private, protoze jsou e stejne tridy??
    }
    public static Fraction parse(String str) {
        str = str.replace(" ","");
        String[] parts = str.split("\\+"); // 2 zpetne lomitka

        Fraction sum = new Fraction(0,1);
        Fraction partFraction;
        for(String part : parts){
            //prevest na fractiony a secist
            if(part.contains("%")){
                part = part.replace("%","");
                partFraction = new Fraction(Long.parseLong(part),100);
            }
            else{
                String[] frac = part.split("/");
                partFraction = new Fraction(Long.parseLong(frac[0]),Long.parseLong(frac[1]));
            }
            sum = sum.add(partFraction);
        }
        return sum;
    }
    public String toString(){
        return n + "/" + d;
    }

}
