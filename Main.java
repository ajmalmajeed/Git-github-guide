public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Audi", "Car", "Auto", 4);
        System.out.println("Brand: "+ vehicle.getBrand()  +" Type: "+ vehicle.getVehicleType() + " Transmission: "
                + vehicle.getTransmissionType() + " Number of doors: "+ vehicle.getNumOfDoors());
    }

}