package factory;

public class VehicleFactory {
    private static VehicleFactory vehicleFactoryInstance;

    private VehicleFactory() {
    }

    public static VehicleFactory getInstance() {
        if (vehicleFactoryInstance == null) {
            vehicleFactoryInstance = new VehicleFactory();
        }
        return vehicleFactoryInstance;
    }

    public Vehicle getVehicle(VehicleFactoryEnum vehicleFactoryEnum) {
        switch (vehicleFactoryEnum) {
            case PLANE: {
                return new Plane();
            }
            case SHIP: {
                return new Ship();
            }
            case CAR: {
                return new Car();
            }
            default: {
                return null;
            }
        }
    }
}