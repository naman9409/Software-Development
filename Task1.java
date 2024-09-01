import java.util.Scanner;

public class Task1 {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double value;
        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.println("Invalid temperature value.");
            scanner.close();
            return;
        }

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, Kelvin): ");
        scanner.nextLine(); // Consume newline left by nextDouble()
        String unit = scanner.nextLine().trim().toLowerCase();

        switch (unit) {
            case "celsius":
                double fahrenheitFromCelsius = celsiusToFahrenheit(value);
                double kelvinFromCelsius = celsiusToKelvin(value);
                System.out.printf("%.2f Celsius is equivalent to %.2f Fahrenheit and %.2f Kelvin.%n", value, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case "fahrenheit":
                double celsiusFromFahrenheit = fahrenheitToCelsius(value);
                double kelvinFromFahrenheit = fahrenheitToKelvin(value);
                System.out.printf("%.2f Fahrenheit is equivalent to %.2f Celsius and %.2f Kelvin.%n", value, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case "kelvin":
                double celsiusFromKelvin = kelvinToCelsius(value);
                double fahrenheitFromKelvin = kelvinToFahrenheit(value);
                System.out.printf("%.2f Kelvin is equivalent to %.2f Celsius and %.2f Fahrenheit.%n", value, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit. Please enter 'Celsius', 'Fahrenheit', or 'Kelvin'.");
                break;
        }

        scanner.close();
    }
}
