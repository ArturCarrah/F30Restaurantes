package F30Restaurantes;

import java.util.ArrayList;
import java.util.List;
import F30Restaurantes.atendimento.*;
import F30Restaurantes.cozinha.Cozinha;
import java.util.Queue;
import java.util.LinkedList;

public class Restaurante {
    public static final int NUMERO_MESAS = 30;
    static Queue<Mesa> mesasVazias = new LinkedList<Mesa>();
    // A Queue (fila) é uma estrutura de dado do tipo
    // First-In-First-Out (FIFO), que funciona, como se
    // ninguém esperasse isso, igual a uma fila de verdade:
    // quem chegou primeiro sai primeiro e quem chegou por ultimo sai por ultimo.

    private static double caixaRestaurante = 0;

    static{
        // Adicionando todas as mesas ao restaurante
        // Inicialmente todas estão vazias
        // TODO: verificar se isso realmente funciona
        for(int i = 1; i <= NUMERO_MESAS; i++){
            mesasVazias.add(new Mesa(i, false));
        }
    }

    static List<Garcom> listaGarcoms = new ArrayList<Garcom>();
    static Cozinha cozinha;


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
