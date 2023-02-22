package com.nebrija.pookemon.model.tipo;

import com.nebrija.pookemon.model.Pokemon;

public class Psiquico extends Pokemon {

    public Psiquico() {}

    public Psiquico(int id, String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(id, nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }

    public Psiquico(String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        super(nombre, hp, habilidad, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, dodgeProb, strongAgainst, weakAgainst, synergyWith);
    }
}
