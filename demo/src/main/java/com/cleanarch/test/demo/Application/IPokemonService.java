package com.cleanarch.test.demo.Application;

import com.cleanarch.test.demo.Domain.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IPokemonService {
    Optional<Pokemon> getPokemonById(Long id);
    Pokemon getPokemonByName(String pokemonName);
    List<Pokemon> getPokemons();
    void addPokemon(Pokemon pokemon);
    void updatePokemon(Pokemon pokemon);
    void deletePokemon(Long id);
}
