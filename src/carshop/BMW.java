package carshop;

public class BMW extends Cars {
    @Override
    public void fuel() {
        System.out.println("Gas");

    }

    @Override
    public void size() {
        System.out.println("SUV");

    }

    @Override
    public void power() {
        System.out.println("230 horse/power");

    }
}
