package serieA.primeria;

public class Gerente extends Empregado {

    public Gerente(String nome, int horasTrabalhoMes, double salarioHora) {
        super(nome, horasTrabalhoMes, salarioHora);
    }

    public Gerente() {
    }

    //Linha b)
    @Override
    public double calculaSalario() {

        return (super.calculaSalario() + super.calculaSalario() * 0.06);

    }

    public void infoGe() {
        String smsInfoGeral = super.infoBasica() +"\nSalário Mensal: "+super.calculaSalario()+ "\nSalário Líquido Mensal: " + this.calculaSalario();
        System.out.println(smsInfoGeral);
    }
}
