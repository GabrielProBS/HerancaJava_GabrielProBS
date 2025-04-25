import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Funcionario Funcionario = new Funcionario();
        Gerente Gerente = new Gerente();
        Estagiario Estagiario = new Estagiario();
        Desenvolvedor Desenvolvedor = new Desenvolvedor();
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar funcionário");
            System.out.println("2- Exibir dados do funcionário");
            System.out.println("3 - Sair");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    int escolha;
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Estagiário");
                    System.out.println("3 - Desenvolvedor");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha == 1) {
                        // Criação do objeto Gerente
                        System.out.println("Digite o nome do gerente:");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o salário do gerente:");
                        Double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o departamento do gerente:");
                        String departamento = scanner.nextLine();
                        System.out.println("Digite a data de nascimento do gerente:");
                        int dataDeNascimento = scanner.nextInt();
                        System.out.println("Digite o CPF do gerente:");
                        int cpf = scanner.nextInt();
                        Gerente.setNome(nome);
                        Gerente.setIdade(salario);
                        Gerente.setEmail(departamento);
                        Gerente.setDataDeNascimento(dataDeNascimento);
                        Gerente.setCPF(cpf);
                    } else if (escolha == 2) {
                        // Criação do objeto Estagiário
                        System.out.println("Digite o nome do estagiário:");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o salário do estagiário:");
                        Double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o departamento do estagiário:");
                        String departamento = scanner.nextLine();
                        System.out.println("Digite a data de nascimento do estagiário:");
                        int dataDeNascimento = scanner.nextInt();
                        System.out.println("Digite o CPF do estagiário:");
                        int cpf = scanner.nextInt();
                        Estagiario.setNome(nome);
                        Estagiario.setIdade(salario);
                        Estagiario.setEmail(departamento);
                        Estagiario.setDataDeNascimento(dataDeNascimento);
                        Estagiario.setCPF(cpf);
                    } else if (escolha == 3) {
                        // Criação do objeto Desenvolvedor
                        System.out.println("Digite o nome do desenvolvedor:");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o salário do desenvolvedor:");
                        Double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o departamento do desenvolvedor:");
                        String departamento = scanner.nextLine();
                        Desenvolvedor.setNome(nome);
                        Desenvolvedor.setIdade(salario);
                        Desenvolvedor.setEmail(departamento);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    // Exibir dados do funcionário
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Estagiário");
                    System.out.println("3 - Desenvolvedor");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha == 1) {
                        Gerente.MostrarDados();
                    } else if (escolha == 2) {
                        Estagiario.MostrarDados();
                    } else if (escolha == 3) {
                        Desenvolvedor.MostrarDados();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 3);
        scanner.close();
            
    }
}
