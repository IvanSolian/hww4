package carshop;

import java.util.Date;

public abstract class Cars {
    private final Date dateOfRegistration;

    public Cars() {
        this.dateOfRegistration = new Date();


    }

    public abstract void fuel ();
    public abstract void size ();
    public abstract void power ();


}
