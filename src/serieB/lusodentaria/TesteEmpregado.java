package serieB.lusodentaria;

public class TesteEmpregado {

    public static void main(String[] args) {
        Medico medico1 = new Medico(85, 520000, "Flávio Lopes", "0023423MOK022", "M");
        Medico medico2 = new Medico(110, 520000, "Cristina Manuel", "0023423MOK022", "F");
        medico1.infoMedico();
        medico2.infoMedico();

        Paciente paciente1 = new Paciente("Aço", 22, "Luekenya Francisca", "009978867LS023", "F");
        Paciente paciente2 = new Paciente("Mandembwe", 21, "Yana Teodoro", "009978867LS023", "F");
        Paciente paciente3 = new Paciente("Saidy-Mingas", 29, "Manuela Ilunga", "009978867MO023", "F");
        Paciente paciente4 = new Paciente("Santa Rosa", 6, "Benção Colembi", "009978867MO023", "M");

        //Teste 2ª Pergunta
        //Adicionando pacientes atendidos pelo médico
        Paciente[] listaDePacientes = {paciente1, paciente3, paciente4};
        medico1.setPacientes(listaDePacientes);
        medico1.relatorio();
    }
}
