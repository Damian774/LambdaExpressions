package factory;

public class Ship implements Vehicle {


    public Ship() {
    }

    @Override
    public void start() {
        System.out.println("Ship started");
    }
}
