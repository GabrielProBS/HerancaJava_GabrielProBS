public class Estagiario extends Funcionario {
    public Estagiario(String Nome, Double Salario, String Departamento, String DataDeNascimento, String CPF) {
        super(Nome, Salario, Departamento, DataDeNascimento, CPF);
    }

    //Construtor para que ele se torne global
    public Estagiario(){}

    //Sobrescrita do método MostrarDados da classe Funcionario
    @Override
    public void MostrarDados() {
        System.out.println("Nome do estagiário: " + getNome());
        System.out.println("Salario do estagiário: " + getSalario());
        System.out.println("Departamento do estagiário: " + getDepartamento());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("CPF: " + getCPF());
    }

    public void FazerTarefa() {
        System.out.println("O estagiário " + getNome() + " do departamento de " + getDepartamento() + " está fazendo uma tarefa.");
    }
}
