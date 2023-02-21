package com.nebrija.pookemon.model.tipo;

import com.nebrija.pookemon.model.Pokemon;

public class Aire extends Pokemon {

    public Aire() {}

    public Aire(int id, String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(id, nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }

    public Aire(String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }
}
