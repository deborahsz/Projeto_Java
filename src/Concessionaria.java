
import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Venda> vendas = new ArrayList<>();

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void realizarVenda(String cpfCliente, String modeloVeiculo) {
        Cliente cliente = null;
        Veiculo veiculo = null;

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpfCliente)) {
                cliente = c;
                break;
            }
        }

        for (Veiculo v : veiculos) {
            if (v.getModelo().equalsIgnoreCase(modeloVeiculo) && v.isDisponivel()) {
                veiculo = v;
                break;
            }
        }

        if (cliente != null && veiculo != null) {
            veiculo.setDisponivel(false);
            vendas.add(new Venda(cliente, veiculo));
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Erro: Cliente ou veículo não encontrados ou indisponíveis.");
        }
    }

    public void listarVeiculos() {
        System.out.println("Lista de Veículos:");
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    public void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void listarVendas() {
        System.out.println("Lista de Vendas:");
        for (Venda v : vendas) {
            System.out.println(v);
        }
    }
}
