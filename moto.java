public class Moto extends Veiculo {

    public Moto(String marca) {
        super(marca);
    }

  
    @Override
    public void ligar() {
        System.out.println("Moto " + marca + ": Motor ligado girando a ignição.");
    }
  
    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Moto " + marca + ": Ligada por sensor de presença.");
        } else {
            System.out.println("Moto " + marca + ": Falha na partida, use a chave física.");
        }
    }
}
