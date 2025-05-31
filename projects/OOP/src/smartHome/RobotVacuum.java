package smartHome;

public class RobotVacuum implements HomeAppliance {
    private boolean isCleaning;

    @Override
    public void powerOn() {
        System.out.println("Робот-пылесос запущен, уборка начата");
        isCleaning = true;
    }

    public void returnToBase() {
        System.out.println("Возвращение на базу для зарядки");
        isCleaning = false;
    }
}
