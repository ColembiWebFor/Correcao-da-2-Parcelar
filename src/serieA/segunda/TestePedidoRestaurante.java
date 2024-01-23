package serieA.segunda;

public class TestePedidoRestaurante {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Anastacio Colembi Manuel");
        Cliente cliente2 = new Cliente("Isaac de Assis");

        Item item1 = new Item("Coca-Cola", 6);
        Item item2 = new Item("Hamburguer", 12);
        Item item3 = new Item("Faíta", 4);

        Mesa mesa1 = new Mesa("B-Piscina", 02);

        //Realização do pedido (Exemplo pedido 01)
        //Itens a serem pedidos
        Item[] itemsPedido01 = {item1, item3};

        Pedido pedido01 = new Pedido(01, "14:56");
        pedido01.setCliente(cliente1);
        pedido01.setItems(itemsPedido01);
        pedido01.setMesa(mesa1);
        pedido01.imprimePedido();

    }
}
