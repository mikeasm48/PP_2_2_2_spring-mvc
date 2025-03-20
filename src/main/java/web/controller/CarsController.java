package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") Integer count,
                                 ModelMap model) {
        final String carsModelName = "cars";
        final String carsPageName = "cars";
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Hyundai Tucson", 2024, "X1"));
        carsList.add(new Car("Mazda CX-5", 2025, "Y2"));
        carsList.add(new Car("Ford Escape", 1883, "Z3"));
        carsList.add(new Car("Kia Sportage", 2025, "Super S"));
        carsList.add(new Car("Ford Bronco Sport", 1999, "Terrain Mountain"));
        if (count < 0 || count >= carsList.size()) {
            model.addAttribute(carsModelName, carsList);
        } else {
            model.addAttribute(carsModelName, carsList.subList(0, count));
        }
        return carsPageName;
    }
}
