package main.java.br.com.pokemonbattle.enums;

public enum TipoPokemon {
    FOGO("Fogo 🔥"),
    AGUA("Água 💧"),
    GRAMA("Grama 🌿"),
    ELETRICO("Elétrico ⚡"),
    PEDRA("Pedra 🪨"),
    PSIQUICO("Psíquico 🔮");

    private final String descricao;

    TipoPokemon(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}