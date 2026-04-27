public class Carro extends Veiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void ligar() {
        System.out.println("Carro " + marca + ": Motor ligado com chave física.");
    }

    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Carro " + marca + ": Ligado via botão Start/Stop (chave presencial detectada).");
        } else {
            System.out.println("Carro " + marca + ": Chave presencial não detectada.");
        }
    }
}
