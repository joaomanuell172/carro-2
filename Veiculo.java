public abstract class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public abstract void ligar();
}
