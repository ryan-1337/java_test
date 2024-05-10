package com.cleanarch.test.demo.Application.Handlers;

import com.cleanarch.test.demo.Application.IPokemonService;
import com.cleanarch.test.demo.Application.Queries.Pokemon.CreatePokemonQuery;
import com.cleanarch.test.demo.Application.Responses.PokemonResponse;
import com.cleanarch.test.demo.Domain.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class CreatePokemonHandler {
   IPokemonService iPokemonService;

   CreatePokemonHandler(IPokemonService iPokemonService) {
      this.iPokemonService = iPokemonService;
   }

   public PokemonResponse execute(CreatePokemonQuery query) {
      Pokemon pokemon = new Pokemon(query.name(), query.hp(), query.type());
      iPokemonService.addPokemon(pokemon);
      return new PokemonResponse(pokemon.getName(), pokemon.getHp(), pokemon.getType());
   }
}
