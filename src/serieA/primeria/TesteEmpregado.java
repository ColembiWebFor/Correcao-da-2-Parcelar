package serieA.primeria;

public class TesteEmpregado {
    public static void main(String[] args) {
        //Linha c
       Empregado empregado1 = new Empregado("Carlos", 5, 500);
        System.out.println(empregado1.infoBasica()+"\nSalário Líquido: "+empregado1.calculaSalario());
        
        System.out.println("__________________________________________________");
        Operario operario1 = new Operario("Domingos Miguel", 100, 2000,"0012DL");
        operario1.infoOp();
        System.out.println(operario1.calculaSalario()); 
        Operario operario2 = new Operario("Paula Cassueca", 125, 2000,"0088DL");
        operario2.infoOp();
         System.out.println("__________________________________________________");
          Gerente gerente = new Gerente("Benjamim Manuel", 85, 6000);
        gerente.infoGe();
        
    }
    
    
}
