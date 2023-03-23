package Paquete1;

public class Compras {
    public static void main(String[] args) {

        Producto producto1 = new Producto(0046, 220.00, "Agua mineral");
        Producto producto2 = new Producto(0234, 700.00, "Cerveza");
        Producto producto3 = new Producto(0341, 350.00, "Gaseosa");

        Cliente cliente1 = new Cliente("Juan Pérez", 33499851, "3425444377", "juanperez@gmail.com");

        Carrito carrito1 = new Carrito(001, cliente1);

        Item cargaItem[] = new Item[3];
        cargaItem[0] = new Item(carrito1, producto1, 2);
        cargaItem[1] = new Item(carrito1, producto2, 6);
        cargaItem[2] = new Item(carrito1, producto3, 4);

        mostrarCompra(cargaItem, carrito1, cliente1);
    }

    public static void mostrarCompra(Item cargaItem[], Carrito carrito1, Cliente cliente1) {

        System.out.println("Carrito: " + carrito1.getNum() + " - Cliente: " + cliente1.getNombres());
        for (Item items : cargaItem) {
            items.mostrarItem();
            carrito1.setMontoTotal(items);
        }
        System.out.println("Total: " + carrito1.getMontoTotal());
    }
}
