package serieB.lusodentaria;

public class Enfermeiro extends Empregado{
    private int numTurnosMes;

    public Enfermeiro(int numTurnosMes, double salarioBruto, String nome, String bi, String genero) {
        super(salarioBruto, nome, bi, genero);
        this.numTurnosMes = numTurnosMes;
    }

   

    public int getNumTurnosMes() {
        return numTurnosMes;
    }

    public void setNumTurnosMes(int numTurnosMes) {
        this.numTurnosMes = numTurnosMes;
    }
    
    @Override
    public double calculaSalarioLiquido() {
        double salarioLiquido = super.calculaSalarioLiquido();

        if (numTurnosMes > 22) {
            return salarioLiquido + salarioLiquido * 0.12;
        }
        return salarioLiquido;
    }

    public void infoMedico() {
        String sms = "--Enfermeiro--\n" + super.infoBasica() + "\nNº de Turnos Trabalhados: "
                + this.getNumTurnosMes()+ "\nSalário: " + this.calculaSalarioLiquido();
        System.out.println(sms);
    }
}
       
