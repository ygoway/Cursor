package HomeWork9;

import java.util.Random;
import java.util.UUID;

public interface GenerateRandomCar {
    default Car carGenerator() {
        Random randomToBrand = new Random();
        UUID id = UUID.randomUUID();
        Car.Brand[] brand = Car.Brand.values();
        Car.Brand randomBrand = brand[randomToBrand.nextInt(brand.length)];
        int year = new Random().nextInt(2016, 2021);
        int mileage = new Random().nextInt(0, 80000);
        int price = new Random().nextInt(10000, 40000);
        return new Car(id, randomBrand, year, mileage, price);
    }
}
