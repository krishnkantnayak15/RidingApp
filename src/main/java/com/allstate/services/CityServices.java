package com.allstate.services;

import com.allstate.entities.City;
import com.allstate.repositories.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServices {

    @Autowired
    private ICityRepository cityRepo;

    public City create(City city) {
        return this.cityRepo.save(city);
    }

    public City findById(int id) {
        return  this.cityRepo.findOne(id);
    }

    public void deleteById(int id) { this.cityRepo.delete(id);
    }
}
