package F30Restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import atendimento.*;
import cozinha.*;
import funcionario.Funcionario;

public class Restaurante {
    private static final int NUMERO_MESAS = 30;
    private static Queue<Mesa> mesasVazias = new LinkedList<>();
    private static double caixaRestaurante = 0;
    private static List<Garcom> listaGarcons = new ArrayList<>();
    private static List<Cozinheiro> listaCozinheiros = new ArrayList<>();
    private static Cozinha cozinha = new Cozinha();

    static {
        // Inicializa as mesas vazias
        for (int i = 1; i <= NUMERO_MESAS; i++) {
            mesasVazias.add(new Mesa(i, false));
        }
    }

    // Getters e Setters
    public static Iterable<Garcom> getListaGarcoms() {
        return listaGarcons;
    }

    public static double getCaixaRestaurante() {
        return caixaRestaurante;
    }

    public static void setCaixaRestaurante(double dinheiro) {
        caixaRestaurante = dinheiro;
    }

    public static Cozinha getCozinha() {
        return cozinha;
    }

    public static List<Funcionario> getListaFuncionarios() {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.addAll(listaGarcons);
        listaFuncionarios.addAll(listaCozinheiros);
        return listaFuncionarios;
    }

    public static List<Garcom> getListaGarcons() {
        return listaGarcons;
    }

    // Método para calcular o salário total dos funcionários
    public double calcularSalarioFuncionarios() {
        double gastoSalarios = 0;

        // Soma os salários dos garçons
        for (Garcom garcom : listaGarcons) {
            gastoSalarios += garcom.calcularSalario();
        }

        // Soma os salários dos cozinheiros
        for (Cozinheiro cozinheiro : cozinha.getCozinheiros()) {
            gastoSalarios += cozinheiro.calcularSalario();
        }

        return gastoSalarios;
    }

    // Construtor
    public Restaurante() {
        // Não adicione funcionários aqui para evitar duplicação
    }
}