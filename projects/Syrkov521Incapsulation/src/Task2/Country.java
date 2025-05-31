package Task2;

//название (класс String);
//численность населения (тип int);
//площадь в квадратных километрах (тип double);
//название столицы (класс String);
//наличие выхода к морю (тип boolean).


public class Country {
    private String  name;
    private String  capital;
    private int     countCitizen;
    private double  area;
    private boolean enterToSea;

    public Country(String name) {
        this.name = name;
    }

    public boolean isEnterToSea() {
        return enterToSea;
    }

    public void setEnterToSea(boolean enterToSea) {
        this.enterToSea = enterToSea;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCountCitizen() {
        return countCitizen;
    }

    public void setCountCitizen(int countCitizen) {
        this.countCitizen = countCitizen;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.
                append("Name: ").append(getName()).
                append("\nCapital: ").append(getCapital()).
                append("\nCount citizen: ").append(getCountCitizen()).
                append("\nArea: ").append(getArea()).
                append("\nEnterToSea: ").append(isEnterToSea());
        return sb.toString();
    }
}
