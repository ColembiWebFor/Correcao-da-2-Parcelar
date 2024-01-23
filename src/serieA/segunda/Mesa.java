package serieA.segunda;
public class Mesa {
    private String area;
    private int numero;
    private Cliente[] clientes;
    public Mesa(String area, int numero) {
        this.area = area;
        this.numero = numero;
    }

    public Mesa() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    
}
