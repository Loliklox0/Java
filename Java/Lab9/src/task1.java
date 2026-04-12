class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    void fuelConsumption() {
        System.out.println("Fuel consumption is undefined for the base Car class.");
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Sedan fuel consumption: 7 liters/100 km");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Truck fuel consumption: 20 liters/100 km");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("SUV fuel consumption: 12 liters/100 km");
    }
}

public class task1 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 180);
        Truck truck = new Truck("Volvo", 120);
        SUV suv = new SUV("Jeep", 140);

        sedan.displayInfo();
        sedan.fuelConsumption();

        truck.displayInfo();
        truck.fuelConsumption();

        suv.displayInfo();
        suv.fuelConsumption();
    }
}