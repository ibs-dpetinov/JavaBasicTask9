import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = console.nextInt();
        double[] numbers = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + i + " элемент массива (Десятичные знаки отделяются запятой)");
            numbers[i] = console.nextDouble();
        }
        double sum = 0;

        for (double d : numbers) {
            sum += d;
        }
        double average = sum / length;
        DecimalFormat df = new DecimalFormat("#.########");
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("en")));
        System.out.println("Среднее значение для элементов массива равно " + df.format(average));
        System.out.println("Элементы массива, перемноженные на среднее (" + df.format(average) + "): {");
        for (int i = 0; i < length; i++) {
            System.out.println(df.format(average * numbers[i]) + ((i != length - 1)?",":""));
        }
        System.out.println("}");
    }
}