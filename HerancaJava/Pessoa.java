public class Pessoa {
    private String DataDeNascimento;
    private String CPF;

    public Pessoa(String DataDeNascimento, String CPF) {
        this.DataDeNascimento = DataDeNascimento;
        this.CPF = CPF;
    }

    //Construtor para que ele se torne global
    public Pessoa(){}

    //Método GET
    public String getDataDeNascimento(){
        return DataDeNascimento;
    }

    public String getCPF(){
        return CPF;
    }

    //Método SET
    public void setDataDeNascimento(String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
}
