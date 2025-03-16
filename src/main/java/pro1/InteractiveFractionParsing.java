package pro1;

import java.util.Scanner;

public class InteractiveFractionParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            Fraction fraction = new Fraction(0,1);
            fraction = Fraction.parse(input);

            System.out.printf("Zadal jste zlomek %s", fraction.toString());
        }catch(Exception e){
            System.out.printf("Zadal jste neplatný řetězec %s",input);
        }
    }
}
