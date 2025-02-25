package excecoes;

public class FuncaoInvalidaException extends RuntimeException {
    public FuncaoInvalidaException(String message) {
        super(message);
    }
}