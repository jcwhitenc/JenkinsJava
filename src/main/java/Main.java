import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        String inputLine;
        String[] lineParts;
        String output = "";
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Command:");
        while (!input.equals("done")) {
            inputLine = scanner.nextLine();
            lineParts = inputLine.split(" ");
            input = lineParts[0];
            switch (input) {
                case "binary":
                    output = calc.intToBinaryNumber(Integer.parseInt(lineParts[1]));
                    break;
                case "add":
                    output = String.valueOf(
                            calc.add(Integer.parseInt(lineParts[1]),
                                    Integer.parseInt(lineParts[2])));
                    break;
                case "subtract":
                    output = String.valueOf(calc.subtract(Integer.parseInt(lineParts[1]), Integer.parseInt(lineParts[2])));
                    break;
                case "multiply":
                    output = String.valueOf(calc.multiply(Integer.parseInt(lineParts[1]), Integer.parseInt(lineParts[2])));
                    break;
                case "divide":
                    output = String.valueOf(calc.divide(Integer.parseInt(lineParts[1]), Integer.parseInt(lineParts[2])));
                    break;
                case "fibonacci":
                    output = String.valueOf(calc.fibonacciNumberFinder(Integer.parseInt(lineParts[1])));
                    break;
            }
            if (!input.equals("done")){
                System.out.println(output);
            }
        }
    }
}
