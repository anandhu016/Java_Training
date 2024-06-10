package com.ey.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
 

public class CarApp  {
 
   
    public static void main(String[] args) {
    Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00)
				
					};

		List <Car> carList =  new ArrayList<>(Arrays.asList(cars));
       for (Car car : carList) {
        System.out.println(carList);
        
       }
        try {
			CarService service =new CarApp();
            System.out.println("SumOfPrices:"+service.sumOfPrices(carList));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
        
    }

   
    
}
