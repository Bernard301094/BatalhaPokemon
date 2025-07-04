package main.java.br.com.pokemonbattle.utils;

import main.java.br.com.pokemonbattle.enums.TipoPokemon;

public class TipoUtils {
    public double getMultiplicador(TipoPokemon tipoAtacante, TipoPokemon tipoDefensor) {
        if (tipoAtacante.equals(tipoDefensor)) {
            return 0.5; // Mesmo tipo
        }
        switch (tipoAtacante) {
            case TipoPokemon.FOGO:
                return tipoDefensor.equals(TipoPokemon.GRAMA) ? 2.0 : 0.5;
            case TipoPokemon.AGUA:
                return tipoDefensor.equals(TipoPokemon.FOGO) ? 2.0 : 0.5;
            case TipoPokemon.GRAMA:
                return tipoDefensor.equals(TipoPokemon.AGUA) ? 2.0 : 0.5;
            default:
                return 1.0; // Tipo neutro
        }
    }
}
