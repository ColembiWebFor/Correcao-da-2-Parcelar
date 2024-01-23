package serieA.primeria;

public class Operario extends Empregado{
    private String ID;

    public Operario(String nome, int horasTrabalhoMes, double salarioHora, String ID) {
        super(nome, horasTrabalhoMes, salarioHora);
        this.ID = ID;
    }

    public Operario() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    //Linha a)
    @Override
    public double  calculaSalario(){
        double salario = this.getHorasTrabalhoMes()*this.getSalarioHora();
        if(this.getHorasTrabalhoMes()>120){
            return (salario+salario*0.12);
        }
        return salario;
    }
    public void infoOp(){
        String smsInfoGeral = super.infoBasica()+"\nSalário: "+super.calculaSalario()+"\nSalário Líquido Mensal: "+this.calculaSalario()+"\nID: "+this.ID;
        System.out.println(smsInfoGeral);
    }
}
