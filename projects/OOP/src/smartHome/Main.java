package smartHome;

public class Main {

    public static void main(String[] args) {
        HomeAppliance.checkVoltage();
        HomeAppliance kettle = new SmartKettle();
        HomeAppliance vacuum = new RobotVacuum();

        kettle.powerOn();
        kettle.powerOff();
        kettle.displayManufacturer();

        System.out.println("================================");

        vacuum.powerOn();
        vacuum.powerOff();
        vacuum.displayManufacturer();
    }
}
