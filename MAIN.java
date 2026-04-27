public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota");
        Moto minhaMoto = new Moto("Honda");

        // Testando Sobrescrita (Polimorfismo)
        System.out.println("--- Teste de Sobrescrita ---");
        meuCarro.ligar();
        minhaMoto.ligar();

        // Testando Sobrecarga
        System.out.println("\n--- Teste de Sobrecarga ---");
        meuCarro.ligar(true);  // Com chave presencial
        minhaMoto.ligar(false); // Sem chave presencial
    }
}
