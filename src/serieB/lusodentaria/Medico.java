package serieB.lusodentaria;

public class Medico extends Empregado {

    private int numHorasTrabalhadas;
    private Paciente[] pacientes;

    public Medico(int numHorasTrabalhadas, double salarioBruto, String nome, String bi, String genero) {
        super(salarioBruto, nome, bi, genero);
        this.numHorasTrabalhadas = numHorasTrabalhadas;
    }

    

    public int getNumHorasTrabalhadas() {
        return numHorasTrabalhadas;
    }

    public void setNumHorasTrabalhadas(int numHorasTrabalhadas) {
        this.numHorasTrabalhadas = numHorasTrabalhadas;
    }

    @Override
    public double calculaSalarioLiquido() {
        double salarioLiquido = super.calculaSalarioLiquido();

        if (numHorasTrabalhadas > 100) {
            return salarioLiquido + salarioLiquido * 0.10;
        }
        return salarioLiquido + salarioLiquido * 0.03;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
    
    

    public void infoMedico() {
        String sms = "--Médico--\n" + super.infoBasica() + "\nNº de Horas Trabalhadas: "
                + this.getNumHorasTrabalhadas() + "\nSalário: " + this.calculaSalarioLiquido();
        System.out.println(sms);
    }
    
    public void relatorio(){
        System.out.println("Médico: "+this.getNome());
        if(pacientes!=null){
            System.out.println("--Pacientes atendidos--");
            for (int i = 0; i < this.pacientes.length; i++) {
                System.out.println((i+1)+" - "+pacientes[i].getNome());
                
            }
        }else{
            System.out.println("Médico sem paciente atendido.");
        }
    }
}
