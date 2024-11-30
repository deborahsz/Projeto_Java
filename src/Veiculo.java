public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.disponivel = true;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Veículo [Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + ", Preço=" + preco +
                ", Disponível=" + disponivel + "]";
    }
}
