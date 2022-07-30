package carshop;

public class Audi extends Cars {
    @Override
    public void fuel() {
        System.out.println("Disiel");
    }

    @Override
    public void size() {
        System.out.println("sedan");

    }

    @Override
    public void power() {
        System.out.println("200 horse/power");

    }
}
