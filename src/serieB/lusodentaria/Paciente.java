package serieB.lusodentaria;

public class Paciente extends Pessoa{
    private String morada;
    private int idade;
    private Medico medico;

    public Paciente(String morada, int idade, String nome, String bi, String genero) {
        super(nome, bi, genero);
        this.morada = morada;
        this.idade = idade;
    }

    public Paciente(String morada, int idade) {
        this.morada = morada;
        this.idade = idade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public void infoPaciente(){
       String sms ="----Paciente-----\n"+super.infoBasica()+"\nMorada: "+this.morada+"\nIdade: "+this.idade;
       System.out.println(sms);
   }    

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
