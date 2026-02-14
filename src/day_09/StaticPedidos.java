package day_09;

public class StaticPedidos {
    private  String id;
    public static int pedidosFeitos;
    protected static final String status = "PEDIDO_CONCLUIDO";

    public StaticPedidos(String id){
        this.id = id;
        pedidosFeitos++;
    }
    public void completarPedido(){
        pedidosFeitos++;
        System.out.println("Pedido concluido com o status "+ status +
                        "já tivemos "+ pedidosFeitos + "essa semana");
    }
}
