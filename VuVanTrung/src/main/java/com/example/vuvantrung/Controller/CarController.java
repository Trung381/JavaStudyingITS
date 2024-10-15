package com.example.vuvantrung.Controller;

import com.example.vuvantrung.Entity.Car;
import com.example.vuvantrung.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @PostMapping(path = "/add")
    public @ResponseBody String addNewCar(@RequestBody Car car) {
        carService.addCar(car);
        return "Saved";
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Car> getCarById(@PathVariable int id){
        return carService.getCarById(id);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Car> getAllCars() {
        return carService.getAllCar();
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateCar(@PathVariable Integer id, @RequestBody Car carDetails) {
        carService.updateCar(id, carDetails);
        return "Updated";
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return "Deleted";
    }
}