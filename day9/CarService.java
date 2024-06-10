package com.ey.day9;

import java.util.List;
import java.util.Set;


  public interface CarService {
    public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	public double getHighPricedCar(List<Car> carList);
	public Car getCarWithLowPricedCar(List<Car> carList);

    
}

