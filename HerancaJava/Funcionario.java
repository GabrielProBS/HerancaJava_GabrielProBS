public class Funcionario extends Pessoa {
    private String Nome;
    private Double Salario;
    private String Departamento;

    public Funcionario(String Nome, Double Salario, String Departamento, String DataDeNascimento, String CPF) {
        super(DataDeNascimento, CPF); // Chama o construtor da classe pai (Pessoa)
        this.Nome = Nome;
        this.Salario = Salario;
        this.Departamento = Departamento;
    }

    //Construtor para que ele se torne global
    public Funcionario(){}

    //Método GET
    public String getNome(){
        return Nome;
    }

    public Double getSalario(){
        return Salario;
    }

    public String getDepartamento(){
        return Departamento;
    }

    //Método SET
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void setSalario(Double Salario){
        this.Salario = Salario;
    }

    public void setDepartamento(String Departamento){
        this.Departamento = Departamento;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + Nome);
        System.out.println("Salario: " + Salario);
        System.out.println("Departamento: " + Departamento);
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("CPF: " + getCPF());
    }

    public void BaterPonto(){
        System.out.println("O funcionário " + Nome + " do departamento de " + Departamento + " bateu o ponto.");
    }
}
