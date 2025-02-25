package F30Restaurante;

import atendimento.Garcom;
import cozinha.Cozinheiro;
import excecoes.*;
import funcionario.Funcionario;
import cozinha.CozinheiroEspecial;
import atendimento.Cardapio;

import java.util.Random;

public class RestauranteTeste {
    public static void main(String[] args) {
        // Criar uma instância de Restaurante
        Restaurante F30 = new Restaurante();

        // --- ADICIONAR FUNCIONÁRIOS ÀS LISTAS ESTÁTICAS ---
        // Adicionar garçons à lista estática
        try {
            new Garcom("Felix");
            new Garcom("Ana");
            new Garcom("Lucas");
            new Garcom("Maria");
            new Garcom("Ricardo");
            new Garcom("Juliana");
            new Garcom("Sofia");
            new Garcom("Pedro");
            new Garcom("Gabriela");
            new Garcom("João");

            // Adicionar um garçom com nome inválido para testar a exceção
            Restaurante.getListaGarcons().add(new Garcom("")); // Nome inválido
        } catch (NomeInvalidoException | SalarioInvalidoException | FuncaoInvalidaException e) {
            System.out.println("Erro ao adicionar garçom: " + e.getMessage());
        }

        // Adicionar cozinheiros à lista estática
        try {
            new Cozinheiro("Eduardo", 5, 2, false);
            new Cozinheiro("Fernanda", 8, 2, false);
            new Cozinheiro("Ricardo", 10, 2, false);
            new Cozinheiro("Juliana", 3, 2, false);
            new Cozinheiro("Carlos", 7, 2, false);
            new Cozinheiro("Camila", 9, 2, true);
            new Cozinheiro("Pedro", 6, 2, false);
            new Cozinheiro("Isabela", 10, 2, true);
            new CozinheiroEspecial("Gustavo", 9, 2, true, 3);
            new CozinheiroEspecial("Beatriz", 7, 2, false, 5);
        } catch (NomeInvalidoException | SalarioInvalidoException | ParametroNegativoException | FuncaoInvalidaException e) {
            System.out.println("Erro ao adicionar cozinheiro: " + e.getMessage());
        }

        // --- SIMULAR PEDIDOS ---
        Random random = new Random();
        for (Garcom garcom : Restaurante.getListaGarcons()) {
            int quantidadePedidos = random.nextInt(5) + 1; // Cada garçom faz de 1 a 5 pedidos
            System.out.println("\nGarçom " + garcom.getNome() + " está fazendo " + quantidadePedidos + " pedidos:");

            for (int i = 0; i < quantidadePedidos; i++) {
                try {
                    // Escolhe um item aleatório do cardápio
                    Cardapio item = Cardapio.values()[random.nextInt(Cardapio.values().length)];
                    garcom.fazerPedido(item); // Faz o pedido

                    // Exibe detalhes do pedido
                    System.out.println("Pedido " + (i + 1) + ": " + item.name() +
                            " (Código: " + item.getCodigo() +
                            ", Preço: R$ " + item.getPreco() +
                            ", Especial: " + (item.getEhEspecial() ? "Sim" : "Não") + ")");

                    // Verifica se o pedido precisa ser preparado por um cozinheiro especial
                    if (item.getEhEspecial()) {
                        System.out.println("  --> Este pedido precisa ser preparado por um cozinheiro especial.");
                    }
                } catch (PedidoInvalidoException e) {
                    System.out.println("Erro ao fazer pedido: " + e.getMessage());
                }
            }
        }

        // --- VALIDAR FUNCIONÁRIOS ---
        ValidarFuncionario validar = new ValidarFuncionario();
        try {
            validar.validarFuncionarios(F30);
        } catch (NomeInvalidoException e) {
            System.out.println("Erro encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Outro erro encontrado: " + e.getMessage());
        }

        // --- EXIBIR SALÁRIOS DOS FUNCIONÁRIOS ---
        System.out.println("\n> Salários dos funcionários:");
        for (Funcionario f : Restaurante.getListaFuncionarios()) {
            System.out.println(f.getFuncao() + " " + f.getNome() + ": R$ " + f.calcularSalario());
        }

        // --- CALCULAR E EXIBIR O TOTAL DE SALÁRIOS ---
        System.out.println("\nTotal de salários a pagar: R$ " + F30.calcularSalarioFuncionarios());

        // --- EXIBIR O TOTAL DE FUNCIONÁRIOS ---
        System.out.println("Total de funcionários: " + Funcionario.getContadorFuncionarios());
    }
}