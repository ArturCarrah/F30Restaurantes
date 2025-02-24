package F30Restaurantes.excecoes;

public class CozinheiroIndisponivelException extends RuntimeException {
    public CozinheiroIndisponivelException(String message) {
        super(message);
    }
}
