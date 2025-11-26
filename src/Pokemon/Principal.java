package Pokemon;

import Utilidades.Utils;

import javax.management.MBeanRegistration;
import java.nio.channels.Pipe;

public class Principal {
    static void main(String[] args) {

        Pokemon[] pokemons=new Pokemon[Pokemon.numeroPokemons];

        for (int i = 0; i < pokemons.length; i++) {
            pokemons[i]=new Pokemon(i);
            pokemons[i].setNombre("Pokemon"+i);

            int numeroAzar= Utils.pedirNumeroAleatorio(1,4);

            switch (numeroAzar){
                case 1:
                    pokemons[i].setTipo(tipoPokemon.AGUA);
                    break;
                case 2:
                    pokemons[i].setTipo(tipoPokemon.FUEGO);
                    break;
                case 3:
                    pokemons[i].setTipo(tipoPokemon.TIERRA);
                    break;
                default:
                    pokemons[i].setTipo(tipoPokemon.FANTASMA);
                    break;

            }

//            pokemons[i].setTipo(tipo);
        }

        Pokemon pokemon1 = new Pokemon("Curro");
        pokemon1.setTipo(tipoPokemon.FUEGO);
        System.out.println(pokemon1);
        pokemon1.darGolpe();

        Pokemon pokemon2 = new Pokemon("Luis");
        pokemon2.setTipo(tipoPokemon.AGUA);
        System.out.println(pokemon2);
        pokemon2.darGolpe();

    }


}
