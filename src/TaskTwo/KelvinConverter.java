package TaskTwo;

public class KelvinConverter implements Converter {

    @Override
    public void convert(double celsius) {
        System.out.println(celsius + 273.15);
    }
}
