package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarService {
    private List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car("Hyundai Tucson", 2024, "X1"));
        carsList.add(new Car("Mazda CX-5", 2025, "Y2"));
        carsList.add(new Car("Ford Escape", 1883, "Z3"));
        carsList.add(new Car("Kia Sportage", 2025, "Super S"));
        carsList.add(new Car("Ford Bronco Sport", 1999, "Terrain Mountain"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count < 0 || count >= carsList.size()) {
            return carsList;
        }
        return carsList.subList(0, count);
    }
}
