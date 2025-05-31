import inheritance.Person;
import inheritance.Programmer;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        /**
         * ООП - парадигма программирования, основанная на 2 концепциях:
         * Классы, объкты.
         *
         * Класс - сущность/шаблон со своими полями/свойствами, конструкторами и методами/поведением.
         * Объект - экземляр класса.
         *
         * В ООП есть 4 основных поняти:
         * 1. Инкапсуляция.
         * 2. Наследование. - процесс создания нового класса на основе существуююшего с расширением функциональности.
         * 3. Полиморфизм.
         *
         * 4. Абстракция (абстрактные классы и интерфейсы)
         *
         * Абстракция - это процесс скрытия деталей реализации и предоставления только общего представления объекта.
         *
         * Абстрактный класс - класс для наследования (может иметь абстрактные методы)
         * Интерфейс - абстрактный тип, определяющий контракт (набор методов), реализуемый в классах.
         */

        Programmer elena = new Programmer("Елена", 20, "Java");
        elena.speak();
        elena.program("БД");

        Doctor ruslan = new Doctor("Руслан", 45, "Терапевт");
        ruslan.speak();
        ruslan.heal("ОРВИ");

        System.out.println(Person.getTotalCreatedObjects());
    }


    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static int avg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }
}