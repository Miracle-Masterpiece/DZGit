package smartHome;

public class SmartKettle implements  HomeAppliance {

    private int temperature;

    @Override
    public void powerOn() {
        System.out.println("Чайник включен, начат нагрев воды");
        temperature = 100;
    }

    @Override
    public void powerOff() {
        System.out.println("Чайник выключен");
        temperature = 0;
    }

    public void setTemperature(int temperature){
        System.out.println("Чайник греется до " + temperature + "°С");
        this.temperature = temperature;
    }
}
