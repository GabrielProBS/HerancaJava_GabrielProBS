public class Gerente extends Funcionario {
    public Gerente(String Nome, Double Salario, String Departamento, int DataDeNascimento, int CPF) {
        super(Nome, Salario, Departamento, DataDeNascimento, CPF);
    }

    //Construtor para que ele se torne global
    public Gerente(){}

    //Sobrescrita do método MostrarDados da classe Funcionario
    @Override
    public void MostrarDados() {
        System.out.println("Nome do gerente: " + getNome());
        System.out.println("Salario do gerente: " + getSalario());
        System.out.println("Departamento do gerente: " + getDepartamento());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("CPF: " + getCPF());
    }

    public void RealizarReuniao() {
        System.out.println("O gerente " + getNome() + " do departamento de " + getDepartamento() + " está realizando uma reunião.");
    }
}