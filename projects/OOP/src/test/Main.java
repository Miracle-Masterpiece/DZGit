package test;

public class Main {

    static abstract class Base {
        public abstract Number newInstance();
    };

    static class Derived extends Base {
        @Override
        public Integer newInstance() {
            return 47;
        }
    }

    public static void main(String[] args) {
        Base derived = new Derived();
        Number i = derived.newInstance();
        System.out.println(i);

    }

}
