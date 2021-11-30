package com.in2.superHeroe.SuperHeroe.controller;

import com.in2.superHeroe.SuperHeroe.model.SuperHero;
import com.in2.superHeroe.SuperHeroe.payload.ApiResponse;
import com.in2.superHeroe.SuperHeroe.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/superheroes")
public class SuperheroController {

    @Autowired
    private SuperHeroService superHeroServices;

    @GetMapping("")
    public List<SuperHero> getSuperHeroes() {
        return superHeroServices.findAllSuperHeroes();
    }

    @GetMapping("/{superHeroId}")
    public SuperHero getSuperHeroById(@PathVariable Long superHeroId) {
        return superHeroServices.findSuperheroId(superHeroId);
    }

    @PostMapping("/create")
    public SuperHero createSuperHero(@RequestBody SuperHero superHeroRequest){
        return superHeroServices.createSuperHero(superHeroRequest);
    }

    @GetMapping("/findLike/{name}")
    public List<SuperHero> getSuperHeroLikeName(@PathVariable String name){
        return superHeroServices.findAllContaingName(name);
    }

    @PutMapping("/update")
    public SuperHero updateSuperHero(@Valid @RequestBody  SuperHero superHeroRequest){
        return superHeroServices.updateSuperHero(superHeroRequest);
    }

    @DeleteMapping("/delete/{superHeroId}")
    public ApiResponse deleteSuperhero(@PathVariable Long superHeroId){
        return superHeroServices.deleteSuperHero(superHeroId);
    }
}
