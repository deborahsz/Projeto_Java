import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Listar Veículos");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Vendas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    concessionaria.cadastrarVeiculo(new Veiculo(marca, modelo, ano, preco));
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    concessionaria.cadastrarCliente(new Cliente(nome, cpf));
                    break;
                case 3:
                    System.out.print("CPF do Cliente: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Modelo do Veículo: ");
                    String modeloVeiculo = scanner.nextLine();
                    concessionaria.realizarVenda(cpfCliente, modeloVeiculo);
                    break;
                case 4:
                    concessionaria.listarVeiculos();
                    break;
                case 5:
                    concessionaria.listarClientes();
                    break;
                case 6:
                    concessionaria.listarVendas();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
