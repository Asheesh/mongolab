package com.ashlab.mongolab.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    protected Logger logger = Logger.getLogger(HotelController.class.getName());
    @Autowired
    private HotelRepository hotelRepository;
/*
    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable String id){
        logger.info("getHotel request recd. id is "+ id);
        return this.hotelRepository.findOne(id);
    }
*/

    @GetMapping("/all")
    public List<Hotel> getAll(){
        logger.info("Hotel Service getAll invoked...");
        List<Hotel> hotelList = this.hotelRepository.findAll();
        System.out.println(hotelList);
        return hotelList;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel){
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void save(@RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(String id){
        this.hotelRepository.delete(id);
    }

}
