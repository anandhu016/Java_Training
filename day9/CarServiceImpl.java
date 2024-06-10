package com.ey.day9assignment;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                .mapToDouble(Car::getPrice)
                .sum();
    }

    @Override
    public List<String> getCarNames(List<Car> carList) {
        return carList.stream()
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> getCarMakers(List<Car> carList) {
        return carList.stream()
                .map(Car::getCareMake)
                .collect(Collectors.toSet());
    }

    @Override
    public double getHighPricedCar(List<Car> carList) {
        return carList.stream()
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0.0);
    }

    @Override
    public Car getCarWithLowPricedCar(List<Car> carList) {
        return carList.stream()
                .min((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .orElse(null);
    }
}
