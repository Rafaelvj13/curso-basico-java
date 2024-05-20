import java.util.concurrent.ThreadLocalRandom;

public class ExWihile {
    public static void main(String[] args) {
        Double mesada = 50.0;
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + "Adicionado ao carrinho");
            mesada = Math.max(0, mesada - valorDoce); // Atualização corrigida
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou tudo em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}

