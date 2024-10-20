public class Computador {
    // Herança
    public static void main(String[] args) {
        MSNMensseger msn = new MSNMensseger();
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
