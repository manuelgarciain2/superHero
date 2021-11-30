package com.in2.superHeroe.SuperHeroe.service;

import com.in2.superHeroe.SuperHeroe.exception.ResourceNotFoundException;
import com.in2.superHeroe.SuperHeroe.model.SuperHero;
import com.in2.superHeroe.SuperHeroe.payload.ApiResponse;
import com.in2.superHeroe.SuperHeroe.repository.SuperHerorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroService {

    @Autowired
    private SuperHerorepository superHerorepository;

    public List<SuperHero> findAllSuperHeroes() {
        return superHerorepository.findAll();
    }

    public SuperHero findSuperheroId(Long id) {
        return superHerorepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Superhero", "ID", id));
    }

    public SuperHero createSuperHero(SuperHero superHeroRequest) {
        return superHerorepository.save(superHeroRequest);
    }

    public SuperHero updateSuperHero(SuperHero superHeroRequest) {
        return superHerorepository.save(superHeroRequest);
    }

    public ApiResponse deleteSuperHero(Long superHeroRequest) {
        return superHerorepository.findById(superHeroRequest).map(superhero -> {
            superHerorepository.delete(superhero);
            return new ApiResponse(true, "Superhero deleted");
        }).orElseThrow(() -> new ResourceNotFoundException("Superhero", "id", superHeroRequest));

    }

    public List<SuperHero> findAllContaingName(String name) {
        return superHerorepository.findBysuperHeroNameContaining(name);
    }

}
