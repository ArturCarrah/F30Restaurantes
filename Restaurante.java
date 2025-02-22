package F30Restaurantes;

import java.util.ArrayList;
import java.util.List;
import F30Restaurantes.atendimento.*;
import F30Restaurantes.cozinha.Cozinha;

public class Restaurante {
    static List<Garcom> listaGarcoms = new ArrayList<Garcom>();
    static Cozinha cozinha;

    public static List<Garcom> getListaGarcoms(){
        return listaGarcoms;
    }

    public static Cozinha getCozinha(){
        return cozinha;
    }
}
