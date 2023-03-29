package Paquete1;

public class Compras {
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

        Item cargaCarrito1[] = new Item[3];
        cargaCarrito1[0] = new Item(carrito1, producto1, 2);
        cargaCarrito1[1] = new Item(carrito1, producto2, 6);
        cargaCarrito1[2] = new Item(carrito1, producto3, 4);

        Item cargaCarrito2[] = new Item[3];
        cargaCarrito2[0] = new Item(carrito2, producto4, 2);
        cargaCarrito2[1] = new Item(carrito2, producto5, 1);
        cargaCarrito2[2] = new Item(carrito2, producto6, 3);

        Item cargaCarrito3[] = new Item[3];
        cargaCarrito3[0] = new Item(carrito3, producto1, 2);
        cargaCarrito3[1] = new Item(carrito3, producto3, 3);
        cargaCarrito3[2] = new Item(carrito3, producto6, 4);

        mostrarCompra(cargaCarrito1, carrito1, cliente1, "f");
        mostrarCompra(cargaCarrito2, carrito2, cliente2, "%");
        mostrarCompra(cargaCarrito3, carrito3, cliente3, "%t");
    }

    public static void mostrarCompra(Item cargaCarrito[], Carrito carrito, Cliente cliente, String tipoDesc) {

        System.out.println("Carrito: " + carrito.getNum() + " - Cliente: " + cliente.getNombres());
        for (Item items : cargaCarrito) {
            items.mostrarItem();
            carrito.setMontoTotal(items);
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
