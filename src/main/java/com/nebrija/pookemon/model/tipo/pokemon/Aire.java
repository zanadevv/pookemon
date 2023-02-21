package com.nebrija.pookemon.model.tipo.pokemon;

import com.nebrija.pookemon.model.Pokemon;
import com.nebrija.pookemon.model.combate.Ataque;
import com.nebrija.pookemon.model.combate.Defensa;
import com.nebrija.pookemon.model.combate.Habilidad;

public class Aire extends Pokemon {

    public Aire() {}

    public Aire(int id, String nombre, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
        super(id, nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }

    public Aire(String nombre, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
        super(nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }

}
