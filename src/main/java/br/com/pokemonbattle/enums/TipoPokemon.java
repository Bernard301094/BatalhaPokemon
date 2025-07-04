package main.java.br.com.pokemonbattle.enums;

public enum TipoPokemon {
    FOGO("🔥"),
    AGUA("💧"),
    GRAMA("🌿"),
    ELETRICO("⚡"),
    PEDRA("🪨"),
    PSIQUICO("🔮");

    private final String figurinha;

    TipoPokemon(String figurinha) {
        this.figurinha = figurinha;
    }

    public String getFigurinha() {
        return figurinha;
    }
}