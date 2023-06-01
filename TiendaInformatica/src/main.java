public class main {
    public static void main(String[] args) {
        eTransporte c1 = new eTransporte("Alex","Aguimes",1984);
        System.out.println(c1.toString());
        c1.EnviarPedido(1984);
        c1.RecogePedido("Pedro", "Aguimes");
    }
}
