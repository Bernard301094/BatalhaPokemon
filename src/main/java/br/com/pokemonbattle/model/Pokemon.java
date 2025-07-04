package main.java.br.com.pokemonbattle.model;

import main.java.br.com.pokemonbattle.enums.TipoPokemon;

public abstract class Pokemon {
    private String nome;
    private TipoPokemon tipo;
    private int vida;
    private int ataque;
    private int defesa;

    public Pokemon(String nome, TipoPokemon tipo, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
}
