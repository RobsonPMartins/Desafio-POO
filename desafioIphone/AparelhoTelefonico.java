package desafioIphone;

 class AparelhoTelefonico {
    private boolean isCallActive;
    private boolean isVoiceMailActive;

    public AparelhoTelefonico() {
        isCallActive = false;
        isVoiceMailActive = false;
    }

    public void ligar() {
        if (!isCallActive) {
            System.out.println("Chamada em andamento.");
            isCallActive = true;
        } else {
            System.out.println("Já existe uma chamada ativa.");
        }
    }

    public void atender() {
        if (isCallActive) {
            System.out.println("Chamada atendida.");
            isCallActive = false;
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        if (!isVoiceMailActive) {
            System.out.println("Correio de voz ativado.");
            isVoiceMailActive = true;
        } else {
            System.out.println("Correio de voz já está ativado.");
        }
    }
}

