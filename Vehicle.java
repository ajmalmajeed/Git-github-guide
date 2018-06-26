public class Vehicle {

    private String brand;
    private String vehicleType;
    private String transmissionType;
    private int numOfDoors;

    public Vehicle(String brand, String vehicleType, String transmissionType, int numOfDoors) {
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.transmissionType = transmissionType;
        this.numOfDoors = numOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

}