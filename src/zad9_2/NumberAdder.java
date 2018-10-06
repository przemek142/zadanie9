package zad9_2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        List<Double> numbers = readNumbersFromUser();
        printSum(numbers);
    }

    private static List<Double> readNumbersFromUser() {
        List<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Podaj liczbę (liczba ujemna kończy wprowadzanie):");
            try {
                number = input.nextDouble();
            } catch (InputMismatchException ex){
                System.out.println("Nie wprowadzono poprawnej liczby.");
                input.nextLine();
                continue;
            }
            if(number >= 0) {
                numbers.add(number);
            }
        } while(number >= 0);
        return numbers;
    }

    private static void printSum(List<Double> numbers) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            builder.append(numbers.get(i));
            sum += numbers.get(i);
            if(i < (numbers.size()-1))
                builder.append(" + ");
        }
        builder.append(" = ");
        builder.append(sum);
        System.out.println(builder.toString());
    }
}
