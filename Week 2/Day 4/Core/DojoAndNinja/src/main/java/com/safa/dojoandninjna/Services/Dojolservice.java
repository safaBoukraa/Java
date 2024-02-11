package com.safa.dojoandninjna.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.safa.dojoandninjna.Models.Dojolmodel;
import com.safa.dojoandninjna.Repositories.DojoRepositories;

@Service
public class Dojolservice {
    // adding 
    private final DojoRepositories dojoRepositories;
    
    public Dojolservice(DojoRepositories dojoRepositories) {
        this.dojoRepositories = dojoRepositories;
    }

    // returns all 
    public List<Dojolmodel> allDojo() {
        return dojoRepositories.findAll();
    }

    // creates 
    public Dojolmodel createDojo(Dojolmodel dojo) {
        return dojoRepositories.save(dojo);
    }
    // READ ONE 
    // retrieves 
    public Dojolmodel findDojo(Long id) {
        Optional<Dojolmodel> optionalDojo = dojoRepositories.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}