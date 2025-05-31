package Generics;

public class Pair<T, U> {

    private T var0;
    private U var1;

    public Pair(T var0, U var1) {
        this.var0 = var0;
        this.var1 = var1;
    }

    public T getVar0() {
        return var0;
    }

    public void setVar0(T var0) {
        this.var0 = var0;
    }

    public U getVar1() {
        return var1;
    }

    public void setVar1(U var1) {
        this.var1 = var1;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "var0=" + var0 +
                ", var1=" + var1 +
                '}';
    }
}
