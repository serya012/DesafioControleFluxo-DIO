package controle;

import java.io.Serializable;

public class ParametrosInvalidosException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
