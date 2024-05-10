package com.cleanarch.test.demo.Infrastructure.Repositories.Services;

import com.cleanarch.test.demo.Application.IPokemonService;
import com.cleanarch.test.demo.Domain.Pokemon;
import com.cleanarch.test.demo.Infrastructure.Repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService implements IPokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Optional<Pokemon> getPokemonById(Long id) {
        return this.pokemonRepository.findById(id);
    }

    public Pokemon getPokemonByName(String name) {
        return pokemonRepository.findByName(name);
    }

    public List<Pokemon> getPokemons() {
        return pokemonRepository.findAll();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    public void updatePokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    public void deletePokemon(Long id) {
        Pokemon pokemon = pokemonRepository.findById(id).orElseThrow();
        pokemonRepository.delete(pokemon);
    }
}
