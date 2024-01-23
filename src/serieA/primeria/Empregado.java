package serieA.primeria;


public class Empregado {
    private String nome;
    private int horasTrabalhoMes;
    private double salarioHora;

    public Empregado(String nome, int horasTrabalhoMes, double salarioHora) {
        this.nome = nome;
        this.horasTrabalhoMes = horasTrabalhoMes;
        this.salarioHora = salarioHora;
    }

    public Empregado() {
    }
    
    public double calculaSalario(){
        return this.horasTrabalhoMes*this.salarioHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhoMes() {
        return horasTrabalhoMes;
    }

    public void setHorasTrabalhoMes(int horasTrabalhoMes) {
        this.horasTrabalhoMes = horasTrabalhoMes;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    public String infoBasica(){
        String sms = "Nome: "+this.nome+"\nHoaras Trabalhadadas no mês: "+this.horasTrabalhoMes
                           +"\nSálário por Hora: "+this.salarioHora+" Kz";
        return sms;
    }
}
