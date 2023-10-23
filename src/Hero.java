public class Hero {
    private String nome;
    private int idade;
    private String tipo;

    public Hero(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = "";

        if (tipo.equals("mago")) {
            ataque = "usou magia";
        } else if (tipo.equals("guerreiro")) {
            ataque = "usou espada";
        } else if (tipo.equals("monge")) {
            ataque = "usou artes marciais";
        } else if (tipo.equals("ninja")) {
            ataque = "usou shuriken";
        }

        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
}