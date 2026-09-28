package app;

public class Main {

    private static final double CONV_F = 1.8;

    public static void main(String[] args) {
        System.out.println("Temperature Unit Converter \n");
        double fahrenheitInput = 10;
        double celsiusResult = convFahrenheitToCelsius(fahrenheitInput);
        System.out.printf("Result is: %.3f degrees Fahrenheit equal %.3f degrees Celsius.", fahrenheitInput, celsiusResult);
    }

    private static double convFahrenheitToCelsius(double fahrenheitInput) {
        return (fahrenheitInput - 32) / CONV_F;
    }
}