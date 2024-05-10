package com.cleanarch.test.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NonNull
    private String name;

    @NonNull
    private Integer hp;

    @NonNull
    private String type;

    public Pokemon(@NonNull String name, @NonNull Integer hp, @NonNull String type) {
        this.name = name;
        this.hp = hp;
        this.type = type;
    }
}
