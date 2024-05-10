package com.cleanarch.test.demo.Api;

import com.cleanarch.test.demo.Application.Handlers.CreatePokemonHandler;
import com.cleanarch.test.demo.Application.Queries.Pokemon.CreatePokemonQuery;
import com.cleanarch.test.demo.Domain.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PokemonController {
    private final CreatePokemonHandler createPokemonHandler;

    public PokemonController(CreatePokemonHandler createPokemonHandler) {
        this.createPokemonHandler = createPokemonHandler;
    }


    //@GetMapping("/pokemon")
    //public List<Pokemon> getAllFullLifePokemon() {
    //    return this.pokemon.stream().filter(pokemon -> pokemon.getHp().equals(100)).collect(Collectors.toList());
    //}

    @PostMapping("/new")
    public ResponseEntity<Pokemon> createPokemon(@RequestBody CreatePokemonQuery query) {
        createPokemonHandler.execute(query);
        return new ResponseEntity<Pokemon>(HttpStatus.OK);
    }
}

