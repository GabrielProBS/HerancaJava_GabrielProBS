public class Pessoa {
    private int DataDeNascimento;
    private int CPF;

    public Pessoa(int DataDeNascimento, int CPF) {
        this.DataDeNascimento = DataDeNascimento;
        this.CPF = CPF;
    }

    //Construtor para que ele se torne global
    public Pessoa(){}

    //Método GET
    public int getDataDeNascimento(){
        return DataDeNascimento;
    }

    public int getCPF(){
        return CPF;
    }

    //Método SET
    public void setDataDeNascimento(int DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }
}