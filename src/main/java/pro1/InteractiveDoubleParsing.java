package pro1;
import java.util.Scanner;

public class InteractiveDoubleParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            Double inputDouble = Double.parseDouble(input);
            System.out.printf("Zadal jste číslo %.2f", inputDouble);
        }catch(Exception e) {
            System.out.printf("Zadal jste neplatný řetězec %s", input);
        }
    }
}
