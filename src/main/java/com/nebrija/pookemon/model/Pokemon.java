package com.nebrija.pookemon.model;

import com.nebrija.pookemon.model.combate.Ataque;
import com.nebrija.pookemon.model.combate.Defensa;
import com.nebrija.pookemon.model.combate.Habilidad;
import com.nebrija.pookemon.model.tipo.pokemon.Tipo;

public abstract class Pokemon {

    private int id;
    private String nombre;
    private Tipo tipo;
    private int hp;
    private Habilidad habilidad;
    private Ataque ataque, ataqueEspecial;
    private Defensa defensa, defensaEspecial;
    private int velocidad;
    private int dodgeProb;
    private Pokemon strongAgainst, weakAgainst, synergyWith;

    public Pokemon(){}

    public Pokemon(int id, String nombre, Tipo tipo, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
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

    public Pokemon(String nombre, Tipo tipo, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
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

    public Pokemon(int id, String nombre, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
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

    public Pokemon(String nombre, int hp, Habilidad habilidad, Ataque ataque, Ataque ataqueEspecial, Defensa defensa, Defensa defensaEspecial, int velocidad, int dodgeProb, Pokemon strongAgainst, Pokemon weakAgainst, Pokemon synergyWith) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public Ataque getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(Ataque ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public Defensa getDefensa() {
        return defensa;
    }

    public void setDefensa(Defensa defensa) {
        this.defensa = defensa;
    }

    public Defensa getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(Defensa defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDodgeProb() {
        return dodgeProb;
    }

    public void setDodgeProb(int dodgeProb) {
        this.dodgeProb = dodgeProb;
    }

    public Pokemon getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(Pokemon strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public Pokemon getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(Pokemon weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    public Pokemon getSynergyWith() {
        return synergyWith;
    }

    public void setSynergyWith(Pokemon synergyWith) {
        this.synergyWith = synergyWith;
    }

}
