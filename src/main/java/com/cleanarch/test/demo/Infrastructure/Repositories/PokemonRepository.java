package com.cleanarch.test.demo.Infrastructure.Repositories;

import com.cleanarch.test.demo.Domain.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("PokemonRepository")
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Pokemon findByName(String name);
}
