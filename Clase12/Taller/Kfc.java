public class Kfc {
    public static void main(String[] args) {
        Menu pedido1 = new Balde("Wow Bucket", 7);
        Menu pedido2 = new Box("Big Box Kentucky Coronel Sundae", 1);
        Menu pedido3 = new Duo("Wow Duo Deluxe Nuggets", 2);

        pedido1.descuento();
        pedido2.descuento();
        pedido3.descuento();

        System.out.println(pedido1.info());
        System.out.println(pedido2.info());
        System.out.println(pedido3.info());
    }
}
