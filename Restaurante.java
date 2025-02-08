import atendimento.*;
import funcionario.*;
import java.util.Queue;
import java.util.LinkedList;

public class Restaurante {
    public static final int NUMERO_MESAS = 30;
    static Queue<Mesa> mesasVazias = new LinkedList<Mesa>();
    // A Queue (fila) é uma estrutura de dado do tipo
    // First-In-First-Out (FIFO), que funciona, como se 
    // ninguém esperasse isso, igual a uma fila de verdade:
    // quem chegou primeiro sai primeiro e quem chegou por 
    
    // TODO: adicionar um array de funcionários e implementar os métodos
    
    static{
        // Adicionando todas as mesas ao restaurante
        // Inicialmente todas estão vazias
        // TODO: verificar se isso realmente funciona
        for(int i = 1; i <= NUMERO_MESAS; i++){
        mesasVazias.add(new Mesa(i, false));
        }
    }

    

}
