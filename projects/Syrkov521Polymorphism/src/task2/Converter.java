package task2;

public class Converter {

    public enum Length {
        METER, CENTIMETER, MILLIMETER, FOOT
    }

    public enum Temperature {
        CELSIUS, FAHRENHEIT, KELVIN
    }

    public enum Weight {
        KILOGRAM, GRAM, POUND
    }

    public static double convert(double value, Length from, Length to) {
        double meters = 0.0;

        switch (from) {
            case METER:
                meters = value;
                break;
            case CENTIMETER:
                meters = value / 100.0;
                break;
            case MILLIMETER:
                meters = value / 1000.0;
                break;
            case FOOT:
                meters = value / 3.280;
                break;
        }

        switch (to) {
            case METER:
                return meters;
            case CENTIMETER:
                return meters * 100.0;
            case MILLIMETER:
                return meters * 1000.0;
            case FOOT:
                return meters * 3.280;
        }

        return 0;
    }

    public static double convert(double value, Temperature from, Temperature to) {
        double celsius = 0.0;

        switch (from) {
            case CELSIUS:
                celsius = value;
                break;
            case FAHRENHEIT:
                celsius = (value - 32) / 1.8;
                break;
            case KELVIN:
                celsius = value - 273.15;
                break;
        }

        switch (to) {
            case CELSIUS:
                return celsius;
            case FAHRENHEIT:
                return celsius * 1.8 + 32;
            case KELVIN:
                return celsius + 273.15;
        }

        return 0;
    }

    public static double convert(double value, Weight from, Weight to) {
        double kilograms = 0.0;

        switch (from) {
            case KILOGRAM:
                kilograms = value;
                break;
            case GRAM:
                kilograms = value / 1000.0;
                break;
            case POUND:
                kilograms = value / 2.20462;
                break;
        }

        switch (to) {
            case KILOGRAM:
                return kilograms;
            case GRAM:
                return kilograms * 1000.0;
            case POUND:
                return kilograms * 2.20462;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("1.75 метров в футах: " +    convert(1.75, Length.METER, Length.FOOT));
        System.out.println("4 метра в мм: " +           convert(4, Length.METER, Length.MILLIMETER));
        System.out.println("2 кг в фунтах: " +          convert(2, Weight.KILOGRAM, Weight.POUND));
        System.out.println("1000 г в кг: " +            convert(1000, Weight.GRAM, Weight.KILOGRAM));
        System.out.println("100°C в °F: " +             convert(100, Temperature.CELSIUS, Temperature.FAHRENHEIT));
        System.out.println("212°F в °C: " +             convert(212, Temperature.FAHRENHEIT, Temperature.CELSIUS));
    }
}
