public class Facebook extends MensagemInst {

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");

    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

} // A partir do extends, tudo que eu criei na classe pai "computador" vai ser
  // executado para os filhos, desde que, o objeto foi criado junto com as suas
  // funcionalidades
