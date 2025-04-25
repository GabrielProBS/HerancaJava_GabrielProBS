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
            System.out.println("3- Tarefas dos funcionários");
            System.out.println("4 - Sair");

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

                    // Cadastro de funcionários (Gerente, Estagiário ou Desenvolvedor)
                    if (escolha == 1) {
                        // Criação do objeto Gerente
                        System.out.println("Digite o nome do gerente:");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o salário do gerente:");
                        Double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o departamento do gerente:");
                        String departamento = scanner.nextLine();
                        System.out.println("Digite a data de nascimento do gerente (Ex.:22/01/2000):");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("Digite o CPF do gerente (Ex.: 123.456.789-01):");
                        String cpf = scanner.nextLine();
                        Gerente.setNome(nome);
                        Gerente.setSalario(salario);
                        Gerente.setDepartamento(departamento);
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
                        System.out.println("Digite a data de nascimento do estagiário (Ex.:22/01/2000):");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("Digite o CPF do estagiário (Ex.: 123.456.789-01):");
                        String cpf = scanner.nextLine();
                        Estagiario.setNome(nome);
                        Estagiario.setSalario(salario);
                        Estagiario.setDepartamento(departamento);
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
                        System.out.println("Digite a data de nascimento do desenvolvedor (Ex.:22/01/2000):");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("Digite o CPF do desenvolvedor (Ex.: 123.456.789-01):");
                        String cpf = scanner.nextLine();
                        Desenvolvedor.setNome(nome);
                        Desenvolvedor.setSalario(salario);
                        Desenvolvedor.setDepartamento(departamento);
                        Desenvolvedor.setDataDeNascimento(dataDeNascimento);
                        Desenvolvedor.setCPF(cpf);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                // Exibir dados do funcionário
                case 2:
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Estagiário");
                    System.out.println("3 - Desenvolvedor");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    // Irá verificar se há algum funcionário cadastrado, caso tenha, irá exibir os dados do funcionário
                    //Gerente
                    if (Gerente == null) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else if (escolha == 1) {
                        Gerente.MostrarDados();
                    } 
                    //Estagiário
                    else if (Estagiario == null) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else if (escolha == 2) {
                        Estagiario.MostrarDados();
                    }
                    //Desenvolvedor
                    else if (Desenvolvedor == null) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else if (escolha == 3) {
                        Desenvolvedor.MostrarDados();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                
                // Tarefas dos funcionários
                case 3:
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Estagiário");
                    System.out.println("3 - Desenvolvedor");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha == 1) {
                        Gerente.RealizarReuniao();
                    } else if (escolha == 2) {
                        Estagiario.FazerTarefa();
                    } else if (escolha == 3) {
                        Desenvolvedor.Programar();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                
                // Sair do programa
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 4);
        scanner.close();
            
    }
}
