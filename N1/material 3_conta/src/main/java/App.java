public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();

        c1.depositar(50);
        c1.sacar(100);
        c1.depositar(70);
    }
}