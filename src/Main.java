public class Main {

    public static void main(String[] args) {
        Posta posta = new Posta();
        posta.enqueue();
        posta.enqueue();
        posta.addSportello();

        posta.enqueue();
        posta.enqueue();
        posta.enqueue();
        posta.enqueue();

        posta.start();
    }
}
