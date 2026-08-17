import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        double average = (first + second + third) / 3.0;
        System.out.println("Average = " + average);

        input.close();
    }
}
