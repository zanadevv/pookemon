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
    private double dodgeProb;
    private Tipo strongAgainst, weakAgainst, synergyWith;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, Tipo tipo, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
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

    public Pokemon(String nombre, Tipo tipo, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
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

    public Pokemon(int id, String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
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

    public Pokemon(String nombre, int hp, String habilidad, int ataque, int ataqueEspecial, double defensa, double defensaEspecial, int velocidad, double dodgeProb, Tipo strongAgainst, Tipo weakAgainst, Tipo synergyWith) {
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

    public Pokemon attack(Pokemon p) {
        p.setHp(p.getHp() - (int) (this.getAtaque() * p.getDefensa()));
        return p;
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

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(double defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getDodgeProb() {
        return dodgeProb;
    }

    public void setDodgeProb(double dodgeProb) {
        this.dodgeProb = dodgeProb;
    }

    public Tipo getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(Tipo strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public Tipo getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(Tipo weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    public Tipo getSynergyWith() {
        return synergyWith;
    }

    public void setSynergyWith(Tipo synergyWith) {
        this.synergyWith = synergyWith;
    }
}