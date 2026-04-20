package com.restaurantes.controller;


import ch.qos.logback.core.model.Model;
import com.restaurantes.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor

public class RestaurantController {

    private RestaurantRepository restaurantRepository;

   // public RestaurantController(RestaurantRepository restaurantRepository) {
   //     this.restaurantRepository = restaurantRepository;
   // }

    @GetMapping("restaurants")

    public String restaurants(Model model) {
        model.addAttribute ("restaurants", restaurantRepository.findAll());
        model.addAttribute("saludo", "Bienvenido a la ista de restaurantes");
        return "restaurant-list";

    }
}
