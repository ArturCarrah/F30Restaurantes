import atendimento.*;
import funcionario.*;
import java.util.Queue;
import java.util.LinkedList;

public class Restaurante {
    public static final int NUMERO_MESAS = 30;
    


    public static void main(String[] args) {
        Queue<Mesa> mesasVazias = new LinkedList<Mesa>();
        
        for(int i = 1; i <= NUMERO_MESAS; i++){
        mesasVazias.add(new Mesa(i, false));
        }
    }
    
    
    

    

}
