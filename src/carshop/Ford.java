package carshop;

public class Ford extends Cars{
    @Override
    public void fuel() {
        System.out.println("Gas");
    }

    @Override
    public void size() {
        System.out.println("hatchback");

    }

    @Override
    public void power() {
        System.out.println("110 horse/power");

    }

}
