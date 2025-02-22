package trabalhotrinta.atendimento;
public enum Cardapio {
    PIZZA(30.0, 1),
    HAMBURGUER(25.0, 2),
    COCA_ZERO_500ML(5.0, 3),
    BRUSCHETTA(15.0, 4),
    CALAMARES_FRITOS(20.0, 5),
    PAO_DE_ALHO(10.0, 6),
    BOLINHO_DE_BACALHAU(18.0, 6),
    SALADA_CAPRESE(14.0, 7),
    LASANHA_BOLONHESA(35.0, 8),
    FILET_MIGNON(50.0, 9),
    RISOTO_DE_FUNGHI(38.0, 10),
    PEIXE_GRELHADO(40.0, 11),
    FRANGO_PARMEGIANA(28.0, 12),
    ESPAGUETE_ALHO_E_OLEO(25.0, 13),
    MOQUECA_CAPIXABA(45.0, 14),
    CHURRASCO_GRELHADO(42.0, 15),
    VEGETARIANO_GRELHADO(30.0, 16),
    MACARRAO_COM_QUEIJO(22.0, 17),
    BATATA_RUSTICA(12.0, 18),
    ARROZ_INTEGRAL(9.0, 19),
    LEGUMES_NO_VAPOR(10.0, 20),
    POLENTA_FRITA(11.0, 21),
    AGUA_COM_GAS_500ML(5.0, 22),
    SUCO_DE_LARANJA_300ML(7.0, 23),
    CAIPIRINHA_300ML(20.0, 24),
    CERVEJA_IPA_500ML(12.0, 25),
    REFRIGERANTE_GUARANA_500ML(6.0, 26),
    CAFE_COM_LEITE_200ML(5.0, 27),
    TORTA_DE_LIMAO(15.0, 28),
    BABA_DE_MOCA(12.0, 29),
    PAVE_DE_CHOCOLATE(14.0, 30);

    private double preco;
    private int codigo;

    Cardapio(double preco, int codigo) {
        this.preco = preco;
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
}