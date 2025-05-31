package smartHome;

public interface HomeAppliance {
    //const
    String DEFAULT_MANUFACTURER = "SmartHome Inc."; //public static final по-умолчанию

    void powerOn(); //абстрактный метод

    default void powerOff() {
        System.out.println("Прибор выключен стандартным образом");
    }

    default void displayManufacturer() {
        System.out.println("Производитель: " + DEFAULT_MANUFACTURER);
    }

    static void checkVoltage() {
        System.out.println("Проверка напряжения");
    }

}























