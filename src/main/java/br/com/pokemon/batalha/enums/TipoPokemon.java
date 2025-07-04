package main.java.br.com.pokemon.batalha.enums;

public enum TipoPokemon {
    FOGO,
    AGUA,
    PLANTA,
    ELETRICO,
    NORMAL,
    PSIQUICO;

    public boolean obterVantagem(TipoPokemon outro) {
        switch (this) {
            case FOGO:
                return outro == PLANTA;
            case AGUA:
                return outro == FOGO;
            case PLANTA:
                return outro == AGUA;
            case ELETRICO:
                return outro == AGUA;
            case PSIQUICO:
                return outro == NORMAL;
            default:
                return false;
        }
    }

    public double obterMultiplicadorDano(TipoPokemon outro) {
        if (this == outro) {
            return 0.5; // Mesmo tipo = menos dano
        } else if (obterVantagem(outro)) {
            return 2.0; // Vantagem = dano duplo
        } else if (outro.obterVantagem(this)) {
            return 0.5; // Desvantagem = metade do dano
        } else {
            return 1.0; // Sem vantagem nem desvantagem = dano normal
        }
    }
}
