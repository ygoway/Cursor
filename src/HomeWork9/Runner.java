package HomeWork9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static HomeWork9.Car.Brand.AUDI;
import static HomeWork9.Car.Brand.TESLA;

public class Runner {
    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(UUID.randomUUID(), TESLA, 2018, 40000, 20000),
                new Car().carGenerator(),
                new Car().carGenerator(),
                new Car().carGenerator(),
                new Car().carGenerator(),
                new Car().carGenerator()
        );

        System.out.println(carList);

        List<Car> onlyTeslaAndAudi = carList.stream()
                .filter(car -> car.getBrand() == TESLA
                        || car.getBrand() == AUDI)
                .collect(Collectors.toList());
        System.out.println(onlyTeslaAndAudi);

        List<Car> youngerThen2018 = carList.stream()
                .filter(car -> car.getYear() > 2018)
                .collect(Collectors.toList());
        System.out.println(youngerThen2018);

        List<Car> mileageOver40000 = carList.stream()
                .filter(car -> car.getMileage() < 40000)
                .collect(Collectors.toList());
        System.out.println(mileageOver40000);

        List<Car> sortedPriceReverseOrder = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedPriceReverseOrder);

        Map<UUID, Car> top3CheapestCarMap = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(3)
                .collect(Collectors.toMap(Car::getId, Function.identity()));
        System.out.println(top3CheapestCarMap);

    }
}

