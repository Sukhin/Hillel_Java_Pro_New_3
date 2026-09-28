package app;

public class Main {

    private static final double CONV_F1 = 1.8;
    private static final int CONV_F2 = 32;

    public static void main(String[] args) {
        System.out.println("Temperature Unit Converter \n");
        double fahrenheitInput = 10;
        double celsiusInput = 15;
        double celsiusResult = convFahrenheitToCelsius(fahrenheitInput);
        double fahrenheitResult = convCelsiusToFahrenheit(celsiusInput);
        System.out.printf("Result is: %.3f degrees Fahrenheit equals %.3f degrees Celsius. \n"
        + "Result is: %.3f degrees Celsius equals %.3f degrees Fahrenheit.", fahrenheitInput, celsiusResult, celsiusInput, fahrenheitResult);

    }

    private static double convFahrenheitToCelsius(double fahrenheitInput) {
        return (fahrenheitInput - CONV_F2) / CONV_F1;
    }

    private static double convCelsiusToFahrenheit(double celsiusInput) {
        return celsiusInput * CONV_F1 + CONV_F2;
    }
}