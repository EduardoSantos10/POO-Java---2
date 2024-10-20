public abstract class MensagemInst {
    // Herança
    /*
     * public void enviarMensagem() {
     * // confirmar se está conectado a internet
     * validarConectadoInternet();
     * System.out.println("Enviando Mensagem");
     * 
     * // depois de enviada, salva o historico
     * salvarHistorico();
     * 
     * }
     * 
     * public void receberMensagem() {
     * System.out.println("Recebendo mensagem");
     * }
     * 
     * // metodos privados, visiveis somente na classe
     * private void validarConectadoInternet() {
     * System.out.println("Validando se está conectado a intenet");
     * }
     * 
     * private void salvarHistorico() {
     * System.out.println("Salvando historico de mensagem");
     */
    // }

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

}
