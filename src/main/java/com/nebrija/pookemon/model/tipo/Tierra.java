package com.nebrija.pookemon.model.tipo;

import com.nebrija.pookemon.model.Pokemon;
public class Tierra extends Pokemon {

    public Tierra() {}

    public Tierra(int id, String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(id, nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }

    public Tierra(String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }
}
