package F30Restaurantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGerente {
    private JFrame frame;
    private JLabel labelLucro;
    private JTextArea textAreaMesas;
    private JButton btnAtualizar;
    private JButton btnFecharRestaurante;
    private JButton btnCalcularSalarios;
    private int[] mesasAtendidasPorGarcom;
    private boolean[] mesasOcupadas;
    private int[] garcomAtendendoMesa;
    private static final int NUM_MESAS = 30; // Número de mesas
    private static final int NUM_GARCONS = 10; // Número de garçons
    private static final int NUM_COZINHEIROS = 4; // Número de cozinheiros
    private static final int NUM_COZINHEIROS_ESPECIAIS = 3; // Número de cozinheiros especiais
    private static final double SALARIO_BASE_GARCOM = 2000.0;
    private static final double BONUS_POR_MESA = 10.0;
    private static final double CUSTO_SALARIOS = 3000.0; // Exemplo de custo fixo com salários
    private static final double RECEITA_TOTAL = 5000.0; // Exemplo de receita do restaurante
    private static final double SALARIO_BASE_COZINHEIRO = 2500.0;
    private static final double BONUS_COZINHEIRO_ESPECIAL = 500.0;

    public InterfaceGerente() {
        frame = new JFrame("Gerenciamento do Restaurante");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Painel superior com o título e o lucro
        JPanel panelTop = new JPanel(new GridLayout(2, 1));
        labelLucro = new JLabel("Lucro Total: R$ 0.00");
        panelTop.add(labelLucro);

        // Área de texto para exibir mesas
        textAreaMesas = new JTextArea();
        textAreaMesas.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaMesas);

        // Painel inferior com os botões
        JPanel panelBottom = new JPanel(new GridLayout(1, 3));
        btnAtualizar = new JButton("Atualizar");
        btnFecharRestaurante = new JButton("Fechar Restaurante");
        btnCalcularSalarios = new JButton("Calcular Salários");
        panelBottom.add(btnAtualizar);
        panelBottom.add(btnFecharRestaurante);
        panelBottom.add(btnCalcularSalarios);

        // Adicionando componentes ao frame
        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelBottom, BorderLayout.SOUTH);

        // Inicializando os dados
        mesasAtendidasPorGarcom = new int[NUM_GARCONS];
        mesasOcupadas = new boolean[NUM_MESAS];
        garcomAtendendoMesa = new int[NUM_MESAS];

        // Inicializando todas as mesas como não ocupadas
        for (int i = 0; i < NUM_MESAS; i++) {
            mesasOcupadas[i] = false;
        }

        // Atribuindo as mesas para os garçons
        atribuirMesasAGarcons();

        // Atualizando o lucro inicial
        atualizarLucro();

        // Atualizando a exibição das mesas
        atualizarTextoMesas();

        // Ação do botão Atualizar
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTextoMesas();
            }
        });

        // Ação do botão Calcular Salários
        btnCalcularSalarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalarios();
            }
        });

        // Ação do botão Fechar Restaurante
        btnFecharRestaurante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fecharRestaurante();
            }
        });

        frame.setVisible(true);
    }

    private void atribuirMesasAGarcons() {
        int garcomIndex = 0;

        for (int i = 0; i < NUM_MESAS; i++) {
            if (!mesasOcupadas[i] && garcomIndex < NUM_GARCONS) {
                mesasOcupadas[i] = true;
                garcomAtendendoMesa[i] = garcomIndex; // Atribui o garçom à mesa
                mesasAtendidasPorGarcom[garcomIndex]++; // Incrementa a quantidade de mesas atendidas pelo garçom

                // Cada garçom pode atender até 3 mesas
                if (mesasAtendidasPorGarcom[garcomIndex] >= 3) {
                    garcomIndex++;
                }
            }
        }
    }

    private void atualizarTextoMesas() {
        StringBuilder sb = new StringBuilder("Status das Mesas:\n");
        for (int i = 0; i < NUM_MESAS; i++) {
            sb.append("Mesa ").append(i + 1).append(": ");
            if (mesasOcupadas[i]) {
                sb.append("Ocupada - Garçom ").append(garcomAtendendoMesa[i] + 1).append("\n");
            } else {
                sb.append("Disponível\n");
            }
        }
        textAreaMesas.setText(sb.toString());
    }

    private void atualizarLucro() {
        double custoTotal = CUSTO_SALARIOS + calcularCustoGarcons() + calcularCustoCozinheiros();
        double lucroTotal = RECEITA_TOTAL - custoTotal;
        labelLucro.setText("Lucro Total: R$ " + String.format("%.2f", lucroTotal));
    }

    private double calcularCustoGarcons() {
        double custoGarcons = 0;
        for (int i = 0; i < NUM_GARCONS; i++) {
            custoGarcons += SALARIO_BASE_GARCOM + (mesasAtendidasPorGarcom[i] * BONUS_POR_MESA);
        }
        return custoGarcons;
    }

    private double calcularCustoCozinheiros() {
        double custoCozinheiros = 0;
        // Cozinheiros Normais
        for (int i = 0; i < NUM_COZINHEIROS; i++) {
            custoCozinheiros += SALARIO_BASE_COZINHEIRO;
        }
        // Cozinheiros Especiais
        for (int i = 0; i < NUM_COZINHEIROS_ESPECIAIS; i++) {
            custoCozinheiros += (SALARIO_BASE_COZINHEIRO + BONUS_COZINHEIRO_ESPECIAL);
        }
        return custoCozinheiros;
    }

    private void calcularSalarios() {
        StringBuilder sb = new StringBuilder("Salário dos Funcionários:\n");

        // Salários dos garçons
        for (int i = 0; i < NUM_GARCONS; i++) {
            double salario = SALARIO_BASE_GARCOM + (mesasAtendidasPorGarcom[i] * BONUS_POR_MESA);
            sb.append("Garçom ").append(i + 1).append(": R$ ").append(String.format("%.2f", salario)).append("\n");
        }

        // Salários dos cozinheiros normais
        for (int i = 0; i < NUM_COZINHEIROS; i++) {
            double salario = SALARIO_BASE_COZINHEIRO;
            sb.append("Cozinheiro ").append(i + 1).append(": R$ ").append(String.format("%.2f", salario)).append("\n");
        }

        // Salários dos cozinheiros especiais
        for (int i = 0; i < NUM_COZINHEIROS_ESPECIAIS; i++) {
            double salario = SALARIO_BASE_COZINHEIRO + BONUS_COZINHEIRO_ESPECIAL;
            sb.append("Cozinheiro Especial ").append(i + 1).append(": R$ ").append(String.format("%.2f", salario)).append("\n");
        }

        // Exibindo o total de salários
        double totalSalarios = calcularCustoGarcons() + calcularCustoCozinheiros();
        sb.append("\nTotal de Salários a Pagar: R$ ").append(String.format("%.2f", totalSalarios));

        // Exibe os salários em uma nova janela
        JOptionPane.showMessageDialog(frame, sb.toString(), "Salários dos Funcionários", JOptionPane.INFORMATION_MESSAGE);
    }

    private void fecharRestaurante() {
        // Lógica para fechar o restaurante e gerar os pagamentos de garçons
        JOptionPane.showMessageDialog(frame, "Restaurante fechado! Pagamento dos garçons concluído.", "Fechar Restaurante", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new InterfaceGerente();
    }
}