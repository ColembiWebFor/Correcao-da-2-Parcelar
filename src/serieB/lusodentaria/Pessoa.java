package serieB.lusodentaria;

public class Pessoa {
    private String nome;
    private String bi;
    private String genero;

    public Pessoa(String nome, String bi, String genero) {
        this.nome = nome;
        this.bi = bi;
        this.genero = genero;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBI() {
        return bi;
    }

    public void setBI(String bi) {
        this.bi = bi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public String infoBasica() {
        return  "Nome: " + this.nome + "\nBI=" + this.bi + "\nGenero=" + this.genero + '}';
    }
    
    
}
