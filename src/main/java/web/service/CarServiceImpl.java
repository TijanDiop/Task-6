package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carsOnRequest(Integer count) {
        List<Car> carsList = List.of(new Car("BMW", "White", 1997),
                new Car("Skoda", "Black", 2000),
                new Car("Nissan", "Yellow", 2006),
                new Car("Opel", "Brown", 2022),
                new Car("Renault", "Red", 2010));

        if (count == null || count < 0) {
            return carsList;
        } else {
            return carsList.stream()
                    .limit(count)
                    .toList();
        }
    }
}
