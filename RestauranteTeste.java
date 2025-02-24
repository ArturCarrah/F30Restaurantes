package F30Restaurantes;

import F30Restaurantes.atendimento.Garcom;
import F30Restaurantes.cozinha.Cozinheiro;
import F30Restaurantes.cozinha.CozinheiroEspecial;

public class RestauranteTeste {

    //Instanciando os garçons e cozinheiros.
    Garcom garcom1 = new Garcom("Carlos");
    Garcom garcom2 = new Garcom("Ana");
    Garcom garcom3 = new Garcom("Lucas");
    Garcom garcom4 = new Garcom("Maria");
    Garcom garcom5 = new Garcom("Ricardo");
    Garcom garcom6 = new Garcom("Juliana");
    Garcom garcom7 = new Garcom("Sofia");
    Garcom garcom8 = new Garcom("Pedro");
    Garcom garcom9 = new Garcom("Gabriela");
    Garcom garcom10 = new Garcom("João");

    Cozinheiro cozinheiro1 = new Cozinheiro("Eduardo", 5, false);
    Cozinheiro cozinheiro2 = new Cozinheiro("Fernanda", 8, false);
    Cozinheiro cozinheiro3 = new Cozinheiro("Ricardo", 10, false);
    Cozinheiro cozinheiro4 = new Cozinheiro("Juliana", 3, false);
    Cozinheiro cozinheiro5 = new Cozinheiro("Carlos", 7, false);
    Cozinheiro cozinheiro6 = new Cozinheiro("Camila", 9, true);
    Cozinheiro cozinheiro7 = new Cozinheiro("Pedro", 6, false);
    Cozinheiro cozinheiro8 = new Cozinheiro("Isabela",10,true);
    CozinheiroEspecial cozinheiroEspecial1 = new CozinheiroEspecial("Gustavo", 9, true, 3);
    CozinheiroEspecial cozinheiroEspecial2 = new CozinheiroEspecial("Beatriz",7,false,5);

    public static void main(String[] args){

        Restaurante F30 = new Restaurante();
    }

}
