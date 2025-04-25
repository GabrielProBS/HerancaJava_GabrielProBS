public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String Nome, Double Salario, String Departamento, String DataDeNascimento, String CPF) {
        super(Nome, Salario, Departamento, DataDeNascimento, CPF);
    }

    //Construtor para que ele se torne global
    public Desenvolvedor(){}

    //Sobrescrita do método MostrarDados da classe Funcionario
    @Override
    public void MostrarDados() {
        System.out.println("Nome do desenvolvedor: " + getNome());
        System.out.println("Salario do desenvolvedor: " + getSalario());
        System.out.println("Departamento do desenvolvedor: " + getDepartamento());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("CPF: " + getCPF());
    }

    public void Programar() {
        System.out.println("O desenvolvedor " + getNome() + " do departamento de " + getDepartamento() + " está programando.");
    }  
}
