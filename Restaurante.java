package F30Restaurantes;

import java.util.ArrayList;
import java.util.List;
import F30Restaurantes.atendimento.*;
import F30Restaurantes.cozinha.Cozinha;

public class Restaurante {
    static List<Garcom> listaGarcoms = new ArrayList<Garcom>();
    static Cozinha cozinha;
    private static double caixaRestaurante = 0;

    public static double getCaixaRestaurante(){
        return caixaRestaurante;
    }

    public static void setCaixaRestaurante(double dinheiro){
        caixaRestaurante = dinheiro;
    }

    public static List<Garcom> getListaGarcoms(){
        return listaGarcoms;
    }

    public static Cozinha getCozinha(){
        return cozinha;
    }
}
