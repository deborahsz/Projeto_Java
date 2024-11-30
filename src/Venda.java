public class Venda {
    private Cliente cliente;
    private Veiculo veiculo;

    public Venda(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "Venda [Cliente=" + cliente.getNome() + ", Veículo=" + veiculo.getModelo() + "]";
    }
}

