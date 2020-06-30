package TaskTwo;

public class Main {
    public static void main(String[] args) {
        KelvinConverter kelvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        kelvinConverter.convert(5);
        fahrenheitConverter.convert(10);
    }
}
