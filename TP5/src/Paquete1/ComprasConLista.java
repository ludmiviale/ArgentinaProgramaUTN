package Paquete1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComprasConLista {
    public static void main(String[] args) {

        Producto producto1 = new Producto(0046, 220.00, "Agua mineral");
        Producto producto2 = new Producto(0234, 700.00, "Cerveza");
        Producto producto3 = new Producto(0341, 350.00, "Gaseosa");
        Producto producto4 = new Producto(0120, 900.00, "Vino Malbec");
        Producto producto5 = new Producto(0121, 850.00, "Vino Syrah");
        Producto producto6 = new Producto(0122, 950.00, "Vino Cabernet");

        Cliente cliente1 = new Cliente("Juan Pérez", 33499851, "3425444377", "juanperez@gmail.com");
        Cliente cliente2 = new Cliente("Pedro Díaz", 39855712, "342137885", "pedrod@gmail.com");
        Cliente cliente3 = new Cliente("Ana Rodríguez", 36558923, "342561129", "anita_rodriguez@gmail.com");

        Carrito carrito1 = new Carrito(001, cliente1);
        Carrito carrito2 = new Carrito(002, cliente2);
        Carrito carrito3 = new Carrito(003, cliente3);

        // Declaramos la Colección
        List<Item> itemLista1;
        itemLista1 = new ArrayList<Item>();

        Item item1 = new Item(carrito1, producto1, 2);
        Item item2 = new Item(carrito1, producto2, 6);
        Item item3 = new Item(carrito1, producto3, 4);

        itemLista1.add(item1);
        itemLista1.add(item2);
        itemLista1.add(item3);

        List<Item> itemLista2;
        itemLista2 = new ArrayList<Item>();

        Item item4 = new Item(carrito2, producto4, 1);
        Item item5 = new Item(carrito2, producto5, 2);
        Item item6 = new Item(carrito2, producto6, 3);

        itemLista2.add(item4);
        itemLista2.add(item5);
        itemLista2.add(item6);

        List<Item> itemLista3;
        itemLista3 = new ArrayList<Item>();

        Item item7 = new Item(carrito2, producto1, 6);
        Item item8 = new Item(carrito2, producto3, 4);
        Item item9 = new Item(carrito2, producto6, 5);

        itemLista3.add(item7);
        itemLista3.add(item8);
        itemLista3.add(item9);

        mostrarCompra(itemLista1, carrito1, cliente1, "f");
        mostrarCompra(itemLista2, carrito2, cliente2, "%");
        mostrarCompra(itemLista3, carrito3, cliente3, "%t");

    }

    public static void mostrarCompra(List<Item> itemLista, Carrito carrito, Cliente cliente, String tipoDesc) {

        System.out.println("Carrito: " + carrito.getNum() + " - Cliente: " + cliente.getNombres());
        Iterator<Item> iteratorC = itemLista.iterator();
        while (iteratorC.hasNext()) {
            Item item = iteratorC.next();
            item.mostrarItem();
            carrito.setMontoTotal(item);
        }
        System.out.println("Total: " + carrito.getMontoTotal());

        switch (tipoDesc) {
            case "f": {
                DescuentoFijo dFijo = new DescuentoFijo();
                dFijo.setMontoDesc(300);
                System.out.println("Monto final con descuento fijo: " +
                        dFijo.montoFinal(carrito.getMontoTotal()));
            }
                break;
            case "%": {
                DescuentoPorcentaje dPorc = new DescuentoPorcentaje();
                dPorc.setMontoPorc(30);
                System.out.println(
                        "Monto final con descuento con porcentaje: " + dPorc.montoFinal(carrito.getMontoTotal()));
            }
                break;
            case "%t": {
                DescuentoPorcentajeConTope dPorcTope = new DescuentoPorcentajeConTope(2000);
                dPorcTope.setMontoDesc(40);
                System.out.println(
                        "Monto final con descuento con porcentaje con tope: "
                                + dPorcTope.montoFinal(carrito.getMontoTotal()));
            }
        }
    }
}