public class Temperatura {
    private static double valorTemp = 0.0d;
    private static double Celsius = 0.0d;
    private static double Fahrenheit = 0.0d;
    private static double Kelvin = 0.0d;

    public static double getValorTemp() {
        return valorTemp;
    }

    public static void setValorTemp(double valorTemp) {
        Temperatura.valorTemp = valorTemp;
    }

    public static double getCelsius() {
        return Celsius;
    }

    public static void setCelsius(double celsius) {
        Celsius = celsius;
    }

    public static double getFahrenheit() {
        return Fahrenheit;
    }

    public static void setFahrenheit(double fahrenheit) {
        Fahrenheit = fahrenheit;
    }

    public static double getKelvin() {
        return Kelvin;
    }

    public static void setKelvin(double kelvin) {
        Kelvin = kelvin;
    }

}
