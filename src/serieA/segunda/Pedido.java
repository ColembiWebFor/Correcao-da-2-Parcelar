package serieA.segunda;

public class Pedido {
    private int numero;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    private Item[] items;

    public Pedido(int numero, String hora) {
        this.numero = numero;
        this.hora = hora;
    }

    public Pedido() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
    public void imprimePedido(){
        System.out.println("Pedido Nº: "+this.getNumero()+"\nHora: "+this.getHora());
        if(mesa!=null){
            System.out.println("Mesa Nº: "+this.mesa.getNumero()); 
        }else{
            System.out.println("Pedido sem mesa associada!");
        }
        if(cliente!=null){
            System.out.println("Cliente: "+this.cliente.getNome());
        }else{
            System.out.println("Pedido sem cliente associado");
        }
        if(items!=null){
            System.out.println("--Itens do pedido "+this.getNumero());
            for (int i = 0; i < this.items.length; i++) {
                System.out.println((i+1)+" - "+this.items[i].getNome());                
            }
        }else{
            System.out.println("Pedido sem itens!");
        }
    }
}
