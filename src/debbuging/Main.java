package debbuging;



public class Main {
    public static void main(String[] args) {
        System.out.println("Início do método main.");
        metodo1();
        System.out.println("Fim do método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    private static void metodo1() {
        System.out.println("Início do método1.");
        metodo2();
        System.out.println("Fim do método1.");
    }

    private static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    private static void metodo2() {
        System.out.println("Início do método2.");
        for (int i = 0; i <= 4; i++)
            System.out.println(i);
        System.out.println("Fim do método2");
    }

    private static void b() {
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    private static void c() {
        System.out.println("Entrou no método c.");
        // Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}

