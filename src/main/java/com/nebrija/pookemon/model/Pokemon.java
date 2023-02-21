package com.nebrija.pookemon.model;
import com.nebrija.pookemon.model.tipo.Tipo;

public abstract class Pokemon {

    private int id;
    private String nombre;
    private Tipo tipo;
    private int hp;
    private String habilidad;
    private int ataque, ataqueEspecial;
    private double defensa, defensaEspecial;
    private int velocidad;
    private int dodgeProb;
    private Tipo strongAgainst, weakAgainst, synergyWith;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, Tipo tipo, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.dodgeProb = dodgeProb;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.synergyWith = synergyWith;
    }

    public Pokemon(String nombre, Tipo tipo, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.dodgeProb = dodgeProb;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.synergyWith = synergyWith;
    }

    public Pokemon(int id, String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        this.id = id;
        this.nombre = nombre;
        this.hp = hp;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.dodgeProb = dodgeProb;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.synergyWith = synergyWith;
    }

    public Pokemon(String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, int dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
        this.nombre = nombre;
        this.hp = hp;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.dodgeProb = dodgeProb;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.synergyWith = synergyWith;
    }
}