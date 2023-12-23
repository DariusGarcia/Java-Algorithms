public class Car extends Vehicle {
    private final String model;
    public Car(String carType) {
        this.model = carType;
    }
    public void getModel() {
    System.out.printf("This car is a %s!\n", model);
    }
}

