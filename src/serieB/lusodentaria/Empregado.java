/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serieB.lusodentaria;

/**
 *
 * b)	O método calculaSalarioLiquido(), da classe Empregado deverá retornar o salário líquido do 
 * empregado, resultante do salarioBruto e o descontoINSS de 3% do mesmo;
 */
public class Empregado extends Pessoa{
    private double salarioBruto;
    private final float descontoINSS=0.03f;

    public Empregado(double salarioBruto, String nome, String bi, String genero) {
        super(nome, bi, genero);
        this.salarioBruto = salarioBruto;
    }

    public Empregado(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

   public double calculaSalarioLiquido(){
       return this.salarioBruto-this.salarioBruto*this.descontoINSS;
   }
    
    
}
