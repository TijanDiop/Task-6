package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarServiceImpl carService;

    @GetMapping("/show")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carsList = carService.carsOnRequest(count);
        model.addAttribute("cars", carsList );

        return "cars-table";

    }


}
