package day_09;

import java.util.Locale;

import static day_09.StaticPedidos.pedidosFeitos;
import static day_09.StaticPedidos.status;
import static day_09.staticPedido.completarPedido;

public class staticMain {
    public static void main(String[] args){
        pedidosFeitos++;
        status.toUpperCase(Locale.ROOT);
        completarPedido();
    }
}
