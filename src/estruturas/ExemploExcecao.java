package estruturas;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploExcecao {
    public static void main(String[] args) {
        NumberFormat valor = NumberFormat.getInstance(Locale.of("a1.75"));
        System.out.println(valor);
    }
}
