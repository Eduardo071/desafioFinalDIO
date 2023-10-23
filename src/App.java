public class App {
    public static void main(String[] args) {
        Hero mago = new Hero("Gandalf", 100, "mago");
        Hero guerreiro = new Hero("Aragorn", 35, "guerreiro");

        mago.atacar();
        guerreiro.atacar();
    }
}
