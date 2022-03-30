package com.example.citylist.controller;

import com.example.citylist.model.City;
import com.example.citylist.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {

    private CityRepository cityRepository;
    @Autowired
    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/")
    public String home(){
        return "mainpage";
    }

    @GetMapping("/addCityForm")
    public ModelAndView addCityForm(){
        ModelAndView mav = new ModelAndView("addCityForm","city",new City());
        return mav;
    }
    @PostMapping("/saveCity")
    public String saveCity(@ModelAttribute City city){
        cityRepository.save(city);
        return "redirect:/list";
    }

    @GetMapping({"/list"})
    public ModelAndView getAllCities(){
        ModelAndView mav = new ModelAndView("listCityForm","sehirler",cityRepository.findAll());
        return mav;
    }


}
